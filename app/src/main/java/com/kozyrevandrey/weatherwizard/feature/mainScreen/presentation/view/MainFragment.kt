package com.kozyrevandrey.weatherwizard.feature.mainScreen.presentation.view

import android.os.Bundle
import android.view.View
import com.kozyrevandrey.weatherwizard.R
import com.kozyrevandrey.weatherwizard.core.presentation.view.BaseFragment
import com.kozyrevandrey.weatherwizard.feature.mainScreen.presentation.presenter.MainPresenter
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter
import javax.inject.Inject

class MainFragment : BaseFragment<MainPresenter>(R.layout.fmt_main), MainView {

    companion object{
        fun getInstance() = MainFragment()
    }

    @Inject
    @InjectPresenter
    lateinit var mainPresenter: MainPresenter

    @ProvidePresenter
    override fun createPresenter(): MainPresenter = mainPresenter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun showProgressBar() {
        TODO("Not yet implemented")
    }

    override fun hideProgressBar() {
        TODO("Not yet implemented")
    }
}