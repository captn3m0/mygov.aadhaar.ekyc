package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@qi
public final class kb
{
  final Collection<jz> a = new ArrayList();
  final Collection<jz<String>> b = new ArrayList();
  final Collection<jz<String>> c = new ArrayList();
  
  public final List<String> a()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (jz)localIterator.next();
      localObject = (String)w.q().a((jz)localObject);
      if (localObject != null) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
}


/* Location:              com/google/android/gms/b/kb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */