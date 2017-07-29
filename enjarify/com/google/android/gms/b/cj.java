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
    boolean bool = TextUtils.isEmpty(paramString1);
    if (bool) {
      paramString1 = null;
    }
    c = paramString1;
    d = paramLong1;
    e = paramLong2;
    long l1 = e;
    long l2 = 0L;
    bool = l1 < l2;
    if (bool)
    {
      l1 = e;
      l2 = d;
      bool = l1 < l2;
      if (bool)
      {
        localObject1 = ec;
        String str = "Event created with reverse previous/current timestamps. appId";
        Object localObject2 = cu.a(paramString2);
        ((cu.a)localObject1).a(str, localObject2);
      }
    }
    Object localObject1 = a(paramdc, paramBundle);
    f = ((cl)localObject1);
  }
  
  cj(dc paramdc, String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, cl paramcl)
  {
    c.a(paramString2);
    c.a(paramString3);
    c.a(paramcl);
    a = paramString2;
    b = paramString3;
    boolean bool = TextUtils.isEmpty(paramString1);
    if (bool) {
      paramString1 = null;
    }
    c = paramString1;
    d = paramLong1;
    e = paramLong2;
    long l1 = e;
    long l2 = 0L;
    bool = l1 < l2;
    if (bool)
    {
      l1 = e;
      l2 = d;
      bool = l1 < l2;
      if (bool)
      {
        cu.a locala = ec;
        String str = "Event created with reverse previous/current timestamps. appId";
        Object localObject = cu.a(paramString2);
        locala.a(str, localObject);
      }
    }
    f = paramcl;
  }
  
  private static cl a(dc paramdc, Bundle paramBundle)
  {
    Bundle localBundle;
    Object localObject1;
    if (paramBundle != null)
    {
      boolean bool = paramBundle.isEmpty();
      if (!bool)
      {
        localBundle = new android/os/Bundle;
        localBundle.<init>(paramBundle);
        localObject1 = localBundle.keySet();
        Iterator localIterator = ((Set)localObject1).iterator();
        for (;;)
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject1 = (String)localIterator.next();
          Object localObject2;
          if (localObject1 == null)
          {
            localObject1 = ea;
            localObject2 = "Param name can't be null";
            ((cu.a)localObject1).a((String)localObject2);
            localIterator.remove();
          }
          else
          {
            paramdc.i();
            localObject2 = localBundle.get((String)localObject1);
            localObject2 = dr.a((String)localObject1, localObject2);
            Object localObject3;
            if (localObject2 == null)
            {
              localObject2 = ec;
              localObject3 = "Param value can't be null";
              ((cu.a)localObject2).a((String)localObject3, localObject1);
              localIterator.remove();
            }
            else
            {
              localObject3 = paramdc.i();
              ((dr)localObject3).a(localBundle, (String)localObject1, localObject2);
            }
          }
        }
        localObject1 = new com/google/android/gms/b/cl;
        ((cl)localObject1).<init>(localBundle);
      }
    }
    for (;;)
    {
      return (cl)localObject1;
      localObject1 = new com/google/android/gms/b/cl;
      localBundle = new android/os/Bundle;
      localBundle.<init>();
      ((cl)localObject1).<init>(localBundle);
    }
  }
  
  public final String toString()
  {
    String str1 = a;
    String str2 = b;
    String str3 = String.valueOf(f);
    int i = String.valueOf(str1).length() + 33;
    int j = String.valueOf(str2).length();
    i += j;
    j = String.valueOf(str3).length();
    i += j;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i);
    return "Event{appId='" + str1 + "', name='" + str2 + "', params=" + str3 + "}";
  }
}


/* Location:              com/google/android/gms/b/cj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */