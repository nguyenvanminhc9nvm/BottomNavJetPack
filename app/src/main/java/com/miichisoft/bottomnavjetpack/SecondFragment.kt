package com.miichisoft.bottomnavjetpack


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_second.*

/**
 * A simple [Fragment] subclass.
 */
class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("vongdoi", "onViewCreate")
        btnSecond.setOnClickListener {
            view.findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }
    }

}
