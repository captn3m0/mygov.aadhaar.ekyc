package com.google.firebase.iid;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;

public final class e
{
  private static final Object a;
  private final h b;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  e(h paramh)
  {
    b = paramh;
  }
  
  final String a()
  {
    int i = 0;
    String str1 = null;
    int j = 1;
    synchronized (a)
    {
      Object localObject3 = b;
      localObject3 = a;
      String str2 = "topic_operaion_queue";
      localObject3 = ((SharedPreferences)localObject3).getString(str2, null);
      if (localObject3 != null)
      {
        str2 = ",";
        localObject3 = ((String)localObject3).split(str2);
        int k = localObject3.length;
        if (k > j)
        {
          k = 1;
          str2 = localObject3[k];
          boolean bool = TextUtils.isEmpty(str2);
          if (!bool)
          {
            i = 1;
            str1 = localObject3[i];
            return str1;
          }
        }
      }
    }
  }
  
  final boolean a(String paramString)
  {
    for (;;)
    {
      String str2;
      synchronized (a)
      {
        Object localObject2 = b;
        localObject2 = a;
        Object localObject4 = "topic_operaion_queue";
        str2 = "";
        localObject4 = ((SharedPreferences)localObject2).getString((String)localObject4, str2);
        localObject2 = ",";
        str2 = String.valueOf(localObject2);
        localObject2 = String.valueOf(paramString);
        int i = ((String)localObject2).length();
        if (i != 0)
        {
          localObject2 = str2.concat((String)localObject2);
          boolean bool = ((String)localObject4).startsWith((String)localObject2);
          if (!bool) {
            break label209;
          }
          localObject2 = ",";
          str2 = String.valueOf(localObject2);
          localObject2 = String.valueOf(paramString);
          i = ((String)localObject2).length();
          if (i != 0)
          {
            localObject2 = str2.concat((String)localObject2);
            int j = ((String)localObject2).length();
            localObject2 = ((String)localObject4).substring(j);
            localObject4 = b;
            localObject4 = a;
            localObject4 = ((SharedPreferences)localObject4).edit();
            str2 = "topic_operaion_queue";
            localObject2 = ((SharedPreferences.Editor)localObject4).putString(str2, (String)localObject2);
            ((SharedPreferences.Editor)localObject2).apply();
            j = 1;
            return j;
          }
        }
        else
        {
          localObject2 = new java/lang/String;
          ((String)localObject2).<init>(str2);
        }
      }
      String str1 = new java/lang/String;
      str1.<init>(str2);
      continue;
      label209:
      int k = 0;
      str1 = null;
    }
  }
}


/* Location:              com/google/firebase/iid/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */