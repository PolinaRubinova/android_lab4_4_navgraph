package com.example.lab3_5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lab3_5.databinding.FragmentThirdBinding


class ThirdFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentThirdBinding.inflate(layoutInflater)
        val navController = findNavController()

        binding.toFirst.setOnClickListener {
            navController.navigate(R.id.action_fragment3_to_fragment1)
        }
        binding.toSecond.setOnClickListener {
            navController.navigate(R.id.action_fragment3_to_fragment2)
        }
        binding.toAbout.setOnNavigationItemSelectedListener {
            (activity as MainActivity).toAbout(it)
        }
        return binding.root
    }
}