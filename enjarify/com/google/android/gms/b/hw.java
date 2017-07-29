package com.google.android.gms.b;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class hw
  extends a
{
  public static final Parcelable.Creator CREATOR;
  public final String a;
  public final long b;
  public final String c;
  public final String d;
  public final String e;
  public final Bundle f;
  public final boolean g;
  
  static
  {
    hx localhx = new com/google/android/gms/b/hx;
    localhx.<init>();
    CREATOR = localhx;
  }
  
  hw(String paramString1, long paramLong, String paramString2, String paramString3, String paramString4, Bundle paramBundle, boolean paramBoolean)
  {
    a = paramString1;
    b = paramLong;
    if (paramString2 != null)
    {
      c = paramString2;
      if (paramString3 == null) {
        break label72;
      }
      label30:
      d = paramString3;
      if (paramString4 == null) {
        break label79;
      }
      label41:
      e = paramString4;
      if (paramBundle == null) {
        break label86;
      }
    }
    for (;;)
    {
      f = paramBundle;
      g = paramBoolean;
      return;
      paramString2 = "";
      break;
      label72:
      paramString3 = "";
      break label30;
      label79:
      paramString4 = "";
      break label41;
      label86:
      paramBundle = new android/os/Bundle;
      paramBundle.<init>();
    }
  }
  
  public static hw a(Uri paramUri)
  {
    for (Object localObject1 = "gcache";; localObject1 = null)
    {
      try
      {
        localObject3 = paramUri.getScheme();
        boolean bool1 = ((String)localObject1).equals(localObject3);
        if (bool1) {
          break label24;
        }
        bool1 = false;
        localObject1 = null;
      }
      catch (NullPointerException localNullPointerException)
      {
        for (;;)
        {
          int j;
          int k;
          int i;
          Object localObject4;
          Object localObject5;
          Object localObject6;
          String str1;
          boolean bool3;
          Bundle localBundle;
          Iterator localIterator;
          Object localObject3 = "Unable to parse Uri into cache offering.";
          tp.c((String)localObject3, localNullPointerException);
          boolean bool2 = false;
          Object localObject2 = null;
          continue;
          long l = Long.parseLong((String)localObject2);
          continue;
          localObject2 = new com/google/android/gms/b/hw;
          ((hw)localObject2).<init>((String)localObject3, l, str1, (String)localObject5, (String)localObject6, localBundle, bool3);
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        label24:
        for (;;) {}
      }
      return (hw)localObject1;
      localObject1 = paramUri.getPathSegments();
      j = ((List)localObject1).size();
      k = 2;
      if (j == k) {
        break;
      }
      i = ((List)localObject1).size();
      j = 62;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>(j);
      localObject3 = "Expected 2 path parts for namespace and id, found :";
      localObject3 = ((StringBuilder)localObject4).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject3).append(i);
      localObject1 = ((StringBuilder)localObject1).toString();
      tp.e((String)localObject1);
      i = 0;
    }
    j = 0;
    localObject3 = null;
    localObject5 = ((List)localObject1).get(0);
    localObject5 = (String)localObject5;
    j = 1;
    localObject6 = ((List)localObject1).get(j);
    localObject6 = (String)localObject6;
    str1 = paramUri.getHost();
    localObject1 = "url";
    localObject3 = paramUri.getQueryParameter((String)localObject1);
    localObject1 = "1";
    localObject4 = "read_only";
    localObject4 = paramUri.getQueryParameter((String)localObject4);
    bool3 = ((String)localObject1).equals(localObject4);
    localObject1 = "expiration";
    localObject1 = paramUri.getQueryParameter((String)localObject1);
    if (localObject1 == null)
    {
      l = 0L;
      localBundle = new android/os/Bundle;
      localBundle.<init>();
      localObject1 = w.g();
      localObject1 = ((tu)localObject1).a(paramUri);
      localIterator = ((Set)localObject1).iterator();
      for (;;)
      {
        bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (String)localObject1;
        String str2 = "tag.";
        boolean bool4 = ((String)localObject1).startsWith(str2);
        if (bool4)
        {
          int m = 4;
          str2 = ((String)localObject1).substring(m);
          localObject1 = paramUri.getQueryParameter((String)localObject1);
          localBundle.putString(str2, (String)localObject1);
        }
      }
    }
  }
  
  public static hw a(String paramString)
  {
    return a(Uri.parse(paramString));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    hx.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/hw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */