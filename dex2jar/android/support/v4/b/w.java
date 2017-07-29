package android.support.v4.b;

import android.os.Bundle;
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
  final l<a> b;
  final l<a> c;
  final String d;
  boolean e;
  boolean f;
  m g;
  
  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    int j = 0;
    String str;
    int i;
    a locala;
    if (b.b() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Loaders:");
      str = paramString + "    ";
      i = 0;
      while (i < b.b())
      {
        locala = (a)b.d(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(b.c(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(locala.toString());
        locala.a(str, paramPrintWriter);
        i += 1;
      }
    }
    if (c.b() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Inactive Loaders:");
      str = paramString + "    ";
      i = j;
      while (i < c.b())
      {
        locala = (a)c.d(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(c.c(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(locala.toString());
        locala.a(str, paramPrintWriter);
        i += 1;
      }
    }
  }
  
  public final boolean a()
  {
    int j = b.b();
    int i = 0;
    boolean bool2 = false;
    if (i < j)
    {
      a locala = (a)b.d(i);
      if ((h) && (!f)) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        bool2 |= bool1;
        i += 1;
        break;
      }
    }
    return bool2;
  }
  
  final void b()
  {
    if (a) {
      Log.v("LoaderManager", "Starting in " + this);
    }
    Object localObject;
    if (e)
    {
      localObject = new RuntimeException("here");
      ((RuntimeException)localObject).fillInStackTrace();
      Log.w("LoaderManager", "Called doStart when already started: " + this, (Throwable)localObject);
      return;
    }
    e = true;
    int i = b.b() - 1;
    label89:
    if (i >= 0)
    {
      localObject = (a)b.d(i);
      if ((!i) || (!j)) {
        break label131;
      }
      h = true;
    }
    for (;;)
    {
      i -= 1;
      break label89;
      break;
      label131:
      if (!h)
      {
        h = true;
        if (a) {
          Log.v("LoaderManager", "  Starting: " + localObject);
        }
        if ((d == null) && (c != null)) {
          d = c.a();
        }
        if (d != null)
        {
          if ((d.getClass().isMemberClass()) && (!Modifier.isStatic(d.getClass().getModifiers()))) {
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + d);
          }
          if (!m)
          {
            c localc = d;
            int j = a;
            if (b != null) {
              throw new IllegalStateException("There is already a listener registered");
            }
            b = ((c.b)localObject);
            a = j;
            localc = d;
            if (c != null) {
              throw new IllegalStateException("There is already a listener registered");
            }
            c = ((c.a)localObject);
            m = true;
          }
          localObject = d;
          d = true;
          f = false;
          e = false;
        }
      }
    }
  }
  
  final void c()
  {
    if (a) {
      Log.v("LoaderManager", "Stopping in " + this);
    }
    if (!e)
    {
      RuntimeException localRuntimeException = new RuntimeException("here");
      localRuntimeException.fillInStackTrace();
      Log.w("LoaderManager", "Called doStop when not started: " + this, localRuntimeException);
      return;
    }
    int i = b.b() - 1;
    while (i >= 0)
    {
      ((a)b.d(i)).a();
      i -= 1;
    }
    e = false;
  }
  
  final void d()
  {
    if (a) {
      Log.v("LoaderManager", "Retaining in " + this);
    }
    Object localObject;
    if (!e)
    {
      localObject = new RuntimeException("here");
      ((RuntimeException)localObject).fillInStackTrace();
      Log.w("LoaderManager", "Called doRetain when not started: " + this, (Throwable)localObject);
    }
    for (;;)
    {
      return;
      f = true;
      e = false;
      int i = b.b() - 1;
      while (i >= 0)
      {
        localObject = (a)b.d(i);
        if (a) {
          Log.v("LoaderManager", "  Retaining: " + localObject);
        }
        i = true;
        j = h;
        h = false;
        c = null;
        i -= 1;
      }
    }
  }
  
  final void e()
  {
    int i = b.b() - 1;
    while (i >= 0)
    {
      b.d(i)).k = true;
      i -= 1;
    }
  }
  
  final void f()
  {
    int i = b.b() - 1;
    while (i >= 0)
    {
      a locala = (a)b.d(i);
      if ((h) && (k))
      {
        k = false;
        if ((e) && (!i)) {
          locala.a(d, g);
        }
      }
      i -= 1;
    }
  }
  
  final void g()
  {
    if (!f)
    {
      if (a) {
        Log.v("LoaderManager", "Destroying Active in " + this);
      }
      i = b.b() - 1;
      while (i >= 0)
      {
        ((a)b.d(i)).b();
        i -= 1;
      }
      b.c();
    }
    if (a) {
      Log.v("LoaderManager", "Destroying Inactive in " + this);
    }
    int i = c.b() - 1;
    while (i >= 0)
    {
      ((a)c.d(i)).b();
      i -= 1;
    }
    c.c();
    g = null;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    d.a(g, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
  
  final class a
    implements c.a<Object>, c.b<Object>
  {
    final int a;
    final Bundle b;
    v.a<Object> c;
    c<Object> d;
    boolean e;
    boolean f;
    Object g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    a n;
    
    final void a()
    {
      if (w.a) {
        Log.v("LoaderManager", "  Stopping: " + this);
      }
      h = false;
      if ((!i) && (d != null) && (m))
      {
        m = false;
        d.a(this);
        d.a(this);
        d.d = false;
      }
    }
    
    final void a(c<Object> paramc, Object paramObject)
    {
      String str;
      if (c != null)
      {
        if (o.g == null) {
          break label171;
        }
        str = o.g.f.u;
        o.g.f.u = "onLoadFinished";
      }
      for (;;)
      {
        try
        {
          if (w.a)
          {
            paramc = new StringBuilder("  onLoadFinished in ").append(paramc).append(": ");
            StringBuilder localStringBuilder = new StringBuilder(64);
            d.a(paramObject, localStringBuilder);
            localStringBuilder.append("}");
            Log.v("LoaderManager", localStringBuilder.toString());
          }
          if (o.g != null) {
            o.g.f.u = str;
          }
          f = true;
          return;
        }
        finally
        {
          if (o.g != null) {
            o.g.f.u = str;
          }
        }
        label171:
        str = null;
      }
    }
    
    public final void a(String paramString, PrintWriter paramPrintWriter)
    {
      String str1 = paramString;
      paramString = this;
      for (;;)
      {
        paramPrintWriter.print(str1);
        paramPrintWriter.print("mId=");
        paramPrintWriter.print(a);
        paramPrintWriter.print(" mArgs=");
        paramPrintWriter.println(b);
        paramPrintWriter.print(str1);
        paramPrintWriter.print("mCallbacks=");
        paramPrintWriter.println(c);
        paramPrintWriter.print(str1);
        paramPrintWriter.print("mLoader=");
        paramPrintWriter.println(d);
        if (d != null)
        {
          c localc = d;
          String str2 = str1 + "  ";
          paramPrintWriter.print(str2);
          paramPrintWriter.print("mId=");
          paramPrintWriter.print(a);
          paramPrintWriter.print(" mListener=");
          paramPrintWriter.println(b);
          if ((d) || (g) || (h))
          {
            paramPrintWriter.print(str2);
            paramPrintWriter.print("mStarted=");
            paramPrintWriter.print(d);
            paramPrintWriter.print(" mContentChanged=");
            paramPrintWriter.print(g);
            paramPrintWriter.print(" mProcessingChange=");
            paramPrintWriter.println(h);
          }
          if ((e) || (f))
          {
            paramPrintWriter.print(str2);
            paramPrintWriter.print("mAbandoned=");
            paramPrintWriter.print(e);
            paramPrintWriter.print(" mReset=");
            paramPrintWriter.println(f);
          }
        }
        if ((e) || (f))
        {
          paramPrintWriter.print(str1);
          paramPrintWriter.print("mHaveData=");
          paramPrintWriter.print(e);
          paramPrintWriter.print("  mDeliveredData=");
          paramPrintWriter.println(f);
          paramPrintWriter.print(str1);
          paramPrintWriter.print("mData=");
          paramPrintWriter.println(g);
        }
        paramPrintWriter.print(str1);
        paramPrintWriter.print("mStarted=");
        paramPrintWriter.print(h);
        paramPrintWriter.print(" mReportNextStart=");
        paramPrintWriter.print(k);
        paramPrintWriter.print(" mDestroyed=");
        paramPrintWriter.println(l);
        paramPrintWriter.print(str1);
        paramPrintWriter.print("mRetaining=");
        paramPrintWriter.print(i);
        paramPrintWriter.print(" mRetainingStarted=");
        paramPrintWriter.print(j);
        paramPrintWriter.print(" mListenerRegistered=");
        paramPrintWriter.println(m);
        if (n == null) {
          break;
        }
        paramPrintWriter.print(str1);
        paramPrintWriter.println("Pending Loader ");
        paramPrintWriter.print(n);
        paramPrintWriter.println(":");
        paramString = n;
        str1 = str1 + "  ";
      }
    }
    
    final void b()
    {
      a locala = this;
      if (w.a) {
        Log.v("LoaderManager", "  Destroying: " + locala);
      }
      l = true;
      boolean bool = f;
      f = false;
      Object localObject;
      if ((c != null) && (d != null) && (e) && (bool))
      {
        if (w.a) {
          Log.v("LoaderManager", "  Resetting: " + locala);
        }
        if (o.g == null) {
          break label257;
        }
        localObject = o.g.f.u;
        o.g.f.u = "onLoaderReset";
      }
      for (;;)
      {
        if (o.g != null) {
          o.g.f.u = ((String)localObject);
        }
        c = null;
        g = null;
        e = false;
        if (d != null)
        {
          if (m)
          {
            m = false;
            d.a(locala);
            d.a(locala);
          }
          localObject = d;
          f = true;
          d = false;
          e = false;
          g = false;
          h = false;
        }
        if (n != null)
        {
          locala = n;
          break;
        }
        return;
        label257:
        localObject = null;
      }
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(64);
      localStringBuilder.append("LoaderInfo{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" #");
      localStringBuilder.append(a);
      localStringBuilder.append(" : ");
      d.a(d, localStringBuilder);
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              android/support/v4/b/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */