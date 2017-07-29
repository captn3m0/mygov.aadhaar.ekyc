package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.f.b;
import android.support.v4.h.a;

final class SearchView$e
  extends a
{
  public static final Parcelable.Creator CREATOR;
  boolean a;
  
  static
  {
    SearchView.e.1 local1 = new android/support/v7/widget/SearchView$e$1;
    local1.<init>();
    CREATOR = b.a(local1);
  }
  
  public SearchView$e(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    boolean bool = ((Boolean)paramParcel.readValue(null)).booleanValue();
    a = bool;
  }
  
  SearchView$e(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("SearchView.SavedState{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder = localStringBuilder.append(str).append(" isIconified=");
    boolean bool = a;
    return bool + "}";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    Boolean localBoolean = Boolean.valueOf(a);
    paramParcel.writeValue(localBoolean);
  }
}


/* Location:              android/support/v7/widget/SearchView$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */