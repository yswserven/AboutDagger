package com.custom.dagger.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.custom.dagger.R;
import com.custom.dagger.use.three.DaggerSchoolComponent;
import com.custom.dagger.use.three.School;
import com.custom.dagger.use.three.SchoolModule;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;

public class ThreeActivity extends AppCompatActivity {

    @Inject
    School school;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
    }

    public void injectSchool(View view) {
        DaggerSchoolComponent.builder().schoolModule(new SchoolModule("莆田学院")).build().inject(this);
        Log.d("Ysw", "injectSchool: " + school.toString());
    }
}
