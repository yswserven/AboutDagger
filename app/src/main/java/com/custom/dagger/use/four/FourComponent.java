package com.custom.dagger.use.four;

import com.custom.dagger.ui.FourActivity;
import com.custom.dagger.use.three.SchoolModule;
import com.custom.dagger.use.two.PersonModule;

import dagger.Component;

/**
 * Created by: Ysw on 2020/2/22.
 */

@Component(modules = {PersonModule.class, SchoolModule.class})
public interface FourComponent {
    void inject(FourActivity activity);
}
