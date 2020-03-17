package com.miichisoft.bottomnavjetpack


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("vongdoi", "onViewCreate")
        btnFirst.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("infirst", "MinhnvInfirst")
            view.findNavController().navigate(R.id.action_firstFragment_to_inFirstFragment,bundle)
        }
    }

}
