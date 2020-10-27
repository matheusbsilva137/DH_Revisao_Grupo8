package com.example.snackbar.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.snackbar.R
import com.example.snackbar.domain.Gasto
import kotlinx.android.synthetic.main.fragment_gasto.*
import kotlinx.android.synthetic.main.fragment_gasto.view.*

class GastosFragment : Fragment() {

    val listaGastos : MutableList<Gasto> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_gasto, container, false)
        view.btnCadastroGasto.setOnClickListener {
            val descricao : String = descricaoGasto.text.toString()
            val valorgasto : Double = valorGasto.text.toString().toDouble()
            listaGastos.add(Gasto(descricao,categoriaGasto.text.toString(),dtHrGasto.text.toString(),valorgasto))
        }

        return view;
    }

    companion object{
        fun newInstance() = GastosFragment()
    }
}