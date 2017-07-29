package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;

@qi
public final class a
{
  private static boolean a(Context paramContext, Intent paramIntent, s params)
  {
    try
    {
      String str = String.valueOf(paramIntent.toURI());
      if (str.length() != 0) {}
      for (str = "Launching an intent: ".concat(str);; str = new String("Launching an intent: "))
      {
        tp.a(str);
        w.e();
        tt.a(paramContext, paramIntent);
        if (params == null) {
          break;
        }
        params.f();
        break;
      }
      return true;
    }
    catch (ActivityNotFoundException paramContext)
    {
      tp.e(paramContext.getMessage());
      return false;
    }
  }
  
  public static boolean a(Context paramContext, e parame, s params)
  {
    if (parame == null)
    {
      tp.e("No intent data for launcher overlay.");
      return false;
    }
    ke.a(paramContext);
    if (h != null) {
      return a(paramContext, h, params);
    }
    Intent localIntent = new Intent();
    if (TextUtils.isEmpty(b))
    {
      tp.e("Open GMSG did not contain a URL.");
      return false;
    }
    String[] arrayOfString;
    if (!TextUtils.isEmpty(c))
    {
      localIntent.setDataAndType(Uri.parse(b), c);
      localIntent.setAction("android.intent.action.VIEW");
      if (!TextUtils.isEmpty(d)) {
        localIntent.setPackage(d);
      }
      if (TextUtils.isEmpty(e)) {
        break label213;
      }
      arrayOfString = e.split("/", 2);
      if (arrayOfString.length >= 2) {
        break label199;
      }
      paramContext = String.valueOf(e);
      if (paramContext.length() == 0) {
        break label186;
      }
    }
    label186:
    for (paramContext = "Could not parse component name from open GMSG: ".concat(paramContext);; paramContext = new String("Could not parse component name from open GMSG: "))
    {
      tp.e(paramContext);
      return false;
      localIntent.setData(Uri.parse(b));
      break;
    }
    label199:
    localIntent.setClassName(arrayOfString[0], arrayOfString[1]);
    label213:
    parame = f;
    if (!TextUtils.isEmpty(parame)) {}
    try
    {
      i = Integer.parseInt(parame);
      localIntent.addFlags(i);
      parame = ke.de;
      if (((Boolean)w.q().a(parame)).booleanValue())
      {
        localIntent.addFlags(268435456);
        localIntent.putExtra("android.support.customtabs.extra.user_opt_out", true);
      }
      return a(paramContext, localIntent, params);
    }
    catch (NumberFormatException parame)
    {
      for (;;)
      {
        tp.e("Could not parse intent flags.");
        int i = 0;
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */