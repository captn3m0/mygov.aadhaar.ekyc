package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.m;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;

final class nc$a
{
  m a;
  ih b;
  mx c;
  long d;
  boolean e;
  boolean f;
  
  nc$a(nc paramnc, mw parammw)
  {
    String str = c;
    Object localObject1 = new com/google/android/gms/ads/internal/m;
    Object localObject2 = a.getApplicationContext();
    Object localObject3 = new com/google/android/gms/b/il;
    ((il)localObject3).<init>();
    oc localoc = b;
    un localun = c;
    e locale = d;
    ((m)localObject1).<init>((Context)localObject2, (il)localObject3, str, localoc, localun, locale);
    a = ((m)localObject1);
    localObject1 = new com/google/android/gms/b/mx;
    ((mx)localObject1).<init>();
    c = ((mx)localObject1);
    localObject1 = c;
    localObject2 = a;
    localObject3 = new com/google/android/gms/b/mx$1;
    ((mx.1)localObject3).<init>((mx)localObject1);
    ((m)localObject2).a((it)localObject3);
    localObject3 = new com/google/android/gms/b/mx$2;
    ((mx.2)localObject3).<init>((mx)localObject1);
    ((m)localObject2).a((iz)localObject3);
    localObject3 = new com/google/android/gms/b/mx$3;
    ((mx.3)localObject3).<init>((mx)localObject1);
    ((m)localObject2).a((ph)localObject3);
    localObject3 = new com/google/android/gms/b/mx$4;
    ((mx.4)localObject3).<init>((mx)localObject1);
    ((m)localObject2).a((kq)localObject3);
    localObject3 = new com/google/android/gms/b/mx$5;
    ((mx.5)localObject3).<init>((mx)localObject1);
    ((m)localObject2).a((is)localObject3);
    localObject3 = new com/google/android/gms/b/mx$6;
    ((mx.6)localObject3).<init>((mx)localObject1);
    ((m)localObject2).a((sb)localObject3);
  }
  
  nc$a(nc paramnc, mw parammw, ih paramih)
  {
    this(paramnc, parammw);
    b = paramih;
  }
  
  final boolean a()
  {
    boolean bool1 = true;
    boolean bool2 = e;
    if (bool2)
    {
      bool2 = false;
      localObject1 = null;
      return bool2;
    }
    Object localObject1 = b;
    if (localObject1 != null) {}
    for (localObject1 = b;; localObject1 = g.b)
    {
      localObject1 = mz.c((ih)localObject1);
      Object localObject2 = "_skipMediation";
      Bundle localBundle = m;
      String str = "com.google.ads.mediation.admob.AdMobAdapter";
      localBundle = localBundle.getBundle(str);
      if (localBundle != null) {
        localBundle.putBoolean((String)localObject2, bool1);
      }
      localBundle = c;
      localBundle.putBoolean((String)localObject2, bool1);
      localObject2 = a;
      bool2 = ((m)localObject2).a((ih)localObject1);
      f = bool2;
      e = bool1;
      localObject1 = w.k();
      long l = ((c)localObject1).a();
      d = l;
      bool2 = bool1;
      break;
    }
  }
}


/* Location:              com/google/android/gms/b/nc$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */