package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public final class un
  extends a
{
  public static final Parcelable.Creator CREATOR;
  public String a;
  public int b;
  public int c;
  public boolean d;
  public boolean e;
  
  static
  {
    uo localuo = new com/google/android/gms/b/uo;
    localuo.<init>();
    CREATOR = localuo;
  }
  
  public un(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this(paramInt1, paramInt2, paramBoolean, false);
  }
  
  private un(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {}
  
  public un(int paramInt, boolean paramBoolean)
  {
    this(10260000, paramInt, true, paramBoolean);
  }
  
  un(String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramString;
    b = paramInt1;
    c = paramInt2;
    d = paramBoolean1;
    e = paramBoolean2;
  }
  
  public static un a()
  {
    int i = 10260208;
    un localun = new com/google/android/gms/b/un;
    localun.<init>(i, i, true);
    return localun;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    uo.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/un.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */