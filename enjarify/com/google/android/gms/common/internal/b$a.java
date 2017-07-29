package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

public final class b$a
{
  private final List a;
  private final Object b;
  
  private b$a(Object paramObject)
  {
    Object localObject = c.a(paramObject);
    b = localObject;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    a = ((List)localObject);
  }
  
  public final a a(String paramString, Object paramObject)
  {
    List localList = a;
    String str1 = (String)c.a(paramString);
    String str2 = String.valueOf(String.valueOf(paramObject));
    int i = String.valueOf(str1).length() + 1;
    int j = String.valueOf(str2).length();
    i += j;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i);
    str1 = str1 + "=" + str2;
    localList.add(str1);
    return this;
  }
  
  public final String toString()
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>(100);
    String str = b.getClass().getSimpleName();
    StringBuilder localStringBuilder = ((StringBuilder)localObject).append(str).append('{');
    int i = a.size();
    int j = 0;
    localObject = null;
    int k = 0;
    str = null;
    while (k < i)
    {
      localObject = (String)a.get(k);
      localStringBuilder.append((String)localObject);
      j = i + -1;
      if (k < j)
      {
        localObject = ", ";
        localStringBuilder.append((String)localObject);
      }
      j = k + 1;
      k = j;
    }
    return '}';
  }
}


/* Location:              com/google/android/gms/common/internal/b$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */