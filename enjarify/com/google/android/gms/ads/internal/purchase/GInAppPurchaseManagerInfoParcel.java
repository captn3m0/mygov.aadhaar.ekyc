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
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class GInAppPurchaseManagerInfoParcel
  extends com.google.android.gms.common.internal.safeparcel.a
  implements ReflectedParcelable
{
  public static final Parcelable.Creator CREATOR;
  public final k a;
  public final pg b;
  public final Context c;
  public final j d;
  
  static
  {
    a locala = new com/google/android/gms/ads/internal/purchase/a;
    locala.<init>();
    CREATOR = locala;
  }
  
  public GInAppPurchaseManagerInfoParcel(Context paramContext, k paramk, pg parampg, j paramj)
  {
    c = paramContext;
    a = paramk;
    b = parampg;
    d = paramj;
  }
  
  GInAppPurchaseManagerInfoParcel(IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, IBinder paramIBinder4)
  {
    Object localObject = (k)b.a(a.a.a(paramIBinder1));
    a = ((k)localObject);
    localObject = (pg)b.a(a.a.a(paramIBinder2));
    b = ((pg)localObject);
    localObject = (Context)b.a(a.a.a(paramIBinder3));
    c = ((Context)localObject);
    localObject = (j)b.a(a.a.a(paramIBinder4));
    d = ((j)localObject);
  }
  
  public static GInAppPurchaseManagerInfoParcel a(Intent paramIntent)
  {
    Object localObject1 = "com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo";
    try
    {
      localObject1 = paramIntent.getBundleExtra((String)localObject1);
      Object localObject3 = GInAppPurchaseManagerInfoParcel.class;
      localObject3 = ((Class)localObject3).getClassLoader();
      ((Bundle)localObject1).setClassLoader((ClassLoader)localObject3);
      localObject3 = "com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo";
      localObject1 = ((Bundle)localObject1).getParcelable((String)localObject3);
      localObject1 = (GInAppPurchaseManagerInfoParcel)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    return (GInAppPurchaseManagerInfoParcel)localObject1;
  }
  
  public static void a(Intent paramIntent, GInAppPurchaseManagerInfoParcel paramGInAppPurchaseManagerInfoParcel)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>(1);
    localBundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", paramGInAppPurchaseManagerInfoParcel);
    paramIntent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", localBundle);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/GInAppPurchaseManagerInfoParcel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */