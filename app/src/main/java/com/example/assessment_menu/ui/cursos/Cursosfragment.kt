package com.example.assessment_menu.ui.cursos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.assessment_menu.R
import com.example.assessment_menu.constants.Constants

class Cursosfragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_cursos, container, false)

        val txtCursos = view.findViewById<TextView>(R.id.txt_cursos)

        val pedro = Constants.pedro
        txtCursos.text = pedro.cursos
        txtCursos.textSize = 16f


        return view
    }


}