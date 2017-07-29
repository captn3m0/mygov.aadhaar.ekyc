package com.google.android.gms.b;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.b.b.a;
import com.google.android.gms.ads.i;
import com.google.android.gms.ads.mediation.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@qi
public final class om
  extends oh.a
{
  private final k a;
  
  public om(k paramk)
  {
    a = paramk;
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
  
  public final String f()
  {
    return a.j;
  }
  
  public final void g() {}
  
  public final boolean h()
  {
    return a.c();
  }
  
  public final boolean i()
  {
    return a.d();
  }
  
  public final Bundle j()
  {
    return a.e();
  }
  
  public final a k()
  {
    View localView = a.f();
    if (localView == null) {
      return null;
    }
    return b.a(localView);
  }
  
  public final jf l()
  {
    if (a.k != null) {
      return a.k.a();
    }
    return null;
  }
}


/* Location:              com/google/android/gms/b/om.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */