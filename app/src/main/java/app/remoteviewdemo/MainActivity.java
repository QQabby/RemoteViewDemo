package app.remoteviewdemo;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view){


    }

    /**
     * 发送一个自定义layout的通知
     */
    public void sendCustomerNotification(){
        //setLatestEventInfo已过时 发送一个通知
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification.Builder builder = new Notification.Builder(
                MainActivity.this);
        builder.setContentTitle("title");
        builder.setContentText("content");
        builder.setSmallIcon(R.drawable.favor);
        Notification notification = builder.build();


//        RemoteViews remoteViews = new RemoteViews(getPackageName(),R.layout.layout_demo1);
//        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,new Intent(this,DemoActivity_1.class),PendingIntent.FLAG_UPDATE_CURRENT);
//        remoteViews.setOnClickPendingIntent(R.id.button,pendingIntent);
//        manager.notify(1, notification);
    }

    /**
     * 发送一个系统自带的通知
     */
    public void sendSystemNotification(){
        //setLatestEventInfo已过时 发送一个通知
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification.Builder builder = new Notification.Builder(
                MainActivity.this);
        builder.setContentTitle("title");
        builder.setContentText("content");
        builder.setSmallIcon(R.drawable.favor);
        Notification notification = builder.build();
        manager.notify(1, notification);
    }
}
