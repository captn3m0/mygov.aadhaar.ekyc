package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

class b$b
  implements b.c
{
  public Drawable a(CompoundButton paramCompoundButton)
  {
    return c.a(paramCompoundButton);
  }
  
  public void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
  {
    boolean bool = paramCompoundButton instanceof o;
    if (bool)
    {
      paramCompoundButton = (o)paramCompoundButton;
      paramCompoundButton.setSupportButtonTintList(paramColorStateList);
    }
  }
  
  public void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
  {
    boolean bool = paramCompoundButton instanceof o;
    if (bool)
    {
      paramCompoundButton = (o)paramCompoundButton;
      paramCompoundButton.setSupportButtonTintMode(paramMode);
    }
  }
}


/* Location:              android/support/v4/widget/b$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */