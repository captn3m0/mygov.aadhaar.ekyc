package com.google.android.gms.b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;
import java.util.List;

public abstract class oh$a
  extends Binder
  implements oh
{
  public oh$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
  }
  
  public static oh a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (oh)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      if (localObject != null)
      {
        boolean bool = localObject instanceof oh;
        if (bool)
        {
          localObject = (oh)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/oh$a$a;
      ((oh.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    Object localObject2 = null;
    int k = 1;
    switch (paramInt1)
    {
    default: 
      k = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return k;
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper";
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      localObject1 = a();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      localObject1 = b();
      paramParcel2.writeNoException();
      paramParcel2.writeList((List)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      localObject1 = c();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      localObject2 = d();
      paramParcel2.writeNoException();
      if (localObject2 != null) {
        localObject1 = ((lh)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      localObject1 = e();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      localObject1 = f();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      continue;
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper";
      paramParcel1.enforceInterface((String)localObject1);
      g();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      localObject1 = a.a.a(paramParcel1.readStrongBinder());
      a((a)localObject1);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      localObject1 = a.a.a(paramParcel1.readStrongBinder());
      b((a)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper";
      paramParcel1.enforceInterface((String)localObject1);
      i = h();
      paramParcel2.writeNoException();
      if (i != 0) {
        i = k;
      }
      for (;;)
      {
        paramParcel2.writeInt(i);
        break;
        bool = false;
        localObject1 = null;
      }
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper";
      paramParcel1.enforceInterface((String)localObject1);
      boolean bool = i();
      paramParcel2.writeNoException();
      if (bool) {
        j = k;
      }
      paramParcel2.writeInt(j);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
      localObject1 = j();
      paramParcel2.writeNoException();
      if (localObject1 != null)
      {
        paramParcel2.writeInt(k);
        ((Bundle)localObject1).writeToParcel(paramParcel2, k);
      }
      else
      {
        paramParcel2.writeInt(0);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
        localObject1 = a.a.a(paramParcel1.readStrongBinder());
        c((a)localObject1);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
        localObject2 = k();
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((a)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
        localObject2 = l();
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((jf)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/oh$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */