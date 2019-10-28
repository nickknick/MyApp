package com.deng.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//要在查找的前面 且对应

    }


    public void Click(View v){
        EditText input = findViewById(R.id.txt);
        String str = input.getText().toString();
        float s = Float.parseFloat(str);
        float r = s*1.8f+32;

        TextView show = findViewById(R.id.show_tmp);
//        show.setText(getString(R.string.txt_result) + String.format("%.2f",r));

    }







}
