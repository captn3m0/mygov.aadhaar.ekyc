package com.google.android.gms.b;

import android.text.TextUtils;

final class kj$3
  extends kj
{
  private static String a(String paramString)
  {
    int i = 44;
    int j = TextUtils.isEmpty(paramString);
    if (j != 0) {}
    for (;;)
    {
      return paramString;
      j = 0;
      int m = paramString.length();
      int i1;
      int k;
      for (;;)
      {
        int n = paramString.length();
        if (j >= n) {
          break;
        }
        i1 = paramString.charAt(j);
        if (i1 != i) {
          break;
        }
        j += 1;
      }
      while (m > 0)
      {
        i1 = m + -1;
        i1 = paramString.charAt(i1);
        if (i1 != i) {
          break;
        }
        m += -1;
      }
      if (k == 0)
      {
        i1 = paramString.length();
        if (m == i1) {}
      }
      else
      {
        paramString = paramString.substring(k, m);
      }
    }
  }
  
  public final String a(String paramString1, String paramString2)
  {
    Object localObject1 = a(paramString1);
    Object localObject2 = a(paramString2);
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    if (bool) {}
    for (;;)
    {
      return (String)localObject2;
      bool = TextUtils.isEmpty((CharSequence)localObject2);
      if (bool)
      {
        localObject2 = localObject1;
      }
      else
      {
        int i = String.valueOf(localObject1).length() + 1;
        int j = String.valueOf(localObject2).length();
        i += j;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i);
        localObject1 = localStringBuilder.append((String)localObject1);
        String str = ",";
        localObject1 = ((StringBuilder)localObject1).append(str);
        localObject2 = (String)localObject2;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/kj$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */