package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public final class StaggeredGridLayoutManager$d
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  int a;
  int b;
  int c;
  int[] d;
  int e;
  int[] f;
  List g;
  boolean h;
  boolean i;
  boolean j;
  
  static
  {
    StaggeredGridLayoutManager.d.1 local1 = new android/support/v7/widget/StaggeredGridLayoutManager$d$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public StaggeredGridLayoutManager$d() {}
  
  StaggeredGridLayoutManager$d(Parcel paramParcel)
  {
    int m = paramParcel.readInt();
    a = m;
    m = paramParcel.readInt();
    b = m;
    m = paramParcel.readInt();
    c = m;
    m = c;
    Object localObject;
    if (m > 0)
    {
      m = c;
      localObject = new int[m];
      d = ((int[])localObject);
      localObject = d;
      paramParcel.readIntArray((int[])localObject);
    }
    m = paramParcel.readInt();
    e = m;
    m = e;
    if (m > 0)
    {
      m = e;
      localObject = new int[m];
      f = ((int[])localObject);
      localObject = f;
      paramParcel.readIntArray((int[])localObject);
    }
    m = paramParcel.readInt();
    if (m == k)
    {
      m = k;
      h = m;
      m = paramParcel.readInt();
      if (m != k) {
        break label199;
      }
      m = k;
      label149:
      i = m;
      m = paramParcel.readInt();
      if (m != k) {
        break label207;
      }
    }
    for (;;)
    {
      j = k;
      localObject = StaggeredGridLayoutManager.c.a.class.getClassLoader();
      localObject = paramParcel.readArrayList((ClassLoader)localObject);
      g = ((List)localObject);
      return;
      m = 0;
      localObject = null;
      break;
      label199:
      m = 0;
      localObject = null;
      break label149;
      label207:
      k = 0;
    }
  }
  
  public StaggeredGridLayoutManager$d(d paramd)
  {
    int k = c;
    c = k;
    k = a;
    a = k;
    k = b;
    b = k;
    Object localObject = d;
    d = ((int[])localObject);
    k = e;
    e = k;
    localObject = f;
    f = ((int[])localObject);
    boolean bool = h;
    h = bool;
    bool = i;
    i = bool;
    bool = j;
    j = bool;
    localObject = g;
    g = ((List)localObject);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int k = 1;
    int m = a;
    paramParcel.writeInt(m);
    m = b;
    paramParcel.writeInt(m);
    m = c;
    paramParcel.writeInt(m);
    m = c;
    Object localObject;
    if (m > 0)
    {
      localObject = d;
      paramParcel.writeIntArray((int[])localObject);
    }
    m = e;
    paramParcel.writeInt(m);
    m = e;
    if (m > 0)
    {
      localObject = f;
      paramParcel.writeIntArray((int[])localObject);
    }
    int n = h;
    label130:
    boolean bool;
    if (n != 0)
    {
      n = k;
      paramParcel.writeInt(n);
      int i1 = i;
      if (i1 == 0) {
        break label174;
      }
      i1 = k;
      paramParcel.writeInt(i1);
      bool = j;
      if (!bool) {
        break label183;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(k);
      localObject = g;
      paramParcel.writeList((List)localObject);
      return;
      bool = false;
      localObject = null;
      break;
      label174:
      bool = false;
      localObject = null;
      break label130;
      label183:
      k = 0;
    }
  }
}


/* Location:              android/support/v7/widget/StaggeredGridLayoutManager$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */