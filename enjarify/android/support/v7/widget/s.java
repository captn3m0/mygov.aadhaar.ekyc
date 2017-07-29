package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.j;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

final class s
  extends PopupWindow
{
  private static final boolean a;
  private boolean b;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i < j) {}
    for (i = 1;; i = 0)
    {
      a = i;
      return;
    }
  }
  
  public s(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public s(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    Object localObject1 = a.j.PopupWindow;
    localObject1 = bf.a(paramContext, paramAttributeSet, (int[])localObject1, paramInt1, paramInt2);
    int i = a.j.PopupWindow_overlapAnchor;
    boolean bool1 = ((bf)localObject1).e(i);
    if (bool1)
    {
      int j = a.j.PopupWindow_overlapAnchor;
      localObject2 = null;
      boolean bool2 = ((bf)localObject1).a(j, false);
      boolean bool4 = a;
      if (!bool4) {
        break label276;
      }
      b = bool2;
    }
    for (;;)
    {
      int k = a.j.PopupWindow_android_popupBackground;
      localObject3 = ((bf)localObject1).a(k);
      setBackgroundDrawable((Drawable)localObject3);
      k = Build.VERSION.SDK_INT;
      if (paramInt2 != 0)
      {
        int n = 11;
        if (k < n)
        {
          k = a.j.PopupWindow_android_popupAnimationStyle;
          boolean bool3 = ((bf)localObject1).e(k);
          if (bool3)
          {
            m = a.j.PopupWindow_android_popupAnimationStyle;
            n = -1;
            m = ((bf)localObject1).g(m, n);
            setAnimationStyle(m);
          }
        }
      }
      localObject1 = a;
      ((TypedArray)localObject1).recycle();
      int i1 = Build.VERSION.SDK_INT;
      int m = 14;
      if (i1 < m)
      {
        localObject1 = PopupWindow.class;
        localObject3 = "mAnchor";
      }
      try
      {
        localObject3 = ((Class)localObject1).getDeclaredField((String)localObject3);
        boolean bool5 = true;
        ((Field)localObject3).setAccessible(bool5);
        localObject1 = PopupWindow.class;
        localObject2 = "mOnScrollChangedListener";
        localObject2 = ((Class)localObject1).getDeclaredField((String)localObject2);
        bool5 = true;
        ((Field)localObject2).setAccessible(bool5);
        localObject1 = ((Field)localObject2).get(this);
        localObject1 = (ViewTreeObserver.OnScrollChangedListener)localObject1;
        s.1 local1 = new android/support/v7/widget/s$1;
        local1.<init>((Field)localObject3, this, (ViewTreeObserver.OnScrollChangedListener)localObject1);
        ((Field)localObject2).set(this, local1);
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          label276:
          localObject3 = "AppCompatPopupWindow";
          localObject2 = "Exception while installing workaround OnScrollChangedListener";
          Log.d((String)localObject3, (String)localObject2, localException);
        }
      }
      j.a(this, m);
    }
  }
  
  public final void showAsDropDown(View paramView, int paramInt1, int paramInt2)
  {
    boolean bool = a;
    if (bool)
    {
      bool = b;
      if (bool)
      {
        int i = paramView.getHeight();
        paramInt2 -= i;
      }
    }
    super.showAsDropDown(paramView, paramInt1, paramInt2);
  }
  
  public final void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = a;
    if (bool)
    {
      bool = b;
      if (bool)
      {
        int i = paramView.getHeight();
        paramInt2 -= i;
      }
    }
    super.showAsDropDown(paramView, paramInt1, paramInt2, paramInt3);
  }
  
  public final void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = a;
    if (bool)
    {
      bool = b;
      if (bool)
      {
        int i = paramView.getHeight();
        paramInt2 -= i;
      }
    }
    for (int j = paramInt2;; j = paramInt2)
    {
      super.update(paramView, paramInt1, j, paramInt3, paramInt4);
      return;
    }
  }
}


/* Location:              android/support/v7/widget/s.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */