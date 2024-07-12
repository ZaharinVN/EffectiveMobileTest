package com.karsoft.effectivemobile.presenter.ui.alltickets

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.karsoft.effectivemobile.domain.mapper.base.Mapper
import com.karsoft.effectivemobile.domain.models.Ticket
import com.karsoft.effectivemobile.domain.usecase.TicketUseCase
import com.karsoft.effectivemobile.presenter.models.TicketUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AllTicketsViewModel @Inject constructor(
    private val ticketUseCase: TicketUseCase,
    private val ticketMapper: Mapper<Ticket, TicketUI>
) : ViewModel() {

    private val _getAllTicketsResult = MutableStateFlow<List<TicketUI>>(emptyList())
    val getAllTicketsResult: StateFlow<List<TicketUI>> = _getAllTicketsResult

    init {
        getAllTickets()
    }

    fun getAllTickets() {
        viewModelScope.launch {
            val tickets = ticketUseCase.getTickets().map { ticket ->
                ticketMapper.mapFromEntity(ticket)
            }
            _getAllTicketsResult.value = tickets
        }
    }
}