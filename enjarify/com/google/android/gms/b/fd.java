package com.google.android.gms.b;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class fd
{
  public static final Uri a;
  public static final Uri b;
  public static final Pattern c;
  public static final Pattern d;
  static HashMap e;
  static String[] f = new String[0];
  private static final AtomicBoolean g;
  private static Object h;
  private static boolean i;
  
  static
  {
    int j = 2;
    a = Uri.parse("content://com.google.android.gsf.gservices");
    b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    c = Pattern.compile("^(1|true|t|on|yes|y)$", j);
    d = Pattern.compile("^(0|false|f|off|no|n)$", j);
    AtomicBoolean localAtomicBoolean = new java/util/concurrent/atomic/AtomicBoolean;
    localAtomicBoolean.<init>();
    g = localAtomicBoolean;
  }
  
  public static String a(ContentResolver paramContentResolver, String paramString)
  {
    int j = 1;
    boolean bool1 = false;
    Object localObject1 = null;
    for (;;)
    {
      Object localObject3;
      int k;
      synchronized (fd.class)
      {
        a(paramContentResolver);
        localObject3 = h;
        Object localObject4 = e;
        k = ((HashMap)localObject4).containsKey(paramString);
        if (k != 0)
        {
          localObject4 = e;
          localObject4 = ((HashMap)localObject4).get(paramString);
          localObject4 = (String)localObject4;
          if (localObject4 != null) {
            localObject1 = localObject4;
          }
          return (String)localObject1;
        }
        arrayOfString = f;
        int i2 = arrayOfString.length;
        k = 0;
        localObject4 = null;
        if (k >= i2) {
          break label233;
        }
        String str = arrayOfString[k];
        boolean bool2 = paramString.startsWith(str);
        if (!bool2) {
          break label224;
        }
        k = i;
        if (k != 0)
        {
          localObject4 = e;
          k = ((HashMap)localObject4).isEmpty();
          if (k == 0) {}
        }
        else
        {
          localObject4 = f;
          c(paramContentResolver, (String[])localObject4);
          localObject4 = e;
          k = ((HashMap)localObject4).containsKey(paramString);
          if (k != 0)
          {
            localObject4 = e;
            localObject4 = ((HashMap)localObject4).get(paramString);
            localObject4 = (String)localObject4;
            if (localObject4 != null) {
              localObject1 = localObject4;
            }
          }
        }
      }
      continue;
      label224:
      int m;
      k += 1;
      continue;
      label233:
      ??? = a;
      String[] arrayOfString = new String[j];
      arrayOfString[0] = paramString;
      Object localObject6 = paramContentResolver;
      bool1 = false;
      int i3 = 0;
      ??? = paramContentResolver.query((Uri)???, null, null, arrayOfString, null);
      if (??? != null) {}
      try
      {
        int n = ((Cursor)???).moveToFirst();
        if (n == 0)
        {
          n = 0;
          localObject6 = null;
          a(localObject3, paramString, null);
          if (??? == null) {
            continue;
          }
          ((Cursor)???).close();
          continue;
        }
        n = 1;
        localObject6 = ((Cursor)???).getString(n);
        if (localObject6 != null)
        {
          bool1 = false;
          bool1 = ((String)localObject6).equals(null);
          if (bool1)
          {
            int i1 = 0;
            localObject6 = null;
          }
        }
        a(localObject3, paramString, (String)localObject6);
        if (localObject6 != null) {
          localObject1 = localObject6;
        }
        if (??? == null) {
          continue;
        }
        ((Cursor)???).close();
      }
      finally
      {
        if (??? != null) {
          ((Cursor)???).close();
        }
      }
    }
  }
  
  private static void a(ContentResolver paramContentResolver)
  {
    boolean bool1 = false;
    Object localObject = e;
    if (localObject == null)
    {
      g.set(false);
      localObject = new java/util/HashMap;
      ((HashMap)localObject).<init>();
      e = (HashMap)localObject;
      localObject = new java/lang/Object;
      localObject.<init>();
      h = localObject;
      i = false;
      localObject = a;
      bool1 = true;
      fd.1 local1 = new com/google/android/gms/b/fd$1;
      local1.<init>();
      paramContentResolver.registerContentObserver((Uri)localObject, bool1, local1);
    }
    for (;;)
    {
      return;
      localObject = g;
      boolean bool2 = ((AtomicBoolean)localObject).getAndSet(false);
      if (bool2)
      {
        e.clear();
        localObject = new java/lang/Object;
        localObject.<init>();
        h = localObject;
        i = false;
      }
    }
  }
  
  public static void a(ContentResolver paramContentResolver, String... paramVarArgs)
  {
    int j = 0;
    Object localObject1 = null;
    synchronized (fd.class)
    {
      a(paramContentResolver);
      Object localObject3 = f;
      int m = (localObject3.length + 1) * 4;
      m = m / 3 + 1;
      HashSet localHashSet = new java/util/HashSet;
      localHashSet.<init>(m);
      localObject3 = f;
      localObject3 = Arrays.asList((Object[])localObject3);
      localHashSet.addAll((Collection)localObject3);
      localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>();
      while (j <= 0)
      {
        String str = null;
        str = paramVarArgs[0];
        boolean bool3 = localHashSet.add(str);
        if (bool3) {
          ((ArrayList)localObject3).add(str);
        }
        j += 1;
      }
      boolean bool1 = ((ArrayList)localObject3).isEmpty();
      if (bool1)
      {
        bool1 = false;
        localObject1 = null;
        localObject1 = new String[0];
        boolean bool2 = i;
        if (bool2)
        {
          localObject3 = e;
          bool2 = ((HashMap)localObject3).isEmpty();
          if (!bool2) {
            break label232;
          }
        }
        localObject1 = f;
        c(paramContentResolver, (String[])localObject1);
      }
      label232:
      int n;
      do
      {
        return;
        int k = localHashSet.size();
        localObject1 = new String[k];
        localObject1 = localHashSet.toArray((Object[])localObject1);
        localObject1 = (String[])localObject1;
        f = (String[])localObject1;
        k = ((ArrayList)localObject3).size();
        localObject1 = new String[k];
        localObject1 = ((ArrayList)localObject3).toArray((Object[])localObject1);
        localObject1 = (String[])localObject1;
        break;
        n = localObject1.length;
      } while (n == 0);
      c(paramContentResolver, (String[])localObject1);
    }
  }
  
  private static void a(Object paramObject, String paramString1, String paramString2)
  {
    synchronized (fd.class)
    {
      Object localObject1 = h;
      if (paramObject == localObject1)
      {
        localObject1 = e;
        ((HashMap)localObject1).put(paramString1, paramString2);
      }
      return;
    }
  }
  
  public static long b(ContentResolver paramContentResolver, String paramString)
  {
    long l = 0L;
    String str = a(paramContentResolver, paramString);
    if (str != null) {}
    try
    {
      l = Long.parseLong(str);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;) {}
    }
    return l;
  }
  
  private static Map b(ContentResolver paramContentResolver, String... paramVarArgs)
  {
    boolean bool = false;
    String str1 = null;
    Object localObject1 = b;
    Object localObject2 = paramContentResolver;
    int j = 0;
    String str2 = null;
    localObject1 = paramContentResolver.query((Uri)localObject1, null, null, paramVarArgs, null);
    localObject2 = new java/util/TreeMap;
    ((TreeMap)localObject2).<init>();
    if (localObject1 == null) {}
    for (;;)
    {
      return (Map)localObject2;
      try
      {
        for (;;)
        {
          bool = ((Cursor)localObject1).moveToNext();
          if (!bool) {
            break;
          }
          bool = false;
          str1 = null;
          str1 = ((Cursor)localObject1).getString(0);
          j = 1;
          str2 = ((Cursor)localObject1).getString(j);
          ((TreeMap)localObject2).put(str1, str2);
        }
      }
      finally
      {
        ((Cursor)localObject1).close();
      }
    }
  }
  
  private static void c(ContentResolver paramContentResolver, String[] paramArrayOfString)
  {
    HashMap localHashMap = e;
    Map localMap = b(paramContentResolver, paramArrayOfString);
    localHashMap.putAll(localMap);
    i = true;
  }
}


/* Location:              com/google/android/gms/b/fd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */