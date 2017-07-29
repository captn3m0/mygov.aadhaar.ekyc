package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;

final class nj$1
  implements Runnable
{
  nj$1(nj paramnj, dw paramdw, nj.d paramd) {}
  
  public final void run()
  {
    Object localObject1 = c.b;
    Object localObject2 = c.d;
    dw localdw = a;
    ni localni = new com/google/android/gms/b/ni;
    localni.<init>((Context)localObject1, (un)localObject2, localdw, null);
    localObject1 = new com/google/android/gms/b/nj$1$1;
    ((nj.1.1)localObject1).<init>(this, localni);
    localni.a((ng.a)localObject1);
    localObject2 = new com/google/android/gms/b/nj$1$2;
    ((nj.1.2)localObject2).<init>(this, localni);
    localni.a("/jsLoaded", (md)localObject2);
    localObject1 = new com/google/android/gms/b/ug;
    ((ug)localObject1).<init>();
    localObject2 = new com/google/android/gms/b/nj$1$3;
    ((nj.1.3)localObject2).<init>(this, localni, (ug)localObject1);
    a = localObject2;
    localni.a("/requestReload", (md)localObject2);
    localObject1 = c.c;
    localObject2 = ".js";
    boolean bool = ((String)localObject1).endsWith((String)localObject2);
    if (bool)
    {
      localObject1 = c.c;
      localni.a((String)localObject1);
    }
    for (;;)
    {
      localObject1 = tt.a;
      localObject2 = new com/google/android/gms/b/nj$1$4;
      ((nj.1.4)localObject2).<init>(this, localni);
      long l = nj.a.a;
      ((Handler)localObject1).postDelayed((Runnable)localObject2, l);
      return;
      localObject1 = c.c;
      localObject2 = "<html>";
      bool = ((String)localObject1).startsWith((String)localObject2);
      if (bool)
      {
        localObject1 = c.c;
        localni.c((String)localObject1);
      }
      else
      {
        localObject1 = c.c;
        localni.b((String)localObject1);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/nj$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */