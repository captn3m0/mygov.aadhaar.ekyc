package com.a.a;

import android.util.Log;
import java.util.Locale;

public class t
{
  public static String a;
  public static boolean b;
  
  static
  {
    String str = "Volley";
    a = str;
    b = Log.isLoggable(str, 2);
  }
  
  public static void a(String paramString, Object... paramVarArgs)
  {
    boolean bool = b;
    if (bool)
    {
      String str1 = a;
      String str2 = e(paramString, paramVarArgs);
      Log.v(str1, str2);
    }
  }
  
  public static void a(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    String str1 = a;
    String str2 = e(paramString, paramVarArgs);
    Log.e(str1, str2, paramThrowable);
  }
  
  public static void b(String paramString, Object... paramVarArgs)
  {
    String str1 = a;
    String str2 = e(paramString, paramVarArgs);
    Log.d(str1, str2);
  }
  
  public static void c(String paramString, Object... paramVarArgs)
  {
    String str1 = a;
    String str2 = e(paramString, paramVarArgs);
    Log.e(str1, str2);
  }
  
  public static void d(String paramString, Object... paramVarArgs)
  {
    String str1 = a;
    String str2 = e(paramString, paramVarArgs);
    Log.wtf(str1, str2);
  }
  
  private static String e(String paramString, Object... paramVarArgs)
  {
    int i = 2;
    Object localObject3;
    int j;
    label32:
    Object localObject4;
    if (paramVarArgs == null)
    {
      localObject1 = new java/lang/Throwable;
      ((Throwable)localObject1).<init>();
      localObject1 = ((Throwable)localObject1).fillInStackTrace();
      Object localObject2 = ((Throwable)localObject1).getStackTrace();
      localObject3 = "<unknown>";
      j = i;
      int k = localObject2.length;
      if (j >= k) {
        break label280;
      }
      localObject4 = localObject2[j].getClass();
      Class localClass = t.class;
      boolean bool = localObject4.equals(localClass);
      if (bool) {
        break label271;
      }
      localObject3 = localObject2[j].getClassName();
      int m = ((String)localObject3).lastIndexOf('.') + 1;
      localObject3 = ((String)localObject3).substring(m);
      m = ((String)localObject3).lastIndexOf('$') + 1;
      localObject3 = String.valueOf(String.valueOf(((String)localObject3).substring(m)));
      localObject1 = String.valueOf(String.valueOf(localObject2[j].getMethodName()));
      localObject2 = new java/lang/StringBuilder;
      m = ((String)localObject3).length() + 1;
      int n = ((String)localObject1).length();
      m += n;
      ((StringBuilder)localObject2).<init>(m);
      localObject3 = ((StringBuilder)localObject2).append((String)localObject3);
      localObject2 = ".";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject2);
    }
    label271:
    label280:
    for (Object localObject1 = (String)localObject1;; localObject1 = localObject3)
    {
      localObject3 = Locale.US;
      localObject4 = new Object[3];
      Long localLong = Long.valueOf(Thread.currentThread().getId());
      localObject4[0] = localLong;
      localObject4[1] = localObject1;
      localObject4[i] = paramString;
      return String.format((Locale)localObject3, "[%d] %s: %s", (Object[])localObject4);
      localObject1 = Locale.US;
      paramString = String.format((Locale)localObject1, paramString, paramVarArgs);
      break;
      j += 1;
      break label32;
    }
  }
}


/* Location:              com/a/a/t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */