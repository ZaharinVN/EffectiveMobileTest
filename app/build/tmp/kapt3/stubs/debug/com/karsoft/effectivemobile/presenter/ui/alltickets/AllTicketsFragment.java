package com.karsoft.effectivemobile.presenter.ui.alltickets;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.karsoft.effectivemobile.R;
import com.karsoft.effectivemobile.databinding.FragmentAllTicketsBinding;
import com.karsoft.effectivemobile.utils.LocalStorage;
import dagger.hilt.android.AndroidEntryPoint;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.inject.Inject;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u001a\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u001dH\u0002J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\'"}, d2 = {"Lcom/karsoft/effectivemobile/presenter/ui/alltickets/AllTicketsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/karsoft/effectivemobile/databinding/FragmentAllTicketsBinding;", "adapter", "Lcom/karsoft/effectivemobile/presenter/ui/alltickets/AllTicketsAdapter;", "binding", "getBinding", "()Lcom/karsoft/effectivemobile/databinding/FragmentAllTicketsBinding;", "localStorage", "Lcom/karsoft/effectivemobile/utils/LocalStorage;", "getLocalStorage", "()Lcom/karsoft/effectivemobile/utils/LocalStorage;", "setLocalStorage", "(Lcom/karsoft/effectivemobile/utils/LocalStorage;)V", "navArgs", "Lcom/karsoft/effectivemobile/presenter/ui/alltickets/AllTicketsFragmentArgs;", "getNavArgs", "()Lcom/karsoft/effectivemobile/presenter/ui/alltickets/AllTicketsFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "viewModel", "Lcom/karsoft/effectivemobile/presenter/ui/alltickets/AllTicketsViewModel;", "getViewModel", "()Lcom/karsoft/effectivemobile/presenter/ui/alltickets/AllTicketsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "loadData", "", "onDestroyView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupListeners", "setupObservers", "setupViews", "app_debug"})
public final class AllTicketsFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private com.karsoft.effectivemobile.databinding.FragmentAllTicketsBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.karsoft.effectivemobile.presenter.ui.alltickets.AllTicketsAdapter adapter = null;
    @javax.inject.Inject()
    public com.karsoft.effectivemobile.utils.LocalStorage localStorage;
    
    public AllTicketsFragment() {
        super();
    }
    
    private final com.karsoft.effectivemobile.databinding.FragmentAllTicketsBinding getBinding() {
        return null;
    }
    
    private final com.karsoft.effectivemobile.presenter.ui.alltickets.AllTicketsViewModel getViewModel() {
        return null;
    }
    
    private final com.karsoft.effectivemobile.presenter.ui.alltickets.AllTicketsFragmentArgs getNavArgs() {
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
    
    private final void setupObservers() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}