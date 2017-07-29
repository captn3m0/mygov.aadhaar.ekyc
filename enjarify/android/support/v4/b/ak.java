package android.support.v4.b;

import android.os.Build.VERSION;
import android.os.Bundle;

public final class ak
  extends am.a
{
  public static final am.a.a a;
  private static final ak.a g;
  private final String b;
  private final CharSequence c;
  private final CharSequence[] d;
  private final boolean e;
  private final Bundle f;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 20;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/b/ak$b;
      ((ak.b)localObject).<init>();
      g = (ak.a)localObject;
    }
    for (;;)
    {
      localObject = new android/support/v4/b/ak$1;
      ((ak.1)localObject).<init>();
      a = (am.a.a)localObject;
      return;
      i = Build.VERSION.SDK_INT;
      j = 16;
      if (i >= j)
      {
        localObject = new android/support/v4/b/ak$d;
        ((ak.d)localObject).<init>();
        g = (ak.a)localObject;
      }
      else
      {
        localObject = new android/support/v4/b/ak$c;
        ((ak.c)localObject).<init>();
        g = (ak.a)localObject;
      }
    }
  }
  
  public final String a()
  {
    return b;
  }
  
  public final CharSequence b()
  {
    return c;
  }
  
  public final CharSequence[] c()
  {
    return d;
  }
  
  public final boolean d()
  {
    return e;
  }
  
  public final Bundle e()
  {
    return f;
  }
}


/* Location:              android/support/v4/b/ak.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */