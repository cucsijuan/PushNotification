package juan.com.pushnotification;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.notificar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder nBuilder = new NotificationCompat.Builder(MainActivity.this);
                nBuilder.setContentTitle("Kernel panic!");
                nBuilder.setContentText("Printer on fire!!");
                nBuilder.setSmallIcon(android.R.drawable.ic_dialog_alert);
                NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                Notification notif = nBuilder.build();
                notificationManager.notify(2233,notif);
            }
        });
    }
}

// Otrs temas AsyncTask, servicios, intentservice
