package android.support.v4.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.WindowInsets;

class w$j
  extends w.i
{
  public final ColorStateList D(View paramView)
  {
    return paramView.getBackgroundTintList();
  }
  
  public final PorterDuff.Mode E(View paramView)
  {
    return paramView.getBackgroundTintMode();
  }
  
  public final void F(View paramView)
  {
    paramView.stopNestedScroll();
  }
  
  public final float H(View paramView)
  {
    return paramView.getZ();
  }
  
  public final al a(View paramView, al paramal)
  {
    Object localObject1 = al.a(paramal);
    Object localObject2 = localObject1;
    localObject2 = (WindowInsets)localObject1;
    WindowInsets localWindowInsets = paramView.onApplyWindowInsets((WindowInsets)localObject2);
    if (localWindowInsets != localObject2)
    {
      localObject1 = new android/view/WindowInsets;
      ((WindowInsets)localObject1).<init>(localWindowInsets);
    }
    return al.a(localObject1);
  }
  
  public final void a(View paramView, ColorStateList paramColorStateList)
  {
    paramView.setBackgroundTintList(paramColorStateList);
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Drawable localDrawable;
    Object localObject;
    if (i == j)
    {
      localDrawable = paramView.getBackground();
      localObject = paramView.getBackgroundTintList();
      if (localObject == null) {
        break label89;
      }
      localObject = paramView.getBackgroundTintMode();
      if (localObject == null) {
        break label89;
      }
      i = 1;
    }
    for (;;)
    {
      if ((localDrawable != null) && (i != 0))
      {
        bool = localDrawable.isStateful();
        if (bool)
        {
          localObject = paramView.getDrawableState();
          localDrawable.setState((int[])localObject);
        }
        paramView.setBackground(localDrawable);
      }
      return;
      label89:
      boolean bool = false;
      localObject = null;
    }
  }
  
  public final void a(View paramView, PorterDuff.Mode paramMode)
  {
    paramView.setBackgroundTintMode(paramMode);
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Drawable localDrawable;
    Object localObject;
    if (i == j)
    {
      localDrawable = paramView.getBackground();
      localObject = paramView.getBackgroundTintList();
      if (localObject == null) {
        break label89;
      }
      localObject = paramView.getBackgroundTintMode();
      if (localObject == null) {
        break label89;
      }
      i = 1;
    }
    for (;;)
    {
      if ((localDrawable != null) && (i != 0))
      {
        bool = localDrawable.isStateful();
        if (bool)
        {
          localObject = paramView.getDrawableState();
          localDrawable.setState((int[])localObject);
        }
        paramView.setBackground(localDrawable);
      }
      return;
      label89:
      boolean bool = false;
      localObject = null;
    }
  }
  
  public final void a(View paramView, s params)
  {
    w.j.1 local1;
    if (params == null)
    {
      local1 = null;
      z.a(paramView, null);
    }
    for (;;)
    {
      return;
      local1 = new android/support/v4/h/w$j$1;
      local1.<init>(this, params);
      z.a(paramView, local1);
    }
  }
  
  public final al b(View paramView, al paramal)
  {
    Object localObject1 = al.a(paramal);
    Object localObject2 = localObject1;
    localObject2 = (WindowInsets)localObject1;
    WindowInsets localWindowInsets = paramView.dispatchApplyWindowInsets((WindowInsets)localObject2);
    if (localWindowInsets != localObject2)
    {
      localObject1 = new android/view/WindowInsets;
      ((WindowInsets)localObject1).<init>(localWindowInsets);
    }
    return al.a(localObject1);
  }
  
  public final void d(View paramView, float paramFloat)
  {
    paramView.setElevation(paramFloat);
  }
  
  public void f(View paramView, int paramInt)
  {
    int i = 0;
    Rect localRect = z.a();
    Object localObject1 = paramView.getParent();
    boolean bool1 = localObject1 instanceof View;
    Object localObject2;
    int m;
    int n;
    boolean bool2;
    if (bool1)
    {
      localObject2 = localObject1;
      localObject2 = (View)localObject1;
      m = ((View)localObject2).getLeft();
      n = ((View)localObject2).getTop();
      int i1 = ((View)localObject2).getRight();
      int j = ((View)localObject2).getBottom();
      localRect.set(m, n, i1, j);
      j = paramView.getLeft();
      m = paramView.getTop();
      n = paramView.getRight();
      i1 = paramView.getBottom();
      bool2 = localRect.intersects(j, m, n, i1);
      if (!bool2) {
        bool2 = true;
      }
    }
    for (;;)
    {
      y.b(paramView, paramInt);
      if (bool2)
      {
        int k = paramView.getLeft();
        i = paramView.getTop();
        m = paramView.getRight();
        n = paramView.getBottom();
        bool3 = localRect.intersect(k, i, m, n);
        if (bool3)
        {
          localObject1 = (View)localObject1;
          ((View)localObject1).invalidate(localRect);
        }
      }
      return;
      boolean bool3 = false;
      localObject2 = null;
      continue;
      bool3 = false;
      localObject2 = null;
    }
  }
  
  public void g(View paramView, int paramInt)
  {
    int i = 0;
    Rect localRect = z.a();
    Object localObject1 = paramView.getParent();
    boolean bool1 = localObject1 instanceof View;
    Object localObject2;
    int m;
    int n;
    boolean bool2;
    if (bool1)
    {
      localObject2 = localObject1;
      localObject2 = (View)localObject1;
      m = ((View)localObject2).getLeft();
      n = ((View)localObject2).getTop();
      int i1 = ((View)localObject2).getRight();
      int j = ((View)localObject2).getBottom();
      localRect.set(m, n, i1, j);
      j = paramView.getLeft();
      m = paramView.getTop();
      n = paramView.getRight();
      i1 = paramView.getBottom();
      bool2 = localRect.intersects(j, m, n, i1);
      if (!bool2) {
        bool2 = true;
      }
    }
    for (;;)
    {
      y.a(paramView, paramInt);
      if (bool2)
      {
        int k = paramView.getLeft();
        i = paramView.getTop();
        m = paramView.getRight();
        n = paramView.getBottom();
        bool3 = localRect.intersect(k, i, m, n);
        if (bool3)
        {
          localObject1 = (View)localObject1;
          ((View)localObject1).invalidate(localRect);
        }
      }
      return;
      boolean bool3 = false;
      localObject2 = null;
      continue;
      bool3 = false;
      localObject2 = null;
    }
  }
  
  public final String u(View paramView)
  {
    return paramView.getTransitionName();
  }
  
  public final void w(View paramView)
  {
    paramView.requestApplyInsets();
  }
  
  public final float x(View paramView)
  {
    return paramView.getElevation();
  }
  
  public final float y(View paramView)
  {
    return paramView.getTranslationZ();
  }
}


/* Location:              android/support/v4/h/w$j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */