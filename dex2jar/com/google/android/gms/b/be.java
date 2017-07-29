package com.google.android.gms.b;

public abstract interface be
{
  public static final class a
    extends fv<a>
  {
    public String a = null;
    public Long b = null;
    public String c = null;
    public String d = null;
    public String e = null;
    public Long f = null;
    public Long g = null;
    public String h = null;
    public Long i = null;
    public String j = null;
    
    public a()
    {
      ah = -1;
    }
    
    protected final int a()
    {
      int m = super.a();
      int k = m;
      if (a != null) {
        k = m + fu.b(1, a);
      }
      m = k;
      if (b != null) {
        m = k + fu.c(2, b.longValue());
      }
      k = m;
      if (c != null) {
        k = m + fu.b(3, c);
      }
      m = k;
      if (d != null) {
        m = k + fu.b(4, d);
      }
      k = m;
      if (e != null) {
        k = m + fu.b(5, e);
      }
      m = k;
      if (f != null) {
        m = k + fu.c(6, f.longValue());
      }
      k = m;
      if (g != null) {
        k = m + fu.c(7, g.longValue());
      }
      m = k;
      if (h != null) {
        m = k + fu.b(8, h);
      }
      k = m;
      if (i != null) {
        k = m + fu.c(9, i.longValue());
      }
      m = k;
      if (j != null) {
        m = k + fu.b(10, j);
      }
      return m;
    }
    
    public final void a(fu paramfu)
    {
      if (a != null) {
        paramfu.a(1, a);
      }
      if (b != null) {
        paramfu.b(2, b.longValue());
      }
      if (c != null) {
        paramfu.a(3, c);
      }
      if (d != null) {
        paramfu.a(4, d);
      }
      if (e != null) {
        paramfu.a(5, e);
      }
      if (f != null) {
        paramfu.b(6, f.longValue());
      }
      if (g != null) {
        paramfu.b(7, g.longValue());
      }
      if (h != null) {
        paramfu.a(8, h);
      }
      if (i != null) {
        paramfu.b(9, i.longValue());
      }
      if (j != null) {
        paramfu.a(10, j);
      }
      super.a(paramfu);
    }
  }
}


/* Location:              com/google/android/gms/b/be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */