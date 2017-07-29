package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.f.b;
import android.support.v4.h.a;

public final class BottomSheetBehavior$a
  extends a
{
  public static final Parcelable.Creator CREATOR;
  final int a;
  
  static
  {
    BottomSheetBehavior.a.1 local1 = new android/support/design/widget/BottomSheetBehavior$a$1;
    local1.<init>();
    CREATOR = b.a(local1);
  }
  
  public BottomSheetBehavior$a(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    int i = paramParcel.readInt();
    a = i;
  }
  
  public BottomSheetBehavior$a(Parcelable paramParcelable, int paramInt)
  {
    super(paramParcelable);
    a = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    int i = a;
    paramParcel.writeInt(i);
  }
}


/* Location:              android/support/design/widget/BottomSheetBehavior$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */