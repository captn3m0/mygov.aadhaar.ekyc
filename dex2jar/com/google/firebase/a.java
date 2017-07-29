package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.b.e;
import com.google.android.gms.b.e.a;
import com.google.android.gms.b.fm;
import com.google.android.gms.common.internal.b.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.util.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class a
{
  static final Map<String, a> a = new android.support.v4.g.a();
  private static final List<String> b = Arrays.asList(new String[] { "com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId" });
  private static final List<String> c = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
  private static final List<String> d = Arrays.asList(new String[] { "com.google.android.gms.measurement.AppMeasurement" });
  private static final List<String> e = Arrays.asList(new String[0]);
  private static final Set<String> f = Collections.emptySet();
  private static final Object g = new Object();
  private final Context h;
  private final String i;
  private final b j;
  private final AtomicBoolean k = new AtomicBoolean(false);
  private final AtomicBoolean l = new AtomicBoolean();
  private final List<Object> m = new CopyOnWriteArrayList();
  private final List<Object> n = new CopyOnWriteArrayList();
  private final List<Object> o = new CopyOnWriteArrayList();
  
  private a(Context paramContext, String paramString, b paramb)
  {
    h = ((Context)c.a(paramContext));
    i = c.a(paramString);
    j = ((b)c.a(paramb));
  }
  
  public static a a(Context paramContext)
  {
    Object localObject1;
    synchronized (g)
    {
      if (a.containsKey("[DEFAULT]"))
      {
        paramContext = c();
        return paramContext;
      }
      localObject1 = new i(paramContext);
      String str = ((i)localObject1).a("google_app_id");
      if (TextUtils.isEmpty(str))
      {
        localObject1 = null;
        if (localObject1 == null) {
          return null;
        }
      }
      else
      {
        localObject1 = new b(str, ((i)localObject1).a("google_api_key"), ((i)localObject1).a("firebase_database_url"), ((i)localObject1).a("ga_trackingId"), ((i)localObject1).a("gcm_defaultSenderId"), ((i)localObject1).a("google_storage_bucket"));
      }
    }
    paramContext = a(paramContext, (b)localObject1, "[DEFAULT]");
    return paramContext;
  }
  
  private static a a(Context arg0, b paramb, String paramString)
  {
    fm.a();
    int i1 = Build.VERSION.SDK_INT;
    if ((???.getApplicationContext() instanceof Application))
    {
      e.a((Application)???.getApplicationContext());
      e.a().a(new e.a()
      {
        public final void a(boolean paramAnonymousBoolean) {}
      });
    }
    String str = paramString.trim();
    paramString = ???;
    if (???.getApplicationContext() != null) {
      paramString = ???.getApplicationContext();
    }
    synchronized (g)
    {
      if (!a.containsKey(str))
      {
        bool = true;
        c.a(bool, String.valueOf(str).length() + 33 + "FirebaseApp name " + str + " already exists!");
        c.a(paramString, "Application context cannot be null.");
        paramb = new a(paramString, str, paramb);
        a.put(str, paramb);
        fm.b();
        paramb.a(a.class, paramb, b);
        if (paramb.h())
        {
          paramb.a(a.class, paramb, c);
          paramb.a(Context.class, paramb.a(), d);
        }
        return paramb;
      }
      boolean bool = false;
    }
  }
  
  private <T> void a(Class<T> paramClass, T paramT, Iterable<String> paramIterable)
  {
    boolean bool = android.support.v4.c.a.a(h);
    if (bool) {
      a.a(h);
    }
    Iterator localIterator = paramIterable.iterator();
    for (;;)
    {
      if (localIterator.hasNext())
      {
        paramIterable = (String)localIterator.next();
        if (bool) {}
        try
        {
          if (e.contains(paramIterable))
          {
            Method localMethod = Class.forName(paramIterable).getMethod("getInstance", new Class[] { paramClass });
            int i1 = localMethod.getModifiers();
            if ((Modifier.isPublic(i1)) && (Modifier.isStatic(i1))) {
              localMethod.invoke(null, new Object[] { paramT });
            }
          }
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          if (f.contains(paramIterable)) {
            throw new IllegalStateException(String.valueOf(paramIterable).concat(" is missing, but is required. Check if it has been removed by Proguard."));
          }
          Log.d("FirebaseApp", String.valueOf(paramIterable).concat(" is not linked. Skipping initialization."));
        }
        catch (NoSuchMethodException paramClass)
        {
          throw new IllegalStateException(String.valueOf(paramIterable).concat("#getInstance has been removed by Proguard. Add keep rule to prevent it."));
        }
        catch (InvocationTargetException paramIterable)
        {
          Log.wtf("FirebaseApp", "Firebase API initialization failure.", paramIterable);
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          paramIterable = String.valueOf(paramIterable);
          if (paramIterable.length() != 0) {}
          for (paramIterable = "Failed to initialize ".concat(paramIterable);; paramIterable = new String("Failed to initialize "))
          {
            Log.wtf("FirebaseApp", paramIterable, localIllegalAccessException);
            break;
          }
        }
      }
    }
  }
  
  public static a c()
  {
    synchronized (g)
    {
      Object localObject2 = (a)a.get("[DEFAULT]");
      if (localObject2 == null)
      {
        localObject2 = String.valueOf(j.a());
        throw new IllegalStateException(String.valueOf(localObject2).length() + 116 + "Default FirebaseApp is not initialized in this process " + (String)localObject2 + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
      }
    }
    return locala;
  }
  
  public static void d()
  {
    synchronized (g)
    {
      Iterator localIterator = new ArrayList(a.values()).iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (k.get()) {
          locala.i();
        }
      }
    }
  }
  
  private String f()
  {
    g();
    return i;
  }
  
  private void g()
  {
    if (!l.get()) {}
    for (boolean bool = true;; bool = false)
    {
      c.a(bool, "FirebaseApp was deleted");
      return;
    }
  }
  
  private boolean h()
  {
    return "[DEFAULT]".equals(f());
  }
  
  private void i()
  {
    Log.d("FirebaseApp", "Notifying background state change listeners.");
    Iterator localIterator = n.iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
    }
  }
  
  public final Context a()
  {
    g();
    return h;
  }
  
  public final b b()
  {
    g();
    return j;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a)) {
      return false;
    }
    return i.equals(((a)paramObject).f());
  }
  
  public int hashCode()
  {
    return i.hashCode();
  }
  
  public String toString()
  {
    return com.google.android.gms.common.internal.b.a(this).a("name", i).a("options", j).toString();
  }
  
  @TargetApi(24)
  private static final class a
    extends BroadcastReceiver
  {
    private static AtomicReference<a> a = new AtomicReference();
    private final Context b;
    
    private a(Context paramContext)
    {
      b = paramContext;
    }
    
    public final void onReceive(Context arg1, Intent paramIntent)
    {
      synchronized ()
      {
        paramIntent = a.a.values().iterator();
        if (paramIntent.hasNext()) {
          a.a((a)paramIntent.next());
        }
      }
      b.unregisterReceiver(this);
    }
  }
}


/* Location:              com/google/firebase/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */