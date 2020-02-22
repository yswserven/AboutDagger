package com.custom.dagger.use.two;

import com.custom.dagger.ui.SecondActivity;

import dagger.Component;

/**
 * Created by: Ysw on 2020/2/22.
 */

@Component(modules = PersonModule.class)
public interface PersonComponent {

    void inject(SecondActivity activity);
}
