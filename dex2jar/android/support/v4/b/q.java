package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class q
  implements Parcelable
{
  public static final Parcelable.Creator<q> CREATOR = new Parcelable.Creator() {};
  r[] a;
  int[] b;
  d[] c;
  
  public q() {}
  
  public q(Parcel paramParcel)
  {
    a = ((r[])paramParcel.createTypedArray(r.CREATOR));
    b = paramParcel.createIntArray();
    c = ((d[])paramParcel.createTypedArray(d.CREATOR));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeTypedArray(a, paramInt);
    paramParcel.writeIntArray(b);
    paramParcel.writeTypedArray(c, paramInt);
  }
}


/* Location:              android/support/v4/b/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */