package android.support.v4.h;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

public final class ac
{
  static final ac.b a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/h/ac$d;
      ((ac.d)localObject).<init>();
      a = (ac.b)localObject;
    }
    for (;;)
    {
      return;
      j = 19;
      if (i >= j)
      {
        localObject = new android/support/v4/h/ac$c;
        ((ac.c)localObject).<init>();
        a = (ac.b)localObject;
      }
      else
      {
        j = 14;
        if (i >= j)
        {
          localObject = new android/support/v4/h/ac$a;
          ((ac.a)localObject).<init>();
          a = (ac.b)localObject;
        }
        else
        {
          localObject = new android/support/v4/h/ac$e;
          ((ac.e)localObject).<init>();
          a = (ac.b)localObject;
        }
      }
    }
  }
  
  public static void a(ViewParent paramViewParent, View paramView)
  {
    a.a(paramViewParent, paramView);
  }
  
  public static void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.a(paramViewParent, paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    a.a(paramViewParent, paramView, paramInt1, paramInt2, paramArrayOfInt);
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    return a.a(paramViewParent, paramView, paramFloat1, paramFloat2);
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return a.a(paramViewParent, paramView, paramFloat1, paramFloat2, paramBoolean);
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    return a.a(paramViewParent, paramView1, paramView2, paramInt);
  }
  
  public static void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    a.b(paramViewParent, paramView1, paramView2, paramInt);
  }
}


/* Location:              android/support/v4/h/ac.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */