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
  private final Map<String, Long> a = new a();
  private final Map<String, Integer> b = new a();
  private long c;
  
  public by(dc paramdc)
  {
    super(paramdc);
  }
  
  private void a(long paramLong, AppMeasurement.f paramf)
  {
    if (paramf == null)
    {
      ug.a("Not logging ad exposure. No active activity");
      return;
    }
    if (paramLong < 1000L)
    {
      ug.a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(paramLong));
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putLong("_xt", paramLong);
    di.a(paramf, localBundle);
    super.h().b("am", "_xa", localBundle);
  }
  
  private void a(String paramString, long paramLong, AppMeasurement.f paramf)
  {
    if (paramf == null)
    {
      ug.a("Not logging ad unit exposure. No active activity");
      return;
    }
    if (paramLong < 1000L)
    {
      ug.a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(paramLong));
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("_ai", paramString);
    localBundle.putLong("_xt", paramLong);
    di.a(paramf, localBundle);
    super.h().b("am", "_xu", localBundle);
  }
  
  public final void a()
  {
    final long l = super.m().b();
    super.t().a(new Runnable()
    {
      public final void run()
      {
        b(l);
      }
    });
  }
  
  public final void a(long paramLong)
  {
    di.a locala = super.l().x();
    Iterator localIterator = a.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      a(str, paramLong - ((Long)a.get(str)).longValue(), locala);
    }
    if (!a.isEmpty()) {
      a(paramLong - c, locala);
    }
    b(paramLong);
  }
  
  public final void a(final String paramString)
  {
    int i = Build.VERSION.SDK_INT;
    if ((paramString == null) || (paramString.length() == 0))
    {
      ua.a("Ad unit id must be a non-empty string");
      return;
    }
    final long l = super.m().b();
    super.t().a(new Runnable()
    {
      public final void run()
      {
        by.a(by.this, paramString, l);
      }
    });
  }
  
  final void b(long paramLong)
  {
    Iterator localIterator = a.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      a.put(str, Long.valueOf(paramLong));
    }
    if (!a.isEmpty()) {
      c = paramLong;
    }
  }
  
  public final void b(final String paramString)
  {
    int i = Build.VERSION.SDK_INT;
    if ((paramString == null) || (paramString.length() == 0))
    {
      ua.a("Ad unit id must be a non-empty string");
      return;
    }
    final long l = super.m().b();
    super.t().a(new Runnable()
    {
      public final void run()
      {
        by.b(by.this, paramString, l);
      }
    });
  }
}


/* Location:              com/google/android/gms/b/by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */