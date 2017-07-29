package com.google.android.gms.b;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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

public final class ag
  extends Fragment
  implements af
{
  private static WeakHashMap<Activity, WeakReference<ag>> a = new WeakHashMap();
  private Map<String, ae> b = new a();
  private int c = 0;
  private Bundle d;
  
  public static ag a(Activity paramActivity)
  {
    Object localObject = (WeakReference)a.get(paramActivity);
    if (localObject != null)
    {
      localObject = (ag)((WeakReference)localObject).get();
      if (localObject != null) {
        return (ag)localObject;
      }
    }
    try
    {
      ag localag = (ag)paramActivity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
      if (localag != null)
      {
        localObject = localag;
        if (!localag.isRemoving()) {}
      }
      else
      {
        localObject = new ag();
        paramActivity.getFragmentManager().beginTransaction().add((Fragment)localObject, "LifecycleFragmentImpl").commitAllowingStateLoss();
      }
      a.put(paramActivity, new WeakReference(localObject));
      return (ag)localObject;
    }
    catch (ClassCastException paramActivity)
    {
      throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", paramActivity);
    }
  }
  
  public final <T extends ae> T a(String paramString, Class<T> paramClass)
  {
    return (ae)paramClass.cast(b.get(paramString));
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
            if (ag.a(ag.this) > 0)
            {
              localae = paramae;
              if (ag.b(ag.this) == null) {
                break label90;
              }
            }
            label90:
            for (Bundle localBundle = ag.b(ag.this).getBundle(paramString);; localBundle = null)
            {
              localae.a(localBundle);
              if (ag.a(ag.this) >= 2) {
                paramae.a();
              }
              if (ag.a(ag.this) >= 3) {
                paramae.b();
              }
              ag.a(ag.this);
              return;
            }
          }
        });
      }
      return;
    }
    throw new IllegalArgumentException(String.valueOf(paramString).length() + 59 + "LifecycleCallback with tag " + paramString + " already added to this fragment.");
  }
  
  public final Activity d_()
  {
    return getActivity();
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    Iterator localIterator = b.values().iterator();
    while (localIterator.hasNext()) {
      ((ae)localIterator.next()).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Iterator localIterator = b.values().iterator();
    while (localIterator.hasNext()) {
      ((ae)localIterator.next()).a(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
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
  
  public final void onDestroy()
  {
    super.onDestroy();
    c = 4;
    Iterator localIterator = b.values().iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
    }
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
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
  
  public final void onStart()
  {
    super.onStart();
    c = 2;
    Iterator localIterator = b.values().iterator();
    while (localIterator.hasNext()) {
      ((ae)localIterator.next()).a();
    }
  }
  
  public final void onStop()
  {
    super.onStop();
    c = 3;
    Iterator localIterator = b.values().iterator();
    while (localIterator.hasNext()) {
      ((ae)localIterator.next()).b();
    }
  }
}


/* Location:              com/google/android/gms/b/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */