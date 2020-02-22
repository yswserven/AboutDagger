package com.custom.dagger.use.two;

import dagger.Module;
import dagger.Provides;

/**
 * Created by: Ysw on 2020/2/22.
 */

@Module
public class PersonModule {

    @Provides
    Person providesPerson() {
        return new Person();
    }
}
