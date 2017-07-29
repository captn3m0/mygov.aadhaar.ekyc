package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class StaggeredGridLayoutManager$c
{
  int[] a;
  List b;
  
  final int a(int paramInt)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = b;
      int i = ((List)localObject).size() + -1;
      for (int j = i; j >= 0; j = i)
      {
        localObject = (StaggeredGridLayoutManager.c.a)b.get(j);
        i = a;
        if (i >= paramInt)
        {
          localObject = b;
          ((List)localObject).remove(j);
        }
        i = j + -1;
      }
    }
    return b(paramInt);
  }
  
  public final StaggeredGridLayoutManager.c.a a(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = b;
    int i;
    if (localObject == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (StaggeredGridLayoutManager.c.a)localObject;
      int j = b.size();
      i = 0;
      localObject = null;
      for (int k = 0;; k = i)
      {
        if (k >= j) {
          break label140;
        }
        localObject = (StaggeredGridLayoutManager.c.a)b.get(k);
        int m = a;
        if (m >= paramInt2)
        {
          i = 0;
          localObject = null;
          break;
        }
        m = a;
        if (m >= paramInt1)
        {
          if (paramInt3 == 0) {
            break;
          }
          m = b;
          if (m == paramInt3) {
            break;
          }
          boolean bool = d;
          if (bool) {
            break;
          }
        }
        i = k + 1;
      }
      label140:
      i = 0;
      localObject = null;
    }
  }
  
  final void a()
  {
    int[] arrayOfInt = a;
    if (arrayOfInt != null)
    {
      arrayOfInt = a;
      int i = -1;
      Arrays.fill(arrayOfInt, i);
    }
    b = null;
  }
  
  final void a(int paramInt1, int paramInt2)
  {
    Object localObject = a;
    if (localObject != null)
    {
      localObject = a;
      i = localObject.length;
      if (paramInt1 < i) {
        break label25;
      }
    }
    label25:
    int k;
    do
    {
      return;
      i = paramInt1 + paramInt2;
      c(i);
      localObject = a;
      j = paramInt1 + paramInt2;
      int[] arrayOfInt1 = a;
      int[] arrayOfInt2 = a;
      k = arrayOfInt2.length - paramInt1 - paramInt2;
      System.arraycopy(localObject, j, arrayOfInt1, paramInt1, k);
      localObject = a;
      int[] arrayOfInt3 = a;
      j = arrayOfInt3.length - paramInt2;
      arrayOfInt1 = a;
      m = arrayOfInt1.length;
      k = -1;
      Arrays.fill((int[])localObject, j, m, k);
      localObject = b;
    } while (localObject == null);
    int m = paramInt1 + paramInt2;
    localObject = b;
    int i = ((List)localObject).size() + -1;
    int j = i;
    label153:
    if (j >= 0)
    {
      localObject = (StaggeredGridLayoutManager.c.a)b.get(j);
      k = a;
      if (k >= paramInt1)
      {
        k = a;
        if (k >= m) {
          break label225;
        }
        localObject = b;
        ((List)localObject).remove(j);
      }
    }
    for (;;)
    {
      i = j + -1;
      j = i;
      break label153;
      break;
      label225:
      k = a - paramInt2;
      a = k;
    }
  }
  
  public final void a(StaggeredGridLayoutManager.c.a parama)
  {
    Object localObject = b;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      b = ((List)localObject);
    }
    int i = b.size();
    int j = 0;
    localObject = null;
    int k = 0;
    if (k < i)
    {
      localObject = (StaggeredGridLayoutManager.c.a)b.get(k);
      int m = a;
      int n = a;
      if (m == n)
      {
        List localList = b;
        localList.remove(k);
      }
      j = a;
      m = a;
      if (j >= m)
      {
        localObject = b;
        ((List)localObject).add(k, parama);
      }
    }
    for (;;)
    {
      return;
      j = k + 1;
      k = j;
      break;
      localObject = b;
      ((List)localObject).add(parama);
    }
  }
  
  final int b(int paramInt)
  {
    int i = -1;
    Object localObject1 = a;
    if (localObject1 == null) {}
    for (int j = i;; j = i)
    {
      return j;
      localObject1 = a;
      j = localObject1.length;
      if (paramInt < j) {
        break;
      }
    }
    localObject1 = b;
    Object localObject2;
    int k;
    int m;
    if (localObject1 != null)
    {
      localObject1 = d(paramInt);
      if (localObject1 != null)
      {
        localObject2 = b;
        ((List)localObject2).remove(localObject1);
      }
      localObject1 = b;
      k = ((List)localObject1).size();
      m = 0;
      localObject2 = null;
      label91:
      if (m >= k) {
        break label255;
      }
      localObject1 = (StaggeredGridLayoutManager.c.a)b.get(m);
      j = a;
      if (j < paramInt) {}
    }
    for (;;)
    {
      if (m != i)
      {
        localObject1 = (StaggeredGridLayoutManager.c.a)b.get(m);
        List localList = b;
        localList.remove(m);
      }
      for (j = a;; j = i)
      {
        if (j != i) {
          break label225;
        }
        localObject1 = a;
        localObject2 = a;
        m = localObject2.length;
        Arrays.fill((int[])localObject1, paramInt, m, i);
        localObject1 = a;
        j = localObject1.length;
        break;
        m += 1;
        break label91;
      }
      label225:
      localObject2 = a;
      k = j + 1;
      Arrays.fill((int[])localObject2, paramInt, k, i);
      j += 1;
      break;
      label255:
      m = i;
    }
  }
  
  final void b(int paramInt1, int paramInt2)
  {
    Object localObject = a;
    int i;
    if (localObject != null)
    {
      localObject = a;
      i = localObject.length;
      if (paramInt1 < i) {
        break label25;
      }
    }
    for (;;)
    {
      return;
      label25:
      i = paramInt1 + paramInt2;
      c(i);
      localObject = a;
      int[] arrayOfInt1 = a;
      int j = paramInt1 + paramInt2;
      int[] arrayOfInt2 = a;
      int k = arrayOfInt2.length - paramInt1 - paramInt2;
      System.arraycopy(localObject, paramInt1, arrayOfInt1, j, k);
      localObject = a;
      int m = paramInt1 + paramInt2;
      j = -1;
      Arrays.fill((int[])localObject, paramInt1, m, j);
      localObject = b;
      if (localObject != null)
      {
        localObject = b;
        i = ((List)localObject).size() + -1;
        for (m = i; m >= 0; m = i)
        {
          localObject = (StaggeredGridLayoutManager.c.a)b.get(m);
          j = a;
          if (j >= paramInt1)
          {
            j = a + paramInt2;
            a = j;
          }
          i = m + -1;
        }
      }
    }
  }
  
  final void c(int paramInt)
  {
    int i = -1;
    int[] arrayOfInt1 = a;
    int j;
    if (arrayOfInt1 == null)
    {
      j = Math.max(paramInt, 10) + 1;
      arrayOfInt1 = new int[j];
      a = arrayOfInt1;
      arrayOfInt1 = a;
      Arrays.fill(arrayOfInt1, i);
    }
    for (;;)
    {
      return;
      arrayOfInt1 = a;
      j = arrayOfInt1.length;
      if (paramInt >= j)
      {
        int[] arrayOfInt2 = a;
        arrayOfInt1 = a;
        j = arrayOfInt1.length;
        while (j <= paramInt) {
          j *= 2;
        }
        arrayOfInt1 = new int[j];
        a = arrayOfInt1;
        arrayOfInt1 = a;
        int k = arrayOfInt2.length;
        System.arraycopy(arrayOfInt2, 0, arrayOfInt1, 0, k);
        arrayOfInt1 = a;
        int m = arrayOfInt2.length;
        int[] arrayOfInt3 = a;
        k = arrayOfInt3.length;
        Arrays.fill(arrayOfInt1, m, k, i);
      }
    }
  }
  
  public final StaggeredGridLayoutManager.c.a d(int paramInt)
  {
    Object localObject = b;
    int i;
    if (localObject == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (StaggeredGridLayoutManager.c.a)localObject;
      localObject = b;
      i = ((List)localObject).size() + -1;
      for (int j = i;; j = i)
      {
        if (j < 0) {
          break label75;
        }
        localObject = (StaggeredGridLayoutManager.c.a)b.get(j);
        int k = a;
        if (k == paramInt) {
          break;
        }
        i = j + -1;
      }
      label75:
      i = 0;
      localObject = null;
    }
  }
}


/* Location:              android/support/v7/widget/StaggeredGridLayoutManager$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */