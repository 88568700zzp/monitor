package com.monitor.demoapplication.view

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.widget.FrameLayout
import com.monitor.demoapplication.util.TimeMonitor

/**
 *
 * Created by samzhang on 2021/8/18.
 */
class MainFrameLayout(context:Context, attr: AttributeSet?) :FrameLayout(context,attr){

    private var monitor = TimeMonitor("MainFrameLayout")

    init {
        monitor.start("MainFrameLayout")
    }

    override fun dispatchDraw(canvas: Canvas?) {
        super.dispatchDraw(canvas)

        if(firstDraw) {
            TimeMonitor.getGlobalInstance().record("firstFace")
            firstDraw = false
        }
    }


    companion object{
        var firstDraw = true
    }
}