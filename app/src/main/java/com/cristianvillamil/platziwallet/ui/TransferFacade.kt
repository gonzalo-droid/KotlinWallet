package com.cristianvillamil.platziwallet.ui


//Facade es una clase que encapsula la complejidad de varios subsistemas,
//es decir, que los proporciona o expone de manera sencilla.
//Nota: Las aplicaciones grandes (facebook, youtube, entre otros)
//tienden a aplicar Facade en su código.
//Bonus: Este trabaja con fachadas y subclases.
class TransferFacade {
    val analyticsManager: AnalyticsManager = AnalyticsManager()
    val securityManager = SecurityManager()
    val transferManager :  TransferManager = TransferManager()

    fun tranfer(){
        val token = securityManager.getToken()
        analyticsManager.registerTranfer(token)
        transferManager.tranfer(token)
    }
}