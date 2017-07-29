package com.google.android.gms.b;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.b.b.a;
import com.google.android.gms.ads.i;
import com.google.android.gms.ads.mediation.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@qi
public final class ol
  extends og.a
{
  private final j a;
  
  public ol(j paramj)
  {
    a = paramj;
  }
  
  public final String a()
  {
    return a.e;
  }
  
  public final void a(a parama)
  {
    b.a(parama);
  }
  
  public final List b()
  {
    Object localObject = a.f;
    if (localObject != null)
    {
      ArrayList localArrayList = new ArrayList();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        b.a locala = (b.a)((Iterator)localObject).next();
        localArrayList.add(new kv(locala.a(), locala.b(), locala.c()));
      }
      return localArrayList;
    }
    return null;
  }
  
  public final void b(a parama)
  {
    a.a((View)b.a(parama));
  }
  
  public final String c()
  {
    return a.g;
  }
  
  public final void c(a parama)
  {
    b.a(parama);
  }
  
  public final lh d()
  {
    b.a locala = a.h;
    if (locala != null) {
      return new kv(locala.a(), locala.b(), locala.c());
    }
    return null;
  }
  
  public final String e()
  {
    return a.i;
  }
  
  public final double f()
  {
    return a.j;
  }
  
  public final String g()
  {
    return a.k;
  }
  
  public final String h()
  {
    return a.l;
  }
  
  public final void i() {}
  
  public final boolean j()
  {
    return a.c();
  }
  
  public final boolean k()
  {
    return a.d();
  }
  
  public final Bundle l()
  {
    return a.e();
  }
  
  public final jf m()
  {
    if (a.m != null) {
      return a.m.a();
    }
    return null;
  }
  
  public final a n()
  {
    View localView = a.f();
    if (localView == null) {
      return null;
    }
    return b.a(localView);
  }
}


/* Location:              com/google/android/gms/b/ol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */