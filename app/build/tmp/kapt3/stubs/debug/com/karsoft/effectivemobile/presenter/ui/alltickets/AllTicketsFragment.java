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
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u001a\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006%"}, d2 = {"Lcom/karsoft/effectivemobile/presenter/ui/alltickets/AllTicketsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/karsoft/effectivemobile/presenter/ui/alltickets/AllTicketsAdapter;", "binding", "Lcom/karsoft/effectivemobile/databinding/FragmentAllTicketsBinding;", "localStorage", "Lcom/karsoft/effectivemobile/utils/LocalStorage;", "getLocalStorage", "()Lcom/karsoft/effectivemobile/utils/LocalStorage;", "setLocalStorage", "(Lcom/karsoft/effectivemobile/utils/LocalStorage;)V", "navArgs", "Lcom/karsoft/effectivemobile/presenter/ui/alltickets/AllTicketsFragmentArgs;", "getNavArgs", "()Lcom/karsoft/effectivemobile/presenter/ui/alltickets/AllTicketsFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "viewModel", "Lcom/karsoft/effectivemobile/presenter/ui/alltickets/AllTicketsViewModel;", "getViewModel", "()Lcom/karsoft/effectivemobile/presenter/ui/alltickets/AllTicketsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getCurrentDateText", "", "observeTickets", "", "onDestroyView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupListeners", "setupViews", "app_debug"})
public final class AllTicketsFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private com.karsoft.effectivemobile.databinding.FragmentAllTicketsBinding binding;
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
    
    private final void setupViews() {
    }
    
    private final void setupListeners() {
    }
    
    private final void observeTickets() {
    }
    
    private final java.lang.String getCurrentDateText() {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}