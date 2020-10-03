package com.kuldeep.tictactoe

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.layout_dialog_player2.view.*

class HomeActivity : AppCompatActivity() {
    lateinit var btnPlay:Button
    lateinit var radioGroup:RadioGroup
    lateinit var radioButton:RadioButton
    lateinit var backsound: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        backsound= MediaPlayer.create(this,R.raw.background)
        btnPlay=findViewById(R.id.btnPlay)
        radioGroup=findViewById(R.id.radioGroup)
        var user1="Player 1"
        var user2="Player 2"
       play()
        btnPlay.setOnClickListener {
            var radioId=radioGroup.checkedRadioButtonId
            radioButton=findViewById(radioId)
            if (radioButton.tag=="2"){
                val inputDialog=LayoutInflater.from(this).inflate(R.layout.layout_dialog_player2,null);
                val mBuilder=AlertDialog.Builder(this)
                    .setView(inputDialog)
                    .setTitle("Enter Players Name")
                val  mAlertDialog=mBuilder.show()
                inputDialog.btnPlayDialog.setOnClickListener {
                    mAlertDialog.dismiss()
                     user1= inputDialog.etplayer1.text.toString()
                    user2= inputDialog.etplayer2.text.toString()

                    val data = Bundle()
                    data.putString("user1", user1)
                    data.putString("user2", user2)
                    val intent=Intent(this@HomeActivity,MainActivity::class.java)
                    intent.putExtra("data", data)
                    startActivity(intent)
                    backsound.stop()
                    finish()
                }
                inputDialog.btnBackDialog.setOnClickListener {
                    mAlertDialog.dismiss()
                }

            }
            else{
                val intent=Intent(this@HomeActivity,OnePlayerActivity::class.java)
                startActivity(intent)
                backsound.stop()
                finish()
            }
        }

    }
    public fun play(){
        backsound.start()
    }
    public fun stop(){
        backsound.stop()
    }
    override fun onBackPressed() {
       stop()
       ActivityCompat.finishAffinity(this@HomeActivity)
    }


}