package com.example.baseballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button strike;
    Button ball;
    Button out;
    Button walk;
    Button error;
    Button strikeout;
    Button flyout;
    Button single;
    Button bdouble;
    Button triple;
    Button homerun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
