package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class b
  extends Drawable
{
  final ActionBarContainer a;
  
  public b(ActionBarContainer paramActionBarContainer)
  {
    a = paramActionBarContainer;
  }
  
  public void draw(Canvas paramCanvas)
  {
    Object localObject = a;
    boolean bool = d;
    if (bool)
    {
      localObject = a.c;
      if (localObject != null)
      {
        localObject = a.c;
        ((Drawable)localObject).draw(paramCanvas);
      }
    }
    for (;;)
    {
      return;
      localObject = a.a;
      if (localObject != null)
      {
        localObject = a.a;
        ((Drawable)localObject).draw(paramCanvas);
      }
      localObject = a.b;
      if (localObject != null)
      {
        localObject = a;
        bool = e;
        if (bool)
        {
          localObject = a.b;
          ((Drawable)localObject).draw(paramCanvas);
        }
      }
    }
  }
  
  public int getOpacity()
  {
    return 0;
  }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:              android/support/v7/widget/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */