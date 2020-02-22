package com.custom.dagger.use.three;

import dagger.Module;
import dagger.Provides;

/**
 * Created by: Ysw on 2020/2/22.
 */

@Module
public class SchoolModule {
    private String name;

    public SchoolModule(String name) {
        this.name = name;
    }

    @Provides
    School providesSchool() {
        return new School(name);
    }
}
