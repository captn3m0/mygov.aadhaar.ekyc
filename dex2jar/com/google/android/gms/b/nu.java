package com.google.android.gms.b;

@qi
public final class nu
  extends oe.a
{
  final Object a = new Object();
  nw.a b;
  private nt c;
  
  public final void a()
  {
    synchronized (a)
    {
      if (c != null) {
        c.y();
      }
      return;
    }
  }
  
  public final void a(int paramInt)
  {
    for (;;)
    {
      synchronized (a)
      {
        if (b != null)
        {
          if (paramInt == 3)
          {
            paramInt = 1;
            b.a(paramInt);
            b = null;
          }
        }
        else {
          return;
        }
      }
      paramInt = 2;
    }
  }
  
  public final void a(nt paramnt)
  {
    synchronized (a)
    {
      c = paramnt;
      return;
    }
  }
  
  public final void a(of paramof)
  {
    synchronized (a)
    {
      if (b != null)
      {
        b.a(paramof);
        b = null;
        return;
      }
      if (c != null) {
        c.C();
      }
      return;
    }
  }
  
  public final void b()
  {
    synchronized (a)
    {
      if (c != null) {
        c.z();
      }
      return;
    }
  }
  
  public final void c()
  {
    synchronized (a)
    {
      if (c != null) {
        c.A();
      }
      return;
    }
  }
  
  public final void d()
  {
    synchronized (a)
    {
      if (c != null) {
        c.B();
      }
      return;
    }
  }
  
  public final void e()
  {
    synchronized (a)
    {
      if (b != null)
      {
        b.a(0);
        b = null;
        return;
      }
      if (c != null) {
        c.C();
      }
      return;
    }
  }
  
  public final void f()
  {
    synchronized (a)
    {
      if (c != null) {
        c.D();
      }
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/nu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */