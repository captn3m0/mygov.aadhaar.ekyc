package android.support.a.a;

import java.util.ArrayList;

final class d
{
  private static int a(String paramString, int paramInt)
  {
    for (;;)
    {
      int i = paramString.length();
      if (paramInt < i)
      {
        i = paramString.charAt(paramInt);
        int j = i + -65;
        int k = i + -90;
        j *= k;
        if (j > 0)
        {
          j = i + -97;
          k = i + -122;
          j *= k;
          if (j > 0) {}
        }
        else
        {
          j = 101;
          if (i != j)
          {
            j = 69;
            if (i == j) {}
          }
        }
      }
      else
      {
        return paramInt;
      }
      paramInt += 1;
    }
  }
  
  private static void a(ArrayList paramArrayList, char paramChar, float[] paramArrayOfFloat)
  {
    d.b localb = new android/support/a/a/d$b;
    localb.<init>(paramChar, paramArrayOfFloat);
    paramArrayList.add(localb);
  }
  
  static float[] a(float[] paramArrayOfFloat, int paramInt)
  {
    Object localObject;
    if (paramInt < 0)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    int i = paramArrayOfFloat.length;
    if (i < 0)
    {
      localObject = new java/lang/ArrayIndexOutOfBoundsException;
      ((ArrayIndexOutOfBoundsException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    int j = paramInt + 0;
    i += 0;
    i = Math.min(j, i);
    float[] arrayOfFloat = new float[j];
    System.arraycopy(paramArrayOfFloat, 0, arrayOfFloat, 0, i);
    return arrayOfFloat;
  }
  
  public static d.b[] a(String paramString)
  {
    int i = 1;
    int j;
    if (paramString == null) {
      j = 0;
    }
    ArrayList localArrayList;
    for (Object localObject = null;; localObject = (d.b[])localArrayList.toArray((Object[])localObject))
    {
      return (d.b[])localObject;
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      j = i;
      int n = 0;
      float[] arrayOfFloat1 = null;
      int k;
      for (;;)
      {
        int i1 = paramString.length();
        if (j >= i1) {
          break;
        }
        int i2 = a(paramString, j);
        localObject = paramString.substring(n, i2).trim();
        n = ((String)localObject).length();
        if (n > 0)
        {
          arrayOfFloat1 = b((String)localObject);
          j = ((String)localObject).charAt(0);
          a(localArrayList, j, arrayOfFloat1);
        }
        k = i2 + 1;
        n = i2;
      }
      k -= n;
      if (k == i)
      {
        k = paramString.length();
        if (n < k)
        {
          k = paramString.charAt(n);
          float[] arrayOfFloat2 = new float[0];
          a(localArrayList, k, arrayOfFloat2);
        }
      }
      int m = localArrayList.size();
      localObject = new d.b[m];
    }
  }
  
  public static d.b[] a(d.b[] paramArrayOfb)
  {
    int i;
    if (paramArrayOfb == null) {
      i = 0;
    }
    d.b[] arrayOfb;
    for (Object localObject = null;; localObject = arrayOfb)
    {
      return (d.b[])localObject;
      arrayOfb = new d.b[paramArrayOfb.length];
      i = 0;
      localObject = null;
      for (;;)
      {
        int j = paramArrayOfb.length;
        if (i >= j) {
          break;
        }
        d.b localb1 = new android/support/a/a/d$b;
        d.b localb2 = paramArrayOfb[i];
        localb1.<init>(localb2);
        arrayOfb[i] = localb1;
        i += 1;
      }
    }
  }
  
  private static float[] b(String paramString)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    Object localObject = null;
    int j = paramString.charAt(0);
    int k = 122;
    float f2;
    int n;
    float f3;
    if (j == k)
    {
      j = i;
      f2 = f1;
      k = paramString.charAt(0);
      n = 90;
      f3 = 1.26E-43F;
      if (k != n) {
        break label88;
      }
    }
    float[] arrayOfFloat1;
    label88:
    for (k = i;; k = 0)
    {
      j |= k;
      if (j == 0) {
        break label94;
      }
      arrayOfFloat1 = new float[0];
      return arrayOfFloat1;
      j = 0;
      arrayOfFloat1 = null;
      f2 = 0.0F;
      break;
    }
    for (;;)
    {
      label94:
      int m;
      try
      {
        j = paramString.length();
        float[] arrayOfFloat2 = new float[j];
        d.a locala = new android/support/a/a/d$a;
        locala.<init>();
        int i1 = paramString.length();
        int i2 = i;
        k = 0;
        if (i2 < i1)
        {
          j = 0;
          f2 = 0.0F;
          arrayOfFloat1 = null;
          b = false;
          int i3 = 0;
          String str = null;
          float f4 = 0.0F;
          j = 0;
          arrayOfFloat1 = null;
          f2 = 0.0F;
          n = 0;
          f3 = 0.0F;
          int i4 = i2;
          int i5 = paramString.length();
          if (i4 < i5)
          {
            i5 = paramString.charAt(i4);
            switch (i5)
            {
            default: 
              i3 = n;
              f4 = f3;
              n = j;
              f3 = f2;
              j = 0;
              arrayOfFloat1 = null;
              f2 = 0.0F;
              if (i3 == 0)
              {
                i4 += 1;
                int i6 = j;
                float f5 = f2;
                j = n;
                f2 = f3;
                n = i3;
                f3 = f4;
                i3 = i6;
                f4 = f5;
              }
              break;
            case 32: 
            case 44: 
              n = j;
              f3 = f2;
              i3 = i;
              f4 = f1;
              j = 0;
              arrayOfFloat1 = null;
              f2 = 0.0F;
              break;
            case 45: 
              if ((i4 == i2) || (i3 != 0)) {
                continue;
              }
              n = 1;
              f3 = Float.MIN_VALUE;
              b = n;
              n = j;
              f3 = f2;
              i3 = i;
              f4 = f1;
              j = 0;
              arrayOfFloat1 = null;
              f2 = 0.0F;
              break;
            case 46: 
              if (j == 0)
              {
                j = 0;
                arrayOfFloat1 = null;
                f2 = 0.0F;
                i3 = n;
                f4 = f3;
                n = i;
                f3 = f1;
                continue;
              }
              n = 1;
              f3 = Float.MIN_VALUE;
              b = n;
              n = j;
              f3 = f2;
              i3 = i;
              f4 = f1;
              j = 0;
              arrayOfFloat1 = null;
              f2 = 0.0F;
              break;
            case 69: 
            case 101: 
              i3 = n;
              f4 = f3;
              n = j;
              f3 = f2;
              j = i;
              f2 = f1;
              break;
            }
          }
          a = i4;
          n = a;
          if (i2 < n)
          {
            j = k + 1;
            str = paramString.substring(i2, n);
            f4 = Float.parseFloat(str);
            arrayOfFloat2[k] = f4;
            m = b;
            if (m != 0)
            {
              i2 = n;
              m = j;
              continue;
            }
            i2 = n + 1;
            m = j;
          }
        }
        else
        {
          arrayOfFloat1 = a(arrayOfFloat2, m);
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("error in parsing \"");
        localObject = paramString + "\"";
        localRuntimeException.<init>((String)localObject, localNumberFormatException);
        throw localRuntimeException;
      }
      j = m;
    }
  }
}


/* Location:              android/support/a/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */