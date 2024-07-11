package com.karsoft.effectivemobile.di;

import com.karsoft.effectivemobile.data.repository.OfferRepositoryImpl;
import com.karsoft.effectivemobile.data.repository.TicketOfferRepositoryImpl;
import com.karsoft.effectivemobile.data.repository.TicketRepositoryImpl;
import com.karsoft.effectivemobile.domain.repository.OfferRepository;
import com.karsoft.effectivemobile.domain.repository.TicketOfferRepository;
import com.karsoft.effectivemobile.domain.repository.TicketRepository;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lcom/karsoft/effectivemobile/di/RepositoryModule;", "", "bindOfferRepository", "Lcom/karsoft/effectivemobile/domain/repository/OfferRepository;", "repository", "Lcom/karsoft/effectivemobile/data/repository/OfferRepositoryImpl;", "bindTicketOfferRepository", "Lcom/karsoft/effectivemobile/domain/repository/TicketOfferRepository;", "Lcom/karsoft/effectivemobile/data/repository/TicketOfferRepositoryImpl;", "bindTicketRepository", "Lcom/karsoft/effectivemobile/domain/repository/TicketRepository;", "Lcom/karsoft/effectivemobile/data/repository/TicketRepositoryImpl;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract interface RepositoryModule {
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.karsoft.effectivemobile.domain.repository.OfferRepository bindOfferRepository(@org.jetbrains.annotations.NotNull()
    com.karsoft.effectivemobile.data.repository.OfferRepositoryImpl repository);
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.karsoft.effectivemobile.domain.repository.TicketOfferRepository bindTicketOfferRepository(@org.jetbrains.annotations.NotNull()
    com.karsoft.effectivemobile.data.repository.TicketOfferRepositoryImpl repository);
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.karsoft.effectivemobile.domain.repository.TicketRepository bindTicketRepository(@org.jetbrains.annotations.NotNull()
    com.karsoft.effectivemobile.data.repository.TicketRepositoryImpl repository);
}