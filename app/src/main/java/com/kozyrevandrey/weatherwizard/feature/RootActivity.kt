package com.kozyrevandrey.weatherwizard.feature

import android.os.Bundle
import com.kozyrevandrey.weatherwizard.R
import com.kozyrevandrey.weatherwizard.utils.KeyboardUtils
import dagger.android.AndroidInjection
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import javax.inject.Inject

class RootActivity : MvpAppCompatActivity(), RootView{

    private lateinit var navigator: Navigator

    @Inject
    lateinit var navigatorHolder: NavigatorHolder

    @Inject
    lateinit var keyboardUtils: KeyboardUtils

    @Inject
    @InjectPresenter
    lateinit var rootPresenter: RootPresenter

    @ProvidePresenter
    fun createPresenter(): RootPresenter = rootPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigator = SupportAppNavigator(this, R.id.containerRoot)
    }

    override fun onResume() {
        super.onResume()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()
        navigatorHolder.removeNavigator()
    }

    override fun hideKeyboard() {
        keyboardUtils.hideKeyboard(currentFocus)
    }

    override fun showProgressBar() {
    }

    override fun hideProgressBar() {
    }

    override fun showError(
        errorMessage: String,
        stringIdPositiveButton: Int,
        dismissAction: () -> Unit
    ) {
        TODO("Not yet implemented")
    }


}