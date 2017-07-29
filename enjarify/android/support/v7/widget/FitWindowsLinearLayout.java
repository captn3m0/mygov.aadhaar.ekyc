package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout
  extends LinearLayout
  implements ai
{
  private ai.a a;
  
  public FitWindowsLinearLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public FitWindowsLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected boolean fitSystemWindows(Rect paramRect)
  {
    ai.a locala = a;
    if (locala != null)
    {
      locala = a;
      locala.a(paramRect);
    }
    return super.fitSystemWindows(paramRect);
  }
  
  public void setOnFitSystemWindowsListener(ai.a parama)
  {
    a = parama;
  }
}


/* Location:              android/support/v7/widget/FitWindowsLinearLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */