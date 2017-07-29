package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.b.qi;
import com.google.android.gms.common.internal.safeparcel.a;

@qi
public final class e
  extends a
{
  public static final Parcelable.Creator<e> CREATOR = new d();
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final String e;
  public final String f;
  public final String g;
  public final Intent h;
  
  public e(Intent paramIntent)
  {
    this(null, null, null, null, null, null, null, paramIntent);
  }
  
  public e(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    this(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, null);
  }
  
  public e(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, Intent paramIntent)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramString4;
    e = paramString5;
    f = paramString6;
    g = paramString7;
    h = paramIntent;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */