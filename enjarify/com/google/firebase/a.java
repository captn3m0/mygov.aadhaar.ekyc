package com.google.firebase;

import android.app.Application;
import android.content.Context;
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

public class a
{
  static final Map a;
  private static final List b;
  private static final List c;
  private static final List d;
  private static final List e;
  private static final Set f;
  private static final Object g;
  private final Context h;
  private final String i;
  private final b j;
  private final AtomicBoolean k;
  private final AtomicBoolean l;
  private final List m;
  private final List n;
  private final List o;
  
  static
  {
    int i1 = 1;
    Object localObject = new String[2];
    localObject[0] = "com.google.firebase.auth.FirebaseAuth";
    localObject[i1] = "com.google.firebase.iid.FirebaseInstanceId";
    b = Arrays.asList((Object[])localObject);
    c = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    localObject = new String[i1];
    localObject[0] = "com.google.android.gms.measurement.AppMeasurement";
    d = Arrays.asList((Object[])localObject);
    e = Arrays.asList(new String[0]);
    f = Collections.emptySet();
    localObject = new java/lang/Object;
    localObject.<init>();
    g = localObject;
    localObject = new android/support/v4/g/a;
    ((android.support.v4.g.a)localObject).<init>();
    a = (Map)localObject;
  }
  
  private a(Context paramContext, String paramString, b paramb)
  {
    Object localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>(false);
    k = ((AtomicBoolean)localObject);
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>();
    l = ((AtomicBoolean)localObject);
    localObject = new java/util/concurrent/CopyOnWriteArrayList;
    ((CopyOnWriteArrayList)localObject).<init>();
    m = ((List)localObject);
    localObject = new java/util/concurrent/CopyOnWriteArrayList;
    ((CopyOnWriteArrayList)localObject).<init>();
    n = ((List)localObject);
    localObject = new java/util/concurrent/CopyOnWriteArrayList;
    ((CopyOnWriteArrayList)localObject).<init>();
    o = ((List)localObject);
    localObject = (Context)c.a(paramContext);
    h = ((Context)localObject);
    localObject = c.a(paramString);
    i = ((String)localObject);
    localObject = (b)c.a(paramb);
    j = ((b)localObject);
  }
  
  public static a a(Context paramContext)
  {
    for (;;)
    {
      synchronized (g)
      {
        Object localObject2 = a;
        str1 = "[DEFAULT]";
        boolean bool = ((Map)localObject2).containsKey(str1);
        if (bool)
        {
          localObject2 = c();
          return (a)localObject2;
        }
        Object localObject3 = new com/google/android/gms/common/internal/i;
        ((i)localObject3).<init>(paramContext);
        localObject2 = "google_app_id";
        str1 = ((i)localObject3).a((String)localObject2);
        bool = TextUtils.isEmpty(str1);
        if (bool)
        {
          bool = false;
          localObject2 = null;
          if (localObject2 == null)
          {
            bool = false;
            localObject2 = null;
          }
        }
        else
        {
          localObject2 = new com/google/firebase/b;
          String str2 = "google_api_key";
          str2 = ((i)localObject3).a(str2);
          String str3 = "firebase_database_url";
          str3 = ((i)localObject3).a(str3);
          String str4 = "ga_trackingId";
          str4 = ((i)localObject3).a(str4);
          String str5 = "gcm_defaultSenderId";
          str5 = ((i)localObject3).a(str5);
          String str6 = "google_storage_bucket";
          localObject3 = ((i)localObject3).a(str6);
          ((b)localObject2).<init>(str1, str2, str3, str4, str5, (String)localObject3);
        }
      }
      String str1 = "[DEFAULT]";
      a locala = a(paramContext, localb, str1);
    }
  }
  
  private static a a(Context paramContext, b paramb, String paramString)
  {
    fm.a();
    int i1 = Build.VERSION.SDK_INT;
    Object localObject1 = paramContext.getApplicationContext();
    boolean bool1 = localObject1 instanceof Application;
    if (bool1)
    {
      e.a((Application)paramContext.getApplicationContext());
      localObject1 = e.a();
      localObject3 = new com/google/firebase/a$1;
      ((a.1)localObject3).<init>();
      ((e)localObject1).a((e.a)localObject3);
    }
    Object localObject3 = paramString.trim();
    localObject1 = paramContext.getApplicationContext();
    if (localObject1 != null) {
      paramContext = paramContext.getApplicationContext();
    }
    synchronized (g)
    {
      localObject1 = a;
      bool1 = ((Map)localObject1).containsKey(localObject3);
      if (!bool1)
      {
        bool1 = true;
        Object localObject5 = String.valueOf(localObject3);
        int i2 = ((String)localObject5).length() + 33;
        Object localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>(i2);
        localObject5 = "FirebaseApp name ";
        localObject5 = ((StringBuilder)localObject6).append((String)localObject5);
        localObject5 = ((StringBuilder)localObject5).append((String)localObject3);
        localObject6 = " already exists!";
        localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
        localObject5 = ((StringBuilder)localObject5).toString();
        c.a(bool1, localObject5);
        localObject1 = "Application context cannot be null.";
        c.a(paramContext, localObject1);
        localObject1 = new com/google/firebase/a;
        ((a)localObject1).<init>(paramContext, (String)localObject3, paramb);
        localObject5 = a;
        ((Map)localObject5).put(localObject3, localObject1);
        fm.b();
        localObject3 = a.class;
        ??? = b;
        ((a)localObject1).a((Class)localObject3, localObject1, (Iterable)???);
        boolean bool2 = ((a)localObject1).h();
        if (bool2)
        {
          ??? = c;
          ((a)localObject1).a(a.class, localObject1, (Iterable)???);
          localObject3 = Context.class;
          ??? = ((a)localObject1).a();
          localObject5 = d;
          ((a)localObject1).a((Class)localObject3, ???, (Iterable)localObject5);
        }
        return (a)localObject1;
      }
      bool1 = false;
      localObject1 = null;
    }
  }
  
  private void a(Class paramClass, Object paramObject, Iterable paramIterable)
  {
    Object localObject1 = h;
    boolean bool1 = android.support.v4.c.a.a((Context)localObject1);
    if (bool1)
    {
      localObject1 = h;
      a.a.a((Context)localObject1);
    }
    Iterator localIterator = paramIterable.iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (bool2)
      {
        localObject1 = (String)localIterator.next();
        if (bool1) {}
        try
        {
          Object localObject2 = e;
          bool3 = ((List)localObject2).contains(localObject1);
          if (bool3)
          {
            localObject2 = Class.forName((String)localObject1);
            str2 = "getInstance";
            boolean bool4 = true;
            localObject5 = new Class[bool4];
            i1 = 0;
            localObject5[0] = paramClass;
            localObject2 = ((Class)localObject2).getMethod(str2, (Class[])localObject5);
            int i2 = ((Method)localObject2).getModifiers();
            bool4 = Modifier.isPublic(i2);
            if (bool4)
            {
              boolean bool5 = Modifier.isStatic(i2);
              if (bool5)
              {
                bool5 = false;
                str2 = null;
                bool4 = true;
                localObject5 = new Object[bool4];
                i1 = 0;
                localObject5[0] = paramObject;
                ((Method)localObject2).invoke(null, (Object[])localObject5);
              }
            }
          }
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          Object localObject3 = f;
          boolean bool3 = ((Set)localObject3).contains(localObject1);
          if (bool3)
          {
            localObject3 = new java/lang/IllegalStateException;
            localObject1 = String.valueOf(localObject1).concat(" is missing, but is required. Check if it has been removed by Proguard.");
            ((IllegalStateException)localObject3).<init>((String)localObject1);
            throw ((Throwable)localObject3);
          }
          localObject3 = "FirebaseApp";
          localObject1 = String.valueOf(localObject1);
          str2 = " is not linked. Skipping initialization.";
          localObject1 = ((String)localObject1).concat(str2);
          Log.d((String)localObject3, (String)localObject1);
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          localObject4 = new java/lang/IllegalStateException;
          localObject1 = String.valueOf(localObject1).concat("#getInstance has been removed by Proguard. Add keep rule to prevent it.");
          ((IllegalStateException)localObject4).<init>((String)localObject1);
          throw ((Throwable)localObject4);
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
          Object localObject4 = "FirebaseApp";
          str2 = "Firebase API initialization failure.";
          Log.wtf((String)localObject4, str2, localInvocationTargetException);
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          String str2 = "FirebaseApp";
          Object localObject5 = "Failed to initialize ";
          String str1 = String.valueOf(localInvocationTargetException);
          int i1 = str1.length();
          if (i1 != 0) {
            str1 = ((String)localObject5).concat(str1);
          }
          for (;;)
          {
            Log.wtf(str2, str1, localIllegalAccessException);
            break;
            str1 = new java/lang/String;
            str1.<init>((String)localObject5);
          }
        }
      }
    }
  }
  
  public static a c()
  {
    synchronized (g)
    {
      Object localObject2 = a;
      Object localObject3 = "[DEFAULT]";
      localObject2 = ((Map)localObject2).get(localObject3);
      localObject2 = (a)localObject2;
      if (localObject2 == null)
      {
        localObject2 = new java/lang/IllegalStateException;
        localObject3 = j.a();
        localObject3 = String.valueOf(localObject3);
        Object localObject4 = String.valueOf(localObject3);
        int i1 = ((String)localObject4).length() + 116;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i1);
        localObject4 = "Default FirebaseApp is not initialized in this process ";
        localObject4 = localStringBuilder.append((String)localObject4);
        localObject3 = ((StringBuilder)localObject4).append((String)localObject3);
        localObject4 = ". Make sure to call FirebaseApp.initializeApp(Context) first.";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject3 = ((StringBuilder)localObject3).toString();
        ((IllegalStateException)localObject2).<init>((String)localObject3);
        throw ((Throwable)localObject2);
      }
    }
    return locala;
  }
  
  public static void d()
  {
    synchronized (g)
    {
      Object localObject2 = new java/util/ArrayList;
      Object localObject4 = a;
      localObject4 = ((Map)localObject4).values();
      ((ArrayList)localObject2).<init>((Collection)localObject4);
      localObject4 = ((ArrayList)localObject2).iterator();
      boolean bool2;
      do
      {
        boolean bool1 = ((Iterator)localObject4).hasNext();
        if (!bool1) {
          break;
        }
        localObject2 = ((Iterator)localObject4).next();
        localObject2 = (a)localObject2;
        AtomicBoolean localAtomicBoolean = k;
        bool2 = localAtomicBoolean.get();
      } while (!bool2);
      ((a)localObject2).i();
    }
  }
  
  private String f()
  {
    g();
    return i;
  }
  
  private void g()
  {
    AtomicBoolean localAtomicBoolean = l;
    boolean bool = localAtomicBoolean.get();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      c.a(bool, "FirebaseApp was deleted");
      return;
      bool = false;
      localAtomicBoolean = null;
    }
  }
  
  private boolean h()
  {
    String str = f();
    return "[DEFAULT]".equals(str);
  }
  
  private void i()
  {
    String str = "Notifying background state change listeners.";
    Log.d("FirebaseApp", str);
    Iterator localIterator = n.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
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
    boolean bool = paramObject instanceof a;
    String str1;
    if (!bool)
    {
      bool = false;
      str1 = null;
    }
    for (;;)
    {
      return bool;
      str1 = i;
      paramObject = (a)paramObject;
      String str2 = ((a)paramObject).f();
      bool = str1.equals(str2);
    }
  }
  
  public int hashCode()
  {
    return i.hashCode();
  }
  
  public String toString()
  {
    b.a locala = com.google.android.gms.common.internal.b.a(this);
    Object localObject = i;
    locala = locala.a("name", localObject);
    localObject = j;
    return locala.a("options", localObject).toString();
  }
}


/* Location:              com/google/firebase/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */