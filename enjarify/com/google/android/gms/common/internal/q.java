package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v4.g.k;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.a.b;
import com.google.android.gms.b.bb;
import com.google.android.gms.b.bc;
import java.util.Locale;

public final class q
{
  private static final k a;
  
  static
  {
    k localk = new android/support/v4/g/k;
    localk.<init>();
    a = localk;
  }
  
  private static String a(Context paramContext)
  {
    String str1 = getApplicationInfoname;
    boolean bool = TextUtils.isEmpty(str1);
    if (bool) {
      str1 = paramContext.getPackageName();
    }
    try
    {
      Object localObject = bc.a(paramContext);
      String str2 = paramContext.getPackageName();
      localObject = ((bb)localObject).b(str2);
      str1 = ((CharSequence)localObject).toString();
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;) {}
    }
    return str1;
  }
  
  public static String a(Context paramContext, int paramInt)
  {
    int i = 0;
    String str1 = null;
    Object localObject = paramContext.getResources();
    String str2;
    switch (paramInt)
    {
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 19: 
    default: 
      localObject = "GoogleApiAvailability";
      int j = 33;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(j);
      str2 = "Unexpected error code " + paramInt;
      Log.e((String)localObject, str2);
    }
    for (;;)
    {
      return str1;
      i = a.b.common_google_play_services_install_title;
      str1 = ((Resources)localObject).getString(i);
      continue;
      i = a.b.common_google_play_services_enable_title;
      str1 = ((Resources)localObject).getString(i);
      continue;
      i = a.b.common_google_play_services_update_title;
      str1 = ((Resources)localObject).getString(i);
      continue;
      localObject = "GoogleApiAvailability";
      str2 = "Google Play services is invalid. Cannot recover.";
      Log.e((String)localObject, str2);
      continue;
      localObject = "Network error occurred. Please retry request later.";
      Log.e("GoogleApiAvailability", (String)localObject);
      str1 = a(paramContext, "common_google_play_services_network_error_title");
      continue;
      localObject = "GoogleApiAvailability";
      str2 = "Internal error occurred. Please see logs for detailed information";
      Log.e((String)localObject, str2);
      continue;
      localObject = "GoogleApiAvailability";
      str2 = "Developer error occurred. Please see logs for detailed information";
      Log.e((String)localObject, str2);
      continue;
      localObject = "An invalid account was specified when connecting. Please provide a valid account.";
      Log.e("GoogleApiAvailability", (String)localObject);
      str1 = a(paramContext, "common_google_play_services_invalid_account_title");
      continue;
      localObject = "GoogleApiAvailability";
      str2 = "The application is not licensed to the user.";
      Log.e((String)localObject, str2);
      continue;
      localObject = "GoogleApiAvailability";
      str2 = "One of the API components you attempted to connect to is not available.";
      Log.e((String)localObject, str2);
      continue;
      localObject = "The specified account could not be signed in.";
      Log.e("GoogleApiAvailability", (String)localObject);
      str1 = a(paramContext, "common_google_play_services_sign_in_failed_title");
      continue;
      localObject = "The current user profile is restricted and could not use authenticated features.";
      Log.e("GoogleApiAvailability", (String)localObject);
      str1 = a(paramContext, "common_google_play_services_restricted_profile_title");
    }
  }
  
  private static String a(Context paramContext, String paramString)
  {
    k localk1 = null;
    for (;;)
    {
      String str2;
      String str3;
      int i;
      int j;
      synchronized (a)
      {
        Object localObject1 = a;
        localObject1 = ((k)localObject1).get(paramString);
        localObject1 = (String)localObject1;
        if (localObject1 != null) {
          return (String)localObject1;
        }
        localObject1 = com.google.android.gms.common.f.a(paramContext);
        if (localObject1 == null)
        {
          localObject1 = null;
          continue;
        }
        str2 = "string";
        str3 = "com.google.android.gms";
        i = ((Resources)localObject1).getIdentifier(paramString, str2, str3);
        if (i == 0)
        {
          str2 = "GoogleApiAvailability";
          str3 = "Missing resource: ";
          localObject1 = String.valueOf(paramString);
          j = ((String)localObject1).length();
          if (j != 0)
          {
            localObject1 = str3.concat((String)localObject1);
            Log.w(str2, (String)localObject1);
            localObject1 = null;
            continue;
          }
          localObject1 = new java/lang/String;
          ((String)localObject1).<init>(str3);
        }
      }
      String str1 = ((Resources)localObject2).getString(i);
      boolean bool = TextUtils.isEmpty(str1);
      if (bool)
      {
        str2 = "GoogleApiAvailability";
        str3 = "Got empty resource: ";
        str1 = String.valueOf(paramString);
        j = str1.length();
        if (j != 0) {
          str1 = str3.concat(str1);
        }
        for (;;)
        {
          Log.w(str2, str1);
          str1 = null;
          break;
          str1 = new java/lang/String;
          str1.<init>(str3);
        }
      }
      localk1 = a;
      localk1.put(paramString, str1);
    }
  }
  
  private static String a(Context paramContext, String paramString1, String paramString2)
  {
    Object localObject = paramContext.getResources();
    String str = a(paramContext, paramString1);
    if (str == null)
    {
      int i = a.b.common_google_play_services_unknown_issue;
      str = ((Resources)localObject).getString(i);
    }
    localObject = getConfigurationlocale;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString2;
    return String.format((Locale)localObject, str, arrayOfObject);
  }
  
  public static String b(Context paramContext, int paramInt)
  {
    int i = 6;
    if (paramInt == i) {}
    for (Object localObject = a(paramContext, "common_google_play_services_resolution_required_title");; localObject = a(paramContext, paramInt))
    {
      if (localObject == null)
      {
        localObject = paramContext.getResources();
        int j = a.b.common_google_play_services_notification_ticker;
        localObject = ((Resources)localObject).getString(j);
      }
      return (String)localObject;
    }
  }
  
  public static String c(Context paramContext, int paramInt)
  {
    int i = 1;
    Object localObject = paramContext.getResources();
    String str = a(paramContext);
    int j;
    Object[] arrayOfObject;
    switch (paramInt)
    {
    default: 
      j = a.b.common_google_play_services_unknown_issue;
      arrayOfObject = new Object[i];
      arrayOfObject[0] = str;
      localObject = ((Resources)localObject).getString(j, arrayOfObject);
    }
    for (;;)
    {
      return (String)localObject;
      j = a.b.common_google_play_services_install_text;
      arrayOfObject = new Object[i];
      arrayOfObject[0] = str;
      localObject = ((Resources)localObject).getString(j, arrayOfObject);
      continue;
      j = a.b.common_google_play_services_enable_text;
      arrayOfObject = new Object[i];
      arrayOfObject[0] = str;
      localObject = ((Resources)localObject).getString(j, arrayOfObject);
      continue;
      j = a.b.common_google_play_services_updating_text;
      arrayOfObject = new Object[i];
      arrayOfObject[0] = str;
      localObject = ((Resources)localObject).getString(j, arrayOfObject);
      continue;
      boolean bool = com.google.android.gms.common.util.f.a(paramContext);
      if (bool)
      {
        int m = a.b.common_google_play_services_wear_update_text;
        localObject = ((Resources)localObject).getString(m);
      }
      else
      {
        int k = a.b.common_google_play_services_update_text;
        arrayOfObject = new Object[i];
        arrayOfObject[0] = str;
        localObject = ((Resources)localObject).getString(k, arrayOfObject);
        continue;
        k = a.b.common_google_play_services_unsupported_text;
        arrayOfObject = new Object[i];
        arrayOfObject[0] = str;
        localObject = ((Resources)localObject).getString(k, arrayOfObject);
        continue;
        localObject = a(paramContext, "common_google_play_services_network_error_text", str);
        continue;
        localObject = a(paramContext, "common_google_play_services_invalid_account_text", str);
        continue;
        localObject = a(paramContext, "common_google_play_services_api_unavailable_text", str);
        continue;
        localObject = a(paramContext, "common_google_play_services_sign_in_failed_text", str);
        continue;
        localObject = a(paramContext, "common_google_play_services_restricted_profile_text", str);
      }
    }
  }
  
  public static String d(Context paramContext, int paramInt)
  {
    int i = 6;
    String str1;
    if (paramInt == i) {
      str1 = a(paramContext);
    }
    for (String str2 = a(paramContext, "common_google_play_services_resolution_required_text", str1);; str2 = c(paramContext, paramInt)) {
      return str2;
    }
  }
  
  public static String e(Context paramContext, int paramInt)
  {
    Object localObject = paramContext.getResources();
    int i;
    switch (paramInt)
    {
    default: 
      i = 17039370;
      localObject = ((Resources)localObject).getString(i);
    }
    for (;;)
    {
      return (String)localObject;
      i = a.b.common_google_play_services_install_button;
      localObject = ((Resources)localObject).getString(i);
      continue;
      i = a.b.common_google_play_services_enable_button;
      localObject = ((Resources)localObject).getString(i);
      continue;
      i = a.b.common_google_play_services_update_button;
      localObject = ((Resources)localObject).getString(i);
    }
  }
}


/* Location:              com/google/android/gms/common/internal/q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */