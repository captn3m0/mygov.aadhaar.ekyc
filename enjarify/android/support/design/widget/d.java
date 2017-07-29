package android.support.design.widget;

import android.support.v4.g.j.a;
import android.support.v4.g.j.b;
import android.support.v4.g.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

final class d
{
  final j.a a;
  final k b;
  private final ArrayList c;
  private final HashSet d;
  
  d()
  {
    Object localObject = new android/support/v4/g/j$b;
    ((j.b)localObject).<init>(10);
    a = ((j.a)localObject);
    localObject = new android/support/v4/g/k;
    ((k)localObject).<init>();
    b = ((k)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    c = ((ArrayList)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    d = ((HashSet)localObject);
  }
  
  private void a(Object paramObject, ArrayList paramArrayList, HashSet paramHashSet)
  {
    boolean bool = paramArrayList.contains(paramObject);
    if (bool) {}
    for (;;)
    {
      return;
      bool = paramHashSet.contains(paramObject);
      if (bool)
      {
        localObject1 = new java/lang/RuntimeException;
        ((RuntimeException)localObject1).<init>("This graph contains cyclic dependencies");
        throw ((Throwable)localObject1);
      }
      paramHashSet.add(paramObject);
      Object localObject1 = (ArrayList)b.get(paramObject);
      if (localObject1 != null)
      {
        int i = 0;
        int j = ((ArrayList)localObject1).size();
        while (i < j)
        {
          Object localObject2 = ((ArrayList)localObject1).get(i);
          a(localObject2, paramArrayList, paramHashSet);
          i += 1;
        }
      }
      paramHashSet.remove(paramObject);
      paramArrayList.add(paramObject);
    }
  }
  
  final ArrayList a()
  {
    c.clear();
    d.clear();
    int i = 0;
    k localk = b;
    int j = localk.size();
    while (i < j)
    {
      Object localObject = b.b(i);
      ArrayList localArrayList = c;
      HashSet localHashSet = d;
      a(localObject, localArrayList, localHashSet);
      i += 1;
    }
    return c;
  }
  
  final void a(Object paramObject)
  {
    k localk = b;
    boolean bool = localk.containsKey(paramObject);
    if (!bool)
    {
      localk = b;
      localk.put(paramObject, null);
    }
  }
  
  final List b(Object paramObject)
  {
    return (List)b.get(paramObject);
  }
}


/* Location:              android/support/design/widget/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */