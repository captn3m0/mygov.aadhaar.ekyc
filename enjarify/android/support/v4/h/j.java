package android.support.v4.h;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

final class j
{
  private static Field a;
  private static boolean b;
  
  static void a(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2)
  {
    boolean bool1 = true;
    boolean bool2 = b;
    if (!bool2)
    {
      localObject1 = LayoutInflater.class;
      str1 = "mFactory2";
    }
    try
    {
      localObject1 = ((Class)localObject1).getDeclaredField(str1);
      a = (Field)localObject1;
      boolean bool3 = true;
      ((Field)localObject1).setAccessible(bool3);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        try
        {
          localObject1 = a;
          ((Field)localObject1).set(paramLayoutInflater, paramFactory2);
          return;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          str1 = "LayoutInflaterCompatHC";
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
          localObject2 = ((StringBuilder)localObject2).append(paramLayoutInflater);
          String str2 = "; inflation may have unexpected results.";
          localObject2 = str2;
          Log.e(str1, (String)localObject2, localIllegalAccessException);
          continue;
        }
        localNoSuchFieldException = localNoSuchFieldException;
        str1 = "LayoutInflaterCompatHC";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("forceSetFactory2 Could not find field 'mFactory2' on class ");
        str2 = LayoutInflater.class.getName();
        localObject2 = ((StringBuilder)localObject2).append(str2);
        str2 = "; inflation may have unexpected results.";
        localObject2 = str2;
        Log.e(str1, (String)localObject2, localNoSuchFieldException);
      }
    }
    b = bool1;
    localObject1 = a;
    if (localObject1 == null) {}
  }
}


/* Location:              android/support/v4/h/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */