package com.google.android.gms.b;

import android.os.IBinder;
import android.os.Parcel;

final class iz$a$a
  implements iz
{
  private IBinder a;
  
  iz$a$a(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final void a(String paramString1, String paramString2)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.ads.internal.client.IAppEventListener";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject1);
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      localObject1 = a;
      int i = 1;
      ((IBinder)localObject1).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
}


/* Location:              com/google/android/gms/b/iz$a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */