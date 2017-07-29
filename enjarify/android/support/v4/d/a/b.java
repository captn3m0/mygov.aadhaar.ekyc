package android.support.v4.d.a;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

final class b
{
  private static Method a;
  private static boolean b;
  private static Method c;
  private static boolean d;
  
  public static int a(Drawable paramDrawable)
  {
    boolean bool1 = true;
    boolean bool2 = d;
    if (!bool2)
    {
      localObject1 = Drawable.class;
      localObject3 = "getLayoutDirection";
      localObject4 = null;
    }
    try
    {
      localObject4 = new Class[0];
      localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject3, (Class[])localObject4);
      c = (Method)localObject1;
      bool3 = true;
      ((Method)localObject1).setAccessible(bool3);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        try
        {
          localObject1 = c;
          boolean bool3 = false;
          localObject3 = null;
          localObject3 = new Object[0];
          localObject1 = ((Method)localObject1).invoke(paramDrawable, (Object[])localObject3);
          localObject1 = (Integer)localObject1;
          i = ((Integer)localObject1).intValue();
          return i;
        }
        catch (Exception localException)
        {
          localObject3 = "DrawableCompatJellybeanMr1";
          localObject4 = "Failed to invoke getLayoutDirection() via reflection";
          Log.i((String)localObject3, (String)localObject4, localException);
          i = 0;
          Object localObject2 = null;
          c = null;
        }
        localNoSuchMethodException = localNoSuchMethodException;
        localObject3 = "DrawableCompatJellybeanMr1";
        localObject4 = "Failed to retrieve getLayoutDirection() method";
        Log.i((String)localObject3, (String)localObject4, localNoSuchMethodException);
        continue;
        int i = -1;
      }
    }
    d = bool1;
    localObject1 = c;
    if (localObject1 == null) {}
  }
  
  public static boolean a(Drawable paramDrawable, int paramInt)
  {
    bool1 = true;
    boolean bool2 = b;
    if (!bool2)
    {
      localObject1 = Drawable.class;
      localObject2 = "setLayoutDirection";
      i = 1;
    }
    try
    {
      localObject3 = new Class[i];
      localInteger = null;
      Class localClass = Integer.TYPE;
      localObject3[0] = localClass;
      localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject2, (Class[])localObject3);
      a = (Method)localObject1;
      bool3 = true;
      ((Method)localObject1).setAccessible(bool3);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        try
        {
          localObject1 = a;
          boolean bool3 = true;
          localObject2 = new Object[bool3];
          i = 0;
          localObject3 = null;
          Integer localInteger = Integer.valueOf(paramInt);
          localObject2[0] = localInteger;
          ((Method)localObject1).invoke(paramDrawable, (Object[])localObject2);
          return bool1;
        }
        catch (Exception localException)
        {
          Object localObject3;
          String str = "DrawableCompatJellybeanMr1";
          localObject2 = "Failed to invoke setLayoutDirection(int) via reflection";
          Log.i(str, (String)localObject2, localException);
          bool1 = false;
          localObject4 = null;
          a = null;
        }
        localNoSuchMethodException = localNoSuchMethodException;
        localObject2 = "DrawableCompatJellybeanMr1";
        localObject3 = "Failed to retrieve setLayoutDirection(int) method";
        Log.i((String)localObject2, (String)localObject3, localNoSuchMethodException);
        continue;
        bool1 = false;
        Object localObject4 = null;
      }
    }
    b = bool1;
    localObject1 = a;
    if (localObject1 == null) {}
  }
}


/* Location:              android/support/v4/d/a/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */