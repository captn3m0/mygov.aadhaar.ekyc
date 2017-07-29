package android.support.a.a;

import android.graphics.Path;

class g$d
{
  protected d.b[] m = null;
  String n;
  int o;
  
  public g$d() {}
  
  public g$d(d paramd)
  {
    Object localObject = n;
    n = ((String)localObject);
    int i = o;
    o = i;
    localObject = d.a(m);
    m = ((d.b[])localObject);
  }
  
  public final void a(Path paramPath)
  {
    paramPath.reset();
    Object localObject1 = this;
    Object localObject2 = m;
    d.b[] arrayOfb;
    Object localObject3;
    int i;
    int j;
    int k;
    float f2;
    Object localObject4;
    float f3;
    float f4;
    float f5;
    float f6;
    float f7;
    int i8;
    float f8;
    int i10;
    float f9;
    float f10;
    float f11;
    float f12;
    label345:
    label532:
    int i11;
    if (localObject2 != null)
    {
      arrayOfb = m;
      localObject1 = new float[6];
      localObject3 = localObject1;
      i = 109;
      f1 = 1.53E-43F;
      localObject2 = null;
      j = 0;
      k = i;
      f2 = f1;
      localObject1 = arrayOfb;
      i = arrayOfb.length;
      if (j < i)
      {
        int i5 = a;
        int i6 = i5;
        localObject1 = b;
        localObject4 = localObject1;
        int i7 = 2;
        f3 = 2.8E-45F;
        f4 = localObject3[0];
        f5 = localObject3[1];
        f6 = localObject3[2];
        i = 3;
        f1 = localObject3[i];
        f7 = localObject3[4];
        i8 = 5;
        f8 = localObject3[i8];
        int i9;
        switch (i5)
        {
        default: 
          i9 = i7;
          i7 = 0;
          f3 = 0.0F;
          i10 = 0;
          f9 = f8;
          f10 = f7;
          f11 = f5;
          f12 = f4;
          localObject1 = localObject4;
          i8 = localObject4.length;
          if (i10 < i8) {
            switch (i6)
            {
            default: 
              f8 = f9;
              f7 = f10;
              f5 = f11;
              f4 = f12;
            }
          }
          break;
        case 90: 
        case 122: 
        case 76: 
        case 77: 
        case 84: 
        case 108: 
        case 109: 
        case 116: 
        case 72: 
        case 86: 
        case 104: 
        case 118: 
        case 67: 
        case 99: 
        case 81: 
        case 83: 
        case 113: 
        case 115: 
        case 65: 
        case 97: 
          for (;;)
          {
            i10 += i9;
            f9 = f8;
            f10 = f7;
            f11 = f5;
            f12 = f4;
            k = i6;
            break label345;
            paramPath.close();
            localObject1 = paramPath;
            paramPath.moveTo(f7, f8);
            f1 = f8;
            f6 = f7;
            f5 = f8;
            f4 = f7;
            i9 = i7;
            break;
            i7 = 2;
            f3 = 2.8E-45F;
            i9 = i7;
            break;
            i7 = 1;
            f3 = Float.MIN_VALUE;
            i9 = i7;
            break;
            i7 = 6;
            f3 = 8.4E-45F;
            i9 = i7;
            break;
            i7 = 4;
            f3 = 5.6E-45F;
            i9 = i7;
            break;
            i7 = 7;
            f3 = 9.8E-45F;
            i9 = i7;
            break;
            k = i10 + 0;
            f2 = localObject4[k];
            f7 = f12 + f2;
            k = i10 + 1;
            f2 = localObject4[k];
            f8 = f11 + f2;
            if (i10 > 0)
            {
              k = i10 + 0;
              f2 = localObject4[k];
              i11 = i10 + 1;
              f5 = localObject4[i11];
              localObject1 = paramPath;
              paramPath.rLineTo(f2, f5);
              f5 = f8;
              f4 = f7;
              f8 = f9;
              f7 = f10;
            }
            else
            {
              k = i10 + 0;
              f2 = localObject4[k];
              i11 = i10 + 1;
              f5 = localObject4[i11];
              localObject1 = paramPath;
              paramPath.rMoveTo(f2, f5);
              f5 = f8;
              f4 = f7;
              continue;
              k = i10 + 0;
              f7 = localObject4[k];
              k = i10 + 1;
              f8 = localObject4[k];
              if (i10 > 0)
              {
                k = i10 + 0;
                f2 = localObject4[k];
                i11 = i10 + 1;
                f5 = localObject4[i11];
                localObject1 = paramPath;
                paramPath.lineTo(f2, f5);
                f5 = f8;
                f4 = f7;
                f8 = f9;
                f7 = f10;
              }
              else
              {
                k = i10 + 0;
                f2 = localObject4[k];
                i11 = i10 + 1;
                f5 = localObject4[i11];
                localObject1 = paramPath;
                paramPath.moveTo(f2, f5);
                f5 = f8;
                f4 = f7;
                continue;
                k = i10 + 0;
                f2 = localObject4[k];
                i8 = i10 + 1;
                f8 = localObject4[i8];
                localObject1 = paramPath;
                paramPath.rLineTo(f2, f8);
                k = i10 + 0;
                f2 = localObject4[k];
                f7 = f12 + f2;
                k = i10 + 1;
                f2 = localObject4[k];
                f5 = f11 + f2;
                f4 = f7;
                f8 = f9;
                f7 = f10;
                continue;
                k = i10 + 0;
                f2 = localObject4[k];
                i8 = i10 + 1;
                f8 = localObject4[i8];
                localObject1 = paramPath;
                paramPath.lineTo(f2, f8);
                k = i10 + 0;
                f7 = localObject4[k];
                k = i10 + 1;
                f5 = localObject4[k];
                f4 = f7;
                f8 = f9;
                f7 = f10;
                continue;
                k = i10 + 0;
                f2 = localObject4[k];
                i8 = 0;
                localObject1 = paramPath;
                paramPath.rLineTo(f2, 0.0F);
                k = i10 + 0;
                f2 = localObject4[k];
                f7 = f12 + f2;
                f8 = f9;
                f5 = f11;
                f4 = f7;
                f7 = f10;
                continue;
                k = i10 + 0;
                f2 = localObject4[k];
                localObject1 = paramPath;
                paramPath.lineTo(f2, f11);
                k = i10 + 0;
                f7 = localObject4[k];
                f8 = f9;
                f5 = f11;
                f4 = f7;
                f7 = f10;
                continue;
                localObject2 = null;
                i8 = i10 + 0;
                f8 = localObject4[i8];
                localObject1 = paramPath;
                paramPath.rLineTo(0.0F, f8);
                k = i10 + 0;
                f2 = localObject4[k];
                f8 = f11 + f2;
                f7 = f10;
                f5 = f8;
                f4 = f12;
                f8 = f9;
                continue;
                k = i10 + 0;
                f2 = localObject4[k];
                localObject1 = paramPath;
                paramPath.lineTo(f12, f2);
                k = i10 + 0;
                f8 = localObject4[k];
                f7 = f10;
                f5 = f8;
                f4 = f12;
                f8 = f9;
                continue;
                k = i10 + 0;
                f1 = localObject4[k];
                k = i10 + 1;
                f8 = localObject4[k];
                k = i10 + 2;
                f6 = localObject4[k];
                k = i10 + 3;
                f7 = localObject4[k];
                k = i10 + 4;
                f5 = localObject4[k];
                k = i10 + 5;
                f4 = localObject4[k];
                localObject2 = paramPath;
                paramPath.rCubicTo(f1, f8, f6, f7, f5, f4);
                k = i10 + 2;
                f2 = localObject4[k];
                f6 = f12 + f2;
                k = i10 + 3;
                f2 = localObject4[k];
                f1 = f11 + f2;
                k = i10 + 4;
                f2 = localObject4[k];
                f7 = f12 + f2;
                k = i10 + 5;
                f2 = localObject4[k];
                f5 = f11 + f2;
                f4 = f7;
                f8 = f9;
                f7 = f10;
                continue;
                k = i10 + 0;
                f1 = localObject4[k];
                k = i10 + 1;
                f8 = localObject4[k];
                k = i10 + 2;
                f6 = localObject4[k];
                k = i10 + 3;
                f7 = localObject4[k];
                k = i10 + 4;
                f5 = localObject4[k];
                k = i10 + 5;
                f4 = localObject4[k];
                localObject2 = paramPath;
                paramPath.cubicTo(f1, f8, f6, f7, f5, f4);
                k = i10 + 4;
                f7 = localObject4[k];
                k = i10 + 5;
                f8 = localObject4[k];
                k = i10 + 2;
                f6 = localObject4[k];
                k = i10 + 3;
                f1 = localObject4[k];
                f5 = f8;
                f4 = f7;
                f8 = f9;
                f7 = f10;
              }
            }
          }
          f7 = 0.0F;
          i8 = 0;
          f8 = 0.0F;
          i11 = 99;
          f5 = 1.39E-43F;
          if (k != i11)
          {
            i11 = 115;
            f5 = 1.61E-43F;
            if (k != i11)
            {
              i11 = 67;
              f5 = 9.4E-44F;
              if (k != i11)
              {
                i11 = 83;
                f5 = 1.16E-43F;
                if (k != i11) {
                  break label3424;
                }
              }
            }
          }
          f2 = f12 - f6;
          f8 = f11 - f1;
        }
      }
    }
    for (float f1 = f2;; f1 = 0.0F)
    {
      k = i10 + 0;
      f6 = localObject4[k];
      k = i10 + 1;
      f7 = localObject4[k];
      k = i10 + 2;
      f5 = localObject4[k];
      k = i10 + 3;
      f4 = localObject4[k];
      localObject2 = paramPath;
      paramPath.rCubicTo(f1, f8, f6, f7, f5, f4);
      k = i10 + 0;
      f2 = localObject4[k];
      f6 = f12 + f2;
      k = i10 + 1;
      f2 = localObject4[k];
      f1 = f11 + f2;
      k = i10 + 2;
      f2 = localObject4[k];
      f7 = f12 + f2;
      k = i10 + 3;
      f2 = localObject4[k];
      f5 = f11 + f2;
      f4 = f7;
      f8 = f9;
      f7 = f10;
      break label532;
      i8 = 99;
      f8 = 1.39E-43F;
      if (k != i8)
      {
        i8 = 115;
        f8 = 1.61E-43F;
        if (k != i8)
        {
          i8 = 67;
          f8 = 9.4E-44F;
          if (k != i8)
          {
            i8 = 83;
            f8 = 1.16E-43F;
            if (k != i8) {
              break label3413;
            }
          }
        }
      }
      f12 = 2.0F * f12 - f6;
      k = 1073741824;
      f2 = 2.0F * f11;
      f8 = f2 - f1;
      for (f1 = f12;; f1 = f12)
      {
        k = i10 + 0;
        f6 = localObject4[k];
        k = i10 + 1;
        f7 = localObject4[k];
        k = i10 + 2;
        f5 = localObject4[k];
        k = i10 + 3;
        f4 = localObject4[k];
        localObject2 = paramPath;
        paramPath.cubicTo(f1, f8, f6, f7, f5, f4);
        k = i10 + 0;
        f6 = localObject4[k];
        k = i10 + 1;
        f1 = localObject4[k];
        k = i10 + 2;
        f7 = localObject4[k];
        k = i10 + 3;
        f5 = localObject4[k];
        f4 = f7;
        f8 = f9;
        f7 = f10;
        break label532;
        k = i10 + 0;
        f2 = localObject4[k];
        i = i10 + 1;
        f1 = localObject4[i];
        i8 = i10 + 2;
        f8 = localObject4[i8];
        int i12 = i10 + 3;
        f6 = localObject4[i12];
        localObject1 = paramPath;
        paramPath.rQuadTo(f2, f1, f8, f6);
        k = i10 + 0;
        f2 = localObject4[k];
        f6 = f12 + f2;
        k = i10 + 1;
        f2 = localObject4[k];
        f1 = f11 + f2;
        k = i10 + 2;
        f2 = localObject4[k];
        f7 = f12 + f2;
        k = i10 + 3;
        f2 = localObject4[k];
        f5 = f11 + f2;
        f4 = f7;
        f8 = f9;
        f7 = f10;
        break label532;
        k = i10 + 0;
        f2 = localObject4[k];
        i = i10 + 1;
        f1 = localObject4[i];
        i8 = i10 + 2;
        f8 = localObject4[i8];
        i12 = i10 + 3;
        f6 = localObject4[i12];
        localObject1 = paramPath;
        paramPath.quadTo(f2, f1, f8, f6);
        k = i10 + 0;
        f6 = localObject4[k];
        k = i10 + 1;
        f1 = localObject4[k];
        k = i10 + 2;
        f7 = localObject4[k];
        k = i10 + 3;
        f5 = localObject4[k];
        f4 = f7;
        f8 = f9;
        f7 = f10;
        break label532;
        f7 = 0.0F;
        i8 = 0;
        f8 = 0.0F;
        i11 = 113;
        f5 = 1.58E-43F;
        if (k != i11)
        {
          i11 = 116;
          f5 = 1.63E-43F;
          if (k != i11)
          {
            i11 = 81;
            f5 = 1.14E-43F;
            if (k != i11)
            {
              i11 = 84;
              f5 = 1.18E-43F;
              if (k != i11) {
                break label3396;
              }
            }
          }
        }
        f8 = f12 - f6;
        f2 = f11 - f1;
        for (f1 = f8;; f1 = 0.0F)
        {
          i8 = i10 + 0;
          f8 = localObject4[i8];
          i12 = i10 + 1;
          f6 = localObject4[i12];
          localObject1 = paramPath;
          paramPath.rQuadTo(f1, f2, f8, f6);
          f6 = f12 + f1;
          f1 = f11 + f2;
          k = i10 + 0;
          f2 = localObject4[k];
          f7 = f12 + f2;
          k = i10 + 1;
          f2 = localObject4[k];
          f5 = f11 + f2;
          f4 = f7;
          f8 = f9;
          f7 = f10;
          break label532;
          i8 = 113;
          f8 = 1.58E-43F;
          if (k != i8)
          {
            i8 = 116;
            f8 = 1.63E-43F;
            if (k != i8)
            {
              i8 = 81;
              f8 = 1.14E-43F;
              if (k != i8)
              {
                i8 = 84;
                f8 = 1.18E-43F;
                if (k != i8) {
                  break label2773;
                }
              }
            }
          }
          f12 = 2.0F * f12 - f6;
          k = 1073741824;
          f2 = 2.0F * f11;
          f11 = f2 - f1;
          label2773:
          k = i10 + 0;
          f2 = localObject4[k];
          i = i10 + 1;
          f1 = localObject4[i];
          localObject1 = paramPath;
          paramPath.quadTo(f12, f11, f2, f1);
          k = i10 + 0;
          f7 = localObject4[k];
          k = i10 + 1;
          f8 = localObject4[k];
          f1 = f11;
          f6 = f12;
          f5 = f8;
          f4 = f7;
          f8 = f9;
          f7 = f10;
          break label532;
          k = i10 + 5;
          f6 = localObject4[k] + f12;
          k = i10 + 6;
          f7 = localObject4[k] + f11;
          k = i10 + 0;
          f5 = localObject4[k];
          k = i10 + 1;
          f4 = localObject4[k];
          k = i10 + 2;
          f3 = localObject4[k];
          k = i10 + 3;
          f2 = localObject4[k];
          i = 0;
          f1 = 0.0F;
          boolean bool1 = f2 < 0.0F;
          boolean bool5;
          if (bool1)
          {
            bool5 = true;
            label2971:
            int i1 = i10 + 4;
            f2 = localObject4[i1];
            i = 0;
            f1 = 0.0F;
            boolean bool2 = f2 < 0.0F;
            if (!bool2) {
              break label3102;
            }
          }
          label3102:
          for (boolean bool6 = true;; bool6 = false)
          {
            localObject2 = paramPath;
            f1 = f12;
            f8 = f11;
            d.b.a(paramPath, f12, f11, f6, f7, f5, f4, f3, bool5, bool6);
            i2 = i10 + 5;
            f2 = localObject4[i2];
            f6 = f12 + f2;
            i2 = i10 + 6;
            f2 = localObject4[i2];
            f1 = f11 + f2;
            f8 = f9;
            f7 = f10;
            f5 = f1;
            f4 = f6;
            break;
            bool5 = false;
            break label2971;
          }
          int i2 = i10 + 5;
          f6 = localObject4[i2];
          i2 = i10 + 6;
          f7 = localObject4[i2];
          i2 = i10 + 0;
          f5 = localObject4[i2];
          i2 = i10 + 1;
          f4 = localObject4[i2];
          i2 = i10 + 2;
          f3 = localObject4[i2];
          i2 = i10 + 3;
          f2 = localObject4[i2];
          i = 0;
          f1 = 0.0F;
          boolean bool3 = f2 < 0.0F;
          if (bool3)
          {
            bool5 = true;
            label3207:
            int i3 = i10 + 4;
            f2 = localObject4[i3];
            i = 0;
            f1 = 0.0F;
            boolean bool4 = f2 < 0.0F;
            if (!bool4) {
              break label3324;
            }
          }
          label3324:
          for (bool6 = true;; bool6 = false)
          {
            localObject2 = paramPath;
            f1 = f12;
            f8 = f11;
            d.b.a(paramPath, f12, f11, f6, f7, f5, f4, f3, bool5, bool6);
            i4 = i10 + 5;
            f6 = localObject4[i4];
            i4 = i10 + 6;
            f1 = localObject4[i4];
            f8 = f9;
            f7 = f10;
            f5 = f1;
            f4 = f6;
            break;
            bool5 = false;
            break label3207;
          }
          localObject3[0] = f12;
          localObject3[1] = f11;
          localObject3[2] = f6;
          localObject3[3] = f1;
          localObject3[4] = f10;
          f2 = 7.0E-45F;
          localObject3[5] = f9;
          localObject2 = arrayOfb[j];
          i = a;
          j += 1;
          int i4 = i;
          break;
          return;
          label3396:
          i4 = 0;
          localObject2 = null;
          f2 = 0.0F;
          i = 0;
        }
        label3413:
        f8 = f11;
      }
      label3424:
      i = 0;
    }
  }
  
  public boolean a()
  {
    return false;
  }
  
  public d.b[] getPathData()
  {
    return m;
  }
  
  public String getPathName()
  {
    return n;
  }
  
  public void setPathData(d.b[] paramArrayOfb)
  {
    d.b[] arrayOfb1 = m;
    int i;
    d.b[] arrayOfb2;
    if ((arrayOfb1 == null) || (paramArrayOfb == null))
    {
      i = 0;
      arrayOfb2 = null;
    }
    Object localObject2;
    int k;
    while (i == 0)
    {
      arrayOfb2 = d.a(paramArrayOfb);
      m = arrayOfb2;
      return;
      i = arrayOfb1.length;
      int j = paramArrayOfb.length;
      if (i != j)
      {
        i = 0;
        arrayOfb2 = null;
      }
      else
      {
        i = 0;
        arrayOfb2 = null;
        for (;;)
        {
          j = arrayOfb1.length;
          if (i >= j) {
            break label150;
          }
          localObject1 = arrayOfb1[i];
          j = a;
          localObject2 = paramArrayOfb[i];
          k = a;
          if (j == k)
          {
            localObject1 = b;
            j = localObject1.length;
            localObject2 = b;
            k = localObject2.length;
            if (j == k) {}
          }
          else
          {
            i = 0;
            arrayOfb2 = null;
            break;
          }
          i += 1;
        }
        label150:
        i = 1;
      }
    }
    Object localObject1 = m;
    int i1 = 0;
    arrayOfb1 = null;
    for (;;)
    {
      i = paramArrayOfb.length;
      if (i1 >= i) {
        break;
      }
      arrayOfb2 = localObject1[i1];
      localObject2 = paramArrayOfb[i1];
      k = a;
      a = k;
      i = 0;
      arrayOfb2 = null;
      for (;;)
      {
        localObject2 = b;
        k = localObject2.length;
        if (i >= k) {
          break;
        }
        localObject2 = b;
        float[] arrayOfFloat = b;
        float f = arrayOfFloat[i];
        localObject2[i] = f;
        i += 1;
      }
      i = i1 + 1;
      i1 = i;
    }
  }
}


/* Location:              android/support/a/a/g$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */