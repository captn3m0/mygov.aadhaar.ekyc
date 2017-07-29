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
  private final PopupWindow.OnDismissListener l = new PopupWindow.OnDismissListener()
  {
    public final void onDismiss()
    {
      d();
    }
  };
  
  public n(Context paramContext, h paramh, View paramView, boolean paramBoolean, int paramInt)
  {
    this(paramContext, paramh, paramView, paramBoolean, paramInt, 0);
  }
  
  public n(Context paramContext, h paramh, View paramView, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    d = paramContext;
    e = paramh;
    a = paramView;
    f = paramBoolean;
    g = paramInt1;
    h = paramInt2;
  }
  
  public final m a()
  {
    Point localPoint;
    int m;
    if (k == null)
    {
      localObject = ((WindowManager)d.getSystemService("window")).getDefaultDisplay();
      localPoint = new Point();
      if (Build.VERSION.SDK_INT < 17) {
        break label165;
      }
      ((Display)localObject).getRealSize(localPoint);
      if (Math.min(x, y) < d.getResources().getDimensionPixelSize(a.d.abc_cascading_menus_min_smallest_width)) {
        break label196;
      }
      m = 1;
      label75:
      if (m == 0) {
        break label201;
      }
    }
    label165:
    label196:
    label201:
    for (Object localObject = new e(d, a, g, h, f);; localObject = new t(d, e, a, g, h, f))
    {
      ((m)localObject).a(e);
      ((m)localObject).a(l);
      ((m)localObject).a(a);
      ((m)localObject).a(j);
      ((m)localObject).b(i);
      ((m)localObject).a(b);
      k = ((m)localObject);
      return k;
      if (Build.VERSION.SDK_INT >= 13)
      {
        ((Display)localObject).getSize(localPoint);
        break;
      }
      localPoint.set(((Display)localObject).getWidth(), ((Display)localObject).getHeight());
      break;
      m = 0;
      break label75;
    }
  }
  
  final void a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    m localm = a();
    localm.c(paramBoolean2);
    if (paramBoolean1)
    {
      int m = paramInt1;
      if ((f.a(b, w.g(a)) & 0x7) == 5) {
        m = paramInt1 - a.getWidth();
      }
      localm.b(m);
      localm.c(paramInt2);
      paramInt1 = (int)(d.getResources().getDisplayMetrics().density * 48.0F / 2.0F);
      e = new Rect(m - paramInt1, paramInt2 - paramInt1, m + paramInt1, paramInt1 + paramInt2);
    }
    localm.d();
  }
  
  public final void a(o.a parama)
  {
    j = parama;
    if (k != null) {
      k.a(parama);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    i = paramBoolean;
    if (k != null) {
      k.b(paramBoolean);
    }
  }
  
  public final boolean b()
  {
    if (e()) {
      return true;
    }
    if (a == null) {
      return false;
    }
    a(0, 0, false, false);
    return true;
  }
  
  public final void c()
  {
    if (e()) {
      k.e();
    }
  }
  
  protected void d()
  {
    k = null;
    if (c != null) {
      c.onDismiss();
    }
  }
  
  public final boolean e()
  {
    return (k != null) && (k.f());
  }
}


/* Location:              android/support/v7/view/menu/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */