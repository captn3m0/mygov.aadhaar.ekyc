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
  private static WeakHashMap a;
  private Map b;
  private int c;
  private Bundle d;
  
  static
  {
    WeakHashMap localWeakHashMap = new java/util/WeakHashMap;
    localWeakHashMap.<init>();
    a = localWeakHashMap;
  }
  
  public ar()
  {
    a locala = new android/support/v4/g/a;
    locala.<init>();
    b = locala;
    c = 0;
  }
  
  public static ar a(j paramj)
  {
    Object localObject1 = (WeakReference)a.get(paramj);
    if (localObject1 != null)
    {
      localObject1 = (ar)((WeakReference)localObject1).get();
      if (localObject1 == null) {}
    }
    for (;;)
    {
      return (ar)localObject1;
      try
      {
        localObject1 = paramj.b_();
        localObject2 = "SupportLifecycleFragmentImpl";
        localObject1 = ((n)localObject1).a((String)localObject2);
        localObject1 = (ar)localObject1;
        if (localObject1 != null)
        {
          boolean bool = u;
          if (!bool) {}
        }
        else
        {
          localObject1 = new com/google/android/gms/b/ar;
          ((ar)localObject1).<init>();
          localObject2 = paramj.b_().a();
          localObject3 = "SupportLifecycleFragmentImpl";
          localObject2 = ((s)localObject2).a((i)localObject1, (String)localObject3);
          ((s)localObject2).b();
        }
        localObject2 = a;
        Object localObject3 = new java/lang/ref/WeakReference;
        ((WeakReference)localObject3).<init>(localObject1);
        ((WeakHashMap)localObject2).put(paramj, localObject3);
      }
      catch (ClassCastException localClassCastException)
      {
        Object localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", localClassCastException);
        throw ((Throwable)localObject2);
      }
    }
  }
  
  public final ae a(String paramString, Class paramClass)
  {
    Object localObject = b.get(paramString);
    return (ae)paramClass.cast(localObject);
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.a(paramInt1, paramInt2, paramIntent);
    Object localObject = b.values();
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (ae)localIterator.next();
      ((ae)localObject).a(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    int i = 1;
    c = i;
    d = paramBundle;
    Object localObject = b.entrySet();
    Iterator localIterator = ((Set)localObject).iterator();
    i = localIterator.hasNext();
    if (i != 0)
    {
      localObject = (Map.Entry)localIterator.next();
      ae localae = (ae)((Map.Entry)localObject).getValue();
      if (paramBundle != null) {
        localObject = (String)((Map.Entry)localObject).getKey();
      }
      for (localObject = paramBundle.getBundle((String)localObject);; localObject = null)
      {
        localae.a((Bundle)localObject);
        break;
        i = 0;
      }
    }
  }
  
  public final void a(String paramString, ae paramae)
  {
    Object localObject1 = b;
    boolean bool = ((Map)localObject1).containsKey(paramString);
    if (!bool)
    {
      localObject1 = b;
      ((Map)localObject1).put(paramString, paramae);
      int i = c;
      if (i > 0)
      {
        localObject1 = new android/os/Handler;
        localObject2 = Looper.getMainLooper();
        ((Handler)localObject1).<init>((Looper)localObject2);
        localObject2 = new com/google/android/gms/b/ar$1;
        ((ar.1)localObject2).<init>(this, paramae, paramString);
        ((Handler)localObject1).post((Runnable)localObject2);
      }
      return;
    }
    localObject1 = new java/lang/IllegalArgumentException;
    int j = String.valueOf(paramString).length() + 59;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(j);
    Object localObject2 = "LifecycleCallback with tag " + paramString + " already added to this fragment.";
    ((IllegalArgumentException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    Object localObject = b.values();
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (ae)localIterator.next();
      ((ae)localObject).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public final void c()
  {
    super.c();
    int i = 2;
    c = i;
    Object localObject = b.values();
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (ae)localIterator.next();
      ((ae)localObject).a();
    }
  }
  
  public final void d()
  {
    super.d();
    int i = 3;
    c = i;
    Object localObject = b.values();
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (ae)localIterator.next();
      ((ae)localObject).b();
    }
  }
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    if (paramBundle == null) {
      return;
    }
    Object localObject = b.entrySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Map.Entry)localIterator.next();
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      ae localae = (ae)((Map.Entry)localObject).getValue();
      localae.b(localBundle);
      localObject = (String)((Map.Entry)localObject).getKey();
      paramBundle.putBundle((String)localObject, localBundle);
    }
  }
  
  public final void n()
  {
    super.n();
    int i = 4;
    c = i;
    Iterator localIterator = b.values().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localIterator.next();
    }
  }
}


/* Location:              com/google/android/gms/b/ar.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */