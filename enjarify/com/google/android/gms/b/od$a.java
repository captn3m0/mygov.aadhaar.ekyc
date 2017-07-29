package com.google.android.gms.b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.a.a;
import com.google.android.gms.a.a.a;
import java.util.ArrayList;
import java.util.List;

public abstract class od$a
  extends Binder
  implements od
{
  public od$a()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
  }
  
  public static od a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (od)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      if (localObject != null)
      {
        boolean bool = localObject instanceof od;
        if (bool)
        {
          localObject = (od)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/b/od$a$a;
      ((od.a.a)localObject).<init>(paramIBinder);
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
    Object localObject2 = null;
    int j = 1;
    switch (paramInt1)
    {
    default: 
      j = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return j;
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
      paramParcel2.writeString((String)localObject1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject1 = paramParcel1.readStrongBinder();
      Object localObject3 = a.a.a((IBinder)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = (il)il.CREATOR.createFromParcel(paramParcel1);
        localObject4 = localObject1;
        label291:
        i = paramParcel1.readInt();
        if (i == 0) {
          break label365;
        }
        localObject1 = (ih)ih.CREATOR.createFromParcel(paramParcel1);
      }
      Object localObject6;
      Object localObject7;
      label365:
      for (Object localObject5 = localObject1;; localObject5 = null)
      {
        localObject6 = paramParcel1.readString();
        localObject7 = oe.a.a(paramParcel1.readStrongBinder());
        localObject1 = this;
        a((a)localObject3, (il)localObject4, (ih)localObject5, (String)localObject6, (oe)localObject7);
        paramParcel2.writeNoException();
        break;
        localObject4 = null;
        break label291;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject1 = a();
      paramParcel2.writeNoException();
      if (localObject1 != null) {
        localObject2 = ((a)localObject1).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject2);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject1 = paramParcel1.readStrongBinder();
      localObject3 = a.a.a((IBinder)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {}
      for (localObject1 = (ih)ih.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        localObject4 = paramParcel1.readString();
        localObject5 = oe.a.a(paramParcel1.readStrongBinder());
        a((a)localObject3, (ih)localObject1, (String)localObject4, (oe)localObject5);
        paramParcel2.writeNoException();
        break;
        i = 0;
      }
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
      paramParcel1.enforceInterface((String)localObject1);
      b();
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
      paramParcel1.enforceInterface((String)localObject1);
      c();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject1 = paramParcel1.readStrongBinder();
      localObject3 = a.a.a((IBinder)localObject1);
      i = paramParcel1.readInt();
      if (i != 0)
      {
        localObject1 = (il)il.CREATOR.createFromParcel(paramParcel1);
        localObject4 = localObject1;
        label587:
        i = paramParcel1.readInt();
        if (i == 0) {
          break label669;
        }
        localObject1 = (ih)ih.CREATOR.createFromParcel(paramParcel1);
      }
      label669:
      for (localObject5 = localObject1;; localObject5 = null)
      {
        localObject6 = paramParcel1.readString();
        localObject7 = paramParcel1.readString();
        localObject2 = oe.a.a(paramParcel1.readStrongBinder());
        localObject1 = this;
        a((a)localObject3, (il)localObject4, (ih)localObject5, (String)localObject6, (String)localObject7, (oe)localObject2);
        paramParcel2.writeNoException();
        break;
        localObject4 = null;
        break label587;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject1 = paramParcel1.readStrongBinder();
      localObject3 = a.a.a((IBinder)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject1 = (ih)ih.CREATOR.createFromParcel(paramParcel1);
      }
      for (Object localObject4 = localObject1;; localObject4 = null)
      {
        localObject5 = paramParcel1.readString();
        localObject6 = paramParcel1.readString();
        localObject7 = oe.a.a(paramParcel1.readStrongBinder());
        localObject1 = this;
        a((a)localObject3, (ih)localObject4, (String)localObject5, (String)localObject6, (oe)localObject7);
        paramParcel2.writeNoException();
        break;
      }
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
      paramParcel1.enforceInterface((String)localObject1);
      d();
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
      paramParcel1.enforceInterface((String)localObject1);
      e();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject1 = paramParcel1.readStrongBinder();
      localObject3 = a.a.a((IBinder)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject1 = (ih)ih.CREATOR.createFromParcel(paramParcel1);
      }
      for (localObject4 = localObject1;; localObject4 = null)
      {
        localObject5 = paramParcel1.readString();
        localObject6 = sq.a.a(paramParcel1.readStrongBinder());
        localObject7 = paramParcel1.readString();
        localObject1 = this;
        a((a)localObject3, (ih)localObject4, (String)localObject5, (sq)localObject6, (String)localObject7);
        paramParcel2.writeNoException();
        break;
      }
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {}
      for (localObject1 = (ih)ih.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        localObject3 = paramParcel1.readString();
        a((ih)localObject1, (String)localObject3);
        paramParcel2.writeNoException();
        break;
        i = 0;
      }
      localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
      paramParcel1.enforceInterface((String)localObject1);
      f();
      paramParcel2.writeNoException();
      continue;
      localObject3 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
      paramParcel1.enforceInterface((String)localObject3);
      boolean bool = g();
      paramParcel2.writeNoException();
      if (bool) {
        i = j;
      }
      paramParcel2.writeInt(i);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject1 = paramParcel1.readStrongBinder();
      localObject3 = a.a.a((IBinder)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject1 = (ih)ih.CREATOR.createFromParcel(paramParcel1);
      }
      for (localObject4 = localObject1;; localObject4 = null)
      {
        localObject5 = paramParcel1.readString();
        localObject6 = paramParcel1.readString();
        localObject1 = paramParcel1.readStrongBinder();
        localObject7 = oe.a.a((IBinder)localObject1);
        i = paramParcel1.readInt();
        if (i != 0)
        {
          localObject1 = (le)le.CREATOR.createFromParcel(paramParcel1);
          localObject2 = localObject1;
        }
        ArrayList localArrayList = paramParcel1.createStringArrayList();
        localObject1 = this;
        a((a)localObject3, (ih)localObject4, (String)localObject5, (String)localObject6, (oe)localObject7, (le)localObject2, localArrayList);
        paramParcel2.writeNoException();
        break;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject1 = h();
      paramParcel2.writeNoException();
      if (localObject1 != null) {
        localObject2 = ((og)localObject1).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject2);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject1 = i();
      paramParcel2.writeNoException();
      if (localObject1 != null) {
        localObject2 = ((oh)localObject1).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject2);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
      localObject3 = j();
      paramParcel2.writeNoException();
      if (localObject3 != null)
      {
        paramParcel2.writeInt(j);
        ((Bundle)localObject3).writeToParcel(paramParcel2, j);
      }
      else
      {
        paramParcel2.writeInt(0);
        continue;
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        localObject3 = k();
        paramParcel2.writeNoException();
        if (localObject3 != null)
        {
          paramParcel2.writeInt(j);
          ((Bundle)localObject3).writeToParcel(paramParcel2, j);
        }
        else
        {
          paramParcel2.writeInt(0);
          continue;
          paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
          localObject3 = l();
          paramParcel2.writeNoException();
          if (localObject3 != null)
          {
            paramParcel2.writeInt(j);
            ((Bundle)localObject3).writeToParcel(paramParcel2, j);
          }
          else
          {
            paramParcel2.writeInt(0);
            continue;
            localObject1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
            paramParcel1.enforceInterface((String)localObject1);
            i = paramParcel1.readInt();
            if (i != 0) {}
            for (localObject1 = (ih)ih.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
            {
              localObject3 = paramParcel1.readString();
              localObject4 = paramParcel1.readString();
              a((ih)localObject1, (String)localObject3, (String)localObject4);
              paramParcel2.writeNoException();
              break;
              i = 0;
            }
            paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            localObject1 = a.a.a(paramParcel1.readStrongBinder());
            a((a)localObject1);
            paramParcel2.writeNoException();
            continue;
            localObject3 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter";
            paramParcel1.enforceInterface((String)localObject3);
            bool = m();
            paramParcel2.writeNoException();
            if (bool) {
              i = j;
            }
            paramParcel2.writeInt(i);
            continue;
            paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            localObject1 = a.a.a(paramParcel1.readStrongBinder());
            localObject3 = sq.a.a(paramParcel1.readStrongBinder());
            localObject4 = paramParcel1.createStringArrayList();
            a((a)localObject1, (sq)localObject3, (List)localObject4);
            paramParcel2.writeNoException();
          }
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/od$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */