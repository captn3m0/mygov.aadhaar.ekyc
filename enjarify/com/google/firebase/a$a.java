package com.google.firebase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

final class a$a
  extends BroadcastReceiver
{
  private static AtomicReference a;
  private final Context b;
  
  static
  {
    AtomicReference localAtomicReference = new java/util/concurrent/atomic/AtomicReference;
    localAtomicReference.<init>();
    a = localAtomicReference;
  }
  
  private a$a(Context paramContext)
  {
    b = paramContext;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    synchronized ()
    {
      Object localObject2 = a.a;
      localObject2 = ((Map)localObject2).values();
      Iterator localIterator = ((Collection)localObject2).iterator();
      boolean bool = localIterator.hasNext();
      if (bool)
      {
        localObject2 = localIterator.next();
        localObject2 = (a)localObject2;
        a.a((a)localObject2);
      }
    }
    b.unregisterReceiver(this);
  }
}


/* Location:              com/google/firebase/a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */