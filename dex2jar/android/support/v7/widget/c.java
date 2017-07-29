package android.support.v7.widget;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

@TargetApi(21)
final class c
  extends b
{
  public c(ActionBarContainer paramActionBarContainer)
  {
    super(paramActionBarContainer);
  }
  
  public final void getOutline(Outline paramOutline)
  {
    if (a.d) {
      if (a.c != null) {
        a.c.getOutline(paramOutline);
      }
    }
    while (a.a == null) {
      return;
    }
    a.a.getOutline(paramOutline);
  }
}


/* Location:              android/support/v7/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */