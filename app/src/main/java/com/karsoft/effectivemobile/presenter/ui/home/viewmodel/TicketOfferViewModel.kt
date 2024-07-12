package com.karsoft.effectivemobile.presenter.ui.home.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.karsoft.effectivemobile.domain.mapper.base.Mapper
import com.karsoft.effectivemobile.domain.models.TicketOffer
import com.karsoft.effectivemobile.domain.usecase.TicketOfferUseCase
import com.karsoft.effectivemobile.presenter.models.TicketOfferUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TicketOfferViewModel @Inject constructor(
    private val ticketOfferUseCase: TicketOfferUseCase,
    private val ticketOfferMapper: Mapper<TicketOffer, TicketOfferUI>
) : ViewModel() {

    private val _getTicketOffersResult = MutableStateFlow<List<TicketOfferUI>>(emptyList())
    val getTicketOffersResult: StateFlow<List<TicketOfferUI>> = _getTicketOffersResult

    init {
        getTicketOffers()
    }

    fun getTicketOffers() {
        viewModelScope.launch {
            val ticketOffers = ticketOfferUseCase.getTicketOffers().map { ticketOffer ->
                ticketOfferMapper.mapFromEntity(ticketOffer)
            }
            _getTicketOffersResult.value = ticketOffers
        }
    }
}
