package com.example.dolin.tracealgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class sorteg extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorteg);


    }

    void sortNumber(View view) {

        EditText field1 = (EditText) findViewById(R.id.getno1);
        EditText field2 = (EditText) findViewById(R.id.getno2);
        EditText field3 = (EditText) findViewById(R.id.getno3);
        EditText field4 = (EditText) findViewById(R.id.getno4);
        EditText field5 = (EditText) findViewById(R.id.getno5);
        int a[] = new int[5];
        TextView t1 = (TextView) findViewById(R.id.putno1);
        TextView t2 = (TextView) findViewById(R.id.putno2);
        TextView t3 = (TextView) findViewById(R.id.putno3);
        TextView t4 = (TextView) findViewById(R.id.putno4);
        TextView t5 = (TextView) findViewById(R.id.putno5);
        a[0] = Integer.parseInt(field1.getText().toString());

        a[1] = Integer.parseInt((field2.getText().toString()));

        a[2] = Integer.parseInt(field3.getText().toString());

        a[3] = Integer.parseInt(field4.getText().toString());

        a[4] = Integer.parseInt(field5.getText().toString());

        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = 0;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                if(i==1)
                    t5.setText((Arrays.toString(a)));
                else if(i==2)
                    t4.setText(Arrays.toString(a));
                else if(i==3)
                    t3.setText(Arrays.toString(a));
                else if(i==4)
                    t2.setText(Arrays.toString(a));
                else if(i==1)
                    t1.setText(Arrays.toString(a));
            }
        }

    }

}
