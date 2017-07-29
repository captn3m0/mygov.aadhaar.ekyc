package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

public final class w$a
{
  final String a;
  final ComponentName b;
  private final String c;
  
  public w$a(String paramString1, String paramString2)
  {
    String str = c.a(paramString1);
    c = str;
    str = c.a(paramString2);
    a = str;
    b = null;
  }
  
  public final Intent a()
  {
    Object localObject1 = c;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = new android/content/Intent;
      localObject2 = c;
      ((Intent)localObject1).<init>((String)localObject2);
      localObject2 = a;
    }
    for (localObject1 = ((Intent)localObject1).setPackage((String)localObject2);; localObject1 = ((Intent)localObject1).setComponent((ComponentName)localObject2))
    {
      return (Intent)localObject1;
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = b;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof a;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (a)paramObject;
        Object localObject1 = c;
        Object localObject2 = c;
        bool2 = b.a(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = b;
          localObject2 = b;
          bool2 = b.a(localObject1, localObject2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = c;
    arrayOfObject[0] = localObject;
    localObject = b;
    arrayOfObject[1] = localObject;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    String str = c;
    if (str == null) {}
    for (str = b.flattenToString();; str = c) {
      return str;
    }
  }
}


/* Location:              com/google/android/gms/common/internal/w$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */