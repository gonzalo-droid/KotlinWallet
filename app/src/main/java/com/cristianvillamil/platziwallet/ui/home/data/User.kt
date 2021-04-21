package com.cristianvillamil.platziwallet.ui.home.data

import java.io.StringBufferInputStream
//private constructor obliga a usar el builder
class User private constructor(private val userName:String, private val password : String) {
    class Builder{
        var userName : String=""
        var password : String?=null

        fun setUserName(newUserName:String):Builder{
            this.userName = newUserName
            return  this //retorno d instance, el  builder
        }
        fun setPassword(newPassword:String):Builder{
            this.password = newPassword
            return  this
        }

        fun build(): User{
            return  User(userName,password?:"")
        }

    }
}