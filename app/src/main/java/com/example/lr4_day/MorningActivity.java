package com.example.lr4_day;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MorningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);
    }

    public void screen_Day(View view) {
        Intent intent = new Intent(MorningActivity.this, DayActivity.class);
        startActivity(intent);
    }
}