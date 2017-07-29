package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class km
{
  public boolean a;
  public final Object b;
  public String c;
  kk d;
  km e;
  private final List f;
  private final Map g;
  
  public km(boolean paramBoolean, String paramString1, String paramString2)
  {
    Object localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    f = ((List)localObject);
    localObject = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject).<init>();
    g = ((Map)localObject);
    localObject = new java/lang/Object;
    localObject.<init>();
    b = localObject;
    a = paramBoolean;
    g.put("action", paramString1);
    g.put("ad_format", paramString2);
  }
  
  public final kk a()
  {
    long l = w.k().b();
    return a(l);
  }
  
  public final kk a(long paramLong)
  {
    Object localObject = null;
    boolean bool = a;
    if (!bool) {}
    for (;;)
    {
      return (kk)localObject;
      kk localkk = new com/google/android/gms/b/kk;
      localkk.<init>(paramLong, null, null);
      localObject = localkk;
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    boolean bool = a;
    if (bool)
    {
      bool = TextUtils.isEmpty(paramString2);
      if (!bool) {
        break label19;
      }
    }
    for (;;)
    {
      return;
      label19:
      Object localObject1 = w.i().e();
      if (localObject1 == null) {
        continue;
      }
      synchronized (b)
      {
        kj localkj = ((kg)localObject1).a(paramString1);
        Map localMap = g;
        localObject1 = localMap.get(paramString1);
        localObject1 = (String)localObject1;
        localObject1 = localkj.a((String)localObject1, paramString2);
        localMap.put(paramString1, localObject1);
      }
    }
  }
  
  public final boolean a(kk paramkk, long paramLong, String... paramVarArgs)
  {
    synchronized (b)
    {
      int i = paramVarArgs.length;
      int j = 0;
      Object localObject2 = null;
      while (j < i)
      {
        Object localObject4 = paramVarArgs[j];
        kk localkk = new com/google/android/gms/b/kk;
        localkk.<init>(paramLong, (String)localObject4, paramkk);
        localObject4 = f;
        ((List)localObject4).add(localkk);
        j += 1;
      }
      j = 1;
      return j;
    }
  }
  
  public final boolean a(kk paramkk, String... paramVarArgs)
  {
    boolean bool = a;
    c localc;
    if ((!bool) || (paramkk == null))
    {
      bool = false;
      localc = null;
    }
    for (;;)
    {
      return bool;
      localc = w.k();
      long l = localc.b();
      bool = a(paramkk, l, paramVarArgs);
    }
  }
  
  public final String b()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    synchronized (b)
    {
      Object localObject2 = f;
      Iterator localIterator = ((List)localObject2).iterator();
      long l1;
      String str;
      boolean bool2;
      do
      {
        do
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject2 = localIterator.next();
          localObject2 = (kk)localObject2;
          l1 = a;
          str = b;
          localObject2 = c;
        } while (localObject2 == null);
        l2 = 0L;
        bool2 = l1 < l2;
      } while (!bool2);
      long l2 = a;
      l1 -= l2;
      localObject2 = localStringBuilder.append(str);
      char c1 = '.';
      localObject2 = ((StringBuilder)localObject2).append(c1);
      localObject2 = ((StringBuilder)localObject2).append(l1);
      char c2 = ',';
      ((StringBuilder)localObject2).append(c2);
    }
    Object localObject4 = f;
    ((List)localObject4).clear();
    localObject4 = c;
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject4);
    if (!bool1)
    {
      localObject4 = c;
      localStringBuilder.append((String)localObject4);
    }
    for (;;)
    {
      localObject4 = localStringBuilder.toString();
      return (String)localObject4;
      int i = localStringBuilder.length();
      if (i > 0)
      {
        i = localStringBuilder.length() + -1;
        localStringBuilder.setLength(i);
      }
    }
  }
  
  final Map c()
  {
    synchronized (b)
    {
      Object localObject2 = w.i();
      localObject2 = ((tj)localObject2).e();
      if (localObject2 != null)
      {
        localObject4 = e;
        if (localObject4 != null) {}
      }
      else
      {
        localObject2 = g;
        return (Map)localObject2;
      }
      Object localObject4 = g;
      Object localObject5 = e;
      localObject5 = ((km)localObject5).c();
      localObject2 = ((kg)localObject2).a((Map)localObject4, (Map)localObject5);
    }
  }
  
  public final kk d()
  {
    synchronized (b)
    {
      kk localkk = d;
      return localkk;
    }
  }
}


/* Location:              com/google/android/gms/b/km.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */