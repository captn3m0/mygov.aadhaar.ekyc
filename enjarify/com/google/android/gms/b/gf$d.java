package com.google.android.gms.b;

import java.util.Arrays;

public final class gf$d
  extends fv
  implements Cloneable
{
  public long a;
  public long b;
  public long c;
  public String d;
  public int e;
  public int f;
  public boolean g;
  public gf.e[] h;
  public byte[] i;
  public gf.b j;
  public byte[] k;
  public String l;
  public String m;
  public gf.a n;
  public String o;
  public long p;
  public gf.c q;
  public byte[] r;
  public String s;
  public int t;
  public int[] u;
  public long v;
  public gf.f w;
  
  public gf$d()
  {
    a = l1;
    b = l1;
    c = l1;
    d = "";
    e = 0;
    f = 0;
    g = false;
    Object localObject = gf.e.b();
    h = ((gf.e[])localObject);
    localObject = ge.l;
    i = ((byte[])localObject);
    j = null;
    localObject = ge.l;
    k = ((byte[])localObject);
    l = "";
    m = "";
    n = null;
    o = "";
    p = 180000L;
    q = null;
    localObject = ge.l;
    r = ((byte[])localObject);
    s = "";
    t = 0;
    localObject = ge.e;
    u = ((int[])localObject);
    v = l1;
    w = null;
    ag = null;
    ah = -1;
  }
  
  private d b()
  {
    int i1;
    try
    {
      Object localObject1 = super.c();
      localObject1 = (d)localObject1;
      localObject2 = h;
      if (localObject2 != null)
      {
        localObject2 = h;
        i1 = localObject2.length;
        if (i1 > 0)
        {
          localObject2 = new gf.e[h.length];
          h = ((gf.e[])localObject2);
          i1 = 0;
          localObject2 = null;
          for (int i2 = 0;; i2 = i1)
          {
            localObject2 = h;
            i1 = localObject2.length;
            if (i2 >= i1) {
              break;
            }
            localObject2 = h[i2];
            if (localObject2 != null)
            {
              gf.e[] arrayOfe = h;
              localObject2 = (gf.e)h[i2].clone();
              arrayOfe[i2] = localObject2;
            }
            i1 = i2 + 1;
          }
        }
      }
      localObject2 = j;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      localObject2 = new java/lang/AssertionError;
      ((AssertionError)localObject2).<init>(localCloneNotSupportedException);
      throw ((Throwable)localObject2);
    }
    if (localObject2 != null)
    {
      localObject2 = (gf.b)j.clone();
      j = ((gf.b)localObject2);
    }
    Object localObject2 = n;
    if (localObject2 != null)
    {
      localObject2 = (gf.a)n.clone();
      n = ((gf.a)localObject2);
    }
    localObject2 = q;
    if (localObject2 != null)
    {
      localObject2 = (gf.c)q.clone();
      q = ((gf.c)localObject2);
    }
    localObject2 = u;
    if (localObject2 != null)
    {
      localObject2 = u;
      i1 = localObject2.length;
      if (i1 > 0)
      {
        localObject2 = (int[])u.clone();
        u = ((int[])localObject2);
      }
    }
    localObject2 = w;
    if (localObject2 != null)
    {
      localObject2 = (gf.f)w.clone();
      w = ((gf.f)localObject2);
    }
    return localCloneNotSupportedException;
  }
  
  protected final int a()
  {
    int i1 = 0;
    Object localObject1 = null;
    long l1 = 0L;
    int i5 = super.a();
    long l2 = a;
    boolean bool4 = l2 < l1;
    if (bool4)
    {
      l3 = a;
      int i6 = fu.c(1, l3);
      i5 += i6;
    }
    Object localObject2 = d;
    int i7;
    if (localObject2 != null)
    {
      localObject2 = d;
      localObject3 = "";
      boolean bool5 = ((String)localObject2).equals(localObject3);
      if (!bool5)
      {
        localObject3 = d;
        i7 = fu.b(2, (String)localObject3);
        i5 += i7;
      }
    }
    localObject2 = h;
    int i17;
    int i18;
    if (localObject2 != null)
    {
      localObject2 = h;
      i7 = localObject2.length;
      if (i7 > 0)
      {
        i7 = i5;
        i5 = 0;
        for (;;)
        {
          localObject3 = h;
          i17 = localObject3.length;
          if (i5 >= i17) {
            break;
          }
          localObject3 = h[i5];
          if (localObject3 != null)
          {
            i18 = 3;
            i17 = fu.b(i18, (gb)localObject3);
            i7 += i17;
          }
          i5 += 1;
        }
        i5 = i7;
      }
    }
    localObject2 = i;
    Object localObject3 = ge.l;
    boolean bool6 = Arrays.equals((byte[])localObject2, (byte[])localObject3);
    if (!bool6)
    {
      localObject3 = i;
      int i8 = fu.b(4, (byte[])localObject3);
      i5 += i8;
    }
    localObject2 = k;
    localObject3 = ge.l;
    boolean bool7 = Arrays.equals((byte[])localObject2, (byte[])localObject3);
    int i9;
    if (!bool7)
    {
      localObject3 = k;
      i9 = fu.b(6, (byte[])localObject3);
      i5 += i9;
    }
    localObject2 = n;
    if (localObject2 != null)
    {
      localObject3 = n;
      i9 = fu.b(7, (gb)localObject3);
      i5 += i9;
    }
    localObject2 = l;
    int i10;
    if (localObject2 != null)
    {
      localObject2 = l;
      localObject3 = "";
      boolean bool8 = ((String)localObject2).equals(localObject3);
      if (!bool8)
      {
        localObject3 = l;
        i10 = fu.b(8, (String)localObject3);
        i5 += i10;
      }
    }
    localObject2 = j;
    if (localObject2 != null)
    {
      localObject3 = j;
      i10 = fu.b(9, (gb)localObject3);
      i5 += i10;
    }
    boolean bool9 = g;
    if (bool9)
    {
      i11 = fu.b(10) + 1;
      i5 += i11;
    }
    int i11 = e;
    if (i11 != 0)
    {
      i17 = e;
      i11 = fu.b(11, i17);
      i5 += i11;
    }
    i11 = f;
    if (i11 != 0)
    {
      i17 = f;
      i11 = fu.b(12, i17);
      i5 += i11;
    }
    localObject2 = m;
    if (localObject2 != null)
    {
      localObject2 = m;
      localObject3 = "";
      boolean bool10 = ((String)localObject2).equals(localObject3);
      if (!bool10)
      {
        localObject3 = m;
        int i12 = fu.b(13, (String)localObject3);
        i5 += i12;
      }
    }
    localObject2 = o;
    if (localObject2 != null)
    {
      localObject2 = o;
      localObject3 = "";
      boolean bool11 = ((String)localObject2).equals(localObject3);
      if (!bool11)
      {
        localObject3 = o;
        int i13 = fu.b(14, (String)localObject3);
        i5 += i13;
      }
    }
    l2 = p;
    long l3 = 180000L;
    boolean bool12 = l2 < l3;
    int i14;
    if (bool12)
    {
      l2 = p;
      i18 = fu.b(15);
      l2 = fu.c(l2);
      i14 = fu.b(l2) + i18;
      i5 += i14;
    }
    localObject2 = q;
    if (localObject2 != null)
    {
      localObject3 = q;
      i14 = fu.b(16, (gb)localObject3);
      i5 += i14;
    }
    l2 = b;
    boolean bool13 = l2 < l1;
    if (bool13)
    {
      l3 = b;
      int i15 = fu.c(17, l3);
      i5 += i15;
    }
    localObject2 = r;
    localObject3 = ge.l;
    boolean bool14 = Arrays.equals((byte[])localObject2, (byte[])localObject3);
    if (!bool14)
    {
      localObject3 = r;
      i16 = fu.b(18, (byte[])localObject3);
      i5 += i16;
    }
    int i16 = t;
    if (i16 != 0)
    {
      i17 = t;
      i16 = fu.b(19, i17);
      i5 += i16;
    }
    localObject2 = u;
    if (localObject2 != null)
    {
      localObject2 = u;
      i16 = localObject2.length;
      if (i16 > 0)
      {
        i16 = 0;
        localObject2 = null;
        for (;;)
        {
          localObject3 = u;
          i17 = localObject3.length;
          if (i1 >= i17) {
            break;
          }
          localObject3 = u;
          i17 = fu.a(localObject3[i1]);
          i16 += i17;
          i1 += 1;
        }
        i5 += i16;
        localObject1 = u;
        i1 = localObject1.length * 2;
        i5 += i1;
      }
    }
    l2 = c;
    boolean bool1 = l2 < l1;
    if (bool1)
    {
      l2 = c;
      int i2 = fu.c(21, l2);
      i5 += i2;
    }
    l2 = v;
    boolean bool2 = l2 < l1;
    int i3;
    if (bool2)
    {
      l2 = v;
      i3 = fu.c(22, l2);
      i5 += i3;
    }
    localObject1 = w;
    if (localObject1 != null)
    {
      localObject2 = w;
      i3 = fu.b(23, (gb)localObject2);
      i5 += i3;
    }
    localObject1 = s;
    if (localObject1 != null)
    {
      localObject1 = s;
      localObject2 = "";
      boolean bool3 = ((String)localObject1).equals(localObject2);
      if (!bool3)
      {
        localObject2 = s;
        int i4 = fu.b(24, (String)localObject2);
        i5 += i4;
      }
    }
    return i5;
  }
  
  public final void a(fu paramfu)
  {
    int i1 = 0;
    Object localObject1 = null;
    long l1 = 0L;
    long l2 = a;
    int i2 = l2 < l1;
    if (i2 != 0)
    {
      i2 = 1;
      l2 = a;
      paramfu.b(i2, l2);
    }
    Object localObject2 = d;
    int i3;
    if (localObject2 != null)
    {
      localObject2 = d;
      localObject3 = "";
      boolean bool1 = ((String)localObject2).equals(localObject3);
      if (!bool1)
      {
        i3 = 2;
        localObject3 = d;
        paramfu.a(i3, (String)localObject3);
      }
    }
    localObject2 = h;
    if (localObject2 != null)
    {
      localObject2 = h;
      i3 = localObject2.length;
      if (i3 > 0)
      {
        i3 = 0;
        localObject2 = null;
        for (;;)
        {
          localObject3 = h;
          int i16 = localObject3.length;
          if (i3 >= i16) {
            break;
          }
          localObject3 = h[i3];
          if (localObject3 != null)
          {
            int i18 = 3;
            paramfu.a(i18, (gb)localObject3);
          }
          i3 += 1;
        }
      }
    }
    localObject2 = i;
    Object localObject3 = ge.l;
    boolean bool2 = Arrays.equals((byte[])localObject2, (byte[])localObject3);
    if (!bool2)
    {
      int i4 = 4;
      localObject3 = i;
      paramfu.a(i4, (byte[])localObject3);
    }
    localObject2 = k;
    localObject3 = ge.l;
    boolean bool3 = Arrays.equals((byte[])localObject2, (byte[])localObject3);
    int i5;
    if (!bool3)
    {
      i5 = 6;
      localObject3 = k;
      paramfu.a(i5, (byte[])localObject3);
    }
    localObject2 = n;
    if (localObject2 != null)
    {
      i5 = 7;
      localObject3 = n;
      paramfu.a(i5, (gb)localObject3);
    }
    localObject2 = l;
    int i6;
    if (localObject2 != null)
    {
      localObject2 = l;
      localObject3 = "";
      boolean bool4 = ((String)localObject2).equals(localObject3);
      if (!bool4)
      {
        i6 = 8;
        localObject3 = l;
        paramfu.a(i6, (String)localObject3);
      }
    }
    localObject2 = j;
    if (localObject2 != null)
    {
      i6 = 9;
      localObject3 = j;
      paramfu.a(i6, (gb)localObject3);
    }
    boolean bool5 = g;
    if (bool5)
    {
      i7 = 10;
      boolean bool14 = g;
      paramfu.a(i7, bool14);
    }
    int i7 = e;
    int i17;
    if (i7 != 0)
    {
      i7 = 11;
      i17 = e;
      paramfu.a(i7, i17);
    }
    i7 = f;
    if (i7 != 0)
    {
      i7 = 12;
      i17 = f;
      paramfu.a(i7, i17);
    }
    localObject2 = m;
    if (localObject2 != null)
    {
      localObject2 = m;
      localObject3 = "";
      boolean bool6 = ((String)localObject2).equals(localObject3);
      if (!bool6)
      {
        int i8 = 13;
        localObject3 = m;
        paramfu.a(i8, (String)localObject3);
      }
    }
    localObject2 = o;
    if (localObject2 != null)
    {
      localObject2 = o;
      localObject3 = "";
      boolean bool7 = ((String)localObject2).equals(localObject3);
      if (!bool7)
      {
        int i9 = 14;
        localObject3 = o;
        paramfu.a(i9, (String)localObject3);
      }
    }
    l2 = p;
    long l3 = 180000L;
    boolean bool8 = l2 < l3;
    int i10;
    if (bool8)
    {
      l2 = p;
      i10 = 15;
      paramfu.c(i10, 0);
      l2 = fu.c(l2);
      paramfu.a(l2);
    }
    localObject2 = q;
    if (localObject2 != null)
    {
      i10 = 16;
      localObject3 = q;
      paramfu.a(i10, (gb)localObject3);
    }
    l2 = b;
    boolean bool9 = l2 < l1;
    if (bool9)
    {
      int i11 = 17;
      l2 = b;
      paramfu.b(i11, l2);
    }
    localObject2 = r;
    localObject3 = ge.l;
    boolean bool10 = Arrays.equals((byte[])localObject2, (byte[])localObject3);
    if (!bool10)
    {
      i12 = 18;
      localObject3 = r;
      paramfu.a(i12, (byte[])localObject3);
    }
    int i12 = t;
    if (i12 != 0)
    {
      i12 = 19;
      i17 = t;
      paramfu.a(i12, i17);
    }
    localObject2 = u;
    if (localObject2 != null)
    {
      localObject2 = u;
      i12 = localObject2.length;
      if (i12 > 0) {
        for (;;)
        {
          localObject2 = u;
          i12 = localObject2.length;
          if (i1 >= i12) {
            break;
          }
          i12 = 20;
          localObject3 = u;
          i17 = localObject3[i1];
          paramfu.a(i12, i17);
          i1 += 1;
        }
      }
    }
    long l4 = c;
    boolean bool11 = l4 < l1;
    if (bool11)
    {
      int i13 = 21;
      l2 = c;
      paramfu.b(i13, l2);
    }
    l4 = v;
    boolean bool12 = l4 < l1;
    int i14;
    if (bool12)
    {
      i14 = 22;
      l2 = v;
      paramfu.b(i14, l2);
    }
    localObject2 = w;
    if (localObject2 != null)
    {
      i14 = 23;
      localObject1 = w;
      paramfu.a(i14, (gb)localObject1);
    }
    localObject2 = s;
    if (localObject2 != null)
    {
      localObject2 = s;
      localObject1 = "";
      boolean bool13 = ((String)localObject2).equals(localObject1);
      if (!bool13)
      {
        int i15 = 24;
        localObject1 = s;
        paramfu.a(i15, (String)localObject1);
      }
    }
    super.a(paramfu);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    fx localfx1 = null;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof d;
      fx localfx2;
      if (!bool2)
      {
        bool1 = false;
        localfx2 = null;
      }
      else
      {
        paramObject = (d)paramObject;
        long l1 = a;
        long l2 = a;
        bool2 = l1 < l2;
        if (bool2)
        {
          bool1 = false;
          localfx2 = null;
        }
        else
        {
          l1 = b;
          l2 = b;
          bool2 = l1 < l2;
          if (bool2)
          {
            bool1 = false;
            localfx2 = null;
          }
          else
          {
            l1 = c;
            l2 = c;
            bool2 = l1 < l2;
            if (bool2)
            {
              bool1 = false;
              localfx2 = null;
            }
            else
            {
              Object localObject1 = d;
              Object localObject2;
              if (localObject1 == null)
              {
                localObject1 = d;
                if (localObject1 != null)
                {
                  bool1 = false;
                  localfx2 = null;
                }
              }
              else
              {
                localObject1 = d;
                localObject2 = d;
                bool2 = ((String)localObject1).equals(localObject2);
                if (!bool2)
                {
                  bool1 = false;
                  localfx2 = null;
                  continue;
                }
              }
              int i1 = e;
              int i3 = e;
              if (i1 != i3)
              {
                bool1 = false;
                localfx2 = null;
              }
              else
              {
                i1 = f;
                i3 = f;
                if (i1 != i3)
                {
                  bool1 = false;
                  localfx2 = null;
                }
                else
                {
                  boolean bool3 = g;
                  boolean bool5 = g;
                  if (bool3 != bool5)
                  {
                    bool1 = false;
                    localfx2 = null;
                  }
                  else
                  {
                    localObject1 = h;
                    localObject2 = h;
                    bool3 = fz.a((Object[])localObject1, (Object[])localObject2);
                    if (!bool3)
                    {
                      bool1 = false;
                      localfx2 = null;
                    }
                    else
                    {
                      localObject1 = i;
                      localObject2 = i;
                      bool3 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
                      if (!bool3)
                      {
                        bool1 = false;
                        localfx2 = null;
                      }
                      else
                      {
                        localObject1 = j;
                        if (localObject1 == null)
                        {
                          localObject1 = j;
                          if (localObject1 != null)
                          {
                            bool1 = false;
                            localfx2 = null;
                          }
                        }
                        else
                        {
                          localObject1 = j;
                          localObject2 = j;
                          bool3 = ((gf.b)localObject1).equals(localObject2);
                          if (!bool3)
                          {
                            bool1 = false;
                            localfx2 = null;
                            continue;
                          }
                        }
                        localObject1 = k;
                        localObject2 = k;
                        bool3 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
                        if (!bool3)
                        {
                          bool1 = false;
                          localfx2 = null;
                        }
                        else
                        {
                          localObject1 = l;
                          if (localObject1 == null)
                          {
                            localObject1 = l;
                            if (localObject1 != null)
                            {
                              bool1 = false;
                              localfx2 = null;
                            }
                          }
                          else
                          {
                            localObject1 = l;
                            localObject2 = l;
                            bool3 = ((String)localObject1).equals(localObject2);
                            if (!bool3)
                            {
                              bool1 = false;
                              localfx2 = null;
                              continue;
                            }
                          }
                          localObject1 = m;
                          if (localObject1 == null)
                          {
                            localObject1 = m;
                            if (localObject1 != null)
                            {
                              bool1 = false;
                              localfx2 = null;
                            }
                          }
                          else
                          {
                            localObject1 = m;
                            localObject2 = m;
                            bool3 = ((String)localObject1).equals(localObject2);
                            if (!bool3)
                            {
                              bool1 = false;
                              localfx2 = null;
                              continue;
                            }
                          }
                          localObject1 = n;
                          if (localObject1 == null)
                          {
                            localObject1 = n;
                            if (localObject1 != null)
                            {
                              bool1 = false;
                              localfx2 = null;
                            }
                          }
                          else
                          {
                            localObject1 = n;
                            localObject2 = n;
                            bool3 = ((gf.a)localObject1).equals(localObject2);
                            if (!bool3)
                            {
                              bool1 = false;
                              localfx2 = null;
                              continue;
                            }
                          }
                          localObject1 = o;
                          if (localObject1 == null)
                          {
                            localObject1 = o;
                            if (localObject1 != null)
                            {
                              bool1 = false;
                              localfx2 = null;
                            }
                          }
                          else
                          {
                            localObject1 = o;
                            localObject2 = o;
                            bool3 = ((String)localObject1).equals(localObject2);
                            if (!bool3)
                            {
                              bool1 = false;
                              localfx2 = null;
                              continue;
                            }
                          }
                          l1 = p;
                          l2 = p;
                          bool3 = l1 < l2;
                          if (bool3)
                          {
                            bool1 = false;
                            localfx2 = null;
                          }
                          else
                          {
                            localObject1 = q;
                            if (localObject1 == null)
                            {
                              localObject1 = q;
                              if (localObject1 != null)
                              {
                                bool1 = false;
                                localfx2 = null;
                              }
                            }
                            else
                            {
                              localObject1 = q;
                              localObject2 = q;
                              bool3 = ((gf.c)localObject1).equals(localObject2);
                              if (!bool3)
                              {
                                bool1 = false;
                                localfx2 = null;
                                continue;
                              }
                            }
                            localObject1 = r;
                            localObject2 = r;
                            bool3 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
                            if (!bool3)
                            {
                              bool1 = false;
                              localfx2 = null;
                            }
                            else
                            {
                              localObject1 = s;
                              if (localObject1 == null)
                              {
                                localObject1 = s;
                                if (localObject1 != null)
                                {
                                  bool1 = false;
                                  localfx2 = null;
                                }
                              }
                              else
                              {
                                localObject1 = s;
                                localObject2 = s;
                                bool3 = ((String)localObject1).equals(localObject2);
                                if (!bool3)
                                {
                                  bool1 = false;
                                  localfx2 = null;
                                  continue;
                                }
                              }
                              int i2 = t;
                              int i4 = t;
                              if (i2 != i4)
                              {
                                bool1 = false;
                                localfx2 = null;
                              }
                              else
                              {
                                localObject1 = u;
                                localObject2 = u;
                                boolean bool4 = fz.a((int[])localObject1, (int[])localObject2);
                                if (!bool4)
                                {
                                  bool1 = false;
                                  localfx2 = null;
                                }
                                else
                                {
                                  l1 = v;
                                  l2 = v;
                                  bool4 = l1 < l2;
                                  if (bool4)
                                  {
                                    bool1 = false;
                                    localfx2 = null;
                                  }
                                  else
                                  {
                                    localObject1 = w;
                                    if (localObject1 == null)
                                    {
                                      localObject1 = w;
                                      if (localObject1 != null)
                                      {
                                        bool1 = false;
                                        localfx2 = null;
                                      }
                                    }
                                    else
                                    {
                                      localObject1 = w;
                                      localObject2 = w;
                                      bool4 = ((gf.f)localObject1).equals(localObject2);
                                      if (!bool4)
                                      {
                                        bool1 = false;
                                        localfx2 = null;
                                        continue;
                                      }
                                    }
                                    localObject1 = ag;
                                    if (localObject1 != null)
                                    {
                                      localObject1 = ag;
                                      bool4 = ((fx)localObject1).a();
                                      if (!bool4) {}
                                    }
                                    else
                                    {
                                      localObject1 = ag;
                                      if (localObject1 == null) {
                                        continue;
                                      }
                                      localObject1 = ag;
                                      bool4 = ((fx)localObject1).a();
                                      if (bool4) {
                                        continue;
                                      }
                                      bool1 = false;
                                      localfx2 = null;
                                      continue;
                                    }
                                    localfx2 = ag;
                                    localfx1 = ag;
                                    bool1 = localfx2.equals(localfx1);
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int i1 = 32;
    int i2 = 0;
    fx localfx = null;
    int i3 = (getClass().getName().hashCode() + 527) * 31;
    long l1 = a;
    long l2 = a >>> i1;
    int i5 = (int)(l1 ^ l2);
    i3 = (i3 + i5) * 31;
    l1 = b;
    l2 = b >>> i1;
    i5 = (int)(l1 ^ l2);
    i3 = (i3 + i5) * 31;
    l1 = c;
    l2 = c >>> i1;
    l1 ^= l2;
    i5 = (int)l1;
    i3 += i5;
    i5 = i3 * 31;
    Object localObject1 = d;
    int i4;
    if (localObject1 == null)
    {
      i3 = 0;
      localObject1 = null;
      i3 = (i3 + i5) * 31;
      i5 = e;
      i3 = (i3 + i5) * 31;
      i5 = f;
      i5 = (i3 + i5) * 31;
      boolean bool1 = g;
      if (!bool1) {
        break label712;
      }
      i4 = 1231;
      label205:
      i4 = (i4 + i5) * 31;
      i5 = fz.a(h);
      i4 = (i4 + i5) * 31;
      Object localObject2 = i;
      i5 = Arrays.hashCode((byte[])localObject2);
      i4 += i5;
      i5 = i4 * 31;
      localObject1 = j;
      if (localObject1 != null) {
        break label720;
      }
      i4 = 0;
      localObject1 = null;
      label278:
      i4 = (i4 + i5) * 31;
      localObject2 = k;
      i5 = Arrays.hashCode((byte[])localObject2);
      i4 += i5;
      i5 = i4 * 31;
      localObject1 = l;
      if (localObject1 != null) {
        break label736;
      }
      i4 = 0;
      localObject1 = null;
      label332:
      i4 += i5;
      i5 = i4 * 31;
      localObject1 = m;
      if (localObject1 != null) {
        break label752;
      }
      i4 = 0;
      localObject1 = null;
      label363:
      i4 += i5;
      i5 = i4 * 31;
      localObject1 = n;
      if (localObject1 != null) {
        break label768;
      }
      i4 = 0;
      localObject1 = null;
      label394:
      i4 += i5;
      i5 = i4 * 31;
      localObject1 = o;
      if (localObject1 != null) {
        break label784;
      }
      i4 = 0;
      localObject1 = null;
      label425:
      i4 = (i4 + i5) * 31;
      l1 = p;
      l2 = p >>> i1;
      l1 ^= l2;
      i5 = (int)l1;
      i4 += i5;
      i5 = i4 * 31;
      localObject1 = q;
      if (localObject1 != null) {
        break label800;
      }
      i4 = 0;
      localObject1 = null;
      label492:
      i4 = (i4 + i5) * 31;
      localObject2 = r;
      i5 = Arrays.hashCode((byte[])localObject2);
      i4 += i5;
      i5 = i4 * 31;
      localObject1 = s;
      if (localObject1 != null) {
        break label816;
      }
      i4 = 0;
      localObject1 = null;
      label546:
      i4 = (i4 + i5) * 31;
      i5 = t;
      i4 = (i4 + i5) * 31;
      localObject2 = u;
      i5 = fz.a((int[])localObject2);
      i4 = (i4 + i5) * 31;
      l1 = v;
      l2 = v >>> i1;
      l1 ^= l2;
      i5 = (int)l1;
      i4 += i5;
      i5 = i4 * 31;
      localObject1 = w;
      if (localObject1 != null) {
        break label832;
      }
      i4 = 0;
      localObject1 = null;
      label652:
      i4 = (i4 + i5) * 31;
      localObject2 = ag;
      if (localObject2 != null)
      {
        localObject2 = ag;
        boolean bool2 = ((fx)localObject2).a();
        if (!bool2) {
          break label848;
        }
      }
    }
    for (;;)
    {
      return i4 + i2;
      localObject1 = d;
      i4 = ((String)localObject1).hashCode();
      break;
      label712:
      i4 = 1237;
      break label205;
      label720:
      localObject1 = j;
      i4 = ((gf.b)localObject1).hashCode();
      break label278;
      label736:
      localObject1 = l;
      i4 = ((String)localObject1).hashCode();
      break label332;
      label752:
      localObject1 = m;
      i4 = ((String)localObject1).hashCode();
      break label363;
      label768:
      localObject1 = n;
      i4 = ((gf.a)localObject1).hashCode();
      break label394;
      label784:
      localObject1 = o;
      i4 = ((String)localObject1).hashCode();
      break label425;
      label800:
      localObject1 = q;
      i4 = ((gf.c)localObject1).hashCode();
      break label492;
      label816:
      localObject1 = s;
      i4 = ((String)localObject1).hashCode();
      break label546;
      label832:
      localObject1 = w;
      i4 = ((gf.f)localObject1).hashCode();
      break label652;
      label848:
      localfx = ag;
      i2 = localfx.hashCode();
    }
  }
}


/* Location:              com/google/android/gms/b/gf$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */