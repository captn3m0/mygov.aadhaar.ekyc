package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@qi
public final class km
{
  public boolean a;
  public final Object b = new Object();
  public String c;
  kk d;
  km e;
  private final List<kk> f = new LinkedList();
  private final Map<String, String> g = new LinkedHashMap();
  
  public km(boolean paramBoolean, String paramString1, String paramString2)
  {
    a = paramBoolean;
    g.put("action", paramString1);
    g.put("ad_format", paramString2);
  }
  
  public final kk a()
  {
    return a(w.k().b());
  }
  
  public final kk a(long paramLong)
  {
    if (!a) {
      return null;
    }
    return new kk(paramLong, null, null);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    if ((!a) || (TextUtils.isEmpty(paramString2))) {}
    Object localObject2;
    do
    {
      return;
      localObject2 = w.i().e();
    } while (localObject2 == null);
    synchronized (b)
    {
      localObject2 = ((kg)localObject2).a(paramString1);
      Map localMap = g;
      localMap.put(paramString1, ((kj)localObject2).a((String)localMap.get(paramString1), paramString2));
      return;
    }
  }
  
  public final boolean a(kk paramkk, long paramLong, String... paramVarArgs)
  {
    synchronized (b)
    {
      int j = paramVarArgs.length;
      int i = 0;
      while (i < j)
      {
        kk localkk = new kk(paramLong, paramVarArgs[i], paramkk);
        f.add(localkk);
        i += 1;
      }
      return true;
    }
  }
  
  public final boolean a(kk paramkk, String... paramVarArgs)
  {
    if ((!a) || (paramkk == null)) {
      return false;
    }
    return a(paramkk, w.k().b(), paramVarArgs);
  }
  
  public final String b()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    synchronized (b)
    {
      Iterator localIterator = f.iterator();
      while (localIterator.hasNext())
      {
        kk localkk = (kk)localIterator.next();
        long l1 = a;
        String str2 = b;
        localkk = c;
        if ((localkk != null) && (l1 > 0L))
        {
          long l2 = a;
          localStringBuilder.append(str2).append('.').append(l1 - l2).append(',');
        }
      }
    }
    f.clear();
    if (!TextUtils.isEmpty(c)) {
      ((StringBuilder)localObject2).append(c);
    }
    for (;;)
    {
      String str1 = ((StringBuilder)localObject2).toString();
      return str1;
      if (str1.length() > 0) {
        str1.setLength(str1.length() - 1);
      }
    }
  }
  
  final Map<String, String> c()
  {
    synchronized (b)
    {
      Object localObject2 = w.i().e();
      if ((localObject2 == null) || (e == null))
      {
        localObject2 = g;
        return (Map<String, String>)localObject2;
      }
      localObject2 = ((kg)localObject2).a(g, e.c());
      return (Map<String, String>)localObject2;
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */