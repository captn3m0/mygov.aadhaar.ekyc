package com.google.android.gms.b;

import android.graphics.drawable.Drawable;
import android.net.Uri;
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
    ArrayList localArrayList;
    boolean bool;
    if (localObject != null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = ((List)localObject).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (b.a)localIterator.next();
        kv localkv = new com/google/android/gms/b/kv;
        Drawable localDrawable = ((b.a)localObject).a();
        Uri localUri = ((b.a)localObject).b();
        double d = ((b.a)localObject).c();
        localkv.<init>(localDrawable, localUri, d);
        localArrayList.add(localkv);
      }
    }
    for (localObject = localArrayList;; localObject = null)
    {
      return (List)localObject;
      bool = false;
    }
  }
  
  public final void b(a parama)
  {
    k localk = a;
    View localView = (View)b.a(parama);
    localk.a(localView);
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
    Object localObject = a;
    b.a locala = h;
    if (locala != null)
    {
      localObject = new com/google/android/gms/b/kv;
      Drawable localDrawable = locala.a();
      Uri localUri = locala.b();
      double d = locala.c();
      ((kv)localObject).<init>(localDrawable, localUri, d);
    }
    for (;;)
    {
      return (lh)localObject;
      localObject = null;
    }
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
    Object localObject = a.f();
    if (localObject == null) {}
    for (localObject = null;; localObject = b.a(localObject)) {
      return (a)localObject;
    }
  }
  
  public final jf l()
  {
    Object localObject = a.k;
    if (localObject != null) {}
    for (localObject = a.k.a();; localObject = null) {
      return (jf)localObject;
    }
  }
}


/* Location:              com/google/android/gms/b/om.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */