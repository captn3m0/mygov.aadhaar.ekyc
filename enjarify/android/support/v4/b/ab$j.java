package android.support.v4.b;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

class ab$j
  extends ab.i
{
  public Notification a(ab.d paramd)
  {
    Object localObject1 = new android/support/v4/b/ad$a;
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
    boolean bool2 = k;
    boolean bool3 = l;
    int m = j;
    CharSequence localCharSequence4 = n;
    localObject2 = paramd;
    boolean bool4 = w;
    String str1 = x;
    localObject2 = paramd;
    ArrayList localArrayList = G;
    localObject2 = paramd;
    Bundle localBundle = y;
    localObject2 = paramd;
    int n = z;
    int i1 = A;
    Notification localNotification = B;
    localObject2 = paramd;
    String str2 = s;
    localObject2 = paramd;
    boolean bool5 = t;
    String str3 = u;
    localObject2 = paramd;
    RemoteViews localRemoteViews2 = C;
    localObject2 = paramd;
    RemoteViews localRemoteViews3 = D;
    localObject2 = paramd;
    localObject2 = E;
    ((ad.a)localObject1).<init>((Context)localObject3, (Notification)localObject4, localCharSequence1, localCharSequence2, localCharSequence3, localRemoteViews1, i, localPendingIntent1, localPendingIntent2, localBitmap, j, k, bool1, bool2, bool3, m, localCharSequence4, bool4, str1, localArrayList, localBundle, n, i1, localNotification, str2, bool5, str3, localRemoteViews2, localRemoteViews3, (RemoteViews)localObject2);
    localObject2 = paramd;
    localObject3 = v;
    ab.a((z)localObject1, (ArrayList)localObject3);
    localObject3 = m;
    ab.a((aa)localObject1, (ab.q)localObject3);
    localObject1 = ab.e.a(paramd, (aa)localObject1);
    localObject3 = m;
    if (localObject3 != null)
    {
      localObject3 = m;
      localObject4 = extras;
      ((ab.q)localObject3).a((Bundle)localObject4);
    }
    return (Notification)localObject1;
  }
}


/* Location:              android/support/v4/b/ab$j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */