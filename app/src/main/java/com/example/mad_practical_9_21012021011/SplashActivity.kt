package com.example.mad_practical_9_21012021011

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity(), Animation.AnimationListener {

    lateinit var AnimationLogo: AnimationDrawable
    lateinit var logoImage: ImageView
    lateinit var logoAnimation: Animation


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        logoImage = findViewById(R.id.uvpce)
        logoImage.setBackgroundResource(R.drawable.logo_animation_list)
        AnimationLogo = logoImage.background as AnimationDrawable


        logoAnimation = AnimationUtils.loadAnimation(this, R.anim.twin_animation)
        logoAnimation.setAnimationListener(this)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if (hasFocus) {
            logoImage.startAnimation(logoAnimation)
            AnimationLogo.start()

        } else {
            AnimationLogo.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }

    override fun onAnimationStart(p0: Animation?) {
        //animationAnd maintent no use kari bija ma redirect karvanu che
    }

    override fun onAnimationEnd(p0: Animation?) {

    val intent =  Intent(this@SplashActivity, MainActivity::class.java)
        startActivity(intent)
    }

    override fun onAnimationRepeat(p0: Animation?) {

    }

}

