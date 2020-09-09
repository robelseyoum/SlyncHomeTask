package com.robelseyoum3.slynccodingchallenge.di;

import com.robelseyoum3.slynccodingchallenge.di.slyncmain.SlyncFragmentBuildersModule;
import com.robelseyoum3.slynccodingchallenge.di.slyncmain.SlyncViewModelModule;
import com.robelseyoum3.slynccodingchallenge.ui.main.slyncnewsfeed.SlyncActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuildersModule_ContributeMainActivity.SlyncActivitySubcomponent.class
)
public abstract class ActivityBuildersModule_ContributeMainActivity {
  private ActivityBuildersModule_ContributeMainActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SlyncActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SlyncActivitySubcomponent.Factory builder);

  @Subcomponent(modules = {SlyncFragmentBuildersModule.class, SlyncViewModelModule.class})
  public interface SlyncActivitySubcomponent extends AndroidInjector<SlyncActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SlyncActivity> {}
  }
}
