package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.KeyEvent;

public final class g
{
  static final c a = new a();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new b();
      return;
    }
  }
  
  public static boolean a(KeyEvent paramKeyEvent)
  {
    return a.a(paramKeyEvent);
  }
  
  static class a
    implements g.c
  {
    public boolean a(KeyEvent paramKeyEvent)
    {
      return false;
    }
  }
  
  static final class b
    extends g.a
  {
    public final boolean a(KeyEvent paramKeyEvent)
    {
      return paramKeyEvent.isCtrlPressed();
    }
  }
  
  static abstract interface c
  {
    public abstract boolean a(KeyEvent paramKeyEvent);
  }
}


/* Location:              android/support/v4/h/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */