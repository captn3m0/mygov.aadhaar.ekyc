package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@qi
public final class mr
  implements Iterable<mq>
{
  public final List<mq> a = new LinkedList();
  
  public static boolean a(vc paramvc)
  {
    paramvc = b(paramvc);
    if (paramvc != null)
    {
      b.a();
      return true;
    }
    return false;
  }
  
  static mq b(vc paramvc)
  {
    Iterator localIterator = w.B().iterator();
    while (localIterator.hasNext())
    {
      mq localmq = (mq)localIterator.next();
      if (a == paramvc) {
        return localmq;
      }
    }
    return null;
  }
  
  public final Iterator<mq> iterator()
  {
    return a.iterator();
  }
}


/* Location:              com/google/android/gms/b/mr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */