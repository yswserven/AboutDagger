package com.custom.dagger.use.one;

import com.custom.dagger.ui.MainActivity;

import dagger.Component;

/**
 * Created by: Ysw on 2020/2/22.
 */

@Component
public interface UserComponent {
    void inject(MainActivity activity);
}
