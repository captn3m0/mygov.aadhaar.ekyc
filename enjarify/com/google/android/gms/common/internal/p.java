package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.b.ed;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class p
{
  public final Account a;
  public final Set b;
  final Set c;
  public final Map d;
  public final String e;
  final String f;
  public final ed g;
  public Integer h;
  private final int i;
  private final View j;
  
  public p(Account paramAccount, Set paramSet, Map paramMap, int paramInt, View paramView, String paramString1, String paramString2, ed paramed)
  {
    a = paramAccount;
    if (paramSet == null) {}
    HashSet localHashSet;
    for (Object localObject = Collections.EMPTY_SET;; localObject = Collections.unmodifiableSet(paramSet))
    {
      b = ((Set)localObject);
      if (paramMap == null) {
        paramMap = Collections.EMPTY_MAP;
      }
      d = paramMap;
      j = paramView;
      i = paramInt;
      e = paramString1;
      f = paramString2;
      g = paramed;
      localHashSet = new java/util/HashSet;
      localObject = b;
      localHashSet.<init>((Collection)localObject);
      localObject = d.values();
      Iterator localIterator = ((Collection)localObject).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = nexta;
        localHashSet.addAll((Collection)localObject);
      }
    }
    localObject = Collections.unmodifiableSet(localHashSet);
    c = ((Set)localObject);
  }
}


/* Location:              com/google/android/gms/common/internal/p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */