package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.h.w;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class bk
{
  private static Method a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 18;
    Object localObject;
    String str2;
    int k;
    if (i >= j)
    {
      localObject = View.class;
      str2 = "computeFitSystemWindows";
      k = 2;
    }
    try
    {
      Class[] arrayOfClass = new Class[k];
      int m = 0;
      Class localClass = Rect.class;
      arrayOfClass[0] = localClass;
      m = 1;
      localClass = Rect.class;
      arrayOfClass[m] = localClass;
      localObject = ((Class)localObject).getDeclaredMethod(str2, arrayOfClass);
      a = (Method)localObject;
      boolean bool = ((Method)localObject).isAccessible();
      if (!bool)
      {
        localObject = a;
        j = 1;
        ((Method)localObject).setAccessible(j);
      }
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        String str1 = "ViewUtils";
        str2 = "Could not find method computeFitSystemWindows. Oh well.";
        Log.d(str1, str2);
      }
    }
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    return paramInt1 | paramInt2;
  }
  
  public static void a(View paramView, Rect paramRect1, Rect paramRect2)
  {
    Method localMethod = a;
    if (localMethod != null) {}
    try
    {
      localMethod = a;
      int i = 2;
      localObject = new Object[i];
      int j = 0;
      str = null;
      localObject[0] = paramRect1;
      j = 1;
      localObject[j] = paramRect2;
      localMethod.invoke(paramView, (Object[])localObject);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject = "ViewUtils";
        String str = "Could not invoke computeFitSystemWindows";
        Log.d((String)localObject, str, localException);
      }
    }
  }
  
  public static boolean a(View paramView)
  {
    int i = 1;
    int j = w.g(paramView);
    if (j == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public static void b(View paramView)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    if (i >= j) {}
    try
    {
      Object localObject1 = paramView.getClass();
      localObject2 = "makeOptionalFitsSystemWindows";
      localObject3 = null;
      localObject3 = new Class[0];
      localObject1 = ((Class)localObject1).getMethod((String)localObject2, (Class[])localObject3);
      boolean bool = ((Method)localObject1).isAccessible();
      if (!bool)
      {
        bool = true;
        ((Method)localObject1).setAccessible(bool);
      }
      bool = false;
      localObject2 = null;
      localObject2 = new Object[0];
      ((Method)localObject1).invoke(paramView, (Object[])localObject2);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        String str = "ViewUtils";
        localObject2 = "Could not find method makeOptionalFitsSystemWindows. Oh well...";
        Log.d(str, (String)localObject2);
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;)
      {
        localObject2 = "ViewUtils";
        localObject3 = "Could not invoke makeOptionalFitsSystemWindows";
        Log.d((String)localObject2, (String)localObject3, localInvocationTargetException);
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        Object localObject2 = "ViewUtils";
        Object localObject3 = "Could not invoke makeOptionalFitsSystemWindows";
        Log.d((String)localObject2, (String)localObject3, localIllegalAccessException);
      }
    }
  }
}


/* Location:              android/support/v7/widget/bk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */