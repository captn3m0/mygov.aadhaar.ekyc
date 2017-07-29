package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;

final class f
{
  static AppMeasurement a(Context paramContext)
  {
    try
    {
      localAppMeasurement = AppMeasurement.getInstance(paramContext);
    }
    catch (NoClassDefFoundError localNoClassDefFoundError)
    {
      for (;;)
      {
        AppMeasurement localAppMeasurement;
        Object localObject = null;
      }
    }
    return localAppMeasurement;
  }
  
  static void a(Context paramContext, String paramString, Intent paramIntent)
  {
    localObject1 = new android/os/Bundle;
    ((Bundle)localObject1).<init>();
    Object localObject2 = paramIntent.getStringExtra("google.c.a.c_id");
    if (localObject2 != null)
    {
      str2 = "_nmid";
      ((Bundle)localObject1).putString(str2, (String)localObject2);
    }
    localObject2 = paramIntent.getStringExtra("google.c.a.c_l");
    if (localObject2 != null)
    {
      str2 = "_nmn";
      ((Bundle)localObject1).putString(str2, (String)localObject2);
    }
    localObject2 = paramIntent.getStringExtra("from");
    if (localObject2 != null)
    {
      str2 = "/topics/";
      boolean bool1 = ((String)localObject2).startsWith(str2);
      if (!bool1) {}
    }
    for (;;)
    {
      if (localObject2 != null)
      {
        str2 = "_nt";
        ((Bundle)localObject1).putString(str2, (String)localObject2);
      }
      localObject2 = "google.c.a.ts";
      try
      {
        localObject2 = paramIntent.getStringExtra((String)localObject2);
        localObject2 = Integer.valueOf((String)localObject2);
        int j = ((Integer)localObject2).intValue();
        str2 = "_nmt";
        ((Bundle)localObject1).putInt(str2, j);
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        for (;;)
        {
          boolean bool2;
          str2 = "FirebaseMessaging";
          localObject4 = "Error while parsing timestamp in GCM event";
          Log.w(str2, (String)localObject4, localNumberFormatException1);
        }
      }
      localObject2 = "google.c.a.udt";
      bool2 = paramIntent.hasExtra((String)localObject2);
      if (bool2) {
        localObject2 = "google.c.a.udt";
      }
      try
      {
        localObject2 = paramIntent.getStringExtra((String)localObject2);
        localObject2 = Integer.valueOf((String)localObject2);
        int k = ((Integer)localObject2).intValue();
        str2 = "_ndt";
        ((Bundle)localObject1).putInt(str2, k);
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        for (;;)
        {
          int i;
          boolean bool3;
          int m;
          int n;
          Object localObject3;
          str2 = "FirebaseMessaging";
          Object localObject4 = "Error while parsing use_device_time in GCM event";
          Log.w(str2, (String)localObject4, localNumberFormatException2);
          continue;
          String str1 = "FirebaseMessaging";
          localObject1 = "Unable to log event: analytics library is missing";
          Log.w(str1, (String)localObject1);
        }
      }
      localObject2 = "FirebaseMessaging";
      i = 3;
      bool3 = Log.isLoggable((String)localObject2, i);
      if (bool3)
      {
        localObject2 = "FirebaseMessaging";
        str2 = String.valueOf(localObject1);
        m = String.valueOf(paramString).length() + 22;
        n = String.valueOf(str2).length();
        m += n;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>(m);
        localObject4 = ((StringBuilder)localObject3).append("Sending event=").append(paramString);
        localObject3 = " params=";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject3);
        str2 = str2;
        Log.d((String)localObject2, str2);
      }
      localObject2 = a(paramContext);
      if (localObject2 == null) {
        break label397;
      }
      str2 = "fcm";
      ((AppMeasurement)localObject2).logEventInternal(str2, paramString, (Bundle)localObject1);
      return;
      bool3 = false;
      localObject2 = null;
    }
  }
}


/* Location:              com/google/firebase/messaging/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */