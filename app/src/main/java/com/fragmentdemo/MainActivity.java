package com.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Fragment fragment;
    int count = 0;
    int count1 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myClick(View view) {
        Fragment fragment = new Myfragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentview, fragment).addToBackStack("").commit();
        count++;


    }


    public void myClick1(View view) {
        Fragment fragment = new Myfragment1();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentview1, fragment).addToBackStack("").commit();
        count1++;
    }

    public void myappclick(View view) {
        Toast.makeText(MainActivity.this, "this is my app fragment 1", Toast.LENGTH_LONG).show();
    }

    public void myappclick1(View view) {
        Toast.makeText(MainActivity.this, "this is my app fragment 2", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onBackPressed() {

        int i = getSupportFragmentManager().getBackStackEntryCount();

        if (i==0) {
            super.onBackPressed();

           }
        else {
            getSupportFragmentManager().popBackStack(null , FragmentManager.POP_BACK_STACK_INCLUSIVE);
        }

    }

}

