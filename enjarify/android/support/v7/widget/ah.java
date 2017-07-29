package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.d.a.a;
import android.support.v4.h.ae;
import android.support.v4.h.n;
import android.support.v4.widget.i;
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
    super(paramContext, m);
    i = paramBoolean;
    setCacheColorHint(0);
  }
  
  protected final boolean a()
  {
    boolean bool = j;
    if (!bool)
    {
      bool = super.a();
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean a(MotionEvent paramMotionEvent, int paramInt)
  {
    int m = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool4 = false;
    int i4 = n.a(paramMotionEvent);
    int i5;
    float f2;
    Object localObject;
    label61:
    float f3;
    switch (i4)
    {
    default: 
      i5 = 0;
      f2 = 0.0F;
      bool4 = m;
      m = 0;
      localObject = null;
      f1 = 0.0F;
      int i6;
      if ((!bool4) || (m != 0))
      {
        j = false;
        f1 = 0.0F;
        setPressed(false);
        drawableStateChanged();
        m = f;
        i6 = getFirstVisiblePosition();
        m -= i6;
        localObject = getChildAt(m);
        if (localObject != null)
        {
          i6 = 0;
          f3 = 0.0F;
          ((View)localObject).setPressed(false);
        }
        localObject = k;
        if (localObject != null)
        {
          k.a();
          m = 0;
          f1 = 0.0F;
          localObject = null;
          k = null;
        }
      }
      if (bool4)
      {
        localObject = l;
        if (localObject == null)
        {
          localObject = new android/support/v4/widget/i;
          ((i)localObject).<init>(this);
          l = ((i)localObject);
        }
        localObject = l;
        i6 = 1;
        f3 = Float.MIN_VALUE;
        ((i)localObject).a(i6);
        localObject = l;
        ((i)localObject).onTouch(this, paramMotionEvent);
      }
      break;
    }
    for (;;)
    {
      return bool4;
      i5 = 0;
      f2 = 0.0F;
      bool4 = false;
      m = 0;
      localObject = null;
      f1 = 0.0F;
      break label61;
      m = 0;
      f1 = 0.0F;
      localObject = null;
      int i7 = paramMotionEvent.findPointerIndex(paramInt);
      if (i7 < 0)
      {
        i5 = 0;
        f2 = 0.0F;
        bool4 = false;
        m = 0;
        localObject = null;
        f1 = 0.0F;
        break label61;
      }
      float f4 = paramMotionEvent.getX(i7);
      int i9 = (int)f4;
      f3 = paramMotionEvent.getY(i7);
      i7 = (int)f3;
      int i10 = pointToPosition(i9, i7);
      int i11 = -1;
      if (i10 == i11)
      {
        i5 = 1;
        f2 = Float.MIN_VALUE;
        bool4 = m;
        m = i5;
        f1 = f2;
        break label61;
      }
      m = getFirstVisiblePosition();
      m = i10 - m;
      View localView = getChildAt(m);
      f4 = i9;
      float f5 = i7;
      f1 = Float.MIN_VALUE;
      j = true;
      m = Build.VERSION.SDK_INT;
      i7 = 21;
      f3 = 2.9E-44F;
      if (m >= i7) {
        drawableHotspotChanged(f4, f5);
      }
      boolean bool1 = isPressed();
      if (!bool1)
      {
        bool1 = true;
        f1 = Float.MIN_VALUE;
        setPressed(bool1);
      }
      layoutChildren();
      int n = f;
      i7 = -1;
      f3 = 0.0F / 0.0F;
      if (n != i7)
      {
        n = f;
        i7 = getFirstVisiblePosition();
        n -= i7;
        localObject = getChildAt(n);
        if ((localObject != null) && (localObject != localView))
        {
          boolean bool5 = ((View)localObject).isPressed();
          if (bool5)
          {
            bool5 = false;
            f3 = 0.0F;
            ((View)localObject).setPressed(false);
          }
        }
      }
      f = i10;
      n = localView.getLeft();
      f1 = n;
      f1 = f4 - f1;
      int i8 = localView.getTop();
      f3 = i8;
      f3 = f5 - f3;
      int i12 = Build.VERSION.SDK_INT;
      int i13 = 21;
      float f6 = 2.9E-44F;
      if (i12 >= i13) {
        localView.drawableHotspotChanged(f1, f3);
      }
      boolean bool2 = localView.isPressed();
      if (!bool2)
      {
        bool2 = true;
        f1 = Float.MIN_VALUE;
        localView.setPressed(bool2);
      }
      Drawable localDrawable = getSelector();
      label649:
      Field localField;
      int i14;
      if (localDrawable != null)
      {
        int i1 = -1;
        f1 = 0.0F / 0.0F;
        if (i10 != i1)
        {
          i1 = 1;
          f1 = Float.MIN_VALUE;
          i8 = i1;
          f3 = f1;
          if (i8 != 0)
          {
            i1 = 0;
            f1 = 0.0F;
            localObject = null;
            i13 = 0;
            f6 = 0.0F;
            localField = null;
            localDrawable.setVisible(false, false);
          }
          localObject = a;
          i13 = localView.getLeft();
          i14 = localView.getTop();
          int i15 = localView.getRight();
          int i16 = localView.getBottom();
          ((Rect)localObject).set(i13, i14, i15, i16);
          i13 = left;
          i14 = b;
          i13 -= i14;
          left = i13;
          i13 = top;
          i14 = c;
          i13 -= i14;
          top = i13;
          i13 = right;
          i14 = d;
          i13 += i14;
          right = i13;
          i13 = bottom;
          i14 = e;
          i13 += i14;
          bottom = i13;
        }
      }
      for (;;)
      {
        try
        {
          localObject = g;
          boolean bool3 = ((Field)localObject).getBoolean(this);
          boolean bool6 = localView.isEnabled();
          if (bool6 != bool3)
          {
            localField = g;
            if (bool3) {
              continue;
            }
            bool3 = true;
            f1 = Float.MIN_VALUE;
            localObject = Boolean.valueOf(bool3);
            localField.set(this, localObject);
            i2 = -1;
            f1 = 0.0F / 0.0F;
            if (i10 != i2) {
              refreshDrawableState();
            }
          }
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          int i2;
          long l1;
          localIllegalAccessException.printStackTrace();
          continue;
          int i3 = 0;
          f1 = 0.0F;
          locali = null;
          continue;
        }
        if (i8 != 0)
        {
          localObject = a;
          f3 = ((Rect)localObject).exactCenterX();
          f6 = ((Rect)localObject).exactCenterY();
          i2 = getVisibility();
          if (i2 != 0) {
            continue;
          }
          i2 = 1;
          f1 = Float.MIN_VALUE;
          i14 = 0;
          localDrawable.setVisible(i2, false);
          a.a(localDrawable, f3, f6);
        }
        localObject = getSelector();
        if (localObject != null)
        {
          i8 = -1;
          f3 = 0.0F / 0.0F;
          if (i10 != i8) {
            a.a((Drawable)localObject, f4, f5);
          }
        }
        localObject = null;
        setSelectorEnabled(false);
        refreshDrawableState();
        i3 = 1;
        f1 = Float.MIN_VALUE;
        i8 = 1;
        f3 = Float.MIN_VALUE;
        if (i4 != i8) {
          break;
        }
        l1 = getItemIdAtPosition(i10);
        performItemClick(localView, i10, l1);
        break;
        i3 = 0;
        f1 = 0.0F;
        localObject = null;
        i8 = 0;
        f3 = 0.0F;
        break label649;
        i3 = 0;
        f1 = 0.0F;
        localObject = null;
      }
      i locali = l;
      if (locali != null)
      {
        locali = l;
        i8 = 0;
        f3 = 0.0F;
        locali.a(false);
      }
    }
  }
  
  public boolean hasFocus()
  {
    boolean bool = i;
    if (!bool)
    {
      bool = super.hasFocus();
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean hasWindowFocus()
  {
    boolean bool = i;
    if (!bool)
    {
      bool = super.hasWindowFocus();
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean isFocused()
  {
    boolean bool = i;
    if (!bool)
    {
      bool = super.isFocused();
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean isInTouchMode()
  {
    boolean bool = i;
    if (bool)
    {
      bool = h;
      if (bool) {}
    }
    else
    {
      bool = super.isInTouchMode();
      if (!bool) {
        break label31;
      }
    }
    label31:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  void setListSelectionHidden(boolean paramBoolean)
  {
    h = paramBoolean;
  }
}


/* Location:              android/support/v7/widget/ah.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */