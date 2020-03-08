package com.tck.daggertrain.di;

import dagger.Module;
import dagger.Provides;

/**
 * description:
 *
 * @author tck88
 * @version v3.6.50
 * @date 2020/3/7 23:50
 */
@Module
public class DataBaseModule {
    @Provides
    public DataBaseObject provideDataBaseObject(){
        return new DataBaseObject();
    }
}
