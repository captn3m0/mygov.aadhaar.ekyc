package android.support.v4.b;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.RemoteViews;

final class ab$m
  extends ab.l
{
  public final Notification a(ab.d paramd)
  {
    Object localObject1 = a;
    Object localObject2 = F;
    Object localObject3 = b;
    CharSequence localCharSequence1 = c;
    CharSequence localCharSequence2 = h;
    Object localObject4 = f;
    int i = i;
    PendingIntent localPendingIntent1 = d;
    PendingIntent localPendingIntent2 = e;
    Bitmap localBitmap = g;
    Object localObject5 = new android/app/Notification$Builder;
    ((Notification.Builder)localObject5).<init>((Context)localObject1);
    long l = when;
    localObject1 = ((Notification.Builder)localObject5).setWhen(l);
    int j = icon;
    int k = iconLevel;
    localObject1 = ((Notification.Builder)localObject1).setSmallIcon(j, k);
    localObject5 = contentView;
    localObject1 = ((Notification.Builder)localObject1).setContent((RemoteViews)localObject5);
    localObject5 = tickerText;
    localObject1 = ((Notification.Builder)localObject1).setTicker((CharSequence)localObject5, (RemoteViews)localObject4);
    localObject4 = sound;
    j = audioStreamType;
    localObject1 = ((Notification.Builder)localObject1).setSound((Uri)localObject4, j);
    localObject4 = vibrate;
    localObject1 = ((Notification.Builder)localObject1).setVibrate((long[])localObject4);
    int m = ledARGB;
    j = ledOnMS;
    k = ledOffMS;
    localObject4 = ((Notification.Builder)localObject1).setLights(m, j, k);
    int n = flags & 0x2;
    label238:
    label264:
    int i3;
    if (n != 0)
    {
      n = 1;
      localObject4 = ((Notification.Builder)localObject4).setOngoing(n);
      int i1 = flags & 0x8;
      if (i1 == 0) {
        break label389;
      }
      i1 = 1;
      localObject4 = ((Notification.Builder)localObject4).setOnlyAlertOnce(i1);
      int i2 = flags & 0x10;
      if (i2 == 0) {
        break label397;
      }
      i2 = 1;
      localObject1 = ((Notification.Builder)localObject4).setAutoCancel(i2);
      m = defaults;
      localObject1 = ((Notification.Builder)localObject1).setDefaults(m).setContentTitle((CharSequence)localObject3).setContentText(localCharSequence1).setContentInfo(localCharSequence2).setContentIntent(localPendingIntent1);
      localObject3 = deleteIntent;
      localObject3 = ((Notification.Builder)localObject1).setDeleteIntent((PendingIntent)localObject3);
      i3 = flags & 0x80;
      if (i3 == 0) {
        break label405;
      }
      i3 = 1;
    }
    for (;;)
    {
      localObject1 = ((Notification.Builder)localObject3).setFullScreenIntent(localPendingIntent2, i3).setLargeIcon(localBitmap).setNumber(i).getNotification();
      localObject2 = C;
      if (localObject2 != null)
      {
        localObject2 = C;
        contentView = ((RemoteViews)localObject2);
      }
      return (Notification)localObject1;
      int i4 = 0;
      localObject1 = null;
      break;
      label389:
      i4 = 0;
      localObject1 = null;
      break label238;
      label397:
      i4 = 0;
      localObject1 = null;
      break label264;
      label405:
      i4 = 0;
      localObject1 = null;
    }
  }
}


/* Location:              android/support/v4/b/ab$m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */