package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

final class ac
{
  final ac.b a;
  final ac.a b;
  final List c;
  
  ac(ac.b paramb)
  {
    a = paramb;
    Object localObject = new android/support/v7/widget/ac$a;
    ((ac.a)localObject).<init>();
    b = ((ac.a)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    c = ((List)localObject);
  }
  
  final int a()
  {
    int i = a.a();
    int j = c.size();
    return i - j;
  }
  
  final int a(int paramInt)
  {
    int i = -1;
    int k;
    if (paramInt < 0) {
      k = i;
    }
    for (;;)
    {
      return k;
      ac.b localb = a;
      int m = localb.a();
      k = paramInt;
      int j;
      for (;;)
      {
        if (k >= m) {
          break label96;
        }
        ac.a locala1 = b;
        int n = locala1.e(k);
        n = k - n;
        n = paramInt - n;
        if (n == 0) {
          for (;;)
          {
            ac.a locala2 = b;
            j = locala2.c(k);
            if (j == 0) {
              break;
            }
            k += 1;
          }
        }
        k += n;
      }
      label96:
      k = j;
    }
  }
  
  final void a(View paramView)
  {
    c.add(paramView);
    a.c(paramView);
  }
  
  final void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    ac.b localb;
    if (paramInt < 0) {
      localb = a;
    }
    for (int i = localb.a();; i = a(paramInt))
    {
      ac.a locala = b;
      locala.a(i, paramBoolean);
      if (paramBoolean) {
        a(paramView);
      }
      a.a(paramView, i, paramLayoutParams);
      return;
    }
  }
  
  final void a(View paramView, int paramInt, boolean paramBoolean)
  {
    ac.b localb;
    if (paramInt < 0) {
      localb = a;
    }
    for (int i = localb.a();; i = a(paramInt))
    {
      ac.a locala = b;
      locala.a(i, paramBoolean);
      if (paramBoolean) {
        a(paramView);
      }
      a.a(paramView, i);
      return;
    }
  }
  
  final int b()
  {
    return a.a();
  }
  
  final View b(int paramInt)
  {
    int i = a(paramInt);
    return a.b(i);
  }
  
  final boolean b(View paramView)
  {
    Object localObject = c;
    boolean bool = ((List)localObject).remove(paramView);
    if (bool)
    {
      localObject = a;
      ((ac.b)localObject).d(paramView);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  final int c(View paramView)
  {
    int i = -1;
    ac.b localb = a;
    int j = localb.a(paramView);
    if (j == i) {}
    for (;;)
    {
      return i;
      ac.a locala1 = b;
      boolean bool = locala1.c(j);
      if (!bool)
      {
        ac.a locala2 = b;
        i = locala2.e(j);
        i = j - i;
      }
    }
  }
  
  final View c(int paramInt)
  {
    return a.b(paramInt);
  }
  
  final void d(int paramInt)
  {
    int i = a(paramInt);
    b.d(i);
    a.c(i);
  }
  
  final boolean d(View paramView)
  {
    return c.contains(paramView);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = b.toString();
    localStringBuilder = localStringBuilder.append(str).append(", hidden list:");
    int i = c.size();
    return i;
  }
}


/* Location:              android/support/v7/widget/ac.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */