package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class d
  implements Parcelable
{
  public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator() {};
  final int[] a;
  final int b;
  final int c;
  final String d;
  final int e;
  final int f;
  final CharSequence g;
  final int h;
  final CharSequence i;
  final ArrayList<String> j;
  final ArrayList<String> k;
  final boolean l;
  
  public d(Parcel paramParcel)
  {
    a = paramParcel.createIntArray();
    b = paramParcel.readInt();
    c = paramParcel.readInt();
    d = paramParcel.readString();
    e = paramParcel.readInt();
    f = paramParcel.readInt();
    g = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    h = paramParcel.readInt();
    i = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    j = paramParcel.createStringArrayList();
    k = paramParcel.createStringArrayList();
    if (paramParcel.readInt() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      l = bool;
      return;
    }
  }
  
  public d(c paramc)
  {
    int i1 = c.size();
    a = new int[i1 * 6];
    if (!j) {
      throw new IllegalStateException("Not on back stack");
    }
    int m = 0;
    int n = 0;
    if (m < i1)
    {
      c.a locala = (c.a)c.get(m);
      int[] arrayOfInt = a;
      int i2 = n + 1;
      arrayOfInt[n] = a;
      arrayOfInt = a;
      int i3 = i2 + 1;
      if (b != null) {}
      for (n = b.n;; n = -1)
      {
        arrayOfInt[i2] = n;
        arrayOfInt = a;
        n = i3 + 1;
        arrayOfInt[i3] = c;
        arrayOfInt = a;
        i2 = n + 1;
        arrayOfInt[n] = d;
        arrayOfInt = a;
        i3 = i2 + 1;
        arrayOfInt[i2] = e;
        arrayOfInt = a;
        n = i3 + 1;
        arrayOfInt[i3] = f;
        m += 1;
        break;
      }
    }
    b = h;
    c = i;
    d = l;
    e = n;
    f = o;
    g = p;
    h = q;
    i = r;
    j = s;
    k = t;
    l = u;
  }
  
  public final c a(o paramo)
  {
    int n = 0;
    c localc = new c(paramo);
    int m = 0;
    if (n < a.length)
    {
      c.a locala = new c.a();
      int[] arrayOfInt = a;
      int i1 = n + 1;
      a = arrayOfInt[n];
      if (o.a) {
        Log.v("FragmentManager", "Instantiate " + localc + " op #" + m + " base fragment #" + a[i1]);
      }
      arrayOfInt = a;
      n = i1 + 1;
      i1 = arrayOfInt[i1];
      if (i1 >= 0) {}
      for (b = ((i)e.get(i1));; b = null)
      {
        arrayOfInt = a;
        i1 = n + 1;
        c = arrayOfInt[n];
        arrayOfInt = a;
        n = i1 + 1;
        d = arrayOfInt[i1];
        arrayOfInt = a;
        i1 = n + 1;
        e = arrayOfInt[n];
        f = a[i1];
        d = c;
        e = d;
        f = e;
        g = f;
        localc.a(locala);
        m += 1;
        n = i1 + 1;
        break;
      }
    }
    h = b;
    i = c;
    l = d;
    n = e;
    j = true;
    o = f;
    p = g;
    q = h;
    r = i;
    s = j;
    t = k;
    u = l;
    localc.a(1);
    return localc;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = 0;
    paramParcel.writeIntArray(a);
    paramParcel.writeInt(b);
    paramParcel.writeInt(c);
    paramParcel.writeString(d);
    paramParcel.writeInt(e);
    paramParcel.writeInt(f);
    TextUtils.writeToParcel(g, paramParcel, 0);
    paramParcel.writeInt(h);
    TextUtils.writeToParcel(i, paramParcel, 0);
    paramParcel.writeStringList(j);
    paramParcel.writeStringList(k);
    if (l) {
      paramInt = 1;
    }
    paramParcel.writeInt(paramInt);
  }
}


/* Location:              android/support/v4/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */