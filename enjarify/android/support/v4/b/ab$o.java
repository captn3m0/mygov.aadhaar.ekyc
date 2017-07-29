package android.support.v4.b;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

class ab$o
  extends ab.l
{
  public Notification a(ab.d paramd)
  {
    Object localObject1 = new android/support/v4/b/ah$a;
    Object localObject2 = paramd;
    Object localObject3 = a;
    Object localObject4 = F;
    CharSequence localCharSequence1 = b;
    CharSequence localCharSequence2 = c;
    CharSequence localCharSequence3 = h;
    RemoteViews localRemoteViews1 = f;
    int i = i;
    PendingIntent localPendingIntent1 = d;
    PendingIntent localPendingIntent2 = e;
    Bitmap localBitmap = g;
    int j = p;
    int k = q;
    boolean bool1 = r;
    boolean bool2 = l;
    int m = j;
    CharSequence localCharSequence4 = n;
    localObject2 = paramd;
    boolean bool3 = w;
    Bundle localBundle = y;
    localObject2 = paramd;
    String str1 = s;
    localObject2 = paramd;
    boolean bool4 = t;
    String str2 = u;
    localObject2 = paramd;
    RemoteViews localRemoteViews2 = C;
    localObject2 = paramd;
    localObject2 = D;
    ((ah.a)localObject1).<init>((Context)localObject3, (Notification)localObject4, localCharSequence1, localCharSequence2, localCharSequence3, localRemoteViews1, i, localPendingIntent1, localPendingIntent2, localBitmap, j, k, bool1, bool2, m, localCharSequence4, bool3, localBundle, str1, bool4, str2, localRemoteViews2, (RemoteViews)localObject2);
    localObject2 = paramd;
    localObject3 = v;
    ab.a((z)localObject1, (ArrayList)localObject3);
    localObject3 = m;
    ab.a((aa)localObject1, (ab.q)localObject3);
    localObject1 = ab.e.a(paramd, (aa)localObject1);
    localObject3 = m;
    if (localObject3 != null)
    {
      localObject2 = this;
      localObject3 = a((Notification)localObject1);
      if (localObject3 != null)
      {
        localObject2 = paramd;
        localObject4 = m;
        ((ab.q)localObject4).a((Bundle)localObject3);
      }
    }
    return (Notification)localObject1;
  }
  
  public Bundle a(Notification paramNotification)
  {
    return ah.a(paramNotification);
  }
}


/* Location:              android/support/v4/b/ab$o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */