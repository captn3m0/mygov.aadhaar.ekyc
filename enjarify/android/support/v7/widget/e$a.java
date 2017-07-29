package android.support.v7.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

public final class e$a
  implements Comparable
{
  public final ResolveInfo a;
  public float b;
  
  public e$a(e parame, ResolveInfo paramResolveInfo)
  {
    a = paramResolveInfo;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool;
      if (paramObject == null)
      {
        bool = false;
      }
      else
      {
        Class localClass1 = getClass();
        Class localClass2 = paramObject.getClass();
        if (localClass1 != localClass2)
        {
          bool = false;
        }
        else
        {
          paramObject = (a)paramObject;
          float f1 = b;
          int i = Float.floatToIntBits(f1);
          float f2 = b;
          int j = Float.floatToIntBits(f2);
          if (i != j) {
            bool = false;
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    return Float.floatToIntBits(b) + 31;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("[");
    StringBuilder localStringBuilder2 = localStringBuilder1.append("resolveInfo:");
    Object localObject = a.toString();
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append("; weight:");
    localObject = new java/math/BigDecimal;
    double d = b;
    ((BigDecimal)localObject).<init>(d);
    localStringBuilder2.append(localObject);
    localStringBuilder1.append("]");
    return localStringBuilder1.toString();
  }
}


/* Location:              android/support/v7/widget/e$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */