package com.example.snackbar.domain

import java.io.Serializable

data class Gasto(val descricao: String, val categoria: String, val dtHr: String, val valor: Double) : Serializable{
    override fun toString(): String {
        return "Gasto(descricao='$descricao', categoria='$categoria', dtHr='$dtHr', valor=$valor)"
    }
}