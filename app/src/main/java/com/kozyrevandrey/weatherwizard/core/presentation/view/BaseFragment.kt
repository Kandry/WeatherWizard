package com.kozyrevandrey.weatherwizard.core.presentation.view

import android.os.Bundle
import androidx.annotation.LayoutRes
import dagger.android.support.AndroidSupportInjection
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import moxy.MvpAppCompatFragment

abstract class BaseFragment<P>(@LayoutRes contentLayout: Int) : MvpAppCompatFragment(contentLayout), BaseView {

    abstract fun createPresenter(): P

    private val lifeCycleDisposable by lazy { CompositeDisposable() }

    protected fun Disposable.unsubscribeOnDestroy(): Disposable {
        lifeCycleDisposable.add(this)
        return this
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        lifeCycleDisposable.clear()
    }

    override fun onDestroy() {
        super.onDestroy()
        lifeCycleDisposable.dispose()
    }

    override fun showError(
        errorMessage: String,
        stringIdPositiveButton: Int,
        dismissAction: () -> Unit
    ) {
        TODO("Not yet implemented")
    }

    override fun hideKeyboard() {
        TODO("Not yet implemented")
    }
}