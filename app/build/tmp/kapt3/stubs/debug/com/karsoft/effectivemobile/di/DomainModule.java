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

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/karsoft/effectivemobile/di/DomainModule;", "", "()V", "bindOfferUseCase", "Lcom/karsoft/effectivemobile/domain/usecase/OfferUseCase;", "repo", "Lcom/karsoft/effectivemobile/domain/repository/OfferRepository;", "bindTicketOfferUseCase", "Lcom/karsoft/effectivemobile/domain/usecase/TicketOfferUseCase;", "Lcom/karsoft/effectivemobile/domain/repository/TicketOfferRepository;", "bindTicketUseCase", "Lcom/karsoft/effectivemobile/domain/usecase/TicketUseCase;", "Lcom/karsoft/effectivemobile/domain/repository/TicketRepository;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DomainModule {
    @org.jetbrains.annotations.NotNull
    public static final com.karsoft.effectivemobile.di.DomainModule INSTANCE = null;
    
    private DomainModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.karsoft.effectivemobile.domain.usecase.OfferUseCase bindOfferUseCase(@org.jetbrains.annotations.NotNull
    com.karsoft.effectivemobile.domain.repository.OfferRepository repo) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.karsoft.effectivemobile.domain.usecase.TicketOfferUseCase bindTicketOfferUseCase(@org.jetbrains.annotations.NotNull
    com.karsoft.effectivemobile.domain.repository.TicketOfferRepository repo) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.karsoft.effectivemobile.domain.usecase.TicketUseCase bindTicketUseCase(@org.jetbrains.annotations.NotNull
    com.karsoft.effectivemobile.domain.repository.TicketRepository repo) {
        return null;
    }
}