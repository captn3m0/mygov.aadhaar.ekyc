package com.a.a;

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

public abstract class l<T>
  implements Comparable<l<T>>
{
  public final int a;
  public final String b;
  final int c;
  final n.a d;
  Integer e;
  m f;
  public boolean g;
  boolean h;
  boolean i;
  public p j;
  public b.a k;
  private final t.a l;
  
  public l(String paramString, n.a parama)
  {
    t.a locala;
    if (t.a.a)
    {
      locala = new t.a();
      l = locala;
      g = true;
      h = false;
      i = false;
      k = null;
      a = 1;
      b = paramString;
      d = parama;
      j = new d();
      if (TextUtils.isEmpty(paramString)) {
        break label113;
      }
      paramString = Uri.parse(paramString);
      if (paramString == null) {
        break label113;
      }
      paramString = paramString.getHost();
      if (paramString == null) {
        break label113;
      }
    }
    label113:
    for (int m = paramString.hashCode();; m = 0)
    {
      c = m;
      return;
      locala = null;
      break;
    }
  }
  
  protected static s a(s params)
  {
    return params;
  }
  
  public abstract n<T> a(i parami);
  
  public Map<String, String> a()
  {
    return Collections.emptyMap();
  }
  
  public abstract void a(T paramT);
  
  public final void a(String paramString)
  {
    if (t.a.a) {
      l.a(paramString, Thread.currentThread().getId());
    }
  }
  
  @Deprecated
  public String b()
  {
    return d();
  }
  
  final void b(final String paramString)
  {
    m localm;
    Object localObject2;
    if (f != null)
    {
      localm = f;
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
        if (t.b) {
          t.a("Releasing %d waiting requests for cacheKey=%s.", new Object[] { Integer.valueOf(localQueue.size()), localObject2 });
        }
        c.addAll(localQueue);
      }
      if (t.a.a)
      {
        l1 = Thread.currentThread().getId();
        if (Looper.myLooper() != Looper.getMainLooper()) {
          new Handler(Looper.getMainLooper()).post(new Runnable()
          {
            public final void run()
            {
              l.a(l.this).a(paramString, l1);
              l.a(l.this).a(toString());
            }
          });
        }
      }
      else
      {
        return;
      }
    }
    l.a(paramString, l1);
    l.a(toString());
  }
  
  @Deprecated
  public byte[] c()
  {
    return null;
  }
  
  public String d()
  {
    String str = String.valueOf("UTF-8");
    if (str.length() != 0) {
      return "application/x-www-form-urlencoded; charset=".concat(str);
    }
    return new String("application/x-www-form-urlencoded; charset=");
  }
  
  public byte[] e()
  {
    return null;
  }
  
  public final int f()
  {
    return j.a();
  }
  
  public String toString()
  {
    String str1 = String.valueOf(Integer.toHexString(c));
    if (str1.length() != 0)
    {
      str1 = "0x".concat(str1);
      if (!h) {
        break label177;
      }
    }
    label177:
    for (String str2 = "[X] ";; str2 = "[ ] ")
    {
      str2 = String.valueOf(String.valueOf(str2));
      String str3 = String.valueOf(String.valueOf(b));
      str1 = String.valueOf(String.valueOf(str1));
      String str4 = String.valueOf(String.valueOf(a.b));
      String str5 = String.valueOf(String.valueOf(e));
      return str2.length() + 3 + str3.length() + str1.length() + str4.length() + str5.length() + str2 + str3 + " " + str1 + " " + str4 + " " + str5;
      str1 = new String("0x");
      break;
    }
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:              com/a/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */