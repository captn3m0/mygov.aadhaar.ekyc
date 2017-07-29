package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.h.aj;
import android.support.v4.h.w;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.a.a.h;
import android.support.v7.a.a.j;
import android.support.v7.b.a.b;
import android.support.v7.view.menu.a;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
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
    this(paramToolbar, paramBoolean, a.h.abc_action_bar_up_description);
  }
  
  private bg(Toolbar paramToolbar, boolean paramBoolean, int paramInt)
  {
    a = paramToolbar;
    b = paramToolbar.getTitle();
    l = paramToolbar.getSubtitle();
    boolean bool;
    int i1;
    if (b != null)
    {
      bool = true;
      k = bool;
      j = paramToolbar.getNavigationIcon();
      paramToolbar = bf.a(paramToolbar.getContext(), null, a.j.ActionBar, a.a.actionBarStyle, 0);
      q = paramToolbar.a(a.j.ActionBar_homeAsUpIndicator);
      if (!paramBoolean) {
        break label663;
      }
      Object localObject = paramToolbar.c(a.j.ActionBar_title);
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        k = true;
        b((CharSequence)localObject);
      }
      localObject = paramToolbar.c(a.j.ActionBar_subtitle);
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        l = ((CharSequence)localObject);
        if ((e & 0x8) != 0) {
          a.setSubtitle((CharSequence)localObject);
        }
      }
      localObject = paramToolbar.a(a.j.ActionBar_logo);
      if (localObject != null) {
        c((Drawable)localObject);
      }
      localObject = paramToolbar.a(a.j.ActionBar_icon);
      if (localObject != null) {
        a((Drawable)localObject);
      }
      if ((j == null) && (q != null)) {
        b(q);
      }
      c(paramToolbar.a(a.j.ActionBar_displayOptions, 0));
      i1 = paramToolbar.g(a.j.ActionBar_customNavigationLayout, 0);
      if (i1 != 0)
      {
        localObject = LayoutInflater.from(a.getContext()).inflate(i1, a, false);
        if ((g != null) && ((e & 0x10) != 0)) {
          a.removeView(g);
        }
        g = ((View)localObject);
        if ((localObject != null) && ((e & 0x10) != 0)) {
          a.addView(g);
        }
        c(e | 0x10);
      }
      i1 = paramToolbar.f(a.j.ActionBar_height, 0);
      if (i1 > 0)
      {
        localObject = a.getLayoutParams();
        height = i1;
        a.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      int i2 = paramToolbar.d(a.j.ActionBar_contentInsetStart, -1);
      i1 = paramToolbar.d(a.j.ActionBar_contentInsetEnd, -1);
      if ((i2 >= 0) || (i1 >= 0))
      {
        localObject = a;
        i2 = Math.max(i2, 0);
        i1 = Math.max(i1, 0);
        ((Toolbar)localObject).f();
        m.a(i2, i1);
      }
      i1 = paramToolbar.g(a.j.ActionBar_titleTextStyle, 0);
      Context localContext;
      if (i1 != 0)
      {
        localObject = a;
        localContext = a.getContext();
        j = i1;
        if (b != null) {
          b.setTextAppearance(localContext, i1);
        }
      }
      i1 = paramToolbar.g(a.j.ActionBar_subtitleTextStyle, 0);
      if (i1 != 0)
      {
        localObject = a;
        localContext = a.getContext();
        k = i1;
        if (c != null) {
          c.setTextAppearance(localContext, i1);
        }
      }
      i1 = paramToolbar.g(a.j.ActionBar_popupTheme, 0);
      if (i1 != 0) {
        a.setPopupTheme(i1);
      }
    }
    for (;;)
    {
      a.recycle();
      if (paramInt != p)
      {
        p = paramInt;
        if (TextUtils.isEmpty(a.getNavigationContentDescription())) {
          d(p);
        }
      }
      m = a.getNavigationContentDescription();
      a.setNavigationOnClickListener(new View.OnClickListener()
      {
        final a a = new a(a.getContext(), b);
        
        public final void onClick(View paramAnonymousView)
        {
          if ((c != null) && (d)) {
            c.onMenuItemSelected(0, a);
          }
        }
      });
      return;
      bool = false;
      break;
      label663:
      i1 = 11;
      if (a.getNavigationIcon() != null)
      {
        i1 = 15;
        q = a.getNavigationIcon();
      }
      e = i1;
    }
  }
  
  private void b(CharSequence paramCharSequence)
  {
    b = paramCharSequence;
    if ((e & 0x8) != 0) {
      a.setTitle(paramCharSequence);
    }
  }
  
  private void c(Drawable paramDrawable)
  {
    i = paramDrawable;
    s();
  }
  
  private void s()
  {
    Drawable localDrawable = null;
    if ((e & 0x2) != 0)
    {
      if ((e & 0x1) == 0) {
        break label49;
      }
      if (i == null) {
        break label41;
      }
      localDrawable = i;
    }
    for (;;)
    {
      a.setLogo(localDrawable);
      return;
      label41:
      localDrawable = h;
      continue;
      label49:
      localDrawable = h;
    }
  }
  
  private void t()
  {
    if ((e & 0x4) != 0)
    {
      Toolbar localToolbar = a;
      if (j != null) {}
      for (Drawable localDrawable = j;; localDrawable = q)
      {
        localToolbar.setNavigationIcon(localDrawable);
        return;
      }
    }
    a.setNavigationIcon(null);
  }
  
  private void u()
  {
    if ((e & 0x4) != 0)
    {
      if (TextUtils.isEmpty(m)) {
        a.setNavigationContentDescription(p);
      }
    }
    else {
      return;
    }
    a.setNavigationContentDescription(m);
  }
  
  public final android.support.v4.h.ae a(final int paramInt, long paramLong)
  {
    android.support.v4.h.ae localae = w.s(a);
    if (paramInt == 0) {}
    for (float f1 = 1.0F;; f1 = 0.0F) {
      localae.a(f1).a(paramLong).a(new aj()
      {
        private boolean c = false;
        
        public final void a(View paramAnonymousView)
        {
          a.setVisibility(0);
        }
        
        public final void b(View paramAnonymousView)
        {
          if (!c) {
            a.setVisibility(paramInt);
          }
        }
        
        public final void c(View paramAnonymousView)
        {
          c = true;
        }
      });
    }
  }
  
  public final ViewGroup a()
  {
    return a;
  }
  
  public final void a(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = b.b(a.getContext(), paramInt);; localDrawable = null)
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
    Toolbar localToolbar = a;
    r = parama;
    s = parama1;
    if (a != null) {
      a.a(parama, parama1);
    }
  }
  
  public final void a(ay paramay)
  {
    if ((f != null) && (f.getParent() == a)) {
      a.removeView(f);
    }
    f = paramay;
    if ((paramay != null) && (o == 2))
    {
      a.addView(f, 0);
      Toolbar.b localb = (Toolbar.b)f.getLayoutParams();
      width = -2;
      height = -2;
      a = 8388691;
      paramay.setAllowCollapse(true);
    }
  }
  
  public final void a(Menu paramMenu, o.a parama)
  {
    if (n == null)
    {
      n = new d(a.getContext());
      n.h = a.f.action_menu_presenter;
    }
    n.f = parama;
    parama = a;
    paramMenu = (h)paramMenu;
    d locald = n;
    if ((paramMenu != null) || (a != null))
    {
      parama.d();
      h localh = a.a;
      if (localh != paramMenu)
      {
        if (localh != null)
        {
          localh.b(p);
          localh.b(q);
        }
        if (q == null) {
          q = new Toolbar.a(parama);
        }
        l = true;
        if (paramMenu == null) {
          break label185;
        }
        paramMenu.a(locald, h);
        paramMenu.a(q, h);
      }
    }
    for (;;)
    {
      a.setPopupTheme(i);
      a.setPresenter(locald);
      p = locald;
      return;
      label185:
      locald.a(h, null);
      q.a(h, null);
      locald.a(true);
      q.a(true);
    }
  }
  
  public final void a(Window.Callback paramCallback)
  {
    c = paramCallback;
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    if (!k) {
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
    for (Drawable localDrawable = b.b(a.getContext(), paramInt);; localDrawable = null)
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
    int i1 = e ^ paramInt;
    e = paramInt;
    if (i1 != 0)
    {
      if ((i1 & 0x4) != 0)
      {
        if ((paramInt & 0x4) != 0) {
          u();
        }
        t();
      }
      if ((i1 & 0x3) != 0) {
        s();
      }
      if ((i1 & 0x8) != 0)
      {
        if ((paramInt & 0x8) == 0) {
          break label115;
        }
        a.setTitle(b);
        a.setSubtitle(l);
      }
    }
    for (;;)
    {
      if (((i1 & 0x10) != 0) && (g != null))
      {
        if ((paramInt & 0x10) == 0) {
          break;
        }
        a.addView(g);
      }
      return;
      label115:
      a.setTitle(null);
      a.setSubtitle(null);
    }
    a.removeView(g);
  }
  
  public final boolean c()
  {
    Toolbar localToolbar = a;
    return (q != null) && (q.b != null);
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
    Toolbar localToolbar = a;
    return (localToolbar.getVisibility() == 0) && (a != null) && (a.b);
  }
  
  public final boolean i()
  {
    return a.a();
  }
  
  public final boolean j()
  {
    Object localObject = a;
    if (a != null)
    {
      localObject = a;
      if (c != null)
      {
        localObject = c;
        if ((o != null) || (((d)localObject).j()))
        {
          i1 = 1;
          if (i1 == 0) {
            break label62;
          }
        }
      }
      label62:
      for (int i1 = 1;; i1 = 0)
      {
        if (i1 == 0) {
          break label67;
        }
        return true;
        i1 = 0;
        break;
      }
    }
    label67:
    return false;
  }
  
  public final boolean k()
  {
    return a.b();
  }
  
  public final boolean l()
  {
    Object localObject = a;
    if (a != null)
    {
      localObject = a;
      if ((c != null) && (c.g())) {}
      for (int i1 = 1; i1 != 0; i1 = 0) {
        return true;
      }
    }
    return false;
  }
  
  public final void m()
  {
    d = true;
  }
  
  public final void n()
  {
    Toolbar localToolbar = a;
    if (a != null) {
      a.b();
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */