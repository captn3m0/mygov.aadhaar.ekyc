package com.google.android.gms.b;

import com.google.ads.a.a;
import com.google.ads.a.b;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.k;
import java.util.Date;
import java.util.HashSet;

@qi
public final class oq
{
  public static int a(a.a parama)
  {
    switch (1.b[parama.ordinal()])
    {
    default: 
      return 0;
    case 2: 
      return 1;
    case 3: 
      return 2;
    }
    return 3;
  }
  
  public static com.google.ads.b a(il paramil)
  {
    int i = 0;
    com.google.ads.b[] arrayOfb = new com.google.ads.b[6];
    arrayOfb[0] = com.google.ads.b.b;
    arrayOfb[1] = com.google.ads.b.c;
    arrayOfb[2] = com.google.ads.b.d;
    arrayOfb[3] = com.google.ads.b.e;
    arrayOfb[4] = com.google.ads.b.f;
    arrayOfb[5] = com.google.ads.b.g;
    while (i < 6)
    {
      if ((a.k == e) && (a.l == b)) {
        return arrayOfb[i];
      }
      i += 1;
    }
    return new com.google.ads.b(k.a(e, b, a));
  }
  
  public static com.google.ads.mediation.b a(ih paramih)
  {
    HashSet localHashSet;
    Date localDate;
    int i;
    if (e != null)
    {
      localHashSet = new HashSet(e);
      localDate = new Date(b);
      switch (d)
      {
      default: 
        i = a.b.a;
      }
    }
    for (;;)
    {
      return new com.google.ads.mediation.b(localDate, i, localHashSet, f, k);
      localHashSet = null;
      break;
      i = a.b.c;
      continue;
      i = a.b.b;
    }
  }
}


/* Location:              com/google/android/gms/b/oq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */