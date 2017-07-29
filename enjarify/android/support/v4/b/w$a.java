package android.support.v4.b;

import android.os.Bundle;
import android.support.v4.c.c;
import android.support.v4.c.c.a;
import android.support.v4.c.c.b;
import android.support.v4.g.d;
import android.util.Log;
import java.io.PrintWriter;

final class w$a
  implements c.a, c.b
{
  final int a;
  final Bundle b;
  v.a c;
  c d;
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
    boolean bool = w.a;
    Object localObject1;
    if (bool)
    {
      localObject1 = "LoaderManager";
      Object localObject2 = new java/lang/StringBuilder;
      String str = "  Stopping: ";
      ((StringBuilder)localObject2).<init>(str);
      localObject2 = this;
      Log.v((String)localObject1, (String)localObject2);
    }
    h = false;
    bool = i;
    if (!bool)
    {
      localObject1 = d;
      if (localObject1 != null)
      {
        bool = m;
        if (bool)
        {
          m = false;
          d.a(this);
          d.a(this);
          localObject1 = d;
          d = false;
        }
      }
    }
  }
  
  final void a(c paramc, Object paramObject)
  {
    Object localObject1 = c;
    boolean bool;
    Object localObject4;
    if (localObject1 != null)
    {
      bool = false;
      localObject1 = null;
      localObject3 = o.g;
      if (localObject3 == null) {
        break label257;
      }
      localObject1 = o.g.f.u;
      localObject3 = o.g.f;
      localObject4 = "onLoadFinished";
      u = ((String)localObject4);
    }
    label257:
    for (Object localObject3 = localObject1;; localObject3 = null) {
      try
      {
        bool = w.a;
        if (bool)
        {
          localObject1 = "LoaderManager";
          localObject4 = new java/lang/StringBuilder;
          Object localObject5 = "  onLoadFinished in ";
          ((StringBuilder)localObject4).<init>((String)localObject5);
          localObject4 = ((StringBuilder)localObject4).append(paramc);
          localObject5 = ": ";
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject5 = new java/lang/StringBuilder;
          int i1 = 64;
          ((StringBuilder)localObject5).<init>(i1);
          d.a(paramObject, (StringBuilder)localObject5);
          String str = "}";
          ((StringBuilder)localObject5).append(str);
          localObject5 = ((StringBuilder)localObject5).toString();
          localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
          localObject4 = ((StringBuilder)localObject4).toString();
          Log.v((String)localObject1, (String)localObject4);
        }
        localObject1 = o.g;
        if (localObject1 != null)
        {
          localObject1 = o.g.f;
          u = ((String)localObject3);
        }
        bool = true;
        f = bool;
        return;
      }
      finally
      {
        localObject4 = o.g;
        if (localObject4 != null)
        {
          localObject4 = o.g.f;
          u = ((String)localObject3);
        }
      }
    }
  }
  
  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    for (;;)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mId=");
      int i1 = a;
      paramPrintWriter.print(i1);
      paramPrintWriter.print(" mArgs=");
      Object localObject1 = b;
      paramPrintWriter.println(localObject1);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCallbacks=");
      localObject1 = c;
      paramPrintWriter.println(localObject1);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mLoader=");
      localObject1 = d;
      paramPrintWriter.println(localObject1);
      localObject1 = d;
      if (localObject1 != null)
      {
        localObject1 = d;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = paramString + "  ";
        paramPrintWriter.print((String)localObject2);
        paramPrintWriter.print("mId=");
        int i2 = a;
        paramPrintWriter.print(i2);
        paramPrintWriter.print(" mListener=");
        Object localObject3 = b;
        paramPrintWriter.println(localObject3);
        boolean bool2 = d;
        if (!bool2)
        {
          bool2 = g;
          if (!bool2)
          {
            bool2 = h;
            if (!bool2) {
              break label275;
            }
          }
        }
        paramPrintWriter.print((String)localObject2);
        paramPrintWriter.print("mStarted=");
        bool2 = d;
        paramPrintWriter.print(bool2);
        paramPrintWriter.print(" mContentChanged=");
        bool2 = g;
        paramPrintWriter.print(bool2);
        localObject3 = " mProcessingChange=";
        paramPrintWriter.print((String)localObject3);
        bool2 = h;
        paramPrintWriter.println(bool2);
        label275:
        bool2 = e;
        if (!bool2)
        {
          bool2 = f;
          if (!bool2) {}
        }
        else
        {
          paramPrintWriter.print((String)localObject2);
          paramPrintWriter.print("mAbandoned=");
          boolean bool3 = e;
          paramPrintWriter.print(bool3);
          localObject2 = " mReset=";
          paramPrintWriter.print((String)localObject2);
          bool1 = f;
          paramPrintWriter.println(bool1);
        }
      }
      boolean bool1 = e;
      if (!bool1)
      {
        bool1 = f;
        if (!bool1) {}
      }
      else
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mHaveData=");
        bool1 = e;
        paramPrintWriter.print(bool1);
        paramPrintWriter.print("  mDeliveredData=");
        bool1 = f;
        paramPrintWriter.println(bool1);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mData=");
        localObject1 = g;
        paramPrintWriter.println(localObject1);
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      bool1 = h;
      paramPrintWriter.print(bool1);
      paramPrintWriter.print(" mReportNextStart=");
      bool1 = k;
      paramPrintWriter.print(bool1);
      paramPrintWriter.print(" mDestroyed=");
      bool1 = l;
      paramPrintWriter.println(bool1);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mRetaining=");
      bool1 = i;
      paramPrintWriter.print(bool1);
      paramPrintWriter.print(" mRetainingStarted=");
      bool1 = j;
      paramPrintWriter.print(bool1);
      paramPrintWriter.print(" mListenerRegistered=");
      bool1 = m;
      paramPrintWriter.println(bool1);
      localObject1 = n;
      if (localObject1 == null) {
        break;
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Pending Loader ");
      localObject1 = n;
      paramPrintWriter.print(localObject1);
      paramPrintWriter.println(":");
      this = n;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(paramString);
      Object localObject2 = "  ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      paramString = ((StringBuilder)localObject1).toString();
    }
  }
  
  final void b()
  {
    boolean bool1 = true;
    boolean bool2 = w.a;
    Object localObject1;
    String str;
    if (bool2)
    {
      localObject1 = "LoaderManager";
      localObject2 = new java/lang/StringBuilder;
      str = "  Destroying: ";
      ((StringBuilder)localObject2).<init>(str);
      localObject2 = this;
      Log.v((String)localObject1, (String)localObject2);
    }
    l = bool1;
    bool2 = f;
    f = false;
    Object localObject2 = c;
    if (localObject2 != null)
    {
      localObject2 = d;
      if (localObject2 != null)
      {
        boolean bool3 = e;
        if ((bool3) && (bool2))
        {
          bool2 = w.a;
          if (bool2)
          {
            localObject1 = "LoaderManager";
            localObject2 = new java/lang/StringBuilder;
            str = "  Resetting: ";
            ((StringBuilder)localObject2).<init>(str);
            localObject2 = this;
            Log.v((String)localObject1, (String)localObject2);
          }
          localObject1 = o.g;
          if (localObject1 == null) {
            break label329;
          }
          localObject1 = o.g.f.u;
          localObject2 = o.g.f;
          str = "onLoaderReset";
          u = str;
        }
      }
    }
    for (;;)
    {
      localObject2 = o.g;
      if (localObject2 != null)
      {
        localObject2 = o.g.f;
        u = ((String)localObject1);
      }
      c = null;
      g = null;
      e = false;
      localObject1 = d;
      if (localObject1 != null)
      {
        bool2 = m;
        if (bool2)
        {
          m = false;
          d.a(this);
          localObject1 = d;
          ((c)localObject1).a(this);
        }
        localObject1 = d;
        f = bool1;
        d = false;
        e = false;
        g = false;
        h = false;
      }
      localObject1 = n;
      if (localObject1 != null)
      {
        this = n;
        break;
      }
      return;
      label329:
      bool2 = false;
      localObject1 = null;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(64);
    localStringBuilder.append("LoaderInfo{");
    String str = Integer.toHexString(System.identityHashCode(this));
    localStringBuilder.append(str);
    localStringBuilder.append(" #");
    int i1 = a;
    localStringBuilder.append(i1);
    localStringBuilder.append(" : ");
    d.a(d, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:              android/support/v4/b/w$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */