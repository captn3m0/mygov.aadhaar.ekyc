package com.google.android.gms.b;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;
import java.util.List;

@qi
public final class ih
  extends a
{
  public static final Parcelable.Creator<ih> CREATOR = new ij();
  public final int a;
  public final long b;
  public final Bundle c;
  public final int d;
  public final List<String> e;
  public final boolean f;
  public final int g;
  public final boolean h;
  public final String i;
  public final jp j;
  public final Location k;
  public final String l;
  public final Bundle m;
  public final Bundle n;
  public final List<String> o;
  public final String p;
  public final String q;
  public final boolean r;
  
  public ih(int paramInt1, long paramLong, Bundle paramBundle1, int paramInt2, List<String> paramList1, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, String paramString1, jp paramjp, Location paramLocation, String paramString2, Bundle paramBundle2, Bundle paramBundle3, List<String> paramList2, String paramString3, String paramString4, boolean paramBoolean3)
  {
    a = paramInt1;
    b = paramLong;
    Bundle localBundle = paramBundle1;
    if (paramBundle1 == null) {
      localBundle = new Bundle();
    }
    c = localBundle;
    d = paramInt2;
    e = paramList1;
    f = paramBoolean1;
    g = paramInt3;
    h = paramBoolean2;
    i = paramString1;
    j = paramjp;
    k = paramLocation;
    l = paramString2;
    paramBundle1 = paramBundle2;
    if (paramBundle2 == null) {
      paramBundle1 = new Bundle();
    }
    m = paramBundle1;
    n = paramBundle3;
    o = paramList2;
    p = paramString3;
    q = paramString4;
    r = paramBoolean3;
  }
  
  public static void a(ih paramih)
  {
    m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", c);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ih)) {}
    do
    {
      return false;
      paramObject = (ih)paramObject;
    } while ((a != a) || (b != b) || (!b.a(c, c)) || (d != d) || (!b.a(e, e)) || (f != f) || (g != g) || (h != h) || (!b.a(i, i)) || (!b.a(j, j)) || (!b.a(k, k)) || (!b.a(l, l)) || (!b.a(m, m)) || (!b.a(n, n)) || (!b.a(o, o)) || (!b.a(p, p)) || (!b.a(q, q)) || (r != r));
    return true;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(a), Long.valueOf(b), c, Integer.valueOf(d), e, Boolean.valueOf(f), Integer.valueOf(g), Boolean.valueOf(h), i, j, k, l, m, n, o, p, q, Boolean.valueOf(r) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ij.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/ih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */