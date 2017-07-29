package android.support.v7.widget;

import android.view.View;

final class ax
{
  static int a(at.r paramr, as paramas, View paramView1, View paramView2, at.g paramg, boolean paramBoolean)
  {
    int i = paramg.l();
    if (i != 0)
    {
      i = paramr.a();
      if ((i != 0) && (paramView1 != null) && (paramView2 != null)) {}
    }
    else
    {
      i = 0;
    }
    for (;;)
    {
      return i;
      int j;
      if (!paramBoolean)
      {
        i = at.g.a(paramView1);
        j = at.g.a(paramView2);
        i = Math.abs(i - j) + 1;
      }
      else
      {
        i = paramas.b(paramView2);
        j = paramas.a(paramView1);
        i -= j;
        j = paramas.e();
        i = Math.min(j, i);
      }
    }
  }
  
  static int a(at.r paramr, as paramas, View paramView1, View paramView2, at.g paramg, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    float f1 = 0.0F;
    int j = paramg.l();
    if (j != 0)
    {
      j = paramr.a();
      if ((j != 0) && (paramView1 != null) && (paramView2 != null)) {
        break label40;
      }
    }
    label40:
    label235:
    for (;;)
    {
      return i;
      j = at.g.a(paramView1);
      int k = at.g.a(paramView2);
      j = Math.min(j, k);
      k = at.g.a(paramView1);
      int m = at.g.a(paramView2);
      k = Math.max(k, m);
      if (paramBoolean2) {
        j = paramr.a() - k + -1;
      }
      for (i = Math.max(0, j);; i = Math.max(0, j))
      {
        if (!paramBoolean1) {
          break label235;
        }
        j = paramas.b(paramView2);
        k = paramas.a(paramView1);
        j = Math.abs(j - k);
        k = at.g.a(paramView1);
        m = at.g.a(paramView2);
        k = Math.abs(k - m) + 1;
        float f2 = j;
        float f3 = k;
        f2 /= f3;
        f1 = i * f2;
        j = paramas.b();
        k = paramas.a(paramView1);
        j -= k;
        f2 = j;
        f1 += f2;
        i = Math.round(f1);
        break;
      }
    }
  }
  
  static int b(at.r paramr, as paramas, View paramView1, View paramView2, at.g paramg, boolean paramBoolean)
  {
    int i = paramg.l();
    float f1;
    if (i != 0)
    {
      i = paramr.a();
      if ((i != 0) && (paramView1 != null) && (paramView2 != null)) {}
    }
    else
    {
      i = 0;
      f1 = 0.0F;
    }
    for (;;)
    {
      return i;
      if (!paramBoolean)
      {
        i = paramr.a();
      }
      else
      {
        i = paramas.b(paramView2);
        int j = paramas.a(paramView1);
        i -= j;
        j = at.g.a(paramView1);
        int k = at.g.a(paramView2);
        j = Math.abs(j - k) + 1;
        f1 = i;
        float f2 = j;
        f1 /= f2;
        j = paramr.a();
        f2 = j;
        f1 *= f2;
        i = (int)f1;
      }
    }
  }
}


/* Location:              android/support/v7/widget/ax.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */