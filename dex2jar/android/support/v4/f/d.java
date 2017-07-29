package android.support.v4.f;

import android.annotation.TargetApi;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

@TargetApi(13)
final class d<T>
  implements Parcelable.ClassLoaderCreator<T>
{
  private final c<T> a;
  
  public d(c<T> paramc)
  {
    a = paramc;
  }
  
  public final T createFromParcel(Parcel paramParcel)
  {
    return (T)a.a(paramParcel, null);
  }
  
  public final T createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return (T)a.a(paramParcel, paramClassLoader);
  }
  
  public final T[] newArray(int paramInt)
  {
    return a.a(paramInt);
  }
}


/* Location:              android/support/v4/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */