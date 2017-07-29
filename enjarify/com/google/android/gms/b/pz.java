package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.overlay.j;
import com.google.android.gms.ads.internal.w;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class pz
{
  private static final long a = TimeUnit.SECONDS.toMillis(60);
  private static final Object b;
  private static boolean c = false;
  private static nj d = null;
  private final Context e;
  private final un f;
  private final com.google.android.gms.ads.internal.s g;
  private final dw h;
  private nh i;
  private nj.e j;
  private ng k;
  private boolean l = false;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    b = localObject;
  }
  
  public pz(Context paramContext, com.google.android.gms.ads.internal.s params, dw paramdw, un paramun)
  {
    e = paramContext;
    g = params;
    h = paramdw;
    f = paramun;
    jz localjz = ke.cg;
    boolean bool = ((Boolean)w.q().a(localjz)).booleanValue();
    l = bool;
  }
  
  public pz(Context paramContext, tg.a parama, com.google.android.gms.ads.internal.s params, dw paramdw) {}
  
  public final void a()
  {
    boolean bool = l;
    if (bool) {}
    for (;;)
    {
      synchronized (b)
      {
        bool = c;
        if (!bool)
        {
          nj localnj = new com/google/android/gms/b/nj;
          localContext = e;
          localContext = localContext.getApplicationContext();
          if (localContext != null)
          {
            localContext = e;
            localContext = localContext.getApplicationContext();
            un localun = f;
            Object localObject3 = ke.cd;
            Object localObject4 = w.q();
            localObject3 = ((kd)localObject4).a((jz)localObject3);
            localObject3 = (String)localObject3;
            localObject4 = new com/google/android/gms/b/pz$3;
            ((pz.3)localObject4).<init>(this);
            nj.b localb = new com/google/android/gms/b/nj$b;
            localb.<init>();
            localnj.<init>(localContext, localun, (String)localObject3, (ty)localObject4, localb);
            d = localnj;
            bool = true;
            c = bool;
          }
        }
        else
        {
          return;
        }
        Context localContext = e;
      }
      nh localnh = new com/google/android/gms/b/nh;
      localnh.<init>();
      i = localnh;
    }
  }
  
  public final void a(pz.a parama)
  {
    boolean bool = l;
    Object localObject;
    if (bool)
    {
      localObject = j;
      if (localObject == null)
      {
        localObject = "SharedJavascriptEngine not initialized";
        tp.e((String)localObject);
      }
    }
    for (;;)
    {
      return;
      pz.1 local1 = new com/google/android/gms/b/pz$1;
      local1.<init>(parama);
      pz.2 local2 = new com/google/android/gms/b/pz$2;
      local2.<init>(parama);
      ((nj.e)localObject).a(local1, local2);
      continue;
      localObject = k;
      if (localObject == null)
      {
        localObject = "JavascriptEngine not initialized";
        tp.e((String)localObject);
      }
      else
      {
        parama.a((nk)localObject);
      }
    }
  }
  
  public final void b()
  {
    boolean bool = l;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (bool)
    {
      localObject1 = new com/google/android/gms/b/nj$e;
      localObject2 = d;
      localObject3 = h;
      localObject2 = ((nj)localObject2).b((dw)localObject3);
      ((nj.e)localObject1).<init>((nj.c)localObject2);
      j = ((nj.e)localObject1);
    }
    for (;;)
    {
      return;
      localObject2 = i;
      localObject3 = e;
      Object localObject4 = f;
      localObject1 = ke.cd;
      String str = (String)w.q().a((jz)localObject1);
      dw localdw = h;
      e locale = g.g();
      Object localObject5 = new com/google/android/gms/b/nh$a;
      bool = false;
      ((nh.a)localObject5).<init>((byte)0);
      Handler localHandler = tt.a;
      localObject1 = new com/google/android/gms/b/nh$1;
      ((nh.1)localObject1).<init>((nh)localObject2, (Context)localObject3, (un)localObject4, (nh.a)localObject5, localdw, locale, str);
      localHandler.post((Runnable)localObject1);
      long l1 = a;
      localObject3 = TimeUnit.MILLISECONDS;
      localObject1 = (ng)((Future)localObject5).get(l1, (TimeUnit)localObject3);
      k = ((ng)localObject1);
      localObject1 = k;
      localObject2 = g;
      localObject3 = g;
      localObject4 = g;
      localObject5 = g;
      ((ng)localObject1).a((ib)localObject2, (j)localObject3, (ly)localObject4, (com.google.android.gms.ads.internal.overlay.s)localObject5);
    }
  }
}


/* Location:              com/google/android/gms/b/pz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */