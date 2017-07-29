package com.google.android.gms.b;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.internal.c;
import java.util.Iterator;
import java.util.List;

public final class ku
  extends RelativeLayout
{
  private static final float[] a;
  private AnimationDrawable b;
  
  static
  {
    float[] arrayOfFloat = new float[8];
    arrayOfFloat[0] = 5.0F;
    arrayOfFloat[1] = 5.0F;
    arrayOfFloat[2] = 5.0F;
    arrayOfFloat[3] = 5.0F;
    arrayOfFloat[4] = 5.0F;
    arrayOfFloat[5] = 5.0F;
    arrayOfFloat[6] = 5.0F;
    arrayOfFloat[7] = 5.0F;
    a = arrayOfFloat;
  }
  
  public ku(Context paramContext, kt paramkt, RelativeLayout.LayoutParams paramLayoutParams)
  {
    super(paramContext);
    c.a(paramkt);
    Object localObject1 = new android/graphics/drawable/ShapeDrawable;
    Object localObject2 = new android/graphics/drawable/shapes/RoundRectShape;
    Object localObject3 = a;
    ((RoundRectShape)localObject2).<init>((float[])localObject3, null, null);
    ((ShapeDrawable)localObject1).<init>((Shape)localObject2);
    localObject2 = ((ShapeDrawable)localObject1).getPaint();
    int n = e;
    ((Paint)localObject2).setColor(n);
    setLayoutParams(paramLayoutParams);
    w.g().a(this, (Drawable)localObject1);
    localObject1 = new android/widget/RelativeLayout$LayoutParams;
    ((RelativeLayout.LayoutParams)localObject1).<init>(m, m);
    localObject2 = c;
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject2);
    if (!bool1)
    {
      localObject2 = new android/widget/RelativeLayout$LayoutParams;
      ((RelativeLayout.LayoutParams)localObject2).<init>(m, m);
      localObject3 = new android/widget/TextView;
      ((TextView)localObject3).<init>(paramContext);
      ((TextView)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      ((TextView)localObject3).setId(1195835393);
      localObject2 = Typeface.DEFAULT;
      ((TextView)localObject3).setTypeface((Typeface)localObject2);
      localObject2 = c;
      ((TextView)localObject3).setText((CharSequence)localObject2);
      int i1 = f;
      ((TextView)localObject3).setTextColor(i1);
      float f = g;
      ((TextView)localObject3).setTextSize(f);
      ip.a();
      i1 = uk.a(paramContext, i);
      ip.a();
      m = uk.a(paramContext, i);
      ((TextView)localObject3).setPadding(i1, 0, m, 0);
      addView((View)localObject3);
      i1 = ((TextView)localObject3).getId();
      ((RelativeLayout.LayoutParams)localObject1).addRule(j, i1);
    }
    localObject2 = new android/widget/ImageView;
    ((ImageView)localObject2).<init>(paramContext);
    ((ImageView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
    int i2 = 1195835394;
    ((ImageView)localObject2).setId(i2);
    localObject1 = d;
    n = ((List)localObject1).size();
    if (n > j)
    {
      localObject3 = new android/graphics/drawable/AnimationDrawable;
      ((AnimationDrawable)localObject3).<init>();
      b = ((AnimationDrawable)localObject3);
      localObject3 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = (Drawable)((Iterator)localObject3).next();
        AnimationDrawable localAnimationDrawable = b;
        k = h;
        localAnimationDrawable.addFrame((Drawable)localObject1, k);
      }
      localObject1 = w.g();
      localObject3 = b;
      ((tu)localObject1).a((View)localObject2, (Drawable)localObject3);
    }
    for (;;)
    {
      addView((View)localObject2);
      return;
      n = ((List)localObject1).size();
      if (n == j)
      {
        localObject1 = (Drawable)((List)localObject1).get(0);
        ((ImageView)localObject2).setImageDrawable((Drawable)localObject1);
      }
    }
  }
  
  public final void onAttachedToWindow()
  {
    AnimationDrawable localAnimationDrawable = b;
    if (localAnimationDrawable != null)
    {
      localAnimationDrawable = b;
      localAnimationDrawable.start();
    }
    super.onAttachedToWindow();
  }
}


/* Location:              com/google/android/gms/b/ku.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */