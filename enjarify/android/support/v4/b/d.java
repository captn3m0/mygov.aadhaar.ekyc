package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

final class d
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  final int[] a;
  final int b;
  final int c;
  final String d;
  final int e;
  final int f;
  final CharSequence g;
  final int h;
  final CharSequence i;
  final ArrayList j;
  final ArrayList k;
  final boolean l;
  
  static
  {
    d.1 local1 = new android/support/v4/b/d$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public d(Parcel paramParcel)
  {
    Object localObject = paramParcel.createIntArray();
    a = ((int[])localObject);
    int m = paramParcel.readInt();
    b = m;
    m = paramParcel.readInt();
    c = m;
    localObject = paramParcel.readString();
    d = ((String)localObject);
    m = paramParcel.readInt();
    e = m;
    m = paramParcel.readInt();
    f = m;
    localObject = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    g = ((CharSequence)localObject);
    m = paramParcel.readInt();
    h = m;
    localObject = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel);
    i = ((CharSequence)localObject);
    localObject = paramParcel.createStringArrayList();
    j = ((ArrayList)localObject);
    localObject = paramParcel.createStringArrayList();
    k = ((ArrayList)localObject);
    m = paramParcel.readInt();
    if (m != 0) {
      m = 1;
    }
    for (;;)
    {
      l = m;
      return;
      m = 0;
      localObject = null;
    }
  }
  
  public d(c paramc)
  {
    int n = c.size();
    Object localObject2 = new int[n * 6];
    a = ((int[])localObject2);
    boolean bool2 = j;
    if (!bool2)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Not on back stack");
      throw ((Throwable)localObject1);
    }
    int i2 = 0;
    bool2 = false;
    localObject2 = null;
    if (i2 < n)
    {
      localObject1 = (c.a)c.get(i2);
      int[] arrayOfInt1 = a;
      int i3 = bool2 + true;
      int i4 = a;
      arrayOfInt1[bool2] = i4;
      arrayOfInt1 = a;
      i4 = i3 + 1;
      localObject2 = b;
      if (localObject2 != null) {
        localObject2 = b;
      }
      for (int i1 = n;; i1 = -1)
      {
        arrayOfInt1[i3] = i1;
        localObject2 = a;
        int i5 = i4 + 1;
        i3 = c;
        localObject2[i4] = i3;
        localObject2 = a;
        i3 = i5 + 1;
        i4 = d;
        localObject2[i5] = i4;
        localObject2 = a;
        i5 = i3 + 1;
        i4 = e;
        localObject2[i3] = i4;
        int[] arrayOfInt2 = a;
        i1 = i5 + 1;
        m = f;
        arrayOfInt2[i5] = m;
        m = i2 + 1;
        i2 = m;
        break;
      }
    }
    m = h;
    b = m;
    m = i;
    c = m;
    localObject1 = l;
    d = ((String)localObject1);
    m = n;
    e = m;
    m = o;
    f = m;
    localObject1 = p;
    g = ((CharSequence)localObject1);
    m = q;
    h = m;
    localObject1 = r;
    i = ((CharSequence)localObject1);
    localObject1 = s;
    j = ((ArrayList)localObject1);
    localObject1 = t;
    k = ((ArrayList)localObject1);
    boolean bool1 = u;
    l = bool1;
  }
  
  public final c a(o paramo)
  {
    int m = 1;
    int n = 0;
    Object localObject1 = null;
    c localc = new android/support/v4/b/c;
    localc.<init>(paramo);
    int i2 = 0;
    Object localObject2 = a;
    int i3 = localObject2.length;
    if (n < i3)
    {
      c.a locala = new android/support/v4/b/c$a;
      locala.<init>();
      localObject2 = a;
      int i4 = n + 1;
      n = localObject2[n];
      a = n;
      boolean bool1 = o.a;
      if (bool1)
      {
        localObject1 = "FragmentManager";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("Instantiate ");
        localObject2 = ((StringBuilder)localObject2).append(localc).append(" op #").append(i2).append(" base fragment #");
        int[] arrayOfInt = a;
        int i5 = arrayOfInt[i4];
        localObject2 = i5;
        Log.v((String)localObject1, (String)localObject2);
      }
      localObject1 = a;
      i3 = i4 + 1;
      i1 = localObject1[i4];
      if (i1 >= 0)
      {
        ArrayList localArrayList = e;
        localObject1 = (i)localArrayList.get(i1);
      }
      for (b = ((i)localObject1);; b = null)
      {
        localObject1 = a;
        i4 = i3 + 1;
        i1 = localObject1[i3];
        c = i1;
        localObject1 = a;
        i3 = i4 + 1;
        i1 = localObject1[i4];
        d = i1;
        localObject1 = a;
        i4 = i3 + 1;
        i1 = localObject1[i3];
        e = i1;
        localObject1 = a;
        i3 = i4 + 1;
        i1 = localObject1[i4];
        f = i1;
        i1 = c;
        d = i1;
        i1 = d;
        e = i1;
        i1 = e;
        f = i1;
        i1 = f;
        g = i1;
        localc.a(locala);
        i2 += 1;
        i1 = i3;
        break;
        i1 = 0;
        localObject1 = null;
      }
    }
    int i1 = b;
    h = i1;
    i1 = c;
    i = i1;
    localObject1 = d;
    l = ((String)localObject1);
    i1 = e;
    n = i1;
    j = m;
    i1 = f;
    o = i1;
    localObject1 = g;
    p = ((CharSequence)localObject1);
    i1 = h;
    q = i1;
    localObject1 = i;
    r = ((CharSequence)localObject1);
    localObject1 = j;
    s = ((ArrayList)localObject1);
    localObject1 = k;
    t = ((ArrayList)localObject1);
    boolean bool2 = l;
    u = bool2;
    localc.a(m);
    return localc;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = 0;
    Object localObject = a;
    paramParcel.writeIntArray((int[])localObject);
    int n = b;
    paramParcel.writeInt(n);
    n = c;
    paramParcel.writeInt(n);
    localObject = d;
    paramParcel.writeString((String)localObject);
    n = e;
    paramParcel.writeInt(n);
    n = f;
    paramParcel.writeInt(n);
    TextUtils.writeToParcel(g, paramParcel, 0);
    n = h;
    paramParcel.writeInt(n);
    TextUtils.writeToParcel(i, paramParcel, 0);
    localObject = j;
    paramParcel.writeStringList((List)localObject);
    localObject = k;
    paramParcel.writeStringList((List)localObject);
    boolean bool = l;
    if (bool) {
      m = 1;
    }
    paramParcel.writeInt(m);
  }
}


/* Location:              android/support/v4/b/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */