package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class GoogleSignInOptions$a
{
  Set a;
  private boolean b;
  private boolean c;
  private boolean d;
  private String e;
  private Account f;
  private String g;
  private Map h;
  
  public GoogleSignInOptions$a()
  {
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    a = ((Set)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    h = ((Map)localObject);
  }
  
  public final a a()
  {
    Set localSet = a;
    Scope localScope = GoogleSignInOptions.c;
    localSet.add(localScope);
    return this;
  }
  
  public final GoogleSignInOptions b()
  {
    boolean bool1 = d;
    if (bool1)
    {
      localObject1 = f;
      if (localObject1 != null)
      {
        localObject1 = a;
        bool1 = ((Set)localObject1).isEmpty();
        if (bool1) {}
      }
      else
      {
        a();
      }
    }
    Object localObject1 = new com/google/android/gms/auth/api/signin/GoogleSignInOptions;
    ArrayList localArrayList = new java/util/ArrayList;
    Object localObject2 = a;
    localArrayList.<init>((Collection)localObject2);
    localObject2 = f;
    boolean bool2 = d;
    boolean bool3 = b;
    boolean bool4 = c;
    String str1 = e;
    String str2 = g;
    Map localMap = h;
    ((GoogleSignInOptions)localObject1).<init>(localArrayList, (Account)localObject2, bool2, bool3, bool4, str1, str2, localMap);
    return (GoogleSignInOptions)localObject1;
  }
}


/* Location:              com/google/android/gms/auth/api/signin/GoogleSignInOptions$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */