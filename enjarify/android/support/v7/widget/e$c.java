package android.support.v7.widget;

import android.content.ComponentName;
import java.math.BigDecimal;

public final class e$c
{
  public final ComponentName a;
  public final long b;
  public final float c;
  
  public e$c(ComponentName paramComponentName, long paramLong, float paramFloat)
  {
    a = paramComponentName;
    b = paramLong;
    c = paramFloat;
  }
  
  public e$c(String paramString, long paramLong, float paramFloat)
  {
    this(localComponentName, paramLong, paramFloat);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      if (paramObject == null)
      {
        bool1 = false;
      }
      else
      {
        Object localObject1 = getClass();
        Object localObject2 = paramObject.getClass();
        if (localObject1 != localObject2)
        {
          bool1 = false;
        }
        else
        {
          paramObject = (c)paramObject;
          localObject1 = a;
          if (localObject1 == null)
          {
            localObject1 = a;
            if (localObject1 != null) {
              bool1 = false;
            }
          }
          else
          {
            localObject1 = a;
            localObject2 = a;
            bool2 = ((ComponentName)localObject1).equals(localObject2);
            if (!bool2)
            {
              bool1 = false;
              continue;
            }
          }
          long l1 = b;
          long l2 = b;
          boolean bool2 = l1 < l2;
          if (bool2)
          {
            bool1 = false;
          }
          else
          {
            float f1 = c;
            int i = Float.floatToIntBits(f1);
            float f2 = c;
            int j = Float.floatToIntBits(f2);
            if (i != j) {
              bool1 = false;
            }
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    ComponentName localComponentName = a;
    int i;
    if (localComponentName == null)
    {
      i = 0;
      localComponentName = null;
    }
    for (;;)
    {
      i = (i + 31) * 31;
      long l1 = b;
      long l2 = b >>> 32;
      int j = (int)(l1 ^ l2);
      i = (i + j) * 31;
      j = Float.floatToIntBits(c);
      return i + j;
      localComponentName = a;
      i = localComponentName.hashCode();
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("[");
    StringBuilder localStringBuilder2 = localStringBuilder1.append("; activity:");
    Object localObject = a;
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append("; time:");
    long l = b;
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append("; weight:");
    localObject = new java/math/BigDecimal;
    double d = c;
    ((BigDecimal)localObject).<init>(d);
    localStringBuilder2.append(localObject);
    localStringBuilder1.append("]");
    return localStringBuilder1.toString();
  }
}


/* Location:              android/support/v7/widget/e$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */