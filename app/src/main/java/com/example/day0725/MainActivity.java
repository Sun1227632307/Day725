package com.example.day0725;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //我是文件小助手
        Toast.makeText(this, "我是文件小助手", Toast.LENGTH_SHORT).show();
        int f=1;
        int e=2;
        
    }
}
