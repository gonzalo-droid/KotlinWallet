package com.cristianvillamil.platziwallet.ui.home.data

import com.cristianvillamil.platziwallet.ui.home.view.UserViewModel
//Adapter es el mediador cuando dos clases no se entienden
//y su única responsabilidad es adaptar una clase cuando la otra no la entienda

class UserAdapter(val userResponse: UserResponse) {
    fun getUserViewModel( userResponse: UserResponse):UserViewModel{
        return UserViewModel(userResponse.name,userResponse.userPhotoUrl)
    }
}