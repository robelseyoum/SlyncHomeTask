// Generated by Dagger (https://dagger.dev).
package com.robelseyoum3.slynccodingchallenge.di;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import com.robelseyoum3.slynccodingchallenge.BaseApplication;
import com.robelseyoum3.slynccodingchallenge.data.api.WebServices;
import com.robelseyoum3.slynccodingchallenge.data.repository.SlyncRepository;
import com.robelseyoum3.slynccodingchallenge.di.slyncmain.SlyncFragmentBuildersModule_ContributeSlyncFragmentFragment;
import com.robelseyoum3.slynccodingchallenge.session.SessionManager;
import com.robelseyoum3.slynccodingchallenge.session.SessionManager_Factory;
import com.robelseyoum3.slynccodingchallenge.ui.main.slyncnews.BaseSlyncFeedFragment_MembersInjector;
import com.robelseyoum3.slynccodingchallenge.ui.main.slyncnewsfeed.SlyncViewModel;
import com.robelseyoum3.slynccodingchallenge.ui.main.slyncnews.SlyncViewModel_Factory;
import com.robelseyoum3.slynccodingchallenge.ui.main.slyncnewsfeed.SlyncActivity;
import com.robelseyoum3.slynccodingchallenge.ui.main.slyncnewsfeed.SlyncActivity_MembersInjector;
import com.robelseyoum3.slynccodingchallenge.ui.main.slyncnewsfeed.SlyncFragment;
import com.robelseyoum3.slynccodingchallenge.viewmodel.ViewModelProviderFactory;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityBuildersModule_ContributeMainActivity.SlyncActivitySubcomponent.Factory> slyncActivitySubcomponentFactoryProvider;

  private Provider<SessionManager> sessionManagerProvider;

  private Provider<HttpLoggingInterceptor> provideLoggingInterceptorProvider;

  private Provider<OkHttpClient> provideOkHttpClientProvider;

  private Provider<Retrofit.Builder> provideRetrofitBuilderProvider;

  private Provider<WebServices> provideOpenApiAuthServiceProvider;

  private Provider<SlyncRepository> provideSpaceRepositoryProvider;

  private DaggerAppComponent(AppModule appModuleParam, Application application) {

    initialize(appModuleParam, application);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
      ) {
    return Collections.<Class<?>, Provider<AndroidInjector.Factory<?>>>singletonMap(SlyncActivity.class, (Provider) slyncActivitySubcomponentFactoryProvider);}

  private DispatchingAndroidInjector<Object> getDispatchingAndroidInjectorOfObject() {
    return DispatchingAndroidInjector_Factory.newInstance(getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());}

  @SuppressWarnings("unchecked")
  private void initialize(final AppModule appModuleParam, final Application application) {
    this.slyncActivitySubcomponentFactoryProvider = new Provider<ActivityBuildersModule_ContributeMainActivity.SlyncActivitySubcomponent.Factory>() {
      @Override
      public ActivityBuildersModule_ContributeMainActivity.SlyncActivitySubcomponent.Factory get() {
        return new SlyncActivitySubcomponentFactory();}
    };
    this.sessionManagerProvider = DoubleCheck.provider(SessionManager_Factory.create());
    this.provideLoggingInterceptorProvider = DoubleCheck.provider(AppModule_ProvideLoggingInterceptorFactory.create(appModuleParam));
    this.provideOkHttpClientProvider = DoubleCheck.provider(AppModule_ProvideOkHttpClientFactory.create(appModuleParam, provideLoggingInterceptorProvider));
    this.provideRetrofitBuilderProvider = DoubleCheck.provider(AppModule_ProvideRetrofitBuilderFactory.create(appModuleParam, provideOkHttpClientProvider));
    this.provideOpenApiAuthServiceProvider = DoubleCheck.provider(AppModule_ProvideOpenApiAuthServiceFactory.create(appModuleParam, provideRetrofitBuilderProvider));
    this.provideSpaceRepositoryProvider = DoubleCheck.provider(AppModule_ProvideSpaceRepositoryFactory.create(appModuleParam, provideOpenApiAuthServiceProvider));
  }

  @Override
  public void inject(BaseApplication arg0) {
    injectBaseApplication(arg0);}

  @Override
  public SessionManager getSessionManager() {
    return sessionManagerProvider.get();}

  private BaseApplication injectBaseApplication(BaseApplication instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, getDispatchingAndroidInjectorOfObject());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private Application application;

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(application, Application.class);
      return new DaggerAppComponent(new AppModule(), application);
    }
  }

  private final class SlyncActivitySubcomponentFactory implements ActivityBuildersModule_ContributeMainActivity.SlyncActivitySubcomponent.Factory {
    @Override
    public ActivityBuildersModule_ContributeMainActivity.SlyncActivitySubcomponent create(
        SlyncActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new SlyncActivitySubcomponentImpl(arg0);
    }
  }

  private final class SlyncActivitySubcomponentImpl implements ActivityBuildersModule_ContributeMainActivity.SlyncActivitySubcomponent {
    private Provider<SlyncFragmentBuildersModule_ContributeSlyncFragmentFragment.SlyncFragmentSubcomponent.Factory> slyncFragmentSubcomponentFactoryProvider;

    private Provider<SlyncViewModel> slyncViewModelProvider;

    private SlyncActivitySubcomponentImpl(SlyncActivity arg0) {

      initialize(arg0);
    }

    private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
        ) {
      return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(2).put(SlyncActivity.class, (Provider) DaggerAppComponent.this.slyncActivitySubcomponentFactoryProvider).put(SlyncFragment.class, (Provider) slyncFragmentSubcomponentFactoryProvider).build();}

    private DispatchingAndroidInjector<Object> getDispatchingAndroidInjectorOfObject() {
      return DispatchingAndroidInjector_Factory.newInstance(getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());}

    private Map<Class<? extends ViewModel>, Provider<ViewModel>> getMapOfClassOfAndProviderOfViewModel(
        ) {
      return Collections.<Class<? extends ViewModel>, Provider<ViewModel>>singletonMap(SlyncViewModel.class, (Provider) slyncViewModelProvider);}

    private ViewModelProviderFactory getViewModelProviderFactory() {
      return new ViewModelProviderFactory(getMapOfClassOfAndProviderOfViewModel());}

    @SuppressWarnings("unchecked")
    private void initialize(final SlyncActivity arg0) {
      this.slyncFragmentSubcomponentFactoryProvider = new Provider<SlyncFragmentBuildersModule_ContributeSlyncFragmentFragment.SlyncFragmentSubcomponent.Factory>() {
        @Override
        public SlyncFragmentBuildersModule_ContributeSlyncFragmentFragment.SlyncFragmentSubcomponent.Factory get(
            ) {
          return new SlyncFragmentSubcomponentFactory();}
      };
      this.slyncViewModelProvider = SlyncViewModel_Factory.create(DaggerAppComponent.this.provideSpaceRepositoryProvider);
    }

    @Override
    public void inject(SlyncActivity arg0) {
      injectSlyncActivity(arg0);}

    private SlyncActivity injectSlyncActivity(SlyncActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, getDispatchingAndroidInjectorOfObject());
      SlyncActivity_MembersInjector.injectProviderFactory(instance, getViewModelProviderFactory());
      return instance;
    }

    private final class SlyncFragmentSubcomponentFactory implements SlyncFragmentBuildersModule_ContributeSlyncFragmentFragment.SlyncFragmentSubcomponent.Factory {
      @Override
      public SlyncFragmentBuildersModule_ContributeSlyncFragmentFragment.SlyncFragmentSubcomponent create(
          SlyncFragment arg0) {
        Preconditions.checkNotNull(arg0);
        return new SlyncFragmentSubcomponentImpl(arg0);
      }
    }

    private final class SlyncFragmentSubcomponentImpl implements SlyncFragmentBuildersModule_ContributeSlyncFragmentFragment.SlyncFragmentSubcomponent {
      private SlyncFragmentSubcomponentImpl(SlyncFragment arg0) {

      }

      @Override
      public void inject(SlyncFragment arg0) {
        injectSlyncFragment(arg0);}

      private SlyncFragment injectSlyncFragment(SlyncFragment instance) {
        DaggerFragment_MembersInjector.injectAndroidInjector(instance, SlyncActivitySubcomponentImpl.this.getDispatchingAndroidInjectorOfObject());
        BaseSlyncFeedFragment_MembersInjector.injectProviderFactory(instance, SlyncActivitySubcomponentImpl.this.getViewModelProviderFactory());
        return instance;
      }
    }
  }
}
