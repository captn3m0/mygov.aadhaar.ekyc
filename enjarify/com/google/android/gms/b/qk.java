package com.google.android.gms.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.c;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class qk
  extends to
  implements ql.a
{
  final qo.a a;
  final Object b;
  final Context c;
  Runnable d;
  tv e;
  qr f;
  ns g;
  private final qj.a h;
  private qo i;
  
  public qk(Context paramContext, qo.a parama, qj.a parama1)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    b = localObject;
    h = parama1;
    c = paramContext;
    a = parama;
  }
  
  private il a(qo paramqo)
  {
    Object localObject1 = f;
    int j = A;
    Object localObject2;
    float f1;
    if (j != 0)
    {
      localObject2 = d.g;
      int n = localObject2.length;
      j = 0;
      localObject1 = null;
      f1 = 0.0F;
      if (j < n)
      {
        il localil1 = localObject2[j];
        boolean bool2 = i;
        if (bool2)
        {
          localObject1 = new com/google/android/gms/b/il;
          localObject2 = d.g;
          ((il)localObject1).<init>(localil1, (il[])localObject2);
        }
      }
    }
    int i3;
    int i1;
    String str2;
    int i4;
    for (;;)
    {
      return (il)localObject1;
      j += 1;
      break;
      localObject1 = f.m;
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/b/qk$a;
        ((qk.a)localObject1).<init>("The ad response must specify one of the supported ad sizes.", 0);
        throw ((Throwable)localObject1);
      }
      localObject1 = f.m;
      localObject2 = "x";
      localObject1 = ((String)localObject1).split((String)localObject2);
      i3 = localObject1.length;
      i1 = 2;
      if (i3 != i1)
      {
        localObject2 = new com/google/android/gms/b/qk$a;
        str2 = "Invalid ad size format from the ad response: ";
        localObject1 = String.valueOf(f.m);
        i4 = ((String)localObject1).length();
        if (i4 != 0) {
          localObject1 = str2.concat((String)localObject1);
        }
        for (;;)
        {
          ((qk.a)localObject2).<init>((String)localObject1, 0);
          throw ((Throwable)localObject2);
          localObject1 = new java/lang/String;
          ((String)localObject1).<init>(str2);
        }
      }
      i3 = 0;
      float f2 = 0.0F;
      localObject2 = null;
      try
      {
        localObject2 = localObject1[0];
        i4 = Integer.parseInt((String)localObject2);
        i3 = 1;
        f2 = Float.MIN_VALUE;
        localObject1 = localObject1[i3];
        i2 = Integer.parseInt((String)localObject1);
        localObject1 = d;
        arrayOfil = g;
        i5 = arrayOfil.length;
        i1 = 0;
        str2 = null;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;)
        {
          int i2;
          il[] arrayOfil;
          int i5;
          il localil2;
          int i6;
          float f3;
          int i7;
          boolean bool1;
          localObject2 = new com/google/android/gms/b/qk$a;
          str2 = "Invalid ad size number from the ad response: ";
          str1 = String.valueOf(f.m);
          i4 = str1.length();
          if (i4 != 0) {
            str1 = str2.concat(str1);
          }
          for (;;)
          {
            ((qk.a)localObject2).<init>(str1, 0);
            throw ((Throwable)localObject2);
            str1 = new java/lang/String;
            str1.<init>(str2);
          }
          int m = e;
          continue;
          i3 = b;
          continue;
          m = i1 + 1;
          i1 = m;
        }
        localObject2 = new com/google/android/gms/b/qk$a;
        str2 = "The ad size from the ad response was not one of the requested sizes: ";
        str1 = String.valueOf(f.m);
        i4 = str1.length();
        if (i4 == 0) {
          break label564;
        }
      }
      if (i1 >= i5) {
        break label516;
      }
      localil2 = arrayOfil[i1];
      localObject1 = c.getResources().getDisplayMetrics();
      f2 = density;
      int k = e;
      i6 = -1;
      f3 = 0.0F / 0.0F;
      if (k != i6) {
        break label486;
      }
      f1 = f / f2;
      k = (int)f1;
      i6 = b;
      i7 = -2;
      if (i6 != i7) {
        break label495;
      }
      i6 = c;
      f3 = i6;
      f2 = f3 / f2;
      i3 = (int)f2;
      if ((i4 != k) || (i2 != i3)) {
        break label505;
      }
      bool1 = i;
      if (bool1) {
        break label505;
      }
      localObject1 = new com/google/android/gms/b/il;
      localObject2 = d.g;
      ((il)localObject1).<init>(localil2, (il[])localObject2);
    }
    label486:
    label495:
    label505:
    label516:
    String str1 = str2.concat(str1);
    for (;;)
    {
      ((qk.a)localObject2).<init>(str1, 0);
      throw ((Throwable)localObject2);
      label564:
      str1 = new java/lang/String;
      str1.<init>(str2);
    }
  }
  
  public final void a()
  {
    String str1 = null;
    tp.b("AdLoaderBackgroundTask started.");
    Object localObject1 = new com/google/android/gms/b/qk$1;
    ((qk.1)localObject1).<init>(this);
    d = ((Runnable)localObject1);
    Object localObject2 = tt.a;
    Runnable localRunnable = d;
    localObject1 = ke.bF;
    kd localkd = w.q();
    long l1 = ((Long)localkd.a((jz)localObject1)).longValue();
    ((Handler)localObject2).postDelayed(localRunnable, l1);
    long l2 = w.k().b();
    localObject1 = ke.bE;
    localObject2 = w.q();
    localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
    boolean bool = ((Boolean)localObject1).booleanValue();
    Object localObject3;
    String str2;
    String str3;
    if (bool)
    {
      localObject1 = a.b.c;
      if (localObject1 != null)
      {
        localObject1 = a.b.c;
        localObject2 = "_ad";
        localObject3 = ((Bundle)localObject1).getString((String)localObject2);
        if (localObject3 != null)
        {
          localObject1 = new com/google/android/gms/b/qo;
          localObject2 = a;
          str2 = null;
          str3 = null;
          ((qo)localObject1).<init>((qo.a)localObject2, l2, null, null, null);
          i = ((qo)localObject1);
          localObject1 = c;
          localObject2 = i;
          localObject1 = ri.a((Context)localObject1, (qo)localObject2, (String)localObject3);
          a((qr)localObject1);
        }
      }
    }
    for (;;)
    {
      return;
      localObject3 = new com/google/android/gms/b/uw;
      ((uw)localObject3).<init>();
      localObject1 = new com/google/android/gms/b/qk$2;
      ((qk.2)localObject1).<init>(this, (uv)localObject3);
      ts.a((Runnable)localObject1);
      localObject1 = w.D();
      localObject2 = c;
      str1 = ((ta)localObject1).b((Context)localObject2);
      localObject1 = w.D();
      localObject2 = c;
      str2 = ((ta)localObject1).c((Context)localObject2);
      localObject1 = w.D();
      localObject2 = c;
      str3 = ((ta)localObject1).d((Context)localObject2);
      localObject1 = w.D();
      localObject2 = c;
      ((ta)localObject1).c((Context)localObject2, str3);
      localObject1 = new com/google/android/gms/b/qo;
      localObject2 = a;
      ((qo)localObject1).<init>((qo.a)localObject2, l2, str1, str2, str3);
      i = ((qo)localObject1);
      localObject1 = i;
      ((uv)localObject3).a(localObject1);
    }
  }
  
  final void a(int paramInt, String paramString)
  {
    int j = 3;
    Object localObject1;
    if (paramInt != j)
    {
      j = -1;
      if (paramInt != j) {}
    }
    else
    {
      tp.d(paramString);
      localObject1 = f;
      if (localObject1 != null) {
        break label126;
      }
      localObject1 = new com/google/android/gms/b/qr;
      ((qr)localObject1).<init>(paramInt);
      f = ((qr)localObject1);
      label46:
      localObject1 = i;
      if (localObject1 == null) {
        break label161;
      }
    }
    for (Object localObject2 = i;; localObject2 = localObject1)
    {
      localObject1 = new com/google/android/gms/b/tg$a;
      qr localqr = f;
      ns localns = g;
      long l1 = f.n;
      ((tg.a)localObject1).<init>((qo)localObject2, localqr, localns, null, paramInt, -1, l1, null);
      h.a((tg.a)localObject1);
      return;
      tp.e(paramString);
      break;
      label126:
      localObject1 = new com/google/android/gms/b/qr;
      localObject2 = f;
      long l2 = k;
      ((qr)localObject1).<init>(paramInt, l2);
      f = ((qr)localObject1);
      break label46;
      label161:
      localObject1 = new com/google/android/gms/b/qo;
      localObject2 = a;
      l2 = -1;
      ((qo)localObject1).<init>((qo.a)localObject2, l2, null, null, null);
    }
  }
  
  public final void a(qr paramqr)
  {
    int j = -2;
    int k = -3;
    int m = 0;
    Object localObject1 = null;
    boolean bool1 = false;
    Object localObject2 = null;
    tp.b("Received ad response.");
    f = paramqr;
    long l1 = w.k().b();
    Object localObject3 = b;
    boolean bool2 = false;
    Object localObject4 = null;
    Object localObject9;
    boolean bool4;
    int i2;
    for (;;)
    {
      try
      {
        e = null;
        localObject4 = w.i();
        localObject3 = c;
        localObject9 = f;
        bool4 = H;
        ((tj)localObject4).b((Context)localObject3, bool4);
        localObject4 = ke.aW;
        localObject3 = w.q();
        localObject4 = (Boolean)((kd)localObject3).a((jz)localObject4);
        bool2 = ((Boolean)localObject4).booleanValue();
        if (bool2)
        {
          localObject4 = f;
          bool2 = P;
          if (!bool2) {
            break label450;
          }
          w.i();
          localObject4 = c;
          localObject3 = i.e;
          localObject4 = ((Context)localObject4).getSharedPreferences("admob", 0);
          localObject9 = Collections.emptySet();
          localObject2 = "never_pool_slots";
          localObject9 = ((SharedPreferences)localObject4).getStringSet((String)localObject2, (Set)localObject9);
          bool1 = ((Set)localObject9).contains(localObject3);
          if (!bool1)
          {
            localObject2 = new java/util/HashSet;
            ((HashSet)localObject2).<init>((Collection)localObject9);
            ((Set)localObject2).add(localObject3);
            localObject4 = ((SharedPreferences)localObject4).edit();
            localObject3 = "never_pool_slots";
            ((SharedPreferences.Editor)localObject4).putStringSet((String)localObject3, (Set)localObject2);
            ((SharedPreferences.Editor)localObject4).apply();
          }
        }
        try
        {
          localObject4 = f;
          n = e;
          if (n == j) {
            break;
          }
          localObject4 = f;
          n = e;
          if (n == k) {
            break;
          }
          localObject4 = new com/google/android/gms/b/qk$a;
          localObject1 = f;
          m = e;
          i2 = 66;
          localObject9 = new java/lang/StringBuilder;
          ((StringBuilder)localObject9).<init>(i2);
          localObject3 = "There was a problem getting an ad response. ErrorCode: ";
          localObject3 = ((StringBuilder)localObject9).append((String)localObject3);
          localObject1 = ((StringBuilder)localObject3).append(m);
          localObject1 = ((StringBuilder)localObject1).toString();
          localObject3 = f;
          i2 = e;
          ((qk.a)localObject4).<init>((String)localObject1, i2);
          throw ((Throwable)localObject4);
        }
        catch (qk.a locala)
        {
          m = a;
          Object localObject5 = locala.getMessage();
          a(m, (String)localObject5);
          localObject5 = tt.a;
          localObject1 = d;
          ((Handler)localObject5).removeCallbacks((Runnable)localObject1);
        }
        return;
      }
      finally {}
      label450:
      w.i();
      localObject7 = c;
      localObject3 = i.e;
      localObject7 = ((Context)localObject7).getSharedPreferences("admob", 0);
      localObject9 = Collections.emptySet();
      localObject2 = "never_pool_slots";
      localObject9 = ((SharedPreferences)localObject7).getStringSet((String)localObject2, (Set)localObject9);
      bool1 = ((Set)localObject9).contains(localObject3);
      if (bool1)
      {
        localObject2 = new java/util/HashSet;
        ((HashSet)localObject2).<init>((Collection)localObject9);
        ((Set)localObject2).remove(localObject3);
        localObject7 = ((SharedPreferences)localObject7).edit();
        localObject3 = "never_pool_slots";
        ((SharedPreferences.Editor)localObject7).putStringSet((String)localObject3, (Set)localObject2);
        ((SharedPreferences.Editor)localObject7).apply();
      }
    }
    Object localObject7 = f;
    int n = e;
    boolean bool3;
    if (n != k)
    {
      localObject7 = f;
      localObject7 = c;
      bool3 = TextUtils.isEmpty((CharSequence)localObject7);
      if (bool3)
      {
        localObject7 = new com/google/android/gms/b/qk$a;
        localObject1 = "No fill from ad server.";
        i2 = 3;
        ((qk.a)localObject7).<init>((String)localObject1, i2);
        throw ((Throwable)localObject7);
      }
      localObject7 = w.i();
      localObject3 = c;
      localObject9 = f;
      bool4 = u;
      ((tj)localObject7).a((Context)localObject3, bool4);
      localObject7 = f;
      bool3 = h;
      if (!bool3) {
        break label1195;
      }
    }
    for (;;)
    {
      try
      {
        localObject7 = new com/google/android/gms/b/ns;
        localObject3 = f;
        localObject3 = c;
        ((ns)localObject7).<init>((String)localObject3);
        g = ((ns)localObject7);
        localObject7 = w.i();
        localObject3 = g;
        bool5 = g;
        h = bool5;
        localObject7 = f;
        localObject7 = I;
        bool3 = TextUtils.isEmpty((CharSequence)localObject7);
        if (!bool3)
        {
          localObject7 = ke.cV;
          localObject3 = w.q();
          localObject7 = ((kd)localObject3).a((jz)localObject7);
          localObject7 = (Boolean)localObject7;
          bool3 = ((Boolean)localObject7).booleanValue();
          if (bool3)
          {
            localObject7 = "Received cookie from server. Setting webview cookie in CookieManager.";
            tp.b((String)localObject7);
            localObject7 = w.g();
            localObject3 = c;
            localObject7 = ((tu)localObject7).c((Context)localObject3);
            if (localObject7 != null)
            {
              localObject3 = "googleads.g.doubleclick.net";
              localObject9 = f;
              localObject9 = I;
              ((CookieManager)localObject7).setCookie((String)localObject3, (String)localObject9);
            }
          }
        }
        localObject7 = i;
        localObject7 = d;
        localObject7 = g;
        if (localObject7 == null) {
          break label1243;
        }
        localObject7 = i;
        localObject2 = a((qo)localObject7);
        localObject7 = w.i();
        bool5 = f.v;
        ((tj)localObject7).b(bool5);
        localObject7 = w.i();
        localObject3 = f;
        bool5 = O;
        ((tj)localObject7).c(bool5);
        localObject7 = f.r;
        bool3 = TextUtils.isEmpty((CharSequence)localObject7);
        if (bool3) {
          break label1237;
        }
      }
      catch (JSONException localJSONException)
      {
        try
        {
          localJSONObject = new org/json/JSONObject;
          localObject7 = f;
          localObject7 = r;
          localJSONObject.<init>((String)localObject7);
          localObject7 = new com/google/android/gms/b/tg$a;
          localObject1 = i;
          localObject3 = f;
          localObject9 = g;
          qr localqr = f;
          long l2 = n;
          ((tg.a)localObject7).<init>((qo)localObject1, (qr)localObject3, (ns)localObject9, (il)localObject2, j, l1, l2, localJSONObject);
          h.a((tg.a)localObject7);
          localObject7 = tt.a;
          localObject1 = d;
          ((Handler)localObject7).removeCallbacks((Runnable)localObject1);
        }
        catch (Exception localException)
        {
          boolean bool5;
          Object localObject8;
          int i1;
          localObject3 = "Error parsing the JSON for Active View.";
          tp.b((String)localObject3, localException);
        }
        localJSONException = localJSONException;
        localObject1 = "Could not parse mediation config.";
        tp.b((String)localObject1, localJSONException);
        localObject1 = new com/google/android/gms/b/qk$a;
        localObject3 = "Could not parse mediation config: ";
        localObject8 = f;
        localObject8 = c;
        localObject8 = String.valueOf(localObject8);
        i1 = ((String)localObject8).length();
        if (i1 == 0) {
          break label1180;
        }
      }
      localObject8 = ((String)localObject3).concat((String)localObject8);
      for (;;)
      {
        bool5 = false;
        localObject3 = null;
        ((qk.a)localObject1).<init>((String)localObject8, 0);
        throw ((Throwable)localObject1);
        label1180:
        localObject8 = new java/lang/String;
        ((String)localObject8).<init>((String)localObject3);
      }
      label1195:
      localObject8 = w.i();
      localObject3 = f;
      bool5 = K;
      h = bool5;
      continue;
      label1237:
      JSONObject localJSONObject = null;
      continue;
      label1243:
      bool1 = false;
      localObject2 = null;
    }
  }
  
  public final void c_()
  {
    synchronized (b)
    {
      tv localtv = e;
      if (localtv != null)
      {
        localtv = e;
        localtv.b();
      }
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/qk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */