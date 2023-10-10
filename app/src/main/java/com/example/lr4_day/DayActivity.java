package com.example.lr4_day;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

public class DayActivity extends AppCompatActivity {

    private static final String CHANEL_ID = "ch1"; // ID канала
    private NotificationManagerCompat notificationManagerCompat; // менеджер нотификаций

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);

        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(DayActivity.this, CHANEL_ID)
                        .setSmallIcon(R.drawable.ic_launcher_background)
                        .setContentTitle("Добрый день")
                        .setContentText("Скоро конец рабочего дня")
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

    public void screen_Evening(View view) {
        Intent intent = new Intent(DayActivity.this, EveningActivity.class);
        startActivity(intent);
    }
}