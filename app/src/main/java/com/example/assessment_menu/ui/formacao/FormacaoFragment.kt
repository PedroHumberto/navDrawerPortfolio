package com.example.assessment_menu.ui.formacao

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.assessment_menu.R
import com.example.assessment_menu.constants.Constants

class FormacaoFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_formacao, container, false)

        val txtFormacao = view.findViewById<TextView>(R.id.txt_formacao)
        val pedro = Constants.pedro
        txtFormacao.text = pedro.formacao

        return view
    }

}