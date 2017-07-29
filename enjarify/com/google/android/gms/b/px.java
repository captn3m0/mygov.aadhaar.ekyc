package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class px
  extends ps
{
  nq g;
  protected nw h;
  final vc i;
  boolean j;
  private oc l;
  private ns m;
  private final km n;
  
  px(Context paramContext, tg.a parama, oc paramoc, pt.a parama1, km paramkm, vc paramvc)
  {
    super(paramContext, parama, parama1);
    l = paramoc;
    ns localns = c;
    m = localns;
    n = paramkm;
    i = paramvc;
  }
  
  private static String a(List paramList)
  {
    Object localObject1 = "";
    if (paramList == null) {}
    Object localObject2;
    int k;
    for (localObject1 = ((String)localObject1).toString();; localObject1 = ((String)localObject2).substring(0, k))
    {
      return (String)localObject1;
      Iterator localIterator = paramList.iterator();
      localObject2 = localObject1;
      boolean bool2;
      do
      {
        do
        {
          do
          {
            boolean bool1 = localIterator.hasNext();
            if (!bool1) {
              break;
            }
            localObject1 = (nw)localIterator.next();
          } while (localObject1 == null);
          localObject3 = b;
        } while (localObject3 == null);
        localObject3 = b.d;
        bool2 = TextUtils.isEmpty((CharSequence)localObject3);
      } while (bool2);
      Object localObject3 = String.valueOf(localObject2);
      localObject2 = b;
      Object localObject4 = d;
      int i1 = a;
      switch (i1)
      {
      case 2: 
      default: 
        i1 = 6;
      }
      for (;;)
      {
        long l1 = g;
        k = String.valueOf(localObject4).length() + 33;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(k);
        localObject1 = String.valueOf((String)localObject4 + "." + i1 + "." + l1);
        i1 = String.valueOf(localObject3).length() + 1;
        int i2 = String.valueOf(localObject1).length();
        i1 += i2;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>(i1);
        localObject1 = (String)localObject3 + (String)localObject1 + "_";
        localObject2 = localObject1;
        break;
        i1 = 0;
        localObject2 = null;
        continue;
        i1 = 1;
        continue;
        i1 = 2;
        continue;
        i1 = 3;
        continue;
        i1 = 4;
        continue;
        i1 = 5;
      }
      k = ((String)localObject2).length() + -1;
      k = Math.max(0, k);
    }
  }
  
  protected final tg a(int paramInt)
  {
    Object localObject1 = this;
    Object localObject2 = e.a;
    tg localtg = new com/google/android/gms/b/tg;
    ih localih = c;
    vc localvc = i;
    List localList1 = f.d;
    List localList2 = f.f;
    List localList3 = f.j;
    qr localqr1 = f;
    int k = l;
    qr localqr2 = f;
    long l1 = k;
    String str1 = i;
    boolean bool1 = f.h;
    localObject2 = h;
    nr localnr;
    od localod;
    label137:
    Object localObject3;
    label161:
    ns localns;
    Object localObject4;
    label193:
    long l2;
    il localil;
    long l3;
    long l4;
    long l6;
    String str2;
    JSONObject localJSONObject;
    ss localss;
    List localList4;
    List localList5;
    boolean bool3;
    label325:
    qt localqt;
    if (localObject2 != null)
    {
      localObject2 = h;
      localnr = b;
      localObject1 = this;
      localObject2 = h;
      if (localObject2 == null) {
        break label457;
      }
      localObject2 = h;
      localod = c;
      localObject1 = this;
      localObject2 = h;
      if (localObject2 == null) {
        break label463;
      }
      localObject2 = h;
      localObject1 = d;
      localObject3 = localObject1;
      localObject1 = this;
      localns = m;
      localObject1 = this;
      localObject2 = h;
      if (localObject2 == null) {
        break label475;
      }
      localObject2 = h;
      localObject1 = e;
      localObject4 = localObject1;
      localObject1 = this;
      l2 = f.i;
      localil = e.d;
      localObject1 = this;
      l3 = f.g;
      l4 = e.f;
      long l5 = f.n;
      l6 = l5;
      str2 = f.o;
      localObject1 = this;
      localJSONObject = e.h;
      localObject1 = this;
      localss = f.C;
      localObject1 = this;
      localList4 = f.D;
      localObject1 = this;
      localList5 = f.E;
      localObject1 = this;
      localObject2 = m;
      if (localObject2 == null) {
        break label481;
      }
      localObject2 = m;
      boolean bool2 = n;
      bool3 = bool2;
      localObject1 = this;
      localqt = f.G;
      localObject1 = this;
      localObject2 = g;
      if (localObject2 == null) {
        break label487;
      }
      localObject2 = g.b();
    }
    label457:
    label463:
    label475:
    label481:
    label487:
    for (String str3 = a((List)localObject2);; str3 = null)
    {
      localObject1 = this;
      List localList6 = f.J;
      localObject1 = this;
      localObject1 = f.N;
      localtg.<init>(localih, localvc, localList1, paramInt, localList2, localList3, k, l1, str1, bool1, localnr, localod, (String)localObject3, localns, (nu)localObject4, l2, localil, l3, l4, l6, str2, localJSONObject, null, localss, localList4, localList5, bool3, localqt, str3, localList6, (String)localObject1);
      return localtg;
      localnr = null;
      break;
      localod = null;
      break label137;
      localObject2 = AdMobAdapter.class;
      localObject3 = ((Class)localObject2).getName();
      break label161;
      localObject4 = null;
      break label193;
      bool3 = false;
      break label325;
    }
  }
  
  protected final void a(long paramLong)
  {
    int i2;
    Object localObject8;
    Object localObject9;
    synchronized (d)
    {
      Object localObject2 = m;
      int k = l;
      i2 = -1;
      oc localoc;
      ns localns;
      boolean bool3;
      boolean bool4;
      kd localkd;
      long l1;
      if (k != i2)
      {
        ??? = new com/google/android/gms/b/ny;
        localObject8 = b;
        localObject2 = e;
        localObject9 = a;
        localoc = l;
        localns = m;
        localObject2 = f;
        bool3 = t;
        localObject2 = f;
        bool4 = B;
        localObject2 = ke.bG;
        localkd = w.q();
        localObject2 = localkd.a((jz)localObject2);
        localObject2 = (Long)localObject2;
        l1 = ((Long)localObject2).longValue();
        ((ny)???).<init>((Context)localObject8, (qo)localObject9, localoc, localns, bool3, bool4, paramLong, l1);
        g = ((nq)???);
        ??? = new java/util/ArrayList;
        localObject2 = m.a;
        ((ArrayList)???).<init>((Collection)localObject2);
        k = 0;
        localObject2 = null;
        localObject8 = e.a.c.m;
        localObject9 = "com.google.ads.mediation.admob.AdMobAdapter";
        boolean bool1;
        if (localObject8 != null)
        {
          localObject8 = ((Bundle)localObject8).getBundle((String)localObject9);
          if (localObject8 != null)
          {
            localObject2 = "_skipMediation";
            bool1 = ((Bundle)localObject8).getBoolean((String)localObject2);
          }
        }
        if (bool1)
        {
          localObject8 = ((List)???).listIterator();
          for (;;)
          {
            bool1 = ((ListIterator)localObject8).hasNext();
            if (!bool1) {
              break;
            }
            localObject2 = nextc;
            bool1 = ((List)localObject2).contains(localObject9);
            if (!bool1) {
              ((ListIterator)localObject8).remove();
            }
          }
        }
      }
      else
      {
        ??? = new com/google/android/gms/b/nz;
        localObject8 = b;
        localObject2 = e;
        localObject9 = a;
        localoc = l;
        localns = m;
        localObject2 = f;
        bool3 = t;
        localObject2 = f;
        bool4 = B;
        localObject2 = ke.bG;
        localkd = w.q();
        localObject2 = localkd.a((jz)localObject2);
        localObject2 = (Long)localObject2;
        l1 = ((Long)localObject2).longValue();
        km localkm = n;
        ((nz)???).<init>((Context)localObject8, (qo)localObject9, localoc, localns, bool3, bool4, paramLong, l1, localkm);
      }
    }
    Object localObject4 = g.a((List)???);
    h = ((nw)localObject4);
    localObject4 = h;
    int i1 = a;
    switch (i1)
    {
    default: 
      localObject4 = new com/google/android/gms/b/ps$a;
      i2 = h.a;
      localObject9 = new java/lang/StringBuilder;
      ((StringBuilder)localObject9).<init>(40);
      ??? = "Unexpected mediation result: " + i2;
      ((ps.a)localObject4).<init>((String)???, 0);
      throw ((Throwable)localObject4);
    case 1: 
      localObject4 = new com/google/android/gms/b/ps$a;
      ((ps.a)localObject4).<init>("No fill from any mediation ad networks.", 3);
      throw ((Throwable)localObject4);
    }
    localObject4 = h.b;
    if (localObject4 != null)
    {
      localObject4 = h.b.l;
      if (localObject4 != null)
      {
        localObject4 = new java/util/concurrent/CountDownLatch;
        i2 = 1;
        ((CountDownLatch)localObject4).<init>(i2);
        ??? = tt.a;
        localObject8 = new com/google/android/gms/b/px$1;
        ((px.1)localObject8).<init>(this, (CountDownLatch)localObject4);
        ((Handler)???).post((Runnable)localObject8);
        long l2 = 10;
        Object localObject6;
        try
        {
          ??? = TimeUnit.SECONDS;
          ((CountDownLatch)localObject4).await(l2, (TimeUnit)???);
          synchronized (d)
          {
            bool2 = j;
            if (!bool2)
            {
              localObject4 = new com/google/android/gms/b/ps$a;
              localObject8 = "View could not be prepared";
              localObject9 = null;
              ((ps.a)localObject4).<init>((String)localObject8, 0);
              throw ((Throwable)localObject4);
            }
          }
          int i3;
          localObject6 = i;
        }
        catch (InterruptedException localInterruptedException)
        {
          ??? = new com/google/android/gms/b/ps$a;
          localObject6 = String.valueOf(localInterruptedException);
          i3 = String.valueOf(localObject6).length() + 38;
          localObject9 = new java/lang/StringBuilder;
          ((StringBuilder)localObject9).<init>(i3);
          localObject6 = "Interrupted while waiting for latch : " + (String)localObject6;
          ((ps.a)???).<init>((String)localObject6, 0);
          throw ((Throwable)???);
        }
        boolean bool2 = ((vc)localObject6).r();
        if (bool2)
        {
          localObject6 = new com/google/android/gms/b/ps$a;
          localObject8 = "Assets not loaded, web view is destroyed";
          localObject9 = null;
          ((ps.a)localObject6).<init>((String)localObject8, 0);
          throw ((Throwable)localObject6);
        }
      }
    }
  }
  
  public final void c_()
  {
    synchronized (d)
    {
      super.c_();
      nq localnq = g;
      if (localnq != null)
      {
        localnq = g;
        localnq.a();
      }
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/px.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */