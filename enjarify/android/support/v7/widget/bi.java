package android.support.v7.widget;

import android.view.View;

final class bi
{
  final bi.b a;
  bi.a b;
  
  bi(bi.b paramb)
  {
    a = paramb;
    bi.a locala = new android/support/v7/widget/bi$a;
    locala.<init>();
    b = locala;
  }
  
  final View a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = a.a();
    bi.b localb1 = a;
    int j = localb1.b();
    if (paramInt2 > paramInt1) {}
    Object localObject1;
    Object localObject2;
    Object localObject3;
    boolean bool;
    for (int k = 1;; k = -1)
    {
      localObject1 = null;
      if (paramInt1 == paramInt2) {
        break label206;
      }
      localObject2 = a.a(paramInt1);
      localObject3 = a;
      int m = ((bi.b)localObject3).a((View)localObject2);
      bi.b localb2 = a;
      int n = localb2.b((View)localObject2);
      bi.a locala = b;
      locala.a(i, j, m, n);
      if (paramInt3 == 0) {
        break;
      }
      b.a = 0;
      b.a(paramInt3);
      localObject3 = b;
      bool = ((bi.a)localObject3).a();
      if (!bool) {
        break;
      }
      label145:
      return (View)localObject2;
    }
    if (paramInt4 != 0)
    {
      b.a = 0;
      b.a(paramInt4);
      localObject3 = b;
      bool = ((bi.a)localObject3).a();
      if (!bool) {}
    }
    for (;;)
    {
      paramInt1 += k;
      localObject1 = localObject2;
      break;
      label206:
      localObject2 = localObject1;
      break label145;
      localObject2 = localObject1;
    }
  }
  
  final boolean a(View paramView)
  {
    bi.a locala = b;
    int i = a.a();
    int j = a.b();
    int k = a.a(paramView);
    int m = a.b(paramView);
    locala.a(i, j, k, m);
    b.a = 0;
    b.a(24579);
    return b.a();
  }
}


/* Location:              android/support/v7/widget/bi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */