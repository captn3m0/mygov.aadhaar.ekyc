package android.support.v4.h;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

final class ac$d
  extends ac.c
{
  public final void a(ViewParent paramViewParent, View paramView)
  {
    try
    {
      paramViewParent.onStopNestedScroll(paramView);
      return;
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      for (;;)
      {
        String str1 = "ViewParentCompat";
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("ViewParent ");
        localObject = ((StringBuilder)localObject).append(paramViewParent);
        String str2 = " does not implement interface method onStopNestedScroll";
        localObject = str2;
        Log.e(str1, (String)localObject, localAbstractMethodError);
      }
    }
  }
  
  public final void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      paramViewParent.onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      for (;;)
      {
        String str1 = "ViewParentCompat";
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("ViewParent ");
        localObject = ((StringBuilder)localObject).append(paramViewParent);
        String str2 = " does not implement interface method onNestedScroll";
        localObject = str2;
        Log.e(str1, (String)localObject, localAbstractMethodError);
      }
    }
  }
  
  public final void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    try
    {
      paramViewParent.onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
      return;
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      for (;;)
      {
        String str1 = "ViewParentCompat";
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("ViewParent ");
        localObject = ((StringBuilder)localObject).append(paramViewParent);
        String str2 = " does not implement interface method onNestedPreScroll";
        localObject = str2;
        Log.e(str1, (String)localObject, localAbstractMethodError);
      }
    }
  }
  
  public final boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    return ad.a(paramViewParent, paramView, paramFloat1, paramFloat2);
  }
  
  public final boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return ad.a(paramViewParent, paramView, paramFloat1, paramFloat2, paramBoolean);
  }
  
  public final boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    return ad.a(paramViewParent, paramView1, paramView2, paramInt);
  }
  
  public final void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    try
    {
      paramViewParent.onNestedScrollAccepted(paramView1, paramView2, paramInt);
      return;
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      for (;;)
      {
        String str1 = "ViewParentCompat";
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("ViewParent ");
        localObject = ((StringBuilder)localObject).append(paramViewParent);
        String str2 = " does not implement interface method onNestedScrollAccepted";
        localObject = str2;
        Log.e(str1, (String)localObject, localAbstractMethodError);
      }
    }
  }
}


/* Location:              android/support/v4/h/ac$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */