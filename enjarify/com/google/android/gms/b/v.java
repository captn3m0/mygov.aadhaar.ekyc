package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.f;
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
  final v.b e;
  final Map f;
  final Map g;
  final p h;
  final Map i;
  final a.b j;
  volatile u k;
  int l;
  final t m;
  final ac.a n;
  private com.google.android.gms.common.a o;
  
  public v(Context paramContext, t paramt, Lock paramLock, Looper paramLooper, m paramm, Map paramMap1, p paramp, Map paramMap2, a.b paramb, ArrayList paramArrayList, ac.a parama)
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    g = ((Map)localObject);
    boolean bool = false;
    localObject = null;
    o = null;
    c = paramContext;
    a = paramLock;
    d = paramm;
    f = paramMap1;
    h = paramp;
    i = paramMap2;
    j = paramb;
    m = paramt;
    n = parama;
    Iterator localIterator = paramArrayList.iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (i)localIterator.next();
      b = this;
    }
    localObject = new com/google/android/gms/b/v$b;
    ((v.b)localObject).<init>(this, paramLooper);
    e = ((v.b)localObject);
    localObject = paramLock.newCondition();
    b = ((Condition)localObject);
    localObject = new com/google/android/gms/b/s;
    ((s)localObject).<init>(this);
    k = ((u)localObject);
  }
  
  public final f.a a(f.a parama)
  {
    parama.d();
    return k.a(parama);
  }
  
  public final void a()
  {
    k.c();
  }
  
  public final void a(int paramInt)
  {
    Object localObject1 = a;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = k;
      ((u)localObject1).a(paramInt);
      return;
    }
    finally
    {
      a.unlock();
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    Object localObject1 = a;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = k;
      ((u)localObject1).a(paramBundle);
      return;
    }
    finally
    {
      a.unlock();
    }
  }
  
  final void a(v.a parama)
  {
    Message localMessage = e.obtainMessage(1, parama);
    e.sendMessage(localMessage);
  }
  
  final void a(com.google.android.gms.common.a parama)
  {
    Object localObject1 = a;
    ((Lock)localObject1).lock();
    try
    {
      o = parama;
      localObject1 = new com/google/android/gms/b/s;
      ((s)localObject1).<init>(this);
      k = ((u)localObject1);
      localObject1 = k;
      ((u)localObject1).a();
      localObject1 = b;
      ((Condition)localObject1).signalAll();
      return;
    }
    finally
    {
      a.unlock();
    }
  }
  
  public final void a(com.google.android.gms.common.a parama, com.google.android.gms.common.api.a parama1, boolean paramBoolean)
  {
    Object localObject1 = a;
    ((Lock)localObject1).lock();
    try
    {
      localObject1 = k;
      ((u)localObject1).a(parama, parama1, paramBoolean);
      return;
    }
    finally
    {
      a.unlock();
    }
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    String str1 = String.valueOf(paramString).concat("  ");
    Object localObject1 = paramPrintWriter.append(paramString).append("mState=");
    Object localObject2 = k;
    ((PrintWriter)localObject1).println(localObject2);
    localObject1 = i.keySet();
    localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (com.google.android.gms.common.api.a)((Iterator)localObject2).next();
      Object localObject3 = paramPrintWriter.append(paramString);
      String str2 = a;
      localObject3 = ((PrintWriter)localObject3).append(str2);
      str2 = ":";
      ((PrintWriter)localObject3).println(str2);
      localObject3 = f;
      localObject1 = ((com.google.android.gms.common.api.a)localObject1).b();
      localObject1 = (a.f)((Map)localObject3).get(localObject1);
      ((a.f)localObject1).a(str1, paramPrintWriter);
    }
  }
  
  public final void b()
  {
    Object localObject = k;
    boolean bool = ((u)localObject).b();
    if (bool)
    {
      localObject = g;
      ((Map)localObject).clear();
    }
  }
  
  public final boolean c()
  {
    return k instanceof q;
  }
  
  public final void d()
  {
    boolean bool1 = c();
    if (bool1)
    {
      q localq = (q)k;
      boolean bool2 = b;
      if (bool2)
      {
        bool2 = false;
        b = false;
        at localat = a.m.k;
        localat.a();
        localq.b();
      }
    }
  }
}


/* Location:              com/google/android/gms/b/v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */