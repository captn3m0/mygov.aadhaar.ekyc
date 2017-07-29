package com.google.android.gms.b;

import android.location.Location;
import com.google.ads.a.a;
import com.google.ads.a.b;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.k;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public final class oq
{
  public static int a(a.a parama)
  {
    int[] arrayOfInt = oq.1.b;
    int i = parama.ordinal();
    int j = arrayOfInt[i];
    switch (j)
    {
    default: 
      j = 0;
      arrayOfInt = null;
    }
    for (;;)
    {
      return j;
      j = 1;
      continue;
      j = 2;
      continue;
      j = 3;
    }
  }
  
  public static com.google.ads.b a(il paramil)
  {
    int i = 6;
    int j = 0;
    com.google.ads.b localb = null;
    Object localObject1 = new com.google.ads.b[i];
    Object localObject2 = com.google.ads.b.b;
    localObject1[0] = localObject2;
    Object localObject3 = com.google.ads.b.c;
    localObject1[1] = localObject3;
    localObject3 = com.google.ads.b.d;
    localObject1[2] = localObject3;
    localObject3 = com.google.ads.b.e;
    localObject1[3] = localObject3;
    localObject3 = com.google.ads.b.f;
    localObject1[4] = localObject3;
    int k = 5;
    localObject3 = com.google.ads.b.g;
    localObject1[k] = localObject3;
    if (j < i)
    {
      localObject2 = a;
      k = k;
      int m = e;
      if (k == m)
      {
        localObject2 = a;
        k = l;
        m = b;
        if (k == m) {
          localb = localObject1[j];
        }
      }
    }
    for (;;)
    {
      return localb;
      j += 1;
      break;
      localb = new com/google/ads/b;
      int n = e;
      k = b;
      localObject3 = a;
      localObject1 = k.a(n, k, (String)localObject3);
      localb.<init>((d)localObject1);
    }
  }
  
  public static com.google.ads.mediation.b a(ih paramih)
  {
    Object localObject = e;
    HashSet localHashSet;
    Date localDate;
    int i;
    if (localObject != null)
    {
      localHashSet = new java/util/HashSet;
      localObject = e;
      localHashSet.<init>((Collection)localObject);
      localObject = new com/google/ads/mediation/b;
      localDate = new java/util/Date;
      long l = b;
      localDate.<init>(l);
      i = d;
      switch (i)
      {
      default: 
        i = a.b.a;
      }
    }
    for (;;)
    {
      boolean bool = f;
      Location localLocation = k;
      ((com.google.ads.mediation.b)localObject).<init>(localDate, i, localHashSet, bool, localLocation);
      return (com.google.ads.mediation.b)localObject;
      localHashSet = null;
      break;
      i = a.b.c;
      continue;
      i = a.b.b;
    }
  }
}


/* Location:              com/google/android/gms/b/oq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */