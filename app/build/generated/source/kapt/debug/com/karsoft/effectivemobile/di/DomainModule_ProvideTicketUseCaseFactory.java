// Generated by Dagger (https://dagger.dev).
package com.karsoft.effectivemobile.di;

import com.karsoft.effectivemobile.domain.repository.TicketRepository;
import com.karsoft.effectivemobile.domain.usecase.TicketUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DomainModule_ProvideTicketUseCaseFactory implements Factory<TicketUseCase> {
  private final Provider<TicketRepository> ticketRepositoryProvider;

  public DomainModule_ProvideTicketUseCaseFactory(
      Provider<TicketRepository> ticketRepositoryProvider) {
    this.ticketRepositoryProvider = ticketRepositoryProvider;
  }

  @Override
  public TicketUseCase get() {
    return provideTicketUseCase(ticketRepositoryProvider.get());
  }

  public static DomainModule_ProvideTicketUseCaseFactory create(
      Provider<TicketRepository> ticketRepositoryProvider) {
    return new DomainModule_ProvideTicketUseCaseFactory(ticketRepositoryProvider);
  }

  public static TicketUseCase provideTicketUseCase(TicketRepository ticketRepository) {
    return Preconditions.checkNotNullFromProvides(DomainModule.INSTANCE.provideTicketUseCase(ticketRepository));
  }
}