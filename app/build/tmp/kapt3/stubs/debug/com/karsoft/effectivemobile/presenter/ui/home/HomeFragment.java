package com.karsoft.effectivemobile.presenter.ui.home;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.karsoft.effectivemobile.R;
import com.karsoft.effectivemobile.databinding.FragmentHomeBinding;
import com.karsoft.effectivemobile.presenter.ui.home.adapter.OffersAdapter;
import com.karsoft.effectivemobile.presenter.ui.home.viewmodel.OfferViewModel;
import com.karsoft.effectivemobile.presenter.ui.home.viewmodel.TicketOfferViewModel;
import com.karsoft.effectivemobile.utils.LocalStorage;
import dagger.hilt.android.AndroidEntryPoint;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.inject.Inject;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000bH\u0002J\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u001eH\u0016J\u001a\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010\'\u001a\u00020\u001eH\u0002J\b\u0010(\u001a\u00020\u001eH\u0002J\b\u0010)\u001a\u00020\u001eH\u0002J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006+"}, d2 = {"Lcom/karsoft/effectivemobile/presenter/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/karsoft/effectivemobile/databinding/FragmentHomeBinding;", "adapter", "Lcom/karsoft/effectivemobile/presenter/ui/home/adapter/OffersAdapter;", "binding", "getBinding", "()Lcom/karsoft/effectivemobile/databinding/FragmentHomeBinding;", "currentDay", "", "localStorage", "Lcom/karsoft/effectivemobile/utils/LocalStorage;", "getLocalStorage", "()Lcom/karsoft/effectivemobile/utils/LocalStorage;", "setLocalStorage", "(Lcom/karsoft/effectivemobile/utils/LocalStorage;)V", "placeOfferViewModel", "Lcom/karsoft/effectivemobile/presenter/ui/home/viewmodel/OfferViewModel;", "getPlaceOfferViewModel", "()Lcom/karsoft/effectivemobile/presenter/ui/home/viewmodel/OfferViewModel;", "placeOfferViewModel$delegate", "Lkotlin/Lazy;", "ticketOfferViewModel", "Lcom/karsoft/effectivemobile/presenter/ui/home/viewmodel/TicketOfferViewModel;", "getTicketOfferViewModel", "()Lcom/karsoft/effectivemobile/presenter/ui/home/viewmodel/TicketOfferViewModel;", "ticketOfferViewModel$delegate", "changeUIState", "", "nameOfCity", "loadData", "onDestroyView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "openCalendar", "setupListeners", "setupObservers", "setupViews", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy placeOfferViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy ticketOfferViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.karsoft.effectivemobile.databinding.FragmentHomeBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final com.karsoft.effectivemobile.presenter.ui.home.adapter.OffersAdapter adapter = null;
    @javax.inject.Inject()
    public com.karsoft.effectivemobile.utils.LocalStorage localStorage;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentDay;
    
    public HomeFragment() {
        super();
    }
    
    private final com.karsoft.effectivemobile.presenter.ui.home.viewmodel.OfferViewModel getPlaceOfferViewModel() {
        return null;
    }
    
    private final com.karsoft.effectivemobile.presenter.ui.home.viewmodel.TicketOfferViewModel getTicketOfferViewModel() {
        return null;
    }
    
    private final com.karsoft.effectivemobile.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.karsoft.effectivemobile.utils.LocalStorage getLocalStorage() {
        return null;
    }
    
    public final void setLocalStorage(@org.jetbrains.annotations.NotNull()
    com.karsoft.effectivemobile.utils.LocalStorage p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadData() {
    }
    
    private final void setupViews(android.view.View view) {
    }
    
    private final void setupListeners() {
    }
    
    private final void changeUIState(java.lang.String nameOfCity) {
    }
    
    private final void setupObservers() {
    }
    
    private final void openCalendar() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}