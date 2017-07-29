package com.google.android.gms.b;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.b.i;
import android.support.v4.b.j;
import android.support.v4.b.n;
import android.support.v4.b.s;
import android.support.v4.g.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public final class ar
  extends i
  implements af
{
  private static WeakHashMap<j, WeakReference<ar>> a = new WeakHashMap();
  private Map<String, ae> b = new a();
  private int c = 0;
  private Bundle d;
  
  public static ar a(j paramj)
  {
    Object localObject = (WeakReference)a.get(paramj);
    if (localObject != null)
    {
      localObject = (ar)((WeakReference)localObject).get();
      if (localObject != null) {
        return (ar)localObject;
      }
    }
    try
    {
      ar localar = (ar)paramj.b_().a("SupportLifecycleFragmentImpl");
      if (localar != null)
      {
        localObject = localar;
        if (!u) {}
      }
      else
      {
        localObject = new ar();
        paramj.b_().a().a((i)localObject, "SupportLifecycleFragmentImpl").b();
      }
      a.put(paramj, new WeakReference(localObject));
      return (ar)localObject;
    }
    catch (ClassCastException paramj)
    {
      throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", paramj);
    }
  }
  
  public final <T extends ae> T a(String paramString, Class<T> paramClass)
  {
    return (ae)paramClass.cast(b.get(paramString));
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    Iterator localIterator = b.values().iterator();
    while (localIterator.hasNext()) {
      ((ae)localIterator.next()).a(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    c = 1;
    d = paramBundle;
    Iterator localIterator = b.entrySet().iterator();
    if (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      ae localae = (ae)((Map.Entry)localObject).getValue();
      if (paramBundle != null) {}
      for (localObject = paramBundle.getBundle((String)((Map.Entry)localObject).getKey());; localObject = null)
      {
        localae.a((Bundle)localObject);
        break;
      }
    }
  }
  
  public final void a(final String paramString, final ae paramae)
  {
    if (!b.containsKey(paramString))
    {
      b.put(paramString, paramae);
      if (c > 0) {
        new Handler(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            ae localae;
            if (ar.a(ar.this) > 0)
            {
              localae = paramae;
              if (ar.b(ar.this) == null) {
                break label90;
              }
            }
            label90:
            for (Bundle localBundle = ar.b(ar.this).getBundle(paramString);; localBundle = null)
            {
              localae.a(localBundle);
              if (ar.a(ar.this) >= 2) {
                paramae.a();
              }
              if (ar.a(ar.this) >= 3) {
                paramae.b();
              }
              ar.a(ar.this);
              return;
            }
          }
        });
      }
      return;
    }
    throw new IllegalArgumentException(String.valueOf(paramString).length() + 59 + "LifecycleCallback with tag " + paramString + " already added to this fragment.");
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    Iterator localIterator = b.values().iterator();
    while (localIterator.hasNext()) {
      ((ae)localIterator.next()).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public final void c()
  {
    super.c();
    c = 2;
    Iterator localIterator = b.values().iterator();
    while (localIterator.hasNext()) {
      ((ae)localIterator.next()).a();
    }
  }
  
  public final void d()
  {
    super.d();
    c = 3;
    Iterator localIterator = b.values().iterator();
    while (localIterator.hasNext()) {
      ((ae)localIterator.next()).b();
    }
  }
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (paramBundle == null) {}
    for (;;)
    {
      return;
      Iterator localIterator = b.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        Bundle localBundle = new Bundle();
        ((ae)localEntry.getValue()).b(localBundle);
        paramBundle.putBundle((String)localEntry.getKey(), localBundle);
      }
    }
  }
  
  public final void n()
  {
    super.n();
    c = 4;
    Iterator localIterator = b.values().iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
    }
  }
}


/* Location:              com/google/android/gms/b/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */