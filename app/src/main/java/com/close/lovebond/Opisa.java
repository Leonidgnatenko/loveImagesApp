package com.close.lovebond;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class Opisa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opisa);
        ViewPager viewPager = findViewById(R.id.showPage);
        ReceiverImage adapter = new ReceiverImage(this);
        viewPager.setAdapter(adapter);
    }
}