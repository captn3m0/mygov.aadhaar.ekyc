package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

class StaggeredGridLayoutManager$c$a
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  int a;
  int b;
  int[] c;
  boolean d;
  
  static
  {
    StaggeredGridLayoutManager.c.a.1 local1 = new android/support/v7/widget/StaggeredGridLayoutManager$c$a$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public StaggeredGridLayoutManager$c$a() {}
  
  public StaggeredGridLayoutManager$c$a(Parcel paramParcel)
  {
    int j = paramParcel.readInt();
    a = j;
    j = paramParcel.readInt();
    b = j;
    j = paramParcel.readInt();
    if (j == i) {}
    for (;;)
    {
      d = i;
      i = paramParcel.readInt();
      if (i > 0)
      {
        arrayOfInt = new int[i];
        c = arrayOfInt;
        arrayOfInt = c;
        paramParcel.readIntArray(arrayOfInt);
      }
      return;
      i = 0;
      int[] arrayOfInt = null;
    }
  }
  
  final int a(int paramInt)
  {
    int[] arrayOfInt = c;
    int i;
    if (arrayOfInt == null)
    {
      i = 0;
      arrayOfInt = null;
    }
    for (;;)
    {
      return i;
      arrayOfInt = c;
      i = arrayOfInt[paramInt];
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("FullSpanItem{mPosition=");
    int i = a;
    localStringBuilder = localStringBuilder.append(i).append(", mGapDir=");
    i = b;
    localStringBuilder = localStringBuilder.append(i).append(", mHasUnwantedGapAfter=");
    boolean bool = d;
    localStringBuilder = localStringBuilder.append(bool).append(", mGapPerSpan=");
    String str = Arrays.toString(c);
    return str + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = a;
    paramParcel.writeInt(i);
    i = b;
    paramParcel.writeInt(i);
    int j = d;
    int[] arrayOfInt;
    int k;
    if (j != 0)
    {
      j = 1;
      paramParcel.writeInt(j);
      arrayOfInt = c;
      if (arrayOfInt == null) {
        break label93;
      }
      arrayOfInt = c;
      k = arrayOfInt.length;
      if (k <= 0) {
        break label93;
      }
      k = c.length;
      paramParcel.writeInt(k);
      arrayOfInt = c;
      paramParcel.writeIntArray(arrayOfInt);
    }
    for (;;)
    {
      return;
      k = 0;
      arrayOfInt = null;
      break;
      label93:
      paramParcel.writeInt(0);
    }
  }
}


/* Location:              android/support/v7/widget/StaggeredGridLayoutManager$c$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */