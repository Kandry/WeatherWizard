package com.kozyrevandrey.weatherwizard.core.presentation.presenter

import com.kozyrevandrey.weatherwizard.R
import com.kozyrevandrey.weatherwizard.core.presentation.view.BaseView
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import moxy.MvpPresenter

abstract class BasePresenter<T: BaseView>: MvpPresenter<T>() {

    private val compositeDisposable = CompositeDisposable()

    protected fun unsubscribeOnDestroy(disposable: Disposable){
        compositeDisposable.add(disposable)
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.clear()
    }

    open fun showErrorDialog(throwable: Throwable, action: () -> Unit) {
        throwable.message?.let { message ->
            viewState.showError(message, R.string.text_for_alert_button, action)
        }
    }
}