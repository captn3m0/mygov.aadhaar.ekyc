package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class v
  implements Handler.Callback
{
  public final a a;
  public final ArrayList<c.b> b = new ArrayList();
  public final ArrayList<c.b> c = new ArrayList();
  public final ArrayList<c.c> d = new ArrayList();
  public volatile boolean e = false;
  public final AtomicInteger f = new AtomicInteger(0);
  public boolean g = false;
  public final Handler h;
  public final Object i = new Object();
  
  public v(Looper paramLooper, a parama)
  {
    a = parama;
    h = new Handler(paramLooper, this);
  }
  
  public final void a()
  {
    e = false;
    f.incrementAndGet();
  }
  
  public final void a(c.c paramc)
  {
    c.a(paramc);
    synchronized (i)
    {
      if (d.contains(paramc))
      {
        paramc = String.valueOf(paramc);
        Log.w("GmsClientEvents", String.valueOf(paramc).length() + 67 + "registerConnectionFailedListener(): listener " + paramc + " is already registered");
        return;
      }
      d.add(paramc);
    }
  }
  
  public final boolean handleMessage(Message arg1)
  {
    if (what == 1)
    {
      c.b localb = (c.b)obj;
      synchronized (i)
      {
        if ((e) && (a.b()) && (b.contains(localb))) {
          localb.a(null);
        }
        return true;
      }
    }
    int j = what;
    Log.wtf("GmsClientEvents", 45 + "Don't know how to handle message: " + j, new Exception());
    return false;
  }
  
  public static abstract interface a
  {
    public abstract boolean b();
  }
}


/* Location:              com/google/android/gms/common/internal/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */