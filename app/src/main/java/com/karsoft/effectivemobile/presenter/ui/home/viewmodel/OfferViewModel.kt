package com.karsoft.effectivemobile.presenter.ui.home.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.karsoft.effectivemobile.domain.mapper.base.Mapper
import com.karsoft.effectivemobile.domain.models.Offer
import com.karsoft.effectivemobile.domain.usecase.OfferUseCase
import com.karsoft.effectivemobile.presenter.models.OfferUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OfferViewModel @Inject constructor(
    private val offerUseCase: OfferUseCase,
    private val offerMapper: Mapper<Offer, OfferUI>
) : ViewModel() {

    private val _getOffersResult = MutableStateFlow<List<OfferUI>>(emptyList())
    val getOffersResult: StateFlow<List<OfferUI>> = _getOffersResult

    init {
        getOffers()
    }

    fun getOffers() {
        viewModelScope.launch {
            val offers = offerUseCase.getOffers().map { offer ->
                offerMapper.mapFromEntity(offer)
            }
            _getOffersResult.value = offers
        }
    }
}

