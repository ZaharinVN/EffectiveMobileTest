package com.karsoft.effectivemobile.presenter.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.karsoft.effectivemobile.R;
import com.karsoft.effectivemobile.databinding.BottomSheetSearchTicketBinding;
import com.karsoft.effectivemobile.utils.LocalStorage;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\u001a\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J)\u0010!\u001a\u00020\u00112!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\fJ\u0014\u0010#\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR)\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/karsoft/effectivemobile/presenter/ui/home/BottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "binding", "Lcom/karsoft/effectivemobile/databinding/BottomSheetSearchTicketBinding;", "localStorage", "Lcom/karsoft/effectivemobile/utils/LocalStorage;", "getLocalStorage", "()Lcom/karsoft/effectivemobile/utils/LocalStorage;", "setLocalStorage", "(Lcom/karsoft/effectivemobile/utils/LocalStorage;)V", "onAnywhereItemClickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "nameOfCity", "", "tipClickListener", "Lkotlin/Function0;", "getWindowHeight", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "setOnAnywhereItemClickListener", "aa", "setOnTipClickListener", "app_debug"})
public final class BottomSheet extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private com.karsoft.effectivemobile.databinding.BottomSheetSearchTicketBinding binding;
    @javax.inject.Inject
    public com.karsoft.effectivemobile.utils.LocalStorage localStorage;
    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onAnywhereItemClickListener;
    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function0<kotlin.Unit> tipClickListener;
    
    public BottomSheet() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.karsoft.effectivemobile.utils.LocalStorage getLocalStorage() {
        return null;
    }
    
    public final void setLocalStorage(@org.jetbrains.annotations.NotNull
    com.karsoft.effectivemobile.utils.LocalStorage p0) {
    }
    
    private final int getWindowHeight() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setOnAnywhereItemClickListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> aa) {
    }
    
    public final void setOnTipClickListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> aa) {
    }
}