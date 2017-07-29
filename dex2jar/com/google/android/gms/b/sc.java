package com.google.android.gms.b;

import android.os.RemoteException;
import com.google.android.gms.ads.d.a;

@qi
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
    if (a == null) {
      return null;
    }
    try
    {
      String str = a.a();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not forward getType to RewardItem", localRemoteException);
    }
    return null;
  }
  
  public final int b()
  {
    if (a == null) {
      return 0;
    }
    try
    {
      int i = a.b();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      ul.c("Could not forward getAmount to RewardItem", localRemoteException);
    }
    return 0;
  }
}


/* Location:              com/google/android/gms/b/sc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */