package com.example.lr4_day;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EveningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evening);
    }

    public void screen_Night(View view) {
        Intent intent = new Intent(EveningActivity.this, NightActivity.class);
        startActivity(intent);
    }
}