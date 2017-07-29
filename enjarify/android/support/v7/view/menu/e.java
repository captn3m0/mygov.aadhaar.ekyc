package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
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
  final List b;
  View c;
  boolean d;
  private final Context f;
  private final int g;
  private final int h;
  private final int i;
  private final boolean j;
  private final List k;
  private final ViewTreeObserver.OnGlobalLayoutListener l;
  private final ap m;
  private int n;
  private int o;
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
    Object localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    k = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    b = ((List)localObject);
    localObject = new android/support/v7/view/menu/e$1;
    ((e.1)localObject).<init>(this);
    l = ((ViewTreeObserver.OnGlobalLayoutListener)localObject);
    localObject = new android/support/v7/view/menu/e$2;
    ((e.2)localObject).<init>(this);
    m = ((ap)localObject);
    n = 0;
    o = 0;
    f = paramContext;
    p = paramView;
    h = paramInt1;
    i = paramInt2;
    j = paramBoolean;
    v = false;
    int i1 = i();
    q = i1;
    localObject = paramContext.getResources();
    int i2 = getDisplayMetricswidthPixels / 2;
    int i3 = a.d.abc_config_prefDialogWidth;
    i1 = ((Resources)localObject).getDimensionPixelSize(i3);
    i1 = Math.max(i2, i1);
    g = i1;
    localObject = new android/os/Handler;
    ((Handler)localObject).<init>();
    a = ((Handler)localObject);
  }
  
  private void c(h paramh)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(f);
    Object localObject1 = new android/support/v7/view/menu/g;
    boolean bool1 = j;
    ((g)localObject1).<init>(paramh, localLayoutInflater, bool1);
    bool1 = f();
    Object localObject3;
    int i3;
    int i4;
    aq localaq;
    int i5;
    int i1;
    int i7;
    Object localObject5;
    int i11;
    label269:
    boolean bool7;
    if (!bool1)
    {
      bool1 = v;
      if (bool1)
      {
        bool1 = true;
        c = bool1;
        localObject3 = f;
        i3 = g;
        i4 = a((ListAdapter)localObject1, null, (Context)localObject3, i3);
        localaq = new android/support/v7/widget/aq;
        localObject4 = f;
        i5 = h;
        i3 = i;
        localaq.<init>((Context)localObject4, i5, i3);
        localObject4 = m;
        b = ((ap)localObject4);
        l = this;
        localaq.a(this);
        localObject4 = p;
        k = ((View)localObject4);
        i1 = o;
        h = i1;
        localaq.b();
        localaq.a((ListAdapter)localObject1);
        localaq.b(i4);
        i7 = o;
        h = i7;
        localObject1 = b;
        i7 = ((List)localObject1).size();
        if (i7 <= 0) {
          break label1106;
        }
        localObject1 = b;
        i1 = b.size() + -1;
        localObject1 = (e.a)((List)localObject1).get(i1);
        localObject5 = b;
        i1 = 0;
        localObject4 = null;
        i11 = ((h)localObject5).size();
        i5 = 0;
        localObject3 = null;
        if (i5 >= i11) {
          break label880;
        }
        localObject4 = ((h)localObject5).getItem(i5);
        bool7 = ((MenuItem)localObject4).hasSubMenu();
        if (!bool7) {
          break label867;
        }
        localObject6 = ((MenuItem)localObject4).getSubMenu();
        if (paramh != localObject6) {
          break label867;
        }
      }
    }
    for (Object localObject6 = localObject4;; localObject6 = null)
    {
      if (localObject6 != null) {
        break label895;
      }
      i1 = 0;
      localObject4 = null;
      localObject3 = localObject4;
      localObject5 = localObject1;
      label336:
      if (localObject3 == null) {
        break label1245;
      }
      localObject1 = aq.a;
      if (localObject1 != null) {}
      try
      {
        localObject1 = aq.a;
        localObject4 = q;
        i11 = 1;
        localObject7 = new Object[i11];
        bool7 = false;
        localObject6 = null;
        i13 = 0;
        localObject8 = null;
        localObject8 = Boolean.valueOf(false);
        localObject7[0] = localObject8;
        ((Method)localObject1).invoke(localObject4, (Object[])localObject7);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject7;
          int i13;
          Object localObject8;
          int i12;
          boolean bool4;
          boolean bool2;
          int i2;
          boolean bool3;
          int i14;
          j localj;
          localObject2 = "MenuPopupWindow";
          localObject4 = "Could not invoke setTouchModal() on PopupWindow. Oh well.";
          Log.i((String)localObject2, (String)localObject4);
          continue;
          localObject2 = null;
          int i8 = localObject4[0] - i4;
          if (i8 < 0)
          {
            i8 = 1;
            i2 = i8;
          }
          else
          {
            i8 = 0;
            localObject2 = null;
            i2 = 0;
            localObject4 = null;
            continue;
            i8 = 0;
            localObject2 = null;
            continue;
            i8 = ((View)localObject3).getWidth();
            i8 = i11 - i8;
            continue;
            if (i8 != 0) {
              i8 = ((View)localObject3).getWidth() + i11;
            } else {
              i8 = i11 - i4;
            }
          }
        }
      }
      i7 = Build.VERSION.SDK_INT;
      i1 = 23;
      if (i7 >= i1)
      {
        localObject1 = q;
        i1 = 0;
        localObject4 = null;
        ((PopupWindow)localObject1).setEnterTransition(null);
      }
      localObject1 = b;
      i1 = b.size() + -1;
      localObject1 = geta.e;
      i1 = 2;
      localObject4 = new int[i1];
      ((ListView)localObject1).getLocationOnScreen((int[])localObject4);
      localObject7 = new android/graphics/Rect;
      ((Rect)localObject7).<init>();
      localObject6 = c;
      ((View)localObject6).getWindowVisibleDisplayFrame((Rect)localObject7);
      i12 = q;
      i13 = 1;
      if (i12 != i13) {
        break label1152;
      }
      i12 = 0;
      localObject6 = null;
      i1 = localObject4[0];
      i7 = ((ListView)localObject1).getWidth() + i1 + i4;
      i1 = right;
      if (i7 > i1) {
        break label1178;
      }
      i7 = 1;
      i1 = i7;
      i7 = 1;
      if (i1 != i7) {
        break label1192;
      }
      i7 = 1;
      q = i1;
      localObject4 = new int[2];
      ((View)localObject3).getLocationInWindow((int[])localObject4);
      localObject7 = a;
      i11 = g;
      i12 = localObject4[0];
      i11 += i12;
      localObject6 = a;
      i12 = ((aq)localObject6).c();
      i1 = localObject4[1] + i12;
      i12 = o & 0x5;
      i13 = 5;
      if (i12 != i13) {
        break label1217;
      }
      if (i7 == 0) {
        break label1200;
      }
      i7 = i11 + i4;
      g = i7;
      localaq.a(i1);
      label696:
      localObject1 = new android/support/v7/view/menu/e$a;
      i1 = q;
      ((e.a)localObject1).<init>(localaq, paramh, i1);
      localObject4 = b;
      ((List)localObject4).add(localObject1);
      localaq.d();
      if (localObject5 == null)
      {
        bool4 = w;
        if (bool4)
        {
          localObject1 = f;
          if (localObject1 != null)
          {
            localObject3 = e;
            i8 = a.g.abc_popup_menu_header_item_layout;
            localObject1 = (FrameLayout)localLayoutInflater.inflate(i8, (ViewGroup)localObject3, false);
            localObject4 = (TextView)((FrameLayout)localObject1).findViewById(16908310);
            ((FrameLayout)localObject1).setEnabled(false);
            localObject5 = f;
            ((TextView)localObject4).setText((CharSequence)localObject5);
            i1 = 0;
            localObject4 = null;
            i3 = 0;
            localObject5 = null;
            ((ListView)localObject3).addHeaderView((View)localObject1, null, false);
            localaq.d();
          }
        }
      }
      return;
      bool2 = f();
      if (!bool2) {
        break;
      }
      bool2 = m.b(paramh);
      c = bool2;
      break;
      label867:
      i2 = i5 + 1;
      i5 = i2;
      break label269;
      label880:
      i2 = 0;
      localObject4 = null;
      i12 = 0;
    }
    label895:
    localObject8 = a.e;
    Object localObject4 = ((ListView)localObject8).getAdapter();
    bool3 = localObject4 instanceof HeaderViewListAdapter;
    if (bool3)
    {
      localObject4 = (HeaderViewListAdapter)localObject4;
      i6 = ((HeaderViewListAdapter)localObject4).getHeadersCount();
      localObject4 = (g)((HeaderViewListAdapter)localObject4).getWrappedAdapter();
      localObject3 = localObject4;
      i2 = i6;
      label955:
      i11 = -1;
      i3 = 0;
      localObject5 = null;
      i14 = ((g)localObject3).getCount();
      label971:
      if (i3 >= i14) {
        break label1307;
      }
      localj = ((g)localObject3).a(i3);
      if (localObject6 != localj) {
        break label1036;
      }
    }
    label1036:
    label1106:
    label1152:
    label1178:
    label1192:
    label1200:
    label1217:
    label1245:
    label1307:
    for (int i6 = i3;; i6 = i11)
    {
      i3 = -1;
      if (i6 == i3)
      {
        i2 = 0;
        localObject4 = null;
        break;
        i6 = 0;
        localObject3 = (g)localObject4;
        i2 = 0;
        localObject4 = null;
        break label955;
        i3 += 1;
        break label971;
      }
      i2 += i6;
      i6 = ((ListView)localObject8).getFirstVisiblePosition();
      i2 -= i6;
      if (i2 >= 0)
      {
        i6 = ((ListView)localObject8).getChildCount();
        if (i2 < i6) {}
      }
      else
      {
        i2 = 0;
        localObject4 = null;
        break;
      }
      localObject4 = ((ListView)localObject8).getChildAt(i2);
      break;
      i8 = 0;
      localObject1 = null;
      i2 = 0;
      localObject4 = null;
      i6 = 0;
      localObject3 = null;
      i3 = 0;
      localObject5 = null;
      break label336;
      boolean bool5 = r;
      if (bool5)
      {
        int i9 = t;
        g = i9;
      }
      boolean bool6 = s;
      if (bool6)
      {
        int i10 = u;
        localaq.a(i10);
      }
      Object localObject2 = e;
      o = ((Rect)localObject2);
      break label696;
    }
  }
  
  private int i()
  {
    int i1 = 1;
    View localView = p;
    int i2 = w.g(localView);
    if (i2 == i1) {
      i1 = 0;
    }
    return i1;
  }
  
  public final void a(int paramInt)
  {
    int i1 = n;
    if (i1 != paramInt)
    {
      n = paramInt;
      View localView = p;
      i1 = w.g(localView);
      i1 = f.a(paramInt, i1);
      o = i1;
    }
  }
  
  public final void a(Parcelable paramParcelable) {}
  
  public final void a(h paramh)
  {
    Object localObject = f;
    paramh.a(this, (Context)localObject);
    boolean bool = f();
    if (bool) {
      c(paramh);
    }
    for (;;)
    {
      return;
      localObject = k;
      ((List)localObject).add(paramh);
    }
  }
  
  public final void a(h paramh, boolean paramBoolean)
  {
    Object localObject1 = b;
    int i1 = ((List)localObject1).size();
    int i2 = 0;
    Object localObject2 = null;
    if (i2 < i1)
    {
      localObject1 = b.get(i2)).b;
      if (paramh == localObject1) {
        label49:
        if (i2 >= 0) {
          break label74;
        }
      }
    }
    for (;;)
    {
      return;
      i2 += 1;
      break;
      int i4 = -1;
      i2 = i4;
      break label49;
      label74:
      i4 = i2 + 1;
      List localList = b;
      i1 = localList.size();
      if (i4 < i1)
      {
        localList = b;
        localObject1 = getb;
        ((h)localObject1).b(false);
      }
      localObject1 = (e.a)b.remove(i2);
      localObject2 = b;
      ((h)localObject2).b(this);
      boolean bool1 = d;
      if (bool1)
      {
        localObject2 = a;
        i1 = Build.VERSION.SDK_INT;
        int i6 = 23;
        if (i1 >= i6)
        {
          localObject2 = q;
          ((PopupWindow)localObject2).setExitTransition(null);
        }
        localObject2 = a.q;
        ((PopupWindow)localObject2).setAnimationStyle(0);
      }
      a.e();
      localObject1 = b;
      int i3 = ((List)localObject1).size();
      if (i3 > 0)
      {
        localObject1 = b;
        i1 = i3 + -1;
        localObject1 = (e.a)((List)localObject1).get(i1);
        i4 = c;
      }
      int i5;
      for (q = i4;; q = i5)
      {
        if (i3 != 0) {
          break label388;
        }
        e();
        localObject1 = x;
        if (localObject1 != null)
        {
          localObject1 = x;
          i3 = 1;
          ((o.a)localObject1).a(paramh, i3);
        }
        localObject1 = y;
        if (localObject1 != null)
        {
          localObject1 = y;
          boolean bool2 = ((ViewTreeObserver)localObject1).isAlive();
          if (bool2)
          {
            localObject1 = y;
            localObject2 = l;
            ((ViewTreeObserver)localObject1).removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject2);
          }
          y = null;
        }
        localObject1 = z;
        ((PopupWindow.OnDismissListener)localObject1).onDismiss();
        break;
        i5 = i();
      }
      label388:
      if (paramBoolean)
      {
        localObject1 = b.get(0)).b;
        ((h)localObject1).b(false);
      }
    }
  }
  
  public final void a(o.a parama)
  {
    x = parama;
  }
  
  public final void a(View paramView)
  {
    View localView1 = p;
    if (localView1 != paramView)
    {
      p = paramView;
      int i1 = n;
      View localView2 = p;
      int i2 = w.g(localView2);
      i1 = f.a(i1, i2);
      o = i1;
    }
  }
  
  public final void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    z = paramOnDismissListener;
  }
  
  public final void a(boolean paramBoolean)
  {
    Object localObject = b;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = a(nexta.e.getAdapter());
      ((g)localObject).notifyDataSetChanged();
    }
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public final boolean a(u paramu)
  {
    boolean bool1 = true;
    Object localObject = b;
    Iterator localIterator = ((List)localObject).iterator();
    h localh;
    do
    {
      bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (e.a)localIterator.next();
      localh = b;
    } while (paramu != localh);
    localObject = a.e;
    ((ListView)localObject).requestFocus();
    boolean bool2 = bool1;
    for (;;)
    {
      return bool2;
      bool2 = paramu.hasVisibleItems();
      if (bool2)
      {
        a(paramu);
        localObject = x;
        if (localObject != null)
        {
          localObject = x;
          ((o.a)localObject).a(paramu);
        }
        bool2 = bool1;
      }
      else
      {
        bool2 = false;
        localObject = null;
      }
    }
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
    boolean bool = f();
    if (bool) {}
    Object localObject2;
    do
    {
      return;
      localObject1 = k;
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (h)((Iterator)localObject2).next();
        c((h)localObject1);
      }
      k.clear();
      localObject1 = p;
      c = ((View)localObject1);
      localObject1 = c;
    } while (localObject1 == null);
    Object localObject1 = y;
    if (localObject1 == null) {
      bool = true;
    }
    for (;;)
    {
      localObject2 = c.getViewTreeObserver();
      y = ((ViewTreeObserver)localObject2);
      if (!bool) {
        break;
      }
      localObject1 = y;
      localObject2 = l;
      ((ViewTreeObserver)localObject1).addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject2);
      break;
      bool = false;
      localObject1 = null;
    }
  }
  
  public final void e()
  {
    Object localObject1 = b;
    int i1 = ((List)localObject1).size();
    if (i1 > 0)
    {
      localObject1 = b;
      Object localObject2 = new e.a[i1];
      localObject1 = (e.a[])((List)localObject1).toArray((Object[])localObject2);
      i1 += -1;
      while (i1 >= 0)
      {
        localObject2 = localObject1[i1];
        PopupWindow localPopupWindow = a.q;
        boolean bool = localPopupWindow.isShowing();
        if (bool)
        {
          localObject2 = a;
          ((aq)localObject2).e();
        }
        i1 += -1;
      }
    }
  }
  
  public final boolean f()
  {
    Object localObject = b;
    int i1 = ((List)localObject).size();
    boolean bool;
    if (i1 > 0)
    {
      localObject = b.get(0)).a.q;
      bool = ((PopupWindow)localObject).isShowing();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public final ListView g()
  {
    Object localObject = b;
    boolean bool = ((List)localObject).isEmpty();
    if (bool) {
      bool = false;
    }
    int i1;
    for (localObject = null;; localObject = geta.e)
    {
      return (ListView)localObject;
      localObject = b;
      List localList = b;
      i1 = localList.size() + -1;
    }
  }
  
  protected final boolean h()
  {
    return false;
  }
  
  public final void onDismiss()
  {
    Object localObject = b;
    int i1 = ((List)localObject).size();
    int i2 = 0;
    if (i2 < i1)
    {
      localObject = (e.a)b.get(i2);
      PopupWindow localPopupWindow = a.q;
      boolean bool = localPopupWindow.isShowing();
      if (bool) {}
    }
    for (;;)
    {
      if (localObject != null)
      {
        localObject = b;
        ((h)localObject).b(false);
      }
      return;
      int i3 = i2 + 1;
      i2 = i3;
      break;
      i3 = 0;
      localObject = null;
    }
  }
  
  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    int i1 = 1;
    int i2 = paramKeyEvent.getAction();
    if (i2 == i1)
    {
      int i3 = 82;
      if (paramInt == i3) {
        e();
      }
    }
    for (;;)
    {
      return i1;
      i1 = 0;
    }
  }
}


/* Location:              android/support/v7/view/menu/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */