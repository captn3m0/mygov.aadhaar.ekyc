package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.h.w;
import android.support.v7.view.menu.f;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.c;
import android.support.v7.widget.ae;
import android.support.v7.widget.bg;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window.Callback;
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
  private ArrayList g;
  private final Runnable h;
  private final Toolbar.c i;
  
  public q(Toolbar paramToolbar, CharSequence paramCharSequence, Window.Callback paramCallback)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    g = ((ArrayList)localObject);
    localObject = new android/support/v7/app/q$1;
    ((q.1)localObject).<init>(this);
    h = ((Runnable)localObject);
    localObject = new android/support/v7/app/q$2;
    ((q.2)localObject).<init>(this);
    i = ((Toolbar.c)localObject);
    localObject = new android/support/v7/widget/bg;
    ((bg)localObject).<init>(paramToolbar, false);
    a = ((ae)localObject);
    localObject = new android/support/v7/app/q$d;
    ((q.d)localObject).<init>(this, paramCallback);
    c = ((Window.Callback)localObject);
    localObject = a;
    Window.Callback localCallback = c;
    ((ae)localObject).a(localCallback);
    localObject = i;
    paramToolbar.setOnMenuItemClickListener((Toolbar.c)localObject);
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
    int j = 1;
    Menu localMenu = h();
    int k;
    KeyCharacterMap localKeyCharacterMap;
    if (localMenu != null)
    {
      if (paramKeyEvent == null) {
        break label68;
      }
      k = paramKeyEvent.getDeviceId();
      localKeyCharacterMap = KeyCharacterMap.load(k);
      k = localKeyCharacterMap.getKeyboardType();
      if (k == j) {
        break label74;
      }
      k = j;
    }
    for (;;)
    {
      localMenu.setQwertyMode(k);
      localMenu.performShortcut(paramInt, paramKeyEvent, 0);
      return j;
      label68:
      int m = -1;
      break;
      label74:
      m = 0;
      localKeyCharacterMap = null;
    }
  }
  
  public final void b(boolean paramBoolean) {}
  
  public final boolean b()
  {
    ae localae = a;
    int j = localae.q();
    if (j == 0) {
      j = 1;
    }
    for (;;)
    {
      return j;
      int k = 0;
      localae = null;
    }
  }
  
  public final Context c()
  {
    return a.b();
  }
  
  public final void c(boolean paramBoolean)
  {
    boolean bool1 = f;
    if (paramBoolean == bool1) {}
    for (;;)
    {
      return;
      f = paramBoolean;
      boolean bool2 = g.size();
      bool1 = false;
      while (bool1 < bool2)
      {
        ArrayList localArrayList = g;
        localArrayList.get(bool1);
        int j;
        bool1 += true;
      }
    }
  }
  
  public final boolean d()
  {
    ViewGroup localViewGroup = a.a();
    Runnable localRunnable = h;
    localViewGroup.removeCallbacks(localRunnable);
    localViewGroup = a.a();
    localRunnable = h;
    w.a(localViewGroup, localRunnable);
    return true;
  }
  
  public final boolean e()
  {
    ae localae = a;
    boolean bool = localae.c();
    if (bool)
    {
      localae = a;
      localae.d();
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localae = null;
    }
  }
  
  public final boolean f()
  {
    ViewGroup localViewGroup = a.a();
    boolean bool2;
    if (localViewGroup != null)
    {
      boolean bool1 = localViewGroup.hasFocus();
      if (!bool1)
      {
        localViewGroup.requestFocus();
        bool2 = true;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localViewGroup = null;
    }
  }
  
  final void g()
  {
    ViewGroup localViewGroup = a.a();
    Runnable localRunnable = h;
    localViewGroup.removeCallbacks(localRunnable);
  }
  
  final Menu h()
  {
    boolean bool = e;
    if (!bool)
    {
      ae localae = a;
      q.a locala = new android/support/v7/app/q$a;
      locala.<init>(this);
      q.b localb = new android/support/v7/app/q$b;
      localb.<init>(this);
      localae.a(locala, localb);
      bool = true;
      e = bool;
    }
    return a.r();
  }
}


/* Location:              android/support/v7/app/q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */