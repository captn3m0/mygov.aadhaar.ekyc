package android.support.v7.app;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.a.a.a;
import android.support.v7.view.i;
import android.support.v7.widget.bf;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;

@TargetApi(9)
abstract class h
  extends g
{
  private static boolean p;
  private static final boolean q;
  private static final int[] r;
  final Context b;
  final Window c;
  final Window.Callback d;
  final Window.Callback e;
  final f f;
  a g;
  MenuInflater h;
  boolean i;
  boolean j;
  boolean k;
  boolean l;
  boolean m;
  CharSequence n;
  boolean o;
  private boolean s;
  
  static
  {
    if (Build.VERSION.SDK_INT < 21) {}
    for (boolean bool = true;; bool = false)
    {
      q = bool;
      if ((bool) && (!p))
      {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler()
        {
          public final void uncaughtException(Thread paramAnonymousThread, Throwable paramAnonymousThrowable)
          {
            int j = 0;
            int i = j;
            Object localObject;
            if ((paramAnonymousThrowable instanceof Resources.NotFoundException))
            {
              localObject = paramAnonymousThrowable.getMessage();
              i = j;
              if (localObject != null) {
                if (!((String)localObject).contains("drawable"))
                {
                  i = j;
                  if (!((String)localObject).contains("Drawable")) {}
                }
                else
                {
                  i = 1;
                }
              }
            }
            if (i != 0)
            {
              localObject = new Resources.NotFoundException(paramAnonymousThrowable.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
              ((Throwable)localObject).initCause(paramAnonymousThrowable.getCause());
              ((Throwable)localObject).setStackTrace(paramAnonymousThrowable.getStackTrace());
              a.uncaughtException(paramAnonymousThread, (Throwable)localObject);
              return;
            }
            a.uncaughtException(paramAnonymousThread, paramAnonymousThrowable);
          }
        });
        p = true;
      }
      r = new int[] { 16842836 };
      return;
    }
  }
  
  h(Context paramContext, Window paramWindow, f paramf)
  {
    b = paramContext;
    c = paramWindow;
    f = paramf;
    d = c.getCallback();
    if ((d instanceof b)) {
      throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }
    e = a(d);
    c.setCallback(e);
    paramContext = bf.a(paramContext, null, r);
    paramWindow = paramContext.b(0);
    if (paramWindow != null) {
      c.setBackgroundDrawable(paramWindow);
    }
    a.recycle();
  }
  
  public final a a()
  {
    m();
    return g;
  }
  
  Window.Callback a(Window.Callback paramCallback)
  {
    return new b(paramCallback);
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    n = paramCharSequence;
    b(paramCharSequence);
  }
  
  abstract boolean a(int paramInt, KeyEvent paramKeyEvent);
  
  abstract boolean a(KeyEvent paramKeyEvent);
  
  public final MenuInflater b()
  {
    if (h == null)
    {
      m();
      if (g == null) {
        break label43;
      }
    }
    label43:
    for (Context localContext = g.c();; localContext = b)
    {
      h = new android.support.v7.view.g(localContext);
      return h;
    }
  }
  
  public void b(Bundle paramBundle) {}
  
  abstract void b(CharSequence paramCharSequence);
  
  public void d()
  {
    s = true;
  }
  
  abstract void d(int paramInt);
  
  public void e()
  {
    s = false;
  }
  
  abstract boolean e(int paramInt);
  
  public void h()
  {
    o = true;
  }
  
  public final b.a i()
  {
    return new a();
  }
  
  public boolean k()
  {
    return false;
  }
  
  abstract void m();
  
  final Context n()
  {
    Context localContext = null;
    Object localObject = a();
    if (localObject != null) {
      localContext = ((a)localObject).c();
    }
    localObject = localContext;
    if (localContext == null) {
      localObject = b;
    }
    return (Context)localObject;
  }
  
  private final class a
    implements b.a
  {
    a() {}
    
    public final Drawable a()
    {
      bf localbf = bf.a(n(), null, new int[] { a.a.homeAsUpIndicator });
      Drawable localDrawable = localbf.a(0);
      a.recycle();
      return localDrawable;
    }
    
    public final void a(int paramInt)
    {
      a locala = a();
      if (locala != null) {
        locala.a(paramInt);
      }
    }
    
    public final void a(Drawable paramDrawable, int paramInt)
    {
      a locala = a();
      if (locala != null)
      {
        locala.a(paramDrawable);
        locala.a(paramInt);
      }
    }
    
    public final Context b()
    {
      return n();
    }
    
    public final boolean c()
    {
      a locala = a();
      return (locala != null) && ((locala.a() & 0x4) != 0);
    }
  }
  
  class b
    extends i
  {
    b(Window.Callback paramCallback)
    {
      super();
    }
    
    public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      return (a(paramKeyEvent)) || (super.dispatchKeyEvent(paramKeyEvent));
    }
    
    public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
    {
      return (super.dispatchKeyShortcutEvent(paramKeyEvent)) || (a(paramKeyEvent.getKeyCode(), paramKeyEvent));
    }
    
    public void onContentChanged() {}
    
    public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
    {
      if ((paramInt == 0) && (!(paramMenu instanceof android.support.v7.view.menu.h))) {
        return false;
      }
      return super.onCreatePanelMenu(paramInt, paramMenu);
    }
    
    public boolean onMenuOpened(int paramInt, Menu paramMenu)
    {
      super.onMenuOpened(paramInt, paramMenu);
      e(paramInt);
      return true;
    }
    
    public void onPanelClosed(int paramInt, Menu paramMenu)
    {
      super.onPanelClosed(paramInt, paramMenu);
      d(paramInt);
    }
    
    public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
    {
      android.support.v7.view.menu.h localh;
      boolean bool1;
      if ((paramMenu instanceof android.support.v7.view.menu.h))
      {
        localh = (android.support.v7.view.menu.h)paramMenu;
        if ((paramInt != 0) || (localh != null)) {
          break label34;
        }
        bool1 = false;
      }
      label34:
      boolean bool2;
      do
      {
        return bool1;
        localh = null;
        break;
        if (localh != null) {
          l = true;
        }
        bool2 = super.onPreparePanel(paramInt, paramView, paramMenu);
        bool1 = bool2;
      } while (localh == null);
      l = false;
      return bool2;
    }
  }
}


/* Location:              android/support/v7/app/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */