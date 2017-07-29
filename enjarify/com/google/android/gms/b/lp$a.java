package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;
import java.util.List;

public abstract class lp$a
  extends Binder
  implements lp
{
  public lp$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
  }
  
  public static lp a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (lp)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
      if (localObject != null)
      {
        boolean bool = localObject instanceof lp;
        if (bool)
        {
          localObject = (lp)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/lp$a$a;
      ((lp.a.a)localObject).<init>(paramIBinder);
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
    int k = 1;
    switch (paramInt1)
    {
    default: 
      k = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
      for (;;)
      {
        return k;
        localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd";
        paramParcel2.writeString((String)localObject1);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        localObject1 = paramParcel1.readString();
        localObject1 = a((String)localObject1);
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject1);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        Object localObject2 = paramParcel1.readString();
        localObject2 = b((String)localObject2);
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((lh)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        localObject1 = a();
        paramParcel2.writeNoException();
        paramParcel2.writeStringList((List)localObject1);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        localObject1 = l();
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject1);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        localObject1 = paramParcel1.readString();
        c((String)localObject1);
        paramParcel2.writeNoException();
        continue;
        localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd";
        paramParcel1.enforceInterface((String)localObject1);
        c();
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        localObject2 = b();
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((jf)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
        continue;
        localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd";
        paramParcel1.enforceInterface((String)localObject1);
        e();
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        localObject2 = d();
        paramParcel2.writeNoException();
        if (localObject2 != null) {
          localObject1 = ((a)localObject2).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject1);
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    localObject1 = a.a.a(paramParcel1.readStrongBinder());
    i = a((a)localObject1);
    paramParcel2.writeNoException();
    if (i != 0) {
      i = k;
    }
    for (;;)
    {
      paramParcel2.writeInt(i);
      break;
      int j = 0;
      localObject1 = null;
    }
  }
}


/* Location:              com/google/android/gms/b/lp$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */