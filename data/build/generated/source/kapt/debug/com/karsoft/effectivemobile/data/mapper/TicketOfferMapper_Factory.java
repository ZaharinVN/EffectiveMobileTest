// Generated by Dagger (https://dagger.dev).
package com.karsoft.effectivemobile.data.mapper;

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
public final class TicketOfferMapper_Factory implements Factory<TicketOfferMapper> {
  @Override
  public TicketOfferMapper get() {
    return newInstance();
  }

  public static TicketOfferMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TicketOfferMapper newInstance() {
    return new TicketOfferMapper();
  }

  private static final class InstanceHolder {
    private static final TicketOfferMapper_Factory INSTANCE = new TicketOfferMapper_Factory();
  }
}
