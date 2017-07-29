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
  final SparseIntArray e;
  final SparseIntArray f;
  GridLayoutManager.c g;
  final Rect h;
  
  public GridLayoutManager(Context paramContext, int paramInt)
  {
    super(paramContext);
    Object localObject = new android/util/SparseIntArray;
    ((SparseIntArray)localObject).<init>();
    e = ((SparseIntArray)localObject);
    localObject = new android/util/SparseIntArray;
    ((SparseIntArray)localObject).<init>();
    f = ((SparseIntArray)localObject);
    localObject = new android/support/v7/widget/GridLayoutManager$a;
    ((GridLayoutManager.a)localObject).<init>();
    g = ((GridLayoutManager.c)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    h = ((Rect)localObject);
    i(paramInt);
  }
  
  public GridLayoutManager(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramContext, paramInt2, paramBoolean);
    Object localObject = new android/util/SparseIntArray;
    ((SparseIntArray)localObject).<init>();
    e = ((SparseIntArray)localObject);
    localObject = new android/util/SparseIntArray;
    ((SparseIntArray)localObject).<init>();
    f = ((SparseIntArray)localObject);
    localObject = new android/support/v7/widget/GridLayoutManager$a;
    ((GridLayoutManager.a)localObject).<init>();
    g = ((GridLayoutManager.c)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    h = ((Rect)localObject);
    i(paramInt1);
  }
  
  public GridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    Object localObject = new android/util/SparseIntArray;
    ((SparseIntArray)localObject).<init>();
    e = ((SparseIntArray)localObject);
    localObject = new android/util/SparseIntArray;
    ((SparseIntArray)localObject).<init>();
    f = ((SparseIntArray)localObject);
    localObject = new android/support/v7/widget/GridLayoutManager$a;
    ((GridLayoutManager.a)localObject).<init>();
    g = ((GridLayoutManager.c)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    h = ((Rect)localObject);
    int i = ab;
    i(i);
  }
  
  private int a(at.m paramm, at.r paramr, int paramInt)
  {
    boolean bool = g;
    int i;
    if (!bool)
    {
      i = b;
      i = GridLayoutManager.c.c(paramInt, i);
    }
    for (;;)
    {
      return i;
      i = paramm.a(paramInt);
      int j = -1;
      if (i == j)
      {
        Object localObject = new java/lang/StringBuilder;
        String str = "Cannot find span size for pre layout position. ";
        ((StringBuilder)localObject).<init>(str);
        localObject = paramInt;
        Log.w("GridLayoutManager", (String)localObject);
        i = 0;
      }
      else
      {
        j = b;
        i = GridLayoutManager.c.c(i, j);
      }
    }
  }
  
  private void a(at.m paramm, at.r paramr, int paramInt, boolean paramBoolean)
  {
    int i = 0;
    int j = -1;
    int k;
    GridLayoutManager.b localb;
    if (paramBoolean)
    {
      k = 1;
      j = 0;
      localb = null;
    }
    for (;;)
    {
      int m = 0;
      for (i = j; i != paramInt; i = j)
      {
        View localView = d[i];
        localb = (GridLayoutManager.b)localView.getLayoutParams();
        int n = a(localView);
        n = c(paramm, paramr, n);
        b = n;
        a = m;
        j = b;
        m += j;
        j = i + k;
      }
      k = paramInt + -1;
      paramInt = j;
      j = k;
      k = paramInt;
    }
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    at.h localh = (at.h)paramView.getLayoutParams();
    boolean bool3;
    if (paramBoolean)
    {
      boolean bool1 = x;
      if (bool1)
      {
        int i = paramView.getMeasuredWidth();
        int k = width;
        boolean bool2 = at.g.b(i, paramInt1, k);
        if (bool2)
        {
          int j = paramView.getMeasuredHeight();
          int m = height;
          bool3 = at.g.b(j, paramInt2, m);
          if (bool3) {
            break label96;
          }
        }
      }
      bool3 = true;
    }
    for (;;)
    {
      if (bool3) {
        paramView.measure(paramInt1, paramInt2);
      }
      return;
      label96:
      bool3 = false;
      localh = null;
      continue;
      bool3 = a(paramView, paramInt1, paramInt2, localh);
    }
  }
  
  private int b(at.m paramm, at.r paramr, int paramInt)
  {
    int i = -1;
    boolean bool = g;
    Object localObject1;
    int j;
    if (!bool)
    {
      localObject1 = g;
      i = b;
      j = ((GridLayoutManager.c)localObject1).b(paramInt, i);
    }
    for (;;)
    {
      return j;
      localObject1 = f;
      j = ((SparseIntArray)localObject1).get(paramInt, i);
      if (j == i)
      {
        j = paramm.a(paramInt);
        Object localObject2;
        if (j == i)
        {
          localObject2 = new java/lang/StringBuilder;
          String str = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:";
          ((StringBuilder)localObject2).<init>(str);
          localObject2 = paramInt;
          Log.w("GridLayoutManager", (String)localObject2);
          j = 0;
          localObject1 = null;
        }
        else
        {
          localObject2 = g;
          int k = b;
          j = ((GridLayoutManager.c)localObject2).b(j, k);
        }
      }
    }
  }
  
  private void b(View paramView, int paramInt, boolean paramBoolean)
  {
    int i = 1;
    GridLayoutManager.b localb = (GridLayoutManager.b)paramView.getLayoutParams();
    Rect localRect = d;
    int j = top;
    int k = bottom;
    j += k;
    k = topMargin;
    j += k;
    k = bottomMargin;
    j += k;
    k = left;
    int m = right + k;
    k = leftMargin;
    m += k;
    k = rightMargin + m;
    m = a;
    int n = b;
    m = i(m, n);
    n = this.i;
    int i1;
    if (n == i)
    {
      i1 = width;
      m = a(m, paramInt, k, i1, false);
      as localas1 = this.j;
      k = localas1.e();
      i1 = C;
      i2 = height;
    }
    int i3;
    for (int i2 = a(k, i1, j, i2, i);; i2 = i3)
    {
      a(paramView, m, i2, paramBoolean);
      return;
      i1 = height;
      m = a(m, paramInt, j, i1, false);
      as localas2 = this.j;
      j = localas2.e();
      i1 = B;
      i2 = width;
      i2 = a(j, i1, k, i2, i);
      i3 = m;
      m = i2;
    }
  }
  
  private int c(at.m paramm, at.r paramr, int paramInt)
  {
    int i = 1;
    int j = -1;
    boolean bool = g;
    if (!bool) {}
    for (;;)
    {
      return i;
      Object localObject1 = e;
      int k = ((SparseIntArray)localObject1).get(paramInt, j);
      if (k != j)
      {
        i = k;
      }
      else
      {
        k = paramm.a(paramInt);
        if (k == j)
        {
          localObject1 = "GridLayoutManager";
          Object localObject2 = new java/lang/StringBuilder;
          String str = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:";
          ((StringBuilder)localObject2).<init>(str);
          localObject2 = paramInt;
          Log.w((String)localObject1, (String)localObject2);
        }
      }
    }
  }
  
  private void h(int paramInt)
  {
    int i = 0;
    int[] arrayOfInt = c;
    int j = b;
    if (arrayOfInt != null)
    {
      k = arrayOfInt.length;
      m = j + 1;
      if (k == m)
      {
        k = arrayOfInt.length + -1;
        k = arrayOfInt[k];
        if (k == paramInt) {
          break label63;
        }
      }
    }
    int n = j + 1;
    arrayOfInt = new int[n];
    label63:
    arrayOfInt[0] = 0;
    int m = paramInt / j;
    int i1 = paramInt % j;
    int k = 1;
    int i2 = k;
    int i3 = 0;
    if (i2 <= j)
    {
      i += i1;
      if (i <= 0) {
        break label161;
      }
      k = j - i;
      if (k >= i1) {
        break label161;
      }
      k = m + 1;
      i -= j;
    }
    for (;;)
    {
      i3 += k;
      arrayOfInt[i2] = i3;
      k = i2 + 1;
      i2 = k;
      break;
      c = arrayOfInt;
      return;
      label161:
      k = m;
    }
  }
  
  private int i(int paramInt1, int paramInt2)
  {
    int i = this.i;
    int k = 1;
    int[] arrayOfInt1;
    int j;
    int[] arrayOfInt2;
    if (i == k)
    {
      boolean bool = g();
      if (bool)
      {
        arrayOfInt1 = c;
        k = b - paramInt1;
        j = arrayOfInt1[k];
        arrayOfInt2 = c;
        int m = b - paramInt1 - paramInt2;
        k = arrayOfInt2[m];
        j -= k;
      }
    }
    for (;;)
    {
      return j;
      arrayOfInt1 = c;
      k = paramInt1 + paramInt2;
      j = arrayOfInt1[k];
      arrayOfInt2 = c;
      k = arrayOfInt2[paramInt1];
      j -= k;
    }
  }
  
  private void i(int paramInt)
  {
    int i = b;
    if (paramInt == i) {}
    for (;;)
    {
      return;
      i = 1;
      a = i;
      if (paramInt <= 0)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("Span count should be at least 1. Provided ");
        localObject2 = paramInt;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      b = paramInt;
      Object localObject1 = g.a;
      ((SparseIntArray)localObject1).clear();
      j();
    }
  }
  
  private void r()
  {
    int i = this.i;
    int j = 1;
    if (i == j)
    {
      i = D;
      j = o();
      i -= j;
      j = m();
      i -= j;
    }
    for (;;)
    {
      h(i);
      return;
      i = E;
      j = p();
      i -= j;
      j = n();
      i -= j;
    }
  }
  
  private void s()
  {
    View[] arrayOfView = d;
    int i;
    if (arrayOfView != null)
    {
      arrayOfView = d;
      i = arrayOfView.length;
      int j = b;
      if (i == j) {}
    }
    else
    {
      i = b;
      arrayOfView = new View[i];
      d = arrayOfView;
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
    int i = this.i;
    if (i == 0) {
      i = b;
    }
    for (;;)
    {
      return i;
      i = paramr.a();
      if (i <= 0)
      {
        i = 0;
      }
      else
      {
        i = paramr.a() + -1;
        i = a(paramm, paramr, i) + 1;
      }
    }
  }
  
  public final at.h a(Context paramContext, AttributeSet paramAttributeSet)
  {
    GridLayoutManager.b localb = new android/support/v7/widget/GridLayoutManager$b;
    localb.<init>(paramContext, paramAttributeSet);
    return localb;
  }
  
  public final at.h a(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
    GridLayoutManager.b localb;
    if (bool)
    {
      localb = new android/support/v7/widget/GridLayoutManager$b;
      paramLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
      localb.<init>(paramLayoutParams);
    }
    for (;;)
    {
      return localb;
      localb = new android/support/v7/widget/GridLayoutManager$b;
      localb.<init>(paramLayoutParams);
    }
  }
  
  final View a(at.m paramm, at.r paramr, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = null;
    h();
    int i = this.j.b();
    Object localObject2 = this.j;
    int j = ((as)localObject2).c();
    int n;
    Object localObject3;
    label45:
    Object localObject4;
    if (paramInt2 > paramInt1)
    {
      int k = 1;
      n = k;
      localObject3 = null;
      if (paramInt1 == paramInt2) {
        break label212;
      }
      localObject4 = d(paramInt1);
      k = a((View)localObject4);
      if ((k < 0) || (k >= paramInt3)) {
        break label231;
      }
      k = b(paramm, paramr, k);
      if (k != 0) {
        break label231;
      }
      localObject2 = getLayoutParamsc;
      boolean bool = ((at.u)localObject2).m();
      if (!bool) {
        break label152;
      }
      if (localObject3 != null) {
        break label231;
      }
      localObject2 = localObject1;
    }
    for (;;)
    {
      paramInt1 += n;
      localObject1 = localObject2;
      localObject3 = localObject4;
      break label45;
      int m = -1;
      n = m;
      break;
      label152:
      localObject2 = this.j;
      m = ((as)localObject2).a((View)localObject4);
      if (m < j)
      {
        localObject2 = this.j;
        m = ((as)localObject2).b((View)localObject4);
        if (m >= i) {}
      }
      else
      {
        if (localObject1 != null) {
          break label231;
        }
        localObject2 = localObject4;
        localObject4 = localObject3;
        continue;
        label212:
        if (localObject1 == null) {
          break label224;
        }
      }
      label224:
      for (localObject4 = localObject1;; localObject4 = localObject3) {
        return (View)localObject4;
      }
      label231:
      localObject2 = localObject1;
      localObject4 = localObject3;
    }
  }
  
  public final View a(View paramView, int paramInt, at.m paramm, at.r paramr)
  {
    View localView = b(paramView);
    int i;
    Object localObject1;
    if (localView == null)
    {
      i = 0;
      localObject1 = null;
    }
    Object localObject2;
    int j;
    int k;
    int i3;
    Object localObject3;
    label115:
    int i2;
    label138:
    int i4;
    int i5;
    label170:
    int i7;
    boolean bool1;
    Object localObject4;
    int i8;
    int i9;
    Object localObject5;
    int i10;
    Object localObject6;
    int i11;
    int i13;
    label245:
    label341:
    label353:
    label378:
    label384:
    int i15;
    int i19;
    do
    {
      for (;;)
      {
        return (View)localObject1;
        localObject2 = (GridLayoutManager.b)localView.getLayoutParams();
        j = a;
        k = j;
        m = a;
        i1 = b;
        i3 = m + i1;
        localObject2 = super.a(paramView, paramInt, paramm, paramr);
        if (localObject2 != null) {
          break;
        }
        i = 0;
        localObject1 = null;
      }
      localObject3 = this;
      int i1 = c(paramInt);
      int m = 1;
      float f1;
      int n;
      if (i1 == m)
      {
        i1 = 1;
        f1 = Float.MIN_VALUE;
        localObject3 = this;
        n = this.k;
        if (i1 == n) {
          break label341;
        }
        i2 = 1;
        f1 = Float.MIN_VALUE;
        if (i2 == 0) {
          break label353;
        }
        i4 = l() + -1;
        f1 = 0.0F / 0.0F;
        i5 = -1;
        i2 = i4;
        i4 = -1;
        n = i5;
        localObject3 = this;
        int i6 = this.i;
        i7 = 1;
        if (i6 != i7) {
          break label378;
        }
        bool1 = g();
        if (!bool1) {
          break label378;
        }
      }
      for (bool1 = true;; bool1 = false)
      {
        localObject4 = null;
        i8 = -1;
        i9 = 0;
        localObject5 = null;
        i10 = 0;
        localObject6 = null;
        i11 = -1;
        i7 = 0;
        localObject3 = this;
        int i12 = a(paramm, paramr, i2);
        i13 = i2;
        j = i13;
        if (i13 != n)
        {
          localObject3 = this;
          i2 = a(paramm, paramr, i13);
          localObject1 = d(i13);
          localObject3 = localView;
          if (localObject1 != localView)
          {
            boolean bool2 = ((View)localObject1).hasFocusable();
            if (!bool2) {
              break label384;
            }
            j = i12;
            if (i2 == i12) {
              break label384;
            }
            if (localObject4 == null) {
              break label931;
            }
          }
        }
        if (localObject4 == null) {
          break label924;
        }
        localObject1 = localObject4;
        break;
        i2 = 0;
        f1 = 0.0F;
        localObject2 = null;
        break label115;
        i2 = 0;
        f1 = 0.0F;
        localObject2 = null;
        break label138;
        i5 = l();
        i2 = 0;
        localObject2 = null;
        f1 = 0.0F;
        i4 = 1;
        n = i5;
        break label170;
      }
      localObject2 = (GridLayoutManager.b)((View)localObject1).getLayoutParams();
      i15 = a;
      int i14 = a;
      j = b;
      int i16 = j;
      i19 = i14 + j;
      bool3 = ((View)localObject1).hasFocusable();
      if (!bool3) {
        break;
      }
      j = i15;
      if (i15 != k) {
        break;
      }
      j = i19;
    } while (i19 == i3);
    boolean bool3 = false;
    boolean bool4 = ((View)localObject1).hasFocusable();
    label500:
    Object localObject7;
    if ((!bool4) || (localObject4 != null))
    {
      bool4 = ((View)localObject1).hasFocusable();
      if ((bool4) || (localObject6 != null)) {}
    }
    else
    {
      bool3 = true;
      if (!bool3) {
        break label931;
      }
      bool3 = ((View)localObject1).hasFocusable();
      if (!bool3) {
        break label865;
      }
      i9 = a;
      j = i19;
      i2 = Math.min(i19, i3);
      j = i15;
      i8 = Math.max(i15, k);
      i2 -= i8;
      i5 = i7;
      i7 = i11;
      localObject7 = localObject6;
      i10 = i2;
      i2 = i5;
      localObject5 = localObject1;
      i = i9;
    }
    for (;;)
    {
      i8 = i13 + i4;
      localObject4 = localObject5;
      i13 = i8;
      i9 = i10;
      i8 = i;
      localObject6 = localObject7;
      i11 = i7;
      i7 = i2;
      break label245;
      j = i15;
      int i17 = Math.max(i15, k);
      j = i19;
      int i20 = Math.min(i19, i3) - i17;
      int i18 = ((View)localObject1).hasFocusable();
      if (i18 != 0)
      {
        j = i20;
        if (i20 > i9)
        {
          bool3 = true;
          break label500;
        }
        if (i20 != i9) {
          break label500;
        }
        j = i15;
        if (i15 > i8) {}
        for (i18 = 1;; i18 = 0)
        {
          j = i18;
          if (bool1 != i18) {
            break;
          }
          bool3 = true;
          break;
        }
      }
      if (localObject4 != null) {
        break label500;
      }
      localObject3 = this;
      localObject3 = r;
      i18 = ((bi)localObject3).a((View)localObject1);
      if (i18 != 0)
      {
        localObject3 = this;
        localObject3 = s;
        i18 = ((bi)localObject3).a((View)localObject1);
        if (i18 != 0)
        {
          i18 = 1;
          label779:
          if (i18 != 0) {
            break label815;
          }
        }
      }
      label815:
      for (i18 = 1;; i18 = 0)
      {
        if (i18 == 0) {
          break label819;
        }
        j = i20;
        if (i20 <= i7) {
          break label821;
        }
        bool3 = true;
        break;
        i18 = 0;
        break label779;
      }
      label819:
      break label500;
      label821:
      if (i20 != i7) {
        break label500;
      }
      j = i15;
      if (i15 > i11) {}
      for (i18 = 1;; i18 = 0)
      {
        j = i18;
        if (bool1 != i18) {
          break;
        }
        bool3 = true;
        break;
      }
      label865:
      i7 = a;
      j = i19;
      i2 = Math.min(i19, i3);
      j = i15;
      i11 = Math.max(i15, k);
      i2 -= i11;
      localObject7 = localObject1;
      i10 = i9;
      i = i8;
      localObject5 = localObject4;
      continue;
      label924:
      localObject1 = localObject6;
      break;
      label931:
      i2 = i7;
      i = i8;
      i7 = i11;
      localObject7 = localObject6;
      i10 = i9;
      localObject5 = localObject4;
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
    int[] arrayOfInt1 = c;
    if (arrayOfInt1 == null) {
      super.a(paramRect, paramInt1, paramInt2);
    }
    int i = m();
    int j = o() + i;
    i = n();
    int k = p();
    i += k;
    k = this.i;
    int m = 1;
    Object localObject;
    int[] arrayOfInt2;
    if (k == m)
    {
      k = paramRect.height();
      i += k;
      k = w.r(q);
      i = a(paramInt2, i, k);
      localObject = c;
      arrayOfInt2 = c;
      m = arrayOfInt2.length + -1;
      k = localObject[m];
      j += k;
      localObject = q;
      k = w.q((View)localObject);
      j = a(paramInt1, j, k);
    }
    for (;;)
    {
      h(j, i);
      return;
      k = paramRect.width();
      j += k;
      k = w.q(q);
      j = a(paramInt1, j, k);
      localObject = c;
      arrayOfInt2 = c;
      m = arrayOfInt2.length + -1;
      k = localObject[m];
      i += k;
      localObject = q;
      k = w.r((View)localObject);
      i = a(paramInt2, i, k);
    }
  }
  
  final void a(at.m paramm, at.r paramr, LinearLayoutManager.a parama, int paramInt)
  {
    int i = 1;
    super.a(paramm, paramr, parama, paramInt);
    r();
    int j = paramr.a();
    if (j > 0)
    {
      boolean bool = g;
      if (!bool)
      {
        if (paramInt == i) {}
        int k;
        for (;;)
        {
          k = a;
          k = b(paramm, paramr, k);
          if (i == 0) {
            break;
          }
          while (k > 0)
          {
            i = a;
            if (i <= 0) {
              break;
            }
            i = a + -1;
            a = i;
            i = a;
            k = b(paramm, paramr, i);
          }
          i = 0;
        }
        int m = paramr.a() + -1;
        i = a;
        while (i < m)
        {
          int n = i + 1;
          n = b(paramm, paramr, n);
          if (n <= k) {
            break;
          }
          i += 1;
          k = n;
        }
        a = i;
      }
    }
    s();
  }
  
  final void a(at.m paramm, at.r paramr, LinearLayoutManager.c paramc, LinearLayoutManager.b paramb)
  {
    Object localObject1 = this.j;
    int i = ((as)localObject1).h();
    int k = 1073741824;
    float f1 = 2.0F;
    int n;
    int i2;
    int i4;
    label75:
    label111:
    int i5;
    int i6;
    if (i != k)
    {
      k = 1;
      f1 = Float.MIN_VALUE;
      n = k;
      k = l();
      if (k <= 0) {
        break label319;
      }
      localObject1 = c;
      i2 = b;
      k = localObject1[i2];
      i4 = k;
      if (n != 0) {
        r();
      }
      k = e;
      i2 = 1;
      if (k != i2) {
        break label337;
      }
      k = 1;
      f1 = Float.MIN_VALUE;
      i2 = k;
      i5 = 0;
      k = b;
      if (i2 == 0)
      {
        k = d;
        k = b(paramm, paramr, k);
        i6 = d;
        i6 = c(paramm, paramr, i6);
        k += i6;
      }
    }
    Object localObject2;
    label319:
    View localView1;
    label337:
    Object localObject3;
    for (;;)
    {
      i6 = b;
      if (i5 >= i6) {
        break label401;
      }
      boolean bool5 = paramc.a(paramr);
      if ((!bool5) || (k <= 0)) {
        break label401;
      }
      i7 = d;
      i8 = c(paramm, paramr, i7);
      int i10 = b;
      if (i8 > i10)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("Item at position ");
        localObject2 = ((StringBuilder)localObject2).append(i7).append(" requires ").append(i8).append(" spans but GridLayoutManager has only ");
        i2 = b;
        localObject2 = i2 + " spans.";
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
        k = 0;
        f1 = 0.0F;
        localObject1 = null;
        n = 0;
        localObject2 = null;
        break;
        k = 0;
        f1 = 0.0F;
        localObject1 = null;
        i4 = 0;
        localView1 = null;
        break label75;
        k = 0;
        f1 = 0.0F;
        localObject1 = null;
        i2 = 0;
        localObject3 = null;
        break label111;
      }
      k -= i8;
      if (k < 0) {
        break label401;
      }
      localObject4 = paramc.a(paramm);
      if (localObject4 == null) {
        break label401;
      }
      localObject5 = d;
      localObject5[i5] = localObject4;
      i5 += 1;
    }
    label401:
    if (i5 == 0)
    {
      k = 1;
      f1 = Float.MIN_VALUE;
      b = k;
      return;
    }
    int i8 = 0;
    Object localObject5 = null;
    int i7 = 0;
    float f2 = 0.0F;
    Object localObject4 = null;
    a(paramm, paramr, i5, i2);
    k = 0;
    f1 = 0.0F;
    localObject1 = null;
    int i11 = 0;
    label458:
    View localView2;
    int i13;
    float f3;
    label513:
    float f4;
    int i14;
    if (i11 < i5)
    {
      localView2 = d[i11];
      localObject1 = k;
      if (localObject1 == null) {
        if (i2 != 0)
        {
          k = -1;
          f1 = 0.0F / 0.0F;
          i13 = 0;
          f3 = 0.0F;
          super.a(localView2, k, false);
          localObject1 = h;
          b(localView2, (Rect)localObject1);
          f1 = 0.0F;
          b(localView2, i, false);
          localObject1 = this.j;
          k = ((as)localObject1).e(localView2);
          if (k > i8) {
            i8 = k;
          }
          localObject1 = (GridLayoutManager.b)localView2.getLayoutParams();
          i13 = 1065353216;
          f3 = 1.0F;
          as localas = this.j;
          f4 = localas.f(localView2) * f3;
          k = b;
          f1 = k;
          f1 = f4 / f1;
          i14 = f1 < f2;
          if (i14 <= 0) {
            break label1822;
          }
        }
      }
    }
    for (;;)
    {
      i7 = i11 + 1;
      i11 = i7;
      f2 = f1;
      break label458;
      k = 0;
      f1 = 0.0F;
      localObject1 = null;
      i13 = 0;
      f3 = 0.0F;
      super.a(localView2, 0, false);
      break label513;
      if (i2 != 0)
      {
        k = -1;
        f1 = 0.0F / 0.0F;
        i13 = 1;
        f3 = Float.MIN_VALUE;
        super.a(localView2, k, i13);
        break label513;
      }
      k = 0;
      f1 = 0.0F;
      localObject1 = null;
      boolean bool6 = true;
      f3 = Float.MIN_VALUE;
      super.a(localView2, 0, bool6);
      break label513;
      int i3;
      if (n != 0)
      {
        k = Math.max(Math.round(b * f2), i4);
        h(k);
        n = 0;
        localObject2 = null;
        k = 0;
        f1 = 0.0F;
        localObject1 = null;
        i3 = 0;
        localObject3 = null;
        label789:
        if (i3 >= i5) {
          break label867;
        }
        localObject1 = d[i3];
        i7 = 1073741824;
        f2 = 2.0F;
        i8 = 1;
        b((View)localObject1, i7, i8);
        localObject4 = this.j;
        k = ((as)localObject4).e((View)localObject1);
        if (k <= n) {
          break label1815;
        }
      }
      for (;;)
      {
        i3 += 1;
        n = k;
        break label789;
        n = i8;
        label867:
        k = 0;
        f1 = 0.0F;
        localObject1 = null;
        i7 = 0;
        localObject4 = null;
        f2 = 0.0F;
        int i15;
        label1162:
        int i17;
        if (i7 < i5)
        {
          localObject5 = d[i7];
          localObject1 = this.j;
          k = ((as)localObject1).e((View)localObject5);
          if (k != n)
          {
            localObject1 = (GridLayoutManager.b)((View)localObject5).getLayoutParams();
            localObject3 = d;
            i11 = top;
            i4 = bottom;
            i11 += i4;
            i4 = topMargin;
            i11 += i4;
            i4 = bottomMargin;
            i11 += i4;
            i4 = left;
            i3 = right + i4;
            i4 = leftMargin;
            i3 += i4;
            i4 = rightMargin;
            i3 += i4;
            i4 = a;
            i = b;
            i4 = i(i4, i);
            i = this.i;
            i14 = 1;
            f4 = Float.MIN_VALUE;
            if (i != i14) {
              break label1162;
            }
            i = 1073741824;
            k = width;
            i15 = 0;
            f4 = 0.0F;
            localView2 = null;
            k = a(i4, i, i3, k, false);
            i3 = n - i11;
            i11 = 1073741824;
            i3 = View.MeasureSpec.makeMeasureSpec(i3, i11);
          }
          for (;;)
          {
            i11 = 1;
            a((View)localObject5, k, i3, i11);
            k = i7 + 1;
            i7 = k;
            break;
            i3 = View.MeasureSpec.makeMeasureSpec(n - i3, 1073741824);
            i = 1073741824;
            k = height;
            i15 = 0;
            f4 = 0.0F;
            localView2 = null;
            k = a(i4, i, i11, k, false);
            i17 = i3;
            i3 = k;
            k = i17;
          }
        }
        a = n;
        k = 0;
        f1 = 0.0F;
        localObject1 = null;
        int i9 = 0;
        localObject5 = null;
        i7 = 0;
        f2 = 0.0F;
        localObject4 = null;
        i3 = 0;
        localObject3 = null;
        int i12 = this.i;
        i4 = 1;
        if (i12 == i4)
        {
          i3 = f;
          i7 = -1;
          f2 = 0.0F / 0.0F;
          if (i3 == i7)
          {
            i3 = b;
            n = i3 - n;
            i7 = 0;
            localObject4 = null;
            f2 = 0.0F;
            i17 = n;
            n = i3;
            i3 = i17;
            localObject5 = null;
            i12 = 0;
            i9 = i7;
            i7 = i3;
            i3 = n;
            n = k;
            label1355:
            if (i12 >= i5) {
              break label1794;
            }
            localView1 = d[i12];
            localObject1 = (GridLayoutManager.b)localView1.getLayoutParams();
            i = this.i;
            i15 = 1;
            f4 = Float.MIN_VALUE;
            if (i != i15) {
              break label1744;
            }
            boolean bool3 = g();
            if (!bool3) {
              break label1690;
            }
            i1 = m();
            localObject5 = c;
            i = b;
            int i16 = a;
            i -= i16;
            i9 = localObject5[i] + i1;
            localObject2 = this.j;
            i1 = ((as)localObject2).f(localView1);
            i1 = i9 - i1;
          }
        }
        for (;;)
        {
          a(localView1, i1, i7, i9, i3);
          at.u localu = c;
          boolean bool1 = localu.m();
          if (!bool1)
          {
            localObject1 = c;
            bool2 = ((at.u)localObject1).s();
            if (!bool2) {}
          }
          else
          {
            bool2 = true;
            f1 = Float.MIN_VALUE;
            c = bool2;
          }
          boolean bool2 = d;
          boolean bool4 = localView1.hasFocusable();
          bool2 |= bool4;
          d = bool2;
          m = i12 + 1;
          i12 = m;
          break label1355;
          i3 = b;
          i1 += i3;
          i7 = 0;
          localObject4 = null;
          f2 = 0.0F;
          break;
          m = f;
          i9 = -1;
          if (m == i9)
          {
            i9 = b;
            m = i9 - i1;
            i1 = 0;
            localObject2 = null;
            i3 = 0;
            localObject3 = null;
            i7 = i9;
            break;
          }
          m = b;
          i1 += m;
          i17 = 0;
          i3 = 0;
          localObject3 = null;
          i7 = i1;
          i1 = 0;
          localObject2 = null;
          break;
          label1690:
          i1 = m();
          localObject5 = c;
          int j = a;
          i9 = localObject5[j];
          i1 += i9;
          localObject5 = this.j;
          i9 = ((as)localObject5).f(localView1) + i1;
          continue;
          label1744:
          i3 = n();
          localObject4 = c;
          j = a;
          i7 = localObject4[j] + i3;
          localObject3 = this.j;
          i3 = ((as)localObject3).f(localView1) + i7;
        }
        label1794:
        localObject1 = d;
        int i1 = 0;
        localObject2 = null;
        Arrays.fill((Object[])localObject1, null);
        break;
        label1815:
        int m = i1;
      }
      label1822:
      f1 = f2;
    }
  }
  
  public final void a(at.m paramm, at.r paramr, View paramView, b paramb)
  {
    boolean bool1 = false;
    int i = 1;
    Object localObject = paramView.getLayoutParams();
    boolean bool2 = localObject instanceof GridLayoutManager.b;
    if (!bool2) {
      super.a(paramView, paramb);
    }
    for (;;)
    {
      return;
      localObject = (GridLayoutManager.b)localObject;
      at.u localu = c;
      int j = localu.c();
      j = a(paramm, paramr, j);
      int k = this.i;
      int i2;
      if (k == 0)
      {
        k = a;
        m = b;
        n = b;
        int i1;
        if (n > i)
        {
          i1 = b;
          n = b;
          if (i1 == n) {
            i1 = i;
          }
        }
        for (;;)
        {
          localObject = b.n.a(k, m, j, i, i1);
          paramb.a(localObject);
          break;
          i2 = 0;
          localObject = null;
        }
      }
      k = a;
      int m = b;
      int n = b;
      if (n > i)
      {
        i2 = b;
        n = b;
        if (i2 == n) {
          bool1 = i;
        }
      }
      localObject = b.n.a(j, i, k, m, bool1);
      paramb.a(localObject);
    }
  }
  
  public final void a(at.r paramr)
  {
    super.a(paramr);
    a = false;
  }
  
  final void a(at.r paramr, LinearLayoutManager.c paramc, at.g.a parama)
  {
    int i = b;
    int j = 0;
    for (;;)
    {
      int k = b;
      if (j >= k) {
        break;
      }
      boolean bool = paramc.a(paramr);
      if ((!bool) || (i <= 0)) {
        break;
      }
      int m = d;
      int n = g;
      n = Math.max(0, n);
      parama.a(m, n);
      i += -1;
      m = d;
      n = e;
      m += n;
      d = m;
      j += 1;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
      localUnsupportedOperationException.<init>("GridLayoutManager does not support stack from end. Consider using reverse layout");
      throw localUnsupportedOperationException;
    }
    super.a(false);
  }
  
  public final boolean a(at.h paramh)
  {
    return paramh instanceof GridLayoutManager.b;
  }
  
  public final int b(int paramInt, at.m paramm, at.r paramr)
  {
    r();
    s();
    return super.b(paramInt, paramm, paramr);
  }
  
  public final int b(at.m paramm, at.r paramr)
  {
    int i = this.i;
    int j = 1;
    if (i == j) {
      i = b;
    }
    for (;;)
    {
      return i;
      i = paramr.a();
      if (i <= 0)
      {
        i = 0;
      }
      else
      {
        i = paramr.a() + -1;
        i = a(paramm, paramr, i) + 1;
      }
    }
  }
  
  public final at.h b()
  {
    int i = -1;
    int j = -2;
    int k = this.i;
    GridLayoutManager.b localb;
    if (k == 0)
    {
      localb = new android/support/v7/widget/GridLayoutManager$b;
      localb.<init>(j, i);
    }
    for (;;)
    {
      return localb;
      localb = new android/support/v7/widget/GridLayoutManager$b;
      localb.<init>(i, j);
    }
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
    boolean bool = g;
    if (bool)
    {
      int j = l();
      bool = false;
      GridLayoutManager.b localb = null;
      int i;
      for (int k = 0; k < j; k = i)
      {
        localb = (GridLayoutManager.b)d(k).getLayoutParams();
        at.u localu = c;
        int m = localu.c();
        SparseIntArray localSparseIntArray = e;
        int n = b;
        localSparseIntArray.put(m, n);
        localSparseIntArray = f;
        i = a;
        localSparseIntArray.put(m, i);
        i = k + 1;
      }
    }
    super.c(paramm, paramr);
    e.clear();
    f.clear();
  }
  
  public final boolean c()
  {
    LinearLayoutManager.d locald = n;
    boolean bool;
    if (locald == null)
    {
      bool = a;
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      locald = null;
    }
  }
  
  public final void d(int paramInt1, int paramInt2)
  {
    g.a.clear();
  }
}


/* Location:              android/support/v7/widget/GridLayoutManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */