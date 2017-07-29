package android.support.v4.h;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.f.a;
import android.view.Display;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

public final class w
{
  static final l a = new b();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (a.a())
    {
      a = new a();
      return;
    }
    if (i >= 23)
    {
      a = new k();
      return;
    }
    if (i >= 21)
    {
      a = new j();
      return;
    }
    if (i >= 19)
    {
      a = new i();
      return;
    }
    if (i >= 18)
    {
      a = new h();
      return;
    }
    if (i >= 17)
    {
      a = new g();
      return;
    }
    if (i >= 16)
    {
      a = new f();
      return;
    }
    if (i >= 15)
    {
      a = new d();
      return;
    }
    if (i >= 14)
    {
      a = new e();
      return;
    }
    if (i >= 11)
    {
      a = new c();
      return;
    }
  }
  
  public static boolean A(View paramView)
  {
    return a.n(paramView);
  }
  
  public static boolean B(View paramView)
  {
    return a.C(paramView);
  }
  
  public static ColorStateList C(View paramView)
  {
    return a.D(paramView);
  }
  
  public static PorterDuff.Mode D(View paramView)
  {
    return a.E(paramView);
  }
  
  public static void E(View paramView)
  {
    a.F(paramView);
  }
  
  public static boolean F(View paramView)
  {
    return a.G(paramView);
  }
  
  public static float G(View paramView)
  {
    return a.H(paramView);
  }
  
  public static boolean H(View paramView)
  {
    return a.I(paramView);
  }
  
  public static boolean I(View paramView)
  {
    return a.J(paramView);
  }
  
  public static Display J(View paramView)
  {
    return a.K(paramView);
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    return a.a(paramInt1, paramInt2);
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return a.a(paramInt1, paramInt2, paramInt3);
  }
  
  public static al a(View paramView, al paramal)
  {
    return a.a(paramView, paramal);
  }
  
  public static void a(View paramView, float paramFloat)
  {
    a.a(paramView, paramFloat);
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(View paramView, ColorStateList paramColorStateList)
  {
    a.a(paramView, paramColorStateList);
  }
  
  public static void a(View paramView, PorterDuff.Mode paramMode)
  {
    a.a(paramView, paramMode);
  }
  
  public static void a(View paramView, Drawable paramDrawable)
  {
    a.a(paramView, paramDrawable);
  }
  
  public static void a(View paramView, b paramb)
  {
    a.a(paramView, paramb);
  }
  
  public static void a(View paramView, s params)
  {
    a.a(paramView, params);
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    a.a(paramView, paramRunnable);
  }
  
  public static void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    a.a(paramView, paramRunnable, paramLong);
  }
  
  public static void a(View paramView, boolean paramBoolean)
  {
    a.a(paramView, paramBoolean);
  }
  
  public static boolean a(View paramView)
  {
    return a.a(paramView);
  }
  
  public static boolean a(View paramView, int paramInt)
  {
    return a.a(paramView, paramInt);
  }
  
  public static al b(View paramView, al paramal)
  {
    return a.b(paramView, paramal);
  }
  
  public static void b(View paramView, float paramFloat)
  {
    a.b(paramView, paramFloat);
  }
  
  public static void b(View paramView, boolean paramBoolean)
  {
    a.b(paramView, paramBoolean);
  }
  
  public static boolean b(View paramView)
  {
    return a.b(paramView);
  }
  
  public static boolean b(View paramView, int paramInt)
  {
    return a.b(paramView, paramInt);
  }
  
  public static void c(View paramView)
  {
    a.c(paramView);
  }
  
  public static void c(View paramView, float paramFloat)
  {
    a.c(paramView, paramFloat);
  }
  
  public static void c(View paramView, int paramInt)
  {
    a.c(paramView, paramInt);
  }
  
  public static int d(View paramView)
  {
    return a.d(paramView);
  }
  
  public static void d(View paramView, float paramFloat)
  {
    a.d(paramView, paramFloat);
  }
  
  public static void d(View paramView, int paramInt)
  {
    a.d(paramView, paramInt);
  }
  
  public static float e(View paramView)
  {
    return a.e(paramView);
  }
  
  public static void e(View paramView, int paramInt)
  {
    a.g(paramView, paramInt);
  }
  
  public static int f(View paramView)
  {
    return a.f(paramView);
  }
  
  public static void f(View paramView, int paramInt)
  {
    a.f(paramView, paramInt);
  }
  
  public static int g(View paramView)
  {
    return a.g(paramView);
  }
  
  public static void g(View paramView, int paramInt)
  {
    a.e(paramView, paramInt);
  }
  
  public static ViewParent h(View paramView)
  {
    return a.h(paramView);
  }
  
  public static int i(View paramView)
  {
    return a.i(paramView);
  }
  
  public static int j(View paramView)
  {
    return a.j(paramView);
  }
  
  public static void k(View paramView)
  {
    a.k(paramView);
  }
  
  public static int l(View paramView)
  {
    return a.l(paramView);
  }
  
  public static int m(View paramView)
  {
    return a.m(paramView);
  }
  
  public static float n(View paramView)
  {
    return a.o(paramView);
  }
  
  public static float o(View paramView)
  {
    return a.p(paramView);
  }
  
  public static Matrix p(View paramView)
  {
    return a.q(paramView);
  }
  
  public static int q(View paramView)
  {
    return a.r(paramView);
  }
  
  public static int r(View paramView)
  {
    return a.s(paramView);
  }
  
  public static ae s(View paramView)
  {
    return a.t(paramView);
  }
  
  public static float t(View paramView)
  {
    return a.x(paramView);
  }
  
  public static String u(View paramView)
  {
    return a.u(paramView);
  }
  
  public static int v(View paramView)
  {
    return a.v(paramView);
  }
  
  public static void w(View paramView)
  {
    a.w(paramView);
  }
  
  public static boolean x(View paramView)
  {
    return a.z(paramView);
  }
  
  public static void y(View paramView)
  {
    a.A(paramView);
  }
  
  public static void z(View paramView)
  {
    a.B(paramView);
  }
  
  static final class a
    extends w.k
  {}
  
  static class b
    implements w.l
  {
    WeakHashMap<View, ae> a = null;
    
    public void A(View paramView) {}
    
    public void B(View paramView) {}
    
    public boolean C(View paramView)
    {
      return false;
    }
    
    public ColorStateList D(View paramView)
    {
      if ((paramView instanceof u)) {
        return ((u)paramView).getSupportBackgroundTintList();
      }
      return null;
    }
    
    public PorterDuff.Mode E(View paramView)
    {
      if ((paramView instanceof u)) {
        return ((u)paramView).getSupportBackgroundTintMode();
      }
      return null;
    }
    
    public void F(View paramView)
    {
      if ((paramView instanceof o)) {
        ((o)paramView).stopNestedScroll();
      }
    }
    
    public boolean G(View paramView)
    {
      return (paramView.getWidth() > 0) && (paramView.getHeight() > 0);
    }
    
    public float H(View paramView)
    {
      return y(paramView) + x(paramView);
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
      if (x.c(paramView)) {
        return ((WindowManager)paramView.getContext().getSystemService("window")).getDefaultDisplay();
      }
      return null;
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
      return 10L;
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
      if ((paramView instanceof u)) {
        ((u)paramView).setSupportBackgroundTintList(paramColorStateList);
      }
    }
    
    public void a(View paramView, PorterDuff.Mode paramMode)
    {
      if ((paramView instanceof u)) {
        ((u)paramView).setSupportBackgroundTintMode(paramMode);
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
      paramView.postDelayed(paramRunnable, a());
    }
    
    public void a(View paramView, Runnable paramRunnable, long paramLong)
    {
      paramView.postDelayed(paramRunnable, a() + paramLong);
    }
    
    public void a(View paramView, boolean paramBoolean) {}
    
    public boolean a(View paramView)
    {
      return false;
    }
    
    public boolean a(View paramView, int paramInt)
    {
      if ((paramView instanceof t))
      {
        paramView = (t)paramView;
        int i = paramView.computeHorizontalScrollOffset();
        int j = paramView.computeHorizontalScrollRange() - paramView.computeHorizontalScrollExtent();
        if (j != 0) {
          if (paramInt < 0) {
            if (i > 0) {
              paramInt = 1;
            }
          }
        }
        while (paramInt != 0)
        {
          return true;
          paramInt = 0;
          continue;
          if (i < j - 1) {
            paramInt = 1;
          } else {
            paramInt = 0;
          }
        }
      }
      return false;
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
      if ((paramView instanceof t))
      {
        paramView = (t)paramView;
        int i = paramView.computeVerticalScrollOffset();
        int j = paramView.computeVerticalScrollRange() - paramView.computeVerticalScrollExtent();
        if (j != 0) {
          if (paramInt < 0) {
            if (i > 0) {
              paramInt = 1;
            }
          }
        }
        while (paramInt != 0)
        {
          return true;
          paramInt = 0;
          continue;
          if (i < j - 1) {
            paramInt = 1;
          } else {
            paramInt = 0;
          }
        }
      }
      return false;
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
        ViewParent localViewParent = paramView.getParent();
        if ((localViewParent instanceof View))
        {
          paramInt = Math.abs(paramInt);
          ((View)localViewParent).invalidate(i - paramInt, paramView.getTop(), i + paramView.getWidth() + paramInt, paramView.getBottom());
        }
      }
      else
      {
        return;
      }
      paramView.invalidate();
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
        ViewParent localViewParent = paramView.getParent();
        if ((localViewParent instanceof View))
        {
          paramInt = Math.abs(paramInt);
          ((View)localViewParent).invalidate(paramView.getLeft(), i - paramInt, paramView.getRight(), i + paramView.getHeight() + paramInt);
        }
      }
      else
      {
        return;
      }
      paramView.invalidate();
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
      return new ae(paramView);
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
  
  static class c
    extends w.b
  {
    public final void A(View paramView)
    {
      paramView.jumpDrawablesToCurrentState();
    }
    
    public final void B(View paramView)
    {
      paramView.setSaveFromParentEnabled(false);
    }
    
    public final int a(int paramInt1, int paramInt2)
    {
      return View.combineMeasuredStates(paramInt1, paramInt2);
    }
    
    public final int a(int paramInt1, int paramInt2, int paramInt3)
    {
      return View.resolveSizeAndState(paramInt1, paramInt2, paramInt3);
    }
    
    final long a()
    {
      return ValueAnimator.getFrameDelay();
    }
    
    public final void a(View paramView, float paramFloat)
    {
      paramView.setTranslationX(paramFloat);
    }
    
    public final void b(View paramView, float paramFloat)
    {
      paramView.setTranslationY(paramFloat);
    }
    
    public final void b(View paramView, boolean paramBoolean)
    {
      paramView.setActivated(paramBoolean);
    }
    
    public final void c(View paramView, float paramFloat)
    {
      paramView.setAlpha(paramFloat);
    }
    
    public final void d(View paramView, int paramInt)
    {
      paramView.setLayerType(paramInt, null);
    }
    
    public final float e(View paramView)
    {
      return paramView.getAlpha();
    }
    
    public final int f(View paramView)
    {
      return paramView.getLayerType();
    }
    
    public void f(View paramView, int paramInt)
    {
      y.b(paramView, paramInt);
    }
    
    public void g(View paramView, int paramInt)
    {
      y.a(paramView, paramInt);
    }
    
    public final int i(View paramView)
    {
      return paramView.getMeasuredWidthAndState();
    }
    
    public final int j(View paramView)
    {
      return paramView.getMeasuredState();
    }
    
    public final float o(View paramView)
    {
      return paramView.getTranslationX();
    }
    
    public final float p(View paramView)
    {
      return paramView.getTranslationY();
    }
    
    public final Matrix q(View paramView)
    {
      return paramView.getMatrix();
    }
  }
  
  static class d
    extends w.e
  {
    public final boolean J(View paramView)
    {
      return paramView.hasOnClickListeners();
    }
  }
  
  static class e
    extends w.c
  {
    static Field b;
    static boolean c = false;
    
    public final void a(View paramView, b paramb)
    {
      if (paramb == null) {}
      for (paramb = null;; paramb = b)
      {
        paramView.setAccessibilityDelegate((View.AccessibilityDelegate)paramb);
        return;
      }
    }
    
    public final void a(View paramView, boolean paramBoolean)
    {
      paramView.setFitsSystemWindows(paramBoolean);
    }
    
    public final boolean a(View paramView)
    {
      if (c) {}
      for (;;)
      {
        return false;
        if (b == null) {}
        try
        {
          Field localField = View.class.getDeclaredField("mAccessibilityDelegate");
          b = localField;
          localField.setAccessible(true);
        }
        catch (Throwable paramView)
        {
          try
          {
            paramView = b.get(paramView);
            if (paramView == null) {
              continue;
            }
            return true;
          }
          catch (Throwable paramView)
          {
            c = true;
          }
          paramView = paramView;
          c = true;
          return false;
        }
      }
      return false;
    }
    
    public final boolean a(View paramView, int paramInt)
    {
      return paramView.canScrollHorizontally(paramInt);
    }
    
    public final boolean b(View paramView, int paramInt)
    {
      return paramView.canScrollVertically(paramInt);
    }
    
    public final ae t(View paramView)
    {
      if (a == null) {
        a = new WeakHashMap();
      }
      ae localae2 = (ae)a.get(paramView);
      ae localae1 = localae2;
      if (localae2 == null)
      {
        localae1 = new ae(paramView);
        a.put(paramView, localae1);
      }
      return localae1;
    }
  }
  
  static class f
    extends w.d
  {
    public final void a(View paramView, Drawable paramDrawable)
    {
      paramView.setBackground(paramDrawable);
    }
    
    public final void a(View paramView, Runnable paramRunnable)
    {
      paramView.postOnAnimation(paramRunnable);
    }
    
    public final void a(View paramView, Runnable paramRunnable, long paramLong)
    {
      paramView.postOnAnimationDelayed(paramRunnable, paramLong);
    }
    
    public final boolean b(View paramView)
    {
      return paramView.hasTransientState();
    }
    
    public final void c(View paramView)
    {
      paramView.postInvalidateOnAnimation();
    }
    
    public void c(View paramView, int paramInt)
    {
      int i = paramInt;
      if (paramInt == 4) {
        i = 2;
      }
      paramView.setImportantForAccessibility(i);
    }
    
    public final int d(View paramView)
    {
      return paramView.getImportantForAccessibility();
    }
    
    public final ViewParent h(View paramView)
    {
      return paramView.getParentForAccessibility();
    }
    
    public final boolean n(View paramView)
    {
      return paramView.hasOverlappingRendering();
    }
    
    public final int r(View paramView)
    {
      return paramView.getMinimumWidth();
    }
    
    public final int s(View paramView)
    {
      return paramView.getMinimumHeight();
    }
    
    public void w(View paramView)
    {
      paramView.requestFitSystemWindows();
    }
    
    public final boolean z(View paramView)
    {
      return paramView.getFitsSystemWindows();
    }
  }
  
  static class g
    extends w.f
  {
    public final boolean C(View paramView)
    {
      return paramView.isPaddingRelative();
    }
    
    public final Display K(View paramView)
    {
      return paramView.getDisplay();
    }
    
    public final void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramView.setPaddingRelative(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    public final int g(View paramView)
    {
      return paramView.getLayoutDirection();
    }
    
    public final int l(View paramView)
    {
      return paramView.getPaddingStart();
    }
    
    public final int m(View paramView)
    {
      return paramView.getPaddingEnd();
    }
    
    public final int v(View paramView)
    {
      return paramView.getWindowSystemUiVisibility();
    }
  }
  
  static class h
    extends w.g
  {}
  
  static class i
    extends w.h
  {
    public final boolean G(View paramView)
    {
      return paramView.isLaidOut();
    }
    
    public final boolean I(View paramView)
    {
      return paramView.isAttachedToWindow();
    }
    
    public final void c(View paramView, int paramInt)
    {
      paramView.setImportantForAccessibility(paramInt);
    }
    
    public final void k(View paramView)
    {
      paramView.setAccessibilityLiveRegion(1);
    }
  }
  
  static class j
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
      paramal = al.a(paramal);
      WindowInsets localWindowInsets1 = (WindowInsets)paramal;
      WindowInsets localWindowInsets2 = paramView.onApplyWindowInsets(localWindowInsets1);
      paramView = paramal;
      if (localWindowInsets2 != localWindowInsets1) {
        paramView = new WindowInsets(localWindowInsets2);
      }
      return al.a(paramView);
    }
    
    public final void a(View paramView, ColorStateList paramColorStateList)
    {
      paramView.setBackgroundTintList(paramColorStateList);
      if (Build.VERSION.SDK_INT == 21)
      {
        paramColorStateList = paramView.getBackground();
        if ((paramView.getBackgroundTintList() == null) || (paramView.getBackgroundTintMode() == null)) {
          break label64;
        }
      }
      label64:
      for (int i = 1;; i = 0)
      {
        if ((paramColorStateList != null) && (i != 0))
        {
          if (paramColorStateList.isStateful()) {
            paramColorStateList.setState(paramView.getDrawableState());
          }
          paramView.setBackground(paramColorStateList);
        }
        return;
      }
    }
    
    public final void a(View paramView, PorterDuff.Mode paramMode)
    {
      paramView.setBackgroundTintMode(paramMode);
      if (Build.VERSION.SDK_INT == 21)
      {
        paramMode = paramView.getBackground();
        if ((paramView.getBackgroundTintList() == null) || (paramView.getBackgroundTintMode() == null)) {
          break label64;
        }
      }
      label64:
      for (int i = 1;; i = 0)
      {
        if ((paramMode != null) && (i != 0))
        {
          if (paramMode.isStateful()) {
            paramMode.setState(paramView.getDrawableState());
          }
          paramView.setBackground(paramMode);
        }
        return;
      }
    }
    
    public final void a(View paramView, final s params)
    {
      if (params == null)
      {
        z.a(paramView, null);
        return;
      }
      z.a(paramView, new z.a()
      {
        public final Object a(View paramAnonymousView, Object paramAnonymousObject)
        {
          paramAnonymousObject = al.a(paramAnonymousObject);
          return al.a(params.a(paramAnonymousView, (al)paramAnonymousObject));
        }
      });
    }
    
    public final al b(View paramView, al paramal)
    {
      paramal = al.a(paramal);
      WindowInsets localWindowInsets1 = (WindowInsets)paramal;
      WindowInsets localWindowInsets2 = paramView.dispatchApplyWindowInsets(localWindowInsets1);
      paramView = paramal;
      if (localWindowInsets2 != localWindowInsets1) {
        paramView = new WindowInsets(localWindowInsets2);
      }
      return al.a(paramView);
    }
    
    public final void d(View paramView, float paramFloat)
    {
      paramView.setElevation(paramFloat);
    }
    
    public void f(View paramView, int paramInt)
    {
      Rect localRect = z.a();
      ViewParent localViewParent = paramView.getParent();
      int i;
      if ((localViewParent instanceof View))
      {
        View localView = (View)localViewParent;
        localRect.set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
        if (!localRect.intersects(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom())) {
          i = 1;
        }
      }
      for (;;)
      {
        y.b(paramView, paramInt);
        if ((i != 0) && (localRect.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()))) {
          ((View)localViewParent).invalidate(localRect);
        }
        return;
        i = 0;
        continue;
        i = 0;
      }
    }
    
    public void g(View paramView, int paramInt)
    {
      Rect localRect = z.a();
      ViewParent localViewParent = paramView.getParent();
      int i;
      if ((localViewParent instanceof View))
      {
        View localView = (View)localViewParent;
        localRect.set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
        if (!localRect.intersects(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom())) {
          i = 1;
        }
      }
      for (;;)
      {
        y.a(paramView, paramInt);
        if ((i != 0) && (localRect.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()))) {
          ((View)localViewParent).invalidate(localRect);
        }
        return;
        i = 0;
        continue;
        i = 0;
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
  
  static class k
    extends w.j
  {
    public final void e(View paramView, int paramInt)
    {
      paramView.setScrollIndicators(paramInt, 3);
    }
    
    public final void f(View paramView, int paramInt)
    {
      paramView.offsetLeftAndRight(paramInt);
    }
    
    public final void g(View paramView, int paramInt)
    {
      paramView.offsetTopAndBottom(paramInt);
    }
  }
  
  static abstract interface l
  {
    public abstract void A(View paramView);
    
    public abstract void B(View paramView);
    
    public abstract boolean C(View paramView);
    
    public abstract ColorStateList D(View paramView);
    
    public abstract PorterDuff.Mode E(View paramView);
    
    public abstract void F(View paramView);
    
    public abstract boolean G(View paramView);
    
    public abstract float H(View paramView);
    
    public abstract boolean I(View paramView);
    
    public abstract boolean J(View paramView);
    
    public abstract Display K(View paramView);
    
    public abstract int a(int paramInt1, int paramInt2);
    
    public abstract int a(int paramInt1, int paramInt2, int paramInt3);
    
    public abstract al a(View paramView, al paramal);
    
    public abstract void a(View paramView, float paramFloat);
    
    public abstract void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
    
    public abstract void a(View paramView, ColorStateList paramColorStateList);
    
    public abstract void a(View paramView, PorterDuff.Mode paramMode);
    
    public abstract void a(View paramView, Drawable paramDrawable);
    
    public abstract void a(View paramView, b paramb);
    
    public abstract void a(View paramView, s params);
    
    public abstract void a(View paramView, Runnable paramRunnable);
    
    public abstract void a(View paramView, Runnable paramRunnable, long paramLong);
    
    public abstract void a(View paramView, boolean paramBoolean);
    
    public abstract boolean a(View paramView);
    
    public abstract boolean a(View paramView, int paramInt);
    
    public abstract al b(View paramView, al paramal);
    
    public abstract void b(View paramView, float paramFloat);
    
    public abstract void b(View paramView, boolean paramBoolean);
    
    public abstract boolean b(View paramView);
    
    public abstract boolean b(View paramView, int paramInt);
    
    public abstract void c(View paramView);
    
    public abstract void c(View paramView, float paramFloat);
    
    public abstract void c(View paramView, int paramInt);
    
    public abstract int d(View paramView);
    
    public abstract void d(View paramView, float paramFloat);
    
    public abstract void d(View paramView, int paramInt);
    
    public abstract float e(View paramView);
    
    public abstract void e(View paramView, int paramInt);
    
    public abstract int f(View paramView);
    
    public abstract void f(View paramView, int paramInt);
    
    public abstract int g(View paramView);
    
    public abstract void g(View paramView, int paramInt);
    
    public abstract ViewParent h(View paramView);
    
    public abstract int i(View paramView);
    
    public abstract int j(View paramView);
    
    public abstract void k(View paramView);
    
    public abstract int l(View paramView);
    
    public abstract int m(View paramView);
    
    public abstract boolean n(View paramView);
    
    public abstract float o(View paramView);
    
    public abstract float p(View paramView);
    
    public abstract Matrix q(View paramView);
    
    public abstract int r(View paramView);
    
    public abstract int s(View paramView);
    
    public abstract ae t(View paramView);
    
    public abstract String u(View paramView);
    
    public abstract int v(View paramView);
    
    public abstract void w(View paramView);
    
    public abstract float x(View paramView);
    
    public abstract boolean z(View paramView);
  }
}


/* Location:              android/support/v4/h/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */