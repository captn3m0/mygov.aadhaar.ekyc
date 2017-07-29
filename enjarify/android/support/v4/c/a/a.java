package android.support.v4.c.a;

import android.content.res.Resources;
import android.os.Build.VERSION;

public final class a
{
  private static final a.a a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/c/a/a$d;
      ((a.d)localObject).<init>();
      a = (a.a)localObject;
    }
    for (;;)
    {
      return;
      j = 13;
      if (i >= j)
      {
        localObject = new android/support/v4/c/a/a$c;
        ((a.c)localObject).<init>();
        a = (a.a)localObject;
      }
      else
      {
        localObject = new android/support/v4/c/a/a$b;
        ((a.b)localObject).<init>();
        a = (a.a)localObject;
      }
    }
  }
  
  public static int a(Resources paramResources)
  {
    return a.a(paramResources);
  }
  
  public static int b(Resources paramResources)
  {
    return a.b(paramResources);
  }
  
  public static int c(Resources paramResources)
  {
    return a.c(paramResources);
  }
}


/* Location:              android/support/v4/c/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */