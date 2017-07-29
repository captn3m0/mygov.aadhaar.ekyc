package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.nj;
import com.google.android.gms.b.ti;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.un;
import com.google.android.gms.common.util.c;

public final class h
{
  final Object a;
  Context b;
  
  public h()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  public final void a(Context paramContext, un paramun, String paramString, Runnable paramRunnable)
  {
    a(paramContext, paramun, true, null, paramString, null, paramRunnable);
  }
  
  final void a(Context paramContext, un paramun, boolean paramBoolean, ti paramti, String paramString1, String paramString2, Runnable paramRunnable)
  {
    h.1 local1 = null;
    boolean bool1 = true;
    boolean bool2;
    if (paramti == null)
    {
      bool2 = bool1;
      if (bool2) {
        break label128;
      }
    }
    for (;;)
    {
      return;
      long l1 = a;
      l1 = w.k().a() - l1;
      Object localObject1 = ke.cF;
      Object localObject2 = w.q();
      localObject1 = (Long)((kd)localObject2).a((jz)localObject1);
      long l2 = ((Long)localObject1).longValue();
      bool2 = l1 < l2;
      if (bool2) {
        bool2 = bool1;
      }
      for (;;)
      {
        if (!bool2)
        {
          bool2 = e;
          if (bool2) {
            break label119;
          }
        }
        bool2 = bool1;
        break;
        bool2 = false;
        localObject1 = null;
      }
      label119:
      bool2 = false;
      localObject1 = null;
      break;
      label128:
      if (paramContext == null)
      {
        localObject1 = "Context not provided to fetch application settings";
        tp.e((String)localObject1);
      }
      else
      {
        bool2 = TextUtils.isEmpty(paramString1);
        if (bool2)
        {
          bool2 = TextUtils.isEmpty(paramString2);
          if (bool2)
          {
            localObject1 = "App settings could not be fetched. Required parameters missing";
            tp.e((String)localObject1);
            continue;
          }
        }
        b = paramContext;
        nj localnj = w.e().a(paramContext, paramun);
        local1 = new com/google/android/gms/ads/internal/h$1;
        local1.<init>(this, paramRunnable);
        Handler localHandler = tt.a;
        localObject1 = new com/google/android/gms/ads/internal/h$2;
        localObject2 = paramString1;
        ((h.2)localObject1).<init>(localnj, local1, paramString1, paramString2, paramBoolean, paramContext);
        localHandler.post((Runnable)localObject1);
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */