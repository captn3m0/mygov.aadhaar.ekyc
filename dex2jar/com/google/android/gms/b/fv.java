package com.google.android.gms.b;

import java.util.List;

public abstract class fv<M extends fv<M>>
  extends gb
{
  protected fx ag;
  
  protected int a()
  {
    int j = 0;
    if (ag != null)
    {
      int i = 0;
      for (;;)
      {
        k = i;
        if (j >= ag.d) {
          break;
        }
        i += ag.c[j].a();
        j += 1;
      }
    }
    int k = 0;
    return k;
  }
  
  public void a(fu paramfu)
  {
    if (ag == null) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < ag.d)
      {
        ag.c[i].a(paramfu);
        i += 1;
      }
    }
  }
  
  protected final boolean a(ft paramft, int paramInt)
  {
    int j = paramft.j();
    if (!paramft.b(paramInt)) {
      return false;
    }
    int i = ge.b(paramInt);
    int k = paramft.j() - j;
    gd localgd;
    label70:
    Object localObject;
    if (k == 0)
    {
      paramft = ge.l;
      localgd = new gd(paramInt, paramft);
      if (ag != null) {
        break label159;
      }
      ag = new fx();
      paramft = null;
      localObject = paramft;
      if (paramft == null)
      {
        localObject = new fy();
        paramft = ag;
        paramInt = paramft.b(i);
        if (paramInt < 0) {
          break label201;
        }
        c[paramInt] = localObject;
      }
    }
    for (;;)
    {
      a.add(localgd);
      return true;
      localObject = new byte[k];
      int m = b;
      System.arraycopy(a, j + m, localObject, 0, k);
      paramft = (ft)localObject;
      break;
      label159:
      paramft = ag;
      paramInt = paramft.b(i);
      if ((paramInt < 0) || (c[paramInt] == fx.a))
      {
        paramft = null;
        break label70;
      }
      paramft = c[paramInt];
      break label70;
      label201:
      paramInt ^= 0xFFFFFFFF;
      if ((paramInt < d) && (c[paramInt] == fx.a))
      {
        b[paramInt] = i;
        c[paramInt] = localObject;
      }
      else
      {
        if (d >= b.length)
        {
          j = fx.a(d + 1);
          int[] arrayOfInt = new int[j];
          fy[] arrayOffy = new fy[j];
          System.arraycopy(b, 0, arrayOfInt, 0, b.length);
          System.arraycopy(c, 0, arrayOffy, 0, c.length);
          b = arrayOfInt;
          c = arrayOffy;
        }
        if (d - paramInt != 0)
        {
          System.arraycopy(b, paramInt, b, paramInt + 1, d - paramInt);
          System.arraycopy(c, paramInt, c, paramInt + 1, d - paramInt);
        }
        b[paramInt] = i;
        c[paramInt] = localObject;
        d += 1;
      }
    }
  }
  
  public M c()
  {
    fv localfv = (fv)super.d();
    fz.a(this, localfv);
    return localfv;
  }
}


/* Location:              com/google/android/gms/b/fv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */