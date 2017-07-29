package android.support.design.widget;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.f.b;
import android.support.v4.h.a;

public final class NavigationView$b
  extends a
{
  public static final Parcelable.Creator CREATOR;
  public Bundle a;
  
  static
  {
    NavigationView.b.1 local1 = new android/support/design/widget/NavigationView$b$1;
    local1.<init>();
    CREATOR = b.a(local1);
  }
  
  public NavigationView$b(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    Bundle localBundle = paramParcel.readBundle(paramClassLoader);
    a = localBundle;
  }
  
  public NavigationView$b(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    Bundle localBundle = a;
    paramParcel.writeBundle(localBundle);
  }
}


/* Location:              android/support/design/widget/NavigationView$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */