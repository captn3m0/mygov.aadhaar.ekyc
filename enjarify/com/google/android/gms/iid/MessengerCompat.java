package com.google.android.gms.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class MessengerCompat
  implements ReflectedParcelable
{
  public static final Parcelable.Creator CREATOR;
  public Messenger a;
  public a b;
  
  static
  {
    MessengerCompat.1 local1 = new com/google/android/gms/iid/MessengerCompat$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public MessengerCompat(IBinder paramIBinder)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/os/Messenger;
      ((Messenger)localObject).<init>(paramIBinder);
      a = ((Messenger)localObject);
    }
    for (;;)
    {
      return;
      localObject = a.a.a(paramIBinder);
      b = ((a)localObject);
    }
  }
  
  private IBinder a()
  {
    Object localObject = a;
    if (localObject != null) {}
    for (localObject = a.getBinder();; localObject = b.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    if (paramObject == null) {}
    for (;;)
    {
      return bool;
      try
      {
        IBinder localIBinder1 = a();
        paramObject = (MessengerCompat)paramObject;
        IBinder localIBinder2 = ((MessengerCompat)paramObject).a();
        bool = localIBinder1.equals(localIBinder2);
      }
      catch (ClassCastException localClassCastException) {}
    }
  }
  
  public int hashCode()
  {
    return a().hashCode();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = a;
    if (localObject != null)
    {
      localObject = a.getBinder();
      paramParcel.writeStrongBinder((IBinder)localObject);
    }
    for (;;)
    {
      return;
      localObject = b.asBinder();
      paramParcel.writeStrongBinder((IBinder)localObject);
    }
  }
}


/* Location:              com/google/android/gms/iid/MessengerCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */