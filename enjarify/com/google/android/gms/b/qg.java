package com.google.android.gms.b;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;

public final class qg
  implements qh
{
  private static final Object a;
  private static qh b = null;
  private final Object c;
  private final String d;
  private final un e;
  private final WeakHashMap f;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  private qg(String paramString, un paramun)
  {
    Object localObject1 = new java/lang/Object;
    localObject1.<init>();
    c = localObject1;
    localObject1 = new java/util/WeakHashMap;
    ((WeakHashMap)localObject1).<init>();
    f = ((WeakHashMap)localObject1);
    d = paramString;
    e = paramun;
    localObject1 = Looper.getMainLooper().getThread();
    if (localObject1 != null) {}
    synchronized (c)
    {
      Object localObject4 = f;
      boolean bool = true;
      Boolean localBoolean = Boolean.valueOf(bool);
      ((WeakHashMap)localObject4).put(localObject1, localBoolean);
      ??? = ((Thread)localObject1).getUncaughtExceptionHandler();
      localObject4 = new com/google/android/gms/b/qg$2;
      ((qg.2)localObject4).<init>(this, (Thread.UncaughtExceptionHandler)???);
      ((Thread)localObject1).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject4);
      localObject1 = Thread.getDefaultUncaughtExceptionHandler();
      ??? = new com/google/android/gms/b/qg$1;
      ((qg.1)???).<init>(this, (Thread.UncaughtExceptionHandler)localObject1);
      Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)???);
      return;
    }
  }
  
  public static qh a(Context paramContext, un paramun)
  {
    for (;;)
    {
      synchronized (a)
      {
        Object localObject2 = b;
        Object localObject4;
        if (localObject2 == null)
        {
          localObject2 = ke.g;
          localObject4 = w.q();
          localObject2 = ((kd)localObject4).a((jz)localObject2);
          localObject2 = (Boolean)localObject2;
          boolean bool = ((Boolean)localObject2).booleanValue();
          if (bool) {
            localObject2 = "unknown";
          }
        }
        else
        {
          try
          {
            localObject4 = paramContext.getApplicationContext();
            localObject2 = ((Context)localObject4).getPackageName();
          }
          finally
          {
            String str = "Cannot obtain package name, proceeding.";
            tp.e(str);
            continue;
          }
          localObject4 = new com/google/android/gms/b/qg;
          ((qg)localObject4).<init>((String)localObject2, paramun);
          b = (qh)localObject4;
          return b;
        }
      }
      qh.a locala = new com/google/android/gms/b/qh$a;
      locala.<init>();
      b = locala;
    }
  }
  
  private static boolean a(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool)
    {
      bool = false;
      localObject1 = null;
    }
    String str;
    for (;;)
    {
      return bool;
      localObject1 = ke.i;
      Object localObject2 = w.q();
      localObject1 = (String)((kd)localObject2).a((jz)localObject1);
      bool = paramString.startsWith((String)localObject1);
      if (bool) {
        bool = true;
      } else {
        try
        {
          localObject1 = Class.forName(paramString);
          localObject2 = qi.class;
          bool = ((Class)localObject1).isAnnotationPresent((Class)localObject2);
        }
        catch (Exception localException)
        {
          str = "Fail to check class type for class ";
          localObject1 = String.valueOf(paramString);
          int i = ((String)localObject1).length();
          if (i == 0) {
            break label104;
          }
        }
      }
    }
    Object localObject1 = str.concat((String)localObject1);
    for (;;)
    {
      tp.a((String)localObject1, localException);
      bool = false;
      localObject1 = null;
      break;
      label104:
      localObject1 = new java/lang/String;
      ((String)localObject1).<init>(str);
    }
  }
  
  protected final void a(Throwable paramThrowable)
  {
    int i = 1;
    String str1;
    if (paramThrowable != null)
    {
      int j = 0;
      int k = 0;
      str1 = null;
      Throwable localThrowable;
      for (Object localObject1 = paramThrowable; localObject1 != null; localObject1 = localThrowable)
      {
        StackTraceElement[] arrayOfStackTraceElement = ((Throwable)localObject1).getStackTrace();
        int m = arrayOfStackTraceElement.length;
        int n = 0;
        localThrowable = null;
        while (n < m)
        {
          Object localObject2 = arrayOfStackTraceElement[n];
          String str2 = ((StackTraceElement)localObject2).getClassName();
          boolean bool1 = a(str2);
          if (bool1) {
            k = i;
          }
          str2 = getClass().getName();
          localObject2 = ((StackTraceElement)localObject2).getClassName();
          boolean bool2 = str2.equals(localObject2);
          if (bool2) {
            j = i;
          }
          n += 1;
        }
        localThrowable = ((Throwable)localObject1).getCause();
      }
      if ((k == 0) || (j != 0)) {}
    }
    for (;;)
    {
      if (i != 0)
      {
        str1 = "";
        a(paramThrowable, str1);
      }
      return;
      i = 0;
    }
  }
  
  public final void a(Throwable paramThrowable, String paramString)
  {
    Object localObject1 = ke.h;
    Object localObject2 = w.q();
    localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
    boolean bool1 = ((Boolean)localObject1).booleanValue();
    Object localObject3;
    if (bool1) {
      localObject3 = paramThrowable;
    }
    Object localObject4;
    label72:
    Object localObject5;
    Object localObject6;
    for (;;)
    {
      if (localObject3 == null)
      {
        return;
        localObject4 = new java/util/LinkedList;
        ((LinkedList)localObject4).<init>();
        for (localObject1 = paramThrowable; localObject1 != null; localObject1 = ((Throwable)localObject1).getCause()) {
          ((LinkedList)localObject4).push(localObject1);
        }
        localObject3 = null;
        bool1 = ((LinkedList)localObject4).isEmpty();
        if (!bool1)
        {
          localObject1 = (Throwable)((LinkedList)localObject4).pop();
          StackTraceElement[] arrayOfStackTraceElement = ((Throwable)localObject1).getStackTrace();
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          localObject2 = new java/lang/StackTraceElement;
          localObject5 = localObject1.getClass().getName();
          String str1 = "<filtered>";
          int i = 1;
          ((StackTraceElement)localObject2).<init>((String)localObject5, "<filtered>", str1, i);
          localArrayList.add(localObject2);
          boolean bool2 = false;
          localObject5 = null;
          int k = arrayOfStackTraceElement.length;
          int m = 0;
          localObject6 = null;
          int n = 0;
          localObject2 = null;
          if (m < k)
          {
            Object localObject7 = arrayOfStackTraceElement[m];
            localObject5 = ((StackTraceElement)localObject7).getClassName();
            bool2 = a((String)localObject5);
            if (bool2)
            {
              n = 1;
              localArrayList.add(localObject7);
            }
            for (;;)
            {
              int j = m + 1;
              m = j;
              break;
              localObject5 = ((StackTraceElement)localObject7).getClassName();
              boolean bool4 = TextUtils.isEmpty((CharSequence)localObject5);
              boolean bool3;
              if (!bool4)
              {
                str2 = "android.";
                bool4 = ((String)localObject5).startsWith(str2);
                if (!bool4)
                {
                  str2 = "java.";
                  bool3 = ((String)localObject5).startsWith(str2);
                  if (!bool3) {}
                }
                else
                {
                  bool3 = true;
                }
              }
              for (;;)
              {
                if (!bool3) {
                  break label314;
                }
                localArrayList.add(localObject7);
                break;
                bool3 = false;
                localObject5 = null;
              }
              label314:
              localObject5 = new java/lang/StackTraceElement;
              localObject7 = "<filtered>";
              String str2 = "<filtered>";
              String str3 = "<filtered>";
              int i1 = 1;
              ((StackTraceElement)localObject5).<init>((String)localObject7, str2, str3, i1);
              localArrayList.add(localObject5);
            }
          }
          if (n == 0) {
            break label750;
          }
          if (localObject3 == null)
          {
            localObject2 = new java/lang/Throwable;
            localObject1 = ((Throwable)localObject1).getMessage();
            ((Throwable)localObject2).<init>((String)localObject1);
            label384:
            bool1 = false;
            localObject1 = new StackTraceElement[0];
            localObject1 = (StackTraceElement[])localArrayList.toArray((Object[])localObject1);
            ((Throwable)localObject2).setStackTrace((StackTraceElement[])localObject1);
          }
        }
      }
    }
    for (;;)
    {
      localObject3 = localObject2;
      break label72;
      localObject2 = new java/lang/Throwable;
      localObject1 = ((Throwable)localObject1).getMessage();
      ((Throwable)localObject2).<init>((String)localObject1, (Throwable)localObject3);
      break label384;
      localObject1 = paramThrowable.getClass();
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      localObject5 = new java/io/StringWriter;
      ((StringWriter)localObject5).<init>();
      localObject6 = new java/io/PrintWriter;
      ((PrintWriter)localObject6).<init>((Writer)localObject5);
      ((Throwable)localObject3).printStackTrace((PrintWriter)localObject6);
      localObject3 = new android/net/Uri$Builder;
      ((Uri.Builder)localObject3).<init>();
      localObject3 = ((Uri.Builder)localObject3).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception");
      localObject4 = Build.VERSION.RELEASE;
      localObject3 = ((Uri.Builder)localObject3).appendQueryParameter("os", (String)localObject4);
      int i2 = Build.VERSION.SDK_INT;
      localObject4 = String.valueOf(i2);
      localObject3 = ((Uri.Builder)localObject3).appendQueryParameter("api", (String)localObject4);
      w.e();
      localObject4 = tt.c();
      localObject3 = ((Uri.Builder)localObject3).appendQueryParameter("device", (String)localObject4);
      localObject4 = e.a;
      localObject3 = ((Uri.Builder)localObject3).appendQueryParameter("js", (String)localObject4);
      localObject4 = d;
      localObject3 = ((Uri.Builder)localObject3).appendQueryParameter("appid", (String)localObject4);
      localObject1 = ((Class)localObject1).getName();
      localObject1 = ((Uri.Builder)localObject3).appendQueryParameter("exceptiontype", (String)localObject1);
      localObject5 = ((StringWriter)localObject5).toString();
      localObject1 = ((Uri.Builder)localObject1).appendQueryParameter("stacktrace", (String)localObject5);
      localObject6 = ke.a();
      localObject5 = TextUtils.join(",", (Iterable)localObject6);
      localObject1 = ((Uri.Builder)localObject1).appendQueryParameter("eids", (String)localObject5).appendQueryParameter("exceptionkey", paramString).appendQueryParameter("cl", "155828604").appendQueryParameter("rc", "dev");
      localObject3 = "session_id";
      localObject5 = ib;
      localObject1 = ((Uri.Builder)localObject1).appendQueryParameter((String)localObject3, (String)localObject5).toString();
      ((ArrayList)localObject2).add(localObject1);
      w.e();
      localObject1 = w.i().h();
      tt.a((List)localObject2, (String)localObject1);
      break;
      label750:
      localObject2 = localObject3;
    }
  }
}


/* Location:              com/google/android/gms/b/qg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */