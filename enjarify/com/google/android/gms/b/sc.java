package com.google.android.gms.b;

import android.os.RemoteException;
import com.google.android.gms.ads.d.a;

public final class sc
  implements a
{
  private final ry a;
  
  public sc(ry paramry)
  {
    a = paramry;
  }
  
  public final String a()
  {
    String str1 = null;
    ry localry = a;
    if (localry == null) {}
    for (;;)
    {
      return str1;
      try
      {
        localry = a;
        str1 = localry.a();
      }
      catch (RemoteException localRemoteException)
      {
        String str2 = "Could not forward getType to RewardItem";
        ul.c(str2, localRemoteException);
      }
    }
  }
  
  public final int b()
  {
    int i = 0;
    ry localry = a;
    if (localry == null) {}
    for (;;)
    {
      return i;
      try
      {
        localry = a;
        i = localry.b();
      }
      catch (RemoteException localRemoteException)
      {
        String str = "Could not forward getAmount to RewardItem";
        ul.c(str, localRemoteException);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/sc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */