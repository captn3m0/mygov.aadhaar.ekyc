package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.f.e;
import android.support.v4.h.n;
import android.support.v4.h.o;
import android.support.v4.h.p;
import android.support.v4.h.t;
import android.support.v4.h.v;
import android.support.v4.h.w;
import android.support.v4.widget.h;
import android.support.v4.widget.m;
import android.support.v7.d.a.a;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class at
  extends ViewGroup
  implements o, t
{
  static final Interpolator L;
  private static final int[] M;
  private static final int[] N;
  private static final boolean O;
  private static final boolean P;
  private static final boolean Q;
  private static final Class[] R;
  static final boolean a;
  static final boolean b;
  static final boolean c;
  h A;
  at.e B;
  final at.t C;
  ak D;
  ak.a E;
  final at.r F;
  boolean G;
  boolean H;
  boolean I;
  au J;
  final List K;
  private final at.o S;
  private at.p T;
  private final Rect U;
  private final ArrayList V;
  private at.j W;
  private final int[] aA;
  private final int[] aB;
  private Runnable aC;
  private final bj.b aD;
  private int aa;
  private boolean ab;
  private int ac;
  private final AccessibilityManager ad;
  private int ae;
  private int af;
  private int ag;
  private int ah;
  private VelocityTracker ai;
  private int aj;
  private int ak;
  private int al;
  private int am;
  private int an;
  private at.i ao;
  private final int ap;
  private final int aq;
  private float ar;
  private boolean as;
  private at.k at;
  private List au;
  private at.e.a av;
  private at.d aw;
  private final int[] ax;
  private p ay;
  private final int[] az;
  final at.m d;
  f e;
  ac f;
  final bj g;
  boolean h;
  final Runnable i;
  final Rect j;
  final RectF k;
  at.a l;
  at.g m;
  at.n n;
  final ArrayList o;
  boolean p;
  boolean q;
  boolean r;
  boolean s;
  boolean t;
  boolean u;
  List v;
  boolean w;
  h x;
  h y;
  h z;
  
  static
  {
    int i1 = 15;
    int i2 = 1;
    Object localObject = new int[i2];
    localObject[0] = 16843830;
    M = (int[])localObject;
    localObject = new int[i2];
    localObject[0] = 16842987;
    N = (int[])localObject;
    int i3 = Build.VERSION.SDK_INT;
    int i4 = 18;
    if (i3 != i4)
    {
      i3 = Build.VERSION.SDK_INT;
      i4 = 19;
      if (i3 != i4)
      {
        i3 = Build.VERSION.SDK_INT;
        i4 = 20;
        if (i3 != i4) {
          break label221;
        }
      }
    }
    i3 = i2;
    a = i3;
    i3 = Build.VERSION.SDK_INT;
    i4 = 23;
    if (i3 >= i4)
    {
      i3 = i2;
      label95:
      b = i3;
      i3 = Build.VERSION.SDK_INT;
      i4 = 16;
      if (i3 < i4) {
        break label235;
      }
      i3 = i2;
      label115:
      c = i3;
      i3 = Build.VERSION.SDK_INT;
      i4 = 21;
      if (i3 < i4) {
        break label242;
      }
      i3 = i2;
      label135:
      O = i3;
      i3 = Build.VERSION.SDK_INT;
      if (i3 > i1) {
        break label249;
      }
      i3 = i2;
      label150:
      P = i3;
      i3 = Build.VERSION.SDK_INT;
      if (i3 > i1) {
        break label256;
      }
      i3 = i2;
    }
    for (;;)
    {
      Q = i3;
      localObject = new Class[4];
      localObject[0] = Context.class;
      localObject[i2] = AttributeSet.class;
      Class localClass = Integer.TYPE;
      localObject[2] = localClass;
      localClass = Integer.TYPE;
      localObject[3] = localClass;
      R = (Class[])localObject;
      localObject = new android/support/v7/widget/at$3;
      ((at.3)localObject).<init>();
      L = (Interpolator)localObject;
      return;
      label221:
      i3 = 0;
      localObject = null;
      break;
      i3 = 0;
      localObject = null;
      break label95;
      label235:
      i3 = 0;
      localObject = null;
      break label115;
      label242:
      i3 = 0;
      localObject = null;
      break label135;
      label249:
      i3 = 0;
      localObject = null;
      break label150;
      label256:
      i3 = 0;
      localObject = null;
    }
  }
  
  public at(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public at(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public at(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject2 = new android/support/v7/widget/at$o;
    ((at.o)localObject2).<init>(this);
    S = ((at.o)localObject2);
    localObject2 = new android/support/v7/widget/at$m;
    ((at.m)localObject2).<init>(this);
    d = ((at.m)localObject2);
    localObject2 = new android/support/v7/widget/bj;
    ((bj)localObject2).<init>();
    g = ((bj)localObject2);
    localObject2 = new android/support/v7/widget/at$1;
    ((at.1)localObject2).<init>(this);
    i = ((Runnable)localObject2);
    localObject2 = new android/graphics/Rect;
    ((Rect)localObject2).<init>();
    j = ((Rect)localObject2);
    localObject2 = new android/graphics/Rect;
    ((Rect)localObject2).<init>();
    U = ((Rect)localObject2);
    localObject2 = new android/graphics/RectF;
    ((RectF)localObject2).<init>();
    k = ((RectF)localObject2);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    o = ((ArrayList)localObject2);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    V = ((ArrayList)localObject2);
    aa = 0;
    w = false;
    ae = 0;
    af = 0;
    localObject2 = new android/support/v7/widget/af;
    ((af)localObject2).<init>();
    B = ((at.e)localObject2);
    ag = 0;
    ah = i2;
    float f2 = Float.MIN_VALUE;
    ar = f2;
    as = i6;
    localObject2 = new android/support/v7/widget/at$t;
    ((at.t)localObject2).<init>(this);
    C = ((at.t)localObject2);
    boolean bool2 = O;
    label467:
    label545:
    Object localObject4;
    int i5;
    Object localObject5;
    if (bool2)
    {
      localObject2 = new android/support/v7/widget/ak$a;
      ((ak.a)localObject2).<init>();
      E = ((ak.a)localObject2);
      localObject2 = new android/support/v7/widget/at$r;
      ((at.r)localObject2).<init>();
      F = ((at.r)localObject2);
      G = false;
      H = false;
      localObject2 = new android/support/v7/widget/at$f;
      ((at.f)localObject2).<init>(this);
      av = ((at.e.a)localObject2);
      I = false;
      localObject2 = new int[i4];
      ax = ((int[])localObject2);
      localObject2 = new int[i4];
      az = ((int[])localObject2);
      localObject2 = new int[i4];
      aA = ((int[])localObject2);
      localObject2 = new int[i4];
      aB = ((int[])localObject2);
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      K = ((List)localObject2);
      localObject2 = new android/support/v7/widget/at$2;
      ((at.2)localObject2).<init>(this);
      aC = ((Runnable)localObject2);
      localObject2 = new android/support/v7/widget/at$4;
      ((at.4)localObject2).<init>(this);
      aD = ((bj.b)localObject2);
      if (paramAttributeSet == null) {
        break label1075;
      }
      localObject2 = N;
      localObject2 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject2, paramInt, 0);
      boolean bool4 = ((TypedArray)localObject2).getBoolean(0, i6);
      h = bool4;
      ((TypedArray)localObject2).recycle();
      setScrollContainer(i6);
      setFocusableInTouchMode(i6);
      localObject2 = ViewConfiguration.get(paramContext);
      int i10 = ((ViewConfiguration)localObject2).getScaledTouchSlop();
      an = i10;
      i10 = ((ViewConfiguration)localObject2).getScaledMinimumFlingVelocity();
      ap = i10;
      int i7 = ((ViewConfiguration)localObject2).getScaledMaximumFlingVelocity();
      aq = i7;
      i7 = getOverScrollMode();
      if (i7 != i4) {
        break label1084;
      }
      i7 = i6;
      f2 = f1;
      setWillNotDraw(i7);
      localObject2 = B;
      localObject4 = av;
      h = ((at.e.a)localObject4);
      localObject2 = new android/support/v7/widget/f;
      localObject4 = new android/support/v7/widget/at$6;
      ((at.6)localObject4).<init>(this);
      ((f)localObject2).<init>((f.a)localObject4);
      e = ((f)localObject2);
      localObject2 = new android/support/v7/widget/ac;
      localObject4 = new android/support/v7/widget/at$5;
      ((at.5)localObject4).<init>(this);
      ((ac)localObject2).<init>((ac.b)localObject4);
      f = ((ac)localObject2);
      int i8 = w.d(this);
      if (i8 == 0) {
        w.c(this, i6);
      }
      localObject2 = getContext();
      localObject4 = "accessibility";
      localObject2 = (AccessibilityManager)((Context)localObject2).getSystemService((String)localObject4);
      ad = ((AccessibilityManager)localObject2);
      localObject2 = new android/support/v7/widget/au;
      ((au)localObject2).<init>(this);
      setAccessibilityDelegateCompat((au)localObject2);
      if (paramAttributeSet == null) {
        break label1599;
      }
      localObject2 = a.a.RecyclerView;
      localObject2 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject2, paramInt, 0);
      i10 = a.a.RecyclerView_layoutManager;
      localObject4 = ((TypedArray)localObject2).getString(i10);
      i4 = a.a.RecyclerView_android_descendantFocusability;
      i4 = ((TypedArray)localObject2).getInt(i4, i2);
      if (i4 == i2)
      {
        i5 = 262144;
        setDescendantFocusability(i5);
      }
      ((TypedArray)localObject2).recycle();
      if (localObject4 != null)
      {
        localObject2 = ((String)localObject4).trim();
        i10 = ((String)localObject2).length();
        if (i10 != 0)
        {
          i10 = ((String)localObject2).charAt(0);
          if (i10 != i1) {
            break label1096;
          }
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject5 = paramContext.getPackageName();
          localObject2 = (String)localObject5 + (String)localObject2;
          localObject4 = localObject2;
        }
      }
    }
    for (;;)
    {
      int i9;
      try
      {
        boolean bool3 = isInEditMode();
        Class localClass;
        if (bool3)
        {
          localObject2 = getClass();
          localObject2 = ((Class)localObject2).getClassLoader();
          localObject2 = ((ClassLoader)localObject2).loadClass((String)localObject4);
          localObject5 = at.g.class;
          localClass = ((Class)localObject2).asSubclass((Class)localObject5);
          i5 = 0;
          localObject5 = null;
        }
        try
        {
          localObject2 = R;
          localObject6 = localClass.getConstructor((Class[])localObject2);
          i9 = 4;
          f2 = 5.6E-45F;
          localObject2 = new Object[i9];
          int i12 = 0;
          localObject2[0] = paramContext;
          i12 = 1;
          localObject2[i12] = paramAttributeSet;
          i12 = 2;
          Integer localInteger = Integer.valueOf(paramInt);
          localObject2[i12] = localInteger;
          i12 = 3;
          localInteger = null;
          localInteger = Integer.valueOf(0);
          localObject2[i12] = localInteger;
          localObject5 = localObject6;
        }
        catch (NoSuchMethodException localNoSuchMethodException1)
        {
          int i11;
          boolean bool1;
          boolean bool5;
          int i3 = 0;
          Object localObject6 = null;
          try
          {
            localObject6 = new Class[0];
            localObject5 = localClass.getConstructor((Class[])localObject6);
            i9 = 0;
            localObject3 = null;
            f2 = 0.0F;
          }
          catch (NoSuchMethodException localNoSuchMethodException2)
          {
            localNoSuchMethodException2.initCause((Throwable)localObject3);
            Object localObject3 = new java/lang/IllegalStateException;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject5 = paramAttributeSet.getPositionDescription();
            localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
            localObject5 = ": Error creating LayoutManager ";
            localObject1 = ((StringBuilder)localObject1).append((String)localObject5);
            localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
            localObject1 = ((StringBuilder)localObject1).toString();
            ((IllegalStateException)localObject3).<init>((String)localObject1, localNoSuchMethodException2);
            throw ((Throwable)localObject3);
          }
        }
        i2 = 1;
        ((Constructor)localObject5).setAccessible(i2);
        localObject2 = ((Constructor)localObject5).newInstance((Object[])localObject2);
        localObject2 = (at.g)localObject2;
        setLayoutManager((at.g)localObject2);
        i9 = Build.VERSION.SDK_INT;
        i11 = 21;
        if (i9 >= i11)
        {
          localObject2 = M;
          localObject2 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject2, paramInt, 0);
          bool1 = ((TypedArray)localObject2).getBoolean(0, i6);
          ((TypedArray)localObject2).recycle();
        }
        setNestedScrollingEnabled(bool1);
        return;
        i9 = 0;
        f2 = 0.0F;
        localObject2 = null;
        break;
        label1075:
        h = bool1;
        break label467;
        label1084:
        i9 = 0;
        localObject2 = null;
        f2 = 0.0F;
        break label545;
        label1096:
        localObject4 = ".";
        bool5 = ((String)localObject2).contains((CharSequence)localObject4);
        if (bool5)
        {
          localObject4 = localObject2;
          continue;
        }
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject5 = at.class.getPackage().getName();
        localObject2 = (String)localObject5 + i1 + (String)localObject2;
        localObject4 = localObject2;
        continue;
        localObject2 = paramContext.getClassLoader();
        continue;
        IllegalStateException localIllegalStateException;
        i9 = 262144;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        localIllegalStateException = new java/lang/IllegalStateException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject5 = paramAttributeSet.getPositionDescription();
        localObject1 = (String)localObject5 + ": Unable to find LayoutManager " + (String)localObject4;
        localIllegalStateException.<init>((String)localObject1, localClassNotFoundException);
        throw localIllegalStateException;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        localIllegalStateException = new java/lang/IllegalStateException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject5 = paramAttributeSet.getPositionDescription();
        localObject1 = (String)localObject5 + ": Could not instantiate the LayoutManager: " + (String)localObject4;
        localIllegalStateException.<init>((String)localObject1, localInvocationTargetException);
        throw localIllegalStateException;
      }
      catch (InstantiationException localInstantiationException)
      {
        localIllegalStateException = new java/lang/IllegalStateException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject5 = paramAttributeSet.getPositionDescription();
        localObject1 = (String)localObject5 + ": Could not instantiate the LayoutManager: " + (String)localObject4;
        localIllegalStateException.<init>((String)localObject1, localInstantiationException);
        throw localIllegalStateException;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localIllegalStateException = new java/lang/IllegalStateException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject5 = paramAttributeSet.getPositionDescription();
        localObject1 = (String)localObject5 + ": Cannot access non-public constructor " + (String)localObject4;
        localIllegalStateException.<init>((String)localObject1, localIllegalAccessException);
        throw localIllegalStateException;
      }
      catch (ClassCastException localClassCastException)
      {
        localIllegalStateException = new java/lang/IllegalStateException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject5 = paramAttributeSet.getPositionDescription();
        localObject1 = (String)localObject5 + ": Class is not a LayoutManager " + (String)localObject4;
        localIllegalStateException.<init>((String)localObject1, localClassCastException);
        throw localIllegalStateException;
      }
      label1599:
      f2 = 3.67342E-40F;
      setDescendantFocusability(i9);
    }
  }
  
  private View A()
  {
    Object localObject1 = F;
    int i1 = l;
    int i2 = -1;
    Object localObject2;
    int i3;
    if (i1 != i2)
    {
      localObject1 = F;
      i1 = l;
      localObject2 = F;
      i3 = ((at.r)localObject2).a();
      i2 = i1;
      label42:
      if (i2 >= i3) {
        break label101;
      }
      at.u localu = b(i2);
      if (localu == null) {
        break label101;
      }
      View localView1 = a;
      boolean bool2 = localView1.hasFocusable();
      if (!bool2) {
        break label94;
      }
      localObject1 = a;
    }
    for (;;)
    {
      return (View)localObject1;
      i1 = 0;
      localObject1 = null;
      break;
      label94:
      i2 += 1;
      break label42;
      label101:
      i1 = Math.min(i3, i1) + -1;
      for (;;)
      {
        if (i1 < 0) {
          break label168;
        }
        localObject2 = b(i1);
        if (localObject2 == null)
        {
          i1 = 0;
          localObject1 = null;
          break;
        }
        View localView2 = a;
        boolean bool1 = localView2.hasFocusable();
        if (bool1)
        {
          localObject1 = a;
          break;
        }
        i1 += -1;
      }
      label168:
      i1 = 0;
      localObject1 = null;
    }
  }
  
  private void B()
  {
    int i1 = 0;
    Object localObject1 = null;
    int i10 = 1;
    int i11 = -1;
    F.a(i10);
    F.i = false;
    c();
    Object localObject2 = g;
    ((bj)localObject2).a();
    h();
    x();
    boolean bool4 = as;
    if (bool4)
    {
      bool4 = hasFocus();
      if (bool4)
      {
        localObject2 = l;
        if (localObject2 == null) {}
      }
    }
    for (localObject2 = getFocusedChild();; localObject2 = null)
    {
      boolean bool5;
      Object localObject3;
      if (localObject2 == null)
      {
        bool5 = false;
        localObject3 = null;
        if (localObject3 != null) {
          break label473;
        }
        z();
        label107:
        localObject2 = F;
        localObject1 = F;
        i1 = j;
        if (i1 == 0) {
          break label660;
        }
        i1 = H;
        if (i1 == 0) {
          break label660;
        }
        i1 = i10;
      }
      boolean bool6;
      Object localObject4;
      label473:
      int i13;
      for (;;)
      {
        h = i1;
        H = false;
        G = false;
        localObject1 = F;
        bool4 = F.k;
        g = bool4;
        localObject1 = F;
        localObject2 = l;
        int i12 = ((at.a)localObject2).a();
        e = i12;
        localObject1 = ax;
        a((int[])localObject1);
        localObject1 = F;
        i1 = j;
        if (i1 == 0) {
          break label667;
        }
        i12 = f.a();
        i1 = 0;
        localObject1 = null;
        while (i1 < i12)
        {
          localObject3 = c(f.b(i1));
          bool6 = ((at.u)localObject3).b();
          if (!bool6)
          {
            bool6 = ((at.u)localObject3).j();
            if (bool6)
            {
              localObject4 = l;
              bool6 = e;
              if (!bool6) {}
            }
            else
            {
              at.e.d((at.u)localObject3);
              ((at.u)localObject3).p();
              localObject4 = new android/support/v7/widget/at$e$b;
              ((at.e.b)localObject4).<init>();
              localObject4 = ((at.e.b)localObject4).a((at.u)localObject3);
              bj localbj1 = g;
              localbj1.a((at.u)localObject3, (at.e.b)localObject4);
              localObject4 = F;
              bool6 = h;
              if (bool6)
              {
                bool6 = ((at.u)localObject3).s();
                if (bool6)
                {
                  bool6 = ((at.u)localObject3).m();
                  if (!bool6)
                  {
                    bool6 = ((at.u)localObject3).b();
                    if (!bool6)
                    {
                      bool6 = ((at.u)localObject3).j();
                      if (!bool6)
                      {
                        long l1 = d((at.u)localObject3);
                        bj localbj2 = g;
                        localbj2.a(l1, (at.u)localObject3);
                      }
                    }
                  }
                }
              }
            }
          }
          int i2;
          i1 += 1;
        }
        localObject2 = b((View)localObject2);
        if (localObject2 == null)
        {
          bool5 = false;
          localObject3 = null;
          break;
        }
        localObject1 = a((View)localObject2);
        localObject3 = localObject1;
        break;
        localObject4 = F;
        localObject1 = l;
        int i3 = e;
        long l2;
        if (i3 != 0)
        {
          l2 = e;
          m = l2;
          localObject2 = F;
          i3 = w;
          if (i3 == 0) {
            break label622;
          }
          i3 = i11;
        }
        for (;;)
        {
          l = i3;
          localObject4 = F;
          localObject1 = a;
          i13 = ((View)localObject1).getId();
          for (;;)
          {
            bool5 = ((View)localObject1).isFocused();
            if (bool5) {
              break;
            }
            bool5 = localObject1 instanceof ViewGroup;
            if (!bool5) {
              break;
            }
            bool5 = ((View)localObject1).hasFocus();
            if (!bool5) {
              break;
            }
            localObject1 = ((ViewGroup)localObject1).getFocusedChild();
            int i15 = ((View)localObject1).getId();
            if (i15 != i11) {
              i13 = ((View)localObject1).getId();
            }
          }
          l2 = -1;
          break;
          label622:
          i3 = ((at.u)localObject3).m();
          if (i3 != 0) {
            i4 = d;
          } else {
            i4 = ((at.u)localObject3).d();
          }
        }
        n = i13;
        break label107;
        label660:
        int i4 = 0;
        localObject1 = null;
      }
      label667:
      localObject1 = F;
      int i5 = k;
      if (i5 != 0)
      {
        i13 = f.b();
        i5 = 0;
        localObject1 = null;
        while (i5 < i13)
        {
          localObject3 = c(f.c(i5));
          bool6 = ((at.u)localObject3).b();
          if (!bool6)
          {
            int i16 = d;
            if (i16 == i11)
            {
              i16 = c;
              d = i16;
            }
          }
          int i6;
          i5 += 1;
        }
        localObject1 = F;
        boolean bool1 = f;
        F.f = false;
        localObject2 = m;
        Object localObject5 = d;
        localObject3 = F;
        ((at.g)localObject2).c((at.m)localObject5, (at.r)localObject3);
        F.f = bool1;
        i14 = 0;
        localObject2 = null;
        localObject1 = f;
        int i7 = ((ac)localObject1).a();
        if (i14 < i7)
        {
          localObject1 = f.b(i14);
          localObject5 = c((View)localObject1);
          boolean bool2 = ((at.u)localObject5).b();
          if (!bool2)
          {
            localObject1 = (bj.a)g.a.get(localObject5);
            if (localObject1 == null) {
              break label961;
            }
            int i8 = a & 0x4;
            if (i8 == 0) {
              break label961;
            }
            i8 = i10;
            label894:
            if (i8 == 0)
            {
              at.e.d((at.u)localObject5);
              boolean bool3 = ((at.u)localObject5).a(8192);
              ((at.u)localObject5).p();
              localObject3 = new android/support/v7/widget/at$e$b;
              ((at.e.b)localObject3).<init>();
              localObject3 = ((at.e.b)localObject3).a((at.u)localObject5);
              if (!bool3) {
                break label968;
              }
              a((at.u)localObject5, (at.e.b)localObject3);
            }
          }
          for (;;)
          {
            int i9 = i14 + 1;
            i14 = i9;
            break;
            label961:
            i9 = 0;
            localObject1 = null;
            break label894;
            label968:
            localObject4 = g;
            localObject1 = (bj.a)a.get(localObject5);
            if (localObject1 == null)
            {
              localObject1 = bj.a.a();
              localObject4 = a;
              ((android.support.v4.g.a)localObject4).put(localObject5, localObject1);
            }
            i11 = a | 0x2;
            a = i11;
            b = ((at.e.b)localObject3);
          }
        }
        D();
      }
      for (;;)
      {
        i();
        a(false);
        F.d = 2;
        return;
        D();
      }
      int i14 = 0;
    }
  }
  
  private void C()
  {
    c();
    h();
    F.a(6);
    e.e();
    Object localObject1 = F;
    int i1 = l.a();
    e = i1;
    F.c = 0;
    F.g = false;
    localObject1 = m;
    Object localObject2 = d;
    at.r localr = F;
    ((at.g)localObject1).c((at.m)localObject2, localr);
    F.f = false;
    T = null;
    localObject2 = F;
    localObject1 = F;
    boolean bool = j;
    if (bool)
    {
      localObject1 = B;
      if (localObject1 != null) {
        bool = true;
      }
    }
    for (;;)
    {
      j = bool;
      F.d = 4;
      i();
      a(false);
      return;
      bool = false;
      localObject1 = null;
    }
  }
  
  private void D()
  {
    int i1 = 0;
    int i2 = f.b();
    int i3 = 0;
    Object localObject1 = null;
    while (i3 < i2)
    {
      localObject2 = c(f.c(i3));
      boolean bool = ((at.u)localObject2).b();
      if (!bool) {
        ((at.u)localObject2).a();
      }
      i3 += 1;
    }
    Object localObject2 = d;
    localObject1 = c;
    int i4 = ((ArrayList)localObject1).size();
    for (i2 = 0; i2 < i4; i2 = i3)
    {
      localObject1 = (at.u)c.get(i2);
      ((at.u)localObject1).a();
      i3 = i2 + 1;
    }
    localObject1 = a;
    i4 = ((ArrayList)localObject1).size();
    for (i2 = 0; i2 < i4; i2 = i3)
    {
      localObject1 = (at.u)a.get(i2);
      ((at.u)localObject1).a();
      i3 = i2 + 1;
    }
    localObject1 = b;
    if (localObject1 != null)
    {
      localObject1 = b;
      i2 = ((ArrayList)localObject1).size();
      while (i1 < i2)
      {
        localObject1 = (at.u)b.get(i1);
        ((at.u)localObject1).a();
        i3 = i1 + 1;
        i1 = i3;
      }
    }
  }
  
  private at.u a(long paramLong)
  {
    Object localObject1 = null;
    Object localObject2 = l;
    boolean bool1;
    if (localObject2 != null)
    {
      localObject2 = l;
      bool1 = e;
      if (bool1) {
        break label33;
      }
    }
    label33:
    int i3;
    label51:
    do
    {
      return (at.u)localObject1;
      int i2 = f.b();
      i3 = 0;
      bool1 = false;
      localObject2 = null;
      if (i3 >= i2) {
        break;
      }
      localObject1 = c(f.c(i3));
      if (localObject1 == null) {
        break label151;
      }
      boolean bool2 = ((at.u)localObject1).m();
      if (bool2) {
        break label151;
      }
      long l1 = e;
      bool2 = l1 < paramLong;
      if (bool2) {
        break label151;
      }
      localObject2 = f;
      View localView = a;
      bool1 = ((ac)localObject2).d(localView);
    } while (!bool1);
    for (;;)
    {
      int i1 = i3 + 1;
      i3 = i1;
      localObject2 = localObject1;
      break label51;
      localObject1 = localObject2;
      break;
      label151:
      localObject1 = localObject2;
    }
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    float f1 = 0.5F;
    int i1 = n.b(paramMotionEvent);
    int i2 = paramMotionEvent.getPointerId(i1);
    int i3 = ah;
    if (i2 == i3)
    {
      if (i1 != 0) {
        break label102;
      }
      i1 = 1;
    }
    for (float f2 = Float.MIN_VALUE;; f2 = 0.0F)
    {
      i2 = paramMotionEvent.getPointerId(i1);
      ah = i2;
      float f3 = paramMotionEvent.getX(i1) + f1;
      i2 = (int)f3;
      al = i2;
      aj = i2;
      f2 = paramMotionEvent.getY(i1) + f1;
      i1 = (int)f2;
      am = i1;
      ak = i1;
      return;
      label102:
      i1 = 0;
    }
  }
  
  static void a(View paramView, Rect paramRect)
  {
    at.h localh = (at.h)paramView.getLayoutParams();
    Rect localRect = d;
    int i1 = paramView.getLeft();
    int i2 = left;
    i1 -= i2;
    i2 = leftMargin;
    i1 -= i2;
    i2 = paramView.getTop();
    int i3 = top;
    i2 -= i3;
    i3 = topMargin;
    i2 -= i3;
    i3 = paramView.getRight();
    int i4 = right;
    i3 += i4;
    i4 = rightMargin;
    i3 += i4;
    i4 = paramView.getBottom();
    int i5 = bottom + i4;
    int i6 = bottomMargin + i5;
    paramRect.set(i1, i2, i3, i6);
  }
  
  private void a(View paramView1, View paramView2)
  {
    int i1 = 1;
    Object localObject1;
    Object localObject2;
    int i3;
    Rect localRect;
    if (paramView2 != null)
    {
      localObject1 = paramView2;
      localObject2 = j;
      int i2 = ((View)localObject1).getWidth();
      i3 = ((View)localObject1).getHeight();
      ((Rect)localObject2).set(0, 0, i2, i3);
      localObject1 = ((View)localObject1).getLayoutParams();
      boolean bool = localObject1 instanceof at.h;
      if (bool)
      {
        localObject1 = (at.h)localObject1;
        bool = e;
        if (!bool)
        {
          localObject1 = d;
          localObject2 = j;
          i2 = left;
          i3 = left;
          i2 -= i3;
          left = i2;
          localObject2 = j;
          i2 = right;
          i3 = right;
          i2 += i3;
          right = i2;
          localObject2 = j;
          i2 = top;
          i3 = top;
          i2 -= i3;
          top = i2;
          localObject2 = j;
          i2 = bottom;
          int i5 = bottom + i2;
          bottom = i5;
        }
      }
      if (paramView2 != null)
      {
        localObject1 = j;
        offsetDescendantRectToMyCoords(paramView2, (Rect)localObject1);
        localObject1 = j;
        offsetRectIntoDescendantCoords(paramView1, (Rect)localObject1);
      }
      localObject1 = m;
      localRect = j;
      bool = r;
      if (bool) {
        break label300;
      }
      i3 = i1;
      label273:
      if (paramView2 != null) {
        break label306;
      }
    }
    for (;;)
    {
      localObject2 = paramView1;
      ((at.g)localObject1).a(this, paramView1, localRect, i3, i1);
      return;
      localObject1 = paramView1;
      break;
      label300:
      int i4 = 0;
      break label273;
      label306:
      i1 = 0;
    }
  }
  
  private void a(int[] paramArrayOfInt)
  {
    int i1 = 1;
    int i2 = -1;
    Object localObject = f;
    int i3 = ((ac)localObject).a();
    if (i3 == 0)
    {
      paramArrayOfInt[0] = i2;
      paramArrayOfInt[i1] = i2;
      return;
    }
    int i4 = -1 >>> 1;
    i2 = -1 << -1;
    int i5 = 0;
    label43:
    int i6;
    if (i5 < i3)
    {
      localObject = c(f.b(i5));
      boolean bool = ((at.u)localObject).b();
      if (bool) {
        break label130;
      }
      i6 = ((at.u)localObject).c();
      if (i6 < i4) {
        i4 = i6;
      }
      if (i6 <= i2) {
        break label130;
      }
    }
    for (i2 = i4;; i2 = i4)
    {
      i5 += 1;
      i4 = i2;
      i2 = i6;
      break label43;
      paramArrayOfInt[0] = i4;
      paramArrayOfInt[i1] = i2;
      break;
      label130:
      i6 = i2;
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, MotionEvent paramMotionEvent)
  {
    int i1 = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    int i2 = 0;
    at.m localm = null;
    int i3 = 0;
    at.g localg = null;
    int i4 = 0;
    float f2 = 0.0F;
    Object localObject2 = null;
    b();
    Object localObject3 = l;
    float f3;
    if (localObject3 != null)
    {
      c();
      h();
      localObject3 = "RV Scroll";
      e.a((String)localObject3);
      if (paramInt1 != 0)
      {
        localg = m;
        localObject1 = d;
        localObject3 = F;
        i3 = localg.a(paramInt1, (at.m)localObject1, (at.r)localObject3);
        i1 = paramInt1 - i3;
      }
      if (paramInt2 != 0)
      {
        localObject2 = m;
        localm = d;
        localObject3 = F;
        i4 = ((at.g)localObject2).b(paramInt2, localm, (at.r)localObject3);
        i2 = paramInt2 - i4;
      }
      e.a();
      o();
      i();
      i7 = 0;
      f3 = 0.0F;
      localObject3 = null;
      a(false);
    }
    int i7 = i2;
    i2 = i3;
    i3 = i4;
    localObject2 = o;
    boolean bool1 = ((ArrayList)localObject2).isEmpty();
    if (!bool1) {
      invalidate();
    }
    int[] arrayOfInt = az;
    localObject2 = this;
    bool1 = dispatchNestedScroll(i2, i3, i1, i7, arrayOfInt);
    h localh1;
    int i8;
    boolean bool5;
    float f4;
    boolean bool2;
    if (bool1)
    {
      int i5 = al;
      localObject1 = az;
      localObject3 = null;
      i1 = localObject1[0];
      i5 -= i1;
      al = i5;
      i5 = am;
      localObject1 = az;
      i7 = 1;
      f3 = Float.MIN_VALUE;
      i1 = localObject1[i7];
      i5 -= i1;
      am = i5;
      if (paramMotionEvent != null)
      {
        localObject2 = az;
        i5 = localObject2[0];
        f2 = i5;
        localObject1 = az;
        i7 = 1;
        f3 = Float.MIN_VALUE;
        i1 = localObject1[i7];
        f1 = i1;
        paramMotionEvent.offsetLocation(f2, f1);
      }
      localObject2 = aB;
      localObject1 = null;
      i7 = localObject2[0];
      arrayOfInt = az;
      localh1 = null;
      i8 = arrayOfInt[0];
      i7 += i8;
      localObject2[0] = i7;
      localObject2 = aB;
      i1 = 1;
      f1 = Float.MIN_VALUE;
      i7 = localObject2[i1];
      arrayOfInt = az;
      bool5 = true;
      f4 = Float.MIN_VALUE;
      i8 = arrayOfInt[bool5];
      i7 += i8;
      localObject2[i1] = i7;
      if ((i2 != 0) || (i3 != 0)) {
        m();
      }
      bool2 = awakenScrollBars();
      if (!bool2) {
        invalidate();
      }
      if ((i2 == 0) && (i3 == 0)) {
        break label998;
      }
      bool2 = true;
      f2 = Float.MIN_VALUE;
    }
    for (;;)
    {
      return bool2;
      int i6 = getOverScrollMode();
      i8 = 2;
      float f5 = 2.8E-45F;
      if (i6 == i8) {
        break;
      }
      float f6;
      h localh2;
      boolean bool6;
      float f7;
      float f8;
      int i10;
      label664:
      int i12;
      boolean bool4;
      if (paramMotionEvent != null)
      {
        f5 = paramMotionEvent.getX();
        f1 = i1;
        f4 = paramMotionEvent.getY();
        f3 = i7;
        i6 = 0;
        f2 = 0.0F;
        localObject2 = null;
        f6 = 0.0F;
        localh2 = null;
        bool6 = f1 < 0.0F;
        if (!bool6) {
          break label803;
        }
        d();
        localh2 = x;
        f7 = -f1;
        f8 = getWidth();
        f7 /= f8;
        i10 = 1065353216;
        f8 = 1.0F;
        int i11 = getHeight();
        float f9 = i11;
        f4 /= f9;
        f4 = f8 - f4;
        bool5 = localh2.a(f7, f4);
        if (bool5)
        {
          i6 = 1;
          f2 = Float.MIN_VALUE;
        }
        f4 = 0.0F;
        localh1 = null;
        bool5 = f3 < 0.0F;
        if (!bool5) {
          break label892;
        }
        f();
        localh1 = y;
        f6 = -f3;
        f7 = getHeight();
        f6 /= f7;
        i12 = getWidth();
        f7 = i12;
        f5 /= f7;
        bool4 = localh1.a(f6, f5);
        if (bool4)
        {
          i6 = 1;
          f2 = Float.MIN_VALUE;
        }
      }
      for (;;)
      {
        if (i6 == 0)
        {
          f2 = 0.0F;
          localObject2 = null;
          bool3 = f1 < 0.0F;
          if (!bool3)
          {
            f2 = 0.0F;
            localObject2 = null;
            bool3 = f3 < 0.0F;
            if (!bool3) {
              break label794;
            }
          }
        }
        w.c(this);
        label794:
        a(paramInt1, paramInt2);
        break;
        label803:
        f6 = 0.0F;
        localh2 = null;
        bool6 = f1 < 0.0F;
        if (!bool6) {
          break label664;
        }
        e();
        localh2 = z;
        i12 = getWidth();
        f7 = i12;
        f7 = f1 / f7;
        i10 = getHeight();
        f8 = i10;
        f4 /= f8;
        bool5 = localh2.a(f7, f4);
        if (!bool5) {
          break label664;
        }
        bool3 = true;
        f2 = Float.MIN_VALUE;
        break label664;
        label892:
        f4 = 0.0F;
        localh1 = null;
        bool5 = f3 < 0.0F;
        if (bool5)
        {
          g();
          localh1 = A;
          int i9 = getHeight();
          f6 = i9;
          f6 = f3 / f6;
          i12 = 1065353216;
          f7 = 1.0F;
          i10 = getWidth();
          f8 = i10;
          f5 /= f8;
          f5 = f7 - f5;
          bool4 = localh1.a(f6, f5);
          if (bool4)
          {
            bool3 = true;
            f2 = Float.MIN_VALUE;
          }
        }
      }
      label998:
      boolean bool3 = false;
      f2 = 0.0F;
      localObject2 = null;
    }
  }
  
  private boolean a(View paramView1, View paramView2, int paramInt)
  {
    boolean bool = true;
    Object localObject = null;
    Rect localRect1 = j;
    int i1 = paramView1.getWidth();
    int i2 = paramView1.getHeight();
    localRect1.set(0, 0, i1, i2);
    localRect1 = U;
    i1 = paramView2.getWidth();
    i2 = paramView2.getHeight();
    localRect1.set(0, 0, i1, i2);
    localRect1 = j;
    offsetDescendantRectToMyCoords(paramView1, localRect1);
    localRect1 = U;
    offsetDescendantRectToMyCoords(paramView2, localRect1);
    IllegalArgumentException localIllegalArgumentException;
    int i3;
    Rect localRect2;
    switch (paramInt)
    {
    default: 
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("direction must be absolute. received:");
      localObject = paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    case 17: 
      localRect1 = j;
      i3 = right;
      localRect2 = U;
      i1 = right;
      if (i3 <= i1)
      {
        localRect1 = j;
        i3 = left;
        localRect2 = U;
        i1 = right;
        if (i3 < i1) {
          break;
        }
      }
      else
      {
        localRect1 = j;
        i3 = left;
        localRect2 = U;
        i1 = left;
        if (i3 <= i1) {
          break;
        }
      }
      break;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localIllegalArgumentException = null;
      continue;
      localRect1 = j;
      i3 = left;
      localRect2 = U;
      i1 = left;
      if (i3 >= i1)
      {
        localRect1 = j;
        i3 = right;
        localRect2 = U;
        i1 = left;
        if (i3 > i1) {}
      }
      else
      {
        localRect1 = j;
        i3 = right;
        localRect2 = U;
        i1 = right;
        if (i3 < i1) {
          continue;
        }
      }
      bool = false;
      localIllegalArgumentException = null;
      continue;
      localRect1 = j;
      i3 = bottom;
      localRect2 = U;
      i1 = bottom;
      if (i3 <= i1)
      {
        localRect1 = j;
        i3 = top;
        localRect2 = U;
        i1 = bottom;
        if (i3 < i1) {}
      }
      else
      {
        localRect1 = j;
        i3 = top;
        localRect2 = U;
        i1 = top;
        if (i3 > i1) {
          continue;
        }
      }
      bool = false;
      localIllegalArgumentException = null;
      continue;
      localRect1 = j;
      i3 = top;
      localRect2 = U;
      i1 = top;
      if (i3 >= i1)
      {
        localRect1 = j;
        i3 = bottom;
        localRect2 = U;
        i1 = top;
        if (i3 > i1) {}
      }
      else
      {
        localRect1 = j;
        i3 = bottom;
        localRect2 = U;
        i1 = bottom;
        if (i3 < i1) {
          continue;
        }
      }
      bool = false;
      localIllegalArgumentException = null;
    }
  }
  
  private at.u b(int paramInt)
  {
    Object localObject1 = null;
    boolean bool1 = w;
    if (bool1) {}
    int i3;
    Object localObject2;
    label30:
    do
    {
      return (at.u)localObject1;
      int i2 = f.b();
      i3 = 0;
      bool1 = false;
      localObject2 = null;
      if (i3 >= i2) {
        break;
      }
      localObject1 = c(f.c(i3));
      if (localObject1 == null) {
        break label122;
      }
      boolean bool2 = ((at.u)localObject1).m();
      if (bool2) {
        break label122;
      }
      int i4 = c((at.u)localObject1);
      if (i4 != paramInt) {
        break label122;
      }
      localObject2 = f;
      View localView = a;
      bool1 = ((ac)localObject2).d(localView);
    } while (!bool1);
    for (;;)
    {
      int i1 = i3 + 1;
      i3 = i1;
      localObject2 = localObject1;
      break label30;
      localObject1 = localObject2;
      break;
      label122:
      localObject1 = localObject2;
    }
  }
  
  static void b(at.u paramu)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = (View)b.get();
      if (localObject == null) {
        break label62;
      }
      View localView = a;
      if (localObject != localView) {
        break label35;
      }
    }
    for (;;)
    {
      return;
      label35:
      localObject = ((View)localObject).getParent();
      boolean bool = localObject instanceof View;
      if (bool)
      {
        localObject = (View)localObject;
        break;
      }
      localObject = null;
      break;
      label62:
      b = null;
    }
  }
  
  static at.u c(View paramView)
  {
    if (paramView == null) {}
    for (at.u localu = null;; localu = getLayoutParamsc) {
      return localu;
    }
  }
  
  public static int d(View paramView)
  {
    at.u localu = c(paramView);
    if (localu != null) {}
    for (int i1 = localu.c();; i1 = -1) {
      return i1;
    }
  }
  
  private long d(at.u paramu)
  {
    at.a locala = l;
    boolean bool = e;
    if (bool) {}
    int i1;
    for (long l1 = e;; l1 = i1)
    {
      return l1;
      i1 = c;
    }
  }
  
  static at f(View paramView)
  {
    boolean bool = paramView instanceof ViewGroup;
    if (!bool) {
      paramView = null;
    }
    for (;;)
    {
      return paramView;
      bool = paramView instanceof at;
      if (bool)
      {
        paramView = (at)paramView;
      }
      else
      {
        paramView = (ViewGroup)paramView;
        int i2 = paramView.getChildCount();
        bool = false;
        at localat = null;
        int i1;
        for (int i3 = 0;; i3 = i1)
        {
          if (i3 >= i2) {
            break label83;
          }
          localat = f(paramView.getChildAt(i3));
          if (localat != null)
          {
            paramView = localat;
            break;
          }
          i1 = i3 + 1;
        }
        label83:
        paramView = null;
      }
    }
  }
  
  private float getScrollFactor()
  {
    float f1 = ar;
    boolean bool1 = true;
    float f2 = Float.MIN_VALUE;
    boolean bool2 = f1 < f2;
    TypedValue localTypedValue;
    if (!bool2)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      Object localObject = getContext().getTheme();
      int i1 = 16842829;
      boolean bool3 = true;
      bool1 = ((Resources.Theme)localObject).resolveAttribute(i1, localTypedValue, bool3);
      if (bool1)
      {
        localObject = getContext().getResources().getDisplayMetrics();
        f1 = localTypedValue.getDimension((DisplayMetrics)localObject);
        ar = f1;
      }
    }
    else
    {
      f1 = ar;
    }
    for (;;)
    {
      return f1;
      bool2 = false;
      f1 = 0.0F;
      localTypedValue = null;
    }
  }
  
  private p getScrollingChildHelper()
  {
    p localp = ay;
    if (localp == null)
    {
      localp = new android/support/v4/h/p;
      localp.<init>(this);
      ay = localp;
    }
    return ay;
  }
  
  private void q()
  {
    setScrollState(0);
    r();
  }
  
  private void r()
  {
    C.b();
    at.g localg = m;
    if (localg != null)
    {
      localg = m;
      localg.q();
    }
  }
  
  private void s()
  {
    A = null;
    y = null;
    z = null;
    x = null;
  }
  
  private void t()
  {
    Object localObject = ai;
    if (localObject != null)
    {
      localObject = ai;
      ((VelocityTracker)localObject).clear();
    }
    stopNestedScroll();
    boolean bool1 = false;
    localObject = null;
    h localh = x;
    if (localh != null)
    {
      localObject = x;
      bool1 = ((h)localObject).b();
    }
    localh = y;
    boolean bool2;
    if (localh != null)
    {
      localh = y;
      bool2 = localh.b();
      bool1 |= bool2;
    }
    localh = z;
    if (localh != null)
    {
      localh = z;
      bool2 = localh.b();
      bool1 |= bool2;
    }
    localh = A;
    if (localh != null)
    {
      localh = A;
      bool2 = localh.b();
      bool1 |= bool2;
    }
    if (bool1) {
      w.c(this);
    }
  }
  
  private void u()
  {
    t();
    setScrollState(0);
  }
  
  private boolean v()
  {
    int i1 = ae;
    if (i1 > 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  private boolean w()
  {
    Object localObject = B;
    boolean bool;
    if (localObject != null)
    {
      localObject = m;
      bool = ((at.g)localObject).c();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  private void x()
  {
    boolean bool1 = true;
    boolean bool2 = w;
    Object localObject1;
    if (bool2)
    {
      e.a();
      localObject1 = m;
      ((at.g)localObject1).a();
    }
    bool2 = w();
    label65:
    boolean bool3;
    Object localObject2;
    if (bool2)
    {
      localObject1 = e;
      ((f)localObject1).b();
      bool2 = G;
      if (!bool2)
      {
        bool2 = H;
        if (!bool2) {
          break label230;
        }
      }
      bool2 = bool1;
      at.r localr = F;
      bool3 = r;
      if (!bool3) {
        break label237;
      }
      localObject2 = B;
      if (localObject2 == null) {
        break label237;
      }
      bool3 = w;
      if ((!bool3) && (!bool2))
      {
        localObject2 = m;
        bool3 = u;
        if (!bool3) {
          break label237;
        }
      }
      bool3 = w;
      if (bool3)
      {
        localObject2 = l;
        bool3 = e;
        if (!bool3) {
          break label237;
        }
      }
      bool3 = bool1;
      label158:
      j = bool3;
      localObject2 = F;
      localr = F;
      boolean bool4 = j;
      if ((!bool4) || (!bool2)) {
        break label246;
      }
      bool2 = w;
      if (bool2) {
        break label246;
      }
      bool2 = w();
      if (!bool2) {
        break label246;
      }
    }
    for (;;)
    {
      k = bool1;
      return;
      localObject1 = e;
      ((f)localObject1).e();
      break;
      label230:
      bool2 = false;
      localObject1 = null;
      break label65;
      label237:
      bool3 = false;
      localObject2 = null;
      break label158;
      label246:
      bool1 = false;
    }
  }
  
  private void y()
  {
    Object localObject1 = l;
    if (localObject1 == null)
    {
      localObject1 = "RecyclerView";
      localObject2 = "No adapter attached; skipping layout";
      Log.e((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = m;
      if (localObject1 != null) {
        break;
      }
      localObject1 = "RecyclerView";
      localObject2 = "No layout manager attached; skipping layout";
      Log.e((String)localObject1, (String)localObject2);
    }
    localObject1 = F;
    Object localObject2 = null;
    i = false;
    localObject1 = F;
    int i1 = d;
    int i9 = 1;
    boolean bool2;
    Object localObject4;
    boolean bool12;
    at.e.b localb;
    int i12;
    int i3;
    label568:
    label633:
    Object localObject5;
    if (i1 == i9)
    {
      B();
      localObject1 = m;
      ((at.g)localObject1).b(this);
      C();
      F.a(4);
      c();
      h();
      localObject1 = F;
      i9 = 1;
      d = i9;
      localObject1 = F;
      boolean bool1 = j;
      if (!bool1) {
        break label826;
      }
      localObject1 = f;
      int i2 = ((ac)localObject1).a() + -1;
      i11 = i2;
      if (i11 < 0) {
        break label811;
      }
      localObject1 = f.b(i11);
      localObject3 = c((View)localObject1);
      bool2 = ((at.u)localObject3).b();
      if (!bool2)
      {
        l1 = d((at.u)localObject3);
        localObject1 = new android/support/v7/widget/at$e$b;
        ((at.e.b)localObject1).<init>();
        localObject2 = ((at.e.b)localObject1).a((at.u)localObject3);
        localObject1 = (at.u)g.b.a(l1);
        if (localObject1 == null) {
          break label796;
        }
        boolean bool11 = ((at.u)localObject1).b();
        if (bool11) {
          break label796;
        }
        bj localbj1 = g;
        bool11 = localbj1.a((at.u)localObject1);
        localObject4 = g;
        bool12 = ((bj)localObject4).a((at.u)localObject3);
        if ((bool11) && (localObject1 == localObject3)) {
          break label796;
        }
        localb = g.a((at.u)localObject1, 4);
        bj localbj2 = g;
        localbj2.b((at.u)localObject3, (at.e.b)localObject2);
        localObject2 = g;
        int i13 = 8;
        localObject2 = ((bj)localObject2).a((at.u)localObject3, i13);
        if (localb != null) {
          break label698;
        }
        i12 = f.a();
        i9 = 0;
        localObject2 = null;
      }
    }
    else
    {
      for (;;)
      {
        if (i9 >= i12) {
          break label633;
        }
        localObject4 = c(f.b(i9));
        if (localObject4 != localObject3)
        {
          long l2 = d((at.u)localObject4);
          boolean bool13 = l2 < l1;
          if (!bool13)
          {
            localObject1 = l;
            if (localObject1 != null)
            {
              localObject1 = l;
              bool2 = e;
              if (bool2)
              {
                localObject1 = new java/lang/IllegalStateException;
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                localObject2 = localObject4 + " \n View Holder 2:" + localObject3;
                ((IllegalStateException)localObject1).<init>((String)localObject2);
                throw ((Throwable)localObject1);
                localObject1 = e;
                localObject2 = b;
                boolean bool8 = ((ArrayList)localObject2).isEmpty();
                if (!bool8)
                {
                  localObject1 = a;
                  bool2 = ((ArrayList)localObject1).isEmpty();
                  if (!bool2) {
                    bool2 = true;
                  }
                }
                for (;;)
                {
                  if (!bool2)
                  {
                    localObject1 = m;
                    i3 = D;
                    i10 = getWidth();
                    if (i3 == i10)
                    {
                      localObject1 = m;
                      i3 = E;
                      i10 = getHeight();
                      if (i3 == i10) {
                        break label568;
                      }
                    }
                  }
                  localObject1 = m;
                  ((at.g)localObject1).b(this);
                  C();
                  break;
                  i3 = 0;
                  localObject1 = null;
                }
                localObject1 = m;
                ((at.g)localObject1).b(this);
                break;
              }
            }
            localObject1 = new java/lang/IllegalStateException;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
            localObject2 = localObject4 + " \n View Holder 2:" + localObject3;
            ((IllegalStateException)localObject1).<init>((String)localObject2);
            throw ((Throwable)localObject1);
          }
        }
        i10 += 1;
      }
      localObject2 = "RecyclerView";
      localObject5 = new java/lang/StringBuilder;
      String str = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder ";
      ((StringBuilder)localObject5).<init>(str);
      localObject1 = ((StringBuilder)localObject5).append(localObject1);
      localObject5 = " cannot be found but it is necessary for ";
      localObject1 = (String)localObject5 + localObject3;
      Log.e((String)localObject2, (String)localObject1);
    }
    for (;;)
    {
      i3 = i11 + -1;
      i11 = i3;
      break;
      label698:
      localObject5 = null;
      ((at.u)localObject1).a(false);
      if (i12 != 0) {
        a((at.u)localObject1);
      }
      if (localObject1 != localObject3)
      {
        if (bool12) {
          a((at.u)localObject3);
        }
        h = ((at.u)localObject3);
        a((at.u)localObject1);
        d.b((at.u)localObject1);
        localObject5 = null;
        ((at.u)localObject3).a(false);
        i = ((at.u)localObject1);
      }
      localObject5 = B;
      bool3 = ((at.e)localObject5).a((at.u)localObject1, (at.u)localObject3, localb, (at.e.b)localObject2);
      if (bool3)
      {
        k();
        continue;
        label796:
        localObject1 = g;
        ((bj)localObject1).b((at.u)localObject3, (at.e.b)localObject2);
      }
    }
    label811:
    localObject1 = g;
    localObject2 = aD;
    ((bj)localObject1).a((bj.b)localObject2);
    label826:
    localObject1 = m;
    localObject2 = d;
    ((at.g)localObject1).b((at.m)localObject2);
    localObject1 = F;
    int i10 = F.e;
    b = i10;
    boolean bool3 = false;
    w = false;
    F.j = false;
    F.k = false;
    localObject1 = m;
    i10 = 0;
    localObject2 = null;
    u = false;
    localObject1 = d.b;
    if (localObject1 != null)
    {
      localObject1 = d.b;
      ((ArrayList)localObject1).clear();
    }
    localObject1 = m;
    bool3 = A;
    if (bool3)
    {
      m.z = 0;
      localObject1 = m;
      i10 = 0;
      localObject2 = null;
      A = false;
      localObject1 = d;
      ((at.m)localObject1).b();
    }
    localObject1 = m;
    localObject2 = F;
    ((at.g)localObject1).a((at.r)localObject2);
    i();
    a(false);
    g.a();
    localObject1 = ax;
    int i4 = localObject1[0];
    localObject2 = ax;
    i10 = localObject2[1];
    Object localObject6 = ax;
    a((int[])localObject6);
    localObject6 = ax;
    Object localObject3 = null;
    int i11 = localObject6[0];
    label1073:
    boolean bool5;
    if (i11 == i4)
    {
      localObject1 = ax;
      i11 = 1;
      i4 = localObject1[i11];
      if (i4 == i10) {}
    }
    else
    {
      i4 = 1;
      if (i4 != 0) {
        m();
      }
      boolean bool4 = as;
      if (bool4)
      {
        localObject1 = l;
        if (localObject1 != null)
        {
          bool4 = hasFocus();
          if (bool4)
          {
            int i5 = getDescendantFocusability();
            i10 = 393216;
            if (i5 != i10)
            {
              i5 = getDescendantFocusability();
              i10 = 131072;
              if (i5 != i10) {
                break label1163;
              }
              bool5 = isFocused();
              if (!bool5) {
                break label1163;
              }
            }
          }
        }
      }
    }
    label1163:
    label1229:
    do
    {
      for (;;)
      {
        z();
        break;
        bool5 = false;
        localObject1 = null;
        break label1073;
        bool5 = isFocused();
        if (bool5) {
          break label1244;
        }
        localObject1 = getFocusedChild();
        bool9 = Q;
        if (!bool9) {
          break label1229;
        }
        localObject2 = ((View)localObject1).getParent();
        if (localObject2 != null)
        {
          bool9 = ((View)localObject1).hasFocus();
          if (bool9) {
            break label1229;
          }
        }
        localObject1 = f;
        int i6 = ((ac)localObject1).a();
        if (i6 != 0) {
          break label1244;
        }
        requestFocus();
      }
      localObject2 = f;
      bool6 = ((ac)localObject2).d((View)localObject1);
    } while (!bool6);
    label1244:
    boolean bool6 = false;
    localObject1 = null;
    localObject2 = F;
    long l3 = m;
    long l1 = -1;
    boolean bool9 = l3 < l1;
    if (bool9)
    {
      localObject2 = l;
      bool9 = e;
      if (bool9)
      {
        long l4 = F.m;
        localObject1 = a(l4);
      }
    }
    bool9 = false;
    localObject2 = null;
    boolean bool10;
    if (localObject1 != null)
    {
      localObject6 = f;
      localObject3 = a;
      bool10 = ((ac)localObject6).d((View)localObject3);
      if (!bool10)
      {
        localObject6 = a;
        bool10 = ((View)localObject6).hasFocusable();
        if (bool10) {
          break label1446;
        }
      }
    }
    localObject1 = f;
    int i7 = ((ac)localObject1).a();
    if (i7 > 0) {
      localObject2 = A();
    }
    label1379:
    if (localObject2 != null)
    {
      localObject1 = F;
      l3 = n;
      l1 = -1;
      boolean bool7 = l3 < l1;
      if (!bool7) {
        break label1454;
      }
      int i8 = F.n;
      localObject1 = ((View)localObject2).findViewById(i8);
      if (localObject1 == null) {
        break label1454;
      }
      bool10 = ((View)localObject1).isFocusable();
      if (!bool10) {
        break label1454;
      }
    }
    for (;;)
    {
      ((View)localObject1).requestFocus();
      break;
      label1446:
      localObject2 = a;
      break label1379;
      break;
      label1454:
      localObject1 = localObject2;
    }
  }
  
  private void z()
  {
    int i1 = -1;
    F.m = -1;
    F.l = i1;
    F.n = i1;
  }
  
  public final at.u a(View paramView)
  {
    Object localObject1 = paramView.getParent();
    if ((localObject1 != null) && (localObject1 != this))
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("View ");
      localObject2 = paramView + " is not a direct child of " + this;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return c(paramView);
  }
  
  final void a()
  {
    Object localObject = B;
    if (localObject != null)
    {
      localObject = B;
      ((at.e)localObject).d();
    }
    localObject = m;
    if (localObject != null)
    {
      localObject = m;
      at.m localm = d;
      ((at.g)localObject).c(localm);
      localObject = m;
      localm = d;
      ((at.g)localObject).b(localm);
    }
    d.a();
  }
  
  final void a(int paramInt)
  {
    at.g localg = m;
    if (localg == null) {}
    for (;;)
    {
      return;
      localg = m;
      localg.b(paramInt);
      awakenScrollBars();
    }
  }
  
  final void a(int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    h localh1 = null;
    h localh2 = x;
    boolean bool2;
    if (localh2 != null)
    {
      localh2 = x;
      bool2 = localh2.a();
      if ((!bool2) && (paramInt1 > 0))
      {
        localh1 = x;
        bool1 = localh1.b();
      }
    }
    localh2 = z;
    if (localh2 != null)
    {
      localh2 = z;
      bool2 = localh2.a();
      if ((!bool2) && (paramInt1 < 0))
      {
        localh2 = z;
        bool2 = localh2.b();
        bool1 |= bool2;
      }
    }
    localh2 = y;
    if (localh2 != null)
    {
      localh2 = y;
      bool2 = localh2.a();
      if ((!bool2) && (paramInt2 > 0))
      {
        localh2 = y;
        bool2 = localh2.b();
        bool1 |= bool2;
      }
    }
    localh2 = A;
    if (localh2 != null)
    {
      localh2 = A;
      bool2 = localh2.a();
      if ((!bool2) && (paramInt2 < 0))
      {
        localh2 = A;
        bool2 = localh2.b();
        bool1 |= bool2;
      }
    }
    if (bool1) {
      w.c(this);
    }
  }
  
  final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i1 = 8;
    boolean bool1 = true;
    int i2 = paramInt1 + paramInt2;
    int i3 = f.b();
    int i4 = 0;
    Object localObject1 = null;
    int i5;
    if (i4 < i3)
    {
      Object localObject2 = c(f.c(i4));
      if (localObject2 != null)
      {
        boolean bool2 = ((at.u)localObject2).b();
        if (!bool2)
        {
          i5 = c;
          if (i5 < i2) {
            break label113;
          }
          i5 = -paramInt2;
          ((at.u)localObject2).a(i5, paramBoolean);
          localObject2 = F;
          f = bool1;
        }
      }
      for (;;)
      {
        i4 += 1;
        break;
        label113:
        i5 = c;
        if (i5 >= paramInt1)
        {
          i5 = paramInt1 + -1;
          int i6 = -paramInt2;
          ((at.u)localObject2).b(i1);
          ((at.u)localObject2).a(i6, paramBoolean);
          c = i5;
          localObject2 = F;
          f = bool1;
        }
      }
    }
    at.m localm = d;
    int i7 = paramInt1 + paramInt2;
    localObject1 = c;
    i4 = ((ArrayList)localObject1).size() + -1;
    i2 = i4;
    if (i2 >= 0)
    {
      localObject1 = (at.u)c.get(i2);
      if (localObject1 != null)
      {
        i5 = c;
        if (i5 < i7) {
          break label268;
        }
        i5 = -paramInt2;
        ((at.u)localObject1).a(i5, paramBoolean);
      }
      for (;;)
      {
        i4 = i2 + -1;
        i2 = i4;
        break;
        label268:
        i5 = c;
        if (i5 >= paramInt1)
        {
          ((at.u)localObject1).b(i1);
          localm.c(i2);
        }
      }
    }
    requestLayout();
  }
  
  final void a(at.u paramu)
  {
    int i1 = -1;
    boolean bool1 = true;
    View localView = a;
    Object localObject1 = localView.getParent();
    boolean bool2;
    Object localObject2;
    if (localObject1 == this)
    {
      bool2 = bool1;
      localObject2 = d;
      at.u localu = a(localView);
      ((at.m)localObject2).b(localu);
      boolean bool3 = paramu.n();
      if (!bool3) {
        break label92;
      }
      localObject1 = f;
      localObject2 = localView.getLayoutParams();
      ((ac)localObject1).a(localView, i1, (ViewGroup.LayoutParams)localObject2, bool1);
    }
    for (;;)
    {
      return;
      bool2 = false;
      localObject1 = null;
      break;
      label92:
      if (!bool2)
      {
        localObject1 = f;
        ((ac)localObject1).a(localView, i1, bool1);
      }
      else
      {
        localObject1 = f;
        Object localObject3 = a;
        int i2 = ((ac.b)localObject3).a(localView);
        if (i2 < 0)
        {
          localObject1 = new java/lang/IllegalArgumentException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("view is not a child, cannot hide ");
          localObject3 = localView;
          ((IllegalArgumentException)localObject1).<init>((String)localObject3);
          throw ((Throwable)localObject1);
        }
        localObject2 = b;
        ((ac.a)localObject2).a(i2);
        ((ac)localObject1).a(localView);
      }
    }
  }
  
  final void a(at.u paramu, at.e.b paramb)
  {
    int i1 = 8192;
    paramu.a(0, i1);
    at.r localr = F;
    boolean bool = h;
    if (bool)
    {
      bool = paramu.s();
      if (bool)
      {
        bool = paramu.m();
        if (!bool)
        {
          bool = paramu.b();
          if (!bool)
          {
            long l1 = d(paramu);
            bj localbj = g;
            localbj.a(l1, paramu);
          }
        }
      }
    }
    g.a(paramu, paramb);
  }
  
  final void a(String paramString)
  {
    boolean bool = v();
    Object localObject;
    if (bool)
    {
      if (paramString == null)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("Cannot call this method while RecyclerView is computing a layout or scrolling");
        throw ((Throwable)localObject);
      }
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>(paramString);
      throw ((Throwable)localObject);
    }
    int i1 = af;
    if (i1 > 0)
    {
      localObject = "RecyclerView";
      String str1 = "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.";
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      String str2 = "";
      localIllegalStateException.<init>(str2);
      Log.w((String)localObject, str1, localIllegalStateException);
    }
  }
  
  final void a(boolean paramBoolean)
  {
    int i1 = 1;
    int i2 = aa;
    if (i2 <= 0) {
      aa = i1;
    }
    if (!paramBoolean) {
      s = false;
    }
    i2 = aa;
    if (i2 == i1)
    {
      if (paramBoolean)
      {
        bool = s;
        if (bool)
        {
          bool = t;
          if (!bool)
          {
            Object localObject = m;
            if (localObject != null)
            {
              localObject = l;
              if (localObject != null) {
                y();
              }
            }
          }
        }
      }
      boolean bool = t;
      if (!bool) {
        s = false;
      }
    }
    int i3 = aa + -1;
    aa = i3;
  }
  
  final boolean a(at.u paramu, int paramInt)
  {
    boolean bool = v();
    View localView;
    if (bool)
    {
      l = paramInt;
      K.add(paramu);
      bool = false;
      localView = null;
    }
    for (;;)
    {
      return bool;
      localView = a;
      w.c(localView, paramInt);
      bool = true;
    }
  }
  
  public void addFocusables(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    super.addFocusables(paramArrayList, paramInt1, paramInt2);
  }
  
  public final View b(View paramView)
  {
    Object localObject1 = paramView.getParent();
    Object localObject2 = paramView;
    while ((localObject1 != null) && (localObject1 != this))
    {
      boolean bool = localObject1 instanceof View;
      if (!bool) {
        break;
      }
      localObject1 = (View)localObject1;
      ViewParent localViewParent = ((View)localObject1).getParent();
      localObject2 = localObject1;
      localObject1 = localViewParent;
    }
    if (localObject1 == this) {}
    for (localObject1 = localObject2;; localObject1 = null) {
      return (View)localObject1;
    }
  }
  
  final void b()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject = null;
    int i1 = r;
    if (i1 != 0)
    {
      i1 = w;
      if (i1 == 0) {}
    }
    else
    {
      localObject = "RV FullInvalidate";
      e.a((String)localObject);
      y();
      e.a();
    }
    for (;;)
    {
      return;
      f localf = e;
      i1 = localf.d();
      if (i1 != 0)
      {
        localf = e;
        int i3 = 4;
        i1 = localf.a(i3);
        if (i1 != 0)
        {
          localf = e;
          i3 = 11;
          i1 = localf.a(i3);
          if (i1 == 0)
          {
            e.a("RV PartialInvalidate");
            c();
            h();
            localf = e;
            localf.b();
            i1 = s;
            if (i1 == 0)
            {
              i3 = f.a();
              i1 = 0;
              localf = null;
              label160:
              if (i1 < i3)
              {
                at.u localu = c(f.b(i1));
                if (localu == null) {
                  break label235;
                }
                boolean bool3 = localu.b();
                if (bool3) {
                  break label235;
                }
                boolean bool4 = localu.s();
                if (!bool4) {
                  break label235;
                }
                bool2 = bool1;
              }
              if (!bool2) {
                break label244;
              }
              y();
            }
            for (;;)
            {
              a(bool1);
              i();
              e.a();
              break;
              label235:
              int i2;
              i1 += 1;
              break label160;
              label244:
              localObject = e;
              ((f)localObject).c();
            }
          }
        }
        localObject = e;
        bool2 = ((f)localObject).d();
        if (bool2)
        {
          localObject = "RV FullInvalidate";
          e.a((String)localObject);
          y();
          e.a();
        }
      }
    }
  }
  
  final void b(int paramInt1, int paramInt2)
  {
    int i1 = getPaddingLeft();
    int i2 = getPaddingRight();
    i1 += i2;
    i2 = w.q(this);
    i1 = at.g.a(paramInt1, i1, i2);
    i2 = getPaddingTop();
    int i3 = getPaddingBottom();
    i2 += i3;
    i3 = w.r(this);
    i2 = at.g.a(paramInt2, i2, i3);
    setMeasuredDimension(i1, i2);
  }
  
  final int c(at.u paramu)
  {
    int i1 = -1;
    boolean bool = paramu.a(524);
    int i3;
    if (!bool)
    {
      bool = paramu.l();
      if (bool) {}
    }
    else
    {
      i3 = i1;
    }
    f localf;
    int i4;
    int i5;
    label59:
    do
    {
      return i3;
      localf = e;
      i3 = c;
      i4 = a.size();
      bool = false;
      localb = null;
      i5 = 0;
    } while (i5 >= i4);
    f.b localb = (f.b)a.get(i5);
    int i6 = a;
    switch (i6)
    {
    }
    for (;;)
    {
      int i2 = i5 + 1;
      i5 = i2;
      break label59;
      i6 = b;
      if (i6 <= i3)
      {
        i2 = d;
        i3 += i2;
        continue;
        i6 = b;
        if (i6 <= i3)
        {
          i6 = b;
          int i7 = d;
          i6 += i7;
          if (i6 > i3)
          {
            i3 = i1;
            break;
          }
          i2 = d;
          i3 -= i2;
          continue;
          i6 = b;
          if (i6 == i3)
          {
            i3 = d;
          }
          else
          {
            i6 = b;
            if (i6 < i3) {
              i3 += -1;
            }
            i2 = d;
            if (i2 <= i3) {
              i3 += 1;
            }
          }
        }
      }
    }
  }
  
  final void c()
  {
    int i1 = aa + 1;
    aa = i1;
    i1 = aa;
    int i2 = 1;
    if (i1 == i2)
    {
      boolean bool = t;
      if (!bool)
      {
        bool = false;
        s = false;
      }
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof at.h;
    at.g localg;
    if (bool)
    {
      localg = m;
      paramLayoutParams = (at.h)paramLayoutParams;
      bool = localg.a(paramLayoutParams);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localg = null;
    }
  }
  
  public int computeHorizontalScrollExtent()
  {
    int i1 = 0;
    at.g localg = null;
    Object localObject = m;
    if (localObject == null) {}
    for (;;)
    {
      return i1;
      localObject = m;
      boolean bool = ((at.g)localObject).e();
      if (bool)
      {
        localg = m;
        localObject = F;
        i1 = localg.d((at.r)localObject);
      }
    }
  }
  
  public int computeHorizontalScrollOffset()
  {
    int i1 = 0;
    at.g localg = null;
    Object localObject = m;
    if (localObject == null) {}
    for (;;)
    {
      return i1;
      localObject = m;
      boolean bool = ((at.g)localObject).e();
      if (bool)
      {
        localg = m;
        localObject = F;
        i1 = localg.b((at.r)localObject);
      }
    }
  }
  
  public int computeHorizontalScrollRange()
  {
    int i1 = 0;
    at.g localg = null;
    Object localObject = m;
    if (localObject == null) {}
    for (;;)
    {
      return i1;
      localObject = m;
      boolean bool = ((at.g)localObject).e();
      if (bool)
      {
        localg = m;
        localObject = F;
        i1 = localg.f((at.r)localObject);
      }
    }
  }
  
  public int computeVerticalScrollExtent()
  {
    int i1 = 0;
    at.g localg = null;
    Object localObject = m;
    if (localObject == null) {}
    for (;;)
    {
      return i1;
      localObject = m;
      boolean bool = ((at.g)localObject).f();
      if (bool)
      {
        localg = m;
        localObject = F;
        i1 = localg.e((at.r)localObject);
      }
    }
  }
  
  public int computeVerticalScrollOffset()
  {
    int i1 = 0;
    at.g localg = null;
    Object localObject = m;
    if (localObject == null) {}
    for (;;)
    {
      return i1;
      localObject = m;
      boolean bool = ((at.g)localObject).f();
      if (bool)
      {
        localg = m;
        localObject = F;
        i1 = localg.c((at.r)localObject);
      }
    }
  }
  
  public int computeVerticalScrollRange()
  {
    int i1 = 0;
    at.g localg = null;
    Object localObject = m;
    if (localObject == null) {}
    for (;;)
    {
      return i1;
      localObject = m;
      boolean bool = ((at.g)localObject).f();
      if (bool)
      {
        localg = m;
        localObject = F;
        i1 = localg.g((at.r)localObject);
      }
    }
  }
  
  final void d()
  {
    h localh = x;
    if (localh != null) {}
    for (;;)
    {
      return;
      localh = new android/support/v4/widget/h;
      Context localContext = getContext();
      localh.<init>(localContext);
      x = localh;
      boolean bool = h;
      int i1;
      int i2;
      if (bool)
      {
        localh = x;
        i1 = getMeasuredHeight();
        i2 = getPaddingTop();
        i1 -= i2;
        i2 = getPaddingBottom();
        i1 -= i2;
        i2 = getMeasuredWidth();
        int i3 = getPaddingLeft();
        i2 -= i3;
        i3 = getPaddingRight();
        i2 -= i3;
        localh.a(i1, i2);
      }
      else
      {
        localh = x;
        i1 = getMeasuredHeight();
        i2 = getMeasuredWidth();
        localh.a(i1, i2);
      }
    }
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return getScrollingChildHelper().a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return getScrollingChildHelper().a(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return getScrollingChildHelper().a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  protected void dispatchRestoreInstanceState(SparseArray paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  protected void dispatchSaveInstanceState(SparseArray paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
  
  public void draw(Canvas paramCanvas)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    int i2 = 0;
    Object localObject1 = null;
    super.draw(paramCanvas);
    int i3 = o.size();
    int i7 = 0;
    h localh1 = null;
    float f2 = 0.0F;
    Object localObject2;
    while (i7 < i3)
    {
      localObject2 = o;
      ((ArrayList)localObject2).get(i7);
      i7 += 1;
    }
    localh1 = x;
    int i11;
    float f3;
    int i9;
    if (localh1 != null)
    {
      localh1 = x;
      boolean bool5 = localh1.a();
      if (!bool5)
      {
        i3 = paramCanvas.save();
        bool5 = h;
        if (bool5)
        {
          int i8 = getPaddingBottom();
          paramCanvas.rotate(270.0F);
          i11 = -getHeight();
          i8 += i11;
          f2 = i8;
          i11 = 0;
          f3 = 0.0F;
          localObject2 = null;
          paramCanvas.translate(f2, 0.0F);
          localh1 = x;
          if (localh1 == null) {
            break label710;
          }
          localh1 = x;
          i9 = localh1.a(paramCanvas);
          if (i9 == 0) {
            break label710;
          }
          i9 = i1;
          f2 = f1;
          label194:
          paramCanvas.restoreToCount(i3);
        }
      }
    }
    for (;;)
    {
      h localh2 = y;
      float f4;
      int i14;
      float f5;
      boolean bool3;
      if (localh2 != null)
      {
        localh2 = y;
        boolean bool2 = localh2.a();
        if (!bool2)
        {
          i11 = paramCanvas.save();
          bool2 = h;
          if (bool2)
          {
            int i4 = getPaddingLeft();
            f4 = i4;
            i14 = getPaddingTop();
            f5 = i14;
            paramCanvas.translate(f4, f5);
          }
          localh2 = y;
          if (localh2 == null) {
            break label722;
          }
          localh2 = y;
          bool3 = localh2.a(paramCanvas);
          if (!bool3) {
            break label722;
          }
          bool3 = i1;
          f4 = f1;
          label312:
          i9 |= bool3;
          paramCanvas.restoreToCount(i11);
        }
      }
      localh2 = z;
      label383:
      int i15;
      boolean bool4;
      if (localh2 != null)
      {
        localh2 = z;
        bool3 = localh2.a();
        if (!bool3)
        {
          i11 = paramCanvas.save();
          i14 = getWidth();
          bool3 = h;
          if (!bool3) {
            break label734;
          }
          int i5 = getPaddingTop();
          i15 = 1119092736;
          float f6 = 90.0F;
          paramCanvas.rotate(f6);
          i5 = -i5;
          f4 = i5;
          i14 = -i14;
          f5 = i14;
          paramCanvas.translate(f4, f5);
          localh2 = z;
          if (localh2 == null) {
            break label746;
          }
          localh2 = z;
          bool4 = localh2.a(paramCanvas);
          if (!bool4) {
            break label746;
          }
          bool4 = i1;
          f4 = f1;
          label463:
          i9 |= bool4;
          paramCanvas.restoreToCount(i11);
        }
      }
      localh2 = A;
      int i6;
      if (localh2 != null)
      {
        localh2 = A;
        bool4 = localh2.a();
        if (!bool4)
        {
          i6 = paramCanvas.save();
          f3 = 180.0F;
          paramCanvas.rotate(f3);
          boolean bool6 = h;
          if (!bool6) {
            break label758;
          }
          int i12 = -getWidth();
          i14 = getPaddingRight();
          i12 += i14;
          f3 = i12;
          i14 = -getHeight();
          i15 = getPaddingBottom();
          i14 += i15;
          f5 = i14;
          paramCanvas.translate(f3, f5);
          label591:
          localObject2 = A;
          if (localObject2 != null)
          {
            localObject2 = A;
            boolean bool7 = ((h)localObject2).a(paramCanvas);
            if (bool7) {
              i2 = i1;
            }
          }
          i9 |= i2;
          paramCanvas.restoreToCount(i6);
        }
      }
      if (i9 == 0)
      {
        localObject1 = B;
        if (localObject1 != null)
        {
          localObject1 = o;
          i2 = ((ArrayList)localObject1).size();
          if (i2 > 0)
          {
            localObject1 = B;
            boolean bool1 = ((at.e)localObject1).b();
            if (!bool1) {}
          }
        }
      }
      for (;;)
      {
        if (i1 != 0) {
          w.c(this);
        }
        return;
        i10 = 0;
        localh1 = null;
        f2 = 0.0F;
        break;
        label710:
        i10 = 0;
        localh1 = null;
        f2 = 0.0F;
        break label194;
        label722:
        i6 = 0;
        localh2 = null;
        f4 = 0.0F;
        break label312;
        label734:
        i6 = 0;
        localh2 = null;
        f4 = 0.0F;
        break label383;
        label746:
        i6 = 0;
        localh2 = null;
        f4 = 0.0F;
        break label463;
        label758:
        int i13 = -getWidth();
        f3 = i13;
        i14 = -getHeight();
        f5 = i14;
        paramCanvas.translate(f3, f5);
        break label591;
        i1 = i10;
      }
      int i10 = 0;
      localh1 = null;
      f2 = 0.0F;
    }
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  final Rect e(View paramView)
  {
    Object localObject1 = (at.h)paramView.getLayoutParams();
    boolean bool = e;
    if (!bool) {
      localObject1 = d;
    }
    for (;;)
    {
      return (Rect)localObject1;
      Object localObject2 = F;
      bool = g;
      if (bool)
      {
        localObject2 = c;
        bool = ((at.u)localObject2).s();
        if (!bool)
        {
          localObject2 = c;
          bool = ((at.u)localObject2).j();
          if (!bool) {}
        }
        else
        {
          localObject1 = d;
          continue;
        }
      }
      Rect localRect1 = d;
      localRect1.set(0, 0, 0, 0);
      localObject2 = o;
      int i2 = ((ArrayList)localObject2).size();
      int i1;
      for (int i3 = 0; i3 < i2; i3 = i1)
      {
        j.set(0, 0, 0, 0);
        o.get(i3);
        Rect localRect2 = j;
        localObject2 = getLayoutParamsc;
        ((at.u)localObject2).c();
        localRect2.set(0, 0, 0, 0);
        i1 = left;
        int i4 = j.left;
        i1 += i4;
        left = i1;
        i1 = top;
        i4 = j.top;
        i1 += i4;
        top = i1;
        i1 = right;
        i4 = j.right;
        i1 += i4;
        right = i1;
        i1 = bottom;
        localRect2 = j;
        i4 = bottom;
        i1 += i4;
        bottom = i1;
        i1 = i3 + 1;
      }
      e = false;
      localObject1 = localRect1;
    }
  }
  
  final void e()
  {
    h localh = z;
    if (localh != null) {}
    for (;;)
    {
      return;
      localh = new android/support/v4/widget/h;
      Context localContext = getContext();
      localh.<init>(localContext);
      z = localh;
      boolean bool = h;
      int i1;
      int i2;
      if (bool)
      {
        localh = z;
        i1 = getMeasuredHeight();
        i2 = getPaddingTop();
        i1 -= i2;
        i2 = getPaddingBottom();
        i1 -= i2;
        i2 = getMeasuredWidth();
        int i3 = getPaddingLeft();
        i2 -= i3;
        i3 = getPaddingRight();
        i2 -= i3;
        localh.a(i1, i2);
      }
      else
      {
        localh = z;
        i1 = getMeasuredHeight();
        i2 = getMeasuredWidth();
        localh.a(i1, i2);
      }
    }
  }
  
  final void f()
  {
    h localh = y;
    if (localh != null) {}
    for (;;)
    {
      return;
      localh = new android/support/v4/widget/h;
      Context localContext = getContext();
      localh.<init>(localContext);
      y = localh;
      boolean bool = h;
      int i1;
      int i2;
      if (bool)
      {
        localh = y;
        i1 = getMeasuredWidth();
        i2 = getPaddingLeft();
        i1 -= i2;
        i2 = getPaddingRight();
        i1 -= i2;
        i2 = getMeasuredHeight();
        int i3 = getPaddingTop();
        i2 -= i3;
        i3 = getPaddingBottom();
        i2 -= i3;
        localh.a(i1, i2);
      }
      else
      {
        localh = y;
        i1 = getMeasuredWidth();
        i2 = getMeasuredHeight();
        localh.a(i1, i2);
      }
    }
  }
  
  public View focusSearch(View paramView, int paramInt)
  {
    int i1 = 17;
    float f1 = 2.4E-44F;
    int i2 = 2;
    int i3 = 0;
    int i4 = 1;
    float f2 = Float.MIN_VALUE;
    Object localObject1 = l;
    Object localObject2;
    label120:
    Object localObject3;
    int i8;
    label140:
    boolean bool6;
    if (localObject1 != null)
    {
      localObject1 = m;
      if (localObject1 != null)
      {
        boolean bool2 = v();
        if (!bool2)
        {
          bool2 = t;
          if (!bool2)
          {
            int i5 = i4;
            localObject2 = FocusFinder.getInstance();
            if ((i5 == 0) || ((paramInt != i2) && (paramInt != i4))) {
              break label432;
            }
            localObject1 = m;
            boolean bool3 = ((at.g)localObject1).f();
            if (!bool3) {
              break label729;
            }
            if (paramInt != i2) {
              break label296;
            }
            int i6 = 130;
            localObject3 = ((FocusFinder)localObject2).findNextFocus(this, paramView, i6);
            if (localObject3 != null) {
              break label303;
            }
            i8 = i4;
            bool6 = P;
            if (bool6) {
              paramInt = i6;
            }
          }
        }
      }
    }
    for (;;)
    {
      int i7;
      if (i8 == 0)
      {
        localObject1 = m;
        boolean bool4 = ((at.g)localObject1).e();
        if (bool4)
        {
          localObject1 = m.q;
          i7 = w.g((View)localObject1);
          if (i7 != i4) {
            break label312;
          }
          i8 = i4;
          label203:
          if (paramInt != i2) {
            break label321;
          }
          i7 = i4;
          label213:
          i7 ^= i8;
          if (i7 == 0) {
            break label330;
          }
          i7 = 66;
          label229:
          localObject3 = ((FocusFinder)localObject2).findNextFocus(this, paramView, i7);
          if (localObject3 != null) {
            break label336;
          }
          i8 = i4;
        }
      }
      for (;;)
      {
        bool6 = P;
        if (bool6) {
          paramInt = i7;
        }
        if (i8 == 0) {
          break label384;
        }
        b();
        localObject1 = b(paramView);
        if (localObject1 != null) {
          break label345;
        }
        paramView = null;
        return paramView;
        i7 = 0;
        localObject1 = null;
        break;
        label296:
        i7 = 33;
        break label120;
        label303:
        i8 = 0;
        localObject3 = null;
        break label140;
        label312:
        i8 = 0;
        localObject3 = null;
        break label203;
        label321:
        i7 = 0;
        localObject1 = null;
        break label213;
        label330:
        i7 = i1;
        break label229;
        label336:
        i8 = 0;
        localObject3 = null;
      }
      label345:
      c();
      localObject1 = m;
      localObject3 = d;
      at.r localr = F;
      ((at.g)localObject1).a(paramView, paramInt, (at.m)localObject3, localr);
      a(false);
      label384:
      localObject1 = ((FocusFinder)localObject2).findNextFocus(this, paramView, paramInt);
      for (;;)
      {
        View localView;
        if (localObject1 != null)
        {
          boolean bool5 = ((View)localObject1).hasFocusable();
          if (!bool5)
          {
            localView = getFocusedChild();
            if (localView == null)
            {
              paramView = super.focusSearch(paramView, paramInt);
              break;
              label432:
              localObject3 = ((FocusFinder)localObject2).findNextFocus(this, paramView, paramInt);
              if ((localObject3 != null) || (i7 == 0)) {
                break label722;
              }
              b();
              localObject1 = b(paramView);
              if (localObject1 == null)
              {
                paramView = null;
                break;
              }
              c();
              localObject1 = m;
              localObject3 = d;
              localObject2 = F;
              localObject1 = ((at.g)localObject1).a(paramView, paramInt, (at.m)localObject3, (at.r)localObject2);
              a(false);
              continue;
            }
            a((View)localObject1, null);
            break;
          }
        }
        if ((localObject1 == null) || (localObject1 == this))
        {
          i4 = 0;
          localView = null;
          f2 = 0.0F;
        }
        for (;;)
        {
          if (i4 == 0) {
            break label712;
          }
          paramView = (View)localObject1;
          break;
          if (paramView != null)
          {
            boolean bool1;
            if ((paramInt == i2) || (paramInt == i4))
            {
              localObject3 = m.q;
              i9 = w.g((View)localObject3);
              if (i9 == i4) {
                i9 = i4;
              }
              for (;;)
              {
                if (paramInt == i2) {
                  i3 = i4;
                }
                i3 ^= i9;
                if (i3 != 0)
                {
                  i1 = 66;
                  f1 = 9.2E-44F;
                }
                i3 = a(paramView, (View)localObject1, i1);
                if (i3 != 0) {
                  break;
                }
                if (paramInt != i2) {
                  break label680;
                }
                f2 = 1.82E-43F;
                bool1 = a(paramView, (View)localObject1, 130);
                break;
                i9 = 0;
                localObject3 = null;
              }
              label680:
              f2 = 4.6E-44F;
              bool1 = a(paramView, (View)localObject1, 33);
            }
            else
            {
              bool1 = a(paramView, (View)localObject1, paramInt);
            }
          }
        }
        label712:
        paramView = super.focusSearch(paramView, paramInt);
        break;
        label722:
        localObject1 = localObject3;
      }
      label729:
      int i9 = 0;
      localObject3 = null;
    }
  }
  
  final void g()
  {
    h localh = A;
    if (localh != null) {}
    for (;;)
    {
      return;
      localh = new android/support/v4/widget/h;
      Context localContext = getContext();
      localh.<init>(localContext);
      A = localh;
      boolean bool = h;
      int i1;
      int i2;
      if (bool)
      {
        localh = A;
        i1 = getMeasuredWidth();
        i2 = getPaddingLeft();
        i1 -= i2;
        i2 = getPaddingRight();
        i1 -= i2;
        i2 = getMeasuredHeight();
        int i3 = getPaddingTop();
        i2 -= i3;
        i3 = getPaddingBottom();
        i2 -= i3;
        localh.a(i1, i2);
      }
      else
      {
        localh = A;
        i1 = getMeasuredWidth();
        i2 = getMeasuredHeight();
        localh.a(i1, i2);
      }
    }
  }
  
  final void g(View paramView)
  {
    c(paramView);
    List localList1 = v;
    if (localList1 != null)
    {
      localList1 = v;
      int i1 = localList1.size() + -1;
      while (i1 >= 0)
      {
        List localList2 = v;
        localList2.get(i1);
        i1 += -1;
      }
    }
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    Object localObject = m;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("RecyclerView has no LayoutManager");
      throw ((Throwable)localObject);
    }
    return m.b();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    Object localObject = m;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("RecyclerView has no LayoutManager");
      throw ((Throwable)localObject);
    }
    localObject = m;
    Context localContext = getContext();
    return ((at.g)localObject).a(localContext, paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    Object localObject = m;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("RecyclerView has no LayoutManager");
      throw ((Throwable)localObject);
    }
    return m.a(paramLayoutParams);
  }
  
  public at.a getAdapter()
  {
    return l;
  }
  
  public int getBaseline()
  {
    at.g localg = m;
    if (localg != null) {}
    for (int i1 = -1;; i1 = super.getBaseline()) {
      return i1;
    }
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    at.d locald = aw;
    if (locald == null) {}
    for (int i1 = super.getChildDrawingOrder(paramInt1, paramInt2);; i1 = locald.a())
    {
      return i1;
      locald = aw;
    }
  }
  
  public boolean getClipToPadding()
  {
    return h;
  }
  
  public au getCompatAccessibilityDelegate()
  {
    return J;
  }
  
  public at.e getItemAnimator()
  {
    return B;
  }
  
  public at.g getLayoutManager()
  {
    return m;
  }
  
  public int getMaxFlingVelocity()
  {
    return aq;
  }
  
  public int getMinFlingVelocity()
  {
    return ap;
  }
  
  long getNanoTime()
  {
    boolean bool = O;
    if (bool) {}
    for (long l1 = System.nanoTime();; l1 = 0L) {
      return l1;
    }
  }
  
  public at.i getOnFlingListener()
  {
    return ao;
  }
  
  public boolean getPreserveFocusAfterLayout()
  {
    return as;
  }
  
  public at.l getRecycledViewPool()
  {
    return d.d();
  }
  
  public int getScrollState()
  {
    return ag;
  }
  
  final void h()
  {
    int i1 = ae + 1;
    ae = i1;
  }
  
  public boolean hasNestedScrollingParent()
  {
    return getScrollingChildHelper().a();
  }
  
  final void i()
  {
    int i1 = 0;
    AccessibilityEvent localAccessibilityEvent = null;
    int i2 = -1;
    int i3 = ae + -1;
    ae = i3;
    i3 = ae;
    if (i3 <= 0)
    {
      ae = 0;
      i3 = ac;
      ac = 0;
      if (i3 != 0)
      {
        i1 = j();
        if (i1 != 0)
        {
          localAccessibilityEvent = AccessibilityEvent.obtain();
          int i4 = 2048;
          localAccessibilityEvent.setEventType(i4);
          android.support.v4.h.a.a.a(localAccessibilityEvent, i3);
          sendAccessibilityEventUnchecked(localAccessibilityEvent);
        }
      }
      Object localObject = K;
      i3 = ((List)localObject).size() + -1;
      for (i1 = i3; i1 >= 0; i1 = i3)
      {
        localObject = (at.u)K.get(i1);
        ViewParent localViewParent = a.getParent();
        if (localViewParent == this)
        {
          boolean bool = ((at.u)localObject).b();
          if (!bool)
          {
            int i5 = l;
            if (i5 != i2)
            {
              View localView = a;
              w.c(localView, i5);
              l = i2;
            }
          }
        }
        i3 = i1 + -1;
      }
      localObject = K;
      ((List)localObject).clear();
    }
  }
  
  public boolean isAttachedToWindow()
  {
    return p;
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return getScrollingChildHelpera;
  }
  
  final boolean j()
  {
    AccessibilityManager localAccessibilityManager = ad;
    boolean bool;
    if (localAccessibilityManager != null)
    {
      localAccessibilityManager = ad;
      bool = localAccessibilityManager.isEnabled();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localAccessibilityManager = null;
    }
  }
  
  final void k()
  {
    boolean bool = I;
    if (!bool)
    {
      bool = p;
      if (bool)
      {
        Runnable localRunnable = aC;
        w.a(this, localRunnable);
        bool = true;
        I = bool;
      }
    }
  }
  
  final void l()
  {
    int i1 = 6;
    boolean bool1 = true;
    int i2 = 0;
    int i3 = f.b();
    int i4 = 0;
    Object localObject1 = null;
    while (i4 < i3)
    {
      localObject2 = c(f.c(i4));
      if (localObject2 != null)
      {
        boolean bool3 = ((at.u)localObject2).b();
        if (!bool3) {
          ((at.u)localObject2).b(i1);
        }
      }
      i4 += 1;
    }
    localObject1 = f;
    int i7 = ((ac)localObject1).b();
    i3 = 0;
    at.m localm = null;
    while (i3 < i7)
    {
      localObject1 = (at.h)f.c(i3).getLayoutParams();
      e = bool1;
      i4 = i3 + 1;
      i3 = i4;
    }
    Object localObject2 = d;
    localObject1 = c;
    int i6 = ((ArrayList)localObject1).size();
    i3 = 0;
    localm = null;
    while (i3 < i6)
    {
      localObject1 = (at.h)c.get(i3)).a.getLayoutParams();
      if (localObject1 != null) {
        e = bool1;
      }
      i4 = i3 + 1;
      i3 = i4;
    }
    localm = d;
    localObject1 = i.l;
    if (localObject1 != null)
    {
      localObject1 = i.l;
      boolean bool2 = e;
      if (bool2)
      {
        localObject1 = c;
        i7 = ((ArrayList)localObject1).size();
        while (i2 < i7)
        {
          localObject1 = (at.u)c.get(i2);
          if (localObject1 != null)
          {
            ((at.u)localObject1).b(i1);
            i6 = 0;
            ((at.u)localObject1).a(null);
          }
          int i5 = i2 + 1;
          i2 = i5;
        }
      }
    }
    localm.c();
  }
  
  final void m()
  {
    int i1 = af + 1;
    af = i1;
    i1 = getScrollX();
    int i2 = getScrollY();
    onScrollChanged(i1, i2, i1, i2);
    List localList1 = au;
    if (localList1 != null)
    {
      localList1 = au;
      i1 = localList1.size() + -1;
      while (i1 >= 0)
      {
        List localList2 = au;
        localList2.get(i1);
        i1 += -1;
      }
    }
    i1 = af + -1;
    af = i1;
  }
  
  public final boolean n()
  {
    boolean bool = r;
    f localf;
    if (bool)
    {
      bool = w;
      if (!bool)
      {
        localf = e;
        bool = localf.d();
        if (!bool) {
          break label36;
        }
      }
    }
    bool = true;
    for (;;)
    {
      return bool;
      label36:
      bool = false;
      localf = null;
    }
  }
  
  final void o()
  {
    int i1 = f.a();
    int i2 = 0;
    while (i2 < i1)
    {
      View localView = f.b(i2);
      Object localObject = a(localView);
      if (localObject != null)
      {
        at.u localu = i;
        if (localu != null)
        {
          localObject = i.a;
          int i3 = localView.getLeft();
          int i4 = localView.getTop();
          int i5 = ((View)localObject).getLeft();
          if (i3 == i5)
          {
            i5 = ((View)localObject).getTop();
            if (i4 == i5) {}
          }
          else
          {
            i5 = ((View)localObject).getWidth() + i3;
            int i6 = ((View)localObject).getHeight() + i4;
            ((View)localObject).layout(i3, i4, i5, i6);
          }
        }
      }
      i2 += 1;
    }
  }
  
  protected void onAttachedToWindow()
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = false;
    float f2 = 0.0F;
    super.onAttachedToWindow();
    ae = 0;
    p = i1;
    boolean bool2 = r;
    float f3;
    Object localObject;
    if (bool2)
    {
      bool2 = isLayoutRequested();
      if (!bool2)
      {
        bool2 = i1;
        f3 = f1;
        r = bool2;
        localObject = m;
        if (localObject != null)
        {
          localObject = m;
          v = i1;
        }
        I = false;
        bool2 = O;
        if (bool2)
        {
          localObject = (ak)ak.a.get();
          D = ((ak)localObject);
          localObject = D;
          if (localObject == null)
          {
            localObject = new android/support/v7/widget/ak;
            ((ak)localObject).<init>();
            D = ((ak)localObject);
            localObject = w.J(this);
            i1 = 1114636288;
            f1 = 60.0F;
            bool1 = isInEditMode();
            if ((bool1) || (localObject == null)) {
              break label271;
            }
            f3 = ((Display)localObject).getRefreshRate();
            f2 = 30.0F;
            bool1 = f3 < f2;
            if (bool1) {
              break label271;
            }
          }
        }
      }
    }
    for (;;)
    {
      ak localak = D;
      int i2 = 1315859240;
      f2 = 1.0E9F;
      f3 = f2 / f3;
      long l1 = f3;
      d = l1;
      localObject = ak.a;
      localak = D;
      ((ThreadLocal)localObject).set(localak);
      localObject = D.b;
      ((ArrayList)localObject).add(this);
      return;
      bool2 = false;
      localObject = null;
      f3 = 0.0F;
      break;
      label271:
      bool2 = i1;
      f3 = f1;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject = B;
    if (localObject != null)
    {
      localObject = B;
      ((at.e)localObject).d();
    }
    q();
    boolean bool = false;
    p = false;
    localObject = m;
    if (localObject != null)
    {
      localObject = m;
      at.m localm = d;
      ((at.g)localObject).b(this, localm);
    }
    K.clear();
    localObject = aC;
    removeCallbacks((Runnable)localObject);
    bj.a.b();
    bool = O;
    if (bool)
    {
      D.b.remove(this);
      bool = false;
      localObject = null;
      D = null;
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i1 = o.size();
    int i2 = 0;
    while (i2 < i1)
    {
      ArrayList localArrayList = o;
      localArrayList.get(i2);
      i2 += 1;
    }
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    float f1 = 0.0F;
    at.g localg1 = m;
    if (localg1 == null) {}
    int i1;
    int i3;
    do
    {
      do
      {
        boolean bool2;
        do
        {
          return false;
          bool2 = t;
        } while (bool2);
        i1 = paramMotionEvent.getSource() & 0x2;
      } while (i1 == 0);
      i1 = paramMotionEvent.getAction();
      i3 = 8;
      f2 = 1.1E-44F;
    } while (i1 != i3);
    localg1 = m;
    boolean bool3 = localg1.f();
    int i2;
    float f3;
    label94:
    at.g localg2;
    int i4;
    if (bool3)
    {
      i2 = 9;
      f3 = -n.a(paramMotionEvent, i2);
      localg2 = m;
      boolean bool4 = localg2.e();
      if (!bool4) {
        break label196;
      }
      i4 = 10;
    }
    for (float f2 = n.a(paramMotionEvent, i4);; f2 = 0.0F)
    {
      boolean bool5 = f3 < 0.0F;
      if (!bool5)
      {
        bool1 = f2 < 0.0F;
        if (!bool1) {
          break;
        }
      }
      f1 = getScrollFactor();
      f2 *= f1;
      i4 = (int)f2;
      f3 *= f1;
      i2 = (int)f3;
      a(i4, i2, paramMotionEvent);
      break;
      i2 = 0;
      localg1 = null;
      f3 = 0.0F;
      break label94;
      label196:
      i4 = 0;
      localg2 = null;
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 3;
    int i2 = -1;
    float f1 = 0.0F / 0.0F;
    int i4 = 1056964608;
    float f2 = 0.5F;
    int i5 = 1;
    float f3 = Float.MIN_VALUE;
    boolean bool2 = t;
    if (bool2)
    {
      i5 = 0;
      f3 = 0.0F;
    }
    Object localObject1;
    int i11;
    label96:
    label188:
    boolean bool4;
    label324:
    int i8;
    for (;;)
    {
      return i5;
      i10 = paramMotionEvent.getAction();
      if ((i10 == i1) || (i10 == 0))
      {
        bool2 = false;
        f4 = 0.0F;
        localObject1 = null;
        W = null;
      }
      localObject1 = V;
      i11 = ((ArrayList)localObject1).size();
      int i12 = 0;
      at.g localg = null;
      if (i12 < i11)
      {
        localObject1 = (at.j)V.get(i12);
        boolean bool5 = ((at.j)localObject1).a();
        if ((bool5) && (i10 != i1))
        {
          W = ((at.j)localObject1);
          bool2 = i5;
        }
      }
      for (f4 = f3;; f4 = 0.0F)
      {
        if (!bool2) {
          break label188;
        }
        u();
        break;
        int i7 = i12 + 1;
        i12 = i7;
        break label96;
        i7 = 0;
        localObject1 = null;
      }
      localObject1 = m;
      if (localObject1 == null)
      {
        i5 = 0;
        f3 = 0.0F;
      }
      else
      {
        localObject1 = m;
        boolean bool3 = ((at.g)localObject1).e();
        localg = m;
        bool4 = localg.f();
        localObject2 = ai;
        if (localObject2 == null)
        {
          localObject2 = VelocityTracker.obtain();
          ai = ((VelocityTracker)localObject2);
        }
        localObject2 = ai;
        ((VelocityTracker)localObject2).addMovement(paramMotionEvent);
        i10 = n.a(paramMotionEvent);
        i11 = n.b(paramMotionEvent);
        switch (i10)
        {
        case 4: 
        default: 
          i8 = ag;
          if (i8 != i5)
          {
            i5 = 0;
            f3 = 0.0F;
          }
          break;
        }
      }
    }
    boolean bool1 = ab;
    if (bool1) {
      ab = false;
    }
    int i3 = paramMotionEvent.getPointerId(0);
    ah = i3;
    i3 = (int)(paramMotionEvent.getX() + f2);
    al = i3;
    aj = i3;
    f1 = paramMotionEvent.getY() + f2;
    i3 = (int)f1;
    am = i3;
    ak = i3;
    i3 = ag;
    int i10 = 2;
    float f5 = 2.8E-45F;
    if (i3 == i10)
    {
      localObject3 = getParent();
      ((ViewParent)localObject3).requestDisallowInterceptTouchEvent(i5);
      setScrollState(i5);
    }
    Object localObject3 = aB;
    Object localObject2 = aB;
    localObject2[i5] = 0;
    localObject3[0] = 0;
    if (i8 != 0) {
      i8 = i5;
    }
    for (float f4 = f3;; f4 = 0.0F)
    {
      if (bool4) {
        i8 |= 0x2;
      }
      startNestedScroll(i9);
      break label324;
      int i9 = paramMotionEvent.getPointerId(i11);
      ah = i9;
      i9 = (int)(paramMotionEvent.getX(i11) + f2);
      al = i9;
      aj = i9;
      f4 = paramMotionEvent.getY(i11) + f2;
      i9 = (int)f4;
      am = i9;
      ak = i9;
      break label324;
      i10 = ah;
      i10 = paramMotionEvent.findPointerIndex(i10);
      int i6;
      if (i10 < 0)
      {
        localObject1 = "RecyclerView";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("Error processing scroll; pointer index for id ");
        i6 = ah;
        localObject3 = i6 + " not found. Did any MotionEvents get skipped?";
        Log.e((String)localObject1, (String)localObject3);
        i6 = 0;
        f3 = 0.0F;
        break;
      }
      float f6 = paramMotionEvent.getX(i10) + f2;
      i11 = (int)f6;
      f5 = paramMotionEvent.getY(i10) + f2;
      i10 = (int)f5;
      int i14 = ag;
      if (i14 == i6) {
        break label324;
      }
      i14 = aj;
      i11 -= i14;
      i14 = ak;
      i10 -= i14;
      if (i9 != 0)
      {
        i9 = Math.abs(i11);
        i14 = an;
        if (i9 > i14)
        {
          i14 = aj;
          i4 = an;
          if (i11 < 0)
          {
            i9 = i3;
            f4 = f1;
            label776:
            i9 = i9 * i4 + i14;
            al = i9;
            i9 = i6;
          }
        }
      }
      for (f4 = f3;; f4 = 0.0F)
      {
        int i13;
        if (bool4)
        {
          i13 = Math.abs(i10);
          i11 = an;
          if (i13 > i11)
          {
            i9 = ak;
            i13 = an;
            if (i10 >= 0) {
              break label892;
            }
          }
        }
        for (;;)
        {
          i3 *= i13;
          i9 += i3;
          am = i9;
          i9 = i6;
          f4 = f3;
          if (i9 == 0) {
            break;
          }
          setScrollState(i6);
          break;
          i9 = i6;
          f4 = f3;
          break label776;
          label892:
          i3 = i6;
          f1 = f3;
        }
        a(paramMotionEvent);
        break;
        localObject1 = ai;
        ((VelocityTracker)localObject1).clear();
        stopNestedScroll();
        break;
        u();
        break;
        i9 = 0;
        localObject1 = null;
      }
      i9 = 0;
      localObject1 = null;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    e.a("RV OnLayout");
    y();
    e.a();
    r = true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 1073741824;
    int i2 = 1;
    int i3 = 0;
    Object localObject1 = null;
    Object localObject2 = m;
    if (localObject2 == null) {
      b(paramInt1, paramInt2);
    }
    for (;;)
    {
      return;
      localObject2 = m;
      boolean bool2 = w;
      if (bool2)
      {
        int i4 = View.MeasureSpec.getMode(paramInt1);
        int i6 = View.MeasureSpec.getMode(paramInt2);
        if ((i4 == i1) && (i6 == i1)) {
          i3 = i2;
        }
        localObject2 = m;
        ((at.g)localObject2).g(paramInt1, paramInt2);
        if (i3 == 0)
        {
          localObject1 = l;
          if (localObject1 != null)
          {
            localObject1 = F;
            i3 = d;
            if (i3 == i2) {
              B();
            }
            m.e(paramInt1, paramInt2);
            F.i = i2;
            C();
            m.f(paramInt1, paramInt2);
            localObject1 = m;
            boolean bool1 = ((at.g)localObject1).i();
            if (bool1)
            {
              localObject1 = m;
              i4 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), i1);
              i6 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), i1);
              ((at.g)localObject1).e(i4, i6);
              F.i = i2;
              C();
              localObject1 = m;
              ((at.g)localObject1).f(paramInt1, paramInt2);
            }
          }
        }
      }
      else
      {
        bool3 = q;
        if (!bool3) {
          break;
        }
        localObject1 = m;
        ((at.g)localObject1).g(paramInt1, paramInt2);
      }
    }
    boolean bool3 = u;
    label328:
    Object localObject3;
    int i5;
    if (bool3)
    {
      c();
      h();
      x();
      i();
      localObject2 = F;
      bool3 = k;
      if (bool3)
      {
        localObject2 = F;
        g = i2;
        u = false;
        a(false);
      }
    }
    else
    {
      localObject3 = l;
      if (localObject3 == null) {
        break label430;
      }
      localObject3 = F;
      localObject2 = l;
      i5 = ((at.a)localObject2).a();
    }
    for (e = i5;; e = 0)
    {
      c();
      m.g(paramInt1, paramInt2);
      a(false);
      localObject3 = F;
      g = false;
      break;
      e.e();
      localObject3 = F;
      g = false;
      break label328;
      label430:
      localObject3 = F;
    }
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    boolean bool = v();
    if (bool) {}
    for (bool = false;; bool = super.onRequestFocusInDescendants(paramInt, paramRect)) {
      return bool;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof at.p;
    if (!bool) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      paramParcelable = (at.p)paramParcelable;
      T = paramParcelable;
      Object localObject = T.e;
      super.onRestoreInstanceState((Parcelable)localObject);
      localObject = m;
      if (localObject != null)
      {
        localObject = T.a;
        if (localObject != null)
        {
          localObject = m;
          Parcelable localParcelable = T.a;
          ((at.g)localObject).a(localParcelable);
        }
      }
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    at.p localp = new android/support/v7/widget/at$p;
    Object localObject = super.onSaveInstanceState();
    localp.<init>((Parcelable)localObject);
    localObject = T;
    if (localObject != null)
    {
      localObject = T.a;
      a = ((Parcelable)localObject);
    }
    for (;;)
    {
      return localp;
      localObject = m;
      if (localObject != null)
      {
        localObject = m.d();
        a = ((Parcelable)localObject);
      }
      else
      {
        localObject = null;
        a = null;
      }
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4)) {
      s();
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = -1 << -1;
    float f1 = -0.0F;
    int i2 = 0;
    float f2 = 0.0F;
    Object localObject1 = null;
    int i4 = 1056964608;
    float f3 = 0.5F;
    int i5 = 1;
    float f4 = Float.MIN_VALUE;
    boolean bool2 = false;
    boolean bool3 = t;
    if (!bool3)
    {
      bool3 = ab;
      if (!bool3) {
        break label61;
      }
    }
    label61:
    Object localObject2;
    float f5;
    Object localObject3;
    label124:
    boolean bool10;
    label235:
    label248:
    label260:
    boolean bool8;
    MotionEvent localMotionEvent;
    int i10;
    Object localObject4;
    int i19;
    float f7;
    int i20;
    float f8;
    for (;;)
    {
      return bool2;
      int i6 = paramMotionEvent.getAction();
      localObject2 = W;
      int i9;
      if (localObject2 != null)
      {
        if (i6 == 0)
        {
          i9 = 0;
          f5 = 0.0F;
          localObject2 = null;
          W = null;
        }
      }
      else
      {
        if (i6 == 0) {
          break label248;
        }
        localObject3 = V;
        int i16 = ((ArrayList)localObject3).size();
        i9 = 0;
        localObject2 = null;
        f5 = 0.0F;
        if (i9 >= i16) {
          break label248;
        }
        localObject3 = (at.j)V.get(i9);
        bool10 = ((at.j)localObject3).a();
        if (!bool10) {
          break label235;
        }
        W = ((at.j)localObject3);
        i6 = i5;
        f6 = f4;
      }
      for (;;)
      {
        if (i6 == 0) {
          break label260;
        }
        u();
        bool2 = i5;
        break;
        i9 = 3;
        f5 = 4.2E-45F;
        if ((i6 == i9) || (i6 == i5))
        {
          i7 = 0;
          f6 = 0.0F;
          localObject3 = null;
          W = null;
        }
        i7 = i5;
        f6 = f4;
        continue;
        i7 = i9 + 1;
        i9 = i7;
        break label124;
        i7 = 0;
        localObject3 = null;
        f6 = 0.0F;
      }
      localObject3 = m;
      if (localObject3 != null)
      {
        bool8 = m.e();
        bool10 = m.f();
        localObject3 = ai;
        if (localObject3 == null)
        {
          localObject3 = VelocityTracker.obtain();
          ai = ((VelocityTracker)localObject3);
        }
        localMotionEvent = MotionEvent.obtain(paramMotionEvent);
        i7 = n.a(paramMotionEvent);
        i10 = n.b(paramMotionEvent);
        if (i7 == 0)
        {
          arrayOfInt1 = aB;
          localObject4 = aB;
          localObject4[i5] = 0;
          arrayOfInt1[0] = 0;
        }
        int[] arrayOfInt1 = aB;
        i19 = arrayOfInt1[0];
        f7 = i19;
        localObject4 = aB;
        i20 = localObject4[i5];
        f8 = i20;
        localMotionEvent.offsetLocation(f7, f8);
        switch (i7)
        {
        case 4: 
        default: 
          label444:
          if (!bool2)
          {
            localObject3 = ai;
            ((VelocityTracker)localObject3).addMovement(localMotionEvent);
          }
          localMotionEvent.recycle();
          bool2 = i5;
        }
      }
    }
    int i7 = paramMotionEvent.getPointerId(0);
    ah = i7;
    i7 = (int)(paramMotionEvent.getX() + f3);
    al = i7;
    aj = i7;
    float f6 = paramMotionEvent.getY() + f3;
    i7 = (int)f6;
    am = i7;
    ak = i7;
    if (bool8) {
      i7 = i5;
    }
    for (f6 = f4;; f6 = 0.0F)
    {
      if (bool10) {
        i7 |= 0x2;
      }
      startNestedScroll(i7);
      break label444;
      i7 = paramMotionEvent.getPointerId(i10);
      ah = i7;
      i7 = (int)(paramMotionEvent.getX(i10) + f3);
      al = i7;
      aj = i7;
      f6 = paramMotionEvent.getY(i10) + f3;
      i7 = (int)f6;
      am = i7;
      ak = i7;
      break label444;
      i7 = ah;
      i7 = paramMotionEvent.findPointerIndex(i7);
      if (i7 < 0)
      {
        localObject3 = "RecyclerView";
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("Error processing scroll; pointer index for id ");
        i10 = ah;
        localObject1 = ((StringBuilder)localObject1).append(i10);
        localObject2 = " not found. Did any MotionEvents get skipped?";
        localObject1 = (String)localObject2;
        Log.e((String)localObject3, (String)localObject1);
        break;
      }
      f2 = paramMotionEvent.getX(i7) + f3;
      i1 = (int)f2;
      f6 = paramMotionEvent.getY(i7) + f3;
      i19 = (int)f6;
      i2 = al - i1;
      i7 = am - i19;
      localObject2 = aA;
      localObject4 = az;
      boolean bool5 = dispatchNestedPreScroll(i2, i7, (int[])localObject2, (int[])localObject4);
      if (bool5)
      {
        i11 = aA[0];
        i2 -= i11;
        i11 = aA[i5];
        i7 -= i11;
        i11 = az[0];
        f5 = i11;
        localObject4 = az;
        f8 = localObject4[i5];
        localMotionEvent.offsetLocation(f5, f8);
        localObject2 = aB;
        i20 = localObject2[0];
        i4 = az[0];
        i20 += i4;
        localObject2[0] = i20;
        localObject2 = aB;
        i20 = localObject2[i5];
        int[] arrayOfInt2 = az;
        i4 = arrayOfInt2[i5];
        i20 += i4;
        localObject2[i5] = i20;
      }
      int i11 = ag;
      int i12;
      if (i11 != i5)
      {
        if (!bool8) {
          break label1887;
        }
        i12 = Math.abs(i2);
        i20 = an;
        if (i12 <= i20) {
          break label1887;
        }
        if (i2 <= 0) {
          break label1210;
        }
        i12 = an;
        i2 -= i12;
        label993:
        i12 = i5;
      }
      for (f5 = f4;; f5 = 0.0F)
      {
        if (bool10)
        {
          int i21 = Math.abs(i7);
          i4 = an;
          if (i21 > i4)
          {
            if (i7 <= 0) {
              break label1226;
            }
            i12 = an;
            i7 -= i12;
            label1044:
            i12 = i5;
            f5 = f4;
          }
        }
        if (i12 != 0) {
          setScrollState(i5);
        }
        i12 = ag;
        if (i12 != i5) {
          break;
        }
        int i13 = az[0];
        i13 = i1 - i13;
        al = i13;
        localObject2 = az;
        i13 = localObject2[i5];
        i13 = i19 - i13;
        am = i13;
        if (bool8)
        {
          i1 = i2;
          label1130:
          if (!bool10) {
            break label1249;
          }
          i13 = i7;
        }
        for (;;)
        {
          boolean bool6 = a(i1, i13, localMotionEvent);
          if (bool6)
          {
            localObject2 = getParent();
            ((ViewParent)localObject2).requestDisallowInterceptTouchEvent(i5);
          }
          localObject2 = D;
          if ((localObject2 == null) || ((i2 == 0) && (i7 == 0))) {
            break;
          }
          localObject2 = D;
          ((ak)localObject2).a(this, i2, i7);
          break;
          label1210:
          i14 = an;
          i2 += i14;
          break label993;
          label1226:
          i14 = an;
          i7 += i14;
          break label1044;
          i1 = 0;
          f1 = 0.0F;
          break label1130;
          label1249:
          i14 = 0;
          localObject2 = null;
          f5 = 0.0F;
        }
        a(paramMotionEvent);
        break;
        ai.addMovement(localMotionEvent);
        localObject3 = ai;
        int i14 = 1000;
        f5 = 1.401E-42F;
        i19 = aq;
        f7 = i19;
        ((VelocityTracker)localObject3).computeCurrentVelocity(i14, f7);
        label1345:
        label1372:
        boolean bool9;
        int i3;
        if (bool8)
        {
          localObject3 = ai;
          i14 = ah;
          f6 = -v.a((VelocityTracker)localObject3, i14);
          f5 = f6;
          if (!bool10) {
            break label1475;
          }
          localObject3 = ai;
          int i17 = ah;
          f6 = -v.b((VelocityTracker)localObject3, i17);
          bool9 = f5 < 0.0F;
          if (!bool9)
          {
            boolean bool1 = f6 < 0.0F;
            if (!bool1) {}
          }
          else
          {
            i3 = (int)f5;
            i7 = (int)f6;
            localObject2 = m;
            if (localObject2 != null) {
              break label1487;
            }
            localObject3 = "RecyclerView";
            localObject1 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.";
            Log.e((String)localObject3, (String)localObject1);
          }
        }
        label1433:
        label1442:
        label1475:
        label1487:
        label1714:
        label1885:
        for (;;)
        {
          i7 = 0;
          localObject3 = null;
          f6 = 0.0F;
          if (i7 == 0) {
            setScrollState(0);
          }
          t();
          bool2 = i5;
          break;
          i14 = 0;
          localObject2 = null;
          f5 = 0.0F;
          break label1345;
          i7 = 0;
          localObject3 = null;
          f6 = 0.0F;
          break label1372;
          boolean bool7 = t;
          if (!bool7)
          {
            bool9 = m.e();
            localObject2 = m;
            bool10 = ((at.g)localObject2).f();
            if (bool9)
            {
              i15 = Math.abs(i3);
              i19 = ap;
              if (i15 >= i19) {}
            }
            else
            {
              i3 = 0;
              localObject1 = null;
              f2 = 0.0F;
            }
            if (bool10)
            {
              i15 = Math.abs(i7);
              i19 = ap;
              if (i15 >= i19) {}
            }
            else
            {
              i15 = 0;
              localObject2 = null;
              f5 = 0.0F;
            }
            for (;;)
            {
              if ((i3 == 0) && (i15 == 0)) {
                break label1885;
              }
              f6 = i3;
              f7 = i15;
              boolean bool4 = dispatchNestedPreFling(f6, f7);
              if (bool4) {
                break label1433;
              }
              if ((bool9) || (bool10)) {
                bool4 = i5;
              }
              for (f6 = f4;; f6 = 0.0F)
              {
                f9 = i3;
                f10 = i15;
                dispatchNestedFling(f9, f10, bool4);
                at.i locali = ao;
                if (locali == null) {
                  break label1714;
                }
                locali = ao;
                bool9 = locali.a();
                if (!bool9) {
                  break label1714;
                }
                bool4 = i5;
                f6 = f4;
                break;
                bool4 = false;
                localObject3 = null;
              }
              if (!bool4) {
                break label1433;
              }
              i8 = -aq;
              int i18 = aq;
              i3 = Math.min(i3, i18);
              i3 = Math.max(i8, i3);
              i8 = -aq;
              i18 = aq;
              i15 = Math.min(i15, i18);
              i15 = Math.max(i8, i15);
              localObject4 = C;
              e.setScrollState(2);
              b = 0;
              a = 0;
              localObject3 = c;
              i18 = -1 >>> 1;
              float f9 = 0.0F / 0.0F;
              i19 = -1 >>> 1;
              f7 = 0.0F / 0.0F;
              bool10 = i1;
              float f10 = f1;
              ((m)localObject3).a(0, i3, i15, i1, i18, i1, i19);
              ((at.t)localObject4).a();
              i8 = i5;
              f6 = f4;
              break label1442;
              u();
              break;
              i15 = i8;
            }
          }
        }
        label1887:
        int i15 = 0;
        localObject2 = null;
      }
      int i8 = 0;
      localObject3 = null;
    }
  }
  
  protected void removeDetachedView(View paramView, boolean paramBoolean)
  {
    Object localObject = c(paramView);
    boolean bool;
    if (localObject != null)
    {
      bool = ((at.u)localObject).n();
      if (!bool) {
        break label36;
      }
      ((at.u)localObject).i();
    }
    label36:
    do
    {
      g(paramView);
      super.removeDetachedView(paramView, paramBoolean);
      return;
      bool = ((at.u)localObject).b();
    } while (bool);
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("Called removeDetachedView with a view which is not flagged as tmp detached.");
    localObject = localObject;
    localIllegalArgumentException.<init>((String)localObject);
    throw localIllegalArgumentException;
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    at.g localg = m;
    boolean bool = localg.k();
    if (!bool)
    {
      bool = v();
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      if ((!bool) && (paramView2 != null)) {
        a(paramView1, paramView2);
      }
      super.requestChildFocus(paramView1, paramView2);
      return;
      bool = false;
      localg = null;
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    return m.a(this, paramView, paramRect, paramBoolean, false);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    int i1 = V.size();
    int i2 = 0;
    while (i2 < i1)
    {
      ArrayList localArrayList = V;
      localArrayList.get(i2);
      i2 += 1;
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    int i1 = aa;
    boolean bool;
    if (i1 == 0)
    {
      bool = t;
      if (!bool) {
        super.requestLayout();
      }
    }
    for (;;)
    {
      return;
      bool = true;
      s = bool;
    }
  }
  
  public void scrollBy(int paramInt1, int paramInt2)
  {
    String str = null;
    Object localObject = m;
    if (localObject == null)
    {
      str = "RecyclerView";
      localObject = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.";
      Log.e(str, (String)localObject);
    }
    boolean bool1;
    boolean bool2;
    do
    {
      do
      {
        return;
        bool1 = t;
      } while (bool1);
      localObject = m;
      bool1 = ((at.g)localObject).e();
      at.g localg = m;
      bool2 = localg.f();
    } while ((!bool1) && (!bool2));
    if (bool1) {
      label82:
      if (!bool2) {
        break label105;
      }
    }
    for (;;)
    {
      str = null;
      a(paramInt1, paramInt2, null);
      break;
      paramInt1 = 0;
      break label82;
      label105:
      paramInt2 = 0;
    }
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
  }
  
  public void sendAccessibilityEventUnchecked(AccessibilityEvent paramAccessibilityEvent)
  {
    int i1 = 0;
    boolean bool = v();
    if (bool) {
      if (paramAccessibilityEvent == null) {
        break label58;
      }
    }
    label58:
    for (int i2 = android.support.v4.h.a.a.b(paramAccessibilityEvent);; i2 = 0)
    {
      if (i2 == 0) {}
      for (;;)
      {
        i2 = ac;
        i1 |= i2;
        ac = i1;
        i1 = 1;
        if (i1 != 0) {}
        for (;;)
        {
          return;
          super.sendAccessibilityEventUnchecked(paramAccessibilityEvent);
        }
        i1 = i2;
      }
    }
  }
  
  public void setAccessibilityDelegateCompat(au paramau)
  {
    J = paramau;
    au localau = J;
    w.a(this, localau);
  }
  
  public void setAdapter(at.a parama)
  {
    int i1 = 0;
    Object localObject1 = null;
    setLayoutFrozen(false);
    Object localObject2 = l;
    if (localObject2 != null)
    {
      localObject2 = l;
      localObject3 = S;
      localObject2 = d;
      ((at.b)localObject2).unregisterObserver(localObject3);
    }
    a();
    e.a();
    localObject2 = l;
    l = parama;
    if (parama != null)
    {
      localObject3 = S;
      localObject4 = d;
      ((at.b)localObject4).registerObserver(localObject3);
    }
    Object localObject3 = d;
    Object localObject4 = l;
    ((at.m)localObject3).a();
    localObject3 = ((at.m)localObject3).d();
    if (localObject2 != null) {
      ((at.l)localObject3).b();
    }
    int i2 = b;
    if (i2 == 0)
    {
      i2 = 0;
      localObject2 = null;
      for (;;)
      {
        localObject1 = a;
        i1 = ((SparseArray)localObject1).size();
        if (i2 >= i1) {
          break;
        }
        localObject1 = a.valueAt(i2)).a;
        ((ArrayList)localObject1).clear();
        i1 = i2 + 1;
        i2 = i1;
      }
    }
    if (localObject4 != null) {
      ((at.l)localObject3).a();
    }
    F.f = true;
    l();
    requestLayout();
  }
  
  public void setChildDrawingOrderCallback(at.d paramd)
  {
    at.d locald = aw;
    if (paramd == locald) {
      return;
    }
    aw = paramd;
    locald = aw;
    boolean bool;
    if (locald != null) {
      bool = true;
    }
    for (;;)
    {
      setChildrenDrawingOrderEnabled(bool);
      break;
      bool = false;
      locald = null;
    }
  }
  
  public void setClipToPadding(boolean paramBoolean)
  {
    boolean bool = h;
    if (paramBoolean != bool) {
      s();
    }
    h = paramBoolean;
    super.setClipToPadding(paramBoolean);
    bool = r;
    if (bool) {
      requestLayout();
    }
  }
  
  public void setHasFixedSize(boolean paramBoolean)
  {
    q = paramBoolean;
  }
  
  public void setItemAnimator(at.e parame)
  {
    at.e locale = B;
    at.e.a locala;
    if (locale != null)
    {
      B.d();
      locale = B;
      locala = null;
      h = null;
    }
    B = parame;
    locale = B;
    if (locale != null)
    {
      locale = B;
      locala = av;
      h = locala;
    }
  }
  
  public void setItemViewCacheSize(int paramInt)
  {
    at.m localm = d;
    e = paramInt;
    localm.b();
  }
  
  public void setLayoutFrozen(boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = t;
    Object localObject;
    if (paramBoolean != bool2)
    {
      localObject = "Do not setLayoutFrozen in layout or scroll";
      a((String)localObject);
      if (paramBoolean) {
        break label73;
      }
      t = false;
      bool2 = s;
      if (bool2)
      {
        localObject = m;
        if (localObject != null)
        {
          localObject = l;
          if (localObject != null) {
            requestLayout();
          }
        }
      }
      s = false;
    }
    for (;;)
    {
      return;
      label73:
      long l1 = SystemClock.uptimeMillis();
      int i1 = 3;
      localObject = MotionEvent.obtain(l1, l1, i1, 0.0F, 0.0F, 0);
      onTouchEvent((MotionEvent)localObject);
      t = bool1;
      ab = bool1;
      q();
    }
  }
  
  public void setLayoutManager(at.g paramg)
  {
    Object localObject1 = null;
    Object localObject2 = m;
    if (paramg == localObject2) {}
    for (;;)
    {
      return;
      q();
      localObject2 = m;
      Object localObject3;
      if (localObject2 != null)
      {
        localObject2 = B;
        if (localObject2 != null)
        {
          localObject2 = B;
          ((at.e)localObject2).d();
        }
        localObject2 = m;
        localObject3 = d;
        ((at.g)localObject2).c((at.m)localObject3);
        localObject2 = m;
        localObject3 = d;
        ((at.g)localObject2).b((at.m)localObject3);
        localObject2 = d;
        ((at.m)localObject2).a();
        boolean bool1 = p;
        if (bool1)
        {
          localObject2 = m;
          localObject3 = d;
          ((at.g)localObject2).b(this, (at.m)localObject3);
        }
        localObject2 = m;
        ((at.g)localObject2).a(null);
        m = null;
      }
      for (;;)
      {
        localObject1 = f;
        for (localObject2 = b;; localObject2 = b)
        {
          long l1 = 0L;
          a = l1;
          localObject3 = b;
          if (localObject3 == null) {
            break;
          }
        }
        localObject2 = d;
        ((at.m)localObject2).a();
      }
      localObject2 = c;
      int i1 = ((List)localObject2).size() + -1;
      for (int i2 = i1; i2 >= 0; i2 = i1)
      {
        ac.b localb = a;
        localObject2 = (View)c.get(i2);
        localb.d((View)localObject2);
        localObject2 = c;
        ((List)localObject2).remove(i2);
        i1 = i2 + -1;
      }
      localObject2 = a;
      ((ac.b)localObject2).b();
      m = paramg;
      if (paramg != null)
      {
        localObject2 = q;
        if (localObject2 != null)
        {
          localObject2 = new java/lang/IllegalArgumentException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("LayoutManager ");
          localObject3 = ((StringBuilder)localObject3).append(paramg).append(" is already attached to a RecyclerView: ");
          localObject1 = q;
          localObject3 = localObject1;
          ((IllegalArgumentException)localObject2).<init>((String)localObject3);
          throw ((Throwable)localObject2);
        }
        localObject2 = m;
        ((at.g)localObject2).a(this);
        boolean bool2 = p;
        if (bool2)
        {
          localObject2 = m;
          i2 = 1;
          v = i2;
        }
      }
      localObject2 = d;
      ((at.m)localObject2).b();
      requestLayout();
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    getScrollingChildHelper().a(paramBoolean);
  }
  
  public void setOnFlingListener(at.i parami)
  {
    ao = parami;
  }
  
  public void setOnScrollListener(at.k paramk)
  {
    at = paramk;
  }
  
  public void setPreserveFocusAfterLayout(boolean paramBoolean)
  {
    as = paramBoolean;
  }
  
  public void setRecycledViewPool(at.l paraml)
  {
    Object localObject = d;
    at.l locall = g;
    if (locall != null)
    {
      locall = g;
      locall.b();
    }
    g = paraml;
    if (paraml != null)
    {
      locall = g;
      localObject = i;
      ((at)localObject).getAdapter();
      locall.a();
    }
  }
  
  public void setRecyclerListener(at.n paramn)
  {
    n = paramn;
  }
  
  void setScrollState(int paramInt)
  {
    int i1 = ag;
    if (paramInt == i1) {}
    for (;;)
    {
      return;
      ag = paramInt;
      i1 = 2;
      if (paramInt != i1) {
        r();
      }
      Object localObject = m;
      if (localObject != null)
      {
        localObject = m;
        ((at.g)localObject).g(paramInt);
      }
      localObject = au;
      if (localObject != null)
      {
        localObject = au;
        i1 = ((List)localObject).size() + -1;
        while (i1 >= 0)
        {
          List localList = au;
          localList.get(i1);
          i1 += -1;
        }
      }
    }
  }
  
  public void setScrollingTouchSlop(int paramInt)
  {
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    int i1;
    switch (paramInt)
    {
    default: 
      String str1 = "RecyclerView";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("setScrollingTouchSlop(): bad argument constant ");
      localObject = ((StringBuilder)localObject).append(paramInt);
      String str2 = "; using default value";
      localObject = str2;
      Log.w(str1, (String)localObject);
    case 0: 
      i1 = localViewConfiguration.getScaledTouchSlop();
    }
    for (an = i1;; an = i1)
    {
      return;
      i1 = localViewConfiguration.getScaledPagingTouchSlop();
    }
  }
  
  public void setViewCacheExtension(at.s params)
  {
    d.h = params;
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return getScrollingChildHelper().a(paramInt);
  }
  
  public void stopNestedScroll()
  {
    getScrollingChildHelper().b();
  }
}


/* Location:              android/support/v7/widget/at.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */