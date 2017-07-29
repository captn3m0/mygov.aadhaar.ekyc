package com.google.android.gms.b;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.o.f;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.z;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class x
  implements Handler.Callback
{
  public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
  static final Object b = new Object();
  private static final Status j = new Status(4, "The user must be signed in to make this API call.");
  private static x n;
  final Context c;
  public final AtomicInteger d = new AtomicInteger(1);
  public final AtomicInteger e = new AtomicInteger(0);
  final Map<wn<?>, a<?>> f = new ConcurrentHashMap(5, 0.75F, 1);
  o g = null;
  final Set<wn<?>> h = new com.google.android.gms.common.util.a();
  public final Handler i;
  private long k = 5000L;
  private long l = 120000L;
  private long m = 10000L;
  private final com.google.android.gms.common.c o;
  private int p = -1;
  private final Set<wn<?>> q = new com.google.android.gms.common.util.a();
  
  private x(Context paramContext, Looper paramLooper, com.google.android.gms.common.c paramc)
  {
    c = paramContext;
    i = new Handler(paramLooper, this);
    o = paramc;
    i.sendMessage(i.obtainMessage(6));
  }
  
  public static x a()
  {
    synchronized (b)
    {
      com.google.android.gms.common.internal.c.a(n, "Must guarantee manager is non-null before using getInstance");
      x localx = n;
      return localx;
    }
  }
  
  public static x a(Context paramContext)
  {
    synchronized (b)
    {
      if (n == null)
      {
        Object localObject2 = new HandlerThread("GoogleApiHandler", 9);
        ((HandlerThread)localObject2).start();
        localObject2 = ((HandlerThread)localObject2).getLooper();
        n = new x(paramContext.getApplicationContext(), (Looper)localObject2, com.google.android.gms.common.c.a());
      }
      paramContext = n;
      return paramContext;
    }
  }
  
  private void b(com.google.android.gms.common.api.n<?> paramn)
  {
    wn localwn = b;
    a locala2 = (a)f.get(localwn);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = new a(paramn);
      f.put(localwn, locala1);
    }
    if (locala1.j()) {
      q.add(localwn);
    }
    locala1.h();
  }
  
  private void e()
  {
    Iterator localIterator = q.iterator();
    while (localIterator.hasNext())
    {
      wn localwn = (wn)localIterator.next();
      ((a)f.remove(localwn)).c();
    }
    q.clear();
  }
  
  public final void a(com.google.android.gms.common.api.n<?> paramn)
  {
    i.sendMessage(i.obtainMessage(7, paramn));
  }
  
  final boolean a(com.google.android.gms.common.a parama, int paramInt)
  {
    return o.a(c, parama, paramInt);
  }
  
  public final void b()
  {
    i.sendMessage(i.obtainMessage(3));
  }
  
  public final void b(com.google.android.gms.common.a parama, int paramInt)
  {
    if (!a(parama, paramInt)) {
      i.sendMessage(i.obtainMessage(5, paramInt, 0, parama));
    }
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    int i2 = 0;
    int i1 = 0;
    Object localObject1;
    Object localObject2;
    a locala;
    switch (what)
    {
    default: 
      i1 = what;
      Log.w("GoogleApiManager", 31 + "Unknown message id: " + i1);
      return false;
    case 1: 
      if (((Boolean)obj).booleanValue()) {}
      for (long l1 = 10000L;; l1 = 300000L)
      {
        m = l1;
        i.removeMessages(12);
        paramMessage = f.keySet().iterator();
        while (paramMessage.hasNext())
        {
          localObject1 = (wn)paramMessage.next();
          i.sendMessageDelayed(i.obtainMessage(12, localObject1), m);
        }
      }
    case 2: 
      paramMessage = (d)obj;
      localObject1 = a.keySet().iterator();
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (wn)((Iterator)localObject1).next();
        locala = (a)f.get(localObject2);
        if (locala != null) {
          break label295;
        }
        paramMessage.a((wn)localObject2, new com.google.android.gms.common.a(13));
      }
    case 3: 
    case 4: 
    case 8: 
    case 13: 
      for (;;)
      {
        return true;
        if (locala.i())
        {
          paramMessage.a((wn)localObject2, com.google.android.gms.common.a.a);
          break;
        }
        if (locala.e() != null)
        {
          paramMessage.a((wn)localObject2, locala.e());
          break;
        }
        com.google.android.gms.common.internal.c.a(h.i);
        c.add(paramMessage);
        break;
        paramMessage = f.values().iterator();
        while (paramMessage.hasNext())
        {
          localObject1 = (a)paramMessage.next();
          ((a)localObject1).d();
          ((a)localObject1).h();
        }
        localObject2 = (aj)obj;
        localObject1 = (a)f.get(c.b);
        paramMessage = (Message)localObject1;
        if (localObject1 == null)
        {
          b(c);
          paramMessage = (a)f.get(c.b);
        }
        if ((paramMessage.j()) && (e.get() != b))
        {
          a.a(a);
          paramMessage.c();
        }
        else
        {
          paramMessage.a(a);
        }
      }
    case 5: 
      label295:
      i1 = arg1;
      localObject1 = (com.google.android.gms.common.a)obj;
      localObject2 = f.values().iterator();
      do
      {
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
        paramMessage = (a)((Iterator)localObject2).next();
      } while (e != i1);
    }
    for (;;)
    {
      if (paramMessage != null)
      {
        localObject2 = String.valueOf(o.c(c));
        localObject1 = String.valueOf(e);
        paramMessage.a(new Status(17, String.valueOf(localObject2).length() + 69 + String.valueOf(localObject1).length() + "Error resolution was canceled by the user, original error message: " + (String)localObject2 + ": " + (String)localObject1));
        break;
      }
      Log.wtf("GoogleApiManager", 76 + "Could not find API instance " + i1 + " while trying to fail enqueued calls.", new Exception());
      break;
      i2 = Build.VERSION.SDK_INT;
      if (!(c.getApplicationContext() instanceof Application)) {
        break;
      }
      e.a((Application)c.getApplicationContext());
      e.a().a(new e.a()
      {
        public final void a(boolean paramAnonymousBoolean)
        {
          x.a(x.this).sendMessage(x.a(x.this).obtainMessage(1, Boolean.valueOf(paramAnonymousBoolean)));
        }
      });
      paramMessage = e.a();
      if (!b.get())
      {
        if (Build.VERSION.SDK_INT >= 16) {
          i1 = 1;
        }
        if (i1 == 0) {
          break label873;
        }
        localObject1 = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState((ActivityManager.RunningAppProcessInfo)localObject1);
        if ((!b.getAndSet(true)) && (importance > 100)) {
          a.set(true);
        }
      }
      label873:
      for (boolean bool = a.get(); !bool; bool = true)
      {
        m = 300000L;
        break;
      }
      b((com.google.android.gms.common.api.n)obj);
      break;
      if (!f.containsKey(obj)) {
        break;
      }
      paramMessage = (a)f.get(obj);
      com.google.android.gms.common.internal.c.a(h.i);
      if (!g) {
        break;
      }
      paramMessage.h();
      break;
      e();
      break;
      if (!f.containsKey(obj)) {
        break;
      }
      localObject1 = (a)f.get(obj);
      com.google.android.gms.common.internal.c.a(h.i);
      if (!g) {
        break;
      }
      ((a)localObject1).f();
      if (h.o.a(h.c) == 18) {}
      for (paramMessage = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");; paramMessage = new Status(8, "API failed to connect while resuming due to an unknown error."))
      {
        ((a)localObject1).a(paramMessage);
        a.a();
        break;
      }
      if (!f.containsKey(obj)) {
        break;
      }
      paramMessage = (a)f.get(obj);
      com.google.android.gms.common.internal.c.a(h.i);
      if ((!a.b()) || (d.size() != 0)) {
        break;
      }
      localObject1 = b;
      if (a.isEmpty())
      {
        i1 = i2;
        if (b.isEmpty()) {}
      }
      else
      {
        i1 = 1;
      }
      if (i1 != 0)
      {
        paramMessage.g();
        break;
      }
      a.a();
      break;
      paramMessage = null;
    }
  }
  
  public final class a<O extends a.a>
    implements j, c.b, c.c
  {
    final a.f a;
    final n b;
    final Set<d> c = new HashSet();
    final Map<ah.a<?>, al> d = new HashMap();
    final int e;
    final ao f;
    boolean g;
    private final Queue<wl> i = new LinkedList();
    private final a.c j;
    private final wn<O> k;
    private com.google.android.gms.common.a l = null;
    
    public a()
    {
      Object localObject;
      a = ((com.google.android.gms.common.api.n)localObject).a(x.a(x.this).getLooper(), this);
      if ((a instanceof h)) {}
      for (j = a).a;; j = a)
      {
        k = b;
        b = new n();
        e = d;
        if (!a.d()) {
          break;
        }
        f = ((com.google.android.gms.common.api.n)localObject).a(x.b(x.this), x.a(x.this));
        return;
      }
      f = null;
    }
    
    private void b(wl paramwl)
    {
      paramwl.a(b, j());
      try
      {
        paramwl.a(this);
        return;
      }
      catch (DeadObjectException paramwl)
      {
        a(1);
        a.a();
      }
    }
    
    private void b(com.google.android.gms.common.a parama)
    {
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext()) {
        ((d)localIterator.next()).a(k, parama);
      }
      c.clear();
    }
    
    final void a()
    {
      d();
      b(com.google.android.gms.common.a.a);
      f();
      Iterator localIterator = d.values().iterator();
      for (;;)
      {
        if (localIterator.hasNext()) {
          localIterator.next();
        }
        try
        {
          new com.google.android.gms.c.c();
        }
        catch (DeadObjectException localDeadObjectException)
        {
          a(1);
          a.a();
          while ((a.b()) && (!i.isEmpty())) {
            b((wl)i.remove());
          }
          g();
          return;
        }
        catch (RemoteException localRemoteException) {}
      }
    }
    
    public final void a(int paramInt)
    {
      if (Looper.myLooper() == x.a(x.this).getLooper())
      {
        b();
        return;
      }
      x.a(x.this).post(new Runnable()
      {
        public final void run()
        {
          b();
        }
      });
    }
    
    public final void a(Bundle paramBundle)
    {
      if (Looper.myLooper() == x.a(x.this).getLooper())
      {
        a();
        return;
      }
      x.a(x.this).post(new Runnable()
      {
        public final void run()
        {
          a();
        }
      });
    }
    
    public final void a(wl paramwl)
    {
      com.google.android.gms.common.internal.c.a(x.a(x.this));
      if (a.b())
      {
        b(paramwl);
        g();
        return;
      }
      i.add(paramwl);
      if ((l != null) && (l.a()))
      {
        a(l);
        return;
      }
      h();
    }
    
    public final void a(com.google.android.gms.common.a parama)
    {
      com.google.android.gms.common.internal.c.a(x.a(x.this));
      if (f != null) {
        f.g.a();
      }
      d();
      x.a(x.this, -1);
      b(parama);
      if (c == 4) {
        a(x.c());
      }
      do
      {
        return;
        if (i.isEmpty())
        {
          l = parama;
          return;
        }
        synchronized (x.d())
        {
          if ((x.e(x.this) != null) && (x.f(x.this).contains(k)))
          {
            x.e(x.this).b(parama, e);
            return;
          }
        }
      } while (a(parama, e));
      if (c == 18) {
        g = true;
      }
      if (g)
      {
        x.a(x.this).sendMessageDelayed(Message.obtain(x.a(x.this), 9, k), x.c(x.this));
        return;
      }
      parama = String.valueOf(k.a.a);
      a(new Status(17, String.valueOf(parama).length() + 38 + "API: " + parama + " is not available on this device."));
    }
    
    public final void a(final com.google.android.gms.common.a parama, com.google.android.gms.common.api.a<?> parama1, boolean paramBoolean)
    {
      if (Looper.myLooper() == x.a(x.this).getLooper())
      {
        a(parama);
        return;
      }
      x.a(x.this).post(new Runnable()
      {
        public final void run()
        {
          a(parama);
        }
      });
    }
    
    public final void a(Status paramStatus)
    {
      com.google.android.gms.common.internal.c.a(x.a(x.this));
      Iterator localIterator = i.iterator();
      while (localIterator.hasNext()) {
        ((wl)localIterator.next()).a(paramStatus);
      }
      i.clear();
    }
    
    final void b()
    {
      d();
      g = true;
      b.a(true, at.a);
      x.a(x.this).sendMessageDelayed(Message.obtain(x.a(x.this), 9, k), x.c(x.this));
      x.a(x.this).sendMessageDelayed(Message.obtain(x.a(x.this), 11, k), x.d(x.this));
      x.a(x.this, -1);
    }
    
    public final void c()
    {
      com.google.android.gms.common.internal.c.a(x.a(x.this));
      a(x.a);
      b.a(false, x.a);
      Iterator localIterator = d.keySet().iterator();
      while (localIterator.hasNext()) {
        a(new wl.c((ah.a)localIterator.next(), new com.google.android.gms.c.c()));
      }
      b(new com.google.android.gms.common.a(4));
      a.a();
    }
    
    public final void d()
    {
      com.google.android.gms.common.internal.c.a(x.a(x.this));
      l = null;
    }
    
    public final com.google.android.gms.common.a e()
    {
      com.google.android.gms.common.internal.c.a(x.a(x.this));
      return l;
    }
    
    final void f()
    {
      if (g)
      {
        x.a(x.this).removeMessages(11, k);
        x.a(x.this).removeMessages(9, k);
        g = false;
      }
    }
    
    final void g()
    {
      x.a(x.this).removeMessages(12, k);
      x.a(x.this).sendMessageDelayed(x.a(x.this).obtainMessage(12, k), x.h(x.this));
    }
    
    public final void h()
    {
      com.google.android.gms.common.internal.c.a(x.a(x.this));
      if ((a.b()) || (a.c())) {
        return;
      }
      if (x.i(x.this) != 0)
      {
        x.a(x.this, x.g(x.this).a(x.b(x.this)));
        if (x.i(x.this) != 0)
        {
          a(new com.google.android.gms.common.a(x.i(x.this), null));
          return;
        }
      }
      x.b localb = new x.b(x.this, a, k);
      ao localao;
      if (a.d())
      {
        localao = f;
        if (g != null) {
          g.a();
        }
        if (d)
        {
          localObject = com.google.android.gms.auth.api.signin.a.d.a(a);
          localObject = ((com.google.android.gms.auth.api.signin.a.d)localObject).b(((com.google.android.gms.auth.api.signin.a.d)localObject).c("defaultGoogleSignInAccount"));
          if (localObject != null) {
            break label284;
          }
        }
      }
      label284:
      for (Object localObject = new HashSet();; localObject = new HashSet(((GoogleSignInOptions)localObject).a()))
      {
        e = ((Set)localObject);
        f = new p(null, e, null, 0, null, null, null, ed.a);
        g = ((ec)c.a(a, b.getLooper(), f, f.g, localao, localao));
        h = localb;
        g.i();
        a.a(localb);
        return;
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
  
  private final class b
    implements ao.a, o.f
  {
    final a.f a;
    final wn<?> b;
    boolean c = false;
    private z e = null;
    private Set<Scope> f = null;
    
    public b(wn<?> paramwn)
    {
      a = paramwn;
      wn localwn;
      b = localwn;
    }
    
    final void a()
    {
      if ((c) && (e != null)) {
        a.a(e, f);
      }
    }
    
    public final void a(final com.google.android.gms.common.a parama)
    {
      x.a(x.this).post(new Runnable()
      {
        public final void run()
        {
          if (parama.b())
          {
            c = true;
            if (a.d())
            {
              a();
              return;
            }
            a.a(null, Collections.emptySet());
            return;
          }
          ((x.a)x.j(x.this).get(b)).a(parama);
        }
      });
    }
    
    public final void a(z paramz, Set<Scope> paramSet)
    {
      if ((paramz == null) || (paramSet == null))
      {
        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
        b(new com.google.android.gms.common.a(4));
        return;
      }
      e = paramz;
      f = paramSet;
      a();
    }
    
    public final void b(com.google.android.gms.common.a parama)
    {
      x.a locala = (x.a)x.j(x.this).get(b);
      com.google.android.gms.common.internal.c.a(x.a(h));
      a.a();
      locala.a(parama);
    }
  }
}


/* Location:              com/google/android/gms/b/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */