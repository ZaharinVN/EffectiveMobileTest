package com.karsoft.effectivemobile.data.repository;

import com.karsoft.effectivemobile.data.models.TicketOfferResponse;
import com.karsoft.effectivemobile.data.network.EffectiveService;
import com.karsoft.effectivemobile.domain.mapper.base.Mapper;
import com.karsoft.effectivemobile.domain.models.TicketOffer;
import com.karsoft.effectivemobile.domain.repository.TicketOfferRepository;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/karsoft/effectivemobile/data/repository/TicketOfferRepositoryImpl;", "Lcom/karsoft/effectivemobile/domain/repository/TicketOfferRepository;", "mapper", "Lcom/karsoft/effectivemobile/domain/mapper/base/Mapper;", "Lcom/karsoft/effectivemobile/data/models/TicketOfferResponse;", "Lcom/karsoft/effectivemobile/domain/models/TicketOffer;", "(Lcom/karsoft/effectivemobile/domain/mapper/base/Mapper;)V", "api", "Lcom/karsoft/effectivemobile/data/network/EffectiveService;", "getTicketOffers", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class TicketOfferRepositoryImpl implements com.karsoft.effectivemobile.domain.repository.TicketOfferRepository {
    @org.jetbrains.annotations.NotNull
    private final com.karsoft.effectivemobile.domain.mapper.base.Mapper<com.karsoft.effectivemobile.data.models.TicketOfferResponse, com.karsoft.effectivemobile.domain.models.TicketOffer> mapper = null;
    @org.jetbrains.annotations.NotNull
    private final com.karsoft.effectivemobile.data.network.EffectiveService api = null;
    
    @javax.inject.Inject
    public TicketOfferRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.karsoft.effectivemobile.domain.mapper.base.Mapper<com.karsoft.effectivemobile.data.models.TicketOfferResponse, com.karsoft.effectivemobile.domain.models.TicketOffer> mapper) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getTicketOffers(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.karsoft.effectivemobile.domain.models.TicketOffer>> $completion) {
        return null;
    }
}