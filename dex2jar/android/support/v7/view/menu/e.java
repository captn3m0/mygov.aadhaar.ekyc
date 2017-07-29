package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.h.f;
import android.support.v4.h.w;
import android.support.v7.a.a.d;
import android.support.v7.a.a.g;
import android.support.v7.widget.an;
import android.support.v7.widget.ap;
import android.support.v7.widget.aq;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class e
  extends m
  implements o, View.OnKeyListener, PopupWindow.OnDismissListener
{
  final Handler a;
  final List<a> b = new ArrayList();
  View c;
  boolean d;
  private final Context f;
  private final int g;
  private final int h;
  private final int i;
  private final boolean j;
  private final List<h> k = new LinkedList();
  private final ViewTreeObserver.OnGlobalLayoutListener l = new ViewTreeObserver.OnGlobalLayoutListener()
  {
    public final void onGlobalLayout()
    {
      Object localObject;
      if ((f()) && (b.size() > 0) && (!b.get(0)).a.p))
      {
        localObject = c;
        if ((localObject != null) && (((View)localObject).isShown())) {
          break label77;
        }
        e();
      }
      for (;;)
      {
        return;
        label77:
        localObject = b.iterator();
        while (((Iterator)localObject).hasNext()) {
          nexta.d();
        }
      }
    }
  };
  private final ap m = new ap()
  {
    public final void a(h paramAnonymoush, MenuItem paramAnonymousMenuItem)
    {
      a.removeCallbacksAndMessages(paramAnonymoush);
    }
    
    public final void b(final h paramAnonymoush, final MenuItem paramAnonymousMenuItem)
    {
      a.removeCallbacksAndMessages(null);
      int i = 0;
      int j = b.size();
      if (i < j) {
        if (paramAnonymoush != b.get(i)).b) {}
      }
      for (;;)
      {
        if (i == -1)
        {
          return;
          i += 1;
          break;
        }
        i += 1;
        if (i < b.size()) {}
        for (final e.a locala = (e.a)b.get(i);; locala = null)
        {
          paramAnonymousMenuItem = new Runnable()
          {
            public final void run()
            {
              if (locala != null)
              {
                d = true;
                localab.b(false);
                d = false;
              }
              if ((paramAnonymousMenuItem.isEnabled()) && (paramAnonymousMenuItem.hasSubMenu())) {
                paramAnonymoush.a(paramAnonymousMenuItem, null, 4);
              }
            }
          };
          long l = SystemClock.uptimeMillis();
          a.postAtTime(paramAnonymousMenuItem, paramAnonymoush, l + 200L);
          return;
        }
        i = -1;
      }
    }
  };
  private int n = 0;
  private int o = 0;
  private View p;
  private int q;
  private boolean r;
  private boolean s;
  private int t;
  private int u;
  private boolean v;
  private boolean w;
  private o.a x;
  private ViewTreeObserver y;
  private PopupWindow.OnDismissListener z;
  
  public e(Context paramContext, View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    f = paramContext;
    p = paramView;
    h = paramInt1;
    i = paramInt2;
    j = paramBoolean;
    v = false;
    q = i();
    paramContext = paramContext.getResources();
    g = Math.max(getDisplayMetricswidthPixels / 2, paramContext.getDimensionPixelSize(a.d.abc_config_prefDialogWidth));
    a = new Handler();
  }
  
  private void c(h paramh)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(f);
    Object localObject1 = new g(paramh, localLayoutInflater, j);
    int i3;
    aq localaq;
    Object localObject3;
    Object localObject2;
    int i2;
    int i1;
    if ((!f()) && (v))
    {
      c = true;
      i3 = a((ListAdapter)localObject1, null, f, g);
      localaq = new aq(f, h, i);
      b = m;
      l = this;
      localaq.a(this);
      k = p;
      h = o;
      localaq.b();
      localaq.a((ListAdapter)localObject1);
      localaq.b(i3);
      h = o;
      if (b.size() <= 0) {
        break label779;
      }
      localObject3 = (a)b.get(b.size() - 1);
      localObject2 = b;
      i2 = ((h)localObject2).size();
      i1 = 0;
      label201:
      if (i1 >= i2) {
        break label629;
      }
      localObject1 = ((h)localObject2).getItem(i1);
      if ((!((MenuItem)localObject1).hasSubMenu()) || (paramh != ((MenuItem)localObject1).getSubMenu())) {
        break label622;
      }
      label235:
      if (localObject1 != null) {
        break label635;
      }
      localObject1 = null;
      label243:
      localObject2 = localObject1;
      localObject1 = localObject3;
      if (localObject2 == null) {
        break label862;
      }
      if (aq.a == null) {}
    }
    for (;;)
    {
      try
      {
        aq.a.invoke(q, new Object[] { Boolean.valueOf(false) });
        if (Build.VERSION.SDK_INT >= 23) {
          q.setEnterTransition(null);
        }
        localObject3 = b.get(b.size() - 1)).a.e;
        localObject4 = new int[2];
        ((ListView)localObject3).getLocationOnScreen((int[])localObject4);
        Rect localRect = new Rect();
        c.getWindowVisibleDisplayFrame(localRect);
        if (q == 1)
        {
          i1 = localObject4[0];
          if (((ListView)localObject3).getWidth() + i1 + i3 > right) {
            continue;
          }
          i1 = 1;
          if (i1 != 1) {
            continue;
          }
          i2 = 1;
          q = i1;
          localObject3 = new int[2];
          ((View)localObject2).getLocationInWindow((int[])localObject3);
          i1 = a.g + localObject3[0];
          int i4 = a.c();
          int i5 = localObject3[1];
          if ((o & 0x5) != 5) {
            continue;
          }
          if (i2 == 0) {
            continue;
          }
          i1 += i3;
          g = i1;
          localaq.a(i5 + i4);
          localObject2 = new a(localaq, paramh, q);
          b.add(localObject2);
          localaq.d();
          if ((localObject1 == null) && (w) && (f != null))
          {
            localObject1 = e;
            localObject2 = (FrameLayout)localLayoutInflater.inflate(a.g.abc_popup_menu_header_item_layout, (ViewGroup)localObject1, false);
            localObject3 = (TextView)((FrameLayout)localObject2).findViewById(16908310);
            ((FrameLayout)localObject2).setEnabled(false);
            ((TextView)localObject3).setText(f);
            ((ListView)localObject1).addHeaderView((View)localObject2, null, false);
            localaq.d();
          }
          return;
          if (!f()) {
            break;
          }
          c = m.b(paramh);
          break;
          label622:
          i1 += 1;
          break label201;
          label629:
          localObject1 = null;
          break label235;
          label635:
          localObject4 = a.e;
          localObject2 = ((ListView)localObject4).getAdapter();
          if ((localObject2 instanceof HeaderViewListAdapter))
          {
            localObject2 = (HeaderViewListAdapter)localObject2;
            i2 = ((HeaderViewListAdapter)localObject2).getHeadersCount();
            localObject2 = (g)((HeaderViewListAdapter)localObject2).getWrappedAdapter();
            i1 = 0;
            i4 = ((g)localObject2).getCount();
            if (i1 >= i4) {
              break label906;
            }
            if (localObject1 != ((g)localObject2).a(i1)) {
              continue;
            }
            if (i1 != -1) {
              continue;
            }
            localObject1 = null;
            break label243;
          }
          localObject2 = (g)localObject2;
          i2 = 0;
          continue;
          i1 += 1;
          continue;
          i1 = i2 + i1 - ((ListView)localObject4).getFirstVisiblePosition();
          if ((i1 < 0) || (i1 >= ((ListView)localObject4).getChildCount()))
          {
            localObject1 = null;
            break label243;
          }
          localObject1 = ((ListView)localObject4).getChildAt(i1);
          break label243;
          label779:
          localObject2 = null;
          localObject1 = null;
        }
      }
      catch (Exception localException)
      {
        Object localObject4;
        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
        continue;
        if (localObject4[0] - i3 < 0)
        {
          i1 = 1;
          continue;
        }
        i1 = 0;
        continue;
        i2 = 0;
        continue;
        i1 -= ((View)localObject2).getWidth();
        continue;
        if (i2 != 0)
        {
          i1 = ((View)localObject2).getWidth() + i1;
          continue;
        }
        i1 -= i3;
        continue;
      }
      label862:
      if (r) {
        g = t;
      }
      if (s) {
        localaq.a(u);
      }
      o = e;
      continue;
      label906:
      i1 = -1;
    }
  }
  
  private int i()
  {
    int i1 = 1;
    if (w.g(p) == 1) {
      i1 = 0;
    }
    return i1;
  }
  
  public final void a(int paramInt)
  {
    if (n != paramInt)
    {
      n = paramInt;
      o = f.a(paramInt, w.g(p));
    }
  }
  
  public final void a(Parcelable paramParcelable) {}
  
  public final void a(h paramh)
  {
    paramh.a(this, f);
    if (f())
    {
      c(paramh);
      return;
    }
    k.add(paramh);
  }
  
  public final void a(h paramh, boolean paramBoolean)
  {
    int i2 = b.size();
    int i1 = 0;
    if (i1 < i2) {
      if (paramh == b.get(i1)).b) {
        label39:
        if (i1 >= 0) {
          break label56;
        }
      }
    }
    label56:
    do
    {
      return;
      i1 += 1;
      break;
      i1 = -1;
      break label39;
      i2 = i1 + 1;
      if (i2 < b.size()) {
        b.get(i2)).b.b(false);
      }
      a locala = (a)b.remove(i1);
      b.b(this);
      if (d)
      {
        aq localaq = a;
        if (Build.VERSION.SDK_INT >= 23) {
          q.setExitTransition(null);
        }
        a.q.setAnimationStyle(0);
      }
      a.e();
      i1 = b.size();
      if (i1 > 0) {}
      for (q = b.get(i1 - 1)).c; i1 == 0; q = i())
      {
        e();
        if (x != null) {
          x.a(paramh, true);
        }
        if (y != null)
        {
          if (y.isAlive()) {
            y.removeGlobalOnLayoutListener(l);
          }
          y = null;
        }
        z.onDismiss();
        return;
      }
    } while (!paramBoolean);
    b.get(0)).b.b(false);
  }
  
  public final void a(o.a parama)
  {
    x = parama;
  }
  
  public final void a(View paramView)
  {
    if (p != paramView)
    {
      p = paramView;
      o = f.a(n, w.g(p));
    }
  }
  
  public final void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    z = paramOnDismissListener;
  }
  
  public final void a(boolean paramBoolean)
  {
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext()) {
      a(nexta.e.getAdapter()).notifyDataSetChanged();
    }
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public final boolean a(u paramu)
  {
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (paramu == b)
      {
        a.e.requestFocus();
        return true;
      }
    }
    if (paramu.hasVisibleItems())
    {
      a(paramu);
      if (x != null) {
        x.a(paramu);
      }
      return true;
    }
    return false;
  }
  
  public final void b(int paramInt)
  {
    r = true;
    t = paramInt;
  }
  
  public final void b(boolean paramBoolean)
  {
    v = paramBoolean;
  }
  
  public final Parcelable c()
  {
    return null;
  }
  
  public final void c(int paramInt)
  {
    s = true;
    u = paramInt;
  }
  
  public final void c(boolean paramBoolean)
  {
    w = paramBoolean;
  }
  
  public final void d()
  {
    if (f()) {}
    do
    {
      return;
      Iterator localIterator = k.iterator();
      while (localIterator.hasNext()) {
        c((h)localIterator.next());
      }
      k.clear();
      c = p;
    } while (c == null);
    if (y == null) {}
    for (int i1 = 1;; i1 = 0)
    {
      y = c.getViewTreeObserver();
      if (i1 == 0) {
        break;
      }
      y.addOnGlobalLayoutListener(l);
      return;
    }
  }
  
  public final void e()
  {
    int i1 = b.size();
    if (i1 > 0)
    {
      a[] arrayOfa = (a[])b.toArray(new a[i1]);
      i1 -= 1;
      while (i1 >= 0)
      {
        a locala = arrayOfa[i1];
        if (a.q.isShowing()) {
          a.e();
        }
        i1 -= 1;
      }
    }
  }
  
  public final boolean f()
  {
    return (b.size() > 0) && (b.get(0)).a.q.isShowing());
  }
  
  public final ListView g()
  {
    if (b.isEmpty()) {
      return null;
    }
    return b.get(b.size() - 1)).a.e;
  }
  
  protected final boolean h()
  {
    return false;
  }
  
  public final void onDismiss()
  {
    int i2 = b.size();
    int i1 = 0;
    a locala;
    if (i1 < i2)
    {
      locala = (a)b.get(i1);
      if (a.q.isShowing()) {}
    }
    for (;;)
    {
      if (locala != null) {
        b.b(false);
      }
      return;
      i1 += 1;
      break;
      locala = null;
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
  
  private static final class a
  {
    public final aq a;
    public final h b;
    public final int c;
    
    public a(aq paramaq, h paramh, int paramInt)
    {
      a = paramaq;
      b = paramh;
      c = paramInt;
    }
  }
}


/* Location:              android/support/v7/view/menu/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */