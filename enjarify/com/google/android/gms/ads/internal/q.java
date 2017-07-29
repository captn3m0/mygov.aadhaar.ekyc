package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.b.hs;
import com.google.android.gms.b.jc.a;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.tj;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tw;
import com.google.android.gms.b.un;

public final class q
  extends jc.a
{
  private static final Object b;
  private static q c;
  private final Context a;
  private final Object d;
  private boolean e;
  private boolean f;
  private float g;
  private un h;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    b = localObject;
  }
  
  private q(Context paramContext, un paramun)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    d = localObject;
    g = -1.0F;
    a = paramContext;
    h = paramun;
    e = false;
  }
  
  public static q a()
  {
    synchronized (b)
    {
      q localq = c;
      return localq;
    }
  }
  
  public static q a(Context paramContext, un paramun)
  {
    synchronized (b)
    {
      q localq = c;
      if (localq == null)
      {
        localq = new com/google/android/gms/ads/internal/q;
        Context localContext = paramContext.getApplicationContext();
        localq.<init>(localContext, paramun);
        c = localq;
      }
      localq = c;
      return localq;
    }
  }
  
  public final void a(float paramFloat)
  {
    synchronized (d)
    {
      g = paramFloat;
      return;
    }
  }
  
  public final void a(a parama, String paramString)
  {
    Object localObject;
    if (parama == null)
    {
      localObject = "Wrapped context is null. Failed to open debug menu.";
      tp.c((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = (Context)b.a(parama);
      if (localObject == null)
      {
        localObject = "Context is null. Failed to open debug menu.";
        tp.c((String)localObject);
      }
      else
      {
        tw localtw = new com/google/android/gms/b/tw;
        localtw.<init>((Context)localObject);
        c = paramString;
        localObject = h.a;
        d = ((String)localObject);
        localtw.a();
      }
    }
  }
  
  public final void a(String paramString)
  {
    Object localObject1 = a;
    ke.a((Context)localObject1);
    boolean bool = TextUtils.isEmpty(paramString);
    if (!bool)
    {
      localObject1 = ke.cD;
      Object localObject2 = w.q();
      localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
      bool = ((Boolean)localObject1).booleanValue();
      if (bool)
      {
        localObject1 = w.A();
        localObject2 = a;
        un localun = h;
        ((h)localObject1).a((Context)localObject2, localun, paramString, null);
      }
    }
  }
  
  public final void a(String paramString, a parama)
  {
    boolean bool1 = TextUtils.isEmpty(paramString);
    if (bool1) {}
    label186:
    for (;;)
    {
      return;
      ke.a(a);
      Object localObject1 = ke.cD;
      boolean bool2 = ((Boolean)w.q().a((jz)localObject1)).booleanValue();
      localObject1 = ke.aH;
      Object localObject2 = w.q();
      bool1 = ((Boolean)((kd)localObject2).a((jz)localObject1)).booleanValue();
      boolean bool3 = bool2 | bool1;
      bool2 = false;
      Object localObject3 = null;
      localObject1 = ke.aH;
      Object localObject4 = w.q();
      localObject1 = (Boolean)((kd)localObject4).a((jz)localObject1);
      bool1 = ((Boolean)localObject1).booleanValue();
      if (bool1)
      {
        bool3 = true;
        localObject1 = (Runnable)b.a(parama);
        localObject3 = new com/google/android/gms/ads/internal/q$1;
        ((q.1)localObject3).<init>(this, (Runnable)localObject1);
        localObject1 = localObject3;
      }
      for (bool2 = bool3;; bool2 = bool3)
      {
        if (!bool2) {
          break label186;
        }
        localObject3 = w.A();
        localObject2 = a;
        localObject4 = h;
        ((h)localObject3).a((Context)localObject2, (un)localObject4, paramString, (Runnable)localObject1);
        break;
        bool1 = false;
        localObject1 = null;
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    synchronized (d)
    {
      f = paramBoolean;
      return;
    }
  }
  
  public final void b()
  {
    synchronized (b)
    {
      boolean bool = e;
      if (bool)
      {
        localObject2 = "Mobile ads is initialized already.";
        tp.e((String)localObject2);
        return;
      }
      bool = true;
      e = bool;
      ke.a(a);
      Object localObject2 = w.i();
      ??? = a;
      un localun = h;
      ((tj)localObject2).a((Context)???, localun);
      localObject2 = w.j();
      ??? = a;
      ((hs)localObject2).a((Context)???);
    }
  }
  
  public final float c()
  {
    synchronized (d)
    {
      float f1 = g;
      return f1;
    }
  }
  
  public final boolean d()
  {
    synchronized (d)
    {
      float f1 = g;
      boolean bool = f1 < 0.0F;
      if (!bool)
      {
        bool = true;
        f1 = Float.MIN_VALUE;
        return bool;
      }
      bool = false;
      f1 = 0.0F;
      Object localObject2 = null;
    }
  }
  
  public final boolean e()
  {
    synchronized (d)
    {
      boolean bool = f;
      return bool;
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */