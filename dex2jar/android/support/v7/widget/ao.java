package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.c.a.a;
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
  private static final int[] h = { 0 };
  final Rect a = new Rect();
  int b = 0;
  int c = 0;
  int d = 0;
  int e = 0;
  protected int f;
  Field g;
  private a i;
  
  public ao(Context paramContext, int paramInt)
  {
    super(paramContext, null, paramInt);
    try
    {
      g = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      g.setAccessible(true);
      return;
    }
    catch (NoSuchFieldException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public final int a(int paramInt1, int paramInt2)
  {
    int j = getListPaddingTop();
    int m = getListPaddingBottom();
    getListPaddingLeft();
    getListPaddingRight();
    int k = getDividerHeight();
    Object localObject = getDivider();
    ListAdapter localListAdapter = getAdapter();
    if (localListAdapter == null)
    {
      j += m;
      return j;
    }
    j = m + j;
    label66:
    label84:
    int i1;
    label116:
    View localView;
    if ((k > 0) && (localObject != null))
    {
      int i2 = localListAdapter.getCount();
      m = 0;
      int n = 0;
      localObject = null;
      if (m >= i2) {
        break label251;
      }
      i1 = localListAdapter.getItemViewType(m);
      if (i1 == n) {
        break label253;
      }
      n = i1;
      localObject = null;
      localView = localListAdapter.getView(m, (View)localObject, this);
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      localObject = localLayoutParams;
      if (localLayoutParams == null)
      {
        localObject = generateDefaultLayoutParams();
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      if (height <= 0) {
        break label241;
      }
      i1 = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
      label179:
      localView.measure(paramInt1, i1);
      localView.forceLayout();
      if (m <= 0) {
        break label256;
      }
      j += k;
    }
    label241:
    label251:
    label253:
    label256:
    for (;;)
    {
      i1 = localView.getMeasuredHeight() + j;
      j = paramInt2;
      if (i1 >= paramInt2) {
        break;
      }
      m += 1;
      j = i1;
      localObject = localView;
      break label84;
      k = 0;
      break label66;
      i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
      break label179;
      return j;
      break label116;
    }
  }
  
  protected boolean a()
  {
    return false;
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    if (!a.isEmpty())
    {
      Drawable localDrawable = getSelector();
      if (localDrawable != null)
      {
        localDrawable.setBounds(a);
        localDrawable.draw(paramCanvas);
      }
    }
    super.dispatchDraw(paramCanvas);
  }
  
  protected void drawableStateChanged()
  {
    int j = 1;
    super.drawableStateChanged();
    setSelectorEnabled(true);
    Drawable localDrawable = getSelector();
    if (localDrawable != null) {
      if ((!a()) || (!isPressed())) {
        break label48;
      }
    }
    for (;;)
    {
      if (j != 0) {
        localDrawable.setState(getDrawableState());
      }
      return;
      label48:
      j = 0;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      f = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    }
  }
  
  public void setSelector(Drawable paramDrawable)
  {
    if (paramDrawable != null) {}
    for (Object localObject = new a(paramDrawable);; localObject = null)
    {
      i = ((a)localObject);
      super.setSelector(i);
      localObject = new Rect();
      if (paramDrawable != null) {
        paramDrawable.getPadding((Rect)localObject);
      }
      b = left;
      c = top;
      d = right;
      e = bottom;
      return;
    }
  }
  
  protected void setSelectorEnabled(boolean paramBoolean)
  {
    if (i != null) {
      i.a = paramBoolean;
    }
  }
  
  private static final class a
    extends a
  {
    boolean a = true;
    
    public a(Drawable paramDrawable)
    {
      super();
    }
    
    public final void draw(Canvas paramCanvas)
    {
      if (a) {
        super.draw(paramCanvas);
      }
    }
    
    public final void setHotspot(float paramFloat1, float paramFloat2)
    {
      if (a) {
        super.setHotspot(paramFloat1, paramFloat2);
      }
    }
    
    public final void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      if (a) {
        super.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
    
    public final boolean setState(int[] paramArrayOfInt)
    {
      if (a) {
        return super.setState(paramArrayOfInt);
      }
      return false;
    }
    
    public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
    {
      if (a) {
        return super.setVisible(paramBoolean1, paramBoolean2);
      }
      return false;
    }
  }
}


/* Location:              android/support/v7/widget/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */