package com.robelseyoum3.slynccodingchallenge.di;

import com.robelseyoum3.slynccodingchallenge.di.slyncmain.SlyncFragmentBuildersModule;
import com.robelseyoum3.slynccodingchallenge.di.slyncmain.SlyncViewModelModule;
import com.robelseyoum3.slynccodingchallenge.ui.activity.MainActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuildersModule_ContributeMainActivity.MainActivitySubcomponent.class
)
public abstract class ActivityBuildersModule_ContributeMainActivity {
  private ActivityBuildersModule_ContributeMainActivity() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent(modules = {SlyncFragmentBuildersModule.class, SlyncViewModelModule.class})
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}
