package com.google.android.gms.b;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.w;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@qi
public final class kf
{
  boolean a;
  String b;
  Map<String, String> c;
  Context d = null;
  String e = null;
  
  public kf(Context paramContext, String paramString)
  {
    d = paramContext;
    e = paramString;
    paramString = ke.T;
    a = ((Boolean)w.q().a(paramString)).booleanValue();
    paramString = ke.U;
    b = ((String)w.q().a(paramString));
    c = new LinkedHashMap();
    c.put("s", "gmob_sdk");
    c.put("v", "3");
    c.put("os", Build.VERSION.RELEASE);
    c.put("sdk", Build.VERSION.SDK);
    paramString = c;
    w.e();
    paramString.put("device", tt.c());
    Map localMap = c;
    if (paramContext.getApplicationContext() != null)
    {
      paramString = paramContext.getApplicationContext().getPackageName();
      localMap.put("app", paramString);
      paramString = c;
      w.e();
      if (!tt.j(paramContext)) {
        break label293;
      }
    }
    label293:
    for (paramContext = "1";; paramContext = "0")
    {
      paramString.put("is_lite_sdk", paramContext);
      paramContext = w.n().a(d);
      try
      {
        paramContext.get();
        c.put("network_coarse", Integer.toString(getm));
        c.put("network_fine", Integer.toString(getn));
        return;
      }
      catch (Exception paramContext)
      {
        w.i().a(paramContext, "CsiConfiguration.CsiConfiguration");
      }
      paramString = paramContext.getPackageName();
      break;
    }
  }
}


/* Location:              com/google/android/gms/b/kf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */