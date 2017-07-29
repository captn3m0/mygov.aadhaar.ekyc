package android.support.v4.b;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.RemoteViews;

public final class ag$a
  implements aa
{
  private Notification.Builder a;
  
  public ag$a(Context paramContext, Notification paramNotification, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, RemoteViews paramRemoteViews, int paramInt1, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, Bitmap paramBitmap, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    Notification.Builder localBuilder = new android/app/Notification$Builder;
    localBuilder.<init>(paramContext);
    long l = when;
    localBuilder = localBuilder.setWhen(l);
    int i = icon;
    int j = iconLevel;
    localBuilder = localBuilder.setSmallIcon(i, j);
    Object localObject = contentView;
    localBuilder = localBuilder.setContent((RemoteViews)localObject);
    localObject = tickerText;
    localBuilder = localBuilder.setTicker((CharSequence)localObject, paramRemoteViews);
    localObject = sound;
    j = audioStreamType;
    localBuilder = localBuilder.setSound((Uri)localObject, j);
    localObject = vibrate;
    localBuilder = localBuilder.setVibrate((long[])localObject);
    i = ledARGB;
    j = ledOnMS;
    int k = ledOffMS;
    localObject = localBuilder.setLights(i, j, k);
    int m = flags & 0x2;
    label196:
    label222:
    int i2;
    if (m != 0)
    {
      m = 1;
      localObject = ((Notification.Builder)localObject).setOngoing(m);
      int n = flags & 0x8;
      if (n == 0) {
        break label344;
      }
      n = 1;
      localObject = ((Notification.Builder)localObject).setOnlyAlertOnce(n);
      int i1 = flags & 0x10;
      if (i1 == 0) {
        break label353;
      }
      i1 = 1;
      localBuilder = ((Notification.Builder)localObject).setAutoCancel(i1);
      i = defaults;
      localBuilder = localBuilder.setDefaults(i).setContentTitle(paramCharSequence1).setContentText(paramCharSequence2).setContentInfo(paramCharSequence3).setContentIntent(paramPendingIntent1);
      localObject = deleteIntent;
      localObject = localBuilder.setDeleteIntent((PendingIntent)localObject);
      i2 = flags & 0x80;
      if (i2 == 0) {
        break label362;
      }
      i2 = 1;
    }
    for (;;)
    {
      localBuilder = ((Notification.Builder)localObject).setFullScreenIntent(paramPendingIntent2, i2).setLargeIcon(paramBitmap).setNumber(paramInt1).setProgress(paramInt2, paramInt3, paramBoolean);
      a = localBuilder;
      return;
      int i3 = 0;
      localBuilder = null;
      break;
      label344:
      i3 = 0;
      localBuilder = null;
      break label196;
      label353:
      i3 = 0;
      localBuilder = null;
      break label222;
      label362:
      i3 = 0;
      localBuilder = null;
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


/* Location:              android/support/v4/b/ag$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */