package com.karsoft.effectivemobile.di;

import com.karsoft.effectivemobile.data.mapper.OfferMapper;
import com.karsoft.effectivemobile.data.mapper.TicketMapper;
import com.karsoft.effectivemobile.data.mapper.TicketOfferMapper;
import com.karsoft.effectivemobile.data.models.OfferResponse;
import com.karsoft.effectivemobile.data.models.TicketOfferResponse;
import com.karsoft.effectivemobile.data.models.TicketResponse;
import com.karsoft.effectivemobile.domain.mapper.base.Mapper;
import com.karsoft.effectivemobile.domain.models.Offer;
import com.karsoft.effectivemobile.domain.models.Ticket;
import com.karsoft.effectivemobile.domain.models.TicketOffer;
import com.karsoft.effectivemobile.presenter.mapper.OfferUIMapper;
import com.karsoft.effectivemobile.presenter.mapper.TicketOfferUIMapper;
import com.karsoft.effectivemobile.presenter.mapper.TicketUIMapper;
import com.karsoft.effectivemobile.presenter.models.OfferUI;
import com.karsoft.effectivemobile.presenter.models.TicketOfferUI;
import com.karsoft.effectivemobile.presenter.models.TicketUI;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\bH\'J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\'J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0007\u001a\u00020\u000fH\'J\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0007\u001a\u00020\u0013H\'J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0007\u001a\u00020\u0016H\'J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u0007\u001a\u00020\u0019H\'\u00a8\u0006\u001a"}, d2 = {"Lcom/karsoft/effectivemobile/di/MapperModule;", "", "()V", "bindOfferMapper", "Lcom/karsoft/effectivemobile/domain/mapper/base/Mapper;", "Lcom/karsoft/effectivemobile/data/models/OfferResponse;", "Lcom/karsoft/effectivemobile/domain/models/Offer;", "mapper", "Lcom/karsoft/effectivemobile/data/mapper/OfferMapper;", "bindOfferUIMapper", "Lcom/karsoft/effectivemobile/presenter/models/OfferUI;", "Lcom/karsoft/effectivemobile/presenter/mapper/OfferUIMapper;", "bindTicketMapper", "Lcom/karsoft/effectivemobile/data/models/TicketResponse;", "Lcom/karsoft/effectivemobile/domain/models/Ticket;", "Lcom/karsoft/effectivemobile/data/mapper/TicketMapper;", "bindTicketOfferMapper", "Lcom/karsoft/effectivemobile/data/models/TicketOfferResponse;", "Lcom/karsoft/effectivemobile/domain/models/TicketOffer;", "Lcom/karsoft/effectivemobile/data/mapper/TicketOfferMapper;", "bindTicketOfferUIMapper", "Lcom/karsoft/effectivemobile/presenter/models/TicketOfferUI;", "Lcom/karsoft/effectivemobile/presenter/mapper/TicketOfferUIMapper;", "bindTicketUIMapper", "Lcom/karsoft/effectivemobile/presenter/models/TicketUI;", "Lcom/karsoft/effectivemobile/presenter/mapper/TicketUIMapper;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class MapperModule {
    
    public MapperModule() {
        super();
    }
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.karsoft.effectivemobile.domain.mapper.base.Mapper<com.karsoft.effectivemobile.data.models.OfferResponse, com.karsoft.effectivemobile.domain.models.Offer> bindOfferMapper(@org.jetbrains.annotations.NotNull()
    com.karsoft.effectivemobile.data.mapper.OfferMapper mapper);
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.karsoft.effectivemobile.domain.mapper.base.Mapper<com.karsoft.effectivemobile.domain.models.Offer, com.karsoft.effectivemobile.presenter.models.OfferUI> bindOfferUIMapper(@org.jetbrains.annotations.NotNull()
    com.karsoft.effectivemobile.presenter.mapper.OfferUIMapper mapper);
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.karsoft.effectivemobile.domain.mapper.base.Mapper<com.karsoft.effectivemobile.data.models.TicketOfferResponse, com.karsoft.effectivemobile.domain.models.TicketOffer> bindTicketOfferMapper(@org.jetbrains.annotations.NotNull()
    com.karsoft.effectivemobile.data.mapper.TicketOfferMapper mapper);
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.karsoft.effectivemobile.domain.mapper.base.Mapper<com.karsoft.effectivemobile.domain.models.TicketOffer, com.karsoft.effectivemobile.presenter.models.TicketOfferUI> bindTicketOfferUIMapper(@org.jetbrains.annotations.NotNull()
    com.karsoft.effectivemobile.presenter.mapper.TicketOfferUIMapper mapper);
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.karsoft.effectivemobile.domain.mapper.base.Mapper<com.karsoft.effectivemobile.data.models.TicketResponse, com.karsoft.effectivemobile.domain.models.Ticket> bindTicketMapper(@org.jetbrains.annotations.NotNull()
    com.karsoft.effectivemobile.data.mapper.TicketMapper mapper);
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.karsoft.effectivemobile.domain.mapper.base.Mapper<com.karsoft.effectivemobile.domain.models.Ticket, com.karsoft.effectivemobile.presenter.models.TicketUI> bindTicketUIMapper(@org.jetbrains.annotations.NotNull()
    com.karsoft.effectivemobile.presenter.mapper.TicketUIMapper mapper);
}