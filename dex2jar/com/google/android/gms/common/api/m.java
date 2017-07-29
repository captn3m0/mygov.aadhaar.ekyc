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
  public final android.support.v4.g.a<wn<?>, com.google.android.gms.common.a> a;
  
  public m(android.support.v4.g.a<wn<?>, com.google.android.gms.common.a> parama)
  {
    a = parama;
  }
  
  public final com.google.android.gms.common.a a(n<? extends a.a> paramn)
  {
    paramn = b;
    if (a.get(paramn) != null) {}
    for (boolean bool = true;; bool = false)
    {
      c.b(bool, "The given API was not part of the availability request.");
      return (com.google.android.gms.common.a)a.get(paramn);
    }
  }
  
  public final String getMessage()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = a.keySet().iterator();
    int i = 1;
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject3 = (wn)((Iterator)localObject1).next();
      Object localObject2 = (com.google.android.gms.common.a)a.get(localObject3);
      if (((com.google.android.gms.common.a)localObject2).b()) {
        i = 0;
      }
      localObject3 = String.valueOf(a.a);
      localObject2 = String.valueOf(localObject2);
      localArrayList.add(String.valueOf(localObject3).length() + 2 + String.valueOf(localObject2).length() + (String)localObject3 + ": " + (String)localObject2);
    }
    localObject1 = new StringBuilder();
    if (i != 0) {
      ((StringBuilder)localObject1).append("None of the queried APIs are available. ");
    }
    for (;;)
    {
      ((StringBuilder)localObject1).append(TextUtils.join("; ", localArrayList));
      return ((StringBuilder)localObject1).toString();
      ((StringBuilder)localObject1).append("Some of the queried APIs are unavailable. ");
    }
  }
}


/* Location:              com/google/android/gms/common/api/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */