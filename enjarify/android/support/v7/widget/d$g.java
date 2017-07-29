package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class d$g
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int a;
  
  static
  {
    d.g.1 local1 = new android/support/v7/widget/d$g$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  d$g() {}
  
  d$g(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    a = i;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = a;
    paramParcel.writeInt(i);
  }
}


/* Location:              android/support/v7/widget/d$g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */