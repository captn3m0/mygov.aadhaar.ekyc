package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class i
  implements Parcelable.Creator
{
  static void a(AdOverlayInfoParcel paramAdOverlayInfoParcel, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel, 20293);
    Object localObject = a;
    c.a(paramParcel, 2, (Parcelable)localObject, paramInt);
    localObject = b.a(b).asBinder();
    c.a(paramParcel, 3, (IBinder)localObject);
    localObject = b.a(c).asBinder();
    c.a(paramParcel, 4, (IBinder)localObject);
    localObject = b.a(d).asBinder();
    c.a(paramParcel, 5, (IBinder)localObject);
    localObject = b.a(e).asBinder();
    c.a(paramParcel, 6, (IBinder)localObject);
    localObject = f;
    c.a(paramParcel, 7, (String)localObject);
    boolean bool = g;
    c.a(paramParcel, 8, bool);
    localObject = h;
    c.a(paramParcel, 9, (String)localObject);
    localObject = b.a(paramAdOverlayInfoParcel.i).asBinder();
    c.a(paramParcel, 10, (IBinder)localObject);
    int j = paramAdOverlayInfoParcel.j;
    c.b(paramParcel, 11, j);
    j = k;
    c.b(paramParcel, 12, j);
    localObject = l;
    c.a(paramParcel, 13, (String)localObject);
    localObject = m;
    c.a(paramParcel, 14, (Parcelable)localObject, paramInt);
    localObject = b.a(n).asBinder();
    c.a(paramParcel, 15, (IBinder)localObject);
    localObject = o;
    c.a(paramParcel, 16, (String)localObject);
    localObject = p;
    c.a(paramParcel, 17, (Parcelable)localObject, paramInt);
    c.b(paramParcel, i);
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */