package com.example.studikasus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager(); // membuat tipe data fragment
        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.frame1, new fragmentsatu());
        ft.add(R.id.frame2, new fragmentdua());
        ft.commit();
    }

}
