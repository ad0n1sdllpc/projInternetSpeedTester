package com.nc_csc6_bscs2a.finalProject.Speedster;
//
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;


public class flash_sceen extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_splash);
        init_variables ();
    }

    private void init_variables () {
        SharedPreferences sharedPref = getSharedPreferences (
                "setting", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit ();
        editor.putString ("UNIT", "Mbps");
        editor.apply ();
        Handler handler = new Handler ();
        handler.postDelayed (() -> {
            flash_sceen.this.startActivity (new Intent (flash_sceen.this, MainActivity.class));
            finish ();
        }, 2000);
    }
}
