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
import com.google.android.gms.b.qi;
import com.google.android.gms.b.un;
import com.google.android.gms.b.vc;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

@qi
public final class AdOverlayInfoParcel
  extends a
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new i();
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
  
  AdOverlayInfoParcel(e parame, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, IBinder paramIBinder4, String paramString1, boolean paramBoolean, String paramString2, IBinder paramIBinder5, int paramInt1, int paramInt2, String paramString3, un paramun, IBinder paramIBinder6, String paramString4, n paramn)
  {
    a = parame;
    b = ((ib)b.a(a.a.a(paramIBinder1)));
    c = ((j)b.a(a.a.a(paramIBinder2)));
    d = ((vc)b.a(a.a.a(paramIBinder3)));
    e = ((ly)b.a(a.a.a(paramIBinder4)));
    f = paramString1;
    g = paramBoolean;
    h = paramString2;
    i = ((s)b.a(a.a.a(paramIBinder5)));
    j = paramInt1;
    k = paramInt2;
    l = paramString3;
    m = paramun;
    n = ((mf)b.a(a.a.a(paramIBinder6)));
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
    try
    {
      paramIntent = paramIntent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
      paramIntent.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
      paramIntent = (AdOverlayInfoParcel)paramIntent.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
      return paramIntent;
    }
    catch (Exception paramIntent) {}
    return null;
  }
  
  public static void a(Intent paramIntent, AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", paramAdOverlayInfoParcel);
    paramIntent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", localBundle);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */