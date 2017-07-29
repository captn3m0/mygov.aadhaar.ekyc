package com.google.android.gms.b;

import com.google.android.gms.c.c;
import com.google.android.gms.c.h;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import java.util.Iterator;
import java.util.Set;

public final class d
{
  final android.support.v4.g.a a;
  final c b;
  private int c;
  private boolean d;
  
  public d(Iterable paramIterable)
  {
    Object localObject = new com/google/android/gms/c/c;
    ((c)localObject).<init>();
    b = ((c)localObject);
    boolean bool = false;
    d = false;
    localObject = new android/support/v4/g/a;
    ((android.support.v4.g.a)localObject).<init>();
    a = ((android.support.v4.g.a)localObject);
    Iterator localIterator = paramIterable.iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (n)localIterator.next();
      android.support.v4.g.a locala = a;
      localObject = b;
      locala.put(localObject, null);
    }
    int i = a.keySet().size();
    c = i;
  }
  
  public final void a(wn paramwn, com.google.android.gms.common.a parama)
  {
    Object localObject1 = a;
    ((android.support.v4.g.a)localObject1).put(paramwn, parama);
    int i = c + -1;
    c = i;
    boolean bool1 = parama.b();
    if (!bool1)
    {
      bool1 = true;
      d = bool1;
    }
    int j = c;
    if (j == 0)
    {
      boolean bool2 = d;
      if (!bool2) {
        break label100;
      }
      localObject1 = new com/google/android/gms/common/api/m;
      Object localObject2 = a;
      ((m)localObject1).<init>((android.support.v4.g.a)localObject2);
      localObject2 = b.a;
      ((h)localObject2).a((Exception)localObject1);
    }
    for (;;)
    {
      return;
      label100:
      localObject1 = b;
      ((c)localObject1).a();
    }
  }
}


/* Location:              com/google/android/gms/b/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */