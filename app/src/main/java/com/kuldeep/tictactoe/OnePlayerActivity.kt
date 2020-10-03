package com.kuldeep.tictactoe

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat

class OnePlayerActivity : AppCompatActivity() {
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
    var botList= ArrayList<Boolean>()
    var btnListBot=ArrayList<Button>()
    var tic = TicTacToe()
    var user = 1
    var count = 1
    var user1="You"
    var user2="Bot"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        circlesound= MediaPlayer.create(this,R.raw.circle)
        crossound= MediaPlayer.create(this,R.raw.cross)
        tiesound= MediaPlayer.create(this,R.raw.tie)
        winsound= MediaPlayer.create(this,R.raw.win)
        btn1 = findViewById(R.id.btn1)
        txtName = findViewById(R.id.txtName)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btnReset = findViewById(R.id.btnreset)
        btnListBot= arrayListOf(btn1,btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
        var hand=Handler()
        var button = arrayOf(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
        var btnAvailable= arrayListOf(btn1,btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
        var botRule=45
        for (i in 0 until botRule){
            botList.add(true)
        }

        var run= Runnable {
            if (btnAvailable.isNotEmpty()){
                if ((btnAvailable.contains(btn5)))
                {
                    tic.player2(btn5,txtName,circlesound,user1)
                    btnAvailable.remove(btn5)
                    winner(winsound)
                    user = 1
                }
                else if( btn1.tag==1 && btn4.tag==1 && botList[0] && btn7.tag==17)
                {
                    tic.player2(btn7,txtName,circlesound,user1)
                    btnAvailable.remove(btn7)
                    winner(winsound)
                    user = 1
                    botList[0]=false
                }
                //code for bot
                else if(btn9.tag==2 && btn6.tag==2 && botList[20] && btn3.tag==13 )
                {
                    tic.player2(btn3,txtName,circlesound,user1)
                    btnAvailable.remove(btn3)
                    winner(winsound)
                    user = 1
                    botList[20]=false
                }
                else if(btn1.tag==2 && btn4.tag==2 && botList[21] && btn7.tag==17 )
                {
                    tic.player2(btn7,txtName,circlesound,user1)
                    btnAvailable.remove(btn7)
                    winner(winsound)
                    user = 1
                    botList[21]=false
                }
                else if(btn4.tag==2 && btn7.tag==2 && botList[22] && btn1.tag==11 )
                {
                    tic.player2(btn1,txtName,circlesound,user1)
                    btnAvailable.remove(btn1)
                    winner(winsound)
                    user = 1
                    botList[22]=false
                }
                else if(btn1.tag==2 && btn7.tag==2 && botList[23] && btn4.tag==14 )
                {
                    tic.player2(btn4,txtName,circlesound,user1)
                    btnAvailable.remove(btn4)
                    winner(winsound)
                    user = 1
                    botList[23]=false
                }
                else if(btn3.tag==2 && btn9.tag==2 && botList[24] && btn6.tag==16 )
                {
                    tic.player2(btn6,txtName,circlesound,user1)
                    btnAvailable.remove(btn6)
                    winner(winsound)
                    user = 1
                    botList[24]=false
                }
                else if(btn1.tag==2 && btn3.tag==2 && botList[25] && btn2.tag==12 )
                {
                    tic.player2(btn2,txtName,circlesound,user1)
                    btnAvailable.remove(btn2)
                    winner(winsound)
                    user = 1
                    botList[25]=false
                }
                else if(btn1.tag==2 && btn2.tag==2 && botList[26] && btn3.tag==13 )
                {
                    tic.player2(btn3,txtName,circlesound,user1)
                    btnAvailable.remove(btn3)
                    winner(winsound)
                    user = 1
                    botList[26]=false
                }
                else if(btn2.tag==2 && btn3.tag==2 && botList[27] && btn1.tag==11 )
                {
                    tic.player2(btn1,txtName,circlesound,user1)
                    btnAvailable.remove(btn1)
                    winner(winsound)
                    user = 1
                    botList[27]=false
                }
                else if(btn7.tag==2 && btn8.tag==2 && botList[28] && btn9.tag==19 )
                {
                    tic.player2(btn9,txtName,circlesound,user1)
                    btnAvailable.remove(btn9)
                    winner(winsound)
                    user = 1
                    botList[28]=false
                }
                else if(btn8.tag==2 && btn9.tag==2 && botList[29] && btn7.tag==17 )
                {
                    tic.player2(btn7,txtName,circlesound,user1)
                    btnAvailable.remove(btn7)
                    winner(winsound)
                    user = 1
                    botList[29]=false
                }
                else if(btn7.tag==2 && btn9.tag==2 && botList[30] && btn8.tag==18 )
                {
                    tic.player2(btn8,txtName,circlesound,user1)
                    btnAvailable.remove(btn8)
                    winner(winsound)
                    user = 1
                    botList[30]=false
                }
                //code for safe
                else if(btn1.tag==1 && btn2.tag==1 && botList[1] && btn3.tag==13)
                {
                    tic.player2(btn3,txtName,circlesound,user1)
                    btnAvailable.remove(btn3)
                    winner(winsound)
                    user = 1
                    botList[1]=false
                }
                else if(btn2.tag==1 && btn3.tag==1 && botList[2] && btn1.tag==11)
                {
                    tic.player2(btn1,txtName,circlesound,user1)
                    btnAvailable.remove(btn1)
                    winner(winsound)
                    user = 1
                    botList[2]=false
                }
                else if(btn5.tag==2 && btn1.tag==2 && botList[3] && btn9.tag==19 )
                {
                    tic.player2(btn9,txtName,circlesound,user1)
                    btnAvailable.remove(btn9)
                    winner(winsound)
                    user = 1
                    botList[3]=false
                }
                else if(btn3.tag==1 && btn6.tag==1 && botList[4] && btn9.tag==19)
                {
                    tic.player2(btn9,txtName,circlesound,user1)
                    btnAvailable.remove(btn9)
                    winner(winsound)
                    user = 1
                    botList[4]=false
                }
                else if(btn5.tag==2 && btn9.tag==2 && botList[5] && btn1.tag==11 )
                {
                    tic.player2(btn1,txtName,circlesound,user1)
                    btnAvailable.remove(btn1)
                    winner(winsound)
                    user = 1
                    botList[5]=false
                }
                else if(btn5.tag==2 && btn7.tag==2 && botList[6] && btn3.tag==13 )
                {
                    tic.player2(btn3,txtName,circlesound,user1)
                    btnAvailable.remove(btn3)
                    winner(winsound)
                    user = 1
                    botList[6]=false
                }
                else if(btn5.tag==2 && btn3.tag==2 && botList[7] && btn7.tag==17 )
                {
                    tic.player2(btn7,txtName,circlesound,user1)
                    btnAvailable.remove(btn7)
                    winner(winsound)
                    user = 1
                    botList[7]=false
                }
                else if(btn5.tag==2 && btn2.tag==2 && botList[8] && btn8.tag==18 )
                {
                    tic.player2(btn8,txtName,circlesound,user1)
                    btnAvailable.remove(btn8)
                    winner(winsound)
                    user = 1
                    botList[9]=false
                }
                else if(btn5.tag==2 && btn8.tag==2 && botList[9] && btn2.tag==12 )
                {
                    tic.player2(btn2,txtName,circlesound,user1)
                    btnAvailable.remove(btn2)
                    winner(winsound)
                    user = 1
                    botList[9]=false
                }
                else if(btn5.tag==2 && btn4.tag==2 && botList[10] && btn6.tag==16 )
                {
                    tic.player2(btn6,txtName,circlesound,user1)
                    btnAvailable.remove(btn6)
                    winner(winsound)
                    user = 1
                    botList[10]=false
                }
                else if(btn5.tag==2 && btn6.tag==2 && botList[11] && btn4.tag==14 )
                {
                    tic.player2(btn4,txtName,circlesound,user1)
                    btnAvailable.remove(btn4)
                    winner(winsound)
                    user = 1
                    botList[11]=false
                }
                else if(btn7.tag==1 && btn8.tag==1 && botList[12] && btn9.tag==19)
                {
                    tic.player2(btn9,txtName,circlesound,user1)
                    btnAvailable.remove(btn9)
                    winner(winsound)
                    user = 1
                    botList[12]=false
                }
                else if(btn7.tag==1 && btn4.tag==1 && botList[13] && btn1.tag==11)
                {
                    tic.player2(btn1,txtName,circlesound,user1)
                    btnAvailable.remove(btn1)
                    winner(winsound)
                    user = 1
                    botList[13]=false
                }
                else if(btn9.tag==1 && btn8.tag==1 && botList[14] && btn7.tag==17)
                {
                    tic.player2(btn7,txtName,circlesound,user1)
                    btnAvailable.remove(btn7)
                    winner(winsound)
                    user = 1
                    botList[14]=false
                }
                else if(btn9.tag==1 && btn6.tag==1 && botList[15] && btn3.tag==13)
                {
                    tic.player2(btn3,txtName,circlesound,user1)
                    btnAvailable.remove(btn3)
                    winner(winsound)
                    user = 1
                    botList[15]=false
                }
                else if(btn2.tag==1 && btn5.tag==1 && botList[16] && btn8.tag==18)
                {
                    tic.player2(btn8,txtName,circlesound,user1)
                    btnAvailable.remove(btn8)
                    winner(winsound)
                    user = 1
                    botList[16]=false
                }
                else if(btn8.tag==1 && btn5.tag==1 && botList[17] && btn2.tag==12)
                {
                    tic.player2(btn2,txtName,circlesound,user1)
                    btnAvailable.remove(btn2)
                    winner(winsound)
                    user = 1
                    botList[17]=false
                }
                else if(btn4.tag==1 && btn5.tag==1 && botList[18] && btn6.tag==16)
                {
                    tic.player2(btn6,txtName,circlesound,user1)
                    btnAvailable.remove(btn6)
                    winner(winsound)
                    user = 1
                    botList[18]=false
                }
                else if(btn5.tag==1 && btn6.tag==1 && botList[19] && btn4.tag==14)
                {
                    tic.player2(btn4,txtName,circlesound,user1)
                    btnAvailable.remove(btn4)
                    winner(winsound)
                    user = 1
                    botList[19]=false
                }
                else if(btn3.tag==1 && btn6.tag==1 && botList[31] && btn9.tag==19)
                {
                    tic.player2(btn9,txtName,circlesound,user1)
                    btnAvailable.remove(btn9)
                    winner(winsound)
                    user = 1
                    botList[31]=false
                }

                else if(btn1.tag==1 && btn5.tag==1 && botList[32] && btn9.tag==19)
                {
                    tic.player2(btn9,txtName,circlesound,user1)
                    btnAvailable.remove(btn9)
                    winner(winsound)
                    user = 1
                    botList[32]=false
                }

                else if(btn3.tag==1 && btn5.tag==1 && botList[33] && btn7.tag==17)
                {
                    tic.player2(btn7,txtName,circlesound,user1)
                    btnAvailable.remove(btn7)
                    winner(winsound)
                    user = 1
                    botList[33]=false
                }

                else if(btn9.tag==1 && btn5.tag==1 && botList[34] && btn1.tag==11)
                {
                    tic.player2(btn1,txtName,circlesound,user1)
                    btnAvailable.remove(btn1)
                    winner(winsound)
                    user = 1
                    botList[34]=false
                }

                else if(btn7.tag==1 && btn5.tag==1 && botList[35] && btn3.tag==13)
                {
                    tic.player2(btn3,txtName,circlesound,user1)
                    btnAvailable.remove(btn3)
                    winner(winsound)
                    user = 1
                    botList[35]=false
                }

                else if(btn3.tag==1 && btn9.tag==1 && botList[36] && btn6.tag==16)
                {
                    tic.player2(btn6,txtName,circlesound,user1)
                    btnAvailable.remove(btn6)
                    winner(winsound)
                    user = 1
                    botList[36]=false
                }

                else if(btn2.tag==1 && btn8.tag==1 && botList[37] && btn5.tag==15)
                {
                    tic.player2(btn5,txtName,circlesound,user1)
                    btnAvailable.remove(btn5)
                    winner(winsound)
                    user = 1
                    botList[37]=false
                }
                else if(btn1.tag==1 && btn7.tag==1 && botList[38] && btn4.tag==14)
                {
                    tic.player2(btn4,txtName,circlesound,user1)
                    btnAvailable.remove(btn4)
                    winner(winsound)
                    user = 1
                    botList[38]=false
                }
                else if(btn1.tag==1 && btn3.tag==1 && botList[39] && btn2.tag==12)
                {
                    tic.player2(btn2,txtName,circlesound,user1)
                    btnAvailable.remove(btn2)
                    winner(winsound)
                    user = 1
                    botList[39]=false
                }
                else if(btn4.tag==1 && btn6.tag==1 && botList[40] && btn5.tag==15)
                {
                    tic.player2(btn5,txtName,circlesound,user1)
                    btnAvailable.remove(btn5)
                    winner(winsound)
                    user = 1
                    botList[40]=false
                }
                else if(btn7.tag==1 && btn9.tag==1 && botList[41] && btn8.tag==18)
                {
                    tic.player2(btn8,txtName,circlesound,user1)
                    btnAvailable.remove(btn8)
                    winner(winsound)
                    user = 1
                    botList[41]=false
                }

                else {
                    btnAvailable.shuffle()
                    tic.player2(btnAvailable.first(), txtName, circlesound,user1)
                    btnAvailable.remove(btnAvailable.first())
                    winner(winsound)
                    user = 1
                }
            }
            else return@Runnable
        }
        for (i in 0 until button.size) {
            var j = 11 + i
            button[i].setTag(j)
        }
        for (i in 0 until btnAvailable.size) {
            button[i].setOnClickListener {
                btnAvailable.remove(button[i])
                tic.player1(button[i], txtName,crossound,user2)
                winner(winsound)
                if (winner(winsound)){
                    return@setOnClickListener
                }else {
                    user = 2
                    hand.postDelayed(run, 1000)
                }
                count++
                if(count==6 && !winner(winsound) ){
                    txtName.setText("It's a tie ")
                    tieSoundplay()
                    btnReset.isClickable=true
                }
            }

        }

        btnReset.setOnClickListener {
            if (winner(winsound)||count==6){

                btnReset.isClickable=true
                tic.reset(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, txtName,user1)
                btnAvailable.removeAll(btnAvailable)
                btnAvailable.addAll(btnListBot)
                count=1
                user=1
                for (i in 0 until botRule){
                    botList.set(i,true)
                }
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
                txtName.setText("$user1 are winner")
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
                txtName.setText("$user1 are winner")
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
                txtName.setText("$user1 are winner")
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
                txtName.setText("$user1 are winner")
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
                txtName.setText("$user1 are winner")
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
                txtName.setText("$user1 are winner")
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
                txtName.setText("$user1 are winner")
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
        val dialog= AlertDialog.Builder(this@OnePlayerActivity)
        dialog.setTitle("Confirmation")
        dialog.setMessage("Are you sure you want to Exit ? ")
        dialog.setPositiveButton("Yes"){
                text,listener ->
            tieSoundstop()
            ActivityCompat.finishAffinity(this@OnePlayerActivity)
        }
        dialog.setNegativeButton("No"){text,listener->
        }
        dialog.create()
        dialog.show()
    }
}