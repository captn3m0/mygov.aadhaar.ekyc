package com.google.android.gms.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.a.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ag;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.i;

@Deprecated
public final class ab
{
  private static final Object a = new Object();
  private static ab b;
  private final String c;
  private final Status d;
  private final boolean e;
  private final boolean f;
  
  private ab(Context paramContext)
  {
    Object localObject = paramContext.getResources();
    int i = ((Resources)localObject).getIdentifier("google_app_measurement_enable", "integer", ((Resources)localObject).getResourcePackageName(a.b.common_google_play_services_unknown_issue));
    if (i != 0) {
      if (((Resources)localObject).getInteger(i) != 0)
      {
        bool1 = true;
        if (bool1) {
          break label127;
        }
      }
    }
    label52:
    for (f = bool2;; f = false)
    {
      e = bool1;
      String str = ag.a(paramContext);
      localObject = str;
      if (str == null) {
        localObject = new i(paramContext).a("google_app_id");
      }
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        break label141;
      }
      d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
      c = null;
      return;
      bool1 = false;
      break;
      label127:
      bool2 = false;
      break label52;
    }
    label141:
    c = ((String)localObject);
    d = Status.a;
  }
  
  private static ab a(String paramString)
  {
    synchronized (a)
    {
      if (b == null) {
        throw new IllegalStateException(String.valueOf(paramString).length() + 34 + "Initialize must be called before " + paramString + ".");
      }
    }
    paramString = b;
    return paramString;
  }
  
  public static Status a(Context paramContext)
  {
    c.a(paramContext, "Context must not be null.");
    synchronized (a)
    {
      if (b == null) {
        b = new ab(paramContext);
      }
      paramContext = bd;
      return paramContext;
    }
  }
  
  public static String a()
  {
    return a"getGoogleAppId"c;
  }
  
  public static boolean b()
  {
    return a"isMeasurementExplicitlyDisabled"f;
  }
}


/* Location:              com/google/android/gms/b/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */