package com.google.android.gms.b;

import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.b.a;
import java.util.Arrays;

public final class tz$a
{
  public final String a;
  public final double b;
  public final double c;
  public final double d;
  public final int e;
  
  public tz$a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt)
  {
    a = paramString;
    c = paramDouble1;
    b = paramDouble2;
    d = paramDouble3;
    e = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof a;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (a)paramObject;
      String str1 = a;
      String str2 = a;
      bool2 = b.a(str1, str2);
      if (bool2)
      {
        double d1 = b;
        double d2 = b;
        bool2 = d1 < d2;
        if (!bool2)
        {
          d1 = c;
          d2 = c;
          bool2 = d1 < d2;
          if (!bool2)
          {
            int i = e;
            int j = e;
            if (i == j)
            {
              d1 = d;
              d2 = d;
              i = Double.compare(d1, d2);
              if (i == 0) {
                bool1 = true;
              }
            }
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = a;
    arrayOfObject[0] = localObject;
    localObject = Double.valueOf(b);
    arrayOfObject[1] = localObject;
    localObject = Double.valueOf(c);
    arrayOfObject[2] = localObject;
    localObject = Double.valueOf(d);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(e);
    arrayOfObject[4] = localObject;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    b.a locala = b.a(this);
    Object localObject = a;
    locala = locala.a("name", localObject);
    localObject = Double.valueOf(c);
    locala = locala.a("minBound", localObject);
    localObject = Double.valueOf(b);
    locala = locala.a("maxBound", localObject);
    localObject = Double.valueOf(d);
    locala = locala.a("percent", localObject);
    localObject = Integer.valueOf(e);
    return locala.a("count", localObject).toString();
  }
}


/* Location:              com/google/android/gms/b/tz$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */