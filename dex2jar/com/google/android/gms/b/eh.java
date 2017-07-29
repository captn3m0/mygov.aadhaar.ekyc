package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;

public final class eh
  extends a
{
  public static final Parcelable.Creator<eh> CREATOR = new ei();
  final int a;
  final boolean b;
  final List<Scope> c;
  
  eh(int paramInt, boolean paramBoolean, List<Scope> paramList)
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */