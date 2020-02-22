package com.custom.dagger.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.custom.dagger.R;
import com.custom.dagger.use.two.DaggerPersonComponent;
import com.custom.dagger.use.two.Person;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Inject
    Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void injectPerson(View view) {
        DaggerPersonComponent.builder().build().inject(this);
        Log.d("Ysw", "injectPerson: " + person.toString());
    }
}
