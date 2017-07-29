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
    long l;
    if (paramz != null) {
      l = Binder.clearCallingIdentity();
    }
    try
    {
      localAccount = paramz.a();
      return localAccount;
    }
    catch (RemoteException paramz)
    {
      Log.w("AccountAccessor", "Remote account accessor probably died");
      return null;
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
  }
  
  public final Account a()
  {
    int i = Binder.getCallingUid();
    if (i == a) {
      return null;
    }
    if (o.b(i))
    {
      a = i;
      return null;
    }
    throw new SecurityException("Caller is not GooglePlayServices");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    throw new NullPointerException();
  }
}


/* Location:              com/google/android/gms/common/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */