package com.google.firebase;

import com.google.android.gms.common.internal.b.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.util.k;
import java.util.Arrays;

public final class b
{
  public final String a;
  public final String b;
  private final String c;
  private final String d;
  private final String e;
  private final String f;
  
  b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    boolean bool = k.a(paramString1);
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      c.a(bool, "ApplicationId must be set.");
      a = paramString1;
      c = paramString2;
      d = paramString3;
      e = paramString4;
      b = paramString5;
      f = paramString6;
      return;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof b;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (b)paramObject;
      String str1 = a;
      String str2 = a;
      bool2 = com.google.android.gms.common.internal.b.a(str1, str2);
      if (bool2)
      {
        str1 = c;
        str2 = c;
        bool2 = com.google.android.gms.common.internal.b.a(str1, str2);
        if (bool2)
        {
          str1 = d;
          str2 = d;
          bool2 = com.google.android.gms.common.internal.b.a(str1, str2);
          if (bool2)
          {
            str1 = e;
            str2 = e;
            bool2 = com.google.android.gms.common.internal.b.a(str1, str2);
            if (bool2)
            {
              str1 = b;
              str2 = b;
              bool2 = com.google.android.gms.common.internal.b.a(str1, str2);
              if (bool2)
              {
                str1 = f;
                str2 = f;
                bool2 = com.google.android.gms.common.internal.b.a(str1, str2);
                if (bool2) {
                  bool1 = true;
                }
              }
            }
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[6];
    String str = a;
    arrayOfObject[0] = str;
    str = c;
    arrayOfObject[1] = str;
    str = d;
    arrayOfObject[2] = str;
    str = e;
    arrayOfObject[3] = str;
    str = b;
    arrayOfObject[4] = str;
    str = f;
    arrayOfObject[5] = str;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    b.a locala = com.google.android.gms.common.internal.b.a(this);
    String str = a;
    locala = locala.a("applicationId", str);
    str = c;
    locala = locala.a("apiKey", str);
    str = d;
    locala = locala.a("databaseUrl", str);
    str = b;
    locala = locala.a("gcmSenderId", str);
    str = f;
    return locala.a("storageBucket", str).toString();
  }
}


/* Location:              com/google/firebase/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */