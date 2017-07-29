package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.p;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class x$a
  implements j, c.b, c.c
{
  final a.f a;
  final n b;
  final Set c;
  final Map d;
  final int e;
  final ao f;
  boolean g;
  private final Queue i;
  private final a.c j;
  private final wn k;
  private com.google.android.gms.common.a l;
  
  public x$a(x paramx, com.google.android.gms.common.api.n paramn)
  {
    Object localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    i = ((Queue)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    c = ((Set)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    d = ((Map)localObject);
    l = null;
    localObject = x.a(paramx).getLooper();
    localObject = paramn.a((Looper)localObject, this);
    a = ((a.f)localObject);
    localObject = a;
    boolean bool1 = localObject instanceof h;
    if (bool1)
    {
      localObject = a).a;
      j = ((a.c)localObject);
      localObject = b;
      k = ((wn)localObject);
      localObject = new com/google/android/gms/b/n;
      ((n)localObject).<init>();
      b = ((n)localObject);
      int m = d;
      e = m;
      localObject = a;
      boolean bool2 = ((a.f)localObject).d();
      if (!bool2) {
        break label226;
      }
      localObject = x.b(paramx);
      localHandler = x.a(paramx);
      localObject = paramn.a((Context)localObject, localHandler);
    }
    label226:
    for (f = ((ao)localObject);; f = null)
    {
      return;
      localObject = a;
      j = ((a.c)localObject);
      break;
    }
  }
  
  private void b(wl paramwl)
  {
    n localn = b;
    boolean bool = j();
    paramwl.a(localn, bool);
    try
    {
      paramwl.a(this);
      return;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      for (;;)
      {
        int m = 1;
        a(m);
        a.f localf = a;
        localf.a();
      }
    }
  }
  
  private void b(com.google.android.gms.common.a parama)
  {
    Object localObject = c;
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (d)localIterator.next();
      wn localwn = k;
      ((d)localObject).a(localwn, parama);
    }
    c.clear();
  }
  
  final void a()
  {
    d();
    Object localObject1 = com.google.android.gms.common.a.a;
    b((com.google.android.gms.common.a)localObject1);
    f();
    localObject1 = d.values().iterator();
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      if (bool1) {
        ((Iterator)localObject1).next();
      }
      try
      {
        com.google.android.gms.c.c localc = new com/google/android/gms/c/c;
        localc.<init>();
      }
      catch (DeadObjectException localDeadObjectException)
      {
        int m = 1;
        a(m);
        Object localObject2 = a;
        ((a.f)localObject2).a();
        for (;;)
        {
          localObject2 = a;
          boolean bool2 = ((a.f)localObject2).b();
          if (!bool2) {
            break;
          }
          localObject2 = i;
          bool2 = ((Queue)localObject2).isEmpty();
          if (bool2) {
            break;
          }
          localObject2 = (wl)i.remove();
          b((wl)localObject2);
        }
        g();
        return;
      }
      catch (RemoteException localRemoteException) {}
    }
  }
  
  public final void a(int paramInt)
  {
    Object localObject1 = Looper.myLooper();
    Object localObject2 = x.a(h).getLooper();
    if (localObject1 == localObject2) {
      b();
    }
    for (;;)
    {
      return;
      localObject1 = x.a(h);
      localObject2 = new com/google/android/gms/b/x$a$2;
      ((x.a.2)localObject2).<init>(this);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    Object localObject1 = Looper.myLooper();
    Object localObject2 = x.a(h).getLooper();
    if (localObject1 == localObject2) {
      a();
    }
    for (;;)
    {
      return;
      localObject1 = x.a(h);
      localObject2 = new com/google/android/gms/b/x$a$1;
      ((x.a.1)localObject2).<init>(this);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
  }
  
  public final void a(wl paramwl)
  {
    com.google.android.gms.common.internal.c.a(x.a(h));
    Object localObject = a;
    boolean bool = ((a.f)localObject).b();
    if (bool)
    {
      b(paramwl);
      g();
    }
    for (;;)
    {
      return;
      i.add(paramwl);
      localObject = l;
      if (localObject != null)
      {
        localObject = l;
        bool = ((com.google.android.gms.common.a)localObject).a();
        if (bool)
        {
          localObject = l;
          a((com.google.android.gms.common.a)localObject);
          continue;
        }
      }
      h();
    }
  }
  
  public final void a(com.google.android.gms.common.a parama)
  {
    com.google.android.gms.common.internal.c.a(x.a(h));
    Object localObject1 = f;
    if (localObject1 != null)
    {
      localObject1 = f.g;
      ((ec)localObject1).a();
    }
    d();
    localObject1 = h;
    x.a((x)localObject1, -1);
    b(parama);
    int m = c;
    int i1 = 4;
    if (m == i1)
    {
      localObject1 = x.c();
      a((Status)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = i;
      boolean bool1 = ((Queue)localObject1).isEmpty();
      if (bool1)
      {
        l = parama;
      }
      else
      {
        Object localObject5;
        int i2;
        synchronized (x.d())
        {
          localObject1 = h;
          localObject1 = x.e((x)localObject1);
          if (localObject1 != null)
          {
            localObject1 = h;
            localObject1 = x.f((x)localObject1);
            localObject5 = k;
            bool1 = ((Set)localObject1).contains(localObject5);
            if (bool1)
            {
              localObject1 = h;
              localObject1 = x.e((x)localObject1);
              i2 = e;
              ((o)localObject1).b(parama, i2);
            }
          }
        }
        Object localObject3 = h;
        i1 = e;
        bool1 = ((x)localObject3).a(parama, i1);
        if (!bool1)
        {
          int n = c;
          i1 = 18;
          if (n == i1)
          {
            n = 1;
            g = n;
          }
          boolean bool2 = g;
          Object localObject6;
          if (bool2)
          {
            localObject3 = x.a(h);
            ??? = x.a(h);
            i2 = 9;
            localObject6 = k;
            ??? = Message.obtain((Handler)???, i2, localObject6);
            localObject5 = h;
            long l1 = x.c((x)localObject5);
            ((Handler)localObject3).sendMessageDelayed((Message)???, l1);
          }
          else
          {
            localObject3 = new com/google/android/gms/common/api/Status;
            i1 = 17;
            localObject5 = String.valueOf(k.a.a);
            int i3 = String.valueOf(localObject5).length() + 38;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>(i3);
            localObject5 = localStringBuilder.append("API: ").append((String)localObject5);
            localObject6 = " is not available on this device.";
            localObject5 = (String)localObject6;
            ((Status)localObject3).<init>(i1, (String)localObject5);
            a((Status)localObject3);
          }
        }
      }
    }
  }
  
  public final void a(com.google.android.gms.common.a parama, com.google.android.gms.common.api.a parama1, boolean paramBoolean)
  {
    Object localObject1 = Looper.myLooper();
    Object localObject2 = x.a(h).getLooper();
    if (localObject1 == localObject2) {
      a(parama);
    }
    for (;;)
    {
      return;
      localObject1 = x.a(h);
      localObject2 = new com/google/android/gms/b/x$a$3;
      ((x.a.3)localObject2).<init>(this, parama);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
  }
  
  public final void a(Status paramStatus)
  {
    com.google.android.gms.common.internal.c.a(x.a(h));
    Object localObject = i;
    Iterator localIterator = ((Queue)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (wl)localIterator.next();
      ((wl)localObject).a(paramStatus);
    }
    i.clear();
  }
  
  final void b()
  {
    boolean bool = true;
    d();
    g = bool;
    Object localObject1 = b;
    Object localObject2 = at.a;
    ((n)localObject1).a(bool, (Status)localObject2);
    localObject1 = x.a(h);
    localObject2 = x.a(h);
    wn localwn = k;
    localObject2 = Message.obtain((Handler)localObject2, 9, localwn);
    long l1 = x.c(h);
    ((Handler)localObject1).sendMessageDelayed((Message)localObject2, l1);
    localObject1 = x.a(h);
    localObject2 = x.a(h);
    localwn = k;
    localObject2 = Message.obtain((Handler)localObject2, 11, localwn);
    l1 = x.d(h);
    ((Handler)localObject1).sendMessageDelayed((Message)localObject2, l1);
    x.a(h, -1);
  }
  
  public final void c()
  {
    com.google.android.gms.common.internal.c.a(x.a(h));
    Object localObject1 = x.a;
    a((Status)localObject1);
    localObject1 = b;
    Object localObject2 = x.a;
    ((n)localObject1).a(false, (Status)localObject2);
    localObject1 = d.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (ah.a)localIterator.next();
      localObject2 = new com/google/android/gms/b/wl$c;
      com.google.android.gms.c.c localc = new com/google/android/gms/c/c;
      localc.<init>();
      ((wl.c)localObject2).<init>((ah.a)localObject1, localc);
      a((wl)localObject2);
    }
    localObject1 = new com/google/android/gms/common/a;
    ((com.google.android.gms.common.a)localObject1).<init>(4);
    b((com.google.android.gms.common.a)localObject1);
    a.a();
  }
  
  public final void d()
  {
    com.google.android.gms.common.internal.c.a(x.a(h));
    l = null;
  }
  
  public final com.google.android.gms.common.a e()
  {
    com.google.android.gms.common.internal.c.a(x.a(h));
    return l;
  }
  
  final void f()
  {
    boolean bool = g;
    if (bool)
    {
      Handler localHandler = x.a(h);
      wn localwn = k;
      localHandler.removeMessages(11, localwn);
      localHandler = x.a(h);
      int m = 9;
      localwn = k;
      localHandler.removeMessages(m, localwn);
      bool = false;
      localHandler = null;
      g = false;
    }
  }
  
  final void g()
  {
    int m = 12;
    Handler localHandler = x.a(h);
    Object localObject = k;
    localHandler.removeMessages(m, localObject);
    localHandler = x.a(h);
    localObject = x.a(h);
    wn localwn = k;
    localObject = ((Handler)localObject).obtainMessage(m, localwn);
    long l1 = x.h(h);
    localHandler.sendMessageDelayed((Message)localObject, l1);
  }
  
  public final void h()
  {
    Context localContext = null;
    com.google.android.gms.common.internal.c.a(x.a(h));
    Object localObject1 = a;
    boolean bool1 = ((a.f)localObject1).b();
    if (!bool1)
    {
      localObject1 = a;
      bool1 = ((a.f)localObject1).c();
      if (!bool1) {
        break label45;
      }
    }
    for (;;)
    {
      return;
      label45:
      localObject1 = h;
      int m = x.i((x)localObject1);
      if (m == 0) {
        break;
      }
      localObject1 = h;
      localObject2 = x.g(h);
      localObject3 = x.b(h);
      int n = ((com.google.android.gms.common.c)localObject2).a((Context)localObject3);
      x.a((x)localObject1, n);
      localObject1 = h;
      m = x.i((x)localObject1);
      if (m == 0) {
        break;
      }
      localObject1 = new com/google/android/gms/common/a;
      localObject2 = h;
      n = x.i((x)localObject2);
      ((com.google.android.gms.common.a)localObject1).<init>(n, null);
      a((com.google.android.gms.common.a)localObject1);
    }
    x.b localb = new com/google/android/gms/b/x$b;
    localObject1 = h;
    Object localObject2 = a;
    Object localObject3 = k;
    localb.<init>((x)localObject1, (a.f)localObject2, (wn)localObject3);
    localObject1 = a;
    boolean bool2 = ((a.f)localObject1).d();
    ao localao;
    if (bool2)
    {
      localao = f;
      localObject1 = g;
      if (localObject1 != null)
      {
        localObject1 = g;
        ((ec)localObject1).a();
      }
      bool2 = d;
      if (bool2)
      {
        localObject1 = com.google.android.gms.auth.api.signin.a.d.a(a);
        localObject2 = ((com.google.android.gms.auth.api.signin.a.d)localObject1).c("defaultGoogleSignInAccount");
        localObject2 = ((com.google.android.gms.auth.api.signin.a.d)localObject1).b((String)localObject2);
        if (localObject2 != null) {
          break label416;
        }
        localObject1 = new java/util/HashSet;
        ((HashSet)localObject1).<init>();
      }
    }
    for (;;)
    {
      e = ((Set)localObject1);
      localObject1 = new com/google/android/gms/common/internal/p;
      localObject2 = e;
      ed localed1 = null;
      ed localed2 = ed.a;
      localObject3 = null;
      ((p)localObject1).<init>(null, (Set)localObject2, null, 0, null, null, null, localed2);
      f = ((p)localObject1);
      localObject1 = c;
      localContext = a;
      localObject2 = b.getLooper();
      localObject3 = f;
      localed1 = f.g;
      localObject1 = (ec)((a.b)localObject1).a(localContext, (Looper)localObject2, (p)localObject3, localed1, localao, localao);
      g = ((ec)localObject1);
      h = localb;
      localObject1 = g;
      ((ec)localObject1).i();
      localObject1 = a;
      ((a.f)localObject1).a(localb);
      break;
      label416:
      localObject1 = new java/util/HashSet;
      localObject2 = ((GoogleSignInOptions)localObject2).a();
      ((HashSet)localObject1).<init>((Collection)localObject2);
    }
  }
  
  final boolean i()
  {
    return a.b();
  }
  
  public final boolean j()
  {
    return a.d();
  }
}


/* Location:              com/google/android/gms/b/x$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */