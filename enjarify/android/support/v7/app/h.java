package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.bf;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.Window;
import android.view.Window.Callback;

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
    int i1 = 1;
    int i2 = Build.VERSION.SDK_INT;
    int i3 = 21;
    if (i2 < i3) {
      i2 = i1;
    }
    for (;;)
    {
      q = i2;
      if (i2 != 0)
      {
        bool = p;
        if (!bool)
        {
          localObject = Thread.getDefaultUncaughtExceptionHandler();
          h.1 local1 = new android/support/v7/app/h$1;
          local1.<init>((Thread.UncaughtExceptionHandler)localObject);
          Thread.setDefaultUncaughtExceptionHandler(local1);
          p = i1;
        }
      }
      Object localObject = new int[i1];
      localObject[0] = 16842836;
      r = (int[])localObject;
      return;
      boolean bool = false;
      localObject = null;
    }
  }
  
  h(Context paramContext, Window paramWindow, f paramf)
  {
    b = paramContext;
    c = paramWindow;
    f = paramf;
    Object localObject1 = c.getCallback();
    d = ((Window.Callback)localObject1);
    localObject1 = d;
    boolean bool = localObject1 instanceof h.b;
    if (bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("AppCompat has already installed itself into the Window");
      throw ((Throwable)localObject1);
    }
    localObject1 = d;
    localObject1 = a((Window.Callback)localObject1);
    e = ((Window.Callback)localObject1);
    localObject1 = c;
    Object localObject2 = e;
    ((Window)localObject1).setCallback((Window.Callback)localObject2);
    bool = false;
    localObject2 = r;
    localObject1 = bf.a(paramContext, null, (int[])localObject2);
    localObject2 = ((bf)localObject1).b(0);
    if (localObject2 != null)
    {
      Window localWindow = c;
      localWindow.setBackgroundDrawable((Drawable)localObject2);
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
    h.b localb = new android/support/v7/app/h$b;
    localb.<init>(this, paramCallback);
    return localb;
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
    Object localObject = h;
    android.support.v7.view.g localg;
    if (localObject == null)
    {
      m();
      localg = new android/support/v7/view/g;
      localObject = g;
      if (localObject == null) {
        break label49;
      }
    }
    label49:
    for (localObject = g.c();; localObject = b)
    {
      localg.<init>((Context)localObject);
      h = localg;
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
    h.a locala = new android/support/v7/app/h$a;
    locala.<init>(this);
    return locala;
  }
  
  public boolean k()
  {
    return false;
  }
  
  abstract void m();
  
  final Context n()
  {
    Context localContext = null;
    a locala = a();
    if (locala != null) {
      localContext = locala.c();
    }
    if (localContext == null) {
      localContext = b;
    }
    return localContext;
  }
}


/* Location:              android/support/v7/app/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */