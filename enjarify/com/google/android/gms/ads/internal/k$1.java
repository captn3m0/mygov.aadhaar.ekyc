package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.b.ih;
import com.google.android.gms.b.il;
import com.google.android.gms.b.it;
import com.google.android.gms.b.jb;
import com.google.android.gms.b.le;
import com.google.android.gms.b.lq;
import com.google.android.gms.b.lr;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.un;
import java.lang.ref.WeakReference;
import java.util.List;

final class k$1
  implements Runnable
{
  k$1(k paramk, ih paramih) {}
  
  public final void run()
  {
    Object localObject1 = b;
    synchronized (k.a((k)localObject1))
    {
      Object localObject4 = b;
      localObject1 = new com/google/android/gms/ads/internal/s;
      Object localObject5 = a;
      Object localObject6 = e;
      il localil = il.a();
      String str = c;
      oc localoc = b;
      localObject4 = d;
      ((s)localObject1).<init>((Context)localObject5, (e)localObject6, localil, str, localoc, (un)localObject4);
      localObject5 = b;
      localObject6 = new java/lang/ref/WeakReference;
      ((WeakReference)localObject6).<init>(localObject1);
      k.a((k)localObject5, (WeakReference)localObject6);
      localObject5 = b;
      localObject5 = k.b((k)localObject5);
      ((s)localObject1).a((lq)localObject5);
      localObject5 = b;
      localObject5 = k.c((k)localObject5);
      ((s)localObject1).a((lr)localObject5);
      localObject5 = b;
      localObject5 = k.d((k)localObject5);
      ((s)localObject1).a((android.support.v4.g.k)localObject5);
      localObject5 = b;
      localObject5 = k.e((k)localObject5);
      ((s)localObject1).a((it)localObject5);
      localObject5 = b;
      localObject5 = k.f((k)localObject5);
      ((s)localObject1).b((android.support.v4.g.k)localObject5);
      localObject5 = b;
      localObject5 = k.g((k)localObject5);
      ((s)localObject1).a((List)localObject5);
      localObject5 = b;
      localObject5 = k.h((k)localObject5);
      ((s)localObject1).a((le)localObject5);
      localObject5 = b;
      localObject5 = k.i((k)localObject5);
      ((s)localObject1).a((jb)localObject5);
      localObject5 = a;
      ((s)localObject1).a((ih)localObject5);
      return;
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/k$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */