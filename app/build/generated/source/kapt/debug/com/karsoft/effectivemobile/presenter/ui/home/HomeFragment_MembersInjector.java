// Generated by Dagger (https://dagger.dev).
package com.karsoft.effectivemobile.presenter.ui.home;

import com.karsoft.effectivemobile.utils.LocalStorage;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class HomeFragment_MembersInjector implements MembersInjector<HomeFragment> {
  private final Provider<LocalStorage> localStorageProvider;

  public HomeFragment_MembersInjector(Provider<LocalStorage> localStorageProvider) {
    this.localStorageProvider = localStorageProvider;
  }

  public static MembersInjector<HomeFragment> create(Provider<LocalStorage> localStorageProvider) {
    return new HomeFragment_MembersInjector(localStorageProvider);
  }

  @Override
  public void injectMembers(HomeFragment instance) {
    injectLocalStorage(instance, localStorageProvider.get());
  }

  @InjectedFieldSignature("com.karsoft.effectivemobile.presenter.ui.home.HomeFragment.localStorage")
  public static void injectLocalStorage(HomeFragment instance, LocalStorage localStorage) {
    instance.localStorage = localStorage;
  }
}
