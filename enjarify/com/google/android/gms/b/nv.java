package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.b.c.a;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.ads.mediation.b;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class nv
  implements nw.a
{
  final String a;
  final nr b;
  ih c;
  final il d;
  final Context e;
  final Object f;
  final un g;
  final boolean h;
  final le i;
  final List j;
  final boolean k;
  od l;
  int m;
  private final oc n;
  private final long o;
  private final ns p;
  private of q;
  
  public nv(Context paramContext, String paramString, oc paramoc, ns paramns, nr paramnr, ih paramih, il paramil, un paramun, boolean paramBoolean1, boolean paramBoolean2, le paramle, List paramList)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    f = localObject;
    m = -2;
    e = paramContext;
    n = paramoc;
    b = paramnr;
    localObject = "com.google.ads.mediation.customevent.CustomEventAdapter";
    boolean bool = ((String)localObject).equals(paramString);
    if (bool)
    {
      localObject = d();
      a = ((String)localObject);
      p = paramns;
      l1 = b;
      long l2 = -1;
      bool = l1 < l2;
      if (!bool) {
        break label164;
      }
    }
    label164:
    for (long l1 = b;; l1 = 10000L)
    {
      o = l1;
      c = paramih;
      d = paramil;
      g = paramun;
      h = paramBoolean1;
      k = paramBoolean2;
      i = paramle;
      j = paramList;
      return;
      a = paramString;
      break;
    }
  }
  
  private static od a(b paramb)
  {
    oj localoj = new com/google/android/gms/b/oj;
    localoj.<init>(paramb);
    return localoj;
  }
  
  static com.google.android.gms.ads.b.c b(String paramString)
  {
    int i1 = 0;
    com.google.android.gms.ads.b.c localc = null;
    c.a locala = new com/google/android/gms/ads/b/c$a;
    locala.<init>();
    if (paramString == null)
    {
      localc = locala.a();
      return localc;
    }
    for (;;)
    {
      try
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        str1 = "multiple_images";
        String str2 = null;
        boolean bool1 = ((JSONObject)localObject).optBoolean(str1, false);
        c = bool1;
        str1 = "only_urls";
        str2 = null;
        bool1 = ((JSONObject)localObject).optBoolean(str1, false);
        a = bool1;
        str1 = "native_image_orientation";
        str2 = "any";
        localObject = ((JSONObject)localObject).optString(str1, str2);
        str1 = "landscape";
        bool1 = str1.equals(localObject);
        if (!bool1) {
          continue;
        }
        i1 = 2;
        b = i1;
      }
      catch (JSONException localJSONException)
      {
        String str1;
        boolean bool2;
        Object localObject = "Exception occurred when creating native ad options";
        tp.c((String)localObject, localJSONException);
        continue;
      }
      localc = locala.a();
      break;
      str1 = "portrait";
      bool2 = str1.equals(localObject);
      if (bool2) {
        i1 = 1;
      }
    }
  }
  
  private String d()
  {
    for (;;)
    {
      try
      {
        localObject1 = b;
        localObject1 = e;
        boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
        if (bool) {
          continue;
        }
        localObject1 = n;
        Object localObject2 = b;
        localObject2 = e;
        bool = ((oc)localObject1).b((String)localObject2);
        if (!bool) {
          continue;
        }
        localObject1 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        String str = "Fail to determine the custom event's version, assuming the old one.";
        tp.e(str);
        str = "com.google.ads.mediation.customevent.CustomEventAdapter";
        continue;
      }
      return (String)localObject1;
      localObject1 = "com.google.ads.mediation.customevent.CustomEventAdapter";
    }
  }
  
  private of e()
  {
    int i1 = m;
    boolean bool1;
    of localof;
    if (i1 == 0)
    {
      bool1 = c();
      if (bool1) {}
    }
    else
    {
      bool1 = false;
      localof = null;
    }
    for (;;)
    {
      return localof;
      int i2 = 4;
      try
      {
        boolean bool2 = b(i2);
        if (bool2)
        {
          localof = q;
          if (localof != null)
          {
            localof = q;
            int i3 = localof.a();
            if (i3 != 0) {
              localof = q;
            }
          }
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject = "Could not get cpm value from MediationResponseMetadata";
        tp.e((String)localObject);
        int i4 = f();
        localObject = new com/google/android/gms/b/nv$2;
        ((nv.2)localObject).<init>(i4);
      }
    }
  }
  
  private int f()
  {
    Object localObject = b.i;
    int i1;
    if (localObject == null)
    {
      i1 = 0;
      localObject = null;
    }
    label83:
    label125:
    for (;;)
    {
      return i1;
      JSONObject localJSONObject;
      String str1;
      try
      {
        localJSONObject = new org/json/JSONObject;
        localObject = b;
        localObject = i;
        localJSONObject.<init>((String)localObject);
        localObject = "com.google.ads.mediation.admob.AdMobAdapter";
        String str2 = a;
        boolean bool1 = ((String)localObject).equals(str2);
        if (!bool1) {
          break label83;
        }
        localObject = "cpm_cents";
        i2 = localJSONObject.optInt((String)localObject, 0);
      }
      catch (JSONException localJSONException)
      {
        tp.e("Could not convert to json. Returning 0");
        int i2 = 0;
        str1 = null;
      }
      continue;
      boolean bool2 = b(2);
      int i3;
      if (bool2)
      {
        str1 = "cpm_floor_cents";
        i3 = localJSONObject.optInt(str1, 0);
      }
      for (;;)
      {
        if (i3 != 0) {
          break label125;
        }
        str1 = "penalized_average_cpm_cents";
        i3 = localJSONObject.optInt(str1, 0);
        break;
        i3 = 0;
        str1 = null;
      }
    }
  }
  
  public final nw a(long paramLong1, long paramLong2)
  {
    for (;;)
    {
      long l3;
      Object localObject4;
      long l4;
      int i2;
      synchronized (f)
      {
        long l1 = SystemClock.elapsedRealtime();
        nu localnu = new com/google/android/gms/b/nu;
        localnu.<init>();
        Object localObject2 = tt.a;
        Object localObject3 = new com/google/android/gms/b/nv$1;
        ((nv.1)localObject3).<init>(this, localnu);
        ((Handler)localObject2).post((Runnable)localObject3);
        long l2 = o;
        int i1 = m;
        int i3 = -2;
        if (i1 != i3)
        {
          localObject2 = w.k();
          l2 = ((com.google.android.gms.common.util.c)localObject2).b();
          l3 = l2 - l1;
          nw localnw = new com/google/android/gms/b/nw;
          localObject2 = b;
          localObject3 = l;
          localObject4 = a;
          i3 = m;
          of localof = e();
          localnw.<init>((nr)localObject2, (od)localObject3, (String)localObject4, localnu, i3, localof, l3);
          return localnw;
        }
        l4 = SystemClock.elapsedRealtime();
        l3 = l4 - l1;
        l3 = l2 - l3;
        l4 -= paramLong1;
        l4 = paramLong2 - l4;
        long l5 = 0L;
        boolean bool = l3 < l5;
        if (bool)
        {
          l5 = 0L;
          bool = l4 < l5;
          if (bool) {}
        }
        else
        {
          localObject4 = "Timed out waiting for adapter.";
          tp.d((String)localObject4);
          i2 = 3;
          m = i2;
        }
      }
      try
      {
        localObject4 = f;
        l4 = Math.min(l3, l4);
        localObject4.wait(l4);
      }
      catch (InterruptedException localInterruptedException)
      {
        i2 = -1;
        m = i2;
      }
    }
  }
  
  final String a(String paramString)
  {
    if (paramString != null)
    {
      boolean bool = c();
      if (bool)
      {
        bool = b(2);
        if (!bool) {
          break label25;
        }
      }
    }
    for (;;)
    {
      return paramString;
      try
      {
        label25:
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        String str2 = "cpm_floor_cents";
        localJSONObject.remove(str2);
        paramString = localJSONObject.toString();
      }
      catch (JSONException localJSONException)
      {
        String str1 = "Could not remove field. Returning the original value";
        tp.e(str1);
      }
    }
  }
  
  public final void a()
  {
    synchronized (f)
    {
      try
      {
        localObject2 = l;
        if (localObject2 != null)
        {
          localObject2 = l;
          ((od)localObject2).c();
        }
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          Object localObject2;
          int i1;
          String str = "Could not destroy mediation adapter.";
          tp.c(str, localRemoteException);
        }
      }
      i1 = -1;
      m = i1;
      localObject2 = f;
      localObject2.notify();
      return;
    }
  }
  
  public final void a(int paramInt)
  {
    synchronized (f)
    {
      m = paramInt;
      Object localObject2 = f;
      localObject2.notify();
      return;
    }
  }
  
  public final void a(of paramof)
  {
    Object localObject1 = f;
    Object localObject2 = null;
    try
    {
      m = 0;
      q = paramof;
      localObject2 = f;
      localObject2.notify();
      return;
    }
    finally {}
  }
  
  final od b()
  {
    Object localObject1 = "Instantiating mediation adapter: ";
    Object localObject2 = String.valueOf(a);
    int i1 = ((String)localObject2).length();
    boolean bool;
    if (i1 != 0)
    {
      localObject2 = ((String)localObject1).concat((String)localObject2);
      tp.d((String)localObject2);
      bool = h;
      if (bool) {
        break label223;
      }
      localObject2 = ke.bC;
      localObject1 = w.q();
      localObject2 = (Boolean)((kd)localObject1).a((jz)localObject2);
      bool = ((Boolean)localObject2).booleanValue();
      if (!bool) {
        break label117;
      }
      localObject2 = "com.google.ads.mediation.admob.AdMobAdapter";
      localObject1 = a;
      bool = ((String)localObject2).equals(localObject1);
      if (!bool) {
        break label117;
      }
      localObject2 = new com/google/ads/mediation/admob/AdMobAdapter;
      ((AdMobAdapter)localObject2).<init>();
      localObject2 = a((b)localObject2);
    }
    label117:
    label223:
    String str;
    for (;;)
    {
      return (od)localObject2;
      localObject2 = new java/lang/String;
      ((String)localObject2).<init>((String)localObject1);
      break;
      localObject2 = ke.bD;
      localObject1 = w.q();
      localObject2 = (Boolean)((kd)localObject1).a((jz)localObject2);
      bool = ((Boolean)localObject2).booleanValue();
      if (bool)
      {
        localObject2 = "com.google.ads.mediation.AdUrlAdapter";
        localObject1 = a;
        bool = ((String)localObject2).equals(localObject1);
        if (bool)
        {
          localObject2 = new com/google/ads/mediation/AdUrlAdapter;
          ((AdUrlAdapter)localObject2).<init>();
          localObject2 = a((b)localObject2);
          continue;
        }
      }
      localObject2 = "com.google.ads.mediation.admob.AdMobCustomTabsAdapter";
      localObject1 = a;
      bool = ((String)localObject2).equals(localObject1);
      if (bool)
      {
        localObject2 = new com/google/android/gms/b/oj;
        localObject1 = new com/google/android/gms/b/or;
        ((or)localObject1).<init>();
        ((oj)localObject2).<init>((b)localObject1);
      }
      else
      {
        try
        {
          localObject2 = n;
          localObject1 = a;
          localObject2 = ((oc)localObject2).a((String)localObject1);
        }
        catch (RemoteException localRemoteException)
        {
          str = "Could not instantiate mediation adapter: ";
          localObject2 = String.valueOf(a);
          int i2 = ((String)localObject2).length();
          if (i2 == 0) {
            break label289;
          }
        }
      }
    }
    localObject2 = str.concat((String)localObject2);
    for (;;)
    {
      tp.a((String)localObject2, localRemoteException);
      bool = false;
      localObject2 = null;
      break;
      label289:
      localObject2 = new java/lang/String;
      ((String)localObject2).<init>(str);
    }
  }
  
  final boolean b(int paramInt)
  {
    boolean bool1 = false;
    for (;;)
    {
      try
      {
        boolean bool2 = h;
        if (!bool2) {
          continue;
        }
        localObject = l;
        localObject = ((od)localObject).l();
        if (localObject != null)
        {
          String str2 = "capabilities";
          int i1 = ((Bundle)localObject).getInt(str2, 0) & paramInt;
          if (i1 == paramInt) {
            bool1 = true;
          }
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject;
        boolean bool3;
        String str1 = "Could not get adapter info. Returning false";
        tp.e(str1);
        continue;
      }
      return bool1;
      localObject = d;
      bool3 = d;
      if (bool3)
      {
        localObject = l;
        localObject = ((od)localObject).k();
      }
      else
      {
        localObject = l;
        localObject = ((od)localObject).j();
      }
    }
  }
  
  final boolean c()
  {
    ns localns = p;
    int i1 = l;
    int i3 = -1;
    if (i1 != i3) {
      i1 = 1;
    }
    for (;;)
    {
      return i1;
      int i2 = 0;
      localns = null;
    }
  }
}


/* Location:              com/google/android/gms/b/nv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */