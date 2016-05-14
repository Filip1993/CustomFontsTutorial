package com.filipkesteli.customfontstutorial;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setupListeners();
    }

    private void initWidgets() {
        tv1 = (TextView) findViewById(R.id.textView3);
        tv2 = (TextView) findViewById(R.id.textView4);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "font/font.ttf");
        tv1.setTypeface(typeface);

        Typeface typeface2 = Typeface.createFromAsset(getAssets(), "font/font.ttf");
        tv2.setTypeface(typeface2);
    }

    private void setupListeners() {

    }
}
