package android.support.v4.c.a;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;

public final class a
{
  private static final a a = new b();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 17)
    {
      a = new d();
      return;
    }
    if (i >= 13)
    {
      a = new c();
      return;
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
  
  private static abstract interface a
  {
    public abstract int a(Resources paramResources);
    
    public abstract int b(Resources paramResources);
    
    public abstract int c(Resources paramResources);
  }
  
  private static class b
    implements a.a
  {
    public int a(Resources paramResources)
    {
      return b.a(paramResources);
    }
    
    public int b(Resources paramResources)
    {
      return b.b(paramResources);
    }
    
    public int c(Resources paramResources)
    {
      return Math.min(b.b(paramResources), b.a(paramResources));
    }
  }
  
  private static class c
    extends a.b
  {
    public final int a(Resources paramResources)
    {
      return getConfigurationscreenHeightDp;
    }
    
    public final int b(Resources paramResources)
    {
      return getConfigurationscreenWidthDp;
    }
    
    public final int c(Resources paramResources)
    {
      return getConfigurationsmallestScreenWidthDp;
    }
  }
  
  private static final class d
    extends a.c
  {}
}


/* Location:              android/support/v4/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */