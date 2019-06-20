package com.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myclick(View view) {
        Fragment fragment = new Myfragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentview, fragment).addToBackStack("").commit();
        if (!(fragment instanceof onBackpressd) || !((IOnBackPressed) fragment).onBackPressed()) {
            super.onBackPressed();
        }

    }


    public void myclick1(View view) {
        Fragment fragment = new Myfragment1();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentview1, fragment).addToBackStack("").commit();

    }

    public void myappclick(View view) {
        Toast.makeText(MainActivity.this, "this is my app fragment 1", Toast.LENGTH_LONG).show();
    }

    public void myappclick1(View view) {
        Toast.makeText(MainActivity.this, "this is my app fragment 2", Toast.LENGTH_LONG).show();
    }
/*

    @Override
    public void onBackPressed() {

        int fragment = getSupportFragmentManager().getBackStackEntryCount();

        if (fragment == 0) {
            super.onBackPressed();
            finish();
           }
        else {
            getSupportFragmentManager().popBackStack();
        }

    }
*/
}

