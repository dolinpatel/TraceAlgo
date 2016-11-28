package com.example.dolin.tracealgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class searchMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_menu);
    }
    public void tracelinear(View view)
    {
        Intent intent = new Intent(this, tracelinear.class);
        startActivity(intent);

    }
    public void algolinear(View view)
    {
        Intent intent = new Intent(this, algolinear.class);
        startActivity(intent);
    }
    public void tracebinary(View view)
    {
        Intent intent = new Intent(this, tracebinary.class);
        startActivity(intent);
    }
    public void algobinary(View view)
    {
        Intent intent = new Intent(this, algobinary.class);
        startActivity(intent);
    }
    public void lineareg(View view)
    {
        Intent intent = new Intent(this, algobinary.class);
        startActivity(intent);
    }
    public void binaryeg(View view)
    {
        Intent intent = new Intent(this, algobinary.class);
        startActivity(intent);
    }
}
