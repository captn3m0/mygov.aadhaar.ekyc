package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@qi
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
    m = c;
    n = paramkm;
    i = paramvc;
  }
  
  private static String a(List<nw> paramList)
  {
    if (paramList == null) {
      return "".toString();
    }
    Iterator localIterator = paramList.iterator();
    paramList = "";
    while (localIterator.hasNext())
    {
      Object localObject = (nw)localIterator.next();
      if ((localObject != null) && (b != null) && (!TextUtils.isEmpty(b.d)))
      {
        paramList = String.valueOf(paramList);
        String str = b.d;
        int k;
        switch (a)
        {
        case 2: 
        default: 
          k = 6;
        }
        for (;;)
        {
          long l1 = g;
          localObject = String.valueOf(String.valueOf(str).length() + 33 + str + "." + k + "." + l1);
          paramList = String.valueOf(paramList).length() + 1 + String.valueOf(localObject).length() + paramList + (String)localObject + "_";
          break;
          k = 0;
          continue;
          k = 1;
          continue;
          k = 2;
          continue;
          k = 3;
          continue;
          k = 4;
          continue;
          k = 5;
        }
      }
    }
    return paramList.substring(0, Math.max(0, paramList.length() - 1));
  }
  
  protected final tg a(int paramInt)
  {
    Object localObject = e.a;
    ih localih = c;
    vc localvc = i;
    List localList1 = f.d;
    List localList2 = f.f;
    List localList3 = f.j;
    int k = f.l;
    long l1 = f.k;
    String str3 = i;
    boolean bool2 = f.h;
    od localod;
    label113:
    String str1;
    label129:
    ns localns;
    nu localnu;
    label151:
    long l2;
    il localil;
    long l3;
    long l4;
    long l5;
    String str4;
    JSONObject localJSONObject;
    ss localss;
    List localList4;
    List localList5;
    boolean bool1;
    label257:
    qt localqt;
    if (h != null)
    {
      localObject = h.b;
      if (h == null) {
        break label369;
      }
      localod = h.c;
      if (h == null) {
        break label375;
      }
      str1 = h.d;
      localns = m;
      if (h == null) {
        break label385;
      }
      localnu = h.e;
      l2 = f.i;
      localil = e.d;
      l3 = f.g;
      l4 = e.f;
      l5 = f.n;
      str4 = f.o;
      localJSONObject = e.h;
      localss = f.C;
      localList4 = f.D;
      localList5 = f.E;
      if (m == null) {
        break label391;
      }
      bool1 = m.n;
      localqt = f.G;
      if (g == null) {
        break label397;
      }
    }
    label369:
    label375:
    label385:
    label391:
    label397:
    for (String str2 = a(g.b());; str2 = null)
    {
      return new tg(localih, localvc, localList1, paramInt, localList2, localList3, k, l1, str3, bool2, (nr)localObject, localod, str1, localns, localnu, l2, localil, l3, l4, l5, str4, localJSONObject, null, localss, localList4, localList5, bool1, localqt, str2, f.J, f.N);
      localObject = null;
      break;
      localod = null;
      break label113;
      str1 = AdMobAdapter.class.getName();
      break label129;
      localnu = null;
      break label151;
      bool1 = false;
      break label257;
    }
  }
  
  protected final void a(long paramLong)
  {
    synchronized (d)
    {
      Object localObject1;
      qo localqo;
      oc localoc;
      ns localns;
      boolean bool1;
      boolean bool2;
      jz localjz;
      if (m.l != -1)
      {
        localObject1 = b;
        localqo = e.a;
        localoc = l;
        localns = m;
        bool1 = f.t;
        bool2 = f.B;
        localjz = ke.bG;
        localObject1 = new ny((Context)localObject1, localqo, localoc, localns, bool1, bool2, paramLong, ((Long)w.q().a(localjz)).longValue());
        g = ((nq)localObject1);
        localObject1 = new ArrayList(m.a);
        bool2 = false;
        ??? = e.a.c.m;
        bool1 = bool2;
        if (??? != null)
        {
          ??? = ((Bundle)???).getBundle("com.google.ads.mediation.admob.AdMobAdapter");
          bool1 = bool2;
          if (??? != null) {
            bool1 = ((Bundle)???).getBoolean("_skipMediation");
          }
        }
        if (bool1)
        {
          ??? = ((List)localObject1).listIterator();
          while (((ListIterator)???).hasNext()) {
            if (!nextc.contains("com.google.ads.mediation.admob.AdMobAdapter")) {
              ((ListIterator)???).remove();
            }
          }
        }
      }
      else
      {
        localObject1 = b;
        localqo = e.a;
        localoc = l;
        localns = m;
        bool1 = f.t;
        bool2 = f.B;
        localjz = ke.bG;
        localObject1 = new nz((Context)localObject1, localqo, localoc, localns, bool1, bool2, paramLong, ((Long)w.q().a(localjz)).longValue(), n);
      }
    }
    h = g.a(localList);
    switch (h.a)
    {
    default: 
      int k = h.a;
      throw new ps.a(40 + "Unexpected mediation result: " + k, 0);
    case 1: 
      throw new ps.a("No fill from any mediation ad networks.", 3);
    }
    String str;
    if ((h.b != null) && (h.b.l != null))
    {
      ??? = new CountDownLatch(1);
      tt.a.post(new Runnable()
      {
        public final void run()
        {
          synchronized (d)
          {
            j = p.a(i, h, localObject2);
            return;
          }
        }
      });
      try
      {
        ((CountDownLatch)???).await(10L, TimeUnit.SECONDS);
        synchronized (d)
        {
          if (!j) {
            throw new ps.a("View could not be prepared", 0);
          }
        }
        if (!i.r()) {
          break label615;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        str = String.valueOf(localInterruptedException);
        throw new ps.a(String.valueOf(str).length() + 38 + "Interrupted while waiting for latch : " + str, 0);
      }
      throw new ps.a("Assets not loaded, web view is destroyed", 0);
    }
    label615:
  }
  
  public final void c_()
  {
    synchronized (d)
    {
      super.c_();
      if (g != null) {
        g.a();
      }
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/px.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */