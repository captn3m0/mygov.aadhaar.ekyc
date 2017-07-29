package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.b.ed;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class p
{
  public final Account a;
  public final Set<Scope> b;
  final Set<Scope> c;
  public final Map<a<?>, a> d;
  public final String e;
  final String f;
  public final ed g;
  public Integer h;
  private final int i;
  private final View j;
  
  public p(Account paramAccount, Set<Scope> paramSet, Map<a<?>, a> paramMap, int paramInt, View paramView, String paramString1, String paramString2, ed paramed)
  {
    a = paramAccount;
    if (paramSet == null) {}
    for (paramAccount = Collections.EMPTY_SET;; paramAccount = Collections.unmodifiableSet(paramSet))
    {
      b = paramAccount;
      paramAccount = paramMap;
      if (paramMap == null) {
        paramAccount = Collections.EMPTY_MAP;
      }
      d = paramAccount;
      j = paramView;
      i = paramInt;
      e = paramString1;
      f = paramString2;
      g = paramed;
      paramAccount = new HashSet(b);
      paramSet = d.values().iterator();
      while (paramSet.hasNext()) {
        paramAccount.addAll(nexta);
      }
    }
    c = Collections.unmodifiableSet(paramAccount);
  }
  
  public static final class a
  {
    public final Set<Scope> a;
  }
}


/* Location:              com/google/android/gms/common/internal/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */