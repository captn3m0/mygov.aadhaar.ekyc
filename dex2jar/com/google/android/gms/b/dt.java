package com.google.android.gms.b;

public abstract interface dt
{
  public static final class a
    extends fv<a>
  {
    private static volatile a[] d;
    public String a = null;
    public Boolean b = null;
    public Boolean c = null;
    
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
      int j = super.a();
      int i = j;
      if (a != null) {
        i = j + fu.b(1, a);
      }
      j = i;
      if (b != null)
      {
        b.booleanValue();
        j = i + (fu.b(2) + 1);
      }
      i = j;
      if (c != null)
      {
        c.booleanValue();
        i = j + (fu.b(3) + 1);
      }
      return i;
    }
    
    public final void a(fu paramfu)
    {
      if (a != null) {
        paramfu.a(1, a);
      }
      if (b != null) {
        paramfu.a(2, b.booleanValue());
      }
      if (c != null) {
        paramfu.a(3, c.booleanValue());
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
  
  public static final class b
    extends fv<b>
  {
    public Long a = null;
    public String b = null;
    public Integer c = null;
    public dt.c[] d = dt.c.b();
    public dt.a[] e = dt.a.b();
    public ds.a[] f = ds.a.b();
    
    public b()
    {
      ag = null;
      ah = -1;
    }
    
    protected final int a()
    {
      int m = 0;
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
        i = j + fu.b(3, c.intValue());
      }
      j = i;
      Object localObject;
      if (d != null)
      {
        j = i;
        if (d.length > 0)
        {
          j = 0;
          while (j < d.length)
          {
            localObject = d[j];
            k = i;
            if (localObject != null) {
              k = i + fu.b(4, (gb)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (e != null)
      {
        i = j;
        if (e.length > 0)
        {
          i = j;
          j = 0;
          while (j < e.length)
          {
            localObject = e[j];
            k = i;
            if (localObject != null) {
              k = i + fu.b(5, (gb)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      int k = i;
      if (f != null)
      {
        k = i;
        if (f.length > 0)
        {
          j = m;
          for (;;)
          {
            k = i;
            if (j >= f.length) {
              break;
            }
            localObject = f[j];
            k = i;
            if (localObject != null) {
              k = i + fu.b(6, (gb)localObject);
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
        paramfu.b(1, a.longValue());
      }
      if (b != null) {
        paramfu.a(2, b);
      }
      if (c != null) {
        paramfu.a(3, c.intValue());
      }
      int i;
      Object localObject;
      if ((d != null) && (d.length > 0))
      {
        i = 0;
        while (i < d.length)
        {
          localObject = d[i];
          if (localObject != null) {
            paramfu.a(4, (gb)localObject);
          }
          i += 1;
        }
      }
      if ((e != null) && (e.length > 0))
      {
        i = 0;
        while (i < e.length)
        {
          localObject = e[i];
          if (localObject != null) {
            paramfu.a(5, (gb)localObject);
          }
          i += 1;
        }
      }
      if ((f != null) && (f.length > 0))
      {
        i = j;
        while (i < f.length)
        {
          localObject = f[i];
          if (localObject != null) {
            paramfu.a(6, (gb)localObject);
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
        if (!fz.a(e, e)) {
          return false;
        }
        if (!fz.a(f, f)) {
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
      int i3;
      int i4;
      if (a == null)
      {
        i = 0;
        if (b != null) {
          break label151;
        }
        j = 0;
        if (c != null) {
          break label162;
        }
        k = 0;
        i2 = fz.a(d);
        i3 = fz.a(e);
        i4 = fz.a(f);
        m = n;
        if (ag != null) {
          if (!ag.a()) {
            break label173;
          }
        }
      }
      label151:
      label162:
      label173:
      for (int m = n;; m = ag.hashCode())
      {
        return ((((k + (j + (i + (i1 + 527) * 31) * 31) * 31) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + m;
        i = a.hashCode();
        break;
        j = b.hashCode();
        break label33;
        k = c.hashCode();
        break label42;
      }
    }
  }
  
  public static final class c
    extends fv<c>
  {
    private static volatile c[] c;
    public String a = null;
    public String b = null;
    
    public c()
    {
      ag = null;
      ah = -1;
    }
    
    public static c[] b()
    {
      if (c == null) {}
      synchronized (fz.c)
      {
        if (c == null) {
          c = new c[0];
        }
        return c;
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
        if ((ag != null) && (!ag.a())) {
          break;
        }
      } while ((ag == null) || (ag.a()));
      return false;
      return ag.equals(ag);
    }
    
    public final int hashCode()
    {
      int m = 0;
      int n = getClass().getName().hashCode();
      int i;
      int j;
      if (a == null)
      {
        i = 0;
        if (b != null) {
          break label89;
        }
        j = 0;
        label33:
        k = m;
        if (ag != null) {
          if (!ag.a()) {
            break label100;
          }
        }
      }
      label89:
      label100:
      for (int k = m;; k = ag.hashCode())
      {
        return (j + (i + (n + 527) * 31) * 31) * 31 + k;
        i = a.hashCode();
        break;
        j = b.hashCode();
        break label33;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/dt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */