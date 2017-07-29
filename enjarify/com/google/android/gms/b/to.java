package com.google.android.gms.b;

public abstract class to
  implements tv
{
  private final Runnable a;
  private boolean b;
  volatile Thread k;
  
  public to()
  {
    to.1 local1 = new com/google/android/gms/b/to$1;
    local1.<init>(this);
    a = local1;
    b = false;
  }
  
  public to(byte paramByte)
  {
    to.1 local1 = new com/google/android/gms/b/to$1;
    local1.<init>(this);
    a = local1;
    b = true;
  }
  
  public abstract void a();
  
  public final void b()
  {
    c_();
    Thread localThread = k;
    if (localThread != null)
    {
      localThread = k;
      localThread.interrupt();
    }
  }
  
  public abstract void c_();
}


/* Location:              com/google/android/gms/b/to.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */