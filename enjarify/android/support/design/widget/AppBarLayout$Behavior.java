package android.support.design.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.h.w;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

public class AppBarLayout$Behavior
  extends i
{
  private int b;
  private boolean c;
  private boolean d;
  private q e;
  private int f = -1;
  private boolean g;
  private float h;
  private WeakReference i;
  private AppBarLayout.Behavior.a j;
  
  public AppBarLayout$Behavior() {}
  
  public AppBarLayout$Behavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout)
  {
    int k = a();
    int m = paramAppBarLayout.getChildCount();
    int i2 = 0;
    AppBarLayout.a locala = null;
    int i4;
    int i5;
    label72:
    View localView2;
    int n;
    if (i2 < m)
    {
      View localView1 = paramAppBarLayout.getChildAt(i2);
      int i3 = localView1.getTop();
      i4 = -k;
      if (i3 <= i4)
      {
        i5 = localView1.getBottom();
        i3 = -k;
        if (i5 >= i3)
        {
          m = i2;
          if (m >= 0)
          {
            localView2 = paramAppBarLayout.getChildAt(m);
            locala = (AppBarLayout.a)localView2.getLayoutParams();
            i4 = a;
            i2 = i4 & 0x11;
            i5 = 17;
            if (i2 == i5)
            {
              i5 = -localView2.getTop();
              i2 = -localView2.getBottom();
              int i6 = paramAppBarLayout.getChildCount() + -1;
              if (m == i6)
              {
                m = paramAppBarLayout.getTopInset();
                i2 += m;
              }
              boolean bool1 = a(i4, 2);
              if (!bool1) {
                break label259;
              }
              n = w.r(localView2);
              i2 += n;
              n = i5;
            }
          }
        }
      }
    }
    for (;;)
    {
      label195:
      i5 = (i2 + n) / 2;
      if (k < i5) {}
      for (;;)
      {
        n = -paramAppBarLayout.getTotalScrollRange();
        i2 = k.a(i2, n, 0);
        n = 0;
        a(paramCoordinatorLayout, paramAppBarLayout, i2, 0.0F);
        return;
        i2 += 1;
        break;
        i2 = -1;
        n = i2;
        break label72;
        label259:
        boolean bool2 = a(i4, 5);
        if (!bool2) {
          break label306;
        }
        i1 = w.r(localView2) + i2;
        if (k < i1) {
          break label195;
        }
        i2 = i1;
        i1 = i5;
        break label195;
        i2 = i1;
      }
      label306:
      int i1 = i5;
    }
  }
  
  private void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt, float paramFloat)
  {
    int k = Math.abs(a() - paramInt);
    float f1 = Math.abs(paramFloat);
    float f2 = 0.0F;
    Object localObject1 = null;
    boolean bool2 = f1 < 0.0F;
    float f3;
    if (bool2)
    {
      int n = 1148846080;
      f2 = 1000.0F;
      f3 = k / f1 * f2;
    }
    int i1;
    Object localObject2;
    int m;
    for (k = Math.round(f3) * 3;; m = (int)f3)
    {
      i1 = a();
      if (i1 != paramInt) {
        break;
      }
      localObject2 = e;
      boolean bool1;
      if (localObject2 != null)
      {
        localObject2 = e.a;
        bool1 = ((q.e)localObject2).b();
        if (bool1)
        {
          localObject2 = e.a;
          ((q.e)localObject2).e();
        }
      }
      return;
      f3 = bool1;
      f1 = paramAppBarLayout.getHeight();
      f3 = f3 / f1 + 1.0F;
      i1 = 1125515264;
      f1 = 150.0F;
      f3 *= f1;
    }
    localObject1 = e;
    if (localObject1 == null)
    {
      localObject1 = x.a();
      e = ((q)localObject1);
      localObject1 = e;
      Object localObject3 = a.e;
      ((q)localObject1).a((Interpolator)localObject3);
      localObject1 = e;
      localObject3 = new android/support/design/widget/AppBarLayout$Behavior$1;
      ((AppBarLayout.Behavior.1)localObject3).<init>(this, paramCoordinatorLayout, paramAppBarLayout);
      ((q)localObject1).a((q.c)localObject3);
    }
    for (;;)
    {
      localObject1 = e;
      int i2 = 600;
      m = Math.min(m, i2);
      long l = m;
      ((q)localObject1).a(l);
      e.a.a(i1, paramInt);
      localObject2 = e.a;
      ((q.e)localObject2).a();
      break;
      localObject1 = e.a;
      ((q.e)localObject1).e();
    }
  }
  
  private static void a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int k = 1;
    int m = 0;
    int n = Math.abs(paramInt1);
    int i1 = paramAppBarLayout.getChildCount();
    int i2 = 0;
    Object localObject1 = null;
    Object localObject2;
    label71:
    int i6;
    if (i2 < i1)
    {
      localObject2 = paramAppBarLayout.getChildAt(i2);
      int i5 = ((View)localObject2).getTop();
      if (n >= i5)
      {
        i5 = ((View)localObject2).getBottom();
        if (n <= i5)
        {
          localObject1 = localObject2;
          if (localObject1 != null)
          {
            localObject2 = (AppBarLayout.a)((View)localObject1).getLayoutParams();
            i6 = a;
            n = i6 & 0x1;
            if (n == 0) {
              break label478;
            }
            n = w.r((View)localObject1);
            if (paramInt2 <= 0) {
              break label395;
            }
            i1 = i6 & 0xC;
            if (i1 == 0) {
              break label395;
            }
            i6 = -paramInt1;
            i2 = ((View)localObject1).getBottom() - n;
            n = paramAppBarLayout.getTopInset();
            i2 -= n;
            if (i6 < i2) {
              break label386;
            }
            i6 = k;
          }
        }
      }
    }
    for (;;)
    {
      label165:
      int i3 = d;
      label192:
      int i4;
      List localList;
      if (i3 != i6)
      {
        d = i6;
        paramAppBarLayout.refreshDrawableState();
        i6 = k;
        i4 = Build.VERSION.SDK_INT;
        n = 11;
        if (i4 >= n) {
          if (!paramBoolean)
          {
            if (i6 == 0) {
              break label357;
            }
            localObject2 = e.b(paramAppBarLayout);
            localObject1 = f;
            ((List)localObject1).clear();
            if (localObject2 != null)
            {
              localObject1 = f;
              ((List)localObject1).addAll((Collection)localObject2);
            }
            localList = f;
            i1 = localList.size();
            i4 = 0;
            localObject1 = null;
          }
        }
      }
      for (;;)
      {
        if (i4 < i1)
        {
          localObject2 = getgetLayoutParamsa;
          boolean bool = localObject2 instanceof AppBarLayout.ScrollingViewBehavior;
          if (!bool) {
            break label465;
          }
          localObject2 = (AppBarLayout.ScrollingViewBehavior)localObject2;
          i7 = d;
          if (i7 != 0) {
            m = k;
          }
        }
        if (m != 0) {
          paramAppBarLayout.jumpDrawablesToCurrentState();
        }
        label357:
        return;
        i7 = i4 + 1;
        i4 = i7;
        break;
        i7 = 0;
        localObject2 = null;
        i4 = 0;
        localObject1 = null;
        break label71;
        label386:
        i7 = 0;
        localObject2 = null;
        break label165;
        label395:
        i7 &= 0x2;
        if (i7 == 0) {
          break label478;
        }
        i7 = -paramInt1;
        i4 = ((View)localObject1).getBottom() - n;
        n = paramAppBarLayout.getTopInset();
        i4 -= n;
        if (i7 >= i4)
        {
          i7 = k;
          break label165;
        }
        i7 = 0;
        localObject2 = null;
        break label165;
        i7 = 0;
        localObject2 = null;
        break label192;
        label465:
        i7 = i4 + 1;
        i4 = i7;
      }
      label478:
      int i7 = 0;
      localObject2 = null;
    }
  }
  
  private static boolean a(int paramInt1, int paramInt2)
  {
    int k = paramInt1 & paramInt2;
    if (k == paramInt2) {}
    for (k = 1;; k = 0) {
      return k;
    }
  }
  
  final int a()
  {
    int k = super.c();
    int m = b;
    return k + m;
  }
}


/* Location:              android/support/design/widget/AppBarLayout$Behavior.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */