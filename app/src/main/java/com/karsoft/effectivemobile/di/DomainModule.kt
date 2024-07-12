package com.karsoft.effectivemobile.di

import com.karsoft.effectivemobile.domain.repository.OfferRepository
import com.karsoft.effectivemobile.domain.repository.TicketOfferRepository
import com.karsoft.effectivemobile.domain.repository.TicketRepository
import com.karsoft.effectivemobile.domain.usecase.OfferUseCase
import com.karsoft.effectivemobile.domain.usecase.TicketOfferUseCase
import com.karsoft.effectivemobile.domain.usecase.TicketUseCase
import com.karsoft.effectivemobile.domain.usecase.impl.OfferUseCaseImpl
import com.karsoft.effectivemobile.domain.usecase.impl.TicketOfferUseCaseImpl
import com.karsoft.effectivemobile.domain.usecase.impl.TicketUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {
    /**
     * Предоставляет экземпляр [OfferUseCase] с использованием предоставленного [OfferRepository].
     *
     * @param offerRepository репозиторий, используемый [OfferUseCase].
     * @return экземпляр [OfferUseCase].
     */
    @Provides
    @Singleton
    fun provideOfferUseCase(
        offerRepository: OfferRepository
    ): OfferUseCase {
        return OfferUseCaseImpl(offerRepository)
    }

    /**
     * Предоставляет экземпляр [TicketOfferUseCase] с использованием предоставленного [TicketOfferRepository].
     *
     * @param ticketOfferRepository репозиторий, используемый [TicketOfferUseCase].
     * @return экземпляр [TicketOfferUseCase].
     */
    @Provides
    @Singleton
    fun provideTicketOfferUseCase(
        ticketOfferRepository: TicketOfferRepository
    ): TicketOfferUseCase {
        return TicketOfferUseCaseImpl(ticketOfferRepository)
    }

    /**
     * Предоставляет экземпляр [TicketUseCase] с использованием предоставленного [TicketRepository].
     *
     * @param ticketRepository репозиторий, используемый [TicketUseCase].
     * @return экземпляр [TicketUseCase].
     */
    @Provides
    @Singleton
    fun provideTicketUseCase(
        ticketRepository: TicketRepository
    ): TicketUseCase {
        return TicketUseCaseImpl(ticketRepository)
    }
}
