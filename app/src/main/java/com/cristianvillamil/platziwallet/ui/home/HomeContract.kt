package com.cristianvillamil.platziwallet.ui.home

import androidx.lifecycle.LiveData

interface HomeContract {
    interface View{
        fun showLoader()
        fun hideLoader()
        fun showFavoriteTransfers(favoriteTransfer: List<FavoriteTransfer> )
    }

    interface  Presenter{
        fun retrieverFavoriteTransfers()
        fun getPercentageLiveData(): LiveData<String>
    }
    //dato entre el presentador y la capa de datos
    interface OnResponseCallback{
        fun OnResponse(favoriteTransfer: List<FavoriteTransfer>)
    }
}