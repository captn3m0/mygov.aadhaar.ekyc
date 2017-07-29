package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;

public final class a
{
  private static boolean a(Context paramContext, Intent paramIntent, s params)
  {
    String str1 = "Launching an intent: ";
    for (;;)
    {
      try
      {
        str2 = paramIntent.toURI();
        str2 = String.valueOf(str2);
        int i = str2.length();
        if (i == 0) {
          continue;
        }
        str2 = str1.concat(str2);
        tp.a(str2);
        w.e();
        tt.a(paramContext, paramIntent);
        if (params != null) {
          params.f();
        }
        bool = true;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        tp.e(localActivityNotFoundException.getMessage());
        boolean bool = false;
        String str2 = null;
        continue;
      }
      return bool;
      str2 = new java/lang/String;
      str2.<init>(str1);
    }
  }
  
  public static boolean a(Context paramContext, e parame, s params)
  {
    int i = 2;
    boolean bool1 = true;
    boolean bool2 = false;
    kd localkd = null;
    Object localObject1;
    if (parame == null)
    {
      localObject1 = "No intent data for launcher overlay.";
      tp.e((String)localObject1);
    }
    for (;;)
    {
      return bool2;
      ke.a(paramContext);
      localObject1 = h;
      Object localObject3;
      if (localObject1 != null)
      {
        localObject1 = h;
        bool2 = a(paramContext, (Intent)localObject1, params);
      }
      else
      {
        localObject3 = new android/content/Intent;
        ((Intent)localObject3).<init>();
        localObject1 = b;
        boolean bool3 = TextUtils.isEmpty((CharSequence)localObject1);
        if (bool3)
        {
          localObject1 = "Open GMSG did not contain a URL.";
          tp.e((String)localObject1);
        }
        else
        {
          localObject1 = c;
          bool3 = TextUtils.isEmpty((CharSequence)localObject1);
          if (!bool3)
          {
            localObject1 = Uri.parse(b);
            str = c;
            ((Intent)localObject3).setDataAndType((Uri)localObject1, str);
            label143:
            ((Intent)localObject3).setAction("android.intent.action.VIEW");
            localObject1 = d;
            bool3 = TextUtils.isEmpty((CharSequence)localObject1);
            if (!bool3)
            {
              localObject1 = d;
              ((Intent)localObject3).setPackage((String)localObject1);
            }
            localObject1 = e;
            bool3 = TextUtils.isEmpty((CharSequence)localObject1);
            if (bool3) {
              break label332;
            }
            localObject1 = e;
            str = "/";
            localObject1 = ((String)localObject1).split(str, i);
            int m = localObject1.length;
            if (m >= i) {
              break label309;
            }
            localObject3 = "Could not parse component name from open GMSG: ";
            localObject1 = String.valueOf(e);
            m = ((String)localObject1).length();
            if (m == 0) {
              break label294;
            }
            localObject1 = ((String)localObject3).concat((String)localObject1);
          }
          for (;;)
          {
            tp.e((String)localObject1);
            break;
            localObject1 = Uri.parse(b);
            ((Intent)localObject3).setData((Uri)localObject1);
            break label143;
            label294:
            localObject1 = new java/lang/String;
            ((String)localObject1).<init>((String)localObject3);
          }
          label309:
          String str = localObject1[0];
          localObject1 = localObject1[bool1];
          ((Intent)localObject3).setClassName(str, (String)localObject1);
          label332:
          localObject1 = f;
          boolean bool5 = TextUtils.isEmpty((CharSequence)localObject1);
          if (bool5) {}
        }
      }
      try
      {
        j = Integer.parseInt((String)localObject1);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;)
        {
          int j;
          boolean bool4;
          tp.e("Could not parse intent flags.");
          int k = 0;
          Object localObject2 = null;
        }
      }
      ((Intent)localObject3).addFlags(j);
      localObject1 = ke.de;
      localkd = w.q();
      localObject1 = (Boolean)localkd.a((jz)localObject1);
      bool4 = ((Boolean)localObject1).booleanValue();
      if (bool4)
      {
        k = 268435456;
        ((Intent)localObject3).addFlags(k);
        localObject1 = "android.support.customtabs.extra.user_opt_out";
        ((Intent)localObject3).putExtra((String)localObject1, bool1);
      }
      bool2 = a(paramContext, (Intent)localObject3, params);
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */