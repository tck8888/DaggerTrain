package com.tck.daggertrain.di;

import com.tck.daggertrain.MainActivity;

import dagger.Component;

/**
 * description:
 *
 * @author tck88
 * @version v3.6.50
 * @date 2020/3/8 10:20
 */
@Component(modules = {HttpModule.class,DataBaseModule.class})
public interface MyComponent {

    void injectMainActivity(MainActivity mainActivity);
}
