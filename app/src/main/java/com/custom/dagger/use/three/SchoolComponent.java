package com.custom.dagger.use.three;

import com.custom.dagger.ui.ThreeActivity;

import dagger.Component;

/**
 * Created by: Ysw on 2020/2/22.
 */

@Component(modules = SchoolModule.class)
public interface SchoolComponent {
    void inject(ThreeActivity activity);
}
