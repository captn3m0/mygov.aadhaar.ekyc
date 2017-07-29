package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.d.a.a;
import android.view.View.OnTouchListener;

final class d$d
  extends q
  implements ActionMenuView.a
{
  private final float[] b;
  
  public d$d(d paramd, Context paramContext)
  {
    super(paramContext, null, i);
    Object localObject = new float[2];
    b = ((float[])localObject);
    setClickable(bool);
    setFocusable(bool);
    setVisibility(0);
    setEnabled(bool);
    localObject = new android/support/v7/widget/d$d$1;
    ((d.d.1)localObject).<init>(this, this, paramd);
    setOnTouchListener((View.OnTouchListener)localObject);
  }
  
  public final boolean c()
  {
    return false;
  }
  
  public final boolean d()
  {
    return false;
  }
  
  public final boolean performClick()
  {
    boolean bool1 = true;
    boolean bool2 = super.performClick();
    if (bool2) {}
    for (;;)
    {
      return bool1;
      bool2 = false;
      playSoundEffect(0);
      d locald = a;
      locald.f();
    }
  }
  
  protected final boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
    Drawable localDrawable1 = getDrawable();
    Drawable localDrawable2 = getBackground();
    if ((localDrawable1 != null) && (localDrawable2 != null))
    {
      int i = getWidth();
      int j = getHeight();
      int k = Math.max(i, j) / 2;
      int m = getPaddingLeft();
      int n = getPaddingRight();
      m -= n;
      n = getPaddingTop();
      int i1 = getPaddingBottom();
      n -= i1;
      i = (i + m) / 2;
      j = (j + n) / 2;
      m = i - k;
      n = j - k;
      i += k;
      j += k;
      a.a(localDrawable2, m, n, i, j);
    }
    return bool;
  }
}


/* Location:              android/support/v7/widget/d$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */