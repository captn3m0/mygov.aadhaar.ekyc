package com.google.android.gms.b;

import com.google.android.gms.ads.a;

@qi
public class ir
  extends a
{
  final Object a = new Object();
  a b;
  
  public void a()
  {
    synchronized (a)
    {
      if (b != null) {
        b.a();
      }
      return;
    }
  }
  
  public void a(int paramInt)
  {
    synchronized (a)
    {
      if (b != null) {
        b.a(paramInt);
      }
      return;
    }
  }
  
  public final void b()
  {
    synchronized (a)
    {
      if (b != null) {
        b.b();
      }
      return;
    }
  }
  
  public final void c()
  {
    synchronized (a)
    {
      if (b != null) {
        b.c();
      }
      return;
    }
  }
  
  public final void d()
  {
    synchronized (a)
    {
      if (b != null) {
        b.d();
      }
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/ir.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */