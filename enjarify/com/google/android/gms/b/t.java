package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.v.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

public final class t
  extends com.google.android.gms.common.api.c
  implements ac.a
{
  ac a = null;
  final Looper b;
  final Queue c;
  z d;
  final Map e;
  Set f;
  final p g;
  final Map h;
  final a.b i;
  Set j;
  final at k;
  private final Lock l;
  private boolean m;
  private final com.google.android.gms.common.internal.v n;
  private final int o;
  private final Context p;
  private volatile boolean q;
  private long r;
  private long s;
  private final t.a t;
  private final com.google.android.gms.common.c u;
  private final ai v;
  private final ArrayList w;
  private Integer x;
  private final v.a y;
  
  public t(Context paramContext, Lock paramLock, Looper paramLooper, p paramp, com.google.android.gms.common.c paramc, a.b paramb, Map paramMap1, List paramList1, List paramList2, Map paramMap2, int paramInt1, int paramInt2, ArrayList paramArrayList)
  {
    Object localObject1 = new java/util/LinkedList;
    ((LinkedList)localObject1).<init>();
    c = ((Queue)localObject1);
    r = 120000L;
    long l1 = 5000L;
    s = l1;
    localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    f = ((Set)localObject1);
    localObject1 = new com/google/android/gms/b/ai;
    ((ai)localObject1).<init>();
    v = ((ai)localObject1);
    x = null;
    j = null;
    localObject1 = new com/google/android/gms/b/t$1;
    ((t.1)localObject1).<init>(this);
    y = ((v.a)localObject1);
    p = paramContext;
    l = paramLock;
    m = false;
    localObject1 = new com/google/android/gms/common/internal/v;
    Object localObject3 = y;
    ((com.google.android.gms.common.internal.v)localObject1).<init>(paramLooper, (v.a)localObject3);
    n = ((com.google.android.gms.common.internal.v)localObject1);
    b = paramLooper;
    localObject1 = new com/google/android/gms/b/t$a;
    ((t.a)localObject1).<init>(this, paramLooper);
    t = ((t.a)localObject1);
    u = paramc;
    o = paramInt1;
    int i1 = o;
    if (i1 >= 0)
    {
      localObject1 = Integer.valueOf(paramInt2);
      x = ((Integer)localObject1);
    }
    h = paramMap1;
    e = paramMap2;
    w = paramArrayList;
    localObject1 = new com/google/android/gms/b/at;
    localObject3 = e;
    ((at)localObject1).<init>((Map)localObject3);
    k = ((at)localObject1);
    localObject3 = paramList1.iterator();
    boolean bool1;
    Object localObject4;
    for (;;)
    {
      bool1 = ((Iterator)localObject3).hasNext();
      if (bool1)
      {
        localObject1 = (c.b)((Iterator)localObject3).next();
        localObject4 = n;
        com.google.android.gms.common.internal.c.a(localObject1);
        synchronized (i)
        {
          Object localObject6 = b;
          int i2 = ((ArrayList)localObject6).contains(localObject1);
          if (i2 != 0)
          {
            localObject6 = "GmsClientEvents";
            Object localObject7 = String.valueOf(localObject1);
            Object localObject8 = String.valueOf(localObject7);
            int i3 = ((String)localObject8).length() + 62;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>(i3);
            localObject8 = "registerConnectionCallbacks(): listener ";
            localObject8 = localStringBuilder.append((String)localObject8);
            localObject7 = ((StringBuilder)localObject8).append((String)localObject7);
            localObject8 = " is already registered";
            localObject7 = ((StringBuilder)localObject7).append((String)localObject8);
            localObject7 = ((StringBuilder)localObject7).toString();
            Log.w((String)localObject6, (String)localObject7);
            ??? = a;
            boolean bool2 = ((v.a)???).b();
            if (bool2)
            {
              ??? = h;
              localObject4 = h;
              i2 = 1;
              localObject1 = ((Handler)localObject4).obtainMessage(i2, localObject1);
              ((Handler)???).sendMessage((Message)localObject1);
            }
          }
          else
          {
            localObject6 = b;
            ((ArrayList)localObject6).add(localObject1);
          }
        }
      }
    }
    localObject3 = paramList2.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject3).hasNext();
      if (!bool1) {
        break;
      }
      c.c localc = (c.c)((Iterator)localObject3).next();
      localObject4 = n;
      ((com.google.android.gms.common.internal.v)localObject4).a(localc);
    }
    g = paramp;
    i = paramb;
  }
  
  public static int a(Iterable paramIterable)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = false;
    float f2 = 0.0F;
    a.f localf = null;
    Iterator localIterator = paramIterable.iterator();
    boolean bool2 = false;
    float f3 = 0.0F;
    bool1 = localIterator.hasNext();
    if (bool1)
    {
      localf = (a.f)localIterator.next();
      bool1 = localf.d();
      if (!bool1) {
        break label93;
      }
      bool1 = i1;
    }
    for (f2 = f1;; f2 = f3)
    {
      bool2 = bool1;
      f3 = f2;
      break;
      if (bool2) {}
      for (;;)
      {
        return i1;
        i1 = 3;
        f1 = 4.2E-45F;
      }
      label93:
      bool1 = bool2;
    }
  }
  
  private void a(int paramInt)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    Object localObject1 = x;
    if (localObject1 == null)
    {
      localObject1 = Integer.valueOf(paramInt);
      x = ((Integer)localObject1);
    }
    int i1;
    do
    {
      localObject1 = a;
      if (localObject1 == null) {
        break;
      }
      return;
      localObject1 = x;
      i1 = ((Integer)localObject1).intValue();
    } while (i1 == paramInt);
    localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = String.valueOf(b(paramInt));
    Object localObject3 = String.valueOf(b(x.intValue()));
    int i3 = String.valueOf(localObject2).length() + 51;
    int i4 = String.valueOf(localObject3).length();
    i3 += i4;
    Object localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>(i3);
    localObject2 = "Cannot use sign-in mode: " + (String)localObject2 + ". Mode was already set to " + (String)localObject3;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
    localObject1 = e.values();
    localObject3 = ((Collection)localObject1).iterator();
    boolean bool4 = false;
    localObject2 = null;
    float f2 = 0.0F;
    label198:
    boolean bool2 = ((Iterator)localObject3).hasNext();
    if (bool2)
    {
      localObject1 = (a.f)((Iterator)localObject3).next();
      bool2 = ((a.f)localObject1).d();
      if (!bool2) {
        break label722;
      }
      bool2 = bool1;
    }
    for (float f3 = f1;; f3 = f2)
    {
      bool4 = bool2;
      f2 = f3;
      break label198;
      localObject1 = x;
      int i2 = ((Integer)localObject1).intValue();
      switch (i2)
      {
      }
      do
      {
        do
        {
          bool3 = m;
          if (!bool3) {
            break label626;
          }
          localObject1 = new com/google/android/gms/b/m;
          localObject2 = p;
          localObject3 = l;
          localObject5 = b;
          localObject4 = u;
          localObject6 = e;
          localObject7 = g;
          localObject8 = h;
          localObject9 = i;
          localObject10 = w;
          localObject11 = this;
          bool1 = false;
          f1 = 0.0F;
          ((m)localObject1).<init>((Context)localObject2, (Lock)localObject3, (Looper)localObject5, (com.google.android.gms.common.m)localObject4, (Map)localObject6, (p)localObject7, (Map)localObject8, (a.b)localObject9, (ArrayList)localObject10, this, false);
          a = ((ac)localObject1);
          break;
        } while (bool4);
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        throw ((Throwable)localObject1);
      } while (!bool4);
      boolean bool3 = m;
      if (bool3)
      {
        localObject1 = new com/google/android/gms/b/m;
        localObject2 = p;
        localObject3 = l;
        localObject5 = b;
        localObject4 = u;
        localObject6 = e;
        localObject7 = g;
        localObject8 = h;
        localObject9 = i;
        localObject10 = w;
        localObject11 = this;
        ((m)localObject1).<init>((Context)localObject2, (Lock)localObject3, (Looper)localObject5, (com.google.android.gms.common.m)localObject4, (Map)localObject6, (p)localObject7, (Map)localObject8, (a.b)localObject9, (ArrayList)localObject10, this, bool1);
        a = ((ac)localObject1);
        break;
      }
      localObject1 = p;
      localObject3 = l;
      Object localObject5 = b;
      localObject4 = u;
      Object localObject6 = e;
      Object localObject7 = g;
      Object localObject8 = h;
      Object localObject9 = i;
      Object localObject10 = w;
      localObject2 = this;
      localObject1 = k.a((Context)localObject1, this, (Lock)localObject3, (Looper)localObject5, (com.google.android.gms.common.m)localObject4, (Map)localObject6, (p)localObject7, (Map)localObject8, (a.b)localObject9, (ArrayList)localObject10);
      a = ((ac)localObject1);
      break;
      label626:
      localObject1 = new com/google/android/gms/b/v;
      localObject2 = p;
      localObject5 = l;
      localObject4 = b;
      localObject6 = u;
      localObject7 = e;
      localObject8 = g;
      localObject9 = h;
      localObject10 = i;
      Object localObject11 = w;
      localObject3 = this;
      ((v)localObject1).<init>((Context)localObject2, this, (Lock)localObject5, (Looper)localObject4, (com.google.android.gms.common.m)localObject6, (Map)localObject7, (p)localObject8, (Map)localObject9, (a.b)localObject10, (ArrayList)localObject11, this);
      a = ((ac)localObject1);
      break;
      label722:
      bool3 = bool4;
    }
  }
  
  private static String b(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      str = "UNKNOWN";
    }
    for (;;)
    {
      return str;
      str = "SIGN_IN_MODE_NONE";
      continue;
      str = "SIGN_IN_MODE_REQUIRED";
      continue;
      str = "SIGN_IN_MODE_OPTIONAL";
    }
  }
  
  private void h()
  {
    n.e = true;
    a.a();
  }
  
  public final Looper a()
  {
    return b;
  }
  
  public final f.a a(f.a parama)
  {
    Object localObject1 = a;
    Object localObject4;
    boolean bool2;
    if (localObject1 != null)
    {
      bool1 = true;
      com.google.android.gms.common.internal.c.b(bool1, "This task can not be executed (it's probably a Batch or malformed)");
      localObject1 = e;
      localObject4 = a;
      bool2 = ((Map)localObject1).containsKey(localObject4);
      localObject1 = b;
      if (localObject1 == null) {
        break label170;
      }
    }
    Object localObject3;
    label170:
    for (localObject1 = b.a;; localObject3 = "the API")
    {
      int i1 = String.valueOf(localObject1).length() + 65;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i1);
      localObject1 = localStringBuilder.append("GoogleApiClient is not configured to use ").append((String)localObject1);
      String str = " required for this call.";
      localObject1 = str;
      com.google.android.gms.common.internal.c.b(bool2, localObject1);
      localObject1 = l;
      ((Lock)localObject1).lock();
      try
      {
        localObject1 = a;
        if (localObject1 != null) {
          break label177;
        }
        localObject1 = new java/lang/IllegalStateException;
        localObject4 = "GoogleApiClient is not connected yet.";
        ((IllegalStateException)localObject1).<init>((String)localObject4);
        throw ((Throwable)localObject1);
      }
      finally
      {
        l.unlock();
      }
      bool1 = false;
      localObject3 = null;
      break;
    }
    label177:
    boolean bool1 = q;
    if (bool1)
    {
      localObject3 = c;
      ((Queue)localObject3).add(parama);
      for (;;)
      {
        localObject3 = c;
        bool1 = ((Queue)localObject3).isEmpty();
        if (bool1) {
          break;
        }
        localObject3 = c;
        localObject3 = ((Queue)localObject3).remove();
        localObject3 = (f.a)localObject3;
        localObject4 = k;
        ((at)localObject4).a((h)localObject3);
        localObject4 = Status.c;
        ((f.a)localObject3).a((Status)localObject4);
      }
      localObject3 = l;
      ((Lock)localObject3).unlock();
    }
    for (;;)
    {
      return parama;
      localObject3 = a;
      parama = ((ac)localObject3).a(parama);
      localObject3 = l;
      ((Lock)localObject3).unlock();
    }
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    int i1 = 2;
    int i2 = 0;
    Object localObject1 = null;
    int i3 = 1;
    if ((paramInt == i3) && (!paramBoolean))
    {
      boolean bool1 = q;
      if (!bool1)
      {
        q = i3;
        localObject2 = d;
        if (localObject2 == null)
        {
          localObject2 = p.getApplicationContext();
          localObject5 = new com/google/android/gms/b/t$b;
          ((t.b)localObject5).<init>(this);
          localObject2 = com.google.android.gms.common.c.a((Context)localObject2, (z.a)localObject5);
          d = ((z)localObject2);
        }
        localObject2 = t;
        localObject5 = t.obtainMessage(i3);
        long l1 = r;
        ((t.a)localObject2).sendMessageDelayed((Message)localObject5, l1);
        localObject2 = t;
        localObject5 = t.obtainMessage(i1);
        l1 = s;
        ((t.a)localObject2).sendMessageDelayed((Message)localObject5, l1);
      }
    }
    Object localObject2 = k.c;
    Object localObject5 = at.b;
    localObject2 = (h[])((Set)localObject2).toArray((Object[])localObject5);
    int i5 = localObject2.length;
    int i6 = 0;
    localObject5 = null;
    Object localObject6;
    while (i6 < i5)
    {
      localObject6 = localObject2[i6];
      Status localStatus = at.a;
      ((h)localObject6).b(localStatus);
      i6 += 1;
    }
    localObject5 = n;
    localObject2 = Looper.myLooper();
    Object localObject7 = h.getLooper();
    int i4;
    if (localObject2 == localObject7) {
      i4 = i3;
    }
    Object localObject8;
    for (;;)
    {
      localObject1 = "onUnintentionalDisconnection must only be called on the Handler thread";
      com.google.android.gms.common.internal.c.a(i4, localObject1);
      localObject2 = h;
      ((Handler)localObject2).removeMessages(i3);
      localObject8 = i;
      bool2 = true;
      try
      {
        g = bool2;
        localObject2 = new java/util/ArrayList;
        localObject1 = b;
        ((ArrayList)localObject2).<init>((Collection)localObject1);
        localObject1 = f;
        i2 = ((AtomicInteger)localObject1).get();
        localObject7 = ((ArrayList)localObject2).iterator();
        for (;;)
        {
          bool2 = ((Iterator)localObject7).hasNext();
          if (!bool2) {
            break;
          }
          localObject2 = ((Iterator)localObject7).next();
          localObject2 = (c.b)localObject2;
          boolean bool3 = e;
          if (!bool3) {
            break;
          }
          localObject6 = f;
          int i7 = ((AtomicInteger)localObject6).get();
          if (i7 != i2) {
            break;
          }
          localObject6 = b;
          boolean bool4 = ((ArrayList)localObject6).contains(localObject2);
          if (bool4) {
            ((c.b)localObject2).a(paramInt);
          }
        }
        bool2 = false;
      }
      finally {}
      localObject4 = null;
    }
    Object localObject4 = c;
    ((ArrayList)localObject4).clear();
    boolean bool2 = false;
    localObject4 = null;
    g = false;
    localObject4 = n;
    ((com.google.android.gms.common.internal.v)localObject4).a();
    if (paramInt == i1) {
      h();
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    Iterator localIterator = null;
    boolean bool1 = true;
    boolean bool2;
    for (;;)
    {
      localObject1 = c;
      bool2 = ((Queue)localObject1).isEmpty();
      if (bool2) {
        break;
      }
      localObject1 = (f.a)c.remove();
      a((f.a)localObject1);
    }
    com.google.android.gms.common.internal.v localv = n;
    Object localObject1 = Looper.myLooper();
    ??? = h.getLooper();
    if (localObject1 == ???)
    {
      bool2 = bool1;
      com.google.android.gms.common.internal.c.a(bool2, "onConnectionSuccess must only be called on the Handler thread");
    }
    for (;;)
    {
      synchronized (i)
      {
        bool2 = g;
        if (bool2) {
          break label335;
        }
        bool2 = bool1;
        com.google.android.gms.common.internal.c.a(bool2);
        localObject1 = h;
        int i3 = 1;
        ((Handler)localObject1).removeMessages(i3);
        bool2 = true;
        g = bool2;
        localObject1 = c;
        int i2 = ((ArrayList)localObject1).size();
        if (i2 != 0) {
          break label344;
        }
        com.google.android.gms.common.internal.c.a(bool1);
        localObject1 = new java/util/ArrayList;
        localObject4 = b;
        ((ArrayList)localObject1).<init>((Collection)localObject4);
        localObject4 = f;
        i1 = ((AtomicInteger)localObject4).get();
        localIterator = ((ArrayList)localObject1).iterator();
        bool3 = localIterator.hasNext();
        if (!bool3) {
          break label352;
        }
        localObject1 = localIterator.next();
        localObject1 = (c.b)localObject1;
        boolean bool4 = e;
        if (!bool4) {
          break label352;
        }
        Object localObject5 = a;
        bool4 = ((v.a)localObject5).b();
        if (!bool4) {
          break label352;
        }
        localObject5 = f;
        int i4 = ((AtomicInteger)localObject5).get();
        if (i4 != i1) {
          break label352;
        }
        localObject5 = c;
        boolean bool5 = ((ArrayList)localObject5).contains(localObject1);
        if (bool5) {
          continue;
        }
        ((c.b)localObject1).a(paramBundle);
      }
      bool3 = false;
      localArrayList = null;
      break;
      label335:
      bool3 = false;
      localArrayList = null;
      continue;
      label344:
      int i1 = 0;
      Object localObject4 = null;
    }
    label352:
    ArrayList localArrayList = c;
    localArrayList.clear();
    boolean bool3 = false;
    localArrayList = null;
    g = false;
  }
  
  public final void a(as paramas)
  {
    Object localObject1 = l;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = j;
      if (localObject1 == null)
      {
        localObject1 = new java/util/HashSet;
        ((HashSet)localObject1).<init>();
        j = ((Set)localObject1);
      }
      localObject1 = j;
      ((Set)localObject1).add(paramas);
      return;
    }
    finally
    {
      l.unlock();
    }
  }
  
  public final void a(com.google.android.gms.common.a parama)
  {
    int i1 = 1;
    Object localObject1 = u;
    Object localObject3 = p;
    int i2 = c;
    boolean bool1 = ((com.google.android.gms.common.c)localObject1).b((Context)localObject3, i2);
    if (!bool1) {
      e();
    }
    bool1 = q;
    Object localObject4;
    if (!bool1)
    {
      localObject3 = n;
      localObject1 = Looper.myLooper();
      localObject4 = h.getLooper();
      if (localObject1 != localObject4) {
        break label222;
      }
      bool1 = i1;
      localObject4 = "onConnectionFailure must only be called on the Handler thread";
      com.google.android.gms.common.internal.c.a(bool1, localObject4);
      localObject1 = h;
      ((Handler)localObject1).removeMessages(i1);
    }
    for (;;)
    {
      synchronized (i)
      {
        localObject1 = new java/util/ArrayList;
        localObject4 = d;
        ((ArrayList)localObject1).<init>((Collection)localObject4);
        localObject4 = f;
        i2 = ((AtomicInteger)localObject4).get();
        Iterator localIterator = ((ArrayList)localObject1).iterator();
        bool1 = localIterator.hasNext();
        if (bool1)
        {
          localObject1 = localIterator.next();
          localObject1 = (c.c)localObject1;
          boolean bool2 = e;
          if (bool2)
          {
            localObject6 = f;
            int i3 = ((AtomicInteger)localObject6).get();
            if (i3 == i2) {}
          }
          else
          {
            localObject1 = n;
            ((com.google.android.gms.common.internal.v)localObject1).a();
            return;
            label222:
            bool1 = false;
            localObject1 = null;
            break;
          }
          Object localObject6 = d;
          boolean bool3 = ((ArrayList)localObject6).contains(localObject1);
          if (!bool3) {
            continue;
          }
          ((c.c)localObject1).a(parama);
        }
      }
    }
  }
  
  public final void a(c.c paramc)
  {
    n.a(paramc);
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    Object localObject1 = paramPrintWriter.append(paramString).append("mContext=");
    Object localObject2 = p;
    ((PrintWriter)localObject1).println(localObject2);
    localObject1 = paramPrintWriter.append(paramString).append("mResuming=");
    boolean bool = q;
    ((PrintWriter)localObject1).print(bool);
    localObject1 = paramPrintWriter.append(" mWorkQueue.size()=");
    int i1 = c.size();
    ((PrintWriter)localObject1).print(i1);
    localObject1 = k;
    localObject2 = paramPrintWriter.append(" mUnconsumedApiCalls.size()=");
    int i2 = c.size();
    ((PrintWriter)localObject2).println(i2);
    localObject1 = a;
    if (localObject1 != null)
    {
      localObject1 = a;
      ((ac)localObject1).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public final void b()
  {
    int i1 = 2;
    boolean bool = false;
    Lock localLock = null;
    int i2 = 1;
    Object localObject3 = l;
    ((Lock)localObject3).lock();
    int i4;
    do
    {
      for (;;)
      {
        try
        {
          int i3 = o;
          if (i3 >= 0)
          {
            localObject3 = x;
            if (localObject3 != null)
            {
              i3 = i2;
              localObject4 = "Sign-in mode should have been set explicitly by auto-manage.";
              com.google.android.gms.common.internal.c.a(i3, localObject4);
              localObject3 = x;
              i4 = ((Integer)localObject3).intValue();
              localObject4 = l;
              ((Lock)localObject4).lock();
              int i5 = 3;
              if ((i4 == i5) || (i4 == i2) || (i4 == i1)) {
                bool = i2;
              }
              i2 = 33;
            }
          }
        }
        finally
        {
          Object localObject4;
          l.unlock();
        }
        try
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>(i2);
          localObject5 = "Illegal sign-in mode: ";
          localObject5 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject5 = ((StringBuilder)localObject5).append(i4);
          localObject5 = ((StringBuilder)localObject5).toString();
          com.google.android.gms.common.internal.c.b(bool, localObject5);
          a(i4);
          h();
          localLock = l;
          localLock.unlock();
          l.unlock();
          return;
        }
        finally
        {
          IllegalStateException localIllegalStateException;
          localObject5 = l;
          ((Lock)localObject5).unlock();
        }
        i4 = 0;
        localObject3 = null;
        continue;
        localObject3 = x;
        if (localObject3 != null) {
          break;
        }
        localObject3 = e;
        localObject3 = ((Map)localObject3).values();
        i4 = a((Iterable)localObject3);
        localObject3 = Integer.valueOf(i4);
        x = ((Integer)localObject3);
      }
      localObject3 = x;
      i4 = ((Integer)localObject3).intValue();
    } while (i4 != i1);
    localIllegalStateException = new java/lang/IllegalStateException;
    localObject5 = "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.";
    localIllegalStateException.<init>((String)localObject5);
    throw localIllegalStateException;
  }
  
  public final void b(as paramas)
  {
    Object localObject1 = l;
    ((Lock)localObject1).lock();
    for (;;)
    {
      boolean bool;
      try
      {
        localObject1 = j;
        String str;
        Exception localException;
        if (localObject1 == null)
        {
          localObject1 = "GoogleApiClientImpl";
          str = "Attempted to remove pending transform when no transforms are registered.";
          localException = new java/lang/Exception;
          localException.<init>();
          Log.wtf((String)localObject1, str, localException);
          return;
        }
        localObject1 = j;
        bool = ((Set)localObject1).remove(paramas);
        if (!bool)
        {
          localObject1 = "GoogleApiClientImpl";
          str = "Failed to remove pending transform - this may lead to memory leaks!";
          localException = new java/lang/Exception;
          localException.<init>();
          Log.wtf((String)localObject1, str, localException);
          continue;
        }
        bool = f();
      }
      finally
      {
        l.unlock();
      }
      if (!bool)
      {
        ac localac = a;
        localac.d();
      }
    }
  }
  
  public final void b(c.c paramc)
  {
    Object localObject1 = n;
    com.google.android.gms.common.internal.c.a(paramc);
    synchronized (i)
    {
      localObject1 = d;
      boolean bool = ((ArrayList)localObject1).remove(paramc);
      if (!bool)
      {
        localObject1 = "GmsClientEvents";
        Object localObject4 = String.valueOf(paramc);
        Object localObject5 = String.valueOf(localObject4);
        int i1 = ((String)localObject5).length() + 57;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i1);
        localObject5 = "unregisterConnectionFailedListener(): listener ";
        localObject5 = localStringBuilder.append((String)localObject5);
        localObject4 = ((StringBuilder)localObject5).append((String)localObject4);
        localObject5 = " not found";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject4 = ((StringBuilder)localObject4).toString();
        Log.w((String)localObject1, (String)localObject4);
      }
      return;
    }
  }
  
  public final void c()
  {
    Object localObject1 = l;
    ((Lock)localObject1).lock();
    Iterator localIterator;
    boolean bool;
    try
    {
      localObject1 = k;
      ((at)localObject1).a();
      localObject1 = a;
      if (localObject1 != null)
      {
        localObject1 = a;
        ((ac)localObject1).b();
      }
      localObject4 = v;
      localObject1 = a;
      localIterator = ((Set)localObject1).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (ah)localObject1;
        a = null;
      }
      localObject3 = a;
    }
    finally
    {
      l.unlock();
    }
    ((Set)localObject3).clear();
    Object localObject3 = c;
    Object localObject4 = ((Queue)localObject3).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject4).hasNext();
      if (!bool) {
        break;
      }
      localObject3 = ((Iterator)localObject4).next();
      localObject3 = (f.a)localObject3;
      localIterator = null;
      ((f.a)localObject3).a(null);
      ((f.a)localObject3).b();
    }
    localObject3 = c;
    ((Queue)localObject3).clear();
    localObject3 = a;
    if (localObject3 == null)
    {
      localObject3 = l;
      ((Lock)localObject3).unlock();
    }
    for (;;)
    {
      return;
      e();
      localObject3 = n;
      ((com.google.android.gms.common.internal.v)localObject3).a();
      localObject3 = l;
      ((Lock)localObject3).unlock();
    }
  }
  
  final boolean e()
  {
    int i1 = 1;
    boolean bool1 = false;
    Object localObject = null;
    boolean bool2 = q;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      q = false;
      localObject = t;
      int i2 = 2;
      ((t.a)localObject).removeMessages(i2);
      t.removeMessages(i1);
      localObject = d;
      if (localObject != null)
      {
        d.a();
        bool1 = false;
        localObject = null;
        d = null;
      }
      bool1 = i1;
    }
  }
  
  /* Error */
  final boolean f()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: getfield 100	com/google/android/gms/b/t:l	Ljava/util/concurrent/locks/Lock;
    //   8: astore_3
    //   9: aload_3
    //   10: invokeinterface 294 1 0
    //   15: aload_0
    //   16: getfield 89	com/google/android/gms/b/t:j	Ljava/util/Set;
    //   19: astore_3
    //   20: aload_3
    //   21: ifnonnull +16 -> 37
    //   24: aload_0
    //   25: getfield 100	com/google/android/gms/b/t:l	Ljava/util/concurrent/locks/Lock;
    //   28: astore_3
    //   29: aload_3
    //   30: invokeinterface 301 1 0
    //   35: iload_1
    //   36: ireturn
    //   37: aload_0
    //   38: getfield 89	com/google/android/gms/b/t:j	Ljava/util/Set;
    //   41: astore_3
    //   42: aload_3
    //   43: invokeinterface 565 1 0
    //   48: istore 4
    //   50: iload 4
    //   52: ifne +5 -> 57
    //   55: iconst_1
    //   56: istore_1
    //   57: aload_0
    //   58: getfield 100	com/google/android/gms/b/t:l	Ljava/util/concurrent/locks/Lock;
    //   61: astore_3
    //   62: aload_3
    //   63: invokeinterface 301 1 0
    //   68: goto -33 -> 35
    //   71: astore_2
    //   72: aload_0
    //   73: getfield 100	com/google/android/gms/b/t:l	Ljava/util/concurrent/locks/Lock;
    //   76: invokeinterface 301 1 0
    //   81: aload_2
    //   82: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	t
    //   1	56	1	bool1	boolean
    //   3	1	2	localObject1	Object
    //   71	11	2	localObject2	Object
    //   8	55	3	localObject3	Object
    //   48	3	4	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   15	19	71	finally
    //   37	41	71	finally
    //   42	48	71	finally
  }
  
  final String g()
  {
    StringWriter localStringWriter = new java/io/StringWriter;
    localStringWriter.<init>();
    PrintWriter localPrintWriter = new java/io/PrintWriter;
    localPrintWriter.<init>(localStringWriter);
    a("", null, localPrintWriter, null);
    return localStringWriter.toString();
  }
}


/* Location:              com/google/android/gms/b/t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */