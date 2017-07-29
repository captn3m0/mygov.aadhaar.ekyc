package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.o;

public final class a
  extends z.a
{
  int a;
  
  public static Account a(z paramz)
  {
    Account localAccount = null;
    if (paramz != null) {
      l = Binder.clearCallingIdentity();
    }
    try
    {
      localAccount = paramz.a();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str1 = "AccountAccessor";
        String str2 = "Remote account accessor probably died";
        Log.w(str1, str2);
        Binder.restoreCallingIdentity(l);
      }
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
    return localAccount;
  }
  
  public final Account a()
  {
    int i = Binder.getCallingUid();
    int j = a;
    if (i == j) {}
    for (;;)
    {
      return null;
      boolean bool = o.b(i);
      if (!bool) {
        break;
      }
      a = i;
    }
    SecurityException localSecurityException = new java/lang/SecurityException;
    localSecurityException.<init>("Caller is not GooglePlayServices");
    throw localSecurityException;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (this == paramObject) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = paramObject instanceof a;
      if (!bool) {
        bool = false;
      } else {
        bool = null.equals(null);
      }
    }
  }
}


/* Location:              com/google/android/gms/common/internal/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */