package android.support.v4.b;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

@TargetApi(20)
final class ac
{
  public static void a(Notification.Builder paramBuilder, af.a parama)
  {
    Notification.Action.Builder localBuilder = new Notification.Action.Builder(parama.a(), parama.b(), parama.c());
    if (parama.f() != null)
    {
      localObject = al.a(parama.f());
      int j = localObject.length;
      int i = 0;
      while (i < j)
      {
        localBuilder.addRemoteInput(localObject[i]);
        i += 1;
      }
    }
    if (parama.d() != null) {}
    for (Object localObject = new Bundle(parama.d());; localObject = new Bundle())
    {
      ((Bundle)localObject).putBoolean("android.support.allowGeneratedReplies", parama.e());
      localBuilder.addExtras((Bundle)localObject);
      paramBuilder.addAction(localBuilder.build());
      return;
    }
  }
  
  public static final class a
    implements aa, z
  {
    private Notification.Builder a;
    private Bundle b;
    private RemoteViews c;
    private RemoteViews d;
    
    public a(Context paramContext, Notification paramNotification, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, RemoteViews paramRemoteViews1, int paramInt1, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, Bitmap paramBitmap, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt4, CharSequence paramCharSequence4, boolean paramBoolean4, ArrayList<String> paramArrayList, Bundle paramBundle, String paramString1, boolean paramBoolean5, String paramString2, RemoteViews paramRemoteViews2, RemoteViews paramRemoteViews3)
    {
      paramContext = new Notification.Builder(paramContext).setWhen(when).setShowWhen(paramBoolean2).setSmallIcon(icon, iconLevel).setContent(contentView).setTicker(tickerText, paramRemoteViews1).setSound(sound, audioStreamType).setVibrate(vibrate).setLights(ledARGB, ledOnMS, ledOffMS);
      if ((flags & 0x2) != 0)
      {
        paramBoolean2 = true;
        paramContext = paramContext.setOngoing(paramBoolean2);
        if ((flags & 0x8) == 0) {
          break label339;
        }
        paramBoolean2 = true;
        label117:
        paramContext = paramContext.setOnlyAlertOnce(paramBoolean2);
        if ((flags & 0x10) == 0) {
          break label345;
        }
        paramBoolean2 = true;
        label137:
        paramContext = paramContext.setAutoCancel(paramBoolean2).setDefaults(defaults).setContentTitle(paramCharSequence1).setContentText(paramCharSequence2).setSubText(paramCharSequence4).setContentInfo(paramCharSequence3).setContentIntent(paramPendingIntent1).setDeleteIntent(deleteIntent);
        if ((flags & 0x80) == 0) {
          break label351;
        }
      }
      label339:
      label345:
      label351:
      for (paramBoolean2 = true;; paramBoolean2 = false)
      {
        a = paramContext.setFullScreenIntent(paramPendingIntent2, paramBoolean2).setLargeIcon(paramBitmap).setNumber(paramInt1).setUsesChronometer(paramBoolean3).setPriority(paramInt4).setProgress(paramInt2, paramInt3, paramBoolean1).setLocalOnly(paramBoolean4).setGroup(paramString1).setGroupSummary(paramBoolean5).setSortKey(paramString2);
        b = new Bundle();
        if (paramBundle != null) {
          b.putAll(paramBundle);
        }
        if ((paramArrayList != null) && (!paramArrayList.isEmpty())) {
          b.putStringArray("android.people", (String[])paramArrayList.toArray(new String[paramArrayList.size()]));
        }
        c = paramRemoteViews2;
        d = paramRemoteViews3;
        return;
        paramBoolean2 = false;
        break;
        paramBoolean2 = false;
        break label117;
        paramBoolean2 = false;
        break label137;
      }
    }
    
    public final Notification.Builder a()
    {
      return a;
    }
    
    public final void a(af.a parama)
    {
      ac.a(a, parama);
    }
    
    public final Notification b()
    {
      a.setExtras(b);
      Notification localNotification = a.build();
      if (c != null) {
        contentView = c;
      }
      if (d != null) {
        bigContentView = d;
      }
      return localNotification;
    }
  }
}


/* Location:              android/support/v4/b/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */