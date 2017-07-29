package android.support.v4.b;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;

final class ab$n
  extends ab.l
{
  public final Notification a(ab.d paramd)
  {
    ag.a locala = new android/support/v4/b/ag$a;
    Context localContext = a;
    Notification localNotification = F;
    CharSequence localCharSequence1 = b;
    CharSequence localCharSequence2 = c;
    CharSequence localCharSequence3 = h;
    RemoteViews localRemoteViews = f;
    int i = i;
    PendingIntent localPendingIntent1 = d;
    PendingIntent localPendingIntent2 = e;
    Bitmap localBitmap = g;
    int j = p;
    int k = q;
    boolean bool = r;
    locala.<init>(localContext, localNotification, localCharSequence1, localCharSequence2, localCharSequence3, localRemoteViews, i, localPendingIntent1, localPendingIntent2, localBitmap, j, k, bool);
    return ab.e.a(paramd, locala);
  }
}


/* Location:              android/support/v4/b/ab$n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */