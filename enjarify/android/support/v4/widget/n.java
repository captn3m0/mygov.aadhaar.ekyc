package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.TextView;

public final class n
{
  static final n.f a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/widget/n$a;
      ((n.a)localObject).<init>();
      a = (n.f)localObject;
    }
    for (;;)
    {
      return;
      j = 18;
      if (i >= j)
      {
        localObject = new android/support/v4/widget/n$d;
        ((n.d)localObject).<init>();
        a = (n.f)localObject;
      }
      else
      {
        j = 17;
        if (i >= j)
        {
          localObject = new android/support/v4/widget/n$c;
          ((n.c)localObject).<init>();
          a = (n.f)localObject;
        }
        else
        {
          j = 16;
          if (i >= j)
          {
            localObject = new android/support/v4/widget/n$e;
            ((n.e)localObject).<init>();
            a = (n.f)localObject;
          }
          else
          {
            localObject = new android/support/v4/widget/n$b;
            ((n.b)localObject).<init>();
            a = (n.f)localObject;
          }
        }
      }
    }
  }
  
  public static void a(TextView paramTextView, int paramInt)
  {
    a.a(paramTextView, paramInt);
  }
  
  public static void a(TextView paramTextView, Drawable paramDrawable)
  {
    a.a(paramTextView, paramDrawable);
  }
}


/* Location:              android/support/v4/widget/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */