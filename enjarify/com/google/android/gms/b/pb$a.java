package com.google.android.gms.b;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;

public abstract class pb$a
  extends Binder
  implements pb
{
  public pb$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
  }
  
  public static pb a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (pb)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
      if (localObject != null)
      {
        boolean bool = localObject instanceof pb;
        if (bool)
        {
          localObject = (pb)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/pb$a$a;
      ((pb.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    String str1 = null;
    int j = 0;
    Object localObject = null;
    int m = 1;
    switch (paramInt1)
    {
    default: 
      m = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return m;
      localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
      paramParcel2.writeString((String)localObject);
      continue;
      str1 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
      paramParcel1.enforceInterface(str1);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a((Bundle)localObject);
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
      paramParcel1.enforceInterface((String)localObject);
      f();
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
      paramParcel1.enforceInterface((String)localObject);
      g();
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
      paramParcel1.enforceInterface((String)localObject);
      h();
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
      paramParcel1.enforceInterface((String)localObject);
      i();
      paramParcel2.writeNoException();
      continue;
      String str2 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
      paramParcel1.enforceInterface(str2);
      int n = paramParcel1.readInt();
      if (n != 0) {
        localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      b((Bundle)localObject);
      paramParcel2.writeNoException();
      if (localObject != null)
      {
        paramParcel2.writeInt(m);
        ((Bundle)localObject).writeToParcel(paramParcel2, m);
      }
      else
      {
        paramParcel2.writeInt(0);
        continue;
        localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
        paramParcel1.enforceInterface((String)localObject);
        j();
        paramParcel2.writeNoException();
        continue;
        localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
        paramParcel1.enforceInterface((String)localObject);
        k();
        paramParcel2.writeNoException();
        continue;
        localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
        paramParcel1.enforceInterface((String)localObject);
        l();
        paramParcel2.writeNoException();
        continue;
        localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
        paramParcel1.enforceInterface((String)localObject);
        d();
        paramParcel2.writeNoException();
        continue;
        localObject = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
        paramParcel1.enforceInterface((String)localObject);
        j = e();
        paramParcel2.writeNoException();
        if (j != 0) {
          j = m;
        }
        for (;;)
        {
          paramParcel2.writeInt(j);
          break;
          int k = 0;
          localObject = null;
        }
        str1 = "com.google.android.gms.ads.internal.overlay.client.IAdOverlay";
        paramParcel1.enforceInterface(str1);
        i = paramParcel1.readInt();
        n = paramParcel1.readInt();
        int i1 = paramParcel1.readInt();
        if (i1 != 0) {
          localObject = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);
        }
        a(i, n, (Intent)localObject);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        localObject = a.a.a(paramParcel1.readStrongBinder());
        a((a)localObject);
        paramParcel2.writeNoException();
      }
    }
  }
}


/* Location:              com/google/android/gms/b/pb$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */