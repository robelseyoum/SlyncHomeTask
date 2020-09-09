// Generated by Dagger (https://dagger.dev).
package com.robelseyoum3.slynccodingchallenge.di;

import android.app.Application;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideGlideInstanceFactory implements Factory<RequestManager> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  private final Provider<RequestOptions> requestOptionsProvider;

  public AppModule_ProvideGlideInstanceFactory(AppModule module,
      Provider<Application> applicationProvider, Provider<RequestOptions> requestOptionsProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
    this.requestOptionsProvider = requestOptionsProvider;
  }

  @Override
  public RequestManager get() {
    return provideGlideInstance(module, applicationProvider.get(), requestOptionsProvider.get());
  }

  public static AppModule_ProvideGlideInstanceFactory create(AppModule module,
      Provider<Application> applicationProvider, Provider<RequestOptions> requestOptionsProvider) {
    return new AppModule_ProvideGlideInstanceFactory(module, applicationProvider, requestOptionsProvider);
  }

  public static RequestManager provideGlideInstance(AppModule instance, Application application,
      RequestOptions requestOptions) {
    return Preconditions.checkNotNull(instance.provideGlideInstance(application, requestOptions), "Cannot return null from a non-@Nullable @Provides method");
  }
}
