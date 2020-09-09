// Generated by Dagger (https://dagger.dev).
package com.robelseyoum3.slynccodingchallenge.ui.main.slyncnews;

import com.robelseyoum3.slynccodingchallenge.viewmodel.ViewModelProviderFactory;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseSlyncFeedFragment_MembersInjector implements MembersInjector<BaseSlyncFeedFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<ViewModelProviderFactory> providerFactoryProvider;

  public BaseSlyncFeedFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProviderFactory> providerFactoryProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.providerFactoryProvider = providerFactoryProvider;
  }

  public static MembersInjector<BaseSlyncFeedFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProviderFactory> providerFactoryProvider) {
    return new BaseSlyncFeedFragment_MembersInjector(androidInjectorProvider, providerFactoryProvider);}

  @Override
  public void injectMembers(BaseSlyncFeedFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectProviderFactory(instance, providerFactoryProvider.get());
  }

  @InjectedFieldSignature("com.robelseyoum3.slynccodingchallenge.ui.main.slyncnews.BaseSlyncFeedFragment.providerFactory")
  public static void injectProviderFactory(BaseSlyncFeedFragment instance,
      ViewModelProviderFactory providerFactory) {
    instance.providerFactory = providerFactory;
  }
}
