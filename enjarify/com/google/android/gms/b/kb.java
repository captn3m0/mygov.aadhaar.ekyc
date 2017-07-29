package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class kb
{
  final Collection a;
  final Collection b;
  final Collection c;
  
  public kb()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    a = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    b = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    c = localArrayList;
  }
  
  public final List a()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = b;
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (jz)localIterator.next();
      kd localkd = w.q();
      localObject = (String)localkd.a((jz)localObject);
      if (localObject != null) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
}


/* Location:              com/google/android/gms/b/kb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */