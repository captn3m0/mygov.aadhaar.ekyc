package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

public final class sv
  extends a
{
  public static final Parcelable.Creator CREATOR;
  public final String a;
  public final String b;
  public final boolean c;
  public final boolean d;
  public final List e;
  
  static
  {
    sw localsw = new com/google/android/gms/b/sw;
    localsw.<init>();
    CREATOR = localsw;
  }
  
  public sv(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, List paramList)
  {
    a = paramString1;
    b = paramString2;
    c = paramBoolean1;
    d = paramBoolean2;
    e = paramList;
  }
  
  public static sv a(JSONObject paramJSONObject)
  {
    int i = 0;
    Object localObject;
    if (paramJSONObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return (sv)localObject;
      String str1 = paramJSONObject.optString("click_string", "");
      String str2 = paramJSONObject.optString("report_url", "");
      boolean bool1 = paramJSONObject.optBoolean("rendered_ad_enabled", false);
      boolean bool2 = paramJSONObject.optBoolean("non_malicious_reporting_enabled", false);
      localObject = paramJSONObject.optJSONArray("allowed_headers");
      if (localObject == null)
      {
        localObject = new org/json/JSONArray;
        ((JSONArray)localObject).<init>();
      }
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      for (;;)
      {
        int j = ((JSONArray)localObject).length();
        if (i >= j) {
          break;
        }
        String str3 = ((JSONArray)localObject).optString(i);
        boolean bool3 = TextUtils.isEmpty(str3);
        if (!bool3)
        {
          Locale localLocale = Locale.ENGLISH;
          str3 = str3.toLowerCase(localLocale);
          localArrayList.add(str3);
        }
        i += 1;
      }
      localObject = new com/google/android/gms/b/sv;
      ((sv)localObject).<init>(str1, str2, bool1, bool2, localArrayList);
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    sw.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/sv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */