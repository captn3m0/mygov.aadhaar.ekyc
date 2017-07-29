package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.uk;

@qi
public final class r
  extends FrameLayout
  implements View.OnClickListener
{
  private final ImageButton a;
  private final x b;
  
  public r(Context paramContext, a parama, x paramx)
  {
    super(paramContext);
    b = paramx;
    setOnClickListener(this);
    a = new ImageButton(paramContext);
    a.setImageResource(17301527);
    a.setBackgroundColor(0);
    a.setOnClickListener(this);
    paramx = a;
    ip.a();
    int i = uk.a(paramContext, a);
    ip.a();
    int j = uk.a(paramContext, 0);
    ip.a();
    int k = uk.a(paramContext, b);
    ip.a();
    paramx.setPadding(i, j, k, uk.a(paramContext, d));
    a.setContentDescription("Interstitial close button");
    ip.a();
    uk.a(paramContext, e);
    paramx = a;
    ip.a();
    i = uk.a(paramContext, e + a + b);
    ip.a();
    addView(paramx, new FrameLayout.LayoutParams(i, uk.a(paramContext, e + 0 + d), 17));
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2)
    {
      if (paramBoolean1)
      {
        a.setVisibility(4);
        return;
      }
      a.setVisibility(8);
      return;
    }
    a.setVisibility(0);
  }
  
  public final void onClick(View paramView)
  {
    if (b != null) {
      b.c();
    }
  }
  
  static final class a
  {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 32;
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */