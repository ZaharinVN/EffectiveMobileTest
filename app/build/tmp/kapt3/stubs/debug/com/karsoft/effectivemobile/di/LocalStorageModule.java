package com.karsoft.effectivemobile.di;

import android.content.Context;
import com.karsoft.effectivemobile.utils.LocalStorage;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/karsoft/effectivemobile/di/LocalStorageModule;", "", "()V", "provideLocalStorage", "Lcom/karsoft/effectivemobile/utils/LocalStorage;", "context", "Landroid/content/Context;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class LocalStorageModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.karsoft.effectivemobile.di.LocalStorageModule INSTANCE = null;
    
    private LocalStorageModule() {
        super();
    }
    
    /**
     * Предоставляет singleton-экземпляр [LocalStorage], использующий [SharedPreferences]
     * с именем "SharedPreference" и режимом доступа [Context.MODE_PRIVATE].
     *
     * @param context приложенческий контекст, необходимый для получения [SharedPreferences].
     * @return экземпляр [LocalStorage].
     */
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.karsoft.effectivemobile.utils.LocalStorage provideLocalStorage(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}