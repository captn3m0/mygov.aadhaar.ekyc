package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class fb
  extends gm
{
  private static volatile bi i = null;
  private static final Object j;
  private bd.a k = null;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    j = localObject;
  }
  
  public fb(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt, bd.a parama1)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 27);
    k = parama1;
  }
  
  private static String a(bd.a parama)
  {
    boolean bool;
    if (parama != null)
    {
      localObject = b;
      if (localObject != null)
      {
        localObject = b.a;
        bool = ew.b((String)localObject);
        if (bool) {}
      }
    }
    for (Object localObject = b.a;; localObject = null)
    {
      return (String)localObject;
      bool = false;
    }
  }
  
  private String b()
  {
    try
    {
      localObject1 = b;
      localObject1 = h;
      if (localObject1 != null)
      {
        localObject1 = b;
        localObject1 = h;
        ((Future)localObject1).get();
      }
      localObject1 = b;
      localObject1 = g;
      if (localObject1 == null) {
        break label62;
      }
      String str = w;
      if (str == null) {
        break label62;
      }
      localObject1 = w;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = null;
      }
    }
    catch (ExecutionException localExecutionException)
    {
      label62:
      for (;;) {}
    }
    return (String)localObject1;
  }
  
  protected final void a()
  {
    int m = 3;
    int n = 2;
    int i1 = 1;
    float f = Float.MIN_VALUE;
    Object localObject1 = null;
    Object localObject2 = i;
    Object localObject5;
    if (localObject2 != null)
    {
      localObject2 = ia;
      bool1 = ew.b((String)localObject2);
      if (!bool1)
      {
        localObject2 = ia;
        localObject5 = "E";
        bool1 = ((String)localObject2).equals(localObject5);
        if (!bool1) {
          break label466;
        }
      }
    }
    boolean bool1 = i1;
    for (;;)
    {
      label117:
      label187:
      boolean bool2;
      if (bool1) {
        label308:
        synchronized (j)
        {
          localObject2 = k;
          localObject2 = a((bd.a)localObject2);
          bool1 = ew.b((String)localObject2);
          if (!bool1)
          {
            int i2 = 4;
            int i4 = i2;
            if (i4 == m)
            {
              localObject2 = b;
              ((eu)localObject2).f();
            }
            Method localMethod = this.f;
            i2 = 2;
            Object[] arrayOfObject = new Object[i2];
            i2 = 0;
            localObject2 = null;
            Object localObject7 = b;
            localObject7 = ((eu)localObject7).a();
            arrayOfObject[0] = localObject7;
            int i5 = 1;
            if (i4 != n) {
              break label736;
            }
            i2 = i1;
            localObject2 = Boolean.valueOf(i2);
            arrayOfObject[i5] = localObject2;
            localObject2 = localMethod.invoke(null, arrayOfObject);
            localObject2 = (String)localObject2;
            ??? = new com/google/android/gms/b/bi;
            ((bi)???).<init>((String)localObject2);
            i = (bi)???;
            localObject2 = a;
            bool2 = ew.b((String)localObject2);
            if (!bool2)
            {
              localObject2 = i;
              localObject2 = a;
              ??? = "E";
              bool2 = ((String)localObject2).equals(???);
              if (!bool2) {}
            }
            else
            {
              switch (i4)
              {
              }
            }
          }
        }
      }
      synchronized (e)
      {
        localObject2 = i;
        if (localObject2 != null)
        {
          localObject2 = e;
          localObject1 = i;
          localObject1 = a;
          w = ((String)localObject1);
          localObject2 = e;
          localObject1 = i;
          long l = b;
          localObject1 = Long.valueOf(l);
          C = ((Long)localObject1);
          localObject2 = e;
          localObject1 = i;
          localObject1 = c;
          B = ((String)localObject1);
          localObject2 = e;
          localObject1 = i;
          localObject1 = d;
          M = ((String)localObject1);
          localObject2 = e;
          localObject1 = i;
          localObject1 = e;
          N = ((String)localObject1);
        }
        return;
        label466:
        bool2 = false;
        localObject2 = null;
        continue;
        localObject2 = k;
        localObject5 = a((bd.a)localObject2);
        boolean bool4 = ew.b((String)localObject5);
        if ((bool4) && (localObject2 != null))
        {
          localObject5 = a;
          if (localObject5 != null)
          {
            localObject2 = a;
            localObject2 = a;
            int i3 = ((Integer)localObject2).intValue();
            if (i3 == m)
            {
              i3 = i1;
              label547:
              localObject2 = Boolean.valueOf(i3);
              bool3 = ((Boolean)localObject2).booleanValue();
              if (!bool3) {
                break label730;
              }
              localObject2 = b;
              bool3 = ((eu)localObject2).e();
              if (!bool3) {
                break label721;
              }
              localObject2 = ke.bQ;
              localObject5 = w.q();
              localObject2 = ((kd)localObject5).a((jz)localObject2);
              localObject2 = (Boolean)localObject2;
              bool3 = ((Boolean)localObject2).booleanValue();
              if (!bool3) {
                break label721;
              }
              localObject2 = ke.bR;
              localObject5 = w.q();
              localObject2 = ((kd)localObject5).a((jz)localObject2);
              localObject2 = (Boolean)localObject2;
              bool3 = ((Boolean)localObject2).booleanValue();
              if (!bool3) {
                break label721;
              }
              localObject2 = ke.bP;
              localObject5 = w.q();
              localObject2 = ((kd)localObject5).a((jz)localObject2);
              localObject2 = (Boolean)localObject2;
              bool3 = ((Boolean)localObject2).booleanValue();
              if (!bool3) {
                break label721;
              }
              bool3 = i1;
            }
          }
        }
        for (;;)
        {
          if (!bool3) {
            break label730;
          }
          bool4 = m;
          break;
          bool3 = false;
          localObject2 = null;
          break label547;
          label721:
          bool3 = false;
          localObject2 = null;
        }
        label730:
        bool4 = n;
        break label117;
        label736:
        boolean bool3 = false;
        localObject2 = null;
        break label187;
        localObject2 = i;
        ??? = k;
        ??? = b;
        ??? = a;
        a = ((String)???);
        break label308;
        localObject3 = finally;
        throw ((Throwable)localObject3);
        String str = b();
        i1 = ew.b(str);
        if (i1 != 0) {
          break label308;
        }
        ??? = i;
        a = str;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/fb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */