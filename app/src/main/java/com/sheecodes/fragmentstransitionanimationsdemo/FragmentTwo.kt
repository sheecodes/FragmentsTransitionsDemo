package com.sheecodes.fragmentstransitionanimationsdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sheecodes.fragmentstransitionanimationsdemo.databinding.FragmentOneBinding
import com.sheecodes.fragmentstransitionanimationsdemo.databinding.FragmentTwoBinding


class FragmentTwo : Fragment() {

    private lateinit var binding: FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTwoBinding.inflate(inflater, container, false)

        binding.buttonBack.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentTwo_to_fragmentOne)
        }

        return binding.root
    }
}