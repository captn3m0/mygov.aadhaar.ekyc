package android.support.v7.widget;

import java.util.Arrays;

final class ak$a
  implements at.g.a
{
  int a;
  int b;
  int[] c;
  int d;
  
  final void a()
  {
    int[] arrayOfInt = c;
    if (arrayOfInt != null)
    {
      arrayOfInt = c;
      int i = -1;
      Arrays.fill(arrayOfInt, i);
    }
    d = 0;
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    IllegalArgumentException localIllegalArgumentException;
    if (paramInt1 < 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Layout positions must be non-negative");
      throw localIllegalArgumentException;
    }
    if (paramInt2 < 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Pixel distance must be non-negative");
      throw localIllegalArgumentException;
    }
    int i = d * 2;
    int[] arrayOfInt1 = c;
    int j;
    int k;
    if (arrayOfInt1 == null)
    {
      j = 4;
      arrayOfInt1 = new int[j];
      c = arrayOfInt1;
      arrayOfInt1 = c;
      k = -1;
      Arrays.fill(arrayOfInt1, k);
    }
    for (;;)
    {
      c[i] = paramInt1;
      arrayOfInt1 = c;
      i += 1;
      arrayOfInt1[i] = paramInt2;
      i = d + 1;
      d = i;
      return;
      arrayOfInt1 = c;
      j = arrayOfInt1.length;
      if (i >= j)
      {
        arrayOfInt1 = c;
        k = i * 2;
        int[] arrayOfInt2 = new int[k];
        c = arrayOfInt2;
        arrayOfInt2 = c;
        int m = arrayOfInt1.length;
        System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, m);
      }
    }
  }
  
  final void a(at paramat, boolean paramBoolean)
  {
    d = 0;
    Object localObject1 = c;
    if (localObject1 != null)
    {
      localObject1 = c;
      int i = -1;
      Arrays.fill((int[])localObject1, i);
    }
    localObject1 = m;
    Object localObject2 = l;
    int j;
    if ((localObject2 != null) && (localObject1 != null))
    {
      boolean bool1 = y;
      if (bool1)
      {
        if (!paramBoolean) {
          break label147;
        }
        localObject2 = e;
        bool1 = ((f)localObject2).d();
        if (!bool1)
        {
          localObject2 = l;
          j = ((at.a)localObject2).a();
          ((at.g)localObject1).a(j, this);
        }
      }
    }
    for (;;)
    {
      j = d;
      int m = z;
      if (j > m)
      {
        j = d;
        z = j;
        A = paramBoolean;
        localObject1 = d;
        ((at.m)localObject1).b();
      }
      return;
      label147:
      boolean bool2 = paramat.n();
      if (!bool2)
      {
        int k = a;
        m = b;
        at.r localr = F;
        ((at.g)localObject1).a(k, m, localr, this);
      }
    }
  }
  
  final boolean a(int paramInt)
  {
    boolean bool = false;
    int[] arrayOfInt1 = c;
    int i;
    int j;
    if (arrayOfInt1 != null)
    {
      i = d * 2;
      j = 0;
      arrayOfInt1 = null;
    }
    for (;;)
    {
      if (j < i)
      {
        int[] arrayOfInt2 = c;
        int k = arrayOfInt2[j];
        if (k == paramInt) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
      j += 2;
    }
  }
}


/* Location:              android/support/v7/widget/ak$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */