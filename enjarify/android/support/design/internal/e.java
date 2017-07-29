package android.support.design.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.f.b;
import android.util.SparseArray;

public final class e
  extends SparseArray
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  
  static
  {
    e.1 local1 = new android/support/design/internal/e$1;
    local1.<init>();
    CREATOR = b.a(local1);
  }
  
  public e() {}
  
  public e(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    int i = paramParcel.readInt();
    int[] arrayOfInt = new int[i];
    paramParcel.readIntArray(arrayOfInt);
    Parcelable[] arrayOfParcelable = paramParcel.readParcelableArray(paramClassLoader);
    int j = 0;
    while (j < i)
    {
      int k = arrayOfInt[j];
      Parcelable localParcelable = arrayOfParcelable[j];
      put(k, localParcelable);
      j += 1;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = size();
    int[] arrayOfInt = new int[i];
    Parcelable[] arrayOfParcelable = new Parcelable[i];
    int j = 0;
    Parcelable localParcelable = null;
    for (int k = 0; k < i; k = j)
    {
      j = keyAt(k);
      arrayOfInt[k] = j;
      localParcelable = (Parcelable)valueAt(k);
      arrayOfParcelable[k] = localParcelable;
      j = k + 1;
    }
    paramParcel.writeInt(i);
    paramParcel.writeIntArray(arrayOfInt);
    paramParcel.writeParcelableArray(arrayOfParcelable, paramInt);
  }
}


/* Location:              android/support/design/internal/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */