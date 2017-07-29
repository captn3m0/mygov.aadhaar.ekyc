package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

final class h$a
{
  private static final long d = TimeUnit.DAYS.toMillis(7);
  final String a;
  final String b;
  final long c;
  
  private h$a(String paramString1, String paramString2, long paramLong)
  {
    a = paramString1;
    b = paramString2;
    c = paramLong;
  }
  
  static a a(String paramString)
  {
    Object localObject1 = null;
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {}
    for (;;)
    {
      return (a)localObject1;
      Object localObject2 = "{";
      bool = paramString.startsWith((String)localObject2);
      Object localObject3;
      if (bool)
      {
        try
        {
          localObject4 = new org/json/JSONObject;
          ((JSONObject)localObject4).<init>(paramString);
          localObject2 = new com/google/firebase/iid/h$a;
          localObject5 = "token";
          localObject5 = ((JSONObject)localObject4).getString((String)localObject5);
          localObject6 = "appVersion";
          localObject6 = ((JSONObject)localObject4).getString((String)localObject6);
          String str = "timestamp";
          long l1 = ((JSONObject)localObject4).getLong(str);
          ((a)localObject2).<init>((String)localObject5, (String)localObject6, l1);
          localObject1 = localObject2;
        }
        catch (JSONException localJSONException)
        {
          Object localObject4 = "InstanceID/Store";
          localObject3 = String.valueOf(localJSONException);
          int i = String.valueOf(localObject3).length() + 23;
          Object localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>(i);
          Object localObject5 = ((StringBuilder)localObject6).append("Failed to parse token: ");
          localObject3 = (String)localObject3;
          Log.w((String)localObject4, (String)localObject3);
        }
      }
      else
      {
        localObject3 = new com/google/firebase/iid/h$a;
        long l2 = 0L;
        ((a)localObject3).<init>(paramString, null, l2);
        localObject1 = localObject3;
      }
    }
  }
  
  static String a(String paramString1, String paramString2, long paramLong)
  {
    try
    {
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      str2 = "token";
      ((JSONObject)localObject).put(str2, paramString1);
      str2 = "appVersion";
      ((JSONObject)localObject).put(str2, paramString2);
      str2 = "timestamp";
      ((JSONObject)localObject).put(str2, paramLong);
      localObject = ((JSONObject)localObject).toString();
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject;
        String str2 = "InstanceID/Store";
        String str1 = String.valueOf(localJSONException);
        int i = String.valueOf(str1).length() + 24;
        StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
        localStringBuilder1.<init>(i);
        StringBuilder localStringBuilder2 = localStringBuilder1.append("Failed to encode token: ");
        str1 = str1;
        Log.w(str2, str1);
        str1 = null;
      }
    }
    return (String)localObject;
  }
  
  final boolean b(String paramString)
  {
    long l1 = System.currentTimeMillis();
    long l2 = c;
    long l3 = d;
    l2 += l3;
    boolean bool = l1 < l2;
    String str;
    if (!bool)
    {
      str = b;
      bool = paramString.equals(str);
      if (bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
}


/* Location:              com/google/firebase/iid/h$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */