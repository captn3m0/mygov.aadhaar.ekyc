package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Window;

final class g$d$1
  implements Runnable
{
  g$d$1(g.d paramd, Drawable paramDrawable) {}
  
  public final void run()
  {
    Window localWindow = g.a(b.a).getWindow();
    Drawable localDrawable = a;
    localWindow.setBackgroundDrawable(localDrawable);
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/g$d$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */