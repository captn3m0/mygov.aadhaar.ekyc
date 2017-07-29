package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.widget.j;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

final class s
  extends PopupWindow
{
  private static final boolean a;
  private boolean b;
  
  static
  {
    if (Build.VERSION.SDK_INT < 21) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public s(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  @TargetApi(11)
  public s(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    a(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    paramContext = bf.a(paramContext, paramAttributeSet, a.j.PopupWindow, paramInt1, paramInt2);
    boolean bool;
    if (paramContext.e(a.j.PopupWindow_overlapAnchor))
    {
      bool = paramContext.a(a.j.PopupWindow_overlapAnchor, false);
      if (!a) {
        break label156;
      }
      b = bool;
    }
    for (;;)
    {
      setBackgroundDrawable(paramContext.a(a.j.PopupWindow_android_popupBackground));
      paramInt1 = Build.VERSION.SDK_INT;
      if ((paramInt2 != 0) && (paramInt1 < 11) && (paramContext.e(a.j.PopupWindow_android_popupAnimationStyle))) {
        setAnimationStyle(paramContext.g(a.j.PopupWindow_android_popupAnimationStyle, -1));
      }
      a.recycle();
      if (Build.VERSION.SDK_INT < 14) {}
      try
      {
        paramContext = PopupWindow.class.getDeclaredField("mAnchor");
        paramContext.setAccessible(true);
        paramAttributeSet = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
        paramAttributeSet.setAccessible(true);
        paramAttributeSet.set(this, new ViewTreeObserver.OnScrollChangedListener()
        {
          public final void onScrollChanged()
          {
            try
            {
              WeakReference localWeakReference = (WeakReference)a.get(jdField_this);
              if (localWeakReference != null)
              {
                if (localWeakReference.get() == null) {
                  return;
                }
                c.onScrollChanged();
                return;
              }
            }
            catch (IllegalAccessException localIllegalAccessException) {}
          }
        });
        return;
      }
      catch (Exception paramContext)
      {
        label156:
        Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", paramContext);
      }
      j.a(this, bool);
    }
  }
  
  public final void showAsDropDown(View paramView, int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (a)
    {
      i = paramInt2;
      if (b) {
        i = paramInt2 - paramView.getHeight();
      }
    }
    super.showAsDropDown(paramView, paramInt1, i);
  }
  
  @TargetApi(19)
  public final void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    if (a)
    {
      i = paramInt2;
      if (b) {
        i = paramInt2 - paramView.getHeight();
      }
    }
    super.showAsDropDown(paramView, paramInt1, i, paramInt3);
  }
  
  public final void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((a) && (b)) {
      paramInt2 -= paramView.getHeight();
    }
    for (;;)
    {
      super.update(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
  }
}


/* Location:              android/support/v7/widget/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */