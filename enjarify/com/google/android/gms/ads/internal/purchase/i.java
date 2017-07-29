package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.b.tp;
import org.json.JSONException;
import org.json.JSONObject;

public final class i
{
  public static int a(Intent paramIntent)
  {
    int i = 5;
    int j;
    if (paramIntent == null) {
      j = i;
    }
    for (;;)
    {
      return j;
      localObject = paramIntent.getExtras();
      str = "RESPONSE_CODE";
      localObject = ((Bundle)localObject).get(str);
      if (localObject == null)
      {
        tp.e("Intent with no response code, assuming OK (known issue)");
        j = 0;
        localObject = null;
      }
      else
      {
        boolean bool = localObject instanceof Integer;
        if (bool)
        {
          localObject = (Integer)localObject;
          j = ((Integer)localObject).intValue();
        }
        else
        {
          bool = localObject instanceof Long;
          if (!bool) {
            break;
          }
          localObject = (Long)localObject;
          long l = ((Long)localObject).longValue();
          j = (int)l;
        }
      }
    }
    String str = "Unexpected type for intent response code. ";
    Object localObject = String.valueOf(localObject.getClass().getName());
    int k = ((String)localObject).length();
    if (k != 0) {
      localObject = str.concat((String)localObject);
    }
    for (;;)
    {
      tp.e((String)localObject);
      j = i;
      break;
      localObject = new java/lang/String;
      ((String)localObject).<init>(str);
    }
  }
  
  public static int a(Bundle paramBundle)
  {
    Object localObject = paramBundle.get("RESPONSE_CODE");
    int i;
    if (localObject == null)
    {
      tp.e("Bundle with null response code, assuming OK (known issue)");
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      boolean bool = localObject instanceof Integer;
      if (bool)
      {
        localObject = (Integer)localObject;
        i = ((Integer)localObject).intValue();
      }
      else
      {
        bool = localObject instanceof Long;
        if (!bool) {
          break;
        }
        localObject = (Long)localObject;
        long l = ((Long)localObject).longValue();
        i = (int)l;
      }
    }
    String str = "Unexpected type for intent response code. ";
    localObject = String.valueOf(localObject.getClass().getName());
    int j = ((String)localObject).length();
    if (j != 0) {
      localObject = str.concat((String)localObject);
    }
    for (;;)
    {
      tp.e((String)localObject);
      i = 5;
      break;
      localObject = new java/lang/String;
      ((String)localObject).<init>(str);
    }
  }
  
  public static String a(String paramString)
  {
    String str1 = null;
    if (paramString == null) {}
    for (;;)
    {
      return str1;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        String str3 = "developerPayload";
        str1 = localJSONObject.getString(str3);
      }
      catch (JSONException localJSONException)
      {
        String str2 = "Fail to parse purchase data";
        tp.e(str2);
      }
    }
  }
  
  public static String b(Intent paramIntent)
  {
    if (paramIntent == null) {}
    for (String str = null;; str = paramIntent.getStringExtra("INAPP_PURCHASE_DATA")) {
      return str;
    }
  }
  
  public static String b(String paramString)
  {
    String str1 = null;
    if (paramString == null) {}
    for (;;)
    {
      return str1;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        String str3 = "purchaseToken";
        str1 = localJSONObject.getString(str3);
      }
      catch (JSONException localJSONException)
      {
        String str2 = "Fail to parse purchase data";
        tp.e(str2);
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */