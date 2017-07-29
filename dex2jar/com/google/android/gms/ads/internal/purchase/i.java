package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.tj;
import com.google.android.gms.b.tp;
import com.google.android.gms.common.a.a;
import org.json.JSONException;
import org.json.JSONObject;

@qi
public final class i
{
  public static int a(Intent paramIntent)
  {
    if (paramIntent == null) {
      return 5;
    }
    paramIntent = paramIntent.getExtras().get("RESPONSE_CODE");
    if (paramIntent == null)
    {
      tp.e("Intent with no response code, assuming OK (known issue)");
      return 0;
    }
    if ((paramIntent instanceof Integer)) {
      return ((Integer)paramIntent).intValue();
    }
    if ((paramIntent instanceof Long)) {
      return (int)((Long)paramIntent).longValue();
    }
    paramIntent = String.valueOf(paramIntent.getClass().getName());
    if (paramIntent.length() != 0) {}
    for (paramIntent = "Unexpected type for intent response code. ".concat(paramIntent);; paramIntent = new String("Unexpected type for intent response code. "))
    {
      tp.e(paramIntent);
      return 5;
    }
  }
  
  public static int a(Bundle paramBundle)
  {
    paramBundle = paramBundle.get("RESPONSE_CODE");
    if (paramBundle == null)
    {
      tp.e("Bundle with null response code, assuming OK (known issue)");
      return 0;
    }
    if ((paramBundle instanceof Integer)) {
      return ((Integer)paramBundle).intValue();
    }
    if ((paramBundle instanceof Long)) {
      return (int)((Long)paramBundle).longValue();
    }
    paramBundle = String.valueOf(paramBundle.getClass().getName());
    if (paramBundle.length() != 0) {}
    for (paramBundle = "Unexpected type for intent response code. ".concat(paramBundle);; paramBundle = new String("Unexpected type for intent response code. "))
    {
      tp.e(paramBundle);
      return 5;
    }
  }
  
  public static String a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString).getString("developerPayload");
      return paramString;
    }
    catch (JSONException paramString)
    {
      tp.e("Fail to parse purchase data");
    }
    return null;
  }
  
  public static String b(Intent paramIntent)
  {
    if (paramIntent == null) {
      return null;
    }
    return paramIntent.getStringExtra("INAPP_PURCHASE_DATA");
  }
  
  public static String b(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString).getString("purchaseToken");
      return paramString;
    }
    catch (JSONException paramString)
    {
      tp.e("Fail to parse purchase data");
    }
    return null;
  }
}


/* Location:              com/google/android/gms/ads/internal/purchase/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */