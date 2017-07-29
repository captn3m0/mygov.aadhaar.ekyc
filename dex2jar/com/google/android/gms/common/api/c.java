package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.b.ad;
import com.google.android.gms.b.as;
import com.google.android.gms.b.eb;
import com.google.android.gms.b.ec;
import com.google.android.gms.b.ed;
import com.google.android.gms.b.f.a;
import com.google.android.gms.b.i;
import com.google.android.gms.b.t;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.p.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

public abstract class c
{
  private static final Set<c> a = Collections.newSetFromMap(new WeakHashMap());
  
  public Looper a()
  {
    throw new UnsupportedOperationException();
  }
  
  public <A extends a.c, T extends f.a<? extends g, A>> T a(T paramT)
  {
    throw new UnsupportedOperationException();
  }
  
  public void a(as paramas)
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract void a(c paramc);
  
  public abstract void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  public abstract void b();
  
  public void b(as paramas)
  {
    throw new UnsupportedOperationException();
  }
  
  public abstract void b(c paramc);
  
  public abstract void c();
  
  public static final class a
  {
    Account a;
    public final Set<Scope> b = new HashSet();
    public final Set<Scope> c = new HashSet();
    public final Map<a<?>, a.a> d = new android.support.v4.g.a();
    private int e;
    private View f;
    private String g;
    private String h;
    private final Map<a<?>, p.a> i = new android.support.v4.g.a();
    private final Context j;
    private ad k;
    private int l = -1;
    private c.c m;
    private Looper n;
    private com.google.android.gms.common.c o = com.google.android.gms.common.c.a();
    private a.b<? extends ec, ed> p = eb.c;
    private final ArrayList<c.b> q = new ArrayList();
    private final ArrayList<c.c> r = new ArrayList();
    private boolean s = false;
    
    public a(Context paramContext)
    {
      j = paramContext;
      n = paramContext.getMainLooper();
      g = paramContext.getPackageName();
      h = paramContext.getClass().getName();
    }
    
    public final p a()
    {
      ed localed = ed.a;
      if (d.containsKey(eb.g)) {
        localed = (ed)d.get(eb.g);
      }
      return new p(a, b, i, e, f, g, h, localed);
    }
    
    public final c b()
    {
      android.support.v4.g.a locala1;
      android.support.v4.g.a locala2;
      ArrayList localArrayList;
      label74:
      a locala;
      Object localObject4;
      if (!d.isEmpty())
      {
        bool = true;
        com.google.android.gms.common.internal.c.b(bool, "must call addApi() to add at least one API");
        ??? = a();
        localObject2 = d;
        locala1 = new android.support.v4.g.a();
        locala2 = new android.support.v4.g.a();
        localArrayList = new ArrayList();
        Iterator localIterator = d.keySet().iterator();
        if (!localIterator.hasNext()) {
          break label210;
        }
        locala = (a)localIterator.next();
        localObject4 = d.get(locala);
        if (((Map)localObject2).get(locala) == null) {
          break label205;
        }
      }
      label205:
      for (boolean bool = true;; bool = false)
      {
        locala1.put(locala, Boolean.valueOf(bool));
        i locali = new i(locala, bool);
        localArrayList.add(locali);
        localObject4 = locala.a().a(j, n, (p)???, localObject4, locali, locali);
        locala2.put(locala.b(), localObject4);
        break label74;
        bool = false;
        break;
      }
      label210:
      int i1 = t.a(locala2.values());
      Object localObject2 = new t(j, new ReentrantLock(), n, (p)???, o, p, locala1, q, r, locala2, l, i1, localArrayList);
      synchronized (c.d())
      {
        c.d().add(localObject2);
        if (l >= 0) {
          com.google.android.gms.b.c.a(k).a(l, (c)localObject2, m);
        }
        return (c)localObject2;
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(int paramInt);
    
    public abstract void a(Bundle paramBundle);
  }
  
  public static abstract interface c
  {
    public abstract void a(com.google.android.gms.common.a parama);
  }
}


/* Location:              com/google/android/gms/common/api/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */