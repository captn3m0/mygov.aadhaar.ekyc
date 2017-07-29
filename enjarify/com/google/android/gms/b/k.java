package com.google.android.gms.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

final class k
  implements ac
{
  final v a;
  final v b;
  Bundle c;
  com.google.android.gms.common.a d;
  com.google.android.gms.common.a e;
  boolean f;
  final Lock g;
  private final Context h;
  private final t i;
  private final Looper j;
  private final Map k;
  private final Set l;
  private final a.f m;
  private int n;
  
  private k(Context paramContext, t paramt, Lock paramLock, Looper paramLooper, m paramm, Map paramMap1, Map paramMap2, p paramp, a.b paramb, ArrayList paramArrayList1, ArrayList paramArrayList2, Map paramMap3, Map paramMap4)
  {
    Object localObject1 = new java/util/WeakHashMap;
    ((WeakHashMap)localObject1).<init>();
    localObject1 = Collections.newSetFromMap((Map)localObject1);
    l = ((Set)localObject1);
    d = null;
    e = null;
    f = false;
    n = 0;
    h = paramContext;
    i = paramt;
    g = paramLock;
    j = paramLooper;
    boolean bool = false;
    m = null;
    localObject1 = new com/google/android/gms/b/v;
    Object localObject2 = i;
    Object localObject3 = new com/google/android/gms/b/k$a;
    ((k.a)localObject3).<init>(this, (byte)0);
    Object localObject4 = paramContext;
    Object localObject5 = paramLock;
    ((v)localObject1).<init>(paramContext, (t)localObject2, paramLock, paramLooper, paramm, paramMap2, null, paramMap4, null, paramArrayList2, (ac.a)localObject3);
    a = ((v)localObject1);
    localObject1 = new com/google/android/gms/b/v;
    localObject2 = i;
    localObject3 = new com/google/android/gms/b/k$b;
    ((k.b)localObject3).<init>(this, (byte)0);
    ((v)localObject1).<init>(paramContext, (t)localObject2, paramLock, paramLooper, paramm, paramMap1, paramp, paramMap3, paramb, paramArrayList1, (ac.a)localObject3);
    b = ((v)localObject1);
    localObject4 = new android/support/v4/g/a;
    ((android.support.v4.g.a)localObject4).<init>();
    localObject1 = paramMap2.keySet();
    localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (a.d)((Iterator)localObject2).next();
      localObject5 = a;
      ((android.support.v4.g.a)localObject4).put(localObject1, localObject5);
    }
    localObject1 = paramMap1.keySet();
    localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (a.d)((Iterator)localObject2).next();
      localObject5 = b;
      ((android.support.v4.g.a)localObject4).put(localObject1, localObject5);
    }
    localObject1 = Collections.unmodifiableMap((Map)localObject4);
    k = ((Map)localObject1);
  }
  
  public static k a(Context paramContext, t paramt, Lock paramLock, Looper paramLooper, m paramm, Map paramMap1, p paramp, Map paramMap2, a.b paramb, ArrayList paramArrayList)
  {
    android.support.v4.g.a locala1 = new android/support/v4/g/a;
    locala1.<init>();
    android.support.v4.g.a locala2 = new android/support/v4/g/a;
    locala2.<init>();
    Object localObject1 = paramMap1.entrySet();
    Object localObject2 = ((Set)localObject1).iterator();
    boolean bool2;
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)((Iterator)localObject2).next();
      localObject3 = (a.f)((Map.Entry)localObject1).getValue();
      bool2 = ((a.f)localObject3).d();
      if (bool2)
      {
        localObject1 = (a.d)((Map.Entry)localObject1).getKey();
        locala1.put(localObject1, localObject3);
      }
      else
      {
        localObject1 = (a.d)((Map.Entry)localObject1).getKey();
        locala2.put(localObject1, localObject3);
      }
    }
    boolean bool1 = locala1.isEmpty();
    android.support.v4.g.a locala3;
    android.support.v4.g.a locala4;
    if (!bool1)
    {
      bool1 = true;
      localObject3 = "CompositeGoogleApiClient should not be used without any APIs that require sign-in.";
      c.a(bool1, localObject3);
      locala3 = new android/support/v4/g/a;
      locala3.<init>();
      locala4 = new android/support/v4/g/a;
      locala4.<init>();
      localObject1 = paramMap2.keySet();
      localObject2 = ((Set)localObject1).iterator();
    }
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break label357;
      }
      localObject1 = (com.google.android.gms.common.api.a)((Iterator)localObject2).next();
      localObject3 = ((com.google.android.gms.common.api.a)localObject1).b();
      bool2 = locala1.containsKey(localObject3);
      if (bool2)
      {
        localObject3 = (Boolean)paramMap2.get(localObject1);
        locala3.put(localObject1, localObject3);
        continue;
        bool1 = false;
        localObject1 = null;
        break;
      }
      boolean bool3 = locala2.containsKey(localObject3);
      if (!bool3) {
        break label342;
      }
      localObject3 = (Boolean)paramMap2.get(localObject1);
      locala4.put(localObject1, localObject3);
    }
    label342:
    localObject1 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject1).<init>("Each API in the isOptionalMap must have a corresponding client in the clients map.");
    throw ((Throwable)localObject1);
    label357:
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    ArrayList localArrayList2 = new java/util/ArrayList;
    localArrayList2.<init>();
    Object localObject3 = paramArrayList.iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject3).hasNext();
      if (!bool1) {
        break label493;
      }
      localObject1 = (i)((Iterator)localObject3).next();
      localObject2 = a;
      boolean bool4 = locala3.containsKey(localObject2);
      if (bool4)
      {
        localArrayList1.add(localObject1);
      }
      else
      {
        localObject2 = a;
        bool4 = locala4.containsKey(localObject2);
        if (!bool4) {
          break;
        }
        localArrayList2.add(localObject1);
      }
    }
    localObject1 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject1).<init>("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
    throw ((Throwable)localObject1);
    label493:
    localObject1 = new com/google/android/gms/b/k;
    localObject3 = paramContext;
    localObject2 = paramt;
    ((k)localObject1).<init>(paramContext, paramt, paramLock, paramLooper, paramm, locala1, locala2, paramp, paramb, localArrayList1, localArrayList2, locala3, locala4);
    return (k)localObject1;
  }
  
  private void a(com.google.android.gms.common.a parama)
  {
    int i1 = n;
    Object localObject;
    switch (i1)
    {
    default: 
      localObject = "CompositeGAC";
      String str = "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor";
      Exception localException = new java/lang/Exception;
      localException.<init>();
      Log.wtf((String)localObject, str, localException);
    }
    for (;;)
    {
      n = 0;
      return;
      localObject = i;
      ((t)localObject).a(parama);
      e();
    }
  }
  
  private static boolean b(com.google.android.gms.common.a parama)
  {
    if (parama != null)
    {
      bool = parama.b();
      if (!bool) {}
    }
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private void e()
  {
    Iterator localIterator = l.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localIterator.next();
    }
    l.clear();
  }
  
  private boolean f()
  {
    com.google.android.gms.common.a locala = e;
    int i1;
    if (locala != null)
    {
      locala = e;
      i1 = c;
      int i3 = 4;
      if (i1 == i3) {
        i1 = 1;
      }
    }
    for (;;)
    {
      return i1;
      int i2 = 0;
      locala = null;
    }
  }
  
  public final f.a a(f.a parama)
  {
    Object localObject1 = a;
    boolean bool1 = k.containsKey(localObject1);
    String str = "GoogleApiClient is not configured to use the API required for this call.";
    c.b(bool1, str);
    localObject1 = (v)k.get(localObject1);
    Object localObject2 = b;
    boolean bool2 = localObject1.equals(localObject2);
    if (bool2)
    {
      bool2 = f();
      if (bool2)
      {
        localObject2 = new com/google/android/gms/common/api/Status;
        int i1 = 4;
        localObject1 = m;
        if (localObject1 == null)
        {
          bool2 = false;
          localObject1 = null;
          ((Status)localObject2).<init>(i1, null, (PendingIntent)localObject1);
          parama.a((Status)localObject2);
        }
      }
    }
    for (;;)
    {
      return parama;
      localObject1 = h;
      t localt = i;
      int i2 = System.identityHashCode(localt);
      Intent localIntent = m.e();
      int i3 = 134217728;
      localObject1 = PendingIntent.getActivity((Context)localObject1, i2, localIntent, i3);
      break;
      localObject1 = b;
      parama = ((v)localObject1).a(parama);
      continue;
      localObject1 = a;
      parama = ((v)localObject1).a(parama);
    }
  }
  
  public final void a()
  {
    n = 2;
    f = false;
    e = null;
    d = null;
    a.a();
    b.a();
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.append(paramString).append("authClient").println(":");
    v localv = b;
    String str = String.valueOf(paramString).concat("  ");
    localv.a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.append(paramString).append("anonClient").println(":");
    localv = a;
    str = String.valueOf(paramString).concat("  ");
    localv.a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public final void b()
  {
    e = null;
    d = null;
    n = 0;
    a.b();
    b.b();
    e();
  }
  
  /* Error */
  public final boolean c()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: getfield 61	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
    //   6: astore_2
    //   7: aload_2
    //   8: invokeinterface 316 1 0
    //   13: aload_0
    //   14: getfield 77	com/google/android/gms/b/k:a	Lcom/google/android/gms/b/v;
    //   17: astore_2
    //   18: aload_2
    //   19: invokevirtual 318	com/google/android/gms/b/v:c	()Z
    //   22: istore_3
    //   23: iload_3
    //   24: ifeq +47 -> 71
    //   27: aload_0
    //   28: getfield 82	com/google/android/gms/b/k:b	Lcom/google/android/gms/b/v;
    //   31: astore_2
    //   32: aload_2
    //   33: invokevirtual 318	com/google/android/gms/b/v:c	()Z
    //   36: istore_3
    //   37: iload_3
    //   38: ifne +22 -> 60
    //   41: aload_0
    //   42: invokespecial 190	com/google/android/gms/b/k:f	()Z
    //   45: istore_3
    //   46: iload_3
    //   47: ifne +13 -> 60
    //   50: aload_0
    //   51: getfield 55	com/google/android/gms/b/k:n	I
    //   54: istore_3
    //   55: iload_3
    //   56: iload_1
    //   57: if_icmpne +14 -> 71
    //   60: aload_0
    //   61: getfield 61	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
    //   64: invokeinterface 321 1 0
    //   69: iload_1
    //   70: ireturn
    //   71: iconst_0
    //   72: istore_1
    //   73: aconst_null
    //   74: astore 4
    //   76: goto -16 -> 60
    //   79: astore 4
    //   81: aload_0
    //   82: getfield 61	com/google/android/gms/b/k:g	Ljava/util/concurrent/locks/Lock;
    //   85: invokeinterface 321 1 0
    //   90: aload 4
    //   92: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	this	k
    //   1	72	1	i1	int
    //   6	27	2	localObject1	Object
    //   22	25	3	bool	boolean
    //   54	4	3	i2	int
    //   74	1	4	localObject2	Object
    //   79	12	4	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   13	17	79	finally
    //   18	22	79	finally
    //   27	31	79	finally
    //   32	36	79	finally
    //   41	45	79	finally
    //   50	54	79	finally
  }
  
  public final void d()
  {
    a.d();
    b.d();
  }
}


/* Location:              com/google/android/gms/b/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */