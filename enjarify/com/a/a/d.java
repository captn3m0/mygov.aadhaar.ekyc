package com.a.a;

public final class d
  implements p
{
  private int a;
  private int b;
  private final int c;
  private final float d;
  
  public d()
  {
    this(2500, 1);
  }
  
  public d(int paramInt1, int paramInt2)
  {
    a = paramInt1;
    c = paramInt2;
    d = 1.0F;
  }
  
  public final int a()
  {
    return a;
  }
  
  public final void a(s params)
  {
    int i = b + 1;
    b = i;
    float f1 = a;
    float f2 = a;
    float f3 = d;
    f2 *= f3;
    f1 += f2;
    i = (int)f1;
    a = i;
    i = b;
    int j = c;
    if (i <= j) {
      i = 1;
    }
    for (f1 = Float.MIN_VALUE; i == 0; f1 = 0.0F)
    {
      throw params;
      i = 0;
    }
  }
  
  public final int b()
  {
    return b;
  }
}


/* Location:              com/a/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */