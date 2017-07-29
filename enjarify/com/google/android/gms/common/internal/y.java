package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;

public final class y
{
  private static final Uri a;
  private static final Uri b;
  
  static
  {
    Uri localUri = Uri.parse("https://plus.google.com/");
    a = localUri;
    b = localUri.buildUpon().appendPath("circles").appendPath("find").build();
  }
  
  public static Intent a()
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
    localIntent.setPackage("com.google.android.wearable.app");
    return localIntent;
  }
  
  public static Intent a(String paramString)
  {
    Uri localUri = Uri.fromParts("package", paramString, null);
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.settings.APPLICATION_DETAILS_SETTINGS");
    localIntent.setData(localUri);
    return localIntent;
  }
  
  public static Intent a(String paramString1, String paramString2)
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.intent.action.VIEW");
    Object localObject = Uri.parse("market://details").buildUpon();
    String str = "id";
    localObject = ((Uri.Builder)localObject).appendQueryParameter(str, paramString1);
    boolean bool = TextUtils.isEmpty(paramString2);
    if (!bool)
    {
      str = "pcampaignid";
      ((Uri.Builder)localObject).appendQueryParameter(str, paramString2);
    }
    localObject = ((Uri.Builder)localObject).build();
    localIntent.setData((Uri)localObject);
    localIntent.setPackage("com.android.vending");
    localIntent.addFlags(524288);
    return localIntent;
  }
}


/* Location:              com/google/android/gms/common/internal/y.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */