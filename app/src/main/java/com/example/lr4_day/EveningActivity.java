package com.example.lr4_day;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

public class EveningActivity extends AppCompatActivity {

    private static final String CHANEL_ID = "ch1"; // ID канала
    private NotificationManagerCompat notificationManagerCompat; // менеджер нотификаций

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evening);

        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(EveningActivity.this, CHANEL_ID)
                        .setContentTitle("Добрый вечер")
                        .setContentText("Пора ложиться спать")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        notificationManagerCompat.notify(1, builder.build());

    }

    public void screen_Night(View view) {
        Intent intent = new Intent(EveningActivity.this, NightActivity.class);
        startActivity(intent);
    }
}