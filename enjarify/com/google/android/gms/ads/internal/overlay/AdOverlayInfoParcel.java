package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.a.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.n;
import com.google.android.gms.b.ib;
import com.google.android.gms.b.ly;
import com.google.android.gms.b.mf;
import com.google.android.gms.b.un;
import com.google.android.gms.b.vc;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class AdOverlayInfoParcel
  extends a
  implements ReflectedParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final e a;
  public final ib b;
  public final j c;
  public final vc d;
  public final ly e;
  public final String f;
  public final boolean g;
  public final String h;
  public final s i;
  public final int j;
  public final int k;
  public final String l;
  public final un m;
  public final mf n;
  public final String o;
  public final n p;
  
  static
  {
    i locali = new com/google/android/gms/ads/internal/overlay/i;
    locali.<init>();
    CREATOR = locali;
  }
  
  AdOverlayInfoParcel(e parame, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, IBinder paramIBinder4, String paramString1, boolean paramBoolean, String paramString2, IBinder paramIBinder5, int paramInt1, int paramInt2, String paramString3, un paramun, IBinder paramIBinder6, String paramString4, n paramn)
  {
    a = parame;
    Object localObject = (ib)b.a(a.a.a(paramIBinder1));
    b = ((ib)localObject);
    localObject = (j)b.a(a.a.a(paramIBinder2));
    c = ((j)localObject);
    localObject = (vc)b.a(a.a.a(paramIBinder3));
    d = ((vc)localObject);
    localObject = (ly)b.a(a.a.a(paramIBinder4));
    e = ((ly)localObject);
    f = paramString1;
    g = paramBoolean;
    h = paramString2;
    localObject = (s)b.a(a.a.a(paramIBinder5));
    i = ((s)localObject);
    j = paramInt1;
    k = paramInt2;
    l = paramString3;
    m = paramun;
    localObject = (mf)b.a(a.a.a(paramIBinder6));
    n = ((mf)localObject);
    o = paramString4;
    p = paramn;
  }
  
  public AdOverlayInfoParcel(e parame, ib paramib, j paramj, s params, un paramun)
  {
    a = parame;
    b = paramib;
    c = paramj;
    d = null;
    e = null;
    f = null;
    g = false;
    h = null;
    i = params;
    j = -1;
    k = 4;
    l = null;
    m = paramun;
    n = null;
    o = null;
    p = null;
  }
  
  public AdOverlayInfoParcel(ib paramib, j paramj, s params, vc paramvc, int paramInt, un paramun, String paramString, n paramn)
  {
    a = null;
    b = paramib;
    c = paramj;
    d = paramvc;
    e = null;
    f = null;
    g = false;
    h = null;
    i = params;
    j = paramInt;
    k = 1;
    l = null;
    m = paramun;
    n = null;
    o = paramString;
    p = paramn;
  }
  
  public AdOverlayInfoParcel(ib paramib, j paramj, s params, vc paramvc, boolean paramBoolean, int paramInt, un paramun)
  {
    a = null;
    b = paramib;
    c = paramj;
    d = paramvc;
    e = null;
    f = null;
    g = paramBoolean;
    h = null;
    i = params;
    j = paramInt;
    k = 2;
    l = null;
    m = paramun;
    n = null;
    o = null;
    p = null;
  }
  
  public AdOverlayInfoParcel(ib paramib, j paramj, ly paramly, s params, vc paramvc, boolean paramBoolean, int paramInt, String paramString, un paramun, mf parammf)
  {
    a = null;
    b = paramib;
    c = paramj;
    d = paramvc;
    e = paramly;
    f = null;
    g = paramBoolean;
    h = null;
    i = params;
    j = paramInt;
    k = 3;
    l = paramString;
    m = paramun;
    n = parammf;
    o = null;
    p = null;
  }
  
  public AdOverlayInfoParcel(ib paramib, j paramj, ly paramly, s params, vc paramvc, boolean paramBoolean, int paramInt, String paramString1, String paramString2, un paramun, mf parammf)
  {
    a = null;
    b = paramib;
    c = paramj;
    d = paramvc;
    e = paramly;
    f = paramString2;
    g = paramBoolean;
    h = paramString1;
    i = params;
    j = paramInt;
    k = 3;
    l = null;
    m = paramun;
    n = parammf;
    o = null;
    p = null;
  }
  
  public static AdOverlayInfoParcel a(Intent paramIntent)
  {
    Object localObject1 = "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo";
    try
    {
      localObject1 = paramIntent.getBundleExtra((String)localObject1);
      Object localObject3 = AdOverlayInfoParcel.class;
      localObject3 = ((Class)localObject3).getClassLoader();
      ((Bundle)localObject1).setClassLoader((ClassLoader)localObject3);
      localObject3 = "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo";
      localObject1 = ((Bundle)localObject1).getParcelable((String)localObject3);
      localObject1 = (AdOverlayInfoParcel)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    return (AdOverlayInfoParcel)localObject1;
  }
  
  public static void a(Intent paramIntent, AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>(1);
    localBundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", paramAdOverlayInfoParcel);
    paramIntent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", localBundle);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */