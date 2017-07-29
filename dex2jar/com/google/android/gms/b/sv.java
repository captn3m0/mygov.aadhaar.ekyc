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

@qi
public final class sv
  extends a
{
  public static final Parcelable.Creator<sv> CREATOR = new sw();
  public final String a;
  public final String b;
  public final boolean c;
  public final boolean d;
  public final List<String> e;
  
  public sv(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, List<String> paramList)
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
    if (paramJSONObject == null) {
      return null;
    }
    String str1 = paramJSONObject.optString("click_string", "");
    String str2 = paramJSONObject.optString("report_url", "");
    boolean bool1 = paramJSONObject.optBoolean("rendered_ad_enabled", false);
    boolean bool2 = paramJSONObject.optBoolean("non_malicious_reporting_enabled", false);
    Object localObject = paramJSONObject.optJSONArray("allowed_headers");
    paramJSONObject = (JSONObject)localObject;
    if (localObject == null) {
      paramJSONObject = new JSONArray();
    }
    localObject = new ArrayList();
    while (i < paramJSONObject.length())
    {
      String str3 = paramJSONObject.optString(i);
      if (!TextUtils.isEmpty(str3)) {
        ((ArrayList)localObject).add(str3.toLowerCase(Locale.ENGLISH));
      }
      i += 1;
    }
    return new sv(str1, str2, bool1, bool2, (List)localObject);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    sw.a(this, paramParcel);
  }
}


/* Location:              com/google/android/gms/b/sv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */