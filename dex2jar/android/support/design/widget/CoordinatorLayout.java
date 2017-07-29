package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.design.a.h;
import android.support.design.a.i;
import android.support.v4.f.b;
import android.support.v4.f.c;
import android.support.v4.g.j.a;
import android.support.v4.g.j.c;
import android.support.v4.g.k;
import android.support.v4.h.al;
import android.support.v4.h.f;
import android.support.v4.h.n;
import android.support.v4.h.q;
import android.support.v4.h.r;
import android.support.v4.h.s;
import android.support.v4.h.w;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout
  extends ViewGroup
  implements q
{
  static final String a;
  static final Class<?>[] b;
  static final ThreadLocal<Map<String, Constructor<a>>> c;
  static final Comparator<View> d;
  private static final j.a<Rect> j;
  final d<View> e = new d();
  final List<View> f = new ArrayList();
  al g;
  boolean h;
  ViewGroup.OnHierarchyChangeListener i;
  private final List<View> k = new ArrayList();
  private final List<View> l = new ArrayList();
  private final int[] m = new int[2];
  private boolean n;
  private boolean o;
  private int[] p;
  private View q;
  private View r;
  private View s;
  private e t;
  private boolean u;
  private Drawable v;
  private s w;
  private final r x = new r(this);
  
  static
  {
    Object localObject = CoordinatorLayout.class.getPackage();
    if (localObject != null)
    {
      localObject = ((Package)localObject).getName();
      a = (String)localObject;
      if (Build.VERSION.SDK_INT < 21) {
        break label80;
      }
    }
    label80:
    for (d = new g();; d = null)
    {
      b = new Class[] { Context.class, AttributeSet.class };
      c = new ThreadLocal();
      j = new j.c();
      return;
      localObject = null;
      break;
    }
  }
  
  public CoordinatorLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    p.a(paramContext);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.CoordinatorLayout, paramInt, a.h.Widget_Design_CoordinatorLayout);
    paramInt = paramAttributeSet.getResourceId(a.i.CoordinatorLayout_keylines, 0);
    if (paramInt != 0)
    {
      paramContext = paramContext.getResources();
      p = paramContext.getIntArray(paramInt);
      float f1 = getDisplayMetricsdensity;
      int i2 = p.length;
      paramInt = i1;
      while (paramInt < i2)
      {
        paramContext = p;
        paramContext[paramInt] = ((int)(paramContext[paramInt] * f1));
        paramInt += 1;
      }
    }
    v = paramAttributeSet.getDrawable(a.i.CoordinatorLayout_statusBarBackground);
    paramAttributeSet.recycle();
    d();
    super.setOnHierarchyChangeListener(new c());
  }
  
  private static Rect a()
  {
    Rect localRect2 = (Rect)j.a();
    Rect localRect1 = localRect2;
    if (localRect2 == null) {
      localRect1 = new Rect();
    }
    return localRect1;
  }
  
  static a a(Context paramContext, AttributeSet paramAttributeSet, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    String str;
    if (paramString.startsWith(".")) {
      str = paramContext.getPackageName() + paramString;
    }
    label224:
    for (;;)
    {
      try
      {
        paramString = (Map)c.get();
        if (paramString != null) {
          break label224;
        }
        paramString = new HashMap();
        c.set(paramString);
        Constructor localConstructor2 = (Constructor)paramString.get(str);
        Constructor localConstructor1 = localConstructor2;
        if (localConstructor2 == null)
        {
          localConstructor1 = Class.forName(str, true, paramContext.getClassLoader()).getConstructor(b);
          localConstructor1.setAccessible(true);
          paramString.put(str, localConstructor1);
        }
        paramContext = (a)localConstructor1.newInstance(new Object[] { paramContext, paramAttributeSet });
        return paramContext;
      }
      catch (Exception paramContext)
      {
        throw new RuntimeException("Could not inflate Behavior subclass " + str, paramContext);
      }
      str = paramString;
      if (paramString.indexOf('.') < 0)
      {
        str = paramString;
        if (!TextUtils.isEmpty(a)) {
          str = a + '.' + paramString;
        }
      }
    }
  }
  
  private static void a(int paramInt1, Rect paramRect1, Rect paramRect2, d paramd, int paramInt2, int paramInt3)
  {
    int i2 = c;
    int i1 = i2;
    if (i2 == 0) {
      i1 = 17;
    }
    int i3 = f.a(i1, paramInt1);
    i1 = f.a(c(d), paramInt1);
    switch (i1 & 0x7)
    {
    default: 
      paramInt1 = left;
      switch (i1 & 0x70)
      {
      default: 
        i1 = top;
        label114:
        i2 = paramInt1;
        switch (i3 & 0x7)
        {
        default: 
          i2 = paramInt1 - paramInt2;
        case 5: 
          label154:
          paramInt1 = i1;
          switch (i3 & 0x70)
          {
          }
          break;
        }
        break;
      }
      break;
    }
    for (paramInt1 = i1 - paramInt3;; paramInt1 = i1 - paramInt3 / 2)
    {
      paramRect2.set(i2, paramInt1, i2 + paramInt2, paramInt1 + paramInt3);
      return;
      paramInt1 = right;
      break;
      paramInt1 = left;
      paramInt1 = paramRect1.width() / 2 + paramInt1;
      break;
      i1 = bottom;
      break label114;
      i1 = top + paramRect1.height() / 2;
      break label114;
      i2 = paramInt1 - paramInt2 / 2;
      break label154;
    }
  }
  
  private static void a(Rect paramRect)
  {
    paramRect.setEmpty();
    j.a(paramRect);
  }
  
  private void a(d paramd, Rect paramRect, int paramInt1, int paramInt2)
  {
    int i2 = getWidth();
    int i1 = getHeight();
    i2 = Math.max(getPaddingLeft() + leftMargin, Math.min(left, i2 - getPaddingRight() - paramInt1 - rightMargin));
    i1 = Math.max(getPaddingTop() + topMargin, Math.min(top, i1 - getPaddingBottom() - paramInt2 - bottomMargin));
    paramRect.set(i2, i1, i2 + paramInt1, i1 + paramInt2);
  }
  
  private void a(View paramView, boolean paramBoolean, Rect paramRect)
  {
    if ((paramView.isLayoutRequested()) || (paramView.getVisibility() == 8))
    {
      paramRect.setEmpty();
      return;
    }
    if (paramBoolean)
    {
      t.a(this, paramView, paramRect);
      return;
    }
    paramRect.set(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
  }
  
  private boolean a(MotionEvent paramMotionEvent, int paramInt)
  {
    boolean bool1 = false;
    int i3 = 0;
    int i4 = n.a(paramMotionEvent);
    List localList = l;
    localList.clear();
    boolean bool2 = isChildrenDrawingOrderEnabled();
    int i5 = getChildCount();
    int i1 = i5 - 1;
    if (i1 >= 0)
    {
      if (bool2) {}
      for (i2 = getChildDrawingOrder(i5, i1);; i2 = i1)
      {
        localList.add(getChildAt(i2));
        i1 -= 1;
        break;
      }
    }
    if (d != null) {
      Collections.sort(localList, d);
    }
    i5 = localList.size();
    int i2 = 0;
    MotionEvent localMotionEvent = null;
    i1 = i3;
    View localView;
    d locald;
    a locala;
    if (i2 < i5)
    {
      localView = (View)localList.get(i2);
      locald = (d)localView.getLayoutParams();
      locala = a;
      if (((bool1) || (i1 != 0)) && (i4 != 0))
      {
        if (locala == null) {
          break label456;
        }
        if (localMotionEvent != null) {
          break label453;
        }
        long l1 = SystemClock.uptimeMillis();
        localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
        label199:
        switch (paramInt)
        {
        }
      }
    }
    label304:
    label359:
    label434:
    label443:
    label453:
    label456:
    for (;;)
    {
      i2 += 1;
      break;
      locala.a(this, localView, localMotionEvent);
      continue;
      locala.b(this, localView, localMotionEvent);
      continue;
      bool2 = bool1;
      if (!bool1)
      {
        bool2 = bool1;
        if (locala == null) {}
      }
      switch (paramInt)
      {
      default: 
        bool2 = bool1;
        if (bool1)
        {
          q = localView;
          bool2 = bool1;
        }
        bool1 = bool2;
        if (a == null) {
          m = false;
        }
        boolean bool3 = m;
        if (m)
        {
          bool2 = true;
          if ((!bool2) || (bool3)) {
            break label434;
          }
        }
        break;
      }
      for (i1 = 1;; i1 = 0)
      {
        if (bool2)
        {
          bool2 = bool1;
          if (i1 == 0) {
            break label443;
          }
        }
        break;
        bool1 = locala.a(this, localView, paramMotionEvent);
        break label304;
        bool1 = locala.b(this, localView, paramMotionEvent);
        break label304;
        bool2 = m | false;
        m = bool2;
        break label359;
      }
      bool2 = bool1;
      localList.clear();
      return bool2;
      break label199;
    }
  }
  
  private int b(int paramInt)
  {
    if (p == null)
    {
      Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + paramInt);
      return 0;
    }
    if ((paramInt < 0) || (paramInt >= p.length))
    {
      Log.e("CoordinatorLayout", "Keyline index " + paramInt + " out of range for " + this);
      return 0;
    }
    return p[paramInt];
  }
  
  private static d b(View paramView)
  {
    d locald = (d)paramView.getLayoutParams();
    View localView;
    if (!b)
    {
      Class localClass = paramView.getClass();
      paramView = null;
      for (;;)
      {
        localView = paramView;
        if (localClass == null) {
          break;
        }
        paramView = (b)localClass.getAnnotation(b.class);
        localView = paramView;
        if (paramView != null) {
          break;
        }
        localClass = localClass.getSuperclass();
      }
      if (localView == null) {}
    }
    try
    {
      locald.a((a)localView.a().newInstance());
      b = true;
      return locald;
    }
    catch (Exception paramView)
    {
      for (;;)
      {
        Log.e("CoordinatorLayout", "Default behavior class " + localView.a().getName() + " could not be instantiated. Did you forget a default constructor?", paramView);
      }
    }
  }
  
  private void b()
  {
    if (q != null)
    {
      a locala = q.getLayoutParams()).a;
      if (locala != null)
      {
        long l1 = SystemClock.uptimeMillis();
        MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
        locala.b(this, q, localMotionEvent);
        localMotionEvent.recycle();
      }
      q = null;
    }
    int i2 = getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      getChildAtgetLayoutParamsm = false;
      i1 += 1;
    }
    n = false;
  }
  
  private static void b(View paramView, int paramInt)
  {
    d locald = (d)paramView.getLayoutParams();
    if (i != paramInt)
    {
      w.f(paramView, paramInt - i);
      i = paramInt;
    }
  }
  
  private static int c(int paramInt)
  {
    if ((paramInt & 0x7) == 0) {
      paramInt = 0x800003 | paramInt;
    }
    for (;;)
    {
      int i1 = paramInt;
      if ((paramInt & 0x70) == 0) {
        i1 = paramInt | 0x30;
      }
      return i1;
    }
  }
  
  private void c()
  {
    k.clear();
    Object localObject1 = e;
    int i2 = b.size();
    int i1 = 0;
    Object localObject2;
    while (i1 < i2)
    {
      localObject2 = (ArrayList)b.c(i1);
      if (localObject2 != null)
      {
        ((ArrayList)localObject2).clear();
        a.a(localObject2);
      }
      i1 += 1;
    }
    b.clear();
    int i4 = getChildCount();
    i2 = 0;
    while (i2 < i4)
    {
      View localView = getChildAt(i2);
      Object localObject3 = b(localView);
      if (f == -1)
      {
        l = null;
        k = null;
        e.a(localView);
        i1 = 0;
      }
      for (;;)
      {
        if (i1 >= i4) {
          break label776;
        }
        if (i1 != i2)
        {
          localObject3 = getChildAt(i1);
          localObject1 = b((View)localObject3);
          int i3;
          if (localView != l)
          {
            i3 = w.g(this);
            int i5 = f.a(getLayoutParamsg, i3);
            if ((i5 != 0) && ((f.a(h, i3) & i5) == i5))
            {
              i3 = 1;
              label224:
              if ((i3 == 0) && ((a == null) || (!a.a_(localView)))) {
                break label686;
              }
            }
          }
          else
          {
            i3 = 1;
          }
          for (;;)
          {
            if (i3 != 0)
            {
              if (!e.b.containsKey(localObject3)) {
                e.a(localObject3);
              }
              d locald = e;
              if ((!b.containsKey(localView)) || (!b.containsKey(localObject3)))
              {
                throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                if (k != null)
                {
                  if (k.getId() == f) {
                    break label405;
                  }
                  i1 = 0;
                }
                for (;;)
                {
                  if (i1 != 0) {
                    break label494;
                  }
                  k = findViewById(f);
                  if (k == null) {
                    break label612;
                  }
                  if (k != this) {
                    break label507;
                  }
                  if (!isInEditMode()) {
                    break label496;
                  }
                  l = null;
                  k = null;
                  break;
                  label405:
                  localObject2 = k;
                  for (localObject1 = k.getParent();; localObject1 = ((ViewParent)localObject1).getParent())
                  {
                    if (localObject1 == this) {
                      break label484;
                    }
                    if ((localObject1 == null) || (localObject1 == localView))
                    {
                      l = null;
                      k = null;
                      i1 = 0;
                      break;
                    }
                    if ((localObject1 instanceof View)) {
                      localObject2 = (View)localObject1;
                    }
                  }
                  label484:
                  l = ((View)localObject2);
                  i1 = 1;
                }
                label494:
                break;
                label496:
                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                label507:
                localObject2 = k;
                for (localObject1 = k.getParent();; localObject1 = ((ViewParent)localObject1).getParent())
                {
                  if ((localObject1 == this) || (localObject1 == null)) {
                    break label602;
                  }
                  if (localObject1 == localView)
                  {
                    if (isInEditMode())
                    {
                      l = null;
                      k = null;
                      break;
                    }
                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                  }
                  if ((localObject1 instanceof View)) {
                    localObject2 = (View)localObject1;
                  }
                }
                label602:
                l = ((View)localObject2);
                break;
                label612:
                if (isInEditMode())
                {
                  l = null;
                  k = null;
                  break;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(f) + " to anchor view " + localView);
                i3 = 0;
                break label224;
                label686:
                i3 = 0;
                continue;
              }
              localObject2 = (ArrayList)b.get(localView);
              localObject1 = localObject2;
              if (localObject2 == null)
              {
                localObject2 = (ArrayList)a.a();
                localObject1 = localObject2;
                if (localObject2 == null) {
                  localObject1 = new ArrayList();
                }
                b.put(localView, localObject1);
              }
              ((ArrayList)localObject1).add(localObject3);
            }
          }
        }
        i1 += 1;
      }
      label776:
      i2 += 1;
    }
    k.addAll(e.a());
    Collections.reverse(k);
  }
  
  private static void c(View paramView, int paramInt)
  {
    d locald = (d)paramView.getLayoutParams();
    if (j != paramInt)
    {
      w.e(paramView, paramInt - j);
      j = paramInt;
    }
  }
  
  private static int d(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt == 0) {
      i1 = 8388661;
    }
    return i1;
  }
  
  private void d()
  {
    if (Build.VERSION.SDK_INT < 21) {
      return;
    }
    if (w.x(this))
    {
      if (w == null) {
        w = new s()
        {
          public final al a(View paramAnonymousView, al paramAnonymousal)
          {
            boolean bool2 = true;
            int i = 0;
            CoordinatorLayout localCoordinatorLayout = CoordinatorLayout.this;
            if (!x.a(g, paramAnonymousal))
            {
              g = paramAnonymousal;
              if ((paramAnonymousal != null) && (paramAnonymousal.b() > 0))
              {
                bool1 = true;
                h = bool1;
                if ((h) || (localCoordinatorLayout.getBackground() != null)) {
                  break label150;
                }
              }
              label150:
              for (boolean bool1 = bool2;; bool1 = false)
              {
                localCoordinatorLayout.setWillNotDraw(bool1);
                if (paramAnonymousal.e()) {
                  break label156;
                }
                int j = localCoordinatorLayout.getChildCount();
                paramAnonymousView = paramAnonymousal;
                for (;;)
                {
                  paramAnonymousal = paramAnonymousView;
                  if (i >= j) {
                    break;
                  }
                  paramAnonymousal = localCoordinatorLayout.getChildAt(i);
                  if ((w.x(paramAnonymousal)) && (getLayoutParamsa != null))
                  {
                    paramAnonymousal = paramAnonymousView;
                    if (paramAnonymousView.e()) {
                      break;
                    }
                  }
                  i += 1;
                }
                bool1 = false;
                break;
              }
              label156:
              localCoordinatorLayout.requestLayout();
              return paramAnonymousal;
            }
            return paramAnonymousal;
          }
        };
      }
      w.a(this, w);
      setSystemUiVisibility(1280);
      return;
    }
    w.a(this, null);
  }
  
  public final List<View> a(View paramView)
  {
    d locald = e;
    Object localObject1 = null;
    int i2 = b.size();
    int i1 = 0;
    Object localObject2;
    if (i1 < i2)
    {
      ArrayList localArrayList = (ArrayList)b.c(i1);
      localObject2 = localObject1;
      if (localArrayList != null)
      {
        localObject2 = localObject1;
        if (localArrayList.contains(paramView))
        {
          if (localObject1 != null) {
            break label136;
          }
          localObject1 = new ArrayList();
        }
      }
    }
    label136:
    for (;;)
    {
      ((ArrayList)localObject1).add(b.b(i1));
      localObject2 = localObject1;
      i1 += 1;
      localObject1 = localObject2;
      break;
      f.clear();
      if (localObject1 != null) {
        f.addAll((Collection)localObject1);
      }
      return f;
    }
  }
  
  final void a(int paramInt)
  {
    int i4 = w.g(this);
    int i5 = k.size();
    Rect localRect1 = a();
    Rect localRect2 = a();
    Rect localRect3 = a();
    int i2 = 0;
    View localView;
    Object localObject1;
    int i1;
    Object localObject2;
    Object localObject3;
    if (i2 < i5)
    {
      localView = (View)k.get(i2);
      localObject1 = (d)localView.getLayoutParams();
      if ((paramInt != 0) || (localView.getVisibility() != 8))
      {
        i1 = 0;
        int i6;
        int i7;
        int i3;
        if (i1 < i2)
        {
          localObject2 = (View)k.get(i1);
          Rect localRect5;
          if (l == localObject2)
          {
            localObject2 = (d)localView.getLayoutParams();
            if (k != null)
            {
              localObject3 = a();
              localRect4 = a();
              localRect5 = a();
              t.a(this, k, (Rect)localObject3);
              a(localView, false, localRect4);
              i6 = localView.getMeasuredWidth();
              i7 = localView.getMeasuredHeight();
              a(i4, (Rect)localObject3, localRect5, (d)localObject2, i6, i7);
              if ((left == left) && (top == top)) {
                break label337;
              }
            }
          }
          label337:
          for (i3 = 1;; i3 = 0)
          {
            a((d)localObject2, localRect5, i6, i7);
            i6 = left - left;
            i7 = top - top;
            if (i6 != 0) {
              w.f(localView, i6);
            }
            if (i7 != 0) {
              w.e(localView, i7);
            }
            if (i3 != 0)
            {
              a locala = a;
              if (locala != null) {
                locala.b(this, localView, k);
              }
            }
            a((Rect)localObject3);
            a(localRect4);
            a(localRect5);
            i1 += 1;
            break;
          }
        }
        a(localView, true, localRect2);
        if ((g != 0) && (!localRect2.isEmpty()))
        {
          i1 = f.a(g, i4);
          switch (i1 & 0x70)
          {
          default: 
            switch (i1 & 0x7)
            {
            }
            break;
          }
        }
        for (;;)
        {
          if ((h != 0) && (localView.getVisibility() == 0) && (w.F(localView)) && (localView.getWidth() > 0) && (localView.getHeight() > 0)) {
            break label703;
          }
          label480:
          if (paramInt != 2)
          {
            localRect3.set(getLayoutParamsp);
            if (localRect3.equals(localRect2)) {
              break label1197;
            }
            getLayoutParamsp.set(localRect2);
          }
          i1 = i2 + 1;
          for (;;)
          {
            if (i1 >= i5) {
              break label1197;
            }
            localObject1 = (View)k.get(i1);
            localObject2 = (d)((View)localObject1).getLayoutParams();
            localObject3 = a;
            if ((localObject3 != null) && (((a)localObject3).a_(localView)))
            {
              if ((paramInt != 0) || (!o)) {
                break;
              }
              o = false;
            }
            i1 += 1;
          }
          top = Math.max(top, bottom);
          break;
          bottom = Math.max(bottom, getHeight() - top);
          break;
          left = Math.max(left, right);
          continue;
          right = Math.max(right, getWidth() - left);
        }
        label703:
        localObject1 = (d)localView.getLayoutParams();
        localObject2 = a;
        localObject3 = a();
        Rect localRect4 = a();
        localRect4.set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
        if ((localObject2 != null) && (((a)localObject2).a(localView, (Rect)localObject3)))
        {
          if (!localRect4.contains((Rect)localObject3)) {
            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + ((Rect)localObject3).toShortString() + " | Bounds:" + localRect4.toShortString());
          }
        }
        else {
          ((Rect)localObject3).set(localRect4);
        }
        a(localRect4);
        if (!((Rect)localObject3).isEmpty())
        {
          i6 = f.a(h, i4);
          i3 = 0;
          i1 = i3;
          if ((i6 & 0x30) == 48)
          {
            i7 = top - topMargin - j;
            i1 = i3;
            if (i7 < top)
            {
              c(localView, top - i7);
              i1 = 1;
            }
          }
          i3 = i1;
          if ((i6 & 0x50) == 80)
          {
            i7 = getHeight() - bottom - bottomMargin + j;
            i3 = i1;
            if (i7 < bottom)
            {
              c(localView, i7 - bottom);
              i3 = 1;
            }
          }
          if (i3 == 0) {
            c(localView, 0);
          }
          i3 = 0;
          i1 = i3;
          if ((i6 & 0x3) == 3)
          {
            i7 = left - leftMargin - i;
            i1 = i3;
            if (i7 < left)
            {
              b(localView, left - i7);
              i1 = 1;
            }
          }
          if ((i6 & 0x5) != 5) {
            break label1220;
          }
          i3 = getWidth();
          i6 = right;
          i7 = rightMargin;
          i3 = i + (i3 - i6 - i7);
          if (i3 >= right) {
            break label1220;
          }
          b(localView, i3 - right);
          i1 = 1;
        }
      }
    }
    label1197:
    label1220:
    for (;;)
    {
      if (i1 == 0) {
        b(localView, 0);
      }
      a((Rect)localObject3);
      break label480;
      switch (paramInt)
      {
      }
      for (boolean bool = ((a)localObject3).b(this, (View)localObject1, localView); paramInt == 1; bool = true)
      {
        o = bool;
        break;
      }
      i2 += 1;
      break;
      a(localRect1);
      a(localRect2);
      a(localRect3);
      return;
    }
  }
  
  public final void a(View paramView, int paramInt)
  {
    Object localObject1 = (d)paramView.getLayoutParams();
    if ((k == null) && (f != -1)) {}
    for (int i1 = 1; i1 != 0; i1 = 0) {
      throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }
    int i2;
    if (k != null)
    {
      localObject2 = k;
      paramView.getLayoutParams();
      localObject1 = a();
      localRect = a();
      try
      {
        t.a(this, (View)localObject2, (Rect)localObject1);
        localObject2 = (d)paramView.getLayoutParams();
        i1 = paramView.getMeasuredWidth();
        i2 = paramView.getMeasuredHeight();
        a(paramInt, (Rect)localObject1, localRect, (d)localObject2, i1, i2);
        a((d)localObject2, localRect, i1, i2);
        paramView.layout(left, top, right, bottom);
        return;
      }
      finally
      {
        a((Rect)localObject1);
        a(localRect);
      }
    }
    if (e >= 0)
    {
      i2 = e;
      localObject1 = (d)paramView.getLayoutParams();
      int i7 = f.a(d(c), paramInt);
      int i6 = getWidth();
      int i5 = getHeight();
      int i3 = paramView.getMeasuredWidth();
      int i4 = paramView.getMeasuredHeight();
      i1 = i2;
      if (paramInt == 1) {
        i1 = i6 - i2;
      }
      paramInt = b(i1) - i3;
      switch (i7 & 0x7)
      {
      default: 
        switch (i7 & 0x70)
        {
        default: 
          i1 = 0;
        }
        break;
      }
      for (;;)
      {
        paramInt = Math.max(getPaddingLeft() + leftMargin, Math.min(paramInt, i6 - getPaddingRight() - i3 - rightMargin));
        i1 = Math.max(getPaddingTop() + topMargin, Math.min(i1, i5 - getPaddingBottom() - i4 - bottomMargin));
        paramView.layout(paramInt, i1, paramInt + i3, i1 + i4);
        return;
        paramInt += i3;
        break;
        paramInt += i3 / 2;
        break;
        i1 = i4 + 0;
        continue;
        i1 = i4 / 2 + 0;
      }
    }
    localObject1 = (d)paramView.getLayoutParams();
    Rect localRect = a();
    localRect.set(getPaddingLeft() + leftMargin, getPaddingTop() + topMargin, getWidth() - getPaddingRight() - rightMargin, getHeight() - getPaddingBottom() - bottomMargin);
    if ((g != null) && (w.x(this)) && (!w.x(paramView)))
    {
      left += g.a();
      top += g.b();
      right -= g.c();
      bottom -= g.d();
    }
    Object localObject2 = a();
    f.a(c(c), paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), localRect, (Rect)localObject2, paramInt);
    paramView.layout(left, top, right, bottom);
    a(localRect);
    a((Rect)localObject2);
  }
  
  public final void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final boolean a(View paramView, int paramInt1, int paramInt2)
  {
    Rect localRect = a();
    t.a(this, paramView, localRect);
    try
    {
      boolean bool = localRect.contains(paramInt1, paramInt2);
      return bool;
    }
    finally
    {
      a(localRect);
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof d)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    paramView.getLayoutParams();
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    boolean bool2 = false;
    Drawable localDrawable = v;
    boolean bool1 = bool2;
    if (localDrawable != null)
    {
      bool1 = bool2;
      if (localDrawable.isStateful()) {
        bool1 = localDrawable.setState(arrayOfInt) | false;
      }
    }
    if (bool1) {
      invalidate();
    }
  }
  
  final List<View> getDependencySortedChildren()
  {
    c();
    return Collections.unmodifiableList(k);
  }
  
  final al getLastWindowInsets()
  {
    return g;
  }
  
  public int getNestedScrollAxes()
  {
    return x.a;
  }
  
  public Drawable getStatusBarBackground()
  {
    return v;
  }
  
  protected int getSuggestedMinimumHeight()
  {
    return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
  }
  
  protected int getSuggestedMinimumWidth()
  {
    return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    b();
    if (u)
    {
      if (t == null) {
        t = new e();
      }
      getViewTreeObserver().addOnPreDrawListener(t);
    }
    if ((g == null) && (w.x(this))) {
      w.w(this);
    }
    o = true;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    b();
    if ((u) && (t != null)) {
      getViewTreeObserver().removeOnPreDrawListener(t);
    }
    if (s != null) {
      onStopNestedScroll(s);
    }
    o = false;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((h) && (v != null)) {
      if (g == null) {
        break label61;
      }
    }
    label61:
    for (int i1 = g.b();; i1 = 0)
    {
      if (i1 > 0)
      {
        v.setBounds(0, 0, getWidth(), i1);
        v.draw(paramCanvas);
      }
      return;
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = n.a(paramMotionEvent);
    if (i1 == 0) {
      b();
    }
    boolean bool = a(paramMotionEvent, 0);
    if ((i1 == 1) || (i1 == 3)) {
      b();
    }
    return bool;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = w.g(this);
    paramInt3 = k.size();
    paramInt1 = 0;
    while (paramInt1 < paramInt3)
    {
      View localView = (View)k.get(paramInt1);
      if (localView.getVisibility() != 8)
      {
        a locala = getLayoutParamsa;
        if ((locala == null) || (!locala.a(this, localView, paramInt2))) {
          a(localView, paramInt2);
        }
      }
      paramInt1 += 1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    c();
    int i3 = getChildCount();
    int i1 = 0;
    View localView;
    Object localObject1;
    int i4;
    int i2;
    label44:
    Object localObject2;
    if (i1 < i3)
    {
      localView = getChildAt(i1);
      localObject1 = e;
      i4 = b.size();
      i2 = 0;
      if (i2 < i4)
      {
        localObject2 = (ArrayList)b.c(i2);
        if ((localObject2 != null) && (((ArrayList)localObject2).contains(localView)))
        {
          i2 = 1;
          label84:
          if (i2 == 0) {
            break label618;
          }
        }
      }
    }
    for (int i22 = 1;; i22 = 0)
    {
      label148:
      int i10;
      int i5;
      label187:
      int i6;
      label242:
      int i7;
      label256:
      int i8;
      int i9;
      int i20;
      if (i22 != u)
      {
        if (i22 != 0)
        {
          if (o)
          {
            if (t == null) {
              t = new e();
            }
            getViewTreeObserver().addOnPreDrawListener(t);
          }
          u = true;
        }
      }
      else
      {
        i10 = getPaddingLeft();
        int i11 = getPaddingTop();
        int i12 = getPaddingRight();
        int i13 = getPaddingBottom();
        int i14 = w.g(this);
        if (i14 != 1) {
          break label658;
        }
        i5 = 1;
        int i15 = View.MeasureSpec.getMode(paramInt1);
        int i16 = View.MeasureSpec.getSize(paramInt1);
        int i17 = View.MeasureSpec.getMode(paramInt2);
        int i18 = View.MeasureSpec.getSize(paramInt2);
        i3 = getSuggestedMinimumWidth();
        i2 = getSuggestedMinimumHeight();
        i1 = 0;
        if ((g == null) || (!w.x(this))) {
          break label664;
        }
        i6 = 1;
        int i19 = k.size();
        i7 = 0;
        if (i7 >= i19) {
          break label714;
        }
        localView = (View)k.get(i7);
        if (localView.getVisibility() == 8) {
          break label749;
        }
        localObject1 = (d)localView.getLayoutParams();
        i8 = 0;
        i4 = i8;
        if (e >= 0)
        {
          i4 = i8;
          if (i15 != 0)
          {
            i9 = b(e);
            i20 = f.a(d(c), i14) & 0x7;
            if (((i20 != 3) || (i5 != 0)) && ((i20 != 5) || (i5 == 0))) {
              break label670;
            }
            i4 = Math.max(0, i16 - i12 - i9);
          }
        }
        label388:
        if ((i6 == 0) || (w.x(localView))) {
          break label740;
        }
        i8 = g.a();
        int i21 = g.c();
        i9 = g.b();
        i20 = g.d();
        i8 = View.MeasureSpec.makeMeasureSpec(i16 - (i8 + i21), i15);
        i9 = View.MeasureSpec.makeMeasureSpec(i18 - (i9 + i20), i17);
        label467:
        localObject2 = a;
        if ((localObject2 == null) || (!((a)localObject2).a(this, localView, i8, i4, i9, 0))) {
          a(localView, i8, i4, i9, 0);
        }
        i4 = Math.max(i3, localView.getMeasuredWidth() + (i10 + i12) + leftMargin + rightMargin);
        i2 = Math.max(i2, localView.getMeasuredHeight() + (i11 + i13) + topMargin + bottomMargin);
        i3 = w.a(i1, w.j(localView));
      }
      for (i1 = i4;; i1 = i4)
      {
        i7 += 1;
        i4 = i1;
        i1 = i3;
        i3 = i4;
        break label256;
        i2 += 1;
        break label44;
        i2 = 0;
        break label84;
        label618:
        i1 += 1;
        break;
        if ((o) && (t != null)) {
          getViewTreeObserver().removeOnPreDrawListener(t);
        }
        u = false;
        break label148;
        label658:
        i5 = 0;
        break label187;
        label664:
        i6 = 0;
        break label242;
        label670:
        if ((i20 != 5) || (i5 != 0))
        {
          i4 = i8;
          if (i20 != 3) {
            break label388;
          }
          i4 = i8;
          if (i5 == 0) {
            break label388;
          }
        }
        i4 = Math.max(0, i9 - i10);
        break label388;
        label714:
        setMeasuredDimension(w.a(i3, paramInt1, 0xFF000000 & i1), w.a(i2, paramInt2, i1 << 16));
        return;
        label740:
        i9 = paramInt2;
        i8 = paramInt1;
        break label467;
        label749:
        i4 = i3;
        i3 = i1;
      }
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    int i2 = getChildCount();
    int i1 = 0;
    boolean bool = false;
    if (i1 < i2)
    {
      paramView = getChildAt(i1);
      if (paramView.getVisibility() == 8) {
        break label101;
      }
      Object localObject = (d)paramView.getLayoutParams();
      if (!n) {
        break label101;
      }
      localObject = a;
      if (localObject == null) {
        break label101;
      }
      bool = ((a)localObject).a(this, paramView, paramFloat2, paramBoolean) | bool;
    }
    label101:
    for (;;)
    {
      i1 += 1;
      break;
      if (bool) {
        a(1);
      }
      return bool;
    }
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    int i2 = getChildCount();
    int i1 = 0;
    boolean bool = false;
    if (i1 < i2)
    {
      View localView = getChildAt(i1);
      if (localView.getVisibility() == 8) {
        break label95;
      }
      Object localObject = (d)localView.getLayoutParams();
      if (!n) {
        break label95;
      }
      localObject = a;
      if (localObject == null) {
        break label95;
      }
      bool = ((a)localObject).a(this, localView, paramView, paramFloat1, paramFloat2) | bool;
    }
    label95:
    for (;;)
    {
      i1 += 1;
      break;
      return bool;
    }
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    int i2 = 0;
    int i1 = 0;
    int i3 = 0;
    int i6 = getChildCount();
    int i4 = 0;
    label122:
    label139:
    int i5;
    if (i4 < i6)
    {
      View localView = getChildAt(i4);
      if (localView.getVisibility() == 8) {
        break label230;
      }
      Object localObject = (d)localView.getLayoutParams();
      if (!n) {
        break label230;
      }
      localObject = a;
      if (localObject == null) {
        break label230;
      }
      int[] arrayOfInt = m;
      m[1] = 0;
      arrayOfInt[0] = 0;
      ((a)localObject).a(this, localView, paramView, paramInt2, m);
      if (paramInt1 > 0)
      {
        i2 = Math.max(i2, m[0]);
        if (paramInt2 <= 0) {
          break label191;
        }
        i1 = Math.max(i1, m[1]);
        i5 = 1;
        i3 = i1;
        i1 = i5;
      }
    }
    for (;;)
    {
      i5 = i4 + 1;
      i4 = i3;
      i3 = i1;
      i1 = i4;
      i4 = i5;
      break;
      i2 = Math.min(i2, m[0]);
      break label122;
      label191:
      i1 = Math.min(i1, m[1]);
      break label139;
      paramArrayOfInt[0] = i2;
      paramArrayOfInt[1] = i1;
      if (i3 != 0) {
        a(1);
      }
      return;
      label230:
      i5 = i1;
      i1 = i3;
      i3 = i5;
    }
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt3 = getChildCount();
    paramInt2 = 0;
    paramInt1 = 0;
    if (paramInt2 < paramInt3)
    {
      paramView = getChildAt(paramInt2);
      if (paramView.getVisibility() == 8) {
        break label88;
      }
      Object localObject = (d)paramView.getLayoutParams();
      if (!n) {
        break label88;
      }
      localObject = a;
      if (localObject == null) {
        break label88;
      }
      ((a)localObject).b(this, paramView, paramInt4);
      paramInt1 = 1;
    }
    label88:
    for (;;)
    {
      paramInt2 += 1;
      break;
      if (paramInt1 != 0) {
        a(1);
      }
      return;
    }
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    x.a = paramInt;
    r = paramView1;
    s = paramView2;
    int i1 = getChildCount();
    paramInt = 0;
    while (paramInt < i1)
    {
      getChildAt(paramInt).getLayoutParams();
      paramInt += 1;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof f)) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      paramParcelable = (f)paramParcelable;
      super.onRestoreInstanceState(e);
      paramParcelable = a;
      int i2 = getChildCount();
      int i1 = 0;
      while (i1 < i2)
      {
        View localView = getChildAt(i1);
        int i3 = localView.getId();
        a locala = ba;
        if ((i3 != -1) && (locala != null))
        {
          Parcelable localParcelable = (Parcelable)paramParcelable.get(i3);
          if (localParcelable != null) {
            locala.a(this, localView, localParcelable);
          }
        }
        i1 += 1;
      }
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    f localf = new f(super.onSaveInstanceState());
    SparseArray localSparseArray = new SparseArray();
    int i2 = getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      Object localObject = getChildAt(i1);
      int i3 = ((View)localObject).getId();
      a locala = getLayoutParamsa;
      if ((i3 != -1) && (locala != null))
      {
        localObject = locala.b(this, (View)localObject);
        if (localObject != null) {
          localSparseArray.append(i3, localObject);
        }
      }
      i1 += 1;
    }
    a = localSparseArray;
    return localf;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    int i2 = getChildCount();
    int i1 = 0;
    boolean bool1 = false;
    if (i1 < i2)
    {
      paramView2 = getChildAt(i1);
      d locald;
      if (paramView2.getVisibility() != 8)
      {
        locald = (d)paramView2.getLayoutParams();
        a locala = a;
        if (locala != null)
        {
          boolean bool2 = locala.a(this, paramView2, paramView1, paramInt);
          n = bool2;
          bool1 |= bool2;
        }
      }
      for (;;)
      {
        i1 += 1;
        break;
        n = false;
      }
    }
    return bool1;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    x.a = 0;
    int i2 = getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      View localView = getChildAt(i1);
      d locald = (d)localView.getLayoutParams();
      if (n)
      {
        a locala = a;
        if (locala != null) {
          locala.a(this, localView, paramView);
        }
        n = false;
        o = false;
      }
      i1 += 1;
    }
    r = null;
    s = null;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = n.a(paramMotionEvent);
    boolean bool2;
    if (q == null)
    {
      bool2 = a(paramMotionEvent, 1);
      if (!bool2) {}
    }
    for (;;)
    {
      a locala = q.getLayoutParams()).a;
      boolean bool1;
      if (locala != null) {
        bool1 = locala.b(this, q, paramMotionEvent);
      }
      for (;;)
      {
        if (q == null)
        {
          bool1 |= super.onTouchEvent(paramMotionEvent);
          paramMotionEvent = null;
        }
        for (;;)
        {
          if (paramMotionEvent != null) {
            paramMotionEvent.recycle();
          }
          if ((i1 == 1) || (i1 == 3)) {
            b();
          }
          return bool1;
          if (bool2)
          {
            long l1 = SystemClock.uptimeMillis();
            paramMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
            super.onTouchEvent(paramMotionEvent);
          }
          else
          {
            paramMotionEvent = null;
          }
        }
        bool1 = false;
        continue;
        bool1 = false;
      }
      bool2 = false;
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    a locala = getLayoutParamsa;
    if ((locala != null) && (locala.a(this, paramView, paramRect, paramBoolean))) {
      return true;
    }
    return super.requestChildRectangleOnScreen(paramView, paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    if ((paramBoolean) && (!n))
    {
      b();
      n = true;
    }
  }
  
  public void setFitsSystemWindows(boolean paramBoolean)
  {
    super.setFitsSystemWindows(paramBoolean);
    d();
  }
  
  public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener paramOnHierarchyChangeListener)
  {
    i = paramOnHierarchyChangeListener;
  }
  
  public void setStatusBarBackground(Drawable paramDrawable)
  {
    Drawable localDrawable = null;
    if (v != paramDrawable)
    {
      if (v != null) {
        v.setCallback(null);
      }
      if (paramDrawable != null) {
        localDrawable = paramDrawable.mutate();
      }
      v = localDrawable;
      if (v != null)
      {
        if (v.isStateful()) {
          v.setState(getDrawableState());
        }
        android.support.v4.d.a.a.b(v, w.g(this));
        paramDrawable = v;
        if (getVisibility() != 0) {
          break label114;
        }
      }
    }
    label114:
    for (boolean bool = true;; bool = false)
    {
      paramDrawable.setVisible(bool, false);
      v.setCallback(this);
      w.c(this);
      return;
    }
  }
  
  public void setStatusBarBackgroundColor(int paramInt)
  {
    setStatusBarBackground(new ColorDrawable(paramInt));
  }
  
  public void setStatusBarBackgroundResource(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = android.support.v4.c.a.a(getContext(), paramInt);; localDrawable = null)
    {
      setStatusBarBackground(localDrawable);
      return;
    }
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      if ((v != null) && (v.isVisible() != bool)) {
        v.setVisible(bool, false);
      }
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == v);
  }
  
  public static abstract class a<V extends View>
  {
    public a() {}
    
    public a(Context paramContext, AttributeSet paramAttributeSet) {}
    
    public void a(CoordinatorLayout.d paramd) {}
    
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, Parcelable paramParcelable) {}
    
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView) {}
    
    public void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt, int[] paramArrayOfInt) {}
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, float paramFloat, boolean paramBoolean)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, Rect paramRect, boolean paramBoolean)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, float paramFloat1, float paramFloat2)
    {
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt)
    {
      return false;
    }
    
    public boolean a(V paramV, Rect paramRect)
    {
      return false;
    }
    
    public boolean a_(View paramView)
    {
      return false;
    }
    
    public Parcelable b(CoordinatorLayout paramCoordinatorLayout, V paramV)
    {
      return View.BaseSavedState.EMPTY_STATE;
    }
    
    public void b(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt) {}
    
    public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
    {
      return false;
    }
    
    public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView)
    {
      return false;
    }
  }
  
  @Retention(RetentionPolicy.RUNTIME)
  public static @interface b
  {
    Class<? extends CoordinatorLayout.a> a();
  }
  
  private final class c
    implements ViewGroup.OnHierarchyChangeListener
  {
    c() {}
    
    public final void onChildViewAdded(View paramView1, View paramView2)
    {
      if (i != null) {
        i.onChildViewAdded(paramView1, paramView2);
      }
    }
    
    public final void onChildViewRemoved(View paramView1, View paramView2)
    {
      a(2);
      if (i != null) {
        i.onChildViewRemoved(paramView1, paramView2);
      }
    }
  }
  
  public static final class d
    extends ViewGroup.MarginLayoutParams
  {
    CoordinatorLayout.a a;
    boolean b = false;
    public int c = 0;
    public int d = 0;
    public int e = -1;
    int f = -1;
    public int g = 0;
    public int h = 0;
    int i;
    int j;
    View k;
    View l;
    boolean m;
    boolean n;
    boolean o;
    final Rect p = new Rect();
    Object q;
    
    public d()
    {
      super(-2);
    }
    
    d(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.CoordinatorLayout_Layout);
      c = localTypedArray.getInteger(a.i.CoordinatorLayout_Layout_android_layout_gravity, 0);
      f = localTypedArray.getResourceId(a.i.CoordinatorLayout_Layout_layout_anchor, -1);
      d = localTypedArray.getInteger(a.i.CoordinatorLayout_Layout_layout_anchorGravity, 0);
      e = localTypedArray.getInteger(a.i.CoordinatorLayout_Layout_layout_keyline, -1);
      g = localTypedArray.getInt(a.i.CoordinatorLayout_Layout_layout_insetEdge, 0);
      h = localTypedArray.getInt(a.i.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
      b = localTypedArray.hasValue(a.i.CoordinatorLayout_Layout_layout_behavior);
      if (b) {
        a = CoordinatorLayout.a(paramContext, paramAttributeSet, localTypedArray.getString(a.i.CoordinatorLayout_Layout_layout_behavior));
      }
      localTypedArray.recycle();
      if (a != null) {
        a.a(this);
      }
    }
    
    public d(d paramd)
    {
      super();
    }
    
    public d(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public d(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    public final void a(CoordinatorLayout.a parama)
    {
      if (a != parama)
      {
        a = parama;
        q = null;
        b = true;
        if (parama != null) {
          parama.a(this);
        }
      }
    }
  }
  
  final class e
    implements ViewTreeObserver.OnPreDrawListener
  {
    e() {}
    
    public final boolean onPreDraw()
    {
      a(0);
      return true;
    }
  }
  
  protected static final class f
    extends android.support.v4.h.a
  {
    public static final Parcelable.Creator<f> CREATOR = b.a(new c() {});
    SparseArray<Parcelable> a;
    
    public f(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      int j = paramParcel.readInt();
      int[] arrayOfInt = new int[j];
      paramParcel.readIntArray(arrayOfInt);
      paramParcel = paramParcel.readParcelableArray(paramClassLoader);
      a = new SparseArray(j);
      int i = 0;
      while (i < j)
      {
        a.append(arrayOfInt[i], paramParcel[i]);
        i += 1;
      }
    }
    
    public f(Parcelable paramParcelable)
    {
      super();
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      int j = 0;
      super.writeToParcel(paramParcel, paramInt);
      if (a != null) {}
      int[] arrayOfInt;
      Parcelable[] arrayOfParcelable;
      for (int i = a.size();; i = 0)
      {
        paramParcel.writeInt(i);
        arrayOfInt = new int[i];
        arrayOfParcelable = new Parcelable[i];
        while (j < i)
        {
          arrayOfInt[j] = a.keyAt(j);
          arrayOfParcelable[j] = ((Parcelable)a.valueAt(j));
          j += 1;
        }
      }
      paramParcel.writeIntArray(arrayOfInt);
      paramParcel.writeParcelableArray(arrayOfParcelable, paramInt);
    }
  }
  
  static final class g
    implements Comparator<View>
  {}
}


/* Location:              android/support/design/widget/CoordinatorLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */