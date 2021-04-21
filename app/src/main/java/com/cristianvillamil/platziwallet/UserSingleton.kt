package com.cristianvillamil.platziwallet

class UserSingleton {
    companion object{ //elements static
        private var instance:UserSingleton?=null

        fun  getInstance() : UserSingleton {
            if(instance==null){
                instance= UserSingleton()
            }
            return  instance as UserSingleton //casteo de que siempre sea UserSingleton
        }
    }


}