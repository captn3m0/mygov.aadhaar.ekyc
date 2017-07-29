package com.google.android.gms.b;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class x
  implements Handler.Callback
{
  public static final Status a;
  static final Object b;
  private static final Status j;
  private static x n;
  final Context c;
  public final AtomicInteger d;
  public final AtomicInteger e;
  final Map f;
  o g;
  final Set h;
  public final Handler i;
  private long k = 5000L;
  private long l = 120000L;
  private long m = 10000L;
  private final com.google.android.gms.common.c o;
  private int p = -1;
  private final Set q;
  
  static
  {
    int i1 = 4;
    Object localObject = new com/google/android/gms/common/api/Status;
    ((Status)localObject).<init>(i1, "Sign-out occurred while this API call was in progress.");
    a = (Status)localObject;
    localObject = new com/google/android/gms/common/api/Status;
    ((Status)localObject).<init>(i1, "The user must be signed in to make this API call.");
    j = (Status)localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    b = localObject;
  }
  
  private x(Context paramContext, Looper paramLooper, com.google.android.gms.common.c paramc)
  {
    Object localObject = new java/util/concurrent/atomic/AtomicInteger;
    ((AtomicInteger)localObject).<init>(i1);
    d = ((AtomicInteger)localObject);
    localObject = new java/util/concurrent/atomic/AtomicInteger;
    ((AtomicInteger)localObject).<init>(0);
    e = ((AtomicInteger)localObject);
    localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>(5, 0.75F, i1);
    f = ((Map)localObject);
    g = null;
    localObject = new com/google/android/gms/common/util/a;
    ((com.google.android.gms.common.util.a)localObject).<init>();
    h = ((Set)localObject);
    localObject = new com/google/android/gms/common/util/a;
    ((com.google.android.gms.common.util.a)localObject).<init>();
    q = ((Set)localObject);
    c = paramContext;
    localObject = new android/os/Handler;
    ((Handler)localObject).<init>(paramLooper, this);
    i = ((Handler)localObject);
    o = paramc;
    localObject = i;
    Message localMessage = i.obtainMessage(6);
    ((Handler)localObject).sendMessage(localMessage);
  }
  
  public static x a()
  {
    synchronized (b)
    {
      x localx = n;
      String str = "Must guarantee manager is non-null before using getInstance";
      com.google.android.gms.common.internal.c.a(localx, str);
      localx = n;
      return localx;
    }
  }
  
  public static x a(Context paramContext)
  {
    synchronized (b)
    {
      Object localObject2 = n;
      if (localObject2 == null)
      {
        localObject2 = new android/os/HandlerThread;
        Object localObject4 = "GoogleApiHandler";
        int i1 = 9;
        ((HandlerThread)localObject2).<init>((String)localObject4, i1);
        ((HandlerThread)localObject2).start();
        localObject2 = ((HandlerThread)localObject2).getLooper();
        localObject4 = new com/google/android/gms/b/x;
        Context localContext = paramContext.getApplicationContext();
        com.google.android.gms.common.c localc = com.google.android.gms.common.c.a();
        ((x)localObject4).<init>(localContext, (Looper)localObject2, localc);
        n = (x)localObject4;
      }
      localObject2 = n;
      return (x)localObject2;
    }
  }
  
  private void b(com.google.android.gms.common.api.n paramn)
  {
    wn localwn = b;
    x.a locala = (x.a)f.get(localwn);
    Object localObject;
    if (locala == null)
    {
      locala = new com/google/android/gms/b/x$a;
      locala.<init>(this, paramn);
      localObject = f;
      ((Map)localObject).put(localwn, locala);
    }
    boolean bool = locala.j();
    if (bool)
    {
      localObject = q;
      ((Set)localObject).add(localwn);
    }
    locala.h();
  }
  
  private void e()
  {
    Object localObject = q;
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (wn)localIterator.next();
      Map localMap = f;
      localObject = (x.a)localMap.remove(localObject);
      ((x.a)localObject).c();
    }
    q.clear();
  }
  
  public final void a(com.google.android.gms.common.api.n paramn)
  {
    Handler localHandler = i;
    Message localMessage = i.obtainMessage(7, paramn);
    localHandler.sendMessage(localMessage);
  }
  
  final boolean a(com.google.android.gms.common.a parama, int paramInt)
  {
    com.google.android.gms.common.c localc = o;
    Context localContext = c;
    return localc.a(localContext, parama, paramInt);
  }
  
  public final void b()
  {
    Handler localHandler = i;
    Message localMessage = i.obtainMessage(3);
    localHandler.sendMessage(localMessage);
  }
  
  public final void b(com.google.android.gms.common.a parama, int paramInt)
  {
    boolean bool = a(parama, paramInt);
    if (!bool)
    {
      Handler localHandler = i;
      Object localObject = i;
      int i1 = 5;
      localObject = ((Handler)localObject).obtainMessage(i1, paramInt, 0, parama);
      localHandler.sendMessage((Message)localObject);
    }
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    long l1 = 300000L;
    int i1 = 12;
    int i2 = 8;
    boolean bool3 = false;
    Object localObject1 = null;
    int i7 = 1;
    int i8 = what;
    int i13;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    boolean bool5;
    label319:
    label398:
    boolean bool1;
    Object localObject5;
    int i11;
    int i14;
    switch (i8)
    {
    default: 
      int i10 = what;
      i13 = 31;
      StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
      localStringBuilder1.<init>(i13);
      localObject2 = localStringBuilder1.append("Unknown message id: ");
      localObject3 = i10;
      Log.w("GoogleApiManager", (String)localObject3);
      i8 = 0;
      localObject4 = null;
      return i8;
    case 1: 
      localObject4 = (Boolean)obj;
      bool5 = ((Boolean)localObject4).booleanValue();
      if (bool5) {}
      for (long l2 = 10000L;; l2 = l1)
      {
        m = l2;
        i.removeMessages(i1);
        localObject4 = f.keySet();
        localObject1 = ((Set)localObject4).iterator();
        for (;;)
        {
          bool5 = ((Iterator)localObject1).hasNext();
          if (!bool5) {
            break;
          }
          localObject4 = (wn)((Iterator)localObject1).next();
          localObject3 = i;
          localObject2 = i;
          localObject4 = ((Handler)localObject2).obtainMessage(i1, localObject4);
          long l3 = m;
          ((Handler)localObject3).sendMessageDelayed((Message)localObject4, l3);
        }
      }
    case 2: 
      localObject4 = (d)obj;
      localObject1 = a.keySet();
      localObject2 = ((Set)localObject1).iterator();
      bool3 = ((Iterator)localObject2).hasNext();
      if (bool3)
      {
        localObject1 = (wn)((Iterator)localObject2).next();
        localObject3 = (x.a)f.get(localObject1);
        if (localObject3 != null) {
          break label398;
        }
        localObject3 = new com/google/android/gms/common/a;
        i13 = 13;
        ((com.google.android.gms.common.a)localObject3).<init>(i13);
        ((d)localObject4).a((wn)localObject1, (com.google.android.gms.common.a)localObject3);
      }
    case 3: 
    case 4: 
    case 8: 
    case 13: 
      for (;;)
      {
        bool5 = i7;
        break;
        bool1 = ((x.a)localObject3).i();
        if (bool1)
        {
          localObject3 = com.google.android.gms.common.a.a;
          ((d)localObject4).a((wn)localObject1, (com.google.android.gms.common.a)localObject3);
          break label319;
        }
        localObject5 = ((x.a)localObject3).e();
        if (localObject5 != null)
        {
          localObject3 = ((x.a)localObject3).e();
          ((d)localObject4).a((wn)localObject1, (com.google.android.gms.common.a)localObject3);
          break label319;
        }
        com.google.android.gms.common.internal.c.a(h.i);
        localObject1 = c;
        ((Set)localObject1).add(localObject4);
        break label319;
        localObject4 = f.values();
        localObject1 = ((Collection)localObject4).iterator();
        for (;;)
        {
          bool5 = ((Iterator)localObject1).hasNext();
          if (!bool5) {
            break;
          }
          localObject4 = (x.a)((Iterator)localObject1).next();
          ((x.a)localObject4).d();
          ((x.a)localObject4).h();
        }
        localObject4 = (aj)obj;
        localObject1 = f;
        localObject3 = c.b;
        localObject1 = (x.a)((Map)localObject1).get(localObject3);
        if (localObject1 == null)
        {
          localObject1 = c;
          b((com.google.android.gms.common.api.n)localObject1);
          localObject1 = f;
          localObject3 = c.b;
          localObject1 = (x.a)((Map)localObject1).get(localObject3);
        }
        boolean bool7 = ((x.a)localObject1).j();
        if (bool7)
        {
          localObject3 = e;
          i11 = ((AtomicInteger)localObject3).get();
          i13 = b;
          if (i11 != i13)
          {
            localObject4 = a;
            localObject3 = a;
            ((wl)localObject4).a((Status)localObject3);
            ((x.a)localObject1).c();
            continue;
          }
        }
        localObject4 = a;
        ((x.a)localObject1).a((wl)localObject4);
      }
    case 5: 
      i13 = arg1;
      localObject4 = (com.google.android.gms.common.a)obj;
      i11 = 0;
      localObject3 = null;
      localObject1 = f.values();
      localObject5 = ((Collection)localObject1).iterator();
      do
      {
        bool3 = ((Iterator)localObject5).hasNext();
        if (!bool3) {
          break;
        }
        localObject1 = (x.a)((Iterator)localObject5).next();
        i14 = e;
      } while (i14 != i13);
    }
    for (;;)
    {
      if (localObject1 != null)
      {
        localObject3 = new com/google/android/gms/common/api/Status;
        i13 = 17;
        localObject5 = o;
        i14 = c;
        localObject5 = String.valueOf(((com.google.android.gms.common.c)localObject5).c(i14));
        localObject4 = String.valueOf(e);
        i14 = String.valueOf(localObject5).length() + 69;
        int i15 = String.valueOf(localObject4).length();
        i14 += i15;
        StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
        localStringBuilder2.<init>(i14);
        localObject5 = localStringBuilder2.append("Error resolution was canceled by the user, original error message: ").append((String)localObject5);
        String str = ": ";
        localObject5 = ((StringBuilder)localObject5).append(str);
        localObject4 = (String)localObject4;
        ((Status)localObject3).<init>(i13, (String)localObject4);
        ((x.a)localObject1).a((Status)localObject3);
        break;
      }
      localObject4 = "GoogleApiManager";
      int i5 = 76;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>(i5);
      localObject1 = "Could not find API instance " + i13 + " while trying to fail enqueued calls.";
      localObject3 = new java/lang/Exception;
      ((Exception)localObject3).<init>();
      Log.wtf((String)localObject4, (String)localObject1, (Throwable)localObject3);
      break;
      int i9 = Build.VERSION.SDK_INT;
      localObject4 = c.getApplicationContext();
      boolean bool6 = localObject4 instanceof Application;
      if (!bool6) {
        break;
      }
      e.a((Application)c.getApplicationContext());
      localObject4 = e.a();
      localObject5 = new com/google/android/gms/b/x$1;
      ((x.1)localObject5).<init>(this);
      ((e)localObject4).a((e.a)localObject5);
      localObject4 = e.a();
      localObject5 = b;
      bool1 = ((AtomicBoolean)localObject5).get();
      int i4;
      if (!bool1)
      {
        int i3 = Build.VERSION.SDK_INT;
        i14 = 16;
        if (i3 >= i14) {
          i5 = i7;
        }
        if (i5 == 0) {
          break label1223;
        }
        localObject1 = new android/app/ActivityManager$RunningAppProcessInfo;
        ((ActivityManager.RunningAppProcessInfo)localObject1).<init>();
        ActivityManager.getMyMemoryState((ActivityManager.RunningAppProcessInfo)localObject1);
        localObject5 = b;
        boolean bool2 = ((AtomicBoolean)localObject5).getAndSet(i7);
        if (!bool2)
        {
          i5 = importance;
          i4 = 100;
          if (i5 > i4)
          {
            localObject1 = a;
            ((AtomicBoolean)localObject1).set(i7);
          }
        }
      }
      localObject4 = a;
      label1223:
      for (bool6 = ((AtomicBoolean)localObject4).get(); !bool6; bool6 = i7)
      {
        m = l1;
        break;
      }
      localObject4 = (com.google.android.gms.common.api.n)obj;
      b((com.google.android.gms.common.api.n)localObject4);
      break;
      localObject4 = f;
      localObject1 = obj;
      bool6 = ((Map)localObject4).containsKey(localObject1);
      if (!bool6) {
        break;
      }
      localObject4 = f;
      localObject1 = obj;
      localObject4 = (x.a)((Map)localObject4).get(localObject1);
      localObject1 = h.i;
      com.google.android.gms.common.internal.c.a((Handler)localObject1);
      boolean bool4 = g;
      if (!bool4) {
        break;
      }
      ((x.a)localObject4).h();
      break;
      e();
      break;
      localObject4 = f;
      localObject1 = obj;
      bool6 = ((Map)localObject4).containsKey(localObject1);
      if (!bool6) {
        break;
      }
      localObject4 = f;
      localObject1 = obj;
      localObject4 = (x.a)((Map)localObject4).get(localObject1);
      localObject1 = h.i;
      com.google.android.gms.common.internal.c.a((Handler)localObject1);
      bool4 = g;
      if (!bool4) {
        break;
      }
      ((x.a)localObject4).f();
      localObject1 = h.o;
      localObject3 = h.c;
      int i6 = ((com.google.android.gms.common.c)localObject1).a((Context)localObject3);
      i11 = 18;
      if (i6 == i11)
      {
        localObject1 = new com/google/android/gms/common/api/Status;
        localObject3 = "Connection timed out while waiting for Google Play services update to complete.";
        ((Status)localObject1).<init>(i4, (String)localObject3);
      }
      for (;;)
      {
        ((x.a)localObject4).a((Status)localObject1);
        localObject4 = a;
        ((a.f)localObject4).a();
        break;
        localObject1 = new com/google/android/gms/common/api/Status;
        localObject3 = "API failed to connect while resuming due to an unknown error.";
        ((Status)localObject1).<init>(i4, (String)localObject3);
      }
      localObject4 = f;
      localObject3 = obj;
      bool6 = ((Map)localObject4).containsKey(localObject3);
      if (!bool6) {
        break;
      }
      localObject4 = f;
      localObject3 = obj;
      localObject4 = (x.a)((Map)localObject4).get(localObject3);
      com.google.android.gms.common.internal.c.a(h.i);
      localObject3 = a;
      boolean bool8 = ((a.f)localObject3).b();
      if (!bool8) {
        break;
      }
      localObject3 = d;
      int i12 = ((Map)localObject3).size();
      if (i12 != 0) {
        break;
      }
      localObject3 = b;
      localObject2 = a;
      boolean bool10 = ((Map)localObject2).isEmpty();
      if (bool10)
      {
        localObject3 = b;
        boolean bool9 = ((Map)localObject3).isEmpty();
        if (bool9) {}
      }
      else
      {
        i6 = i7;
      }
      if (i6 != 0)
      {
        ((x.a)localObject4).g();
        break;
      }
      localObject4 = a;
      ((a.f)localObject4).a();
      break;
      i6 = 0;
      localObject1 = null;
    }
  }
}


/* Location:              com/google/android/gms/b/x.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */