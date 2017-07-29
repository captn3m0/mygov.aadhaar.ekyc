package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

public final class b
{
  public static a a(Object paramObject)
  {
    return new a(paramObject, (byte)0);
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  public static final class a
  {
    private final List<String> a;
    private final Object b;
    
    private a(Object paramObject)
    {
      b = c.a(paramObject);
      a = new ArrayList();
    }
    
    public final a a(String paramString, Object paramObject)
    {
      List localList = a;
      paramString = (String)c.a(paramString);
      paramObject = String.valueOf(String.valueOf(paramObject));
      localList.add(String.valueOf(paramString).length() + 1 + String.valueOf(paramObject).length() + paramString + "=" + (String)paramObject);
      return this;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(100).append(b.getClass().getSimpleName()).append('{');
      int j = a.size();
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append((String)a.get(i));
        if (i < j - 1) {
          localStringBuilder.append(", ");
        }
        i += 1;
      }
      return '}';
    }
  }
}


/* Location:              com/google/android/gms/common/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */