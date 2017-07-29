package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.b.tw;

public final class g$b
  extends RelativeLayout
{
  tw a;
  public boolean b;
  
  public g$b(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext);
    tw localtw = new com/google/android/gms/b/tw;
    localtw.<init>(paramContext, paramString1);
    a = localtw;
    a.d = paramString2;
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = b;
    if (!bool)
    {
      tw localtw = a;
      localtw.a(paramMotionEvent);
    }
    return false;
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/g$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */