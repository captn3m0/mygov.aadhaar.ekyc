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
  public static final Parcelable.Creator CREATOR;
  public static com.google.android.gms.common.util.c a;
  private static Comparator n;
  final int b;
  String c;
  String d;
  String e;
  String f;
  Uri g;
  String h;
  long i;
  String j;
  List k;
  String l;
  String m;
  
  static
  {
    Object localObject = new com/google/android/gms/auth/api/signin/a;
    ((a)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
    a = e.d();
    localObject = new com/google/android/gms/auth/api/signin/GoogleSignInAccount$1;
    ((GoogleSignInAccount.1)localObject).<init>();
    n = (Comparator)localObject;
  }
  
  GoogleSignInAccount(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri, String paramString5, long paramLong, String paramString6, List paramList, String paramString7, String paramString8)
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
    int i1 = TextUtils.isEmpty(paramString);
    if (i1 != 0)
    {
      i1 = 0;
      localObject1 = null;
      return (GoogleSignInAccount)localObject1;
    }
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>(paramString);
    Uri localUri = null;
    Object localObject2 = null;
    Object localObject1 = localJSONObject.optString("photoUrl", null);
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    if (!bool) {
      localUri = Uri.parse((String)localObject1);
    }
    long l1 = Long.parseLong(localJSONObject.getString("expirationTime"));
    Object localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    localObject2 = localJSONObject.getJSONArray("grantedScopes");
    int i4 = ((JSONArray)localObject2).length();
    i1 = 0;
    localObject1 = null;
    while (i1 < i4)
    {
      localObject4 = new com/google/android/gms/common/api/Scope;
      str1 = ((JSONArray)localObject2).getString(i1);
      ((Scope)localObject4).<init>(str1);
      ((Set)localObject3).add(localObject4);
      int i2;
      i1 += 1;
    }
    String str2 = localJSONObject.optString("id");
    Object localObject4 = localJSONObject.optString("tokenId", null);
    String str1 = localJSONObject.optString("email", null);
    String str3 = localJSONObject.optString("displayName", null);
    String str4 = localJSONObject.optString("givenName", null);
    bool = false;
    String str5 = localJSONObject.optString("familyName", null);
    localObject1 = Long.valueOf(l1);
    localObject2 = "obfuscatedIdentifier";
    String str6 = localJSONObject.getString((String)localObject2);
    if (localObject1 == null)
    {
      long l2 = a.a();
      l1 = 1000L;
      l2 /= l1;
      localObject1 = Long.valueOf(l2);
    }
    for (Object localObject5 = localObject1;; localObject5 = localObject1)
    {
      localObject1 = new com/google/android/gms/auth/api/signin/GoogleSignInAccount;
      int i3 = 3;
      l1 = ((Long)localObject5).longValue();
      str6 = com.google.android.gms.common.internal.c.a(str6);
      ArrayList localArrayList = new java/util/ArrayList;
      localObject3 = (Collection)com.google.android.gms.common.internal.c.a(localObject3);
      localArrayList.<init>((Collection)localObject3);
      ((GoogleSignInAccount)localObject1).<init>(i3, str2, (String)localObject4, str1, str3, localUri, null, l1, str6, localArrayList, str4, str5);
      int i5 = 0;
      str2 = null;
      localObject2 = localJSONObject.optString("serverAuthCode", null);
      h = ((String)localObject2);
      break;
    }
  }
  
  private JSONObject a()
  {
    Object localObject1 = new org/json/JSONObject;
    ((JSONObject)localObject1).<init>();
    Object localObject3;
    try
    {
      Object localObject2 = c;
      if (localObject2 != null)
      {
        localObject2 = "id";
        localObject3 = c;
        ((JSONObject)localObject1).put((String)localObject2, localObject3);
      }
      localObject2 = d;
      if (localObject2 != null)
      {
        localObject2 = "tokenId";
        localObject3 = d;
        ((JSONObject)localObject1).put((String)localObject2, localObject3);
      }
      localObject2 = e;
      if (localObject2 != null)
      {
        localObject2 = "email";
        localObject3 = e;
        ((JSONObject)localObject1).put((String)localObject2, localObject3);
      }
      localObject2 = f;
      if (localObject2 != null)
      {
        localObject2 = "displayName";
        localObject3 = f;
        ((JSONObject)localObject1).put((String)localObject2, localObject3);
      }
      localObject2 = l;
      if (localObject2 != null)
      {
        localObject2 = "givenName";
        localObject3 = l;
        ((JSONObject)localObject1).put((String)localObject2, localObject3);
      }
      localObject2 = m;
      if (localObject2 != null)
      {
        localObject2 = "familyName";
        localObject3 = m;
        ((JSONObject)localObject1).put((String)localObject2, localObject3);
      }
      localObject2 = g;
      if (localObject2 != null)
      {
        localObject2 = "photoUrl";
        localObject3 = g;
        localObject3 = ((Uri)localObject3).toString();
        ((JSONObject)localObject1).put((String)localObject2, localObject3);
      }
      localObject2 = h;
      if (localObject2 != null)
      {
        localObject2 = "serverAuthCode";
        localObject3 = h;
        ((JSONObject)localObject1).put((String)localObject2, localObject3);
      }
      localObject2 = "expirationTime";
      long l1 = i;
      ((JSONObject)localObject1).put((String)localObject2, l1);
      localObject2 = "obfuscatedIdentifier";
      localObject3 = j;
      ((JSONObject)localObject1).put((String)localObject2, localObject3);
      localObject3 = new org/json/JSONArray;
      ((JSONArray)localObject3).<init>();
      localObject2 = k;
      Object localObject4 = n;
      Collections.sort((List)localObject2, (Comparator)localObject4);
      localObject2 = k;
      localObject4 = ((List)localObject2).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject4).hasNext();
        if (!bool) {
          break;
        }
        localObject2 = ((Iterator)localObject4).next();
        localObject2 = (Scope)localObject2;
        localObject2 = b;
        ((JSONArray)localObject3).put(localObject2);
      }
      str = "grantedScopes";
    }
    catch (JSONException localJSONException)
    {
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>(localJSONException);
      throw ((Throwable)localObject1);
    }
    String str;
    ((JSONObject)localObject1).put(str, localObject3);
    return (JSONObject)localObject1;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof GoogleSignInAccount;
    String str1;
    if (!bool)
    {
      bool = false;
      str1 = null;
    }
    for (;;)
    {
      return bool;
      paramObject = (GoogleSignInAccount)paramObject;
      str1 = ((GoogleSignInAccount)paramObject).a().toString();
      String str2 = a().toString();
      bool = str1.equals(str2);
    }
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
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */