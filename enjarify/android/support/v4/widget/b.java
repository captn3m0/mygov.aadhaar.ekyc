package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;

public final class b
{
  private static final b.c a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/widget/b$a;
      ((b.a)localObject).<init>();
      a = (b.c)localObject;
    }
    for (;;)
    {
      return;
      j = 21;
      if (i >= j)
      {
        localObject = new android/support/v4/widget/b$d;
        ((b.d)localObject).<init>();
        a = (b.c)localObject;
      }
      else
      {
        localObject = new android/support/v4/widget/b$b;
        ((b.b)localObject).<init>();
        a = (b.c)localObject;
      }
    }
  }
  
  public static Drawable a(CompoundButton paramCompoundButton)
  {
    return a.a(paramCompoundButton);
  }
  
  public static void a(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
  {
    a.a(paramCompoundButton, paramColorStateList);
  }
  
  public static void a(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
  {
    a.a(paramCompoundButton, paramMode);
  }
}


/* Location:              android/support/v4/widget/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */