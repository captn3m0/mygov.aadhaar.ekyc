package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.a.c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.a.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInOptions
  extends a
  implements a.a.c, ReflectedParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final Scope a;
  public static final Scope b;
  public static final Scope c;
  public static final Scope d;
  public static final GoogleSignInOptions e;
  public static final GoogleSignInOptions f;
  private static Comparator q;
  final int g;
  Account h;
  boolean i;
  final boolean j;
  final boolean k;
  String l;
  String m;
  ArrayList n;
  private final ArrayList o;
  private Map p;
  
  static
  {
    Object localObject1 = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject1).<init>("profile");
    a = (Scope)localObject1;
    localObject1 = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject1).<init>("email");
    b = (Scope)localObject1;
    localObject1 = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject1).<init>("openid");
    c = (Scope)localObject1;
    localObject1 = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject1).<init>("https://www.googleapis.com/auth/games");
    d = (Scope)localObject1;
    localObject1 = new com/google/android/gms/auth/api/signin/GoogleSignInOptions$a;
    ((GoogleSignInOptions.a)localObject1).<init>();
    localObject1 = ((GoogleSignInOptions.a)localObject1).a();
    Object localObject2 = a;
    Object localObject3 = a;
    ((Set)localObject2).add(localObject3);
    e = ((GoogleSignInOptions.a)localObject1).b();
    localObject1 = new com/google/android/gms/auth/api/signin/GoogleSignInOptions$a;
    ((GoogleSignInOptions.a)localObject1).<init>();
    localObject2 = d;
    localObject3 = new Scope[0];
    a.add(localObject2);
    localObject2 = a;
    localObject3 = Arrays.asList((Object[])localObject3);
    ((Set)localObject2).addAll((Collection)localObject3);
    f = ((GoogleSignInOptions.a)localObject1).b();
    localObject1 = new com/google/android/gms/auth/api/signin/b;
    ((b)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
    localObject1 = new com/google/android/gms/auth/api/signin/GoogleSignInOptions$1;
    ((GoogleSignInOptions.1)localObject1).<init>();
    q = (Comparator)localObject1;
  }
  
  GoogleSignInOptions(int paramInt, ArrayList paramArrayList1, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2, ArrayList paramArrayList2)
  {
    this(paramInt, paramArrayList1, paramAccount, paramBoolean1, paramBoolean2, paramBoolean3, paramString1, paramString2, localMap);
  }
  
  private GoogleSignInOptions(int paramInt, ArrayList paramArrayList, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2, Map paramMap)
  {
    g = paramInt;
    o = paramArrayList;
    h = paramAccount;
    i = paramBoolean1;
    j = paramBoolean2;
    k = paramBoolean3;
    l = paramString1;
    m = paramString2;
    ArrayList localArrayList = new java/util/ArrayList;
    Collection localCollection = paramMap.values();
    localArrayList.<init>(localCollection);
    n = localArrayList;
    p = paramMap;
  }
  
  public static GoogleSignInOptions a(String paramString)
  {
    Object localObject1 = null;
    int i1 = TextUtils.isEmpty(paramString);
    if (i1 != 0) {
      return (GoogleSignInOptions)localObject1;
    }
    Object localObject2 = new org/json/JSONObject;
    ((JSONObject)localObject2).<init>(paramString);
    Object localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    Object localObject4 = ((JSONObject)localObject2).getJSONArray("scopes");
    int i3 = ((JSONArray)localObject4).length();
    i1 = 0;
    Object localObject5 = null;
    Object localObject6;
    String str1;
    while (i1 < i3)
    {
      localObject6 = new com/google/android/gms/common/api/Scope;
      str1 = ((JSONArray)localObject4).getString(i1);
      ((Scope)localObject6).<init>(str1);
      ((Set)localObject3).add(localObject6);
      int i2;
      i1 += 1;
    }
    localObject5 = ((JSONObject)localObject2).optString("accountName", null);
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject5);
    if (!bool1)
    {
      localObject6 = new android/accounts/Account;
      localObject4 = "com.google";
      ((Account)localObject6).<init>((String)localObject5, (String)localObject4);
    }
    for (;;)
    {
      localObject5 = new com/google/android/gms/auth/api/signin/GoogleSignInOptions;
      int i4 = 3;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>((Collection)localObject3);
      localObject3 = "idTokenRequested";
      boolean bool2 = ((JSONObject)localObject2).getBoolean((String)localObject3);
      str1 = "serverAuthRequested";
      boolean bool3 = ((JSONObject)localObject2).getBoolean(str1);
      String str2 = "forceCodeForRefreshToken";
      boolean bool4 = ((JSONObject)localObject2).getBoolean(str2);
      String str3 = ((JSONObject)localObject2).optString("serverClientId", null);
      String str4 = "hostedDomain";
      localObject1 = ((JSONObject)localObject2).optString(str4, null);
      localObject2 = new java/util/HashMap;
      ((HashMap)localObject2).<init>();
      ((GoogleSignInOptions)localObject5).<init>(i4, localArrayList, (Account)localObject6, bool2, bool3, bool4, str3, (String)localObject1, (Map)localObject2);
      localObject1 = localObject5;
      break;
      localObject6 = null;
    }
  }
  
  private static Map a(List paramList)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    if (paramList == null) {}
    for (Object localObject = localHashMap;; localObject = localHashMap)
    {
      return (Map)localObject;
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (com.google.android.gms.auth.api.signin.a.b)localIterator.next();
        int i1 = b;
        Integer localInteger = Integer.valueOf(i1);
        localHashMap.put(localInteger, localObject);
      }
    }
  }
  
  public final ArrayList a()
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    ArrayList localArrayList2 = o;
    localArrayList1.<init>(localArrayList2);
    return localArrayList1;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    if (paramObject == null) {}
    for (;;)
    {
      return bool1;
      try
      {
        paramObject = (GoogleSignInOptions)paramObject;
        Object localObject1 = n;
        int i1 = ((ArrayList)localObject1).size();
        if (i1 > 0) {
          continue;
        }
        localObject1 = n;
        i1 = ((ArrayList)localObject1).size();
        if (i1 > 0) {
          continue;
        }
        localObject1 = o;
        i1 = ((ArrayList)localObject1).size();
        Object localObject2 = ((GoogleSignInOptions)paramObject).a();
        int i2 = ((ArrayList)localObject2).size();
        if (i1 != i2) {
          continue;
        }
        localObject1 = o;
        localObject2 = ((GoogleSignInOptions)paramObject).a();
        boolean bool2 = ((ArrayList)localObject1).containsAll((Collection)localObject2);
        if (!bool2) {
          continue;
        }
        localObject1 = h;
        if (localObject1 == null)
        {
          localObject1 = h;
          if (localObject1 != null) {
            continue;
          }
          label118:
          localObject1 = l;
          bool2 = TextUtils.isEmpty((CharSequence)localObject1);
          if (!bool2) {
            break label239;
          }
          localObject1 = l;
          bool2 = TextUtils.isEmpty((CharSequence)localObject1);
          if (!bool2) {
            continue;
          }
        }
        for (;;)
        {
          bool2 = k;
          boolean bool3 = k;
          if (bool2 != bool3) {
            break;
          }
          bool2 = i;
          bool3 = i;
          if (bool2 != bool3) {
            break;
          }
          bool2 = j;
          bool3 = j;
          if (bool2 != bool3) {
            break;
          }
          bool1 = true;
          break;
          localObject1 = h;
          localObject2 = h;
          bool2 = ((Account)localObject1).equals(localObject2);
          if (!bool2) {
            break;
          }
          break label118;
          label239:
          localObject1 = l;
          localObject2 = l;
          bool2 = ((String)localObject1).equals(localObject2);
          if (!bool2) {
            break;
          }
        }
      }
      catch (ClassCastException localClassCastException) {}
    }
  }
  
  public int hashCode()
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = o;
    Iterator localIterator = ((ArrayList)localObject2).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = nextb;
      ((ArrayList)localObject1).add(localObject2);
    }
    Collections.sort((List)localObject1);
    localObject2 = new com/google/android/gms/auth/api/signin/a/c;
    ((c)localObject2).<init>();
    localObject2 = ((c)localObject2).a(localObject1);
    localObject1 = h;
    localObject2 = ((c)localObject2).a(localObject1);
    localObject1 = l;
    localObject2 = ((c)localObject2).a(localObject1);
    boolean bool2 = k;
    localObject2 = ((c)localObject2).a(bool2);
    bool2 = i;
    localObject2 = ((c)localObject2).a(bool2);
    bool2 = j;
    return ab;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}


/* Location:              com/google/android/gms/auth/api/signin/GoogleSignInOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */