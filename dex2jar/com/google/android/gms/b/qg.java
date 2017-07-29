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

@qi
public final class qg
  implements qh
{
  private static final Object a = new Object();
  private static qh b = null;
  private final Object c = new Object();
  private final String d;
  private final un e;
  private final WeakHashMap<Thread, Boolean> f = new WeakHashMap();
  
  private qg(String arg1, un paramun)
  {
    d = ???;
    e = paramun;
    paramun = Looper.getMainLooper().getThread();
    if (paramun != null) {}
    synchronized (c)
    {
      f.put(paramun, Boolean.valueOf(true));
      paramun.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler()
      {
        public final void uncaughtException(Thread paramAnonymousThread, Throwable paramAnonymousThrowable)
        {
          try
          {
            a(paramAnonymousThrowable);
            return;
          }
          catch (Throwable localThrowable)
          {
            tp.c("AdMob exception reporter failed reporting the exception.");
            return;
          }
          finally
          {
            if (a != null) {
              a.uncaughtException(paramAnonymousThread, paramAnonymousThrowable);
            }
          }
        }
      });
      Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler()
      {
        public final void uncaughtException(Thread paramAnonymousThread, Throwable paramAnonymousThrowable)
        {
          try
          {
            a(paramAnonymousThrowable);
            return;
          }
          catch (Throwable localThrowable)
          {
            tp.c("AdMob exception reporter failed reporting the exception.");
            return;
          }
          finally
          {
            if (a != null) {
              a.uncaughtException(paramAnonymousThread, paramAnonymousThrowable);
            }
          }
        }
      });
      return;
    }
  }
  
  public static qh a(Context paramContext, un paramun)
  {
    for (;;)
    {
      synchronized (a)
      {
        Object localObject1;
        if (b == null)
        {
          localObject1 = ke.g;
          if (((Boolean)w.q().a((jz)localObject1)).booleanValue()) {
            localObject1 = "unknown";
          }
        }
        else
        {
          try
          {
            paramContext = paramContext.getApplicationContext().getPackageName();
            b = new qg(paramContext, paramun);
            return b;
          }
          catch (Throwable paramContext)
          {
            tp.e("Cannot obtain package name, proceeding.");
            paramContext = (Context)localObject1;
            continue;
          }
        }
      }
      b = new qh.a();
    }
  }
  
  private static boolean a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    jz localjz = ke.i;
    if (paramString.startsWith((String)w.q().a(localjz))) {
      return true;
    }
    try
    {
      boolean bool = Class.forName(paramString).isAnnotationPresent(qi.class);
      return bool;
    }
    catch (Exception localException)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() == 0) {}
    }
    for (paramString = "Fail to check class type for class ".concat(paramString);; paramString = new String("Fail to check class type for class "))
    {
      tp.a(paramString, localException);
      return false;
    }
  }
  
  protected final void a(Throwable paramThrowable)
  {
    int m = 1;
    if (paramThrowable != null)
    {
      int j = 0;
      int k = 0;
      for (Throwable localThrowable = paramThrowable; localThrowable != null; localThrowable = localThrowable.getCause())
      {
        StackTraceElement[] arrayOfStackTraceElement = localThrowable.getStackTrace();
        int n = arrayOfStackTraceElement.length;
        i = 0;
        while (i < n)
        {
          StackTraceElement localStackTraceElement = arrayOfStackTraceElement[i];
          if (a(localStackTraceElement.getClassName())) {
            k = 1;
          }
          if (getClass().getName().equals(localStackTraceElement.getClassName())) {
            j = 1;
          }
          i += 1;
        }
      }
      if ((k == 0) || (j != 0)) {}
    }
    for (int i = m;; i = 0)
    {
      if (i != 0) {
        a(paramThrowable, "");
      }
      return;
    }
  }
  
  public final void a(Throwable paramThrowable, String paramString)
  {
    Object localObject1 = ke.h;
    Object localObject2;
    if (((Boolean)w.q().a((jz)localObject1)).booleanValue()) {
      localObject2 = paramThrowable;
    }
    Object localObject3;
    Throwable localThrowable;
    for (;;)
    {
      if (localObject2 == null)
      {
        return;
        localObject3 = new LinkedList();
        for (localObject1 = paramThrowable; localObject1 != null; localObject1 = ((Throwable)localObject1).getCause()) {
          ((LinkedList)localObject3).push(localObject1);
        }
        localObject1 = null;
        localObject2 = localObject1;
        if (!((LinkedList)localObject3).isEmpty())
        {
          localThrowable = (Throwable)((LinkedList)localObject3).pop();
          StackTraceElement[] arrayOfStackTraceElement = localThrowable.getStackTrace();
          localObject2 = new ArrayList();
          ((ArrayList)localObject2).add(new StackTraceElement(localThrowable.getClass().getName(), "<filtered>", "<filtered>", 1));
          int m = arrayOfStackTraceElement.length;
          int i = 0;
          int j = 0;
          if (i < m)
          {
            StackTraceElement localStackTraceElement = arrayOfStackTraceElement[i];
            if (a(localStackTraceElement.getClassName()))
            {
              j = 1;
              ((ArrayList)localObject2).add(localStackTraceElement);
            }
            for (;;)
            {
              i += 1;
              break;
              String str = localStackTraceElement.getClassName();
              if ((!TextUtils.isEmpty(str)) && ((str.startsWith("android.")) || (str.startsWith("java.")))) {}
              for (int k = 1;; k = 0)
              {
                if (k == 0) {
                  break label243;
                }
                ((ArrayList)localObject2).add(localStackTraceElement);
                break;
              }
              label243:
              ((ArrayList)localObject2).add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
            }
          }
          if (j == 0) {
            break label553;
          }
          if (localObject1 == null)
          {
            localObject1 = new Throwable(localThrowable.getMessage());
            label290:
            ((Throwable)localObject1).setStackTrace((StackTraceElement[])((ArrayList)localObject2).toArray(new StackTraceElement[0]));
          }
        }
      }
    }
    label553:
    for (;;)
    {
      break;
      localObject1 = new Throwable(localThrowable.getMessage(), (Throwable)localObject1);
      break label290;
      paramThrowable = paramThrowable.getClass();
      localObject1 = new ArrayList();
      localObject3 = new StringWriter();
      ((Throwable)localObject2).printStackTrace(new PrintWriter((Writer)localObject3));
      localObject2 = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
      w.e();
      ((ArrayList)localObject1).add(((Uri.Builder)localObject2).appendQueryParameter("device", tt.c()).appendQueryParameter("js", e.a).appendQueryParameter("appid", d).appendQueryParameter("exceptiontype", paramThrowable.getName()).appendQueryParameter("stacktrace", ((StringWriter)localObject3).toString()).appendQueryParameter("eids", TextUtils.join(",", ke.a())).appendQueryParameter("exceptionkey", paramString).appendQueryParameter("cl", "155828604").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", ib).toString());
      w.e();
      tt.a((List)localObject1, w.i().h());
      return;
    }
  }
}


/* Location:              com/google/android/gms/b/qg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */