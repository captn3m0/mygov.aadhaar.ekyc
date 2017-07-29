package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class mr
  implements Iterable
{
  public final List a;
  
  public mr()
  {
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    a = localLinkedList;
  }
  
  public static boolean a(vc paramvc)
  {
    Object localObject = b(paramvc);
    boolean bool;
    if (localObject != null)
    {
      localObject = b;
      ((ms)localObject).a();
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  static mq b(vc paramvc)
  {
    Object localObject = w.B();
    Iterator localIterator = ((mr)localObject).iterator();
    boolean bool;
    vc localvc;
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (mq)localIterator.next();
      localvc = a;
    } while (localvc != paramvc);
    for (;;)
    {
      return (mq)localObject;
      bool = false;
      localObject = null;
    }
  }
  
  public final Iterator iterator()
  {
    return a.iterator();
  }
}


/* Location:              com/google/android/gms/b/mr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */