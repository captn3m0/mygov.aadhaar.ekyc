package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class nz
  implements nq
{
  private final qo a;
  private final oc b;
  private final Context c;
  private final Object d;
  private final ns e;
  private final boolean f;
  private final long g;
  private final long h;
  private final km i;
  private final boolean j;
  private boolean k;
  private nv l;
  private List m;
  
  public nz(Context paramContext, qo paramqo, oc paramoc, ns paramns, boolean paramBoolean1, boolean paramBoolean2, long paramLong1, long paramLong2, km paramkm)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    d = localObject;
    k = false;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    m = ((List)localObject);
    c = paramContext;
    a = paramqo;
    b = paramoc;
    e = paramns;
    f = paramBoolean1;
    j = paramBoolean2;
    g = paramLong1;
    h = paramLong2;
    i = paramkm;
  }
  
  public final nw a(List paramList)
  {
    tp.b("Starting mediation.");
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = this;
    Object localObject2 = i;
    kk localkk1 = ((km)localObject2).a();
    Iterator localIterator1 = paramList.iterator();
    boolean bool1;
    nr localnr;
    Object localObject4;
    int n;
    Iterator localIterator2;
    label118:
    do
    {
      bool1 = localIterator1.hasNext();
      if (!bool1) {
        break label656;
      }
      localnr = (nr)localIterator1.next();
      localObject4 = "Trying mediation network: ";
      localObject2 = String.valueOf(b);
      n = ((String)localObject2).length();
      if (n == 0) {
        break;
      }
      localObject2 = ((String)localObject4).concat((String)localObject2);
      tp.d((String)localObject2);
      localObject2 = c;
      localIterator2 = ((List)localObject2).iterator();
      bool1 = localIterator2.hasNext();
    } while (!bool1);
    Object localObject5 = (String)localIterator2.next();
    localObject1 = this;
    localObject2 = i;
    kk localkk2 = ((km)localObject2).a();
    localObject1 = d;
    Object localObject6 = localObject1;
    localObject1 = this;
    for (;;)
    {
      try
      {
        bool1 = k;
        if (bool1)
        {
          localObject2 = new com/google/android/gms/b/nw;
          i1 = -1;
          ((nw)localObject2).<init>(i1);
          return (nw)localObject2;
          localObject2 = new java/lang/String;
          ((String)localObject2).<init>((String)localObject4);
          break;
        }
        localObject2 = new com/google/android/gms/b/nv;
        localObject4 = c;
        localObject7 = b;
        localObject8 = e;
        Object localObject9 = a;
        localObject9 = c;
        Object localObject10 = a;
        localObject10 = d;
        Object localObject11 = a;
        localObject11 = k;
        boolean bool2 = f;
        boolean bool3 = j;
        Object localObject12 = a;
        localObject12 = y;
        Object localObject13 = a;
        localObject13 = n;
        ((nv)localObject2).<init>((Context)localObject4, (String)localObject5, (oc)localObject7, (ns)localObject8, localnr, (ih)localObject9, (il)localObject10, (un)localObject11, bool2, bool3, (le)localObject12, (List)localObject13);
        l = ((nv)localObject2);
        localObject2 = l;
        long l1 = g;
        long l2 = h;
        localObject2 = ((nv)localObject2).a(l1, l2);
        localObject4 = m;
        ((List)localObject4).add(localObject2);
        int i1 = a;
        if (i1 == 0)
        {
          tp.b("Adapter succeeded.");
          localObject4 = i;
          localObject7 = "mediation_network_succeed";
          ((km)localObject4).a((String)localObject7, (String)localObject5);
          i2 = localArrayList.isEmpty();
          if (i2 == 0)
          {
            localObject4 = i;
            localObject5 = "mediation_networks_fail";
            localObject7 = TextUtils.join(",", localArrayList);
            ((km)localObject4).a((String)localObject5, (String)localObject7);
          }
          localObject1 = this;
          localObject4 = i;
          localObject5 = new String[1];
          localObject5[0] = "mls";
          localObject1 = localkk2;
          ((km)localObject4).a(localkk2, (String[])localObject5);
          localObject1 = this;
          localObject4 = i;
          n = 1;
          localObject5 = new String[n];
          localObject7 = null;
          localObject8 = "ttm";
          localObject5[0] = localObject8;
          localObject1 = localkk1;
          ((km)localObject4).a(localkk1, (String[])localObject5);
          continue;
        }
        localArrayList.add(localObject5);
      }
      finally {}
      localObject4 = i;
      n = 1;
      localObject5 = new String[n];
      Object localObject7 = null;
      Object localObject8 = "mlf";
      localObject5[0] = localObject8;
      localObject1 = localkk2;
      ((km)localObject4).a(localkk2, (String[])localObject5);
      localObject4 = c;
      if (localObject4 == null) {
        break label118;
      }
      localObject4 = tt.a;
      localObject5 = new com/google/android/gms/b/nz$1;
      ((nz.1)localObject5).<init>(localnw);
      ((Handler)localObject4).post((Runnable)localObject5);
      break label118;
      label656:
      bool1 = localArrayList.isEmpty();
      if (!bool1)
      {
        localObject1 = this;
        localObject3 = i;
        localObject4 = "mediation_networks_fail";
        localObject5 = TextUtils.join(",", localArrayList);
        ((km)localObject3).a((String)localObject4, (String)localObject5);
      }
      Object localObject3 = new com/google/android/gms/b/nw;
      int i2 = 1;
      ((nw)localObject3).<init>(i2);
    }
  }
  
  public final void a()
  {
    Object localObject1 = d;
    boolean bool = true;
    try
    {
      k = bool;
      nv localnv = l;
      if (localnv != null)
      {
        localnv = l;
        localnv.a();
      }
      return;
    }
    finally {}
  }
  
  public final List b()
  {
    return m;
  }
}


/* Location:              com/google/android/gms/b/nz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */