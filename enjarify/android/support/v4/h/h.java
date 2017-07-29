package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.LayoutInflater;

public final class h
{
  static final h.a a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/h/h$d;
      ((h.d)localObject).<init>();
      a = (h.a)localObject;
    }
    for (;;)
    {
      return;
      j = 11;
      if (i >= j)
      {
        localObject = new android/support/v4/h/h$c;
        ((h.c)localObject).<init>();
        a = (h.a)localObject;
      }
      else
      {
        localObject = new android/support/v4/h/h$b;
        ((h.b)localObject).<init>();
        a = (h.a)localObject;
      }
    }
  }
  
  public static k a(LayoutInflater paramLayoutInflater)
  {
    return a.a(paramLayoutInflater);
  }
  
  public static void a(LayoutInflater paramLayoutInflater, k paramk)
  {
    a.a(paramLayoutInflater, paramk);
  }
}


/* Location:              android/support/v4/h/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */