package com.cristianvillamil.platziwallet.ui.home.data

import android.app.AlertDialog
import android.content.Context

class MessageFactory {
    //var estaticas
    companion object {
        val TYPE_ERROR = "typeError"
        val TYPE_SUCCESS = "typeSuccess"
        val TYPE_INFO = "typeInfo"
    }

    fun getDialog(context:Context ,type: String):AlertDialog.Builder{
        when(type){ //switch
            TYPE_ERROR -> {
                return AlertDialog.Builder(context)
                    .setMessage("Error de contenino")
            }

            TYPE_SUCCESS -> {
                return AlertDialog.Builder(context)
                    .setMessage("Contenido cargado exitosamente")
            }

            TYPE_INFO -> {
                return AlertDialog.Builder(context)
                    .setMessage("Info")
            }
        }
        return AlertDialog.Builder(context).setMessage("Necesitas añadit un tipo")
    }

}