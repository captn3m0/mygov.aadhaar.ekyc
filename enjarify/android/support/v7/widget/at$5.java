package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.List;

final class at$5
  implements ac.b
{
  at$5(at paramat) {}
  
  public final int a()
  {
    return a.getChildCount();
  }
  
  public final int a(View paramView)
  {
    return a.indexOfChild(paramView);
  }
  
  public final void a(int paramInt)
  {
    View localView = a.getChildAt(paramInt);
    if (localView != null)
    {
      at localat = a;
      localat.g(localView);
    }
    a.removeViewAt(paramInt);
  }
  
  public final void a(View paramView, int paramInt)
  {
    a.addView(paramView, paramInt);
    at localat = a;
    at.c(paramView);
    List localList1 = v;
    if (localList1 != null)
    {
      localList1 = v;
      int i = localList1.size() + -1;
      while (i >= 0)
      {
        List localList2 = v;
        localList2.get(i);
        i += -1;
      }
    }
  }
  
  public final void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    Object localObject = at.c(paramView);
    if (localObject != null)
    {
      boolean bool = ((at.u)localObject).n();
      if (!bool)
      {
        bool = ((at.u)localObject).b();
        if (!bool)
        {
          IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("Called attach on a child which is not detached: ");
          localObject = localObject;
          localIllegalArgumentException.<init>((String)localObject);
          throw localIllegalArgumentException;
        }
      }
      ((at.u)localObject).i();
    }
    at.a(a, paramView, paramInt, paramLayoutParams);
  }
  
  public final at.u b(View paramView)
  {
    return at.c(paramView);
  }
  
  public final View b(int paramInt)
  {
    return a.getChildAt(paramInt);
  }
  
  public final void b()
  {
    int i = a.getChildCount();
    int j = 0;
    while (j < i)
    {
      at localat = a;
      View localView = b(j);
      localat.g(localView);
      j += 1;
    }
    a.removeAllViews();
  }
  
  public final void c(int paramInt)
  {
    Object localObject = b(paramInt);
    if (localObject != null)
    {
      localObject = at.c((View)localObject);
      if (localObject != null)
      {
        boolean bool = ((at.u)localObject).n();
        if (bool)
        {
          bool = ((at.u)localObject).b();
          if (!bool)
          {
            IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("called detach on an already detached child ");
            localObject = localObject;
            localIllegalArgumentException.<init>((String)localObject);
            throw localIllegalArgumentException;
          }
        }
        int i = 256;
        ((at.u)localObject).b(i);
      }
    }
    at.a(a, paramInt);
  }
  
  public final void c(View paramView)
  {
    at.u localu = at.c(paramView);
    if (localu != null)
    {
      at localat = a;
      at.u.a(localu, localat);
    }
  }
  
  public final void d(View paramView)
  {
    at.u localu = at.c(paramView);
    if (localu != null)
    {
      at localat = a;
      at.u.b(localu, localat);
    }
  }
}


/* Location:              android/support/v7/widget/at$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */