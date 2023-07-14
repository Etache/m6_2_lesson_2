package com.example.m6_2_lesson_2

import com.example.m6_2_lesson_2.base.BaseActivity
import com.example.m6_2_lesson_2.databinding.ActivityMainBinding
import com.example.m6_2_lesson_2.fragments.FirstFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun inflateViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initView() {
        super.initView()
        supportFragmentManager.beginTransaction().add(R.id.fragContainer, FirstFragment()).commit()
    }
}