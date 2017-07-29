package com.google.android.gms.common.util;

import android.support.v4.g.k;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class a<E>
  extends AbstractSet<E>
{
  private final android.support.v4.g.a<E, E> a;
  
  public a()
  {
    a = new android.support.v4.g.a();
  }
  
  private a(int paramInt)
  {
    a = new android.support.v4.g.a(paramInt);
  }
  
  public a(Collection<E> paramCollection)
  {
    this(paramCollection.size());
    addAll(paramCollection);
  }
  
  private boolean a(a<? extends E> parama)
  {
    boolean bool = false;
    int j = size();
    android.support.v4.g.a locala = a;
    parama = a;
    int k = h;
    locala.a(h + k);
    if (h == 0) {
      if (k > 0)
      {
        System.arraycopy(f, 0, f, 0, k);
        System.arraycopy(g, 0, g, 0, k << 1);
        h = k;
      }
    }
    for (;;)
    {
      if (size() > j) {
        bool = true;
      }
      return bool;
      int i = 0;
      while (i < k)
      {
        locala.put(parama.b(i), parama.c(i));
        i += 1;
      }
    }
  }
  
  public final boolean add(E paramE)
  {
    if (a.containsKey(paramE)) {
      return false;
    }
    a.put(paramE, paramE);
    return true;
  }
  
  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    if ((paramCollection instanceof a)) {
      return a((a)paramCollection);
    }
    return super.addAll(paramCollection);
  }
  
  public final void clear()
  {
    a.clear();
  }
  
  public final boolean contains(Object paramObject)
  {
    return a.containsKey(paramObject);
  }
  
  public final Iterator<E> iterator()
  {
    return a.keySet().iterator();
  }
  
  public final boolean remove(Object paramObject)
  {
    if (!a.containsKey(paramObject)) {
      return false;
    }
    a.remove(paramObject);
    return true;
  }
  
  public final int size()
  {
    return a.size();
  }
}


/* Location:              com/google/android/gms/common/util/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */