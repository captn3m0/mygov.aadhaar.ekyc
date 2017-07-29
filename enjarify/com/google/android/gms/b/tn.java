package com.google.android.gms.b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import java.math.BigInteger;
import java.util.Locale;

public final class tn
{
  private static final Object a;
  private static String b;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  public static String a()
  {
    synchronized (a)
    {
      String str = b;
      return str;
    }
  }
  
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    Object localObject1 = null;
    synchronized (a)
    {
      Object localObject5 = b;
      if (localObject5 == null)
      {
        boolean bool1 = TextUtils.isEmpty(paramString1);
        if (!bool1)
        {
          int i = 3;
          try
          {
            localObject5 = paramContext.createPackageContext(paramString2, i);
            localObject6 = ((Context)localObject5).getClassLoader();
            localObject5 = "com.google.ads.mediation.MediationAdapter";
            j = 0;
            localObject7 = null;
            localObject7 = Class.forName((String)localObject5, false, (ClassLoader)localObject6);
            localObject5 = new java/math/BigInteger;
            k = 1;
            localObject8 = new byte[k];
            ((BigInteger)localObject5).<init>((byte[])localObject8);
            localObject8 = ",";
            localObject8 = paramString1.split((String)localObject8);
            localObject1 = localObject5;
            i = 0;
            localObject5 = null;
            for (;;)
            {
              int m = localObject8.length;
              if (i >= m) {
                break;
              }
              w.e();
              String str2 = localObject8[i];
              boolean bool2 = tt.a((ClassLoader)localObject6, (Class)localObject7, str2);
              if (bool2) {
                localObject1 = ((BigInteger)localObject1).setBit(i);
              }
              i += 1;
            }
            str1 = b;
          }
          finally
          {
            str1 = "err";
            b = str1;
          }
        }
      }
      return str1;
      localObject5 = Locale.US;
      Object localObject6 = "%X";
      int j = 1;
      Object localObject7 = new Object[j];
      int k = 0;
      Object localObject8 = null;
      localObject7[0] = str1;
      String str1 = String.format((Locale)localObject5, (String)localObject6, (Object[])localObject7);
      b = str1;
    }
  }
}


/* Location:              com/google/android/gms/b/tn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */