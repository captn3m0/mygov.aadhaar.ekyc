package com.google.android.gms.b;

import android.support.v4.g.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.measurement.AppMeasurement.a;
import com.google.android.gms.measurement.AppMeasurement.e;
import com.google.android.gms.measurement.AppMeasurement.g;
import java.io.IOException;
import java.util.Map;

public final class da
  extends df
{
  private final Map<String, Map<String, String>> a = new a();
  private final Map<String, Map<String, Boolean>> b = new a();
  private final Map<String, Map<String, Boolean>> c = new a();
  private final Map<String, dt.b> d = new a();
  private final Map<String, String> e = new a();
  
  da(dc paramdc)
  {
    super(paramdc);
  }
  
  private dt.b a(String paramString, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return new dt.b();
    }
    paramArrayOfByte = ft.a(paramArrayOfByte, paramArrayOfByte.length);
    dt.b localb = new dt.b();
    try
    {
      localb.a(paramArrayOfByte);
      ug.a("Parsed config. version, gmp_app_id", a, b);
      return localb;
    }
    catch (IOException paramArrayOfByte)
    {
      uc.a("Unable to merge remote config. appId", cu.a(paramString), paramArrayOfByte);
    }
    return null;
  }
  
  private static Map<String, String> a(dt.b paramb)
  {
    a locala = new a();
    if ((paramb != null) && (d != null))
    {
      paramb = d;
      int j = paramb.length;
      int i = 0;
      while (i < j)
      {
        Object localObject = paramb[i];
        if (localObject != null) {
          locala.put(a, b);
        }
        i += 1;
      }
    }
    return locala;
  }
  
  private void a(String paramString, dt.b paramb)
  {
    a locala1 = new a();
    a locala2 = new a();
    if ((paramb != null) && (e != null))
    {
      paramb = e;
      int j = paramb.length;
      int i = 0;
      while (i < j)
      {
        Object localObject = paramb[i];
        if (localObject != null)
        {
          String str = (String)AppMeasurement.a.a.get(a);
          if (str != null) {
            a = str;
          }
          locala1.put(a, b);
          locala2.put(a, c);
        }
        i += 1;
      }
    }
    b.put(paramString, locala1);
    c.put(paramString, locala2);
  }
  
  private void d(String paramString)
  {
    J();
    super.e();
    c.a(paramString);
    if (d.get(paramString) == null)
    {
      localObject = super.p().d(paramString);
      if (localObject == null)
      {
        a.put(paramString, null);
        b.put(paramString, null);
        c.put(paramString, null);
        d.put(paramString, null);
        e.put(paramString, null);
      }
    }
    else
    {
      return;
    }
    Object localObject = a(paramString, (byte[])localObject);
    a.put(paramString, a((dt.b)localObject));
    a(paramString, (dt.b)localObject);
    d.put(paramString, localObject);
    e.put(paramString, null);
  }
  
  protected final dt.b a(String paramString)
  {
    J();
    super.e();
    c.a(paramString);
    d(paramString);
    return (dt.b)d.get(paramString);
  }
  
  final String a(String paramString1, String paramString2)
  {
    super.e();
    d(paramString1);
    paramString1 = (Map)a.get(paramString1);
    if (paramString1 != null) {
      return (String)paramString1.get(paramString2);
    }
    return null;
  }
  
  protected final void a() {}
  
  protected final boolean a(String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    J();
    super.e();
    c.a(paramString1);
    dt.b localb = a(paramString1, paramArrayOfByte);
    if (localb == null) {
      return false;
    }
    a(paramString1, localb);
    d.put(paramString1, localb);
    e.put(paramString1, paramString2);
    a.put(paramString1, a(localb));
    paramString2 = super.g();
    ds.a[] arrayOfa = f;
    c.a(arrayOfa);
    int m = arrayOfa.length;
    int i = 0;
    while (i < m)
    {
      Object localObject1 = arrayOfa[i];
      ds.b[] arrayOfb = c;
      int n = arrayOfb.length;
      int j = 0;
      Object localObject2;
      while (j < n)
      {
        localObject2 = arrayOfb[j];
        String str1 = (String)AppMeasurement.a.a.get(b);
        if (str1 != null) {
          b = str1;
        }
        localObject2 = c;
        int i1 = localObject2.length;
        k = 0;
        while (k < i1)
        {
          str1 = localObject2[k];
          String str2 = (String)AppMeasurement.e.a.get(d);
          if (str2 != null) {
            d = str2;
          }
          k += 1;
        }
        j += 1;
      }
      localObject1 = b;
      int k = localObject1.length;
      j = 0;
      while (j < k)
      {
        arrayOfb = localObject1[j];
        localObject2 = (String)AppMeasurement.g.a.get(b);
        if (localObject2 != null) {
          b = ((String)localObject2);
        }
        j += 1;
      }
      i += 1;
    }
    paramString2.p().a(paramString1, arrayOfa);
    try
    {
      f = null;
      paramString2 = new byte[localb.f()];
      localb.a(fu.a(paramString2, paramString2.length));
      paramArrayOfByte = paramString2;
    }
    catch (IOException paramString2)
    {
      for (;;)
      {
        uc.a("Unable to serialize reduced-size config. Storing full config instead. appId", cu.a(paramString1), paramString2);
      }
    }
    super.p().a(paramString1, paramArrayOfByte);
    return true;
  }
  
  protected final String b(String paramString)
  {
    super.e();
    return (String)e.get(paramString);
  }
  
  final boolean b(String paramString1, String paramString2)
  {
    super.e();
    d(paramString1);
    if ((super.q().l(paramString1)) && (dr.i(paramString2))) {}
    while ((super.q().m(paramString1)) && (dr.a(paramString2))) {
      return true;
    }
    paramString1 = (Map)b.get(paramString1);
    if (paramString1 != null)
    {
      paramString1 = (Boolean)paramString1.get(paramString2);
      if (paramString1 == null) {
        return false;
      }
      return paramString1.booleanValue();
    }
    return false;
  }
  
  protected final void c(String paramString)
  {
    super.e();
    e.put(paramString, null);
  }
  
  final boolean c(String paramString1, String paramString2)
  {
    super.e();
    d(paramString1);
    paramString1 = (Map)c.get(paramString1);
    if (paramString1 != null)
    {
      paramString1 = (Boolean)paramString1.get(paramString2);
      if (paramString1 == null) {
        return false;
      }
      return paramString1.booleanValue();
    }
    return false;
  }
}


/* Location:              com/google/android/gms/b/da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */