package com.example.preferecefragment;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.app.FragmentManager;

import android.app.FragmentTransaction;



public class MainActivity extends AppCompatActivity {


    @Override

    protected void onCreate(final Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //加载PrefFragment
        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        preferencea fragmentPreferences = new preferencea();



        transaction.replace(android.R.id.content, fragmentPreferences);

        transaction.addToBackStack(null);

        transaction.commit();



    }


}
