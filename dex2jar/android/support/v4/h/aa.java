package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class aa
{
  static final d a = new a();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new c();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new b();
      return;
    }
  }
  
  public static boolean a(ViewConfiguration paramViewConfiguration)
  {
    return a.a(paramViewConfiguration);
  }
  
  static class a
    implements aa.d
  {
    public boolean a(ViewConfiguration paramViewConfiguration)
    {
      return true;
    }
  }
  
  static class b
    extends aa.a
  {
    public boolean a(ViewConfiguration paramViewConfiguration)
    {
      return false;
    }
  }
  
  static final class c
    extends aa.b
  {
    public final boolean a(ViewConfiguration paramViewConfiguration)
    {
      return paramViewConfiguration.hasPermanentMenuKey();
    }
  }
  
  static abstract interface d
  {
    public abstract boolean a(ViewConfiguration paramViewConfiguration);
  }
}


/* Location:              android/support/v4/h/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */