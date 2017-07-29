package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.design.a.h;
import android.support.design.a.i;
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
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
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
  static final Class[] b;
  static final ThreadLocal c;
  static final Comparator d;
  private static final j.a j;
  final d e;
  final List f;
  al g;
  boolean h;
  ViewGroup.OnHierarchyChangeListener i;
  private final List k;
  private final List l;
  private final int[] m;
  private boolean n;
  private boolean o;
  private int[] p;
  private View q;
  private View r;
  private View s;
  private CoordinatorLayout.e t;
  private boolean u;
  private Drawable v;
  private s w;
  private final r x;
  
  static
  {
    Object localObject = CoordinatorLayout.class.getPackage();
    int i1;
    if (localObject != null)
    {
      localObject = ((Package)localObject).getName();
      a = (String)localObject;
      i1 = Build.VERSION.SDK_INT;
      int i2 = 21;
      if (i1 < i2) {
        break label94;
      }
      localObject = new android/support/design/widget/CoordinatorLayout$g;
      ((CoordinatorLayout.g)localObject).<init>();
    }
    label94:
    for (d = (Comparator)localObject;; d = null)
    {
      localObject = new Class[2];
      localObject[0] = Context.class;
      localObject[1] = AttributeSet.class;
      b = (Class[])localObject;
      localObject = new java/lang/ThreadLocal;
      ((ThreadLocal)localObject).<init>();
      c = (ThreadLocal)localObject;
      localObject = new android/support/v4/g/j$c;
      ((j.c)localObject).<init>();
      j = (j.a)localObject;
      return;
      i1 = 0;
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
    Object localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    k = ((List)localObject2);
    localObject2 = new android/support/design/widget/d;
    ((d)localObject2).<init>();
    e = ((d)localObject2);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    l = ((List)localObject2);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    f = ((List)localObject2);
    int i2 = 2;
    localObject2 = new int[i2];
    m = ((int[])localObject2);
    localObject2 = new android/support/v4/h/r;
    ((r)localObject2).<init>(this);
    x = ((r)localObject2);
    p.a(paramContext);
    localObject2 = a.i.CoordinatorLayout;
    int i3 = a.h.Widget_Design_CoordinatorLayout;
    localObject2 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject2, paramInt, i3);
    i3 = a.i.CoordinatorLayout_keylines;
    i3 = ((TypedArray)localObject2).getResourceId(i3, 0);
    if (i3 != 0)
    {
      Object localObject3 = paramContext.getResources();
      Object localObject4 = ((Resources)localObject3).getIntArray(i3);
      p = ((int[])localObject4);
      localObject4 = ((Resources)localObject3).getDisplayMetrics();
      float f1 = density;
      localObject3 = p;
      int i4 = localObject3.length;
      while (i1 < i4)
      {
        int[] arrayOfInt = p;
        float f2 = arrayOfInt[i1] * f1;
        int i5 = (int)f2;
        arrayOfInt[i1] = i5;
        i1 += 1;
      }
    }
    i1 = a.i.CoordinatorLayout_statusBarBackground;
    localObject1 = ((TypedArray)localObject2).getDrawable(i1);
    v = ((Drawable)localObject1);
    ((TypedArray)localObject2).recycle();
    d();
    localObject1 = new android/support/design/widget/CoordinatorLayout$c;
    ((CoordinatorLayout.c)localObject1).<init>(this);
    super.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener)localObject1);
  }
  
  private static Rect a()
  {
    Rect localRect = (Rect)j.a();
    if (localRect == null)
    {
      localRect = new android/graphics/Rect;
      localRect.<init>();
    }
    return localRect;
  }
  
  static CoordinatorLayout.a a(Context paramContext, AttributeSet paramAttributeSet, String paramString)
  {
    int i1 = 46;
    boolean bool1 = TextUtils.isEmpty(paramString);
    if (bool1)
    {
      bool1 = false;
      localObject1 = null;
      return (CoordinatorLayout.a)localObject1;
    }
    Object localObject1 = ".";
    bool1 = paramString.startsWith((String)localObject1);
    Object localObject2;
    if (bool1)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = paramContext.getPackageName();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(paramString);
      paramString = ((StringBuilder)localObject1).toString();
    }
    for (;;)
    {
      try
      {
        localObject1 = c;
        localObject1 = ((ThreadLocal)localObject1).get();
        localObject1 = (Map)localObject1;
        if (localObject1 != null) {
          break label358;
        }
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>();
        localObject2 = c;
        ((ThreadLocal)localObject2).set(localObject1);
        localObject2 = localObject1;
        localObject1 = ((Map)localObject2).get(paramString);
        localObject1 = (Constructor)localObject1;
        if (localObject1 == null)
        {
          bool1 = true;
          localObject3 = paramContext.getClassLoader();
          localObject1 = Class.forName(paramString, bool1, (ClassLoader)localObject3);
          localObject3 = b;
          localObject1 = ((Class)localObject1).getConstructor((Class[])localObject3);
          i1 = 1;
          ((Constructor)localObject1).setAccessible(i1);
          ((Map)localObject2).put(paramString, localObject1);
        }
        int i3 = 2;
        localObject2 = new Object[i3];
        c1 = '\000';
        localObject3 = null;
        localObject2[0] = paramContext;
        c1 = '\001';
        localObject2[c1] = paramAttributeSet;
        localObject1 = ((Constructor)localObject1).newInstance((Object[])localObject2);
        localObject1 = (CoordinatorLayout.a)localObject1;
      }
      catch (Exception localException)
      {
        char c1;
        int i2;
        boolean bool2;
        localObject2 = new java/lang/RuntimeException;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("Could not inflate Behavior subclass ");
        localObject3 = paramString;
        ((RuntimeException)localObject2).<init>((String)localObject3, localException);
        throw ((Throwable)localObject2);
      }
      i2 = paramString.indexOf(c1);
      if (i2 < 0)
      {
        localObject1 = a;
        bool2 = TextUtils.isEmpty((CharSequence)localObject1);
        if (!bool2)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = a;
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(c1).append(paramString);
          paramString = ((StringBuilder)localObject1).toString();
          continue;
          label358:
          localObject2 = localException;
        }
      }
    }
  }
  
  private static void a(int paramInt1, Rect paramRect1, Rect paramRect2, CoordinatorLayout.d paramd, int paramInt2, int paramInt3)
  {
    int i1 = c;
    if (i1 == 0) {
      i1 = 17;
    }
    i1 = f.a(i1, paramInt1);
    int i2 = f.a(c(d), paramInt1);
    int i3 = i1 & 0x7;
    int i4 = i1 & 0x70;
    i1 = i2 & 0x7;
    int i5 = i2 & 0x70;
    switch (i1)
    {
    default: 
      i2 = left;
      switch (i5)
      {
      default: 
        i1 = top;
        switch (i3)
        {
        default: 
          i2 -= paramInt2;
        case 5: 
          label134:
          switch (i4)
          {
          default: 
            label171:
            i1 -= paramInt3;
          }
          break;
        }
        break;
      }
      break;
    }
    for (;;)
    {
      i3 = i2 + paramInt2;
      i4 = i1 + paramInt3;
      paramRect2.set(i2, i1, i3, i4);
      return;
      i2 = right;
      break;
      i1 = left;
      i2 = paramRect1.width() / 2 + i1;
      break;
      i1 = bottom;
      break label134;
      i1 = top;
      i5 = paramRect1.height() / 2;
      i1 += i5;
      break label134;
      i3 = paramInt2 / 2;
      i2 -= i3;
      break label171;
      i3 = paramInt3 / 2;
      i1 -= i3;
    }
  }
  
  private static void a(Rect paramRect)
  {
    paramRect.setEmpty();
    j.a(paramRect);
  }
  
  private void a(CoordinatorLayout.d paramd, Rect paramRect, int paramInt1, int paramInt2)
  {
    int i1 = getWidth();
    int i2 = getHeight();
    int i3 = getPaddingLeft();
    int i4 = leftMargin;
    i3 += i4;
    i4 = left;
    int i5 = getPaddingRight();
    i1 = i1 - i5 - paramInt1;
    i5 = rightMargin;
    i1 -= i5;
    i1 = Math.min(i4, i1);
    i1 = Math.max(i3, i1);
    i3 = getPaddingTop();
    i4 = topMargin;
    i3 += i4;
    i4 = top;
    i5 = getPaddingBottom();
    i2 = i2 - i5 - paramInt2;
    i5 = bottomMargin;
    i2 -= i5;
    i2 = Math.min(i4, i2);
    i2 = Math.max(i3, i2);
    i3 = i1 + paramInt1;
    i4 = i2 + paramInt2;
    paramRect.set(i1, i2, i3, i4);
  }
  
  private void a(View paramView, boolean paramBoolean, Rect paramRect)
  {
    boolean bool = paramView.isLayoutRequested();
    int i1;
    int i2;
    if (!bool)
    {
      i1 = paramView.getVisibility();
      i2 = 8;
      if (i1 != i2) {}
    }
    else
    {
      paramRect.setEmpty();
    }
    for (;;)
    {
      return;
      if (paramBoolean)
      {
        t.a(this, paramView, paramRect);
      }
      else
      {
        i1 = paramView.getLeft();
        i2 = paramView.getTop();
        int i3 = paramView.getRight();
        int i4 = paramView.getBottom();
        paramRect.set(i1, i2, i3, i4);
      }
    }
  }
  
  private boolean a(MotionEvent paramMotionEvent, int paramInt)
  {
    boolean bool1 = false;
    int i1 = 0;
    float f1 = 0.0F;
    boolean bool2 = false;
    int i2 = n.a(paramMotionEvent);
    Object localObject1 = this;
    localObject1 = l;
    Object localObject2 = localObject1;
    ((List)localObject1).clear();
    boolean bool3 = isChildrenDrawingOrderEnabled();
    int i4 = getChildCount();
    int i5 = i4 + -1;
    if (i5 >= 0)
    {
      if (bool3) {
        localObject1 = this;
      }
      for (i6 = getChildDrawingOrder(i4, i5);; i6 = i5)
      {
        localObject1 = this;
        localObject3 = getChildAt(i6);
        localObject1 = localObject2;
        ((List)localObject2).add(localObject3);
        i5 += -1;
        break;
      }
    }
    Object localObject3 = d;
    if (localObject3 != null)
    {
      localObject3 = d;
      localObject1 = localObject2;
      Collections.sort((List)localObject2, (Comparator)localObject3);
    }
    int i7 = ((List)localObject2).size();
    int i6 = 0;
    float f2 = 0.0F;
    localObject3 = null;
    int i8 = 0;
    i5 = 0;
    Object localObject4 = null;
    float f3 = 0.0F;
    Object localObject5;
    Object localObject6;
    if (i8 < i7)
    {
      localObject1 = localObject2;
      localObject3 = ((List)localObject2).get(i8);
      localObject5 = localObject3;
      localObject5 = (View)localObject3;
      localObject3 = (CoordinatorLayout.d)((View)localObject5).getLayoutParams();
      localObject1 = a;
      localObject6 = localObject1;
      if (((bool1) || (i1 != 0)) && (i2 != 0))
      {
        if (localObject6 == null) {
          break label617;
        }
        if (localObject4 != null) {
          break label610;
        }
        long l1 = SystemClock.uptimeMillis();
        i4 = 3;
        localObject3 = MotionEvent.obtain(l1, l1, i4, 0.0F, 0.0F, 0);
        switch (paramInt)
        {
        default: 
          label275:
          label300:
          i5 = i1;
          f3 = f1;
          bool2 = bool1;
        }
      }
    }
    for (;;)
    {
      int i3 = i8 + 1;
      i8 = i3;
      i1 = i5;
      f1 = f3;
      bool1 = bool2;
      localObject4 = localObject3;
      break;
      localObject1 = localObject6;
      ((CoordinatorLayout.a)localObject6).a(this, (View)localObject5, (MotionEvent)localObject3);
      i5 = i1;
      f3 = f1;
      bool2 = bool1;
      continue;
      localObject1 = localObject6;
      ((CoordinatorLayout.a)localObject6).b(this, (View)localObject5, (MotionEvent)localObject3);
      break label300;
      if ((!bool1) && (localObject6 != null)) {}
      label420:
      boolean bool4;
      switch (paramInt)
      {
      default: 
        if (bool1)
        {
          localObject1 = this;
          q = ((View)localObject5);
        }
        bool2 = bool1;
        CoordinatorLayout.a locala = a;
        if (locala == null)
        {
          i3 = 0;
          locala = null;
          m = false;
        }
        boolean bool5 = m;
        bool4 = m;
        if (bool4)
        {
          i6 = 1;
          f2 = Float.MIN_VALUE;
          bool4 = i6;
          label490:
          if ((!bool4) || (bool5)) {
            break label585;
          }
          i6 = 1;
          f2 = Float.MIN_VALUE;
        }
        break;
      }
      for (;;)
      {
        if ((!bool4) || (i6 != 0))
        {
          i5 = i6;
          f3 = f2;
          localObject3 = localObject4;
          break;
          localObject1 = localObject6;
          bool1 = ((CoordinatorLayout.a)localObject6).a(this, (View)localObject5, paramMotionEvent);
          break label420;
          localObject1 = localObject6;
          bool1 = ((CoordinatorLayout.a)localObject6).b(this, (View)localObject5, paramMotionEvent);
          break label420;
          bool4 = m | false;
          m = bool4;
          break label490;
          label585:
          i6 = 0;
          f2 = 0.0F;
          localObject3 = null;
          continue;
          bool2 = bool1;
        }
      }
      ((List)localObject2).clear();
      return bool2;
      label610:
      localObject3 = localObject4;
      break label275;
      label617:
      localObject3 = localObject4;
      bool2 = bool1;
      i5 = i1;
      f3 = f1;
    }
  }
  
  private int b(int paramInt)
  {
    int i1 = 0;
    int[] arrayOfInt = null;
    Object localObject1 = p;
    Object localObject2;
    String str;
    if (localObject1 == null)
    {
      localObject1 = "CoordinatorLayout";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("No keylines defined for ");
      localObject2 = ((StringBuilder)localObject2).append(this);
      str = " - attempted index lookup ";
      localObject2 = str + paramInt;
      Log.e((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return i1;
      if (paramInt >= 0)
      {
        localObject1 = p;
        int i2 = localObject1.length;
        if (paramInt < i2) {}
      }
      else
      {
        localObject1 = "CoordinatorLayout";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("Keyline index ");
        localObject2 = ((StringBuilder)localObject2).append(paramInt);
        str = " out of range for ";
        localObject2 = str + this;
        Log.e((String)localObject1, (String)localObject2);
        continue;
      }
      arrayOfInt = p;
      i1 = arrayOfInt[paramInt];
    }
  }
  
  private static CoordinatorLayout.d b(View paramView)
  {
    CoordinatorLayout.d locald = (CoordinatorLayout.d)paramView.getLayoutParams();
    boolean bool = b;
    Object localObject2;
    if (!bool)
    {
      localObject1 = paramView.getClass();
      bool = false;
      localObject2 = null;
      while (localObject1 != null)
      {
        localObject2 = (CoordinatorLayout.b)((Class)localObject1).getAnnotation(CoordinatorLayout.b.class);
        if (localObject2 != null) {
          break;
        }
        localObject1 = ((Class)localObject1).getSuperclass();
      }
      localObject1 = localObject2;
      if (localObject2 == null) {}
    }
    try
    {
      localObject2 = ((CoordinatorLayout.b)localObject2).a();
      localObject2 = ((Class)localObject2).newInstance();
      localObject2 = (CoordinatorLayout.a)localObject2;
      locald.a((CoordinatorLayout.a)localObject2);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str1 = "CoordinatorLayout";
        Object localObject3 = new java/lang/StringBuilder;
        String str2 = "Default behavior class ";
        ((StringBuilder)localObject3).<init>(str2);
        localObject1 = ((CoordinatorLayout.b)localObject1).a().getName();
        localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
        localObject3 = " could not be instantiated. Did you forget a default constructor?";
        localObject1 = (String)localObject3;
        Log.e(str1, (String)localObject1, localException);
      }
    }
    bool = true;
    b = bool;
    return locald;
  }
  
  private void b()
  {
    Object localObject = q;
    int i2;
    if (localObject != null)
    {
      localObject = (CoordinatorLayout.d)q.getLayoutParams();
      CoordinatorLayout.a locala = a;
      if (locala != null)
      {
        long l1 = SystemClock.uptimeMillis();
        int i1 = 3;
        localObject = MotionEvent.obtain(l1, l1, i1, 0.0F, 0.0F, 0);
        localView = q;
        locala.b(this, localView, (MotionEvent)localObject);
        ((MotionEvent)localObject).recycle();
      }
      i2 = 0;
      localObject = null;
      q = null;
    }
    int i3 = getChildCount();
    int i4 = 0;
    View localView = null;
    while (i4 < i3)
    {
      localObject = (CoordinatorLayout.d)getChildAt(i4).getLayoutParams();
      m = false;
      i2 = i4 + 1;
      i4 = i2;
    }
    n = false;
  }
  
  private static void b(View paramView, int paramInt)
  {
    CoordinatorLayout.d locald = (CoordinatorLayout.d)paramView.getLayoutParams();
    int i1 = i;
    if (i1 != paramInt)
    {
      i1 = i;
      i1 = paramInt - i1;
      w.f(paramView, i1);
      i = paramInt;
    }
  }
  
  private static int c(int paramInt)
  {
    int i1 = paramInt & 0x7;
    if (i1 == 0) {}
    for (i1 = 0x800003 | paramInt;; i1 = paramInt)
    {
      int i2 = i1 & 0x70;
      if (i2 == 0) {
        i1 |= 0x30;
      }
      return i1;
    }
  }
  
  private void c()
  {
    int i1 = 1;
    int i2 = 0;
    k.clear();
    Object localObject1 = e;
    Object localObject2 = b;
    int i3 = ((k)localObject2).size();
    int i4 = 0;
    Object localObject3 = null;
    Object localObject4;
    int i5;
    while (i4 < i3)
    {
      localObject2 = (ArrayList)b.c(i4);
      if (localObject2 != null)
      {
        ((ArrayList)localObject2).clear();
        localObject4 = a;
        ((j.a)localObject4).a(localObject2);
      }
      i5 = i4 + 1;
      i4 = i5;
    }
    localObject2 = b;
    ((k)localObject2).clear();
    i3 = getChildCount();
    int i8 = 0;
    localObject1 = null;
    while (i8 < i3)
    {
      localObject4 = getChildAt(i8);
      Object localObject5 = b((View)localObject4);
      i5 = f;
      i4 = -1;
      if (i5 == i4)
      {
        l = null;
        k = null;
        localObject2 = e;
        ((d)localObject2).a(localObject4);
        i4 = 0;
        localObject3 = null;
      }
      for (;;)
      {
        if (i4 >= i3) {
          break label1011;
        }
        if (i4 != i8)
        {
          localObject5 = getChildAt(i4);
          Object localObject6 = b((View)localObject5);
          localObject2 = l;
          if (localObject4 != localObject2)
          {
            int i9 = w.g(this);
            localObject2 = (CoordinatorLayout.d)((View)localObject4).getLayoutParams();
            i5 = f.a(g, i9);
            if (i5 == 0) {
              break label905;
            }
            int i10 = h;
            i9 = f.a(i10, i9) & i5;
            if (i9 != i5) {
              break label905;
            }
            i5 = i1;
            label294:
            if (i5 == 0)
            {
              localObject2 = a;
              if (localObject2 == null) {
                break label914;
              }
              localObject2 = a;
              bool1 = ((CoordinatorLayout.a)localObject2).a_((View)localObject4);
              if (!bool1) {
                break label914;
              }
            }
          }
          boolean bool1 = i1;
          for (;;)
          {
            if (bool1)
            {
              localObject2 = e.b;
              bool1 = ((k)localObject2).containsKey(localObject5);
              if (!bool1)
              {
                localObject2 = e;
                ((d)localObject2).a(localObject5);
              }
              localObject6 = e;
              localObject2 = b;
              bool1 = ((k)localObject2).containsKey(localObject4);
              if (bool1)
              {
                localObject2 = b;
                bool1 = ((k)localObject2).containsKey(localObject5);
                if (bool1) {}
              }
              else
              {
                localObject2 = new java/lang/IllegalArgumentException;
                ((IllegalArgumentException)localObject2).<init>("All nodes must be present in the graph before being added as an edge");
                throw ((Throwable)localObject2);
                localObject2 = k;
                int i6;
                if (localObject2 != null)
                {
                  localObject2 = k;
                  i6 = ((View)localObject2).getId();
                  i4 = f;
                  if (i6 == i4) {
                    break label564;
                  }
                  i6 = 0;
                  localObject2 = null;
                }
                label564:
                boolean bool3;
                for (;;)
                {
                  if (i6 != 0) {
                    break label669;
                  }
                  i6 = f;
                  localObject2 = findViewById(i6);
                  k = ((View)localObject2);
                  localObject2 = k;
                  if (localObject2 == null) {
                    break label812;
                  }
                  localObject2 = k;
                  if (localObject2 != this) {
                    break label687;
                  }
                  bool2 = isInEditMode();
                  if (!bool2) {
                    break label671;
                  }
                  l = null;
                  k = null;
                  break;
                  localObject2 = k;
                  for (localObject3 = k.getParent();; localObject3 = ((ViewParent)localObject3).getParent())
                  {
                    if (localObject3 == this) {
                      break label658;
                    }
                    if ((localObject3 == null) || (localObject3 == localObject4))
                    {
                      l = null;
                      k = null;
                      bool2 = false;
                      localObject2 = null;
                      break;
                    }
                    bool3 = localObject3 instanceof View;
                    if (bool3)
                    {
                      localObject2 = localObject3;
                      localObject2 = (View)localObject3;
                    }
                  }
                  label658:
                  l = ((View)localObject2);
                  bool2 = i1;
                }
                label669:
                break;
                label671:
                localObject2 = new java/lang/IllegalStateException;
                ((IllegalStateException)localObject2).<init>("View can not be anchored to the the parent CoordinatorLayout");
                throw ((Throwable)localObject2);
                label687:
                localObject2 = k;
                for (localObject3 = k.getParent();; localObject3 = ((ViewParent)localObject3).getParent())
                {
                  if ((localObject3 == this) || (localObject3 == null)) {
                    break label802;
                  }
                  if (localObject3 == localObject4)
                  {
                    bool2 = isInEditMode();
                    if (bool2)
                    {
                      l = null;
                      k = null;
                      break;
                    }
                    localObject2 = new java/lang/IllegalStateException;
                    ((IllegalStateException)localObject2).<init>("Anchor must not be a descendant of the anchored view");
                    throw ((Throwable)localObject2);
                  }
                  bool3 = localObject3 instanceof View;
                  if (bool3)
                  {
                    localObject2 = localObject3;
                    localObject2 = (View)localObject3;
                  }
                }
                label802:
                l = ((View)localObject2);
                break;
                label812:
                boolean bool2 = isInEditMode();
                if (bool2)
                {
                  l = null;
                  k = null;
                  break;
                }
                localObject2 = new java/lang/IllegalStateException;
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>("Could not find CoordinatorLayout descendant view with id ");
                localObject1 = getResources();
                i2 = f;
                localObject1 = ((Resources)localObject1).getResourceName(i2);
                localObject3 = (String)localObject1 + " to anchor view " + localObject4;
                ((IllegalStateException)localObject2).<init>((String)localObject3);
                throw ((Throwable)localObject2);
                label905:
                bool2 = false;
                localObject2 = null;
                break label294;
                label914:
                bool2 = false;
                localObject2 = null;
                continue;
              }
              localObject2 = (ArrayList)b.get(localObject4);
              if (localObject2 == null)
              {
                localObject2 = (ArrayList)a.a();
                if (localObject2 == null)
                {
                  localObject2 = new java/util/ArrayList;
                  ((ArrayList)localObject2).<init>();
                }
                localObject6 = b;
                ((k)localObject6).put(localObject4, localObject2);
              }
              ((ArrayList)localObject2).add(localObject5);
            }
          }
        }
        i7 = i4 + 1;
        i4 = i7;
      }
      label1011:
      int i7 = i8 + 1;
      i8 = i7;
    }
    localObject2 = k;
    localObject3 = e.a();
    ((List)localObject2).addAll((Collection)localObject3);
    Collections.reverse(k);
  }
  
  private static void c(View paramView, int paramInt)
  {
    CoordinatorLayout.d locald = (CoordinatorLayout.d)paramView.getLayoutParams();
    int i1 = j;
    if (i1 != paramInt)
    {
      i1 = j;
      i1 = paramInt - i1;
      w.e(paramView, i1);
      j = paramInt;
    }
  }
  
  private static int d(int paramInt)
  {
    if (paramInt == 0) {
      paramInt = 8388661;
    }
    return paramInt;
  }
  
  private void d()
  {
    int i1 = Build.VERSION.SDK_INT;
    int i3 = 21;
    if (i1 < i3) {}
    for (;;)
    {
      return;
      boolean bool = w.x(this);
      Object localObject;
      int i2;
      if (bool)
      {
        localObject = w;
        if (localObject == null)
        {
          localObject = new android/support/design/widget/CoordinatorLayout$1;
          ((CoordinatorLayout.1)localObject).<init>(this);
          w = ((s)localObject);
        }
        localObject = w;
        w.a(this, (s)localObject);
        i2 = 1280;
        setSystemUiVisibility(i2);
      }
      else
      {
        i2 = 0;
        localObject = null;
        w.a(this, null);
      }
    }
  }
  
  public final List a(View paramView)
  {
    d locald = e;
    Object localObject1 = null;
    boolean bool = false;
    Object localObject2 = null;
    int i2 = b.size();
    int i3 = 0;
    if (i3 < i2)
    {
      localObject2 = (ArrayList)b.c(i3);
      if (localObject2 != null)
      {
        bool = ((ArrayList)localObject2).contains(paramView);
        if (bool)
        {
          if (localObject1 != null) {
            break label148;
          }
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
        }
      }
    }
    for (;;)
    {
      localObject1 = b.b(i3);
      ((ArrayList)localObject2).add(localObject1);
      localObject1 = localObject2;
      int i1 = i3 + 1;
      i3 = i1;
      break;
      localObject2 = f;
      ((List)localObject2).clear();
      if (localObject1 != null)
      {
        localObject2 = f;
        ((List)localObject2).addAll((Collection)localObject1);
      }
      return f;
      label148:
      localObject2 = localObject1;
    }
  }
  
  final void a(int paramInt)
  {
    int i1 = w.g(this);
    int i2 = k.size();
    Rect localRect1 = a();
    Rect localRect2 = a();
    Rect localRect3 = a();
    int i3 = 0;
    Object localObject1 = null;
    int i8 = 0;
    Object localObject2;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    int i12;
    int i16;
    label433:
    label616:
    label949:
    label1128:
    int i10;
    if (i8 < i2)
    {
      localObject1 = k.get(i8);
      localObject2 = localObject1;
      localObject2 = (View)localObject1;
      localObject1 = ((View)localObject2).getLayoutParams();
      Object localObject3 = localObject1;
      localObject3 = (CoordinatorLayout.d)localObject1;
      int i9;
      if (paramInt == 0)
      {
        i3 = ((View)localObject2).getVisibility();
        i9 = 8;
        if (i3 == i9) {}
      }
      else
      {
        i3 = 0;
        localObject1 = null;
        int i11 = 0;
        if (i11 < i8)
        {
          localObject1 = (View)k.get(i11);
          localObject4 = l;
          Rect localRect4;
          int i13;
          if (localObject4 == localObject1)
          {
            localObject5 = (CoordinatorLayout.d)((View)localObject2).getLayoutParams();
            localObject1 = k;
            if (localObject1 != null)
            {
              localObject1 = a();
              localRect4 = a();
              localObject4 = a();
              localObject6 = k;
              t.a(this, (View)localObject6, (Rect)localObject1);
              localObject6 = null;
              a((View)localObject2, false, localRect4);
              i12 = ((View)localObject2).getMeasuredWidth();
              i13 = ((View)localObject2).getMeasuredHeight();
              a(i1, (Rect)localObject1, (Rect)localObject4, (CoordinatorLayout.d)localObject5, i12, i13);
              i15 = left;
              i16 = left;
              if (i15 == i16)
              {
                i15 = top;
                i16 = top;
                if (i15 == i16) {
                  break label433;
                }
              }
            }
          }
          for (i15 = 1;; i15 = 0)
          {
            a((CoordinatorLayout.d)localObject5, (Rect)localObject4, i12, i13);
            i12 = left;
            i13 = left;
            i12 -= i13;
            i13 = top;
            i16 = top;
            i13 -= i16;
            if (i12 != 0) {
              w.f((View)localObject2, i12);
            }
            if (i13 != 0) {
              w.e((View)localObject2, i13);
            }
            if (i15 != 0)
            {
              localObject6 = a;
              if (localObject6 != null)
              {
                localObject5 = k;
                ((CoordinatorLayout.a)localObject6).b(this, (View)localObject2, (View)localObject5);
              }
            }
            a((Rect)localObject1);
            a(localRect4);
            a((Rect)localObject4);
            i3 = i11 + 1;
            i11 = i3;
            break;
          }
        }
        a((View)localObject2, true, localRect2);
        i3 = g;
        int i4;
        if (i3 != 0)
        {
          boolean bool1 = localRect2.isEmpty();
          if (!bool1)
          {
            i4 = f.a(g, i1);
            i9 = i4 & 0x70;
            switch (i9)
            {
            default: 
              i4 &= 0x7;
              switch (i4)
              {
              }
              break;
            }
          }
        }
        for (;;)
        {
          i4 = h;
          if (i4 != 0)
          {
            i4 = ((View)localObject2).getVisibility();
            if (i4 == 0)
            {
              boolean bool2 = w.F((View)localObject2);
              if (bool2)
              {
                i5 = ((View)localObject2).getWidth();
                if (i5 > 0)
                {
                  i5 = ((View)localObject2).getHeight();
                  if (i5 > 0) {
                    break label949;
                  }
                }
              }
            }
          }
          int i5 = 2;
          i16 = paramInt;
          if (paramInt != i5)
          {
            localObject1 = getLayoutParamsp;
            localRect3.set((Rect)localObject1);
            boolean bool3 = localRect3.equals(localRect2);
            if (bool3) {
              break label1644;
            }
            localObject1 = getLayoutParamsp;
            ((Rect)localObject1).set(localRect2);
          }
          i6 = i8 + 1;
          for (int i17 = i6;; i17 = i6)
          {
            if (i17 >= i2) {
              break label1644;
            }
            localObject1 = (View)k.get(i17);
            localObject4 = (CoordinatorLayout.d)((View)localObject1).getLayoutParams();
            localObject6 = a;
            if (localObject6 != null)
            {
              boolean bool6 = ((CoordinatorLayout.a)localObject6).a_((View)localObject2);
              if (bool6)
              {
                if (paramInt != 0) {
                  break;
                }
                bool6 = o;
                if (!bool6) {
                  break;
                }
                i6 = 0;
                localObject1 = null;
                o = false;
              }
            }
            i6 = i17 + 1;
          }
          i9 = top;
          i17 = bottom;
          i9 = Math.max(i9, i17);
          top = i9;
          break;
          i9 = bottom;
          i17 = getHeight();
          i12 = top;
          i17 -= i12;
          i9 = Math.max(i9, i17);
          bottom = i9;
          break;
          i6 = left;
          i9 = right;
          i6 = Math.max(i6, i9);
          left = i6;
          continue;
          i6 = right;
          i9 = getWidth();
          i17 = left;
          i9 -= i17;
          i6 = Math.max(i6, i9);
          right = i6;
        }
        localObject1 = (CoordinatorLayout.d)((View)localObject2).getLayoutParams();
        localObject4 = a;
        localObject5 = a();
        localObject6 = a();
        int i14 = ((View)localObject2).getLeft();
        int i18 = ((View)localObject2).getTop();
        int i15 = ((View)localObject2).getRight();
        i11 = ((View)localObject2).getBottom();
        ((Rect)localObject6).set(i14, i18, i15, i11);
        if (localObject4 != null)
        {
          bool5 = ((CoordinatorLayout.a)localObject4).a((View)localObject2, (Rect)localObject5);
          if (bool5)
          {
            bool5 = ((Rect)localObject6).contains((Rect)localObject5);
            if (bool5) {
              break label1128;
            }
            IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("Rect should be within the child's bounds. Rect:");
            localObject4 = ((Rect)localObject5).toShortString();
            localObject1 = ((StringBuilder)localObject1).append((String)localObject4).append(" | Bounds:");
            localObject4 = ((Rect)localObject6).toShortString();
            localObject1 = (String)localObject4;
            localIllegalArgumentException.<init>((String)localObject1);
            throw localIllegalArgumentException;
          }
        }
        ((Rect)localObject5).set((Rect)localObject6);
        a((Rect)localObject6);
        boolean bool5 = ((Rect)localObject5).isEmpty();
        if (!bool5)
        {
          i12 = f.a(h, i1);
          bool5 = false;
          localObject4 = null;
          i14 = i12 & 0x30;
          i18 = 48;
          if (i14 == i18)
          {
            i14 = top;
            i18 = topMargin;
            i14 -= i18;
            i18 = j;
            i14 -= i18;
            i18 = top;
            if (i14 < i18)
            {
              i10 = top - i14;
              c((View)localObject2, i10);
              i10 = 1;
            }
          }
          i14 = i12 & 0x50;
          i18 = 80;
          if (i14 == i18)
          {
            i14 = getHeight();
            i18 = bottom;
            i14 -= i18;
            i18 = bottomMargin;
            i14 -= i18;
            i18 = j;
            i14 += i18;
            i18 = bottom;
            if (i14 < i18)
            {
              i10 = bottom;
              i10 = i14 - i10;
              c((View)localObject2, i10);
              i10 = 1;
            }
          }
          if (i10 == 0)
          {
            i10 = 0;
            localObject4 = null;
            c((View)localObject2, 0);
          }
          i10 = 0;
          localObject4 = null;
          i14 = i12 & 0x3;
          i18 = 3;
          if (i14 == i18)
          {
            i14 = left;
            i18 = leftMargin;
            i14 -= i18;
            i18 = i;
            i14 -= i18;
            i18 = left;
            if (i14 < i18)
            {
              i10 = left - i14;
              b((View)localObject2, i10);
              i10 = 1;
            }
          }
          i12 &= 0x5;
          i14 = 5;
          if (i12 != i14) {
            break label1673;
          }
          i12 = getWidth();
          i14 = right;
          i12 -= i14;
          i14 = rightMargin;
          i12 -= i14;
          i6 = i + i12;
          i12 = right;
          if (i6 >= i12) {
            break label1673;
          }
          i10 = right;
          i6 -= i10;
          b((View)localObject2, i6);
        }
      }
    }
    label1644:
    int i7;
    label1673:
    for (int i6 = 1;; i7 = i10)
    {
      if (i6 == 0)
      {
        i6 = 0;
        localObject1 = null;
        b((View)localObject2, 0);
      }
      a((Rect)localObject5);
      break label616;
      switch (paramInt)
      {
      }
      for (boolean bool4 = ((CoordinatorLayout.a)localObject6).b(this, (View)localObject1, (View)localObject2);; bool4 = true)
      {
        i12 = 1;
        i16 = paramInt;
        if (paramInt != i12) {
          break;
        }
        o = bool4;
        break;
      }
      i7 = i8 + 1;
      i8 = i7;
      break;
      a(localRect1);
      a(localRect2);
      a(localRect3);
      return;
    }
  }
  
  public final void a(View paramView, int paramInt)
  {
    int i1 = 1;
    int i2 = 0;
    Object localObject1 = null;
    Object localObject2 = (CoordinatorLayout.d)paramView.getLayoutParams();
    Object localObject4 = k;
    int i3;
    int i5;
    if (localObject4 == null)
    {
      i3 = f;
      i5 = -1;
      if (i3 != i5) {
        i3 = i1;
      }
    }
    while (i3 != 0)
    {
      localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
      throw ((Throwable)localObject2);
      i3 = 0;
      localObject4 = null;
    }
    localObject4 = k;
    if (localObject4 != null)
    {
      localObject2 = k;
      paramView.getLayoutParams();
      localObject4 = a();
      localObject1 = a();
    }
    for (;;)
    {
      try
      {
        t.a(this, (View)localObject2, (Rect)localObject4);
        localObject5 = paramView.getLayoutParams();
        localObject5 = (CoordinatorLayout.d)localObject5;
        i5 = paramView.getMeasuredWidth();
        i6 = paramView.getMeasuredHeight();
        i7 = paramInt;
        a(paramInt, (Rect)localObject4, (Rect)localObject1, (CoordinatorLayout.d)localObject5, i5, i6);
        a((CoordinatorLayout.d)localObject5, (Rect)localObject1, i5, i6);
        i7 = left;
        i1 = top;
        i5 = right;
        i6 = bottom;
        paramView.layout(i7, i1, i5, i6);
        return;
      }
      finally
      {
        a((Rect)localObject4);
        a((Rect)localObject1);
      }
      i3 = e;
      if (i3 >= 0)
      {
        i3 = e;
        locald = (CoordinatorLayout.d)paramView.getLayoutParams();
        i5 = f.a(d(c), paramInt);
        i6 = i5 & 0x7;
        i5 &= 0x70;
        i8 = getWidth();
        int i9 = getHeight();
        int i10 = paramView.getMeasuredWidth();
        int i11 = paramView.getMeasuredHeight();
        if (paramInt == i1) {
          i3 = i8 - i3;
        }
        i3 = b(i3) - i10;
        switch (i6)
        {
        default: 
          i1 = i3;
          switch (i5)
          {
          default: 
            label375:
            i3 = 0;
            localObject4 = null;
          }
          break;
        }
        for (;;)
        {
          i2 = getPaddingLeft();
          i5 = leftMargin;
          i2 += i5;
          i5 = getPaddingRight();
          i5 = i8 - i5 - i10;
          i6 = rightMargin;
          i5 -= i6;
          i1 = Math.min(i1, i5);
          i2 = Math.max(i2, i1);
          i1 = getPaddingTop();
          i5 = topMargin;
          i1 += i5;
          i5 = getPaddingBottom();
          i5 = i9 - i5 - i11;
          i7 = bottomMargin;
          i7 = i5 - i7;
          i7 = Math.min(i3, i7);
          i7 = Math.max(i1, i7);
          i3 = i2 + i10;
          i1 = i7 + i11;
          paramView.layout(i2, i7, i3, i1);
          break;
          i3 += i10;
          i1 = i3;
          break label375;
          i1 = i10 / 2;
          i3 += i1;
          i1 = i3;
          break label375;
          i3 = i11 + 0;
          continue;
          i3 = i11 / 2 + 0;
        }
      }
      CoordinatorLayout.d locald = (CoordinatorLayout.d)paramView.getLayoutParams();
      Object localObject5 = a();
      i3 = getPaddingLeft();
      i2 = leftMargin;
      i3 += i2;
      i2 = getPaddingTop();
      i5 = topMargin;
      i2 += i5;
      i5 = getWidth();
      int i6 = getPaddingRight();
      i5 -= i6;
      i6 = rightMargin;
      i5 -= i6;
      i6 = getHeight();
      int i8 = getPaddingBottom();
      i6 -= i8;
      i8 = bottomMargin;
      i6 -= i8;
      ((Rect)localObject5).set(i3, i2, i5, i6);
      localObject4 = g;
      if (localObject4 != null)
      {
        boolean bool = w.x(this);
        if (bool)
        {
          bool = w.x(paramView);
          if (!bool)
          {
            i4 = left;
            i2 = g.a();
            i4 += i2;
            left = i4;
            i4 = top;
            i2 = g.b();
            i4 += i2;
            top = i4;
            i4 = right;
            i2 = g.c();
            i4 -= i2;
            right = i4;
            i4 = bottom;
            localObject1 = g;
            i2 = ((al)localObject1).d();
            i4 -= i2;
            bottom = i4;
          }
        }
      }
      Rect localRect = a();
      int i7 = c(c);
      int i4 = paramView.getMeasuredWidth();
      i2 = paramView.getMeasuredHeight();
      i6 = paramInt;
      f.a(i7, i4, i2, (Rect)localObject5, localRect, paramInt);
      i7 = left;
      i4 = top;
      i2 = right;
      i6 = bottom;
      paramView.layout(i7, i4, i2, i6);
      a((Rect)localObject5);
      a(localRect);
    }
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
    boolean bool = paramLayoutParams instanceof CoordinatorLayout.d;
    if (bool)
    {
      bool = super.checkLayoutParams((ViewGroup.LayoutParams)paramLayoutParams);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
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
    boolean bool1 = false;
    Drawable localDrawable = v;
    if (localDrawable != null)
    {
      boolean bool2 = localDrawable.isStateful();
      if (bool2) {
        bool1 = localDrawable.setState(arrayOfInt) | false;
      }
    }
    if (bool1) {
      invalidate();
    }
  }
  
  final List getDependencySortedChildren()
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
    int i1 = super.getSuggestedMinimumHeight();
    int i2 = getPaddingTop();
    int i3 = getPaddingBottom();
    i2 += i3;
    return Math.max(i1, i2);
  }
  
  protected int getSuggestedMinimumWidth()
  {
    int i1 = super.getSuggestedMinimumWidth();
    int i2 = getPaddingLeft();
    int i3 = getPaddingRight();
    i2 += i3;
    return Math.max(i1, i2);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    b();
    boolean bool = u;
    if (bool)
    {
      localObject = t;
      if (localObject == null)
      {
        localObject = new android/support/design/widget/CoordinatorLayout$e;
        ((CoordinatorLayout.e)localObject).<init>(this);
        t = ((CoordinatorLayout.e)localObject);
      }
      localObject = getViewTreeObserver();
      CoordinatorLayout.e locale = t;
      ((ViewTreeObserver)localObject).addOnPreDrawListener(locale);
    }
    Object localObject = g;
    if (localObject == null)
    {
      bool = w.x(this);
      if (bool) {
        w.w(this);
      }
    }
    o = true;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    b();
    boolean bool = u;
    if (bool)
    {
      localObject = t;
      if (localObject != null)
      {
        localObject = getViewTreeObserver();
        CoordinatorLayout.e locale = t;
        ((ViewTreeObserver)localObject).removeOnPreDrawListener(locale);
      }
    }
    Object localObject = s;
    if (localObject != null)
    {
      localObject = s;
      onStopNestedScroll((View)localObject);
    }
    o = false;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    boolean bool = h;
    Object localObject;
    int i1;
    if (bool)
    {
      localObject = v;
      if (localObject != null)
      {
        localObject = g;
        if (localObject == null) {
          break label79;
        }
        localObject = g;
        i1 = ((al)localObject).b();
      }
    }
    for (;;)
    {
      if (i1 > 0)
      {
        Drawable localDrawable = v;
        int i2 = getWidth();
        localDrawable.setBounds(0, 0, i2, i1);
        localObject = v;
        ((Drawable)localObject).draw(paramCanvas);
      }
      return;
      label79:
      i1 = 0;
      localObject = null;
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = n.a(paramMotionEvent);
    if (i1 == 0) {
      b();
    }
    boolean bool = a(paramMotionEvent, 0);
    int i2 = 1;
    if (i1 != i2)
    {
      i2 = 3;
      if (i1 != i2) {}
    }
    else
    {
      b();
    }
    return bool;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = w.g(this);
    int i2 = k.size();
    int i3 = 0;
    View localView = null;
    for (int i4 = 0; i4 < i2; i4 = i3)
    {
      localView = (View)k.get(i4);
      int i5 = localView.getVisibility();
      int i6 = 8;
      if (i5 != i6)
      {
        CoordinatorLayout.a locala = getLayoutParamsa;
        if (locala != null)
        {
          boolean bool = locala.a(this, localView, i1);
          if (bool) {}
        }
        else
        {
          a(localView, i1);
        }
      }
      i3 = i4 + 1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    c();
    boolean bool1 = false;
    Object localObject1 = null;
    int i2 = getChildCount();
    int i3 = 0;
    Object localObject2 = null;
    int i9 = 0;
    al localal = null;
    d locald;
    int i11;
    View localView2;
    if (i9 < i2)
    {
      View localView1 = getChildAt(i9);
      locald = e;
      i3 = 0;
      localObject2 = null;
      int i10 = b.size();
      i11 = 0;
      localView2 = null;
      label70:
      if (i11 < i10)
      {
        localObject2 = (ArrayList)b.c(i11);
        if (localObject2 != null)
        {
          i3 = ((ArrayList)localObject2).contains(localView1);
          if (i3 != 0)
          {
            i3 = 1;
            label114:
            if (i3 == 0) {
              break label831;
            }
            i3 = 1;
          }
        }
      }
    }
    for (;;)
    {
      bool1 = u;
      label205:
      int i12;
      int i1;
      label251:
      int i23;
      int i24;
      int i25;
      label332:
      int i29;
      label352:
      label520:
      int i30;
      label621:
      int i6;
      if (i3 != bool1)
      {
        if (i3 != 0)
        {
          i3 = o;
          if (i3 != 0)
          {
            localObject2 = t;
            if (localObject2 == null)
            {
              localObject2 = new android/support/design/widget/CoordinatorLayout$e;
              ((CoordinatorLayout.e)localObject2).<init>(this);
              t = ((CoordinatorLayout.e)localObject2);
            }
            localObject2 = getViewTreeObserver();
            localObject1 = t;
            ((ViewTreeObserver)localObject2).addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)localObject1);
          }
          i3 = 1;
          u = i3;
        }
      }
      else
      {
        i12 = getPaddingLeft();
        i1 = getPaddingTop();
        int i13 = getPaddingRight();
        i11 = getPaddingBottom();
        int i14 = w.g(this);
        i3 = 1;
        if (i14 != i3) {
          break label899;
        }
        i3 = 1;
        int i15 = i3;
        int i17 = View.MeasureSpec.getMode(paramInt1);
        int i18 = View.MeasureSpec.getSize(paramInt1);
        int i19 = View.MeasureSpec.getMode(paramInt2);
        int i20 = View.MeasureSpec.getSize(paramInt2);
        int i21 = i12 + i13;
        int i22 = i1 + i11;
        i23 = getSuggestedMinimumWidth();
        i24 = getSuggestedMinimumHeight();
        i25 = 0;
        localObject2 = g;
        if (localObject2 == null) {
          break label911;
        }
        i3 = w.x(this);
        if (i3 == 0) {
          break label911;
        }
        i3 = 1;
        int i26 = i3;
        int i28 = k.size();
        i3 = 0;
        localObject2 = null;
        i29 = 0;
        if (i29 >= i28) {
          break label974;
        }
        localObject2 = k;
        localView2 = (View)((List)localObject2).get(i29);
        int i4 = localView2.getVisibility();
        i1 = 8;
        if (i4 == i1) {
          break label1023;
        }
        localObject2 = localView2.getLayoutParams();
        Object localObject3 = localObject2;
        localObject3 = (CoordinatorLayout.d)localObject2;
        i2 = 0;
        i4 = e;
        if ((i4 >= 0) && (i17 != 0))
        {
          i4 = e;
          i4 = b(i4);
          i1 = f.a(d(c), i14) & 0x7;
          i9 = 3;
          if ((i1 != i9) || (i15 != 0))
          {
            i9 = 5;
            if ((i1 != i9) || (i15 == 0)) {
              break label923;
            }
          }
          i1 = 0;
          localObject1 = null;
          i9 = i18 - i13;
          i4 = i9 - i4;
          i2 = Math.max(0, i4);
        }
        if (i26 == 0) {
          break label1014;
        }
        boolean bool2 = w.x(localView2);
        if (bool2) {
          break label1014;
        }
        localObject2 = g;
        int i5 = ((al)localObject2).a();
        i1 = g.c();
        i5 += i1;
        localObject1 = g;
        i1 = ((al)localObject1).b();
        localal = g;
        i9 = localal.d();
        i1 += i9;
        i9 = View.MeasureSpec.makeMeasureSpec(i18 - i5, i17);
        i5 = i20 - i1;
        i30 = View.MeasureSpec.makeMeasureSpec(i5, i19);
        localObject2 = a;
        if (localObject2 != null)
        {
          locald = null;
          localObject1 = this;
          boolean bool3 = ((CoordinatorLayout.a)localObject2).a(this, localView2, i9, i2, i30, 0);
          if (bool3) {}
        }
        else
        {
          locald = null;
          localObject1 = this;
          a(localView2, i9, i2, i30, 0);
        }
        i6 = localView2.getMeasuredWidth() + i21;
        i1 = leftMargin;
        i6 += i1;
        i1 = rightMargin;
        i6 += i1;
        i9 = Math.max(i23, i6);
        i6 = localView2.getMeasuredHeight() + i22;
        i1 = topMargin;
        i6 += i1;
        i1 = bottomMargin;
        i6 += i1;
        i1 = Math.max(i24, i6);
        i6 = w.j(localView2);
        i6 = w.a(i25, i6);
      }
      for (i11 = i9;; i11 = i23)
      {
        i9 = i29 + 1;
        i29 = i9;
        i25 = i6;
        i24 = i1;
        i23 = i11;
        break label352;
        i6 = i11 + 1;
        i11 = i6;
        break label70;
        i6 = 0;
        localObject2 = null;
        break label114;
        label831:
        i6 = i9 + 1;
        i9 = i6;
        break;
        int i7 = o;
        if (i7 != 0)
        {
          localObject2 = t;
          if (localObject2 != null)
          {
            localObject2 = getViewTreeObserver();
            localObject1 = t;
            ((ViewTreeObserver)localObject2).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)localObject1);
          }
        }
        i7 = 0;
        localObject2 = null;
        u = false;
        break label205;
        label899:
        i7 = 0;
        localObject2 = null;
        int i16 = 0;
        break label251;
        label911:
        i7 = 0;
        localObject2 = null;
        int i27 = 0;
        break label332;
        label923:
        i9 = 5;
        if ((i1 != i9) || (i16 != 0))
        {
          i9 = 3;
          if ((i1 != i9) || (i16 == 0)) {
            break label520;
          }
        }
        i1 = 0;
        localObject1 = null;
        i7 -= i12;
        i2 = Math.max(0, i8);
        break label520;
        label974:
        i8 = 0xFF000000 & i25;
        i8 = w.a(i23, paramInt1, i8);
        i1 = i25 << 16;
        i1 = w.a(i24, paramInt2, i1);
        setMeasuredDimension(i8, i1);
        return;
        label1014:
        i30 = paramInt2;
        i9 = paramInt1;
        break label621;
        label1023:
        i8 = i25;
        i1 = i24;
      }
      int i8 = 0;
      localObject2 = null;
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    int i1 = 0;
    Object localObject = null;
    int i3 = getChildCount();
    int i4 = 0;
    int i5 = 0;
    View localView;
    if (i4 < i3)
    {
      localView = getChildAt(i4);
      i1 = localView.getVisibility();
      int i6 = 8;
      if (i1 == i6) {
        break label131;
      }
      localObject = (CoordinatorLayout.d)localView.getLayoutParams();
      boolean bool = n;
      if (!bool) {
        break label131;
      }
      localObject = a;
      if (localObject == null) {
        break label131;
      }
    }
    label131:
    for (int i2 = ((CoordinatorLayout.a)localObject).a(this, localView, paramFloat2, paramBoolean) | i5;; i2 = i5)
    {
      i4 += 1;
      i5 = i2;
      break;
      if (i5 != 0)
      {
        i2 = 1;
        a(i2);
      }
      return i5;
    }
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    int i1 = 0;
    Object localObject = null;
    int i2 = getChildCount();
    int i3 = 0;
    boolean bool2 = false;
    View localView;
    if (i3 < i2)
    {
      localView = getChildAt(i3);
      i1 = localView.getVisibility();
      int i4 = 8;
      if (i1 == i4) {
        break label121;
      }
      localObject = (CoordinatorLayout.d)localView.getLayoutParams();
      boolean bool3 = n;
      if (!bool3) {
        break label121;
      }
      localObject = a;
      if (localObject == null) {
        break label121;
      }
    }
    label121:
    for (boolean bool1 = ((CoordinatorLayout.a)localObject).a(this, localView, paramView, paramFloat1, paramFloat2) | bool2;; bool1 = bool2)
    {
      int i5 = i3 + 1;
      i3 = i5;
      bool2 = bool1;
      break;
      return bool2;
    }
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    int i4 = getChildCount();
    int i5 = 0;
    float f2 = 0.0F;
    Object localObject2 = null;
    int i6 = 0;
    int i10;
    if (i6 < i4)
    {
      View localView = getChildAt(i6);
      i5 = localView.getVisibility();
      int i7 = 8;
      if (i5 == i7) {
        break label372;
      }
      localObject2 = (CoordinatorLayout.d)localView.getLayoutParams();
      boolean bool = n;
      if (!bool) {
        break label372;
      }
      localObject2 = a;
      if (localObject2 == null) {
        break label372;
      }
      localObject1 = m;
      bool = false;
      int[] arrayOfInt1 = m;
      int i9 = 1;
      arrayOfInt1[i9] = 0;
      localObject1[0] = 0;
      int[] arrayOfInt2 = m;
      localObject1 = this;
      ((CoordinatorLayout.a)localObject2).a(this, localView, paramView, paramInt2, arrayOfInt2);
      if (paramInt1 > 0)
      {
        localObject2 = m;
        i3 = 0;
        f1 = 0.0F;
        localObject1 = null;
        i5 = localObject2[0];
        i10 = Math.max(i1, i5);
        label184:
        if (paramInt2 <= 0) {
          break label298;
        }
        localObject2 = m;
        i3 = 1;
        f1 = Float.MIN_VALUE;
        i5 = localObject2[i3];
        i5 = Math.max(i2, i5);
        label217:
        f1 = Float.MIN_VALUE;
        int i11 = 1;
        i3 = i5;
        i5 = i11;
        f2 = f1;
      }
    }
    for (;;)
    {
      int i8 = i6 + 1;
      i6 = i8;
      i2 = i3;
      i1 = i10;
      i3 = i5;
      f1 = f2;
      break;
      localObject2 = m;
      i3 = 0;
      f1 = 0.0F;
      localObject1 = null;
      i5 = localObject2[0];
      i10 = Math.min(i1, i5);
      break label184;
      label298:
      localObject2 = m;
      i3 = 1;
      f1 = Float.MIN_VALUE;
      i5 = localObject2[i3];
      i5 = Math.min(i2, i5);
      break label217;
      localObject2 = null;
      paramArrayOfInt[0] = i1;
      i5 = 1;
      f2 = Float.MIN_VALUE;
      paramArrayOfInt[i5] = i2;
      if (i3 != 0)
      {
        i5 = 1;
        f2 = Float.MIN_VALUE;
        a(i5);
      }
      return;
      label372:
      i5 = i3;
      f2 = f1;
      i10 = i1;
      i3 = i2;
    }
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    int i2 = 0;
    float f2 = 0.0F;
    Object localObject = null;
    int i3 = getChildCount();
    int i4 = 0;
    int i5 = 0;
    float f3 = 0.0F;
    if (i4 < i3)
    {
      View localView = getChildAt(i4);
      i2 = localView.getVisibility();
      int i6 = 8;
      if (i2 == i6) {
        break label145;
      }
      localObject = (CoordinatorLayout.d)localView.getLayoutParams();
      boolean bool = n;
      if (!bool) {
        break label145;
      }
      localObject = a;
      if (localObject == null) {
        break label145;
      }
      ((CoordinatorLayout.a)localObject).b(this, localView, paramInt4);
      i2 = i1;
    }
    for (f2 = f1;; f2 = f3)
    {
      i4 += 1;
      i5 = i2;
      f3 = f2;
      break;
      if (i5 != 0) {
        a(i1);
      }
      return;
      label145:
      i2 = i5;
    }
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    x.a = paramInt;
    r = paramView1;
    s = paramView2;
    int i1 = getChildCount();
    int i2 = 0;
    while (i2 < i1)
    {
      View localView = getChildAt(i2);
      localView.getLayoutParams();
      i2 += 1;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof CoordinatorLayout.f;
    if (!bool) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      paramParcelable = (CoordinatorLayout.f)paramParcelable;
      Parcelable localParcelable = e;
      super.onRestoreInstanceState(localParcelable);
      SparseArray localSparseArray = a;
      bool = false;
      localParcelable = null;
      int i2 = getChildCount();
      int i1;
      for (int i3 = 0; i3 < i2; i3 = i1)
      {
        View localView = getChildAt(i3);
        i1 = localView.getId();
        CoordinatorLayout.a locala = ba;
        int i4 = -1;
        if ((i1 != i4) && (locala != null))
        {
          localParcelable = (Parcelable)localSparseArray.get(i1);
          if (localParcelable != null) {
            locala.a(this, localView, localParcelable);
          }
        }
        i1 = i3 + 1;
      }
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    CoordinatorLayout.f localf = new android/support/design/widget/CoordinatorLayout$f;
    Object localObject = super.onSaveInstanceState();
    localf.<init>((Parcelable)localObject);
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    int i1 = 0;
    localObject = null;
    int i2 = getChildCount();
    for (int i3 = 0; i3 < i2; i3 = i1)
    {
      View localView = getChildAt(i3);
      int i4 = localView.getId();
      localObject = getLayoutParamsa;
      int i5 = -1;
      if ((i4 != i5) && (localObject != null))
      {
        localObject = ((CoordinatorLayout.a)localObject).b(this, localView);
        if (localObject != null) {
          localSparseArray.append(i4, localObject);
        }
      }
      i1 = i3 + 1;
    }
    a = localSparseArray;
    return localf;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    int i1 = getChildCount();
    int i2 = 0;
    int i3 = 0;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      int i4 = localView.getVisibility();
      int i5 = 8;
      CoordinatorLayout.d locald;
      if (i4 != i5)
      {
        locald = (CoordinatorLayout.d)localView.getLayoutParams();
        CoordinatorLayout.a locala = a;
        if (locala != null)
        {
          boolean bool = locala.a(this, localView, paramView1, paramInt);
          i3 |= bool;
          n = bool;
        }
      }
      for (i4 = i3;; i4 = i3)
      {
        i2 += 1;
        i3 = i4;
        break;
        n = false;
      }
    }
    return i3;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    Object localObject = x;
    a = 0;
    int i1 = getChildCount();
    int i3;
    for (int i2 = 0; i2 < i1; i2 = i3)
    {
      View localView = getChildAt(i2);
      localObject = (CoordinatorLayout.d)localView.getLayoutParams();
      boolean bool = n;
      if (bool)
      {
        CoordinatorLayout.a locala = a;
        if (locala != null) {
          locala.a(this, localView, paramView);
        }
        n = false;
        o = false;
      }
      i3 = i2 + 1;
    }
    r = null;
    s = null;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 3;
    int i2 = 1;
    int i3 = n.a(paramMotionEvent);
    Object localObject = q;
    boolean bool1;
    if (localObject == null)
    {
      bool1 = a(paramMotionEvent, i2);
      if (!bool1) {}
    }
    for (boolean bool2 = bool1;; bool2 = false)
    {
      localObject = q.getLayoutParams()).a;
      boolean bool3;
      if (localObject != null)
      {
        View localView = q;
        bool1 = ((CoordinatorLayout.a)localObject).b(this, localView, paramMotionEvent);
        bool3 = bool1;
      }
      for (;;)
      {
        localObject = q;
        if (localObject == null)
        {
          bool1 = super.onTouchEvent(paramMotionEvent);
          bool3 |= bool1;
          bool1 = false;
          localObject = null;
        }
        for (;;)
        {
          if (localObject != null) {
            ((MotionEvent)localObject).recycle();
          }
          if ((i3 == i2) || (i3 == i1)) {
            b();
          }
          return bool3;
          if (bool2)
          {
            long l1 = SystemClock.uptimeMillis();
            localObject = MotionEvent.obtain(l1, l1, i1, 0.0F, 0.0F, 0);
            super.onTouchEvent((MotionEvent)localObject);
          }
          else
          {
            bool1 = false;
            localObject = null;
          }
        }
        bool3 = false;
        continue;
        bool2 = bool1;
        bool3 = false;
      }
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    CoordinatorLayout.a locala = getLayoutParamsa;
    if (locala != null)
    {
      bool = locala.a(this, paramView, paramRect, paramBoolean);
      if (!bool) {}
    }
    for (boolean bool = true;; bool = super.requestChildRectangleOnScreen(paramView, paramRect, paramBoolean)) {
      return bool;
    }
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    if (paramBoolean)
    {
      boolean bool = n;
      if (!bool)
      {
        b();
        bool = true;
        n = bool;
      }
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
    boolean bool = false;
    Drawable localDrawable = null;
    Object localObject = v;
    int i1;
    if (localObject != paramDrawable)
    {
      localObject = v;
      if (localObject != null)
      {
        localObject = v;
        ((Drawable)localObject).setCallback(null);
      }
      if (paramDrawable != null) {
        localDrawable = paramDrawable.mutate();
      }
      v = localDrawable;
      localDrawable = v;
      if (localDrawable != null)
      {
        localDrawable = v;
        bool = localDrawable.isStateful();
        if (bool)
        {
          localDrawable = v;
          localObject = getDrawableState();
          localDrawable.setState((int[])localObject);
        }
        localDrawable = v;
        int i3 = w.g(this);
        android.support.v4.d.a.a.b(localDrawable, i3);
        localObject = v;
        i1 = getVisibility();
        if (i1 != 0) {
          break label152;
        }
        i1 = 1;
      }
    }
    for (;;)
    {
      ((Drawable)localObject).setVisible(i1, false);
      localDrawable = v;
      localDrawable.setCallback(this);
      w.c(this);
      return;
      label152:
      int i2 = 0;
      localDrawable = null;
    }
  }
  
  public void setStatusBarBackgroundColor(int paramInt)
  {
    ColorDrawable localColorDrawable = new android/graphics/drawable/ColorDrawable;
    localColorDrawable.<init>(paramInt);
    setStatusBarBackground(localColorDrawable);
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
    for (boolean bool1 = true;; bool1 = false)
    {
      Drawable localDrawable = v;
      if (localDrawable != null)
      {
        localDrawable = v;
        boolean bool2 = localDrawable.isVisible();
        if (bool2 != bool1)
        {
          localDrawable = v;
          localDrawable.setVisible(bool1, false);
        }
      }
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool = super.verifyDrawable(paramDrawable);
    Drawable localDrawable;
    if (!bool)
    {
      localDrawable = v;
      if (paramDrawable != localDrawable) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDrawable = null;
    }
  }
}


/* Location:              android/support/design/widget/CoordinatorLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */