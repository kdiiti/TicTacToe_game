package com.kuldeep.tictactoe

import android.media.MediaPlayer
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class TicTacToe() {
    fun player1(btn: Button,txtName:TextView,cross:MediaPlayer,user2:String) {
        btn.setBackgroundResource(R.drawable.ic_new)
        cross.start()
        btn.setTag(1)
        btn.isClickable=false
        txtName.setText(user2)
          }
    fun player2(btn: Button,txtName: TextView,circle:MediaPlayer,user1:String) {
        btn.setBackgroundResource(R.drawable.ic_zeron)
        circle.start()
        btn.setTag(2)
        btn.isClickable=false
        txtName.setText(user1)
    }
    fun reset(btn1: Button,btn2:Button,btn3:Button,btn4:Button,btn5:Button,btn6:Button,btn7:Button,btn8:Button,btn9:Button,txtName: TextView,user1:String){
        txtName.setText(user1)
        btn1.setBackgroundResource(R.color.secondaryLightColor)
        btn2.setBackgroundResource(R.color.secondaryLightColor)
        btn3.setBackgroundResource(R.color.secondaryLightColor)
        btn4.setBackgroundResource(R.color.secondaryLightColor)
        btn5.setBackgroundResource(R.color.secondaryLightColor)
        btn6.setBackgroundResource(R.color.secondaryLightColor)
        btn7.setBackgroundResource(R.color.secondaryLightColor)
        btn8.setBackgroundResource(R.color.secondaryLightColor)
        btn9.setBackgroundResource(R.color.secondaryLightColor)
        btn1.isClickable=true
        btn2.isClickable=true
        btn3.isClickable=true
        btn4.isClickable=true
        btn5.isClickable=true
        btn6.isClickable=true
        btn7.isClickable=true
        btn8.isClickable=true
        btn9.isClickable=true
        btn1.setTag(11)
        btn2.setTag(12)
        btn3.setTag(13)
        btn4.setTag(14)
        btn5.setTag(15)
        btn6.setTag(16)
        btn7.setTag(17)
        btn8.setTag(18)
        btn9.setTag(19)
    }

}