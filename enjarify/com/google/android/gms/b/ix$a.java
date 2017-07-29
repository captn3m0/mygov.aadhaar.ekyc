package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.a.a;

public abstract class ix$a
  extends Binder
  implements ix
{
  public ix$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
  }
  
  public static ix a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (ix)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if (localObject != null)
      {
        boolean bool = localObject instanceof ix;
        if (bool)
        {
          localObject = (ix)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/ix$a$a;
      ((ix.a.a)localObject).<init>(paramIBinder);
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
    int k = 0;
    Object localObject2 = null;
    int n = 1;
    switch (paramInt1)
    {
    default: 
      n = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return n;
      localObject2 = "com.google.android.gms.ads.internal.client.IAdManager";
      paramParcel2.writeString((String)localObject2);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      localObject1 = i();
      paramParcel2.writeNoException();
      if (localObject1 != null) {
        localObject2 = ((a)localObject1).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject2);
      continue;
      localObject2 = "com.google.android.gms.ads.internal.client.IAdManager";
      paramParcel1.enforceInterface((String)localObject2);
      h();
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.ads.internal.client.IAdManager";
      paramParcel1.enforceInterface((String)localObject2);
      k = k();
      paramParcel2.writeNoException();
      if (k != 0) {
        k = n;
      }
      for (;;)
      {
        paramParcel2.writeInt(k);
        break;
        bool1 = false;
        localObject2 = null;
      }
      String str = "com.google.android.gms.ads.internal.client.IAdManager";
      paramParcel1.enforceInterface(str);
      int i1 = paramParcel1.readInt();
      if (i1 != 0) {
        localObject2 = (ih)ih.CREATOR.createFromParcel(paramParcel1);
      }
      boolean bool1 = a((ih)localObject2);
      paramParcel2.writeNoException();
      if (bool1) {
        i = n;
      }
      paramParcel2.writeInt(i);
      continue;
      localObject2 = "com.google.android.gms.ads.internal.client.IAdManager";
      paramParcel1.enforceInterface((String)localObject2);
      m();
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.ads.internal.client.IAdManager";
      paramParcel1.enforceInterface((String)localObject2);
      n();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      localObject2 = it.a.a(paramParcel1.readStrongBinder());
      a((it)localObject2);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      localObject1 = paramParcel1.readStrongBinder();
      if (localObject1 == null) {}
      boolean bool3;
      for (;;)
      {
        a((iz)localObject2);
        paramParcel2.writeNoException();
        break;
        localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        if (localObject2 != null)
        {
          bool3 = localObject2 instanceof iz;
          if (bool3)
          {
            localObject2 = (iz)localObject2;
            continue;
          }
        }
        localObject2 = new com/google/android/gms/b/iz$a$a;
        ((iz.a.a)localObject2).<init>((IBinder)localObject1);
      }
      localObject2 = "com.google.android.gms.ads.internal.client.IAdManager";
      paramParcel1.enforceInterface((String)localObject2);
      G();
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.ads.internal.client.IAdManager";
      paramParcel1.enforceInterface((String)localObject2);
      o();
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.ads.internal.client.IAdManager";
      paramParcel1.enforceInterface((String)localObject2);
      l();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
      localObject2 = j();
      paramParcel2.writeNoException();
      if (localObject2 != null)
      {
        paramParcel2.writeInt(n);
        ((il)localObject2).writeToParcel(paramParcel2, n);
      }
      else
      {
        paramParcel2.writeInt(0);
        continue;
        localObject1 = "com.google.android.gms.ads.internal.client.IAdManager";
        paramParcel1.enforceInterface((String)localObject1);
        i = paramParcel1.readInt();
        if (i != 0) {
          localObject2 = (il)il.CREATOR.createFromParcel(paramParcel1);
        }
        a((il)localObject2);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = paramParcel1.readStrongBinder();
        if (localObject1 == null) {}
        for (;;)
        {
          a((ph)localObject2);
          paramParcel2.writeNoException();
          break;
          localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
          if (localObject2 != null)
          {
            bool3 = localObject2 instanceof ph;
            if (bool3)
            {
              localObject2 = (ph)localObject2;
              continue;
            }
          }
          localObject2 = new com/google/android/gms/b/ph$a$a;
          ((ph.a.a)localObject2).<init>((IBinder)localObject1);
        }
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = paramParcel1.readStrongBinder();
        if (localObject1 == null) {}
        for (;;)
        {
          localObject1 = paramParcel1.readString();
          a((pl)localObject2, (String)localObject1);
          paramParcel2.writeNoException();
          break;
          localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
          if (localObject2 != null)
          {
            bool3 = localObject2 instanceof pl;
            if (bool3)
            {
              localObject2 = (pl)localObject2;
              continue;
            }
          }
          localObject2 = new com/google/android/gms/b/pl$a$a;
          ((pl.a.a)localObject2).<init>((IBinder)localObject1);
        }
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject2 = F();
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject2);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = paramParcel1.readStrongBinder();
        if (localObject1 == null) {}
        for (;;)
        {
          a((kq)localObject2);
          paramParcel2.writeNoException();
          break;
          localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
          if (localObject2 != null)
          {
            bool3 = localObject2 instanceof kq;
            if (bool3)
            {
              localObject2 = (kq)localObject2;
              continue;
            }
          }
          localObject2 = new com/google/android/gms/b/kq$a$a;
          ((kq.a.a)localObject2).<init>((IBinder)localObject1);
        }
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = paramParcel1.readStrongBinder();
        if (localObject1 == null) {}
        for (;;)
        {
          a((is)localObject2);
          paramParcel2.writeNoException();
          break;
          localObject2 = ((IBinder)localObject1).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
          if (localObject2 != null)
          {
            bool3 = localObject2 instanceof is;
            if (bool3)
            {
              localObject2 = (is)localObject2;
              continue;
            }
          }
          localObject2 = new com/google/android/gms/b/is$a$a;
          ((is.a.a)localObject2).<init>((IBinder)localObject1);
        }
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject2 = jb.a.a(paramParcel1.readStrongBinder());
        a((jb)localObject2);
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.ads.internal.client.IAdManager";
        paramParcel1.enforceInterface((String)localObject2);
        int m = paramParcel1.readInt();
        if (m != 0) {
          i = n;
        }
        a(i);
        paramParcel2.writeNoException();
        continue;
        localObject2 = "com.google.android.gms.ads.internal.client.IAdManager";
        paramParcel1.enforceInterface((String)localObject2);
        boolean bool2 = p();
        paramParcel2.writeNoException();
        if (bool2) {
          i = n;
        }
        paramParcel2.writeInt(i);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject2 = sb.a.a(paramParcel1.readStrongBinder());
        a((sb)localObject2);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject2 = paramParcel1.readString();
        a((String)localObject2);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
        localObject1 = q();
        paramParcel2.writeNoException();
        if (localObject1 != null) {
          localObject2 = ((jf)localObject1).asBinder();
        }
        paramParcel2.writeStrongBinder((IBinder)localObject2);
        continue;
        localObject1 = "com.google.android.gms.ads.internal.client.IAdManager";
        paramParcel1.enforceInterface((String)localObject1);
        int j = paramParcel1.readInt();
        if (j != 0) {
          localObject2 = (jt)jt.CREATOR.createFromParcel(paramParcel1);
        }
        a((jt)localObject2);
        paramParcel2.writeNoException();
        continue;
        localObject1 = "com.google.android.gms.ads.internal.client.IAdManager";
        paramParcel1.enforceInterface((String)localObject1);
        j = paramParcel1.readInt();
        if (j != 0) {
          localObject2 = (jh)jh.CREATOR.createFromParcel(paramParcel1);
        }
        a((jh)localObject2);
        paramParcel2.writeNoException();
      }
    }
  }
}


/* Location:              com/google/android/gms/b/ix$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */