package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

final class DynamiteModule$8
  extends PathClassLoader
{
  DynamiteModule$8(String paramString, ClassLoader paramClassLoader)
  {
    super(paramString, paramClassLoader);
  }
  
  protected final Class loadClass(String paramString, boolean paramBoolean)
  {
    Object localObject = "java.";
    boolean bool = paramString.startsWith((String)localObject);
    if (!bool)
    {
      localObject = "android.";
      bool = paramString.startsWith((String)localObject);
      if (bool) {}
    }
    for (;;)
    {
      try
      {
        localObject = findClass(paramString);
        return (Class)localObject;
      }
      catch (ClassNotFoundException localClassNotFoundException) {}
      Class localClass = super.loadClass(paramString, paramBoolean);
    }
  }
}


/* Location:              com/google/android/gms/dynamite/DynamiteModule$8.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */