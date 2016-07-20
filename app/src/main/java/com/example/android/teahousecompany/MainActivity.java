package com.example.android.teahousecompany;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void news(View view) {
        Intent intent = new Intent(this, News.class);
        startActivity(intent);

    }

    public void teaAndCoffee(View view) {
        Intent intent = new Intent(this, TeaAndCoffee.class);
        startActivity(intent);

    }

    public void sale(View view) {
        Intent intent = new Intent(this, Sale.class);
        startActivity(intent);

    }

    public void aboutUs(View view) {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);

    }

}
