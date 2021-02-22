package com.project.vllo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.Navigation

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container,false)
        view.findViewById<ConstraintLayout>(R.id.ConstraintLayoutPlus).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_addFragment)
        }
        view.findViewById<Button>(R.id.btnSetting).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_settingFragment)
        }

        return view
    }

}