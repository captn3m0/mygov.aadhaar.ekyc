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
  private final Map a;
  private final Map b;
  private final Map c;
  private final Map d;
  private final Map e;
  
  da(dc paramdc)
  {
    super(paramdc);
    a locala = new android/support/v4/g/a;
    locala.<init>();
    a = locala;
    locala = new android/support/v4/g/a;
    locala.<init>();
    b = locala;
    locala = new android/support/v4/g/a;
    locala.<init>();
    c = locala;
    locala = new android/support/v4/g/a;
    locala.<init>();
    d = locala;
    locala = new android/support/v4/g/a;
    locala.<init>();
    e = locala;
  }
  
  private dt.b a(String paramString, byte[] paramArrayOfByte)
  {
    dt.b localb;
    if (paramArrayOfByte == null)
    {
      localb = new com/google/android/gms/b/dt$b;
      localb.<init>();
    }
    for (;;)
    {
      return localb;
      int i = paramArrayOfByte.length;
      Object localObject2 = ft.a(paramArrayOfByte, i);
      localb = new com/google/android/gms/b/dt$b;
      localb.<init>();
      try
      {
        localb.a((ft)localObject2);
        localObject2 = super.u();
        localObject2 = g;
        str1 = "Parsed config. version, gmp_app_id";
        localObject3 = a;
        String str2 = b;
        ((cu.a)localObject2).a(str1, localObject3, str2);
      }
      catch (IOException localIOException)
      {
        localObject2 = uc;
        String str1 = "Unable to merge remote config. appId";
        Object localObject3 = cu.a(paramString);
        ((cu.a)localObject2).a(str1, localObject3, localIOException);
        i = 0;
        Object localObject1 = null;
      }
    }
  }
  
  private static Map a(dt.b paramb)
  {
    a locala = new android/support/v4/g/a;
    locala.<init>();
    if (paramb != null)
    {
      dt.c[] arrayOfc1 = d;
      if (arrayOfc1 != null)
      {
        dt.c[] arrayOfc2 = d;
        int i = arrayOfc2.length;
        int j = 0;
        arrayOfc1 = null;
        while (j < i)
        {
          Object localObject = arrayOfc2[j];
          if (localObject != null)
          {
            String str = a;
            localObject = b;
            locala.put(str, localObject);
          }
          j += 1;
        }
      }
    }
    return locala;
  }
  
  private void a(String paramString, dt.b paramb)
  {
    a locala1 = new android/support/v4/g/a;
    locala1.<init>();
    a locala2 = new android/support/v4/g/a;
    locala2.<init>();
    if (paramb != null)
    {
      Object localObject1 = e;
      if (localObject1 != null)
      {
        dt.a[] arrayOfa = e;
        int i = arrayOfa.length;
        int j = 0;
        localObject1 = null;
        for (int k = 0; k < i; k = j)
        {
          Object localObject2 = arrayOfa[k];
          if (localObject2 != null)
          {
            localObject1 = AppMeasurement.a.a;
            Object localObject3 = a;
            localObject1 = (String)((Map)localObject1).get(localObject3);
            if (localObject1 != null) {
              a = ((String)localObject1);
            }
            localObject1 = a;
            localObject3 = b;
            locala1.put(localObject1, localObject3);
            localObject1 = a;
            localObject2 = c;
            locala2.put(localObject1, localObject2);
          }
          j = k + 1;
        }
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
    Object localObject = d.get(paramString);
    if (localObject == null)
    {
      localObject = super.p().d(paramString);
      if (localObject != null) {
        break label104;
      }
      a.put(paramString, null);
      b.put(paramString, null);
      c.put(paramString, null);
      d.put(paramString, null);
      localObject = e;
      ((Map)localObject).put(paramString, null);
    }
    for (;;)
    {
      return;
      label104:
      localObject = a(paramString, (byte[])localObject);
      Map localMap1 = a;
      Map localMap2 = a((dt.b)localObject);
      localMap1.put(paramString, localMap2);
      a(paramString, (dt.b)localObject);
      localMap1 = d;
      localMap1.put(paramString, localObject);
      localObject = e;
      ((Map)localObject).put(paramString, null);
    }
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
    Object localObject = (Map)a.get(paramString1);
    if (localObject != null) {}
    for (localObject = (String)((Map)localObject).get(paramString2);; localObject = null) {
      return (String)localObject;
    }
  }
  
  protected final void a() {}
  
  protected final boolean a(String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    J();
    super.e();
    c.a(paramString1);
    dt.b localb = a(paramString1, paramArrayOfByte);
    boolean bool;
    Object localObject1;
    if (localb == null)
    {
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool;
      Object localObject2 = this;
      a(paramString1, localb);
      localObject1 = d;
      localObject2 = paramString1;
      ((Map)localObject1).put(paramString1, localb);
      localObject2 = this;
      localObject1 = e;
      localObject2 = paramString1;
      ((Map)localObject1).put(paramString1, paramString2);
      localObject2 = this;
      localObject1 = a;
      localObject3 = a(localb);
      localObject2 = paramString1;
      ((Map)localObject1).put(paramString1, localObject3);
      cc localcc = super.g();
      ds.a[] arrayOfa = f;
      c.a(arrayOfa);
      int j = arrayOfa.length;
      bool = false;
      localObject1 = null;
      int k = 0;
      localObject4 = null;
      int i2;
      while (k < j)
      {
        ds.a locala = arrayOfa[k];
        ds.b[] arrayOfb = c;
        int m = arrayOfb.length;
        bool = false;
        localObject1 = null;
        int n = 0;
        localObject5 = null;
        while (n < m)
        {
          localObject3 = arrayOfb[n];
          localObject1 = AppMeasurement.a.a;
          Object localObject6 = b;
          localObject1 = (String)((Map)localObject1).get(localObject6);
          if (localObject1 != null) {
            b = ((String)localObject1);
          }
          localObject6 = c;
          int i1 = localObject6.length;
          bool = false;
          localObject1 = null;
          i2 = 0;
          localObject3 = null;
          while (i2 < i1)
          {
            Object localObject7 = localObject6[i2];
            localObject1 = AppMeasurement.e.a;
            localObject2 = d;
            localObject1 = (String)((Map)localObject1).get(localObject2);
            if (localObject1 != null) {
              d = ((String)localObject1);
            }
            i = i2 + 1;
            i2 = i;
          }
          i = n + 1;
          n = i;
        }
        localObject5 = b;
        int i3 = localObject5.length;
        i = 0;
        localObject1 = null;
        i2 = 0;
        localObject3 = null;
        while (i2 < i3)
        {
          arrayOfb = localObject5[i2];
          localObject1 = AppMeasurement.g.a;
          String str = b;
          localObject1 = (String)((Map)localObject1).get(str);
          if (localObject1 != null) {
            b = ((String)localObject1);
          }
          i = i2 + 1;
          i2 = i;
        }
        i = k + 1;
        k = i;
      }
      localObject1 = localcc.p();
      localObject2 = paramString1;
      ((cg)localObject1).a(paramString1, arrayOfa);
      int i = 0;
      localObject1 = null;
      try
      {
        f = null;
        i = localb.f();
        localObject1 = new byte[i];
        i2 = localObject1.length;
        localObject3 = fu.a((byte[])localObject1, i2);
        localb.a((fu)localObject3);
        paramArrayOfByte = (byte[])localObject1;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          localObject3 = uc;
          localObject5 = "Unable to serialize reduced-size config. Storing full config instead. appId";
          localObject4 = cu.a(paramString1);
          ((cu.a)localObject3).a((String)localObject5, localObject4, localIOException);
        }
      }
      localObject1 = super.p();
      localObject2 = paramString1;
      ((cg)localObject1).a(paramString1, paramArrayOfByte);
      i = 1;
    }
  }
  
  protected final String b(String paramString)
  {
    super.e();
    return (String)e.get(paramString);
  }
  
  final boolean b(String paramString1, String paramString2)
  {
    boolean bool1 = true;
    super.e();
    d(paramString1);
    dr localdr = super.q();
    boolean bool2 = localdr.l(paramString1);
    if (bool2)
    {
      bool2 = dr.i(paramString2);
      if (!bool2) {}
    }
    for (;;)
    {
      return bool1;
      localdr = super.q();
      bool2 = localdr.m(paramString1);
      if (bool2)
      {
        bool2 = dr.a(paramString2);
        if (bool2) {}
      }
      else
      {
        Object localObject = (Map)b.get(paramString1);
        if (localObject != null)
        {
          localObject = (Boolean)((Map)localObject).get(paramString2);
          if (localObject == null)
          {
            bool1 = false;
            localObject = null;
          }
          else
          {
            bool1 = ((Boolean)localObject).booleanValue();
          }
        }
        else
        {
          bool1 = false;
          localObject = null;
        }
      }
    }
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
    Object localObject = (Map)c.get(paramString1);
    boolean bool;
    if (localObject != null)
    {
      localObject = (Boolean)((Map)localObject).get(paramString2);
      if (localObject == null)
      {
        bool = false;
        localObject = null;
      }
    }
    for (;;)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
      continue;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              com/google/android/gms/b/da.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */