package com.google.android.gms.b;

import android.os.Handler;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class mx
{
  final List a;
  
  mx()
  {
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    a = localLinkedList;
  }
  
  final void a(my parammy)
  {
    Handler localHandler = tt.a;
    Object localObject = a;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (mx.a)localIterator.next();
      mx.7 local7 = new com/google/android/gms/b/mx$7;
      local7.<init>((mx.a)localObject, parammy);
      localHandler.post(local7);
    }
    a.clear();
  }
}


/* Location:              com/google/android/gms/b/mx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */