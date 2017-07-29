package android.support.v4.b;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.Notification.MessagingStyle;
import android.app.Notification.MessagingStyle.Message;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(24)
final class ae
{
  public static void a(aa paramaa, CharSequence paramCharSequence1, CharSequence paramCharSequence2, List<CharSequence> paramList1, List<Long> paramList, List<CharSequence> paramList2, List<String> paramList3, List<Uri> paramList4)
  {
    paramCharSequence1 = new Notification.MessagingStyle(paramCharSequence1).setConversationTitle(paramCharSequence2);
    int i = 0;
    while (i < paramList1.size())
    {
      paramCharSequence2 = new Notification.MessagingStyle.Message((CharSequence)paramList1.get(i), ((Long)paramList.get(i)).longValue(), (CharSequence)paramList2.get(i));
      if (paramList3.get(i) != null) {
        paramCharSequence2.setData((String)paramList3.get(i), (Uri)paramList4.get(i));
      }
      paramCharSequence1.addMessage(paramCharSequence2);
      i += 1;
    }
    paramCharSequence1.setBuilder(paramaa.a());
  }
  
  public static final class a
    implements aa, z
  {
    private Notification.Builder a;
    
    public a(Context paramContext, Notification paramNotification1, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, RemoteViews paramRemoteViews1, int paramInt1, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, Bitmap paramBitmap, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt4, CharSequence paramCharSequence4, boolean paramBoolean4, String paramString1, ArrayList<String> paramArrayList, Bundle paramBundle, int paramInt5, int paramInt6, Notification paramNotification2, String paramString2, boolean paramBoolean5, String paramString3, CharSequence[] paramArrayOfCharSequence, RemoteViews paramRemoteViews2, RemoteViews paramRemoteViews3, RemoteViews paramRemoteViews4)
    {
      paramContext = new Notification.Builder(paramContext).setWhen(when).setShowWhen(paramBoolean2).setSmallIcon(icon, iconLevel).setContent(contentView).setTicker(tickerText, paramRemoteViews1).setSound(sound, audioStreamType).setVibrate(vibrate).setLights(ledARGB, ledOnMS, ledOffMS);
      if ((flags & 0x2) != 0)
      {
        paramBoolean2 = true;
        paramContext = paramContext.setOngoing(paramBoolean2);
        if ((flags & 0x8) == 0) {
          break label375;
        }
        paramBoolean2 = true;
        label117:
        paramContext = paramContext.setOnlyAlertOnce(paramBoolean2);
        if ((flags & 0x10) == 0) {
          break label381;
        }
        paramBoolean2 = true;
        label137:
        paramContext = paramContext.setAutoCancel(paramBoolean2).setDefaults(defaults).setContentTitle(paramCharSequence1).setContentText(paramCharSequence2).setSubText(paramCharSequence4).setContentInfo(paramCharSequence3).setContentIntent(paramPendingIntent1).setDeleteIntent(deleteIntent);
        if ((flags & 0x80) == 0) {
          break label387;
        }
      }
      label375:
      label381:
      label387:
      for (paramBoolean2 = true;; paramBoolean2 = false)
      {
        a = paramContext.setFullScreenIntent(paramPendingIntent2, paramBoolean2).setLargeIcon(paramBitmap).setNumber(paramInt1).setUsesChronometer(paramBoolean3).setPriority(paramInt4).setProgress(paramInt2, paramInt3, paramBoolean1).setLocalOnly(paramBoolean4).setExtras(paramBundle).setGroup(paramString2).setGroupSummary(paramBoolean5).setSortKey(paramString3).setCategory(paramString1).setColor(paramInt5).setVisibility(paramInt6).setPublicVersion(paramNotification2).setRemoteInputHistory(paramArrayOfCharSequence);
        if (paramRemoteViews2 != null) {
          a.setCustomContentView(paramRemoteViews2);
        }
        if (paramRemoteViews3 != null) {
          a.setCustomBigContentView(paramRemoteViews3);
        }
        if (paramRemoteViews4 != null) {
          a.setCustomHeadsUpContentView(paramRemoteViews4);
        }
        paramContext = paramArrayList.iterator();
        while (paramContext.hasNext())
        {
          paramNotification1 = (String)paramContext.next();
          a.addPerson(paramNotification1);
        }
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
        localBuilder.setAllowGeneratedReplies(parama.e());
        a.addAction(localBuilder.build());
        return;
      }
    }
    
    public final Notification b()
    {
      return a.build();
    }
  }
}


/* Location:              android/support/v4/b/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */