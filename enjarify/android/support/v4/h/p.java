package android.support.v4.h;

import android.view.View;
import android.view.ViewParent;

public final class p
{
  public boolean a;
  private final View b;
  private ViewParent c;
  private int[] d;
  
  public p(View paramView)
  {
    b = paramView;
  }
  
  public final void a(boolean paramBoolean)
  {
    boolean bool = a;
    if (bool)
    {
      View localView = b;
      w.E(localView);
    }
    a = paramBoolean;
  }
  
  public final boolean a()
  {
    ViewParent localViewParent = c;
    boolean bool;
    if (localViewParent != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localViewParent = null;
    }
  }
  
  public final boolean a(float paramFloat1, float paramFloat2)
  {
    boolean bool = a;
    ViewParent localViewParent;
    if (bool)
    {
      localViewParent = c;
      if (localViewParent != null)
      {
        localViewParent = c;
        View localView = b;
        bool = ac.a(localViewParent, localView, paramFloat1, paramFloat2);
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localViewParent = null;
    }
  }
  
  public final boolean a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    boolean bool = a;
    ViewParent localViewParent;
    if (bool)
    {
      localViewParent = c;
      if (localViewParent != null)
      {
        localViewParent = c;
        View localView = b;
        bool = ac.a(localViewParent, localView, paramFloat1, paramFloat2, paramBoolean);
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localViewParent = null;
    }
  }
  
  public final boolean a(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = a();
    if (bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      bool2 = a;
      if (bool2)
      {
        ViewParent localViewParent = b.getParent();
        localObject = b;
        for (;;)
        {
          if (localViewParent == null) {
            break label132;
          }
          View localView = b;
          boolean bool3 = ac.a(localViewParent, (View)localObject, localView, paramInt);
          if (bool3)
          {
            c = localViewParent;
            localView = b;
            ac.b(localViewParent, (View)localObject, localView, paramInt);
            bool2 = bool1;
            break;
          }
          bool3 = localViewParent instanceof View;
          if (bool3)
          {
            localObject = localViewParent;
            localObject = (View)localViewParent;
          }
          localViewParent = ((ViewParent)localViewParent).getParent();
        }
      }
      label132:
      bool2 = false;
      Object localObject = null;
    }
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = a;
    Object localObject;
    int j;
    int i;
    int k;
    if (bool3)
    {
      localObject = c;
      if (localObject != null)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0) && (paramInt3 == 0) && (paramInt4 == 0)) {
          break label165;
        }
        if (paramArrayOfInt == null) {
          break label184;
        }
        localObject = b;
        ((View)localObject).getLocationInWindow(paramArrayOfInt);
        j = paramArrayOfInt[0];
        i = paramArrayOfInt[bool1];
        k = i;
      }
    }
    for (int m = j;; m = 0)
    {
      localObject = c;
      View localView = b;
      ac.a((ViewParent)localObject, localView, paramInt1, paramInt2, paramInt3, paramInt4);
      if (paramArrayOfInt != null)
      {
        localObject = b;
        ((View)localObject).getLocationInWindow(paramArrayOfInt);
        i = paramArrayOfInt[0] - m;
        paramArrayOfInt[0] = i;
        i = paramArrayOfInt[bool1] - k;
        paramArrayOfInt[bool1] = i;
      }
      bool2 = bool1;
      for (;;)
      {
        return bool2;
        label165:
        if (paramArrayOfInt != null)
        {
          paramArrayOfInt[0] = 0;
          paramArrayOfInt[bool1] = 0;
        }
      }
      label184:
      k = 0;
    }
  }
  
  public final boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = a;
    Object localObject1;
    int j;
    int i;
    if (bool3)
    {
      localObject1 = c;
      if (localObject1 != null)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0)) {
          break label219;
        }
        if (paramArrayOfInt2 == null) {
          break label238;
        }
        localObject1 = b;
        ((View)localObject1).getLocationInWindow(paramArrayOfInt2);
        j = paramArrayOfInt2[0];
        i = paramArrayOfInt2[bool1];
      }
    }
    for (;;)
    {
      int k;
      if (paramArrayOfInt1 == null)
      {
        localObject2 = d;
        if (localObject2 == null)
        {
          k = 2;
          localObject2 = new int[k];
          d = ((int[])localObject2);
        }
        paramArrayOfInt1 = d;
      }
      paramArrayOfInt1[0] = 0;
      paramArrayOfInt1[bool1] = 0;
      Object localObject2 = c;
      View localView = b;
      ac.a((ViewParent)localObject2, localView, paramInt1, paramInt2, paramArrayOfInt1);
      if (paramArrayOfInt2 != null)
      {
        localObject2 = b;
        ((View)localObject2).getLocationInWindow(paramArrayOfInt2);
        k = paramArrayOfInt2[0];
        j = k - j;
        paramArrayOfInt2[0] = j;
        j = paramArrayOfInt2[bool1];
        i = j - i;
        paramArrayOfInt2[bool1] = i;
      }
      i = paramArrayOfInt1[0];
      if (i == 0)
      {
        i = paramArrayOfInt1[bool1];
        if (i == 0) {}
      }
      else
      {
        bool2 = bool1;
      }
      for (;;)
      {
        return bool2;
        label219:
        if (paramArrayOfInt2 != null)
        {
          paramArrayOfInt2[0] = 0;
          paramArrayOfInt2[bool1] = 0;
        }
      }
      label238:
      i = 0;
      localObject1 = null;
      j = 0;
    }
  }
  
  public final void b()
  {
    ViewParent localViewParent = c;
    if (localViewParent != null)
    {
      localViewParent = c;
      View localView = b;
      ac.a(localViewParent, localView);
      localViewParent = null;
      c = null;
    }
  }
}


/* Location:              android/support/v4/h/p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */