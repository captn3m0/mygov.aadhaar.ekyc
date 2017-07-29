package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.d.a.a;
import android.support.v4.h.ae;
import android.support.v4.h.n;
import android.support.v4.widget.i;
import android.support.v7.a.a.a;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.Field;

class ah
  extends ao
{
  private boolean h;
  private boolean i;
  private boolean j;
  private ae k;
  private i l;
  
  public ah(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, a.a.dropDownListViewStyle);
    i = paramBoolean;
    setCacheColorHint(0);
  }
  
  protected final boolean a()
  {
    return (j) || (super.a());
  }
  
  public boolean a(MotionEvent paramMotionEvent, int paramInt)
  {
    boolean bool = true;
    int m = n.a(paramMotionEvent);
    label41:
    View localView;
    switch (m)
    {
    default: 
      bool = true;
      paramInt = 0;
      if ((!bool) || (paramInt != 0))
      {
        j = false;
        setPressed(false);
        drawableStateChanged();
        localView = getChildAt(f - getFirstVisiblePosition());
        if (localView != null) {
          localView.setPressed(false);
        }
        if (k != null)
        {
          k.a();
          k = null;
        }
      }
      if (bool)
      {
        if (l == null) {
          l = new i(this);
        }
        l.a(true);
        l.onTouch(this, paramMotionEvent);
      }
      break;
    }
    label406:
    while (l == null)
    {
      return bool;
      bool = false;
      paramInt = 0;
      break label41;
      bool = false;
      int n = paramMotionEvent.findPointerIndex(paramInt);
      if (n < 0)
      {
        bool = false;
        paramInt = 0;
        break label41;
      }
      paramInt = (int)paramMotionEvent.getX(n);
      int i1 = (int)paramMotionEvent.getY(n);
      n = pointToPosition(paramInt, i1);
      if (n == -1)
      {
        paramInt = 1;
        break label41;
      }
      localView = getChildAt(n - getFirstVisiblePosition());
      float f1 = paramInt;
      float f2 = i1;
      j = true;
      if (Build.VERSION.SDK_INT >= 21) {
        drawableHotspotChanged(f1, f2);
      }
      if (!isPressed()) {
        setPressed(true);
      }
      layoutChildren();
      if (f != -1)
      {
        localObject1 = getChildAt(f - getFirstVisiblePosition());
        if ((localObject1 != null) && (localObject1 != localView) && (((View)localObject1).isPressed())) {
          ((View)localObject1).setPressed(false);
        }
      }
      f = n;
      float f3 = localView.getLeft();
      float f4 = localView.getTop();
      if (Build.VERSION.SDK_INT >= 21) {
        localView.drawableHotspotChanged(f1 - f3, f2 - f4);
      }
      if (!localView.isPressed()) {
        localView.setPressed(true);
      }
      Object localObject1 = getSelector();
      Object localObject2;
      if ((localObject1 != null) && (n != -1))
      {
        paramInt = 1;
        if (paramInt != 0) {
          ((Drawable)localObject1).setVisible(false, false);
        }
        localObject2 = a;
        ((Rect)localObject2).set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
        left -= b;
        top -= c;
        right += d;
        bottom += e;
      }
      for (;;)
      {
        try
        {
          bool = g.getBoolean(this);
          if (localView.isEnabled() != bool)
          {
            localObject2 = g;
            if (bool) {
              continue;
            }
            bool = true;
            ((Field)localObject2).set(this, Boolean.valueOf(bool));
            if (n != -1) {
              refreshDrawableState();
            }
          }
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          localIllegalAccessException.printStackTrace();
          continue;
          bool = false;
          continue;
        }
        if (paramInt != 0)
        {
          localObject2 = a;
          f3 = ((Rect)localObject2).exactCenterX();
          f4 = ((Rect)localObject2).exactCenterY();
          if (getVisibility() != 0) {
            continue;
          }
          bool = true;
          ((Drawable)localObject1).setVisible(bool, false);
          a.a((Drawable)localObject1, f3, f4);
        }
        localObject1 = getSelector();
        if ((localObject1 != null) && (n != -1)) {
          a.a((Drawable)localObject1, f1, f2);
        }
        setSelectorEnabled(false);
        refreshDrawableState();
        if (m != 1) {
          break;
        }
        performItemClick(localView, n, getItemIdAtPosition(n));
        break;
        paramInt = 0;
        break label406;
        bool = false;
      }
    }
    l.a(false);
    return bool;
  }
  
  public boolean hasFocus()
  {
    return (i) || (super.hasFocus());
  }
  
  public boolean hasWindowFocus()
  {
    return (i) || (super.hasWindowFocus());
  }
  
  public boolean isFocused()
  {
    return (i) || (super.isFocused());
  }
  
  public boolean isInTouchMode()
  {
    return ((i) && (h)) || (super.isInTouchMode());
  }
  
  void setListSelectionHidden(boolean paramBoolean)
  {
    h = paramBoolean;
  }
}


/* Location:              android/support/v7/widget/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */