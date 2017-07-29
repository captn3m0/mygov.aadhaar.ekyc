package com.google.android.gms.b;

public final class nu
  extends oe.a
{
  final Object a;
  nw.a b;
  private nt c;
  
  public nu()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  public final void a()
  {
    synchronized (a)
    {
      nt localnt = c;
      if (localnt != null)
      {
        localnt = c;
        localnt.y();
      }
      return;
    }
  }
  
  public final void a(int paramInt)
  {
    synchronized (a)
    {
      nw.a locala1 = b;
      if (locala1 != null)
      {
        i = 3;
        if (paramInt == i)
        {
          i = 1;
          nw.a locala2 = b;
          locala2.a(i);
          i = 0;
          locala1 = null;
          b = null;
        }
      }
      else
      {
        return;
      }
      int i = 2;
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
      Object localObject2 = b;
      if (localObject2 != null)
      {
        localObject2 = b;
        ((nw.a)localObject2).a(paramof);
        localObject2 = null;
        b = null;
        return;
      }
      localObject2 = c;
      if (localObject2 != null)
      {
        localObject2 = c;
        ((nt)localObject2).C();
      }
    }
  }
  
  public final void b()
  {
    synchronized (a)
    {
      nt localnt = c;
      if (localnt != null)
      {
        localnt = c;
        localnt.z();
      }
      return;
    }
  }
  
  public final void c()
  {
    synchronized (a)
    {
      nt localnt = c;
      if (localnt != null)
      {
        localnt = c;
        localnt.A();
      }
      return;
    }
  }
  
  public final void d()
  {
    synchronized (a)
    {
      nt localnt = c;
      if (localnt != null)
      {
        localnt = c;
        localnt.B();
      }
      return;
    }
  }
  
  public final void e()
  {
    synchronized (a)
    {
      Object localObject2 = b;
      if (localObject2 != null)
      {
        localObject2 = b;
        ((nw.a)localObject2).a(0);
        localObject2 = null;
        b = null;
        return;
      }
      localObject2 = c;
      if (localObject2 != null)
      {
        localObject2 = c;
        ((nt)localObject2).C();
      }
    }
  }
  
  public final void f()
  {
    synchronized (a)
    {
      nt localnt = c;
      if (localnt != null)
      {
        localnt = c;
        localnt.D();
      }
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/nu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */