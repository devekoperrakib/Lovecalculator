package com.developerrakib.llb;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {


    private Toolbar mtool;
    private AdView ads ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this,"ca-app-pub-5777785983536639~2370449640");



        ads = (AdView)findViewById(R.id.adView);
      //  ads.setAdUnitId("ca-app-pub-5777785983536639/3306404599");


        AdRequest ar = new AdRequest.Builder().build();
        ads.loadAd(ar);

    }
}
