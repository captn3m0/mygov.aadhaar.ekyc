package com.google.android.gms.ads.internal;

import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public final class d
{
  public static String a(Bundle paramBundle)
  {
    boolean bool1;
    if (paramBundle == null) {
      bool1 = false;
    }
    StringBuilder localStringBuilder;
    for (Object localObject1 = null;; localObject1 = localStringBuilder.toString())
    {
      return (String)localObject1;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject1 = new java/util/TreeSet;
      Object localObject2 = paramBundle.keySet();
      ((TreeSet)localObject1).<init>((Collection)localObject2);
      localObject2 = ((TreeSet)localObject1).iterator();
      bool1 = ((Iterator)localObject2).hasNext();
      if (bool1)
      {
        localObject1 = (String)((Iterator)localObject2).next();
        localObject1 = paramBundle.get((String)localObject1);
        if (localObject1 == null) {
          localObject1 = "null";
        }
        for (;;)
        {
          localStringBuilder.append((String)localObject1);
          break;
          boolean bool2 = localObject1 instanceof Bundle;
          if (bool2) {
            localObject1 = a((Bundle)localObject1);
          } else {
            localObject1 = localObject1.toString();
          }
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */