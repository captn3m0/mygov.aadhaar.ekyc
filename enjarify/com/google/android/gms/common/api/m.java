package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.b.wn;
import com.google.android.gms.common.internal.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class m
  extends Exception
{
  public final android.support.v4.g.a a;
  
  public m(android.support.v4.g.a parama)
  {
    a = parama;
  }
  
  public final com.google.android.gms.common.a a(n paramn)
  {
    wn localwn = b;
    Object localObject = a.get(localwn);
    boolean bool;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      c.b(bool, "The given API was not part of the availability request.");
      return (com.google.android.gms.common.a)a.get(localwn);
      bool = false;
      localObject = null;
    }
  }
  
  public final String getMessage()
  {
    boolean bool1 = true;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = a.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    boolean bool2 = bool1;
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (wn)localIterator.next();
      localObject1 = (com.google.android.gms.common.a)a.get(localObject2);
      boolean bool3 = ((com.google.android.gms.common.a)localObject1).b();
      if (bool3) {
        bool2 = false;
      }
      localObject2 = String.valueOf(a.a);
      localObject1 = String.valueOf(localObject1);
      int i = String.valueOf(localObject2).length() + 2;
      int j = String.valueOf(localObject1).length();
      i += j;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i);
      localObject2 = localStringBuilder.append((String)localObject2);
      String str = ": ";
      localObject2 = str + (String)localObject1;
      localArrayList.add(localObject2);
    }
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    if (bool2)
    {
      localObject1 = "None of the queried APIs are available. ";
      ((StringBuilder)localObject2).append((String)localObject1);
    }
    for (;;)
    {
      localObject1 = TextUtils.join("; ", localArrayList);
      ((StringBuilder)localObject2).append((String)localObject1);
      return ((StringBuilder)localObject2).toString();
      localObject1 = "Some of the queried APIs are unavailable. ";
      ((StringBuilder)localObject2).append((String)localObject1);
    }
  }
}


/* Location:              com/google/android/gms/common/api/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */