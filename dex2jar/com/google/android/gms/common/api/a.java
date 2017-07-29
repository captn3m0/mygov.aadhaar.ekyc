package com.google.android.gms.common.api;

import android.content.Context;
import android.content.Intent;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.o.f;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.z;
import java.io.PrintWriter;
import java.util.Set;

public final class a<O extends a>
{
  public final String a;
  private final b<?, O> b;
  private final i<?, O> c;
  private final g<?> d;
  private final j<?> e;
  
  public <C extends f> a(String paramString, b<C, O> paramb, g<C> paramg)
  {
    c.a(paramb, "Cannot construct an Api with a null ClientBuilder");
    c.a(paramg, "Cannot construct an Api with a null ClientKey");
    a = paramString;
    b = paramb;
    c = null;
    d = paramg;
    e = null;
  }
  
  public final b<?, O> a()
  {
    if (b != null) {}
    for (boolean bool = true;; bool = false)
    {
      c.a(bool, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
      return b;
    }
  }
  
  public final d<?> b()
  {
    if (d != null) {
      return d;
    }
    throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
  }
  
  public static abstract interface a
  {
    public static abstract interface a
      extends a.a
    {}
    
    public static abstract interface b
      extends a.a
    {}
    
    public static abstract interface c
      extends a.a.a, a.a.b
    {}
  }
  
  public static abstract class b<T extends a.f, O>
    extends a.e<T, O>
  {
    public abstract T a(Context paramContext, Looper paramLooper, p paramp, O paramO, c.b paramb, c.c paramc);
  }
  
  public static abstract interface c {}
  
  public static class d<C extends a.c> {}
  
  public static abstract class e<T extends a.c, O> {}
  
  public static abstract interface f
    extends a.c
  {
    public abstract void a();
    
    public abstract void a(o.f paramf);
    
    public abstract void a(z paramz, Set<Scope> paramSet);
    
    public abstract void a(String paramString, PrintWriter paramPrintWriter);
    
    public abstract boolean b();
    
    public abstract boolean c();
    
    public abstract boolean d();
    
    public abstract Intent e();
  }
  
  public static final class g<C extends a.f>
    extends a.d<C>
  {}
  
  public static abstract interface h<T extends IInterface>
    extends a.c
  {
    public abstract String a();
    
    public abstract String b();
    
    public abstract T c();
  }
  
  public static abstract class i<T extends a.h, O>
    extends a.e<T, O>
  {}
  
  public static final class j<C extends a.h>
    extends a.d<C>
  {}
}


/* Location:              com/google/android/gms/common/api/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */