package android.support.v4.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class r
  implements Parcelable
{
  public static final Parcelable.Creator<r> CREATOR = new Parcelable.Creator() {};
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
  
  public r(Parcel paramParcel)
  {
    a = paramParcel.readString();
    b = paramParcel.readInt();
    if (paramParcel.readInt() != 0)
    {
      bool1 = true;
      c = bool1;
      d = paramParcel.readInt();
      e = paramParcel.readInt();
      f = paramParcel.readString();
      if (paramParcel.readInt() == 0) {
        break label124;
      }
      bool1 = true;
      label69:
      g = bool1;
      if (paramParcel.readInt() == 0) {
        break label129;
      }
      bool1 = true;
      label83:
      h = bool1;
      i = paramParcel.readBundle();
      if (paramParcel.readInt() == 0) {
        break label134;
      }
    }
    label124:
    label129:
    label134:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      j = bool1;
      k = paramParcel.readBundle();
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label69;
      bool1 = false;
      break label83;
    }
  }
  
  public r(i parami)
  {
    a = parami.getClass().getName();
    b = n;
    c = v;
    d = E;
    e = F;
    f = G;
    g = J;
    h = I;
    i = p;
    j = H;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = 1;
    paramParcel.writeString(a);
    paramParcel.writeInt(b);
    if (c)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(d);
      paramParcel.writeInt(e);
      paramParcel.writeString(f);
      if (!g) {
        break label120;
      }
      paramInt = 1;
      label65:
      paramParcel.writeInt(paramInt);
      if (!h) {
        break label125;
      }
      paramInt = 1;
      label79:
      paramParcel.writeInt(paramInt);
      paramParcel.writeBundle(i);
      if (!j) {
        break label130;
      }
    }
    label120:
    label125:
    label130:
    for (paramInt = m;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeBundle(k);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label65;
      paramInt = 0;
      break label79;
    }
  }
}


/* Location:              android/support/v4/b/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */