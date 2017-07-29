package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.a.c;
import android.support.v4.c.a.a;
import android.support.v4.h.w;
import android.support.v7.widget.p;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

public final class FloatingActionButton
  extends z
{
  int a;
  boolean b;
  final Rect c;
  private ColorStateList d;
  private PorterDuff.Mode e;
  private int f;
  private int g;
  private int h;
  private final Rect i;
  private p j;
  private g k;
  
  private static int a(int paramInt1, int paramInt2)
  {
    int m = View.MeasureSpec.getMode(paramInt2);
    int n = View.MeasureSpec.getSize(paramInt2);
    switch (m)
    {
    }
    for (;;)
    {
      return paramInt1;
      paramInt1 = Math.min(paramInt1, n);
      continue;
      paramInt1 = n;
    }
  }
  
  private g.a c(FloatingActionButton.a parama)
  {
    Object localObject;
    if (parama == null) {
      localObject = null;
    }
    for (;;)
    {
      return (g.a)localObject;
      localObject = new android/support/design/widget/FloatingActionButton$1;
      ((FloatingActionButton.1)localObject).<init>(this, parama);
    }
  }
  
  private g getImpl()
  {
    Object localObject = k;
    int m;
    int n;
    FloatingActionButton.b localb;
    q.d locald;
    if (localObject == null)
    {
      m = Build.VERSION.SDK_INT;
      n = 21;
      if (m < n) {
        break label60;
      }
      localObject = new android/support/design/widget/h;
      localb = new android/support/design/widget/FloatingActionButton$b;
      localb.<init>(this);
      locald = x.a;
      ((h)localObject).<init>(this, localb, locald);
    }
    for (;;)
    {
      k = ((g)localObject);
      return k;
      label60:
      n = 14;
      if (m >= n)
      {
        localObject = new android/support/design/widget/f;
        localb = new android/support/design/widget/FloatingActionButton$b;
        localb.<init>(this);
        locald = x.a;
        ((f)localObject).<init>(this, localb, locald);
      }
      else
      {
        localObject = new android/support/design/widget/e;
        localb = new android/support/design/widget/FloatingActionButton$b;
        localb.<init>(this);
        locald = x.a;
        ((e)localObject).<init>(this, localb, locald);
      }
    }
  }
  
  final void a(FloatingActionButton.a parama)
  {
    g localg = getImpl();
    g.a locala = c(parama);
    localg.b(locala);
  }
  
  final void b(FloatingActionButton.a parama)
  {
    g localg = getImpl();
    g.a locala = c(parama);
    localg.a(locala);
  }
  
  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    g localg = getImpl();
    int[] arrayOfInt = getDrawableState();
    localg.a(arrayOfInt);
  }
  
  public final ColorStateList getBackgroundTintList()
  {
    return d;
  }
  
  public final PorterDuff.Mode getBackgroundTintMode()
  {
    return e;
  }
  
  public final float getCompatElevation()
  {
    return getImpl().a();
  }
  
  public final Drawable getContentBackground()
  {
    return getImplg;
  }
  
  public final int getRippleColor()
  {
    return f;
  }
  
  public final int getSize()
  {
    return g;
  }
  
  final int getSizeDimension()
  {
    int m = g;
    Resources localResources = getResources();
    switch (m)
    {
    default: 
      m = a.c.design_fab_size_normal;
    }
    for (m = localResources.getDimensionPixelSize(m);; m = localResources.getDimensionPixelSize(m))
    {
      return m;
      m = a.b(localResources);
      int n = a.a(localResources);
      m = Math.max(m, n);
      n = 470;
      if (m < n)
      {
        m = 1;
        break;
      }
      m = 0;
      break;
      m = a.c.design_fab_size_mini;
    }
  }
  
  public final boolean getUseCompatPadding()
  {
    return b;
  }
  
  public final void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    getImpl().b();
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Object localObject1 = getImpl();
    boolean bool = ((g)localObject1).d();
    if (bool)
    {
      Object localObject2 = q;
      if (localObject2 == null)
      {
        localObject2 = new android/support/design/widget/g$1;
        ((g.1)localObject2).<init>((g)localObject1);
        q = ((ViewTreeObserver.OnPreDrawListener)localObject2);
      }
      localObject2 = n.getViewTreeObserver();
      localObject1 = q;
      ((ViewTreeObserver)localObject2).addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)localObject1);
    }
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    g localg = getImpl();
    Object localObject = q;
    if (localObject != null)
    {
      localObject = n.getViewTreeObserver();
      ViewTreeObserver.OnPreDrawListener localOnPreDrawListener = q;
      ((ViewTreeObserver)localObject).removeOnPreDrawListener(localOnPreDrawListener);
      localObject = null;
      q = null;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int m = getSizeDimension();
    int n = h;
    n = (m - n) / 2;
    a = n;
    getImpl().f();
    n = a(m, paramInt1);
    m = a(m, paramInt2);
    m = Math.min(n, m);
    n = c.left + m;
    int i1 = c.right;
    n += i1;
    i1 = c.top;
    m += i1;
    i1 = c.bottom;
    m += i1;
    setMeasuredDimension(n, m);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    int m = paramMotionEvent.getAction();
    switch (m)
    {
    }
    label34:
    label257:
    for (;;)
    {
      bool1 = super.onTouchEvent(paramMotionEvent);
      return bool1;
      Rect localRect1 = i;
      boolean bool3 = w.F(this);
      int n;
      int i1;
      if (bool3)
      {
        n = getWidth();
        i1 = getHeight();
        localRect1.set(0, 0, n, i1);
        n = left;
        i1 = c.left;
        n += i1;
        left = n;
        n = top;
        i1 = c.top;
        n += i1;
        top = n;
        n = right;
        i1 = c.right;
        n -= i1;
        right = n;
        n = bottom;
        Rect localRect2 = c;
        i1 = bottom;
        n -= i1;
        bottom = n;
        m = 1;
      }
      for (;;)
      {
        if (m == 0) {
          break label257;
        }
        localRect1 = i;
        float f1 = paramMotionEvent.getX();
        n = (int)f1;
        float f2 = paramMotionEvent.getY();
        i1 = (int)f2;
        boolean bool2 = localRect1.contains(n, i1);
        if (bool2) {
          break;
        }
        break label34;
        bool2 = false;
        localRect1 = null;
      }
    }
  }
  
  public final void setBackgroundColor(int paramInt)
  {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public final void setBackgroundResource(int paramInt)
  {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public final void setBackgroundTintList(ColorStateList paramColorStateList)
  {
    Object localObject = d;
    if (localObject != paramColorStateList)
    {
      d = paramColorStateList;
      localObject = getImpl();
      ((g)localObject).a(paramColorStateList);
    }
  }
  
  public final void setBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    Object localObject = e;
    if (localObject != paramMode)
    {
      e = paramMode;
      localObject = getImpl();
      ((g)localObject).a(paramMode);
    }
  }
  
  public final void setCompatElevation(float paramFloat)
  {
    g localg = getImpl();
    float f1 = h;
    boolean bool = f1 < paramFloat;
    if (bool)
    {
      h = paramFloat;
      f1 = i;
      localg.a(paramFloat, f1);
    }
  }
  
  public final void setImageResource(int paramInt)
  {
    j.a(paramInt);
  }
  
  public final void setRippleColor(int paramInt)
  {
    int m = f;
    if (m != paramInt)
    {
      f = paramInt;
      g localg = getImpl();
      localg.a(paramInt);
    }
  }
  
  public final void setSize(int paramInt)
  {
    int m = g;
    if (paramInt != m)
    {
      g = paramInt;
      requestLayout();
    }
  }
  
  public final void setUseCompatPadding(boolean paramBoolean)
  {
    boolean bool = b;
    if (bool != paramBoolean)
    {
      b = paramBoolean;
      g localg = getImpl();
      localg.c();
    }
  }
}


/* Location:              android/support/design/widget/FloatingActionButton.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */