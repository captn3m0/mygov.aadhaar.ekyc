package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

public final class l
{
  static final a a = new b();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new c();
      return;
    }
  }
  
  public static int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return a.a(paramMarginLayoutParams);
  }
  
  public static int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return a.b(paramMarginLayoutParams);
  }
  
  static abstract interface a
  {
    public abstract int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams);
    
    public abstract int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams);
  }
  
  static final class b
    implements l.a
  {
    public final int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      return leftMargin;
    }
    
    public final int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      return rightMargin;
    }
  }
  
  static final class c
    implements l.a
  {
    public final int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      return paramMarginLayoutParams.getMarginStart();
    }
    
    public final int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      return paramMarginLayoutParams.getMarginEnd();
    }
  }
}


/* Location:              android/support/v4/h/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */