package com.google.android.gms.b;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.c;
import java.util.Iterator;
import java.util.Set;

public final class cj
{
  final String a;
  final String b;
  final String c;
  final long d;
  final long e;
  final cl f;
  
  cj(dc paramdc, String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, Bundle paramBundle)
  {
    c.a(paramString2);
    c.a(paramString3);
    a = paramString2;
    b = paramString3;
    paramString3 = paramString1;
    if (TextUtils.isEmpty(paramString1)) {
      paramString3 = null;
    }
    c = paramString3;
    d = paramLong1;
    e = paramLong2;
    if ((e != 0L) && (e > d)) {
      ec.a("Event created with reverse previous/current timestamps. appId", cu.a(paramString2));
    }
    f = a(paramdc, paramBundle);
  }
  
  cj(dc paramdc, String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, cl paramcl)
  {
    c.a(paramString2);
    c.a(paramString3);
    c.a(paramcl);
    a = paramString2;
    b = paramString3;
    paramString3 = paramString1;
    if (TextUtils.isEmpty(paramString1)) {
      paramString3 = null;
    }
    c = paramString3;
    d = paramLong1;
    e = paramLong2;
    if ((e != 0L) && (e > d)) {
      ec.a("Event created with reverse previous/current timestamps. appId", cu.a(paramString2));
    }
    f = paramcl;
  }
  
  private static cl a(dc paramdc, Bundle paramBundle)
  {
    if ((paramBundle != null) && (!paramBundle.isEmpty()))
    {
      paramBundle = new Bundle(paramBundle);
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (str == null)
        {
          ea.a("Param name can't be null");
          localIterator.remove();
        }
        else
        {
          paramdc.i();
          Object localObject = dr.a(str, paramBundle.get(str));
          if (localObject == null)
          {
            ec.a("Param value can't be null", str);
            localIterator.remove();
          }
          else
          {
            paramdc.i().a(paramBundle, str, localObject);
          }
        }
      }
      return new cl(paramBundle);
    }
    return new cl(new Bundle());
  }
  
  public final String toString()
  {
    String str1 = a;
    String str2 = b;
    String str3 = String.valueOf(f);
    return String.valueOf(str1).length() + 33 + String.valueOf(str2).length() + String.valueOf(str3).length() + "Event{appId='" + str1 + "', name='" + str2 + "', params=" + str3 + "}";
  }
}


/* Location:              com/google/android/gms/b/cj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */