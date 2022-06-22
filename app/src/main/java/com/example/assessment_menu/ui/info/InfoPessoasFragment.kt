package com.example.assessment_menu.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.assessment_menu.R
import com.example.assessment_menu.constants.Constants

class InfoPessoasFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_info_pessoais, container, false)

        val txtNome = view.findViewById<TextView>(R.id.txt_nome)
        val txtEmail = view.findViewById<TextView>(R.id.txt_email)
        val txtInfo = view.findViewById<TextView>(R.id.txt_info)
        val pedro = Constants.pedro

        txtNome.text = pedro.nome
        txtEmail.text = "Email: ${pedro.email}"
        txtInfo.text = pedro.info

        return view


    }
}