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
    if (!b) {}
    try
    {
      Field localField = Resources.class.getDeclaredField("mDrawableCache");
      a = localField;
      localField.setAccessible(true);
      b = true;
      if (a == null) {}
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      try
      {
        paramResources = (Map)a.get(paramResources);
        if (paramResources != null)
        {
          paramResources.clear();
          return true;
          localNoSuchFieldException = localNoSuchFieldException;
          Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", localNoSuchFieldException);
        }
      }
      catch (IllegalAccessException paramResources)
      {
        for (;;)
        {
          Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", paramResources);
          paramResources = null;
        }
      }
    }
    return false;
  }
  
  private static boolean a(Object paramObject)
  {
    if (!d) {}
    try
    {
      c = Class.forName("android.content.res.ThemedResourceCache");
      d = true;
      if (c == null) {
        return false;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", localClassNotFoundException);
      }
      if (!f) {}
      try
      {
        Field localField = c.getDeclaredField("mUnthemedEntries");
        e = localField;
        localField.setAccessible(true);
        f = true;
        if (e == null) {
          return false;
        }
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        for (;;)
        {
          Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", localNoSuchFieldException);
        }
        try
        {
          paramObject = (LongSparseArray)e.get(paramObject);
          if (paramObject != null)
          {
            ((LongSparseArray)paramObject).clear();
            return true;
          }
        }
        catch (IllegalAccessException paramObject)
        {
          for (;;)
          {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", (Throwable)paramObject);
            paramObject = null;
          }
        }
      }
    }
    return false;
  }
  
  static boolean b(Resources paramResources)
  {
    if (!b) {}
    try
    {
      Field localField = Resources.class.getDeclaredField("mDrawableCache");
      a = localField;
      localField.setAccessible(true);
      b = true;
      if (a == null) {}
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      do
      {
        for (;;)
        {
          try
          {
            paramResources = a.get(paramResources);
            if (paramResources != null) {
              break;
            }
            return false;
          }
          catch (IllegalAccessException paramResources)
          {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", paramResources);
          }
          localNoSuchFieldException = localNoSuchFieldException;
          Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", localNoSuchFieldException);
          continue;
          paramResources = null;
        }
      } while ((paramResources == null) || (!a(paramResources)));
    }
    return true;
  }
  
  static boolean c(Resources paramResources)
  {
    if (!h) {}
    for (;;)
    {
      try
      {
        Field localField1 = Resources.class.getDeclaredField("mResourcesImpl");
        g = localField1;
        localField1.setAccessible(true);
        h = true;
        if (g == null) {
          return false;
        }
      }
      catch (NoSuchFieldException localNoSuchFieldException1)
      {
        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", localNoSuchFieldException1);
        continue;
      }
      try
      {
        paramResources = g.get(paramResources);
        if (paramResources == null) {
          continue;
        }
        if (b) {}
      }
      catch (IllegalAccessException paramResources)
      {
        try
        {
          Field localField2 = paramResources.getClass().getDeclaredField("mDrawableCache");
          a = localField2;
          localField2.setAccessible(true);
          b = true;
          if (a != null)
          {
            try
            {
              paramResources = a.get(paramResources);
              if ((paramResources == null) || (!a(paramResources))) {
                continue;
              }
              return true;
            }
            catch (IllegalAccessException paramResources)
            {
              Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", paramResources);
            }
            paramResources = paramResources;
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", paramResources);
            paramResources = null;
          }
        }
        catch (NoSuchFieldException localNoSuchFieldException2)
        {
          for (;;)
          {
            Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", localNoSuchFieldException2);
            continue;
            paramResources = null;
          }
        }
      }
    }
  }
}


/* Location:              android/support/v7/app/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */