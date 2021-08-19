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
class MonitorFrameLayout(context:Context,attr: AttributeSet?) :FrameLayout(context,attr){

    private var monitor = TimeMonitor("MonitorFrameLayout")

    init {
        monitor.start("MonitorFrameLayout")
    }

    override fun dispatchDraw(canvas: Canvas?) {
        monitor.start("dispatchDraw")
        super.dispatchDraw(canvas)
        monitor.end("dispatchDraw")
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        monitor.start("onMeasure")
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        monitor.end("onMeasure")
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        monitor.start("onLayout")
        super.onLayout(changed, left, top, right, bottom)
        monitor.end("onLayout")
    }

}