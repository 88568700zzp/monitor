package com.monitor.demoapplication

import android.app.Application
import android.content.Context
import android.util.Log
import com.monitor.demoapplication.util.TimeMonitor

/**
 *
 * Created by samzhang on 2021/8/18.
 */
class DemoApplication :Application(){

    private var monitor = TimeMonitor("DemoApplication")

    init {
        monitor.start("DemoApplication")

        TimeMonitor.getGlobalInstance().start("DemoApplication")
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)

        GlobalConstant.context = this
    }

    override fun onCreate() {
        super.onCreate()

        /*monitor.record("testDemo")
        testDemo()
        monitor.record("testDemo1")*/
    }

    fun testDemo(){
        Thread.sleep(600)
    }
}