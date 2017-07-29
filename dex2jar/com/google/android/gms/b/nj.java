package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.internal.c;
import java.util.Map;

@qi
public final class nj
{
  final Object a = new Object();
  final Context b;
  final String c;
  final un d;
  ty<ng> e;
  d f;
  int g = 1;
  private ty<ng> h;
  
  public nj(Context paramContext, un paramun, String paramString)
  {
    c = paramString;
    b = paramContext.getApplicationContext();
    d = paramun;
    e = new b();
    h = new b();
  }
  
  public nj(Context paramContext, un paramun, String paramString, ty<ng> paramty1, ty<ng> paramty2)
  {
    this(paramContext, paramun, paramString);
    e = paramty1;
    h = paramty2;
  }
  
  protected final d a(final dw paramdw)
  {
    final d locald = new d(h);
    w.e();
    tt.a(new Runnable()
    {
      public final void run()
      {
        final ni localni = new ni(b, d, paramdw, null);
        localni.a(new ng.a()
        {
          public final void a()
          {
            tt.a.postDelayed(new Runnable()
            {
              public final void run()
              {
                synchronized (a)
                {
                  if ((b.b() == -1) || (b.b() == 1)) {
                    return;
                  }
                  b.a();
                  w.e();
                  tt.a(new Runnable()
                  {
                    public final void run()
                    {
                      a.a();
                    }
                  });
                  tp.a("Could not receive loaded message in a timely manner. Rejecting.");
                  return;
                }
              }
            }, nj.a.b);
          }
        });
        localni.a("/jsLoaded", new md()
        {
          public final void a(vc arg1, Map<String, String> paramAnonymous2Map)
          {
            synchronized (a)
            {
              if ((b.b() == -1) || (b.b() == 1)) {
                return;
              }
              g = 0;
              e.a(localni);
              b.a(localni);
              f = b;
              tp.a("Successfully loaded JS Engine.");
              return;
            }
          }
        });
        final ug localug = new ug();
        md local3 = new md()
        {
          public final void a(vc arg1, Map<String, String> paramAnonymous2Map)
          {
            synchronized (a)
            {
              tp.d("JS Engine is requesting an update");
              if (g == 0)
              {
                tp.d("Starting reload.");
                g = 2;
                a(a);
              }
              localni.b("/requestReload", (md)localuga);
              return;
            }
          }
        };
        a = local3;
        localni.a("/requestReload", local3);
        if (c.endsWith(".js")) {
          localni.a(c);
        }
        for (;;)
        {
          tt.a.postDelayed(new Runnable()
          {
            public final void run()
            {
              synchronized (a)
              {
                if ((b.b() == -1) || (b.b() == 1)) {
                  return;
                }
                b.a();
                w.e();
                tt.a(new Runnable()
                {
                  public final void run()
                  {
                    a.a();
                  }
                });
                tp.a("Could not receive loaded message in a timely manner. Rejecting.");
                return;
              }
            }
          }, nj.a.a);
          return;
          if (c.startsWith("<html>")) {
            localni.c(c);
          } else {
            localni.b(c);
          }
        }
      }
    });
    locald.a(new uv.c()new uv.a {}, new uv.a()
    {
      public final void a()
      {
        synchronized (a)
        {
          g = 1;
          tp.a("Failed loading new engine. Marking new engine destroyable.");
          locald.c();
          return;
        }
      }
    });
    return locald;
  }
  
  public final c b(dw paramdw)
  {
    synchronized (a)
    {
      if ((f == null) || (f.b() == -1))
      {
        g = 2;
        f = a(paramdw);
        paramdw = f.h_();
        return paramdw;
      }
      if (g == 0)
      {
        paramdw = f.h_();
        return paramdw;
      }
    }
    if (g == 1)
    {
      g = 2;
      a(paramdw);
      paramdw = f.h_();
      return paramdw;
    }
    if (g == 2)
    {
      paramdw = f.h_();
      return paramdw;
    }
    paramdw = f.h_();
    return paramdw;
  }
  
  static final class a
  {
    static int a = 60000;
    static int b = 10000;
  }
  
  public static final class b<T>
    implements ty<T>
  {
    public final void a(T paramT) {}
  }
  
  public static final class c
    extends uw<nk>
  {
    final nj.d a;
    private final Object e = new Object();
    private boolean f;
    
    public c(nj.d paramd)
    {
      a = paramd;
    }
    
    public final void g_()
    {
      synchronized (e)
      {
        if (f) {
          return;
        }
        f = true;
        a(new uv.c()new uv.b {}, new uv.b());
        a(new uv.c()new uv.a {}, new uv.a()
        {
          public final void a()
          {
            a.i_();
          }
        });
        return;
      }
    }
  }
  
  public static final class d
    extends uw<ng>
  {
    ty<ng> a;
    private final Object e = new Object();
    private boolean f;
    private int g;
    
    public d(ty<ng> paramty)
    {
      a = paramty;
      f = false;
      g = 0;
    }
    
    private void d()
    {
      for (;;)
      {
        synchronized (e)
        {
          if (g >= 0)
          {
            bool = true;
            c.a(bool);
            if ((f) && (g == 0))
            {
              tp.a("No reference is left (including root). Cleaning up engine.");
              a(new uv.c()new uv.b {}, new uv.b());
              return;
            }
            tp.a("There are still references to the engine. Not destroying.");
          }
        }
        boolean bool = false;
      }
    }
    
    public final void c()
    {
      for (boolean bool = true;; bool = false) {
        synchronized (e)
        {
          if (g >= 0)
          {
            c.a(bool);
            tp.a("Releasing root reference. JS Engine will be destroyed once other references are released.");
            f = true;
            d();
            return;
          }
        }
      }
    }
    
    public final nj.c h_()
    {
      nj.c localc = new nj.c(this);
      for (;;)
      {
        synchronized (e)
        {
          a(new uv.c()new uv.a {}, new uv.a()
          {
            public final void a()
            {
              tp.a("Rejecting reference for JS Engine.");
              nj.d.this.a();
            }
          });
          if (g >= 0)
          {
            bool = true;
            c.a(bool);
            g += 1;
            return localc;
          }
        }
        boolean bool = false;
      }
    }
    
    protected final void i_()
    {
      for (;;)
      {
        synchronized (e)
        {
          if (g > 0)
          {
            bool = true;
            c.a(bool);
            tp.a("Releasing 1 reference for JS Engine");
            g -= 1;
            d();
            return;
          }
        }
        boolean bool = false;
      }
    }
  }
  
  public static final class e
    extends uw<nk>
  {
    private nj.c a;
    
    public e(nj.c paramc)
    {
      a = paramc;
    }
    
    public final void a()
    {
      a.a();
    }
    
    public final void a(uv.c<nk> paramc, uv.a parama)
    {
      a.a(paramc, parama);
    }
    
    public final int b()
    {
      return a.b();
    }
    
    public final void finalize()
    {
      a.g_();
      a = null;
    }
  }
}


/* Location:              com/google/android/gms/b/nj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */