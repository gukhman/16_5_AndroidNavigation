package com.example.a16_5_androidnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.a16_5_androidnavigation.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.redButton.setOnClickListener {
            val name = binding.redButton.text.toString()
            val action = MainFragmentDirections.actionMainFragmentToRedFragment(name)
            val extras = FragmentNavigatorExtras(
                binding.redButton to "redButtonTN"
            )
            findNavController().navigate(action, extras)
        }

        binding.yellowButton.setOnClickListener {
            val name = binding.yellowButton.text.toString()
            val action = MainFragmentDirections.actionMainFragmentToYellowFragment(name)
            val extras = FragmentNavigatorExtras(
                binding.redButton to "yellowButtonTN"
            )
            findNavController().navigate(action, extras)
        }

        binding.greenButton.setOnClickListener {
            val name = binding.greenButton.text.toString()
            val action = MainFragmentDirections.actionMainFragmentToGreenFragment(name)
            val extras = FragmentNavigatorExtras(
                binding.redButton to "greenButtonTN"
            )
            findNavController().navigate(action, extras)
        }
    }

}