package android.support.design.widget;

import android.support.v4.g.j.a;
import android.support.v4.g.j.b;
import android.support.v4.g.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

final class d<T>
{
  final j.a<ArrayList<T>> a = new j.b(10);
  final k<T, ArrayList<T>> b = new k();
  private final ArrayList<T> c = new ArrayList();
  private final HashSet<T> d = new HashSet();
  
  private void a(T paramT, ArrayList<T> paramArrayList, HashSet<T> paramHashSet)
  {
    if (paramArrayList.contains(paramT)) {
      return;
    }
    if (paramHashSet.contains(paramT)) {
      throw new RuntimeException("This graph contains cyclic dependencies");
    }
    paramHashSet.add(paramT);
    ArrayList localArrayList = (ArrayList)b.get(paramT);
    if (localArrayList != null)
    {
      int i = 0;
      int j = localArrayList.size();
      while (i < j)
      {
        a(localArrayList.get(i), paramArrayList, paramHashSet);
        i += 1;
      }
    }
    paramHashSet.remove(paramT);
    paramArrayList.add(paramT);
  }
  
  final ArrayList<T> a()
  {
    c.clear();
    d.clear();
    int i = 0;
    int j = b.size();
    while (i < j)
    {
      a(b.b(i), c, d);
      i += 1;
    }
    return c;
  }
  
  final void a(T paramT)
  {
    if (!b.containsKey(paramT)) {
      b.put(paramT, null);
    }
  }
  
  final List b(T paramT)
  {
    return (List)b.get(paramT);
  }
}


/* Location:              android/support/design/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */