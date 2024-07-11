package com.karsoft.effectivemobile.presenter.ui.home.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.karsoft.effectivemobile.R;
import com.karsoft.effectivemobile.databinding.ItemOfferBinding;
import com.karsoft.effectivemobile.presenter.models.OfferUI;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/karsoft/effectivemobile/presenter/ui/home/adapter/OffersAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/karsoft/effectivemobile/presenter/models/OfferUI;", "Lcom/karsoft/effectivemobile/presenter/ui/home/adapter/OffersAdapter$OfferViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyDiffUtil", "OfferViewHolder", "app_debug"})
public final class OffersAdapter extends androidx.recyclerview.widget.ListAdapter<com.karsoft.effectivemobile.presenter.models.OfferUI, com.karsoft.effectivemobile.presenter.ui.home.adapter.OffersAdapter.OfferViewHolder> {
    
    public OffersAdapter() {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.karsoft.effectivemobile.presenter.ui.home.adapter.OffersAdapter.OfferViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.karsoft.effectivemobile.presenter.ui.home.adapter.OffersAdapter.OfferViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/karsoft/effectivemobile/presenter/ui/home/adapter/OffersAdapter$MyDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/karsoft/effectivemobile/presenter/models/OfferUI;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    static final class MyDiffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.karsoft.effectivemobile.presenter.models.OfferUI> {
        
        public MyDiffUtil() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.karsoft.effectivemobile.presenter.models.OfferUI oldItem, @org.jetbrains.annotations.NotNull()
        com.karsoft.effectivemobile.presenter.models.OfferUI newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.karsoft.effectivemobile.presenter.models.OfferUI oldItem, @org.jetbrains.annotations.NotNull()
        com.karsoft.effectivemobile.presenter.models.OfferUI newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/karsoft/effectivemobile/presenter/ui/home/adapter/OffersAdapter$OfferViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/karsoft/effectivemobile/databinding/ItemOfferBinding;", "(Lcom/karsoft/effectivemobile/presenter/ui/home/adapter/OffersAdapter;Lcom/karsoft/effectivemobile/databinding/ItemOfferBinding;)V", "bind", "", "app_debug"})
    public final class OfferViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.karsoft.effectivemobile.databinding.ItemOfferBinding binding = null;
        
        public OfferViewHolder(@org.jetbrains.annotations.NotNull()
        com.karsoft.effectivemobile.databinding.ItemOfferBinding binding) {
            super(null);
        }
        
        public final void bind() {
        }
    }
}