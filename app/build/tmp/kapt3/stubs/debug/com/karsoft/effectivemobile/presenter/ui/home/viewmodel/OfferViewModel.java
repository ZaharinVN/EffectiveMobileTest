package com.karsoft.effectivemobile.presenter.ui.home.viewmodel;

import androidx.lifecycle.ViewModel;
import com.karsoft.effectivemobile.domain.mapper.base.Mapper;
import com.karsoft.effectivemobile.domain.models.Offer;
import com.karsoft.effectivemobile.domain.usecase.OfferUseCase;
import com.karsoft.effectivemobile.presenter.models.OfferUI;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/karsoft/effectivemobile/presenter/ui/home/viewmodel/OfferViewModel;", "Landroidx/lifecycle/ViewModel;", "useCase", "Lcom/karsoft/effectivemobile/domain/usecase/OfferUseCase;", "mapper", "Lcom/karsoft/effectivemobile/domain/mapper/base/Mapper;", "Lcom/karsoft/effectivemobile/domain/models/Offer;", "Lcom/karsoft/effectivemobile/presenter/models/OfferUI;", "(Lcom/karsoft/effectivemobile/domain/usecase/OfferUseCase;Lcom/karsoft/effectivemobile/domain/mapper/base/Mapper;)V", "_getOffersResult", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "getOffersResult", "Lkotlinx/coroutines/flow/Flow;", "getGetOffersResult", "()Lkotlinx/coroutines/flow/Flow;", "getOffers", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class OfferViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.karsoft.effectivemobile.domain.usecase.OfferUseCase useCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.karsoft.effectivemobile.domain.mapper.base.Mapper<com.karsoft.effectivemobile.domain.models.Offer, com.karsoft.effectivemobile.presenter.models.OfferUI> mapper = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<com.karsoft.effectivemobile.presenter.models.OfferUI>> _getOffersResult;
    
    @javax.inject.Inject
    public OfferViewModel(@org.jetbrains.annotations.NotNull
    com.karsoft.effectivemobile.domain.usecase.OfferUseCase useCase, @org.jetbrains.annotations.NotNull
    com.karsoft.effectivemobile.domain.mapper.base.Mapper<com.karsoft.effectivemobile.domain.models.Offer, com.karsoft.effectivemobile.presenter.models.OfferUI> mapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.karsoft.effectivemobile.presenter.models.OfferUI>> getGetOffersResult() {
        return null;
    }
    
    public final void getOffers() {
    }
}