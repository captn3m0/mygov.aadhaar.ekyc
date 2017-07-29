package com.google.android.gms.b;

import java.util.ArrayList;
import java.util.List;

public final class tz
{
  public final double[] a;
  public final double[] b;
  public final int[] c;
  public int d;
  private final String[] e;
  
  private tz(tz.b paramb)
  {
    int i = b.size();
    Object localObject = a;
    String[] arrayOfString = new String[i];
    localObject = (String[])((List)localObject).toArray(arrayOfString);
    e = ((String[])localObject);
    localObject = a(b);
    a = ((double[])localObject);
    localObject = a(c);
    b = ((double[])localObject);
    localObject = new int[i];
    c = ((int[])localObject);
    d = 0;
  }
  
  private static double[] a(List paramList)
  {
    double[] arrayOfDouble = new double[paramList.size()];
    int i = 0;
    Double localDouble = null;
    for (int j = 0;; j = i)
    {
      i = arrayOfDouble.length;
      if (j >= i) {
        break;
      }
      localDouble = (Double)paramList.get(j);
      double d1 = localDouble.doubleValue();
      arrayOfDouble[j] = d1;
      i = j + 1;
    }
    return arrayOfDouble;
  }
  
  public final List a()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = e.length;
    localArrayList.<init>(i);
    i = 0;
    Object localObject = null;
    for (int j = 0;; j = i)
    {
      localObject = e;
      i = localObject.length;
      if (j >= i) {
        break;
      }
      localObject = new com/google/android/gms/b/tz$a;
      String str = e[j];
      double[] arrayOfDouble1 = b;
      double d1 = arrayOfDouble1[j];
      double[] arrayOfDouble2 = a;
      double d2 = arrayOfDouble2[j];
      int[] arrayOfInt1 = c;
      int k = arrayOfInt1[j];
      double d3 = k;
      double d4 = d;
      d3 /= d4;
      int[] arrayOfInt2 = c;
      int m = arrayOfInt2[j];
      ((tz.a)localObject).<init>(str, d1, d2, d3, m);
      localArrayList.add(localObject);
      i = j + 1;
    }
    return localArrayList;
  }
}


/* Location:              com/google/android/gms/b/tz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */