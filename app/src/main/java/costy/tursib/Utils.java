package costy.tursib;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.BatteryManager;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

import costy.tursib.MainActivity;
import costy.tursib.R;

import static android.app.Notification.PRIORITY_HIGH;

/**
 * Created by Costy on 3/31/2017.
 */

public class Utils extends Service
{

    final public int COLOR_BLACK = 0x000000;
    final public int COLOR_BLUE = 0x0000FF;
    final public int COLOR_BROWN = 0xA52A2A;
    final public int COLOR_CYAN = 0x00FFFF;
    final public int COLOR_DARKBLUE = 0x000080;
    final public int COLOR_DARKCYAN = 0x008080;
    final public int COLOR_DARKGRAY = 0x808080;
    final public int COLOR_DARKGREEN = 0x008000;
    final public int COLOR_DARKMAGNETA = 0x800080;
    final public int COLOR_DARKRED = 0x800000;
    final public int COLOR_DARKYELLOW = 0x808000;
    final public int COLOR_GRAY = 0x808080;
    final public int COLOR_GREEN = 0x00FF00;
    final public int COLOR_LIGHTGRAY = 0xC0C0C0;
    final public int COLOR_MAGNETA = 0xFF00FF;
    final public int COLOR_ORANGE = 0xFFA500;
    final public int COLOR_PINK = 0xFFC0CB;
    final public int COLOR_PURPLE = 0x800080;
    final public int COLOR_RED = 0xFF0000;
    final public int COLOR_WHITE = 0xFFFFFF;
    final public int COLOR_YELLOW = 0xFFFF00;

    final public int NOTIFY_ID = 69;

    final public String YES = "DA";
    final public String NO = "NU";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) { return null; }


    public void my_toast(Context cont, String text, int duration)
    {

        Toast.makeText(cont, text, duration).show();
    }

    public void SimpleNotification(Context cont, String title, String text, int SmallIcon, int LargeIcon, int widthLargeIcon, int heightLargeIcon, int color)
    {
        Bitmap btp = BitmapFactory.decodeResource(cont.getResources(), LargeIcon);
        Bitmap resized = reziseBitmap(btp, widthLargeIcon, heightLargeIcon);
        Uri sound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

            Notification notific = new Notification.Builder(cont)
                    .setContentTitle(title)
                    .setContentText(text)
                    .setSmallIcon(SmallIcon)
                    .setLargeIcon(resized)
                    .setSound(sound)
                    .setColor(color)
                    .setContentIntent(null)
                    .setOngoing(false).build();


        Random random = new Random();
        int rand = random.nextInt(100 - 20 + 1) - 20;
        NotificationManager man = (NotificationManager) cont.getSystemService(Context.NOTIFICATION_SERVICE);
        man.notify(rand, notific);

    }

    public void ActionNotification(Context cont, String title, String text, String text2, int SmallIcon, int LargeIcon, int widthLargeIcon, int heightLargeIcon, int color)
    {
        Bitmap btp = BitmapFactory.decodeResource(cont.getResources(), LargeIcon);
        Bitmap resized = reziseBitmap(btp, widthLargeIcon, heightLargeIcon);

        Uri sound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        Intent yes = new Intent(cont, NotificationRecevicer.class);
        yes.setAction(YES);
        PendingIntent pendingIntent1 = PendingIntent.getBroadcast(cont, (int)System.currentTimeMillis(), yes, PendingIntent.FLAG_UPDATE_CURRENT);

        Intent no = new Intent(cont, NotificationRecevicer.class);
        no.setAction(NO);
        PendingIntent pendingIntent2 = PendingIntent.getBroadcast(cont, (int)System.currentTimeMillis(), no, PendingIntent.FLAG_UPDATE_CURRENT);

        Notification notific = new Notification.Builder(cont)
                .setContentTitle(title)
                .setContentText(text)
                .setSmallIcon(SmallIcon)
                .setLargeIcon(resized)
                .setSound(sound)
                .setColor(color)
                .setStyle(new Notification.BigTextStyle().bigText(text2))
                .setOngoing(false)
                .setPriority(Notification.PRIORITY_HIGH)
                .setDefaults(Notification.DEFAULT_VIBRATE)
                .addAction(R.mipmap.ic_yes, "OK", pendingIntent1)
                //.addAction(R.mipmap.ic_no, "NO", pendingIntent2)
                .build();

        NotificationManager man = (NotificationManager) cont.getSystemService(Context.NOTIFICATION_SERVICE);
        man.notify(NOTIFY_ID, notific);
    }

    public int getBatteryPercentage(Context context)
    {

        IntentFilter iFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        Intent batteryStatus = context.registerReceiver(null, iFilter);

        int level = batteryStatus != null ? batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, -1) : -1;
        int scale = batteryStatus != null ? batteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, -1) : -1;

        float batteryPct = level / (float) scale;

        return (int) (batteryPct * 100);
    }

    public Bitmap reziseBitmap(Bitmap bmp, int Width, int Height)
    {
        int width = bmp.getWidth();
        int height = bmp.getHeight();

        float scale_width = ((float) Width) / width;
        float scale_height = ((float) Height) / height;

        Matrix matrix = new Matrix();

        matrix.postScale(scale_width, scale_height);

        Bitmap reziedbmp = Bitmap.createBitmap(bmp, 0, 0, width, height, matrix, false);
        bmp.recycle();

        return reziedbmp;
    }

    /*
    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
     */
}

