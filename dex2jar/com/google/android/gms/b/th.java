package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.ads.internal.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@qi
public final class th
{
  public final tj a;
  public final LinkedList<a> b;
  public final Object c = new Object();
  public long d = -1L;
  public long e = -1L;
  public boolean f = false;
  public long g = -1L;
  public long h = 0L;
  public long i = -1L;
  public long j = -1L;
  private final String k;
  private final String l;
  
  private th(tj paramtj, String paramString1, String paramString2)
  {
    a = paramtj;
    k = paramString1;
    l = paramString2;
    b = new LinkedList();
  }
  
  public th(String paramString1, String paramString2)
  {
    this(w.i(), paramString1, paramString2);
  }
  
  public final Bundle a()
  {
    ArrayList localArrayList;
    synchronized (c)
    {
      Bundle localBundle1 = new Bundle();
      localBundle1.putString("seq_num", k);
      localBundle1.putString("slotid", l);
      localBundle1.putBoolean("ismediation", f);
      localBundle1.putLong("treq", i);
      localBundle1.putLong("tresponse", j);
      localBundle1.putLong("timp", e);
      localBundle1.putLong("tload", g);
      localBundle1.putLong("pcc", h);
      localBundle1.putLong("tfetch", d);
      localArrayList = new ArrayList();
      Iterator localIterator = b.iterator();
      if (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        Bundle localBundle3 = new Bundle();
        localBundle3.putLong("topen", a);
        localBundle3.putLong("tclose", b);
        localArrayList.add(localBundle3);
      }
    }
    localBundle2.putParcelableArrayList("tclick", localArrayList);
    return localBundle2;
  }
  
  @qi
  private static final class a
  {
    public long a = -1L;
    public long b = -1L;
  }
}


/* Location:              com/google/android/gms/b/th.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */