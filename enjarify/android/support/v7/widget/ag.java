package android.support.v7.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import android.support.v4.d.a.c;
import android.support.v7.c.a.a;

public final class ag
{
  public static final Rect a;
  private static Class b;
  
  static
  {
    Object localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    a = (Rect)localObject;
    int i = Build.VERSION.SDK_INT;
    int j = 18;
    if (i >= j) {
      localObject = "android.graphics.Insets";
    }
    try
    {
      localObject = Class.forName((String)localObject);
      b = (Class)localObject;
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;) {}
    }
  }
  
  static PorterDuff.Mode a(int paramInt, PorterDuff.Mode paramMode)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return paramMode;
      paramMode = PorterDuff.Mode.SRC_OVER;
      continue;
      paramMode = PorterDuff.Mode.SRC_IN;
      continue;
      paramMode = PorterDuff.Mode.SRC_ATOP;
      continue;
      paramMode = PorterDuff.Mode.MULTIPLY;
      continue;
      paramMode = PorterDuff.Mode.SCREEN;
      continue;
      int i = Build.VERSION.SDK_INT;
      int j = 11;
      if (i >= j)
      {
        String str = "ADD";
        paramMode = PorterDuff.Mode.valueOf(str);
      }
    }
  }
  
  static void a(Drawable paramDrawable)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject1;
    Object localObject2;
    if (i == j)
    {
      localObject1 = "android.graphics.drawable.VectorDrawable";
      localObject2 = paramDrawable.getClass().getName();
      boolean bool = ((String)localObject1).equals(localObject2);
      if (bool)
      {
        localObject1 = paramDrawable.getState();
        if (localObject1 != null)
        {
          j = localObject1.length;
          if (j != 0) {
            break label70;
          }
        }
        localObject2 = bb.e;
        paramDrawable.setState((int[])localObject2);
      }
    }
    for (;;)
    {
      paramDrawable.setState((int[])localObject1);
      return;
      label70:
      localObject2 = bb.h;
      paramDrawable.setState((int[])localObject2);
    }
  }
  
  public static boolean b(Drawable paramDrawable)
  {
    int i = 15;
    Object localObject = paramDrawable;
    int j = Build.VERSION.SDK_INT;
    int n;
    if (j < i)
    {
      boolean bool2 = localObject instanceof InsetDrawable;
      if (bool2)
      {
        n = 0;
        localObject = null;
      }
    }
    for (;;)
    {
      return n;
      int k = Build.VERSION.SDK_INT;
      if (k < i)
      {
        boolean bool3 = localObject instanceof GradientDrawable;
        if (bool3)
        {
          n = 0;
          localObject = null;
          continue;
        }
      }
      int m = Build.VERSION.SDK_INT;
      int i2 = 17;
      if (m < i2)
      {
        bool4 = localObject instanceof LayerDrawable;
        if (bool4)
        {
          n = 0;
          localObject = null;
          continue;
        }
      }
      boolean bool4 = localObject instanceof DrawableContainer;
      if (bool4)
      {
        localObject = ((Drawable)localObject).getConstantState();
        bool4 = localObject instanceof DrawableContainer.DrawableContainerState;
        if (bool4)
        {
          Drawable[] arrayOfDrawable = ((DrawableContainer.DrawableContainerState)localObject).getChildren();
          i2 = arrayOfDrawable.length;
          n = 0;
          localObject = null;
          for (;;)
          {
            if (n >= i2) {
              break label236;
            }
            Drawable localDrawable = arrayOfDrawable[n];
            boolean bool1 = b(localDrawable);
            if (!bool1)
            {
              n = 0;
              localObject = null;
              break;
            }
            n += 1;
          }
        }
      }
      else
      {
        bool4 = localObject instanceof c;
        if (bool4)
        {
          localObject = ((c)localObject).a();
          break;
        }
        bool4 = localObject instanceof a;
        if (bool4)
        {
          localObject = l;
          break;
        }
        bool4 = localObject instanceof ScaleDrawable;
        if (bool4)
        {
          localObject = ((ScaleDrawable)localObject).getDrawable();
          break;
        }
      }
      label236:
      int i1 = 1;
    }
  }
}


/* Location:              android/support/v7/widget/ag.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */