package com.google.android.gms.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.util.f;
import java.util.Locale;

public final class rn$a
{
  private int a;
  private boolean b;
  private boolean c;
  private int d;
  private int e;
  private int f;
  private String g;
  private int h;
  private int i;
  private int j;
  private boolean k;
  private int l;
  private double m;
  private boolean n;
  private String o;
  private boolean p;
  private boolean q;
  private String r;
  private boolean s;
  private boolean t;
  private String u;
  private String v;
  private float w;
  private int x;
  private int y;
  private boolean z;
  
  public rn$a(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    a(paramContext);
    b(paramContext);
    c(paramContext);
    Locale localLocale = Locale.getDefault();
    Object localObject = a(localPackageManager, "geo:0,0?q=donuts");
    label72:
    boolean bool;
    if (localObject != null)
    {
      int i2 = i1;
      p = i2;
      localObject = a(localPackageManager, "http://www.google.com");
      if (localObject == null) {
        break label165;
      }
      q = i1;
      localObject = localLocale.getCountry();
      r = ((String)localObject);
      ip.a();
      bool = uk.a();
      s = bool;
      bool = f.b(paramContext);
      t = bool;
      localObject = localLocale.getLanguage();
      u = ((String)localObject);
      localObject = a(paramContext, localPackageManager);
      v = ((String)localObject);
      localObject = paramContext.getResources();
      if (localObject != null) {
        break label172;
      }
    }
    for (;;)
    {
      return;
      bool = false;
      localObject = null;
      break;
      label165:
      i1 = 0;
      f1 = 0.0F;
      break label72;
      label172:
      localObject = ((Resources)localObject).getDisplayMetrics();
      if (localObject != null)
      {
        f1 = density;
        w = f1;
        i1 = widthPixels;
        x = i1;
        int i3 = heightPixels;
        y = i3;
      }
    }
  }
  
  public rn$a(Context paramContext, rn paramrn)
  {
    paramContext.getPackageManager();
    a(paramContext);
    b(paramContext);
    c(paramContext);
    String str = Build.FINGERPRINT;
    o = str;
    boolean bool = ks.a(paramContext);
    z = bool;
    bool = b;
    p = bool;
    bool = c;
    q = bool;
    str = e;
    r = str;
    bool = f;
    s = bool;
    bool = g;
    t = bool;
    str = j;
    u = str;
    str = k;
    v = str;
    float f1 = r;
    w = f1;
    int i1 = s;
    x = i1;
    i1 = t;
    y = i1;
  }
  
  private static ResolveInfo a(PackageManager paramPackageManager, String paramString)
  {
    Intent localIntent = new android/content/Intent;
    Uri localUri = Uri.parse(paramString);
    localIntent.<init>("android.intent.action.VIEW", localUri);
    return paramPackageManager.resolveActivity(localIntent, 65536);
  }
  
  private static String a(Context paramContext, PackageManager paramPackageManager)
  {
    String str1 = null;
    Object localObject1 = a(paramPackageManager, "market://details?id=com.google.android.gms.ads");
    if (localObject1 == null) {}
    for (;;)
    {
      return str1;
      localObject1 = activityInfo;
      if (localObject1 != null) {
        try
        {
          Object localObject2 = bc.a(paramContext);
          String str2 = packageName;
          StringBuilder localStringBuilder = null;
          localObject2 = ((bb)localObject2).b(str2, 0);
          if (localObject2 != null)
          {
            int i1 = versionCode;
            localObject1 = packageName;
            localObject1 = String.valueOf(localObject1);
            str2 = String.valueOf(localObject1);
            int i2 = str2.length() + 12;
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>(i2);
            localObject2 = localStringBuilder.append(i1);
            str2 = ".";
            localObject2 = ((StringBuilder)localObject2).append(str2);
            localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
            str1 = ((StringBuilder)localObject1).toString();
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
      }
    }
  }
  
  private void a(Context paramContext)
  {
    w.e();
    AudioManager localAudioManager = tt.g(paramContext);
    if (localAudioManager != null) {}
    for (;;)
    {
      try
      {
        int i1 = localAudioManager.getMode();
        a = i1;
        boolean bool = localAudioManager.isMusicActive();
        b = bool;
        bool = localAudioManager.isSpeakerphoneOn();
        c = bool;
        int i2 = 3;
        i2 = localAudioManager.getStreamVolume(i2);
        d = i2;
        i2 = localAudioManager.getRingerMode();
        e = i2;
        i2 = 2;
        i3 = localAudioManager.getStreamVolume(i2);
        f = i3;
        return;
      }
      finally
      {
        tj localtj = w.i();
        String str = "DeviceInfo.gatherAudioInfo";
        localtj.a(localThrowable, str);
      }
      int i3 = -2;
      a = i3;
      b = false;
      c = false;
      d = 0;
      e = 0;
      f = 0;
    }
  }
  
  private void b(Context paramContext)
  {
    int i1 = -1;
    Object localObject = (TelephonyManager)paramContext.getSystemService("phone");
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    String str = ((TelephonyManager)localObject).getNetworkOperator();
    g = str;
    int i2 = ((TelephonyManager)localObject).getNetworkType();
    i = i2;
    int i3 = ((TelephonyManager)localObject).getPhoneType();
    j = i3;
    h = -2;
    k = false;
    l = i1;
    w.e();
    localObject = paramContext.getPackageName();
    str = "android.permission.ACCESS_NETWORK_STATE";
    boolean bool1 = tt.a(paramContext, (String)localObject, str);
    int i4;
    if (bool1)
    {
      localObject = localConnectivityManager.getActiveNetworkInfo();
      if (localObject == null) {
        break label174;
      }
      i2 = ((NetworkInfo)localObject).getType();
      h = i2;
      localObject = ((NetworkInfo)localObject).getDetailedState();
      i4 = ((NetworkInfo.DetailedState)localObject).ordinal();
      l = i4;
    }
    for (;;)
    {
      i4 = Build.VERSION.SDK_INT;
      i2 = 16;
      if (i4 >= i2)
      {
        boolean bool2 = localConnectivityManager.isActiveNetworkMetered();
        k = bool2;
      }
      return;
      label174:
      h = i1;
    }
  }
  
  private void c(Context paramContext)
  {
    boolean bool = false;
    int i1 = -1;
    Object localObject = new android/content/IntentFilter;
    ((IntentFilter)localObject).<init>("android.intent.action.BATTERY_CHANGED");
    int i2 = 0;
    String str1 = null;
    localObject = paramContext.registerReceiver(null, (IntentFilter)localObject);
    if (localObject != null)
    {
      str1 = "status";
      i2 = ((Intent)localObject).getIntExtra(str1, i1);
      String str2 = "level";
      int i3 = ((Intent)localObject).getIntExtra(str2, i1);
      String str3 = "scale";
      int i4 = ((Intent)localObject).getIntExtra(str3, i1);
      float f1 = i3;
      float f2 = i4;
      double d1 = f1 / f2;
      m = d1;
      i4 = 2;
      f2 = 2.8E-45F;
      if (i2 != i4)
      {
        i4 = 5;
        f2 = 7.0E-45F;
        if (i2 != i4) {}
      }
      else
      {
        bool = true;
      }
    }
    for (n = bool;; n = false)
    {
      return;
      double d2 = -1.0D;
      m = d2;
    }
  }
  
  public final rn a()
  {
    rn localrn = new com/google/android/gms/b/rn;
    int i1 = a;
    boolean bool1 = p;
    boolean bool2 = q;
    String str1 = g;
    String str2 = r;
    boolean bool3 = s;
    boolean bool4 = t;
    boolean bool5 = b;
    boolean bool6 = c;
    String str3 = u;
    String str4 = v;
    int i2 = d;
    int i3 = h;
    int i4 = i;
    int i5 = j;
    int i6 = e;
    int i7 = f;
    float f1 = w;
    int i8 = x;
    int i9 = y;
    double d1 = m;
    boolean bool7 = n;
    boolean bool8 = k;
    int i10 = l;
    String str5 = o;
    boolean bool9 = z;
    localrn.<init>(i1, bool1, bool2, str1, str2, bool3, bool4, bool5, bool6, str3, str4, i2, i3, i4, i5, i6, i7, f1, i8, i9, d1, bool7, bool8, i10, str5, bool9);
    return localrn;
  }
}


/* Location:              com/google/android/gms/b/rn$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */