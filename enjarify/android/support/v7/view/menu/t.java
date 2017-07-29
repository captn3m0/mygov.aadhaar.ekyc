package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
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
import android.widget.ListAdapter;
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
  private final ViewTreeObserver.OnGlobalLayoutListener k;
  private PopupWindow.OnDismissListener l;
  private View m;
  private o.a n;
  private ViewTreeObserver o;
  private boolean p;
  private boolean q;
  private int r;
  private int s;
  private boolean t;
  
  public t(Context paramContext, h paramh, View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Object localObject1 = new android/support/v7/view/menu/t$1;
    ((t.1)localObject1).<init>(this);
    k = ((ViewTreeObserver.OnGlobalLayoutListener)localObject1);
    s = 0;
    c = paramContext;
    d = paramh;
    g = paramBoolean;
    localObject1 = LayoutInflater.from(paramContext);
    Object localObject2 = new android/support/v7/view/menu/g;
    boolean bool = g;
    ((g)localObject2).<init>(paramh, (LayoutInflater)localObject1, bool);
    f = ((g)localObject2);
    i = paramInt1;
    j = paramInt2;
    localObject1 = paramContext.getResources();
    int i2 = getDisplayMetricswidthPixels / 2;
    int i1 = a.d.abc_config_prefDialogWidth;
    int i3 = ((Resources)localObject1).getDimensionPixelSize(i1);
    i3 = Math.max(i2, i3);
    h = i3;
    m = paramView;
    localObject1 = new android/support/v7/widget/aq;
    localObject2 = c;
    i1 = i;
    int i4 = j;
    ((aq)localObject1).<init>((Context)localObject2, i1, i4);
    a = ((aq)localObject1);
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
    Object localObject = d;
    if (paramh != localObject) {}
    for (;;)
    {
      return;
      e();
      localObject = n;
      if (localObject != null)
      {
        localObject = n;
        ((o.a)localObject).a(paramh, paramBoolean);
      }
    }
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
    g localg = f;
    if (localg != null)
    {
      localg = f;
      localg.notifyDataSetChanged();
    }
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public final boolean a(u paramu)
  {
    boolean bool1 = true;
    boolean bool2 = paramu.hasVisibleItems();
    Object localObject1;
    View localView;
    int i3;
    int i4;
    if (bool2)
    {
      localObject1 = new android/support/v7/view/menu/n;
      Object localObject2 = c;
      localView = b;
      boolean bool3 = g;
      int i1 = i;
      int i2 = j;
      Object localObject3 = paramu;
      ((n)localObject1).<init>((Context)localObject2, paramu, localView, bool3, i1, i2);
      localObject2 = n;
      ((n)localObject1).a((o.a)localObject2);
      boolean bool4 = m.b(paramu);
      ((n)localObject1).a(bool4);
      localObject2 = l;
      c = ((PopupWindow.OnDismissListener)localObject2);
      l = null;
      d.b(false);
      localObject2 = a;
      i3 = g;
      localObject3 = a;
      i4 = ((aq)localObject3).c();
      boolean bool5 = ((n)localObject1).e();
      if (bool5)
      {
        bool2 = bool1;
        if (!bool2) {
          break label227;
        }
        localObject1 = n;
        if (localObject1 != null)
        {
          localObject1 = n;
          ((o.a)localObject1).a(paramu);
        }
        bool2 = bool1;
      }
    }
    for (;;)
    {
      return bool2;
      localView = a;
      if (localView == null)
      {
        bool2 = false;
        localObject1 = null;
        break;
      }
      ((n)localObject1).a(i3, i4, bool1, bool1);
      bool2 = bool1;
      break;
      label227:
      bool2 = false;
      localObject1 = null;
    }
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
    boolean bool1 = true;
    boolean bool2 = f();
    if (bool2) {}
    while (!bool1)
    {
      Object localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("StandardMenuPopup cannot be used without an anchor");
      throw ((Throwable)localObject1);
      bool2 = p;
      if (!bool2)
      {
        localObject1 = m;
        if (localObject1 != null) {}
      }
      else
      {
        bool1 = false;
        continue;
      }
      localObject1 = m;
      b = ((View)localObject1);
      a.a(this);
      a.l = this;
      a.b();
      Object localObject2 = b;
      localObject1 = o;
      if (localObject1 == null) {
        bool2 = bool1;
      }
      for (;;)
      {
        Object localObject3 = ((View)localObject2).getViewTreeObserver();
        o = ((ViewTreeObserver)localObject3);
        if (bool2)
        {
          localObject1 = o;
          localObject3 = k;
          ((ViewTreeObserver)localObject1).addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject3);
        }
        a.k = ((View)localObject2);
        localObject1 = a;
        int i2 = s;
        h = i2;
        bool2 = q;
        if (!bool2)
        {
          localObject1 = f;
          localObject2 = c;
          int i3 = h;
          int i1 = a((ListAdapter)localObject1, null, (Context)localObject2, i3);
          r = i1;
          q = bool1;
        }
        localObject1 = a;
        i2 = r;
        ((aq)localObject1).b(i2);
        a.h();
        localObject1 = a;
        localObject2 = e;
        o = ((Rect)localObject2);
        a.d();
        localObject1 = a;
        localObject3 = e;
        ((ListView)localObject3).setOnKeyListener(this);
        boolean bool3 = t;
        if (bool3)
        {
          localObject1 = d.f;
          if (localObject1 != null)
          {
            localObject1 = LayoutInflater.from(c);
            i2 = a.g.abc_popup_menu_header_item_layout;
            localObject1 = (FrameLayout)((LayoutInflater)localObject1).inflate(i2, (ViewGroup)localObject3, false);
            i2 = 16908310;
            localObject2 = (TextView)((FrameLayout)localObject1).findViewById(i2);
            if (localObject2 != null)
            {
              CharSequence localCharSequence = d.f;
              ((TextView)localObject2).setText(localCharSequence);
            }
            ((FrameLayout)localObject1).setEnabled(false);
            ((ListView)localObject3).addHeaderView((View)localObject1, null, false);
          }
        }
        localObject1 = a;
        localObject2 = f;
        ((aq)localObject1).a((ListAdapter)localObject2);
        localObject1 = a;
        ((aq)localObject1).d();
        break;
        bool3 = false;
        localObject1 = null;
      }
    }
  }
  
  public final void e()
  {
    boolean bool = f();
    if (bool)
    {
      aq localaq = a;
      localaq.e();
    }
  }
  
  public final boolean f()
  {
    boolean bool = p;
    PopupWindow localPopupWindow;
    if (!bool)
    {
      localPopupWindow = a.q;
      bool = localPopupWindow.isShowing();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localPopupWindow = null;
    }
  }
  
  public final ListView g()
  {
    return a.e;
  }
  
  public final void onDismiss()
  {
    boolean bool = true;
    p = bool;
    d.close();
    Object localObject = o;
    if (localObject != null)
    {
      localObject = o;
      bool = ((ViewTreeObserver)localObject).isAlive();
      if (!bool)
      {
        localObject = b.getViewTreeObserver();
        o = ((ViewTreeObserver)localObject);
      }
      localObject = o;
      ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = k;
      ((ViewTreeObserver)localObject).removeGlobalOnLayoutListener(localOnGlobalLayoutListener);
      bool = false;
      localObject = null;
      o = null;
    }
    localObject = l;
    if (localObject != null)
    {
      localObject = l;
      ((PopupWindow.OnDismissListener)localObject).onDismiss();
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


/* Location:              android/support/v7/view/menu/t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */