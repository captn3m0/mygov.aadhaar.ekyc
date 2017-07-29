package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class lr$a
  extends Binder
  implements lr
{
  public lr$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool2 = bool1)
      {
        return bool2;
        localObject = "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener";
    paramParcel1.enforceInterface((String)localObject);
    IBinder localIBinder = paramParcel1.readStrongBinder();
    if (localIBinder == null)
    {
      bool2 = false;
      localObject = null;
    }
    for (;;)
    {
      a((ln)localObject);
      paramParcel2.writeNoException();
      bool2 = bool1;
      break;
      localObject = localIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
      if (localObject != null)
      {
        boolean bool3 = localObject instanceof ln;
        if (bool3)
        {
          localObject = (ln)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/ln$a$a;
      ((ln.a.a)localObject).<init>(localIBinder);
    }
  }
}


/* Location:              com/google/android/gms/b/lr$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */