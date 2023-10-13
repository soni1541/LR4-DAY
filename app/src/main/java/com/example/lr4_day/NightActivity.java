package com.example.lr4_day;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_night);
    }

    public void check_sleep(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(NightActivity.this);

        builder.setTitle("Ты спишь?")

                .setIcon(R.drawable.night)
                .setPositiveButton("ДА", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        moveTaskToBack(true);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);

                    }
                });
        builder.setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Intent intent = new Intent(NightActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        builder.show();

        builder.create();
    }
}