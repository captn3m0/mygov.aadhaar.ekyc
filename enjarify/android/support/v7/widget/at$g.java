package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v4.h.a.a;
import android.support.v4.h.a.b;
import android.support.v4.h.a.b.n;
import android.support.v4.h.a.f;
import android.support.v4.h.a.f.c;
import android.support.v4.h.w;
import android.support.v7.d.a.a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public abstract class at$g
{
  boolean A;
  int B;
  int C;
  int D;
  int E;
  private final bi.b a;
  private final bi.b b;
  ac p;
  at q;
  bi r;
  bi s;
  at.q t;
  boolean u;
  boolean v;
  boolean w;
  boolean x;
  boolean y;
  int z;
  
  public at$g()
  {
    Object localObject = new android/support/v7/widget/at$g$1;
    ((at.g.1)localObject).<init>(this);
    a = ((bi.b)localObject);
    localObject = new android/support/v7/widget/at$g$2;
    ((at.g.2)localObject).<init>(this);
    b = ((bi.b)localObject);
    localObject = new android/support/v7/widget/bi;
    bi.b localb = a;
    ((bi)localObject).<init>(localb);
    r = ((bi)localObject);
    localObject = new android/support/v7/widget/bi;
    localb = b;
    ((bi)localObject).<init>(localb);
    s = ((bi)localObject);
    u = false;
    v = false;
    w = false;
    x = bool;
    y = bool;
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    switch (i)
    {
    }
    for (j = Math.max(paramInt2, paramInt3);; j = Math.min(j, i))
    {
      return j;
      i = Math.max(paramInt2, paramInt3);
    }
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    int i = -1;
    int j = -2;
    int k = -1 << -1;
    int m = 1073741824;
    int n = 0;
    int i1 = paramInt1 - paramInt3;
    i1 = Math.max(0, i1);
    if (paramBoolean) {
      if (paramInt4 >= 0)
      {
        n = m;
        i1 = paramInt4;
      }
    }
    for (;;)
    {
      return View.MeasureSpec.makeMeasureSpec(i1, n);
      if (paramInt4 == i)
      {
        switch (paramInt2)
        {
        default: 
          i1 = 0;
          break;
        case 1073741824: 
        case -2147483648: 
          n = paramInt2;
          break;
        }
      }
      else
      {
        if (paramInt4 == j)
        {
          i1 = 0;
          continue;
          if (paramInt4 >= 0)
          {
            n = m;
            i1 = paramInt4;
            continue;
          }
          if (paramInt4 == i)
          {
            n = paramInt2;
            continue;
          }
          if (paramInt4 == j)
          {
            if ((paramInt2 != k) && (paramInt2 != m)) {
              continue;
            }
            n = k;
            continue;
          }
        }
        i1 = 0;
      }
    }
  }
  
  public static int a(View paramView)
  {
    return getLayoutParamsc.c();
  }
  
  public static at.g.b a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    int i = 1;
    at.g.b localb = new android/support/v7/widget/at$g$b;
    localb.<init>();
    Object localObject = a.a.RecyclerView;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject, paramInt1, paramInt2);
    int j = a.a.RecyclerView_android_orientation;
    j = ((TypedArray)localObject).getInt(j, i);
    a = j;
    j = a.a.RecyclerView_spanCount;
    j = ((TypedArray)localObject).getInt(j, i);
    b = j;
    j = a.a.RecyclerView_reverseLayout;
    boolean bool1 = ((TypedArray)localObject).getBoolean(j, false);
    c = bool1;
    int k = a.a.RecyclerView_stackFromEnd;
    boolean bool2 = ((TypedArray)localObject).getBoolean(k, false);
    d = bool2;
    ((TypedArray)localObject).recycle();
    return localb;
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    at.h localh = (at.h)paramView.getLayoutParams();
    Rect localRect = d;
    int i = left + paramInt1;
    int j = leftMargin;
    i += j;
    j = top + paramInt2;
    int k = topMargin;
    j += k;
    k = right;
    k = paramInt3 - k;
    int m = rightMargin;
    k -= m;
    int n = bottom;
    n = paramInt4 - n;
    int i1 = bottomMargin;
    i1 = n - i1;
    paramView.layout(i, j, k, i1);
  }
  
  static boolean b(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    int i = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt2);
    if ((paramInt3 > 0) && (paramInt1 != paramInt3)) {}
    for (;;)
    {
      return bool2;
      switch (i)
      {
      default: 
        break;
      case -2147483648: 
        if (j >= paramInt1) {
          bool2 = bool1;
        }
        break;
      case 0: 
        bool2 = bool1;
        break;
      case 1073741824: 
        if (j == paramInt1) {
          bool2 = bool1;
        }
        break;
      }
    }
  }
  
  public static int c(View paramView)
  {
    Rect localRect = getLayoutParamsd;
    int i = paramView.getMeasuredWidth();
    int j = left;
    i += j;
    return right + i;
  }
  
  private void c(int paramInt)
  {
    Object localObject = d(paramInt);
    if (localObject != null)
    {
      localObject = p;
      int i = ((ac)localObject).a(paramInt);
      View localView = a.b(i);
      if (localView != null)
      {
        ac.a locala = b;
        boolean bool = locala.d(i);
        if (bool) {
          ((ac)localObject).b(localView);
        }
        localObject = a;
        ((ac.b)localObject).a(i);
      }
    }
  }
  
  public static int d(View paramView)
  {
    Rect localRect = getLayoutParamsd;
    int i = paramView.getMeasuredHeight();
    int j = top;
    i += j;
    return bottom + i;
  }
  
  public static int e(View paramView)
  {
    int i = paramView.getLeft();
    int j = getLayoutParamsd.left;
    return i - j;
  }
  
  public static int f(View paramView)
  {
    int i = paramView.getTop();
    int j = getLayoutParamsd.top;
    return i - j;
  }
  
  public static int g(View paramView)
  {
    int i = paramView.getRight();
    return getLayoutParamsd.right + i;
  }
  
  public static int h(View paramView)
  {
    int i = paramView.getBottom();
    return getLayoutParamsd.bottom + i;
  }
  
  private void h(int paramInt)
  {
    d(paramInt);
    p.d(paramInt);
  }
  
  public int a(int paramInt, at.m paramm, at.r paramr)
  {
    return 0;
  }
  
  public int a(at.m paramm, at.r paramr)
  {
    int i = 1;
    Object localObject = q;
    if (localObject != null)
    {
      localObject = q.l;
      if (localObject != null) {
        break label29;
      }
    }
    for (;;)
    {
      return i;
      label29:
      boolean bool = f();
      if (bool)
      {
        at.a locala = q.l;
        i = locala.a();
      }
    }
  }
  
  public at.h a(Context paramContext, AttributeSet paramAttributeSet)
  {
    at.h localh = new android/support/v7/widget/at$h;
    localh.<init>(paramContext, paramAttributeSet);
    return localh;
  }
  
  public at.h a(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof at.h;
    at.h localh;
    if (bool)
    {
      localh = new android/support/v7/widget/at$h;
      paramLayoutParams = (at.h)paramLayoutParams;
      localh.<init>(paramLayoutParams);
    }
    for (;;)
    {
      return localh;
      bool = paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
      if (bool)
      {
        localh = new android/support/v7/widget/at$h;
        paramLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
        localh.<init>(paramLayoutParams);
      }
      else
      {
        localh = new android/support/v7/widget/at$h;
        localh.<init>(paramLayoutParams);
      }
    }
  }
  
  public View a(int paramInt)
  {
    int i = l();
    int j = 0;
    View localView = null;
    int k = 0;
    if (k < i)
    {
      localView = d(k);
      at.u localu = at.c(localView);
      if (localu != null)
      {
        int m = localu.c();
        if (m == paramInt)
        {
          boolean bool1 = localu.b();
          if (!bool1)
          {
            at.r localr = q.F;
            bool1 = g;
            if (!bool1)
            {
              boolean bool2 = localu.m();
              if (bool2) {
                break label100;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return localView;
      label100:
      j = k + 1;
      k = j;
      break;
      j = 0;
      localView = null;
    }
  }
  
  public View a(View paramView, int paramInt, at.m paramm, at.r paramr)
  {
    return null;
  }
  
  public void a() {}
  
  public void a(int paramInt1, int paramInt2) {}
  
  public void a(int paramInt1, int paramInt2, at.r paramr, at.g.a parama) {}
  
  public void a(int paramInt, at.g.a parama) {}
  
  public final void a(int paramInt, at.m paramm)
  {
    View localView = d(paramInt);
    c(paramInt);
    paramm.a(localView);
  }
  
  public void a(Rect paramRect, int paramInt1, int paramInt2)
  {
    int i = paramRect.width();
    int j = m();
    i += j;
    j = o();
    i += j;
    j = paramRect.height();
    int k = n();
    j += k;
    k = p();
    j += k;
    k = w.q(q);
    i = a(paramInt1, i, k);
    k = w.r(q);
    j = a(paramInt2, j, k);
    h(i, j);
  }
  
  public void a(Parcelable paramParcelable) {}
  
  public final void a(at.m paramm)
  {
    int i = l() + -1;
    if (i >= 0)
    {
      Object localObject = d(i);
      at.u localu = at.c((View)localObject);
      boolean bool = localu.b();
      if (!bool)
      {
        bool = localu.j();
        if (!bool) {
          break label98;
        }
        bool = localu.m();
        if (bool) {
          break label98;
        }
        at.a locala = q.l;
        bool = e;
        if (bool) {
          break label98;
        }
        c(i);
        paramm.a(localu);
      }
      for (;;)
      {
        i += -1;
        break;
        label98:
        h(i);
        paramm.c((View)localObject);
        localObject = q.g;
        ((bj)localObject).c(localu);
      }
    }
  }
  
  public void a(at.m paramm, at.r paramr, View paramView, b paramb)
  {
    int i = 1;
    boolean bool1 = f();
    int j;
    if (bool1)
    {
      j = a(paramView);
      boolean bool2 = e();
      if (!bool2) {
        break label68;
      }
    }
    label68:
    for (int k = a(paramView);; k = 0)
    {
      b.n localn = b.n.a(j, i, k, i, false);
      paramb.a(localn);
      return;
      j = 0;
      localn = null;
      break;
    }
  }
  
  public void a(at.r paramr) {}
  
  final void a(at paramat)
  {
    int i = 1073741824;
    int j = 0;
    ac localac = null;
    if (paramat == null)
    {
      q = null;
      p = null;
      D = 0;
    }
    for (E = 0;; E = j)
    {
      B = i;
      C = i;
      return;
      q = paramat;
      localac = f;
      p = localac;
      j = paramat.getWidth();
      D = j;
      j = paramat.getHeight();
    }
  }
  
  public void a(at paramat, at.m paramm) {}
  
  final void a(View paramView, int paramInt, boolean paramBoolean)
  {
    int i = -1;
    Object localObject1 = at.c(paramView);
    Object localObject2;
    boolean bool2;
    label91:
    Object localObject3;
    Object localObject4;
    if (!paramBoolean)
    {
      boolean bool1 = ((at.u)localObject1).m();
      if (!bool1) {}
    }
    else
    {
      localObject2 = q.g;
      ((bj)localObject2).b((at.u)localObject1);
      localObject2 = (at.h)paramView.getLayoutParams();
      bool2 = ((at.u)localObject1).g();
      if (!bool2)
      {
        bool2 = ((at.u)localObject1).e();
        if (!bool2) {
          break label171;
        }
      }
      bool2 = ((at.u)localObject1).e();
      if (!bool2) {
        break label163;
      }
      ((at.u)localObject1).f();
      localObject3 = p;
      localObject4 = paramView.getLayoutParams();
      ((ac)localObject3).a(paramView, paramInt, (ViewGroup.LayoutParams)localObject4, false);
    }
    for (;;)
    {
      bool2 = f;
      if (bool2)
      {
        localObject3 = a;
        ((View)localObject3).invalidate();
        f = false;
      }
      return;
      localObject2 = q.g;
      ((bj)localObject2).c((at.u)localObject1);
      break;
      label163:
      ((at.u)localObject1).h();
      break label91;
      label171:
      localObject3 = paramView.getParent();
      localObject4 = q;
      int j;
      if (localObject3 == localObject4)
      {
        localObject3 = p;
        j = ((ac)localObject3).c(paramView);
        if (paramInt == i)
        {
          localObject4 = p;
          paramInt = ((ac)localObject4).a();
        }
        if (j == i)
        {
          localObject2 = new java/lang/IllegalStateException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
          int k = q.indexOfChild(paramView);
          localObject3 = k;
          ((IllegalStateException)localObject2).<init>((String)localObject3);
          throw ((Throwable)localObject2);
        }
        if (j != paramInt)
        {
          localObject4 = q.m;
          View localView = ((g)localObject4).d(j);
          if (localView == null)
          {
            localObject2 = new java/lang/IllegalArgumentException;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("Cannot move a child from non-existing index:");
            localObject3 = j;
            ((IllegalArgumentException)localObject2).<init>((String)localObject3);
            throw ((Throwable)localObject2);
          }
          ((g)localObject4).h(j);
          localObject3 = (at.h)localView.getLayoutParams();
          at.u localu = at.c(localView);
          boolean bool4 = localu.m();
          bj localbj;
          if (bool4)
          {
            localbj = q.g;
            localbj.b(localu);
          }
          for (;;)
          {
            localObject4 = p;
            boolean bool5 = localu.m();
            ((ac)localObject4).a(localView, paramInt, (ViewGroup.LayoutParams)localObject3, bool5);
            break;
            localbj = q.g;
            localbj.c(localu);
          }
        }
      }
      else
      {
        p.a(paramView, paramInt, false);
        j = 1;
        e = j;
        localObject3 = t;
        if (localObject3 != null)
        {
          localObject3 = t;
          boolean bool3 = c;
          if (bool3)
          {
            localObject3 = t;
            int m = at.d(paramView);
            i = a;
            if (m == i) {
              d = paramView;
            }
          }
        }
      }
    }
  }
  
  public final void a(View paramView, Rect paramRect)
  {
    Object localObject = getLayoutParamsd;
    int i = -left;
    int k = -top;
    int m = paramView.getWidth();
    int n = right;
    m += n;
    n = paramView.getHeight();
    int i1 = bottom + n;
    paramRect.set(i, k, m, i1);
    localObject = q;
    if (localObject != null)
    {
      localObject = w.p(paramView);
      if (localObject != null)
      {
        boolean bool = ((Matrix)localObject).isIdentity();
        if (!bool)
        {
          RectF localRectF = q.k;
          localRectF.set(paramRect);
          ((Matrix)localObject).mapRect(localRectF);
          float f1 = left;
          i1 = (int)Math.floor(f1);
          float f2 = top;
          double d1 = Math.floor(f2);
          k = (int)d1;
          float f3 = right;
          m = (int)Math.ceil(f3);
          float f4 = bottom;
          double d2 = Math.ceil(f4);
          j = (int)d2;
          paramRect.set(i1, k, m, j);
        }
      }
    }
    i1 = paramView.getLeft();
    int j = paramView.getTop();
    paramRect.offset(i1, j);
  }
  
  final void a(View paramView, b paramb)
  {
    Object localObject1 = at.c(paramView);
    if (localObject1 != null)
    {
      boolean bool1 = ((at.u)localObject1).m();
      if (!bool1)
      {
        Object localObject2 = p;
        localObject1 = a;
        boolean bool2 = ((ac)localObject2).d((View)localObject1);
        if (!bool2)
        {
          localObject1 = q.d;
          localObject2 = q.F;
          a((at.m)localObject1, (at.r)localObject2, paramView, paramb);
        }
      }
    }
  }
  
  public final void a(View paramView, at.m paramm)
  {
    Object localObject = p;
    ac.b localb = a;
    int i = localb.a(paramView);
    if (i >= 0)
    {
      ac.a locala = b;
      boolean bool = locala.d(i);
      if (bool) {
        ((ac)localObject).b(paramView);
      }
      localObject = a;
      ((ac.b)localObject).a(i);
    }
    paramm.a(paramView);
  }
  
  public void a(AccessibilityEvent paramAccessibilityEvent)
  {
    int i = -1;
    int j = 1;
    Object localObject1 = q.d;
    localObject1 = q.F;
    localObject1 = a.a(paramAccessibilityEvent);
    Object localObject2 = q;
    if (localObject2 == null) {
      return;
    }
    localObject2 = q;
    boolean bool = w.b((View)localObject2, j);
    if (!bool)
    {
      localObject2 = q;
      bool = w.b((View)localObject2, i);
      if (!bool)
      {
        localObject2 = q;
        bool = w.a((View)localObject2, i);
        if (!bool)
        {
          localObject2 = q;
          bool = w.a((View)localObject2, j);
          if (!bool) {
            break label176;
          }
        }
      }
    }
    for (;;)
    {
      ((f)localObject1).a(j);
      at.a locala = q.l;
      if (locala == null) {
        break;
      }
      locala = q.l;
      int k = locala.a();
      localObject2 = f.a;
      localObject1 = b;
      ((f.c)localObject2).b(localObject1, k);
      break;
      label176:
      k = 0;
      locala = null;
    }
  }
  
  public void a(String paramString)
  {
    at localat = q;
    if (localat != null)
    {
      localat = q;
      localat.a(paramString);
    }
  }
  
  public boolean a(at.h paramh)
  {
    if (paramh != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final boolean a(at paramat, View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2)
  {
    int[] arrayOfInt = new int[2];
    int i = m();
    int j = n();
    int k = D;
    int n = o();
    int i7 = k - n;
    k = E;
    int i1 = p();
    int i8 = k - i1;
    k = paramView.getLeft();
    int i2 = left;
    k += i2;
    int i3 = paramView.getScrollX();
    int i9 = k - i3;
    k = paramView.getTop();
    int i4 = top;
    k += i4;
    int i5 = paramView.getScrollY();
    int i10 = k - i5;
    k = paramRect.width();
    int i11 = i9 + k;
    k = paramRect.height();
    int i12 = i10 + k;
    int i6 = i9 - i;
    i6 = Math.min(0, i6);
    int i13 = i10 - j;
    i13 = Math.min(0, i13);
    String str1 = null;
    int i15 = i11 - i7;
    k = Math.max(0, i15);
    i8 = i12 - i8;
    i8 = Math.max(0, i8);
    at localat = q;
    i12 = w.g(localat);
    i15 = 1;
    label249:
    Object localObject;
    if (i12 == i15) {
      if (k != 0)
      {
        i6 = k;
        if (i13 == 0) {
          break label392;
        }
        k = i13;
        i13 = 0;
        localObject = null;
        arrayOfInt[0] = i6;
        arrayOfInt[1] = k;
        str1 = null;
        k = arrayOfInt[0];
        i6 = arrayOfInt[1];
        if (paramBoolean2)
        {
          localObject = paramat.getFocusedChild();
          if (localObject != null) {
            break label407;
          }
          i13 = 0;
          localObject = null;
          label304:
          if (i13 == 0) {
            break label695;
          }
        }
        if ((k == 0) && (i6 == 0)) {
          break label695;
        }
        if (!paramBoolean1) {
          break label556;
        }
        paramat.scrollBy(k, i6);
        label332:
        k = 1;
      }
    }
    for (;;)
    {
      return k;
      int m = i11 - i7;
      m = Math.max(i6, m);
      break;
      if (i6 != 0) {}
      for (m = i6;; m = Math.min(i6, m))
      {
        i6 = m;
        break;
        i6 = i9 - i;
      }
      label392:
      m = Math.min(i10 - j, i8);
      break label249;
      label407:
      int i16 = m();
      i = n();
      j = D;
      i7 = o();
      j -= i7;
      i7 = E;
      i8 = p();
      i7 -= i8;
      Rect localRect = q.j;
      at.a((View)localObject, localRect);
      i13 = left - m;
      if (i13 < j)
      {
        int i14 = right - m;
        if (i14 > i16)
        {
          i14 = top - i6;
          if (i14 < i7)
          {
            i14 = bottom - i6;
            if (i14 > i) {
              break label550;
            }
          }
        }
      }
      boolean bool = false;
      localObject = null;
      break label304;
      label550:
      bool = true;
      break label304;
      label556:
      localObject = m;
      String str2;
      if (localObject == null)
      {
        str1 = "RecyclerView";
        str2 = "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.";
        Log.e(str1, str2);
        break label332;
      }
      bool = t;
      if (bool) {
        break label332;
      }
      localObject = m;
      bool = ((g)localObject).e();
      if (!bool)
      {
        m = 0;
        str1 = null;
      }
      localObject = m;
      bool = ((g)localObject).f();
      if (!bool)
      {
        i6 = 0;
        str2 = null;
      }
      if ((m == 0) && (i6 == 0)) {
        break label332;
      }
      localObject = C;
      int i17 = ((at.t)localObject).a(m, i6);
      Interpolator localInterpolator = at.L;
      ((at.t)localObject).a(m, i6, i17, localInterpolator);
      break label332;
      label695:
      m = 0;
      str1 = null;
    }
  }
  
  final boolean a(View paramView, int paramInt1, int paramInt2, at.h paramh)
  {
    boolean bool1 = paramView.isLayoutRequested();
    if (!bool1)
    {
      bool1 = x;
      if (bool1)
      {
        int i = paramView.getWidth();
        int k = width;
        boolean bool2 = b(i, paramInt1, k);
        if (bool2)
        {
          int j = paramView.getHeight();
          k = height;
          bool3 = b(j, paramInt2, k);
          if (bool3) {
            break label84;
          }
        }
      }
    }
    label84:
    for (boolean bool3 = true;; bool3 = false) {
      return bool3;
    }
  }
  
  public final boolean a(Runnable paramRunnable)
  {
    at localat = q;
    boolean bool;
    if (localat != null)
    {
      localat = q;
      bool = localat.removeCallbacks(paramRunnable);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localat = null;
    }
  }
  
  public int b(int paramInt, at.m paramm, at.r paramr)
  {
    return 0;
  }
  
  public int b(at.m paramm, at.r paramr)
  {
    int i = 1;
    Object localObject = q;
    if (localObject != null)
    {
      localObject = q.l;
      if (localObject != null) {
        break label29;
      }
    }
    for (;;)
    {
      return i;
      label29:
      boolean bool = e();
      if (bool)
      {
        at.a locala = q.l;
        i = locala.a();
      }
    }
  }
  
  public int b(at.r paramr)
  {
    return 0;
  }
  
  public abstract at.h b();
  
  public final View b(View paramView)
  {
    Object localObject1 = null;
    Object localObject2 = q;
    if (localObject2 == null) {}
    for (;;)
    {
      return (View)localObject1;
      localObject2 = q.b(paramView);
      if (localObject2 != null)
      {
        ac localac = p;
        boolean bool = localac.d((View)localObject2);
        if (!bool) {
          localObject1 = localObject2;
        }
      }
    }
  }
  
  public void b(int paramInt) {}
  
  public void b(int paramInt1, int paramInt2) {}
  
  final void b(at.m paramm)
  {
    Object localObject1 = a;
    int i = ((ArrayList)localObject1).size();
    int j = i + -1;
    for (int k = j; k >= 0; k = j)
    {
      localObject1 = a.get(k)).a;
      at.u localu = at.c((View)localObject1);
      boolean bool = localu.b();
      if (!bool)
      {
        localu.a(false);
        bool = localu.n();
        if (bool)
        {
          localObject2 = q;
          ((at)localObject2).removeDetachedView((View)localObject1, false);
        }
        Object localObject2 = q.B;
        if (localObject2 != null)
        {
          localObject2 = q.B;
          ((at.e)localObject2).c(localu);
        }
        bool = true;
        localu.a(bool);
        paramm.b((View)localObject1);
      }
      j = k + -1;
    }
    a.clear();
    localObject1 = b;
    if (localObject1 != null)
    {
      localObject1 = b;
      ((ArrayList)localObject1).clear();
    }
    if (i > 0)
    {
      localObject1 = q;
      ((at)localObject1).invalidate();
    }
  }
  
  final void b(at paramat)
  {
    int i = 1073741824;
    int j = View.MeasureSpec.makeMeasureSpec(paramat.getWidth(), i);
    int k = View.MeasureSpec.makeMeasureSpec(paramat.getHeight(), i);
    e(j, k);
  }
  
  final void b(at paramat, at.m paramm)
  {
    v = false;
    a(paramat, paramm);
  }
  
  public final void b(View paramView, Rect paramRect)
  {
    Object localObject = q;
    if (localObject == null) {
      paramRect.set(0, 0, 0, 0);
    }
    for (;;)
    {
      return;
      localObject = q.e(paramView);
      paramRect.set((Rect)localObject);
    }
  }
  
  public int c(at.r paramr)
  {
    return 0;
  }
  
  public void c(int paramInt1, int paramInt2) {}
  
  public final void c(at.m paramm)
  {
    int i = l() + -1;
    while (i >= 0)
    {
      at.u localu = at.c(d(i));
      boolean bool = localu.b();
      if (!bool) {
        a(i, paramm);
      }
      i += -1;
    }
  }
  
  public void c(at.m paramm, at.r paramr)
  {
    Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
  }
  
  public boolean c()
  {
    return false;
  }
  
  public int d(at.r paramr)
  {
    return 0;
  }
  
  public Parcelable d()
  {
    return null;
  }
  
  public final View d(int paramInt)
  {
    Object localObject = p;
    if (localObject != null) {}
    for (localObject = p.b(paramInt);; localObject = null) {
      return (View)localObject;
    }
  }
  
  public void d(int paramInt1, int paramInt2) {}
  
  public int e(at.r paramr)
  {
    return 0;
  }
  
  public void e(int paramInt)
  {
    at localat1 = q;
    if (localat1 != null)
    {
      at localat2 = q;
      int i = f.a();
      int j = 0;
      localat1 = null;
      while (j < i)
      {
        View localView = f.b(j);
        localView.offsetLeftAndRight(paramInt);
        j += 1;
      }
    }
  }
  
  final void e(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    D = i;
    i = View.MeasureSpec.getMode(paramInt1);
    B = i;
    i = B;
    if (i == 0)
    {
      boolean bool1 = at.b;
      if (!bool1) {
        D = 0;
      }
    }
    int j = View.MeasureSpec.getSize(paramInt2);
    E = j;
    j = View.MeasureSpec.getMode(paramInt2);
    C = j;
    j = C;
    if (j == 0)
    {
      boolean bool2 = at.b;
      if (!bool2) {
        E = 0;
      }
    }
  }
  
  public boolean e()
  {
    return false;
  }
  
  public int f(at.r paramr)
  {
    return 0;
  }
  
  public void f(int paramInt)
  {
    at localat1 = q;
    if (localat1 != null)
    {
      at localat2 = q;
      int i = f.a();
      int j = 0;
      localat1 = null;
      while (j < i)
      {
        View localView = f.b(j);
        localView.offsetTopAndBottom(paramInt);
        j += 1;
      }
    }
  }
  
  final void f(int paramInt1, int paramInt2)
  {
    int i = -1 >>> 1;
    int j = -1 << -1;
    int k = l();
    Object localObject;
    if (k == 0)
    {
      localObject = q;
      ((at)localObject).b(paramInt1, paramInt2);
    }
    for (;;)
    {
      return;
      localObject = null;
      int m = 0;
      Rect localRect1 = null;
      int n = j;
      int i1 = i;
      while (m < k)
      {
        View localView = d(m);
        Rect localRect2 = q.j;
        at.a(localView, localRect2);
        int i2 = left;
        if (i2 < i1) {
          i1 = left;
        }
        i2 = right;
        if (i2 > n) {
          n = right;
        }
        i2 = top;
        if (i2 < i) {
          i = top;
        }
        i2 = bottom;
        if (i2 > j) {
          j = bottom;
        }
        m += 1;
      }
      localRect1 = q.j;
      localRect1.set(i1, i, n, j);
      localObject = q.j;
      a((Rect)localObject, paramInt1, paramInt2);
    }
  }
  
  public boolean f()
  {
    return false;
  }
  
  public int g(at.r paramr)
  {
    return 0;
  }
  
  public void g(int paramInt) {}
  
  public final void g(int paramInt1, int paramInt2)
  {
    q.b(paramInt1, paramInt2);
  }
  
  public final void h(int paramInt1, int paramInt2)
  {
    at.a(q, paramInt1, paramInt2);
  }
  
  boolean i()
  {
    return false;
  }
  
  public final void j()
  {
    at localat = q;
    if (localat != null)
    {
      localat = q;
      localat.requestLayout();
    }
  }
  
  public final boolean k()
  {
    at.q localq = t;
    boolean bool;
    if (localq != null)
    {
      localq = t;
      bool = c;
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localq = null;
    }
  }
  
  public final int l()
  {
    ac localac = p;
    int i;
    if (localac != null)
    {
      localac = p;
      i = localac.a();
    }
    for (;;)
    {
      return i;
      i = 0;
      localac = null;
    }
  }
  
  public final int m()
  {
    at localat = q;
    int i;
    if (localat != null)
    {
      localat = q;
      i = localat.getPaddingLeft();
    }
    for (;;)
    {
      return i;
      i = 0;
      localat = null;
    }
  }
  
  public final int n()
  {
    at localat = q;
    int i;
    if (localat != null)
    {
      localat = q;
      i = localat.getPaddingTop();
    }
    for (;;)
    {
      return i;
      i = 0;
      localat = null;
    }
  }
  
  public final int o()
  {
    at localat = q;
    int i;
    if (localat != null)
    {
      localat = q;
      i = localat.getPaddingRight();
    }
    for (;;)
    {
      return i;
      i = 0;
      localat = null;
    }
  }
  
  public final int p()
  {
    at localat = q;
    int i;
    if (localat != null)
    {
      localat = q;
      i = localat.getPaddingBottom();
    }
    for (;;)
    {
      return i;
      i = 0;
      localat = null;
    }
  }
  
  final void q()
  {
    at.q localq = t;
    if (localq != null)
    {
      localq = t;
      localq.a();
    }
  }
}


/* Location:              android/support/v7/widget/at$g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */