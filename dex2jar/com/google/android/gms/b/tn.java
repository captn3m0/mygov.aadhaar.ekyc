package com.google.android.gms.b;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import java.math.BigInteger;
import java.util.Locale;

@qi
public final class tn
{
  private static final Object a = new Object();
  private static String b;
  
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
    for (;;)
    {
      int i;
      synchronized (a)
      {
        if (b == null)
        {
          boolean bool = TextUtils.isEmpty(paramString1);
          if (!bool) {
            try
            {
              paramString2 = paramContext.createPackageContext(paramString2, 3).getClassLoader();
              Class localClass = Class.forName("com.google.ads.mediation.MediationAdapter", false, paramString2);
              paramContext = new BigInteger(new byte[1]);
              String[] arrayOfString = paramString1.split(",");
              i = 0;
              if (i >= arrayOfString.length) {
                continue;
              }
              w.e();
              paramString1 = paramContext;
              if (!tt.a(paramString2, localClass, arrayOfString[i])) {
                break label143;
              }
              paramString1 = paramContext.setBit(i);
            }
            catch (Throwable paramContext)
            {
              b = "err";
            }
          }
        }
        paramContext = b;
        return paramContext;
        b = String.format(Locale.US, "%X", new Object[] { paramContext });
      }
      label143:
      i += 1;
      paramContext = paramString1;
    }
  }
}


/* Location:              com/google/android/gms/b/tn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */