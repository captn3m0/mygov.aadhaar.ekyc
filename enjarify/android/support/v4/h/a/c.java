package android.support.v4.h.a;

import android.os.Build.VERSION;
import java.util.List;

public final class c
{
  private static final c.a b;
  public final Object a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/h/a/c$c;
      ((c.c)localObject).<init>();
      b = (c.a)localObject;
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 16;
      if (i >= j)
      {
        localObject = new android/support/v4/h/a/c$b;
        ((c.b)localObject).<init>();
        b = (c.a)localObject;
      }
      else
      {
        localObject = new android/support/v4/h/a/c$d;
        ((c.d)localObject).<init>();
        b = (c.a)localObject;
      }
    }
  }
  
  public c()
  {
    Object localObject = b.a(this);
    a = localObject;
  }
  
  public c(Object paramObject)
  {
    a = paramObject;
  }
  
  public static b a()
  {
    return null;
  }
  
  public static boolean b()
  {
    return false;
  }
  
  public static List c()
  {
    return null;
  }
  
  public static b d()
  {
    return null;
  }
}


/* Location:              android/support/v4/h/a/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */