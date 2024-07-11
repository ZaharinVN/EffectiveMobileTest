package com.karsoft.effectivemobile.data.repository;

import com.karsoft.effectivemobile.data.models.OfferResponse;
import com.karsoft.effectivemobile.data.network.EffectiveService;
import com.karsoft.effectivemobile.domain.mapper.base.Mapper;
import com.karsoft.effectivemobile.domain.models.Offer;
import com.karsoft.effectivemobile.domain.repository.OfferRepository;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/karsoft/effectivemobile/data/repository/OfferRepositoryImpl;", "Lcom/karsoft/effectivemobile/domain/repository/OfferRepository;", "mapper", "Lcom/karsoft/effectivemobile/domain/mapper/base/Mapper;", "Lcom/karsoft/effectivemobile/data/models/OfferResponse;", "Lcom/karsoft/effectivemobile/domain/models/Offer;", "(Lcom/karsoft/effectivemobile/domain/mapper/base/Mapper;)V", "api", "Lcom/karsoft/effectivemobile/data/network/EffectiveService;", "getOffers", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class OfferRepositoryImpl implements com.karsoft.effectivemobile.domain.repository.OfferRepository {
    @org.jetbrains.annotations.NotNull
    private final com.karsoft.effectivemobile.domain.mapper.base.Mapper<com.karsoft.effectivemobile.data.models.OfferResponse, com.karsoft.effectivemobile.domain.models.Offer> mapper = null;
    @org.jetbrains.annotations.NotNull
    private final com.karsoft.effectivemobile.data.network.EffectiveService api = null;
    
    @javax.inject.Inject
    public OfferRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.karsoft.effectivemobile.domain.mapper.base.Mapper<com.karsoft.effectivemobile.data.models.OfferResponse, com.karsoft.effectivemobile.domain.models.Offer> mapper) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getOffers(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.karsoft.effectivemobile.domain.models.Offer>> $completion) {
        return null;
    }
}