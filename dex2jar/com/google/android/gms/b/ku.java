package com.google.android.gms.b;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.internal.c;
import java.util.Iterator;
import java.util.List;

@qi
public final class ku
  extends RelativeLayout
{
  private static final float[] a = { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F };
  private AnimationDrawable b;
  
  public ku(Context paramContext, kt paramkt, RelativeLayout.LayoutParams paramLayoutParams)
  {
    super(paramContext);
    c.a(paramkt);
    Object localObject = new ShapeDrawable(new RoundRectShape(a, null, null));
    ((ShapeDrawable)localObject).getPaint().setColor(e);
    setLayoutParams(paramLayoutParams);
    w.g().a(this, (Drawable)localObject);
    paramLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    if (!TextUtils.isEmpty(c))
    {
      localObject = new RelativeLayout.LayoutParams(-2, -2);
      TextView localTextView = new TextView(paramContext);
      localTextView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      localTextView.setId(1195835393);
      localTextView.setTypeface(Typeface.DEFAULT);
      localTextView.setText(c);
      localTextView.setTextColor(f);
      localTextView.setTextSize(g);
      ip.a();
      int i = uk.a(paramContext, 4);
      ip.a();
      localTextView.setPadding(i, 0, uk.a(paramContext, 4), 0);
      addView(localTextView);
      paramLayoutParams.addRule(1, localTextView.getId());
    }
    paramContext = new ImageView(paramContext);
    paramContext.setLayoutParams(paramLayoutParams);
    paramContext.setId(1195835394);
    paramLayoutParams = d;
    if (paramLayoutParams.size() > 1)
    {
      b = new AnimationDrawable();
      paramLayoutParams = paramLayoutParams.iterator();
      while (paramLayoutParams.hasNext())
      {
        localObject = (Drawable)paramLayoutParams.next();
        b.addFrame((Drawable)localObject, h);
      }
      w.g().a(paramContext, b);
    }
    for (;;)
    {
      addView(paramContext);
      return;
      if (paramLayoutParams.size() == 1) {
        paramContext.setImageDrawable((Drawable)paramLayoutParams.get(0));
      }
    }
  }
  
  public final void onAttachedToWindow()
  {
    if (b != null) {
      b.start();
    }
    super.onAttachedToWindow();
  }
}


/* Location:              com/google/android/gms/b/ku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */