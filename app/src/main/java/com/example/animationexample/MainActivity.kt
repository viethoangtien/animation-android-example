package com.example.animationexample

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListener()
    }

    private fun initListener() {
        btnFadeIn.setOnClickListener {
            fadeIn()
        }
        btnFadeOut.setOnClickListener {
            fadeOut()
        }
        btnCrossFade.setOnClickListener {
            crossFade()
        }
        btnBlink.setOnClickListener {
            blink()
        }
        btnZoomIn.setOnClickListener {
            zoomIn()
        }
        btnZoomOut.setOnClickListener {
            zoomOut()
        }
        btnRotate.setOnClickListener {
            rotate()
        }
        btnMove.setOnClickListener {
            move()
        }
        btnSlideUp.setOnClickListener {
            slideUp()
        }
        btnSlideDown.setOnClickListener {
            slideDown()
        }
        btnSequential.setOnClickListener {
            sequenceAnim()
        }
        btnTogether.setOnClickListener {
            together()
        }
    }

    private fun together() {
        val animationTogether = AnimationUtils.loadAnimation(this, R.anim.together)
        txt_tog.startAnimation(animationTogether)
    }

    private fun sequenceAnim() {
        val animationSequence = AnimationUtils.loadAnimation(this,R.anim.sequential)
        txt_seq.startAnimation(animationSequence)
    }

    private fun slideDown() {
        val animationSlideDown = AnimationUtils.loadAnimation(this, R.anim.slide_down)
        txt_slide_down.startAnimation(animationSlideDown)
    }

    private fun slideUp() {
        val animationSlideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up)
        txt_slide_up.startAnimation(animationSlideUp)
    }

    private fun move() {
        val animationMove = AnimationUtils.loadAnimation(this, R.anim.move)
        txt_move.startAnimation(animationMove)
    }

    private fun rotate() {
        val animationRotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
        txt_rotate.startAnimation(animationRotate)
    }

    private fun zoomOut() {
        val animationZoomOut = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
        txt_zoom_out.startAnimation(animationZoomOut)
    }

    private fun zoomIn() {
        val animationZoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
        txt_zoom_in.startAnimation(animationZoomIn)
    }

    private fun blink() {
        val animationBlink = AnimationUtils.loadAnimation(this, R.anim.blink)
        txt_blink.startAnimation(animationBlink)
    }

    private fun crossFade() {
        val animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        val animationFadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out)
        txt_in.startAnimation(animationFadeOut)
        txt_out.startAnimation(animationFadeIn)
    }

    private fun fadeOut() {
        val animationFadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out)
        txt_fade_out.startAnimation(animationFadeOut)
    }

    private fun fadeIn() {
        val animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        txt_fade_in.startAnimation(animationFadeIn)
    }


}