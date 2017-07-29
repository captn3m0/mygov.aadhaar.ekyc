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

@qi
public final class hw
  extends a
{
  public static final Parcelable.Creator<hw> CREATOR = new hx();
  public final String a;
  public final long b;
  public final String c;
  public final String d;
  public final String e;
  public final Bundle f;
  public final boolean g;
  
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
      paramBundle = new Bundle();
    }
  }
  
  public static hw a(Uri paramUri)
  {
    try
    {
      if (!"gcache".equals(paramUri.getScheme())) {
        return null;
      }
      localObject1 = paramUri.getPathSegments();
      if (((List)localObject1).size() != 2)
      {
        int i = ((List)localObject1).size();
        tp.e(62 + "Expected 2 path parts for namespace and id, found :" + i);
        return null;
      }
      str1 = (String)((List)localObject1).get(0);
      localObject1 = (String)((List)localObject1).get(1);
      str2 = paramUri.getHost();
      str3 = paramUri.getQueryParameter("url");
      bool = "1".equals(paramUri.getQueryParameter("read_only"));
      localObject2 = paramUri.getQueryParameter("expiration");
      if (localObject2 != null) {
        break label216;
      }
      l = 0L;
    }
    catch (NullPointerException paramUri)
    {
      Object localObject1;
      String str1;
      String str2;
      String str3;
      boolean bool;
      Object localObject2;
      long l;
      for (;;)
      {
        Iterator localIterator;
        tp.c("Unable to parse Uri into cache offering.", paramUri);
        return null;
        l = Long.parseLong((String)localObject2);
      }
      paramUri = new hw(str3, l, str2, str1, (String)localObject1, (Bundle)localObject2, bool);
      return paramUri;
    }
    catch (NumberFormatException paramUri)
    {
      label216:
      for (;;) {}
    }
    localObject2 = new Bundle();
    localIterator = w.g().a(paramUri).iterator();
    while (localIterator.hasNext())
    {
      String str4 = (String)localIterator.next();
      if (str4.startsWith("tag.")) {
        ((Bundle)localObject2).putString(str4.substring(4), paramUri.getQueryParameter(str4));
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */