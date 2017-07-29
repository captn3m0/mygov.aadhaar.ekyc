package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class LinearLayoutManager$d
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  int a;
  int b;
  boolean c;
  
  static
  {
    LinearLayoutManager.d.1 local1 = new android/support/v7/widget/LinearLayoutManager$d$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public LinearLayoutManager$d() {}
  
  LinearLayoutManager$d(Parcel paramParcel)
  {
    int j = paramParcel.readInt();
    a = j;
    j = paramParcel.readInt();
    b = j;
    j = paramParcel.readInt();
    if (j == i) {}
    for (;;)
    {
      c = i;
      return;
      i = 0;
    }
  }
  
  public LinearLayoutManager$d(d paramd)
  {
    int i = a;
    a = i;
    i = b;
    b = i;
    boolean bool = c;
    c = bool;
  }
  
  final boolean a()
  {
    int i = a;
    if (i >= 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = a;
    paramParcel.writeInt(i);
    i = b;
    paramParcel.writeInt(i);
    int j = c;
    if (j != 0) {}
    int k;
    for (j = 1;; k = 0)
    {
      paramParcel.writeInt(j);
      return;
    }
  }
}


/* Location:              android/support/v7/widget/LinearLayoutManager$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */