package com.google.android.gms.b;

import java.util.List;

public abstract class fv
  extends gb
{
  protected fx ag;
  
  protected int a()
  {
    int i = 0;
    fx localfx = ag;
    if (localfx != null)
    {
      j = 0;
      localfx = null;
      for (;;)
      {
        Object localObject = ag;
        int k = d;
        if (i >= k) {
          break;
        }
        localObject = ag.c[i];
        k = ((fy)localObject).a();
        j += k;
        i += 1;
      }
    }
    int j = 0;
    localfx = null;
    return j;
  }
  
  public void a(fu paramfu)
  {
    fx localfx = ag;
    if (localfx == null) {
      return;
    }
    int i = 0;
    localfx = null;
    for (;;)
    {
      Object localObject = ag;
      int j = d;
      if (i >= j) {
        break;
      }
      localObject = ag.c[i];
      ((fy)localObject).a(paramfu);
      i += 1;
    }
  }
  
  protected final boolean a(ft paramft, int paramInt)
  {
    Object localObject1 = null;
    int i = 0;
    Object localObject2 = null;
    int j = paramft.j();
    boolean bool = paramft.b(paramInt);
    Object localObject3;
    if (!bool)
    {
      bool = false;
      localObject3 = null;
      return bool;
    }
    int m = ge.b(paramInt);
    int k = paramft.j();
    int n = k - j;
    label64:
    gd localgd;
    if (n == 0)
    {
      localObject3 = ge.l;
      localgd = new com/google/android/gms/b/gd;
      localgd.<init>(paramInt, (byte[])localObject3);
      localObject3 = ag;
      if (localObject3 != null) {
        break label217;
      }
      localObject3 = new com/google/android/gms/b/fx;
      ((fx)localObject3).<init>();
      ag = ((fx)localObject3);
      k = 0;
      localObject3 = null;
      label110:
      if (localObject3 == null)
      {
        localObject3 = new com/google/android/gms/b/fy;
        ((fy)localObject3).<init>();
        localObject1 = ag;
        n = ((fx)localObject1).b(m);
        if (n < 0) {
          break label281;
        }
        localObject1 = c;
        localObject1[n] = localObject3;
      }
    }
    for (;;)
    {
      localObject3 = a;
      ((List)localObject3).add(localgd);
      k = 1;
      break;
      localObject3 = new byte[n];
      int i1 = b;
      j += i1;
      Object localObject4 = a;
      System.arraycopy(localObject4, j, localObject3, 0, n);
      break label64;
      label217:
      localObject3 = ag;
      n = ((fx)localObject3).b(m);
      if (n >= 0)
      {
        localObject4 = c[n];
        localObject5 = fx.a;
        if (localObject4 != localObject5) {}
      }
      else
      {
        k = 0;
        localObject3 = null;
        break label110;
      }
      localObject3 = c[n];
      break label110;
      label281:
      n ^= 0xFFFFFFFF;
      i1 = d;
      if (n < i1)
      {
        localObject4 = c[n];
        localObject5 = fx.a;
        if (localObject4 == localObject5)
        {
          localObject2 = b;
          localObject2[n] = m;
          localObject1 = c;
          localObject1[n] = localObject3;
          continue;
        }
      }
      i1 = d;
      Object localObject5 = b;
      int i2 = localObject5.length;
      if (i1 >= i2)
      {
        i1 = fx.a(d + 1);
        localObject5 = new int[i1];
        localObject4 = new fy[i1];
        Object localObject6 = b;
        int i3 = b.length;
        System.arraycopy(localObject6, 0, localObject5, 0, i3);
        localObject6 = c;
        fy[] arrayOffy = c;
        i3 = arrayOffy.length;
        System.arraycopy(localObject6, 0, localObject4, 0, i3);
        b = ((int[])localObject5);
        c = ((fy[])localObject4);
      }
      i = d - n;
      if (i != 0)
      {
        localObject2 = b;
        localObject4 = b;
        i2 = n + 1;
        int i4 = d - n;
        System.arraycopy(localObject2, n, localObject4, i2, i4);
        localObject2 = c;
        localObject4 = c;
        i2 = n + 1;
        i4 = d - n;
        System.arraycopy(localObject2, n, localObject4, i2, i4);
      }
      b[n] = m;
      localObject2 = c;
      localObject2[n] = localObject3;
      i = d + 1;
      d = i;
    }
  }
  
  public fv c()
  {
    fv localfv = (fv)super.d();
    fz.a(this, localfv);
    return localfv;
  }
}


/* Location:              com/google/android/gms/b/fv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */