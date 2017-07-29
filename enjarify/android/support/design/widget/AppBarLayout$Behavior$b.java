package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.f.b;
import android.support.v4.h.a;

public final class AppBarLayout$Behavior$b
  extends a
{
  public static final Parcelable.Creator CREATOR;
  int a;
  float b;
  boolean c;
  
  static
  {
    AppBarLayout.Behavior.b.1 local1 = new android/support/design/widget/AppBarLayout$Behavior$b$1;
    local1.<init>();
    CREATOR = b.a(local1);
  }
  
  public AppBarLayout$Behavior$b(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    int i = paramParcel.readInt();
    a = i;
    float f = paramParcel.readFloat();
    b = f;
    i = paramParcel.readByte();
    if (i != 0) {
      i = 1;
    }
    for (f = Float.MIN_VALUE;; f = 0.0F)
    {
      c = i;
      return;
      i = 0;
    }
  }
  
  public AppBarLayout$Behavior$b(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    int i = a;
    paramParcel.writeInt(i);
    float f = b;
    paramParcel.writeFloat(f);
    boolean bool = c;
    if (bool) {
      bool = true;
    }
    for (f = Float.MIN_VALUE;; f = 0.0F)
    {
      byte b1 = (byte)bool;
      paramParcel.writeByte(b1);
      return;
      b1 = 0;
    }
  }
}


/* Location:              android/support/design/widget/AppBarLayout$Behavior$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */