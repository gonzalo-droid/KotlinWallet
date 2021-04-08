package com.cristianvillamil.platziwallet.ui.home.presenter

import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.data.HomeInteractor

class HomePresenter(private val view:HomeContract.View) : HomeContract.Presenter{

    private val homeInteractor:HomeInteractor = HomeInteractor()

    override fun retrieverFavoriteTransfers() {
        view.showLoader()

        homeInteractor.retrieveFavoriteTransferFromCache(object: HomeContract.OnResponseCallback{

            override fun OnResponse(favoriteTransfer: List<FavoriteTransfer>) {

                view.hideLoader() // oculta el loader
                view.showFavoriteTransfers(favoriteTransfer) //muestra la lista
            }
        })
    }
}