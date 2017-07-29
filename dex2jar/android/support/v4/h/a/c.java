package android.support.v4.h.a;

import android.os.Build.VERSION;
import java.util.List;

public final class c
{
  private static final a b = new d();
  public final Object a;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      b = new c();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      b = new b();
      return;
    }
  }
  
  public c()
  {
    a = b.a(this);
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
  
  public static List<b> c()
  {
    return null;
  }
  
  public static b d()
  {
    return null;
  }
  
  static abstract interface a
  {
    public abstract Object a(c paramc);
  }
  
  private static final class b
    extends c.d
  {
    public final Object a(final c paramc)
    {
      new d.1(new d.a()
      {
        public final boolean a()
        {
          return c.b();
        }
        
        public final List<Object> b()
        {
          c.c();
          return null;
        }
        
        public final Object c()
        {
          c.a();
          return null;
        }
      });
    }
  }
  
  private static final class c
    extends c.d
  {
    public final Object a(final c paramc)
    {
      new e.1(new e.a()
      {
        public final boolean a()
        {
          return c.b();
        }
        
        public final List<Object> b()
        {
          c.c();
          return null;
        }
        
        public final Object c()
        {
          c.a();
          return null;
        }
        
        public final Object d()
        {
          c.d();
          return null;
        }
      });
    }
  }
  
  static class d
    implements c.a
  {
    public Object a(c paramc)
    {
      return null;
    }
  }
}


/* Location:              android/support/v4/h/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */