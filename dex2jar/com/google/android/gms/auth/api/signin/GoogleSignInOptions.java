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
  public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new b();
  public static final Scope a = new Scope("profile");
  public static final Scope b = new Scope("email");
  public static final Scope c = new Scope("openid");
  public static final Scope d = new Scope("https://www.googleapis.com/auth/games");
  public static final GoogleSignInOptions e;
  public static final GoogleSignInOptions f;
  private static Comparator<Scope> q = new Comparator() {};
  final int g;
  Account h;
  boolean i;
  final boolean j;
  final boolean k;
  String l;
  String m;
  ArrayList<com.google.android.gms.auth.api.signin.a.b> n;
  private final ArrayList<Scope> o;
  private Map<Integer, com.google.android.gms.auth.api.signin.a.b> p;
  
  static
  {
    a locala = new a().a();
    a.add(a);
    e = locala.b();
    locala = new a();
    Scope localScope = d;
    a.add(localScope);
    a.addAll(Arrays.asList(new Scope[0]));
    f = locala.b();
  }
  
  GoogleSignInOptions(int paramInt, ArrayList<Scope> paramArrayList, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2, ArrayList<com.google.android.gms.auth.api.signin.a.b> paramArrayList1)
  {
    this(paramInt, paramArrayList, paramAccount, paramBoolean1, paramBoolean2, paramBoolean3, paramString1, paramString2, a(paramArrayList1));
  }
  
  private GoogleSignInOptions(int paramInt, ArrayList<Scope> paramArrayList, Account paramAccount, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString1, String paramString2, Map<Integer, com.google.android.gms.auth.api.signin.a.b> paramMap)
  {
    g = paramInt;
    o = paramArrayList;
    h = paramAccount;
    i = paramBoolean1;
    j = paramBoolean2;
    k = paramBoolean3;
    l = paramString1;
    m = paramString2;
    n = new ArrayList(paramMap.values());
    p = paramMap;
  }
  
  public static GoogleSignInOptions a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    JSONObject localJSONObject = new JSONObject(paramString);
    HashSet localHashSet = new HashSet();
    paramString = localJSONObject.getJSONArray("scopes");
    int i2 = paramString.length();
    int i1 = 0;
    while (i1 < i2)
    {
      localHashSet.add(new Scope(paramString.getString(i1)));
      i1 += 1;
    }
    paramString = localJSONObject.optString("accountName", null);
    if (!TextUtils.isEmpty(paramString)) {}
    for (paramString = new Account(paramString, "com.google");; paramString = null) {
      return new GoogleSignInOptions(3, new ArrayList(localHashSet), paramString, localJSONObject.getBoolean("idTokenRequested"), localJSONObject.getBoolean("serverAuthRequested"), localJSONObject.getBoolean("forceCodeForRefreshToken"), localJSONObject.optString("serverClientId", null), localJSONObject.optString("hostedDomain", null), new HashMap());
    }
  }
  
  private static Map<Integer, com.google.android.gms.auth.api.signin.a.b> a(List<com.google.android.gms.auth.api.signin.a.b> paramList)
  {
    HashMap localHashMap = new HashMap();
    if (paramList == null) {
      return localHashMap;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      com.google.android.gms.auth.api.signin.a.b localb = (com.google.android.gms.auth.api.signin.a.b)paramList.next();
      localHashMap.put(Integer.valueOf(b), localb);
    }
    return localHashMap;
  }
  
  public final ArrayList<Scope> a()
  {
    return new ArrayList(o);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return false;
      try
      {
        paramObject = (GoogleSignInOptions)paramObject;
        if ((n.size() > 0) || (n.size() > 0) || (o.size() != ((GoogleSignInOptions)paramObject).a().size()) || (!o.containsAll(((GoogleSignInOptions)paramObject).a()))) {
          continue;
        }
        if (h == null)
        {
          if (h != null) {
            continue;
          }
          label76:
          if (!TextUtils.isEmpty(l)) {
            break label148;
          }
          if (!TextUtils.isEmpty(l)) {
            continue;
          }
        }
        while ((k == k) && (i == i) && (j == j))
        {
          return true;
          if (!h.equals(h)) {
            break;
          }
          break label76;
          label148:
          boolean bool = l.equals(l);
          if (!bool) {
            break;
          }
        }
        return false;
      }
      catch (ClassCastException paramObject) {}
    }
  }
  
  public int hashCode()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = o.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(nextb);
    }
    Collections.sort(localArrayList);
    return caah).a(l).a(k).a(i).a(j).b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
  
  public static final class a
  {
    Set<Scope> a = new HashSet();
    private boolean b;
    private boolean c;
    private boolean d;
    private String e;
    private Account f;
    private String g;
    private Map<Integer, com.google.android.gms.auth.api.signin.a.b> h = new HashMap();
    
    public final a a()
    {
      a.add(GoogleSignInOptions.c);
      return this;
    }
    
    public final GoogleSignInOptions b()
    {
      if ((d) && ((f == null) || (!a.isEmpty()))) {
        a();
      }
      return new GoogleSignInOptions(new ArrayList(a), f, d, b, c, e, g, h);
    }
  }
}


/* Location:              com/google/android/gms/auth/api/signin/GoogleSignInOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */