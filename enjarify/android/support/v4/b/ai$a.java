package android.support.v4.b;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

public final class ai$a
  implements aa, z
{
  private Notification.Builder a;
  private Bundle b;
  private List c;
  private RemoteViews d;
  private RemoteViews e;
  
  public ai$a(Context paramContext, Notification paramNotification, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, RemoteViews paramRemoteViews1, int paramInt1, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, Bitmap paramBitmap, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt4, CharSequence paramCharSequence4, boolean paramBoolean4, ArrayList paramArrayList, Bundle paramBundle, String paramString1, boolean paramBoolean5, String paramString2, RemoteViews paramRemoteViews2, RemoteViews paramRemoteViews3)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    c = ((List)localObject1);
    localObject1 = new android/app/Notification$Builder;
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
    label217:
    label243:
    label324:
    int i3;
    boolean bool1;
    if (m != 0)
    {
      m = 1;
      localObject2 = ((Notification.Builder)localObject2).setOngoing(m);
      int n = flags & 0x8;
      if (n == 0) {
        break label590;
      }
      n = 1;
      localObject2 = ((Notification.Builder)localObject2).setOnlyAlertOnce(n);
      int i1 = flags & 0x10;
      if (i1 == 0) {
        break label599;
      }
      i1 = 1;
      localObject1 = ((Notification.Builder)localObject2).setAutoCancel(i1);
      i = defaults;
      localObject1 = ((Notification.Builder)localObject1).setDefaults(i).setContentTitle(paramCharSequence1).setContentText(paramCharSequence2).setSubText(paramCharSequence4).setContentInfo(paramCharSequence3).setContentIntent(paramPendingIntent1);
      localObject2 = deleteIntent;
      localObject2 = ((Notification.Builder)localObject1).setDeleteIntent((PendingIntent)localObject2);
      int i2 = flags & 0x80;
      if (i2 == 0) {
        break label608;
      }
      i2 = 1;
      localObject1 = ((Notification.Builder)localObject2).setFullScreenIntent(paramPendingIntent2, i2).setLargeIcon(paramBitmap).setNumber(paramInt1).setUsesChronometer(paramBoolean3).setPriority(paramInt4).setProgress(paramInt2, paramInt3, paramBoolean1);
      a = ((Notification.Builder)localObject1);
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
      b = ((Bundle)localObject1);
      if (paramBundle != null)
      {
        localObject1 = b;
        ((Bundle)localObject1).putAll(paramBundle);
      }
      if (paramArrayList != null)
      {
        boolean bool2 = paramArrayList.isEmpty();
        if (!bool2)
        {
          localObject2 = b;
          String str = "android.people";
          i3 = paramArrayList.size();
          localObject1 = new String[i3];
          localObject1 = (String[])paramArrayList.toArray((Object[])localObject1);
          ((Bundle)localObject2).putStringArray(str, (String[])localObject1);
        }
      }
      if (paramBoolean4)
      {
        localObject1 = b;
        localObject2 = "android.support.localOnly";
        j = 1;
        ((Bundle)localObject1).putBoolean((String)localObject2, j);
      }
      if (paramString1 != null)
      {
        localObject1 = b;
        localObject2 = "android.support.groupKey";
        ((Bundle)localObject1).putString((String)localObject2, paramString1);
        if (!paramBoolean5) {
          break label617;
        }
        localObject1 = b;
        localObject2 = "android.support.isGroupSummary";
        bool1 = true;
        ((Bundle)localObject1).putBoolean((String)localObject2, bool1);
      }
    }
    for (;;)
    {
      if (paramString2 != null)
      {
        localObject1 = b;
        localObject2 = "android.support.sortKey";
        ((Bundle)localObject1).putString((String)localObject2, paramString2);
      }
      d = paramRemoteViews2;
      e = paramRemoteViews3;
      return;
      i3 = 0;
      localObject1 = null;
      break;
      label590:
      i3 = 0;
      localObject1 = null;
      break label217;
      label599:
      i3 = 0;
      localObject1 = null;
      break label243;
      label608:
      i3 = 0;
      localObject1 = null;
      break label324;
      label617:
      localObject1 = b;
      localObject2 = "android.support.useSideChannel";
      bool1 = true;
      ((Bundle)localObject1).putBoolean((String)localObject2, bool1);
    }
  }
  
  public final Notification.Builder a()
  {
    return a;
  }
  
  public final void a(af.a parama)
  {
    List localList = c;
    Bundle localBundle = ah.a(a, parama);
    localList.add(localBundle);
  }
  
  public final Notification b()
  {
    Object localObject1 = ah.a(c);
    if (localObject1 != null)
    {
      localObject2 = b;
      String str = "android.support.actionExtras";
      ((Bundle)localObject2).putSparseParcelableArray(str, (SparseArray)localObject1);
    }
    localObject1 = a;
    Object localObject2 = b;
    ((Notification.Builder)localObject1).setExtras((Bundle)localObject2);
    localObject1 = a.build();
    localObject2 = d;
    if (localObject2 != null)
    {
      localObject2 = d;
      contentView = ((RemoteViews)localObject2);
    }
    localObject2 = e;
    if (localObject2 != null)
    {
      localObject2 = e;
      bigContentView = ((RemoteViews)localObject2);
    }
    return (Notification)localObject1;
  }
}


/* Location:              android/support/v4/b/ai$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */