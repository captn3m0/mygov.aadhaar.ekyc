package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.a.h;
import android.support.design.a.i;
import android.support.v4.h.al;
import android.support.v4.h.al.d;
import android.support.v4.h.s;
import android.support.v4.h.w;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class f
  extends FrameLayout
{
  Drawable a;
  Rect b;
  private Rect c = new Rect();
  
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
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.ScrimInsetsFrameLayout, paramInt, a.h.Widget_Design_ScrimInsetsFrameLayout);
    a = paramContext.getDrawable(a.i.ScrimInsetsFrameLayout_insetForeground);
    paramContext.recycle();
    setWillNotDraw(true);
    w.a(this, new s()
    {
      public final al a(View paramAnonymousView, al paramAnonymousal)
      {
        if (b == null) {
          b = new Rect();
        }
        b.set(paramAnonymousal.a(), paramAnonymousal.b(), paramAnonymousal.c(), paramAnonymousal.d());
        a(paramAnonymousal);
        paramAnonymousView = f.this;
        if ((!al.a.f(b)) || (a == null)) {}
        for (boolean bool = true;; bool = false)
        {
          paramAnonymousView.setWillNotDraw(bool);
          w.c(f.this);
          return al.a.a(b);
        }
      }
    });
  }
  
  public void a(al paramal) {}
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = getWidth();
    int j = getHeight();
    if ((b != null) && (a != null))
    {
      int k = paramCanvas.save();
      paramCanvas.translate(getScrollX(), getScrollY());
      c.set(0, 0, i, b.top);
      a.setBounds(c);
      a.draw(paramCanvas);
      c.set(0, j - b.bottom, i, j);
      a.setBounds(c);
      a.draw(paramCanvas);
      c.set(0, b.top, b.left, j - b.bottom);
      a.setBounds(c);
      a.draw(paramCanvas);
      c.set(i - b.right, b.top, i, j - b.bottom);
      a.setBounds(c);
      a.draw(paramCanvas);
      paramCanvas.restoreToCount(k);
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (a != null) {
      a.setCallback(this);
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (a != null) {
      a.setCallback(null);
    }
  }
}


/* Location:              android/support/design/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */