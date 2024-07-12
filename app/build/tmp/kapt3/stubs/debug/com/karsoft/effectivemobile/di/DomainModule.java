package com.karsoft.effectivemobile.di;

import com.karsoft.effectivemobile.domain.repository.OfferRepository;
import com.karsoft.effectivemobile.domain.repository.TicketOfferRepository;
import com.karsoft.effectivemobile.domain.repository.TicketRepository;
import com.karsoft.effectivemobile.domain.usecase.OfferUseCase;
import com.karsoft.effectivemobile.domain.usecase.TicketOfferUseCase;
import com.karsoft.effectivemobile.domain.usecase.TicketUseCase;
import com.karsoft.effectivemobile.domain.usecase.impl.OfferUseCaseImpl;
import com.karsoft.effectivemobile.domain.usecase.impl.TicketOfferUseCaseImpl;
import com.karsoft.effectivemobile.domain.usecase.impl.TicketUseCaseImpl;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/karsoft/effectivemobile/di/DomainModule;", "", "()V", "provideOfferUseCase", "Lcom/karsoft/effectivemobile/domain/usecase/OfferUseCase;", "offerRepository", "Lcom/karsoft/effectivemobile/domain/repository/OfferRepository;", "provideTicketOfferUseCase", "Lcom/karsoft/effectivemobile/domain/usecase/TicketOfferUseCase;", "ticketOfferRepository", "Lcom/karsoft/effectivemobile/domain/repository/TicketOfferRepository;", "provideTicketUseCase", "Lcom/karsoft/effectivemobile/domain/usecase/TicketUseCase;", "ticketRepository", "Lcom/karsoft/effectivemobile/domain/repository/TicketRepository;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DomainModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.karsoft.effectivemobile.di.DomainModule INSTANCE = null;
    
    private DomainModule() {
        super();
    }
    
    /**
     * Предоставляет экземпляр [OfferUseCase] с использованием предоставленного [OfferRepository].
     *
     * @param offerRepository репозиторий, используемый [OfferUseCase].
     * @return экземпляр [OfferUseCase].
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.karsoft.effectivemobile.domain.usecase.OfferUseCase provideOfferUseCase(@org.jetbrains.annotations.NotNull()
    com.karsoft.effectivemobile.domain.repository.OfferRepository offerRepository) {
        return null;
    }
    
    /**
     * Предоставляет экземпляр [TicketOfferUseCase] с использованием предоставленного [TicketOfferRepository].
     *
     * @param ticketOfferRepository репозиторий, используемый [TicketOfferUseCase].
     * @return экземпляр [TicketOfferUseCase].
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.karsoft.effectivemobile.domain.usecase.TicketOfferUseCase provideTicketOfferUseCase(@org.jetbrains.annotations.NotNull()
    com.karsoft.effectivemobile.domain.repository.TicketOfferRepository ticketOfferRepository) {
        return null;
    }
    
    /**
     * Предоставляет экземпляр [TicketUseCase] с использованием предоставленного [TicketRepository].
     *
     * @param ticketRepository репозиторий, используемый [TicketUseCase].
     * @return экземпляр [TicketUseCase].
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.karsoft.effectivemobile.domain.usecase.TicketUseCase provideTicketUseCase(@org.jetbrains.annotations.NotNull()
    com.karsoft.effectivemobile.domain.repository.TicketRepository ticketRepository) {
        return null;
    }
}