package com.karsoft.effectivemobile.di

import android.content.Context
import com.karsoft.effectivemobile.utils.LocalStorage
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalStorageModule {
    /**
     * Предоставляет singleton-экземпляр [LocalStorage], использующий [SharedPreferences]
     * с именем "SharedPreference" и режимом доступа [Context.MODE_PRIVATE].
     *
     * @param context приложенческий контекст, необходимый для получения [SharedPreferences].
     * @return экземпляр [LocalStorage].
     */
    @Provides
    @Singleton
    fun provideLocalStorage(@ApplicationContext context: Context): LocalStorage {
        val sharedPreferences =
            context.getSharedPreferences("SharedPreference", Context.MODE_PRIVATE)
        return LocalStorage(sharedPreferences)
    }
}