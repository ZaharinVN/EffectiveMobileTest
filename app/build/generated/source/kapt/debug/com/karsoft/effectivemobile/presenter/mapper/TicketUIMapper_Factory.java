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
public final class TicketUIMapper_Factory implements Factory<TicketUIMapper> {
  @Override
  public TicketUIMapper get() {
    return newInstance();
  }

  public static TicketUIMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TicketUIMapper newInstance() {
    return new TicketUIMapper();
  }

  private static final class InstanceHolder {
    private static final TicketUIMapper_Factory INSTANCE = new TicketUIMapper_Factory();
  }
}
