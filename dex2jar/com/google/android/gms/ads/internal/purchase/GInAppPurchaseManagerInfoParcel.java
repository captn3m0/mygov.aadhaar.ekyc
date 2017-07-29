package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.a.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.b.pg;
import com.google.android.gms.b.qi;
import com.google.android.gms.common.internal.ReflectedParcelable;

@qi
public final class GInAppPurchaseManagerInfoParcel
  extends com.google.android.gms.common.internal.safeparcel.a
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<GInAppPurchaseManagerInfoParcel> CREATOR = new a();
  public final k a;
  public final pg b;
  public final Context c;
  public final j d;
  
  public GInAppPurchaseManagerInfoParcel(Context paramContext, k paramk, pg parampg, j paramj)
  {
    c = paramContext;
    a = paramk;
    b = parampg;
    d = paramj;
  }
  
  GInAppPurchaseManagerInfoParcel(IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, IBinder paramIBinder4)
  {
    a = ((k)b.a(a.a.a(paramIBinder1)));
    b = ((pg)b.a(a.a.a(paramIBinder2)));
    c = ((Context)b.a(a.a.a(paramIBinder3)));
    d = ((j)b.a(a.a.a(paramIBinder4)));
  }
  
  public static GInAppPurchaseManagerInfoParcel a(Intent paramIntent)
  {
    try
    {
      paramIntent = paramIntent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
      paramIntent.setClassLoader(GInAppPurchaseManagerInfoParcel.class.getClassLoader());
      paramIntent = (GInAppPurchaseManagerInfoParcel)paramIntent.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
      return paramIntent;
    }
    catch (Exception paramIntent) {}
    return null;
  }
  
  public static void a(Intent paramIntent, GInAppPurchaseManagerInfoParcel paramGInAppPurchaseManagerInfoParcel)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", paramGInAppPurchaseManagerInfoParcel);
    paramIntent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", localBundle);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/GInAppPurchaseManagerInfoParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */