package com.google.android.gms.common.util;

import android.support.v4.g.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class d
{
  public static Map a(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    int i = 0;
    Object localObject1 = null;
    int j = paramArrayOfObject1.length;
    int k = paramArrayOfObject2.length;
    Object localObject2;
    Object localObject3;
    if (j != k)
    {
      localObject2 = new java/lang/IllegalArgumentException;
      i = paramArrayOfObject1.length;
      k = paramArrayOfObject2.length;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>(66);
      localObject1 = "Key and values array lengths not equal: " + i + " != " + k;
      ((IllegalArgumentException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    k = paramArrayOfObject1.length;
    switch (k)
    {
    default: 
      j = 32;
      if (k <= j)
      {
        localObject2 = new android/support/v4/g/a;
        ((a)localObject2).<init>(k);
      }
      break;
    case 0: 
      while (i < k)
      {
        Object localObject4 = paramArrayOfObject1[i];
        localObject3 = paramArrayOfObject2[i];
        ((Map)localObject2).put(localObject4, localObject3);
        i += 1;
        continue;
        localObject2 = Collections.emptyMap();
      }
    }
    for (;;)
    {
      return (Map)localObject2;
      localObject2 = paramArrayOfObject1[0];
      localObject1 = paramArrayOfObject2[0];
      localObject2 = Collections.singletonMap(localObject2, localObject1);
      continue;
      localObject2 = new java/util/HashMap;
      float f = 1.0F;
      ((HashMap)localObject2).<init>(k, f);
      break;
      localObject2 = Collections.unmodifiableMap((Map)localObject2);
    }
  }
}


/* Location:              com/google/android/gms/common/util/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */