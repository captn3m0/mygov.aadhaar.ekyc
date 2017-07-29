package com.google.android.gms.b;

import java.util.concurrent.Future;

@qi
public abstract class to
  implements tv<Future>
{
  private final Runnable a = new Runnable()
  {
    public final void run()
    {
      k = Thread.currentThread();
      a();
    }
  };
  private boolean b;
  volatile Thread k;
  
  public to()
  {
    b = false;
  }
  
  public to(byte paramByte)
  {
    b = true;
  }
  
  public abstract void a();
  
  public final void b()
  {
    c_();
    if (k != null) {
      k.interrupt();
    }
  }
  
  public abstract void c_();
}


/* Location:              com/google/android/gms/b/to.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */