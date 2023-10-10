package com.example.lr4_day;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);
    }

    public void screen_Evening(View view) {
        Intent intent = new Intent(DayActivity.this, EveningActivity.class);
        startActivity(intent);
    }
}