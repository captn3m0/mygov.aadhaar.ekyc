package android.support.v4.b;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

public final class ae$a
  implements aa, z
{
  private Notification.Builder a;
  
  public ae$a(Context paramContext, Notification paramNotification1, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, RemoteViews paramRemoteViews1, int paramInt1, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, Bitmap paramBitmap, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt4, CharSequence paramCharSequence4, boolean paramBoolean4, String paramString1, ArrayList paramArrayList, Bundle paramBundle, int paramInt5, int paramInt6, Notification paramNotification2, String paramString2, boolean paramBoolean5, String paramString3, CharSequence[] paramArrayOfCharSequence, RemoteViews paramRemoteViews2, RemoteViews paramRemoteViews3, RemoteViews paramRemoteViews4)
  {
    Object localObject1 = new android/app/Notification$Builder;
    ((Notification.Builder)localObject1).<init>(paramContext);
    long l = when;
    localObject1 = ((Notification.Builder)localObject1).setWhen(l).setShowWhen(paramBoolean2);
    int i = icon;
    int j = iconLevel;
    localObject1 = ((Notification.Builder)localObject1).setSmallIcon(i, j);
    Object localObject2 = contentView;
    localObject1 = ((Notification.Builder)localObject1).setContent((RemoteViews)localObject2);
    localObject2 = tickerText;
    localObject1 = ((Notification.Builder)localObject1).setTicker((CharSequence)localObject2, paramRemoteViews1);
    localObject2 = sound;
    j = audioStreamType;
    localObject1 = ((Notification.Builder)localObject1).setSound((Uri)localObject2, j);
    localObject2 = vibrate;
    localObject1 = ((Notification.Builder)localObject1).setVibrate((long[])localObject2);
    i = ledARGB;
    j = ledOnMS;
    int k = ledOffMS;
    localObject2 = ((Notification.Builder)localObject1).setLights(i, j, k);
    int m = flags & 0x2;
    label201:
    label227:
    int i2;
    if (m != 0)
    {
      m = 1;
      localObject2 = ((Notification.Builder)localObject2).setOngoing(m);
      int n = flags & 0x8;
      if (n == 0) {
        break label520;
      }
      n = 1;
      localObject2 = ((Notification.Builder)localObject2).setOnlyAlertOnce(n);
      int i1 = flags & 0x10;
      if (i1 == 0) {
        break label529;
      }
      i1 = 1;
      localObject1 = ((Notification.Builder)localObject2).setAutoCancel(i1);
      i = defaults;
      localObject1 = ((Notification.Builder)localObject1).setDefaults(i).setContentTitle(paramCharSequence1).setContentText(paramCharSequence2).setSubText(paramCharSequence4).setContentInfo(paramCharSequence3).setContentIntent(paramPendingIntent1);
      localObject2 = deleteIntent;
      localObject2 = ((Notification.Builder)localObject1).setDeleteIntent((PendingIntent)localObject2);
      i2 = flags & 0x80;
      if (i2 == 0) {
        break label538;
      }
      i2 = 1;
    }
    for (;;)
    {
      localObject1 = ((Notification.Builder)localObject2).setFullScreenIntent(paramPendingIntent2, i2).setLargeIcon(paramBitmap).setNumber(paramInt1).setUsesChronometer(paramBoolean3).setPriority(paramInt4).setProgress(paramInt2, paramInt3, paramBoolean1).setLocalOnly(paramBoolean4).setExtras(paramBundle).setGroup(paramString2).setGroupSummary(paramBoolean5).setSortKey(paramString3).setCategory(paramString1).setColor(paramInt5).setVisibility(paramInt6).setPublicVersion(paramNotification2).setRemoteInputHistory(paramArrayOfCharSequence);
      a = ((Notification.Builder)localObject1);
      if (paramRemoteViews2 != null)
      {
        localObject1 = a;
        ((Notification.Builder)localObject1).setCustomContentView(paramRemoteViews2);
      }
      if (paramRemoteViews3 != null)
      {
        localObject1 = a;
        ((Notification.Builder)localObject1).setCustomBigContentView(paramRemoteViews3);
      }
      if (paramRemoteViews4 != null)
      {
        localObject1 = a;
        ((Notification.Builder)localObject1).setCustomHeadsUpContentView(paramRemoteViews4);
      }
      localObject2 = paramArrayList.iterator();
      for (;;)
      {
        bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (String)((Iterator)localObject2).next();
        Notification.Builder localBuilder = a;
        localBuilder.addPerson((String)localObject1);
      }
      boolean bool = false;
      localObject1 = null;
      break;
      label520:
      bool = false;
      localObject1 = null;
      break label201;
      label529:
      bool = false;
      localObject1 = null;
      break label227;
      label538:
      bool = false;
      localObject1 = null;
    }
  }
  
  public final Notification.Builder a()
  {
    return a;
  }
  
  public final void a(af.a parama)
  {
    Object localObject1 = new android/app/Notification$Action$Builder;
    int i = parama.a();
    Object localObject2 = parama.b();
    PendingIntent localPendingIntent = parama.c();
    ((Notification.Action.Builder)localObject1).<init>(i, (CharSequence)localObject2, localPendingIntent);
    Object localObject3 = parama.f();
    if (localObject3 != null)
    {
      localObject2 = al.a(parama.f());
      int j = localObject2.length;
      i = 0;
      localObject3 = null;
      while (i < j)
      {
        RemoteInput localRemoteInput = localObject2[i];
        ((Notification.Action.Builder)localObject1).addRemoteInput(localRemoteInput);
        i += 1;
      }
    }
    localObject3 = parama.d();
    if (localObject3 != null)
    {
      localObject3 = new android/os/Bundle;
      localObject2 = parama.d();
      ((Bundle)localObject3).<init>((Bundle)localObject2);
    }
    for (;;)
    {
      boolean bool2 = parama.e();
      ((Bundle)localObject3).putBoolean("android.support.allowGeneratedReplies", bool2);
      ((Notification.Action.Builder)localObject1).addExtras((Bundle)localObject3);
      boolean bool1 = parama.e();
      ((Notification.Action.Builder)localObject1).setAllowGeneratedReplies(bool1);
      localObject3 = a;
      localObject1 = ((Notification.Action.Builder)localObject1).build();
      ((Notification.Builder)localObject3).addAction((Notification.Action)localObject1);
      return;
      localObject3 = new android/os/Bundle;
      ((Bundle)localObject3).<init>();
    }
  }
  
  public final Notification b()
  {
    return a.build();
  }
}


/* Location:              android/support/v4/b/ae$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */