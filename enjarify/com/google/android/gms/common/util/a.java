package com.google.android.gms.common.util;

import android.support.v4.g.k;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class a
  extends AbstractSet
{
  private final android.support.v4.g.a a;
  
  public a()
  {
    android.support.v4.g.a locala = new android/support/v4/g/a;
    locala.<init>();
    a = locala;
  }
  
  private a(int paramInt)
  {
    android.support.v4.g.a locala = new android/support/v4/g/a;
    locala.<init>(paramInt);
    a = locala;
  }
  
  public a(Collection paramCollection)
  {
    this(i);
    addAll(paramCollection);
  }
  
  private boolean a(a parama)
  {
    boolean bool = false;
    int i = size();
    android.support.v4.g.a locala = a;
    Object localObject1 = a;
    int j = h;
    int k = h + j;
    locala.a(k);
    k = h;
    Object localObject2;
    Object localObject3;
    if (k == 0) {
      if (j > 0)
      {
        localObject2 = f;
        localObject3 = f;
        System.arraycopy(localObject2, 0, localObject3, 0, j);
        localObject2 = g;
        localObject1 = g;
        int m = j << 1;
        System.arraycopy(localObject2, 0, localObject1, 0, m);
        h = j;
      }
    }
    for (;;)
    {
      k = size();
      if (k > i) {
        bool = true;
      }
      return bool;
      k = 0;
      localObject2 = null;
      while (k < j)
      {
        localObject3 = ((k)localObject1).b(k);
        Object localObject4 = ((k)localObject1).c(k);
        locala.put(localObject3, localObject4);
        k += 1;
      }
    }
  }
  
  public final boolean add(Object paramObject)
  {
    android.support.v4.g.a locala = a;
    boolean bool = locala.containsKey(paramObject);
    if (bool)
    {
      bool = false;
      locala = null;
    }
    for (;;)
    {
      return bool;
      locala = a;
      locala.put(paramObject, paramObject);
      bool = true;
    }
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    boolean bool = paramCollection instanceof a;
    if (bool) {
      paramCollection = (a)paramCollection;
    }
    for (bool = a(paramCollection);; bool = super.addAll(paramCollection)) {
      return bool;
    }
  }
  
  public final void clear()
  {
    a.clear();
  }
  
  public final boolean contains(Object paramObject)
  {
    return a.containsKey(paramObject);
  }
  
  public final Iterator iterator()
  {
    return a.keySet().iterator();
  }
  
  public final boolean remove(Object paramObject)
  {
    android.support.v4.g.a locala = a;
    boolean bool = locala.containsKey(paramObject);
    if (!bool)
    {
      bool = false;
      locala = null;
    }
    for (;;)
    {
      return bool;
      locala = a;
      locala.remove(paramObject);
      bool = true;
    }
  }
  
  public final int size()
  {
    return a.size();
  }
}


/* Location:              com/google/android/gms/common/util/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */