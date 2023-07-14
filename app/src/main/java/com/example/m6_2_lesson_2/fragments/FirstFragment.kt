package com.example.m6_2_lesson_2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.m6_2_lesson_2.R
import com.example.m6_2_lesson_2.base.BaseFragment
import com.example.m6_2_lesson_2.databinding.FragmentFirstBinding

class FirstFragment : BaseFragment<FragmentFirstBinding>() {

    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentFirstBinding {
        return FragmentFirstBinding.inflate(inflater, container, false)
    }

    override fun initListener() {
        super.initListener()

        binding.btnNext.setOnClickListener {
            val text = binding.etInputTitle.text.toString()
            val desc = binding.etInputDesc.text.toString()
            val secondFragment = SecondFragment()
            val bundle = Bundle().apply {
                putString("text", text)
                putString("desc", desc)
            }
            secondFragment.arguments = bundle
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragContainer, secondFragment).addToBackStack(null).commit()
        }
    }
}