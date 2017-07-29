package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.a.h;
import android.support.design.a.i;
import android.support.v4.h.al;
import android.support.v4.h.s;
import android.support.v4.h.w;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class f
  extends FrameLayout
{
  Drawable a;
  Rect b;
  private Rect c;
  
  public f(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public f(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public f(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    c = ((Rect)localObject);
    localObject = a.i.ScrimInsetsFrameLayout;
    int i = a.h.Widget_Design_ScrimInsetsFrameLayout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject, paramInt, i);
    i = a.i.ScrimInsetsFrameLayout_insetForeground;
    Drawable localDrawable = ((TypedArray)localObject).getDrawable(i);
    a = localDrawable;
    ((TypedArray)localObject).recycle();
    setWillNotDraw(true);
    localObject = new android/support/design/internal/f$1;
    ((f.1)localObject).<init>(this);
    w.a(this, (s)localObject);
  }
  
  public void a(al paramal) {}
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = getWidth();
    int j = getHeight();
    Object localObject1 = b;
    if (localObject1 != null)
    {
      localObject1 = a;
      if (localObject1 != null)
      {
        int k = paramCanvas.save();
        int m = getScrollX();
        float f1 = m;
        float f2 = getScrollY();
        paramCanvas.translate(f1, f2);
        Object localObject2 = c;
        int n = b.top;
        ((Rect)localObject2).set(0, 0, i, n);
        localObject2 = a;
        Rect localRect1 = c;
        ((Drawable)localObject2).setBounds(localRect1);
        a.draw(paramCanvas);
        localObject2 = c;
        n = b.bottom;
        n = j - n;
        ((Rect)localObject2).set(0, n, i, j);
        localObject2 = a;
        localRect1 = c;
        ((Drawable)localObject2).setBounds(localRect1);
        a.draw(paramCanvas);
        localObject2 = c;
        n = b.top;
        int i1 = b.left;
        int i2 = b.bottom;
        i2 = j - i2;
        ((Rect)localObject2).set(0, n, i1, i2);
        localObject2 = a;
        localRect1 = c;
        ((Drawable)localObject2).setBounds(localRect1);
        a.draw(paramCanvas);
        localObject2 = c;
        localRect1 = b;
        n = right;
        n = i - n;
        Rect localRect2 = b;
        i1 = top;
        Rect localRect3 = b;
        i2 = bottom;
        j -= i2;
        ((Rect)localObject2).set(n, i1, i, j);
        Drawable localDrawable = a;
        Rect localRect4 = c;
        localDrawable.setBounds(localRect4);
        localDrawable = a;
        localDrawable.draw(paramCanvas);
        paramCanvas.restoreToCount(k);
      }
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      localDrawable = a;
      localDrawable.setCallback(this);
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      localDrawable = a;
      localDrawable.setCallback(null);
    }
  }
}


/* Location:              android/support/design/internal/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */