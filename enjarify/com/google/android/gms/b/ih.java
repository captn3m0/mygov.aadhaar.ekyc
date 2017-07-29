package com.google.android.gms.b;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;
import java.util.List;

public final class ih
  extends a
{
  public static final Parcelable.Creator CREATOR;
  public final int a;
  public final long b;
  public final Bundle c;
  public final int d;
  public final List e;
  public final boolean f;
  public final int g;
  public final boolean h;
  public final String i;
  public final jp j;
  public final Location k;
  public final String l;
  public final Bundle m;
  public final Bundle n;
  public final List o;
  public final String p;
  public final String q;
  public final boolean r;
  
  static
  {
    ij localij = new com/google/android/gms/b/ij;
    localij.<init>();
    CREATOR = localij;
  }
  
  public ih(int paramInt1, long paramLong, Bundle paramBundle1, int paramInt2, List paramList1, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, String paramString1, jp paramjp, Location paramLocation, String paramString2, Bundle paramBundle2, Bundle paramBundle3, List paramList2, String paramString3, String paramString4, boolean paramBoolean3)
  {
    a = paramInt1;
    b = paramLong;
    if (paramBundle1 == null)
    {
      paramBundle1 = new android/os/Bundle;
      paramBundle1.<init>();
    }
    c = paramBundle1;
    d = paramInt2;
    e = paramList1;
    f = paramBoolean1;
    g = paramInt3;
    h = paramBoolean2;
    i = paramString1;
    j = paramjp;
    k = paramLocation;
    l = paramString2;
    if (paramBundle2 == null)
    {
      paramBundle2 = new android/os/Bundle;
      paramBundle2.<init>();
    }
    m = paramBundle2;
    n = paramBundle3;
    o = paramList2;
    p = paramString3;
    q = paramString4;
    r = paramBoolean3;
  }
  
  public static void a(ih paramih)
  {
    Bundle localBundle1 = m;
    Bundle localBundle2 = c;
    localBundle1.putBundle("com.google.ads.mediation.admob.AdMobAdapter", localBundle2);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof ih;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (ih)paramObject;
      int i1 = a;
      int i4 = a;
      if (i1 == i4)
      {
        long l1 = b;
        long l2 = b;
        boolean bool3 = l1 < l2;
        if (!bool3)
        {
          Object localObject1 = c;
          Object localObject2 = c;
          bool3 = b.a(localObject1, localObject2);
          if (bool3)
          {
            int i2 = d;
            i4 = d;
            if (i2 == i4)
            {
              localObject1 = e;
              localObject2 = e;
              boolean bool4 = b.a(localObject1, localObject2);
              if (bool4)
              {
                bool4 = f;
                boolean bool6 = f;
                if (bool4 == bool6)
                {
                  int i3 = g;
                  int i5 = g;
                  if (i3 == i5)
                  {
                    boolean bool5 = h;
                    boolean bool7 = h;
                    if (bool5 == bool7)
                    {
                      localObject1 = i;
                      localObject2 = i;
                      bool5 = b.a(localObject1, localObject2);
                      if (bool5)
                      {
                        localObject1 = j;
                        localObject2 = j;
                        bool5 = b.a(localObject1, localObject2);
                        if (bool5)
                        {
                          localObject1 = k;
                          localObject2 = k;
                          bool5 = b.a(localObject1, localObject2);
                          if (bool5)
                          {
                            localObject1 = l;
                            localObject2 = l;
                            bool5 = b.a(localObject1, localObject2);
                            if (bool5)
                            {
                              localObject1 = m;
                              localObject2 = m;
                              bool5 = b.a(localObject1, localObject2);
                              if (bool5)
                              {
                                localObject1 = n;
                                localObject2 = n;
                                bool5 = b.a(localObject1, localObject2);
                                if (bool5)
                                {
                                  localObject1 = o;
                                  localObject2 = o;
                                  bool5 = b.a(localObject1, localObject2);
                                  if (bool5)
                                  {
                                    localObject1 = p;
                                    localObject2 = p;
                                    bool5 = b.a(localObject1, localObject2);
                                    if (bool5)
                                    {
                                      localObject1 = q;
                                      localObject2 = q;
                                      bool5 = b.a(localObject1, localObject2);
                                      if (bool5)
                                      {
                                        bool5 = r;
                                        bool7 = r;
                                        if (bool5 == bool7) {
                                          bool1 = true;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[18];
    Object localObject = Integer.valueOf(a);
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(b);
    arrayOfObject[1] = localObject;
    localObject = c;
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(d);
    arrayOfObject[3] = localObject;
    localObject = e;
    arrayOfObject[4] = localObject;
    localObject = Boolean.valueOf(f);
    arrayOfObject[5] = localObject;
    localObject = Integer.valueOf(g);
    arrayOfObject[6] = localObject;
    localObject = Boolean.valueOf(h);
    arrayOfObject[7] = localObject;
    localObject = i;
    arrayOfObject[8] = localObject;
    localObject = j;
    arrayOfObject[9] = localObject;
    localObject = k;
    arrayOfObject[10] = localObject;
    localObject = l;
    arrayOfObject[11] = localObject;
    localObject = m;
    arrayOfObject[12] = localObject;
    localObject = n;
    arrayOfObject[13] = localObject;
    localObject = o;
    arrayOfObject[14] = localObject;
    localObject = p;
    arrayOfObject[15] = localObject;
    localObject = q;
    arrayOfObject[16] = localObject;
    localObject = Boolean.valueOf(r);
    arrayOfObject[17] = localObject;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ij.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/b/ih.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */