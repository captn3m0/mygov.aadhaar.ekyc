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
import com.google.android.gms.b.nr;
import com.google.android.gms.b.ns;
import com.google.android.gms.b.od;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.rx;
import com.google.android.gms.b.sp;
import com.google.android.gms.b.ti;
import com.google.android.gms.b.tj;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.tw;
import com.google.android.gms.b.un;
import com.google.android.gms.common.internal.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@qi
public final class q
  extends jc.a
{
  private static final Object b = new Object();
  private static q c;
  private final Context a;
  private final Object d = new Object();
  private boolean e;
  private boolean f;
  private float g = -1.0F;
  private un h;
  
  private q(Context paramContext, un paramun)
  {
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
      if (c == null) {
        c = new q(paramContext.getApplicationContext(), paramun);
      }
      paramContext = c;
      return paramContext;
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
    if (parama == null)
    {
      tp.c("Wrapped context is null. Failed to open debug menu.");
      return;
    }
    parama = (Context)b.a(parama);
    if (parama == null)
    {
      tp.c("Context is null. Failed to open debug menu.");
      return;
    }
    parama = new tw(parama);
    c = paramString;
    d = h.a;
    parama.a();
  }
  
  public final void a(String paramString)
  {
    ke.a(a);
    if (!TextUtils.isEmpty(paramString))
    {
      jz localjz = ke.cD;
      if (((Boolean)w.q().a(localjz)).booleanValue()) {
        w.A().a(a, h, paramString, null);
      }
    }
  }
  
  public final void a(String paramString, a parama)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return;
      ke.a(a);
      jz localjz = ke.cD;
      boolean bool1 = ((Boolean)w.q().a(localjz)).booleanValue();
      localjz = ke.aH;
      boolean bool2 = ((Boolean)w.q().a(localjz)).booleanValue();
      localjz = ke.aH;
      if (((Boolean)w.q().a(localjz)).booleanValue()) {
        parama = new Runnable()
        {
          public final void run()
          {
            w.e();
            tt.a(new Runnable()
            {
              public final void run()
              {
                Object localObject4 = q.a(q.this);
                Object localObject3 = a;
                c.b("Adapters must be initialized on the main thread.");
                Object localObject1 = ipb;
                if ((localObject1 == null) || (((Map)localObject1).isEmpty())) {}
                Object localObject5;
                Object localObject6;
                Object localObject8;
                Object localObject7;
                for (;;)
                {
                  return;
                  if (localObject3 != null) {}
                  try
                  {
                    ((Runnable)localObject3).run();
                    localObject3 = rx.J();
                    if (localObject3 != null)
                    {
                      localObject5 = ((Map)localObject1).values();
                      localObject1 = new HashMap();
                      localObject4 = b.a(localObject4);
                      localObject5 = ((Collection)localObject5).iterator();
                      if (((Iterator)localObject5).hasNext())
                      {
                        localObject6 = nexta.iterator();
                        while (((Iterator)localObject6).hasNext())
                        {
                          localObject8 = (nr)((Iterator)localObject6).next();
                          localObject7 = i;
                          localObject8 = c.iterator();
                          while (((Iterator)localObject8).hasNext())
                          {
                            String str2 = (String)((Iterator)localObject8).next();
                            if (!((Map)localObject1).containsKey(str2)) {
                              ((Map)localObject1).put(str2, new ArrayList());
                            }
                            if (localObject7 != null) {
                              ((Collection)((Map)localObject1).get(str2)).add(localObject7);
                            }
                          }
                        }
                      }
                      localObject5 = localThrowable1.entrySet().iterator();
                    }
                  }
                  catch (Throwable localThrowable1)
                  {
                    tp.c("Could not initialize rewarded ads.", localThrowable1);
                    return;
                  }
                }
                label264:
                Object localObject2;
                if (((Iterator)localObject5).hasNext())
                {
                  localObject2 = (Map.Entry)((Iterator)localObject5).next();
                  localObject6 = (String)((Map.Entry)localObject2).getKey();
                }
                for (;;)
                {
                  try
                  {
                    localObject7 = ((rx)localObject3).b((String)localObject6);
                    if (localObject7 == null) {
                      break label264;
                    }
                    localObject8 = a;
                    if ((((od)localObject8).g()) || (!((od)localObject8).m())) {
                      break label264;
                    }
                    ((od)localObject8).a((a)localObject4, b, (List)((Map.Entry)localObject2).getValue());
                    localObject2 = String.valueOf(localObject6);
                    if (((String)localObject2).length() == 0) {
                      break label429;
                    }
                    localObject2 = "Initialized rewarded video mediation adapter ".concat((String)localObject2);
                    tp.b((String)localObject2);
                  }
                  catch (Throwable localThrowable2)
                  {
                    tp.c(String.valueOf(localObject6).length() + 56 + "Failed to initialize rewarded video mediation adapter \"" + (String)localObject6 + "\"", localThrowable2);
                  }
                  break label264;
                  break;
                  label429:
                  String str1 = new String("Initialized rewarded video mediation adapter ");
                }
              }
            });
          }
        };
      }
      for (int i = 1; i != 0; i = bool1 | bool2)
      {
        w.A().a(a, h, paramString, parama);
        return;
        parama = null;
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
      if (e)
      {
        tp.e("Mobile ads is initialized already.");
        return;
      }
      e = true;
      ke.a(a);
      w.i().a(a, h);
      w.j().a(a);
      return;
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
    for (;;)
    {
      synchronized (d)
      {
        if (g >= 0.0F)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */