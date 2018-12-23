package com.example.aisyah.squawker;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class FragmentAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        //pengecekan agar fragment hanya dibuat sekali saja
        if (savedInstanceState == null) {
            //mengambil fragment baju
            BodyPartFragment mknFragment = new BodyPartFragment();
            mknFragment.setmListIndex(0);
            //inisiasi adapter untuk mengaktifkan fragmen baju
            FragmentManager fragmentManager = getSupportFragmentManager();
            mknFragment.setmImageIds(ImageAssets.getMkn());
            //transaksi fragmen
            fragmentManager.beginTransaction()
                    .add(R.id.mkn_container, mknFragment)
                    .commit();



        }
    }
}
