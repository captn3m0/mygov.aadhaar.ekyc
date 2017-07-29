package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.ads.internal.x;
import com.google.android.gms.common.internal.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class rx
  extends b
  implements sl
{
  private static rx m;
  private static final oa n;
  final Map l;
  private boolean o;
  
  static
  {
    oa localoa = new com/google/android/gms/b/oa;
    localoa.<init>();
    n = localoa;
  }
  
  public rx(Context paramContext, e parame, il paramil, oc paramoc, un paramun)
  {
    super(paramContext, paramil, null, paramoc, paramun, parame);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    l = ((Map)localObject);
    m = this;
  }
  
  public static rx J()
  {
    return m;
  }
  
  private static tg.a b(tg.a parama)
  {
    Object localObject1 = "Creating mediation ad response for non-mediated rewarded ad.";
    tp.a((String)localObject1);
    try
    {
      localObject1 = b;
      localObject1 = ri.a((qr)localObject1);
      localObject2 = ((JSONObject)localObject1).toString();
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>();
      localObject3 = "pubid";
      localObject4 = a;
      localObject4 = e;
      ((JSONObject)localObject1).put((String)localObject3, localObject4);
      localObject5 = ((JSONObject)localObject1).toString();
      localObject1 = new com/google/android/gms/b/nr;
      localObject3 = new String[1];
      localObject3[0] = "com.google.ads.mediation.admob.AdMobAdapter";
      localObject3 = Arrays.asList((Object[])localObject3);
      localObject4 = Collections.emptyList();
      localObject6 = Collections.emptyList();
      List localList1 = Collections.emptyList();
      List localList2 = Collections.emptyList();
      List localList3 = Collections.emptyList();
      ((nr)localObject1).<init>((String)localObject2, (List)localObject3, (List)localObject4, (List)localObject6, (String)localObject5, localList1, localList2, localList3);
      ns localns = new com/google/android/gms/b/ns;
      int i = 1;
      localObject2 = new nr[i];
      localObject2[0] = localObject1;
      localObject2 = Arrays.asList((Object[])localObject2);
      localObject1 = ke.bG;
      long l1 = ((Long)w.q().a((jz)localObject1)).longValue();
      localObject6 = Collections.emptyList();
      localObject5 = Collections.emptyList();
      localList1 = Collections.emptyList();
      localList2 = Collections.emptyList();
      localList3 = null;
      String str = "";
      localObject1 = localns;
      localns.<init>((List)localObject2, l1, (List)localObject6, (List)localObject5, localList1, localList2, false, str);
      localObject1 = new com/google/android/gms/b/tg$a;
      localObject2 = a;
      localObject3 = b;
      localObject6 = d;
      j = e;
      l2 = f;
      l3 = g;
      localJSONObject = h;
      localObject4 = localns;
      ((tg.a)localObject1).<init>((qo)localObject2, (qr)localObject3, localns, (il)localObject6, j, l2, l3, localJSONObject);
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        tp.b("Unable to generate ad state for non-mediated rewarded video.", localJSONException);
        tg.a locala = new com/google/android/gms/b/tg$a;
        Object localObject2 = a;
        Object localObject3 = b;
        Object localObject4 = null;
        Object localObject6 = d;
        int j = 0;
        Object localObject5 = null;
        long l2 = f;
        long l3 = g;
        JSONObject localJSONObject = h;
        locala.<init>((qo)localObject2, (qr)localObject3, null, (il)localObject6, 0, l2, l3, localJSONObject);
      }
    }
    return (tg.a)localObject1;
  }
  
  public final void K()
  {
    Object localObject1 = "showAd must be called on the main UI thread.";
    c.b((String)localObject1);
    boolean bool = L();
    if (!bool)
    {
      localObject1 = "The reward video has not loaded.";
      tp.e((String)localObject1);
    }
    for (;;)
    {
      return;
      bool = true;
      o = bool;
      localObject1 = f.j.q;
      localObject1 = b((String)localObject1);
      if (localObject1 != null)
      {
        Object localObject2 = a;
        if (localObject2 != null) {
          try
          {
            localObject1 = a;
            ((od)localObject1).f();
          }
          catch (RemoteException localRemoteException)
          {
            localObject2 = "Could not call showVideo.";
            tp.c((String)localObject2, localRemoteException);
          }
        }
      }
    }
  }
  
  public final boolean L()
  {
    c.b("isLoaded must be called on the main UI thread.");
    Object localObject = f.g;
    boolean bool;
    if (localObject == null)
    {
      localObject = f.h;
      if (localObject == null)
      {
        localObject = f.j;
        if (localObject != null)
        {
          bool = o;
          if (!bool) {
            bool = true;
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public final void M()
  {
    tg localtg = f.j;
    a(localtg, false);
    t();
  }
  
  public final void N()
  {
    Object localObject = f.j;
    if (localObject != null)
    {
      localObject = f.j.o;
      if (localObject != null)
      {
        w.x();
        localObject = f.c;
        String str1 = f.e.a;
        tg localtg = f.j;
        String str2 = f.b;
        List localList = f.j.o.j;
        nx.a((Context)localObject, str1, localtg, str2, false, localList);
      }
    }
    v();
  }
  
  public final void O()
  {
    r();
  }
  
  public final void P()
  {
    e();
  }
  
  public final void Q()
  {
    s();
  }
  
  public final void a(sg paramsg)
  {
    c.b("loadAd must be called on the main UI thread.");
    Object localObject1 = b;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    Object localObject2;
    if (bool)
    {
      tp.e("Invalid ad unit id. Aborting.");
      localObject1 = tt.a;
      localObject2 = new com/google/android/gms/b/rx$1;
      ((rx.1)localObject2).<init>(this);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      bool = false;
      o = false;
      localObject1 = f;
      localObject2 = b;
      b = ((String)localObject2);
      localObject1 = a;
      super.a((ih)localObject1);
    }
  }
  
  public final void a(tg.a parama, km paramkm)
  {
    int i = e;
    int j = -2;
    if (i != j)
    {
      localObject1 = tt.a;
      localObject2 = new com/google/android/gms/b/rx$2;
      ((rx.2)localObject2).<init>(this, parama);
      ((Handler)localObject1).post((Runnable)localObject2);
      return;
    }
    f.k = parama;
    Object localObject1 = c;
    if (localObject1 == null)
    {
      localObject1 = f;
      localObject2 = b(parama);
      k = ((tg.a)localObject2);
    }
    localObject1 = f;
    j = 0;
    F = 0;
    Object localObject2 = f;
    w.d();
    localObject1 = f.c;
    Object localObject3 = f.k;
    so localso = new com/google/android/gms/b/so;
    localso.<init>((Context)localObject1, (tg.a)localObject3, this);
    localObject3 = "AdRenderer: ";
    localObject1 = String.valueOf(localso.getClass().getName());
    int k = ((String)localObject1).length();
    if (k != 0) {
      localObject1 = ((String)localObject3).concat((String)localObject1);
    }
    for (;;)
    {
      tp.b((String)localObject1);
      localso.c();
      h = localso;
      break;
      localObject1 = new java/lang/String;
      ((String)localObject1).<init>((String)localObject3);
    }
  }
  
  protected final boolean a(ih paramih, tg paramtg, boolean paramBoolean)
  {
    return false;
  }
  
  public final boolean a(tg paramtg1, tg paramtg2)
  {
    return true;
  }
  
  public final sp b(String paramString)
  {
    localObject1 = (sp)l.get(paramString);
    if (localObject1 == null) {}
    try
    {
      localObject2 = j;
      localObject3 = "com.google.ads.mediation.admob.AdMobAdapter";
      boolean bool = ((String)localObject3).equals(paramString);
      if (!bool) {
        break label149;
      }
      localObject2 = n;
      localObject3 = localObject2;
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        try
        {
          Object localObject3;
          localObject1 = l;
          ((Map)localObject1).put(paramString, localObject2);
          localObject1 = localObject2;
          return (sp)localObject1;
        }
        catch (Exception localException1)
        {
          String str;
          int i;
          localObject4 = localException1;
          continue;
        }
        localException2 = localException2;
        Object localObject2 = localObject1;
        str = "Fail to instantiate adapter ";
        localObject1 = String.valueOf(paramString);
        i = ((String)localObject1).length();
        if (i != 0)
        {
          localObject1 = str.concat((String)localObject1);
          tp.c((String)localObject1, localException2);
          localObject1 = localObject2;
        }
        else
        {
          localObject1 = new java/lang/String;
          ((String)localObject1).<init>(str);
          continue;
          Object localObject4 = localObject2;
        }
      }
    }
    localObject2 = new com/google/android/gms/b/sp;
    localObject3 = ((oc)localObject3).a(paramString);
    ((sp)localObject2).<init>((od)localObject3, this);
  }
  
  public final void b(ss paramss)
  {
    Object localObject1 = f.j;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = f.j.o;
      if (localObject1 != null)
      {
        w.x();
        localObject1 = f.c;
        localObject2 = f.e.a;
        tg localtg = f.j;
        String str = f.b;
        List localList = f.j.o.k;
        nx.a((Context)localObject1, (String)localObject2, localtg, str, false, localList);
      }
    }
    localObject1 = f.j;
    if (localObject1 != null)
    {
      localObject1 = f.j.r;
      if (localObject1 != null)
      {
        localObject1 = f.j.r.j;
        boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
        if (!bool)
        {
          paramss = new com/google/android/gms/b/ss;
          localObject1 = f.j.r.j;
          localObject2 = f.j.r;
          int i = k;
          paramss.<init>((String)localObject1, i);
        }
      }
    }
    a(paramss);
  }
  
  public final void h()
  {
    c.b("destroy must be called on the main UI thread.");
    Object localObject1 = l.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (bool)
      {
        localObject1 = (String)localIterator.next();
        try
        {
          Object localObject2 = l;
          localObject2 = ((Map)localObject2).get(localObject1);
          localObject2 = (sp)localObject2;
          if (localObject2 != null)
          {
            od localod = a;
            if (localod != null)
            {
              localObject2 = a;
              ((od)localObject2).c();
            }
          }
        }
        catch (RemoteException localRemoteException)
        {
          String str = "Fail to destroy adapter: ";
          localObject1 = String.valueOf(localObject1);
          int i = ((String)localObject1).length();
          if (i != 0) {
            localObject1 = str.concat((String)localObject1);
          }
          for (;;)
          {
            tp.e((String)localObject1);
            break;
            localObject1 = new java/lang/String;
            ((String)localObject1).<init>(str);
          }
        }
      }
    }
  }
  
  public final void m()
  {
    c.b("pause must be called on the main UI thread.");
    Object localObject1 = l.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (bool)
      {
        localObject1 = (String)localIterator.next();
        try
        {
          Object localObject2 = l;
          localObject2 = ((Map)localObject2).get(localObject1);
          localObject2 = (sp)localObject2;
          if (localObject2 != null)
          {
            od localod = a;
            if (localod != null)
            {
              localObject2 = a;
              ((od)localObject2).d();
            }
          }
        }
        catch (RemoteException localRemoteException)
        {
          String str = "Fail to pause adapter: ";
          localObject1 = String.valueOf(localObject1);
          int i = ((String)localObject1).length();
          if (i != 0) {
            localObject1 = str.concat((String)localObject1);
          }
          for (;;)
          {
            tp.e((String)localObject1);
            break;
            localObject1 = new java/lang/String;
            ((String)localObject1).<init>(str);
          }
        }
      }
    }
  }
  
  public final void n()
  {
    c.b("resume must be called on the main UI thread.");
    Object localObject1 = l.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (bool)
      {
        localObject1 = (String)localIterator.next();
        try
        {
          Object localObject2 = l;
          localObject2 = ((Map)localObject2).get(localObject1);
          localObject2 = (sp)localObject2;
          if (localObject2 != null)
          {
            od localod = a;
            if (localod != null)
            {
              localObject2 = a;
              ((od)localObject2).e();
            }
          }
        }
        catch (RemoteException localRemoteException)
        {
          String str = "Fail to resume adapter: ";
          localObject1 = String.valueOf(localObject1);
          int i = ((String)localObject1).length();
          if (i != 0) {
            localObject1 = str.concat((String)localObject1);
          }
          for (;;)
          {
            tp.e((String)localObject1);
            break;
            localObject1 = new java/lang/String;
            ((String)localObject1).<init>(str);
          }
        }
      }
    }
  }
  
  protected final void r()
  {
    f.j = null;
    super.r();
  }
}


/* Location:              com/google/android/gms/b/rx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */