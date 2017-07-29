package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

final class NestedScrollView$c
  extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR;
  public int a;
  
  static
  {
    NestedScrollView.c.1 local1 = new android/support/v4/widget/NestedScrollView$c$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  NestedScrollView$c(Parcel paramParcel)
  {
    super(paramParcel);
    int i = paramParcel.readInt();
    a = i;
  }
  
  NestedScrollView$c(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("HorizontalScrollView.SavedState{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder = localStringBuilder.append(str).append(" scrollPosition=");
    int i = a;
    return i + "}";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    int i = a;
    paramParcel.writeInt(i);
  }
}


/* Location:              android/support/v4/widget/NestedScrollView$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */