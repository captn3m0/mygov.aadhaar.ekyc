package com.google.android.gms.b;

public abstract interface du
{
  public static final class a
    extends fv<a>
  {
    private static volatile a[] e;
    public Integer a = null;
    public du.f b = null;
    public du.f c = null;
    public Boolean d = null;
    
    public a()
    {
      ag = null;
      ah = -1;
    }
    
    public static a[] b()
    {
      if (e == null) {}
      synchronized (fz.c)
      {
        if (e == null) {
          e = new a[0];
        }
        return e;
      }
    }
    
    protected final int a()
    {
      int j = super.a();
      int i = j;
      if (a != null) {
        i = j + fu.b(1, a.intValue());
      }
      j = i;
      if (b != null) {
        j = i + fu.b(2, b);
      }
      i = j;
      if (c != null) {
        i = j + fu.b(3, c);
      }
      j = i;
      if (d != null)
      {
        d.booleanValue();
        j = i + (fu.b(4) + 1);
      }
      return j;
    }
    
    public final void a(fu paramfu)
    {
      if (a != null) {
        paramfu.a(1, a.intValue());
      }
      if (b != null) {
        paramfu.a(2, b);
      }
      if (c != null) {
        paramfu.a(3, c);
      }
      if (d != null) {
        paramfu.a(4, d.booleanValue());
      }
      super.a(paramfu);
    }
    
    public final boolean equals(Object paramObject)
    {
      if (paramObject == this) {}
      do
      {
        return true;
        if (!(paramObject instanceof a)) {
          return false;
        }
        paramObject = (a)paramObject;
        if (a == null)
        {
          if (a != null) {
            return false;
          }
        }
        else if (!a.equals(a)) {
          return false;
        }
        if (b == null)
        {
          if (b != null) {
            return false;
          }
        }
        else if (!b.equals(b)) {
          return false;
        }
        if (c == null)
        {
          if (c != null) {
            return false;
          }
        }
        else if (!c.equals(c)) {
          return false;
        }
        if (d == null)
        {
          if (d != null) {
            return false;
          }
        }
        else if (!d.equals(d)) {
          return false;
        }
        if ((ag != null) && (!ag.a())) {
          break;
        }
      } while ((ag == null) || (ag.a()));
      return false;
      return ag.equals(ag);
    }
    
    public final int hashCode()
    {
      int i1 = 0;
      int i2 = getClass().getName().hashCode();
      int i;
      int j;
      label33:
      int k;
      label42:
      int m;
      if (a == null)
      {
        i = 0;
        if (b != null) {
          break label122;
        }
        j = 0;
        if (c != null) {
          break label133;
        }
        k = 0;
        if (d != null) {
          break label144;
        }
        m = 0;
        label52:
        n = i1;
        if (ag != null) {
          if (!ag.a()) {
            break label156;
          }
        }
      }
      label122:
      label133:
      label144:
      label156:
      for (int n = i1;; n = ag.hashCode())
      {
        return (m + (k + (j + (i + (i2 + 527) * 31) * 31) * 31) * 31) * 31 + n;
        i = a.hashCode();
        break;
        j = b.hashCode();
        break label33;
        k = c.hashCode();
        break label42;
        m = d.hashCode();
        break label52;
      }
    }
  }
  
  public static final class b
    extends fv<b>
  {
    private static volatile b[] f;
    public du.c[] a = du.c.b();
    public String b = null;
    public Long c = null;
    public Long d = null;
    public Integer e = null;
    
    public b()
    {
      ag = null;
      ah = -1;
    }
    
    public static b[] b()
    {
      if (f == null) {}
      synchronized (fz.c)
      {
        if (f == null) {
          f = new b[0];
        }
        return f;
      }
    }
    
    protected final int a()
    {
      int i = super.a();
      int j = i;
      if (a != null)
      {
        j = i;
        if (a.length > 0)
        {
          int k = 0;
          for (;;)
          {
            j = i;
            if (k >= a.length) {
              break;
            }
            du.c localc = a[k];
            j = i;
            if (localc != null) {
              j = i + fu.b(1, localc);
            }
            k += 1;
            i = j;
          }
        }
      }
      i = j;
      if (b != null) {
        i = j + fu.b(2, b);
      }
      j = i;
      if (c != null) {
        j = i + fu.c(3, c.longValue());
      }
      i = j;
      if (d != null) {
        i = j + fu.c(4, d.longValue());
      }
      j = i;
      if (e != null) {
        j = i + fu.b(5, e.intValue());
      }
      return j;
    }
    
    public final void a(fu paramfu)
    {
      if ((a != null) && (a.length > 0))
      {
        int i = 0;
        while (i < a.length)
        {
          du.c localc = a[i];
          if (localc != null) {
            paramfu.a(1, localc);
          }
          i += 1;
        }
      }
      if (b != null) {
        paramfu.a(2, b);
      }
      if (c != null) {
        paramfu.b(3, c.longValue());
      }
      if (d != null) {
        paramfu.b(4, d.longValue());
      }
      if (e != null) {
        paramfu.a(5, e.intValue());
      }
      super.a(paramfu);
    }
    
    public final boolean equals(Object paramObject)
    {
      if (paramObject == this) {}
      do
      {
        return true;
        if (!(paramObject instanceof b)) {
          return false;
        }
        paramObject = (b)paramObject;
        if (!fz.a(a, a)) {
          return false;
        }
        if (b == null)
        {
          if (b != null) {
            return false;
          }
        }
        else if (!b.equals(b)) {
          return false;
        }
        if (c == null)
        {
          if (c != null) {
            return false;
          }
        }
        else if (!c.equals(c)) {
          return false;
        }
        if (d == null)
        {
          if (d != null) {
            return false;
          }
        }
        else if (!d.equals(d)) {
          return false;
        }
        if (e == null)
        {
          if (e != null) {
            return false;
          }
        }
        else if (!e.equals(e)) {
          return false;
        }
        if ((ag != null) && (!ag.a())) {
          break;
        }
      } while ((ag == null) || (ag.a()));
      return false;
      return ag.equals(ag);
    }
    
    public final int hashCode()
    {
      int i1 = 0;
      int i2 = getClass().getName().hashCode();
      int i3 = fz.a(a);
      int i;
      int j;
      label42:
      int k;
      label51:
      int m;
      if (b == null)
      {
        i = 0;
        if (c != null) {
          break label137;
        }
        j = 0;
        if (d != null) {
          break label148;
        }
        k = 0;
        if (e != null) {
          break label159;
        }
        m = 0;
        label61:
        n = i1;
        if (ag != null) {
          if (!ag.a()) {
            break label171;
          }
        }
      }
      label137:
      label148:
      label159:
      label171:
      for (int n = i1;; n = ag.hashCode())
      {
        return (m + (k + (j + (i + ((i2 + 527) * 31 + i3) * 31) * 31) * 31) * 31) * 31 + n;
        i = b.hashCode();
        break;
        j = c.hashCode();
        break label42;
        k = d.hashCode();
        break label51;
        m = e.hashCode();
        break label61;
      }
    }
  }
  
  public static final class c
    extends fv<c>
  {
    private static volatile c[] f;
    public String a = null;
    public String b = null;
    public Long c = null;
    public Float d = null;
    public Double e = null;
    
    public c()
    {
      ag = null;
      ah = -1;
    }
    
    public static c[] b()
    {
      if (f == null) {}
      synchronized (fz.c)
      {
        if (f == null) {
          f = new c[0];
        }
        return f;
      }
    }
    
    protected final int a()
    {
      int j = super.a();
      int i = j;
      if (a != null) {
        i = j + fu.b(1, a);
      }
      j = i;
      if (b != null) {
        j = i + fu.b(2, b);
      }
      i = j;
      if (c != null) {
        i = j + fu.c(3, c.longValue());
      }
      j = i;
      if (d != null)
      {
        d.floatValue();
        j = i + (fu.b(4) + 4);
      }
      i = j;
      if (e != null)
      {
        e.doubleValue();
        i = j + (fu.b(5) + 8);
      }
      return i;
    }
    
    public final void a(fu paramfu)
    {
      if (a != null) {
        paramfu.a(1, a);
      }
      if (b != null) {
        paramfu.a(2, b);
      }
      if (c != null) {
        paramfu.b(3, c.longValue());
      }
      if (d != null) {
        paramfu.a(4, d.floatValue());
      }
      if (e != null) {
        paramfu.a(5, e.doubleValue());
      }
      super.a(paramfu);
    }
    
    public final boolean equals(Object paramObject)
    {
      if (paramObject == this) {}
      do
      {
        return true;
        if (!(paramObject instanceof c)) {
          return false;
        }
        paramObject = (c)paramObject;
        if (a == null)
        {
          if (a != null) {
            return false;
          }
        }
        else if (!a.equals(a)) {
          return false;
        }
        if (b == null)
        {
          if (b != null) {
            return false;
          }
        }
        else if (!b.equals(b)) {
          return false;
        }
        if (c == null)
        {
          if (c != null) {
            return false;
          }
        }
        else if (!c.equals(c)) {
          return false;
        }
        if (d == null)
        {
          if (d != null) {
            return false;
          }
        }
        else if (!d.equals(d)) {
          return false;
        }
        if (e == null)
        {
          if (e != null) {
            return false;
          }
        }
        else if (!e.equals(e)) {
          return false;
        }
        if ((ag != null) && (!ag.a())) {
          break;
        }
      } while ((ag == null) || (ag.a()));
      return false;
      return ag.equals(ag);
    }
    
    public final int hashCode()
    {
      int i2 = 0;
      int i3 = getClass().getName().hashCode();
      int i;
      int j;
      label33:
      int k;
      label42:
      int m;
      label52:
      int n;
      if (a == null)
      {
        i = 0;
        if (b != null) {
          break label138;
        }
        j = 0;
        if (c != null) {
          break label149;
        }
        k = 0;
        if (d != null) {
          break label160;
        }
        m = 0;
        if (e != null) {
          break label172;
        }
        n = 0;
        label62:
        i1 = i2;
        if (ag != null) {
          if (!ag.a()) {
            break label184;
          }
        }
      }
      label138:
      label149:
      label160:
      label172:
      label184:
      for (int i1 = i2;; i1 = ag.hashCode())
      {
        return (n + (m + (k + (j + (i + (i3 + 527) * 31) * 31) * 31) * 31) * 31) * 31 + i1;
        i = a.hashCode();
        break;
        j = b.hashCode();
        break label33;
        k = c.hashCode();
        break label42;
        m = d.hashCode();
        break label52;
        n = e.hashCode();
        break label62;
      }
    }
  }
  
  public static final class d
    extends fv<d>
  {
    public du.e[] a = du.e.b();
    
    public d()
    {
      ag = null;
      ah = -1;
    }
    
    protected final int a()
    {
      int i = super.a();
      int k = i;
      if (a != null)
      {
        k = i;
        if (a.length > 0)
        {
          int j = 0;
          for (;;)
          {
            k = i;
            if (j >= a.length) {
              break;
            }
            du.e locale = a[j];
            k = i;
            if (locale != null) {
              k = i + fu.b(1, locale);
            }
            j += 1;
            i = k;
          }
        }
      }
      return k;
    }
    
    public final void a(fu paramfu)
    {
      if ((a != null) && (a.length > 0))
      {
        int i = 0;
        while (i < a.length)
        {
          du.e locale = a[i];
          if (locale != null) {
            paramfu.a(1, locale);
          }
          i += 1;
        }
      }
      super.a(paramfu);
    }
    
    public final boolean equals(Object paramObject)
    {
      if (paramObject == this) {}
      do
      {
        return true;
        if (!(paramObject instanceof d)) {
          return false;
        }
        paramObject = (d)paramObject;
        if (!fz.a(a, a)) {
          return false;
        }
        if ((ag != null) && (!ag.a())) {
          break;
        }
      } while ((ag == null) || (ag.a()));
      return false;
      return ag.equals(ag);
    }
    
    public final int hashCode()
    {
      int j = getClass().getName().hashCode();
      int k = fz.a(a);
      if ((ag == null) || (ag.a())) {}
      for (int i = 0;; i = ag.hashCode()) {
        return i + ((j + 527) * 31 + k) * 31;
      }
    }
  }
  
  public static final class e
    extends fv<e>
  {
    private static volatile e[] I;
    public du.a[] A = du.a.b();
    public String B = null;
    public Integer C = null;
    public Integer D = null;
    public Integer E = null;
    public String F = null;
    public Long G = null;
    public Long H = null;
    public Integer a = null;
    public du.b[] b = du.b.b();
    public du.g[] c = du.g.b();
    public Long d = null;
    public Long e = null;
    public Long f = null;
    public Long g = null;
    public Long h = null;
    public String i = null;
    public String j = null;
    public String k = null;
    public String l = null;
    public Integer m = null;
    public String n = null;
    public String o = null;
    public String p = null;
    public Long q = null;
    public Long r = null;
    public String s = null;
    public Boolean t = null;
    public String u = null;
    public Long v = null;
    public Integer w = null;
    public String x = null;
    public String y = null;
    public Boolean z = null;
    
    public e()
    {
      ag = null;
      ah = -1;
    }
    
    public static e[] b()
    {
      if (I == null) {}
      synchronized (fz.c)
      {
        if (I == null) {
          I = new e[0];
        }
        return I;
      }
    }
    
    protected final int a()
    {
      int i4 = 0;
      int i2 = super.a();
      int i1 = i2;
      if (a != null) {
        i1 = i2 + fu.b(1, a.intValue());
      }
      i2 = i1;
      Object localObject;
      if (b != null)
      {
        i2 = i1;
        if (b.length > 0)
        {
          i2 = 0;
          while (i2 < b.length)
          {
            localObject = b[i2];
            i3 = i1;
            if (localObject != null) {
              i3 = i1 + fu.b(2, (gb)localObject);
            }
            i2 += 1;
            i1 = i3;
          }
          i2 = i1;
        }
      }
      i1 = i2;
      if (c != null)
      {
        i1 = i2;
        if (c.length > 0)
        {
          i1 = i2;
          i2 = 0;
          while (i2 < c.length)
          {
            localObject = c[i2];
            i3 = i1;
            if (localObject != null) {
              i3 = i1 + fu.b(3, (gb)localObject);
            }
            i2 += 1;
            i1 = i3;
          }
        }
      }
      i2 = i1;
      if (d != null) {
        i2 = i1 + fu.c(4, d.longValue());
      }
      i1 = i2;
      if (e != null) {
        i1 = i2 + fu.c(5, e.longValue());
      }
      i2 = i1;
      if (f != null) {
        i2 = i1 + fu.c(6, f.longValue());
      }
      i1 = i2;
      if (h != null) {
        i1 = i2 + fu.c(7, h.longValue());
      }
      i2 = i1;
      if (i != null) {
        i2 = i1 + fu.b(8, i);
      }
      i1 = i2;
      if (j != null) {
        i1 = i2 + fu.b(9, j);
      }
      i2 = i1;
      if (k != null) {
        i2 = i1 + fu.b(10, k);
      }
      i1 = i2;
      if (l != null) {
        i1 = i2 + fu.b(11, l);
      }
      i2 = i1;
      if (m != null) {
        i2 = i1 + fu.b(12, m.intValue());
      }
      i1 = i2;
      if (n != null) {
        i1 = i2 + fu.b(13, n);
      }
      i2 = i1;
      if (o != null) {
        i2 = i1 + fu.b(14, o);
      }
      i1 = i2;
      if (p != null) {
        i1 = i2 + fu.b(16, p);
      }
      i2 = i1;
      if (q != null) {
        i2 = i1 + fu.c(17, q.longValue());
      }
      i1 = i2;
      if (r != null) {
        i1 = i2 + fu.c(18, r.longValue());
      }
      i2 = i1;
      if (s != null) {
        i2 = i1 + fu.b(19, s);
      }
      i1 = i2;
      if (t != null)
      {
        t.booleanValue();
        i1 = i2 + (fu.b(20) + 1);
      }
      i2 = i1;
      if (u != null) {
        i2 = i1 + fu.b(21, u);
      }
      i1 = i2;
      if (v != null) {
        i1 = i2 + fu.c(22, v.longValue());
      }
      i2 = i1;
      if (w != null) {
        i2 = i1 + fu.b(23, w.intValue());
      }
      i1 = i2;
      if (x != null) {
        i1 = i2 + fu.b(24, x);
      }
      i2 = i1;
      if (y != null) {
        i2 = i1 + fu.b(25, y);
      }
      int i3 = i2;
      if (g != null) {
        i3 = i2 + fu.c(26, g.longValue());
      }
      i1 = i3;
      if (z != null)
      {
        z.booleanValue();
        i1 = i3 + (fu.b(28) + 1);
      }
      i2 = i1;
      if (A != null)
      {
        i2 = i1;
        if (A.length > 0)
        {
          i3 = i4;
          for (;;)
          {
            i2 = i1;
            if (i3 >= A.length) {
              break;
            }
            localObject = A[i3];
            i2 = i1;
            if (localObject != null) {
              i2 = i1 + fu.b(29, (gb)localObject);
            }
            i3 += 1;
            i1 = i2;
          }
        }
      }
      i1 = i2;
      if (B != null) {
        i1 = i2 + fu.b(30, B);
      }
      i2 = i1;
      if (C != null) {
        i2 = i1 + fu.b(31, C.intValue());
      }
      i1 = i2;
      if (D != null) {
        i1 = i2 + fu.b(32, D.intValue());
      }
      i2 = i1;
      if (E != null) {
        i2 = i1 + fu.b(33, E.intValue());
      }
      i1 = i2;
      if (F != null) {
        i1 = i2 + fu.b(34, F);
      }
      i2 = i1;
      if (G != null) {
        i2 = i1 + fu.c(35, G.longValue());
      }
      i1 = i2;
      if (H != null) {
        i1 = i2 + fu.c(36, H.longValue());
      }
      return i1;
    }
    
    public final void a(fu paramfu)
    {
      int i2 = 0;
      if (a != null) {
        paramfu.a(1, a.intValue());
      }
      int i1;
      Object localObject;
      if ((b != null) && (b.length > 0))
      {
        i1 = 0;
        while (i1 < b.length)
        {
          localObject = b[i1];
          if (localObject != null) {
            paramfu.a(2, (gb)localObject);
          }
          i1 += 1;
        }
      }
      if ((c != null) && (c.length > 0))
      {
        i1 = 0;
        while (i1 < c.length)
        {
          localObject = c[i1];
          if (localObject != null) {
            paramfu.a(3, (gb)localObject);
          }
          i1 += 1;
        }
      }
      if (d != null) {
        paramfu.b(4, d.longValue());
      }
      if (e != null) {
        paramfu.b(5, e.longValue());
      }
      if (f != null) {
        paramfu.b(6, f.longValue());
      }
      if (h != null) {
        paramfu.b(7, h.longValue());
      }
      if (i != null) {
        paramfu.a(8, i);
      }
      if (j != null) {
        paramfu.a(9, j);
      }
      if (k != null) {
        paramfu.a(10, k);
      }
      if (l != null) {
        paramfu.a(11, l);
      }
      if (m != null) {
        paramfu.a(12, m.intValue());
      }
      if (n != null) {
        paramfu.a(13, n);
      }
      if (o != null) {
        paramfu.a(14, o);
      }
      if (p != null) {
        paramfu.a(16, p);
      }
      if (q != null) {
        paramfu.b(17, q.longValue());
      }
      if (r != null) {
        paramfu.b(18, r.longValue());
      }
      if (s != null) {
        paramfu.a(19, s);
      }
      if (t != null) {
        paramfu.a(20, t.booleanValue());
      }
      if (u != null) {
        paramfu.a(21, u);
      }
      if (v != null) {
        paramfu.b(22, v.longValue());
      }
      if (w != null) {
        paramfu.a(23, w.intValue());
      }
      if (x != null) {
        paramfu.a(24, x);
      }
      if (y != null) {
        paramfu.a(25, y);
      }
      if (g != null) {
        paramfu.b(26, g.longValue());
      }
      if (z != null) {
        paramfu.a(28, z.booleanValue());
      }
      if ((A != null) && (A.length > 0))
      {
        i1 = i2;
        while (i1 < A.length)
        {
          localObject = A[i1];
          if (localObject != null) {
            paramfu.a(29, (gb)localObject);
          }
          i1 += 1;
        }
      }
      if (B != null) {
        paramfu.a(30, B);
      }
      if (C != null) {
        paramfu.a(31, C.intValue());
      }
      if (D != null) {
        paramfu.a(32, D.intValue());
      }
      if (E != null) {
        paramfu.a(33, E.intValue());
      }
      if (F != null) {
        paramfu.a(34, F);
      }
      if (G != null) {
        paramfu.b(35, G.longValue());
      }
      if (H != null) {
        paramfu.b(36, H.longValue());
      }
      super.a(paramfu);
    }
    
    public final boolean equals(Object paramObject)
    {
      if (paramObject == this) {}
      do
      {
        return true;
        if (!(paramObject instanceof e)) {
          return false;
        }
        paramObject = (e)paramObject;
        if (a == null)
        {
          if (a != null) {
            return false;
          }
        }
        else if (!a.equals(a)) {
          return false;
        }
        if (!fz.a(b, b)) {
          return false;
        }
        if (!fz.a(c, c)) {
          return false;
        }
        if (d == null)
        {
          if (d != null) {
            return false;
          }
        }
        else if (!d.equals(d)) {
          return false;
        }
        if (e == null)
        {
          if (e != null) {
            return false;
          }
        }
        else if (!e.equals(e)) {
          return false;
        }
        if (f == null)
        {
          if (f != null) {
            return false;
          }
        }
        else if (!f.equals(f)) {
          return false;
        }
        if (g == null)
        {
          if (g != null) {
            return false;
          }
        }
        else if (!g.equals(g)) {
          return false;
        }
        if (h == null)
        {
          if (h != null) {
            return false;
          }
        }
        else if (!h.equals(h)) {
          return false;
        }
        if (i == null)
        {
          if (i != null) {
            return false;
          }
        }
        else if (!i.equals(i)) {
          return false;
        }
        if (j == null)
        {
          if (j != null) {
            return false;
          }
        }
        else if (!j.equals(j)) {
          return false;
        }
        if (k == null)
        {
          if (k != null) {
            return false;
          }
        }
        else if (!k.equals(k)) {
          return false;
        }
        if (l == null)
        {
          if (l != null) {
            return false;
          }
        }
        else if (!l.equals(l)) {
          return false;
        }
        if (m == null)
        {
          if (m != null) {
            return false;
          }
        }
        else if (!m.equals(m)) {
          return false;
        }
        if (n == null)
        {
          if (n != null) {
            return false;
          }
        }
        else if (!n.equals(n)) {
          return false;
        }
        if (o == null)
        {
          if (o != null) {
            return false;
          }
        }
        else if (!o.equals(o)) {
          return false;
        }
        if (p == null)
        {
          if (p != null) {
            return false;
          }
        }
        else if (!p.equals(p)) {
          return false;
        }
        if (q == null)
        {
          if (q != null) {
            return false;
          }
        }
        else if (!q.equals(q)) {
          return false;
        }
        if (r == null)
        {
          if (r != null) {
            return false;
          }
        }
        else if (!r.equals(r)) {
          return false;
        }
        if (s == null)
        {
          if (s != null) {
            return false;
          }
        }
        else if (!s.equals(s)) {
          return false;
        }
        if (t == null)
        {
          if (t != null) {
            return false;
          }
        }
        else if (!t.equals(t)) {
          return false;
        }
        if (u == null)
        {
          if (u != null) {
            return false;
          }
        }
        else if (!u.equals(u)) {
          return false;
        }
        if (v == null)
        {
          if (v != null) {
            return false;
          }
        }
        else if (!v.equals(v)) {
          return false;
        }
        if (w == null)
        {
          if (w != null) {
            return false;
          }
        }
        else if (!w.equals(w)) {
          return false;
        }
        if (x == null)
        {
          if (x != null) {
            return false;
          }
        }
        else if (!x.equals(x)) {
          return false;
        }
        if (y == null)
        {
          if (y != null) {
            return false;
          }
        }
        else if (!y.equals(y)) {
          return false;
        }
        if (z == null)
        {
          if (z != null) {
            return false;
          }
        }
        else if (!z.equals(z)) {
          return false;
        }
        if (!fz.a(A, A)) {
          return false;
        }
        if (B == null)
        {
          if (B != null) {
            return false;
          }
        }
        else if (!B.equals(B)) {
          return false;
        }
        if (C == null)
        {
          if (C != null) {
            return false;
          }
        }
        else if (!C.equals(C)) {
          return false;
        }
        if (D == null)
        {
          if (D != null) {
            return false;
          }
        }
        else if (!D.equals(D)) {
          return false;
        }
        if (E == null)
        {
          if (E != null) {
            return false;
          }
        }
        else if (!E.equals(E)) {
          return false;
        }
        if (F == null)
        {
          if (F != null) {
            return false;
          }
        }
        else if (!F.equals(F)) {
          return false;
        }
        if (G == null)
        {
          if (G != null) {
            return false;
          }
        }
        else if (!G.equals(G)) {
          return false;
        }
        if (H == null)
        {
          if (H != null) {
            return false;
          }
        }
        else if (!H.equals(H)) {
          return false;
        }
        if ((ag != null) && (!ag.a())) {
          break;
        }
      } while ((ag == null) || (ag.a()));
      return false;
      return ag.equals(ag);
    }
    
    public final int hashCode()
    {
      int i33 = 0;
      int i34 = getClass().getName().hashCode();
      int i1;
      int i35;
      int i36;
      int i2;
      label51:
      int i3;
      label60:
      int i4;
      label70:
      int i5;
      label80:
      int i6;
      label90:
      int i7;
      label100:
      int i8;
      label110:
      int i9;
      label120:
      int i10;
      label130:
      int i11;
      label140:
      int i12;
      label150:
      int i13;
      label160:
      int i14;
      label170:
      int i15;
      label180:
      int i16;
      label190:
      int i17;
      label200:
      int i18;
      label210:
      int i19;
      label220:
      int i20;
      label230:
      int i21;
      label240:
      int i22;
      label250:
      int i23;
      label260:
      int i24;
      label270:
      int i37;
      int i25;
      label289:
      int i26;
      label299:
      int i27;
      label309:
      int i28;
      label319:
      int i29;
      label329:
      int i30;
      label339:
      int i31;
      if (a == null)
      {
        i1 = 0;
        i35 = fz.a(b);
        i36 = fz.a(c);
        if (d != null) {
          break label599;
        }
        i2 = 0;
        if (e != null) {
          break label610;
        }
        i3 = 0;
        if (f != null) {
          break label621;
        }
        i4 = 0;
        if (g != null) {
          break label633;
        }
        i5 = 0;
        if (h != null) {
          break label645;
        }
        i6 = 0;
        if (i != null) {
          break label657;
        }
        i7 = 0;
        if (j != null) {
          break label669;
        }
        i8 = 0;
        if (k != null) {
          break label681;
        }
        i9 = 0;
        if (l != null) {
          break label693;
        }
        i10 = 0;
        if (m != null) {
          break label705;
        }
        i11 = 0;
        if (n != null) {
          break label717;
        }
        i12 = 0;
        if (o != null) {
          break label729;
        }
        i13 = 0;
        if (p != null) {
          break label741;
        }
        i14 = 0;
        if (q != null) {
          break label753;
        }
        i15 = 0;
        if (r != null) {
          break label765;
        }
        i16 = 0;
        if (s != null) {
          break label777;
        }
        i17 = 0;
        if (t != null) {
          break label789;
        }
        i18 = 0;
        if (u != null) {
          break label801;
        }
        i19 = 0;
        if (v != null) {
          break label813;
        }
        i20 = 0;
        if (w != null) {
          break label825;
        }
        i21 = 0;
        if (x != null) {
          break label837;
        }
        i22 = 0;
        if (y != null) {
          break label849;
        }
        i23 = 0;
        if (z != null) {
          break label861;
        }
        i24 = 0;
        i37 = fz.a(A);
        if (B != null) {
          break label873;
        }
        i25 = 0;
        if (C != null) {
          break label885;
        }
        i26 = 0;
        if (D != null) {
          break label897;
        }
        i27 = 0;
        if (E != null) {
          break label909;
        }
        i28 = 0;
        if (F != null) {
          break label921;
        }
        i29 = 0;
        if (G != null) {
          break label933;
        }
        i30 = 0;
        if (H != null) {
          break label945;
        }
        i31 = 0;
        label349:
        i32 = i33;
        if (ag != null) {
          if (!ag.a()) {
            break label957;
          }
        }
      }
      label599:
      label610:
      label621:
      label633:
      label645:
      label657:
      label669:
      label681:
      label693:
      label705:
      label717:
      label729:
      label741:
      label753:
      label765:
      label777:
      label789:
      label801:
      label813:
      label825:
      label837:
      label849:
      label861:
      label873:
      label885:
      label897:
      label909:
      label921:
      label933:
      label945:
      label957:
      for (int i32 = i33;; i32 = ag.hashCode())
      {
        return (i31 + (i30 + (i29 + (i28 + (i27 + (i26 + (i25 + ((i24 + (i23 + (i22 + (i21 + (i20 + (i19 + (i18 + (i17 + (i16 + (i15 + (i14 + (i13 + (i12 + (i11 + (i10 + (i9 + (i8 + (i7 + (i6 + (i5 + (i4 + (i3 + (i2 + (((i1 + (i34 + 527) * 31) * 31 + i35) * 31 + i36) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i37) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i32;
        i1 = a.hashCode();
        break;
        i2 = d.hashCode();
        break label51;
        i3 = e.hashCode();
        break label60;
        i4 = f.hashCode();
        break label70;
        i5 = g.hashCode();
        break label80;
        i6 = h.hashCode();
        break label90;
        i7 = i.hashCode();
        break label100;
        i8 = j.hashCode();
        break label110;
        i9 = k.hashCode();
        break label120;
        i10 = l.hashCode();
        break label130;
        i11 = m.hashCode();
        break label140;
        i12 = n.hashCode();
        break label150;
        i13 = o.hashCode();
        break label160;
        i14 = p.hashCode();
        break label170;
        i15 = q.hashCode();
        break label180;
        i16 = r.hashCode();
        break label190;
        i17 = s.hashCode();
        break label200;
        i18 = t.hashCode();
        break label210;
        i19 = u.hashCode();
        break label220;
        i20 = v.hashCode();
        break label230;
        i21 = w.hashCode();
        break label240;
        i22 = x.hashCode();
        break label250;
        i23 = y.hashCode();
        break label260;
        i24 = z.hashCode();
        break label270;
        i25 = B.hashCode();
        break label289;
        i26 = C.hashCode();
        break label299;
        i27 = D.hashCode();
        break label309;
        i28 = E.hashCode();
        break label319;
        i29 = F.hashCode();
        break label329;
        i30 = G.hashCode();
        break label339;
        i31 = H.hashCode();
        break label349;
      }
    }
  }
  
  public static final class f
    extends fv<f>
  {
    public long[] a = ge.f;
    public long[] b = ge.f;
    
    public f()
    {
      ag = null;
      ah = -1;
    }
    
    protected final int a()
    {
      int m = 0;
      int k = super.a();
      int j;
      if ((a != null) && (a.length > 0))
      {
        i = 0;
        j = 0;
        while (i < a.length)
        {
          j += fu.b(a[i]);
          i += 1;
        }
      }
      for (int i = k + j + a.length * 1;; i = k)
      {
        j = i;
        if (b != null)
        {
          j = i;
          if (b.length > 0)
          {
            k = 0;
            j = m;
            while (j < b.length)
            {
              k += fu.b(b[j]);
              j += 1;
            }
            j = i + k + b.length * 1;
          }
        }
        return j;
      }
    }
    
    public final void a(fu paramfu)
    {
      int j = 0;
      int i;
      if ((a != null) && (a.length > 0))
      {
        i = 0;
        while (i < a.length)
        {
          paramfu.a(1, a[i]);
          i += 1;
        }
      }
      if ((b != null) && (b.length > 0))
      {
        i = j;
        while (i < b.length)
        {
          paramfu.a(2, b[i]);
          i += 1;
        }
      }
      super.a(paramfu);
    }
    
    public final boolean equals(Object paramObject)
    {
      if (paramObject == this) {}
      do
      {
        return true;
        if (!(paramObject instanceof f)) {
          return false;
        }
        paramObject = (f)paramObject;
        if (!fz.a(a, a)) {
          return false;
        }
        if (!fz.a(b, b)) {
          return false;
        }
        if ((ag != null) && (!ag.a())) {
          break;
        }
      } while ((ag == null) || (ag.a()));
      return false;
      return ag.equals(ag);
    }
    
    public final int hashCode()
    {
      int j = getClass().getName().hashCode();
      int k = fz.a(a);
      int m = fz.a(b);
      if ((ag == null) || (ag.a())) {}
      for (int i = 0;; i = ag.hashCode()) {
        return i + (((j + 527) * 31 + k) * 31 + m) * 31;
      }
    }
  }
  
  public static final class g
    extends fv<g>
  {
    private static volatile g[] g;
    public Long a = null;
    public String b = null;
    public String c = null;
    public Long d = null;
    public Float e = null;
    public Double f = null;
    
    public g()
    {
      ag = null;
      ah = -1;
    }
    
    public static g[] b()
    {
      if (g == null) {}
      synchronized (fz.c)
      {
        if (g == null) {
          g = new g[0];
        }
        return g;
      }
    }
    
    protected final int a()
    {
      int j = super.a();
      int i = j;
      if (a != null) {
        i = j + fu.c(1, a.longValue());
      }
      j = i;
      if (b != null) {
        j = i + fu.b(2, b);
      }
      i = j;
      if (c != null) {
        i = j + fu.b(3, c);
      }
      j = i;
      if (d != null) {
        j = i + fu.c(4, d.longValue());
      }
      i = j;
      if (e != null)
      {
        e.floatValue();
        i = j + (fu.b(5) + 4);
      }
      j = i;
      if (f != null)
      {
        f.doubleValue();
        j = i + (fu.b(6) + 8);
      }
      return j;
    }
    
    public final void a(fu paramfu)
    {
      if (a != null) {
        paramfu.b(1, a.longValue());
      }
      if (b != null) {
        paramfu.a(2, b);
      }
      if (c != null) {
        paramfu.a(3, c);
      }
      if (d != null) {
        paramfu.b(4, d.longValue());
      }
      if (e != null) {
        paramfu.a(5, e.floatValue());
      }
      if (f != null) {
        paramfu.a(6, f.doubleValue());
      }
      super.a(paramfu);
    }
    
    public final boolean equals(Object paramObject)
    {
      if (paramObject == this) {}
      do
      {
        return true;
        if (!(paramObject instanceof g)) {
          return false;
        }
        paramObject = (g)paramObject;
        if (a == null)
        {
          if (a != null) {
            return false;
          }
        }
        else if (!a.equals(a)) {
          return false;
        }
        if (b == null)
        {
          if (b != null) {
            return false;
          }
        }
        else if (!b.equals(b)) {
          return false;
        }
        if (c == null)
        {
          if (c != null) {
            return false;
          }
        }
        else if (!c.equals(c)) {
          return false;
        }
        if (d == null)
        {
          if (d != null) {
            return false;
          }
        }
        else if (!d.equals(d)) {
          return false;
        }
        if (e == null)
        {
          if (e != null) {
            return false;
          }
        }
        else if (!e.equals(e)) {
          return false;
        }
        if (f == null)
        {
          if (f != null) {
            return false;
          }
        }
        else if (!f.equals(f)) {
          return false;
        }
        if ((ag != null) && (!ag.a())) {
          break;
        }
      } while ((ag == null) || (ag.a()));
      return false;
      return ag.equals(ag);
    }
    
    public final int hashCode()
    {
      int i3 = 0;
      int i4 = getClass().getName().hashCode();
      int i;
      int j;
      label33:
      int k;
      label42:
      int m;
      label52:
      int n;
      label62:
      int i1;
      if (a == null)
      {
        i = 0;
        if (b != null) {
          break label154;
        }
        j = 0;
        if (c != null) {
          break label165;
        }
        k = 0;
        if (d != null) {
          break label176;
        }
        m = 0;
        if (e != null) {
          break label188;
        }
        n = 0;
        if (f != null) {
          break label200;
        }
        i1 = 0;
        label72:
        i2 = i3;
        if (ag != null) {
          if (!ag.a()) {
            break label212;
          }
        }
      }
      label154:
      label165:
      label176:
      label188:
      label200:
      label212:
      for (int i2 = i3;; i2 = ag.hashCode())
      {
        return (i1 + (n + (m + (k + (j + (i + (i4 + 527) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i2;
        i = a.hashCode();
        break;
        j = b.hashCode();
        break label33;
        k = c.hashCode();
        break label42;
        m = d.hashCode();
        break label52;
        n = e.hashCode();
        break label62;
        i1 = f.hashCode();
        break label72;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/du.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */