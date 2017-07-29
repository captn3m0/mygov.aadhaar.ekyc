package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
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
  private LinearLayoutManager.c a;
  private boolean b;
  private boolean c = false;
  private boolean d = false;
  private boolean e;
  private boolean f;
  private final LinearLayoutManager.b g;
  private int h;
  int i;
  as j;
  boolean k = false;
  int l;
  int m;
  LinearLayoutManager.d n;
  final LinearLayoutManager.a o;
  
  public LinearLayoutManager(Context paramContext)
  {
    this(paramContext, 1, false);
  }
  
  public LinearLayoutManager(Context paramContext, int paramInt, boolean paramBoolean)
  {
    e = bool;
    l = -1;
    m = (-1 << -1);
    n = null;
    Object localObject = new android/support/v7/widget/LinearLayoutManager$a;
    ((LinearLayoutManager.a)localObject).<init>(this);
    o = ((LinearLayoutManager.a)localObject);
    localObject = new android/support/v7/widget/LinearLayoutManager$b;
    ((LinearLayoutManager.b)localObject).<init>();
    g = ((LinearLayoutManager.b)localObject);
    h = 2;
    h(paramInt);
    b(paramBoolean);
    w = bool;
  }
  
  public LinearLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    e = bool1;
    l = -1;
    m = (-1 << -1);
    n = null;
    Object localObject = new android/support/v7/widget/LinearLayoutManager$a;
    ((LinearLayoutManager.a)localObject).<init>(this);
    o = ((LinearLayoutManager.a)localObject);
    localObject = new android/support/v7/widget/LinearLayoutManager$b;
    ((LinearLayoutManager.b)localObject).<init>();
    g = ((LinearLayoutManager.b)localObject);
    h = 2;
    localObject = a(paramContext, paramAttributeSet, paramInt1, paramInt2);
    int i1 = a;
    h(i1);
    boolean bool2 = c;
    b(bool2);
    boolean bool3 = d;
    a(bool3);
    w = bool1;
  }
  
  private int a(int paramInt, at.m paramm, at.r paramr, boolean paramBoolean)
  {
    as localas1 = j;
    int i1 = localas1.c() - paramInt;
    if (i1 > 0)
    {
      i1 = -i1;
      i1 = -c(i1, paramm, paramr);
      int i2 = paramInt + i1;
      if (paramBoolean)
      {
        as localas2 = j;
        int i3 = localas2.c();
        i2 = i3 - i2;
        if (i2 > 0)
        {
          localas2 = j;
          localas2.a(i2);
          i1 += i2;
        }
      }
    }
    for (;;)
    {
      return i1;
      i1 = 0;
      localas1 = null;
    }
  }
  
  private int a(at.m paramm, LinearLayoutManager.c paramc, at.r paramr, boolean paramBoolean)
  {
    int i1 = -1 << -1;
    int i2 = c;
    int i3 = g;
    if (i3 != i1)
    {
      i3 = c;
      if (i3 < 0)
      {
        i3 = g;
        i4 = c;
        i3 += i4;
        g = i3;
      }
      a(paramm, paramc);
    }
    i3 = c;
    int i4 = h;
    i3 += i4;
    LinearLayoutManager.b localb = g;
    label280:
    boolean bool3;
    do
    {
      do
      {
        boolean bool1 = l;
        if ((!bool1) && (i3 <= 0)) {
          break;
        }
        bool1 = paramc.a(paramr);
        if (!bool1) {
          break;
        }
        a = 0;
        b = false;
        c = false;
        d = false;
        a(paramm, paramr, paramc, localb);
        bool1 = b;
        if (bool1) {
          break;
        }
        int i5 = b;
        int i7 = a;
        int i8 = f;
        i7 *= i8;
        i5 += i7;
        b = i5;
        boolean bool2 = c;
        if (bool2)
        {
          List localList = a.k;
          if (localList == null)
          {
            bool2 = g;
            if (bool2) {
              break label280;
            }
          }
        }
        int i6 = c;
        i7 = a;
        i6 -= i7;
        c = i6;
        i6 = a;
        i3 -= i6;
        i6 = g;
        if (i6 != i1)
        {
          i6 = g;
          i7 = a;
          i6 += i7;
          g = i6;
          i6 = c;
          if (i6 < 0)
          {
            i6 = g;
            i7 = c;
            i6 += i7;
            g = i6;
          }
          a(paramm, paramc);
        }
      } while (!paramBoolean);
      bool3 = d;
    } while (!bool3);
    i3 = c;
    return i2 - i3;
  }
  
  private View a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i1 = 320;
    h();
    int i2;
    bi localbi;
    if (paramBoolean)
    {
      i2 = 24579;
      int i3 = i;
      if (i3 != 0) {
        break label58;
      }
      localbi = r;
    }
    for (View localView = localbi.a(paramInt1, paramInt2, i2, i1);; localView = localbi.a(paramInt1, paramInt2, i2, i1))
    {
      return localView;
      i2 = i1;
      break;
      label58:
      localbi = s;
    }
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean, at.r paramr)
  {
    int i1 = -1;
    float f1 = 0.0F / 0.0F;
    int i2 = 1;
    float f2 = Float.MIN_VALUE;
    Object localObject1 = a;
    boolean bool1 = s();
    l = bool1;
    localObject1 = a;
    int i3 = h(paramr);
    h = i3;
    localObject1 = a;
    f = paramInt1;
    Object localObject2;
    Object localObject3;
    if (paramInt1 == i2)
    {
      localObject1 = a;
      i3 = h;
      as localas1 = j;
      int i4 = localas1.f();
      i3 += i4;
      h = i3;
      localObject1 = u();
      localc = a;
      boolean bool2 = k;
      if (bool2) {}
      for (;;)
      {
        e = i1;
        localObject2 = a;
        i2 = a((View)localObject1);
        localc = a;
        i3 = e;
        i2 += i3;
        d = i2;
        localObject2 = a;
        i2 = j.b((View)localObject1);
        b = i2;
        localObject2 = j;
        i1 = ((as)localObject2).b((View)localObject1);
        localObject3 = j;
        i2 = ((as)localObject3).c();
        i1 -= i2;
        localObject3 = a;
        c = paramInt2;
        if (paramBoolean)
        {
          localObject3 = a;
          int i6 = c - i1;
          c = i6;
        }
        a.g = i1;
        return;
        i1 = i2;
        f1 = f2;
      }
    }
    localObject1 = t();
    LinearLayoutManager.c localc = a;
    int i5 = h;
    as localas2 = j;
    int i7 = localas2.b();
    i5 += i7;
    h = i5;
    localc = a;
    boolean bool3 = k;
    if (bool3) {}
    for (;;)
    {
      e = i2;
      localObject2 = a;
      i2 = a((View)localObject1);
      localc = a;
      i3 = e;
      i2 += i3;
      d = i2;
      localObject2 = a;
      i2 = j.a((View)localObject1);
      b = i2;
      localObject2 = j;
      i1 = -((as)localObject2).a((View)localObject1);
      localObject3 = j;
      i2 = ((as)localObject3).b();
      i1 += i2;
      break;
      i2 = i1;
      f2 = f1;
    }
  }
  
  private void a(LinearLayoutManager.a parama)
  {
    int i1 = a;
    int i2 = b;
    i(i1, i2);
  }
  
  private void a(at.m paramm, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {}
    for (;;)
    {
      return;
      if (paramInt2 > paramInt1)
      {
        int i1 = paramInt2 + -1;
        while (i1 >= paramInt1)
        {
          a(i1, paramm);
          i1 += -1;
        }
      }
      else
      {
        while (paramInt1 > paramInt2)
        {
          a(paramInt1, paramm);
          paramInt1 += -1;
        }
      }
    }
  }
  
  private void a(at.m paramm, LinearLayoutManager.c paramc)
  {
    int i1 = 0;
    View localView = null;
    boolean bool1 = a;
    if (bool1)
    {
      bool1 = l;
      if (!bool1) {
        break label28;
      }
    }
    label28:
    label168:
    label254:
    label368:
    label450:
    for (;;)
    {
      return;
      int i2 = f;
      int i6 = -1;
      int i8;
      Object localObject;
      as localas2;
      int i9;
      int i10;
      if (i2 == i6)
      {
        i2 = g;
        i6 = l();
        if (i2 >= 0)
        {
          as localas1 = j;
          i8 = localas1.d() - i2;
          int i3 = k;
          int i4;
          if (i3 != 0)
          {
            i3 = 0;
            for (;;)
            {
              if (i3 >= i6) {
                break label168;
              }
              localObject = d(i3);
              localas2 = j;
              i9 = localas2.a((View)localObject);
              if (i9 >= i8)
              {
                localas2 = j;
                i10 = localas2.d((View)localObject);
                if (i10 >= i8) {}
              }
              else
              {
                a(paramm, 0, i3);
                break;
              }
              i3 += 1;
            }
          }
          else
          {
            i4 = i6 + -1;
            for (;;)
            {
              if (i4 < 0) {
                break label254;
              }
              localView = d(i4);
              localObject = j;
              i10 = ((as)localObject).a(localView);
              if (i10 >= i8)
              {
                localObject = j;
                i1 = ((as)localObject).d(localView);
                if (i1 >= i8) {}
              }
              else
              {
                i1 = i6 + -1;
                a(paramm, i1, i4);
                break;
              }
              i4 += -1;
            }
          }
        }
      }
      else
      {
        int i7 = g;
        if (i7 >= 0)
        {
          i8 = l();
          boolean bool2 = k;
          int i5;
          if (bool2)
          {
            i5 = i8 + -1;
            for (;;)
            {
              if (i5 < 0) {
                break label368;
              }
              localView = d(i5);
              localObject = j;
              i10 = ((as)localObject).b(localView);
              if (i10 <= i7)
              {
                localObject = j;
                i1 = ((as)localObject).c(localView);
                if (i1 <= i7) {}
              }
              else
              {
                i1 = i8 + -1;
                a(paramm, i1, i5);
                break;
              }
              i5 += -1;
            }
          }
          else
          {
            i5 = 0;
            for (;;)
            {
              if (i5 >= i8) {
                break label450;
              }
              localObject = d(i5);
              localas2 = j;
              i9 = localas2.b((View)localObject);
              if (i9 <= i7)
              {
                localas2 = j;
                i10 = localas2.c((View)localObject);
                if (i10 <= i7) {}
              }
              else
              {
                a(paramm, 0, i5);
                break;
              }
              i5 += 1;
            }
          }
        }
      }
    }
  }
  
  private int b(int paramInt, at.m paramm, at.r paramr, boolean paramBoolean)
  {
    as localas1 = j;
    int i1 = localas1.b();
    i1 = paramInt - i1;
    if (i1 > 0)
    {
      i1 = -c(i1, paramm, paramr);
      int i2 = paramInt + i1;
      if (paramBoolean)
      {
        as localas2 = j;
        int i3 = localas2.b();
        i2 -= i3;
        if (i2 > 0)
        {
          localas2 = j;
          int i4 = -i2;
          localas2.a(i4);
          i1 -= i2;
        }
      }
    }
    for (;;)
    {
      return i1;
      i1 = 0;
      localas1 = null;
    }
  }
  
  private void b(LinearLayoutManager.a parama)
  {
    int i1 = a;
    int i2 = b;
    j(i1, i2);
  }
  
  private void b(boolean paramBoolean)
  {
    a(null);
    boolean bool = c;
    if (paramBoolean == bool) {}
    for (;;)
    {
      return;
      c = paramBoolean;
      j();
    }
  }
  
  private int c(int paramInt, at.m paramm, at.r paramr)
  {
    int i1 = 1;
    int i3 = l();
    if ((i3 == 0) || (paramInt == 0)) {
      paramInt = 0;
    }
    for (;;)
    {
      return paramInt;
      Object localObject = a;
      a = i1;
      h();
      if (paramInt > 0) {}
      int i4;
      for (i3 = i1;; i3 = -1)
      {
        i4 = Math.abs(paramInt);
        a(i3, i4, i1, paramr);
        LinearLayoutManager.c localc1 = a;
        i2 = g;
        LinearLayoutManager.c localc2 = a;
        int i5 = a(paramm, localc2, paramr, false);
        i2 += i5;
        if (i2 >= 0) {
          break label117;
        }
        paramInt = 0;
        break;
      }
      label117:
      if (i4 > i2) {
        paramInt = i3 * i2;
      }
      localObject = j;
      int i2 = -paramInt;
      ((as)localObject).a(i2);
      localObject = a;
      j = paramInt;
    }
  }
  
  private View c(boolean paramBoolean)
  {
    boolean bool = k;
    int i1;
    int i2;
    if (bool)
    {
      i1 = l() + -1;
      i2 = -1;
    }
    for (View localView = a(i1, i2, paramBoolean);; localView = a(0, i2, paramBoolean))
    {
      return localView;
      i1 = 0;
      i2 = l();
    }
  }
  
  private View d(at.m paramm, at.r paramr)
  {
    int i1 = l() + -1;
    int i2 = paramr.a();
    return a(paramm, paramr, i1, -1, i2);
  }
  
  private View d(boolean paramBoolean)
  {
    boolean bool = k;
    int i2;
    if (bool)
    {
      bool = false;
      i2 = l();
    }
    int i1;
    for (View localView = a(0, i2, paramBoolean);; localView = a(i1, i2, paramBoolean))
    {
      return localView;
      i1 = l() + -1;
      i2 = -1;
    }
  }
  
  private int h(at.r paramr)
  {
    int i1 = 0;
    as localas = null;
    int i2 = a;
    int i3 = -1;
    if (i2 != i3) {}
    for (i2 = 1;; i2 = 0)
    {
      if (i2 != 0)
      {
        localas = j;
        i1 = localas.e();
      }
      return i1;
    }
  }
  
  private void h(int paramInt)
  {
    Object localObject = null;
    if (paramInt != 0)
    {
      i1 = 1;
      if (paramInt != i1)
      {
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("invalid orientation:");
        localObject = paramInt;
        localIllegalArgumentException.<init>((String)localObject);
        throw localIllegalArgumentException;
      }
    }
    a(null);
    int i1 = i;
    if (paramInt == i1) {}
    for (;;)
    {
      return;
      i = paramInt;
      j = null;
      j();
    }
  }
  
  private int i(at.r paramr)
  {
    boolean bool1 = true;
    int i1 = 0;
    int i2 = l();
    if (i2 == 0) {
      return i1;
    }
    h();
    as localas = j;
    boolean bool2 = e;
    label41:
    View localView1;
    if (!bool2)
    {
      bool2 = bool1;
      localView1 = c(bool2);
      bool2 = e;
      if (bool2) {
        break label104;
      }
    }
    for (;;)
    {
      View localView2 = d(bool1);
      boolean bool3 = e;
      boolean bool4 = k;
      i1 = ax.a(paramr, localas, localView1, localView2, this, bool3, bool4);
      break;
      bool2 = false;
      break label41;
      label104:
      bool1 = false;
      localView2 = null;
    }
  }
  
  private void i(int paramInt1, int paramInt2)
  {
    int i1 = 1;
    LinearLayoutManager.c localc1 = a;
    int i2 = j.c() - paramInt2;
    c = i2;
    LinearLayoutManager.c localc2 = a;
    boolean bool = k;
    if (bool) {}
    for (int i3 = -1;; i3 = i1)
    {
      e = i3;
      a.d = paramInt1;
      a.f = i1;
      a.b = paramInt2;
      a.g = (-1 << -1);
      return;
    }
  }
  
  private int j(at.r paramr)
  {
    boolean bool1 = true;
    int i1 = 0;
    int i2 = l();
    if (i2 == 0) {
      return i1;
    }
    h();
    as localas = j;
    boolean bool2 = e;
    label41:
    View localView1;
    if (!bool2)
    {
      bool2 = bool1;
      localView1 = c(bool2);
      bool2 = e;
      if (bool2) {
        break label96;
      }
    }
    for (;;)
    {
      View localView2 = d(bool1);
      boolean bool3 = e;
      i1 = ax.a(paramr, localas, localView1, localView2, this, bool3);
      break;
      bool2 = false;
      break label41;
      label96:
      bool1 = false;
      localView2 = null;
    }
  }
  
  private void j(int paramInt1, int paramInt2)
  {
    int i1 = -1;
    LinearLayoutManager.c localc1 = a;
    int i2 = j.b();
    i2 = paramInt2 - i2;
    c = i2;
    localc1 = a;
    d = paramInt1;
    LinearLayoutManager.c localc2 = a;
    int i3 = k;
    if (i3 != 0) {}
    for (i3 = 1;; i3 = i1)
    {
      e = i3;
      a.f = i1;
      a.b = paramInt2;
      a.g = (-1 << -1);
      return;
    }
  }
  
  private int k(at.r paramr)
  {
    boolean bool1 = true;
    int i1 = 0;
    int i2 = l();
    if (i2 == 0) {
      return i1;
    }
    h();
    as localas = j;
    boolean bool2 = e;
    label41:
    View localView1;
    if (!bool2)
    {
      bool2 = bool1;
      localView1 = c(bool2);
      bool2 = e;
      if (bool2) {
        break label96;
      }
    }
    for (;;)
    {
      View localView2 = d(bool1);
      boolean bool3 = e;
      i1 = ax.b(paramr, localas, localView1, localView2, this, bool3);
      break;
      bool2 = false;
      break label41;
      label96:
      bool1 = false;
      localView2 = null;
    }
  }
  
  private View k(int paramInt1, int paramInt2)
  {
    h();
    int i1;
    Object localObject1;
    if (paramInt2 > paramInt1)
    {
      i1 = 1;
      if (i1 != 0) {
        break label43;
      }
      localObject1 = d(paramInt1);
    }
    for (;;)
    {
      return (View)localObject1;
      if (paramInt2 < paramInt1)
      {
        i1 = -1;
        break;
      }
      i1 = 0;
      localObject1 = null;
      break;
      label43:
      localObject1 = j;
      Object localObject2 = d(paramInt1);
      i1 = ((as)localObject1).a((View)localObject2);
      localObject2 = j;
      int i2 = ((as)localObject2).b();
      if (i1 < i2) {
        i2 = 16644;
      }
      for (i1 = 16388;; i1 = 4097)
      {
        int i3 = i;
        if (i3 != 0) {
          break label136;
        }
        localbi = r;
        localObject1 = localbi.a(paramInt1, paramInt2, i2, i1);
        break;
        i2 = 4161;
      }
      label136:
      bi localbi = s;
      localObject1 = localbi.a(paramInt1, paramInt2, i2, i1);
    }
  }
  
  private void r()
  {
    int i1 = 1;
    int i2 = i;
    boolean bool;
    if (i2 != i1)
    {
      bool = g();
      if (bool) {}
    }
    else
    {
      i1 = c;
    }
    for (;;)
    {
      k = i1;
      return;
      bool = c;
      if (bool) {
        i1 = 0;
      }
    }
  }
  
  private boolean s()
  {
    as localas = j;
    int i1 = localas.g();
    if (i1 == 0)
    {
      localas = j;
      i1 = localas.d();
      if (i1 == 0) {
        i1 = 1;
      }
    }
    for (;;)
    {
      return i1;
      int i2 = 0;
      localas = null;
    }
  }
  
  private View t()
  {
    boolean bool = k;
    if (bool) {}
    for (int i1 = l() + -1;; i1 = 0) {
      return d(i1);
    }
  }
  
  private View u()
  {
    int i1 = k;
    if (i1 != 0) {}
    int i2;
    for (i1 = 0;; i2 = l() + -1) {
      return d(i1);
    }
  }
  
  private View v()
  {
    int i1 = l();
    return k(0, i1);
  }
  
  private View w()
  {
    int i1 = l() + -1;
    return k(i1, -1);
  }
  
  public int a(int paramInt, at.m paramm, at.r paramr)
  {
    int i1 = i;
    int i2 = 1;
    if (i1 == i2) {}
    for (i1 = 0;; i1 = c(paramInt, paramm, paramr)) {
      return i1;
    }
  }
  
  public final View a(int paramInt)
  {
    int i1 = l();
    View localView1;
    if (i1 == 0)
    {
      i1 = 0;
      localView1 = null;
    }
    for (;;)
    {
      return localView1;
      View localView2 = d(0);
      int i2 = a(localView2);
      i2 = paramInt - i2;
      if ((i2 >= 0) && (i2 < i1))
      {
        localView1 = d(i2);
        i2 = a(localView1);
        if (i2 == paramInt) {}
      }
      else
      {
        localView1 = super.a(paramInt);
      }
    }
  }
  
  View a(at.m paramm, at.r paramr, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = null;
    h();
    int i1 = j.b();
    Object localObject2 = j;
    int i2 = ((as)localObject2).c();
    int i5;
    Object localObject3;
    label45:
    Object localObject4;
    if (paramInt2 > paramInt1)
    {
      int i3 = 1;
      i5 = i3;
      localObject3 = null;
      if (paramInt1 == paramInt2) {
        break label197;
      }
      localObject4 = d(paramInt1);
      i3 = a((View)localObject4);
      if ((i3 < 0) || (i3 >= paramInt3)) {
        break label216;
      }
      localObject2 = getLayoutParamsc;
      boolean bool = ((at.u)localObject2).m();
      if (!bool) {
        break label137;
      }
      if (localObject3 != null) {
        break label216;
      }
      localObject2 = localObject1;
    }
    for (;;)
    {
      paramInt1 += i5;
      localObject1 = localObject2;
      localObject3 = localObject4;
      break label45;
      int i4 = -1;
      i5 = i4;
      break;
      label137:
      localObject2 = j;
      i4 = ((as)localObject2).a((View)localObject4);
      if (i4 < i2)
      {
        localObject2 = j;
        i4 = ((as)localObject2).b((View)localObject4);
        if (i4 >= i1) {}
      }
      else
      {
        if (localObject1 != null) {
          break label216;
        }
        localObject2 = localObject4;
        localObject4 = localObject3;
        continue;
        label197:
        if (localObject1 == null) {
          break label209;
        }
      }
      label209:
      for (localObject4 = localObject1;; localObject4 = localObject3) {
        return (View)localObject4;
      }
      label216:
      localObject2 = localObject1;
      localObject4 = localObject3;
    }
  }
  
  public View a(View paramView, int paramInt, at.m paramm, at.r paramr)
  {
    int i1 = -1;
    int i2 = -1 << -1;
    r();
    int i3 = l();
    Object localObject1;
    float f1;
    if (i3 == 0)
    {
      i3 = 0;
      localObject1 = null;
      f1 = 0.0F;
    }
    for (;;)
    {
      return (View)localObject1;
      int i4 = c(paramInt);
      if (i4 == i2)
      {
        i3 = 0;
        localObject1 = null;
        f1 = 0.0F;
      }
      else
      {
        h();
        h();
        Object localObject2 = j;
        float f2 = ((as)localObject2).e();
        f1 = 0.33333334F * f2;
        i3 = (int)f1;
        a(i4, i3, false, paramr);
        a.g = i2;
        a.a = false;
        localObject1 = a;
        boolean bool3 = true;
        f2 = Float.MIN_VALUE;
        a(paramm, (LinearLayoutManager.c)localObject1, paramr, bool3);
        boolean bool1;
        if (i4 == i1)
        {
          bool1 = k;
          if (bool1)
          {
            localObject1 = w();
            label173:
            localObject2 = localObject1;
            if (i4 != i1) {
              break label261;
            }
          }
        }
        label261:
        for (localObject1 = t();; localObject1 = u())
        {
          boolean bool2 = ((View)localObject1).hasFocusable();
          if (!bool2) {
            break label270;
          }
          if (localObject2 != null) {
            break;
          }
          bool1 = false;
          localObject1 = null;
          f1 = 0.0F;
          break;
          localObject1 = v();
          break label173;
          bool1 = k;
          if (bool1) {}
          for (localObject1 = v();; localObject1 = w())
          {
            localObject2 = localObject1;
            break;
          }
        }
        label270:
        localObject1 = localObject2;
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, at.r paramr, at.g.a parama)
  {
    int i1 = 1;
    int i2 = i;
    if (i2 == 0) {}
    for (;;)
    {
      i2 = l();
      if ((i2 != 0) && (paramInt1 != 0)) {
        break;
      }
      return;
      paramInt1 = paramInt2;
    }
    if (paramInt1 > 0) {}
    for (i2 = i1;; i2 = -1)
    {
      int i3 = Math.abs(paramInt1);
      a(i2, i3, i1, paramr);
      LinearLayoutManager.c localc = a;
      a(paramr, localc, parama);
      break;
    }
  }
  
  public final void a(int paramInt, at.g.a parama)
  {
    int i1 = -1;
    LinearLayoutManager.d locald1 = n;
    int i4;
    if (locald1 != null)
    {
      locald1 = n;
      i2 = locald1.a();
      if (i2 != 0)
      {
        locald1 = n;
        i2 = c;
        LinearLayoutManager.d locald2 = n;
        i4 = a;
        if (i2 == 0) {
          break label178;
        }
      }
    }
    int i3;
    label178:
    for (int i2 = i1;; i3 = 1)
    {
      i1 = 0;
      for (;;)
      {
        int i5 = h;
        if ((i1 >= i5) || (i4 < 0) || (i4 >= paramInt)) {
          break;
        }
        parama.a(i4, 0);
        i4 += i2;
        i1 += 1;
      }
      r();
      int i6 = k;
      i3 = l;
      if (i3 == i1)
      {
        if (i6 != 0) {
          i3 = paramInt + -1;
        }
        for (;;)
        {
          i4 = i3;
          i3 = i6;
          break;
          i3 = 0;
          locald1 = null;
        }
      }
      i4 = l;
      i3 = i6;
      break;
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof LinearLayoutManager.d;
    if (bool)
    {
      paramParcelable = (LinearLayoutManager.d)paramParcelable;
      n = paramParcelable;
      j();
    }
  }
  
  void a(at.m paramm, at.r paramr, LinearLayoutManager.a parama, int paramInt) {}
  
  void a(at.m paramm, at.r paramr, LinearLayoutManager.c paramc, LinearLayoutManager.b paramb)
  {
    View localView = paramc.a(paramm);
    boolean bool1;
    if (localView == null)
    {
      bool1 = true;
      b = bool1;
      return;
    }
    Object localObject1 = (at.h)localView.getLayoutParams();
    Object localObject2 = k;
    label69:
    Object localObject3;
    label94:
    int i12;
    int i2;
    int i17;
    int i8;
    label463:
    int i16;
    if (localObject2 == null)
    {
      int i1 = k;
      int i5 = f;
      int i11 = -1;
      if (i5 == i11)
      {
        i5 = 1;
        if (i1 != i5) {
          break label612;
        }
        int i6 = -1;
        i1 = 0;
        localObject3 = null;
        super.a(localView, i6, false);
        localObject2 = (at.h)localView.getLayoutParams();
        localObject3 = q.e(localView);
        i12 = left;
        int i14 = right;
        i12 = i12 + i14 + 0;
        int i15 = top;
        i2 = bottom + i15 + 0;
        i15 = D;
        i17 = B;
        int i18 = m();
        int i20 = o();
        i18 += i20;
        int i21 = leftMargin;
        i18 += i21;
        int i22 = rightMargin;
        i18 += i22;
        i12 += i18;
        int i19 = width;
        boolean bool5 = e();
        i12 = at.g.a(i15, i17, i12, i19, bool5);
        i15 = E;
        i17 = C;
        i19 = n();
        int i23 = p();
        i19 += i23;
        i23 = topMargin;
        i19 += i23;
        i23 = bottomMargin;
        i19 += i23;
        i2 += i19;
        i19 = height;
        boolean bool6 = f();
        i2 = at.g.a(i15, i17, i2, i19, bool6);
        boolean bool2 = a(localView, i12, i2, (at.h)localObject2);
        if (bool2) {
          localView.measure(i12, i2);
        }
        localObject2 = j;
        int i7 = ((as)localObject2).e(localView);
        a = i7;
        i7 = i;
        i2 = 1;
        if (i7 != i2) {
          break label788;
        }
        boolean bool3 = g();
        if (!bool3) {
          break label716;
        }
        i8 = D;
        i2 = o();
        i8 -= i2;
        localObject3 = j;
        i2 = ((as)localObject3).f(localView);
        i2 = i8 - i2;
        i12 = f;
        i15 = -1;
        if (i12 != i15) {
          break label743;
        }
        i12 = b;
        i16 = b;
        i17 = a;
        i16 -= i17;
        int i24 = i12;
        i12 = i16;
        i16 = i2;
        i2 = i8;
        i8 = i24;
      }
    }
    for (;;)
    {
      a(localView, i16, i12, i2, i8);
      localObject2 = c;
      boolean bool4 = ((at.u)localObject2).m();
      if (!bool4)
      {
        localObject1 = c;
        bool1 = ((at.u)localObject1).s();
        if (!bool1) {}
      }
      else
      {
        bool1 = true;
        c = bool1;
      }
      bool1 = localView.hasFocusable();
      d = bool1;
      break;
      bool4 = false;
      localObject2 = null;
      break label69;
      label612:
      bool4 = false;
      localObject2 = null;
      i2 = 0;
      localObject3 = null;
      super.a(localView, 0, false);
      break label94;
      int i3 = k;
      int i9 = f;
      i12 = -1;
      if (i9 == i12) {
        i9 = 1;
      }
      for (;;)
      {
        if (i3 != i9) {
          break label695;
        }
        i10 = -1;
        i3 = 1;
        super.a(localView, i10, i3);
        break;
        i10 = 0;
        localObject2 = null;
      }
      label695:
      int i10 = 0;
      localObject2 = null;
      i3 = 1;
      super.a(localView, 0, i3);
      break label94;
      label716:
      int i4 = m();
      localObject2 = j;
      i10 = ((as)localObject2).f(localView) + i4;
      break label463;
      label743:
      i16 = b;
      int i13 = b;
      i17 = a;
      int i25 = i13 + i17;
      i13 = i16;
      i16 = i4;
      i4 = i10;
      i10 = i25;
      continue;
      label788:
      i13 = n();
      localObject2 = j;
      i10 = ((as)localObject2).f(localView) + i13;
      i4 = f;
      i16 = -1;
      if (i4 == i16)
      {
        i4 = b;
        i16 = b;
        i17 = a;
        i16 -= i17;
      }
      else
      {
        i16 = b;
        i4 = b;
        i17 = a;
        i4 += i17;
      }
    }
  }
  
  public void a(at.r paramr)
  {
    super.a(paramr);
    n = null;
    l = -1;
    m = (-1 << -1);
    o.a();
  }
  
  void a(at.r paramr, LinearLayoutManager.c paramc, at.g.a parama)
  {
    int i1 = d;
    if (i1 >= 0)
    {
      int i2 = paramr.a();
      if (i1 < i2)
      {
        int i3 = g;
        i2 = Math.max(0, i3);
        parama.a(i1, i2);
      }
    }
  }
  
  public final void a(at paramat, at.m paramm)
  {
    super.a(paramat, paramm);
    boolean bool = f;
    if (bool)
    {
      c(paramm);
      paramm.a();
    }
  }
  
  public final void a(AccessibilityEvent paramAccessibilityEvent)
  {
    int i1 = -1;
    super.a(paramAccessibilityEvent);
    int i2 = l();
    f localf;
    View localView;
    if (i2 > 0)
    {
      localf = a.a(paramAccessibilityEvent);
      i2 = l();
      localView = a(0, i2, false);
      if (localView != null) {
        break label77;
      }
      i2 = i1;
      localf.a(i2);
      i2 = l() + -1;
      localView = a(i2, i1, false);
      if (localView != null) {
        break label86;
      }
    }
    for (;;)
    {
      localf.b(i1);
      return;
      label77:
      i2 = a(localView);
      break;
      label86:
      i1 = a(localView);
    }
  }
  
  public final void a(String paramString)
  {
    LinearLayoutManager.d locald = n;
    if (locald == null) {
      super.a(paramString);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    a(null);
    boolean bool = d;
    if (bool == paramBoolean) {}
    for (;;)
    {
      return;
      d = paramBoolean;
      j();
    }
  }
  
  public int b(int paramInt, at.m paramm, at.r paramr)
  {
    int i1 = i;
    if (i1 == 0) {}
    for (i1 = 0;; i1 = c(paramInt, paramm, paramr)) {
      return i1;
    }
  }
  
  public final int b(at.r paramr)
  {
    return i(paramr);
  }
  
  public at.h b()
  {
    int i1 = -2;
    at.h localh = new android/support/v7/widget/at$h;
    localh.<init>(i1, i1);
    return localh;
  }
  
  public final void b(int paramInt)
  {
    l = paramInt;
    int i1 = -1 << -1;
    m = i1;
    LinearLayoutManager.d locald = n;
    if (locald != null)
    {
      locald = n;
      int i2 = -1;
      a = i2;
    }
    j();
  }
  
  final int c(int paramInt)
  {
    int i1 = -1;
    int i2 = -1 << -1;
    int i5 = 1;
    switch (paramInt)
    {
    default: 
      i1 = i2;
    }
    for (;;)
    {
      return i1;
      i2 = i;
      if (i2 != i5)
      {
        boolean bool = g();
        if (bool)
        {
          i1 = i5;
          continue;
          int i3 = i;
          if (i3 == i5)
          {
            i1 = i5;
          }
          else
          {
            int i4 = g();
            if (i4 == 0)
            {
              i1 = i5;
              continue;
              int i6 = i;
              if (i6 != i5)
              {
                i1 = i4;
                continue;
                i1 = i;
                if (i1 == i5)
                {
                  i1 = i5;
                }
                else
                {
                  i1 = i4;
                  continue;
                  i5 = i;
                  if (i5 != 0)
                  {
                    i1 = i4;
                    continue;
                    i1 = i;
                    if (i1 == 0) {
                      i1 = i5;
                    } else {
                      i1 = i4;
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
  
  public final int c(at.r paramr)
  {
    return i(paramr);
  }
  
  public void c(at.m paramm, at.r paramr)
  {
    Object localObject1 = n;
    int i1;
    if (localObject1 == null)
    {
      i1 = l;
      i13 = -1;
      if (i1 == i13) {}
    }
    else
    {
      i1 = paramr.a();
      if (i1 == 0)
      {
        c(paramm);
        return;
      }
    }
    localObject1 = n;
    if (localObject1 != null)
    {
      localObject1 = n;
      boolean bool1 = ((LinearLayoutManager.d)localObject1).a();
      if (bool1)
      {
        localObject1 = n;
        int i2 = a;
        l = i2;
      }
    }
    h();
    localObject1 = a;
    int i13 = 0;
    Object localObject2 = null;
    a = false;
    r();
    localObject1 = o;
    boolean bool2 = d;
    if (bool2)
    {
      int i3 = l;
      i13 = -1;
      if (i3 == i13)
      {
        localObject1 = n;
        if (localObject1 == null) {
          break label422;
        }
      }
    }
    o.a();
    localObject1 = o;
    boolean bool12 = k;
    boolean bool16 = d;
    bool12 ^= bool16;
    c = bool12;
    LinearLayoutManager.a locala = o;
    boolean bool3 = g;
    int i4;
    int i14;
    label224:
    label260:
    Object localObject3;
    label337:
    label369:
    label372:
    label401:
    label422:
    label453:
    Object localObject4;
    Object localObject5;
    label612:
    label624:
    label656:
    int i23;
    int i32;
    if (!bool3)
    {
      i4 = l;
      i14 = -1;
      if (i4 != i14) {}
    }
    else
    {
      i4 = 0;
      localObject1 = null;
      if (i4 == 0)
      {
        i4 = l();
        if (i4 == 0) {
          break label2604;
        }
        localObject1 = q;
        if (localObject1 != null) {
          break label1850;
        }
        i4 = 0;
        localObject1 = null;
        i14 = 0;
        localObject2 = null;
        if (localObject2 == null) {
          break label2331;
        }
        localObject1 = (at.h)((View)localObject2).getLayoutParams();
        localObject3 = c;
        bool16 = ((at.u)localObject3).m();
        if (bool16) {
          break label1901;
        }
        localObject3 = c;
        i20 = ((at.u)localObject3).c();
        if (i20 < 0) {
          break label1901;
        }
        localObject1 = c;
        i4 = ((at.u)localObject1).c();
        i20 = paramr.a();
        if (i4 >= i20) {
          break label1901;
        }
        i4 = 1;
        if (i4 == 0) {
          break label2331;
        }
        localObject1 = e.j;
        i4 = ((as)localObject1).a();
        if (i4 < 0) {
          break label1909;
        }
        locala.a((View)localObject2);
        i4 = 1;
        if (i4 == 0)
        {
          locala.b();
          boolean bool4 = d;
          if (!bool4) {
            break label2612;
          }
          i5 = paramr.a() + -1;
          a = i5;
        }
      }
      localObject1 = o;
      i14 = 1;
      d = i14;
      i5 = h(paramr);
      localObject2 = a;
      i14 = j;
      if (i14 < 0) {
        break label2620;
      }
      i14 = 0;
      localObject2 = null;
      int i20 = j.b();
      i14 += i20;
      localObject3 = j;
      i20 = ((as)localObject3).f();
      i5 += i20;
      boolean bool17 = g;
      if (bool17)
      {
        int i21 = l;
        int i27 = -1;
        if (i21 != i27)
        {
          i21 = m;
          i27 = -1 << -1;
          if (i21 != i27)
          {
            i21 = l;
            localObject3 = a(i21);
            if (localObject3 != null)
            {
              boolean bool22 = k;
              if (!bool22) {
                break label2635;
              }
              localObject4 = j;
              int i28 = ((as)localObject4).c();
              localObject5 = j;
              i21 = ((as)localObject5).b((View)localObject3);
              i21 = i28 - i21;
              i28 = m;
              i21 -= i28;
              if (i21 <= 0) {
                break label2682;
              }
              i14 += i21;
            }
          }
        }
      }
      localObject3 = o;
      int i22 = c;
      if (i22 == 0) {
        break label2698;
      }
      i22 = k;
      if (i22 == 0) {
        break label2692;
      }
      i22 = 1;
      localObject4 = o;
      a(paramm, paramr, (LinearLayoutManager.a)localObject4, i22);
      a(paramm);
      localObject3 = a;
      boolean bool23 = s();
      l = bool23;
      localObject3 = a;
      bool23 = g;
      i = bool23;
      localObject3 = o;
      boolean bool18 = c;
      if (!bool18) {
        break label2721;
      }
      localObject3 = o;
      b((LinearLayoutManager.a)localObject3);
      a.h = i14;
      localObject2 = a;
      a(paramm, (LinearLayoutManager.c)localObject2, paramr, false);
      localObject2 = a;
      i14 = b;
      int i29 = a.d;
      localObject3 = a;
      i23 = c;
      if (i23 > 0)
      {
        localObject3 = a;
        i23 = c;
        i5 += i23;
      }
      localObject3 = o;
      a((LinearLayoutManager.a)localObject3);
      a.h = i5;
      localObject1 = a;
      i23 = d;
      localObject5 = a;
      i32 = e;
      i23 += i32;
      d = i23;
      localObject1 = a;
      localObject3 = null;
      a(paramm, (LinearLayoutManager.c)localObject1, paramr, false);
      i23 = a.b;
      localObject1 = a;
      i5 = c;
      if (i5 <= 0) {
        break label3461;
      }
      i5 = a.c;
      j(i29, i14);
      a.h = i5;
      localObject1 = a;
      i14 = 0;
      localObject2 = null;
      a(paramm, (LinearLayoutManager.c)localObject1, paramr, false);
      localObject1 = a;
    }
    label995:
    label1163:
    label1711:
    label1742:
    label1750:
    label1850:
    label1901:
    label1909:
    label2331:
    label2380:
    int i19;
    label2479:
    label2541:
    label2582:
    label2590:
    int i12;
    label2604:
    label2612:
    label2620:
    label2635:
    label2682:
    label2692:
    label2698:
    label2721:
    label3054:
    label3099:
    label3146:
    label3162:
    label3228:
    label3234:
    label3439:
    label3461:
    for (int i5 = b;; i12 = i19)
    {
      i14 = i5;
      i5 = i23;
      i23 = l();
      int i24;
      if (i23 > 0)
      {
        boolean bool19 = k;
        boolean bool24 = d;
        bool19 ^= bool24;
        if (bool19)
        {
          i24 = a(i5, paramm, paramr, true);
          i14 += i24;
          i5 += i24;
          localObject3 = null;
          i24 = b(i14, paramm, paramr, false);
          i14 += i24;
          i5 += i24;
          i24 = i14;
          i14 = i5;
        }
      }
      for (;;)
      {
        boolean bool5 = k;
        if (bool5)
        {
          int i6 = l();
          if (i6 != 0)
          {
            bool6 = g;
            if (!bool6)
            {
              bool6 = c();
              if (bool6) {
                break label3054;
              }
            }
          }
        }
        boolean bool6 = g;
        int i33;
        List localList;
        int i36;
        int i31;
        if (!bool6)
        {
          localObject1 = j;
          i14 = ((as)localObject1).e();
          b = i14;
          bool6 = d;
          b = bool6;
          break;
          int i7 = l;
          if (i7 >= 0)
          {
            i7 = l;
            i14 = paramr.a();
            if (i7 < i14) {}
          }
          else
          {
            l = -1;
            m = (-1 << -1);
            i7 = 0;
            localObject1 = null;
            break label224;
          }
          i7 = l;
          a = i7;
          localObject1 = n;
          if (localObject1 != null)
          {
            localObject1 = n;
            boolean bool7 = ((LinearLayoutManager.d)localObject1).a();
            if (bool7)
            {
              localObject1 = n;
              bool7 = c;
              c = bool7;
              bool7 = c;
              if (bool7)
              {
                localObject1 = j;
                i8 = ((as)localObject1).c();
                localObject2 = n;
                i14 = b;
                i8 -= i14;
              }
              for (b = i8;; b = i8)
              {
                i8 = 1;
                break;
                localObject1 = j;
                i8 = ((as)localObject1).b();
                localObject2 = n;
                i14 = b;
                i8 += i14;
              }
            }
          }
          int i8 = m;
          i14 = -1 << -1;
          if (i8 == i14)
          {
            i8 = l;
            localObject1 = a(i8);
            if (localObject1 != null)
            {
              localObject2 = j;
              i14 = ((as)localObject2).e((View)localObject1);
              localObject3 = j;
              i24 = ((as)localObject3).e();
              if (i14 > i24) {
                locala.b();
              }
            }
          }
          for (;;)
          {
            i8 = 1;
            break;
            localObject2 = j;
            i14 = ((as)localObject2).a((View)localObject1);
            localObject3 = j;
            i24 = ((as)localObject3).b();
            i14 -= i24;
            if (i14 < 0)
            {
              i8 = j.b();
              b = i8;
              i8 = 0;
              localObject1 = null;
              c = false;
            }
            else
            {
              localObject2 = j;
              i14 = ((as)localObject2).c();
              localObject3 = j;
              i24 = ((as)localObject3).b((View)localObject1);
              i14 -= i24;
              if (i14 < 0)
              {
                localObject1 = j;
                i8 = ((as)localObject1).c();
                b = i8;
                i8 = 1;
                c = i8;
              }
              else
              {
                boolean bool13 = c;
                int i15;
                if (bool13)
                {
                  i8 = j.b((View)localObject1);
                  localObject2 = j;
                  i15 = ((as)localObject2).a();
                  i8 += i15;
                }
                for (;;)
                {
                  b = i8;
                  i8 = 1;
                  break;
                  localObject2 = j;
                  i8 = ((as)localObject2).a((View)localObject1);
                }
                i8 = l();
                if (i8 > 0)
                {
                  localObject1 = d(0);
                  i8 = a((View)localObject1);
                  i15 = l;
                  if (i15 >= i8) {
                    break label1742;
                  }
                  i8 = 1;
                  int i16 = k;
                  if (i8 != i16) {
                    break label1750;
                  }
                  i8 = 1;
                }
                for (;;)
                {
                  c = i8;
                  locala.b();
                  break;
                  i8 = 0;
                  localObject1 = null;
                  break label1711;
                  i8 = 0;
                  localObject1 = null;
                }
                boolean bool8 = k;
                c = bool8;
                bool8 = k;
                int i17;
                if (bool8)
                {
                  localObject1 = j;
                  i9 = ((as)localObject1).c();
                  i17 = m;
                  i9 -= i17;
                  b = i9;
                }
                else
                {
                  localObject1 = j;
                  i9 = ((as)localObject1).b();
                  i17 = m;
                  i9 += i17;
                  b = i9;
                }
              }
            }
          }
          localObject1 = q.getFocusedChild();
          boolean bool14;
          if (localObject1 != null)
          {
            localObject2 = p;
            bool14 = ((ac)localObject2).d((View)localObject1);
            if (!bool14) {}
          }
          else
          {
            i9 = 0;
            localObject1 = null;
            bool14 = false;
            localObject2 = null;
            break label260;
          }
          localObject2 = localObject1;
          break label260;
          int i9 = 0;
          localObject1 = null;
          break label337;
          i24 = a((View)localObject2);
          a = i24;
          boolean bool20 = c;
          if (bool20)
          {
            i9 = e.j.c() - i9;
            i25 = e.j.b((View)localObject2);
            i9 -= i25;
            localObject3 = e.j;
            i25 = ((as)localObject3).c() - i9;
            b = i25;
            if (i9 <= 0) {
              break label369;
            }
            localObject3 = e.j;
            i25 = ((as)localObject3).e((View)localObject2);
            i25 = b - i25;
            localObject4 = e.j;
            i30 = ((as)localObject4).b();
            i18 = e.j.a((View)localObject2) - i30;
            i32 = 0;
            localObject5 = null;
            i18 = Math.min(i18, 0) + i30;
            i18 = i25 - i18;
            if (i18 >= 0) {
              break label369;
            }
            i25 = b;
            i18 = -i18;
            i9 = Math.min(i9, i18) + i25;
            b = i9;
            break label369;
          }
          localObject3 = e.j;
          int i25 = ((as)localObject3).a((View)localObject2);
          localObject4 = e.j;
          int i30 = ((as)localObject4).b();
          i30 = i25 - i30;
          b = i25;
          if (i30 <= 0) {
            break label369;
          }
          i32 = e.j.e((View)localObject2);
          i25 += i32;
          i9 = e.j.c() - i9;
          int i18 = e.j.b((View)localObject2);
          i9 -= i18;
          localObject2 = e.j;
          i18 = ((as)localObject2).c();
          i32 = 0;
          localObject5 = null;
          i9 = Math.min(0, i9);
          i9 = i18 - i9 - i25;
          if (i9 >= 0) {
            break label369;
          }
          i18 = b;
          i9 = -i9;
          i9 = Math.min(i30, i9);
          i9 = i18 - i9;
          b = i9;
          break label369;
          boolean bool9 = b;
          boolean bool15 = d;
          if (bool9 == bool15)
          {
            bool9 = c;
            if (bool9)
            {
              bool9 = k;
              if (bool9) {
                break label2541;
              }
              localObject1 = d(paramm, paramr);
              if (localObject1 == null) {
                break label2604;
              }
              locala.a((View)localObject1);
              bool15 = g;
              if (!bool15)
              {
                bool15 = c();
                if (bool15)
                {
                  localObject2 = j;
                  i19 = ((as)localObject2).a((View)localObject1);
                  localObject3 = j;
                  i25 = ((as)localObject3).c();
                  if (i19 < i25)
                  {
                    i10 = j.b((View)localObject1);
                    localObject2 = j;
                    i19 = ((as)localObject2).b();
                    if (i10 >= i19) {
                      break label2582;
                    }
                  }
                  int i10 = 1;
                  if (i10 != 0)
                  {
                    boolean bool10 = c;
                    if (!bool10) {
                      break label2590;
                    }
                    localObject1 = j;
                  }
                }
              }
            }
            for (int i11 = ((as)localObject1).c();; i12 = ((as)localObject1).b())
            {
              b = i11;
              i11 = 1;
              break;
              boolean bool11 = k;
              if (bool11)
              {
                localObject1 = d(paramm, paramr);
                break label2380;
              }
              localObject2 = paramm;
              localObject1 = this;
              localObject3 = paramr;
              i30 = 0;
              localObject4 = null;
              i32 = l();
              i33 = paramr.a();
              localObject1 = a(paramm, paramr, 0, i32, i33);
              break label2380;
              bool11 = false;
              localObject1 = null;
              break label2479;
              localObject1 = j;
            }
          }
          i12 = 0;
          localObject1 = null;
          break label372;
          i12 = 0;
          localObject1 = null;
          break label401;
          localObject2 = null;
          i19 = i12;
          i12 = 0;
          localObject1 = null;
          break label453;
          i25 = j.a((View)localObject3);
          localObject4 = j;
          i30 = ((as)localObject4).b();
          i25 -= i30;
          i30 = m;
          i25 = i30 - i25;
          break label612;
          i12 -= i25;
          break label624;
          i25 = -1;
          break label656;
          boolean bool21 = k;
          if (bool21)
          {
            i26 = -1;
            break label656;
          }
          i26 = 1;
          break label656;
          localObject3 = o;
          a((LinearLayoutManager.a)localObject3);
          a.h = i12;
          localObject1 = a;
          a(paramm, (LinearLayoutManager.c)localObject1, paramr, false);
          localObject1 = a;
          i12 = b;
          localObject3 = a;
          i26 = d;
          localObject4 = a;
          i30 = c;
          if (i30 > 0)
          {
            localObject4 = a;
            i30 = c;
            i19 += i30;
          }
          localObject4 = o;
          b((LinearLayoutManager.a)localObject4);
          a.h = i19;
          localObject2 = a;
          i30 = d;
          localObject5 = a;
          i32 = e;
          i30 += i32;
          d = i30;
          localObject2 = a;
          a(paramm, (LinearLayoutManager.c)localObject2, paramr, false);
          localObject2 = a;
          i19 = b;
          localObject4 = a;
          i30 = c;
          if (i30 <= 0) {
            break label995;
          }
          localObject4 = a;
          i30 = c;
          i(i26, i12);
          a.h = i30;
          localObject1 = a;
          i26 = 0;
          localObject3 = null;
          a(paramm, (LinearLayoutManager.c)localObject1, paramr, false);
          localObject1 = a;
          i12 = b;
          break label995;
          i26 = b(i19, paramm, paramr, true);
          i19 += i26;
          i12 += i26;
          localObject3 = null;
          i26 = a(i12, paramm, paramr, false);
          i19 += i26;
          i12 += i26;
          i26 = i19;
          i19 = i12;
          continue;
          i33 = 0;
          i32 = 0;
          localObject5 = null;
          localList = d;
          int i34 = localList.size();
          int i35 = a(d(0));
          i12 = 0;
          localObject1 = null;
          i36 = 0;
          locala = null;
          if (i36 < i34)
          {
            localObject1 = (at.u)localList.get(i36);
            boolean bool25 = ((at.u)localObject1).m();
            if (bool25) {
              break label3439;
            }
            i31 = ((at.u)localObject1).c();
            if (i31 < i35)
            {
              i31 = 1;
              int i37 = k;
              if (i31 == i37) {
                break label3228;
              }
              i31 = -1;
              int i38 = -1;
              if (i31 != i38) {
                break label3234;
              }
              localObject4 = j;
              localObject1 = a;
              i31 = ((as)localObject4).e((View)localObject1) + i33;
              i12 = i32;
            }
          }
        }
        for (;;)
        {
          i32 = i36 + 1;
          i33 = i31;
          i36 = i32;
          i32 = i12;
          break label3099;
          i31 = 0;
          localObject4 = null;
          break label3146;
          i31 = 1;
          break label3162;
          localObject4 = j;
          localObject1 = a;
          i12 = ((as)localObject4).e((View)localObject1) + i32;
          i31 = i33;
          continue;
          localObject1 = a;
          k = localList;
          if (i33 > 0)
          {
            i12 = a(t());
            j(i12, i26);
            a.h = i33;
            a.c = 0;
            a.a(null);
            localObject1 = a;
            i26 = 0;
            localObject3 = null;
            a(paramm, (LinearLayoutManager.c)localObject1, paramr, false);
          }
          if (i32 > 0)
          {
            i12 = a(u());
            i(i12, i19);
            a.h = i32;
            a.c = 0;
            a.a(null);
            localObject1 = a;
            i19 = 0;
            localObject2 = null;
            a(paramm, (LinearLayoutManager.c)localObject1, paramr, false);
          }
          localObject1 = a;
          i19 = 0;
          localObject2 = null;
          k = null;
          break;
          localObject1 = o;
          ((LinearLayoutManager.a)localObject1).a();
          break label1163;
          i12 = i32;
          i31 = i33;
        }
        int i26 = i19;
        i19 = i12;
      }
    }
  }
  
  public boolean c()
  {
    LinearLayoutManager.d locald = n;
    boolean bool1;
    if (locald == null)
    {
      bool1 = b;
      boolean bool2 = d;
      if (bool1 == bool2) {
        bool1 = true;
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      locald = null;
    }
  }
  
  public final int d(at.r paramr)
  {
    return j(paramr);
  }
  
  public final Parcelable d()
  {
    LinearLayoutManager.d locald = n;
    Object localObject;
    if (locald != null)
    {
      locald = new android/support/v7/widget/LinearLayoutManager$d;
      localObject = n;
      locald.<init>((LinearLayoutManager.d)localObject);
    }
    for (;;)
    {
      return locald;
      locald = new android/support/v7/widget/LinearLayoutManager$d;
      locald.<init>();
      int i1 = l();
      int i2;
      if (i1 > 0)
      {
        h();
        boolean bool1 = b;
        boolean bool2 = k;
        bool1 ^= bool2;
        c = bool1;
        as localas1;
        int i3;
        if (bool1)
        {
          localObject = u();
          localas1 = j;
          i3 = localas1.c();
          as localas2 = j;
          int i4 = localas2.b((View)localObject);
          i3 -= i4;
          b = i3;
          i2 = a((View)localObject);
          a = i2;
        }
        else
        {
          localObject = t();
          i3 = a((View)localObject);
          a = i3;
          i2 = j.a((View)localObject);
          localas1 = j;
          i3 = localas1.b();
          i2 -= i3;
          b = i2;
        }
      }
      else
      {
        i2 = -1;
        a = i2;
      }
    }
  }
  
  public final int e(at.r paramr)
  {
    return j(paramr);
  }
  
  public final boolean e()
  {
    int i1 = i;
    if (i1 == 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  public final int f(at.r paramr)
  {
    return k(paramr);
  }
  
  public final boolean f()
  {
    int i1 = 1;
    int i2 = i;
    if (i2 == i1) {}
    for (;;)
    {
      return i1;
      i1 = 0;
    }
  }
  
  public final int g(at.r paramr)
  {
    return k(paramr);
  }
  
  protected final boolean g()
  {
    int i1 = 1;
    at localat = q;
    int i2 = w.g(localat);
    if (i2 == i1) {}
    for (;;)
    {
      return i1;
      i1 = 0;
    }
  }
  
  final void h()
  {
    Object localObject = a;
    if (localObject == null)
    {
      localObject = new android/support/v7/widget/LinearLayoutManager$c;
      ((LinearLayoutManager.c)localObject).<init>();
      a = ((LinearLayoutManager.c)localObject);
    }
    localObject = j;
    if (localObject == null)
    {
      int i1 = i;
      localObject = as.a(this, i1);
      j = ((as)localObject);
    }
  }
  
  final boolean i()
  {
    int i1 = 1073741824;
    int i2 = 1;
    int i3 = C;
    if (i3 != i1)
    {
      i3 = B;
      if (i3 != i1)
      {
        i1 = l();
        i3 = 0;
        if (i3 < i1)
        {
          ViewGroup.LayoutParams localLayoutParams = d(i3).getLayoutParams();
          int i4 = width;
          if (i4 < 0)
          {
            int i5 = height;
            if (i5 < 0)
            {
              i3 = i2;
              label74:
              if (i3 == 0) {
                break label92;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return i2;
      i3 += 1;
      break;
      i3 = 0;
      break label74;
      label92:
      i2 = 0;
    }
  }
}


/* Location:              android/support/v7/widget/LinearLayoutManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */