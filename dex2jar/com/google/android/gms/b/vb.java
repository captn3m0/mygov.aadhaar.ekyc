package com.google.android.gms.b;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.overlay.l;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.common.internal.c;

@qi
public final class vb
{
  final vc a;
  final Context b;
  final ViewGroup c;
  n d;
  
  public vb(Context paramContext, ViewGroup paramViewGroup, vc paramvc)
  {
    this(paramContext, paramViewGroup, paramvc, (byte)0);
  }
  
  private vb(Context paramContext, ViewGroup paramViewGroup, vc paramvc, byte paramByte)
  {
    b = paramContext;
    c = paramViewGroup;
    a = paramvc;
    d = null;
  }
  
  public final n a()
  {
    c.b("getAdVideoUnderlay must be called from the UI thread.");
    return d;
  }
  
  public final void b()
  {
    c.b("onDestroy must be called from the UI thread.");
    if (d != null)
    {
      n localn = d;
      a.a = true;
      if (b != null) {
        b.c();
      }
      localn.k();
      c.removeView(d);
      d = null;
    }
  }
}


/* Location:              com/google/android/gms/b/vb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */