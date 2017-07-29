package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class v
  implements ac, j
{
  final Lock a;
  final Condition b;
  final Context c;
  final m d;
  final b e;
  final Map<a.d<?>, a.f> f;
  final Map<a.d<?>, com.google.android.gms.common.a> g = new HashMap();
  final p h;
  final Map<com.google.android.gms.common.api.a<?>, Boolean> i;
  final a.b<? extends ec, ed> j;
  volatile u k;
  int l;
  final t m;
  final ac.a n;
  private com.google.android.gms.common.a o = null;
  
  public v(Context paramContext, t paramt, Lock paramLock, Looper paramLooper, m paramm, Map<a.d<?>, a.f> paramMap, p paramp, Map<com.google.android.gms.common.api.a<?>, Boolean> paramMap1, a.b<? extends ec, ed> paramb, ArrayList<i> paramArrayList, ac.a parama)
  {
    c = paramContext;
    a = paramLock;
    d = paramm;
    f = paramMap;
    h = paramp;
    i = paramMap1;
    j = paramb;
    m = paramt;
    n = parama;
    paramContext = paramArrayList.iterator();
    while (paramContext.hasNext()) {
      nextb = this;
    }
    e = new b(paramLooper);
    b = paramLock.newCondition();
    k = new s(this);
  }
  
  public final <A extends a.c, T extends f.a<? extends g, A>> T a(T paramT)
  {
    paramT.d();
    return k.a(paramT);
  }
  
  public final void a()
  {
    k.c();
  }
  
  public final void a(int paramInt)
  {
    a.lock();
    try
    {
      k.a(paramInt);
      return;
    }
    finally
    {
      a.unlock();
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    a.lock();
    try
    {
      k.a(paramBundle);
      return;
    }
    finally
    {
      a.unlock();
    }
  }
  
  final void a(a parama)
  {
    parama = e.obtainMessage(1, parama);
    e.sendMessage(parama);
  }
  
  final void a(com.google.android.gms.common.a parama)
  {
    a.lock();
    try
    {
      o = parama;
      k = new s(this);
      k.a();
      b.signalAll();
      return;
    }
    finally
    {
      a.unlock();
    }
  }
  
  public final void a(com.google.android.gms.common.a parama, com.google.android.gms.common.api.a<?> parama1, boolean paramBoolean)
  {
    a.lock();
    try
    {
      k.a(parama, parama1, paramBoolean);
      return;
    }
    finally
    {
      a.unlock();
    }
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramFileDescriptor = String.valueOf(paramString).concat("  ");
    paramPrintWriter.append(paramString).append("mState=").println(k);
    paramArrayOfString = i.keySet().iterator();
    while (paramArrayOfString.hasNext())
    {
      com.google.android.gms.common.api.a locala = (com.google.android.gms.common.api.a)paramArrayOfString.next();
      paramPrintWriter.append(paramString).append(a).println(":");
      ((a.f)f.get(locala.b())).a(paramFileDescriptor, paramPrintWriter);
    }
  }
  
  public final void b()
  {
    if (k.b()) {
      g.clear();
    }
  }
  
  public final boolean c()
  {
    return k instanceof q;
  }
  
  public final void d()
  {
    if (c())
    {
      q localq = (q)k;
      if (b)
      {
        b = false;
        a.m.k.a();
        localq.b();
      }
    }
  }
  
  static abstract class a
  {
    private final u a;
    
    protected a(u paramu)
    {
      a = paramu;
    }
    
    protected abstract void a();
    
    public final void a(v paramv)
    {
      a.lock();
      try
      {
        u localu1 = k;
        u localu2 = a;
        if (localu1 != localu2) {
          return;
        }
        a();
        return;
      }
      finally
      {
        a.unlock();
      }
    }
  }
  
  final class b
    extends Handler
  {
    b(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      switch (what)
      {
      default: 
        int i = what;
        Log.w("GACStateManager", 31 + "Unknown message id: " + i);
        return;
      case 1: 
        ((v.a)obj).a(v.this);
        return;
      }
      throw ((RuntimeException)obj);
    }
  }
}


/* Location:              com/google/android/gms/b/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */