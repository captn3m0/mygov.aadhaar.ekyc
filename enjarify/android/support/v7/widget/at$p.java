package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.f.b;
import android.support.v4.h.a;

public final class at$p
  extends a
{
  public static final Parcelable.Creator CREATOR;
  Parcelable a;
  
  static
  {
    at.p.1 local1 = new android/support/v7/widget/at$p$1;
    local1.<init>();
    CREATOR = b.a(local1);
  }
  
  at$p(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    if (paramClassLoader != null) {}
    for (;;)
    {
      Object localObject = paramParcel.readParcelable(paramClassLoader);
      a = ((Parcelable)localObject);
      return;
      localObject = at.g.class;
      paramClassLoader = ((Class)localObject).getClassLoader();
    }
  }
  
  at$p(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    Parcelable localParcelable = a;
    paramParcel.writeParcelable(localParcelable, 0);
  }
}


/* Location:              android/support/v7/widget/at$p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */