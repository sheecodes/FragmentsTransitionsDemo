package com.sheecodes.fragmentstransitionanimationsdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.sheecodes.fragmentstransitionanimationsdemo.databinding.FragmentOneBinding


class FragmentOne : Fragment() {

    private lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOneBinding.inflate(inflater, container, false)

        binding.buttonToFragTwo.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentOne_to_fragmentTwo)
        }

        binding.buttonDialog.setOnClickListener {
            CustomDialogFragment().show(parentFragmentManager, "")
        }

        binding.image.setOnClickListener {
            val extras = FragmentNavigatorExtras(binding.image to "large_image")

            findNavController().navigate(R.id.action_fragmentOne_to_fragmentThree,
            null, null, extras)
        }

        return binding.root
    }
}