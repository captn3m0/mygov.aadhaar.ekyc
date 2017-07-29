package android.support.v4.h;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

final class ad
{
  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    try
    {
      bool = paramViewParent.onNestedPreFling(paramView, paramFloat1, paramFloat2);
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      for (;;)
      {
        String str1 = "ViewParentCompat";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("ViewParent ");
        localObject2 = ((StringBuilder)localObject2).append(paramViewParent);
        String str2 = " does not implement interface method onNestedPreFling";
        localObject2 = str2;
        Log.e(str1, (String)localObject2, localAbstractMethodError);
        boolean bool = false;
        Object localObject1 = null;
      }
    }
    return bool;
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    try
    {
      bool = paramViewParent.onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      for (;;)
      {
        String str1 = "ViewParentCompat";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("ViewParent ");
        localObject2 = ((StringBuilder)localObject2).append(paramViewParent);
        String str2 = " does not implement interface method onNestedFling";
        localObject2 = str2;
        Log.e(str1, (String)localObject2, localAbstractMethodError);
        boolean bool = false;
        Object localObject1 = null;
      }
    }
    return bool;
  }
  
  public static boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    try
    {
      bool = paramViewParent.onStartNestedScroll(paramView1, paramView2, paramInt);
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      for (;;)
      {
        String str1 = "ViewParentCompat";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("ViewParent ");
        localObject2 = ((StringBuilder)localObject2).append(paramViewParent);
        String str2 = " does not implement interface method onStartNestedScroll";
        localObject2 = str2;
        Log.e(str1, (String)localObject2, localAbstractMethodError);
        boolean bool = false;
        Object localObject1 = null;
      }
    }
    return bool;
  }
}


/* Location:              android/support/v4/h/ad.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */