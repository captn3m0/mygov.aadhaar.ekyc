package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class q
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  r[] a;
  int[] b;
  d[] c;
  
  static
  {
    q.1 local1 = new android/support/v4/b/q$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public q() {}
  
  public q(Parcel paramParcel)
  {
    Object localObject = r.CREATOR;
    localObject = (r[])paramParcel.createTypedArray((Parcelable.Creator)localObject);
    a = ((r[])localObject);
    localObject = paramParcel.createIntArray();
    b = ((int[])localObject);
    localObject = d.CREATOR;
    localObject = (d[])paramParcel.createTypedArray((Parcelable.Creator)localObject);
    c = ((d[])localObject);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = a;
    paramParcel.writeTypedArray((Parcelable[])localObject, paramInt);
    localObject = b;
    paramParcel.writeIntArray((int[])localObject);
    localObject = c;
    paramParcel.writeTypedArray((Parcelable[])localObject, paramInt);
  }
}


/* Location:              android/support/v4/b/q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */