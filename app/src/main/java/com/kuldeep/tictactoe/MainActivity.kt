package com.kuldeep.tictactoe

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.media.Image
import android.media.MediaPlayer
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var btn9: Button
    lateinit var circlesound: MediaPlayer
    lateinit var crossound: MediaPlayer
    lateinit var tiesound: MediaPlayer
    lateinit var winsound: MediaPlayer
    lateinit var txtName: TextView
    lateinit var btnReset: Button
    var tic = TicTacToe()
    var user = 1
    var count = 1
    var user1="Player 1"
    var user2="Player 2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        circlesound= MediaPlayer.create(this,R.raw.circle)
        crossound= MediaPlayer.create(this,R.raw.cross)
        tiesound= MediaPlayer.create(this,R.raw.tie)
        winsound= MediaPlayer.create(this,R.raw.win)
        val intent: Intent =getIntent()
        val bundle=intent.getBundleExtra("data")
        user1 = bundle?.getString("user1").toString()
        user2=bundle?.getString("user2").toString()
        if (user1.isEmpty()){
            user1="Player 1"
        }
        if (user2.isEmpty()){
            user2="Player 2"
        }
        btn1 = findViewById(R.id.btn1)
        txtName = findViewById(R.id.txtName)
        txtName.setText("$user1 ")
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        var button = arrayOf(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
        for (i in 0 until button.size) {
            var j = 11 + i
            button[i].setTag(j)
        }
        btnReset = findViewById(R.id.btnreset)
        for (i in 0 until button.size) {
            button[i].setOnClickListener {
                if (user == 1) {
                    tic.player1(button[i], txtName,crossound,user2)
                    winner(winsound)
                    user = 2

                } else {
                    tic.player2(button[i], txtName,circlesound,user1)
                    winner(winsound)
                    user = 1
                }
                count++
                if(count==10 && !winner(winsound) ){
                    txtName.setText("It's a tie ")
                    tieSoundplay()
                }
            }
        }
        btnReset.setOnClickListener {
            if (winner(winsound)||count==10){
                btnReset.isClickable=true
                tic.reset(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, txtName,user1)
                count=1
                user=1
                for (i in 0 until button.size) {
                    var j = 11 + i
                    button[i].setTag(j)
                }

            }
            else{
                btnReset.isClickable=false
            }
            }
    }
    fun winner(win:MediaPlayer) : Boolean{
        var button = arrayOf(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)

        if (btn1.getTag() == btn2.getTag() && btn2.getTag() == btn3.getTag()) {
            win.start()
            for (i in 0 until button.size) {
                button[i].isClickable=false
            }
            if (user==1){
                txtName.setText("$user1 is winner")
                btn1.setBackgroundResource(R.drawable.cross_win)
                btn2.setBackgroundResource(R.drawable.cross_win)
                btn3.setBackgroundResource(R.drawable.cross_win)
            }else{
                txtName.setText("$user2 is winner")
                btn1.setBackgroundResource(R.drawable.zeron_win)
                btn2.setBackgroundResource(R.drawable.zeron_win)
                btn3.setBackgroundResource(R.drawable.zeron_win)
            }
            btnReset.isClickable = true
            return true
        } else if (btn1.getTag() == btn4.getTag() && btn4.getTag() == btn7.getTag()) {
            win.start()
            for (i in 0 until button.size) {
                button[i].isClickable=false
            }
            if (user==1){
                txtName.setText("$user1 is winner")
                btn1.setBackgroundResource(R.drawable.cross_win)
                btn4.setBackgroundResource(R.drawable.cross_win)
                btn7.setBackgroundResource(R.drawable.cross_win)
            }else{
                txtName.setText("$user2 is winner")
                btn1.setBackgroundResource(R.drawable.zeron_win)
                btn4.setBackgroundResource(R.drawable.zeron_win)
                btn7.setBackgroundResource(R.drawable.zeron_win)
            }
            btnReset.isClickable = true
            return true
        } else if (btn1.getTag() == btn5.getTag() && btn5.getTag() == btn9.getTag()) {
            win.start()
            for (i in 0 until button.size) {
                button[i].isClickable=false
            }
            if (user==1){
                txtName.setText("$user1 is winner")
                btn1.setBackgroundResource(R.drawable.cross_win)
                btn5.setBackgroundResource(R.drawable.cross_win)
                btn9.setBackgroundResource(R.drawable.cross_win)
            }else{
                txtName.setText("$user2 is winner")
                btn1.setBackgroundResource(R.drawable.zeron_win)
                btn5.setBackgroundResource(R.drawable.zeron_win)
                btn9.setBackgroundResource(R.drawable.zeron_win)
            }
            btnReset.isClickable = true
            return true
        } else if (btn4.getTag() == btn5.getTag() && btn5.getTag() == btn6.getTag()) {
            win.start()
            for (i in 0 until button.size) {
                button[i].isClickable=false
            }
            if (user==1){
                txtName.setText("$user1 is winner")
                btn4.setBackgroundResource(R.drawable.cross_win)
                btn5.setBackgroundResource(R.drawable.cross_win)
                btn6.setBackgroundResource(R.drawable.cross_win)
            }else{
                txtName.setText("$user2 is winner")
                btn4.setBackgroundResource(R.drawable.zeron_win)
                btn5.setBackgroundResource(R.drawable.zeron_win)
                btn6.setBackgroundResource(R.drawable.zeron_win)
            }
            btnReset.isClickable = true
            return true
        } else if (btn7.getTag() == btn8.getTag() && btn8.getTag() == btn9.getTag()) {
            win.start()
            for (i in 0 until button.size) {
                button[i].isClickable=false
            }
            if (user==1){
                txtName.setText("$user1 is winner")
                btn7.setBackgroundResource(R.drawable.cross_win)
                btn8.setBackgroundResource(R.drawable.cross_win)
                btn9.setBackgroundResource(R.drawable.cross_win)
            }else{
                txtName.setText("$user2 is winner")
                btn7.setBackgroundResource(R.drawable.zeron_win)
                btn8.setBackgroundResource(R.drawable.zeron_win)
                btn9.setBackgroundResource(R.drawable.zeron_win)
            }
            btnReset.isClickable = true
            return true
        } else if (btn3.getTag() == btn5.getTag() && btn5.getTag() == btn7.getTag()) {
            win.start()
            for (i in 0 until button.size) {
                button[i].isClickable=false
            }
            if (user==1){
                txtName.setText("$user1 is winner")
                btn3.setBackgroundResource(R.drawable.cross_win)
                btn5.setBackgroundResource(R.drawable.cross_win)
                btn7.setBackgroundResource(R.drawable.cross_win)
            }else{
                txtName.setText("$user2 is winner")
                btn3.setBackgroundResource(R.drawable.zeron_win)
                btn5.setBackgroundResource(R.drawable.zeron_win)
                btn7.setBackgroundResource(R.drawable.zeron_win)
            }
            btnReset.isClickable = true
            return true
        } else if (btn2.getTag() == btn5.getTag() && btn5.getTag() == btn8.getTag()) {
            win.start()
            for (i in 0 until button.size) {
                button[i].isClickable=false
            }
            if (user==1){
                txtName.setText("$user1 is winner")
                btn2.setBackgroundResource(R.drawable.cross_win)
                btn5.setBackgroundResource(R.drawable.cross_win)
                btn8.setBackgroundResource(R.drawable.cross_win)
            }else{
                txtName.setText("$user2 is winner")
                btn2.setBackgroundResource(R.drawable.zeron_win)
                btn5.setBackgroundResource(R.drawable.zeron_win)
                btn8.setBackgroundResource(R.drawable.zeron_win)
            }
            btnReset.isClickable = true
            return true
        } else if (btn3.getTag() == btn6.getTag() && btn6.getTag() == btn9.getTag()) {
            win.start()
            for (i in 0 until button.size) {
                button[i].isClickable=false
            }
            if (user==1){
                txtName.setText("$user1 is winner")
                btn3.setBackgroundResource(R.drawable.cross_win)
                btn6.setBackgroundResource(R.drawable.cross_win)
                btn9.setBackgroundResource(R.drawable.cross_win)
            }else{
                txtName.setText("$user2 is winner")
                btn3.setBackgroundResource(R.drawable.zeron_win)
                btn6.setBackgroundResource(R.drawable.zeron_win)
                btn9.setBackgroundResource(R.drawable.zeron_win)
            }
            btnReset.isClickable = true
            return true
        } else {

            return false
        }

    }
    public fun tieSoundplay(){
        tiesound.start()
    }
    public fun tieSoundstop(){
        tiesound.stop()
    }
    override fun onBackPressed() {
        val dialog= androidx.appcompat.app.AlertDialog.Builder(this@MainActivity)
        dialog.setTitle("Confirmation")
        dialog.setMessage("Are you sure you want to Exit ? ")
        dialog.setPositiveButton("Yes"){
                text,listener ->
            ActivityCompat.finishAffinity(this@MainActivity)
        }
        dialog.setNegativeButton("No"){text,listener->
        }
        dialog.create()
        dialog.show()
    }

}


