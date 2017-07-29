package com.google.android.gms.b;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.g.a;
import com.google.android.gms.common.util.c;
import com.google.android.gms.measurement.AppMeasurement.f;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class by
  extends de
{
  private final Map a;
  private final Map b;
  private long c;
  
  public by(dc paramdc)
  {
    super(paramdc);
    a locala = new android/support/v4/g/a;
    locala.<init>();
    b = locala;
    locala = new android/support/v4/g/a;
    locala.<init>();
    a = locala;
  }
  
  private void a(long paramLong, AppMeasurement.f paramf)
  {
    Object localObject1;
    Object localObject2;
    if (paramf == null)
    {
      localObject1 = ug;
      localObject2 = "Not logging ad exposure. No active activity";
      ((cu.a)localObject1).a((String)localObject2);
    }
    for (;;)
    {
      return;
      long l = 1000L;
      boolean bool = paramLong < l;
      Object localObject3;
      if (bool)
      {
        localObject1 = ug;
        localObject2 = "Not logging ad exposure. Less than 1000 ms. exposure";
        localObject3 = Long.valueOf(paramLong);
        ((cu.a)localObject1).a((String)localObject2, localObject3);
      }
      else
      {
        localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
        ((Bundle)localObject1).putLong("_xt", paramLong);
        di.a(paramf, (Bundle)localObject1);
        localObject2 = super.h();
        localObject3 = "am";
        String str = "_xa";
        ((dh)localObject2).b((String)localObject3, str, (Bundle)localObject1);
      }
    }
  }
  
  private void a(String paramString, long paramLong, AppMeasurement.f paramf)
  {
    Object localObject1;
    Object localObject2;
    if (paramf == null)
    {
      localObject1 = ug;
      localObject2 = "Not logging ad unit exposure. No active activity";
      ((cu.a)localObject1).a((String)localObject2);
    }
    for (;;)
    {
      return;
      long l = 1000L;
      boolean bool = paramLong < l;
      Object localObject3;
      if (bool)
      {
        localObject1 = ug;
        localObject2 = "Not logging ad unit exposure. Less than 1000 ms. exposure";
        localObject3 = Long.valueOf(paramLong);
        ((cu.a)localObject1).a((String)localObject2, localObject3);
      }
      else
      {
        localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
        ((Bundle)localObject1).putString("_ai", paramString);
        ((Bundle)localObject1).putLong("_xt", paramLong);
        di.a(paramf, (Bundle)localObject1);
        localObject2 = super.h();
        localObject3 = "am";
        String str = "_xu";
        ((dh)localObject2).b((String)localObject3, str, (Bundle)localObject1);
      }
    }
  }
  
  public final void a()
  {
    long l = super.m().b();
    db localdb = super.t();
    by.3 local3 = new com/google/android/gms/b/by$3;
    local3.<init>(this, l);
    localdb.a(local3);
  }
  
  public final void a(long paramLong)
  {
    di.a locala = super.l().x();
    Object localObject = a.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      Long localLong = (Long)a.get(localObject);
      long l1 = localLong.longValue();
      l1 = paramLong - l1;
      a((String)localObject, l1, locala);
    }
    localObject = a;
    boolean bool = ((Map)localObject).isEmpty();
    if (!bool)
    {
      long l2 = c;
      l2 = paramLong - l2;
      a(l2, locala);
    }
    b(paramLong);
  }
  
  public final void a(String paramString)
  {
    int i = Build.VERSION.SDK_INT;
    Object localObject;
    if (paramString != null)
    {
      i = paramString.length();
      if (i != 0) {}
    }
    else
    {
      localObject = ua;
      String str = "Ad unit id must be a non-empty string";
      ((cu.a)localObject).a(str);
    }
    for (;;)
    {
      return;
      localObject = super.m();
      long l = ((c)localObject).b();
      db localdb = super.t();
      by.1 local1 = new com/google/android/gms/b/by$1;
      local1.<init>(this, paramString, l);
      localdb.a(local1);
    }
  }
  
  final void b(long paramLong)
  {
    Object localObject = a.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      Map localMap = a;
      Long localLong = Long.valueOf(paramLong);
      localMap.put(localObject, localLong);
    }
    localObject = a;
    boolean bool = ((Map)localObject).isEmpty();
    if (!bool) {
      c = paramLong;
    }
  }
  
  public final void b(String paramString)
  {
    int i = Build.VERSION.SDK_INT;
    Object localObject;
    if (paramString != null)
    {
      i = paramString.length();
      if (i != 0) {}
    }
    else
    {
      localObject = ua;
      String str = "Ad unit id must be a non-empty string";
      ((cu.a)localObject).a(str);
    }
    for (;;)
    {
      return;
      localObject = super.m();
      long l = ((c)localObject).b();
      db localdb = super.t();
      by.2 local2 = new com/google/android/gms/b/by$2;
      local2.<init>(this, paramString, l);
      localdb.a(local2);
    }
  }
}


/* Location:              com/google/android/gms/b/by.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */