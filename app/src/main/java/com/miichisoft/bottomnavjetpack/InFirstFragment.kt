package com.miichisoft.bottomnavjetpack


import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_in_first.*

/**
 * A simple [Fragment] subclass.
 */
class InFirstFragment : Fragment(R.layout.fragment_in_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val result = arguments?.getString("infirst")
        tvInFirst.text = result
        button.setOnClickListener {
            view.findNavController().navigate(R.id.action_inFirstFragment_to_blankFragment)
        }
        Log.d("Infirst","onViewCreate")
    }
}
