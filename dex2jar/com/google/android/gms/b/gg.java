package com.google.android.gms.b;

public abstract interface gg
{
  public static final class a
    extends fv<a>
  {
    private static volatile a[] b;
    public String a = "";
    
    public a()
    {
      ag = null;
      ah = -1;
    }
    
    public static a[] b()
    {
      if (b == null) {}
      synchronized (fz.c)
      {
        if (b == null) {
          b = new a[0];
        }
        return b;
      }
    }
    
    protected final int a()
    {
      int j = super.a();
      int i = j;
      if (a != null)
      {
        i = j;
        if (!a.equals("")) {
          i = j + fu.b(1, a);
        }
      }
      return i;
    }
    
    public final void a(fu paramfu)
    {
      if ((a != null) && (!a.equals(""))) {
        paramfu.a(1, a);
      }
      super.a(paramfu);
    }
  }
  
  public static final class b
    extends fv<b>
  {
    public String a = "";
    public String b = "";
    public long c = 0L;
    public String d = "";
    public int e = 0;
    public int f = 0;
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public int l = 0;
    public gg.a[] m = gg.a.b();
    
    public b()
    {
      ag = null;
      ah = -1;
    }
    
    protected final int a()
    {
      int i1 = super.a();
      int n = i1;
      if (a != null)
      {
        n = i1;
        if (!a.equals("")) {
          n = i1 + fu.b(1, a);
        }
      }
      i1 = n;
      if (b != null)
      {
        i1 = n;
        if (!b.equals("")) {
          i1 = n + fu.b(2, b);
        }
      }
      n = i1;
      if (c != 0L) {
        n = i1 + fu.c(3, c);
      }
      i1 = n;
      if (d != null)
      {
        i1 = n;
        if (!d.equals("")) {
          i1 = n + fu.b(4, d);
        }
      }
      n = i1;
      if (e != 0) {
        n = i1 + fu.b(5, e);
      }
      i1 = n;
      if (f != 0) {
        i1 = n + fu.b(6, f);
      }
      n = i1;
      if (g != null)
      {
        n = i1;
        if (!g.equals("")) {
          n = i1 + fu.b(7, g);
        }
      }
      i1 = n;
      if (h != null)
      {
        i1 = n;
        if (!h.equals("")) {
          i1 = n + fu.b(8, h);
        }
      }
      n = i1;
      if (i != null)
      {
        n = i1;
        if (!i.equals("")) {
          n = i1 + fu.b(9, i);
        }
      }
      i1 = n;
      if (j != null)
      {
        i1 = n;
        if (!j.equals("")) {
          i1 = n + fu.b(10, j);
        }
      }
      int i2 = i1;
      if (k != null)
      {
        i2 = i1;
        if (!k.equals("")) {
          i2 = i1 + fu.b(11, k);
        }
      }
      n = i2;
      if (l != 0) {
        n = i2 + fu.b(12, l);
      }
      i1 = n;
      if (m != null)
      {
        i1 = n;
        if (m.length > 0)
        {
          i1 = 0;
          while (i1 < m.length)
          {
            gg.a locala = m[i1];
            i2 = n;
            if (locala != null) {
              i2 = n + fu.b(13, locala);
            }
            i1 += 1;
            n = i2;
          }
          i1 = n;
        }
      }
      return i1;
    }
    
    public final void a(fu paramfu)
    {
      if ((a != null) && (!a.equals(""))) {
        paramfu.a(1, a);
      }
      if ((b != null) && (!b.equals(""))) {
        paramfu.a(2, b);
      }
      if (c != 0L) {
        paramfu.b(3, c);
      }
      if ((d != null) && (!d.equals(""))) {
        paramfu.a(4, d);
      }
      if (e != 0) {
        paramfu.a(5, e);
      }
      if (f != 0) {
        paramfu.a(6, f);
      }
      if ((g != null) && (!g.equals(""))) {
        paramfu.a(7, g);
      }
      if ((h != null) && (!h.equals(""))) {
        paramfu.a(8, h);
      }
      if ((i != null) && (!i.equals(""))) {
        paramfu.a(9, i);
      }
      if ((j != null) && (!j.equals(""))) {
        paramfu.a(10, j);
      }
      if ((k != null) && (!k.equals(""))) {
        paramfu.a(11, k);
      }
      if (l != 0) {
        paramfu.a(12, l);
      }
      if ((m != null) && (m.length > 0))
      {
        int n = 0;
        while (n < m.length)
        {
          gg.a locala = m[n];
          if (locala != null) {
            paramfu.a(13, locala);
          }
          n += 1;
        }
      }
      super.a(paramfu);
    }
  }
}


/* Location:              com/google/android/gms/b/gg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */