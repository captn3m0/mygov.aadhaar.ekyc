package android.support.v4.b;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;

@TargetApi(14)
final class ag
{
  public static final class a
    implements aa
  {
    private Notification.Builder a;
    
    public a(Context paramContext, Notification paramNotification, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, RemoteViews paramRemoteViews, int paramInt1, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, Bitmap paramBitmap, int paramInt2, int paramInt3, boolean paramBoolean)
    {
      paramContext = new Notification.Builder(paramContext).setWhen(when).setSmallIcon(icon, iconLevel).setContent(contentView).setTicker(tickerText, paramRemoteViews).setSound(sound, audioStreamType).setVibrate(vibrate).setLights(ledARGB, ledOnMS, ledOffMS);
      if ((flags & 0x2) != 0)
      {
        bool = true;
        paramContext = paramContext.setOngoing(bool);
        if ((flags & 0x8) == 0) {
          break label224;
        }
        bool = true;
        label112:
        paramContext = paramContext.setOnlyAlertOnce(bool);
        if ((flags & 0x10) == 0) {
          break label230;
        }
        bool = true;
        label132:
        paramContext = paramContext.setAutoCancel(bool).setDefaults(defaults).setContentTitle(paramCharSequence1).setContentText(paramCharSequence2).setContentInfo(paramCharSequence3).setContentIntent(paramPendingIntent1).setDeleteIntent(deleteIntent);
        if ((flags & 0x80) == 0) {
          break label236;
        }
      }
      label224:
      label230:
      label236:
      for (boolean bool = true;; bool = false)
      {
        a = paramContext.setFullScreenIntent(paramPendingIntent2, bool).setLargeIcon(paramBitmap).setNumber(paramInt1).setProgress(paramInt2, paramInt3, paramBoolean);
        return;
        bool = false;
        break;
        bool = false;
        break label112;
        bool = false;
        break label132;
      }
    }
    
    public final Notification.Builder a()
    {
      return a;
    }
    
    public final Notification b()
    {
      return a.getNotification();
    }
  }
}


/* Location:              android/support/v4/b/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */