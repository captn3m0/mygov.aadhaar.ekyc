package com.google.android.gms.b;

import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.b.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@qi
public final class tz
{
  public final double[] a;
  public final double[] b;
  public final int[] c;
  public int d;
  private final String[] e;
  
  private tz(b paramb)
  {
    int i = b.size();
    e = ((String[])a.toArray(new String[i]));
    a = a(b);
    b = a(c);
    c = new int[i];
    d = 0;
  }
  
  private static double[] a(List<Double> paramList)
  {
    double[] arrayOfDouble = new double[paramList.size()];
    int i = 0;
    while (i < arrayOfDouble.length)
    {
      arrayOfDouble[i] = ((Double)paramList.get(i)).doubleValue();
      i += 1;
    }
    return arrayOfDouble;
  }
  
  public final List<a> a()
  {
    ArrayList localArrayList = new ArrayList(e.length);
    int i = 0;
    while (i < e.length)
    {
      localArrayList.add(new a(e[i], b[i], a[i], c[i] / d, c[i]));
      i += 1;
    }
    return localArrayList;
  }
  
  public static final class a
  {
    public final String a;
    public final double b;
    public final double c;
    public final double d;
    public final int e;
    
    public a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt)
    {
      a = paramString;
      c = paramDouble1;
      b = paramDouble2;
      d = paramDouble3;
      e = paramInt;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof a)) {}
      do
      {
        return false;
        paramObject = (a)paramObject;
      } while ((!b.a(a, a)) || (b != b) || (c != c) || (e != e) || (Double.compare(d, d) != 0));
      return true;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { a, Double.valueOf(b), Double.valueOf(c), Double.valueOf(d), Integer.valueOf(e) });
    }
    
    public final String toString()
    {
      return b.a(this).a("name", a).a("minBound", Double.valueOf(c)).a("maxBound", Double.valueOf(b)).a("percent", Double.valueOf(d)).a("count", Integer.valueOf(e)).toString();
    }
  }
  
  public static final class b
  {
    final List<String> a = new ArrayList();
    final List<Double> b = new ArrayList();
    final List<Double> c = new ArrayList();
    
    public final b a(String paramString, double paramDouble1, double paramDouble2)
    {
      int i = 0;
      while (i < a.size())
      {
        double d1 = ((Double)c.get(i)).doubleValue();
        double d2 = ((Double)b.get(i)).doubleValue();
        if ((paramDouble1 < d1) || ((d1 == paramDouble1) && (paramDouble2 < d2))) {
          break;
        }
        i += 1;
      }
      a.add(i, paramString);
      c.add(i, Double.valueOf(paramDouble1));
      b.add(i, Double.valueOf(paramDouble2));
      return this;
    }
  }
}


/* Location:              com/google/android/gms/b/tz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */