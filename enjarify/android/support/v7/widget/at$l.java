package android.support.v7.widget;

import android.util.SparseArray;

public final class at$l
{
  SparseArray a;
  int b;
  
  public at$l()
  {
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    a = localSparseArray;
    b = 0;
  }
  
  static long a(long paramLong1, long paramLong2)
  {
    long l1 = 4;
    long l2 = 0L;
    boolean bool = paramLong1 < l2;
    if (!bool) {}
    for (;;)
    {
      return paramLong2;
      l2 = paramLong1 / l1 * 3;
      long l3 = paramLong2 / l1;
      paramLong2 = l2 + l3;
    }
  }
  
  final at.l.a a(int paramInt)
  {
    at.l.a locala = (at.l.a)a.get(paramInt);
    if (locala == null)
    {
      locala = new android/support/v7/widget/at$l$a;
      locala.<init>();
      SparseArray localSparseArray = a;
      localSparseArray.put(paramInt, locala);
    }
    return locala;
  }
  
  final void a()
  {
    int i = b + 1;
    b = i;
  }
  
  final void b()
  {
    int i = b + -1;
    b = i;
  }
}


/* Location:              android/support/v7/widget/at$l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */