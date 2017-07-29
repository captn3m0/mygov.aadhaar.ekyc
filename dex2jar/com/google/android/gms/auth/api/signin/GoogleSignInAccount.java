package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount
  extends com.google.android.gms.common.internal.safeparcel.a
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();
  public static com.google.android.gms.common.util.c a = e.d();
  private static Comparator<Scope> n = new Comparator() {};
  final int b;
  String c;
  String d;
  String e;
  String f;
  Uri g;
  String h;
  long i;
  String j;
  List<Scope> k;
  String l;
  String m;
  
  GoogleSignInAccount(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, String paramString5, long paramLong, String paramString6, List<Scope> paramList, String paramString7, String paramString8)
  {
    b = paramInt;
    c = paramString1;
    d = paramString2;
    e = paramString3;
    f = paramString4;
    g = paramUri;
    h = paramString5;
    i = paramLong;
    j = paramString6;
    k = paramList;
    l = paramString7;
    m = paramString8;
  }
  
  public static GoogleSignInAccount a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject(paramString);
    paramString = null;
    Object localObject = localJSONObject.optString("photoUrl", null);
    if (!TextUtils.isEmpty((CharSequence)localObject)) {
      paramString = Uri.parse((String)localObject);
    }
    long l1 = Long.parseLong(localJSONObject.getString("expirationTime"));
    HashSet localHashSet = new HashSet();
    localObject = localJSONObject.getJSONArray("grantedScopes");
    int i2 = ((JSONArray)localObject).length();
    int i1 = 0;
    while (i1 < i2)
    {
      localHashSet.add(new Scope(((JSONArray)localObject).getString(i1)));
      i1 += 1;
    }
    String str1 = localJSONObject.optString("id");
    String str2 = localJSONObject.optString("tokenId", null);
    String str3 = localJSONObject.optString("email", null);
    String str4 = localJSONObject.optString("displayName", null);
    String str5 = localJSONObject.optString("givenName", null);
    String str6 = localJSONObject.optString("familyName", null);
    localObject = Long.valueOf(l1);
    String str7 = localJSONObject.getString("obfuscatedIdentifier");
    if (localObject == null) {
      localObject = Long.valueOf(a.a() / 1000L);
    }
    for (;;)
    {
      paramString = new GoogleSignInAccount(3, str1, str2, str3, str4, paramString, null, ((Long)localObject).longValue(), com.google.android.gms.common.internal.c.a(str7), new ArrayList((Collection)com.google.android.gms.common.internal.c.a(localHashSet)), str5, str6);
      h = localJSONObject.optString("serverAuthCode", null);
      return paramString;
    }
  }
  
  private JSONObject a()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      if (c != null) {
        localJSONObject.put("id", c);
      }
      if (d != null) {
        localJSONObject.put("tokenId", d);
      }
      if (e != null) {
        localJSONObject.put("email", e);
      }
      if (f != null) {
        localJSONObject.put("displayName", f);
      }
      if (l != null) {
        localJSONObject.put("givenName", l);
      }
      if (m != null) {
        localJSONObject.put("familyName", m);
      }
      if (g != null) {
        localJSONObject.put("photoUrl", g.toString());
      }
      if (h != null) {
        localJSONObject.put("serverAuthCode", h);
      }
      localJSONObject.put("expirationTime", i);
      localJSONObject.put("obfuscatedIdentifier", j);
      JSONArray localJSONArray = new JSONArray();
      Collections.sort(k, n);
      Iterator localIterator = k.iterator();
      while (localIterator.hasNext()) {
        localJSONArray.put(nextb);
      }
      localJSONException.put("grantedScopes", localJSONArray);
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException(localJSONException);
    }
    return localJSONException;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof GoogleSignInAccount)) {
      return false;
    }
    return ((GoogleSignInAccount)paramObject).a().toString().equals(a().toString());
  }
  
  public int hashCode()
  {
    return a().toString().hashCode();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/auth/api/signin/GoogleSignInAccount.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */