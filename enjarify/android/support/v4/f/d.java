package android.support.v4.f;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class d
  implements Parcelable.ClassLoaderCreator
{
  private final c a;
  
  public d(c paramc)
  {
    a = paramc;
  }
  
  public final Object createFromParcel(Parcel paramParcel)
  {
    return a.a(paramParcel, null);
  }
  
  public final Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return a.a(paramParcel, paramClassLoader);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return a.a(paramInt);
  }
}


/* Location:              android/support/v4/f/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */