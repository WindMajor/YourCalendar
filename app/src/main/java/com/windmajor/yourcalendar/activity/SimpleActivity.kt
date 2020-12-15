package com.windmajor.yourcalendar.activity

import com.simplemobiletools.commons.activities.BaseSimpleActivity
import com.windmajor.yourcalendar.R
import java.util.ArrayList

class SimpleActivity:BaseSimpleActivity() {

    override fun getAppIconIDs(): ArrayList<Int> {
        return arrayListOf(R.mipmap.ic_launcher_red)
    }

    override fun getAppLauncherName(): String {
        return getString(R.string.app_launcher_name)
    }


}