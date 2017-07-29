package android.support.v4.b;

import android.support.v4.c.c;
import android.support.v4.c.c.a;
import android.support.v4.c.c.b;
import android.support.v4.g.d;
import android.support.v4.g.l;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class w
  extends v
{
  static boolean a = false;
  final l b;
  final l c;
  final String d;
  boolean e;
  boolean f;
  m g;
  
  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    int i = 0;
    Object localObject = b;
    int j = ((l)localObject).b();
    String str1;
    String str2;
    if (j > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Loaders:");
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString).append("    ");
      str1 = ((StringBuilder)localObject).toString();
      int k = 0;
      str2 = null;
      for (;;)
      {
        localObject = b;
        j = ((l)localObject).b();
        if (k >= j) {
          break;
        }
        localObject = (w.a)b.d(k);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        int m = b.c(k);
        paramPrintWriter.print(m);
        paramPrintWriter.print(": ");
        String str3 = ((w.a)localObject).toString();
        paramPrintWriter.println(str3);
        ((w.a)localObject).a(str1, paramPrintWriter);
        j = k + 1;
        k = j;
      }
    }
    localObject = c;
    j = ((l)localObject).b();
    if (j > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Inactive Loaders:");
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramString).append("    ");
      str2 = ((StringBuilder)localObject).toString();
      for (;;)
      {
        localObject = c;
        j = ((l)localObject).b();
        if (i >= j) {
          break;
        }
        localObject = (w.a)c.d(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        int n = c.c(i);
        paramPrintWriter.print(n);
        paramPrintWriter.print(": ");
        str1 = ((w.a)localObject).toString();
        paramPrintWriter.println(str1);
        ((w.a)localObject).a(str2, paramPrintWriter);
        i += 1;
      }
    }
  }
  
  public final boolean a()
  {
    Object localObject = b;
    int i = ((l)localObject).b();
    int j = 0;
    boolean bool1 = false;
    if (j < i)
    {
      localObject = (w.a)b.d(j);
      boolean bool2 = h;
      boolean bool3;
      if (bool2)
      {
        bool3 = f;
        if (!bool3) {
          bool3 = true;
        }
      }
      for (;;)
      {
        bool1 |= bool3;
        int k = j + 1;
        j = k;
        break;
        k = 0;
        localObject = null;
      }
    }
    return bool1;
  }
  
  final void b()
  {
    boolean bool1 = true;
    boolean bool2 = a;
    Object localObject2;
    Object localObject3;
    if (bool2)
    {
      localObject1 = "LoaderManager";
      localObject2 = new java/lang/StringBuilder;
      localObject3 = "Starting in ";
      ((StringBuilder)localObject2).<init>((String)localObject3);
      localObject2 = this;
      Log.v((String)localObject1, (String)localObject2);
    }
    bool2 = e;
    Object localObject4;
    if (bool2)
    {
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>("here");
      ((RuntimeException)localObject1).fillInStackTrace();
      localObject2 = "LoaderManager";
      localObject3 = new java/lang/StringBuilder;
      localObject4 = "Called doStart when already started: ";
      ((StringBuilder)localObject3).<init>((String)localObject4);
      localObject3 = this;
      Log.w((String)localObject2, (String)localObject3, (Throwable)localObject1);
      return;
    }
    e = bool1;
    Object localObject1 = b;
    int i = ((l)localObject1).b() + -1;
    int j = i;
    label132:
    boolean bool3;
    if (j >= 0)
    {
      localObject1 = (w.a)b.d(j);
      bool3 = i;
      if (!bool3) {
        break label188;
      }
      bool3 = j;
      if (!bool3) {
        break label188;
      }
      h = bool1;
    }
    for (;;)
    {
      i = j + -1;
      j = i;
      break label132;
      break;
      label188:
      bool3 = h;
      if (!bool3)
      {
        h = bool1;
        bool3 = a;
        Object localObject5;
        if (bool3)
        {
          localObject3 = "LoaderManager";
          localObject4 = new java/lang/StringBuilder;
          localObject5 = "  Starting: ";
          ((StringBuilder)localObject4).<init>((String)localObject5);
          localObject4 = localObject1;
          Log.v((String)localObject3, (String)localObject4);
        }
        localObject3 = d;
        if (localObject3 == null)
        {
          localObject3 = c;
          if (localObject3 != null)
          {
            localObject3 = c.a();
            d = ((c)localObject3);
          }
        }
        localObject3 = d;
        if (localObject3 != null)
        {
          localObject3 = d.getClass();
          bool3 = ((Class)localObject3).isMemberClass();
          if (bool3)
          {
            localObject3 = d.getClass();
            bool3 = Modifier.isStatic(((Class)localObject3).getModifiers());
            if (!bool3)
            {
              localObject2 = new java/lang/IllegalArgumentException;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>("Object returned from onCreateLoader must not be a non-static inner member class: ");
              localObject1 = d;
              localObject1 = localObject1;
              ((IllegalArgumentException)localObject2).<init>((String)localObject1);
              throw ((Throwable)localObject2);
            }
          }
          bool3 = m;
          if (!bool3)
          {
            localObject3 = d;
            int k = a;
            localObject5 = b;
            if (localObject5 != null)
            {
              localObject1 = new java/lang/IllegalStateException;
              ((IllegalStateException)localObject1).<init>("There is already a listener registered");
              throw ((Throwable)localObject1);
            }
            b = ((c.b)localObject1);
            a = k;
            localObject3 = d;
            localObject4 = c;
            if (localObject4 != null)
            {
              localObject1 = new java/lang/IllegalStateException;
              ((IllegalStateException)localObject1).<init>("There is already a listener registered");
              throw ((Throwable)localObject1);
            }
            c = ((c.a)localObject1);
            m = bool1;
          }
          localObject1 = d;
          d = bool1;
          f = false;
          e = false;
        }
      }
    }
  }
  
  final void c()
  {
    boolean bool = a;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (bool)
    {
      localObject1 = "LoaderManager";
      localObject2 = new java/lang/StringBuilder;
      localObject3 = "Stopping in ";
      ((StringBuilder)localObject2).<init>((String)localObject3);
      localObject2 = this;
      Log.v((String)localObject1, (String)localObject2);
    }
    bool = e;
    if (!bool)
    {
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>("here");
      ((RuntimeException)localObject1).fillInStackTrace();
      localObject2 = "LoaderManager";
      localObject3 = new java/lang/StringBuilder;
      String str = "Called doStop when not started: ";
      ((StringBuilder)localObject3).<init>(str);
      localObject3 = this;
      Log.w((String)localObject2, (String)localObject3, (Throwable)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = b;
      int i = ((l)localObject1).b() + -1;
      for (int j = i; j >= 0; j = i)
      {
        localObject1 = (w.a)b.d(j);
        ((w.a)localObject1).a();
        i = j + -1;
      }
      i = 0;
      localObject1 = null;
      e = false;
    }
  }
  
  final void d()
  {
    boolean bool1 = true;
    boolean bool2 = a;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (bool2)
    {
      localObject1 = "LoaderManager";
      localObject2 = new java/lang/StringBuilder;
      localObject3 = "Retaining in ";
      ((StringBuilder)localObject2).<init>((String)localObject3);
      localObject2 = this;
      Log.v((String)localObject1, (String)localObject2);
    }
    bool2 = e;
    Object localObject4;
    if (!bool2)
    {
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>("here");
      ((RuntimeException)localObject1).fillInStackTrace();
      localObject2 = "LoaderManager";
      localObject3 = new java/lang/StringBuilder;
      localObject4 = "Called doRetain when not started: ";
      ((StringBuilder)localObject3).<init>((String)localObject4);
      localObject3 = this;
      Log.w((String)localObject2, (String)localObject3, (Throwable)localObject1);
    }
    for (;;)
    {
      return;
      f = bool1;
      e = false;
      localObject1 = b;
      int i = ((l)localObject1).b() + -1;
      for (int j = i; j >= 0; j = i)
      {
        localObject1 = (w.a)b.d(j);
        boolean bool3 = a;
        if (bool3)
        {
          localObject3 = "LoaderManager";
          localObject4 = new java/lang/StringBuilder;
          String str = "  Retaining: ";
          ((StringBuilder)localObject4).<init>(str);
          localObject4 = localObject1;
          Log.v((String)localObject3, (String)localObject4);
        }
        i = bool1;
        bool3 = h;
        j = bool3;
        h = false;
        bool3 = false;
        localObject3 = null;
        c = null;
        i = j + -1;
      }
    }
  }
  
  final void e()
  {
    Object localObject = b;
    int i = ((l)localObject).b() + -1;
    for (int j = i; j >= 0; j = i)
    {
      localObject = (w.a)b.d(j);
      boolean bool = true;
      k = bool;
      i = j + -1;
    }
  }
  
  final void f()
  {
    Object localObject1 = b;
    int i = ((l)localObject1).b() + -1;
    for (int j = i; j >= 0; j = i)
    {
      localObject1 = (w.a)b.d(j);
      boolean bool = h;
      if (bool)
      {
        bool = k;
        if (bool)
        {
          c localc = null;
          k = false;
          bool = e;
          if (bool)
          {
            bool = i;
            if (!bool)
            {
              localc = d;
              Object localObject2 = g;
              ((w.a)localObject1).a(localc, localObject2);
            }
          }
        }
      }
      i = j + -1;
    }
  }
  
  final void g()
  {
    boolean bool1 = f;
    Object localObject2;
    String str;
    if (!bool1)
    {
      bool1 = a;
      if (bool1)
      {
        localObject1 = "LoaderManager";
        localObject2 = new java/lang/StringBuilder;
        str = "Destroying Active in ";
        ((StringBuilder)localObject2).<init>(str);
        localObject2 = this;
        Log.v((String)localObject1, (String)localObject2);
      }
      localObject1 = b;
      int i = ((l)localObject1).b() + -1;
      for (k = i; k >= 0; k = i)
      {
        localObject1 = (w.a)b.d(k);
        ((w.a)localObject1).b();
        i = k + -1;
      }
      localObject1 = b;
      ((l)localObject1).c();
    }
    boolean bool2 = a;
    if (bool2)
    {
      localObject1 = "LoaderManager";
      localObject2 = new java/lang/StringBuilder;
      str = "Destroying Inactive in ";
      ((StringBuilder)localObject2).<init>(str);
      localObject2 = this;
      Log.v((String)localObject1, (String)localObject2);
    }
    Object localObject1 = c;
    int j = ((l)localObject1).b() + -1;
    for (int k = j; k >= 0; k = j)
    {
      localObject1 = (w.a)c.d(k);
      ((w.a)localObject1).b();
      j = k + -1;
    }
    c.c();
    g = null;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    localStringBuilder.append("LoaderManager{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder.append(str);
    localStringBuilder.append(" in ");
    d.a(g, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:              android/support/v4/b/w.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */