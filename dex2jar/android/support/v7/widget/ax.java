package android.support.v7.widget;

import android.view.View;

final class ax
{
  static int a(at.r paramr, as paramas, View paramView1, View paramView2, at.g paramg, boolean paramBoolean)
  {
    if ((paramg.l() == 0) || (paramr.a() == 0) || (paramView1 == null) || (paramView2 == null)) {
      return 0;
    }
    if (!paramBoolean) {
      return Math.abs(at.g.a(paramView1) - at.g.a(paramView2)) + 1;
    }
    int i = paramas.b(paramView2);
    int j = paramas.a(paramView1);
    return Math.min(paramas.e(), i - j);
  }
  
  static int a(at.r paramr, as paramas, View paramView1, View paramView2, at.g paramg, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    int j = i;
    if (paramg.l() != 0)
    {
      j = i;
      if (paramr.a() != 0)
      {
        j = i;
        if (paramView1 != null)
        {
          if (paramView2 != null) {
            break label45;
          }
          j = i;
        }
      }
    }
    return j;
    label45:
    i = Math.min(at.g.a(paramView1), at.g.a(paramView2));
    j = Math.max(at.g.a(paramView1), at.g.a(paramView2));
    if (paramBoolean2) {}
    for (i = Math.max(0, paramr.a() - j - 1);; i = Math.max(0, i))
    {
      j = i;
      if (!paramBoolean1) {
        break;
      }
      j = Math.abs(paramas.b(paramView2) - paramas.a(paramView1));
      int k = Math.abs(at.g.a(paramView1) - at.g.a(paramView2));
      float f = j / (k + 1);
      return Math.round(i * f + (paramas.b() - paramas.a(paramView1)));
    }
  }
  
  static int b(at.r paramr, as paramas, View paramView1, View paramView2, at.g paramg, boolean paramBoolean)
  {
    if ((paramg.l() == 0) || (paramr.a() == 0) || (paramView1 == null) || (paramView2 == null)) {
      return 0;
    }
    if (!paramBoolean) {
      return paramr.a();
    }
    int i = paramas.b(paramView2);
    int j = paramas.a(paramView1);
    int k = Math.abs(at.g.a(paramView1) - at.g.a(paramView2));
    return (int)((i - j) / (k + 1) * paramr.a());
  }
}


/* Location:              android/support/v7/widget/ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */