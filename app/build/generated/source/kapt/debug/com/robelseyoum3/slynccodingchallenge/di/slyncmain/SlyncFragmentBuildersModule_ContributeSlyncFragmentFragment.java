package com.robelseyoum3.slynccodingchallenge.di.slyncmain;

import com.robelseyoum3.slynccodingchallenge.ui.feed.FeedFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      SlyncFragmentBuildersModule_ContributeSlyncFragmentFragment.FeedFragmentSubcomponent.class
)
public abstract class SlyncFragmentBuildersModule_ContributeSlyncFragmentFragment {
  private SlyncFragmentBuildersModule_ContributeSlyncFragmentFragment() {}

  @Binds
  @IntoMap
  @ClassKey(FeedFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FeedFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface FeedFragmentSubcomponent extends AndroidInjector<FeedFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<FeedFragment> {}
  }
}
