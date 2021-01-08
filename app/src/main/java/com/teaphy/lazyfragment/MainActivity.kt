package com.teaphy.lazyfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.teaphy.lazyfragment.activity.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun gotoStaticLoad(view: View) {
        startActivity(Intent(this, StaticLoadActivity::class.java))
    }

    fun gotoStaticLoadMulti(view: View) {
        startActivity(Intent(this, StaticLoadMultiActivity::class.java))
    }

    fun gotoDynamicLoad(view: View) {
        startActivity(Intent(this, DynamicLoadActivity::class.java))
    }

    fun gotoDynamicLoadMulti(view: View) {
        startActivity(Intent(this, DynamicLoadMultiActivity::class.java))
    }

    fun gotoLazyLoadMulti(view: View) {
        startActivity(Intent(this, DynamicLazyLoadMultiActivity::class.java))
    }

    fun gotoViewPagerLoadMulti(view: View) {
        startActivity(Intent(this, ViewPagerLoadMultiActivity::class.java))
    }
}