package android.support.design.widget;

import android.view.animation.Interpolator;

final class q
{
  final e a;
  
  q(e parame)
  {
    a = parame;
  }
  
  public final void a(long paramLong)
  {
    a.a(paramLong);
  }
  
  public final void a(final a parama)
  {
    if (parama != null)
    {
      a.a(new q.e.a()
      {
        public final void a()
        {
          parama.b(q.this);
        }
      });
      return;
    }
    a.a(null);
  }
  
  public final void a(final c paramc)
  {
    if (paramc != null)
    {
      a.a(new q.e.b()
      {
        public final void a()
        {
          paramc.a(q.this);
        }
      });
      return;
    }
    a.a(null);
  }
  
  public final void a(Interpolator paramInterpolator)
  {
    a.a(paramInterpolator);
  }
  
  static abstract interface a
  {
    public abstract void b(q paramq);
  }
  
  static class b
    implements q.a
  {
    public void b(q paramq) {}
  }
  
  static abstract interface c
  {
    public abstract void a(q paramq);
  }
  
  static abstract interface d
  {
    public abstract q a();
  }
  
  static abstract class e
  {
    abstract void a();
    
    abstract void a(int paramInt1, int paramInt2);
    
    abstract void a(long paramLong);
    
    abstract void a(a parama);
    
    abstract void a(b paramb);
    
    abstract void a(Interpolator paramInterpolator);
    
    abstract boolean b();
    
    abstract int c();
    
    abstract void d();
    
    abstract void e();
    
    abstract float f();
    
    abstract void g();
    
    static abstract interface a
    {
      public abstract void a();
    }
    
    static abstract interface b
    {
      public abstract void a();
    }
  }
}


/* Location:              android/support/design/widget/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */