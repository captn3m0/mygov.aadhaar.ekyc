package com.google.android.gms.b;

import android.os.RemoteException;

abstract class io$a
{
  io$a(io paramio) {}
  
  protected abstract Object a();
  
  protected abstract Object a(ja paramja);
  
  protected final Object b()
  {
    Object localObject1 = null;
    Object localObject2 = io.a(f);
    if (localObject2 == null)
    {
      localObject2 = "ClientApi class cannot be loaded.";
      ul.e((String)localObject2);
    }
    for (;;)
    {
      return localObject1;
      try
      {
        localObject1 = a((ja)localObject2);
      }
      catch (RemoteException localRemoteException)
      {
        String str = "Cannot invoke local loader using ClientApi class";
        ul.c(str, localRemoteException);
      }
    }
  }
  
  protected final Object c()
  {
    try
    {
      localObject1 = a();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        String str = "Cannot invoke remote loader";
        ul.c(str, localRemoteException);
        Object localObject2 = null;
      }
    }
    return localObject1;
  }
}


/* Location:              com/google/android/gms/b/io$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */