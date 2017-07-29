package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.h.ai;
import android.support.v4.h.w;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.a.a.j;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.o;
import android.support.v7.view.menu.o.a;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import android.widget.TextView;

public final class bg
  implements ae
{
  Toolbar a;
  CharSequence b;
  Window.Callback c;
  boolean d;
  private int e;
  private View f;
  private View g;
  private Drawable h;
  private Drawable i;
  private Drawable j;
  private boolean k;
  private CharSequence l;
  private CharSequence m;
  private d n;
  private int o = 0;
  private int p = 0;
  private Drawable q;
  
  public bg(Toolbar paramToolbar, boolean paramBoolean)
  {
    this(paramToolbar, paramBoolean, i1);
  }
  
  private bg(Toolbar paramToolbar, boolean paramBoolean, int paramInt)
  {
    a = paramToolbar;
    Object localObject1 = paramToolbar.getTitle();
    b = ((CharSequence)localObject1);
    localObject1 = paramToolbar.getSubtitle();
    l = ((CharSequence)localObject1);
    localObject1 = b;
    bf localbf;
    int i3;
    Object localObject3;
    if (localObject1 != null)
    {
      boolean bool2 = bool1;
      k = bool2;
      localObject1 = paramToolbar.getNavigationIcon();
      j = ((Drawable)localObject1);
      localObject1 = paramToolbar.getContext();
      Object localObject2 = a.j.ActionBar;
      int i5 = a.a.actionBarStyle;
      localbf = bf.a((Context)localObject1, null, (int[])localObject2, i5, 0);
      i3 = a.j.ActionBar_homeAsUpIndicator;
      localObject1 = localbf.a(i3);
      q = ((Drawable)localObject1);
      if (!paramBoolean) {
        break label908;
      }
      i3 = a.j.ActionBar_title;
      localObject1 = localbf.c(i3);
      boolean bool4 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool4)
      {
        k = bool1;
        b((CharSequence)localObject1);
      }
      i3 = a.j.ActionBar_subtitle;
      localObject1 = localbf.c(i3);
      bool1 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool1)
      {
        l = ((CharSequence)localObject1);
        i1 = e & 0x8;
        if (i1 != 0)
        {
          localObject3 = a;
          ((Toolbar)localObject3).setSubtitle((CharSequence)localObject1);
        }
      }
      i3 = a.j.ActionBar_logo;
      localObject1 = localbf.a(i3);
      if (localObject1 != null) {
        c((Drawable)localObject1);
      }
      i3 = a.j.ActionBar_icon;
      localObject1 = localbf.a(i3);
      if (localObject1 != null) {
        a((Drawable)localObject1);
      }
      localObject1 = j;
      if (localObject1 == null)
      {
        localObject1 = q;
        if (localObject1 != null)
        {
          localObject1 = q;
          b((Drawable)localObject1);
        }
      }
      i3 = a.j.ActionBar_displayOptions;
      i3 = localbf.a(i3, 0);
      c(i3);
      i3 = a.j.ActionBar_customNavigationLayout;
      i3 = localbf.g(i3, 0);
      if (i3 != 0)
      {
        localObject3 = LayoutInflater.from(a.getContext());
        localObject2 = a;
        localObject1 = ((LayoutInflater)localObject3).inflate(i3, (ViewGroup)localObject2, false);
        localObject3 = g;
        if (localObject3 != null)
        {
          i1 = e & 0x10;
          if (i1 != 0)
          {
            localObject3 = a;
            localObject2 = g;
            ((Toolbar)localObject3).removeView((View)localObject2);
          }
        }
        g = ((View)localObject1);
        if (localObject1 != null)
        {
          i3 = e & 0x10;
          if (i3 != 0)
          {
            localObject1 = a;
            localObject3 = g;
            ((Toolbar)localObject1).addView((View)localObject3);
          }
        }
        i3 = e | 0x10;
        c(i3);
      }
      i3 = a.j.ActionBar_height;
      i3 = localbf.f(i3, 0);
      if (i3 > 0)
      {
        localObject3 = a.getLayoutParams();
        height = i3;
        localObject1 = a;
        ((Toolbar)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject3);
      }
      i3 = a.j.ActionBar_contentInsetStart;
      i3 = localbf.d(i3, i2);
      int i1 = a.j.ActionBar_contentInsetEnd;
      i1 = localbf.d(i1, i2);
      if ((i3 >= 0) || (i1 >= 0))
      {
        localObject2 = a;
        i3 = Math.max(i3, 0);
        i1 = Math.max(i1, 0);
        ((Toolbar)localObject2).f();
        localObject2 = m;
        ((aw)localObject2).a(i3, i1);
      }
      i3 = a.j.ActionBar_titleTextStyle;
      i3 = localbf.g(i3, 0);
      TextView localTextView;
      if (i3 != 0)
      {
        localObject3 = a;
        localObject2 = a.getContext();
        j = i3;
        localTextView = b;
        if (localTextView != null)
        {
          localObject3 = b;
          ((TextView)localObject3).setTextAppearance((Context)localObject2, i3);
        }
      }
      i3 = a.j.ActionBar_subtitleTextStyle;
      i3 = localbf.g(i3, 0);
      if (i3 != 0)
      {
        localObject3 = a;
        localObject2 = a.getContext();
        k = i3;
        localTextView = c;
        if (localTextView != null)
        {
          localObject3 = c;
          ((TextView)localObject3).setTextAppearance((Context)localObject2, i3);
        }
      }
      i3 = a.j.ActionBar_popupTheme;
      i3 = localbf.g(i3, 0);
      if (i3 != 0)
      {
        localObject3 = a;
        ((Toolbar)localObject3).setPopupTheme(i3);
      }
    }
    for (;;)
    {
      localObject1 = a;
      ((TypedArray)localObject1).recycle();
      i3 = p;
      if (paramInt != i3)
      {
        p = paramInt;
        localObject1 = a.getNavigationContentDescription();
        boolean bool3 = TextUtils.isEmpty((CharSequence)localObject1);
        if (bool3)
        {
          i4 = p;
          d(i4);
        }
      }
      localObject1 = a.getNavigationContentDescription();
      m = ((CharSequence)localObject1);
      localObject1 = a;
      localObject3 = new android/support/v7/widget/bg$1;
      ((bg.1)localObject3).<init>(this);
      ((Toolbar)localObject1).setNavigationOnClickListener((View.OnClickListener)localObject3);
      return;
      int i4 = 0;
      localObject1 = null;
      break;
      label908:
      i4 = 11;
      localObject3 = a.getNavigationIcon();
      if (localObject3 != null)
      {
        i4 = 15;
        localObject3 = a.getNavigationIcon();
        q = ((Drawable)localObject3);
      }
      e = i4;
    }
  }
  
  private void b(CharSequence paramCharSequence)
  {
    b = paramCharSequence;
    int i1 = e & 0x8;
    if (i1 != 0)
    {
      Toolbar localToolbar = a;
      localToolbar.setTitle(paramCharSequence);
    }
  }
  
  private void c(Drawable paramDrawable)
  {
    i = paramDrawable;
    s();
  }
  
  private void s()
  {
    int i1 = 0;
    Drawable localDrawable = null;
    int i2 = e & 0x2;
    if (i2 != 0)
    {
      i1 = e & 0x1;
      if (i1 == 0) {
        break label57;
      }
      localDrawable = i;
      if (localDrawable == null) {
        break label49;
      }
      localDrawable = i;
    }
    for (;;)
    {
      a.setLogo(localDrawable);
      return;
      label49:
      localDrawable = h;
      continue;
      label57:
      localDrawable = h;
    }
  }
  
  private void t()
  {
    int i1 = e & 0x4;
    Toolbar localToolbar;
    Object localObject;
    if (i1 != 0)
    {
      localToolbar = a;
      localObject = j;
      if (localObject != null)
      {
        localObject = j;
        localToolbar.setNavigationIcon((Drawable)localObject);
      }
    }
    for (;;)
    {
      return;
      localObject = q;
      break;
      localObject = a;
      localToolbar = null;
      ((Toolbar)localObject).setNavigationIcon(null);
    }
  }
  
  private void u()
  {
    int i1 = e & 0x4;
    Object localObject;
    if (i1 != 0)
    {
      localObject = m;
      boolean bool = TextUtils.isEmpty((CharSequence)localObject);
      if (!bool) {
        break label41;
      }
      localObject = a;
      int i2 = p;
      ((Toolbar)localObject).setNavigationContentDescription(i2);
    }
    for (;;)
    {
      return;
      label41:
      localObject = a;
      CharSequence localCharSequence = m;
      ((Toolbar)localObject).setNavigationContentDescription(localCharSequence);
    }
  }
  
  public final android.support.v4.h.ae a(int paramInt, long paramLong)
  {
    Object localObject1 = a;
    Object localObject2 = w.s((View)localObject1);
    float f1;
    if (paramInt == 0) {
      f1 = 1.0F;
    }
    for (;;)
    {
      localObject1 = ((android.support.v4.h.ae)localObject2).a(f1).a(paramLong);
      localObject2 = new android/support/v7/widget/bg$2;
      ((bg.2)localObject2).<init>(this, paramInt);
      return ((android.support.v4.h.ae)localObject1).a((ai)localObject2);
      f1 = 0.0F;
      localObject1 = null;
    }
  }
  
  public final ViewGroup a()
  {
    return a;
  }
  
  public final void a(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = android.support.v7.b.a.b.b(a.getContext(), paramInt);; localDrawable = null)
    {
      a(localDrawable);
      return;
    }
  }
  
  public final void a(Drawable paramDrawable)
  {
    h = paramDrawable;
    s();
  }
  
  public final void a(o.a parama, h.a parama1)
  {
    Object localObject = a;
    r = parama;
    s = parama1;
    ActionMenuView localActionMenuView = a;
    if (localActionMenuView != null)
    {
      localObject = a;
      ((ActionMenuView)localObject).a(parama, parama1);
    }
  }
  
  public final void a(ay paramay)
  {
    int i1 = -2;
    Object localObject1 = f;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = f.getParent();
      localObject2 = a;
      if (localObject1 == localObject2)
      {
        localObject1 = a;
        localObject2 = f;
        ((Toolbar)localObject1).removeView((View)localObject2);
      }
    }
    f = paramay;
    if (paramay != null)
    {
      int i2 = o;
      int i3 = 2;
      if (i2 == i3)
      {
        localObject1 = a;
        localObject2 = f;
        ((Toolbar)localObject1).addView((View)localObject2, 0);
        localObject1 = (Toolbar.b)f.getLayoutParams();
        width = i1;
        height = i1;
        int i4 = 8388691;
        a = i4;
        i2 = 1;
        paramay.setAllowCollapse(i2);
      }
    }
  }
  
  public final void a(Menu paramMenu, o.a parama)
  {
    boolean bool = true;
    Object localObject1 = n;
    if (localObject1 == null)
    {
      localObject1 = new android/support/v7/widget/d;
      localObject2 = a.getContext();
      ((d)localObject1).<init>((Context)localObject2);
      n = ((d)localObject1);
      localObject1 = n;
      int i1 = a.f.action_menu_presenter;
      h = i1;
    }
    n.f = parama;
    localObject1 = a;
    paramMenu = (h)paramMenu;
    Object localObject2 = n;
    Object localObject3;
    Object localObject4;
    if (paramMenu == null)
    {
      localObject3 = a;
      if (localObject3 == null) {}
    }
    else
    {
      ((Toolbar)localObject1).d();
      localObject3 = a.a;
      if (localObject3 != paramMenu)
      {
        if (localObject3 != null)
        {
          localObject4 = p;
          ((h)localObject3).b((o)localObject4);
          localObject4 = q;
          ((h)localObject3).b((o)localObject4);
        }
        localObject3 = q;
        if (localObject3 == null)
        {
          localObject3 = new android/support/v7/widget/Toolbar$a;
          ((Toolbar.a)localObject3).<init>((Toolbar)localObject1);
          q = ((Toolbar.a)localObject3);
        }
        l = bool;
        if (paramMenu == null) {
          break label274;
        }
        localObject3 = h;
        paramMenu.a((o)localObject2, (Context)localObject3);
        localObject3 = q;
        localObject4 = h;
        paramMenu.a((o)localObject3, (Context)localObject4);
      }
    }
    for (;;)
    {
      localObject3 = a;
      int i2 = i;
      ((ActionMenuView)localObject3).setPopupTheme(i2);
      localObject3 = a;
      ((ActionMenuView)localObject3).setPresenter((d)localObject2);
      p = ((d)localObject2);
      return;
      label274:
      localObject3 = h;
      ((d)localObject2).a((Context)localObject3, null);
      localObject3 = q;
      localObject4 = h;
      ((Toolbar.a)localObject3).a((Context)localObject4, null);
      ((d)localObject2).a(bool);
      localObject3 = q;
      ((Toolbar.a)localObject3).a(bool);
    }
  }
  
  public final void a(Window.Callback paramCallback)
  {
    c = paramCallback;
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    boolean bool = k;
    if (!bool) {
      b(paramCharSequence);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    a.setCollapsible(paramBoolean);
  }
  
  public final Context b()
  {
    return a.getContext();
  }
  
  public final void b(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = android.support.v7.b.a.b.b(a.getContext(), paramInt);; localDrawable = null)
    {
      c(localDrawable);
      return;
    }
  }
  
  public final void b(Drawable paramDrawable)
  {
    j = paramDrawable;
    t();
  }
  
  public final void c(int paramInt)
  {
    CharSequence localCharSequence = null;
    int i1 = e ^ paramInt;
    e = paramInt;
    Object localObject1;
    Object localObject2;
    if (i1 != 0)
    {
      int i2 = i1 & 0x4;
      if (i2 != 0)
      {
        i2 = paramInt & 0x4;
        if (i2 != 0) {
          u();
        }
        t();
      }
      i2 = i1 & 0x3;
      if (i2 != 0) {
        s();
      }
      i2 = i1 & 0x8;
      if (i2 != 0)
      {
        i2 = paramInt & 0x8;
        if (i2 == 0) {
          break label165;
        }
        localObject1 = a;
        localCharSequence = b;
        ((Toolbar)localObject1).setTitle(localCharSequence);
        localObject1 = a;
        localCharSequence = l;
        ((Toolbar)localObject1).setSubtitle(localCharSequence);
      }
      i1 &= 0x10;
      if (i1 != 0)
      {
        localObject2 = g;
        if (localObject2 != null)
        {
          i1 = paramInt & 0x10;
          if (i1 == 0) {
            break label188;
          }
          localObject2 = a;
          localObject1 = g;
          ((Toolbar)localObject2).addView((View)localObject1);
        }
      }
    }
    for (;;)
    {
      return;
      label165:
      a.setTitle(null);
      localObject1 = a;
      ((Toolbar)localObject1).setSubtitle(null);
      break;
      label188:
      localObject2 = a;
      localObject1 = g;
      ((Toolbar)localObject2).removeView((View)localObject1);
    }
  }
  
  public final boolean c()
  {
    Object localObject = a;
    Toolbar.a locala = q;
    boolean bool;
    if (locala != null)
    {
      localObject = q.b;
      if (localObject != null) {
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
  
  public final void d()
  {
    a.c();
  }
  
  public final void d(int paramInt)
  {
    if (paramInt == 0) {}
    for (String str = null;; str = a.getContext().getString(paramInt))
    {
      m = str;
      u();
      return;
    }
  }
  
  public final CharSequence e()
  {
    return a.getTitle();
  }
  
  public final void e(int paramInt)
  {
    a.setVisibility(paramInt);
  }
  
  public final void f()
  {
    Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
  }
  
  public final void g()
  {
    Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
  }
  
  public final boolean h()
  {
    Object localObject = a;
    int i1 = ((Toolbar)localObject).getVisibility();
    boolean bool;
    if (i1 == 0)
    {
      ActionMenuView localActionMenuView = a;
      if (localActionMenuView != null)
      {
        localObject = a;
        bool = b;
        if (bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public final boolean i()
  {
    return a.a();
  }
  
  public final boolean j()
  {
    boolean bool1 = true;
    Object localObject1 = a;
    Object localObject2 = a;
    boolean bool2;
    if (localObject2 != null)
    {
      localObject1 = a;
      localObject2 = c;
      if (localObject2 != null)
      {
        localObject1 = c;
        localObject2 = o;
        if (localObject2 == null)
        {
          bool2 = ((d)localObject1).j();
          if (!bool2) {}
        }
        else
        {
          bool2 = bool1;
          if (!bool2) {
            break label81;
          }
          bool2 = bool1;
          label66:
          if (!bool2) {
            break label89;
          }
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool2 = false;
      localObject1 = null;
      break;
      label81:
      bool2 = false;
      localObject1 = null;
      break label66;
      label89:
      bool1 = false;
    }
  }
  
  public final boolean k()
  {
    return a.b();
  }
  
  public final boolean l()
  {
    boolean bool1 = true;
    Object localObject1 = a;
    Object localObject2 = a;
    boolean bool2;
    if (localObject2 != null)
    {
      localObject1 = a;
      localObject2 = c;
      if (localObject2 != null)
      {
        localObject1 = c;
        bool2 = ((d)localObject1).g();
        if (bool2)
        {
          bool2 = bool1;
          if (!bool2) {
            break label64;
          }
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool2 = false;
      localObject1 = null;
      break;
      label64:
      bool1 = false;
    }
  }
  
  public final void m()
  {
    d = true;
  }
  
  public final void n()
  {
    Object localObject = a;
    ActionMenuView localActionMenuView = a;
    if (localActionMenuView != null)
    {
      localObject = a;
      ((ActionMenuView)localObject).b();
    }
  }
  
  public final int o()
  {
    return e;
  }
  
  public final int p()
  {
    return o;
  }
  
  public final int q()
  {
    return a.getVisibility();
  }
  
  public final Menu r()
  {
    return a.getMenu();
  }
}


/* Location:              android/support/v7/widget/bg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */