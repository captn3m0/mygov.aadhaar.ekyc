package android.support.v7.app;

import android.content.res.Resources;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

final class p
{
  private static Field a;
  private static boolean b;
  private static Class c;
  private static boolean d;
  private static Field e;
  private static boolean f;
  private static Field g;
  private static boolean h;
  
  static boolean a(Resources paramResources)
  {
    boolean bool1 = true;
    bool2 = b;
    if (!bool2)
    {
      localObject1 = Resources.class;
      str1 = "mDrawableCache";
    }
    try
    {
      localObject1 = ((Class)localObject1).getDeclaredField(str1);
      a = (Field)localObject1;
      bool3 = true;
      ((Field)localObject1).setAccessible(bool3);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        boolean bool3;
        str1 = "ResourcesFlusher";
        str2 = "Could not retrieve Resources#mDrawableCache field";
        Log.e(str1, str2, localNoSuchFieldException);
        continue;
        bool2 = false;
        Object localObject2 = null;
      }
    }
    b = bool1;
    Object localObject1 = a;
    if (localObject1 != null)
    {
      bool3 = false;
      str1 = null;
      try
      {
        localObject1 = a;
        localObject1 = ((Field)localObject1).get(paramResources);
        localObject1 = (Map)localObject1;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;)
        {
          String str2 = "ResourcesFlusher";
          String str3 = "Could not retrieve value from Resources#mDrawableCache";
          Log.e(str2, str3, localIllegalAccessException);
          bool2 = false;
          localObject2 = null;
        }
      }
      if (localObject1 != null)
      {
        ((Map)localObject1).clear();
        bool2 = bool1;
        return bool2;
      }
    }
  }
  
  private static boolean a(Object paramObject)
  {
    bool1 = true;
    bool2 = d;
    if (!bool2) {
      localObject1 = "android.content.res.ThemedResourceCache";
    }
    try
    {
      localObject1 = Class.forName((String)localObject1);
      c = (Class)localObject1;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      String str2;
      for (;;)
      {
        String str1 = "ResourcesFlusher";
        str2 = "Could not find ThemedResourceCache class";
        Log.e(str1, str2, localClassNotFoundException);
        continue;
        bool2 = f;
        if (!bool2) {}
        try
        {
          Object localObject2 = c;
          str1 = "mUnthemedEntries";
          localObject2 = ((Class)localObject2).getDeclaredField(str1);
          e = (Field)localObject2;
          bool3 = true;
          ((Field)localObject2).setAccessible(bool3);
          f = bool1;
          localObject2 = e;
          if (localObject2 == null)
          {
            bool2 = false;
            localObject2 = null;
          }
        }
        catch (NoSuchFieldException localNoSuchFieldException)
        {
          for (;;)
          {
            str1 = "ResourcesFlusher";
            str2 = "Could not retrieve ThemedResourceCache#mUnthemedEntries field";
            Log.e(str1, str2, localNoSuchFieldException);
          }
          boolean bool3 = false;
          str1 = null;
          try
          {
            localObject3 = e;
            localObject3 = ((Field)localObject3).get(paramObject);
            localObject3 = (LongSparseArray)localObject3;
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            for (;;)
            {
              Object localObject3;
              str2 = "ResourcesFlusher";
              String str3 = "Could not retrieve value from ThemedResourceCache#mUnthemedEntries";
              Log.e(str2, str3, localIllegalAccessException);
              bool2 = false;
              localObject4 = null;
            }
            bool2 = false;
            Object localObject4 = null;
          }
          if (localObject3 != null)
          {
            ((LongSparseArray)localObject3).clear();
            bool2 = bool1;
          }
        }
      }
    }
    d = bool1;
    Object localObject1 = c;
    if (localObject1 == null)
    {
      bool2 = false;
      localObject1 = null;
      return bool2;
    }
  }
  
  static boolean b(Resources paramResources)
  {
    bool1 = false;
    bool2 = true;
    bool3 = b;
    if (!bool3)
    {
      localObject1 = Resources.class;
      str1 = "mDrawableCache";
    }
    try
    {
      localObject1 = ((Class)localObject1).getDeclaredField(str1);
      a = (Field)localObject1;
      bool4 = true;
      ((Field)localObject1).setAccessible(bool4);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        try
        {
          boolean bool4;
          localObject1 = a;
          localObject1 = ((Field)localObject1).get(paramResources);
          if (localObject1 != null) {
            break label135;
          }
          return bool1;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          String str2 = "ResourcesFlusher";
          String str3 = "Could not retrieve value from Resources#mDrawableCache";
          Log.e(str2, str3, localIllegalAccessException);
        }
        localNoSuchFieldException = localNoSuchFieldException;
        str1 = "ResourcesFlusher";
        str2 = "Could not retrieve Resources#mDrawableCache field";
        Log.e(str1, str2, localNoSuchFieldException);
        continue;
        bool3 = false;
        Object localObject2 = null;
        continue;
        if (localObject2 != null)
        {
          bool3 = a(localObject2);
          if (bool3) {
            bool1 = bool2;
          }
        }
      }
    }
    b = bool2;
    bool4 = false;
    str1 = null;
    localObject1 = a;
    if (localObject1 == null) {}
  }
  
  static boolean c(Resources paramResources)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    bool3 = h;
    if (!bool3)
    {
      localObject1 = Resources.class;
      localObject4 = "mResourcesImpl";
    }
    boolean bool4;
    try
    {
      localObject1 = ((Class)localObject1).getDeclaredField((String)localObject4);
      g = (Field)localObject1;
      bool4 = true;
      ((Field)localObject1).setAccessible(bool4);
    }
    catch (NoSuchFieldException localNoSuchFieldException1)
    {
      for (;;)
      {
        localObject4 = "ResourcesFlusher";
        str1 = "Could not retrieve Resources#mResourcesImpl field";
        Log.e((String)localObject4, str1, localNoSuchFieldException1);
      }
    }
    h = bool2;
    Object localObject1 = g;
    if (localObject1 == null) {}
    for (;;)
    {
      return bool1;
      try
      {
        localObject2 = g;
        localObject2 = ((Field)localObject2).get(paramResources);
        localObject4 = localObject2;
        if (localObject4 == null) {
          continue;
        }
        bool3 = b;
        if (!bool3) {}
        try
        {
          localObject2 = localObject4.getClass();
          str1 = "mDrawableCache";
          localObject2 = ((Class)localObject2).getDeclaredField(str1);
          a = (Field)localObject2;
          boolean bool5 = true;
          ((Field)localObject2).setAccessible(bool5);
        }
        catch (NoSuchFieldException localNoSuchFieldException2)
        {
          for (;;)
          {
            str1 = "ResourcesFlusher";
            String str2 = "Could not retrieve ResourcesImpl#mDrawableCache field";
            Log.e(str1, str2, localNoSuchFieldException2);
            continue;
            bool3 = false;
            Object localObject3 = null;
          }
        }
        b = bool2;
        localObject2 = a;
        if (localObject2 == null) {}
      }
      catch (IllegalAccessException localIllegalAccessException1)
      {
        for (;;)
        {
          try
          {
            Object localObject2 = a;
            localObject2 = ((Field)localObject2).get(localObject4);
            if (localObject2 == null) {
              break;
            }
            bool3 = a(localObject2);
            if (!bool3) {
              break;
            }
            bool1 = bool2;
          }
          catch (IllegalAccessException localIllegalAccessException2)
          {
            localObject4 = "ResourcesFlusher";
            String str1 = "Could not retrieve value from ResourcesImpl#mDrawableCache";
            Log.e((String)localObject4, str1, localIllegalAccessException2);
          }
          localIllegalAccessException1 = localIllegalAccessException1;
          str1 = "Could not retrieve value from Resources#mResourcesImpl";
          Log.e("ResourcesFlusher", str1, localIllegalAccessException1);
          bool4 = false;
          localObject4 = null;
        }
      }
    }
  }
}


/* Location:              android/support/v7/app/p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */