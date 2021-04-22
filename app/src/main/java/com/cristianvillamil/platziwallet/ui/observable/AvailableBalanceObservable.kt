package com.cristianvillamil.platziwallet.ui.observable

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

class AvailableBalanceObservable : Observable {

    private  val amountObserverList : ArrayList<Observer> = arrayListOf() //init null

    private var amount:Double =0.0


//    init {
//        lifecycleOwner.lifecycle.addObserver(object : LifecycleObserver {
//            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
//            fun removeAllObservers() {
//                amountObserverList.clear()
//                lifecycleOwner.lifecycle.removeObserver(this)
//            }
//        })
//    }


    fun changeAmount(newValue: Double){
        amount=newValue
        notifyObservers(newValue)
    }

    //NOS SUSCRIPBIMOS
    override fun addObserver(observer: Observer) {
        amountObserverList.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        amountObserverList.remove(observer)
    }

    override fun notifyObservers(newValue: Double) {

        amountObserverList.forEach {
            it.notifyChange(newValue)
        }
    }
}

