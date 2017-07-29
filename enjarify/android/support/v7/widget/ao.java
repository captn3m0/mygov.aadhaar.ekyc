package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class ao
  extends ListView
{
  private static final int[] h;
  final Rect a;
  int b;
  int c;
  int d;
  int e;
  protected int f;
  Field g;
  private ao.a i;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 0;
    h = arrayOfInt;
  }
  
  public ao(Context paramContext, int paramInt)
  {
    super(paramContext, null, paramInt);
    Object localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    a = ((Rect)localObject);
    b = 0;
    c = 0;
    d = 0;
    e = 0;
    localObject = AbsListView.class;
    String str = "mIsChildViewEnabled";
    try
    {
      localObject = ((Class)localObject).getDeclaredField(str);
      g = ((Field)localObject);
      localObject = g;
      bool = true;
      ((Field)localObject).setAccessible(bool);
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        localNoSuchFieldException.printStackTrace();
      }
    }
  }
  
  public final int a(int paramInt1, int paramInt2)
  {
    int j = getListPaddingTop();
    int k = getListPaddingBottom();
    getListPaddingLeft();
    getListPaddingRight();
    int m = getDividerHeight();
    Drawable localDrawable = getDivider();
    ListAdapter localListAdapter = getAdapter();
    if (localListAdapter == null)
    {
      paramInt2 = j + k;
      return paramInt2;
    }
    k += j;
    label67:
    int i1;
    View localView;
    label88:
    Object localObject;
    if ((m > 0) && (localDrawable != null))
    {
      int n = localListAdapter.getCount();
      i1 = 0;
      int i2 = 0;
      localDrawable = null;
      localView = null;
      if (i1 >= n) {
        break label251;
      }
      j = localListAdapter.getItemViewType(i1);
      if (j == i2) {
        break label257;
      }
      i2 = j;
      j = 0;
      localObject = null;
      label119:
      localView = localListAdapter.getView(i1, (View)localObject, this);
      localObject = localView.getLayoutParams();
      if (localObject == null)
      {
        localObject = generateDefaultLayoutParams();
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      int i3 = height;
      if (i3 <= 0) {
        break label242;
      }
      j = height;
      i3 = 1073741824;
      j = View.MeasureSpec.makeMeasureSpec(j, i3);
      label187:
      localView.measure(paramInt1, j);
      localView.forceLayout();
      if (i1 <= 0) {
        break label264;
      }
    }
    label242:
    label251:
    label257:
    label264:
    for (j = k + m;; j = k)
    {
      k = localView.getMeasuredHeight() + j;
      if (k >= paramInt2) {
        break;
      }
      j = i1 + 1;
      i1 = j;
      break label88;
      m = 0;
      break label67;
      j = View.MeasureSpec.makeMeasureSpec(0, 0);
      break label187;
      paramInt2 = k;
      break;
      localObject = localView;
      break label119;
    }
  }
  
  protected boolean a()
  {
    return false;
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    Object localObject = a;
    boolean bool = ((Rect)localObject).isEmpty();
    if (!bool)
    {
      localObject = getSelector();
      if (localObject != null)
      {
        Rect localRect = a;
        ((Drawable)localObject).setBounds(localRect);
        ((Drawable)localObject).draw(paramCanvas);
      }
    }
    super.dispatchDraw(paramCanvas);
  }
  
  protected void drawableStateChanged()
  {
    boolean bool1 = true;
    super.drawableStateChanged();
    setSelectorEnabled(bool1);
    Drawable localDrawable = getSelector();
    if (localDrawable != null)
    {
      boolean bool2 = a();
      if (!bool2) {
        break label56;
      }
      bool2 = isPressed();
      if (!bool2) {
        break label56;
      }
    }
    for (;;)
    {
      if (bool1)
      {
        arrayOfInt = getDrawableState();
        localDrawable.setState(arrayOfInt);
      }
      return;
      label56:
      bool1 = false;
      int[] arrayOfInt = null;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int j = paramMotionEvent.getAction();
    switch (j)
    {
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      float f1 = paramMotionEvent.getX();
      j = (int)f1;
      float f2 = paramMotionEvent.getY();
      int k = (int)f2;
      j = pointToPosition(j, k);
      f = j;
    }
  }
  
  public void setSelector(Drawable paramDrawable)
  {
    Object localObject;
    if (paramDrawable != null)
    {
      localObject = new android/support/v7/widget/ao$a;
      ((ao.a)localObject).<init>(paramDrawable);
    }
    for (;;)
    {
      i = ((ao.a)localObject);
      localObject = i;
      super.setSelector((Drawable)localObject);
      localObject = new android/graphics/Rect;
      ((Rect)localObject).<init>();
      if (paramDrawable != null) {
        paramDrawable.getPadding((Rect)localObject);
      }
      int j = left;
      b = j;
      j = top;
      c = j;
      j = right;
      d = j;
      int k = bottom;
      e = k;
      return;
      k = 0;
      localObject = null;
    }
  }
  
  protected void setSelectorEnabled(boolean paramBoolean)
  {
    ao.a locala = i;
    if (locala != null)
    {
      locala = i;
      a = paramBoolean;
    }
  }
}


/* Location:              android/support/v7/widget/ao.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */