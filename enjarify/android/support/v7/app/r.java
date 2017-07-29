package android.support.v7.app;

final class r
{
  static r a;
  public long b;
  public long c;
  public int d;
  
  public final void a(long paramLong, double paramDouble1, double paramDouble2)
  {
    long l1 = paramLong - 946728000000L;
    float f1 = (float)l1 / 8.64E7F;
    float f2 = 0.01720197F * f1;
    float f3 = 6.24006F + f2;
    double d1 = f3;
    double d2 = Math.sin(f3);
    double d3 = 0.03341960161924362D * d2;
    d1 += d3;
    d2 = Math.sin(2.0F * f3);
    d3 = 3.4906598739326E-4D * d2;
    d1 += d3;
    d2 = Math.sin(3.0F * f3);
    d3 = 5.236000106378924E-6D * d2;
    d1 = d1 + d3 + 1.796593063D + 3.141592653589793D;
    d3 = -paramDouble2 / 360.0D;
    f1 = (float)Math.round(f1 - 9.0E-4F - d3);
    float f4 = 9.0E-4F;
    f1 += f4;
    d2 = f1;
    d3 += d2;
    double d4 = Math.sin(f3) * 0.0053D + d3;
    d2 = Math.sin(2.0D * d1);
    d3 = -0.0069D * d2;
    d4 += d3;
    d1 = Math.sin(d1);
    d3 = Math.sin(0.4092797040939331D);
    d1 = Math.asin(d1 * d3);
    d3 = 0.01745329238474369D * paramDouble1;
    long l2 = -4631161762379464704L;
    d2 = Math.sin(-0.10471975803375244D);
    double d5 = Math.sin(d3);
    double d6 = Math.sin(d1);
    d5 *= d6;
    d2 -= d5;
    d3 = Math.cos(d3);
    d1 = Math.cos(d1) * d3;
    d1 = d2 / d1;
    long l3 = 4607182418800017408L;
    d3 = 1.0D;
    boolean bool = d1 < d3;
    int i;
    if (!bool)
    {
      i = 1;
      f1 = Float.MIN_VALUE;
      d = i;
      b = -1;
      l1 = -1;
      d4 = 0.0D / 0.0D;
      c = l1;
    }
    for (;;)
    {
      return;
      l3 = -4616189618054758400L;
      d3 = -1.0D;
      bool = d1 < d3;
      if (!bool)
      {
        i = 0;
        f1 = 0.0F;
        d = 0;
        b = -1;
        l1 = -1;
        d4 = 0.0D / 0.0D;
        c = l1;
      }
      else
      {
        f2 = (float)(Math.acos(d1) / 6.283185307179586D);
        d3 = (f2 + d4) * 8.64E7D;
        l3 = Math.round(d3);
        l2 = 946728000000L;
        d2 = 4.67745780756E-312D;
        l3 += l2;
        b = l3;
        d1 = f2;
        d4 = (d4 - d1) * 8.64E7D;
        l1 = Math.round(d4);
        long l4 = 946728000000L;
        d1 = 4.67745780756E-312D;
        l1 += l4;
        c = l1;
        l1 = c;
        i = l1 < paramLong;
        if (i < 0)
        {
          l1 = b;
          i = l1 < paramLong;
          if (i > 0)
          {
            i = 0;
            f1 = 0.0F;
            d = 0;
            continue;
          }
        }
        i = 1;
        f1 = Float.MIN_VALUE;
        d = i;
      }
    }
  }
}


/* Location:              android/support/v7/app/r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */