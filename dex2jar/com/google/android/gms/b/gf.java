package com.google.android.gms.b;

import java.util.Arrays;

public abstract interface gf
{
  public static final class a
    extends fv<a>
    implements Cloneable
  {
    public String[] a = ge.j;
    public String[] b = ge.j;
    public int[] c = ge.e;
    public long[] d = ge.f;
    public long[] e = ge.f;
    
    public a()
    {
      ag = null;
      ah = -1;
    }
    
    private a b()
    {
      try
      {
        a locala = (a)super.c();
        if ((a != null) && (a.length > 0)) {
          a = ((String[])a.clone());
        }
        if ((b != null) && (b.length > 0)) {
          b = ((String[])b.clone());
        }
        if ((c != null) && (c.length > 0)) {
          c = ((int[])c.clone());
        }
        if ((d != null) && (d.length > 0)) {
          d = ((long[])d.clone());
        }
        if ((e != null) && (e.length > 0)) {
          e = ((long[])e.clone());
        }
        return locala;
      }
      catch (CloneNotSupportedException localCloneNotSupportedException)
      {
        throw new AssertionError(localCloneNotSupportedException);
      }
    }
    
    protected final int a()
    {
      int i2 = 0;
      int i1 = super.a();
      int j;
      int k;
      String str;
      int n;
      int m;
      if ((a != null) && (a.length > 0))
      {
        i = 0;
        j = 0;
        for (k = 0; i < a.length; k = m)
        {
          str = a[i];
          n = j;
          m = k;
          if (str != null)
          {
            m = k + 1;
            n = j + fu.a(str);
          }
          i += 1;
          j = n;
        }
      }
      for (int i = i1 + j + k * 1;; i = i1)
      {
        j = i;
        if (b != null)
        {
          j = i;
          if (b.length > 0)
          {
            j = 0;
            k = 0;
            for (m = 0; j < b.length; m = n)
            {
              str = b[j];
              i1 = k;
              n = m;
              if (str != null)
              {
                n = m + 1;
                i1 = k + fu.a(str);
              }
              j += 1;
              k = i1;
            }
            j = i + k + m * 1;
          }
        }
        i = j;
        if (c != null)
        {
          i = j;
          if (c.length > 0)
          {
            i = 0;
            k = 0;
            while (i < c.length)
            {
              k += fu.a(c[i]);
              i += 1;
            }
            i = j + k + c.length * 1;
          }
        }
        j = i;
        if (d != null)
        {
          j = i;
          if (d.length > 0)
          {
            j = 0;
            k = 0;
            while (j < d.length)
            {
              k += fu.b(d[j]);
              j += 1;
            }
            j = i + k + d.length * 1;
          }
        }
        i = j;
        if (e != null)
        {
          i = j;
          if (e.length > 0)
          {
            k = 0;
            i = i2;
            while (i < e.length)
            {
              k += fu.b(e[i]);
              i += 1;
            }
            i = j + k + e.length * 1;
          }
        }
        return i;
      }
    }
    
    public final void a(fu paramfu)
    {
      int j = 0;
      int i;
      String str;
      if ((a != null) && (a.length > 0))
      {
        i = 0;
        while (i < a.length)
        {
          str = a[i];
          if (str != null) {
            paramfu.a(1, str);
          }
          i += 1;
        }
      }
      if ((b != null) && (b.length > 0))
      {
        i = 0;
        while (i < b.length)
        {
          str = b[i];
          if (str != null) {
            paramfu.a(2, str);
          }
          i += 1;
        }
      }
      if ((c != null) && (c.length > 0))
      {
        i = 0;
        while (i < c.length)
        {
          paramfu.a(3, c[i]);
          i += 1;
        }
      }
      if ((d != null) && (d.length > 0))
      {
        i = 0;
        while (i < d.length)
        {
          paramfu.b(4, d[i]);
          i += 1;
        }
      }
      if ((e != null) && (e.length > 0))
      {
        i = j;
        while (i < e.length)
        {
          paramfu.b(5, e[i]);
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
        if (!fz.a(a, a)) {
          return false;
        }
        if (!fz.a(b, b)) {
          return false;
        }
        if (!fz.a(c, c)) {
          return false;
        }
        if (!fz.a(d, d)) {
          return false;
        }
        if (!fz.a(e, e)) {
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
      int n = fz.a(c);
      int i1 = fz.a(d);
      int i2 = fz.a(e);
      if ((ag == null) || (ag.a())) {}
      for (int i = 0;; i = ag.hashCode()) {
        return i + ((((((j + 527) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31;
      }
    }
  }
  
  public static final class b
    extends fv<b>
    implements Cloneable
  {
    public int a = 0;
    public String b = "";
    public String c = "";
    
    public b()
    {
      ag = null;
      ah = -1;
    }
    
    private b b()
    {
      try
      {
        b localb = (b)super.c();
        return localb;
      }
      catch (CloneNotSupportedException localCloneNotSupportedException)
      {
        throw new AssertionError(localCloneNotSupportedException);
      }
    }
    
    protected final int a()
    {
      int j = super.a();
      int i = j;
      if (a != 0) {
        i = j + fu.b(1, a);
      }
      j = i;
      if (b != null)
      {
        j = i;
        if (!b.equals("")) {
          j = i + fu.b(2, b);
        }
      }
      i = j;
      if (c != null)
      {
        i = j;
        if (!c.equals("")) {
          i = j + fu.b(3, c);
        }
      }
      return i;
    }
    
    public final void a(fu paramfu)
    {
      if (a != 0) {
        paramfu.a(1, a);
      }
      if ((b != null) && (!b.equals(""))) {
        paramfu.a(2, b);
      }
      if ((c != null) && (!c.equals(""))) {
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
        if (!(paramObject instanceof b)) {
          return false;
        }
        paramObject = (b)paramObject;
        if (a != a) {
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
      int m = 0;
      int n = getClass().getName().hashCode();
      int i1 = a;
      int i;
      int j;
      if (b == null)
      {
        i = 0;
        if (c != null) {
          break label101;
        }
        j = 0;
        label39:
        k = m;
        if (ag != null) {
          if (!ag.a()) {
            break label112;
          }
        }
      }
      label101:
      label112:
      for (int k = m;; k = ag.hashCode())
      {
        return (j + (i + ((n + 527) * 31 + i1) * 31) * 31) * 31 + k;
        i = b.hashCode();
        break;
        j = c.hashCode();
        break label39;
      }
    }
  }
  
  public static final class c
    extends fv<c>
    implements Cloneable
  {
    public byte[] a = ge.l;
    public String b = "";
    public byte[][] c = ge.k;
    public boolean d = false;
    
    public c()
    {
      ag = null;
      ah = -1;
    }
    
    private c b()
    {
      try
      {
        c localc = (c)super.c();
        if ((c != null) && (c.length > 0)) {
          c = ((byte[][])c.clone());
        }
        return localc;
      }
      catch (CloneNotSupportedException localCloneNotSupportedException)
      {
        throw new AssertionError(localCloneNotSupportedException);
      }
    }
    
    protected final int a()
    {
      int n = 0;
      int j = super.a();
      int i = j;
      if (!Arrays.equals(a, ge.l)) {
        i = j + fu.b(1, a);
      }
      j = i;
      if (c != null)
      {
        j = i;
        if (c.length > 0)
        {
          int k = 0;
          int m = 0;
          j = n;
          while (j < c.length)
          {
            byte[] arrayOfByte = c[j];
            int i1 = k;
            n = m;
            if (arrayOfByte != null)
            {
              n = m + 1;
              i1 = k + fu.a(arrayOfByte);
            }
            j += 1;
            k = i1;
            m = n;
          }
          j = i + k + m * 1;
        }
      }
      i = j;
      if (d) {
        i = j + (fu.b(3) + 1);
      }
      j = i;
      if (b != null)
      {
        j = i;
        if (!b.equals("")) {
          j = i + fu.b(4, b);
        }
      }
      return j;
    }
    
    public final void a(fu paramfu)
    {
      if (!Arrays.equals(a, ge.l)) {
        paramfu.a(1, a);
      }
      if ((c != null) && (c.length > 0))
      {
        int i = 0;
        while (i < c.length)
        {
          byte[] arrayOfByte = c[i];
          if (arrayOfByte != null) {
            paramfu.a(2, arrayOfByte);
          }
          i += 1;
        }
      }
      if (d) {
        paramfu.a(3, d);
      }
      if ((b != null) && (!b.equals(""))) {
        paramfu.a(4, b);
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
        if (!Arrays.equals(a, a)) {
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
        if (d != d) {
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
      int i1 = Arrays.hashCode(a);
      int i;
      int i2;
      int j;
      if (b == null)
      {
        i = 0;
        i2 = fz.a(c);
        if (!d) {
          break label121;
        }
        j = 1231;
        label53:
        k = m;
        if (ag != null) {
          if (!ag.a()) {
            break label128;
          }
        }
      }
      label121:
      label128:
      for (int k = m;; k = ag.hashCode())
      {
        return (j + ((i + ((n + 527) * 31 + i1) * 31) * 31 + i2) * 31) * 31 + k;
        i = b.hashCode();
        break;
        j = 1237;
        break label53;
      }
    }
  }
  
  public static final class d
    extends fv<d>
    implements Cloneable
  {
    public long a = 0L;
    public long b = 0L;
    public long c = 0L;
    public String d = "";
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public gf.e[] h = gf.e.b();
    public byte[] i = ge.l;
    public gf.b j = null;
    public byte[] k = ge.l;
    public String l = "";
    public String m = "";
    public gf.a n = null;
    public String o = "";
    public long p = 180000L;
    public gf.c q = null;
    public byte[] r = ge.l;
    public String s = "";
    public int t = 0;
    public int[] u = ge.e;
    public long v = 0L;
    public gf.f w = null;
    
    public d()
    {
      ag = null;
      ah = -1;
    }
    
    private d b()
    {
      try
      {
        d locald = (d)super.c();
        if ((h != null) && (h.length > 0))
        {
          h = new gf.e[h.length];
          int i1 = 0;
          while (i1 < h.length)
          {
            if (h[i1] != null) {
              h[i1] = ((gf.e)h[i1].clone());
            }
            i1 += 1;
          }
        }
        if (j == null) {
          break label111;
        }
      }
      catch (CloneNotSupportedException localCloneNotSupportedException)
      {
        throw new AssertionError(localCloneNotSupportedException);
      }
      j = ((gf.b)j.clone());
      label111:
      if (n != null) {
        n = ((gf.a)n.clone());
      }
      if (q != null) {
        q = ((gf.c)q.clone());
      }
      if ((u != null) && (u.length > 0)) {
        u = ((int[])u.clone());
      }
      if (w != null) {
        w = ((gf.f)w.clone());
      }
      return localCloneNotSupportedException;
    }
    
    protected final int a()
    {
      int i4 = 0;
      int i1 = super.a();
      int i2 = i1;
      if (a != 0L) {
        i2 = i1 + fu.c(1, a);
      }
      i1 = i2;
      if (d != null)
      {
        i1 = i2;
        if (!d.equals("")) {
          i1 = i2 + fu.b(2, d);
        }
      }
      i2 = i1;
      if (h != null)
      {
        i2 = i1;
        if (h.length > 0)
        {
          i2 = 0;
          while (i2 < h.length)
          {
            gf.e locale = h[i2];
            i3 = i1;
            if (locale != null) {
              i3 = i1 + fu.b(3, locale);
            }
            i2 += 1;
            i1 = i3;
          }
          i2 = i1;
        }
      }
      i1 = i2;
      if (!Arrays.equals(i, ge.l)) {
        i1 = i2 + fu.b(4, i);
      }
      i2 = i1;
      if (!Arrays.equals(k, ge.l)) {
        i2 = i1 + fu.b(6, k);
      }
      i1 = i2;
      if (n != null) {
        i1 = i2 + fu.b(7, n);
      }
      i2 = i1;
      if (l != null)
      {
        i2 = i1;
        if (!l.equals("")) {
          i2 = i1 + fu.b(8, l);
        }
      }
      i1 = i2;
      if (j != null) {
        i1 = i2 + fu.b(9, j);
      }
      i2 = i1;
      if (g) {
        i2 = i1 + (fu.b(10) + 1);
      }
      i1 = i2;
      if (e != 0) {
        i1 = i2 + fu.b(11, e);
      }
      i2 = i1;
      if (f != 0) {
        i2 = i1 + fu.b(12, f);
      }
      int i3 = i2;
      if (m != null)
      {
        i3 = i2;
        if (!m.equals("")) {
          i3 = i2 + fu.b(13, m);
        }
      }
      i1 = i3;
      if (o != null)
      {
        i1 = i3;
        if (!o.equals("")) {
          i1 = i3 + fu.b(14, o);
        }
      }
      i2 = i1;
      if (p != 180000L)
      {
        long l1 = p;
        i2 = fu.b(15);
        i2 = i1 + (fu.b(fu.c(l1)) + i2);
      }
      i1 = i2;
      if (q != null) {
        i1 = i2 + fu.b(16, q);
      }
      i2 = i1;
      if (b != 0L) {
        i2 = i1 + fu.c(17, b);
      }
      i3 = i2;
      if (!Arrays.equals(r, ge.l)) {
        i3 = i2 + fu.b(18, r);
      }
      i1 = i3;
      if (t != 0) {
        i1 = i3 + fu.b(19, t);
      }
      i2 = i1;
      if (u != null)
      {
        i2 = i1;
        if (u.length > 0)
        {
          i3 = 0;
          i2 = i4;
          while (i2 < u.length)
          {
            i3 += fu.a(u[i2]);
            i2 += 1;
          }
          i2 = i1 + i3 + u.length * 2;
        }
      }
      i1 = i2;
      if (c != 0L) {
        i1 = i2 + fu.c(21, c);
      }
      i2 = i1;
      if (v != 0L) {
        i2 = i1 + fu.c(22, v);
      }
      i1 = i2;
      if (w != null) {
        i1 = i2 + fu.b(23, w);
      }
      i2 = i1;
      if (s != null)
      {
        i2 = i1;
        if (!s.equals("")) {
          i2 = i1 + fu.b(24, s);
        }
      }
      return i2;
    }
    
    public final void a(fu paramfu)
    {
      int i2 = 0;
      if (a != 0L) {
        paramfu.b(1, a);
      }
      if ((d != null) && (!d.equals(""))) {
        paramfu.a(2, d);
      }
      int i1;
      if ((h != null) && (h.length > 0))
      {
        i1 = 0;
        while (i1 < h.length)
        {
          gf.e locale = h[i1];
          if (locale != null) {
            paramfu.a(3, locale);
          }
          i1 += 1;
        }
      }
      if (!Arrays.equals(i, ge.l)) {
        paramfu.a(4, i);
      }
      if (!Arrays.equals(k, ge.l)) {
        paramfu.a(6, k);
      }
      if (n != null) {
        paramfu.a(7, n);
      }
      if ((l != null) && (!l.equals(""))) {
        paramfu.a(8, l);
      }
      if (j != null) {
        paramfu.a(9, j);
      }
      if (g) {
        paramfu.a(10, g);
      }
      if (e != 0) {
        paramfu.a(11, e);
      }
      if (f != 0) {
        paramfu.a(12, f);
      }
      if ((m != null) && (!m.equals(""))) {
        paramfu.a(13, m);
      }
      if ((o != null) && (!o.equals(""))) {
        paramfu.a(14, o);
      }
      if (p != 180000L)
      {
        long l1 = p;
        paramfu.c(15, 0);
        paramfu.a(fu.c(l1));
      }
      if (q != null) {
        paramfu.a(16, q);
      }
      if (b != 0L) {
        paramfu.b(17, b);
      }
      if (!Arrays.equals(r, ge.l)) {
        paramfu.a(18, r);
      }
      if (t != 0) {
        paramfu.a(19, t);
      }
      if ((u != null) && (u.length > 0))
      {
        i1 = i2;
        while (i1 < u.length)
        {
          paramfu.a(20, u[i1]);
          i1 += 1;
        }
      }
      if (c != 0L) {
        paramfu.b(21, c);
      }
      if (v != 0L) {
        paramfu.b(22, v);
      }
      if (w != null) {
        paramfu.a(23, w);
      }
      if ((s != null) && (!s.equals(""))) {
        paramfu.a(24, s);
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
        if (a != a) {
          return false;
        }
        if (b != b) {
          return false;
        }
        if (c != c) {
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
        if (e != e) {
          return false;
        }
        if (f != f) {
          return false;
        }
        if (g != g) {
          return false;
        }
        if (!fz.a(h, h)) {
          return false;
        }
        if (!Arrays.equals(i, i)) {
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
        if (!Arrays.equals(k, k)) {
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
        if (p != p) {
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
        if (!Arrays.equals(r, r)) {
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
        if (t != t) {
          return false;
        }
        if (!fz.a(u, u)) {
          return false;
        }
        if (v != v) {
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
        if ((ag != null) && (!ag.a())) {
          break;
        }
      } while ((ag == null) || (ag.a()));
      return false;
      return ag.equals(ag);
    }
    
    public final int hashCode()
    {
      int i12 = 0;
      int i13 = getClass().getName().hashCode();
      int i14 = (int)(a ^ a >>> 32);
      int i15 = (int)(b ^ b >>> 32);
      int i16 = (int)(c ^ c >>> 32);
      int i1;
      int i17;
      int i18;
      int i2;
      label92:
      int i19;
      int i20;
      int i3;
      label119:
      int i21;
      int i4;
      label138:
      int i5;
      label148:
      int i6;
      label158:
      int i7;
      label168:
      int i22;
      int i8;
      label193:
      int i23;
      int i9;
      label212:
      int i24;
      int i25;
      int i26;
      int i10;
      if (d == null)
      {
        i1 = 0;
        i17 = e;
        i18 = f;
        if (!g) {
          break label436;
        }
        i2 = 1231;
        i19 = fz.a(h);
        i20 = Arrays.hashCode(i);
        if (j != null) {
          break label443;
        }
        i3 = 0;
        i21 = Arrays.hashCode(k);
        if (l != null) {
          break label454;
        }
        i4 = 0;
        if (m != null) {
          break label466;
        }
        i5 = 0;
        if (n != null) {
          break label478;
        }
        i6 = 0;
        if (o != null) {
          break label490;
        }
        i7 = 0;
        i22 = (int)(p ^ p >>> 32);
        if (q != null) {
          break label502;
        }
        i8 = 0;
        i23 = Arrays.hashCode(r);
        if (s != null) {
          break label514;
        }
        i9 = 0;
        i24 = t;
        i25 = fz.a(u);
        i26 = (int)(v ^ v >>> 32);
        if (w != null) {
          break label526;
        }
        i10 = 0;
        label252:
        i11 = i12;
        if (ag != null) {
          if (!ag.a()) {
            break label538;
          }
        }
      }
      label436:
      label443:
      label454:
      label466:
      label478:
      label490:
      label502:
      label514:
      label526:
      label538:
      for (int i11 = i12;; i11 = ag.hashCode())
      {
        return (i10 + ((((i9 + ((i8 + ((i7 + (i6 + (i5 + (i4 + ((i3 + (((i2 + (((i1 + ((((i13 + 527) * 31 + i14) * 31 + i15) * 31 + i16) * 31) * 31 + i17) * 31 + i18) * 31) * 31 + i19) * 31 + i20) * 31) * 31 + i21) * 31) * 31) * 31) * 31) * 31 + i22) * 31) * 31 + i23) * 31) * 31 + i24) * 31 + i25) * 31 + i26) * 31) * 31 + i11;
        i1 = d.hashCode();
        break;
        i2 = 1237;
        break label92;
        i3 = j.hashCode();
        break label119;
        i4 = l.hashCode();
        break label138;
        i5 = m.hashCode();
        break label148;
        i6 = n.hashCode();
        break label158;
        i7 = o.hashCode();
        break label168;
        i8 = q.hashCode();
        break label193;
        i9 = s.hashCode();
        break label212;
        i10 = w.hashCode();
        break label252;
      }
    }
  }
  
  public static final class e
    extends fv<e>
    implements Cloneable
  {
    private static volatile e[] c;
    public String a = "";
    public String b = "";
    
    public e()
    {
      ag = null;
      ah = -1;
    }
    
    public static e[] b()
    {
      if (c == null) {}
      synchronized (fz.c)
      {
        if (c == null) {
          c = new e[0];
        }
        return c;
      }
    }
    
    private e g()
    {
      try
      {
        e locale = (e)super.c();
        return locale;
      }
      catch (CloneNotSupportedException localCloneNotSupportedException)
      {
        throw new AssertionError(localCloneNotSupportedException);
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
      j = i;
      if (b != null)
      {
        j = i;
        if (!b.equals("")) {
          j = i + fu.b(2, b);
        }
      }
      return j;
    }
    
    public final void a(fu paramfu)
    {
      if ((a != null) && (!a.equals(""))) {
        paramfu.a(1, a);
      }
      if ((b != null) && (!b.equals(""))) {
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
  
  public static final class f
    extends fv<f>
    implements Cloneable
  {
    public int a = -1;
    public int b = 0;
    
    public f()
    {
      ag = null;
      ah = -1;
    }
    
    private f b()
    {
      try
      {
        f localf = (f)super.c();
        return localf;
      }
      catch (CloneNotSupportedException localCloneNotSupportedException)
      {
        throw new AssertionError(localCloneNotSupportedException);
      }
    }
    
    protected final int a()
    {
      int j = super.a();
      int i = j;
      if (a != -1) {
        i = j + fu.b(1, a);
      }
      j = i;
      if (b != 0) {
        j = i + fu.b(2, b);
      }
      return j;
    }
    
    public final void a(fu paramfu)
    {
      if (a != -1) {
        paramfu.a(1, a);
      }
      if (b != 0) {
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
        if (!(paramObject instanceof f)) {
          return false;
        }
        paramObject = (f)paramObject;
        if (a != a) {
          return false;
        }
        if (b != b) {
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
      int k = a;
      int m = b;
      if ((ag == null) || (ag.a())) {}
      for (int i = 0;; i = ag.hashCode()) {
        return i + (((j + 527) * 31 + k) * 31 + m) * 31;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/gf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */