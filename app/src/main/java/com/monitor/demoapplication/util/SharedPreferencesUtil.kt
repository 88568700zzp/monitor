package com.monitor.demoapplication.util

import android.content.Context
import android.content.SharedPreferences
import com.monitor.demoapplication.GlobalConstant

/**
 *
 * Created by samzhang on 2021/8/18.
 */
class SharedPreferencesUtil {

    private var mSharedPreferences: SharedPreferences =
        GlobalConstant.context.getSharedPreferences("test.xml", Context.MODE_PRIVATE)

    private constructor(){
        mSharedPreferences.edit().putString("version",GlobalConstant.VERSION).commit()
    }

    fun getVersion():String?{
        return mSharedPreferences.getString("version","1.2")
    }

    companion object{
        var mInstance: SharedPreferencesUtil = SharedPreferencesUtil()
    }
}