package com.tck.daggertrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tck.daggertrain.di.DaggerMyComponent;
import com.tck.daggertrain.di.DataBaseObject;
import com.tck.daggertrain.di.HttpObject;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    HttpObject httpObject;
    @Inject
    DataBaseObject dataBaseObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMyComponent.create().injectMainActivity(this);
    }
}
