package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

final class ac
{
  final b a;
  final a b;
  final List<View> c;
  
  ac(b paramb)
  {
    a = paramb;
    b = new a();
    c = new ArrayList();
  }
  
  final int a()
  {
    return a.a() - c.size();
  }
  
  final int a(int paramInt)
  {
    if (paramInt < 0)
    {
      paramInt = -1;
      return paramInt;
    }
    int j = a.a();
    int i = paramInt;
    for (;;)
    {
      if (i >= j) {
        break label72;
      }
      int k = paramInt - (i - b.e(i));
      if (k == 0) {
        for (;;)
        {
          paramInt = i;
          if (!b.c(i)) {
            break;
          }
          i += 1;
        }
      }
      i += k;
    }
    label72:
    return -1;
  }
  
  final void a(View paramView)
  {
    c.add(paramView);
    a.c(paramView);
  }
  
  final void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    if (paramInt < 0) {}
    for (paramInt = a.a();; paramInt = a(paramInt))
    {
      b.a(paramInt, paramBoolean);
      if (paramBoolean) {
        a(paramView);
      }
      a.a(paramView, paramInt, paramLayoutParams);
      return;
    }
  }
  
  final void a(View paramView, int paramInt, boolean paramBoolean)
  {
    if (paramInt < 0) {}
    for (paramInt = a.a();; paramInt = a(paramInt))
    {
      b.a(paramInt, paramBoolean);
      if (paramBoolean) {
        a(paramView);
      }
      a.a(paramView, paramInt);
      return;
    }
  }
  
  final int b()
  {
    return a.a();
  }
  
  final View b(int paramInt)
  {
    paramInt = a(paramInt);
    return a.b(paramInt);
  }
  
  final boolean b(View paramView)
  {
    if (c.remove(paramView))
    {
      a.d(paramView);
      return true;
    }
    return false;
  }
  
  final int c(View paramView)
  {
    int i = a.a(paramView);
    if (i == -1) {}
    while (b.c(i)) {
      return -1;
    }
    return i - b.e(i);
  }
  
  final View c(int paramInt)
  {
    return a.b(paramInt);
  }
  
  final void d(int paramInt)
  {
    paramInt = a(paramInt);
    b.d(paramInt);
    a.c(paramInt);
  }
  
  final boolean d(View paramView)
  {
    return c.contains(paramView);
  }
  
  public final String toString()
  {
    return b.toString() + ", hidden list:" + c.size();
  }
  
  static final class a
  {
    long a = 0L;
    a b;
    
    private void a()
    {
      if (b == null) {
        b = new a();
      }
    }
    
    final void a(int paramInt)
    {
      a locala = this;
      while (paramInt >= 64)
      {
        locala.a();
        locala = b;
        paramInt -= 64;
      }
      a |= 1L << paramInt;
    }
    
    final void a(int paramInt, boolean paramBoolean)
    {
      boolean bool = paramBoolean;
      a locala = this;
      while (paramInt >= 64)
      {
        locala.a();
        locala = b;
        paramInt -= 64;
      }
      if ((a & 0x8000000000000000) != 0L)
      {
        paramBoolean = true;
        label47:
        long l1 = (1L << paramInt) - 1L;
        long l2 = a;
        a = (((l1 ^ 0xFFFFFFFFFFFFFFFF) & a) << 1 | l2 & l1);
        if (!bool) {
          break label132;
        }
        locala.a(paramInt);
      }
      for (;;)
      {
        if ((!paramBoolean) && (b == null)) {
          return;
        }
        locala.a();
        locala = b;
        paramInt = 0;
        bool = paramBoolean;
        break;
        paramBoolean = false;
        break label47;
        label132:
        locala.b(paramInt);
      }
    }
    
    final void b(int paramInt)
    {
      a locala = this;
      while (paramInt >= 64)
      {
        if (b == null) {
          return;
        }
        locala = b;
        paramInt -= 64;
      }
      a &= (1L << paramInt ^ 0xFFFFFFFFFFFFFFFF);
    }
    
    final boolean c(int paramInt)
    {
      a locala = this;
      while (paramInt >= 64)
      {
        locala.a();
        locala = b;
        paramInt -= 64;
      }
      return (a & 1L << paramInt) != 0L;
    }
    
    final boolean d(int paramInt)
    {
      a locala = this;
      while (paramInt >= 64)
      {
        locala.a();
        locala = b;
        paramInt -= 64;
      }
      long l1 = 1L << paramInt;
      if ((a & l1) != 0L) {}
      for (boolean bool = true;; bool = false)
      {
        a &= (l1 ^ 0xFFFFFFFFFFFFFFFF);
        l1 -= 1L;
        long l2 = a;
        a = (Long.rotateRight((l1 ^ 0xFFFFFFFFFFFFFFFF) & a, 1) | l2 & l1);
        if (b != null)
        {
          if (b.c(0)) {
            locala.a(63);
          }
          b.d(0);
        }
        return bool;
      }
    }
    
    final int e(int paramInt)
    {
      if (b == null)
      {
        if (paramInt >= 64) {
          return Long.bitCount(a);
        }
        return Long.bitCount(a & (1L << paramInt) - 1L);
      }
      if (paramInt < 64) {
        return Long.bitCount(a & (1L << paramInt) - 1L);
      }
      return b.e(paramInt - 64) + Long.bitCount(a);
    }
    
    public final String toString()
    {
      if (b == null) {
        return Long.toBinaryString(a);
      }
      return b.toString() + "xx" + Long.toBinaryString(a);
    }
  }
  
  static abstract interface b
  {
    public abstract int a();
    
    public abstract int a(View paramView);
    
    public abstract void a(int paramInt);
    
    public abstract void a(View paramView, int paramInt);
    
    public abstract void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams);
    
    public abstract at.u b(View paramView);
    
    public abstract View b(int paramInt);
    
    public abstract void b();
    
    public abstract void c(int paramInt);
    
    public abstract void c(View paramView);
    
    public abstract void d(View paramView);
  }
}


/* Location:              android/support/v7/widget/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */