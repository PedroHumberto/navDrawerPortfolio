package com.example.assessment_menu.ui.experiencia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.assessment_menu.R
import com.example.assessment_menu.constants.Constants


class ExperienciaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_experiencia, container, false)
        val txtExp = view.findViewById<TextView>(R.id.txt_experiencia)
        val pedro = Constants.pedro

        txtExp.text = pedro.expProf

        return view
    }


}