package com.lod.rtviwe.tport.bonuses

import com.lod.rtviwe.tport.R
import com.lod.rtviwe.tport.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class BonusesFragment : BaseFragment() {

    companion object {

        fun newInstance(): BonusesFragment {
            return BonusesFragment()
        }
    }

    private val bonusesViewModel: BonusesViewModel by viewModel()

    override fun getLayout() = R.layout.bonuses_fragment
}