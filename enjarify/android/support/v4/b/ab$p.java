package android.support.v4.b;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

class ab$p
  extends ab.o
{
  public Notification a(ab.d paramd)
  {
    ai.a locala = new android/support/v4/b/ai$a;
    Object localObject1 = paramd;
    Object localObject2 = a;
    Notification localNotification = F;
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
    localObject1 = paramd;
    boolean bool4 = w;
    ArrayList localArrayList = G;
    localObject1 = paramd;
    Bundle localBundle = y;
    localObject1 = paramd;
    String str1 = s;
    localObject1 = paramd;
    boolean bool5 = t;
    String str2 = u;
    localObject1 = paramd;
    RemoteViews localRemoteViews2 = C;
    localObject1 = paramd;
    localObject1 = D;
    locala.<init>((Context)localObject2, localNotification, localCharSequence1, localCharSequence2, localCharSequence3, localRemoteViews1, i, localPendingIntent1, localPendingIntent2, localBitmap, j, k, bool1, bool2, bool3, m, localCharSequence4, bool4, localArrayList, localBundle, str1, bool5, str2, localRemoteViews2, (RemoteViews)localObject1);
    localObject1 = paramd;
    localObject2 = v;
    ab.a(locala, (ArrayList)localObject2);
    localObject2 = m;
    ab.a(locala, (ab.q)localObject2);
    return ab.e.a(paramd, locala);
  }
  
  public final Bundle a(Notification paramNotification)
  {
    return extras;
  }
}


/* Location:              android/support/v4/b/ab$p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */