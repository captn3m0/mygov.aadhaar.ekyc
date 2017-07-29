package com.google.android.gms.b;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class th
{
  public final tj a;
  public final LinkedList b;
  public final Object c;
  public long d;
  public long e;
  public boolean f;
  public long g;
  public long h;
  public long i;
  public long j;
  private final String k;
  private final String l;
  
  private th(tj paramtj, String paramString1, String paramString2)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    c = localObject;
    d = l1;
    e = l1;
    f = false;
    g = l1;
    h = 0L;
    i = l1;
    j = l1;
    a = paramtj;
    k = paramString1;
    l = paramString2;
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    b = ((LinkedList)localObject);
  }
  
  public th(String paramString1, String paramString2)
  {
    this(localtj, paramString1, paramString2);
  }
  
  public final Bundle a()
  {
    Bundle localBundle1;
    Object localObject4;
    synchronized (c)
    {
      localBundle1 = new android/os/Bundle;
      localBundle1.<init>();
      Object localObject2 = "seq_num";
      localObject4 = k;
      localBundle1.putString((String)localObject2, (String)localObject4);
      localObject2 = "slotid";
      localObject4 = l;
      localBundle1.putString((String)localObject2, (String)localObject4);
      localObject2 = "ismediation";
      boolean bool1 = f;
      localBundle1.putBoolean((String)localObject2, bool1);
      localObject2 = "treq";
      long l1 = i;
      localBundle1.putLong((String)localObject2, l1);
      localObject2 = "tresponse";
      l1 = j;
      localBundle1.putLong((String)localObject2, l1);
      localObject2 = "timp";
      l1 = e;
      localBundle1.putLong((String)localObject2, l1);
      localObject2 = "tload";
      l1 = g;
      localBundle1.putLong((String)localObject2, l1);
      localObject2 = "pcc";
      l1 = h;
      localBundle1.putLong((String)localObject2, l1);
      localObject2 = "tfetch";
      l1 = d;
      localBundle1.putLong((String)localObject2, l1);
      localObject4 = new java/util/ArrayList;
      ((ArrayList)localObject4).<init>();
      localObject2 = b;
      Iterator localIterator = ((LinkedList)localObject2).iterator();
      boolean bool2 = localIterator.hasNext();
      if (bool2)
      {
        localObject2 = localIterator.next();
        localObject2 = (th.a)localObject2;
        Bundle localBundle2 = new android/os/Bundle;
        localBundle2.<init>();
        String str2 = "topen";
        long l2 = a;
        localBundle2.putLong(str2, l2);
        str2 = "tclose";
        l2 = b;
        localBundle2.putLong(str2, l2);
        ((ArrayList)localObject4).add(localBundle2);
      }
    }
    String str1 = "tclick";
    localBundle1.putParcelableArrayList(str1, (ArrayList)localObject4);
    return localBundle1;
  }
}


/* Location:              com/google/android/gms/b/th.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */