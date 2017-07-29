package android.support.a.a;

import android.graphics.Path;
import android.util.Log;

public final class d$b
{
  char a;
  float[] b;
  
  d$b(char paramChar, float[] paramArrayOfFloat)
  {
    a = paramChar;
    b = paramArrayOfFloat;
  }
  
  d$b(b paramb)
  {
    char c = a;
    a = c;
    float[] arrayOfFloat = b;
    int i = b.length;
    arrayOfFloat = d.a(arrayOfFloat, i);
    b = arrayOfFloat;
  }
  
  private static void a(Path paramPath, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9)
  {
    int i = (int)Math.ceil(Math.abs(4.0D * paramDouble9 / 3.141592653589793D));
    int j = i;
    double d1 = Math.cos(paramDouble7);
    double d2 = Math.sin(paramDouble7);
    double d3 = Math.cos(paramDouble8);
    double d4 = Math.sin(paramDouble8);
    double d5 = paramDouble3;
    double d6 = -paramDouble3 * d1 * d4;
    double d7 = paramDouble4 * d2 * d3;
    d6 -= d7;
    d7 = -paramDouble3 * d2;
    d4 *= d7;
    d7 = paramDouble4 * d1;
    d3 = d3 * d7 + d4;
    d4 = i;
    double d8 = paramDouble9 / d4;
    float f1 = 0.0F;
    int k = 0;
    for (;;)
    {
      i = j;
      if (k >= j) {
        break;
      }
      double d9 = paramDouble8 + d8;
      d4 = Math.sin(d9);
      double d10 = Math.cos(d9);
      double d11 = paramDouble3 * d1 * d10 + paramDouble1;
      double d12 = paramDouble4 * d2 * d4;
      double d13 = d11 - d12;
      d11 = paramDouble3 * d2 * d10 + paramDouble2;
      d12 = paramDouble4 * d1 * d4 + d11;
      d5 = paramDouble3;
      d11 = -paramDouble3 * d1 * d4;
      double d14 = paramDouble4 * d2 * d10;
      d11 -= d14;
      d5 = -paramDouble3;
      d14 = d5;
      d14 = d5 * d2;
      d4 *= d14;
      d14 = paramDouble4 * d1;
      d10 = d10 * d14 + d4;
      d4 = Math.tan((d9 - paramDouble8) / 2.0D);
      d14 = Math.sin(d9 - paramDouble8);
      double d15 = 3.0D * d4;
      d4 = (Math.sqrt(d4 * d15 + 4.0D) - 1.0D) * d14 / 3.0D;
      d6 = d6 * d4 + paramDouble5;
      d3 *= d4;
      d14 = paramDouble6 + d3;
      d3 = d4 * d11;
      double d16 = d13 - d3;
      d3 = d4 * d10;
      d4 = d12 - d3;
      paramPath.rLineTo(0.0F, 0.0F);
      float f2 = (float)d6;
      d5 = d14;
      float f3 = (float)d14;
      d5 = d16;
      float f4 = (float)d16;
      f1 = (float)d4;
      d5 = d13;
      float f5 = (float)d13;
      d5 = d12;
      float f6 = (float)d12;
      paramPath.cubicTo(f2, f3, f4, f1, f5, f6);
      int m = k + 1;
      d6 = d11;
      paramDouble8 = d9;
      k = m;
      paramDouble6 = d12;
      paramDouble5 = d13;
      d3 = d10;
    }
  }
  
  static void a(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = paramPath;
    double d1;
    double d2;
    double d3;
    double d4;
    double d5;
    double d6;
    double d7;
    double d8;
    float f;
    double d9;
    double d10;
    double d11;
    double d13;
    boolean bool;
    String str1;
    for (;;)
    {
      d1 = Math.toRadians(paramFloat7);
      d2 = Math.cos(d1);
      d3 = Math.sin(d1);
      d4 = paramFloat1 * d2;
      d5 = paramFloat2 * d3;
      d4 += d5;
      d5 = paramFloat5;
      d6 = d4 / d5;
      d4 = -paramFloat1 * d3;
      d5 = paramFloat2 * d2;
      d4 += d5;
      d5 = paramFloat6;
      d7 = d4 / d5;
      d4 = paramFloat3 * d2;
      d5 = paramFloat4 * d3;
      d4 += d5;
      d5 = paramFloat5;
      d8 = d4 / d5;
      f = -paramFloat3;
      d4 = f * d3;
      d5 = paramFloat4 * d2;
      d4 += d5;
      d5 = paramFloat6;
      d9 = d4 / d5;
      d4 = d6 - d8;
      d5 = d7 - d9;
      d10 = (d6 + d8) / 2.0D;
      d11 = (d7 + d9) / 2.0D;
      d12 = d4 * d4;
      d13 = d5 * d5;
      d12 += d13;
      d13 = 0.0D;
      bool = d12 < d13;
      if (!bool)
      {
        str1 = "PathParser";
        localObject1 = " Points are coincident";
        Log.w(str1, (String)localObject1);
        return;
      }
      d13 = 1.0D / d12 - 0.25D;
      double d14 = 0.0D;
      bool = d13 < d14;
      if (!bool) {
        break;
      }
      str1 = "PathParser";
      Object localObject2 = new java/lang/StringBuilder;
      String str2 = "Points are too far apart ";
      ((StringBuilder)localObject2).<init>(str2);
      localObject2 = d12;
      Log.w(str1, (String)localObject2);
      d4 = Math.sqrt(d12);
      d5 = 1.99999D;
      d4 /= d5;
      f = (float)d4;
      paramFloat5 *= f;
      paramFloat6 *= f;
    }
    double d12 = Math.sqrt(d13);
    d4 *= d12;
    d5 *= d12;
    if (paramBoolean1 == paramBoolean2)
    {
      d5 = d10 - d5;
      d4 += d11;
      label404:
      d7 -= d4;
      d6 -= d5;
      d10 = Math.atan2(d7, d6);
      d6 = d9 - d4;
      d7 = d8 - d5;
      d8 = Math.atan2(d6, d7) - d10;
      d6 = 0.0D;
      bool = d8 < d6;
      if (bool) {
        break label632;
      }
      bool = true;
      f = Float.MIN_VALUE;
      label475:
      if (paramBoolean2 != bool)
      {
        d6 = 0.0D;
        bool = d8 < d6;
        if (!bool) {
          break label644;
        }
        d6 = 6.283185307179586D;
      }
    }
    for (d8 -= d6;; d8 += d6)
    {
      d6 = paramFloat5;
      d5 *= d6;
      d6 = paramFloat6 * d4;
      d4 = d5 * d2;
      d7 = d6 * d3;
      d4 -= d7;
      d5 *= d3;
      d2 *= d6;
      d5 += d2;
      d2 = paramFloat5;
      d3 = paramFloat6;
      d6 = paramFloat1;
      d7 = paramFloat2;
      a((Path)localObject1, d4, d5, d2, d3, d6, d7, d1, d10, d8);
      break;
      d5 += d10;
      d4 = d11 - d4;
      break label404;
      label632:
      bool = false;
      f = 0.0F;
      str1 = null;
      break label475;
      label644:
      d6 = 6.283185307179586D;
    }
  }
}


/* Location:              android/support/a/a/d$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */