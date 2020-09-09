package com.robelseyoum3.slynccodingchallenge.di.slyncmain;

import com.robelseyoum3.slynccodingchallenge.ui.main.slyncnewsfeed.SlyncFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      SlyncFragmentBuildersModule_ContributeSlyncFragmentFragment.SlyncFragmentSubcomponent.class
)
public abstract class SlyncFragmentBuildersModule_ContributeSlyncFragmentFragment {
  private SlyncFragmentBuildersModule_ContributeSlyncFragmentFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SlyncFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SlyncFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SlyncFragmentSubcomponent extends AndroidInjector<SlyncFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SlyncFragment> {}
  }
}
