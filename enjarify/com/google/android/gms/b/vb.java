package com.google.android.gms.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.overlay.b;
import com.google.android.gms.ads.internal.overlay.l;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.common.internal.c;

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
    Object localObject1 = d;
    if (localObject1 != null)
    {
      localObject1 = d;
      Object localObject2 = a;
      boolean bool = true;
      a = bool;
      localObject2 = b;
      if (localObject2 != null)
      {
        localObject2 = b;
        ((l)localObject2).c();
      }
      ((n)localObject1).k();
      localObject1 = c;
      localObject2 = d;
      ((ViewGroup)localObject1).removeView((View)localObject2);
      localObject1 = null;
      d = null;
    }
  }
}


/* Location:              com/google/android/gms/b/vb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */