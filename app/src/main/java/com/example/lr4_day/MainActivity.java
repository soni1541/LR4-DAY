package com.example.lr4_day;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void screen_Morning(View view) {
        Intent intent = new Intent(MainActivity.this, MorningActivity.class);
        startActivity(intent);
    }
    public void screen_Day(View view) {
        Intent intent = new Intent(MainActivity.this, DayActivity.class);
        startActivity(intent);
    }
    public void screen_Evening(View view) {
        Intent intent = new Intent(MainActivity.this, EveningActivity.class);
        startActivity(intent);
    }
    public void screen_Night(View view) {
        Intent intent = new Intent(MainActivity.this, NightActivity.class);
        startActivity(intent);
    }
}