package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.h.f;
import android.support.v4.h.w;
import android.support.v7.a.a.d;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;

public class n
{
  protected View a;
  protected int b = 8388611;
  PopupWindow.OnDismissListener c;
  private final Context d;
  private final h e;
  private final boolean f;
  private final int g;
  private final int h;
  private boolean i;
  private o.a j;
  private m k;
  private final PopupWindow.OnDismissListener l;
  
  public n(Context paramContext, h paramh, View paramView, boolean paramBoolean, int paramInt)
  {
    this(paramContext, paramh, paramView, paramBoolean, paramInt, 0);
  }
  
  public n(Context paramContext, h paramh, View paramView, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    n.1 local1 = new android/support/v7/view/menu/n$1;
    local1.<init>(this);
    l = local1;
    d = paramContext;
    e = paramh;
    a = paramView;
    f = paramBoolean;
    g = paramInt1;
    h = paramInt2;
  }
  
  public final m a()
  {
    Object localObject1 = k;
    Object localObject2;
    int m;
    int n;
    int i1;
    label104:
    Object localObject3;
    int i4;
    if (localObject1 == null)
    {
      localObject1 = ((WindowManager)d.getSystemService("window")).getDefaultDisplay();
      localObject2 = new android/graphics/Point;
      ((Point)localObject2).<init>();
      m = Build.VERSION.SDK_INT;
      n = 17;
      if (m < n) {
        break label229;
      }
      ((Display)localObject1).getRealSize((Point)localObject2);
      i1 = x;
      int i2 = y;
      i1 = Math.min(i1, i2);
      localObject2 = d.getResources();
      m = a.d.abc_cascading_menus_min_smallest_width;
      i2 = ((Resources)localObject2).getDimensionPixelSize(m);
      if (i1 < i2) {
        break label272;
      }
      i1 = 1;
      if (i1 == 0) {
        break label280;
      }
      localObject1 = new android/support/v7/view/menu/e;
      localObject2 = d;
      localObject3 = a;
      n = g;
      i4 = h;
      boolean bool2 = f;
      ((e)localObject1).<init>((Context)localObject2, (View)localObject3, n, i4, bool2);
    }
    for (;;)
    {
      localObject2 = e;
      ((m)localObject1).a((h)localObject2);
      localObject2 = l;
      ((m)localObject1).a((PopupWindow.OnDismissListener)localObject2);
      localObject2 = a;
      ((m)localObject1).a((View)localObject2);
      localObject2 = j;
      ((m)localObject1).a((o.a)localObject2);
      boolean bool1 = i;
      ((m)localObject1).b(bool1);
      int i3 = b;
      ((m)localObject1).a(i3);
      k = ((m)localObject1);
      return k;
      label229:
      m = Build.VERSION.SDK_INT;
      n = 13;
      if (m >= n)
      {
        ((Display)localObject1).getSize((Point)localObject2);
        break;
      }
      m = ((Display)localObject1).getWidth();
      i1 = ((Display)localObject1).getHeight();
      ((Point)localObject2).set(m, i1);
      break;
      label272:
      i1 = 0;
      localObject1 = null;
      break label104;
      label280:
      localObject1 = new android/support/v7/view/menu/t;
      localObject2 = d;
      localObject3 = e;
      View localView = a;
      i4 = g;
      int i5 = h;
      boolean bool3 = f;
      ((t)localObject1).<init>((Context)localObject2, (h)localObject3, localView, i4, i5, bool3);
    }
  }
  
  final void a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    m localm = a();
    localm.c(paramBoolean2);
    if (paramBoolean1)
    {
      int m = b;
      Object localObject1 = a;
      int n = w.g((View)localObject1);
      m = f.a(m, n) & 0x7;
      n = 5;
      float f1 = 7.0E-45F;
      if (m == n)
      {
        localObject2 = a;
        m = ((View)localObject2).getWidth();
        paramInt1 -= m;
      }
      localm.b(paramInt1);
      localm.c(paramInt2);
      Object localObject2 = d.getResources().getDisplayMetrics();
      float f2 = density * 48.0F;
      n = 1073741824;
      f1 = 2.0F;
      f2 /= f1;
      m = (int)f2;
      localObject1 = new android/graphics/Rect;
      int i1 = paramInt1 - m;
      int i2 = paramInt2 - m;
      int i3 = paramInt1 + m;
      m += paramInt2;
      ((Rect)localObject1).<init>(i1, i2, i3, m);
      e = ((Rect)localObject1);
    }
    localm.d();
  }
  
  public final void a(o.a parama)
  {
    j = parama;
    m localm = k;
    if (localm != null)
    {
      localm = k;
      localm.a(parama);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    i = paramBoolean;
    m localm = k;
    if (localm != null)
    {
      localm = k;
      localm.b(paramBoolean);
    }
  }
  
  public final boolean b()
  {
    boolean bool1 = true;
    boolean bool2 = e();
    if (bool2) {}
    for (;;)
    {
      return bool1;
      View localView = a;
      if (localView == null) {
        bool1 = false;
      } else {
        a(0, 0, false, false);
      }
    }
  }
  
  public final void c()
  {
    boolean bool = e();
    if (bool)
    {
      m localm = k;
      localm.e();
    }
  }
  
  protected void d()
  {
    k = null;
    PopupWindow.OnDismissListener localOnDismissListener = c;
    if (localOnDismissListener != null)
    {
      localOnDismissListener = c;
      localOnDismissListener.onDismiss();
    }
  }
  
  public final boolean e()
  {
    m localm = k;
    boolean bool;
    if (localm != null)
    {
      localm = k;
      bool = localm.f();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localm = null;
    }
  }
}


/* Location:              android/support/v7/view/menu/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */