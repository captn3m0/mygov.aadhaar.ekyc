package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.b.ad;
import com.google.android.gms.b.eb;
import com.google.android.gms.b.ed;
import com.google.android.gms.b.i;
import com.google.android.gms.b.t;
import com.google.android.gms.common.internal.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class c$a
{
  Account a;
  public final Set b;
  public final Set c;
  public final Map d;
  private int e;
  private View f;
  private String g;
  private String h;
  private final Map i;
  private final Context j;
  private ad k;
  private int l;
  private c.c m;
  private Looper n;
  private com.google.android.gms.common.c o;
  private a.b p;
  private final ArrayList q;
  private final ArrayList r;
  private boolean s;
  
  public c$a(Context paramContext)
  {
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    b = ((Set)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    c = ((Set)localObject);
    localObject = new android/support/v4/g/a;
    ((android.support.v4.g.a)localObject).<init>();
    i = ((Map)localObject);
    localObject = new android/support/v4/g/a;
    ((android.support.v4.g.a)localObject).<init>();
    d = ((Map)localObject);
    l = -1;
    localObject = com.google.android.gms.common.c.a();
    o = ((com.google.android.gms.common.c)localObject);
    localObject = eb.c;
    p = ((a.b)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    q = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    r = ((ArrayList)localObject);
    s = false;
    j = paramContext;
    localObject = paramContext.getMainLooper();
    n = ((Looper)localObject);
    localObject = paramContext.getPackageName();
    g = ((String)localObject);
    localObject = paramContext.getClass().getName();
    h = ((String)localObject);
  }
  
  public final p a()
  {
    Object localObject1 = ed.a;
    Object localObject2 = d;
    Object localObject3 = eb.g;
    boolean bool = ((Map)localObject2).containsKey(localObject3);
    if (bool)
    {
      localObject2 = d;
      localObject3 = eb.g;
      localObject2 = (ed)((Map)localObject2).get(localObject3);
      localObject1 = localObject2;
    }
    localObject2 = new com/google/android/gms/common/internal/p;
    localObject3 = a;
    Set localSet = b;
    Map localMap = i;
    int i1 = e;
    View localView = f;
    String str1 = g;
    String str2 = h;
    ((p)localObject2).<init>((Account)localObject3, localSet, localMap, i1, localView, str1, str2, (ed)localObject1);
    return (p)localObject2;
  }
  
  public final c b()
  {
    Object localObject1 = d;
    boolean bool = ((Map)localObject1).isEmpty();
    p localp;
    android.support.v4.g.a locala1;
    android.support.v4.g.a locala2;
    ArrayList localArrayList1;
    if (!bool)
    {
      bool = true;
      ??? = "must call addApi() to add at least one API";
      com.google.android.gms.common.internal.c.b(bool, ???);
      localp = a();
      localObject4 = d;
      locala1 = new android/support/v4/g/a;
      locala1.<init>();
      locala2 = new android/support/v4/g/a;
      locala2.<init>();
      localArrayList1 = new java/util/ArrayList;
      localArrayList1.<init>();
      localObject1 = d.keySet();
      localObject5 = ((Set)localObject1).iterator();
      label87:
      bool = ((Iterator)localObject5).hasNext();
      if (!bool) {
        break label252;
      }
      localObject1 = ((Iterator)localObject5).next();
      localObject6 = localObject1;
      localObject6 = (a)localObject1;
      localObject7 = d.get(localObject6);
      localObject1 = ((Map)localObject4).get(localObject6);
      if (localObject1 == null) {
        break label245;
      }
      bool = true;
    }
    Object localObject9;
    for (;;)
    {
      ??? = Boolean.valueOf(bool);
      locala1.put(localObject6, ???);
      localObject8 = new com/google/android/gms/b/i;
      ((i)localObject8).<init>((a)localObject6, bool);
      localArrayList1.add(localObject8);
      localObject1 = ((a)localObject6).a();
      ??? = j;
      localObject9 = n;
      localObject10 = localObject8;
      localObject1 = ((a.b)localObject1).a((Context)???, (Looper)localObject9, localp, localObject7, (c.b)localObject8, (c.c)localObject8);
      ??? = ((a)localObject6).b();
      locala2.put(???, localObject1);
      break label87;
      bool = false;
      localObject1 = null;
      break;
      label245:
      bool = false;
      localObject1 = null;
    }
    label252:
    localObject1 = locala2.values();
    int i2 = t.a((Iterable)localObject1);
    Object localObject7 = new com/google/android/gms/b/t;
    Object localObject8 = j;
    Object localObject10 = new java/util/concurrent/locks/ReentrantLock;
    ((ReentrantLock)localObject10).<init>();
    Object localObject6 = n;
    Object localObject5 = o;
    a.b localb = p;
    ArrayList localArrayList2 = q;
    ArrayList localArrayList3 = r;
    int i3 = l;
    Object localObject4 = localp;
    ((t)localObject7).<init>((Context)localObject8, (Lock)localObject10, (Looper)localObject6, localp, (com.google.android.gms.common.c)localObject5, localb, locala1, localArrayList2, localArrayList3, locala2, i3, i2, localArrayList1);
    synchronized (c.d())
    {
      localObject1 = c.d();
      ((Set)localObject1).add(localObject7);
      int i1 = l;
      if (i1 >= 0)
      {
        localObject1 = com.google.android.gms.b.c.a(k);
        int i4 = l;
        localObject9 = m;
        ((com.google.android.gms.b.c)localObject1).a(i4, (c)localObject7, (c.c)localObject9);
      }
      return (c)localObject7;
    }
  }
}


/* Location:              com/google/android/gms/common/api/c$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */