package com.example.m6_2_lesson_2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.m6_2_lesson_2.R
import com.example.m6_2_lesson_2.base.BaseFragment
import com.example.m6_2_lesson_2.databinding.FragmentSecondBinding

class SecondFragment : BaseFragment<FragmentSecondBinding>() {

    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(inflater, container, false)
    }

    override fun initView() {
        super.initView()

        val text_title = arguments?.getString("text")
        val text_desc = arguments?.getString("desc")

        binding.tvTitle.text = text_title
        binding.tvDesc.text = text_desc

    }
}