package android.support.v7.widget;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;

final class c
  extends b
{
  public c(ActionBarContainer paramActionBarContainer)
  {
    super(paramActionBarContainer);
  }
  
  public final void getOutline(Outline paramOutline)
  {
    Object localObject = a;
    boolean bool = d;
    if (bool)
    {
      localObject = a.c;
      if (localObject != null)
      {
        localObject = a.c;
        ((Drawable)localObject).getOutline(paramOutline);
      }
    }
    for (;;)
    {
      return;
      localObject = a.a;
      if (localObject != null)
      {
        localObject = a.a;
        ((Drawable)localObject).getOutline(paramOutline);
      }
    }
  }
}


/* Location:              android/support/v7/widget/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */