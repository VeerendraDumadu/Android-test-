package com.example.uidesigns;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static com.example.uidesigns.R.id.button;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
public class MainActivity extends AppCompatActivity {
public Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        NotificationCompat.Builder mBuilder =  new NotificationCompat.Builder(MainActivity.this)
//                .setSmallIcon(R.drawable.ic_add_alert_black_24dp)
//                .setContentTitle("Android App")
//                .setContentText("Hi, Welcome to App");
//        // Set the intent to fire when the user taps on notification.
//        Intent resultIntent = new Intent(MainActivity.this, MainActivity.class);
//        PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, resultIntent, 0);
//        mBuilder.setContentIntent(pendingIntent);
//        // Sets an ID for the notification
//        int mNotificationId = 001;
//        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//        // It will display the notification in notification bar
//        notificationManager.notify(mNotificationId, mBuilder.build());
//        button = (Button) findViewById(R.id.button);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//            }
//        });
    }

//                Intent intent = new Intent(MainActivity.this, second.class);
//                startActivity(intent);

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart invoked");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked");
    }
}
