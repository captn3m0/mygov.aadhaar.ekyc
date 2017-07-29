package android.support.v4.b;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public final class ab$d
{
  int A;
  Notification B;
  RemoteViews C;
  RemoteViews D;
  RemoteViews E;
  public Notification F;
  public ArrayList G;
  public Context a;
  public CharSequence b;
  public CharSequence c;
  public PendingIntent d;
  PendingIntent e;
  RemoteViews f;
  public Bitmap g;
  public CharSequence h;
  public int i;
  int j;
  boolean k = true;
  public boolean l;
  public ab.q m;
  public CharSequence n;
  public CharSequence[] o;
  int p;
  int q;
  boolean r;
  String s;
  boolean t;
  String u;
  public ArrayList v;
  public boolean w;
  String x;
  Bundle y;
  public int z;
  
  public ab$d(Context paramContext)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    v = ((ArrayList)localObject);
    w = false;
    z = 0;
    A = 0;
    localObject = new android/app/Notification;
    ((Notification)localObject).<init>();
    F = ((Notification)localObject);
    a = paramContext;
    localObject = F;
    long l1 = System.currentTimeMillis();
    when = l1;
    F.audioStreamType = -1;
    j = 0;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    G = ((ArrayList)localObject);
  }
  
  protected static CharSequence d(CharSequence paramCharSequence)
  {
    int i1 = 5120;
    if (paramCharSequence == null) {}
    for (;;)
    {
      return paramCharSequence;
      int i2 = paramCharSequence.length();
      if (i2 > i1)
      {
        i2 = 0;
        paramCharSequence = paramCharSequence.subSequence(0, i1);
      }
    }
  }
  
  public final d a()
  {
    Notification localNotification = F;
    int i1 = flags | 0x10;
    flags = i1;
    return this;
  }
  
  public final d a(int paramInt)
  {
    F.icon = paramInt;
    return this;
  }
  
  public final d a(Uri paramUri)
  {
    F.sound = paramUri;
    F.audioStreamType = -1;
    return this;
  }
  
  public final d a(ab.q paramq)
  {
    ab.q localq = m;
    if (localq != paramq)
    {
      m = paramq;
      localq = m;
      if (localq != null)
      {
        localq = m;
        d locald = d;
        if (locald != this)
        {
          d = this;
          locald = d;
          if (locald != null)
          {
            locald = d;
            locald.a(localq);
          }
        }
      }
    }
    return this;
  }
  
  public final d a(CharSequence paramCharSequence)
  {
    CharSequence localCharSequence = d(paramCharSequence);
    b = localCharSequence;
    return this;
  }
  
  public final Notification b()
  {
    ab.h localh = ab.a;
    new ab.e();
    return localh.a(this);
  }
  
  public final d b(CharSequence paramCharSequence)
  {
    CharSequence localCharSequence = d(paramCharSequence);
    c = localCharSequence;
    return this;
  }
  
  public final d c(CharSequence paramCharSequence)
  {
    Notification localNotification = F;
    CharSequence localCharSequence = d(paramCharSequence);
    tickerText = localCharSequence;
    return this;
  }
}


/* Location:              android/support/v4/b/ab$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */