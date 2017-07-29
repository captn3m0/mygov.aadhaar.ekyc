package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.uk;

public final class r
  extends FrameLayout
  implements View.OnClickListener
{
  private final ImageButton a;
  private final x b;
  
  public r(Context paramContext, r.a parama, x paramx)
  {
    super(paramContext);
    b = paramx;
    setOnClickListener(this);
    ImageButton localImageButton = new android/widget/ImageButton;
    localImageButton.<init>(paramContext);
    a = localImageButton;
    a.setImageResource(17301527);
    a.setBackgroundColor(0);
    a.setOnClickListener(this);
    localImageButton = a;
    ip.a();
    int i = a;
    i = uk.a(paramContext, i);
    ip.a();
    int j = uk.a(paramContext, 0);
    ip.a();
    int k = b;
    k = uk.a(paramContext, k);
    ip.a();
    int m = d;
    m = uk.a(paramContext, m);
    localImageButton.setPadding(i, j, k, m);
    a.setContentDescription("Interstitial close button");
    ip.a();
    int n = e;
    uk.a(paramContext, n);
    localImageButton = a;
    FrameLayout.LayoutParams localLayoutParams = new android/widget/FrameLayout$LayoutParams;
    ip.a();
    j = e;
    k = a;
    j += k;
    k = b;
    j += k;
    j = uk.a(paramContext, j);
    ip.a();
    k = e + 0;
    m = d;
    k += m;
    k = uk.a(paramContext, k);
    localLayoutParams.<init>(j, k, 17);
    addView(localImageButton, localLayoutParams);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    ImageButton localImageButton;
    int i;
    if (paramBoolean2) {
      if (paramBoolean1)
      {
        localImageButton = a;
        i = 4;
        localImageButton.setVisibility(i);
      }
    }
    for (;;)
    {
      return;
      localImageButton = a;
      i = 8;
      localImageButton.setVisibility(i);
      continue;
      localImageButton = a;
      i = 0;
      localImageButton.setVisibility(0);
    }
  }
  
  public final void onClick(View paramView)
  {
    x localx = b;
    if (localx != null)
    {
      localx = b;
      localx.c();
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */