// Generated by Dagger (https://dagger.dev).
package com.karsoft.effectivemobile.presenter.mapper;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class OfferUIMapper_Factory implements Factory<OfferUIMapper> {
  @Override
  public OfferUIMapper get() {
    return newInstance();
  }

  public static OfferUIMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OfferUIMapper newInstance() {
    return new OfferUIMapper();
  }

  private static final class InstanceHolder {
    private static final OfferUIMapper_Factory INSTANCE = new OfferUIMapper_Factory();
  }
}
