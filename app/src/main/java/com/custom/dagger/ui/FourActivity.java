package com.custom.dagger.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.custom.dagger.R;
import com.custom.dagger.use.four.DaggerFourComponent;
import com.custom.dagger.use.one.User;
import com.custom.dagger.use.three.School;
import com.custom.dagger.use.three.SchoolModule;
import com.custom.dagger.use.two.Person;
import com.custom.dagger.use.two.PersonModule;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;

public class FourActivity extends AppCompatActivity {

    @Inject
    Person person;
    @Inject
    School school;
    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
    }

    public void injects(View view) {
        DaggerFourComponent.builder()
                .personModule(new PersonModule())
                .schoolModule(new SchoolModule("莆田学院"))
                .build().inject(this);

        Log.d("Ysw", "injects: " + person.toString());
        Log.d("Ysw", "injects: " + school.toString());
        user.setAge("100");
        user.setName("这个是第四个界面设置的值");
        Log.d("Ysw", "injects: " + user.toString());
    }
}
