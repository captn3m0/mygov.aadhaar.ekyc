package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.h.a.b;
import android.support.v4.h.a.b.n;
import android.support.v4.h.w;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

public class GridLayoutManager
  extends LinearLayoutManager
{
  boolean a = false;
  int b = -1;
  int[] c;
  View[] d;
  final SparseIntArray e = new SparseIntArray();
  final SparseIntArray f = new SparseIntArray();
  c g = new a();
  final Rect h = new Rect();
  
  public GridLayoutManager(Context paramContext, int paramInt)
  {
    super(paramContext);
    i(paramInt);
  }
  
  public GridLayoutManager(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramContext, paramInt2, paramBoolean);
    i(paramInt1);
  }
  
  public GridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    i(ab);
  }
  
  private int a(at.m paramm, at.r paramr, int paramInt)
  {
    if (!g) {
      return c.c(paramInt, b);
    }
    int i = paramm.a(paramInt);
    if (i == -1)
    {
      Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + paramInt);
      return 0;
    }
    return c.c(i, b);
  }
  
  private void a(at.m paramm, at.r paramr, int paramInt, boolean paramBoolean)
  {
    int i;
    int k;
    int j;
    if (paramBoolean)
    {
      i = 1;
      k = 0;
      j = paramInt;
      paramInt = k;
    }
    for (;;)
    {
      k = 0;
      while (paramInt != j)
      {
        View localView = d[paramInt];
        b localb = (b)localView.getLayoutParams();
        b = c(paramm, paramr, a(localView));
        a = k;
        k += b;
        paramInt += i;
      }
      j = -1;
      paramInt -= 1;
      i = -1;
    }
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    at.h localh = (at.h)paramView.getLayoutParams();
    if (paramBoolean) {
      if ((!x) || (!at.g.b(paramView.getMeasuredWidth(), paramInt1, width)) || (!at.g.b(paramView.getMeasuredHeight(), paramInt2, height))) {
        paramBoolean = true;
      }
    }
    for (;;)
    {
      if (paramBoolean) {
        paramView.measure(paramInt1, paramInt2);
      }
      return;
      paramBoolean = false;
      continue;
      paramBoolean = a(paramView, paramInt1, paramInt2, localh);
    }
  }
  
  private int b(at.m paramm, at.r paramr, int paramInt)
  {
    if (!g) {
      i = g.b(paramInt, b);
    }
    int j;
    do
    {
      return i;
      j = f.get(paramInt, -1);
      i = j;
    } while (j != -1);
    int i = paramm.a(paramInt);
    if (i == -1)
    {
      Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + paramInt);
      return 0;
    }
    return g.b(i, b);
  }
  
  private void b(View paramView, int paramInt, boolean paramBoolean)
  {
    b localb = (b)paramView.getLayoutParams();
    Rect localRect = d;
    int j = top + bottom + topMargin + bottomMargin;
    int i = left;
    int k = right;
    int m = leftMargin;
    i = rightMargin + (k + i + m);
    k = i(a, b);
    if (this.i == 1)
    {
      i = a(k, paramInt, i, width, false);
      paramInt = a(this.j.e(), C, j, height, true);
    }
    for (;;)
    {
      a(paramView, i, paramInt, paramBoolean);
      return;
      paramInt = a(k, paramInt, j, height, false);
      i = a(this.j.e(), B, i, width, true);
    }
  }
  
  private int c(at.m paramm, at.r paramr, int paramInt)
  {
    if (!g) {}
    do
    {
      return 1;
      int i = e.get(paramInt, -1);
      if (i != -1) {
        return i;
      }
    } while (paramm.a(paramInt) != -1);
    Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + paramInt);
    return 1;
  }
  
  private void h(int paramInt)
  {
    int k = 0;
    int[] arrayOfInt2 = c;
    int n = b;
    int[] arrayOfInt1;
    if ((arrayOfInt2 != null) && (arrayOfInt2.length == n + 1))
    {
      arrayOfInt1 = arrayOfInt2;
      if (arrayOfInt2[(arrayOfInt2.length - 1)] == paramInt) {}
    }
    else
    {
      arrayOfInt1 = new int[n + 1];
    }
    arrayOfInt1[0] = 0;
    int m = paramInt / n;
    int i1 = paramInt % n;
    int i = 1;
    int j = 0;
    paramInt = k;
    if (i <= n)
    {
      paramInt += i1;
      if ((paramInt <= 0) || (n - paramInt >= i1)) {
        break label137;
      }
      k = m + 1;
      paramInt -= n;
    }
    for (;;)
    {
      j += k;
      arrayOfInt1[i] = j;
      i += 1;
      break;
      c = arrayOfInt1;
      return;
      label137:
      k = m;
    }
  }
  
  private int i(int paramInt1, int paramInt2)
  {
    if ((i == 1) && (g())) {
      return c[(b - paramInt1)] - c[(b - paramInt1 - paramInt2)];
    }
    return c[(paramInt1 + paramInt2)] - c[paramInt1];
  }
  
  private void i(int paramInt)
  {
    if (paramInt == b) {
      return;
    }
    a = true;
    if (paramInt <= 0) {
      throw new IllegalArgumentException("Span count should be at least 1. Provided " + paramInt);
    }
    b = paramInt;
    g.a.clear();
    j();
  }
  
  private void r()
  {
    if (this.i == 1) {}
    for (int i = D - o() - m();; i = E - p() - n())
    {
      h(i);
      return;
    }
  }
  
  private void s()
  {
    if ((d == null) || (d.length != b)) {
      d = new View[b];
    }
  }
  
  public final int a(int paramInt, at.m paramm, at.r paramr)
  {
    r();
    s();
    return super.a(paramInt, paramm, paramr);
  }
  
  public final int a(at.m paramm, at.r paramr)
  {
    if (i == 0) {
      return b;
    }
    if (paramr.a() <= 0) {
      return 0;
    }
    return a(paramm, paramr, paramr.a() - 1) + 1;
  }
  
  public final at.h a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new b(paramContext, paramAttributeSet);
  }
  
  public final at.h a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new b((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new b(paramLayoutParams);
  }
  
  final View a(at.m paramm, at.r paramr, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = null;
    h();
    int j = this.j.b();
    int k = this.j.c();
    int i;
    Object localObject2;
    label37:
    View localView;
    if (paramInt2 > paramInt1)
    {
      i = 1;
      localObject2 = null;
      if (paramInt1 == paramInt2) {
        break label164;
      }
      localView = d(paramInt1);
      int m = a(localView);
      if ((m < 0) || (m >= paramInt3) || (b(paramm, paramr, m) != 0)) {
        break label179;
      }
      if (!getLayoutParamsc.m()) {
        break label120;
      }
      if (localObject2 != null) {
        break label179;
      }
      localObject2 = localView;
    }
    label120:
    label164:
    label176:
    label179:
    for (;;)
    {
      paramInt1 += i;
      break label37;
      i = -1;
      break;
      Object localObject3;
      if (this.j.a(localView) < k)
      {
        localObject3 = localView;
        if (this.j.b(localView) >= j) {}
      }
      else
      {
        if (localObject1 != null) {
          break label179;
        }
        localObject1 = localView;
        continue;
        if (localObject1 == null) {
          break label176;
        }
        localObject3 = localObject1;
      }
      return (View)localObject3;
      return (View)localObject2;
    }
  }
  
  public final View a(View paramView, int paramInt, at.m paramm, at.r paramr)
  {
    View localView = b(paramView);
    Object localObject3;
    if (localView == null) {
      localObject3 = null;
    }
    Object localObject1;
    int i6;
    int i7;
    label85:
    int i1;
    label102:
    int i2;
    int m;
    int k;
    int j;
    int i;
    int i3;
    Object localObject2;
    label212:
    label217:
    label231:
    label237:
    b localb;
    int i9;
    int i10;
    do
    {
      return (View)localObject3;
      localObject1 = (b)localView.getLayoutParams();
      i6 = a;
      i7 = a + b;
      if (super.a(paramView, paramInt, paramm, paramr) == null) {
        return null;
      }
      int i12;
      int n;
      if (c(paramInt) == 1)
      {
        i12 = 1;
        if (i12 == this.k) {
          break label212;
        }
        paramInt = 1;
        if (paramInt == 0) {
          break label217;
        }
        paramInt = l() - 1;
        i1 = -1;
        n = -1;
        if ((this.i != 1) || (!g())) {
          break label231;
        }
      }
      for (i2 = 1;; i2 = 0)
      {
        paramView = null;
        m = -1;
        k = 0;
        localObject1 = null;
        j = -1;
        i = 0;
        int i8 = a(paramm, paramr, paramInt);
        i3 = paramInt;
        if (i3 != n)
        {
          paramInt = a(paramm, paramr, i3);
          localObject2 = d(i3);
          if (localObject2 != localView)
          {
            if ((!((View)localObject2).hasFocusable()) || (paramInt == i8)) {
              break label237;
            }
            if (paramView == null) {
              break label669;
            }
          }
        }
        if (paramView == null) {
          break label666;
        }
        return paramView;
        i12 = 0;
        break;
        paramInt = 0;
        break label85;
        n = l();
        paramInt = 0;
        i1 = 1;
        break label102;
      }
      localb = (b)((View)localObject2).getLayoutParams();
      i9 = a;
      i10 = a + b;
      if ((!((View)localObject2).hasFocusable()) || (i9 != i6)) {
        break;
      }
      localObject3 = localObject2;
    } while (i10 == i7);
    int i5 = 0;
    label323:
    int i4;
    if (((((View)localObject2).hasFocusable()) && (paramView == null)) || ((!((View)localObject2).hasFocusable()) && (localObject1 == null)))
    {
      paramInt = 1;
      if (paramInt == 0) {
        break label669;
      }
      if (!((View)localObject2).hasFocusable()) {
        break label626;
      }
      k = a;
      m = Math.min(i10, i7);
      i4 = Math.max(i9, i6);
      paramInt = j;
      paramView = (View)localObject1;
      j = m - i4;
      m = i;
      localObject1 = localObject2;
      i = paramInt;
      paramInt = m;
    }
    for (;;)
    {
      localObject2 = localObject1;
      i4 = i3 + i1;
      m = j;
      i3 = k;
      j = i;
      i = paramInt;
      localObject1 = paramView;
      k = m;
      m = i3;
      paramView = (View)localObject2;
      i3 = i4;
      break;
      paramInt = Math.max(i9, i6);
      int i11 = Math.min(i10, i7) - paramInt;
      if (((View)localObject2).hasFocusable())
      {
        if (i11 > k)
        {
          paramInt = 1;
          break label323;
        }
        paramInt = i5;
        if (i11 != k) {
          break label323;
        }
        if (i9 > m) {}
        for (i4 = 1;; i4 = 0)
        {
          paramInt = i5;
          if (i2 != i4) {
            break;
          }
          paramInt = 1;
          break;
        }
      }
      paramInt = i5;
      if (paramView != null) {
        break label323;
      }
      if ((r.a((View)localObject2)) && (s.a((View)localObject2)))
      {
        paramInt = 1;
        label547:
        if (paramInt != 0) {
          break label579;
        }
      }
      label579:
      for (i4 = 1;; i4 = 0)
      {
        paramInt = i5;
        if (i4 == 0) {
          break;
        }
        if (i11 <= i) {
          break label585;
        }
        paramInt = 1;
        break;
        paramInt = 0;
        break label547;
      }
      label585:
      paramInt = i5;
      if (i11 != i) {
        break label323;
      }
      if (i9 > j) {}
      for (i4 = 1;; i4 = 0)
      {
        paramInt = i5;
        if (i2 != i4) {
          break;
        }
        paramInt = 1;
        break;
      }
      label626:
      i = a;
      paramInt = Math.min(i10, i7) - Math.max(i9, i6);
      j = k;
      k = m;
      localObject1 = paramView;
      paramView = (View)localObject2;
      continue;
      label666:
      return (View)localObject1;
      label669:
      paramInt = i;
      i = j;
      j = k;
      localObject2 = paramView;
      paramView = (View)localObject1;
      k = m;
      localObject1 = localObject2;
    }
  }
  
  public final void a()
  {
    g.a.clear();
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    g.a.clear();
  }
  
  public final void a(Rect paramRect, int paramInt1, int paramInt2)
  {
    if (c == null) {
      super.a(paramRect, paramInt1, paramInt2);
    }
    int i = m();
    int j = o() + i;
    int k = n() + p();
    if (this.i == 1)
    {
      i = a(paramInt2, k + paramRect.height(), w.r(q));
      paramInt2 = a(paramInt1, j + c[(c.length - 1)], w.q(q));
      paramInt1 = i;
    }
    for (;;)
    {
      h(paramInt2, paramInt1);
      return;
      i = a(paramInt1, j + paramRect.width(), w.q(q));
      paramInt1 = a(paramInt2, k + c[(c.length - 1)], w.r(q));
      paramInt2 = i;
    }
  }
  
  final void a(at.m paramm, at.r paramr, LinearLayoutManager.a parama, int paramInt)
  {
    int i = 1;
    super.a(paramm, paramr, parama, paramInt);
    r();
    if ((paramr.a() > 0) && (!g))
    {
      if (paramInt == 1) {}
      for (paramInt = i;; paramInt = 0)
      {
        i = b(paramm, paramr, a);
        if (paramInt == 0) {
          break;
        }
        while ((i > 0) && (a > 0))
        {
          a -= 1;
          i = b(paramm, paramr, a);
        }
      }
      int k = paramr.a();
      paramInt = a;
      while (paramInt < k - 1)
      {
        int j = b(paramm, paramr, paramInt + 1);
        if (j <= i) {
          break;
        }
        paramInt += 1;
        i = j;
      }
      a = paramInt;
    }
    s();
  }
  
  final void a(at.m paramm, at.r paramr, LinearLayoutManager.c paramc, LinearLayoutManager.b paramb)
  {
    int i3 = this.j.h();
    int j;
    int k;
    label38:
    boolean bool;
    label58:
    int n;
    if (i3 != 1073741824)
    {
      j = 1;
      if (l() <= 0) {
        break label212;
      }
      k = c[b];
      if (j != 0) {
        r();
      }
      if (e != 1) {
        break label218;
      }
      bool = true;
      m = 0;
      i = b;
      n = m;
      if (!bool)
      {
        i = b(paramm, paramr, d) + c(paramm, paramr, d);
        n = m;
      }
    }
    int i1;
    label212:
    label218:
    Object localObject;
    for (;;)
    {
      if ((n >= b) || (!paramc.a(paramr)) || (i <= 0)) {
        break label266;
      }
      m = d;
      i1 = c(paramm, paramr, m);
      if (i1 > b)
      {
        throw new IllegalArgumentException("Item at position " + m + " requires " + i1 + " spans but GridLayoutManager has only " + b + " spans.");
        j = 0;
        break;
        k = 0;
        break label38;
        bool = false;
        break label58;
      }
      i -= i1;
      if (i < 0) {
        break label266;
      }
      localObject = paramc.a(paramm);
      if (localObject == null) {
        break label266;
      }
      d[n] = localObject;
      n += 1;
    }
    label266:
    if (n == 0)
    {
      b = true;
      return;
    }
    int i = 0;
    float f1 = 0.0F;
    a(paramm, paramr, n, bool);
    int m = 0;
    label331:
    int i2;
    if (m < n)
    {
      paramm = d[m];
      if (k == null) {
        if (bool)
        {
          super.a(paramm, -1, false);
          b(paramm, h);
          b(paramm, i3, false);
          i2 = this.j.e(paramm);
          i1 = i;
          if (i2 > i) {
            i1 = i2;
          }
          paramr = (b)paramm.getLayoutParams();
          float f2 = this.j.f(paramm) * 1.0F / b;
          if (f2 <= f1) {
            break label1138;
          }
          f1 = f2;
        }
      }
    }
    label553:
    label719:
    label833:
    label1058:
    label1090:
    label1126:
    label1135:
    label1138:
    for (;;)
    {
      m += 1;
      i = i1;
      break;
      super.a(paramm, 0, false);
      break label331;
      if (bool)
      {
        super.a(paramm, -1, true);
        break label331;
      }
      super.a(paramm, 0, true);
      break label331;
      if (j != 0)
      {
        h(Math.max(Math.round(b * f1), k));
        i = 0;
        k = 0;
        j = i;
        if (k >= n) {
          break label553;
        }
        paramm = d[k];
        b(paramm, 1073741824, true);
        j = this.j.e(paramm);
        if (j <= i) {
          break label1135;
        }
        i = j;
      }
      for (;;)
      {
        k += 1;
        break;
        j = i;
        i = 0;
        if (i < n)
        {
          paramm = d[i];
          if (this.j.e(paramm) != j)
          {
            paramr = (b)paramm.getLayoutParams();
            localObject = d;
            m = top + bottom + topMargin + bottomMargin;
            k = left;
            k = right + k + leftMargin + rightMargin;
            i1 = i(a, b);
            if (this.i != 1) {
              break label719;
            }
            k = a(i1, 1073741824, k, width, false);
          }
          for (m = View.MeasureSpec.makeMeasureSpec(j - m, 1073741824);; m = a(i1, 1073741824, m, height, false))
          {
            a(paramm, k, m, true);
            i += 1;
            break;
            k = View.MeasureSpec.makeMeasureSpec(j - k, 1073741824);
          }
        }
        a = j;
        m = 0;
        if (this.i == 1) {
          if (f == -1)
          {
            i1 = b;
            k = 0;
            i = i1;
            j = i1 - j;
            int i4 = 0;
            i1 = k;
            i2 = j;
            i3 = m;
            k = i4;
            j = i1;
            m = i2;
            i1 = i;
            i = i3;
            if (k >= n) {
              break label1126;
            }
            paramm = d[k];
            paramr = (b)paramm.getLayoutParams();
            if (this.i != 1) {
              break label1090;
            }
            if (!g()) {
              break label1058;
            }
            i = m();
            j = c[(b - a)] + i;
            i = j - this.j.f(paramm);
          }
        }
        for (;;)
        {
          a(paramm, i, m, j, i1);
          if ((c.m()) || (c.s())) {
            c = true;
          }
          d |= paramm.hasFocusable();
          k += 1;
          break label833;
          k = b;
          i = j + k;
          i1 = 0;
          j = k;
          k = i1;
          break;
          if (f == -1)
          {
            k = b;
            m = k - j;
            i = 0;
            j = 0;
            break;
          }
          m = b;
          k = 0;
          i1 = j + m;
          i = 0;
          j = k;
          k = i1;
          break;
          i = m() + c[a];
          j = this.j.f(paramm) + i;
          continue;
          m = n();
          m = c[a] + m;
          i1 = this.j.f(paramm) + m;
        }
        Arrays.fill(d, null);
        return;
      }
    }
  }
  
  public final void a(at.m paramm, at.r paramr, View paramView, b paramb)
  {
    boolean bool2 = false;
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (!(localLayoutParams instanceof b))
    {
      super.a(paramView, paramb);
      return;
    }
    paramView = (b)localLayoutParams;
    int i = a(paramm, paramr, c.c());
    if (this.i == 0)
    {
      j = a;
      k = b;
      if ((b > 1) && (b == b)) {}
      for (bool1 = true;; bool1 = false)
      {
        paramb.a(b.n.a(j, k, i, 1, bool1));
        return;
      }
    }
    int j = a;
    int k = b;
    boolean bool1 = bool2;
    if (b > 1)
    {
      bool1 = bool2;
      if (b == b) {
        bool1 = true;
      }
    }
    paramb.a(b.n.a(i, 1, j, k, bool1));
  }
  
  public final void a(at.r paramr)
  {
    super.a(paramr);
    a = false;
  }
  
  final void a(at.r paramr, LinearLayoutManager.c paramc, at.g.a parama)
  {
    int j = b;
    int i = 0;
    while ((i < b) && (paramc.a(paramr)) && (j > 0))
    {
      parama.a(d, Math.max(0, g));
      j -= 1;
      d += e;
      i += 1;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }
    super.a(false);
  }
  
  public final boolean a(at.h paramh)
  {
    return paramh instanceof b;
  }
  
  public final int b(int paramInt, at.m paramm, at.r paramr)
  {
    r();
    s();
    return super.b(paramInt, paramm, paramr);
  }
  
  public final int b(at.m paramm, at.r paramr)
  {
    if (i == 1) {
      return b;
    }
    if (paramr.a() <= 0) {
      return 0;
    }
    return a(paramm, paramr, paramr.a() - 1) + 1;
  }
  
  public final at.h b()
  {
    if (i == 0) {
      return new b(-2, -1);
    }
    return new b(-1, -2);
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    g.a.clear();
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    g.a.clear();
  }
  
  public final void c(at.m paramm, at.r paramr)
  {
    if (g)
    {
      int j = l();
      int i = 0;
      while (i < j)
      {
        b localb = (b)d(i).getLayoutParams();
        int k = c.c();
        e.put(k, b);
        f.put(k, a);
        i += 1;
      }
    }
    super.c(paramm, paramr);
    e.clear();
    f.clear();
  }
  
  public final boolean c()
  {
    return (n == null) && (!a);
  }
  
  public final void d(int paramInt1, int paramInt2)
  {
    g.a.clear();
  }
  
  public static final class a
    extends GridLayoutManager.c
  {
    public final int a(int paramInt1, int paramInt2)
    {
      return paramInt1 % paramInt2;
    }
  }
  
  public static final class b
    extends at.h
  {
    int a = -1;
    int b = 0;
    
    public b(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public b(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public b(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
  }
  
  public static abstract class c
  {
    final SparseIntArray a = new SparseIntArray();
    private boolean b = false;
    
    public static int c(int paramInt1, int paramInt2)
    {
      int m = 0;
      int j = 0;
      int i = 0;
      if (m < paramInt1)
      {
        int n = i + 1;
        int k;
        if (n == paramInt2)
        {
          k = j + 1;
          i = 0;
        }
        for (;;)
        {
          m += 1;
          j = k;
          break;
          k = j;
          i = n;
          if (n > paramInt2)
          {
            i = 1;
            k = j + 1;
          }
        }
      }
      paramInt1 = j;
      if (i + 1 > paramInt2) {
        paramInt1 = j + 1;
      }
      return paramInt1;
    }
    
    public int a(int paramInt1, int paramInt2)
    {
      if (1 == paramInt2) {
        return 0;
      }
      int j;
      int i;
      int k;
      if ((b) && (a.size() > 0))
      {
        j = a.size() - 1;
        i = 0;
        while (i <= j)
        {
          k = i + j >>> 1;
          if (a.keyAt(k) < paramInt1) {
            i = k + 1;
          } else {
            j = k - 1;
          }
        }
        i -= 1;
        if ((i >= 0) && (i < a.size()))
        {
          i = a.keyAt(i);
          if (i < 0) {
            break label195;
          }
          j = a.get(i) + 1;
          i += 1;
        }
      }
      for (;;)
      {
        k = j;
        j = i;
        i = k;
        label139:
        if (j < paramInt1)
        {
          k = i + 1;
          if (k == paramInt2) {
            i = 0;
          }
          for (;;)
          {
            j += 1;
            break label139;
            i = -1;
            break;
            i = k;
            if (k > paramInt2) {
              i = 1;
            }
          }
        }
        if (i + 1 > paramInt2) {
          break;
        }
        return i;
        label195:
        i = 0;
        j = 0;
      }
    }
    
    final int b(int paramInt1, int paramInt2)
    {
      int i;
      if (!b) {
        i = a(paramInt1, paramInt2);
      }
      int j;
      do
      {
        return i;
        j = a.get(paramInt1, -1);
        i = j;
      } while (j != -1);
      paramInt2 = a(paramInt1, paramInt2);
      a.put(paramInt1, paramInt2);
      return paramInt2;
    }
  }
}


/* Location:              android/support/v7/widget/GridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */