package com.custom.dagger.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.custom.dagger.R;
import com.custom.dagger.use.one.DaggerUserComponent;
import com.custom.dagger.use.one.User;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void injectUser(View view) {
        DaggerUserComponent.create().inject(this);
        Log.d("Ysw", "onCreate: " + user.toString());
        user.setAge("30");
        user.setName("杨胜文");
        Log.d("Ysw", "onCreate: " + user.toString());
    }

    public void jumpSecond(View view) {
        startActivity(new Intent().setClass(MainActivity.this, SecondActivity.class));
    }

    public void jumpThree(View view) {
        startActivity(new Intent().setClass(MainActivity.this, ThreeActivity.class));
    }

    public void jumpFour(View view) {
        startActivity(new Intent().setClass(MainActivity.this, FourActivity.class));
    }
}
