package com.example.dolin.tracealgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sortMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort_menu);


    }
    public void traceselect(View view)
    {
        Intent intent = new Intent(this, traceselect.class);
        startActivity(intent);
    }
    public void algoselect(View view)
    {
        Intent intent = new Intent(this, algoselect.class);
        startActivity(intent);
    }
    public void tracebubble(View view)
    {
        Intent intent = new Intent(this, tracebubble.class);
        startActivity(intent);
    }
    public void algobubble(View view)
    {
        Intent intent = new Intent(this, algobubble.class);
        startActivity(intent);

    }
    public void sorteg(View view)
    {
        Intent intent = new Intent(this, sorteg.class);
        startActivity(intent);
    }
    public void selecteg(View view)
    {
        Intent intent = new Intent(this, selecteg.class);
        startActivity(intent);
    }
}
