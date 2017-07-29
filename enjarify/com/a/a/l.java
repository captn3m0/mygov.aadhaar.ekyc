package com.a.a;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;

public abstract class l
  implements Comparable
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
    boolean bool = t.a.a;
    Object localObject;
    int n;
    if (bool)
    {
      localObject = new com/a/a/t$a;
      ((t.a)localObject).<init>();
      l = ((t.a)localObject);
      g = m;
      h = false;
      i = false;
      k = null;
      a = m;
      b = paramString;
      d = parama;
      localObject = new com/a/a/d;
      ((d)localObject).<init>();
      j = ((p)localObject);
      bool = TextUtils.isEmpty(paramString);
      if (bool) {
        break label140;
      }
      localObject = Uri.parse(paramString);
      if (localObject == null) {
        break label140;
      }
      localObject = ((Uri)localObject).getHost();
      if (localObject == null) {
        break label140;
      }
      n = ((String)localObject).hashCode();
    }
    for (;;)
    {
      c = n;
      return;
      n = 0;
      localObject = null;
      break;
      label140:
      n = 0;
      localObject = null;
    }
  }
  
  protected static s a(s params)
  {
    return params;
  }
  
  public abstract n a(i parami);
  
  public Map a()
  {
    return Collections.emptyMap();
  }
  
  public abstract void a(Object paramObject);
  
  public final void a(String paramString)
  {
    boolean bool = t.a.a;
    if (bool)
    {
      t.a locala = l;
      Thread localThread = Thread.currentThread();
      long l1 = localThread.getId();
      locala.a(paramString, l1);
    }
  }
  
  public String b()
  {
    return d();
  }
  
  final void b(String paramString)
  {
    Object localObject1 = f;
    Object localObject6;
    boolean bool2;
    if (localObject1 != null)
    {
      localObject6 = f;
      synchronized (b)
      {
        localObject1 = b;
        ((Set)localObject1).remove(this);
        synchronized (d)
        {
          localObject1 = d;
          localObject1 = ((List)localObject1).iterator();
          boolean bool1 = ((Iterator)localObject1).hasNext();
          if (bool1) {
            ((Iterator)localObject1).next();
          }
        }
      }
      bool2 = g;
      if (!bool2) {}
    }
    for (;;)
    {
      long l1;
      synchronized (a)
      {
        Object localObject8 = b;
        Object localObject4 = a;
        localObject4 = ((Map)localObject4).remove(localObject8);
        localObject4 = (Queue)localObject4;
        if (localObject4 != null)
        {
          boolean bool3 = t.b;
          if (bool3)
          {
            String str = "Releasing %d waiting requests for cacheKey=%s.";
            int m = 2;
            Object[] arrayOfObject = new Object[m];
            int n = 0;
            int i1 = ((Queue)localObject4).size();
            Integer localInteger = Integer.valueOf(i1);
            arrayOfObject[0] = localInteger;
            n = 1;
            arrayOfObject[n] = localObject8;
            t.a(str, arrayOfObject);
          }
          localObject6 = c;
          ((PriorityBlockingQueue)localObject6).addAll((Collection)localObject4);
        }
        bool2 = t.a.a;
        if (bool2)
        {
          localObject4 = Thread.currentThread();
          l1 = ((Thread)localObject4).getId();
          ??? = Looper.myLooper();
          localObject8 = Looper.getMainLooper();
          if (??? != localObject8)
          {
            ??? = new android/os/Handler;
            localObject8 = Looper.getMainLooper();
            ((Handler)???).<init>((Looper)localObject8);
            localObject8 = new com/a/a/l$1;
            ((l.1)localObject8).<init>(this, paramString, l1);
            ((Handler)???).post((Runnable)localObject8);
          }
        }
        else
        {
          return;
        }
      }
      ??? = l;
      ((t.a)???).a(paramString, l1);
      t.a locala = l;
      localObject6 = toString();
      locala.a((String)localObject6);
    }
  }
  
  public byte[] c()
  {
    return null;
  }
  
  public String d()
  {
    String str1 = "application/x-www-form-urlencoded; charset=";
    String str2 = String.valueOf("UTF-8");
    int m = str2.length();
    if (m != 0) {
      str2 = str1.concat(str2);
    }
    for (;;)
    {
      return str2;
      str2 = new java/lang/String;
      str2.<init>(str1);
    }
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
    String str1 = "0x";
    int m = c;
    String str2 = String.valueOf(Integer.toHexString(m));
    int n = str2.length();
    if (n != 0)
    {
      str2 = str1.concat(str2);
      boolean bool = h;
      if (!bool) {
        break label229;
      }
    }
    label229:
    for (str1 = "[X] ";; str1 = "[ ] ")
    {
      str1 = String.valueOf(String.valueOf(str1));
      String str3 = String.valueOf(String.valueOf(b));
      str2 = String.valueOf(String.valueOf(str2));
      String str4 = String.valueOf(String.valueOf(l.a.b));
      String str5 = String.valueOf(String.valueOf(e));
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      int i1 = str1.length() + 3;
      int i2 = str3.length();
      i1 += i2;
      i2 = str2.length();
      i1 += i2;
      i2 = str4.length();
      i1 += i2;
      i2 = str5.length();
      i1 += i2;
      localStringBuilder.<init>(i1);
      return str1 + str3 + " " + str2 + " " + str4 + " " + str5;
      str2 = new java/lang/String;
      str2.<init>(str1);
      break;
    }
  }
}


/* Location:              com/a/a/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */