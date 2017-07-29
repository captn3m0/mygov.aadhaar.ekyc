package android.support.v4.b;

import android.os.Build.VERSION;
import android.os.Bundle;

public final class ak
  extends am.a
{
  public static final am.a.a a;
  private static final a g;
  private final String b;
  private final CharSequence c;
  private final CharSequence[] d;
  private final boolean e;
  private final Bundle f;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 20) {
      g = new b();
    }
    for (;;)
    {
      a = new am.a.a() {};
      return;
      if (Build.VERSION.SDK_INT >= 16) {
        g = new d();
      } else {
        g = new c();
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
  
  static abstract interface a {}
  
  static final class b
    implements ak.a
  {}
  
  static final class c
    implements ak.a
  {}
  
  static final class d
    implements ak.a
  {}
}


/* Location:              android/support/v4/b/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */