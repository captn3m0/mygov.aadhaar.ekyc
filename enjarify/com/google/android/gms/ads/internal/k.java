package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.b.ih;
import com.google.android.gms.b.it;
import com.google.android.gms.b.iu.a;
import com.google.android.gms.b.jb;
import com.google.android.gms.b.le;
import com.google.android.gms.b.lq;
import com.google.android.gms.b.lr;
import com.google.android.gms.b.oc;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.un;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

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
  private final android.support.v4.g.k i;
  private final android.support.v4.g.k j;
  private final le k;
  private final List l;
  private final jb m;
  private WeakReference n;
  private final Object o;
  
  k(Context paramContext, String paramString, oc paramoc, un paramun, it paramit, lq paramlq, lr paramlr, android.support.v4.g.k paramk1, android.support.v4.g.k paramk2, le paramle, jb paramjb, e parame)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    o = localObject;
    a = paramContext;
    c = paramString;
    b = paramoc;
    d = paramun;
    f = paramit;
    h = paramlr;
    g = paramlq;
    i = paramk1;
    j = paramk2;
    k = paramle;
    localObject = c();
    l = ((List)localObject);
    m = paramjb;
    e = parame;
  }
  
  private List c()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = h;
    if (localObject != null)
    {
      localObject = "1";
      localArrayList.add(localObject);
    }
    localObject = g;
    if (localObject != null)
    {
      localObject = "2";
      localArrayList.add(localObject);
    }
    localObject = i;
    int i1 = ((android.support.v4.g.k)localObject).size();
    if (i1 > 0)
    {
      localObject = "3";
      localArrayList.add(localObject);
    }
    return localArrayList;
  }
  
  public final String a()
  {
    synchronized (o)
    {
      Object localObject2 = n;
      if (localObject2 != null)
      {
        localObject2 = n;
        localObject2 = ((WeakReference)localObject2).get();
        localObject2 = (s)localObject2;
        if (localObject2 != null) {}
        for (localObject2 = ((s)localObject2).F();; localObject2 = null) {
          return (String)localObject2;
        }
      }
      localObject2 = null;
    }
  }
  
  public final void a(ih paramih)
  {
    k.1 local1 = new com/google/android/gms/ads/internal/k$1;
    local1.<init>(this, paramih);
    tt.a.post(local1);
  }
  
  public final boolean b()
  {
    synchronized (o)
    {
      Object localObject2 = n;
      if (localObject2 != null)
      {
        localObject2 = n;
        localObject2 = ((WeakReference)localObject2).get();
        localObject2 = (s)localObject2;
        if (localObject2 != null) {
          bool = ((s)localObject2).p();
        }
        for (;;)
        {
          return bool;
          bool = false;
          localObject2 = null;
        }
      }
      boolean bool = false;
      localObject2 = null;
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */