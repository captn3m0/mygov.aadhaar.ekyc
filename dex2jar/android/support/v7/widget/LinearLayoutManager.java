package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.h.a.a;
import android.support.v4.h.a.f;
import android.support.v4.h.w;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager
  extends at.g
{
  private c a;
  private boolean b;
  private boolean c = false;
  private boolean d = false;
  private boolean e = true;
  private boolean f;
  private final b g = new b();
  private int h = 2;
  int i;
  as j;
  boolean k = false;
  int l = -1;
  int m = Integer.MIN_VALUE;
  d n = null;
  final a o = new a();
  
  public LinearLayoutManager(Context paramContext)
  {
    this(paramContext, 1, false);
  }
  
  public LinearLayoutManager(Context paramContext, int paramInt, boolean paramBoolean)
  {
    h(paramInt);
    b(paramBoolean);
    w = true;
  }
  
  public LinearLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    paramContext = a(paramContext, paramAttributeSet, paramInt1, paramInt2);
    h(a);
    b(c);
    a(d);
    w = true;
  }
  
  private int a(int paramInt, at.m paramm, at.r paramr, boolean paramBoolean)
  {
    int i1 = j.c() - paramInt;
    if (i1 > 0)
    {
      int i2 = -c(-i1, paramm, paramr);
      i1 = i2;
      if (paramBoolean)
      {
        paramInt = j.c() - (paramInt + i2);
        i1 = i2;
        if (paramInt > 0)
        {
          j.a(paramInt);
          i1 = i2 + paramInt;
        }
      }
      return i1;
    }
    return 0;
  }
  
  private int a(at.m paramm, c paramc, at.r paramr, boolean paramBoolean)
  {
    int i3 = c;
    if (g != Integer.MIN_VALUE)
    {
      if (c < 0) {
        g += c;
      }
      a(paramm, paramc);
    }
    int i1 = c + h;
    b localb = g;
    do
    {
      int i2;
      do
      {
        if (((!l) && (i1 <= 0)) || (!paramc.a(paramr))) {
          break;
        }
        a = 0;
        b = false;
        c = false;
        d = false;
        a(paramm, paramr, paramc, localb);
        if (b) {
          break;
        }
        b += a * f;
        if ((c) && (a.k == null))
        {
          i2 = i1;
          if (g) {}
        }
        else
        {
          c -= a;
          i2 = i1 - a;
        }
        if (g != Integer.MIN_VALUE)
        {
          g += a;
          if (c < 0) {
            g += c;
          }
          a(paramm, paramc);
        }
        i1 = i2;
      } while (!paramBoolean);
      i1 = i2;
    } while (!d);
    return i3 - c;
  }
  
  private View a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    h();
    if (paramBoolean) {}
    for (int i1 = 24579; i == 0; i1 = 320) {
      return r.a(paramInt1, paramInt2, i1, 320);
    }
    return s.a(paramInt1, paramInt2, i1, 320);
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean, at.r paramr)
  {
    int i1 = -1;
    int i2 = 1;
    a.l = s();
    a.h = h(paramr);
    a.f = paramInt1;
    if (paramInt1 == 1)
    {
      paramr = a;
      h += j.f();
      paramr = u();
      localc = a;
      if (k) {}
      for (paramInt1 = i1;; paramInt1 = 1)
      {
        e = paramInt1;
        a.d = (a(paramr) + a.e);
        a.b = j.b(paramr);
        paramInt1 = j.b(paramr) - j.c();
        a.c = paramInt2;
        if (paramBoolean)
        {
          paramr = a;
          c -= paramInt1;
        }
        a.g = paramInt1;
        return;
      }
    }
    paramr = t();
    c localc = a;
    h += j.b();
    localc = a;
    if (k) {}
    for (paramInt1 = i2;; paramInt1 = -1)
    {
      e = paramInt1;
      a.d = (a(paramr) + a.e);
      a.b = j.a(paramr);
      paramInt1 = -j.a(paramr) + j.b();
      break;
    }
  }
  
  private void a(a parama)
  {
    i(a, b);
  }
  
  private void a(at.m paramm, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {}
    for (;;)
    {
      return;
      int i1 = paramInt1;
      if (paramInt2 > paramInt1)
      {
        paramInt2 -= 1;
        while (paramInt2 >= paramInt1)
        {
          a(paramInt2, paramm);
          paramInt2 -= 1;
        }
      }
      else
      {
        while (i1 > paramInt2)
        {
          a(i1, paramm);
          i1 -= 1;
        }
      }
    }
  }
  
  private void a(at.m paramm, c paramc)
  {
    if ((!a) || (l)) {}
    for (;;)
    {
      return;
      int i1;
      int i2;
      int i3;
      if (f == -1)
      {
        i1 = g;
        i2 = l();
        if (i1 >= 0)
        {
          i3 = j.d() - i1;
          if (k)
          {
            i1 = 0;
            while (i1 < i2)
            {
              paramc = d(i1);
              if ((j.a(paramc) < i3) || (j.d(paramc) < i3))
              {
                a(paramm, 0, i1);
                return;
              }
              i1 += 1;
            }
          }
          else
          {
            i1 = i2 - 1;
            while (i1 >= 0)
            {
              paramc = d(i1);
              if ((j.a(paramc) < i3) || (j.d(paramc) < i3))
              {
                a(paramm, i2 - 1, i1);
                return;
              }
              i1 -= 1;
            }
          }
        }
      }
      else
      {
        i2 = g;
        if (i2 >= 0)
        {
          i3 = l();
          if (k)
          {
            i1 = i3 - 1;
            while (i1 >= 0)
            {
              paramc = d(i1);
              if ((j.b(paramc) > i2) || (j.c(paramc) > i2))
              {
                a(paramm, i3 - 1, i1);
                return;
              }
              i1 -= 1;
            }
          }
          else
          {
            i1 = 0;
            while (i1 < i3)
            {
              paramc = d(i1);
              if ((j.b(paramc) > i2) || (j.c(paramc) > i2))
              {
                a(paramm, 0, i1);
                return;
              }
              i1 += 1;
            }
          }
        }
      }
    }
  }
  
  private int b(int paramInt, at.m paramm, at.r paramr, boolean paramBoolean)
  {
    int i1 = paramInt - j.b();
    if (i1 > 0)
    {
      int i2 = -c(i1, paramm, paramr);
      i1 = i2;
      if (paramBoolean)
      {
        paramInt = paramInt + i2 - j.b();
        i1 = i2;
        if (paramInt > 0)
        {
          j.a(-paramInt);
          i1 = i2 - paramInt;
        }
      }
      return i1;
    }
    return 0;
  }
  
  private void b(a parama)
  {
    j(a, b);
  }
  
  private void b(boolean paramBoolean)
  {
    a(null);
    if (paramBoolean == c) {
      return;
    }
    c = paramBoolean;
    j();
  }
  
  private int c(int paramInt, at.m paramm, at.r paramr)
  {
    if ((l() == 0) || (paramInt == 0)) {
      return 0;
    }
    a.a = true;
    h();
    if (paramInt > 0) {}
    int i2;
    int i3;
    for (int i1 = 1;; i1 = -1)
    {
      i2 = Math.abs(paramInt);
      a(i1, i2, true, paramr);
      i3 = a.g + a(paramm, a, paramr, false);
      if (i3 >= 0) {
        break;
      }
      return 0;
    }
    if (i2 > i3) {
      paramInt = i1 * i3;
    }
    j.a(-paramInt);
    a.j = paramInt;
    return paramInt;
  }
  
  private View c(boolean paramBoolean)
  {
    if (k) {
      return a(l() - 1, -1, paramBoolean);
    }
    return a(0, l(), paramBoolean);
  }
  
  private View d(at.m paramm, at.r paramr)
  {
    return a(paramm, paramr, l() - 1, -1, paramr.a());
  }
  
  private View d(boolean paramBoolean)
  {
    if (k) {
      return a(0, l(), paramBoolean);
    }
    return a(l() - 1, -1, paramBoolean);
  }
  
  private int h(at.r paramr)
  {
    int i2 = 0;
    if (a != -1) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0) {
        i2 = j.e();
      }
      return i2;
    }
  }
  
  private void h(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException("invalid orientation:" + paramInt);
    }
    a(null);
    if (paramInt == i) {
      return;
    }
    i = paramInt;
    j = null;
    j();
  }
  
  private int i(at.r paramr)
  {
    boolean bool2 = true;
    if (l() == 0) {
      return 0;
    }
    h();
    as localas = j;
    View localView;
    if (!e)
    {
      bool1 = true;
      localView = c(bool1);
      if (e) {
        break label74;
      }
    }
    label74:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      return ax.a(paramr, localas, localView, d(bool1), this, e, k);
      bool1 = false;
      break;
    }
  }
  
  private void i(int paramInt1, int paramInt2)
  {
    a.c = (j.c() - paramInt2);
    c localc = a;
    if (k) {}
    for (int i1 = -1;; i1 = 1)
    {
      e = i1;
      a.d = paramInt1;
      a.f = 1;
      a.b = paramInt2;
      a.g = Integer.MIN_VALUE;
      return;
    }
  }
  
  private int j(at.r paramr)
  {
    boolean bool2 = true;
    if (l() == 0) {
      return 0;
    }
    h();
    as localas = j;
    View localView;
    if (!e)
    {
      bool1 = true;
      localView = c(bool1);
      if (e) {
        break label70;
      }
    }
    label70:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      return ax.a(paramr, localas, localView, d(bool1), this, e);
      bool1 = false;
      break;
    }
  }
  
  private void j(int paramInt1, int paramInt2)
  {
    a.c = (paramInt2 - j.b());
    a.d = paramInt1;
    c localc = a;
    if (k) {}
    for (paramInt1 = 1;; paramInt1 = -1)
    {
      e = paramInt1;
      a.f = -1;
      a.b = paramInt2;
      a.g = Integer.MIN_VALUE;
      return;
    }
  }
  
  private int k(at.r paramr)
  {
    boolean bool2 = true;
    if (l() == 0) {
      return 0;
    }
    h();
    as localas = j;
    View localView;
    if (!e)
    {
      bool1 = true;
      localView = c(bool1);
      if (e) {
        break label70;
      }
    }
    label70:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      return ax.b(paramr, localas, localView, d(bool1), this, e);
      bool1 = false;
      break;
    }
  }
  
  private View k(int paramInt1, int paramInt2)
  {
    h();
    if (paramInt2 > paramInt1) {
      i1 = 1;
    }
    while (i1 == 0)
    {
      return d(paramInt1);
      if (paramInt2 < paramInt1) {
        i1 = -1;
      } else {
        i1 = 0;
      }
    }
    int i2;
    if (j.a(d(paramInt1)) < j.b()) {
      i2 = 16644;
    }
    for (int i1 = 16388; i == 0; i1 = 4097)
    {
      return r.a(paramInt1, paramInt2, i2, i1);
      i2 = 4161;
    }
    return s.a(paramInt1, paramInt2, i2, i1);
  }
  
  private void r()
  {
    boolean bool = true;
    if ((i == 1) || (!g())) {
      bool = c;
    }
    for (;;)
    {
      k = bool;
      return;
      if (c) {
        bool = false;
      }
    }
  }
  
  private boolean s()
  {
    return (j.g() == 0) && (j.d() == 0);
  }
  
  private View t()
  {
    if (k) {}
    for (int i1 = l() - 1;; i1 = 0) {
      return d(i1);
    }
  }
  
  private View u()
  {
    if (k) {}
    for (int i1 = 0;; i1 = l() - 1) {
      return d(i1);
    }
  }
  
  private View v()
  {
    return k(0, l());
  }
  
  private View w()
  {
    return k(l() - 1, -1);
  }
  
  public int a(int paramInt, at.m paramm, at.r paramr)
  {
    if (i == 1) {
      return 0;
    }
    return c(paramInt, paramm, paramr);
  }
  
  public final View a(int paramInt)
  {
    int i1 = l();
    Object localObject;
    if (i1 == 0) {
      localObject = null;
    }
    View localView;
    do
    {
      return (View)localObject;
      int i2 = paramInt - a(d(0));
      if ((i2 < 0) || (i2 >= i1)) {
        break;
      }
      localView = d(i2);
      localObject = localView;
    } while (a(localView) == paramInt);
    return super.a(paramInt);
  }
  
  View a(at.m paramm, at.r paramr, int paramInt1, int paramInt2, int paramInt3)
  {
    paramm = null;
    h();
    int i2 = j.b();
    int i3 = j.c();
    int i1;
    label35:
    View localView;
    if (paramInt2 > paramInt1)
    {
      i1 = 1;
      paramr = null;
      if (paramInt1 == paramInt2) {
        break label147;
      }
      localView = d(paramInt1);
      int i4 = a(localView);
      if ((i4 < 0) || (i4 >= paramInt3)) {
        break label159;
      }
      if (!getLayoutParamsc.m()) {
        break label105;
      }
      if (paramr != null) {
        break label159;
      }
      paramr = localView;
    }
    label105:
    label147:
    label157:
    label159:
    for (;;)
    {
      paramInt1 += i1;
      break label35;
      i1 = -1;
      break;
      Object localObject;
      if (j.a(localView) < i3)
      {
        localObject = localView;
        if (j.b(localView) >= i2) {}
      }
      else
      {
        if (paramm != null) {
          break label159;
        }
        paramm = localView;
        continue;
        if (paramm == null) {
          break label157;
        }
        localObject = paramm;
      }
      return (View)localObject;
      return paramr;
    }
  }
  
  public View a(View paramView, int paramInt, at.m paramm, at.r paramr)
  {
    r();
    if (l() == 0)
    {
      paramView = null;
      return paramView;
    }
    paramInt = c(paramInt);
    if (paramInt == Integer.MIN_VALUE) {
      return null;
    }
    h();
    h();
    a(paramInt, (int)(0.33333334F * j.e()), false, paramr);
    a.g = Integer.MIN_VALUE;
    a.a = false;
    a(paramm, a, paramr, true);
    if (paramInt == -1) {
      if (k)
      {
        paramView = w();
        label105:
        paramm = paramView;
        if (paramInt != -1) {
          break label163;
        }
      }
    }
    label163:
    for (paramView = t();; paramView = u())
    {
      if (!paramView.hasFocusable()) {
        return paramm;
      }
      if (paramm != null) {
        break;
      }
      return null;
      paramView = v();
      break label105;
      if (k) {}
      for (paramView = v();; paramView = w())
      {
        paramm = paramView;
        break;
      }
    }
    return paramm;
  }
  
  public final void a(int paramInt1, int paramInt2, at.r paramr, at.g.a parama)
  {
    if (i == 0) {}
    while ((l() == 0) || (paramInt1 == 0))
    {
      return;
      paramInt1 = paramInt2;
    }
    if (paramInt1 > 0) {}
    for (paramInt2 = 1;; paramInt2 = -1)
    {
      a(paramInt2, Math.abs(paramInt1), true, paramr);
      a(paramr, a, parama);
      return;
    }
  }
  
  public final void a(int paramInt, at.g.a parama)
  {
    boolean bool;
    int i1;
    if ((n != null) && (n.a()))
    {
      bool = n.c;
      i1 = n.a;
      if (!bool) {
        break label136;
      }
    }
    label136:
    for (int i2 = -1;; i2 = 1)
    {
      int i4 = 0;
      int i3 = i1;
      i1 = i4;
      while ((i1 < h) && (i3 >= 0) && (i3 < paramInt))
      {
        parama.a(i3, 0);
        i3 += i2;
        i1 += 1;
      }
      r();
      bool = k;
      if (l == -1)
      {
        if (bool) {}
        for (i1 = paramInt - 1;; i1 = 0) {
          break;
        }
      }
      i1 = l;
      break;
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof d))
    {
      n = ((d)paramParcelable);
      j();
    }
  }
  
  void a(at.m paramm, at.r paramr, a parama, int paramInt) {}
  
  void a(at.m paramm, at.r paramr, c paramc, b paramb)
  {
    paramm = paramc.a(paramm);
    if (paramm == null)
    {
      b = true;
      return;
    }
    paramr = (at.h)paramm.getLayoutParams();
    boolean bool2;
    boolean bool1;
    label63:
    int i3;
    int i4;
    int i1;
    int i2;
    if (k == null)
    {
      bool2 = k;
      if (f == -1)
      {
        bool1 = true;
        if (bool2 != bool1) {
          break label366;
        }
        super.a(paramm, -1, false);
        at.h localh = (at.h)paramm.getLayoutParams();
        Rect localRect = q.e(paramm);
        i3 = left;
        i4 = right;
        i1 = top;
        i2 = bottom;
        i3 = at.g.a(D, B, i3 + i4 + 0 + (m() + o() + leftMargin + rightMargin), width, e());
        i1 = at.g.a(E, C, i2 + i1 + 0 + (n() + p() + topMargin + bottomMargin), height, f());
        if (a(paramm, i3, i1, localh)) {
          paramm.measure(i3, i1);
        }
        a = j.e(paramm);
        if (i != 1) {
          break label477;
        }
        if (!g()) {
          break label426;
        }
        i1 = D - o();
        i2 = i1 - j.f(paramm);
        label286:
        if (f != -1) {
          break label448;
        }
        i3 = b;
        i4 = b - a;
      }
    }
    for (;;)
    {
      a(paramm, i2, i4, i1, i3);
      if ((c.m()) || (c.s())) {
        c = true;
      }
      d = paramm.hasFocusable();
      return;
      bool1 = false;
      break;
      label366:
      super.a(paramm, 0, false);
      break label63;
      bool2 = k;
      if (f == -1) {}
      for (bool1 = true;; bool1 = false)
      {
        if (bool2 != bool1) {
          break label416;
        }
        super.a(paramm, -1, true);
        break;
      }
      label416:
      super.a(paramm, 0, true);
      break label63;
      label426:
      i2 = m();
      i1 = j.f(paramm) + i2;
      break label286;
      label448:
      i4 = b;
      i3 = b;
      int i5 = a;
      i3 += i5;
      continue;
      label477:
      i4 = n();
      i3 = j.f(paramm) + i4;
      if (f == -1)
      {
        i1 = b;
        i2 = b - a;
      }
      else
      {
        i2 = b;
        i1 = b + a;
      }
    }
  }
  
  public void a(at.r paramr)
  {
    super.a(paramr);
    n = null;
    l = -1;
    m = Integer.MIN_VALUE;
    o.a();
  }
  
  void a(at.r paramr, c paramc, at.g.a parama)
  {
    int i1 = d;
    if ((i1 >= 0) && (i1 < paramr.a())) {
      parama.a(i1, Math.max(0, g));
    }
  }
  
  public final void a(at paramat, at.m paramm)
  {
    super.a(paramat, paramm);
    if (f)
    {
      c(paramm);
      paramm.a();
    }
  }
  
  public final void a(AccessibilityEvent paramAccessibilityEvent)
  {
    int i2 = -1;
    super.a(paramAccessibilityEvent);
    View localView;
    if (l() > 0)
    {
      paramAccessibilityEvent = a.a(paramAccessibilityEvent);
      localView = a(0, l(), false);
      if (localView != null) {
        break label70;
      }
      i1 = -1;
      paramAccessibilityEvent.a(i1);
      localView = a(l() - 1, -1, false);
      if (localView != null) {
        break label79;
      }
    }
    label70:
    label79:
    for (int i1 = i2;; i1 = a(localView))
    {
      paramAccessibilityEvent.b(i1);
      return;
      i1 = a(localView);
      break;
    }
  }
  
  public final void a(String paramString)
  {
    if (n == null) {
      super.a(paramString);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    a(null);
    if (d == paramBoolean) {
      return;
    }
    d = paramBoolean;
    j();
  }
  
  public int b(int paramInt, at.m paramm, at.r paramr)
  {
    if (i == 0) {
      return 0;
    }
    return c(paramInt, paramm, paramr);
  }
  
  public final int b(at.r paramr)
  {
    return i(paramr);
  }
  
  public at.h b()
  {
    return new at.h(-2, -2);
  }
  
  public final void b(int paramInt)
  {
    l = paramInt;
    m = Integer.MIN_VALUE;
    if (n != null) {
      n.a = -1;
    }
    j();
  }
  
  final int c(int paramInt)
  {
    int i1 = -1;
    switch (paramInt)
    {
    default: 
      paramInt = Integer.MIN_VALUE;
    case 1: 
    case 2: 
    case 33: 
    case 130: 
    case 17: 
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                return paramInt;
                paramInt = i1;
              } while (i == 1);
              paramInt = i1;
            } while (!g());
            return 1;
            if (i == 1) {
              return 1;
            }
            paramInt = i1;
          } while (g());
          return 1;
          paramInt = i1;
        } while (i == 1);
        return Integer.MIN_VALUE;
        if (i == 1) {
          return 1;
        }
        return Integer.MIN_VALUE;
        paramInt = i1;
      } while (i == 0);
      return Integer.MIN_VALUE;
    }
    if (i == 0) {
      return 1;
    }
    return Integer.MIN_VALUE;
  }
  
  public final int c(at.r paramr)
  {
    return i(paramr);
  }
  
  public void c(at.m paramm, at.r paramr)
  {
    if (((n != null) || (l != -1)) && (paramr.a() == 0))
    {
      c(paramm);
      return;
    }
    if ((n != null) && (n.a())) {
      l = n.a;
    }
    h();
    a.a = false;
    r();
    Object localObject2;
    Object localObject1;
    label164:
    label218:
    int i2;
    label247:
    label249:
    label272:
    label305:
    int i4;
    int i5;
    int i3;
    if ((!o.d) || (l != -1) || (n != null))
    {
      o.a();
      o.c = (k ^ d);
      localObject2 = o;
      if ((g) || (l == -1))
      {
        i1 = 0;
        if (i1 == 0)
        {
          if (l() == 0) {
            break label1789;
          }
          if (q != null) {
            break label1257;
          }
          localObject1 = null;
          if (localObject1 == null) {
            break label1604;
          }
          at.h localh = (at.h)((View)localObject1).getLayoutParams();
          if ((c.m()) || (c.c() < 0) || (c.c() >= paramr.a())) {
            break label1292;
          }
          i1 = 1;
          if (i1 == 0) {
            break label1604;
          }
          i2 = e.j.a();
          if (i2 < 0) {
            break label1297;
          }
          ((a)localObject2).a((View)localObject1);
          i1 = 1;
          if (i1 == 0)
          {
            ((a)localObject2).b();
            if (!d) {
              break label1794;
            }
            i1 = paramr.a() - 1;
            a = i1;
          }
        }
        o.d = true;
      }
    }
    else
    {
      i1 = h(paramr);
      if (a.j < 0) {
        break label1799;
      }
      i2 = 0;
      i4 = i2 + j.b();
      i5 = i1 + j.f();
      i2 = i5;
      i3 = i4;
      if (g)
      {
        i2 = i5;
        i3 = i4;
        if (l != -1)
        {
          i2 = i5;
          i3 = i4;
          if (m != Integer.MIN_VALUE)
          {
            localObject1 = a(l);
            i2 = i5;
            i3 = i4;
            if (localObject1 != null)
            {
              if (!k) {
                break label1807;
              }
              i1 = j.c() - j.b((View)localObject1) - m;
              label429:
              if (i1 <= 0) {
                break label1839;
              }
              i3 = i4 + i1;
              i2 = i5;
            }
          }
        }
      }
      label443:
      if (!o.c) {
        break label1857;
      }
      if (!k) {
        break label1852;
      }
      i1 = 1;
      label462:
      a(paramm, paramr, o, i1);
      a(paramm);
      a.l = s();
      a.i = g;
      if (!o.c) {
        break label1874;
      }
      b(o);
      a.h = i3;
      a(paramm, a, paramr, false);
      i4 = a.b;
      i5 = a.d;
      i1 = i2;
      if (a.c > 0) {
        i1 = i2 + a.c;
      }
      a(o);
      a.h = i1;
      localObject1 = a;
      d += a.e;
      a(paramm, a, paramr, false);
      i3 = a.b;
      if (a.c <= 0) {
        break label2453;
      }
      i1 = a.c;
      j(i5, i4);
      a.h = i1;
      a(paramm, a, paramr, false);
    }
    label702:
    label813:
    label1162:
    label1189:
    label1195:
    label1257:
    label1292:
    label1297:
    label1604:
    label1638:
    label1704:
    label1753:
    label1773:
    label1778:
    label1789:
    label1794:
    label1799:
    label1807:
    label1839:
    label1852:
    label1857:
    label1874:
    label2152:
    label2194:
    label2206:
    label2260:
    label2266:
    label2420:
    label2430:
    label2453:
    for (int i1 = a.b;; i1 = i4)
    {
      i2 = i1;
      i1 = i3;
      if (l() > 0) {
        if ((k ^ d))
        {
          i3 = a(i1, paramm, paramr, true);
          i4 = i2 + i3;
          i2 = b(i4, paramm, paramr, false);
          i4 += i2;
          i3 = i1 + i3 + i2;
        }
      }
      for (;;)
      {
        boolean bool;
        int i6;
        if ((!k) || (l() == 0) || (g) || (!c()))
        {
          if (g) {
            break label2420;
          }
          paramm = j;
          b = paramm.e();
          b = d;
          return;
          if ((l < 0) || (l >= paramr.a()))
          {
            l = -1;
            m = Integer.MIN_VALUE;
            i1 = 0;
            break;
          }
          a = l;
          if ((n != null) && (n.a()))
          {
            c = n.c;
            if (c) {}
            for (b = (j.c() - n.b);; b = (j.b() + n.b))
            {
              i1 = 1;
              break;
            }
          }
          if (m == Integer.MIN_VALUE)
          {
            localObject1 = a(l);
            if (localObject1 != null) {
              if (j.e((View)localObject1) > j.e()) {
                ((a)localObject2).b();
              }
            }
          }
          for (;;)
          {
            i1 = 1;
            break;
            if (j.a((View)localObject1) - j.b() < 0)
            {
              b = j.b();
              c = false;
            }
            else if (j.c() - j.b((View)localObject1) < 0)
            {
              b = j.c();
              c = true;
            }
            else
            {
              if (c) {}
              for (i1 = j.b((View)localObject1) + j.a();; i1 = j.a((View)localObject1))
              {
                b = i1;
                i1 = 1;
                break;
              }
              if (l() > 0)
              {
                i1 = a(d(0));
                if (l >= i1) {
                  break label1189;
                }
                bool = true;
                if (bool != k) {
                  break label1195;
                }
              }
              for (bool = true;; bool = false)
              {
                c = bool;
                ((a)localObject2).b();
                break;
                bool = false;
                break label1162;
              }
              c = k;
              if (k) {
                b = (j.c() - m);
              } else {
                b = (j.b() + m);
              }
            }
          }
          localObject1 = q.getFocusedChild();
          if ((localObject1 == null) || (p.d((View)localObject1)))
          {
            localObject1 = null;
            break label164;
          }
          break label164;
          i1 = 0;
          break label218;
          a = a((View)localObject1);
          if (c)
          {
            i1 = e.j.c() - i2 - e.j.b((View)localObject1);
            b = (e.j.c() - i1);
            if (i1 <= 0) {
              break label247;
            }
            i2 = e.j.e((View)localObject1);
            i3 = b;
            i4 = e.j.b();
            i2 = i3 - i2 - (Math.min(e.j.a((View)localObject1) - i4, 0) + i4);
            if (i2 >= 0) {
              break label247;
            }
            i3 = b;
            b = (Math.min(i1, -i2) + i3);
            break label247;
          }
          i3 = e.j.a((View)localObject1);
          i1 = i3 - e.j.b();
          b = i3;
          if (i1 <= 0) {
            break label247;
          }
          i4 = e.j.e((View)localObject1);
          i5 = e.j.c();
          i6 = e.j.b((View)localObject1);
          i2 = e.j.c() - Math.min(0, i5 - i2 - i6) - (i3 + i4);
          if (i2 >= 0) {
            break label247;
          }
          b -= Math.min(i1, -i2);
          break label247;
          if (b == d)
          {
            if (c)
            {
              if (k) {
                break label1753;
              }
              localObject1 = d(paramm, paramr);
              if (localObject1 == null) {
                break label1789;
              }
              ((a)localObject2).a((View)localObject1);
              if ((!g) && (c()))
              {
                if ((j.a((View)localObject1) < j.c()) && (j.b((View)localObject1) >= j.b())) {
                  break label1773;
                }
                i1 = 1;
                if (i1 != 0) {
                  if (!c) {
                    break label1778;
                  }
                }
              }
            }
            for (i1 = j.c();; i1 = j.b())
            {
              b = i1;
              i1 = 1;
              break;
              if (k)
              {
                localObject1 = d(paramm, paramr);
                break label1638;
              }
              localObject1 = a(paramm, paramr, 0, l(), paramr.a());
              break label1638;
              i1 = 0;
              break label1704;
            }
          }
          i1 = 0;
          break label249;
          i1 = 0;
          break label272;
          i2 = i1;
          i1 = 0;
          break label305;
          i1 = j.a((View)localObject1);
          i2 = j.b();
          i1 = m - (i1 - i2);
          break label429;
          i2 = i5 - i1;
          i3 = i4;
          break label443;
          i1 = -1;
          break label462;
          if (k)
          {
            i1 = -1;
            break label462;
          }
          i1 = 1;
          break label462;
          a(o);
          a.h = i2;
          a(paramm, a, paramr, false);
          i4 = a.b;
          i5 = a.d;
          i1 = i3;
          if (a.c > 0) {
            i1 = i3 + a.c;
          }
          b(o);
          a.h = i1;
          localObject1 = a;
          d += a.e;
          a(paramm, a, paramr, false);
          i3 = a.b;
          i1 = i4;
          i2 = i3;
          if (a.c <= 0) {
            break label702;
          }
          i1 = a.c;
          i(i5, i4);
          a.h = i1;
          a(paramm, a, paramr, false);
          i1 = a.b;
          i2 = i3;
          break label702;
          i3 = b(i2, paramm, paramr, true);
          i1 += i3;
          i5 = a(i1, paramm, paramr, false);
          i4 = i2 + i3 + i5;
          i3 = i1 + i5;
          continue;
        }
        i1 = 0;
        i2 = 0;
        localObject1 = d;
        int i7 = ((List)localObject1).size();
        int i8 = a(d(0));
        i5 = 0;
        if (i5 < i7)
        {
          localObject2 = (at.u)((List)localObject1).get(i5);
          if (((at.u)localObject2).m()) {
            break label2430;
          }
          if (((at.u)localObject2).c() < i8)
          {
            bool = true;
            if (bool == k) {
              break label2260;
            }
            i6 = -1;
            if (i6 != -1) {
              break label2266;
            }
            i6 = j.e(a) + i1;
            i1 = i2;
            i2 = i6;
          }
        }
        for (;;)
        {
          i6 = i2;
          i5 += 1;
          i2 = i1;
          i1 = i6;
          break label2152;
          bool = false;
          break label2194;
          i6 = 1;
          break label2206;
          i6 = j.e(a) + i2;
          i2 = i1;
          i1 = i6;
          continue;
          a.k = ((List)localObject1);
          if (i1 > 0)
          {
            j(a(t()), i4);
            a.h = i1;
            a.c = 0;
            a.a(null);
            a(paramm, a, paramr, false);
          }
          if (i2 > 0)
          {
            i(a(u()), i3);
            a.h = i2;
            a.c = 0;
            a.a(null);
            a(paramm, a, paramr, false);
          }
          a.k = null;
          break;
          o.a();
          break label813;
          i6 = i1;
          i1 = i2;
          i2 = i6;
        }
        i3 = i1;
        i4 = i2;
      }
    }
  }
  
  public boolean c()
  {
    return (n == null) && (b == d);
  }
  
  public final int d(at.r paramr)
  {
    return j(paramr);
  }
  
  public final Parcelable d()
  {
    if (n != null) {
      return new d(n);
    }
    d locald = new d();
    if (l() > 0)
    {
      h();
      boolean bool = b ^ k;
      c = bool;
      if (bool)
      {
        localView = u();
        b = (j.c() - j.b(localView));
        a = a(localView);
        return locald;
      }
      View localView = t();
      a = a(localView);
      b = (j.a(localView) - j.b());
      return locald;
    }
    a = -1;
    return locald;
  }
  
  public final int e(at.r paramr)
  {
    return j(paramr);
  }
  
  public final boolean e()
  {
    return i == 0;
  }
  
  public final int f(at.r paramr)
  {
    return k(paramr);
  }
  
  public final boolean f()
  {
    return i == 1;
  }
  
  public final int g(at.r paramr)
  {
    return k(paramr);
  }
  
  protected final boolean g()
  {
    return w.g(q) == 1;
  }
  
  final void h()
  {
    if (a == null) {
      a = new c();
    }
    if (j == null) {
      j = as.a(this, i);
    }
  }
  
  final boolean i()
  {
    if ((C != 1073741824) && (B != 1073741824))
    {
      int i2 = l();
      int i1 = 0;
      if (i1 < i2)
      {
        ViewGroup.LayoutParams localLayoutParams = d(i1).getLayoutParams();
        if ((width >= 0) || (height >= 0)) {}
      }
      for (i1 = 1;; i1 = 0)
      {
        if (i1 == 0) {
          break label75;
        }
        return true;
        i1 += 1;
        break;
      }
    }
    label75:
    return false;
  }
  
  final class a
  {
    int a;
    int b;
    boolean c;
    boolean d;
    
    a()
    {
      a();
    }
    
    final void a()
    {
      a = -1;
      b = Integer.MIN_VALUE;
      c = false;
      d = false;
    }
    
    public final void a(View paramView)
    {
      if (c) {}
      for (b = (j.b(paramView) + j.a());; b = j.a(paramView))
      {
        a = LinearLayoutManager.a(paramView);
        return;
      }
    }
    
    final void b()
    {
      if (c) {}
      for (int i = j.c();; i = j.b())
      {
        b = i;
        return;
      }
    }
    
    public final String toString()
    {
      return "AnchorInfo{mPosition=" + a + ", mCoordinate=" + b + ", mLayoutFromEnd=" + c + ", mValid=" + d + '}';
    }
  }
  
  protected static final class b
  {
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
  }
  
  static final class c
  {
    boolean a = true;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h = 0;
    boolean i = false;
    int j;
    List<at.u> k = null;
    boolean l;
    
    final View a(at.m paramm)
    {
      if (k != null)
      {
        int n = k.size();
        int m = 0;
        while (m < n)
        {
          paramm = k.get(m)).a;
          at.h localh = (at.h)paramm.getLayoutParams();
          if ((!c.m()) && (d == c.c()))
          {
            a(paramm);
            return paramm;
          }
          m += 1;
        }
        return null;
      }
      paramm = paramm.b(d);
      d += e;
      return paramm;
    }
    
    public final void a(View paramView)
    {
      int i2 = k.size();
      Object localObject = null;
      int m = Integer.MAX_VALUE;
      int n = 0;
      if (n < i2)
      {
        View localView = k.get(n)).a;
        at.h localh = (at.h)localView.getLayoutParams();
        if ((localView == paramView) || (c.m())) {
          break label154;
        }
        int i1 = (c.c() - d) * e;
        if ((i1 < 0) || (i1 >= m)) {
          break label154;
        }
        localObject = localView;
        if (i1 != 0)
        {
          localObject = localView;
          m = i1;
        }
      }
      label154:
      for (;;)
      {
        n += 1;
        break;
        if (localObject == null)
        {
          d = -1;
          return;
        }
        d = getLayoutParamsc.c();
        return;
      }
    }
    
    final boolean a(at.r paramr)
    {
      return (d >= 0) && (d < paramr.a());
    }
  }
  
  public static final class d
    implements Parcelable
  {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator() {};
    int a;
    int b;
    boolean c;
    
    public d() {}
    
    d(Parcel paramParcel)
    {
      a = paramParcel.readInt();
      b = paramParcel.readInt();
      if (paramParcel.readInt() == 1) {}
      for (;;)
      {
        c = bool;
        return;
        bool = false;
      }
    }
    
    public d(d paramd)
    {
      a = a;
      b = b;
      c = c;
    }
    
    final boolean a()
    {
      return a >= 0;
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(a);
      paramParcel.writeInt(b);
      if (c) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        return;
      }
    }
  }
}


/* Location:              android/support/v7/widget/LinearLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */