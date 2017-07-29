package com.google.android.gms.b;

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

public abstract class pc
  implements Comparable
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
    boolean bool = vs.a.a;
    Object localObject;
    int n;
    if (bool)
    {
      localObject = new com/google/android/gms/b/vs$a;
      ((vs.a)localObject).<init>();
      k = ((vs.a)localObject);
      g = true;
      l = false;
      h = false;
      m = false;
      j = null;
      a = 0;
      b = paramString;
      d = parama;
      localObject = new com/google/android/gms/b/ie;
      ((ie)localObject).<init>();
      i = ((te)localObject);
      bool = TextUtils.isEmpty(paramString);
      if (bool) {
        break label136;
      }
      localObject = Uri.parse(paramString);
      if (localObject == null) {
        break label136;
      }
      localObject = ((Uri)localObject).getHost();
      if (localObject == null) {
        break label136;
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
      label136:
      n = 0;
      localObject = null;
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
  
  protected abstract re a(na paramna);
  
  public Map a()
  {
    return Collections.emptyMap();
  }
  
  protected abstract void a(Object paramObject);
  
  public final void a(String paramString)
  {
    boolean bool = vs.a.a;
    if (bool)
    {
      vs.a locala = k;
      Thread localThread = Thread.currentThread();
      long l1 = localThread.getId();
      locala.a(paramString, l1);
    }
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
          boolean bool3 = vs.b;
          if (bool3)
          {
            String str = "Releasing %d waiting requests for cacheKey=%s.";
            int n = 2;
            Object[] arrayOfObject = new Object[n];
            int i1 = 0;
            int i2 = ((Queue)localObject4).size();
            Integer localInteger = Integer.valueOf(i2);
            arrayOfObject[0] = localInteger;
            i1 = 1;
            arrayOfObject[i1] = localObject8;
            vs.a(str, arrayOfObject);
          }
          localObject6 = c;
          ((PriorityBlockingQueue)localObject6).addAll((Collection)localObject4);
        }
        bool2 = vs.a.a;
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
            localObject8 = new com/google/android/gms/b/pc$1;
            ((pc.1)localObject8).<init>(this, paramString, l1);
            ((Handler)???).post((Runnable)localObject8);
          }
        }
        else
        {
          return;
        }
      }
      ??? = k;
      ((vs.a)???).a(paramString, l1);
      vs.a locala = k;
      localObject6 = toString();
      locala.a((String)localObject6);
    }
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
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>("0x");
    Object localObject2 = Integer.toHexString(c);
    localObject1 = (String)localObject2;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("[ ] ");
    String str = b;
    localObject1 = ((StringBuilder)localObject2).append(str).append(" ").append((String)localObject1).append(" ");
    localObject2 = pc.a.b;
    localObject1 = ((StringBuilder)localObject1).append(localObject2).append(" ");
    localObject2 = e;
    return (String)localObject2;
  }
}


/* Location:              com/google/android/gms/b/pc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */