package com.google.android.gms.b;

import java.util.ArrayList;
import java.util.List;

public final class tz$b
{
  final List a;
  final List b;
  final List c;
  
  public tz$b()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    a = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    b = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    c = localArrayList;
  }
  
  public final b a(String paramString, double paramDouble1, double paramDouble2)
  {
    int i = 0;
    Object localObject = null;
    int j;
    for (int k = 0;; k = j)
    {
      localObject = a;
      i = ((List)localObject).size();
      if (k >= i) {
        break;
      }
      double d1 = ((Double)c.get(k)).doubleValue();
      localObject = (Double)b.get(k);
      double d2 = ((Double)localObject).doubleValue();
      boolean bool = paramDouble1 < d1;
      if (bool) {
        break;
      }
      bool = d1 < paramDouble1;
      if (!bool)
      {
        bool = paramDouble2 < d2;
        if (bool) {
          break;
        }
      }
      j = k + 1;
    }
    a.add(k, paramString);
    localObject = c;
    Double localDouble = Double.valueOf(paramDouble1);
    ((List)localObject).add(k, localDouble);
    localObject = b;
    localDouble = Double.valueOf(paramDouble2);
    ((List)localObject).add(k, localDouble);
    return this;
  }
}


/* Location:              com/google/android/gms/b/tz$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */