package com.example.mad_practical_9_21012021011

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var alarmAnimation : AnimationDrawable
    lateinit var heartAnimation : AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageAlarm : ImageView = findViewById(R.id.alarm)
        val imageHeart : ImageView = findViewById(R.id.heart)


        imageAlarm.setBackgroundResource(R.drawable.alarm_animation_list)
        imageHeart.setBackgroundResource(R.drawable.heart_animation_list)

        heartAnimation = imageHeart.background as AnimationDrawable
        alarmAnimation = imageAlarm.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if (hasFocus){
            alarmAnimation.start()
            heartAnimation.start()
        }
        else{
            alarmAnimation.stop()
            heartAnimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }

}