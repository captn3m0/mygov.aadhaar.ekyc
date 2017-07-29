package android.support.v7.widget;

import android.support.v4.g.j.a;
import android.support.v4.g.j.b;
import java.util.ArrayList;
import java.util.List;

final class f
  implements ar.a
{
  final ArrayList a;
  final ArrayList b;
  final f.a c;
  Runnable d;
  final boolean e;
  final ar f;
  private j.a g;
  private int h;
  
  f(f.a parama)
  {
    this(parama, (byte)0);
  }
  
  private f(f.a parama, byte paramByte)
  {
    Object localObject = new android/support/v4/g/j$b;
    ((j.b)localObject).<init>(30);
    g = ((j.a)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    a = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    b = ((ArrayList)localObject);
    h = 0;
    c = parama;
    e = false;
    localObject = new android/support/v7/widget/ar;
    ((ar)localObject).<init>(this);
    f = ((ar)localObject);
  }
  
  private void a(f.b paramb, int paramInt)
  {
    Object localObject1 = c;
    ((f.a)localObject1).a(paramb);
    int i = a;
    int j;
    switch (i)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("only remove and update ops can be dispatched in first pass");
      throw ((Throwable)localObject1);
    case 2: 
      localObject1 = c;
      j = d;
      ((f.a)localObject1).a(paramInt, j);
    }
    for (;;)
    {
      return;
      localObject1 = c;
      j = d;
      Object localObject2 = c;
      ((f.a)localObject1).a(paramInt, j, localObject2);
    }
  }
  
  private void a(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    f.b localb = null;
    for (int k = 0; k < i; k = j)
    {
      localb = (f.b)paramList.get(k);
      a(localb);
      j = k + 1;
    }
    paramList.clear();
  }
  
  private int b(int paramInt1, int paramInt2)
  {
    int i = 8;
    int j = 2;
    int k = 1;
    Object localObject = b;
    int m = ((ArrayList)localObject).size() + -1;
    int n = m;
    int i1 = paramInt1;
    int i3;
    if (n >= 0)
    {
      localObject = (f.b)b.get(n);
      i2 = a;
      if (i2 == i)
      {
        i2 = b;
        i3 = d;
        if (i2 < i3)
        {
          i3 = b;
          i2 = d;
          label98:
          if ((i1 < i3) || (i1 > i2)) {
            break label265;
          }
          i2 = b;
          if (i3 != i2) {
            break label209;
          }
          if (paramInt2 != k) {
            break label184;
          }
          i2 = d + 1;
          d = i2;
          label148:
          m = i1 + 1;
        }
      }
      for (;;)
      {
        n += -1;
        i1 = m;
        break;
        i3 = d;
        i2 = b;
        break label98;
        label184:
        if (paramInt2 != j) {
          break label148;
        }
        i2 = d + -1;
        d = i2;
        break label148;
        label209:
        if (paramInt2 == k)
        {
          i2 = b + 1;
          b = i2;
        }
        for (;;)
        {
          m = i1 + -1;
          break;
          if (paramInt2 == j)
          {
            i2 = b + -1;
            b = i2;
          }
        }
        label265:
        i2 = b;
        if (i1 < i2)
        {
          if (paramInt2 == k)
          {
            i2 = b + 1;
            b = i2;
            i2 = d + 1;
            d = i2;
            m = i1;
            continue;
          }
          if (paramInt2 == j)
          {
            i2 = b + -1;
            b = i2;
            i2 = d + -1;
            d = i2;
          }
        }
        m = i1;
        continue;
        i2 = b;
        if (i2 <= i1)
        {
          i2 = a;
          if (i2 == k)
          {
            m = d;
            m = i1 - m;
            continue;
          }
          i2 = a;
          if (i2 == j) {
            m = d + i1;
          }
        }
        else
        {
          if (paramInt2 == k)
          {
            i2 = b + 1;
            b = i2;
            m = i1;
            continue;
          }
          if (paramInt2 == j)
          {
            i2 = b + -1;
            b = i2;
          }
        }
        m = i1;
      }
    }
    localObject = b;
    m = ((ArrayList)localObject).size() + -1;
    int i2 = m;
    if (i2 >= 0)
    {
      localObject = (f.b)b.get(i2);
      i3 = a;
      ArrayList localArrayList;
      if (i3 == i)
      {
        i3 = d;
        n = b;
        if (i3 != n)
        {
          i3 = d;
          if (i3 >= 0) {}
        }
        else
        {
          localArrayList = b;
          localArrayList.remove(i2);
          a((f.b)localObject);
        }
      }
      for (;;)
      {
        m = i2 + -1;
        i2 = m;
        break;
        i3 = d;
        if (i3 <= 0)
        {
          localArrayList = b;
          localArrayList.remove(i2);
          a((f.b)localObject);
        }
      }
    }
    return i1;
  }
  
  private void b(f.b paramb)
  {
    int i = 1;
    int j = a;
    if (j != i)
    {
      j = a;
      k = 8;
      if (j != k) {}
    }
    else
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("should not dispatch add or move for pre layout");
      throw ((Throwable)localObject1);
    }
    j = b;
    int k = a;
    int m = b(j, k);
    k = b;
    j = a;
    int n;
    int i1;
    label154:
    int i2;
    int i3;
    switch (j)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("op should be remove or update.");
      localObject2 = paramb;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 4: 
      j = i;
      n = i;
      i1 = m;
      m = k;
      k = i;
      i2 = d;
      if (k >= i2) {
        break label384;
      }
      i2 = b;
      i3 = j * k;
      i2 += i3;
      i3 = a;
      i3 = b(i2, i3);
      i2 = a;
      switch (i2)
      {
      default: 
        i2 = 0;
        label239:
        if (i2 != 0) {
          n += 1;
        }
        break;
      }
      break;
    }
    for (;;)
    {
      k += 1;
      break label154;
      j = 0;
      localObject1 = null;
      break;
      i2 = i1 + 1;
      if (i3 == i2)
      {
        i2 = i;
        break label239;
      }
      i2 = 0;
      break label239;
      if (i3 == i1)
      {
        i2 = i;
        break label239;
      }
      i2 = 0;
      break label239;
      i2 = a;
      Object localObject3 = c;
      f.b localb = a(i2, i1, n, localObject3);
      a(localb, m);
      a(localb);
      i1 = a;
      i2 = 4;
      if (i1 == i2) {
        m += n;
      }
      n = i;
      i1 = i3;
    }
    label384:
    Object localObject1 = c;
    a(paramb);
    if (n > 0)
    {
      i = a;
      localObject1 = a(i, i1, n, localObject1);
      a((f.b)localObject1, m);
      a((f.b)localObject1);
    }
  }
  
  private void c(f.b paramb)
  {
    Object localObject1 = b;
    ((ArrayList)localObject1).add(paramb);
    int i = a;
    int j;
    int k;
    switch (i)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Unknown update op type for ");
      localObject2 = paramb;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 1: 
      localObject1 = c;
      j = b;
      k = d;
      ((f.a)localObject1).c(j, k);
    }
    for (;;)
    {
      return;
      localObject1 = c;
      j = b;
      k = d;
      ((f.a)localObject1).d(j, k);
      continue;
      localObject1 = c;
      j = b;
      k = d;
      ((f.a)localObject1).b(j, k);
      continue;
      localObject1 = c;
      j = b;
      k = d;
      Object localObject3 = c;
      ((f.a)localObject1).a(j, k, localObject3);
    }
  }
  
  private boolean c(int paramInt)
  {
    int i = 1;
    Object localObject = b;
    int j = ((ArrayList)localObject).size();
    int k = 0;
    int m;
    int n;
    int i1;
    if (k < j)
    {
      localObject = (f.b)b.get(k);
      m = a;
      n = 8;
      if (m == n)
      {
        i1 = d;
        m = k + 1;
        i1 = a(i1, m);
        if (i1 != paramInt) {
          break label168;
        }
        i1 = i;
      }
    }
    for (;;)
    {
      return i1;
      m = a;
      if (m == i)
      {
        m = b;
        n = d;
        m += n;
        i1 = b;
        for (;;)
        {
          if (i1 >= m) {
            break label168;
          }
          n = k + 1;
          n = a(i1, n);
          if (n == paramInt)
          {
            i1 = i;
            break;
          }
          i1 += 1;
        }
      }
      label168:
      i1 = k + 1;
      k = i1;
      break;
      i1 = 0;
      localObject = null;
    }
  }
  
  final int a(int paramInt1, int paramInt2)
  {
    Object localObject = b;
    int i = ((ArrayList)localObject).size();
    int j = paramInt1;
    int k;
    int m;
    if (paramInt2 < i)
    {
      localObject = (f.b)b.get(paramInt2);
      k = a;
      m = 8;
      if (k == m)
      {
        k = b;
        if (k == j) {
          j = d;
        }
      }
    }
    for (;;)
    {
      paramInt2 += 1;
      break;
      k = b;
      if (k < j) {
        j += -1;
      }
      int n = d;
      if (n <= j)
      {
        j += 1;
        continue;
        k = b;
        if (k <= j)
        {
          k = a;
          m = 2;
          if (k == m)
          {
            k = b;
            m = d;
            k += m;
            if (j < k)
            {
              j = -1;
              return j;
            }
            n = d;
            j -= n;
          }
          else
          {
            k = a;
            m = 1;
            if (k == m)
            {
              n = d;
              j += n;
            }
          }
        }
      }
    }
  }
  
  public final f.b a(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    f.b localb = (f.b)g.a();
    if (localb == null)
    {
      localb = new android/support/v7/widget/f$b;
      localb.<init>(paramInt1, paramInt2, paramInt3, paramObject);
    }
    for (;;)
    {
      return localb;
      a = paramInt1;
      b = paramInt2;
      d = paramInt3;
      c = paramObject;
    }
  }
  
  final void a()
  {
    ArrayList localArrayList = a;
    a(localArrayList);
    localArrayList = b;
    a(localArrayList);
    h = 0;
  }
  
  public final void a(f.b paramb)
  {
    boolean bool = e;
    if (!bool)
    {
      bool = false;
      c = null;
      j.a locala = g;
      locala.a(paramb);
    }
  }
  
  final boolean a(int paramInt)
  {
    int i = h & paramInt;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  final int b(int paramInt)
  {
    return a(paramInt, 0);
  }
  
  final void b()
  {
    ar localar = f;
    ArrayList localArrayList = a;
    int i;
    float f1;
    Object localObject1;
    int k;
    label32:
    Object localObject2;
    int m;
    int n;
    label76:
    int i1;
    Object localObject3;
    int i3;
    for (;;)
    {
      i = 0;
      f1 = 0.0F;
      localObject1 = null;
      j = localArrayList.size();
      k = j + -1;
      if (k < 0) {
        break label391;
      }
      localObject2 = (f.b)localArrayList.get(k);
      j = a;
      m = 8;
      if (j != m) {
        break;
      }
      if (i == 0) {
        break label2670;
      }
      n = k;
      j = -1;
      f2 = 0.0F / 0.0F;
      if (n == j) {
        break label1822;
      }
      i1 = n + 1;
      localObject2 = (f.b)localArrayList.get(n);
      localObject1 = (f.b)localArrayList.get(i1);
      k = a;
      switch (k)
      {
      case 3: 
      default: 
        break;
      case 1: 
        k = 0;
        localObject3 = null;
        m = d;
        i3 = b;
        if (m < i3) {
          k = -1;
        }
        m = b;
        i3 = b;
        if (m < i3) {
          k += 1;
        }
        m = b;
        i3 = b;
        if (m <= i3)
        {
          m = b;
          i3 = d;
          m += i3;
          b = m;
        }
        m = b;
        i3 = d;
        if (m <= i3)
        {
          m = d;
          i3 = d;
          m += i3;
          d = m;
        }
        m = b;
        k += m;
        b = k;
        localArrayList.set(n, localObject1);
        localArrayList.set(i1, localObject2);
      }
    }
    int j = 1;
    for (float f2 = Float.MIN_VALUE;; f2 = f1)
    {
      k += -1;
      i = j;
      f1 = f2;
      break label32;
      label391:
      j = -1;
      f2 = 0.0F / 0.0F;
      n = j;
      break label76;
      i3 = 0;
      float f3 = 0.0F;
      f.b localb = null;
      m = 0;
      Object localObject4 = null;
      k = b;
      int i5 = d;
      if (k < i5)
      {
        k = 0;
        localObject3 = null;
        i5 = b;
        int i13 = b;
        if (i5 == i13)
        {
          i5 = d;
          int i14 = d;
          int i25 = b;
          i14 -= i25;
          if (i5 == i14) {
            m = 1;
          }
        }
        label507:
        i5 = d;
        int i15 = b;
        if (i5 >= i15) {
          break label691;
        }
        i5 = b + -1;
        b = i5;
        label544:
        i5 = b;
        int i16 = b;
        if (i5 > i16) {
          break label797;
        }
        i5 = b + 1;
        b = i5;
      }
      label691:
      label797:
      Object localObject5;
      for (;;)
      {
        if (m == 0) {
          break label928;
        }
        localArrayList.set(n, localObject1);
        localArrayList.remove(i1);
        localObject1 = a;
        ((ar.a)localObject1).a((f.b)localObject2);
        break;
        k = 1;
        i5 = b;
        int i17 = d + 1;
        if (i5 != i17) {
          break label507;
        }
        i5 = d;
        int i18 = b;
        int i26 = d;
        i18 -= i26;
        if (i5 != i18) {
          break label507;
        }
        m = 1;
        break label507;
        i5 = d;
        int i19 = b;
        int i27 = d;
        i19 += i27;
        if (i5 >= i19) {
          break label544;
        }
        k = d + -1;
        d = k;
        a = 2;
        k = 1;
        d = k;
        j = d;
        if (j != 0) {
          break;
        }
        localArrayList.remove(i1);
        localObject2 = a;
        ((ar.a)localObject2).a((f.b)localObject1);
        break;
        i5 = b;
        int i20 = b;
        int i28 = d;
        i20 += i28;
        if (i5 < i20)
        {
          i3 = b;
          i5 = d;
          i3 += i5;
          int i6 = b;
          i3 -= i6;
          localObject5 = a;
          int i29 = b + 1;
          localb = ((ar.a)localObject5).a(2, i29, i3, null);
          i7 = b;
          int i21 = b;
          i7 -= i21;
          d = i7;
        }
      }
      label928:
      if (k != 0)
      {
        if (localb != null)
        {
          k = b;
          m = b;
          if (k > m)
          {
            k = b;
            m = d;
            k -= m;
            b = k;
          }
          k = d;
          m = b;
          if (k > m)
          {
            k = d;
            m = d;
            k -= m;
            d = k;
          }
        }
        k = b;
        m = b;
        if (k > m)
        {
          k = b;
          m = d;
          k -= m;
          b = k;
        }
        k = d;
        m = b;
        if (k > m)
        {
          k = d;
          m = d;
          k -= m;
          d = k;
        }
        label1134:
        localArrayList.set(n, localObject1);
        i = b;
        k = d;
        if (i == k) {
          break label1397;
        }
        localArrayList.set(i1, localObject2);
      }
      while (localb != null)
      {
        localArrayList.add(n, localb);
        break;
        if (localb != null)
        {
          k = b;
          m = b;
          if (k >= m)
          {
            k = b;
            m = d;
            k -= m;
            b = k;
          }
          k = d;
          m = b;
          if (k >= m)
          {
            k = d;
            m = d;
            k -= m;
            d = k;
          }
        }
        k = b;
        m = b;
        if (k >= m)
        {
          k = b;
          m = d;
          k -= m;
          b = k;
        }
        k = d;
        m = b;
        if (k < m) {
          break label1134;
        }
        k = d;
        m = d;
        k -= m;
        d = k;
        break label1134;
        label1397:
        localArrayList.remove(i1);
      }
      k = 0;
      localObject3 = null;
      m = 0;
      localObject4 = null;
      i3 = d;
      int i7 = b;
      if (i3 < i7)
      {
        i3 = b + -1;
        b = i3;
        label1458:
        i3 = b;
        int i8 = b;
        if (i3 > i8) {
          break label1663;
        }
        i3 = b + 1;
        b = i3;
        label1495:
        localArrayList.set(i1, localObject2);
        j = d;
        if (j <= 0) {
          break label1795;
        }
        localArrayList.set(n, localObject1);
      }
      for (;;)
      {
        if (localObject3 != null) {
          localArrayList.add(n, localObject3);
        }
        if (localObject4 == null) {
          break;
        }
        localArrayList.add(n, localObject4);
        break;
        i3 = d;
        int i9 = b;
        int i22 = d;
        i9 += i22;
        if (i3 >= i9) {
          break label1458;
        }
        k = d + -1;
        d = k;
        localObject3 = a;
        i3 = 4;
        f3 = 5.6E-45F;
        int i10 = b;
        int i23 = 1;
        Object localObject6 = c;
        localObject3 = ((ar.a)localObject3).a(i3, i10, i23, localObject6);
        break label1458;
        label1663:
        i3 = b;
        i10 = b;
        i23 = d;
        i10 += i23;
        if (i3 >= i10) {
          break label1495;
        }
        m = b;
        i3 = d;
        m += i3;
        i3 = b;
        i3 = m - i3;
        localObject4 = a;
        int i24 = b + 1;
        localObject6 = c;
        localObject4 = ((ar.a)localObject4).a(4, i24, i3, localObject6);
        int i11 = d;
        i3 = i11 - i3;
        d = i3;
        break label1495;
        label1795:
        localArrayList.remove(n);
        localObject2 = a;
        ((ar.a)localObject2).a((f.b)localObject1);
      }
      label1822:
      int i30 = a.size();
      j = 0;
      f2 = 0.0F;
      localObject2 = null;
      n = 0;
      if (n < i30)
      {
        localObject2 = (f.b)a.get(n);
        i = a;
        switch (i)
        {
        }
        for (;;)
        {
          localObject2 = d;
          if (localObject2 != null)
          {
            localObject2 = d;
            ((Runnable)localObject2).run();
          }
          j = n + 1;
          n = j;
          break;
          c((f.b)localObject2);
          continue;
          i1 = b;
          i = 0;
          f1 = 0.0F;
          localObject1 = null;
          k = b;
          m = d + k;
          i3 = -1;
          f3 = 0.0F / 0.0F;
          k = b;
          int i31 = 0;
          localar = null;
          label2101:
          label2194:
          int i32;
          if (k < m)
          {
            i = 0;
            f1 = 0.0F;
            localObject1 = null;
            localObject5 = c.a(k);
            int i12;
            if (localObject5 == null)
            {
              i12 = c(k);
              if (i12 == 0) {}
            }
            else
            {
              if (i3 == 0)
              {
                i3 = 0;
                f3 = 0.0F;
                localb = null;
                localObject1 = a(2, i1, i31, null);
                b((f.b)localObject1);
                i = 1;
                f1 = Float.MIN_VALUE;
              }
              i3 = 1;
              f3 = Float.MIN_VALUE;
              if (i == 0) {
                break label2194;
              }
              i = k - i31;
              k = m - i31;
              m = 1;
            }
            for (;;)
            {
              i += 1;
              i31 = m;
              m = k;
              k = i;
              break;
              i12 = 1;
              if (i3 == i12)
              {
                i3 = 0;
                f3 = 0.0F;
                localb = null;
                localObject1 = a(2, i1, i31, null);
                c((f.b)localObject1);
                i = 1;
                f1 = Float.MIN_VALUE;
              }
              i3 = 0;
              f3 = 0.0F;
              localb = null;
              break label2101;
              i = i31 + 1;
              i32 = k;
              k = m;
              m = i;
              i = i32;
            }
          }
          i = d;
          if (i31 != i)
          {
            a((f.b)localObject2);
            j = 2;
            f2 = 2.8E-45F;
            i = 0;
            f1 = 0.0F;
            localObject1 = null;
            localObject2 = a(j, i1, i31, null);
          }
          if (i3 == 0)
          {
            b((f.b)localObject2);
          }
          else
          {
            c((f.b)localObject2);
            continue;
            i3 = b;
            localObject3 = null;
            i = b;
            m = d;
            i31 = i + m;
            m = b;
            i32 = -1;
            float f4 = 0.0F / 0.0F;
            i = 0;
            localObject1 = null;
            f1 = 0.0F;
            k = i3;
            i3 = i32;
            f3 = f4;
            int i4;
            if (m < i31)
            {
              Object localObject7 = c.a(m);
              int i2;
              if (localObject7 == null)
              {
                i2 = c(m);
                if (i2 == 0) {}
              }
              else
              {
                if (i3 == 0)
                {
                  i3 = 4;
                  f3 = 5.6E-45F;
                  localObject7 = c;
                  localObject1 = a(i3, k, i, localObject7);
                  b((f.b)localObject1);
                  i = 0;
                  f1 = 0.0F;
                  localObject1 = null;
                  k = m;
                }
                f3 = Float.MIN_VALUE;
                i32 = 1;
                f4 = f3;
                i3 = k;
                k = i;
                i = i32;
              }
              for (f1 = f3;; f1 = 0.0F)
              {
                k += 1;
                m += 1;
                i32 = i;
                f4 = f1;
                i = k;
                k = i3;
                i3 = i32;
                f3 = f1;
                break;
                i2 = 1;
                if (i3 == i2)
                {
                  i4 = 4;
                  f3 = 5.6E-45F;
                  localObject7 = c;
                  localObject1 = a(i4, k, i, localObject7);
                  c((f.b)localObject1);
                  i = 0;
                  f1 = 0.0F;
                  localObject1 = null;
                  k = m;
                }
                f3 = 0.0F;
                localb = null;
                i32 = 0;
                f4 = 0.0F;
                i4 = k;
                k = i;
                i = 0;
                localObject1 = null;
              }
            }
            m = d;
            if (i != m)
            {
              localObject4 = c;
              a((f.b)localObject2);
              j = 4;
              f2 = 5.6E-45F;
              localObject2 = a(j, k, i, localObject4);
            }
            if (i4 == 0)
            {
              b((f.b)localObject2);
            }
            else
            {
              c((f.b)localObject2);
              continue;
              c((f.b)localObject2);
            }
          }
        }
      }
      a.clear();
      return;
      label2670:
      j = i;
    }
  }
  
  final void c()
  {
    Object localObject = b;
    int i = ((ArrayList)localObject).size();
    int k;
    for (int j = 0; j < i; j = k)
    {
      f.a locala = c;
      localObject = (f.b)b.get(j);
      locala.b((f.b)localObject);
      k = j + 1;
    }
    localObject = b;
    a((List)localObject);
    h = 0;
  }
  
  final boolean d()
  {
    ArrayList localArrayList = a;
    int i = localArrayList.size();
    if (i > 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localArrayList = null;
    }
  }
  
  final void e()
  {
    c();
    Object localObject = a;
    int i = ((ArrayList)localObject).size();
    int j = 0;
    if (j < i)
    {
      localObject = (f.b)a.get(j);
      int k = a;
      switch (k)
      {
      }
      for (;;)
      {
        localObject = d;
        if (localObject != null)
        {
          localObject = d;
          ((Runnable)localObject).run();
        }
        int m = j + 1;
        j = m;
        break;
        c.b((f.b)localObject);
        f.a locala = c;
        int n = b;
        m = d;
        locala.c(n, m);
        continue;
        c.b((f.b)localObject);
        locala = c;
        n = b;
        m = d;
        locala.a(n, m);
        continue;
        c.b((f.b)localObject);
        locala = c;
        n = b;
        int i1 = d;
        localObject = c;
        locala.a(n, i1, localObject);
        continue;
        c.b((f.b)localObject);
        locala = c;
        n = b;
        m = d;
        locala.d(n, m);
      }
    }
    localObject = a;
    a((List)localObject);
    h = 0;
  }
}


/* Location:              android/support/v7/widget/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */