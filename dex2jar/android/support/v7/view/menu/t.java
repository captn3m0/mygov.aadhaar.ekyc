package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.a.a.d;
import android.support.v7.a.a.g;
import android.support.v7.widget.an;
import android.support.v7.widget.aq;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

final class t
  extends m
  implements o, View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  final aq a;
  View b;
  private final Context c;
  private final h d;
  private final g f;
  private final boolean g;
  private final int h;
  private final int i;
  private final int j;
  private final ViewTreeObserver.OnGlobalLayoutListener k = new ViewTreeObserver.OnGlobalLayoutListener()
  {
    public final void onGlobalLayout()
    {
      if ((f()) && (!a.p))
      {
        View localView = b;
        if ((localView == null) || (!localView.isShown())) {
          e();
        }
      }
      else
      {
        return;
      }
      a.d();
    }
  };
  private PopupWindow.OnDismissListener l;
  private View m;
  private o.a n;
  private ViewTreeObserver o;
  private boolean p;
  private boolean q;
  private int r;
  private int s = 0;
  private boolean t;
  
  public t(Context paramContext, h paramh, View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    c = paramContext;
    d = paramh;
    g = paramBoolean;
    f = new g(paramh, LayoutInflater.from(paramContext), g);
    i = paramInt1;
    j = paramInt2;
    Resources localResources = paramContext.getResources();
    h = Math.max(getDisplayMetricswidthPixels / 2, localResources.getDimensionPixelSize(a.d.abc_config_prefDialogWidth));
    m = paramView;
    a = new aq(c, i, j);
    paramh.a(this, paramContext);
  }
  
  public final void a(int paramInt)
  {
    s = paramInt;
  }
  
  public final void a(Parcelable paramParcelable) {}
  
  public final void a(h paramh) {}
  
  public final void a(h paramh, boolean paramBoolean)
  {
    if (paramh != d) {}
    do
    {
      return;
      e();
    } while (n == null);
    n.a(paramh, paramBoolean);
  }
  
  public final void a(o.a parama)
  {
    n = parama;
  }
  
  public final void a(View paramView)
  {
    m = paramView;
  }
  
  public final void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    l = paramOnDismissListener;
  }
  
  public final void a(boolean paramBoolean)
  {
    q = false;
    if (f != null) {
      f.notifyDataSetChanged();
    }
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public final boolean a(u paramu)
  {
    if (paramu.hasVisibleItems())
    {
      n localn = new n(c, paramu, b, g, i, j);
      localn.a(n);
      localn.a(m.b(paramu));
      c = l;
      l = null;
      d.b(false);
      int i1 = a.g;
      int i2 = a.c();
      if (localn.e()) {
        i1 = 1;
      }
      while (i1 != 0)
      {
        if (n != null) {
          n.a(paramu);
        }
        return true;
        if (a == null)
        {
          i1 = 0;
        }
        else
        {
          localn.a(i1, i2, true, true);
          i1 = 1;
        }
      }
    }
    return false;
  }
  
  public final void b(int paramInt)
  {
    a.g = paramInt;
  }
  
  public final void b(boolean paramBoolean)
  {
    f.c = paramBoolean;
  }
  
  public final Parcelable c()
  {
    return null;
  }
  
  public final void c(int paramInt)
  {
    a.a(paramInt);
  }
  
  public final void c(boolean paramBoolean)
  {
    t = paramBoolean;
  }
  
  public final void d()
  {
    int i2 = 1;
    int i1;
    if (f()) {
      i1 = i2;
    }
    while (i1 == 0)
    {
      throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
      if ((p) || (m == null))
      {
        i1 = 0;
      }
      else
      {
        b = m;
        a.a(this);
        a.l = this;
        a.b();
        Object localObject = b;
        if (o == null) {}
        for (i1 = 1;; i1 = 0)
        {
          o = ((View)localObject).getViewTreeObserver();
          if (i1 != 0) {
            o.addOnGlobalLayoutListener(k);
          }
          a.k = ((View)localObject);
          a.h = s;
          if (!q)
          {
            r = a(f, null, c, h);
            q = true;
          }
          a.b(r);
          a.h();
          a.o = e;
          a.d();
          localObject = a.e;
          ((ListView)localObject).setOnKeyListener(this);
          if ((t) && (d.f != null))
          {
            FrameLayout localFrameLayout = (FrameLayout)LayoutInflater.from(c).inflate(a.g.abc_popup_menu_header_item_layout, (ViewGroup)localObject, false);
            TextView localTextView = (TextView)localFrameLayout.findViewById(16908310);
            if (localTextView != null) {
              localTextView.setText(d.f);
            }
            localFrameLayout.setEnabled(false);
            ((ListView)localObject).addHeaderView(localFrameLayout, null, false);
          }
          a.a(f);
          a.d();
          i1 = i2;
          break;
        }
      }
    }
  }
  
  public final void e()
  {
    if (f()) {
      a.e();
    }
  }
  
  public final boolean f()
  {
    return (!p) && (a.q.isShowing());
  }
  
  public final ListView g()
  {
    return a.e;
  }
  
  public final void onDismiss()
  {
    p = true;
    d.close();
    if (o != null)
    {
      if (!o.isAlive()) {
        o = b.getViewTreeObserver();
      }
      o.removeGlobalOnLayoutListener(k);
      o = null;
    }
    if (l != null) {
      l.onDismiss();
    }
  }
  
  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      e();
      return true;
    }
    return false;
  }
}


/* Location:              android/support/v7/view/menu/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */