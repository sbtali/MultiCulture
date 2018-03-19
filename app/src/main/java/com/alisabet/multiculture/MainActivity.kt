package com.alisabet.multiculture

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //1.we shouldn't use strings in java code, just in strings.xml
    //2.for multi language, we should have multi resources
    //3.make a folder named "values-fa" beside values folder and copy strings.xml file in it (from values folder)
    //4.change values in strings.xml file (in values-fa folder)
    //5.EVEN we can have multi color for languages with doing above level for colors xml file
    //6.our app language depends on OS language

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
