package android.support.v4.f;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class b$a
  implements Parcelable.Creator
{
  final c a;
  
  public b$a(c paramc)
  {
    a = paramc;
  }
  
  public final Object createFromParcel(Parcel paramParcel)
  {
    return a.a(paramParcel, null);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return a.a(paramInt);
  }
}


/* Location:              android/support/v4/f/b$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */