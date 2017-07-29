package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.f.b;
import android.support.v4.h.a;
import android.util.SparseArray;

public final class CoordinatorLayout$f
  extends a
{
  public static final Parcelable.Creator CREATOR;
  SparseArray a;
  
  static
  {
    CoordinatorLayout.f.1 local1 = new android/support/design/widget/CoordinatorLayout$f$1;
    local1.<init>();
    CREATOR = b.a(local1);
  }
  
  public CoordinatorLayout$f(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    int i = paramParcel.readInt();
    int[] arrayOfInt = new int[i];
    paramParcel.readIntArray(arrayOfInt);
    Parcelable[] arrayOfParcelable = paramParcel.readParcelableArray(paramClassLoader);
    SparseArray localSparseArray1 = new android/util/SparseArray;
    localSparseArray1.<init>(i);
    a = localSparseArray1;
    int j = 0;
    localSparseArray1 = null;
    while (j < i)
    {
      SparseArray localSparseArray2 = a;
      int k = arrayOfInt[j];
      Parcelable localParcelable = arrayOfParcelable[j];
      localSparseArray2.append(k, localParcelable);
      j += 1;
    }
  }
  
  public CoordinatorLayout$f(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    super.writeToParcel(paramParcel, paramInt);
    Object localObject = a;
    int j;
    if (localObject != null)
    {
      localObject = a;
      j = ((SparseArray)localObject).size();
    }
    int[] arrayOfInt;
    Parcelable[] arrayOfParcelable;
    for (int k = j;; k = 0)
    {
      paramParcel.writeInt(k);
      arrayOfInt = new int[k];
      arrayOfParcelable = new Parcelable[k];
      while (i < k)
      {
        j = a.keyAt(i);
        arrayOfInt[i] = j;
        localObject = (Parcelable)a.valueAt(i);
        arrayOfParcelable[i] = localObject;
        i += 1;
      }
    }
    paramParcel.writeIntArray(arrayOfInt);
    paramParcel.writeParcelableArray(arrayOfParcelable, paramInt);
  }
}


/* Location:              android/support/design/widget/CoordinatorLayout$f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */