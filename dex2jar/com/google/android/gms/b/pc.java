package com.google.android.gms.b;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;

public abstract class pc<T>
  implements Comparable<pc<T>>
{
  final int a;
  final String b;
  final int c;
  final re.a d;
  Integer e;
  qd f;
  boolean g;
  boolean h;
  te i;
  dz.a j;
  private final vs.a k;
  private boolean l;
  private boolean m;
  
  public pc(String paramString, re.a parama)
  {
    vs.a locala;
    if (vs.a.a)
    {
      locala = new vs.a();
      k = locala;
      g = true;
      l = false;
      h = false;
      m = false;
      j = null;
      a = 0;
      b = paramString;
      d = parama;
      i = new ie();
      if (TextUtils.isEmpty(paramString)) {
        break label118;
      }
      paramString = Uri.parse(paramString);
      if (paramString == null) {
        break label118;
      }
      paramString = paramString.getHost();
      if (paramString == null) {
        break label118;
      }
    }
    label118:
    for (int n = paramString.hashCode();; n = 0)
    {
      c = n;
      return;
      locala = null;
      break;
    }
  }
  
  protected static vr a(vr paramvr)
  {
    return paramvr;
  }
  
  public static String b()
  {
    return "application/x-www-form-urlencoded; charset=UTF-8";
  }
  
  protected abstract re<T> a(na paramna);
  
  public Map<String, String> a()
  {
    return Collections.emptyMap();
  }
  
  protected abstract void a(T paramT);
  
  public final void a(String paramString)
  {
    if (vs.a.a) {
      k.a(paramString, Thread.currentThread().getId());
    }
  }
  
  final void b(final String paramString)
  {
    qd localqd;
    Object localObject2;
    if (f != null)
    {
      localqd = f;
      synchronized (b)
      {
        b.remove(this);
        synchronized (d)
        {
          localObject2 = d.iterator();
          if (((Iterator)localObject2).hasNext()) {
            ((Iterator)localObject2).next();
          }
        }
      }
      if (!g) {}
    }
    final long l1;
    synchronized (a)
    {
      localObject2 = b;
      Queue localQueue = (Queue)a.remove(localObject2);
      if (localQueue != null)
      {
        if (vs.b) {
          vs.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] { Integer.valueOf(localQueue.size()), localObject2 });
        }
        c.addAll(localQueue);
      }
      if (vs.a.a)
      {
        l1 = Thread.currentThread().getId();
        if (Looper.myLooper() != Looper.getMainLooper()) {
          new Handler(Looper.getMainLooper()).post(new Runnable()
          {
            public final void run()
            {
              pc.a(pc.this).a(paramString, l1);
              pc.a(pc.this).a(toString());
            }
          });
        }
      }
      else
      {
        return;
      }
    }
    k.a(paramString, l1);
    k.a(toString());
  }
  
  public byte[] c()
  {
    return null;
  }
  
  public final int d()
  {
    return i.a();
  }
  
  public String toString()
  {
    String str = "0x" + Integer.toHexString(c);
    return "[ ] " + b + " " + str + " " + a.b + " " + e;
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              com/google/android/gms/b/pc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */