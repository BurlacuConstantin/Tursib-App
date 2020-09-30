package costy.tursib;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import costy.tursib.MainActivity;
import costy.tursib.Utils;

/**
 * Created by Costel on 4/1/2017.
 */

public class NotificationRecevicer extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Utils myutil = new Utils();
        NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        if(intent.getAction().equals(myutil.YES))
        {
            manager.cancel(myutil.NOTIFY_ID);
        }
        else if(intent.getAction().equals(myutil.NO))
        {
            manager.cancel(myutil.NOTIFY_ID);
        }
    }
}
