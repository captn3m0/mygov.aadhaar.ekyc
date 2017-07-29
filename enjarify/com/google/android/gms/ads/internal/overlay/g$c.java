package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.b.vc;

public final class g$c
{
  public final int a;
  public final ViewGroup.LayoutParams b;
  public final ViewGroup c;
  public final Context d;
  
  public g$c(vc paramvc)
  {
    Object localObject1 = paramvc.getLayoutParams();
    b = ((ViewGroup.LayoutParams)localObject1);
    localObject1 = paramvc.getParent();
    Object localObject2 = paramvc.g();
    d = ((Context)localObject2);
    if (localObject1 != null)
    {
      boolean bool = localObject1 instanceof ViewGroup;
      if (bool)
      {
        localObject1 = (ViewGroup)localObject1;
        c = ((ViewGroup)localObject1);
        localObject1 = c;
        localObject2 = paramvc.b();
        int i = ((ViewGroup)localObject1).indexOfChild((View)localObject2);
        a = i;
        localObject1 = c;
        localObject2 = paramvc.b();
        ((ViewGroup)localObject1).removeView((View)localObject2);
        paramvc.a(true);
        return;
      }
    }
    localObject1 = new com/google/android/gms/ads/internal/overlay/g$a;
    ((g.a)localObject1).<init>("Could not get the parent of the WebView for an overlay.");
    throw ((Throwable)localObject1);
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/g$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */