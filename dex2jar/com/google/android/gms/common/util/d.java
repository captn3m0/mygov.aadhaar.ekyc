package com.google.android.gms.common.util;

import android.support.v4.g.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class d
{
  public static <K, V> Map<K, V> a(K[] paramArrayOfK, V[] paramArrayOfV)
  {
    int i = 0;
    if (paramArrayOfK.length != paramArrayOfV.length)
    {
      i = paramArrayOfK.length;
      j = paramArrayOfV.length;
      throw new IllegalArgumentException(66 + "Key and values array lengths not equal: " + i + " != " + j);
    }
    int j = paramArrayOfK.length;
    Object localObject;
    switch (j)
    {
    default: 
      if (j <= 32) {
        localObject = new a(j);
      }
      break;
    }
    while (i < j)
    {
      ((Map)localObject).put(paramArrayOfK[i], paramArrayOfV[i]);
      i += 1;
      continue;
      return Collections.emptyMap();
      return Collections.singletonMap(paramArrayOfK[0], paramArrayOfV[0]);
      localObject = new HashMap(j, 1.0F);
    }
    return Collections.unmodifiableMap((Map)localObject);
  }
}


/* Location:              com/google/android/gms/common/util/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */