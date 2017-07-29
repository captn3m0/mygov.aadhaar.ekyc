package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class jf$a
  extends Binder
  implements jf
{
  public jf$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IVideoController");
  }
  
  public static jf a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (jf)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
      if (localObject != null)
      {
        boolean bool = localObject instanceof jf;
        if (bool)
        {
          localObject = (jf)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/jf$a$a;
      ((jf.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    int k = 1;
    float f2 = Float.MIN_VALUE;
    switch (paramInt1)
    {
    default: 
      k = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return k;
      localObject1 = "com.google.android.gms.ads.internal.client.IVideoController";
      paramParcel2.writeString((String)localObject1);
      continue;
      localObject1 = "com.google.android.gms.ads.internal.client.IVideoController";
      paramParcel1.enforceInterface((String)localObject1);
      a();
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.ads.internal.client.IVideoController";
      paramParcel1.enforceInterface((String)localObject1);
      b();
      paramParcel2.writeNoException();
      continue;
      Object localObject2 = "com.google.android.gms.ads.internal.client.IVideoController";
      paramParcel1.enforceInterface((String)localObject2);
      int m = paramParcel1.readInt();
      if (m != 0)
      {
        i = k;
        f1 = f2;
      }
      a(i);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.ads.internal.client.IVideoController";
      paramParcel1.enforceInterface((String)localObject2);
      boolean bool1 = c();
      paramParcel2.writeNoException();
      if (bool1)
      {
        i = k;
        f1 = f2;
      }
      paramParcel2.writeInt(i);
      continue;
      localObject1 = "com.google.android.gms.ads.internal.client.IVideoController";
      paramParcel1.enforceInterface((String)localObject1);
      int j = d();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(j);
      continue;
      localObject1 = "com.google.android.gms.ads.internal.client.IVideoController";
      paramParcel1.enforceInterface((String)localObject1);
      f1 = e();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f1);
      continue;
      localObject1 = "com.google.android.gms.ads.internal.client.IVideoController";
      paramParcel1.enforceInterface((String)localObject1);
      f1 = f();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f1);
      continue;
      localObject1 = "com.google.android.gms.ads.internal.client.IVideoController";
      paramParcel1.enforceInterface((String)localObject1);
      localObject2 = paramParcel1.readStrongBinder();
      if (localObject2 == null)
      {
        j = 0;
        f1 = 0.0F;
        localObject1 = null;
      }
      for (;;)
      {
        a((jg)localObject1);
        paramParcel2.writeNoException();
        break;
        localObject1 = ((IBinder)localObject2).queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
        if (localObject1 != null)
        {
          boolean bool2 = localObject1 instanceof jg;
          if (bool2)
          {
            localObject1 = (jg)localObject1;
            continue;
          }
        }
        localObject1 = new com/google/android/gms/b/jg$a$a;
        ((jg.a.a)localObject1).<init>((IBinder)localObject2);
      }
      localObject1 = "com.google.android.gms.ads.internal.client.IVideoController";
      paramParcel1.enforceInterface((String)localObject1);
      f1 = g();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f1);
    }
  }
}


/* Location:              com/google/android/gms/b/jf$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */