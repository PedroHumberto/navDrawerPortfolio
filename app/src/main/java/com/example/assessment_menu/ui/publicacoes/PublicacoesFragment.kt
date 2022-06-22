package com.example.assessment_menu.ui.publicacoes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.assessment_menu.R
import com.example.assessment_menu.constants.Constants
import org.w3c.dom.Text


class PublicacoesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_publicacoes, container, false)
        val txtGit = view.findViewById<TextView>(R.id.txt_github)
        val pedro = Constants.pedro

        txtGit.text = pedro.publicacoes
        txtGit.textSize = 18f
        return view
    }


}