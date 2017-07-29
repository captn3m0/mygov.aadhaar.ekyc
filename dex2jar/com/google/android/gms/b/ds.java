package com.google.android.gms.b;

public abstract interface ds
{
  public static final class a
    extends fv<a>
  {
    private static volatile a[] d;
    public Integer a = null;
    public ds.e[] b = ds.e.b();
    public ds.b[] c = ds.b.b();
    
    public a()
    {
      ag = null;
      ah = -1;
    }
    
    public static a[] b()
    {
      if (d == null) {}
      synchronized (fz.c)
      {
        if (d == null) {
          d = new a[0];
        }
        return d;
      }
    }
    
    protected final int a()
    {
      int m = 0;
      int i = super.a();
      int j = i;
      if (a != null) {
        j = i + fu.b(1, a.intValue());
      }
      i = j;
      Object localObject;
      if (b != null)
      {
        i = j;
        if (b.length > 0)
        {
          i = j;
          j = 0;
          while (j < b.length)
          {
            localObject = b[j];
            k = i;
            if (localObject != null) {
              k = i + fu.b(2, (gb)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      int k = i;
      if (c != null)
      {
        k = i;
        if (c.length > 0)
        {
          j = m;
          for (;;)
          {
            k = i;
            if (j >= c.length) {
              break;
            }
            localObject = c[j];
            k = i;
            if (localObject != null) {
              k = i + fu.b(3, (gb)localObject);
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
      int j = 0;
      if (a != null) {
        paramfu.a(1, a.intValue());
      }
      int i;
      Object localObject;
      if ((b != null) && (b.length > 0))
      {
        i = 0;
        while (i < b.length)
        {
          localObject = b[i];
          if (localObject != null) {
            paramfu.a(2, (gb)localObject);
          }
          i += 1;
        }
      }
      if ((c != null) && (c.length > 0))
      {
        i = j;
        while (i < c.length)
        {
          localObject = c[i];
          if (localObject != null) {
            paramfu.a(3, (gb)localObject);
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
        if (!fz.a(b, b)) {
          return false;
        }
        if (!fz.a(c, c)) {
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
      int k = 0;
      int m = getClass().getName().hashCode();
      int i;
      int n;
      int i1;
      if (a == null)
      {
        i = 0;
        n = fz.a(b);
        i1 = fz.a(c);
        j = k;
        if (ag != null) {
          if (!ag.a()) {
            break label102;
          }
        }
      }
      label102:
      for (int j = k;; j = ag.hashCode())
      {
        return (((i + (m + 527) * 31) * 31 + n) * 31 + i1) * 31 + j;
        i = a.hashCode();
        break;
      }
    }
  }
  
  public static final class b
    extends fv<b>
  {
    private static volatile b[] f;
    public Integer a = null;
    public String b = null;
    public ds.c[] c = ds.c.b();
    public Boolean d = null;
    public ds.d e = null;
    
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
      if (a != null) {
        j = i + fu.b(1, a.intValue());
      }
      i = j;
      if (b != null) {
        i = j + fu.b(2, b);
      }
      j = i;
      if (c != null)
      {
        j = i;
        if (c.length > 0)
        {
          j = 0;
          while (j < c.length)
          {
            ds.c localc = c[j];
            int k = i;
            if (localc != null) {
              k = i + fu.b(3, localc);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (d != null)
      {
        d.booleanValue();
        i = j + (fu.b(4) + 1);
      }
      j = i;
      if (e != null) {
        j = i + fu.b(5, e);
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
      if ((c != null) && (c.length > 0))
      {
        int i = 0;
        while (i < c.length)
        {
          ds.c localc = c[i];
          if (localc != null) {
            paramfu.a(3, localc);
          }
          i += 1;
        }
      }
      if (d != null) {
        paramfu.a(4, d.booleanValue());
      }
      if (e != null) {
        paramfu.a(5, e);
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
      int i3;
      int k;
      label51:
      int m;
      if (a == null)
      {
        i = 0;
        if (b != null) {
          break label137;
        }
        j = 0;
        i3 = fz.a(c);
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
        return (m + (k + ((j + (i + (i2 + 527) * 31) * 31) * 31 + i3) * 31) * 31) * 31 + n;
        i = a.hashCode();
        break;
        j = b.hashCode();
        break label33;
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
    private static volatile c[] e;
    public ds.f a = null;
    public ds.d b = null;
    public Boolean c = null;
    public String d = null;
    
    public c()
    {
      ag = null;
      ah = -1;
    }
    
    public static c[] b()
    {
      if (e == null) {}
      synchronized (fz.c)
      {
        if (e == null) {
          e = new c[0];
        }
        return e;
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
      if (c != null)
      {
        c.booleanValue();
        i = j + (fu.b(3) + 1);
      }
      j = i;
      if (d != null) {
        j = i + fu.b(4, d);
      }
      return j;
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
        paramfu.a(3, c.booleanValue());
      }
      if (d != null) {
        paramfu.a(4, d);
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
  
  public static final class d
    extends fv<d>
  {
    public Integer a;
    public Boolean b = null;
    public String c = null;
    public String d = null;
    public String e = null;
    
    public d()
    {
      ag = null;
      ah = -1;
    }
    
    protected final int a()
    {
      int j = super.a();
      int i = j;
      if (a != null) {
        i = j + fu.b(1, a.intValue());
      }
      j = i;
      if (b != null)
      {
        b.booleanValue();
        j = i + (fu.b(2) + 1);
      }
      i = j;
      if (c != null) {
        i = j + fu.b(3, c);
      }
      j = i;
      if (d != null) {
        j = i + fu.b(4, d);
      }
      i = j;
      if (e != null) {
        i = j + fu.b(5, e);
      }
      return i;
    }
    
    public final void a(fu paramfu)
    {
      if (a != null) {
        paramfu.a(1, a.intValue());
      }
      if (b != null) {
        paramfu.a(2, b.booleanValue());
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
        i = a.intValue();
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
  
  public static final class e
    extends fv<e>
  {
    private static volatile e[] d;
    public Integer a = null;
    public String b = null;
    public ds.c c = null;
    
    public e()
    {
      ag = null;
      ah = -1;
    }
    
    public static e[] b()
    {
      if (d == null) {}
      synchronized (fz.c)
      {
        if (d == null) {
          d = new e[0];
        }
        return d;
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
      return i;
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
        if ((ag != null) && (!ag.a())) {
          break;
        }
      } while ((ag == null) || (ag.a()));
      return false;
      return ag.equals(ag);
    }
    
    public final int hashCode()
    {
      int n = 0;
      int i1 = getClass().getName().hashCode();
      int i;
      int j;
      label33:
      int k;
      if (a == null)
      {
        i = 0;
        if (b != null) {
          break label106;
        }
        j = 0;
        if (c != null) {
          break label117;
        }
        k = 0;
        label42:
        m = n;
        if (ag != null) {
          if (!ag.a()) {
            break label128;
          }
        }
      }
      label106:
      label117:
      label128:
      for (int m = n;; m = ag.hashCode())
      {
        return (k + (j + (i + (i1 + 527) * 31) * 31) * 31) * 31 + m;
        i = a.hashCode();
        break;
        j = b.hashCode();
        break label33;
        k = c.hashCode();
        break label42;
      }
    }
  }
  
  public static final class f
    extends fv<f>
  {
    public Integer a;
    public String b = null;
    public Boolean c = null;
    public String[] d = ge.j;
    
    public f()
    {
      ag = null;
      ah = -1;
    }
    
    protected final int a()
    {
      int n = 0;
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
      if (c != null)
      {
        c.booleanValue();
        i = j + (fu.b(3) + 1);
      }
      j = i;
      if (d != null)
      {
        j = i;
        if (d.length > 0)
        {
          int k = 0;
          int m = 0;
          j = n;
          while (j < d.length)
          {
            String str = d[j];
            int i1 = k;
            n = m;
            if (str != null)
            {
              n = m + 1;
              i1 = k + fu.a(str);
            }
            j += 1;
            k = i1;
            m = n;
          }
          j = i + k + m * 1;
        }
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
        paramfu.a(3, c.booleanValue());
      }
      if ((d != null) && (d.length > 0))
      {
        int i = 0;
        while (i < d.length)
        {
          String str = d[i];
          if (str != null) {
            paramfu.a(4, str);
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
        if (!(paramObject instanceof f)) {
          return false;
        }
        paramObject = (f)paramObject;
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
        if (!fz.a(d, d)) {
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
      int n = 0;
      int i1 = getClass().getName().hashCode();
      int i;
      int j;
      label33:
      int k;
      label42:
      int i2;
      if (a == null)
      {
        i = 0;
        if (b != null) {
          break label121;
        }
        j = 0;
        if (c != null) {
          break label132;
        }
        k = 0;
        i2 = fz.a(d);
        m = n;
        if (ag != null) {
          if (!ag.a()) {
            break label143;
          }
        }
      }
      label121:
      label132:
      label143:
      for (int m = n;; m = ag.hashCode())
      {
        return ((k + (j + (i + (i1 + 527) * 31) * 31) * 31) * 31 + i2) * 31 + m;
        i = a.intValue();
        break;
        j = b.hashCode();
        break label33;
        k = c.hashCode();
        break label42;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/ds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */