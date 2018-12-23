package com.example.aisyah.squawker;

import java.util.ArrayList;
import java.util.List;


public class ImageAssets {

    ////variabel pengelompokan gambar baju
    private static List<Integer> mkn = new ArrayList<Integer>(){{
        add(R.drawable.m0);
        add(R.drawable.m1);
        add(R.drawable.m2);
        add(R.drawable.m3);
        add(R.drawable.m4);
        add(R.drawable.m5);
        add(R.drawable.m6);
        add(R.drawable.m7);
        add(R.drawable.m8);
    }};


    //metode untuk heads
    public static List<Integer> getMkn(){
        return mkn;
    }

}
