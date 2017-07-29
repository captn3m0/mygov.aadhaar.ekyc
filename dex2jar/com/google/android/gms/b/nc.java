package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.m;
import com.google.android.gms.ads.internal.w;
import java.util.LinkedList;

@qi
final class nc
{
  final LinkedList<a> a;
  ih b;
  final String c;
  final int d;
  boolean e;
  
  nc(ih paramih, String paramString, int paramInt)
  {
    com.google.android.gms.common.internal.c.a(paramih);
    com.google.android.gms.common.internal.c.a(paramString);
    a = new LinkedList();
    b = paramih;
    c = paramString;
    d = paramInt;
  }
  
  final a a(ih paramih)
  {
    if (paramih != null) {
      b = paramih;
    }
    return (a)a.remove();
  }
  
  final class a
  {
    m a;
    ih b;
    mx c;
    long d;
    boolean e;
    boolean f;
    
    a(mw parammw)
    {
      this$1 = c;
      a = new m(a.getApplicationContext(), new il(), nc.this, b, c, d);
      c = new mx();
      this$1 = c;
      parammw = a;
      parammw.a(new mx.1(nc.this));
      parammw.a(new mx.2(nc.this));
      parammw.a(new mx.3(nc.this));
      parammw.a(new mx.4(nc.this));
      parammw.a(new mx.5(nc.this));
      parammw.a(new mx.6(nc.this));
    }
    
    a(mw parammw, ih paramih)
    {
      this(parammw);
      b = paramih;
    }
    
    final boolean a()
    {
      if (e) {
        return false;
      }
      if (b != null) {}
      for (ih localih = b;; localih = b)
      {
        localih = mz.c(localih);
        Bundle localBundle = m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (localBundle != null) {
          localBundle.putBoolean("_skipMediation", true);
        }
        c.putBoolean("_skipMediation", true);
        f = a.a(localih);
        e = true;
        d = w.k().a();
        return true;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/nc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */