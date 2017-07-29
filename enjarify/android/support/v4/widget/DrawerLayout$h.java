package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.f.b;
import android.support.v4.h.a;

public final class DrawerLayout$h
  extends a
{
  public static final Parcelable.Creator CREATOR;
  int a = 0;
  int b;
  int c;
  int f;
  int g;
  
  static
  {
    DrawerLayout.h.1 local1 = new android/support/v4/widget/DrawerLayout$h$1;
    local1.<init>();
    CREATOR = b.a(local1);
  }
  
  public DrawerLayout$h(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    int i = paramParcel.readInt();
    a = i;
    i = paramParcel.readInt();
    b = i;
    i = paramParcel.readInt();
    c = i;
    i = paramParcel.readInt();
    f = i;
    i = paramParcel.readInt();
    g = i;
  }
  
  public DrawerLayout$h(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    int i = a;
    paramParcel.writeInt(i);
    i = b;
    paramParcel.writeInt(i);
    i = c;
    paramParcel.writeInt(i);
    i = f;
    paramParcel.writeInt(i);
    i = g;
    paramParcel.writeInt(i);
  }
}


/* Location:              android/support/v4/widget/DrawerLayout$h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */