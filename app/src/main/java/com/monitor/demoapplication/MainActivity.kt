package com.monitor.demoapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import com.monitor.demoapplication.util.TimeMonitor
import com.monitor.demoapplication.view.MonitorFrameLayout

class MainActivity : AppCompatActivity() {

    private var monitor = TimeMonitor("MainActivityMonitor")

    private var mFirstFocus = true

    init {
        monitor.start("MainActivity")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        TimeMonitor.getGlobalInstance().record("MainActivity create")

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //testDemo()
    }

    fun testDemo(){
        monitor.record("testDemo")
        Thread.sleep(600)
        monitor.record("testDemo1")
    }


    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if(hasFocus && mFirstFocus){
            TimeMonitor.getGlobalInstance().record("onWindowFocusChanged")
            TimeMonitor.getGlobalInstance().end("onWindowFocusChanged")
            mFirstFocus = false

            //testDemo()
        }
    }

    fun doLayout(v: View?){
        startActivity(Intent(this,LayoutActivity::class.java))
    }
}