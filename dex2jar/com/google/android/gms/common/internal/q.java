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

public final class q
{
  private static final k<String, String> a = new k();
  
  private static String a(Context paramContext)
  {
    String str2 = getApplicationInfoname;
    String str1 = str2;
    if (TextUtils.isEmpty(str2)) {
      str2 = paramContext.getPackageName();
    }
    try
    {
      str1 = bc.a(paramContext).b(paramContext.getPackageName()).toString();
      return str1;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return str2;
  }
  
  public static String a(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    switch (paramInt)
    {
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 19: 
    default: 
      Log.e("GoogleApiAvailability", 33 + "Unexpected error code " + paramInt);
    case 4: 
    case 6: 
    case 18: 
      return null;
    case 1: 
      return localResources.getString(a.b.common_google_play_services_install_title);
    case 3: 
      return localResources.getString(a.b.common_google_play_services_enable_title);
    case 2: 
      return localResources.getString(a.b.common_google_play_services_update_title);
    case 9: 
      Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
      return null;
    case 7: 
      Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
      return a(paramContext, "common_google_play_services_network_error_title");
    case 8: 
      Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
      return null;
    case 10: 
      Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
      return null;
    case 5: 
      Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
      return a(paramContext, "common_google_play_services_invalid_account_title");
    case 11: 
      Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
      return null;
    case 16: 
      Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
      return null;
    case 17: 
      Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
      return a(paramContext, "common_google_play_services_sign_in_failed_title");
    }
    Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
    return a(paramContext, "common_google_play_services_restricted_profile_title");
  }
  
  private static String a(Context paramContext, String paramString)
  {
    int i;
    synchronized (a)
    {
      String str = (String)a.get(paramString);
      if (str != null) {
        return str;
      }
      paramContext = com.google.android.gms.common.f.a(paramContext);
      if (paramContext == null) {
        return null;
      }
      i = paramContext.getIdentifier(paramString, "string", "com.google.android.gms");
      if (i == 0)
      {
        paramContext = String.valueOf(paramString);
        if (paramContext.length() != 0)
        {
          paramContext = "Missing resource: ".concat(paramContext);
          Log.w("GoogleApiAvailability", paramContext);
          return null;
        }
        paramContext = new String("Missing resource: ");
      }
    }
    paramContext = paramContext.getString(i);
    if (TextUtils.isEmpty(paramContext))
    {
      paramContext = String.valueOf(paramString);
      if (paramContext.length() != 0) {}
      for (paramContext = "Got empty resource: ".concat(paramContext);; paramContext = new String("Got empty resource: "))
      {
        Log.w("GoogleApiAvailability", paramContext);
        return null;
      }
    }
    a.put(paramString, paramContext);
    return paramContext;
  }
  
  private static String a(Context paramContext, String paramString1, String paramString2)
  {
    Resources localResources = paramContext.getResources();
    paramString1 = a(paramContext, paramString1);
    paramContext = paramString1;
    if (paramString1 == null) {
      paramContext = localResources.getString(a.b.common_google_play_services_unknown_issue);
    }
    return String.format(getConfigurationlocale, paramContext, new Object[] { paramString2 });
  }
  
  public static String b(Context paramContext, int paramInt)
  {
    if (paramInt == 6) {}
    for (String str1 = a(paramContext, "common_google_play_services_resolution_required_title");; str1 = a(paramContext, paramInt))
    {
      String str2 = str1;
      if (str1 == null) {
        str2 = paramContext.getResources().getString(a.b.common_google_play_services_notification_ticker);
      }
      return str2;
    }
  }
  
  public static String c(Context paramContext, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    String str = a(paramContext);
    switch (paramInt)
    {
    case 4: 
    case 6: 
    case 8: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 19: 
    default: 
      return localResources.getString(a.b.common_google_play_services_unknown_issue, new Object[] { str });
    case 1: 
      return localResources.getString(a.b.common_google_play_services_install_text, new Object[] { str });
    case 3: 
      return localResources.getString(a.b.common_google_play_services_enable_text, new Object[] { str });
    case 18: 
      return localResources.getString(a.b.common_google_play_services_updating_text, new Object[] { str });
    case 2: 
      if (com.google.android.gms.common.util.f.a(paramContext)) {
        return localResources.getString(a.b.common_google_play_services_wear_update_text);
      }
      return localResources.getString(a.b.common_google_play_services_update_text, new Object[] { str });
    case 9: 
      return localResources.getString(a.b.common_google_play_services_unsupported_text, new Object[] { str });
    case 7: 
      return a(paramContext, "common_google_play_services_network_error_text", str);
    case 5: 
      return a(paramContext, "common_google_play_services_invalid_account_text", str);
    case 16: 
      return a(paramContext, "common_google_play_services_api_unavailable_text", str);
    case 17: 
      return a(paramContext, "common_google_play_services_sign_in_failed_text", str);
    }
    return a(paramContext, "common_google_play_services_restricted_profile_text", str);
  }
  
  public static String d(Context paramContext, int paramInt)
  {
    if (paramInt == 6) {
      return a(paramContext, "common_google_play_services_resolution_required_text", a(paramContext));
    }
    return c(paramContext, paramInt);
  }
  
  public static String e(Context paramContext, int paramInt)
  {
    paramContext = paramContext.getResources();
    switch (paramInt)
    {
    default: 
      return paramContext.getString(17039370);
    case 1: 
      return paramContext.getString(a.b.common_google_play_services_install_button);
    case 3: 
      return paramContext.getString(a.b.common_google_play_services_enable_button);
    }
    return paramContext.getString(a.b.common_google_play_services_update_button);
  }
}


/* Location:              com/google/android/gms/common/internal/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */