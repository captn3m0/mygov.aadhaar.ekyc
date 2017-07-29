package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.w;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Callable;

@qi
public final class ua
{
  static qd a;
  public static final a<Void> b = new a() {};
  private static final Object c = new Object();
  
  public ua(Context paramContext)
  {
    a(paramContext);
  }
  
  private static qd a(Context paramContext)
  {
    synchronized (c)
    {
      if (a == null) {
        a = aw.a(paramContext.getApplicationContext());
      }
      paramContext = a;
      return paramContext;
    }
  }
  
  public static us<String> a(String paramString, final Map<String, String> paramMap)
  {
    final c localc = new c((byte)0);
    paramString = new au(paramString, localc, new re.a()
    {
      public final void a(vr paramAnonymousvr)
      {
        String str = ua.this;
        paramAnonymousvr = String.valueOf(paramAnonymousvr.toString());
        tp.e(String.valueOf(str).length() + 21 + String.valueOf(paramAnonymousvr).length() + "Failed to load URL: " + str + "\n" + paramAnonymousvr);
        localc.a(null);
      }
    })
    {
      public final Map<String, String> a()
      {
        if (paramMap == null) {
          return super.a();
        }
        return paramMap;
      }
      
      public final byte[] c()
      {
        if (k == null) {
          return super.c();
        }
        return k;
      }
    };
    a.a(paramString);
    return localc;
  }
  
  public static abstract interface a<T>
  {
    public abstract T a();
    
    public abstract T a(InputStream paramInputStream);
  }
  
  private static final class b<T>
    extends pc<InputStream>
  {
    private final ua.a<T> k;
    private final re.b<T> l;
    
    public b(String paramString, final ua.a<T> parama, re.b<T> paramb)
    {
      super(new re.a()
      {
        public final void a(vr paramAnonymousvr)
        {
          a(parama.a());
        }
      });
      k = parama;
      l = paramb;
    }
    
    protected final re<InputStream> a(na paramna)
    {
      return re.a(new ByteArrayInputStream(b), vx.a(paramna));
    }
  }
  
  private final class c<T>
    extends up<T>
    implements re.b<T>
  {
    public final void a(T paramT)
    {
      super.b(paramT);
    }
  }
}


/* Location:              com/google/android/gms/b/ua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */