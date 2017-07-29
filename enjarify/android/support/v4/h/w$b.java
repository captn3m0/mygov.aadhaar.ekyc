package android.support.v4.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import java.util.WeakHashMap;

class w$b
  implements w.l
{
  WeakHashMap a = null;
  
  public void A(View paramView) {}
  
  public void B(View paramView) {}
  
  public boolean C(View paramView)
  {
    return false;
  }
  
  public ColorStateList D(View paramView)
  {
    boolean bool = paramView instanceof u;
    if (bool) {
      paramView = (u)paramView;
    }
    for (ColorStateList localColorStateList = paramView.getSupportBackgroundTintList();; localColorStateList = null)
    {
      return localColorStateList;
      bool = false;
    }
  }
  
  public PorterDuff.Mode E(View paramView)
  {
    boolean bool = paramView instanceof u;
    if (bool) {
      paramView = (u)paramView;
    }
    for (PorterDuff.Mode localMode = paramView.getSupportBackgroundTintMode();; localMode = null)
    {
      return localMode;
      bool = false;
    }
  }
  
  public void F(View paramView)
  {
    boolean bool = paramView instanceof o;
    if (bool)
    {
      paramView = (o)paramView;
      paramView.stopNestedScroll();
    }
  }
  
  public boolean G(View paramView)
  {
    int i = paramView.getWidth();
    if (i > 0)
    {
      i = paramView.getHeight();
      if (i <= 0) {}
    }
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public float H(View paramView)
  {
    float f1 = y(paramView);
    float f2 = x(paramView);
    return f1 + f2;
  }
  
  public boolean I(View paramView)
  {
    return x.c(paramView);
  }
  
  public boolean J(View paramView)
  {
    return false;
  }
  
  public Display K(View paramView)
  {
    boolean bool = x.c(paramView);
    String str;
    if (bool)
    {
      localObject = paramView.getContext();
      str = "window";
    }
    for (Object localObject = ((WindowManager)((Context)localObject).getSystemService(str)).getDefaultDisplay();; localObject = null)
    {
      return (Display)localObject;
      bool = false;
    }
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    return paramInt1 | paramInt2;
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return View.resolveSize(paramInt1, paramInt2);
  }
  
  long a()
  {
    return 10;
  }
  
  public al a(View paramView, al paramal)
  {
    return paramal;
  }
  
  public void a(View paramView, float paramFloat) {}
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void a(View paramView, ColorStateList paramColorStateList)
  {
    boolean bool = paramView instanceof u;
    if (bool)
    {
      paramView = (u)paramView;
      paramView.setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  public void a(View paramView, PorterDuff.Mode paramMode)
  {
    boolean bool = paramView instanceof u;
    if (bool)
    {
      paramView = (u)paramView;
      paramView.setSupportBackgroundTintMode(paramMode);
    }
  }
  
  public void a(View paramView, Drawable paramDrawable)
  {
    paramView.setBackgroundDrawable(paramDrawable);
  }
  
  public void a(View paramView, b paramb) {}
  
  public void a(View paramView, s params) {}
  
  public void a(View paramView, Runnable paramRunnable)
  {
    long l = a();
    paramView.postDelayed(paramRunnable, l);
  }
  
  public void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    long l = a() + paramLong;
    paramView.postDelayed(paramRunnable, l);
  }
  
  public void a(View paramView, boolean paramBoolean) {}
  
  public boolean a(View paramView)
  {
    return false;
  }
  
  public boolean a(View paramView, int paramInt)
  {
    int i = 1;
    boolean bool = paramView instanceof t;
    int j;
    int k;
    if (bool)
    {
      paramView = (t)paramView;
      j = paramView.computeHorizontalScrollOffset();
      k = paramView.computeHorizontalScrollRange();
      int m = paramView.computeHorizontalScrollExtent();
      k -= m;
      if (k != 0) {
        if (paramInt < 0) {
          if (j > 0)
          {
            j = i;
            if (j == 0) {
              break label104;
            }
          }
        }
      }
    }
    for (;;)
    {
      return i;
      j = 0;
      break;
      k += -1;
      if (j < k)
      {
        j = i;
        break;
      }
      j = 0;
      break;
      label104:
      i = 0;
    }
  }
  
  public al b(View paramView, al paramal)
  {
    return paramal;
  }
  
  public void b(View paramView, float paramFloat) {}
  
  public void b(View paramView, boolean paramBoolean) {}
  
  public boolean b(View paramView)
  {
    return false;
  }
  
  public boolean b(View paramView, int paramInt)
  {
    int i = 1;
    boolean bool = paramView instanceof t;
    int j;
    int k;
    if (bool)
    {
      paramView = (t)paramView;
      j = paramView.computeVerticalScrollOffset();
      k = paramView.computeVerticalScrollRange();
      int m = paramView.computeVerticalScrollExtent();
      k -= m;
      if (k != 0) {
        if (paramInt < 0) {
          if (j > 0)
          {
            j = i;
            if (j == 0) {
              break label104;
            }
          }
        }
      }
    }
    for (;;)
    {
      return i;
      j = 0;
      break;
      k += -1;
      if (j < k)
      {
        j = i;
        break;
      }
      j = 0;
      break;
      label104:
      i = 0;
    }
  }
  
  public void c(View paramView)
  {
    paramView.invalidate();
  }
  
  public void c(View paramView, float paramFloat) {}
  
  public void c(View paramView, int paramInt) {}
  
  public int d(View paramView)
  {
    return 0;
  }
  
  public void d(View paramView, float paramFloat) {}
  
  public void d(View paramView, int paramInt) {}
  
  public float e(View paramView)
  {
    return 1.0F;
  }
  
  public void e(View paramView, int paramInt) {}
  
  public int f(View paramView)
  {
    return 0;
  }
  
  public void f(View paramView, int paramInt)
  {
    int i = paramView.getLeft();
    paramView.offsetLeftAndRight(paramInt);
    if (paramInt != 0)
    {
      Object localObject = paramView.getParent();
      boolean bool = localObject instanceof View;
      if (!bool) {
        break label90;
      }
      int j = Math.abs(paramInt);
      localObject = (View)localObject;
      int k = i - j;
      int m = paramView.getTop();
      int n = paramView.getWidth();
      i = i + n + j;
      j = paramView.getBottom();
      ((View)localObject).invalidate(k, m, i, j);
    }
    for (;;)
    {
      return;
      label90:
      paramView.invalidate();
    }
  }
  
  public int g(View paramView)
  {
    return 0;
  }
  
  public void g(View paramView, int paramInt)
  {
    int i = paramView.getTop();
    paramView.offsetTopAndBottom(paramInt);
    if (paramInt != 0)
    {
      Object localObject = paramView.getParent();
      boolean bool = localObject instanceof View;
      if (!bool) {
        break label90;
      }
      int j = Math.abs(paramInt);
      localObject = (View)localObject;
      int k = paramView.getLeft();
      int m = i - j;
      int n = paramView.getRight();
      int i1 = paramView.getHeight();
      i = i + i1 + j;
      ((View)localObject).invalidate(k, m, n, i);
    }
    for (;;)
    {
      return;
      label90:
      paramView.invalidate();
    }
  }
  
  public ViewParent h(View paramView)
  {
    return paramView.getParent();
  }
  
  public int i(View paramView)
  {
    return paramView.getMeasuredWidth();
  }
  
  public int j(View paramView)
  {
    return 0;
  }
  
  public void k(View paramView) {}
  
  public int l(View paramView)
  {
    return paramView.getPaddingLeft();
  }
  
  public int m(View paramView)
  {
    return paramView.getPaddingRight();
  }
  
  public boolean n(View paramView)
  {
    return true;
  }
  
  public float o(View paramView)
  {
    return 0.0F;
  }
  
  public float p(View paramView)
  {
    return 0.0F;
  }
  
  public Matrix q(View paramView)
  {
    return null;
  }
  
  public int r(View paramView)
  {
    return x.a(paramView);
  }
  
  public int s(View paramView)
  {
    return x.b(paramView);
  }
  
  public ae t(View paramView)
  {
    ae localae = new android/support/v4/h/ae;
    localae.<init>(paramView);
    return localae;
  }
  
  public String u(View paramView)
  {
    return null;
  }
  
  public int v(View paramView)
  {
    return 0;
  }
  
  public void w(View paramView) {}
  
  public float x(View paramView)
  {
    return 0.0F;
  }
  
  public float y(View paramView)
  {
    return 0.0F;
  }
  
  public boolean z(View paramView)
  {
    return false;
  }
}


/* Location:              android/support/v4/h/w$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */