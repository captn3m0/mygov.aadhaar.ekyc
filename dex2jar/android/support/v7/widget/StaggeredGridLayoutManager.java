package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.h.a.a;
import android.support.v4.h.a.b;
import android.support.v4.h.a.b.n;
import android.support.v4.h.a.f;
import android.support.v4.h.w;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager
  extends at.g
{
  private boolean F;
  private d G;
  private int H;
  private final Rect I = new Rect();
  private final a J = new a();
  private boolean K = false;
  private boolean L = true;
  private int[] M;
  private final Runnable N = new Runnable()
  {
    public final void run()
    {
      g();
    }
  };
  e[] a;
  as b;
  as c;
  boolean d = false;
  boolean e = false;
  int f = -1;
  int g = Integer.MIN_VALUE;
  c h = new c();
  private int i = -1;
  private int j;
  private int k;
  private final al l;
  private BitSet m;
  private int n = 2;
  private boolean o;
  
  public StaggeredGridLayoutManager(int paramInt1, int paramInt2)
  {
    j = paramInt2;
    c(paramInt1);
    if (n != 0) {}
    for (;;)
    {
      w = bool;
      l = new al();
      h();
      return;
      bool = false;
    }
  }
  
  public StaggeredGridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    paramContext = a(paramContext, paramAttributeSet, paramInt1, paramInt2);
    paramInt1 = a;
    if ((paramInt1 != 0) && (paramInt1 != 1)) {
      throw new IllegalArgumentException("invalid orientation.");
    }
    a(null);
    if (paramInt1 != j)
    {
      j = paramInt1;
      paramAttributeSet = b;
      b = c;
      c = paramAttributeSet;
      j();
    }
    c(b);
    a(c);
    if (n != 0) {}
    for (;;)
    {
      w = bool;
      l = new al();
      h();
      return;
      bool = false;
    }
  }
  
  private int a(at.m paramm, al paramal, at.r paramr)
  {
    m.set(0, i, true);
    int i1;
    int i5;
    label61:
    int i2;
    View localView;
    b localb;
    int i9;
    label163:
    int i6;
    if (l.i) {
      if (e == 1)
      {
        i1 = Integer.MAX_VALUE;
        i(e, i1);
        if (!e) {
          break label444;
        }
        i5 = b.c();
        i2 = 0;
        if ((!paramal.a(paramr)) || ((!l.i) && (m.isEmpty()))) {
          break label1625;
        }
        localView = paramm.b(c);
        c += d;
        localb = (b)localView.getLayoutParams();
        i9 = c.c();
        localObject1 = h;
        if ((a != null) && (i9 < a.length)) {
          break label456;
        }
        i2 = -1;
        if (i2 != -1) {
          break label469;
        }
        i6 = 1;
        label172:
        if (i6 == 0) {
          break label679;
        }
        if (!b) {
          break label475;
        }
        localObject1 = a[0];
      }
    }
    label193:
    Object localObject2;
    label219:
    label242:
    label286:
    label310:
    int i3;
    int i4;
    label444:
    label456:
    label469:
    label475:
    label500:
    int i10;
    int i7;
    label532:
    do
    {
      localObject2 = h;
      ((c)localObject2).c(i9);
      a[i9] = e;
      a = ((e)localObject1);
      if (e != 1) {
        break label691;
      }
      super.a(localView, -1, false);
      if (!b) {
        break label733;
      }
      if (j != 1) {
        break label702;
      }
      a(localView, H, a(E, C, 0, height, true));
      if (e != 1) {
        break label1033;
      }
      if (!b) {
        break label831;
      }
      i2 = k(i5);
      i3 = i2 + b.e(localView);
      if ((i6 == 0) || (!b)) {
        break label1716;
      }
      localObject2 = new StaggeredGridLayoutManager.c.a();
      c = new int[i];
      i4 = 0;
      while (i4 < i)
      {
        c[i4] = (i2 - a[i4].b(i2));
        i4 += 1;
      }
      i1 = Integer.MIN_VALUE;
      break;
      if (e == 1)
      {
        i1 = g + b;
        break;
      }
      i1 = f - b;
      break;
      i5 = b.b();
      break label61;
      i2 = a[i9];
      break label163;
      i6 = 0;
      break label172;
      if (!l(e)) {
        break label586;
      }
      i2 = i - 1;
      i4 = -1;
      i3 = -1;
      if (e != 1) {
        break label601;
      }
      localObject2 = null;
      i8 = Integer.MAX_VALUE;
      i10 = b.b();
      i7 = i2;
      i2 = i8;
      localObject1 = localObject2;
    } while (i7 == i4);
    Object localObject1 = a[i7];
    int i8 = ((e)localObject1).b(i10);
    if (i8 < i2) {
      i2 = i8;
    }
    for (;;)
    {
      i7 += i3;
      localObject2 = localObject1;
      break label532;
      label586:
      i2 = 0;
      i4 = i;
      i3 = 1;
      break label500;
      label601:
      localObject2 = null;
      i8 = Integer.MIN_VALUE;
      i10 = b.c();
      i7 = i2;
      i2 = i8;
      label625:
      localObject1 = localObject2;
      if (i7 == i4) {
        break label193;
      }
      localObject1 = a[i7];
      i8 = ((e)localObject1).a(i10);
      if (i8 > i2) {
        i2 = i8;
      }
      for (;;)
      {
        i7 += i3;
        localObject2 = localObject1;
        break label625;
        label679:
        localObject1 = a[i2];
        break label219;
        label691:
        super.a(localView, 0, false);
        break label242;
        label702:
        a(localView, a(D, B, 0, width, true), H);
        break label286;
        label733:
        if (j == 1)
        {
          a(localView, a(k, B, 0, width, false), a(E, C, 0, height, true));
          break label286;
        }
        a(localView, a(D, B, 0, width, true), a(k, C, 0, height, false));
        break label286;
        label831:
        i2 = ((e)localObject1).b(i5);
        break label310;
        b = -1;
        a = i9;
        h.a((StaggeredGridLayoutManager.c.a)localObject2);
        i4 = i2;
        for (;;)
        {
          if ((b) && (d == -1)) {
            if (i6 == 0)
            {
              if (e != 1) {
                break label1202;
              }
              i6 = a[0].b(Integer.MIN_VALUE);
              i2 = 1;
              label914:
              if (i2 >= i) {
                break label1190;
              }
              if (a[i2].b(Integer.MIN_VALUE) == i6) {
                break label1181;
              }
              i2 = 0;
              label943:
              if (i2 != 0) {
                break label1196;
              }
              i2 = 1;
            }
          }
          for (;;)
          {
            if (i2 != 0)
            {
              localObject2 = h.d(i9);
              if (localObject2 != null) {
                d = true;
              }
              K = true;
            }
            if (e != 1) {
              break label1433;
            }
            if (!b) {
              break label1279;
            }
            i2 = i - 1;
            while (i2 >= 0)
            {
              a[i2].b(localView);
              i2 -= 1;
            }
            label1033:
            if (b) {}
            for (i3 = j(i5);; i3 = ((e)localObject1).a(i5))
            {
              i4 = b.e(localView);
              if ((i6 == 0) || (!b)) {
                break label1171;
              }
              localObject2 = new StaggeredGridLayoutManager.c.a();
              c = new int[i];
              i2 = 0;
              while (i2 < i)
              {
                c[i2] = (a[i2].a(i3) - i3);
                i2 += 1;
              }
            }
            b = 1;
            a = i9;
            h.a((StaggeredGridLayoutManager.c.a)localObject2);
            label1171:
            i4 = i3 - i4;
            break;
            label1181:
            i2 += 1;
            break label914;
            label1190:
            i2 = 1;
            break label943;
            label1196:
            i2 = 0;
            continue;
            label1202:
            i6 = a[0].a(Integer.MIN_VALUE);
            i2 = 1;
            label1218:
            if (i2 < i) {
              if (a[i2].a(Integer.MIN_VALUE) == i6) {}
            }
            for (i2 = 0;; i2 = 1)
            {
              if (i2 != 0) {
                break label1273;
              }
              i2 = 1;
              break;
              i2 += 1;
              break label1218;
            }
            label1273:
            i2 = 0;
          }
          label1279:
          a.b(localView);
          label1289:
          if ((t()) && (j == 1)) {
            if (b)
            {
              i2 = c.c();
              label1321:
              i7 = c.e(localView);
              i6 = i2;
              i2 -= i7;
              if (j != 1) {
                break label1575;
              }
              a(localView, i2, i4, i6, i3);
              label1364:
              if (!b) {
                break label1591;
              }
              i(l.e, i1);
              label1385:
              a(paramm, l);
              if ((l.h) && (localView.hasFocusable()))
              {
                if (!b) {
                  break label1609;
                }
                m.clear();
              }
            }
          }
          for (;;)
          {
            i2 = 1;
            break;
            label1433:
            if (b)
            {
              i2 = i - 1;
              while (i2 >= 0)
              {
                a[i2].a(localView);
                i2 -= 1;
              }
              break label1289;
            }
            a.a(localView);
            break label1289;
            i2 = c.c() - (i - 1 - e) * k;
            break label1321;
            if (b) {}
            for (i2 = c.b();; i2 = e * k + c.b())
            {
              i6 = c.e(localView) + i2;
              break;
            }
            label1575:
            a(localView, i4, i2, i3, i6);
            break label1364;
            label1591:
            a((e)localObject1, l.e, i1);
            break label1385;
            label1609:
            m.set(e, false);
          }
          label1625:
          if (i2 == 0) {
            a(paramm, l);
          }
          if (l.e == -1) {
            i1 = j(b.b());
          }
          for (i1 = b.b() - i1; i1 > 0; i1 = k(b.c()) - b.c()) {
            return Math.min(b, i1);
          }
          return 0;
          label1716:
          i4 = i2;
        }
        localObject1 = localObject2;
      }
      localObject1 = localObject2;
    }
  }
  
  private void a(int paramInt, at.r paramr)
  {
    boolean bool2 = false;
    l.b = 0;
    l.c = paramInt;
    int i1;
    boolean bool1;
    if (k())
    {
      i1 = a;
      if (i1 != -1)
      {
        boolean bool3 = e;
        if (i1 < paramInt)
        {
          bool1 = true;
          if (bool3 != bool1) {
            break label189;
          }
          paramInt = b.e();
          i1 = 0;
        }
      }
    }
    for (;;)
    {
      label67:
      int i2;
      if ((q != null) && (q.h))
      {
        i2 = 1;
        label87:
        if (i2 == 0) {
          break label208;
        }
        l.f = (b.b() - i1);
        l.g = (paramInt + b.c());
      }
      for (;;)
      {
        l.h = false;
        l.a = true;
        paramr = l;
        bool1 = bool2;
        if (b.g() == 0)
        {
          bool1 = bool2;
          if (b.d() == 0) {
            bool1 = true;
          }
        }
        i = bool1;
        return;
        bool1 = false;
        break;
        label189:
        i1 = b.e();
        paramInt = 0;
        break label67;
        i2 = 0;
        break label87;
        label208:
        l.g = (paramInt + b.d());
        l.f = (-i1);
      }
      paramInt = 0;
      i1 = 0;
    }
  }
  
  private void a(e parame, int paramInt1, int paramInt2)
  {
    int i1 = d;
    if (paramInt1 == -1) {
      if (i1 + parame.a() <= paramInt2) {
        m.set(e, false);
      }
    }
    while (parame.b() - i1 < paramInt2) {
      return;
    }
    m.set(e, false);
  }
  
  private void a(at.m paramm, int paramInt)
  {
    for (;;)
    {
      View localView;
      b localb;
      if (l() > 0)
      {
        localView = d(0);
        if ((b.b(localView) <= paramInt) && (b.c(localView) <= paramInt))
        {
          localb = (b)localView.getLayoutParams();
          if (!b) {
            break label118;
          }
          i1 = 0;
          if (i1 >= i) {
            break label92;
          }
          if (a[i1].a.size() != 1) {
            break label85;
          }
        }
      }
      label85:
      label92:
      label118:
      while (a.a.size() == 1)
      {
        for (;;)
        {
          return;
          i1 += 1;
        }
        int i1 = 0;
        while (i1 < i)
        {
          a[i1].e();
          i1 += 1;
        }
      }
      a.e();
      a(localView, paramm);
    }
  }
  
  private void a(at.m paramm, al paramal)
  {
    int i3 = 1;
    int i1 = 1;
    if ((!a) || (i)) {
      return;
    }
    if (b == 0)
    {
      if (e == -1)
      {
        b(paramm, g);
        return;
      }
      a(paramm, f);
      return;
    }
    int i4;
    if (e == -1)
    {
      i5 = f;
      int i6 = f;
      for (i2 = a[0].a(i6); i1 < i; i2 = i3)
      {
        i4 = a[i1].a(i6);
        i3 = i2;
        if (i4 > i2) {
          i3 = i4;
        }
        i1 += 1;
      }
      i1 = i5 - i2;
      if (i1 < 0) {}
      for (i1 = g;; i1 = g - Math.min(i1, b))
      {
        b(paramm, i1);
        return;
      }
    }
    int i5 = g;
    int i2 = a[0].b(i5);
    i1 = i3;
    while (i1 < i)
    {
      i4 = a[i1].b(i5);
      i3 = i2;
      if (i4 < i2) {
        i3 = i4;
      }
      i1 += 1;
      i2 = i3;
    }
    i1 = i2 - g;
    if (i1 < 0) {}
    for (i1 = f;; i1 = Math.min(i1, b) + i2)
    {
      a(paramm, i1);
      return;
      i2 = f;
    }
  }
  
  private void a(at.m paramm, at.r paramr, boolean paramBoolean)
  {
    int i1 = k(Integer.MIN_VALUE);
    if (i1 == Integer.MIN_VALUE) {}
    do
    {
      do
      {
        return;
        i1 = b.c() - i1;
      } while (i1 <= 0);
      i1 -= -c(-i1, paramm, paramr);
    } while ((!paramBoolean) || (i1 <= 0));
    b.a(i1);
  }
  
  private void a(View paramView, int paramInt1, int paramInt2)
  {
    b(paramView, I);
    b localb = (b)paramView.getLayoutParams();
    paramInt1 = c(paramInt1, leftMargin + I.left, rightMargin + I.right);
    paramInt2 = c(paramInt2, topMargin + I.top, bottomMargin + I.bottom);
    if (a(paramView, paramInt1, paramInt2, localb)) {
      paramView.measure(paramInt1, paramInt2);
    }
  }
  
  private void a(boolean paramBoolean)
  {
    a(null);
    if ((G != null) && (G.h != paramBoolean)) {
      G.h = paramBoolean;
    }
    d = paramBoolean;
    j();
  }
  
  private View b(boolean paramBoolean)
  {
    int i2 = b.b();
    int i3 = b.c();
    int i4 = l();
    Object localObject = null;
    int i1 = 0;
    if (i1 < i4)
    {
      View localView = d(i1);
      int i5 = b.a(localView);
      if ((b.b(localView) <= i2) || (i5 >= i3)) {
        break label104;
      }
      if ((i5 >= i2) || (!paramBoolean)) {
        return localView;
      }
      if (localObject != null) {
        break label104;
      }
      localObject = localView;
    }
    label104:
    for (;;)
    {
      i1 += 1;
      break;
      return (View)localObject;
    }
  }
  
  private void b(int paramInt, at.r paramr)
  {
    int i2;
    int i1;
    if (paramInt > 0)
    {
      i2 = u();
      i1 = 1;
    }
    for (;;)
    {
      l.a = true;
      a(i2, paramr);
      i(i1);
      l.c = (l.d + i2);
      l.b = Math.abs(paramInt);
      return;
      i1 = -1;
      i2 = v();
    }
  }
  
  private void b(at.m paramm, int paramInt)
  {
    int i1 = l() - 1;
    for (;;)
    {
      View localView;
      b localb;
      if (i1 >= 0)
      {
        localView = d(i1);
        if ((b.a(localView) >= paramInt) && (b.d(localView) >= paramInt))
        {
          localb = (b)localView.getLayoutParams();
          if (!b) {
            break label132;
          }
          i2 = 0;
          if (i2 >= i) {
            break label101;
          }
          if (a[i2].a.size() != 1) {
            break label92;
          }
        }
      }
      label92:
      label101:
      label132:
      while (a.a.size() == 1)
      {
        for (;;)
        {
          return;
          i2 += 1;
        }
        int i2 = 0;
        while (i2 < i)
        {
          a[i2].d();
          i2 += 1;
        }
      }
      a.d();
      a(localView, paramm);
      i1 -= 1;
    }
  }
  
  private void b(at.m paramm, at.r paramr, boolean paramBoolean)
  {
    int i1 = j(Integer.MAX_VALUE);
    if (i1 == Integer.MAX_VALUE) {}
    do
    {
      do
      {
        return;
        i1 -= b.b();
      } while (i1 <= 0);
      i1 -= c(i1, paramm, paramr);
    } while ((!paramBoolean) || (i1 <= 0));
    b.a(-i1);
  }
  
  private static int c(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0)) {}
    int i1;
    do
    {
      return paramInt1;
      i1 = View.MeasureSpec.getMode(paramInt1);
    } while ((i1 != Integer.MIN_VALUE) && (i1 != 1073741824));
    return View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3), i1);
  }
  
  private int c(int paramInt, at.m paramm, at.r paramr)
  {
    if ((l() == 0) || (paramInt == 0)) {
      return 0;
    }
    b(paramInt, paramr);
    int i2 = a(paramm, l, paramr);
    int i1 = paramInt;
    if (l.b >= i2) {
      if (paramInt >= 0) {
        break label93;
      }
    }
    label93:
    for (i1 = -i2;; i1 = i2)
    {
      b.a(-i1);
      o = e;
      l.b = 0;
      a(paramm, l);
      return i1;
    }
  }
  
  private View c(boolean paramBoolean)
  {
    int i2 = b.b();
    int i3 = b.c();
    Object localObject = null;
    int i1 = l() - 1;
    if (i1 >= 0)
    {
      View localView = d(i1);
      int i4 = b.a(localView);
      int i5 = b.b(localView);
      if ((i5 <= i2) || (i4 >= i3)) {
        break label106;
      }
      if ((i5 <= i3) || (!paramBoolean)) {
        return localView;
      }
      if (localObject != null) {
        break label106;
      }
      localObject = localView;
    }
    label106:
    for (;;)
    {
      i1 -= 1;
      break;
      return (View)localObject;
    }
  }
  
  private void c(int paramInt)
  {
    a(null);
    if (paramInt != i)
    {
      h.a();
      j();
      i = paramInt;
      m = new BitSet(i);
      a = new e[i];
      paramInt = 0;
      while (paramInt < i)
      {
        a[paramInt] = new e(paramInt);
        paramInt += 1;
      }
      j();
    }
  }
  
  private void d(int paramInt1, int paramInt2, int paramInt3)
  {
    int i3;
    int i2;
    int i1;
    if (e)
    {
      i3 = u();
      if (paramInt3 != 8) {
        break label104;
      }
      if (paramInt1 >= paramInt2) {
        break label93;
      }
      i2 = paramInt2 + 1;
      i1 = paramInt1;
      label32:
      h.b(i1);
      switch (paramInt3)
      {
      default: 
        label76:
        if (i2 > i3) {
          break;
        }
      }
    }
    for (;;)
    {
      return;
      i3 = v();
      break;
      label93:
      i2 = paramInt1 + 1;
      i1 = paramInt2;
      break label32;
      label104:
      i2 = paramInt1 + paramInt2;
      i1 = paramInt1;
      break label32;
      h.b(paramInt1, paramInt2);
      break label76;
      h.a(paramInt1, paramInt2);
      break label76;
      h.a(paramInt1, 1);
      h.b(paramInt2, 1);
      break label76;
      if (e) {}
      for (paramInt1 = v(); i1 <= paramInt1; paramInt1 = u())
      {
        j();
        return;
      }
    }
  }
  
  private int h(at.r paramr)
  {
    boolean bool2 = true;
    if (l() == 0) {
      return 0;
    }
    as localas = b;
    View localView;
    if (!L)
    {
      bool1 = true;
      localView = b(bool1);
      if (L) {
        break label70;
      }
    }
    label70:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      return ax.a(paramr, localas, localView, c(bool1), this, L, e);
      bool1 = false;
      break;
    }
  }
  
  private void h()
  {
    b = as.a(this, j);
    c = as.a(this, 1 - j);
  }
  
  private void h(int paramInt)
  {
    k = (paramInt / i);
    H = View.MeasureSpec.makeMeasureSpec(paramInt, c.g());
  }
  
  private int i(at.r paramr)
  {
    boolean bool2 = true;
    if (l() == 0) {
      return 0;
    }
    as localas = b;
    View localView;
    if (!L)
    {
      bool1 = true;
      localView = b(bool1);
      if (L) {
        break label66;
      }
    }
    label66:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      return ax.a(paramr, localas, localView, c(bool1), this, L);
      bool1 = false;
      break;
    }
  }
  
  private void i(int paramInt)
  {
    int i1 = 1;
    l.e = paramInt;
    al localal = l;
    boolean bool2 = e;
    boolean bool1;
    if (paramInt == -1)
    {
      bool1 = true;
      if (bool2 != bool1) {
        break label49;
      }
    }
    label49:
    for (paramInt = i1;; paramInt = -1)
    {
      d = paramInt;
      return;
      bool1 = false;
      break;
    }
  }
  
  private void i(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    while (i1 < i)
    {
      if (!a[i1].a.isEmpty()) {
        a(a[i1], paramInt1, paramInt2);
      }
      i1 += 1;
    }
  }
  
  private int j(int paramInt)
  {
    int i2 = a[0].a(paramInt);
    int i1 = 1;
    while (i1 < i)
    {
      int i4 = a[i1].a(paramInt);
      int i3 = i2;
      if (i4 < i2) {
        i3 = i4;
      }
      i1 += 1;
      i2 = i3;
    }
    return i2;
  }
  
  private int j(at.r paramr)
  {
    boolean bool2 = true;
    if (l() == 0) {
      return 0;
    }
    as localas = b;
    View localView;
    if (!L)
    {
      bool1 = true;
      localView = b(bool1);
      if (L) {
        break label66;
      }
    }
    label66:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      return ax.b(paramr, localas, localView, c(bool1), this, L);
      bool1 = false;
      break;
    }
  }
  
  private int k(int paramInt)
  {
    int i2 = a[0].b(paramInt);
    int i1 = 1;
    while (i1 < i)
    {
      int i4 = a[i1].b(paramInt);
      int i3 = i2;
      if (i4 > i2) {
        i3 = i4;
      }
      i1 += 1;
      i2 = i3;
    }
    return i2;
  }
  
  private boolean l(int paramInt)
  {
    int i1;
    if (j == 0) {
      if (paramInt == -1)
      {
        i1 = 1;
        if (i1 == e) {
          break label29;
        }
      }
    }
    label29:
    label63:
    label66:
    for (;;)
    {
      return true;
      i1 = 0;
      break;
      return false;
      if (paramInt == -1)
      {
        i1 = 1;
        if (i1 != e) {
          break label63;
        }
      }
      for (i1 = 1;; i1 = 0)
      {
        if (i1 == t()) {
          break label66;
        }
        return false;
        i1 = 0;
        break;
      }
    }
  }
  
  private View r()
  {
    int i1 = l() - 1;
    BitSet localBitSet = new BitSet(i);
    localBitSet.set(0, i, true);
    int i2;
    int i3;
    label57:
    int i4;
    label65:
    int i5;
    View localView;
    b localb;
    Object localObject;
    if ((j == 1) && (t()))
    {
      i2 = 1;
      if (!e) {
        break label184;
      }
      i3 = -1;
      if (i1 >= i3) {
        break label193;
      }
      i4 = 1;
      i5 = i1;
      if (i5 == i3) {
        break label458;
      }
      localView = d(i5);
      localb = (b)localView.getLayoutParams();
      if (!localBitSet.get(a.e)) {
        break label271;
      }
      localObject = a;
      if (!e) {
        break label204;
      }
      if (((e)localObject).b() >= b.c()) {
        break label253;
      }
      if (a.get(a.size() - 1)).getLayoutParams()).b) {
        break label199;
      }
      i1 = 1;
    }
    for (;;)
    {
      if (i1 == 0) {
        break label258;
      }
      return localView;
      i2 = -1;
      break;
      label184:
      i3 = i1 + 1;
      i1 = 0;
      break label57;
      label193:
      i4 = -1;
      break label65;
      label199:
      i1 = 0;
      continue;
      label204:
      if (((e)localObject).a() > b.b())
      {
        if (!a.get(0)).getLayoutParams()).b) {
          i1 = 1;
        } else {
          i1 = 0;
        }
      }
      else {
        label253:
        i1 = 0;
      }
    }
    label258:
    localBitSet.clear(a.e);
    label271:
    int i6;
    if ((!b) && (i5 + i4 != i3))
    {
      localObject = d(i5 + i4);
      if (e)
      {
        i1 = b.b(localView);
        i6 = b.b((View)localObject);
        if (i1 < i6) {
          return localView;
        }
        if (i1 != i6) {
          break label460;
        }
        i1 = 1;
      }
    }
    for (;;)
    {
      if (i1 != 0)
      {
        localObject = (b)((View)localObject).getLayoutParams();
        if (a.e - a.e < 0)
        {
          i1 = 1;
          label380:
          if (i2 >= 0) {
            break label442;
          }
        }
        label442:
        for (i6 = 1;; i6 = 0)
        {
          if (i1 == i6) {
            break label448;
          }
          return localView;
          i1 = b.a(localView);
          i6 = b.a((View)localObject);
          if (i1 > i6) {
            return localView;
          }
          if (i1 != i6) {
            break label460;
          }
          i1 = 1;
          break;
          i1 = 0;
          break label380;
        }
      }
      label448:
      i5 += i4;
      break;
      label458:
      return null;
      label460:
      i1 = 0;
    }
  }
  
  private void s()
  {
    boolean bool = true;
    if ((j == 1) || (!t())) {
      bool = d;
    }
    for (;;)
    {
      e = bool;
      return;
      if (d) {
        bool = false;
      }
    }
  }
  
  private boolean t()
  {
    return w.g(q) == 1;
  }
  
  private int u()
  {
    int i1 = l();
    if (i1 == 0) {
      return 0;
    }
    return a(d(i1 - 1));
  }
  
  private int v()
  {
    if (l() == 0) {
      return 0;
    }
    return a(d(0));
  }
  
  public final int a(int paramInt, at.m paramm, at.r paramr)
  {
    return c(paramInt, paramm, paramr);
  }
  
  public final int a(at.m paramm, at.r paramr)
  {
    if (j == 0) {
      return i;
    }
    return super.a(paramm, paramr);
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
  
  public final View a(View paramView, int paramInt, at.m paramm, at.r paramr)
  {
    if (l() == 0) {
      paramView = null;
    }
    View localView;
    e locale;
    int i1;
    int i2;
    label499:
    label507:
    label517:
    label534:
    do
    {
      return paramView;
      localView = b(paramView);
      if (localView == null) {
        return null;
      }
      s();
      switch (paramInt)
      {
      default: 
        paramInt = Integer.MIN_VALUE;
      }
      while (paramInt == Integer.MIN_VALUE)
      {
        return null;
        if (j == 1)
        {
          paramInt = -1;
        }
        else if (t())
        {
          paramInt = 1;
        }
        else
        {
          paramInt = -1;
          continue;
          if (j == 1)
          {
            paramInt = 1;
          }
          else if (t())
          {
            paramInt = -1;
          }
          else
          {
            paramInt = 1;
            continue;
            if (j == 1)
            {
              paramInt = -1;
            }
            else
            {
              paramInt = Integer.MIN_VALUE;
              continue;
              if (j == 1)
              {
                paramInt = 1;
              }
              else
              {
                paramInt = Integer.MIN_VALUE;
                continue;
                if (j == 0)
                {
                  paramInt = -1;
                }
                else
                {
                  paramInt = Integer.MIN_VALUE;
                  continue;
                  if (j == 0) {
                    paramInt = 1;
                  } else {
                    paramInt = Integer.MIN_VALUE;
                  }
                }
              }
            }
          }
        }
      }
      paramView = (b)localView.getLayoutParams();
      boolean bool = b;
      locale = a;
      if (paramInt == 1) {}
      for (i1 = u();; i1 = v())
      {
        a(i1, paramr);
        i(paramInt);
        l.c = (l.d + i1);
        l.b = ((int)(0.33333334F * b.e()));
        l.h = true;
        l.a = false;
        a(paramm, l, paramr);
        o = e;
        if (bool) {
          break;
        }
        paramView = locale.a(i1, paramInt);
        if ((paramView == null) || (paramView == localView)) {
          break;
        }
        return paramView;
      }
      if (l(paramInt))
      {
        i2 = i - 1;
        while (i2 >= 0)
        {
          paramView = a[i2].a(i1, paramInt);
          if ((paramView != null) && (paramView != localView)) {
            return paramView;
          }
          i2 -= 1;
        }
      }
      i2 = 0;
      while (i2 < i)
      {
        paramView = a[i2].a(i1, paramInt);
        if ((paramView != null) && (paramView != localView)) {
          return paramView;
        }
        i2 += 1;
      }
      if (d) {
        break label623;
      }
      i1 = 1;
      if (paramInt != -1) {
        break label629;
      }
      i2 = 1;
      if (i1 != i2) {
        break label635;
      }
      i1 = 1;
      if (bool) {
        break;
      }
      if (i1 == 0) {
        break label641;
      }
      i2 = locale.f();
      paramm = a(i2);
      if (paramm == null) {
        break;
      }
      paramView = paramm;
    } while (paramm != localView);
    if (l(paramInt))
    {
      paramInt = i - 1;
      label568:
      if (paramInt >= 0)
      {
        if (paramInt != e) {
          if (i1 == 0) {
            break label651;
          }
        }
        label623:
        label629:
        label635:
        label641:
        label651:
        for (i2 = a[paramInt].f();; i2 = a[paramInt].g())
        {
          paramm = a(i2);
          if (paramm != null)
          {
            paramView = paramm;
            if (paramm != localView) {
              break;
            }
          }
          paramInt -= 1;
          break label568;
          i1 = 0;
          break label499;
          i2 = 0;
          break label507;
          i1 = 0;
          break label517;
          i2 = locale.g();
          break label534;
        }
      }
    }
    else
    {
      paramInt = 0;
      while (paramInt < i)
      {
        if (i1 != 0) {}
        for (i2 = a[paramInt].f();; i2 = a[paramInt].g())
        {
          paramView = a(i2);
          if ((paramView == null) || (paramView == localView)) {
            break;
          }
          return paramView;
        }
        paramInt += 1;
      }
    }
    return null;
  }
  
  public final void a()
  {
    h.a();
    j();
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    d(paramInt1, paramInt2, 1);
  }
  
  public final void a(int paramInt1, int paramInt2, at.r paramr, at.g.a parama)
  {
    int i3 = 0;
    if (j == 0) {
      if ((l() != 0) && (paramInt1 != 0)) {
        break label27;
      }
    }
    for (;;)
    {
      return;
      paramInt1 = paramInt2;
      break;
      label27:
      b(paramInt1, paramr);
      if ((M == null) || (M.length < i)) {
        M = new int[i];
      }
      paramInt2 = 0;
      paramInt1 = 0;
      if (paramInt2 < i)
      {
        if (l.d == -1) {}
        for (int i2 = l.f - a[paramInt2].a(l.f);; i2 = a[paramInt2].b(l.g) - l.g)
        {
          int i1 = paramInt1;
          if (i2 >= 0)
          {
            M[paramInt1] = i2;
            i1 = paramInt1 + 1;
          }
          paramInt2 += 1;
          paramInt1 = i1;
          break;
        }
      }
      Arrays.sort(M, 0, paramInt1);
      paramInt2 = i3;
      while ((paramInt2 < paramInt1) && (l.a(paramr)))
      {
        parama.a(l.c, M[paramInt2]);
        al localal = l;
        c += l.d;
        paramInt2 += 1;
      }
    }
  }
  
  public final void a(Rect paramRect, int paramInt1, int paramInt2)
  {
    int i1 = m();
    int i2 = o() + i1;
    int i3 = n() + p();
    if (j == 1)
    {
      i1 = a(paramInt2, i3 + paramRect.height(), w.r(q));
      paramInt2 = a(paramInt1, i2 + k * i, w.q(q));
      paramInt1 = i1;
    }
    for (;;)
    {
      h(paramInt2, paramInt1);
      return;
      i1 = a(paramInt1, i2 + paramRect.width(), w.q(q));
      paramInt1 = a(paramInt2, i3 + k * i, w.r(q));
      paramInt2 = i1;
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof d))
    {
      G = ((d)paramParcelable);
      j();
    }
  }
  
  public final void a(at.m paramm, at.r paramr, View paramView, b paramb)
  {
    int i3 = 1;
    int i1 = 1;
    int i2 = -1;
    paramm = paramView.getLayoutParams();
    if (!(paramm instanceof b))
    {
      super.a(paramView, paramb);
      return;
    }
    paramm = (b)paramm;
    int i4;
    int i5;
    if (j == 0)
    {
      i4 = paramm.a();
      if (b) {
        i1 = i;
      }
      i5 = -1;
      i3 = i1;
      i1 = i5;
    }
    for (;;)
    {
      paramb.a(b.n.a(i4, i3, i2, i1, b));
      return;
      i1 = paramm.a();
      if (b)
      {
        i5 = i;
        i4 = -1;
        i2 = i1;
        i3 = -1;
        i1 = i5;
      }
      else
      {
        i4 = -1;
        i2 = i1;
        i5 = -1;
        i1 = i3;
        i3 = i5;
      }
    }
  }
  
  public final void a(at.r paramr)
  {
    super.a(paramr);
    f = -1;
    g = Integer.MIN_VALUE;
    G = null;
    J.a();
  }
  
  public final void a(at paramat, at.m paramm)
  {
    a(N);
    int i1 = 0;
    while (i1 < i)
    {
      a[i1].c();
      i1 += 1;
    }
    paramat.requestLayout();
  }
  
  public final void a(AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramAccessibilityEvent);
    View localView1;
    View localView2;
    if (l() > 0)
    {
      paramAccessibilityEvent = a.a(paramAccessibilityEvent);
      localView1 = b(false);
      localView2 = c(false);
      if ((localView1 != null) && (localView2 != null)) {}
    }
    else
    {
      return;
    }
    int i1 = a(localView1);
    int i2 = a(localView2);
    if (i1 < i2)
    {
      paramAccessibilityEvent.a(i1);
      paramAccessibilityEvent.b(i2);
      return;
    }
    paramAccessibilityEvent.a(i2);
    paramAccessibilityEvent.b(i1);
  }
  
  public final void a(String paramString)
  {
    if (G == null) {
      super.a(paramString);
    }
  }
  
  public final boolean a(at.h paramh)
  {
    return paramh instanceof b;
  }
  
  public final int b(int paramInt, at.m paramm, at.r paramr)
  {
    return c(paramInt, paramm, paramr);
  }
  
  public final int b(at.m paramm, at.r paramr)
  {
    if (j == 1) {
      return i;
    }
    return super.b(paramm, paramr);
  }
  
  public final int b(at.r paramr)
  {
    return h(paramr);
  }
  
  public final at.h b()
  {
    if (j == 0) {
      return new b(-2, -1);
    }
    return new b(-1, -2);
  }
  
  public final void b(int paramInt)
  {
    if ((G != null) && (G.a != paramInt))
    {
      d locald = G;
      d = null;
      c = 0;
      a = -1;
      b = -1;
    }
    f = paramInt;
    g = Integer.MIN_VALUE;
    j();
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    d(paramInt1, paramInt2, 2);
  }
  
  public final int c(at.r paramr)
  {
    return h(paramr);
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    d(paramInt1, paramInt2, 4);
  }
  
  public final void c(at.m paramm, at.r paramr)
  {
    int i2 = 1;
    a locala = J;
    if (((G != null) || (f != -1)) && (paramr.a() == 0))
    {
      c(paramm);
      locala.a();
      label41:
      return;
    }
    int i3;
    int i4;
    label112:
    int i5;
    if ((!e) || (f != -1) || (G != null))
    {
      i3 = 1;
      if (i3 == 0) {
        break label463;
      }
      locala.a();
      if (G == null) {
        break label614;
      }
      if (G.c <= 0) {
        break label268;
      }
      if (G.c != i) {
        break label218;
      }
      i4 = 0;
      if (i4 >= i) {
        break label268;
      }
      a[i4].c();
      i5 = G.d[i4];
      i1 = i5;
      if (i5 != Integer.MIN_VALUE) {
        if (!G.i) {
          break label203;
        }
      }
    }
    label203:
    for (int i1 = i5 + b.c();; i1 = i5 + b.b())
    {
      a[i4].c(i1);
      i4 += 1;
      break label112;
      i3 = 0;
      break;
    }
    label218:
    Object localObject1 = G;
    d = null;
    c = 0;
    e = 0;
    f = null;
    g = null;
    G.a = G.b;
    label268:
    F = G.j;
    a(G.h);
    s();
    if (G.a != -1)
    {
      f = G.a;
      c = G.i;
      if (G.e > 1)
      {
        h.a = G.f;
        h.b = G.g;
      }
      label367:
      if ((!g) && (f != -1)) {
        break label630;
      }
      i1 = 0;
      label385:
      if (i1 == 0)
      {
        if (!o) {
          break label1205;
        }
        i5 = paramr.a();
        i1 = l() - 1;
        label411:
        if (i1 < 0) {
          break label1199;
        }
        i4 = a(d(i1));
        if ((i4 < 0) || (i4 >= i5)) {
          break label1190;
        }
        i1 = i4;
      }
    }
    label463:
    label614:
    label630:
    label721:
    label787:
    label817:
    label853:
    label999:
    boolean bool;
    label1008:
    label1036:
    label1085:
    label1091:
    label1097:
    label1190:
    label1199:
    label1205:
    int i6;
    for (;;)
    {
      a = i1;
      b = Integer.MIN_VALUE;
      e = true;
      if ((G == null) && (f == -1) && ((c != o) || (t() != F)))
      {
        h.a();
        d = true;
      }
      if ((l() <= 0) || ((G != null) && (G.c > 0))) {
        break label1581;
      }
      if (!d) {
        break label1269;
      }
      i1 = 0;
      while (i1 < i)
      {
        a[i1].c();
        if (b != Integer.MIN_VALUE) {
          a[i1].c(b);
        }
        i1 += 1;
      }
      c = e;
      break;
      s();
      c = e;
      break label367;
      if ((f < 0) || (f >= paramr.a()))
      {
        f = -1;
        g = Integer.MIN_VALUE;
        i1 = 0;
        break label385;
      }
      if ((G == null) || (G.a == -1) || (G.c <= 0))
      {
        localObject1 = a(f);
        if (localObject1 != null)
        {
          if (e)
          {
            i1 = u();
            a = i1;
            if (g == Integer.MIN_VALUE) {
              break label817;
            }
            if (!c) {
              break label787;
            }
          }
          for (b = (b.c() - g - b.b((View)localObject1));; b = (b.b() + g - b.a((View)localObject1)))
          {
            i1 = 1;
            break;
            i1 = v();
            break label721;
          }
          if (b.e((View)localObject1) > b.e()) {
            if (c)
            {
              i1 = b.c();
              b = i1;
            }
          }
        }
      }
      for (;;)
      {
        i1 = 1;
        break;
        i1 = b.b();
        break label853;
        i1 = b.a((View)localObject1) - b.b();
        if (i1 < 0)
        {
          b = (-i1);
        }
        else
        {
          i1 = b.c() - b.b((View)localObject1);
          if (i1 < 0)
          {
            b = i1;
          }
          else
          {
            b = Integer.MIN_VALUE;
            continue;
            a = f;
            if (g == Integer.MIN_VALUE)
            {
              i1 = a;
              if (l() == 0)
              {
                if (e) {
                  break label1085;
                }
                i1 = -1;
                if (i1 != 1) {
                  break label1091;
                }
                bool = true;
                c = bool;
                if (!c) {
                  break label1097;
                }
                i1 = g.b.c();
                b = i1;
              }
            }
            for (;;)
            {
              d = true;
              break;
              if (i1 < v()) {}
              for (bool = true;; bool = false)
              {
                if (bool == e) {
                  break label1085;
                }
                i1 = -1;
                break;
              }
              i1 = 1;
              break label999;
              bool = false;
              break label1008;
              i1 = g.b.b();
              break label1036;
              i1 = g;
              if (c) {
                b = (g.b.c() - i1);
              } else {
                b = (i1 + g.b.b());
              }
            }
            b = Integer.MIN_VALUE;
            a = f;
          }
        }
      }
      i1 -= 1;
      break label411;
      i1 = 0;
      continue;
      i6 = paramr.a();
      int i7 = l();
      i4 = 0;
      for (;;)
      {
        if (i4 >= i7) {
          break label1263;
        }
        i5 = a(d(i4));
        if (i5 >= 0)
        {
          i1 = i5;
          if (i5 < i6) {
            break;
          }
        }
        i4 += 1;
      }
      label1263:
      i1 = 0;
    }
    label1269:
    label1332:
    label1407:
    Object localObject2;
    if ((i3 != 0) || (J.f == null))
    {
      i3 = 0;
      if (i3 < i)
      {
        localObject1 = a[i3];
        bool = e;
        i5 = b;
        if (bool)
        {
          i1 = ((e)localObject1).b(Integer.MIN_VALUE);
          ((e)localObject1).c();
          if ((i1 != Integer.MIN_VALUE) && ((!bool) || (i1 >= f.b.c())) && ((bool) || (i1 <= f.b.b()))) {
            break label1407;
          }
        }
        for (;;)
        {
          i3 += 1;
          break;
          i1 = ((e)localObject1).a(Integer.MIN_VALUE);
          break label1332;
          i4 = i1;
          if (i5 != Integer.MIN_VALUE) {
            i4 = i1 + i5;
          }
          c = i4;
          b = i4;
        }
      }
      localObject1 = J;
      localObject2 = a;
      i3 = localObject2.length;
      if ((f == null) || (f.length < i3)) {
        f = new int[g.a.length];
      }
      i1 = 0;
    }
    while (i1 < i3)
    {
      f[i1] = localObject2[i1].a(Integer.MIN_VALUE);
      i1 += 1;
      continue;
      i1 = 0;
      while (i1 < i)
      {
        localObject1 = a[i1];
        ((e)localObject1).c();
        ((e)localObject1).c(J.f[i1]);
        i1 += 1;
      }
    }
    label1581:
    a(paramm);
    l.a = false;
    K = false;
    h(c.e());
    a(a, paramr);
    label1680:
    float f1;
    if (c)
    {
      i(-1);
      a(paramm, l, paramr);
      i(1);
      l.c = (a + l.d);
      a(paramm, l, paramr);
      if (c.g() == 1073741824) {
        break label2066;
      }
      f1 = 0.0F;
      i4 = l();
      i1 = 0;
      label1704:
      if (i1 >= i4) {
        break label1835;
      }
      localObject1 = d(i1);
      float f2 = c.e((View)localObject1);
      if (f2 < f1) {
        break label2255;
      }
      if (!getLayoutParamsb) {
        break label2252;
      }
      f2 = 1.0F * f2 / i;
      label1764:
      f1 = Math.max(f1, f2);
    }
    label1835:
    label2004:
    label2066:
    label2094:
    label2246:
    label2252:
    label2255:
    for (;;)
    {
      i1 += 1;
      break label1704;
      i(1);
      a(paramm, l, paramr);
      i(-1);
      l.c = (a + l.d);
      a(paramm, l, paramr);
      break label1680;
      i5 = k;
      i3 = Math.round(i * f1);
      i1 = i3;
      if (c.g() == Integer.MIN_VALUE) {
        i1 = Math.min(i3, c.e());
      }
      h(i1);
      if (k != i5)
      {
        i1 = 0;
        if (i1 < i4)
        {
          localObject1 = d(i1);
          localObject2 = (b)((View)localObject1).getLayoutParams();
          if (!b)
          {
            if ((!t()) || (j != 1)) {
              break label2004;
            }
            ((View)localObject1).offsetLeftAndRight(-(i - 1 - a.e) * k - -(i - 1 - a.e) * i5);
          }
          for (;;)
          {
            i1 += 1;
            break;
            i3 = a.e * k;
            i6 = a.e * i5;
            if (j == 1) {
              ((View)localObject1).offsetLeftAndRight(i3 - i6);
            } else {
              ((View)localObject1).offsetTopAndBottom(i3 - i6);
            }
          }
        }
      }
      if (l() > 0)
      {
        if (e)
        {
          a(paramm, paramr, true);
          b(paramm, paramr, false);
        }
      }
      else
      {
        i3 = 0;
        i1 = i3;
        if (i2 != 0)
        {
          i1 = i3;
          if (!g) {
            if ((n == 0) || (l() <= 0) || ((!K) && (r() == null))) {
              break label2246;
            }
          }
        }
      }
      for (i2 = 1;; i2 = 0)
      {
        i1 = i3;
        if (i2 != 0)
        {
          a(N);
          i1 = i3;
          if (g()) {
            i1 = 1;
          }
        }
        if (g) {
          J.a();
        }
        o = c;
        F = t();
        if (i1 == 0) {
          break label41;
        }
        J.a();
        i2 = 0;
        break;
        b(paramm, paramr, true);
        a(paramm, paramr, false);
        break label2094;
      }
      break label1764;
    }
  }
  
  public final boolean c()
  {
    return G == null;
  }
  
  public final int d(at.r paramr)
  {
    return i(paramr);
  }
  
  public final Parcelable d()
  {
    if (G != null) {
      return new d(G);
    }
    d locald = new d();
    h = d;
    i = o;
    j = F;
    int i1;
    label126:
    View localView;
    label146:
    label153:
    int i2;
    label181:
    int i3;
    if ((h != null) && (h.a != null))
    {
      f = h.a;
      e = f.length;
      g = h.b;
      if (l() <= 0) {
        break label310;
      }
      if (!o) {
        break label250;
      }
      i1 = u();
      a = i1;
      if (!e) {
        break label258;
      }
      localView = c(true);
      if (localView != null) {
        break label268;
      }
      i1 = -1;
      b = i1;
      c = i;
      d = new int[i];
      i2 = 0;
      if (i2 >= i) {
        break label328;
      }
      if (!o) {
        break label277;
      }
      i3 = a[i2].b(Integer.MIN_VALUE);
      i1 = i3;
      if (i3 != Integer.MIN_VALUE) {
        i1 = i3 - b.c();
      }
    }
    for (;;)
    {
      d[i2] = i1;
      i2 += 1;
      break label181;
      e = 0;
      break;
      label250:
      i1 = v();
      break label126;
      label258:
      localView = b(true);
      break label146;
      label268:
      i1 = a(localView);
      break label153;
      label277:
      i3 = a[i2].a(Integer.MIN_VALUE);
      i1 = i3;
      if (i3 != Integer.MIN_VALUE) {
        i1 = i3 - b.b();
      }
    }
    label310:
    a = -1;
    b = -1;
    c = 0;
    label328:
    return locald;
  }
  
  public final void d(int paramInt1, int paramInt2)
  {
    d(paramInt1, paramInt2, 8);
  }
  
  public final int e(at.r paramr)
  {
    return i(paramr);
  }
  
  public final void e(int paramInt)
  {
    super.e(paramInt);
    int i1 = 0;
    while (i1 < i)
    {
      a[i1].d(paramInt);
      i1 += 1;
    }
  }
  
  public final boolean e()
  {
    return j == 0;
  }
  
  public final int f(at.r paramr)
  {
    return j(paramr);
  }
  
  public final void f(int paramInt)
  {
    super.f(paramInt);
    int i1 = 0;
    while (i1 < i)
    {
      a[i1].d(paramInt);
      i1 += 1;
    }
  }
  
  public final boolean f()
  {
    return j == 1;
  }
  
  public final int g(at.r paramr)
  {
    return j(paramr);
  }
  
  public final void g(int paramInt)
  {
    if (paramInt == 0) {
      g();
    }
  }
  
  final boolean g()
  {
    if ((l() == 0) || (n == 0) || (!v)) {
      return false;
    }
    int i2;
    if (e) {
      i2 = u();
    }
    for (int i1 = v(); (i2 == 0) && (r() != null); i1 = u())
    {
      h.a();
      u = true;
      j();
      return true;
      i2 = v();
    }
    if (!K) {
      return false;
    }
    if (e) {}
    StaggeredGridLayoutManager.c.a locala1;
    for (int i3 = -1;; i3 = 1)
    {
      locala1 = h.a(i2, i1 + 1, i3);
      if (locala1 != null) {
        break;
      }
      K = false;
      h.a(i1 + 1);
      return false;
    }
    StaggeredGridLayoutManager.c.a locala2 = h.a(i2, a, i3 * -1);
    if (locala2 == null) {
      h.a(a);
    }
    for (;;)
    {
      u = true;
      j();
      return true;
      h.a(a + 1);
    }
  }
  
  final class a
  {
    int a;
    int b;
    boolean c;
    boolean d;
    boolean e;
    int[] f;
    
    public a()
    {
      a();
    }
    
    final void a()
    {
      a = -1;
      b = Integer.MIN_VALUE;
      c = false;
      d = false;
      e = false;
      if (f != null) {
        Arrays.fill(f, -1);
      }
    }
  }
  
  public static final class b
    extends at.h
  {
    StaggeredGridLayoutManager.e a;
    boolean b;
    
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
    
    public final int a()
    {
      if (a == null) {
        return -1;
      }
      return a.e;
    }
  }
  
  static final class c
  {
    int[] a;
    List<a> b;
    
    final int a(int paramInt)
    {
      if (b != null)
      {
        int i = b.size() - 1;
        while (i >= 0)
        {
          if (b.get(i)).a >= paramInt) {
            b.remove(i);
          }
          i -= 1;
        }
      }
      return b(paramInt);
    }
    
    public final a a(int paramInt1, int paramInt2, int paramInt3)
    {
      Object localObject;
      if (b == null)
      {
        localObject = null;
        return (a)localObject;
      }
      int j = b.size();
      int i = 0;
      for (;;)
      {
        if (i >= j) {
          break label112;
        }
        a locala = (a)b.get(i);
        if (a >= paramInt2) {
          return null;
        }
        if (a >= paramInt1)
        {
          localObject = locala;
          if (paramInt3 == 0) {
            break;
          }
          localObject = locala;
          if (b == paramInt3) {
            break;
          }
          localObject = locala;
          if (d) {
            break;
          }
        }
        i += 1;
      }
      label112:
      return null;
    }
    
    final void a()
    {
      if (a != null) {
        Arrays.fill(a, -1);
      }
      b = null;
    }
    
    final void a(int paramInt1, int paramInt2)
    {
      if ((a == null) || (paramInt1 >= a.length)) {}
      do
      {
        return;
        c(paramInt1 + paramInt2);
        System.arraycopy(a, paramInt1 + paramInt2, a, paramInt1, a.length - paramInt1 - paramInt2);
        Arrays.fill(a, a.length - paramInt2, a.length, -1);
      } while (b == null);
      int i = b.size() - 1;
      label87:
      a locala;
      if (i >= 0)
      {
        locala = (a)b.get(i);
        if (a >= paramInt1)
        {
          if (a >= paramInt1 + paramInt2) {
            break label144;
          }
          b.remove(i);
        }
      }
      for (;;)
      {
        i -= 1;
        break label87;
        break;
        label144:
        a -= paramInt2;
      }
    }
    
    public final void a(a parama)
    {
      if (b == null) {
        b = new ArrayList();
      }
      int j = b.size();
      int i = 0;
      while (i < j)
      {
        a locala = (a)b.get(i);
        if (a == a) {
          b.remove(i);
        }
        if (a >= a)
        {
          b.add(i, parama);
          return;
        }
        i += 1;
      }
      b.add(parama);
    }
    
    final int b(int paramInt)
    {
      if (a == null) {
        return -1;
      }
      if (paramInt >= a.length) {
        return -1;
      }
      a locala;
      int i;
      if (b != null)
      {
        locala = d(paramInt);
        if (locala != null) {
          b.remove(locala);
        }
        int j = b.size();
        i = 0;
        if (i >= j) {
          break label178;
        }
        if (b.get(i)).a < paramInt) {}
      }
      for (;;)
      {
        if (i != -1)
        {
          locala = (a)b.get(i);
          b.remove(i);
        }
        for (i = a;; i = -1)
        {
          if (i != -1) {
            break label162;
          }
          Arrays.fill(a, paramInt, a.length, -1);
          return a.length;
          i += 1;
          break;
        }
        label162:
        Arrays.fill(a, paramInt, i + 1, -1);
        return i + 1;
        label178:
        i = -1;
      }
    }
    
    final void b(int paramInt1, int paramInt2)
    {
      if ((a == null) || (paramInt1 >= a.length)) {}
      for (;;)
      {
        return;
        c(paramInt1 + paramInt2);
        System.arraycopy(a, paramInt1, a, paramInt1 + paramInt2, a.length - paramInt1 - paramInt2);
        Arrays.fill(a, paramInt1, paramInt1 + paramInt2, -1);
        if (b != null)
        {
          int i = b.size() - 1;
          while (i >= 0)
          {
            a locala = (a)b.get(i);
            if (a >= paramInt1) {
              a += paramInt2;
            }
            i -= 1;
          }
        }
      }
    }
    
    final void c(int paramInt)
    {
      if (a == null)
      {
        a = new int[Math.max(paramInt, 10) + 1];
        Arrays.fill(a, -1);
      }
      while (paramInt < a.length) {
        return;
      }
      int[] arrayOfInt = a;
      int i = a.length;
      while (i <= paramInt) {
        i *= 2;
      }
      a = new int[i];
      System.arraycopy(arrayOfInt, 0, a, 0, arrayOfInt.length);
      Arrays.fill(a, arrayOfInt.length, a.length, -1);
    }
    
    public final a d(int paramInt)
    {
      Object localObject;
      if (b == null)
      {
        localObject = null;
        return (a)localObject;
      }
      int i = b.size() - 1;
      for (;;)
      {
        if (i < 0) {
          break label61;
        }
        a locala = (a)b.get(i);
        localObject = locala;
        if (a == paramInt) {
          break;
        }
        i -= 1;
      }
      label61:
      return null;
    }
    
    static class a
      implements Parcelable
    {
      public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator() {};
      int a;
      int b;
      int[] c;
      boolean d;
      
      public a() {}
      
      public a(Parcel paramParcel)
      {
        a = paramParcel.readInt();
        b = paramParcel.readInt();
        if (paramParcel.readInt() == 1) {}
        for (;;)
        {
          d = bool;
          int i = paramParcel.readInt();
          if (i > 0)
          {
            c = new int[i];
            paramParcel.readIntArray(c);
          }
          return;
          bool = false;
        }
      }
      
      final int a(int paramInt)
      {
        if (c == null) {
          return 0;
        }
        return c[paramInt];
      }
      
      public int describeContents()
      {
        return 0;
      }
      
      public String toString()
      {
        return "FullSpanItem{mPosition=" + a + ", mGapDir=" + b + ", mHasUnwantedGapAfter=" + d + ", mGapPerSpan=" + Arrays.toString(c) + '}';
      }
      
      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        paramParcel.writeInt(a);
        paramParcel.writeInt(b);
        if (d) {}
        for (paramInt = 1;; paramInt = 0)
        {
          paramParcel.writeInt(paramInt);
          if ((c == null) || (c.length <= 0)) {
            break;
          }
          paramParcel.writeInt(c.length);
          paramParcel.writeIntArray(c);
          return;
        }
        paramParcel.writeInt(0);
      }
    }
  }
  
  public static final class d
    implements Parcelable
  {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator() {};
    int a;
    int b;
    int c;
    int[] d;
    int e;
    int[] f;
    List<StaggeredGridLayoutManager.c.a> g;
    boolean h;
    boolean i;
    boolean j;
    
    public d() {}
    
    d(Parcel paramParcel)
    {
      a = paramParcel.readInt();
      b = paramParcel.readInt();
      c = paramParcel.readInt();
      if (c > 0)
      {
        d = new int[c];
        paramParcel.readIntArray(d);
      }
      e = paramParcel.readInt();
      if (e > 0)
      {
        f = new int[e];
        paramParcel.readIntArray(f);
      }
      if (paramParcel.readInt() == 1)
      {
        bool1 = true;
        h = bool1;
        if (paramParcel.readInt() != 1) {
          break label152;
        }
        bool1 = true;
        label113:
        i = bool1;
        if (paramParcel.readInt() != 1) {
          break label157;
        }
      }
      label152:
      label157:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        j = bool1;
        g = paramParcel.readArrayList(StaggeredGridLayoutManager.c.a.class.getClassLoader());
        return;
        bool1 = false;
        break;
        bool1 = false;
        break label113;
      }
    }
    
    public d(d paramd)
    {
      c = c;
      a = a;
      b = b;
      d = d;
      e = e;
      f = f;
      h = h;
      i = i;
      j = j;
      g = g;
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      int k = 1;
      paramParcel.writeInt(a);
      paramParcel.writeInt(b);
      paramParcel.writeInt(c);
      if (c > 0) {
        paramParcel.writeIntArray(d);
      }
      paramParcel.writeInt(e);
      if (e > 0) {
        paramParcel.writeIntArray(f);
      }
      if (h)
      {
        paramInt = 1;
        paramParcel.writeInt(paramInt);
        if (!i) {
          break label120;
        }
        paramInt = 1;
        label87:
        paramParcel.writeInt(paramInt);
        if (!j) {
          break label125;
        }
      }
      label120:
      label125:
      for (paramInt = k;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        paramParcel.writeList(g);
        return;
        paramInt = 0;
        break;
        paramInt = 0;
        break label87;
      }
    }
  }
  
  final class e
  {
    ArrayList<View> a = new ArrayList();
    int b = Integer.MIN_VALUE;
    int c = Integer.MIN_VALUE;
    int d = 0;
    final int e;
    
    e(int paramInt)
    {
      e = paramInt;
    }
    
    private int b(int paramInt1, int paramInt2)
    {
      int m = -1;
      int n = b.b();
      int i1 = b.c();
      int i;
      if (paramInt2 > paramInt1) {
        i = 1;
      }
      for (;;)
      {
        int j = m;
        View localView;
        int i2;
        int i3;
        if (paramInt1 != paramInt2)
        {
          localView = (View)a.get(paramInt1);
          i2 = b.a(localView);
          i3 = b.b(localView);
          if (i2 > i1) {
            break label143;
          }
          j = 1;
          label94:
          if (i3 < n) {
            break label149;
          }
        }
        label143:
        label149:
        for (int k = 1;; k = 0)
        {
          if ((j == 0) || (k == 0) || ((i2 >= n) && (i3 <= i1))) {
            break label155;
          }
          j = StaggeredGridLayoutManager.a(localView);
          return j;
          i = -1;
          break;
          j = 0;
          break label94;
        }
        label155:
        paramInt1 += i;
      }
    }
    
    private void h()
    {
      Object localObject = (View)a.get(0);
      StaggeredGridLayoutManager.b localb = (StaggeredGridLayoutManager.b)((View)localObject).getLayoutParams();
      b = b.a((View)localObject);
      if (b)
      {
        localObject = h.d(c.c());
        if ((localObject != null) && (b == -1)) {
          b -= ((StaggeredGridLayoutManager.c.a)localObject).a(e);
        }
      }
    }
    
    private void i()
    {
      Object localObject = (View)a.get(a.size() - 1);
      StaggeredGridLayoutManager.b localb = (StaggeredGridLayoutManager.b)((View)localObject).getLayoutParams();
      c = b.b((View)localObject);
      if (b)
      {
        localObject = h.d(c.c());
        if ((localObject != null) && (b == 1))
        {
          int i = c;
          c = (((StaggeredGridLayoutManager.c.a)localObject).a(e) + i);
        }
      }
    }
    
    final int a()
    {
      if (b != Integer.MIN_VALUE) {
        return b;
      }
      h();
      return b;
    }
    
    final int a(int paramInt)
    {
      if (b != Integer.MIN_VALUE) {
        paramInt = b;
      }
      while (a.size() == 0) {
        return paramInt;
      }
      h();
      return b;
    }
    
    public final View a(int paramInt1, int paramInt2)
    {
      View localView2 = null;
      View localView1 = null;
      if (paramInt2 == -1)
      {
        int i = a.size();
        paramInt2 = 0;
        while (paramInt2 < i)
        {
          localView2 = (View)a.get(paramInt2);
          if (((d) && (StaggeredGridLayoutManager.a(localView2) <= paramInt1)) || ((!d) && (StaggeredGridLayoutManager.a(localView2) >= paramInt1)) || (!localView2.hasFocusable())) {
            break;
          }
          paramInt2 += 1;
          localView1 = localView2;
        }
        return localView1;
      }
      paramInt2 = a.size() - 1;
      for (localView1 = localView2; paramInt2 >= 0; localView1 = localView2)
      {
        localView2 = (View)a.get(paramInt2);
        if (((d) && (StaggeredGridLayoutManager.a(localView2) >= paramInt1)) || ((!d) && (StaggeredGridLayoutManager.a(localView2) <= paramInt1)) || (!localView2.hasFocusable())) {
          break;
        }
        paramInt2 -= 1;
      }
      return localView1;
    }
    
    final void a(View paramView)
    {
      StaggeredGridLayoutManager.b localb = (StaggeredGridLayoutManager.b)paramView.getLayoutParams();
      a = this;
      a.add(0, paramView);
      b = Integer.MIN_VALUE;
      if (a.size() == 1) {
        c = Integer.MIN_VALUE;
      }
      if ((c.m()) || (c.s())) {
        d += b.e(paramView);
      }
    }
    
    final int b()
    {
      if (c != Integer.MIN_VALUE) {
        return c;
      }
      i();
      return c;
    }
    
    final int b(int paramInt)
    {
      if (c != Integer.MIN_VALUE) {
        paramInt = c;
      }
      while (a.size() == 0) {
        return paramInt;
      }
      i();
      return c;
    }
    
    final void b(View paramView)
    {
      StaggeredGridLayoutManager.b localb = (StaggeredGridLayoutManager.b)paramView.getLayoutParams();
      a = this;
      a.add(paramView);
      c = Integer.MIN_VALUE;
      if (a.size() == 1) {
        b = Integer.MIN_VALUE;
      }
      if ((c.m()) || (c.s())) {
        d += b.e(paramView);
      }
    }
    
    final void c()
    {
      a.clear();
      b = Integer.MIN_VALUE;
      c = Integer.MIN_VALUE;
      d = 0;
    }
    
    final void c(int paramInt)
    {
      b = paramInt;
      c = paramInt;
    }
    
    final void d()
    {
      int i = a.size();
      View localView = (View)a.remove(i - 1);
      StaggeredGridLayoutManager.b localb = (StaggeredGridLayoutManager.b)localView.getLayoutParams();
      a = null;
      if ((c.m()) || (c.s())) {
        d -= b.e(localView);
      }
      if (i == 1) {
        b = Integer.MIN_VALUE;
      }
      c = Integer.MIN_VALUE;
    }
    
    final void d(int paramInt)
    {
      if (b != Integer.MIN_VALUE) {
        b += paramInt;
      }
      if (c != Integer.MIN_VALUE) {
        c += paramInt;
      }
    }
    
    final void e()
    {
      View localView = (View)a.remove(0);
      StaggeredGridLayoutManager.b localb = (StaggeredGridLayoutManager.b)localView.getLayoutParams();
      a = null;
      if (a.size() == 0) {
        c = Integer.MIN_VALUE;
      }
      if ((c.m()) || (c.s())) {
        d -= b.e(localView);
      }
      b = Integer.MIN_VALUE;
    }
    
    public final int f()
    {
      if (d) {
        return b(a.size() - 1, -1);
      }
      return b(0, a.size());
    }
    
    public final int g()
    {
      if (d) {
        return b(0, a.size());
      }
      return b(a.size() - 1, -1);
    }
  }
}


/* Location:              android/support/v7/widget/StaggeredGridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */