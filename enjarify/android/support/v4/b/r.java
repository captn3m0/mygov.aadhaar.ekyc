package android.support.v4.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class r
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  final String a;
  final int b;
  final boolean c;
  final int d;
  final int e;
  final String f;
  final boolean g;
  final boolean h;
  final Bundle i;
  final boolean j;
  Bundle k;
  i l;
  
  static
  {
    r.1 local1 = new android/support/v4/b/r$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public r(Parcel paramParcel)
  {
    Object localObject = paramParcel.readString();
    a = ((String)localObject);
    int n = paramParcel.readInt();
    b = n;
    n = paramParcel.readInt();
    if (n != 0)
    {
      n = m;
      c = n;
      n = paramParcel.readInt();
      d = n;
      n = paramParcel.readInt();
      e = n;
      localObject = paramParcel.readString();
      f = ((String)localObject);
      n = paramParcel.readInt();
      if (n == 0) {
        break label167;
      }
      n = m;
      label96:
      g = n;
      n = paramParcel.readInt();
      if (n == 0) {
        break label175;
      }
      n = m;
      label116:
      h = n;
      localObject = paramParcel.readBundle();
      i = ((Bundle)localObject);
      n = paramParcel.readInt();
      if (n == 0) {
        break label183;
      }
    }
    for (;;)
    {
      j = m;
      localObject = paramParcel.readBundle();
      k = ((Bundle)localObject);
      return;
      n = 0;
      localObject = null;
      break;
      label167:
      n = 0;
      localObject = null;
      break label96;
      label175:
      n = 0;
      localObject = null;
      break label116;
      label183:
      m = 0;
    }
  }
  
  public r(i parami)
  {
    Object localObject = parami.getClass().getName();
    a = ((String)localObject);
    int m = n;
    b = m;
    boolean bool1 = v;
    c = bool1;
    int n = E;
    d = n;
    n = F;
    e = n;
    localObject = G;
    f = ((String)localObject);
    boolean bool2 = J;
    g = bool2;
    bool2 = I;
    h = bool2;
    localObject = p;
    i = ((Bundle)localObject);
    bool2 = H;
    j = bool2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = 1;
    Object localObject = a;
    paramParcel.writeString((String)localObject);
    int n = b;
    paramParcel.writeInt(n);
    int i1 = c;
    label96:
    label116:
    boolean bool;
    if (i1 != 0)
    {
      i1 = m;
      paramParcel.writeInt(i1);
      int i2 = d;
      paramParcel.writeInt(i2);
      i2 = e;
      paramParcel.writeInt(i2);
      localObject = f;
      paramParcel.writeString((String)localObject);
      int i3 = g;
      if (i3 == 0) {
        break label172;
      }
      i3 = m;
      paramParcel.writeInt(i3);
      int i4 = h;
      if (i4 == 0) {
        break label181;
      }
      i4 = m;
      paramParcel.writeInt(i4);
      localObject = i;
      paramParcel.writeBundle((Bundle)localObject);
      bool = j;
      if (!bool) {
        break label190;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(m);
      localObject = k;
      paramParcel.writeBundle((Bundle)localObject);
      return;
      bool = false;
      localObject = null;
      break;
      label172:
      bool = false;
      localObject = null;
      break label96;
      label181:
      bool = false;
      localObject = null;
      break label116;
      label190:
      m = 0;
    }
  }
}


/* Location:              android/support/v4/b/r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */