package com.google.android.gms.b;

import android.text.TextUtils;

@qi
public abstract class kj
{
  @qi
  public static final kj a = new kj()
  {
    public final String a(String paramAnonymousString1, String paramAnonymousString2)
    {
      return paramAnonymousString2;
    }
  };
  @qi
  public static final kj b = new kj()
  {
    public final String a(String paramAnonymousString1, String paramAnonymousString2)
    {
      if (paramAnonymousString1 != null) {
        return paramAnonymousString1;
      }
      return paramAnonymousString2;
    }
  };
  @qi
  public static final kj c = new kj()
  {
    private static String a(String paramAnonymousString)
    {
      if (TextUtils.isEmpty(paramAnonymousString)) {}
      int i;
      int j;
      do
      {
        return paramAnonymousString;
        i = 0;
        int k = paramAnonymousString.length();
        for (;;)
        {
          j = k;
          if (i >= paramAnonymousString.length()) {
            break;
          }
          j = k;
          if (paramAnonymousString.charAt(i) != ',') {
            break;
          }
          i += 1;
        }
        while ((j > 0) && (paramAnonymousString.charAt(j - 1) == ',')) {
          j -= 1;
        }
      } while ((i == 0) && (j == paramAnonymousString.length()));
      return paramAnonymousString.substring(i, j);
    }
    
    public final String a(String paramAnonymousString1, String paramAnonymousString2)
    {
      paramAnonymousString1 = a(paramAnonymousString1);
      paramAnonymousString2 = a(paramAnonymousString2);
      if (TextUtils.isEmpty(paramAnonymousString1)) {
        return paramAnonymousString2;
      }
      if (TextUtils.isEmpty(paramAnonymousString2)) {
        return paramAnonymousString1;
      }
      return String.valueOf(paramAnonymousString1).length() + 1 + String.valueOf(paramAnonymousString2).length() + paramAnonymousString1 + "," + paramAnonymousString2;
    }
  };
  
  public abstract String a(String paramString1, String paramString2);
}


/* Location:              com/google/android/gms/b/kj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */