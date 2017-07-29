package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.v4.h.w;
import android.support.v7.a.a.a;
import android.support.v7.a.a.g;
import android.support.v7.a.a.i;
import android.support.v7.view.i;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.o.a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.c;
import android.support.v7.widget.ae;
import android.support.v7.widget.bg;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;
import android.widget.ListAdapter;
import java.util.ArrayList;

final class q
  extends a
{
  ae a;
  boolean b;
  Window.Callback c;
  f d;
  private boolean e;
  private boolean f;
  private ArrayList<Object> g = new ArrayList();
  private final Runnable h = new Runnable()
  {
    public final void run()
    {
      q localq = q.this;
      Menu localMenu = localq.h();
      if ((localMenu instanceof h)) {}
      for (localh = (h)localMenu;; localh = null)
      {
        if (localh != null) {
          localh.d();
        }
        try
        {
          localMenu.clear();
          if ((!c.onCreatePanelMenu(0, localMenu)) || (!c.onPreparePanel(0, null, localMenu))) {
            localMenu.clear();
          }
          return;
        }
        finally
        {
          if (localh == null) {
            break;
          }
          localh.e();
        }
      }
    }
  };
  private final Toolbar.c i = new Toolbar.c()
  {
    public final boolean a(MenuItem paramAnonymousMenuItem)
    {
      return c.onMenuItemSelected(0, paramAnonymousMenuItem);
    }
  };
  
  public q(Toolbar paramToolbar, CharSequence paramCharSequence, Window.Callback paramCallback)
  {
    a = new bg(paramToolbar, false);
    c = new d(paramCallback);
    a.a(c);
    paramToolbar.setOnMenuItemClickListener(i);
    a.a(paramCharSequence);
  }
  
  public final int a()
  {
    return a.o();
  }
  
  public final void a(int paramInt)
  {
    a.d(paramInt);
  }
  
  public final void a(Configuration paramConfiguration)
  {
    super.a(paramConfiguration);
  }
  
  public final void a(Drawable paramDrawable)
  {
    a.b(paramDrawable);
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    a.a(paramCharSequence);
  }
  
  public final void a(boolean paramBoolean) {}
  
  public final boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    Menu localMenu = h();
    int j;
    if (localMenu != null)
    {
      if (paramKeyEvent == null) {
        break label56;
      }
      j = paramKeyEvent.getDeviceId();
      if (KeyCharacterMap.load(j).getKeyboardType() == 1) {
        break label61;
      }
    }
    label56:
    label61:
    for (boolean bool = true;; bool = false)
    {
      localMenu.setQwertyMode(bool);
      localMenu.performShortcut(paramInt, paramKeyEvent, 0);
      return true;
      j = -1;
      break;
    }
  }
  
  public final void b(boolean paramBoolean) {}
  
  public final boolean b()
  {
    return a.q() == 0;
  }
  
  public final Context c()
  {
    return a.b();
  }
  
  public final void c(boolean paramBoolean)
  {
    if (paramBoolean == f) {}
    for (;;)
    {
      return;
      f = paramBoolean;
      int k = g.size();
      int j = 0;
      while (j < k)
      {
        g.get(j);
        j += 1;
      }
    }
  }
  
  public final boolean d()
  {
    a.a().removeCallbacks(h);
    w.a(a.a(), h);
    return true;
  }
  
  public final boolean e()
  {
    if (a.c())
    {
      a.d();
      return true;
    }
    return false;
  }
  
  public final boolean f()
  {
    ViewGroup localViewGroup = a.a();
    if ((localViewGroup != null) && (!localViewGroup.hasFocus()))
    {
      localViewGroup.requestFocus();
      return true;
    }
    return false;
  }
  
  final void g()
  {
    a.a().removeCallbacks(h);
  }
  
  final Menu h()
  {
    if (!e)
    {
      a.a(new a(), new b());
      e = true;
    }
    return a.r();
  }
  
  private final class a
    implements o.a
  {
    private boolean b;
    
    a() {}
    
    public final void a(h paramh, boolean paramBoolean)
    {
      if (b) {
        return;
      }
      b = true;
      a.n();
      if (c != null) {
        c.onPanelClosed(108, paramh);
      }
      b = false;
    }
    
    public final boolean a(h paramh)
    {
      if (c != null)
      {
        c.onMenuOpened(108, paramh);
        return true;
      }
      return false;
    }
  }
  
  private final class b
    implements h.a
  {
    b() {}
    
    public final void a(h paramh)
    {
      if (c != null)
      {
        if (!a.i()) {
          break label41;
        }
        c.onPanelClosed(108, paramh);
      }
      label41:
      while (!c.onPreparePanel(0, null, paramh)) {
        return;
      }
      c.onMenuOpened(108, paramh);
    }
    
    public final boolean a(h paramh, MenuItem paramMenuItem)
    {
      return false;
    }
  }
  
  private final class c
    implements o.a
  {
    c() {}
    
    public final void a(h paramh, boolean paramBoolean)
    {
      if (c != null) {
        c.onPanelClosed(0, paramh);
      }
    }
    
    public final boolean a(h paramh)
    {
      if ((paramh == null) && (c != null)) {
        c.onMenuOpened(0, paramh);
      }
      return true;
    }
  }
  
  private final class d
    extends i
  {
    public d(Window.Callback paramCallback)
    {
      super();
    }
    
    public final View onCreatePanelView(int paramInt)
    {
      switch (paramInt)
      {
      }
      Menu localMenu;
      do
      {
        return super.onCreatePanelView(paramInt);
        localMenu = a.r();
      } while ((!onPreparePanel(paramInt, null, localMenu)) || (!onMenuOpened(paramInt, localMenu)));
      q localq = q.this;
      h localh;
      Object localObject;
      Resources.Theme localTheme;
      if ((d == null) && ((localMenu instanceof h)))
      {
        localh = (h)localMenu;
        localObject = a.b();
        TypedValue localTypedValue = new TypedValue();
        localTheme = ((Context)localObject).getResources().newTheme();
        localTheme.setTo(((Context)localObject).getTheme());
        localTheme.resolveAttribute(a.a.actionBarPopupTheme, localTypedValue, true);
        if (resourceId != 0) {
          localTheme.applyStyle(resourceId, true);
        }
        localTheme.resolveAttribute(a.a.panelMenuListTheme, localTypedValue, true);
        if (resourceId == 0) {
          break label260;
        }
        localTheme.applyStyle(resourceId, true);
      }
      for (;;)
      {
        localObject = new ContextThemeWrapper((Context)localObject, 0);
        ((Context)localObject).getTheme().setTo(localTheme);
        d = new f((Context)localObject, a.g.abc_list_menu_item_layout);
        d.h = new q.c(localq);
        localh.a(d);
        if ((localMenu != null) && (d != null)) {
          break;
        }
        return null;
        label260:
        localTheme.applyStyle(a.i.Theme_AppCompat_CompactMenu, true);
      }
      if (d.d().getCount() > 0) {
        return (View)d.a(a.a());
      }
      return null;
    }
    
    public final boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
    {
      boolean bool = super.onPreparePanel(paramInt, paramView, paramMenu);
      if ((bool) && (!b))
      {
        a.m();
        b = true;
      }
      return bool;
    }
  }
}


/* Location:              android/support/v7/app/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */