package android.support.v4.h;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.f.b;
import android.support.v4.f.c;

public abstract class a
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final a d;
  public final Parcelable e;
  
  static
  {
    Object localObject = new android/support/v4/h/a$1;
    ((a.1)localObject).<init>();
    d = (a)localObject;
    localObject = new android/support/v4/h/a$2;
    ((a.2)localObject).<init>();
    CREATOR = b.a((c)localObject);
  }
  
  private a()
  {
    e = null;
  }
  
  protected a(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    Object localObject = paramParcel.readParcelable(paramClassLoader);
    if (localObject != null) {}
    for (;;)
    {
      e = ((Parcelable)localObject);
      return;
      localObject = d;
    }
  }
  
  protected a(Parcelable paramParcelable)
  {
    if (paramParcelable == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("superState must not be null");
      throw ((Throwable)localObject);
    }
    Object localObject = d;
    if (paramParcelable != localObject) {}
    for (;;)
    {
      e = paramParcelable;
      return;
      paramParcelable = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Parcelable localParcelable = e;
    paramParcel.writeParcelable(localParcelable, paramInt);
  }
}


/* Location:              android/support/v4/h/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */