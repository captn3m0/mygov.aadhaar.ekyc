package android.support.v7.widget;

import android.view.View;

final class bi
{
  final b a;
  a b;
  
  bi(b paramb)
  {
    a = paramb;
    b = new a();
  }
  
  final View a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = a.a();
    int k = a.b();
    if (paramInt2 > paramInt1) {}
    Object localObject;
    View localView;
    for (int i = 1;; i = -1)
    {
      localObject = null;
      if (paramInt1 == paramInt2) {
        break label174;
      }
      localView = a.a(paramInt1);
      int m = a.a(localView);
      int n = a.b(localView);
      b.a(j, k, m, n);
      if (paramInt3 == 0) {
        break;
      }
      b.a = 0;
      b.a(paramInt3);
      if (!b.a()) {
        break;
      }
      return localView;
    }
    if (paramInt4 != 0)
    {
      b.a = 0;
      b.a(paramInt4);
      if (b.a()) {
        localObject = localView;
      }
    }
    for (;;)
    {
      paramInt1 += i;
      break;
      label174:
      return (View)localObject;
    }
  }
  
  final boolean a(View paramView)
  {
    b.a(a.a(), a.b(), a.a(paramView), a.b(paramView));
    b.a = 0;
    b.a(24579);
    return b.a();
  }
  
  static final class a
  {
    int a = 0;
    int b;
    int c;
    int d;
    int e;
    
    private static int a(int paramInt1, int paramInt2)
    {
      if (paramInt1 > paramInt2) {
        return 1;
      }
      if (paramInt1 == paramInt2) {
        return 2;
      }
      return 4;
    }
    
    final void a(int paramInt)
    {
      a |= paramInt;
    }
    
    final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      b = paramInt1;
      c = paramInt2;
      d = paramInt3;
      e = paramInt4;
    }
    
    final boolean a()
    {
      if (((a & 0x7) != 0) && ((a & a(d, b) << 0) == 0)) {}
      while ((((a & 0x70) != 0) && ((a & a(d, c) << 4) == 0)) || (((a & 0x700) != 0) && ((a & a(e, b) << 8) == 0)) || (((a & 0x7000) != 0) && ((a & a(e, c) << 12) == 0))) {
        return false;
      }
      return true;
    }
  }
  
  static abstract interface b
  {
    public abstract int a();
    
    public abstract int a(View paramView);
    
    public abstract View a(int paramInt);
    
    public abstract int b();
    
    public abstract int b(View paramView);
  }
}


/* Location:              android/support/v7/widget/bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */