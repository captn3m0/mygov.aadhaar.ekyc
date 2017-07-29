package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.f.b;
import android.support.v4.h.a;

public final class Toolbar$d
  extends a
{
  public static final Parcelable.Creator CREATOR;
  int a;
  boolean b;
  
  static
  {
    Toolbar.d.1 local1 = new android/support/v7/widget/Toolbar$d$1;
    local1.<init>();
    CREATOR = b.a(local1);
  }
  
  public Toolbar$d(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    int i = paramParcel.readInt();
    a = i;
    i = paramParcel.readInt();
    if (i != 0) {}
    for (i = 1;; i = 0)
    {
      b = i;
      return;
    }
  }
  
  public Toolbar$d(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    int i = a;
    paramParcel.writeInt(i);
    int j = b;
    if (j != 0) {}
    int k;
    for (j = 1;; k = 0)
    {
      paramParcel.writeInt(j);
      return;
    }
  }
}


/* Location:              android/support/v7/widget/Toolbar$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */