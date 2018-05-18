package com.espritpixel.myfirstapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_sample);

        //check if fragment is already added
        //TODO do it later
        if(getSupportFragmentManager().findFragmentById(R.id.fragmentContainer) == null) {

           /* //get fragment manager

            FragmentManager fragmentManager = getSupportFragmentManager();

            //start a transaction

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            //add fragment

            fragmentTransaction.add(R.id.fragmentContainer, new BFragment());
            //commit transaction

            fragmentTransaction.commit();*/


            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragmentContainer, new BFragment())
                    .commit();

        }
    }
}
