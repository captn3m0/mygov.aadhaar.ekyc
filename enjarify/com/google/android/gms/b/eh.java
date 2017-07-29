package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;

public final class eh
  extends a
{
  public static final Parcelable.Creator CREATOR;
  final int a;
  final boolean b;
  final List c;
  
  static
  {
    ei localei = new com/google/android/gms/b/ei;
    localei.<init>();
    CREATOR = localei;
  }
  
  eh(int paramInt, boolean paramBoolean, List paramList)
  {
    a = paramInt;
    b = paramBoolean;
    c = paramList;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ei.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/eh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */