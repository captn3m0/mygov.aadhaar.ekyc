package android.support.design.widget;

import android.widget.ImageButton;

class z
  extends ImageButton
{
  private int a;
  
  final void a(int paramInt, boolean paramBoolean)
  {
    super.setVisibility(paramInt);
    if (paramBoolean) {
      a = paramInt;
    }
  }
  
  final int getUserSetVisibility()
  {
    return a;
  }
  
  public void setVisibility(int paramInt)
  {
    a(paramInt, true);
  }
}


/* Location:              android/support/design/widget/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */