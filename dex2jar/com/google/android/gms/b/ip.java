package com.google.android.gms.b;

@qi
public final class ip
{
  private static final Object a = new Object();
  private static ip b;
  private final uk c = new uk();
  private final io d = new io(new ig(), new if(), new jm(), new lu(), new sd(), new pn(), new pa());
  
  static
  {
    ip localip = new ip();
    synchronized (a)
    {
      b = localip;
      return;
    }
  }
  
  public static uk a()
  {
    return cc;
  }
  
  public static io b()
  {
    return cd;
  }
  
  private static ip c()
  {
    synchronized (a)
    {
      ip localip = b;
      return localip;
    }
  }
}


/* Location:              com/google/android/gms/b/ip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */