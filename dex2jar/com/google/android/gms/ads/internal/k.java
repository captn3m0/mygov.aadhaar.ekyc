package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.b.ih;
import com.google.android.gms.b.il;
import com.google.android.gms.b.it;
import com.google.android.gms.b.iu.a;
import com.google.android.gms.b.jb;
import com.google.android.gms.b.le;
import com.google.android.gms.b.lq;
import com.google.android.gms.b.lr;
import com.google.android.gms.b.ls;
import com.google.android.gms.b.lt;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.un;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@qi
public final class k
  extends iu.a
{
  final Context a;
  final oc b;
  final String c;
  final un d;
  final e e;
  private final it f;
  private final lq g;
  private final lr h;
  private final android.support.v4.g.k<String, lt> i;
  private final android.support.v4.g.k<String, ls> j;
  private final le k;
  private final List<String> l;
  private final jb m;
  private WeakReference<s> n;
  private final Object o = new Object();
  
  k(Context paramContext, String paramString, oc paramoc, un paramun, it paramit, lq paramlq, lr paramlr, android.support.v4.g.k<String, lt> paramk, android.support.v4.g.k<String, ls> paramk1, le paramle, jb paramjb, e parame)
  {
    a = paramContext;
    c = paramString;
    b = paramoc;
    d = paramun;
    f = paramit;
    h = paramlr;
    g = paramlq;
    i = paramk;
    j = paramk1;
    k = paramle;
    l = c();
    m = paramjb;
    e = parame;
  }
  
  private List<String> c()
  {
    ArrayList localArrayList = new ArrayList();
    if (h != null) {
      localArrayList.add("1");
    }
    if (g != null) {
      localArrayList.add("2");
    }
    if (i.size() > 0) {
      localArrayList.add("3");
    }
    return localArrayList;
  }
  
  public final String a()
  {
    for (;;)
    {
      synchronized (o)
      {
        if (n != null)
        {
          Object localObject1 = (s)n.get();
          if (localObject1 != null)
          {
            localObject1 = ((s)localObject1).F();
            return (String)localObject1;
          }
        }
        else
        {
          return null;
        }
      }
      Object localObject3 = null;
    }
  }
  
  public final void a(final ih paramih)
  {
    paramih = new Runnable()
    {
      public final void run()
      {
        synchronized (k.a(k.this))
        {
          Object localObject2 = k.this;
          localObject2 = new s(a, e, il.a(), c, b, d);
          k.a(k.this, new WeakReference(localObject2));
          ((s)localObject2).a(k.b(k.this));
          ((s)localObject2).a(k.c(k.this));
          ((s)localObject2).a(k.d(k.this));
          ((s)localObject2).a(k.e(k.this));
          ((s)localObject2).b(k.f(k.this));
          ((s)localObject2).a(k.g(k.this));
          ((s)localObject2).a(k.h(k.this));
          ((s)localObject2).a(k.i(k.this));
          ((s)localObject2).a(paramih);
          return;
        }
      }
    };
    tt.a.post(paramih);
  }
  
  public final boolean b()
  {
    for (;;)
    {
      synchronized (o)
      {
        if (n != null)
        {
          s locals = (s)n.get();
          if (locals != null)
          {
            bool = locals.p();
            return bool;
          }
        }
        else
        {
          return false;
        }
      }
      boolean bool = false;
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */