package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.f.c;
import android.support.v4.f.e;
import android.support.v4.h.a.b.n;
import android.support.v4.h.a.f.c;
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
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class at
  extends ViewGroup
  implements o, t
{
  static final Interpolator L;
  private static final int[] M = { 16843830 };
  private static final int[] N = { 16842987 };
  private static final boolean O;
  private static final boolean P;
  private static final boolean Q;
  private static final Class<?>[] R;
  static final boolean a;
  static final boolean b;
  static final boolean c;
  h A;
  e B = new af();
  final t C = new t();
  ak D;
  ak.a E;
  final r F;
  boolean G;
  boolean H;
  boolean I;
  au J;
  final List<u> K;
  private final o S = new o();
  private p T;
  private final Rect U = new Rect();
  private final ArrayList<j> V = new ArrayList();
  private j W;
  private final int[] aA;
  private final int[] aB;
  private Runnable aC;
  private final bj.b aD;
  private int aa = 0;
  private boolean ab;
  private int ac;
  private final AccessibilityManager ad;
  private int ae = 0;
  private int af = 0;
  private int ag = 0;
  private int ah = -1;
  private VelocityTracker ai;
  private int aj;
  private int ak;
  private int al;
  private int am;
  private int an;
  private i ao;
  private final int ap;
  private final int aq;
  private float ar = Float.MIN_VALUE;
  private boolean as = true;
  private k at;
  private List<k> au;
  private at.e.a av;
  private d aw;
  private final int[] ax;
  private p ay;
  private final int[] az;
  final m d = new m();
  f e;
  ac f;
  final bj g = new bj();
  boolean h;
  final Runnable i = new Runnable()
  {
    public final void run()
    {
      if ((!r) || (isLayoutRequested())) {
        return;
      }
      if (!p)
      {
        requestLayout();
        return;
      }
      if (t)
      {
        s = true;
        return;
      }
      b();
    }
  };
  final Rect j = new Rect();
  final RectF k = new RectF();
  a l;
  g m;
  n n;
  final ArrayList<Object> o = new ArrayList();
  boolean p;
  boolean q;
  boolean r;
  boolean s;
  boolean t;
  boolean u;
  List<Object> v;
  boolean w = false;
  h x;
  h y;
  h z;
  
  static
  {
    if ((Build.VERSION.SDK_INT == 18) || (Build.VERSION.SDK_INT == 19) || (Build.VERSION.SDK_INT == 20))
    {
      bool = true;
      a = bool;
      if (Build.VERSION.SDK_INT < 23) {
        break label167;
      }
      bool = true;
      label62:
      b = bool;
      if (Build.VERSION.SDK_INT < 16) {
        break label172;
      }
      bool = true;
      label76:
      c = bool;
      if (Build.VERSION.SDK_INT < 21) {
        break label177;
      }
      bool = true;
      label90:
      O = bool;
      if (Build.VERSION.SDK_INT > 15) {
        break label182;
      }
      bool = true;
      label104:
      P = bool;
      if (Build.VERSION.SDK_INT > 15) {
        break label187;
      }
    }
    label167:
    label172:
    label177:
    label182:
    label187:
    for (boolean bool = true;; bool = false)
    {
      Q = bool;
      R = new Class[] { Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE };
      L = new Interpolator()
      {
        public final float getInterpolation(float paramAnonymousFloat)
        {
          paramAnonymousFloat -= 1.0F;
          return paramAnonymousFloat * (paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat) + 1.0F;
        }
      };
      return;
      bool = false;
      break;
      bool = false;
      break label62;
      bool = false;
      break label76;
      bool = false;
      break label90;
      bool = false;
      break label104;
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
    Object localObject1;
    label331:
    boolean bool1;
    label385:
    Object localObject2;
    if (O)
    {
      localObject1 = new ak.a();
      E = ((ak.a)localObject1);
      F = new r();
      G = false;
      H = false;
      av = new f();
      I = false;
      ax = new int[2];
      az = new int[2];
      aA = new int[2];
      aB = new int[2];
      K = new ArrayList();
      aC = new Runnable()
      {
        public final void run()
        {
          if (B != null) {
            B.a();
          }
          I = false;
        }
      };
      aD = new bj.b()
      {
        public final void a(at.u paramAnonymousu)
        {
          m.a(a, d);
        }
        
        public final void a(at.u paramAnonymousu, at.e.b paramAnonymousb1, at.e.b paramAnonymousb2)
        {
          d.b(paramAnonymousu);
          at localat = at.this;
          localat.a(paramAnonymousu);
          paramAnonymousu.a(false);
          if (B.a(paramAnonymousu, paramAnonymousb1, paramAnonymousb2)) {
            localat.k();
          }
        }
        
        public final void b(at.u paramAnonymousu, at.e.b paramAnonymousb1, at.e.b paramAnonymousb2)
        {
          at localat = at.this;
          paramAnonymousu.a(false);
          if (B.b(paramAnonymousu, paramAnonymousb1, paramAnonymousb2)) {
            localat.k();
          }
        }
        
        public final void c(at.u paramAnonymousu, at.e.b paramAnonymousb1, at.e.b paramAnonymousb2)
        {
          paramAnonymousu.a(false);
          if (w) {
            if (B.a(paramAnonymousu, paramAnonymousu, paramAnonymousb1, paramAnonymousb2)) {
              k();
            }
          }
          while (!B.c(paramAnonymousu, paramAnonymousb1, paramAnonymousb2)) {
            return;
          }
          k();
        }
      };
      if (paramAttributeSet == null) {
        break label727;
      }
      localObject1 = paramContext.obtainStyledAttributes(paramAttributeSet, N, paramInt, 0);
      h = ((TypedArray)localObject1).getBoolean(0, true);
      ((TypedArray)localObject1).recycle();
      setScrollContainer(true);
      setFocusableInTouchMode(true);
      localObject1 = ViewConfiguration.get(paramContext);
      an = ((ViewConfiguration)localObject1).getScaledTouchSlop();
      ap = ((ViewConfiguration)localObject1).getScaledMinimumFlingVelocity();
      aq = ((ViewConfiguration)localObject1).getScaledMaximumFlingVelocity();
      if (getOverScrollMode() != 2) {
        break label735;
      }
      bool1 = true;
      setWillNotDraw(bool1);
      B.h = av;
      e = new f(new f.a()
      {
        private void c(f.b paramAnonymousb)
        {
          switch (a)
          {
          case 3: 
          case 5: 
          case 6: 
          case 7: 
          default: 
            return;
          case 1: 
            m.a(b, d);
            return;
          case 2: 
            m.b(b, d);
            return;
          case 4: 
            m.c(b, d);
            return;
          }
          m.d(b, d);
        }
        
        public final at.u a(int paramAnonymousInt)
        {
          at localat = at.this;
          int j = f.b();
          int i = 0;
          Object localObject1 = null;
          Object localObject2;
          if (i < j)
          {
            localObject2 = at.c(f.c(i));
            if ((localObject2 == null) || (((at.u)localObject2).m()) || (c != paramAnonymousInt)) {
              break label127;
            }
            localObject1 = localObject2;
            if (f.d(a)) {
              localObject1 = localObject2;
            }
          }
          label127:
          for (;;)
          {
            i += 1;
            break;
            if (localObject1 == null) {
              localObject2 = null;
            }
            do
            {
              return (at.u)localObject2;
              localObject2 = localObject1;
            } while (!f.d(a));
            return null;
          }
        }
        
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          a(paramAnonymousInt1, paramAnonymousInt2, true);
          G = true;
          at.r localr = F;
          c += paramAnonymousInt2;
        }
        
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Object paramAnonymousObject)
        {
          Object localObject = at.this;
          int j = f.b();
          int i = 0;
          while (i < j)
          {
            View localView = f.c(i);
            at.u localu = at.c(localView);
            if ((localu != null) && (!localu.b()) && (c >= paramAnonymousInt1) && (c < paramAnonymousInt1 + paramAnonymousInt2))
            {
              localu.b(2);
              localu.a(paramAnonymousObject);
              getLayoutParamse = true;
            }
            i += 1;
          }
          paramAnonymousObject = d;
          i = c.size() - 1;
          while (i >= 0)
          {
            localObject = (at.u)c.get(i);
            if (localObject != null)
            {
              j = c;
              if ((j >= paramAnonymousInt1) && (j < paramAnonymousInt1 + paramAnonymousInt2))
              {
                ((at.u)localObject).b(2);
                ((at.m)paramAnonymousObject).c(i);
              }
            }
            i -= 1;
          }
          H = true;
        }
        
        public final void a(f.b paramAnonymousb)
        {
          c(paramAnonymousb);
        }
        
        public final void b(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          a(paramAnonymousInt1, paramAnonymousInt2, false);
          G = true;
        }
        
        public final void b(f.b paramAnonymousb)
        {
          c(paramAnonymousb);
        }
        
        public final void c(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          at localat = at.this;
          int j = f.b();
          int i = 0;
          while (i < j)
          {
            localObject = at.c(f.c(i));
            if ((localObject != null) && (!((at.u)localObject).b()) && (c >= paramAnonymousInt1))
            {
              ((at.u)localObject).a(paramAnonymousInt2, false);
              F.f = true;
            }
            i += 1;
          }
          Object localObject = d;
          j = c.size();
          i = 0;
          while (i < j)
          {
            at.u localu = (at.u)c.get(i);
            if ((localu != null) && (c >= paramAnonymousInt1)) {
              localu.a(paramAnonymousInt2, true);
            }
            i += 1;
          }
          localat.requestLayout();
          G = true;
        }
        
        public final void d(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          int n = -1;
          at localat = at.this;
          int i1 = f.b();
          int i;
          int j;
          int k;
          int m;
          if (paramAnonymousInt1 < paramAnonymousInt2)
          {
            i = -1;
            j = paramAnonymousInt2;
            k = paramAnonymousInt1;
            m = 0;
            label35:
            if (m >= i1) {
              break label139;
            }
            localObject = at.c(f.c(m));
            if ((localObject != null) && (c >= k) && (c <= j))
            {
              if (c != paramAnonymousInt1) {
                break label129;
              }
              ((at.u)localObject).a(paramAnonymousInt2 - paramAnonymousInt1, false);
            }
          }
          for (;;)
          {
            F.f = true;
            m += 1;
            break label35;
            i = 1;
            j = paramAnonymousInt1;
            k = paramAnonymousInt2;
            break;
            label129:
            ((at.u)localObject).a(i, false);
          }
          label139:
          Object localObject = d;
          label173:
          at.u localu;
          if (paramAnonymousInt1 < paramAnonymousInt2)
          {
            j = paramAnonymousInt2;
            k = paramAnonymousInt1;
            i = n;
            n = c.size();
            m = 0;
            if (m >= n) {
              break label268;
            }
            localu = (at.u)c.get(m);
            if ((localu != null) && (c >= k) && (c <= j))
            {
              if (c != paramAnonymousInt1) {
                break label258;
              }
              localu.a(paramAnonymousInt2 - paramAnonymousInt1, false);
            }
          }
          for (;;)
          {
            m += 1;
            break label173;
            i = 1;
            j = paramAnonymousInt1;
            k = paramAnonymousInt2;
            break;
            label258:
            localu.a(i, false);
          }
          label268:
          localat.requestLayout();
          G = true;
        }
      });
      f = new ac(new ac.b()
      {
        public final int a()
        {
          return getChildCount();
        }
        
        public final int a(View paramAnonymousView)
        {
          return indexOfChild(paramAnonymousView);
        }
        
        public final void a(int paramAnonymousInt)
        {
          View localView = getChildAt(paramAnonymousInt);
          if (localView != null) {
            g(localView);
          }
          removeViewAt(paramAnonymousInt);
        }
        
        public final void a(View paramAnonymousView, int paramAnonymousInt)
        {
          addView(paramAnonymousView, paramAnonymousInt);
          at localat = at.this;
          at.c(paramAnonymousView);
          if (v != null)
          {
            paramAnonymousInt = v.size() - 1;
            while (paramAnonymousInt >= 0)
            {
              v.get(paramAnonymousInt);
              paramAnonymousInt -= 1;
            }
          }
        }
        
        public final void a(View paramAnonymousView, int paramAnonymousInt, ViewGroup.LayoutParams paramAnonymousLayoutParams)
        {
          at.u localu = at.c(paramAnonymousView);
          if (localu != null)
          {
            if ((!localu.n()) && (!localu.b())) {
              throw new IllegalArgumentException("Called attach on a child which is not detached: " + localu);
            }
            localu.i();
          }
          at.a(at.this, paramAnonymousView, paramAnonymousInt, paramAnonymousLayoutParams);
        }
        
        public final at.u b(View paramAnonymousView)
        {
          return at.c(paramAnonymousView);
        }
        
        public final View b(int paramAnonymousInt)
        {
          return getChildAt(paramAnonymousInt);
        }
        
        public final void b()
        {
          int j = getChildCount();
          int i = 0;
          while (i < j)
          {
            g(b(i));
            i += 1;
          }
          removeAllViews();
        }
        
        public final void c(int paramAnonymousInt)
        {
          Object localObject = b(paramAnonymousInt);
          if (localObject != null)
          {
            localObject = at.c((View)localObject);
            if (localObject != null)
            {
              if ((((at.u)localObject).n()) && (!((at.u)localObject).b())) {
                throw new IllegalArgumentException("called detach on an already detached child " + localObject);
              }
              ((at.u)localObject).b(256);
            }
          }
          at.a(at.this, paramAnonymousInt);
        }
        
        public final void c(View paramAnonymousView)
        {
          paramAnonymousView = at.c(paramAnonymousView);
          if (paramAnonymousView != null) {
            at.u.a(paramAnonymousView, at.this);
          }
        }
        
        public final void d(View paramAnonymousView)
        {
          paramAnonymousView = at.c(paramAnonymousView);
          if (paramAnonymousView != null) {
            at.u.b(paramAnonymousView, at.this);
          }
        }
      });
      if (w.d(this) == 0) {
        w.c(this, 1);
      }
      ad = ((AccessibilityManager)getContext().getSystemService("accessibility"));
      setAccessibilityDelegateCompat(new au(this));
      if (paramAttributeSet == null) {
        break label1066;
      }
      localObject1 = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.RecyclerView, paramInt, 0);
      localObject2 = ((TypedArray)localObject1).getString(a.a.RecyclerView_layoutManager);
      if (((TypedArray)localObject1).getInt(a.a.RecyclerView_android_descendantFocusability, -1) == -1) {
        setDescendantFocusability(262144);
      }
      ((TypedArray)localObject1).recycle();
      if (localObject2 != null)
      {
        localObject1 = ((String)localObject2).trim();
        if (((String)localObject1).length() != 0)
        {
          if (((String)localObject1).charAt(0) != '.') {
            break label741;
          }
          localObject1 = paramContext.getPackageName() + (String)localObject1;
        }
      }
    }
    for (;;)
    {
      try
      {
        Class localClass;
        if (isInEditMode())
        {
          localObject2 = getClass().getClassLoader();
          localClass = ((ClassLoader)localObject2).loadClass((String)localObject1).asSubclass(g.class);
        }
        try
        {
          localConstructor = localClass.getConstructor(R);
          localObject2 = new Object[4];
          localObject2[0] = paramContext;
          localObject2[1] = paramAttributeSet;
          localObject2[2] = Integer.valueOf(paramInt);
          localObject2[3] = Integer.valueOf(0);
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          try
          {
            Constructor localConstructor = localClass.getConstructor(new Class[0]);
            localThrowable = null;
          }
          catch (NoSuchMethodException paramContext)
          {
            Throwable localThrowable;
            paramContext.initCause(localThrowable);
            throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Error creating LayoutManager " + (String)localObject1, paramContext);
          }
        }
        localConstructor.setAccessible(true);
        setLayoutManager((g)localConstructor.newInstance((Object[])localObject2));
        bool1 = bool2;
        if (Build.VERSION.SDK_INT >= 21)
        {
          paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, M, paramInt, 0);
          bool1 = paramContext.getBoolean(0, true);
          paramContext.recycle();
        }
        setNestedScrollingEnabled(bool1);
        return;
        localObject1 = null;
        break;
        label727:
        h = true;
        break label331;
        label735:
        bool1 = false;
        break label385;
        label741:
        if (((String)localObject1).contains(".")) {
          continue;
        }
        localObject1 = at.class.getPackage().getName() + '.' + (String)localObject1;
        continue;
        localObject2 = paramContext.getClassLoader();
        continue;
        setDescendantFocusability(262144);
      }
      catch (ClassNotFoundException paramContext)
      {
        throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Unable to find LayoutManager " + (String)localObject1, paramContext);
      }
      catch (InvocationTargetException paramContext)
      {
        throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + (String)localObject1, paramContext);
      }
      catch (InstantiationException paramContext)
      {
        throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + (String)localObject1, paramContext);
      }
      catch (IllegalAccessException paramContext)
      {
        throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Cannot access non-public constructor " + (String)localObject1, paramContext);
      }
      catch (ClassCastException paramContext)
      {
        throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Class is not a LayoutManager " + (String)localObject1, paramContext);
      }
      label1066:
      bool1 = bool2;
    }
  }
  
  private View A()
  {
    int i3;
    int i2;
    if (F.l != -1)
    {
      i1 = F.l;
      i3 = F.a();
      i2 = i1;
    }
    u localu;
    for (;;)
    {
      if (i2 >= i3) {
        break label75;
      }
      localu = b(i2);
      if (localu == null) {
        break label75;
      }
      if (a.hasFocusable())
      {
        return a;
        i1 = 0;
        break;
      }
      i2 += 1;
    }
    label75:
    int i1 = Math.min(i3, i1) - 1;
    while (i1 >= 0)
    {
      localu = b(i1);
      if (localu == null) {
        return null;
      }
      if (a.hasFocusable()) {
        return a;
      }
      i1 -= 1;
    }
    return null;
  }
  
  private void B()
  {
    F.a(1);
    F.i = false;
    c();
    g.a();
    h();
    x();
    if ((as) && (hasFocus()) && (l != null)) {}
    for (Object localObject1 = getFocusedChild();; localObject1 = null)
    {
      if (localObject1 == null)
      {
        localObject1 = null;
        if (localObject1 != null) {
          break label355;
        }
        z();
        label79:
        localObject1 = F;
        if ((!F.j) || (!H)) {
          break label528;
        }
      }
      int i2;
      int i1;
      Object localObject2;
      label355:
      Object localObject3;
      label493:
      label528:
      for (boolean bool = true;; bool = false)
      {
        h = bool;
        H = false;
        G = false;
        F.g = F.k;
        F.e = l.a();
        a(ax);
        if (!F.j) {
          break label533;
        }
        i2 = f.a();
        i1 = 0;
        long l1;
        while (i1 < i2)
        {
          localObject1 = c(f.b(i1));
          if ((!((u)localObject1).b()) && ((!((u)localObject1).j()) || (l.e)))
          {
            e.d((u)localObject1);
            ((u)localObject1).p();
            localObject2 = new at.e.b().a((u)localObject1);
            g.a((u)localObject1, (at.e.b)localObject2);
            if ((F.h) && (((u)localObject1).s()) && (!((u)localObject1).m()) && (!((u)localObject1).b()) && (!((u)localObject1).j()))
            {
              l1 = d((u)localObject1);
              g.a(l1, (u)localObject1);
            }
          }
          i1 += 1;
        }
        localObject1 = b((View)localObject1);
        if (localObject1 == null)
        {
          localObject1 = null;
          break;
        }
        localObject1 = a((View)localObject1);
        break;
        localObject2 = F;
        if (l.e)
        {
          l1 = e;
          m = l1;
          localObject2 = F;
          if (!w) {
            break label493;
          }
          i1 = -1;
        }
        for (;;)
        {
          l = i1;
          localObject3 = F;
          localObject1 = a;
          i1 = ((View)localObject1).getId();
          while ((!((View)localObject1).isFocused()) && ((localObject1 instanceof ViewGroup)) && (((View)localObject1).hasFocus()))
          {
            localObject2 = ((ViewGroup)localObject1).getFocusedChild();
            localObject1 = localObject2;
            if (((View)localObject2).getId() != -1)
            {
              i1 = ((View)localObject2).getId();
              localObject1 = localObject2;
            }
          }
          l1 = -1L;
          break;
          if (((u)localObject1).m()) {
            i1 = d;
          } else {
            i1 = ((u)localObject1).d();
          }
        }
        n = i1;
        break label79;
      }
      label533:
      if (F.k)
      {
        i2 = f.b();
        i1 = 0;
        while (i1 < i2)
        {
          localObject1 = c(f.c(i1));
          if ((!((u)localObject1).b()) && (d == -1)) {
            d = c;
          }
          i1 += 1;
        }
        bool = F.f;
        F.f = false;
        m.c(d, F);
        F.f = bool;
        i1 = 0;
        if (i1 < f.a())
        {
          localObject3 = c(f.b(i1));
          label712:
          at.e.b localb;
          if (!((u)localObject3).b())
          {
            localObject1 = (bj.a)g.a.get(localObject3);
            if ((localObject1 == null) || ((a & 0x4) == 0)) {
              break label770;
            }
            i2 = 1;
            if (i2 == 0)
            {
              e.d((u)localObject3);
              bool = ((u)localObject3).a(8192);
              ((u)localObject3).p();
              localb = new at.e.b().a((u)localObject3);
              if (!bool) {
                break label775;
              }
              a((u)localObject3, localb);
            }
          }
          for (;;)
          {
            i1 += 1;
            break;
            label770:
            i2 = 0;
            break label712;
            label775:
            bj localbj = g;
            localObject2 = (bj.a)a.get(localObject3);
            localObject1 = localObject2;
            if (localObject2 == null)
            {
              localObject1 = bj.a.a();
              a.put(localObject3, localObject1);
            }
            a |= 0x2;
            b = localb;
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
    }
  }
  
  private void C()
  {
    c();
    h();
    F.a(6);
    e.e();
    F.e = l.a();
    F.c = 0;
    F.g = false;
    m.c(d, F);
    F.f = false;
    T = null;
    r localr = F;
    if ((F.j) && (B != null)) {}
    for (boolean bool = true;; bool = false)
    {
      j = bool;
      F.d = 4;
      i();
      a(false);
      return;
    }
  }
  
  private void D()
  {
    int i2 = 0;
    int i3 = f.b();
    int i1 = 0;
    while (i1 < i3)
    {
      localObject = c(f.c(i1));
      if (!((u)localObject).b()) {
        ((u)localObject).a();
      }
      i1 += 1;
    }
    Object localObject = d;
    i3 = c.size();
    i1 = 0;
    while (i1 < i3)
    {
      ((u)c.get(i1)).a();
      i1 += 1;
    }
    i3 = a.size();
    i1 = 0;
    while (i1 < i3)
    {
      ((u)a.get(i1)).a();
      i1 += 1;
    }
    if (b != null)
    {
      i3 = b.size();
      i1 = i2;
      while (i1 < i3)
      {
        ((u)b.get(i1)).a();
        i1 += 1;
      }
    }
  }
  
  private u a(long paramLong)
  {
    u localu2 = null;
    u localu1 = localu2;
    if (l != null)
    {
      if (l.e) {
        break label31;
      }
      localu1 = localu2;
    }
    label31:
    int i1;
    do
    {
      return localu1;
      int i2 = f.b();
      i1 = 0;
      localu1 = null;
      if (i1 >= i2) {
        break;
      }
      localu2 = c(f.c(i1));
      if ((localu2 == null) || (localu2.m()) || (e != paramLong)) {
        break label120;
      }
      localu1 = localu2;
    } while (!f.d(a));
    localu1 = localu2;
    label120:
    for (;;)
    {
      i1 += 1;
      break;
      return localu1;
    }
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = n.b(paramMotionEvent);
    if (paramMotionEvent.getPointerId(i1) == ah) {
      if (i1 != 0) {
        break label75;
      }
    }
    label75:
    for (i1 = 1;; i1 = 0)
    {
      ah = paramMotionEvent.getPointerId(i1);
      int i2 = (int)(paramMotionEvent.getX(i1) + 0.5F);
      al = i2;
      aj = i2;
      i1 = (int)(paramMotionEvent.getY(i1) + 0.5F);
      am = i1;
      ak = i1;
      return;
    }
  }
  
  static void a(View paramView, Rect paramRect)
  {
    h localh = (h)paramView.getLayoutParams();
    Rect localRect = d;
    int i1 = paramView.getLeft();
    int i2 = left;
    int i3 = leftMargin;
    int i4 = paramView.getTop();
    int i5 = top;
    int i6 = topMargin;
    int i7 = paramView.getRight();
    int i8 = right;
    int i9 = rightMargin;
    int i10 = paramView.getBottom();
    int i11 = bottom;
    paramRect.set(i1 - i2 - i3, i4 - i5 - i6, i7 + i8 + i9, bottomMargin + (i11 + i10));
  }
  
  private void a(View paramView1, View paramView2)
  {
    boolean bool2 = true;
    Object localObject;
    Rect localRect;
    boolean bool1;
    if (paramView2 != null)
    {
      localObject = paramView2;
      j.set(0, 0, ((View)localObject).getWidth(), ((View)localObject).getHeight());
      localObject = ((View)localObject).getLayoutParams();
      if ((localObject instanceof h))
      {
        localObject = (h)localObject;
        if (!e)
        {
          localObject = d;
          localRect = j;
          left -= left;
          localRect = j;
          right += right;
          localRect = j;
          top -= top;
          localRect = j;
          int i1 = bottom;
          bottom = (bottom + i1);
        }
      }
      if (paramView2 != null)
      {
        offsetDescendantRectToMyCoords(paramView2, j);
        offsetRectIntoDescendantCoords(paramView1, j);
      }
      localObject = m;
      localRect = j;
      if (r) {
        break label225;
      }
      bool1 = true;
      label200:
      if (paramView2 != null) {
        break label231;
      }
    }
    for (;;)
    {
      ((g)localObject).a(this, paramView1, localRect, bool1, bool2);
      return;
      localObject = paramView1;
      break;
      label225:
      bool1 = false;
      break label200;
      label231:
      bool2 = false;
    }
  }
  
  private void a(int[] paramArrayOfInt)
  {
    int i7 = f.a();
    if (i7 == 0)
    {
      paramArrayOfInt[0] = -1;
      paramArrayOfInt[1] = -1;
      return;
    }
    int i1 = Integer.MAX_VALUE;
    int i3 = Integer.MIN_VALUE;
    int i5 = 0;
    int i4;
    int i2;
    if (i5 < i7)
    {
      u localu = c(f.b(i5));
      i4 = i1;
      if (localu.b()) {
        break label122;
      }
      int i6 = localu.c();
      i2 = i1;
      if (i6 < i1) {
        i2 = i6;
      }
      i4 = i2;
      if (i6 <= i3) {
        break label122;
      }
      i1 = i6;
    }
    for (;;)
    {
      i5 += 1;
      i3 = i1;
      i1 = i2;
      break;
      paramArrayOfInt[0] = i1;
      paramArrayOfInt[1] = i3;
      return;
      label122:
      i1 = i3;
      i2 = i4;
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, MotionEvent paramMotionEvent)
  {
    int i2 = 0;
    int i8 = 0;
    int i4 = 0;
    int i6 = 0;
    int i5 = 0;
    int i1 = 0;
    int i3 = 0;
    int i7 = 0;
    b();
    if (l != null)
    {
      c();
      h();
      e.a("RV Scroll");
      i2 = i8;
      if (paramInt1 != 0)
      {
        i1 = m.a(paramInt1, d, F);
        i2 = paramInt1 - i1;
      }
      i3 = i7;
      i4 = i6;
      if (paramInt2 != 0)
      {
        i3 = m.b(paramInt2, d, F);
        i4 = paramInt2 - i3;
      }
      e.a();
      o();
      i();
      a(false);
      i5 = i1;
    }
    if (!o.isEmpty()) {
      invalidate();
    }
    if (dispatchNestedScroll(i5, i3, i2, i4, az))
    {
      al -= az[0];
      am -= az[1];
      if (paramMotionEvent != null) {
        paramMotionEvent.offsetLocation(az[0], az[1]);
      }
      paramMotionEvent = aB;
      paramMotionEvent[0] += az[0];
      paramMotionEvent = aB;
      paramMotionEvent[1] += az[1];
    }
    while (getOverScrollMode() == 2)
    {
      if ((i5 != 0) || (i3 != 0)) {
        m();
      }
      if (!awakenScrollBars()) {
        invalidate();
      }
      if ((i5 == 0) && (i3 == 0)) {
        break;
      }
      return true;
    }
    float f1;
    float f2;
    float f3;
    float f4;
    if (paramMotionEvent != null)
    {
      f1 = paramMotionEvent.getX();
      f2 = i2;
      f3 = paramMotionEvent.getY();
      f4 = i4;
      i2 = 0;
      if (f2 >= 0.0F) {
        break label456;
      }
      d();
      i1 = i2;
      if (x.a(-f2 / getWidth(), 1.0F - f3 / getHeight())) {
        i1 = 1;
      }
      label379:
      if (f4 >= 0.0F) {
        break label507;
      }
      f();
      i2 = i1;
      if (y.a(-f4 / getHeight(), f1 / getWidth())) {
        i2 = 1;
      }
    }
    for (;;)
    {
      if ((i2 != 0) || (f2 != 0.0F) || (f4 != 0.0F)) {
        w.c(this);
      }
      a(paramInt1, paramInt2);
      break;
      label456:
      i1 = i2;
      if (f2 <= 0.0F) {
        break label379;
      }
      e();
      i1 = i2;
      if (!z.a(f2 / getWidth(), f3 / getHeight())) {
        break label379;
      }
      i1 = 1;
      break label379;
      label507:
      i2 = i1;
      if (f4 > 0.0F)
      {
        g();
        i2 = i1;
        if (A.a(f4 / getHeight(), 1.0F - f1 / getWidth())) {
          i2 = 1;
        }
      }
    }
    return false;
  }
  
  private boolean a(View paramView1, View paramView2, int paramInt)
  {
    j.set(0, 0, paramView1.getWidth(), paramView1.getHeight());
    U.set(0, 0, paramView2.getWidth(), paramView2.getHeight());
    offsetDescendantRectToMyCoords(paramView1, j);
    offsetDescendantRectToMyCoords(paramView2, U);
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("direction must be absolute. received:" + paramInt);
    case 17: 
      if (((j.right <= U.right) && (j.left < U.right)) || (j.left <= U.left)) {
        break;
      }
    }
    do
    {
      do
      {
        do
        {
          return true;
          return false;
        } while (((j.left < U.left) || (j.right <= U.left)) && (j.right < U.right));
        return false;
      } while (((j.bottom > U.bottom) || (j.top >= U.bottom)) && (j.top > U.top));
      return false;
    } while (((j.top < U.top) || (j.bottom <= U.top)) && (j.bottom < U.bottom));
    return false;
  }
  
  private u b(int paramInt)
  {
    Object localObject = null;
    if (w) {}
    int i1;
    u localu;
    do
    {
      return (u)localObject;
      int i2 = f.b();
      i1 = 0;
      localObject = null;
      if (i1 >= i2) {
        break;
      }
      localu = c(f.c(i1));
      if ((localu == null) || (localu.m()) || (c(localu) != paramInt)) {
        break label100;
      }
      localObject = localu;
    } while (!f.d(a));
    localObject = localu;
    label100:
    for (;;)
    {
      i1 += 1;
      break;
      return (u)localObject;
    }
  }
  
  static void b(u paramu)
  {
    Object localObject;
    if (b != null) {
      localObject = (View)b.get();
    }
    while (localObject != null)
    {
      if (localObject == a) {
        return;
      }
      localObject = ((View)localObject).getParent();
      if ((localObject instanceof View)) {
        localObject = (View)localObject;
      } else {
        localObject = null;
      }
    }
    b = null;
  }
  
  static u c(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    return getLayoutParamsc;
  }
  
  public static int d(View paramView)
  {
    paramView = c(paramView);
    if (paramView != null) {
      return paramView.c();
    }
    return -1;
  }
  
  private long d(u paramu)
  {
    if (l.e) {
      return e;
    }
    return c;
  }
  
  static at f(View paramView)
  {
    if (!(paramView instanceof ViewGroup)) {
      return null;
    }
    if ((paramView instanceof at)) {
      return (at)paramView;
    }
    paramView = (ViewGroup)paramView;
    int i2 = paramView.getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      at localat = f(paramView.getChildAt(i1));
      if (localat != null) {
        return localat;
      }
      i1 += 1;
    }
    return null;
  }
  
  private float getScrollFactor()
  {
    if (ar == Float.MIN_VALUE)
    {
      TypedValue localTypedValue = new TypedValue();
      if (getContext().getTheme().resolveAttribute(16842829, localTypedValue, true)) {
        ar = localTypedValue.getDimension(getContext().getResources().getDisplayMetrics());
      }
    }
    else
    {
      return ar;
    }
    return 0.0F;
  }
  
  private p getScrollingChildHelper()
  {
    if (ay == null) {
      ay = new p(this);
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
    if (m != null) {
      m.q();
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
    if (ai != null) {
      ai.clear();
    }
    stopNestedScroll();
    boolean bool2 = false;
    if (x != null) {
      bool2 = x.b();
    }
    boolean bool1 = bool2;
    if (y != null) {
      bool1 = bool2 | y.b();
    }
    bool2 = bool1;
    if (z != null) {
      bool2 = bool1 | z.b();
    }
    bool1 = bool2;
    if (A != null) {
      bool1 = bool2 | A.b();
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
    return ae > 0;
  }
  
  private boolean w()
  {
    return (B != null) && (m.c());
  }
  
  private void x()
  {
    boolean bool2 = true;
    if (w)
    {
      e.a();
      m.a();
    }
    int i1;
    label53:
    r localr;
    if (w())
    {
      e.b();
      if ((!G) && (!H)) {
        break label172;
      }
      i1 = 1;
      localr = F;
      if ((!r) || (B == null) || ((!w) && (i1 == 0) && (!m.u)) || ((w) && (!l.e))) {
        break label177;
      }
      bool1 = true;
      label113:
      j = bool1;
      localr = F;
      if ((!F.j) || (i1 == 0) || (w) || (!w())) {
        break label182;
      }
    }
    label172:
    label177:
    label182:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      k = bool1;
      return;
      e.e();
      break;
      i1 = 0;
      break label53;
      bool1 = false;
      break label113;
    }
  }
  
  private void y()
  {
    if (l == null)
    {
      Log.e("RecyclerView", "No adapter attached; skipping layout");
      return;
    }
    if (m == null)
    {
      Log.e("RecyclerView", "No layout manager attached; skipping layout");
      return;
    }
    F.i = false;
    long l1;
    at.e.b localb;
    boolean bool1;
    boolean bool2;
    Object localObject3;
    int i3;
    if (F.d == 1)
    {
      B();
      m.b(this);
      C();
      F.a(4);
      c();
      h();
      F.d = 1;
      if (!F.j) {
        break label668;
      }
      i1 = f.a() - 1;
      if (i1 < 0) {
        break label657;
      }
      localObject1 = c(f.b(i1));
      if (!((u)localObject1).b())
      {
        l1 = d((u)localObject1);
        localb = new at.e.b().a((u)localObject1);
        localObject2 = (u)g.b.a(l1);
        if ((localObject2 == null) || (((u)localObject2).b())) {
          break label643;
        }
        bool1 = g.a((u)localObject2);
        bool2 = g.a((u)localObject1);
        if ((bool1) && (localObject2 == localObject1)) {
          break label643;
        }
        localObject3 = g.a((u)localObject2, 4);
        g.b((u)localObject1, localb);
        localb = g.a((u)localObject1, 8);
        if (localObject3 != null) {
          break label548;
        }
        i3 = f.a();
        i2 = 0;
      }
    }
    else
    {
      for (;;)
      {
        if (i2 >= i3) {
          break label505;
        }
        localObject3 = c(f.b(i2));
        if ((localObject3 != localObject1) && (d((u)localObject3) == l1))
        {
          if ((l != null) && (l.e))
          {
            throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + localObject3 + " \n View Holder 2:" + localObject1);
            localObject1 = e;
            if ((!b.isEmpty()) && (!a.isEmpty())) {}
            for (i1 = 1;; i1 = 0)
            {
              if ((i1 == 0) && (m.D == getWidth()) && (m.E == getHeight())) {
                break label450;
              }
              m.b(this);
              C();
              break;
            }
            label450:
            m.b(this);
            break;
          }
          throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + localObject3 + " \n View Holder 2:" + localObject1);
        }
        i2 += 1;
      }
      label505:
      Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + localObject2 + " cannot be found but it is necessary for " + localObject1);
    }
    for (;;)
    {
      i1 -= 1;
      break;
      label548:
      ((u)localObject2).a(false);
      if (bool1) {
        a((u)localObject2);
      }
      if (localObject2 != localObject1)
      {
        if (bool2) {
          a((u)localObject1);
        }
        h = ((u)localObject1);
        a((u)localObject2);
        d.b((u)localObject2);
        ((u)localObject1).a(false);
        i = ((u)localObject2);
      }
      if (B.a((u)localObject2, (u)localObject1, (at.e.b)localObject3, localb))
      {
        k();
        continue;
        label643:
        g.b((u)localObject1, localb);
      }
    }
    label657:
    g.a(aD);
    label668:
    m.b(d);
    F.b = F.e;
    w = false;
    F.j = false;
    F.k = false;
    m.u = false;
    if (d.b != null) {
      d.b.clear();
    }
    if (m.A)
    {
      m.z = 0;
      m.A = false;
      d.b();
    }
    m.a(F);
    i();
    a(false);
    g.a();
    int i1 = ax[0];
    int i2 = ax[1];
    a(ax);
    if ((ax[0] != i1) || (ax[1] != i2))
    {
      i1 = 1;
      if (i1 != 0) {
        m();
      }
      if ((as) && (l != null) && (hasFocus()) && (getDescendantFocusability() != 393216) && ((getDescendantFocusability() != 131072) || (!isFocused()))) {
        break label912;
      }
    }
    label912:
    label965:
    do
    {
      for (;;)
      {
        z();
        return;
        i1 = 0;
        break;
        if (isFocused()) {
          break label977;
        }
        localObject1 = getFocusedChild();
        if ((!Q) || ((((View)localObject1).getParent() != null) && (((View)localObject1).hasFocus()))) {
          break label965;
        }
        if (f.a() != 0) {
          break label977;
        }
        requestFocus();
      }
    } while (!f.d((View)localObject1));
    label977:
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (F.m != -1L)
    {
      localObject1 = localObject2;
      if (l.e) {
        localObject1 = a(F.m);
      }
    }
    localObject2 = null;
    if ((localObject1 == null) || (f.d(a)) || (!a.hasFocusable()))
    {
      localObject1 = localObject2;
      if (f.a() > 0) {
        localObject1 = A();
      }
      label1079:
      if (localObject1 == null) {
        break label1147;
      }
      if (F.n == -1L) {
        break label1149;
      }
      localObject2 = ((View)localObject1).findViewById(F.n);
      if ((localObject2 == null) || (!((View)localObject2).isFocusable())) {
        break label1149;
      }
      localObject1 = localObject2;
    }
    label1147:
    label1149:
    for (;;)
    {
      ((View)localObject1).requestFocus();
      break;
      localObject1 = a;
      break label1079;
      break;
    }
  }
  
  private void z()
  {
    F.m = -1L;
    F.l = -1;
    F.n = -1;
  }
  
  public final u a(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    if ((localViewParent != null) && (localViewParent != this)) {
      throw new IllegalArgumentException("View " + paramView + " is not a direct child of " + this);
    }
    return c(paramView);
  }
  
  final void a()
  {
    if (B != null) {
      B.d();
    }
    if (m != null)
    {
      m.c(d);
      m.b(d);
    }
    d.a();
  }
  
  final void a(int paramInt)
  {
    if (m == null) {
      return;
    }
    m.b(paramInt);
    awakenScrollBars();
  }
  
  final void a(int paramInt1, int paramInt2)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (x != null)
    {
      bool1 = bool2;
      if (!x.a())
      {
        bool1 = bool2;
        if (paramInt1 > 0) {
          bool1 = x.b();
        }
      }
    }
    bool2 = bool1;
    if (z != null)
    {
      bool2 = bool1;
      if (!z.a())
      {
        bool2 = bool1;
        if (paramInt1 < 0) {
          bool2 = bool1 | z.b();
        }
      }
    }
    bool1 = bool2;
    if (y != null)
    {
      bool1 = bool2;
      if (!y.a())
      {
        bool1 = bool2;
        if (paramInt2 > 0) {
          bool1 = bool2 | y.b();
        }
      }
    }
    bool2 = bool1;
    if (A != null)
    {
      bool2 = bool1;
      if (!A.a())
      {
        bool2 = bool1;
        if (paramInt2 < 0) {
          bool2 = bool1 | A.b();
        }
      }
    }
    if (bool2) {
      w.c(this);
    }
  }
  
  final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i2 = f.b();
    int i1 = 0;
    if (i1 < i2)
    {
      localObject = c(f.c(i1));
      if ((localObject != null) && (!((u)localObject).b()))
      {
        if (c < paramInt1 + paramInt2) {
          break label82;
        }
        ((u)localObject).a(-paramInt2, paramBoolean);
        F.f = true;
      }
      for (;;)
      {
        i1 += 1;
        break;
        label82:
        if (c >= paramInt1)
        {
          int i3 = -paramInt2;
          ((u)localObject).b(8);
          ((u)localObject).a(i3, paramBoolean);
          c = (paramInt1 - 1);
          F.f = true;
        }
      }
    }
    Object localObject = d;
    i1 = c.size() - 1;
    if (i1 >= 0)
    {
      u localu = (u)c.get(i1);
      if (localu != null)
      {
        if (c < paramInt1 + paramInt2) {
          break label200;
        }
        localu.a(-paramInt2, paramBoolean);
      }
      for (;;)
      {
        i1 -= 1;
        break;
        label200:
        if (c >= paramInt1)
        {
          localu.b(8);
          ((m)localObject).c(i1);
        }
      }
    }
    requestLayout();
  }
  
  final void a(u paramu)
  {
    View localView = a;
    if (localView.getParent() == this) {}
    for (int i1 = 1;; i1 = 0)
    {
      d.b(a(localView));
      if (!paramu.n()) {
        break;
      }
      f.a(localView, -1, localView.getLayoutParams(), true);
      return;
    }
    if (i1 == 0)
    {
      f.a(localView, -1, true);
      return;
    }
    paramu = f;
    i1 = a.a(localView);
    if (i1 < 0) {
      throw new IllegalArgumentException("view is not a child, cannot hide " + localView);
    }
    b.a(i1);
    paramu.a(localView);
  }
  
  final void a(u paramu, at.e.b paramb)
  {
    paramu.a(0, 8192);
    if ((F.h) && (paramu.s()) && (!paramu.m()) && (!paramu.b()))
    {
      long l1 = d(paramu);
      g.a(l1, paramu);
    }
    g.a(paramu, paramb);
  }
  
  final void a(String paramString)
  {
    if (v())
    {
      if (paramString == null) {
        throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
      }
      throw new IllegalStateException(paramString);
    }
    if (af > 0) {
      Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(""));
    }
  }
  
  final void a(boolean paramBoolean)
  {
    if (aa <= 0) {
      aa = 1;
    }
    if (!paramBoolean) {
      s = false;
    }
    if (aa == 1)
    {
      if ((paramBoolean) && (s) && (!t) && (m != null) && (l != null)) {
        y();
      }
      if (!t) {
        s = false;
      }
    }
    aa -= 1;
  }
  
  final boolean a(u paramu, int paramInt)
  {
    if (v())
    {
      l = paramInt;
      K.add(paramu);
      return false;
    }
    w.c(a, paramInt);
    return true;
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    super.addFocusables(paramArrayList, paramInt1, paramInt2);
  }
  
  public final View b(View paramView)
  {
    for (ViewParent localViewParent = paramView.getParent(); (localViewParent != null) && (localViewParent != this) && ((localViewParent instanceof View)); localViewParent = paramView.getParent()) {
      paramView = (View)localViewParent;
    }
    if (localViewParent == this) {
      return paramView;
    }
    return null;
  }
  
  final void b()
  {
    int i3 = 0;
    if ((!r) || (w))
    {
      e.a("RV FullInvalidate");
      y();
      e.a();
    }
    label167:
    label174:
    do
    {
      do
      {
        return;
      } while (!e.d());
      if ((e.a(4)) && (!e.a(11)))
      {
        e.a("RV PartialInvalidate");
        c();
        h();
        e.b();
        int i1;
        if (!s)
        {
          int i4 = f.a();
          i1 = 0;
          int i2 = i3;
          if (i1 < i4)
          {
            u localu = c(f.b(i1));
            if ((localu == null) || (localu.b()) || (!localu.s())) {
              break label167;
            }
            i2 = 1;
          }
          if (i2 == 0) {
            break label174;
          }
          y();
        }
        for (;;)
        {
          a(true);
          i();
          e.a();
          return;
          i1 += 1;
          break;
          e.c();
        }
      }
    } while (!e.d());
    e.a("RV FullInvalidate");
    y();
    e.a();
  }
  
  final void b(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(g.a(paramInt1, getPaddingLeft() + getPaddingRight(), w.q(this)), g.a(paramInt2, getPaddingTop() + getPaddingBottom(), w.r(this)));
  }
  
  final int c(u paramu)
  {
    int i1;
    if ((paramu.a(524)) || (!paramu.l())) {
      i1 = -1;
    }
    f localf;
    int i2;
    int i5;
    int i4;
    do
    {
      return i1;
      localf = e;
      i2 = c;
      i5 = a.size();
      i4 = 0;
      i1 = i2;
    } while (i4 >= i5);
    paramu = (f.b)a.get(i4);
    switch (a)
    {
    default: 
      i1 = i2;
    }
    for (;;)
    {
      i4 += 1;
      i2 = i1;
      break;
      i1 = i2;
      if (b <= i2)
      {
        i1 = i2 + d;
        continue;
        i1 = i2;
        if (b <= i2)
        {
          if (b + d > i2) {
            return -1;
          }
          i1 = i2 - d;
          continue;
          if (b == i2)
          {
            i1 = d;
          }
          else
          {
            int i3 = i2;
            if (b < i2) {
              i3 = i2 - 1;
            }
            i1 = i3;
            if (d <= i3) {
              i1 = i3 + 1;
            }
          }
        }
      }
    }
  }
  
  final void c()
  {
    aa += 1;
    if ((aa == 1) && (!t)) {
      s = false;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof h)) && (m.a((h)paramLayoutParams));
  }
  
  public int computeHorizontalScrollExtent()
  {
    if (m == null) {}
    while (!m.e()) {
      return 0;
    }
    return m.d(F);
  }
  
  public int computeHorizontalScrollOffset()
  {
    if (m == null) {}
    while (!m.e()) {
      return 0;
    }
    return m.b(F);
  }
  
  public int computeHorizontalScrollRange()
  {
    if (m == null) {}
    while (!m.e()) {
      return 0;
    }
    return m.f(F);
  }
  
  public int computeVerticalScrollExtent()
  {
    if (m == null) {}
    while (!m.f()) {
      return 0;
    }
    return m.e(F);
  }
  
  public int computeVerticalScrollOffset()
  {
    if (m == null) {}
    while (!m.f()) {
      return 0;
    }
    return m.c(F);
  }
  
  public int computeVerticalScrollRange()
  {
    if (m == null) {}
    while (!m.f()) {
      return 0;
    }
    return m.g(F);
  }
  
  final void d()
  {
    if (x != null) {
      return;
    }
    x = new h(getContext());
    if (h)
    {
      x.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      return;
    }
    x.a(getMeasuredHeight(), getMeasuredWidth());
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
  
  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  protected void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
  
  public void draw(Canvas paramCanvas)
  {
    int i3 = 1;
    int i4 = 0;
    super.draw(paramCanvas);
    int i2 = o.size();
    int i1 = 0;
    while (i1 < i2)
    {
      o.get(i1);
      i1 += 1;
    }
    int i5;
    if ((x != null) && (!x.a()))
    {
      i5 = paramCanvas.save();
      if (h)
      {
        i1 = getPaddingBottom();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(i1 + -getHeight(), 0.0F);
        if ((x == null) || (!x.a(paramCanvas))) {
          break label445;
        }
        i2 = 1;
        label117:
        paramCanvas.restoreToCount(i5);
      }
    }
    for (;;)
    {
      i1 = i2;
      if (y != null)
      {
        i1 = i2;
        if (!y.a())
        {
          i5 = paramCanvas.save();
          if (h) {
            paramCanvas.translate(getPaddingLeft(), getPaddingTop());
          }
          if ((y == null) || (!y.a(paramCanvas))) {
            break label450;
          }
          i1 = 1;
          label191:
          i1 = i2 | i1;
          paramCanvas.restoreToCount(i5);
        }
      }
      i2 = i1;
      if (z != null)
      {
        i2 = i1;
        if (!z.a())
        {
          i5 = paramCanvas.save();
          int i6 = getWidth();
          if (!h) {
            break label455;
          }
          i2 = getPaddingTop();
          label246:
          paramCanvas.rotate(90.0F);
          paramCanvas.translate(-i2, -i6);
          if ((z == null) || (!z.a(paramCanvas))) {
            break label460;
          }
          i2 = 1;
          label284:
          i2 = i1 | i2;
          paramCanvas.restoreToCount(i5);
        }
      }
      i1 = i2;
      if (A != null)
      {
        i1 = i2;
        if (!A.a())
        {
          i5 = paramCanvas.save();
          paramCanvas.rotate(180.0F);
          if (!h) {
            break label465;
          }
          paramCanvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
          label361:
          i1 = i4;
          if (A != null)
          {
            i1 = i4;
            if (A.a(paramCanvas)) {
              i1 = 1;
            }
          }
          i1 = i2 | i1;
          paramCanvas.restoreToCount(i5);
        }
      }
      if ((i1 == 0) && (B != null) && (o.size() > 0) && (B.b())) {
        i1 = i3;
      }
      for (;;)
      {
        if (i1 != 0) {
          w.c(this);
        }
        return;
        i1 = 0;
        break;
        label445:
        i2 = 0;
        break label117;
        label450:
        i1 = 0;
        break label191;
        label455:
        i2 = 0;
        break label246;
        label460:
        i2 = 0;
        break label284;
        label465:
        paramCanvas.translate(-getWidth(), -getHeight());
        break label361;
      }
      i2 = 0;
    }
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  final Rect e(View paramView)
  {
    h localh = (h)paramView.getLayoutParams();
    if (!e) {
      return d;
    }
    if ((F.g) && ((c.s()) || (c.j()))) {
      return d;
    }
    Rect localRect1 = d;
    localRect1.set(0, 0, 0, 0);
    int i2 = o.size();
    int i1 = 0;
    while (i1 < i2)
    {
      j.set(0, 0, 0, 0);
      o.get(i1);
      Rect localRect2 = j;
      getLayoutParamsc.c();
      localRect2.set(0, 0, 0, 0);
      left += j.left;
      top += j.top;
      right += j.right;
      bottom += j.bottom;
      i1 += 1;
    }
    e = false;
    return localRect1;
  }
  
  final void e()
  {
    if (z != null) {
      return;
    }
    z = new h(getContext());
    if (h)
    {
      z.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      return;
    }
    z.a(getMeasuredHeight(), getMeasuredWidth());
  }
  
  final void f()
  {
    if (y != null) {
      return;
    }
    y = new h(getContext());
    if (h)
    {
      y.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      return;
    }
    y.a(getMeasuredWidth(), getMeasuredHeight());
  }
  
  public View focusSearch(View paramView, int paramInt)
  {
    int i5 = 17;
    int i6 = 0;
    boolean bool2 = true;
    int i1;
    Object localObject;
    label78:
    int i3;
    if ((l != null) && (m != null) && (!v()) && (!t))
    {
      i1 = 1;
      localObject = FocusFinder.getInstance();
      if ((i1 == 0) || ((paramInt != 2) && (paramInt != 1))) {
        break label333;
      }
      if (!m.f()) {
        break label567;
      }
      if (paramInt != 2) {
        break label229;
      }
      i1 = 130;
      if (((FocusFinder)localObject).findNextFocus(this, paramView, i1) != null) {
        break label235;
      }
      i3 = 1;
      label92:
      i2 = i3;
      if (P) {
        paramInt = i1;
      }
    }
    label153:
    label161:
    label171:
    label229:
    label235:
    label241:
    label246:
    label252:
    label258:
    label264:
    label292:
    label333:
    label530:
    label567:
    for (int i2 = i3;; i2 = 0)
    {
      int i4 = i2;
      i3 = paramInt;
      if (i2 == 0)
      {
        i4 = i2;
        i3 = paramInt;
        if (m.e())
        {
          if (w.g(m.q) != 1) {
            break label241;
          }
          i1 = 1;
          if (paramInt != 2) {
            break label246;
          }
          i2 = 1;
          if ((i2 ^ i1) == 0) {
            break label252;
          }
          i1 = 66;
          if (((FocusFinder)localObject).findNextFocus(this, paramView, i1) != null) {
            break label258;
          }
        }
      }
      for (i2 = 1;; i2 = 0)
      {
        i4 = i2;
        i3 = paramInt;
        if (P)
        {
          i3 = i1;
          i4 = i2;
        }
        if (i4 == 0) {
          break label292;
        }
        b();
        if (b(paramView) != null) {
          break label264;
        }
        return null;
        i1 = 0;
        break;
        i1 = 33;
        break label78;
        i3 = 0;
        break label92;
        i1 = 0;
        break label153;
        i2 = 0;
        break label161;
        i1 = 17;
        break label171;
      }
      c();
      m.a(paramView, i3, d, F);
      a(false);
      localObject = ((FocusFinder)localObject).findNextFocus(this, paramView, i3);
      paramInt = i3;
      for (;;)
      {
        if ((localObject != null) && (!((View)localObject).hasFocusable()))
        {
          if (getFocusedChild() == null)
          {
            return super.focusSearch(paramView, paramInt);
            localObject = ((FocusFinder)localObject).findNextFocus(this, paramView, paramInt);
            if ((localObject == null) && (i1 != 0))
            {
              b();
              if (b(paramView) == null) {
                return null;
              }
              c();
              localObject = m.a(paramView, paramInt, d, F);
              a(false);
            }
          }
          else
          {
            a((View)localObject, null);
            return paramView;
          }
        }
        else
        {
          boolean bool1;
          if ((localObject == null) || (localObject == this)) {
            bool1 = false;
          }
          while (bool1)
          {
            return (View)localObject;
            bool1 = bool2;
            if (paramView != null) {
              if ((paramInt == 2) || (paramInt == 1))
              {
                if (w.g(m.q) == 1) {}
                for (i1 = 1;; i1 = 0)
                {
                  i2 = i6;
                  if (paramInt == 2) {
                    i2 = 1;
                  }
                  i3 = i5;
                  if ((i2 ^ i1) != 0) {
                    i3 = 66;
                  }
                  bool1 = bool2;
                  if (a(paramView, (View)localObject, i3)) {
                    break;
                  }
                  if (paramInt != 2) {
                    break label530;
                  }
                  bool1 = a(paramView, (View)localObject, 130);
                  break;
                }
                bool1 = a(paramView, (View)localObject, 33);
              }
              else
              {
                bool1 = a(paramView, (View)localObject, paramInt);
              }
            }
          }
          return super.focusSearch(paramView, paramInt);
        }
      }
    }
  }
  
  final void g()
  {
    if (A != null) {
      return;
    }
    A = new h(getContext());
    if (h)
    {
      A.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      return;
    }
    A.a(getMeasuredWidth(), getMeasuredHeight());
  }
  
  final void g(View paramView)
  {
    c(paramView);
    if (v != null)
    {
      int i1 = v.size() - 1;
      while (i1 >= 0)
      {
        v.get(i1);
        i1 -= 1;
      }
    }
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    if (m == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return m.b();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    if (m == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return m.a(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (m == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return m.a(paramLayoutParams);
  }
  
  public a getAdapter()
  {
    return l;
  }
  
  public int getBaseline()
  {
    if (m != null) {
      return -1;
    }
    return super.getBaseline();
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (aw == null) {
      return super.getChildDrawingOrder(paramInt1, paramInt2);
    }
    return aw.a();
  }
  
  public boolean getClipToPadding()
  {
    return h;
  }
  
  public au getCompatAccessibilityDelegate()
  {
    return J;
  }
  
  public e getItemAnimator()
  {
    return B;
  }
  
  public g getLayoutManager()
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
    if (O) {
      return System.nanoTime();
    }
    return 0L;
  }
  
  public i getOnFlingListener()
  {
    return ao;
  }
  
  public boolean getPreserveFocusAfterLayout()
  {
    return as;
  }
  
  public l getRecycledViewPool()
  {
    return d.d();
  }
  
  public int getScrollState()
  {
    return ag;
  }
  
  final void h()
  {
    ae += 1;
  }
  
  public boolean hasNestedScrollingParent()
  {
    return getScrollingChildHelper().a();
  }
  
  final void i()
  {
    ae -= 1;
    if (ae <= 0)
    {
      ae = 0;
      int i1 = ac;
      ac = 0;
      Object localObject;
      if ((i1 != 0) && (j()))
      {
        localObject = AccessibilityEvent.obtain();
        ((AccessibilityEvent)localObject).setEventType(2048);
        android.support.v4.h.a.a.a((AccessibilityEvent)localObject, i1);
        sendAccessibilityEventUnchecked((AccessibilityEvent)localObject);
      }
      i1 = K.size() - 1;
      while (i1 >= 0)
      {
        localObject = (u)K.get(i1);
        if ((a.getParent() == this) && (!((u)localObject).b()))
        {
          int i2 = l;
          if (i2 != -1)
          {
            w.c(a, i2);
            l = -1;
          }
        }
        i1 -= 1;
      }
      K.clear();
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
    return (ad != null) && (ad.isEnabled());
  }
  
  final void k()
  {
    if ((!I) && (p))
    {
      w.a(this, aC);
      I = true;
    }
  }
  
  final void l()
  {
    int i2 = 0;
    int i3 = f.b();
    int i1 = 0;
    while (i1 < i3)
    {
      localObject1 = c(f.c(i1));
      if ((localObject1 != null) && (!((u)localObject1).b())) {
        ((u)localObject1).b(6);
      }
      i1 += 1;
    }
    i3 = f.b();
    i1 = 0;
    while (i1 < i3)
    {
      f.c(i1).getLayoutParams()).e = true;
      i1 += 1;
    }
    Object localObject1 = d;
    i3 = c.size();
    i1 = 0;
    Object localObject2;
    while (i1 < i3)
    {
      localObject2 = (h)c.get(i1)).a.getLayoutParams();
      if (localObject2 != null) {
        e = true;
      }
      i1 += 1;
    }
    localObject1 = d;
    if ((i.l != null) && (i.l.e))
    {
      i3 = c.size();
      i1 = i2;
    }
    while (i1 < i3)
    {
      localObject2 = (u)c.get(i1);
      if (localObject2 != null)
      {
        ((u)localObject2).b(6);
        ((u)localObject2).a(null);
      }
      i1 += 1;
      continue;
      ((m)localObject1).c();
    }
  }
  
  final void m()
  {
    af += 1;
    int i1 = getScrollX();
    int i2 = getScrollY();
    onScrollChanged(i1, i2, i1, i2);
    if (au != null)
    {
      i1 = au.size() - 1;
      while (i1 >= 0)
      {
        au.get(i1);
        i1 -= 1;
      }
    }
    af -= 1;
  }
  
  public final boolean n()
  {
    return (!r) || (w) || (e.d());
  }
  
  final void o()
  {
    int i2 = f.a();
    int i1 = 0;
    while (i1 < i2)
    {
      View localView = f.b(i1);
      Object localObject = a(localView);
      if ((localObject != null) && (i != null))
      {
        localObject = i.a;
        int i3 = localView.getLeft();
        int i4 = localView.getTop();
        if ((i3 != ((View)localObject).getLeft()) || (i4 != ((View)localObject).getTop())) {
          ((View)localObject).layout(i3, i4, ((View)localObject).getWidth() + i3, ((View)localObject).getHeight() + i4);
        }
      }
      i1 += 1;
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ae = 0;
    p = true;
    boolean bool;
    float f1;
    if ((r) && (!isLayoutRequested()))
    {
      bool = true;
      r = bool;
      if (m != null) {
        m.v = true;
      }
      I = false;
      if (O)
      {
        D = ((ak)ak.a.get());
        if (D == null)
        {
          D = new ak();
          Display localDisplay = w.J(this);
          if ((isInEditMode()) || (localDisplay == null)) {
            break label162;
          }
          f1 = localDisplay.getRefreshRate();
          if (f1 < 30.0F) {
            break label162;
          }
        }
      }
    }
    for (;;)
    {
      D.d = ((1.0E9F / f1));
      ak.a.set(D);
      D.b.add(this);
      return;
      bool = false;
      break;
      label162:
      f1 = 60.0F;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (B != null) {
      B.d();
    }
    q();
    p = false;
    if (m != null) {
      m.b(this, d);
    }
    K.clear();
    removeCallbacks(aC);
    bj.a.b();
    if (O)
    {
      D.b.remove(this);
      D = null;
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i2 = o.size();
    int i1 = 0;
    while (i1 < i2)
    {
      o.get(i1);
      i1 += 1;
    }
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if (m == null) {}
    label110:
    label113:
    for (;;)
    {
      return false;
      if ((!t) && ((paramMotionEvent.getSource() & 0x2) != 0) && (paramMotionEvent.getAction() == 8))
      {
        float f1;
        if (m.f())
        {
          f1 = -n.a(paramMotionEvent, 9);
          if (!m.e()) {
            break label110;
          }
        }
        for (float f2 = n.a(paramMotionEvent, 10);; f2 = 0.0F)
        {
          if ((f1 == 0.0F) && (f2 == 0.0F)) {
            break label113;
          }
          float f3 = getScrollFactor();
          a((int)(f2 * f3), (int)(f1 * f3), paramMotionEvent);
          return false;
          f1 = 0.0F;
          break;
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i3 = -1;
    boolean bool1 = true;
    if (t)
    {
      bool1 = false;
      return bool1;
    }
    int i2 = paramMotionEvent.getAction();
    if ((i2 == 3) || (i2 == 0)) {
      W = null;
    }
    int i4 = V.size();
    int i1 = 0;
    if (i1 < i4)
    {
      j localj = (j)V.get(i1);
      if ((localj.a()) && (i2 != 3)) {
        W = localj;
      }
    }
    for (i1 = 1;; i1 = 0)
    {
      if (i1 == 0) {
        break label113;
      }
      u();
      return true;
      i1 += 1;
      break;
    }
    label113:
    if (m == null) {
      return false;
    }
    boolean bool2 = m.e();
    boolean bool3 = m.f();
    if (ai == null) {
      ai = VelocityTracker.obtain();
    }
    ai.addMovement(paramMotionEvent);
    i2 = n.a(paramMotionEvent);
    i1 = n.b(paramMotionEvent);
    switch (i2)
    {
    case 4: 
    default: 
      if (ag != 1) {
        return false;
      }
      break;
    case 0: 
      label216:
      if (ab) {
        ab = false;
      }
      ah = paramMotionEvent.getPointerId(0);
      i1 = (int)(paramMotionEvent.getX() + 0.5F);
      al = i1;
      aj = i1;
      i1 = (int)(paramMotionEvent.getY() + 0.5F);
      am = i1;
      ak = i1;
      if (ag == 2)
      {
        getParent().requestDisallowInterceptTouchEvent(true);
        setScrollState(1);
      }
      paramMotionEvent = aB;
      aB[1] = 0;
      paramMotionEvent[0] = 0;
      if (!bool2) {}
      break;
    }
    for (i1 = 1;; i1 = 0)
    {
      i2 = i1;
      if (bool3) {
        i2 = i1 | 0x2;
      }
      startNestedScroll(i2);
      break label216;
      ah = paramMotionEvent.getPointerId(i1);
      i2 = (int)(paramMotionEvent.getX(i1) + 0.5F);
      al = i2;
      aj = i2;
      i1 = (int)(paramMotionEvent.getY(i1) + 0.5F);
      am = i1;
      ak = i1;
      break label216;
      i2 = paramMotionEvent.findPointerIndex(ah);
      if (i2 < 0)
      {
        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + ah + " not found. Did any MotionEvents get skipped?");
        return false;
      }
      i1 = (int)(paramMotionEvent.getX(i2) + 0.5F);
      i2 = (int)(paramMotionEvent.getY(i2) + 0.5F);
      if (ag == 1) {
        break label216;
      }
      i1 -= aj;
      i4 = i2 - ak;
      int i5;
      if ((bool2) && (Math.abs(i1) > an))
      {
        i2 = aj;
        i5 = an;
        if (i1 < 0)
        {
          i1 = -1;
          label533:
          al = (i1 * i5 + i2);
        }
      }
      for (i1 = 1;; i1 = 0)
      {
        i2 = i1;
        if (bool3)
        {
          i2 = i1;
          if (Math.abs(i4) > an)
          {
            i2 = ak;
            i5 = an;
            if (i4 >= 0) {
              break label614;
            }
          }
        }
        label614:
        for (i1 = i3;; i1 = 1)
        {
          am = (i2 + i1 * i5);
          i2 = 1;
          if (i2 == 0) {
            break;
          }
          setScrollState(1);
          break;
          i1 = 1;
          break label533;
        }
        a(paramMotionEvent);
        break label216;
        ai.clear();
        stopNestedScroll();
        break label216;
        u();
        break label216;
        break;
      }
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
    int i2 = 0;
    if (m == null) {
      b(paramInt1, paramInt2);
    }
    do
    {
      int i1;
      do
      {
        return;
        if (!m.w) {
          break;
        }
        int i3 = View.MeasureSpec.getMode(paramInt1);
        int i4 = View.MeasureSpec.getMode(paramInt2);
        i1 = i2;
        if (i3 == 1073741824)
        {
          i1 = i2;
          if (i4 == 1073741824) {
            i1 = 1;
          }
        }
        m.g(paramInt1, paramInt2);
      } while ((i1 != 0) || (l == null));
      if (F.d == 1) {
        B();
      }
      m.e(paramInt1, paramInt2);
      F.i = true;
      C();
      m.f(paramInt1, paramInt2);
    } while (!m.i());
    m.e(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    F.i = true;
    C();
    m.f(paramInt1, paramInt2);
    return;
    if (q)
    {
      m.g(paramInt1, paramInt2);
      return;
    }
    if (u)
    {
      c();
      h();
      x();
      i();
      if (F.k)
      {
        F.g = true;
        u = false;
        a(false);
      }
    }
    else
    {
      if (l == null) {
        break label321;
      }
    }
    label321:
    for (F.e = l.a();; F.e = 0)
    {
      c();
      m.g(paramInt1, paramInt2);
      a(false);
      F.g = false;
      return;
      e.e();
      F.g = false;
      break;
    }
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    if (v()) {
      return false;
    }
    return super.onRequestFocusInDescendants(paramInt, paramRect);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof p)) {
      super.onRestoreInstanceState(paramParcelable);
    }
    do
    {
      return;
      T = ((p)paramParcelable);
      super.onRestoreInstanceState(T.e);
    } while ((m == null) || (T.a == null));
    m.a(T.a);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    p localp = new p(super.onSaveInstanceState());
    if (T != null)
    {
      a = T.a;
      return localp;
    }
    if (m != null)
    {
      a = m.d();
      return localp;
    }
    a = null;
    return localp;
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
    int i7 = 0;
    if ((t) || (ab)) {}
    label133:
    label142:
    label148:
    do
    {
      return false;
      i1 = paramMotionEvent.getAction();
      if (W != null)
      {
        if (i1 == 0) {
          W = null;
        }
      }
      else
      {
        if (i1 == 0) {
          break label142;
        }
        i2 = V.size();
        i1 = 0;
        if (i1 >= i2) {
          break label142;
        }
        localObject = (j)V.get(i1);
        if (!((j)localObject).a()) {
          break label133;
        }
        W = ((j)localObject);
        i1 = 1;
      }
      for (;;)
      {
        if (i1 == 0) {
          break label148;
        }
        u();
        return true;
        if ((i1 == 3) || (i1 == 1)) {
          W = null;
        }
        i1 = 1;
        continue;
        i1 += 1;
        break;
        i1 = 0;
      }
    } while (m == null);
    boolean bool1 = m.e();
    boolean bool2 = m.f();
    if (ai == null) {
      ai = VelocityTracker.obtain();
    }
    Object localObject = MotionEvent.obtain(paramMotionEvent);
    int i3 = n.a(paramMotionEvent);
    int i2 = n.b(paramMotionEvent);
    if (i3 == 0)
    {
      int[] arrayOfInt = aB;
      aB[1] = 0;
      arrayOfInt[0] = 0;
    }
    ((MotionEvent)localObject).offsetLocation(aB[0], aB[1]);
    int i1 = i7;
    switch (i3)
    {
    default: 
      i1 = i7;
    case 4: 
      if (i1 == 0) {
        ai.addMovement((MotionEvent)localObject);
      }
      ((MotionEvent)localObject).recycle();
      return true;
    case 0: 
      ah = paramMotionEvent.getPointerId(0);
      i1 = (int)(paramMotionEvent.getX() + 0.5F);
      al = i1;
      aj = i1;
      i1 = (int)(paramMotionEvent.getY() + 0.5F);
      am = i1;
      ak = i1;
      if (!bool1) {
        break;
      }
    }
    for (i1 = 1;; i1 = 0)
    {
      i2 = i1;
      if (bool2) {
        i2 = i1 | 0x2;
      }
      startNestedScroll(i2);
      i1 = i7;
      break;
      ah = paramMotionEvent.getPointerId(i2);
      i1 = (int)(paramMotionEvent.getX(i2) + 0.5F);
      al = i1;
      aj = i1;
      i1 = (int)(paramMotionEvent.getY(i2) + 0.5F);
      am = i1;
      ak = i1;
      i1 = i7;
      break;
      i1 = paramMotionEvent.findPointerIndex(ah);
      if (i1 < 0)
      {
        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + ah + " not found. Did any MotionEvents get skipped?");
        return false;
      }
      int i8 = (int)(paramMotionEvent.getX(i1) + 0.5F);
      int i9 = (int)(paramMotionEvent.getY(i1) + 0.5F);
      int i4 = al - i8;
      i3 = am - i9;
      i1 = i3;
      i2 = i4;
      if (dispatchNestedPreScroll(i4, i3, aA, az))
      {
        i2 = i4 - aA[0];
        i1 = i3 - aA[1];
        ((MotionEvent)localObject).offsetLocation(az[0], az[1]);
        paramMotionEvent = aB;
        paramMotionEvent[0] += az[0];
        paramMotionEvent = aB;
        paramMotionEvent[1] += az[1];
      }
      i3 = i1;
      i4 = i2;
      if (ag != 1)
      {
        if ((!bool1) || (Math.abs(i2) <= an)) {
          break label1366;
        }
        if (i2 <= 0) {
          break label927;
        }
        i2 -= an;
      }
      label725:
      label775:
      label851:
      label927:
      label939:
      label957:
      label1017:
      label1035:
      label1072:
      label1075:
      label1100:
      label1105:
      label1252:
      label1364:
      label1366:
      for (i3 = 1;; i3 = 0)
      {
        int i5 = i1;
        int i6 = i3;
        if (bool2)
        {
          i5 = i1;
          i6 = i3;
          if (Math.abs(i1) > an)
          {
            if (i1 <= 0) {
              break label939;
            }
            i5 = i1 - an;
            i6 = 1;
          }
        }
        i3 = i5;
        i4 = i2;
        if (i6 != 0)
        {
          setScrollState(1);
          i4 = i2;
          i3 = i5;
        }
        i1 = i7;
        if (ag != 1) {
          break;
        }
        al = (i8 - az[0]);
        am = (i9 - az[1]);
        if (bool1)
        {
          i1 = i4;
          if (!bool2) {
            break label957;
          }
        }
        for (i2 = i3;; i2 = 0)
        {
          if (a(i1, i2, (MotionEvent)localObject)) {
            getParent().requestDisallowInterceptTouchEvent(true);
          }
          i1 = i7;
          if (D == null) {
            break;
          }
          if (i4 == 0)
          {
            i1 = i7;
            if (i3 == 0) {
              break;
            }
          }
          D.a(this, i4, i3);
          i1 = i7;
          break;
          i2 += an;
          break label725;
          i5 = i1 + an;
          break label775;
          i1 = 0;
          break label851;
        }
        a(paramMotionEvent);
        i1 = i7;
        break;
        ai.addMovement((MotionEvent)localObject);
        ai.computeCurrentVelocity(1000, aq);
        float f1;
        float f2;
        if (bool1)
        {
          f1 = -v.a(ai, ah);
          if (!bool2) {
            break label1100;
          }
          f2 = -v.b(ai, ah);
          if ((f1 != 0.0F) || (f2 != 0.0F))
          {
            i3 = (int)f1;
            i2 = (int)f2;
            if (m != null) {
              break label1105;
            }
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
          }
        }
        for (;;)
        {
          i1 = 0;
          if (i1 == 0) {
            setScrollState(0);
          }
          t();
          i1 = 1;
          break;
          f1 = 0.0F;
          break label1017;
          f2 = 0.0F;
          break label1035;
          if (!t)
          {
            bool1 = m.e();
            bool2 = m.f();
            if (bool1)
            {
              i1 = i3;
              if (Math.abs(i3) >= ap) {}
            }
            else
            {
              i1 = 0;
            }
            if ((!bool2) || (Math.abs(i2) < ap)) {
              i2 = 0;
            }
            for (;;)
            {
              if (((i1 == 0) && (i2 == 0)) || (dispatchNestedPreFling(i1, i2))) {
                break label1364;
              }
              if ((bool1) || (bool2)) {}
              for (bool1 = true;; bool1 = false)
              {
                dispatchNestedFling(i1, i2, bool1);
                if ((ao == null) || (!ao.a())) {
                  break label1252;
                }
                i1 = 1;
                break;
              }
              if (!bool1) {
                break label1072;
              }
              i1 = Math.max(-aq, Math.min(i1, aq));
              i2 = Math.max(-aq, Math.min(i2, aq));
              paramMotionEvent = C;
              e.setScrollState(2);
              b = 0;
              a = 0;
              c.a(0, i1, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
              paramMotionEvent.a();
              i1 = 1;
              break label1075;
              u();
              i1 = i7;
              break;
            }
          }
        }
      }
    }
  }
  
  protected void removeDetachedView(View paramView, boolean paramBoolean)
  {
    u localu = c(paramView);
    if (localu != null)
    {
      if (!localu.n()) {
        break label32;
      }
      localu.i();
    }
    label32:
    while (localu.b())
    {
      g(paramView);
      super.removeDetachedView(paramView, paramBoolean);
      return;
    }
    throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + localu);
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    if ((m.k()) || (v())) {}
    for (int i1 = 1;; i1 = 0)
    {
      if ((i1 == 0) && (paramView2 != null)) {
        a(paramView1, paramView2);
      }
      super.requestChildFocus(paramView1, paramView2);
      return;
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    return m.a(this, paramView, paramRect, paramBoolean, false);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    int i2 = V.size();
    int i1 = 0;
    while (i1 < i2)
    {
      V.get(i1);
      i1 += 1;
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    if ((aa == 0) && (!t))
    {
      super.requestLayout();
      return;
    }
    s = true;
  }
  
  public void scrollBy(int paramInt1, int paramInt2)
  {
    if (m == null) {}
    boolean bool1;
    boolean bool2;
    do
    {
      Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      do
      {
        return;
      } while (t);
      bool1 = m.e();
      bool2 = m.f();
    } while ((!bool1) && (!bool2));
    if (bool1) {
      if (!bool2) {
        break label74;
      }
    }
    for (;;)
    {
      a(paramInt1, paramInt2, null);
      return;
      paramInt1 = 0;
      break;
      label74:
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
    int i2 = 0;
    if (v()) {
      if (paramAccessibilityEvent == null) {
        break label52;
      }
    }
    label52:
    for (i1 = android.support.v4.h.a.a.b(paramAccessibilityEvent);; i1 = 0)
    {
      if (i1 == 0) {
        i1 = i2;
      }
      for (;;)
      {
        ac = (i1 | ac);
        i1 = 1;
        if (i1 != 0) {
          return;
        }
        super.sendAccessibilityEventUnchecked(paramAccessibilityEvent);
        return;
      }
    }
  }
  
  public void setAccessibilityDelegateCompat(au paramau)
  {
    J = paramau;
    w.a(this, J);
  }
  
  public void setAdapter(a parama)
  {
    setLayoutFrozen(false);
    if (l != null)
    {
      locala = l;
      localObject = S;
      d.unregisterObserver(localObject);
    }
    a();
    e.a();
    a locala = l;
    l = parama;
    if (parama != null)
    {
      localObject = S;
      d.registerObserver(localObject);
    }
    Object localObject = d;
    parama = l;
    ((m)localObject).a();
    localObject = ((m)localObject).d();
    if (locala != null) {
      ((l)localObject).b();
    }
    if (b == 0)
    {
      int i1 = 0;
      while (i1 < a.size())
      {
        a.valueAt(i1)).a.clear();
        i1 += 1;
      }
    }
    if (parama != null) {
      ((l)localObject).a();
    }
    F.f = true;
    l();
    requestLayout();
  }
  
  public void setChildDrawingOrderCallback(d paramd)
  {
    if (paramd == aw) {
      return;
    }
    aw = paramd;
    if (aw != null) {}
    for (boolean bool = true;; bool = false)
    {
      setChildrenDrawingOrderEnabled(bool);
      return;
    }
  }
  
  public void setClipToPadding(boolean paramBoolean)
  {
    if (paramBoolean != h) {
      s();
    }
    h = paramBoolean;
    super.setClipToPadding(paramBoolean);
    if (r) {
      requestLayout();
    }
  }
  
  public void setHasFixedSize(boolean paramBoolean)
  {
    q = paramBoolean;
  }
  
  public void setItemAnimator(e parame)
  {
    if (B != null)
    {
      B.d();
      B.h = null;
    }
    B = parame;
    if (B != null) {
      B.h = av;
    }
  }
  
  public void setItemViewCacheSize(int paramInt)
  {
    m localm = d;
    e = paramInt;
    localm.b();
  }
  
  public void setLayoutFrozen(boolean paramBoolean)
  {
    if (paramBoolean != t)
    {
      a("Do not setLayoutFrozen in layout or scroll");
      if (!paramBoolean)
      {
        t = false;
        if ((s) && (m != null) && (l != null)) {
          requestLayout();
        }
        s = false;
      }
    }
    else
    {
      return;
    }
    long l1 = SystemClock.uptimeMillis();
    onTouchEvent(MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0));
    t = true;
    ab = true;
    q();
  }
  
  public void setLayoutManager(g paramg)
  {
    if (paramg == m) {
      return;
    }
    q();
    if (m != null)
    {
      if (B != null) {
        B.d();
      }
      m.c(d);
      m.b(d);
      d.a();
      if (p) {
        m.b(this, d);
      }
      m.a(null);
      m = null;
    }
    ac localac;
    for (;;)
    {
      localac = f;
      for (ac.a locala = b;; locala = b)
      {
        a = 0L;
        if (b == null) {
          break;
        }
      }
      d.a();
    }
    int i1 = c.size() - 1;
    while (i1 >= 0)
    {
      a.d((View)c.get(i1));
      c.remove(i1);
      i1 -= 1;
    }
    a.b();
    m = paramg;
    if (paramg != null)
    {
      if (q != null) {
        throw new IllegalArgumentException("LayoutManager " + paramg + " is already attached to a RecyclerView: " + q);
      }
      m.a(this);
      if (p) {
        m.v = true;
      }
    }
    d.b();
    requestLayout();
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    getScrollingChildHelper().a(paramBoolean);
  }
  
  public void setOnFlingListener(i parami)
  {
    ao = parami;
  }
  
  @Deprecated
  public void setOnScrollListener(k paramk)
  {
    at = paramk;
  }
  
  public void setPreserveFocusAfterLayout(boolean paramBoolean)
  {
    as = paramBoolean;
  }
  
  public void setRecycledViewPool(l paraml)
  {
    m localm = d;
    if (g != null) {
      g.b();
    }
    g = paraml;
    if (paraml != null)
    {
      paraml = g;
      i.getAdapter();
      paraml.a();
    }
  }
  
  public void setRecyclerListener(n paramn)
  {
    n = paramn;
  }
  
  void setScrollState(int paramInt)
  {
    if (paramInt == ag) {}
    for (;;)
    {
      return;
      ag = paramInt;
      if (paramInt != 2) {
        r();
      }
      if (m != null) {
        m.g(paramInt);
      }
      if (au != null)
      {
        paramInt = au.size() - 1;
        while (paramInt >= 0)
        {
          au.get(paramInt);
          paramInt -= 1;
        }
      }
    }
  }
  
  public void setScrollingTouchSlop(int paramInt)
  {
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    switch (paramInt)
    {
    default: 
      Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + paramInt + "; using default value");
    case 0: 
      an = localViewConfiguration.getScaledTouchSlop();
      return;
    }
    an = localViewConfiguration.getScaledPagingTouchSlop();
  }
  
  public void setViewCacheExtension(s params)
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
  
  public static abstract class a<VH extends at.u>
  {
    public final at.b d = new at.b();
    boolean e = false;
    
    public abstract int a();
    
    public long a(int paramInt)
    {
      return -1L;
    }
    
    public abstract VH a(ViewGroup paramViewGroup, int paramInt);
    
    public void a(VH paramVH) {}
    
    public abstract void a(VH paramVH, int paramInt);
    
    public int b(int paramInt)
    {
      return 0;
    }
  }
  
  public static final class b
    extends Observable<at.c>
  {
    public final void a()
    {
      int i = mObservers.size() - 1;
      while (i >= 0)
      {
        ((at.c)mObservers.get(i)).a();
        i -= 1;
      }
    }
  }
  
  public static abstract class c
  {
    public void a() {}
  }
  
  public static abstract interface d
  {
    public abstract int a();
  }
  
  public static abstract class e
  {
    private ArrayList<Object> a = new ArrayList();
    a h = null;
    long i = 120L;
    long j = 120L;
    long k = 250L;
    long l = 250L;
    
    static int d(at.u paramu)
    {
      int n = at.u.f(paramu) & 0xE;
      int m;
      if (paramu.j()) {
        m = 4;
      }
      int i1;
      int i2;
      do
      {
        do
        {
          do
          {
            do
            {
              return m;
              m = n;
            } while ((n & 0x4) != 0);
            i1 = d;
            i2 = paramu.d();
            m = n;
          } while (i1 == -1);
          m = n;
        } while (i2 == -1);
        m = n;
      } while (i1 == i2);
      return n | 0x800;
    }
    
    public abstract void a();
    
    public abstract boolean a(at.u paramu, b paramb1, b paramb2);
    
    public abstract boolean a(at.u paramu1, at.u paramu2, b paramb1, b paramb2);
    
    public boolean a(at.u paramu, List<Object> paramList)
    {
      return f(paramu);
    }
    
    public abstract boolean b();
    
    public abstract boolean b(at.u paramu, b paramb1, b paramb2);
    
    public abstract void c(at.u paramu);
    
    public abstract boolean c(at.u paramu, b paramb1, b paramb2);
    
    public abstract void d();
    
    public final void e()
    {
      int n = a.size();
      int m = 0;
      while (m < n)
      {
        a.get(m);
        m += 1;
      }
      a.clear();
    }
    
    public final void e(at.u paramu)
    {
      if (h != null) {
        h.a(paramu);
      }
    }
    
    public boolean f(at.u paramu)
    {
      return true;
    }
    
    static abstract interface a
    {
      public abstract void a(at.u paramu);
    }
    
    public static final class b
    {
      public int a;
      public int b;
      public int c;
      public int d;
      
      public final b a(at.u paramu)
      {
        paramu = a;
        a = paramu.getLeft();
        b = paramu.getTop();
        c = paramu.getRight();
        d = paramu.getBottom();
        return this;
      }
    }
  }
  
  private final class f
    implements at.e.a
  {
    f() {}
    
    public final void a(at.u paramu)
    {
      boolean bool = true;
      paramu.a(true);
      if ((h != null) && (i == null)) {
        h = null;
      }
      i = null;
      at localat;
      Object localObject;
      ac localac;
      int i;
      if (!at.u.e(paramu))
      {
        localat = at.this;
        localObject = a;
        localat.c();
        localac = f;
        i = a.a((View)localObject);
        if (i != -1) {
          break label155;
        }
        localac.b((View)localObject);
        i = 1;
        if (i != 0)
        {
          localObject = at.c((View)localObject);
          d.b((at.u)localObject);
          d.a((at.u)localObject);
        }
        if (i != 0) {
          break label206;
        }
      }
      for (;;)
      {
        localat.a(bool);
        if ((i == 0) && (paramu.n())) {
          removeDetachedView(a, false);
        }
        return;
        label155:
        if (b.c(i))
        {
          b.d(i);
          localac.b((View)localObject);
          a.a(i);
          i = 1;
          break;
        }
        i = 0;
        break;
        label206:
        bool = false;
      }
    }
  }
  
  public static abstract class g
  {
    boolean A;
    int B;
    int C;
    int D;
    int E;
    private final bi.b a = new bi.b()
    {
      public final int a()
      {
        return m();
      }
      
      public final int a(View paramAnonymousView)
      {
        at.h localh = (at.h)paramAnonymousView.getLayoutParams();
        return at.g.e(paramAnonymousView) - leftMargin;
      }
      
      public final View a(int paramAnonymousInt)
      {
        return d(paramAnonymousInt);
      }
      
      public final int b()
      {
        return D - o();
      }
      
      public final int b(View paramAnonymousView)
      {
        at.h localh = (at.h)paramAnonymousView.getLayoutParams();
        int i = at.g.g(paramAnonymousView);
        return rightMargin + i;
      }
    };
    private final bi.b b = new bi.b()
    {
      public final int a()
      {
        return n();
      }
      
      public final int a(View paramAnonymousView)
      {
        at.h localh = (at.h)paramAnonymousView.getLayoutParams();
        return at.g.f(paramAnonymousView) - topMargin;
      }
      
      public final View a(int paramAnonymousInt)
      {
        return d(paramAnonymousInt);
      }
      
      public final int b()
      {
        return E - p();
      }
      
      public final int b(View paramAnonymousView)
      {
        at.h localh = (at.h)paramAnonymousView.getLayoutParams();
        int i = at.g.h(paramAnonymousView);
        return bottomMargin + i;
      }
    };
    ac p;
    at q;
    bi r = new bi(a);
    bi s = new bi(b);
    at.q t;
    boolean u = false;
    boolean v = false;
    boolean w = false;
    boolean x = true;
    boolean y = true;
    int z;
    
    public static int a(int paramInt1, int paramInt2, int paramInt3)
    {
      int j = View.MeasureSpec.getMode(paramInt1);
      int i = View.MeasureSpec.getSize(paramInt1);
      paramInt1 = i;
      switch (j)
      {
      default: 
        paramInt1 = Math.max(paramInt2, paramInt3);
      case 1073741824: 
        return paramInt1;
      }
      return Math.min(i, Math.max(paramInt2, paramInt3));
    }
    
    public static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      int i = 0;
      int j = Math.max(0, paramInt1 - paramInt3);
      if (paramBoolean) {
        if (paramInt4 >= 0)
        {
          paramInt3 = 1073741824;
          paramInt1 = paramInt4;
        }
      }
      for (;;)
      {
        return View.MeasureSpec.makeMeasureSpec(paramInt1, paramInt3);
        if (paramInt4 == -1)
        {
          switch (paramInt2)
          {
          case 0: 
          default: 
            paramInt1 = 0;
            paramInt3 = i;
            break;
          case 1073741824: 
          case -2147483648: 
            paramInt1 = j;
            paramInt3 = paramInt2;
            break;
          }
        }
        else
        {
          if (paramInt4 == -2)
          {
            paramInt1 = 0;
            paramInt3 = i;
            continue;
            if (paramInt4 >= 0)
            {
              paramInt3 = 1073741824;
              paramInt1 = paramInt4;
              continue;
            }
            if (paramInt4 == -1)
            {
              paramInt1 = j;
              paramInt3 = paramInt2;
              continue;
            }
            if (paramInt4 == -2)
            {
              if (paramInt2 != Integer.MIN_VALUE)
              {
                paramInt1 = j;
                paramInt3 = i;
                if (paramInt2 != 1073741824) {
                  continue;
                }
              }
              paramInt3 = Integer.MIN_VALUE;
              paramInt1 = j;
              continue;
            }
          }
          paramInt1 = 0;
          paramInt3 = i;
        }
      }
    }
    
    public static int a(View paramView)
    {
      return getLayoutParamsc.c();
    }
    
    public static b a(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
    {
      b localb = new b();
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.RecyclerView, paramInt1, paramInt2);
      a = paramContext.getInt(a.a.RecyclerView_android_orientation, 1);
      b = paramContext.getInt(a.a.RecyclerView_spanCount, 1);
      c = paramContext.getBoolean(a.a.RecyclerView_reverseLayout, false);
      d = paramContext.getBoolean(a.a.RecyclerView_stackFromEnd, false);
      paramContext.recycle();
      return localb;
    }
    
    public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      at.h localh = (at.h)paramView.getLayoutParams();
      Rect localRect = d;
      paramView.layout(left + paramInt1 + leftMargin, top + paramInt2 + topMargin, paramInt3 - right - rightMargin, paramInt4 - bottom - bottomMargin);
    }
    
    static boolean b(int paramInt1, int paramInt2, int paramInt3)
    {
      int i = View.MeasureSpec.getMode(paramInt2);
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      if ((paramInt3 > 0) && (paramInt1 != paramInt3)) {}
      do
      {
        do
        {
          return false;
          switch (i)
          {
          default: 
            return false;
          }
        } while (paramInt2 < paramInt1);
        return true;
        return true;
      } while (paramInt2 != paramInt1);
      return true;
    }
    
    public static int c(View paramView)
    {
      Rect localRect = getLayoutParamsd;
      int i = paramView.getMeasuredWidth();
      int j = left;
      return right + (i + j);
    }
    
    private void c(int paramInt)
    {
      if (d(paramInt) != null)
      {
        ac localac = p;
        paramInt = localac.a(paramInt);
        View localView = a.b(paramInt);
        if (localView != null)
        {
          if (b.d(paramInt)) {
            localac.b(localView);
          }
          a.a(paramInt);
        }
      }
    }
    
    public static int d(View paramView)
    {
      Rect localRect = getLayoutParamsd;
      int i = paramView.getMeasuredHeight();
      int j = top;
      return bottom + (i + j);
    }
    
    public static int e(View paramView)
    {
      return paramView.getLeft() - getLayoutParamsd.left;
    }
    
    public static int f(View paramView)
    {
      return paramView.getTop() - getLayoutParamsd.top;
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
      if ((q == null) || (q.l == null)) {}
      while (!f()) {
        return 1;
      }
      return q.l.a();
    }
    
    public at.h a(Context paramContext, AttributeSet paramAttributeSet)
    {
      return new at.h(paramContext, paramAttributeSet);
    }
    
    public at.h a(ViewGroup.LayoutParams paramLayoutParams)
    {
      if ((paramLayoutParams instanceof at.h)) {
        return new at.h((at.h)paramLayoutParams);
      }
      if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
        return new at.h((ViewGroup.MarginLayoutParams)paramLayoutParams);
      }
      return new at.h(paramLayoutParams);
    }
    
    public View a(int paramInt)
    {
      int j = l();
      int i = 0;
      while (i < j)
      {
        View localView = d(i);
        at.u localu = at.c(localView);
        if ((localu != null) && (localu.c() == paramInt) && (!localu.b()) && ((q.F.g) || (!localu.m()))) {
          return localView;
        }
        i += 1;
      }
      return null;
    }
    
    public View a(View paramView, int paramInt, at.m paramm, at.r paramr)
    {
      return null;
    }
    
    public void a() {}
    
    public void a(int paramInt1, int paramInt2) {}
    
    public void a(int paramInt1, int paramInt2, at.r paramr, a parama) {}
    
    public void a(int paramInt, a parama) {}
    
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
      int k = o();
      int m = paramRect.height();
      int n = n();
      int i1 = p();
      h(a(paramInt1, i + j + k, w.q(q)), a(paramInt2, m + n + i1, w.r(q)));
    }
    
    public void a(Parcelable paramParcelable) {}
    
    public final void a(at.m paramm)
    {
      int i = l() - 1;
      if (i >= 0)
      {
        View localView = d(i);
        at.u localu = at.c(localView);
        if (!localu.b())
        {
          if ((!localu.j()) || (localu.m()) || (q.l.e)) {
            break label78;
          }
          c(i);
          paramm.a(localu);
        }
        for (;;)
        {
          i -= 1;
          break;
          label78:
          h(i);
          paramm.c(localView);
          q.g.c(localu);
        }
      }
    }
    
    public void a(at.m paramm, at.r paramr, View paramView, android.support.v4.h.a.b paramb)
    {
      int i;
      if (f())
      {
        i = a(paramView);
        if (!e()) {
          break label48;
        }
      }
      label48:
      for (int j = a(paramView);; j = 0)
      {
        paramb.a(b.n.a(i, 1, j, 1, false));
        return;
        i = 0;
        break;
      }
    }
    
    public void a(at.r paramr) {}
    
    final void a(at paramat)
    {
      if (paramat == null)
      {
        q = null;
        p = null;
        D = 0;
      }
      for (E = 0;; E = paramat.getHeight())
      {
        B = 1073741824;
        C = 1073741824;
        return;
        q = paramat;
        p = f;
        D = paramat.getWidth();
      }
    }
    
    public void a(at paramat, at.m paramm) {}
    
    final void a(View paramView, int paramInt, boolean paramBoolean)
    {
      at.u localu1 = at.c(paramView);
      at.h localh1;
      if ((paramBoolean) || (localu1.m()))
      {
        q.g.b(localu1);
        localh1 = (at.h)paramView.getLayoutParams();
        if ((!localu1.g()) && (!localu1.e())) {
          break label128;
        }
        if (!localu1.e()) {
          break label120;
        }
        localu1.f();
        label68:
        p.a(paramView, paramInt, paramView.getLayoutParams(), false);
      }
      for (;;)
      {
        if (f)
        {
          a.invalidate();
          f = false;
        }
        return;
        q.g.c(localu1);
        break;
        label120:
        localu1.h();
        break label68;
        label128:
        Object localObject;
        if (paramView.getParent() == q)
        {
          int j = p.c(paramView);
          int i = paramInt;
          if (paramInt == -1) {
            i = p.a();
          }
          if (j == -1) {
            throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + q.indexOfChild(paramView));
          }
          if (j != i)
          {
            paramView = q.m;
            localObject = paramView.d(j);
            if (localObject == null) {
              throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j);
            }
            paramView.h(j);
            at.h localh2 = (at.h)((View)localObject).getLayoutParams();
            at.u localu2 = at.c((View)localObject);
            if (localu2.m()) {
              q.g.b(localu2);
            }
            for (;;)
            {
              p.a((View)localObject, i, localh2, localu2.m());
              break;
              q.g.c(localu2);
            }
          }
        }
        else
        {
          p.a(paramView, paramInt, false);
          e = true;
          if ((t != null) && (t.c))
          {
            localObject = t;
            if (at.d(paramView) == a) {
              d = paramView;
            }
          }
        }
      }
    }
    
    public final void a(View paramView, Rect paramRect)
    {
      Object localObject = getLayoutParamsd;
      int i = -left;
      int j = -top;
      int k = paramView.getWidth();
      int m = right;
      int n = paramView.getHeight();
      paramRect.set(i, j, k + m, bottom + n);
      if (q != null)
      {
        localObject = w.p(paramView);
        if ((localObject != null) && (!((Matrix)localObject).isIdentity()))
        {
          RectF localRectF = q.k;
          localRectF.set(paramRect);
          ((Matrix)localObject).mapRect(localRectF);
          paramRect.set((int)Math.floor(left), (int)Math.floor(top), (int)Math.ceil(right), (int)Math.ceil(bottom));
        }
      }
      paramRect.offset(paramView.getLeft(), paramView.getTop());
    }
    
    final void a(View paramView, android.support.v4.h.a.b paramb)
    {
      at.u localu = at.c(paramView);
      if ((localu != null) && (!localu.m()) && (!p.d(a))) {
        a(q.d, q.F, paramView, paramb);
      }
    }
    
    public final void a(View paramView, at.m paramm)
    {
      ac localac = p;
      int i = a.a(paramView);
      if (i >= 0)
      {
        if (b.d(i)) {
          localac.b(paramView);
        }
        a.a(i);
      }
      paramm.a(paramView);
    }
    
    public void a(AccessibilityEvent paramAccessibilityEvent)
    {
      boolean bool2 = true;
      Object localObject = q.d;
      localObject = q.F;
      paramAccessibilityEvent = android.support.v4.h.a.a.a(paramAccessibilityEvent);
      if (q == null) {
        return;
      }
      boolean bool1 = bool2;
      if (!w.b(q, 1))
      {
        bool1 = bool2;
        if (!w.b(q, -1))
        {
          bool1 = bool2;
          if (!w.a(q, -1)) {
            if (!w.a(q, 1)) {
              break label130;
            }
          }
        }
      }
      label130:
      for (bool1 = bool2;; bool1 = false)
      {
        paramAccessibilityEvent.a(bool1);
        if (q.l == null) {
          break;
        }
        int i = q.l.a();
        android.support.v4.h.a.f.a.b(b, i);
        return;
      }
    }
    
    public void a(String paramString)
    {
      if (q != null) {
        q.a(paramString);
      }
    }
    
    public boolean a(at.h paramh)
    {
      return paramh != null;
    }
    
    public final boolean a(at paramat, View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2)
    {
      int[] arrayOfInt = new int[2];
      int i2 = m();
      int m = n();
      int i3 = D - o();
      int i1 = E;
      int i6 = p();
      int i4 = paramView.getLeft() + left - paramView.getScrollX();
      int n = paramView.getTop() + top - paramView.getScrollY();
      int i5 = i4 + paramRect.width();
      int i7 = paramRect.height();
      int i = Math.min(0, i4 - i2);
      int j = Math.min(0, n - m);
      int k = Math.max(0, i5 - i3);
      i1 = Math.max(0, n + i7 - (i1 - i6));
      if (w.g(q) == 1) {
        if (k != 0)
        {
          i = k;
          if (j == 0) {
            break label271;
          }
          label162:
          arrayOfInt[0] = i;
          arrayOfInt[1] = j;
          k = arrayOfInt[0];
          j = arrayOfInt[1];
          if (paramBoolean2)
          {
            paramView = paramat.getFocusedChild();
            if (paramView != null) {
              break label286;
            }
            i = 0;
            label203:
            if (i == 0) {
              break label495;
            }
          }
          if ((k == 0) && (j == 0)) {
            break label495;
          }
          if (!paramBoolean1) {
            break label401;
          }
          paramat.scrollBy(k, j);
        }
      }
      for (;;)
      {
        return true;
        i = Math.max(i, i5 - i3);
        break;
        if (i != 0) {
          break;
        }
        for (;;)
        {
          i = Math.min(i4 - i2, k);
        }
        label271:
        j = Math.min(n - m, i1);
        break label162;
        label286:
        i = m();
        m = n();
        n = D;
        i1 = o();
        i2 = E;
        i3 = p();
        paramRect = q.j;
        at.a(paramView, paramRect);
        if ((left - k >= n - i1) || (right - k <= i) || (top - j >= i2 - i3) || (bottom - j <= m))
        {
          i = 0;
          break label203;
        }
        i = 1;
        break label203;
        label401:
        if (m == null)
        {
          Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        }
        else if (!t)
        {
          i = k;
          if (!m.e()) {
            i = 0;
          }
          if (!m.f()) {
            j = 0;
          }
          if ((i != 0) || (j != 0))
          {
            paramat = C;
            paramat.a(i, j, paramat.a(i, j), at.L);
          }
        }
      }
      label495:
      return false;
    }
    
    final boolean a(View paramView, int paramInt1, int paramInt2, at.h paramh)
    {
      return (paramView.isLayoutRequested()) || (!x) || (!b(paramView.getWidth(), paramInt1, width)) || (!b(paramView.getHeight(), paramInt2, height));
    }
    
    public final boolean a(Runnable paramRunnable)
    {
      if (q != null) {
        return q.removeCallbacks(paramRunnable);
      }
      return false;
    }
    
    public int b(int paramInt, at.m paramm, at.r paramr)
    {
      return 0;
    }
    
    public int b(at.m paramm, at.r paramr)
    {
      if ((q == null) || (q.l == null)) {}
      while (!e()) {
        return 1;
      }
      return q.l.a();
    }
    
    public int b(at.r paramr)
    {
      return 0;
    }
    
    public abstract at.h b();
    
    public final View b(View paramView)
    {
      if (q == null) {}
      do
      {
        return null;
        paramView = q.b(paramView);
      } while ((paramView == null) || (p.d(paramView)));
      return paramView;
    }
    
    public void b(int paramInt) {}
    
    public void b(int paramInt1, int paramInt2) {}
    
    final void b(at.m paramm)
    {
      int j = a.size();
      int i = j - 1;
      while (i >= 0)
      {
        View localView = a.get(i)).a;
        at.u localu = at.c(localView);
        if (!localu.b())
        {
          localu.a(false);
          if (localu.n()) {
            q.removeDetachedView(localView, false);
          }
          if (q.B != null) {
            q.B.c(localu);
          }
          localu.a(true);
          paramm.b(localView);
        }
        i -= 1;
      }
      a.clear();
      if (b != null) {
        b.clear();
      }
      if (j > 0) {
        q.invalidate();
      }
    }
    
    final void b(at paramat)
    {
      e(View.MeasureSpec.makeMeasureSpec(paramat.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(paramat.getHeight(), 1073741824));
    }
    
    final void b(at paramat, at.m paramm)
    {
      v = false;
      a(paramat, paramm);
    }
    
    public final void b(View paramView, Rect paramRect)
    {
      if (q == null)
      {
        paramRect.set(0, 0, 0, 0);
        return;
      }
      paramRect.set(q.e(paramView));
    }
    
    public int c(at.r paramr)
    {
      return 0;
    }
    
    public void c(int paramInt1, int paramInt2) {}
    
    public final void c(at.m paramm)
    {
      int i = l() - 1;
      while (i >= 0)
      {
        if (!at.c(d(i)).b()) {
          a(i, paramm);
        }
        i -= 1;
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
      if (p != null) {
        return p.b(paramInt);
      }
      return null;
    }
    
    public void d(int paramInt1, int paramInt2) {}
    
    public int e(at.r paramr)
    {
      return 0;
    }
    
    public void e(int paramInt)
    {
      if (q != null)
      {
        at localat = q;
        int j = f.a();
        int i = 0;
        while (i < j)
        {
          f.b(i).offsetLeftAndRight(paramInt);
          i += 1;
        }
      }
    }
    
    final void e(int paramInt1, int paramInt2)
    {
      D = View.MeasureSpec.getSize(paramInt1);
      B = View.MeasureSpec.getMode(paramInt1);
      if ((B == 0) && (!at.b)) {
        D = 0;
      }
      E = View.MeasureSpec.getSize(paramInt2);
      C = View.MeasureSpec.getMode(paramInt2);
      if ((C == 0) && (!at.b)) {
        E = 0;
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
      if (q != null)
      {
        at localat = q;
        int j = f.a();
        int i = 0;
        while (i < j)
        {
          f.b(i).offsetTopAndBottom(paramInt);
          i += 1;
        }
      }
    }
    
    final void f(int paramInt1, int paramInt2)
    {
      int k = Integer.MAX_VALUE;
      int j = Integer.MIN_VALUE;
      int i5 = l();
      if (i5 == 0)
      {
        q.b(paramInt1, paramInt2);
        return;
      }
      int i = 0;
      int n = Integer.MIN_VALUE;
      int i3 = Integer.MAX_VALUE;
      while (i < i5)
      {
        View localView = d(i);
        Rect localRect = q.j;
        at.a(localView, localRect);
        int m = i3;
        if (left < i3) {
          m = left;
        }
        int i1 = n;
        if (right > n) {
          i1 = right;
        }
        int i2 = k;
        if (top < k) {
          i2 = top;
        }
        int i4 = j;
        if (bottom > j) {
          i4 = bottom;
        }
        i += 1;
        i3 = m;
        n = i1;
        k = i2;
        j = i4;
      }
      q.j.set(i3, k, n, j);
      a(q.j, paramInt1, paramInt2);
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
      if (q != null) {
        q.requestLayout();
      }
    }
    
    public final boolean k()
    {
      return (t != null) && (t.c);
    }
    
    public final int l()
    {
      if (p != null) {
        return p.a();
      }
      return 0;
    }
    
    public final int m()
    {
      if (q != null) {
        return q.getPaddingLeft();
      }
      return 0;
    }
    
    public final int n()
    {
      if (q != null) {
        return q.getPaddingTop();
      }
      return 0;
    }
    
    public final int o()
    {
      if (q != null) {
        return q.getPaddingRight();
      }
      return 0;
    }
    
    public final int p()
    {
      if (q != null) {
        return q.getPaddingBottom();
      }
      return 0;
    }
    
    final void q()
    {
      if (t != null) {
        t.a();
      }
    }
    
    public static abstract interface a
    {
      public abstract void a(int paramInt1, int paramInt2);
    }
    
    public static final class b
    {
      public int a;
      public int b;
      public boolean c;
      public boolean d;
    }
  }
  
  public static class h
    extends ViewGroup.MarginLayoutParams
  {
    at.u c;
    final Rect d = new Rect();
    boolean e = true;
    boolean f = false;
    
    public h(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public h(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public h(h paramh)
    {
      super();
    }
    
    public h(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public h(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
  }
  
  public static abstract class i
  {
    public abstract boolean a();
  }
  
  public static abstract interface j
  {
    public abstract boolean a();
  }
  
  public static abstract class k {}
  
  public static final class l
  {
    SparseArray<a> a = new SparseArray();
    int b = 0;
    
    static long a(long paramLong1, long paramLong2)
    {
      if (paramLong1 == 0L) {
        return paramLong2;
      }
      return paramLong1 / 4L * 3L + paramLong2 / 4L;
    }
    
    final a a(int paramInt)
    {
      a locala2 = (a)a.get(paramInt);
      a locala1 = locala2;
      if (locala2 == null)
      {
        locala1 = new a();
        a.put(paramInt, locala1);
      }
      return locala1;
    }
    
    final void a()
    {
      b += 1;
    }
    
    final void b()
    {
      b -= 1;
    }
    
    static final class a
    {
      ArrayList<at.u> a = new ArrayList();
      int b = 5;
      long c = 0L;
      long d = 0L;
    }
  }
  
  public final class m
  {
    final ArrayList<at.u> a = new ArrayList();
    ArrayList<at.u> b = null;
    final ArrayList<at.u> c = new ArrayList();
    final List<at.u> d = Collections.unmodifiableList(a);
    int e = 2;
    int f = 2;
    at.l g;
    at.s h;
    
    public m() {}
    
    private at.u a(long paramLong, int paramInt)
    {
      int j = a.size() - 1;
      at.u localu;
      while (j >= 0)
      {
        localu = (at.u)a.get(j);
        if ((e == paramLong) && (!localu.g()))
        {
          if (paramInt == f)
          {
            localu.b(32);
            if ((localu.m()) && (!F.g)) {
              localu.a(2, 14);
            }
            return localu;
          }
          a.remove(j);
          removeDetachedView(a, false);
          b(a);
        }
        j -= 1;
      }
      j = c.size() - 1;
      while (j >= 0)
      {
        localu = (at.u)c.get(j);
        if (e == paramLong)
        {
          if (paramInt == f)
          {
            c.remove(j);
            return localu;
          }
          c(j);
          return null;
        }
        j -= 1;
      }
      return null;
    }
    
    private void a(ViewGroup paramViewGroup, boolean paramBoolean)
    {
      int j = paramViewGroup.getChildCount() - 1;
      while (j >= 0)
      {
        View localView = paramViewGroup.getChildAt(j);
        if ((localView instanceof ViewGroup)) {
          a((ViewGroup)localView, true);
        }
        j -= 1;
      }
      if (!paramBoolean) {
        return;
      }
      if (paramViewGroup.getVisibility() == 4)
      {
        paramViewGroup.setVisibility(0);
        paramViewGroup.setVisibility(4);
        return;
      }
      j = paramViewGroup.getVisibility();
      paramViewGroup.setVisibility(4);
      paramViewGroup.setVisibility(j);
    }
    
    private at.u d(int paramInt)
    {
      int k = 0;
      int m;
      if (b != null)
      {
        m = b.size();
        if (m != 0) {}
      }
      else
      {
        return null;
      }
      int j = 0;
      at.u localu;
      while (j < m)
      {
        localu = (at.u)b.get(j);
        if ((!localu.g()) && (localu.c() == paramInt))
        {
          localu.b(32);
          return localu;
        }
        j += 1;
      }
      if (le)
      {
        paramInt = e.a(paramInt, 0);
        if ((paramInt > 0) && (paramInt < at.this.l.a()))
        {
          long l = at.this.l.a(paramInt);
          paramInt = k;
          while (paramInt < m)
          {
            localu = (at.u)b.get(paramInt);
            if ((!localu.g()) && (e == l))
            {
              localu.b(32);
              return localu;
            }
            paramInt += 1;
          }
        }
      }
      return null;
    }
    
    private at.u e(int paramInt)
    {
      int k = 0;
      int m = a.size();
      int j = 0;
      Object localObject1;
      while (j < m)
      {
        localObject1 = (at.u)a.get(j);
        if ((!((at.u)localObject1).g()) && (((at.u)localObject1).c() == paramInt) && (!((at.u)localObject1).j()) && ((F.g) || (!((at.u)localObject1).m())))
        {
          ((at.u)localObject1).b(32);
          return (at.u)localObject1;
        }
        j += 1;
      }
      Object localObject2 = f;
      m = c.size();
      j = 0;
      Object localObject3;
      if (j < m)
      {
        localObject1 = (View)c.get(j);
        localObject3 = a.b((View)localObject1);
        if ((((at.u)localObject3).c() != paramInt) || (((at.u)localObject3).j()) || (((at.u)localObject3).m())) {}
      }
      for (;;)
      {
        if (localObject1 != null)
        {
          localObject2 = at.c((View)localObject1);
          localObject3 = f;
          paramInt = a.a((View)localObject1);
          if (paramInt < 0)
          {
            throw new IllegalArgumentException("view is not a child, cannot hide " + localObject1);
            j += 1;
            break;
            localObject1 = null;
            continue;
          }
          if (!b.c(paramInt)) {
            throw new RuntimeException("trying to unhide a view that was not hidden" + localObject1);
          }
          b.b(paramInt);
          ((ac)localObject3).b((View)localObject1);
          paramInt = f.c((View)localObject1);
          if (paramInt == -1) {
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + localObject2);
          }
          f.d(paramInt);
          c((View)localObject1);
          ((at.u)localObject2).b(8224);
          return (at.u)localObject2;
        }
      }
      m = c.size();
      j = k;
      while (j < m)
      {
        localObject1 = (at.u)c.get(j);
        if ((!((at.u)localObject1).j()) && (((at.u)localObject1).c() == paramInt))
        {
          c.remove(j);
          return (at.u)localObject1;
        }
        j += 1;
      }
      return null;
    }
    
    public final int a(int paramInt)
    {
      if ((paramInt < 0) || (paramInt >= F.a())) {
        throw new IndexOutOfBoundsException("invalid position " + paramInt + ". State item count is " + F.a());
      }
      if (!F.g) {
        return paramInt;
      }
      return e.b(paramInt);
    }
    
    final at.u a(int paramInt, long paramLong)
    {
      if ((paramInt < 0) || (paramInt >= F.a())) {
        throw new IndexOutOfBoundsException("Invalid item position " + paramInt + "(" + paramInt + "). Item count:" + F.a());
      }
      int k = 0;
      Object localObject2 = null;
      int j;
      Object localObject1;
      boolean bool;
      if (F.g)
      {
        localObject2 = d(paramInt);
        if (localObject2 != null) {
          k = 1;
        }
      }
      else
      {
        j = k;
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject2 = e(paramInt);
          j = k;
          localObject1 = localObject2;
          if (localObject2 != null)
          {
            if (!((at.u)localObject2).m()) {
              break label305;
            }
            bool = F.g;
            label156:
            if (bool) {
              break label464;
            }
            ((at.u)localObject2).b(4);
            if (!((at.u)localObject2).e()) {
              break label448;
            }
            removeDetachedView(a, false);
            ((at.u)localObject2).f();
            label193:
            a((at.u)localObject2);
            localObject1 = null;
            j = k;
          }
        }
      }
      label305:
      label448:
      label464:
      int m;
      long l1;
      long l2;
      for (;;)
      {
        if (localObject1 == null)
        {
          k = e.b(paramInt);
          if ((k < 0) || (k >= l.a()))
          {
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + paramInt + "(offset:" + k + ").state:" + F.a());
            k = 0;
            break;
            if ((c < 0) || (c >= l.a())) {
              throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + localObject2);
            }
            if ((!F.g) && (l.b(c) != f))
            {
              bool = false;
              break label156;
            }
            if ((l.e) && (e != l.a(c)))
            {
              bool = false;
              break label156;
            }
            bool = true;
            break label156;
            if (!((at.u)localObject2).g()) {
              break label193;
            }
            ((at.u)localObject2).h();
            break label193;
            j = 1;
            localObject1 = localObject2;
            continue;
          }
          m = l.b(k);
          if (l.e)
          {
            localObject2 = a(l.a(k), m);
            localObject1 = localObject2;
            if (localObject2 != null)
            {
              c = k;
              j = 1;
              localObject1 = localObject2;
              if (localObject2 == null)
              {
                localObject1 = localObject2;
                if (h != null)
                {
                  View localView = h.a();
                  localObject1 = localObject2;
                  if (localView != null)
                  {
                    localObject2 = a(localView);
                    if (localObject2 == null) {
                      throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                    }
                    localObject1 = localObject2;
                    if (((at.u)localObject2).b()) {
                      throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                    }
                  }
                }
              }
              localObject2 = localObject1;
              if (localObject1 == null)
              {
                localObject1 = (at.l.a)da.get(m);
                if ((localObject1 == null) || (a.isEmpty())) {
                  break label817;
                }
                localObject1 = a;
                localObject1 = (at.u)((ArrayList)localObject1).remove(((ArrayList)localObject1).size() - 1);
                localObject2 = localObject1;
                if (localObject1 != null)
                {
                  ((at.u)localObject1).q();
                  localObject2 = localObject1;
                  if (at.a)
                  {
                    localObject2 = localObject1;
                    if ((a instanceof ViewGroup))
                    {
                      a((ViewGroup)a, false);
                      localObject2 = localObject1;
                    }
                  }
                }
              }
              localObject1 = localObject2;
              if (localObject2 == null)
              {
                l1 = getNanoTime();
                if (paramLong != Long.MAX_VALUE)
                {
                  l2 = g.a(m).c;
                  if ((l2 == 0L) || (l2 + l1 < paramLong)) {}
                  for (k = 1;; k = 0)
                  {
                    if (k != 0) {
                      break label829;
                    }
                    return null;
                    label817:
                    localObject1 = null;
                    break;
                  }
                }
                label829:
                localObject1 = l;
                localObject2 = at.this;
                e.a("RV CreateView");
                localObject1 = ((at.a)localObject1).a((ViewGroup)localObject2, m);
                f = m;
                e.a();
                if (at.p())
                {
                  localObject2 = at.f(a);
                  if (localObject2 != null) {
                    b = new WeakReference(localObject2);
                  }
                }
                l2 = getNanoTime();
                localObject2 = g.a(m);
                c = at.l.a(c, l2 - l1);
              }
            }
          }
        }
      }
      for (localObject2 = localObject1;; localObject2 = localObject1)
      {
        if ((j != 0) && (!F.g) && (((at.u)localObject2).a(8192)))
        {
          ((at.u)localObject2).a(0, 8192);
          if (F.j)
          {
            at.e.d((at.u)localObject2);
            localObject1 = B;
            localObject1 = F;
            ((at.u)localObject2).p();
            localObject1 = new at.e.b().a((at.u)localObject2);
            a((at.u)localObject2, (at.e.b)localObject1);
          }
        }
        if ((F.g) && (((at.u)localObject2).l()))
        {
          g = paramInt;
          paramInt = 0;
        }
        for (;;)
        {
          localObject1 = a.getLayoutParams();
          if (localObject1 == null)
          {
            localObject1 = (at.h)generateDefaultLayoutParams();
            a.setLayoutParams((ViewGroup.LayoutParams)localObject1);
            label1120:
            c = ((at.u)localObject2);
            if ((j == 0) || (paramInt == 0)) {
              break label1536;
            }
          }
          label1253:
          label1269:
          label1536:
          for (bool = true;; bool = false)
          {
            f = bool;
            return (at.u)localObject2;
            if ((((at.u)localObject2).l()) && (!((at.u)localObject2).k()) && (!((at.u)localObject2).j())) {
              break label1542;
            }
            m = e.b(paramInt);
            m = at.this;
            k = f;
            l1 = getNanoTime();
            if (paramLong != Long.MAX_VALUE)
            {
              l2 = g.a(k).d;
              if ((l2 == 0L) || (l2 + l1 < paramLong))
              {
                k = 1;
                if (k != 0) {
                  break label1269;
                }
              }
            }
            for (paramInt = 0;; paramInt = 1)
            {
              break;
              k = 0;
              break label1253;
              localObject1 = l;
              c = m;
              if (e) {
                e = ((at.a)localObject1).a(m);
              }
              ((at.u)localObject2).a(1, 519);
              e.a("RV OnBindView");
              ((at.u)localObject2).p();
              ((at.a)localObject1).a((at.u)localObject2, m);
              ((at.u)localObject2).o();
              localObject1 = a.getLayoutParams();
              if ((localObject1 instanceof at.h)) {
                e = true;
              }
              e.a();
              paramLong = getNanoTime();
              localObject1 = g.a(f);
              d = at.l.a(d, paramLong - l1);
              localObject1 = a;
              if (j())
              {
                if (w.d((View)localObject1) == 0) {
                  w.c((View)localObject1, 1);
                }
                if (!w.a((View)localObject1)) {
                  w.a((View)localObject1, J.c);
                }
              }
              if (F.g) {
                g = paramInt;
              }
            }
            if (!checkLayoutParams((ViewGroup.LayoutParams)localObject1))
            {
              localObject1 = (at.h)generateLayoutParams((ViewGroup.LayoutParams)localObject1);
              a.setLayoutParams((ViewGroup.LayoutParams)localObject1);
              break label1120;
            }
            localObject1 = (at.h)localObject1;
            break label1120;
          }
          label1542:
          paramInt = 0;
        }
        localObject2 = localObject1;
        break;
      }
    }
    
    public final void a()
    {
      a.clear();
      c();
    }
    
    final void a(at.u paramu)
    {
      int m = 0;
      Object localObject;
      if ((paramu.e()) || (a.getParent() != null))
      {
        localObject = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:").append(paramu.e()).append(" isAttached:");
        if (a.getParent() != null) {}
        for (bool = true;; bool = false) {
          throw new IllegalArgumentException(bool);
        }
      }
      if (paramu.n()) {
        throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + paramu);
      }
      if (paramu.b()) {
        throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
      }
      boolean bool = at.u.a(paramu);
      if ((l != null) && (bool)) {
        localObject = l;
      }
      int j;
      if (paramu.r()) {
        if ((f > 0) && (!paramu.a(526)))
        {
          k = c.size();
          j = k;
          if (k >= f)
          {
            j = k;
            if (k > 0)
            {
              c(0);
              j = k - 1;
            }
          }
          k = j;
          if (at.p())
          {
            k = j;
            if (j > 0)
            {
              k = j;
              if (!E.a(c))
              {
                j -= 1;
                while (j >= 0)
                {
                  k = c.get(j)).c;
                  if (!E.a(k)) {
                    break;
                  }
                  j -= 1;
                }
                k = j + 1;
              }
            }
          }
          c.add(k, paramu);
          j = 1;
          k = j;
          if (j == 0)
          {
            a(paramu, true);
            m = 1;
          }
        }
      }
      for (int k = j;; k = 0)
      {
        g.d(paramu);
        if ((k == 0) && (m == 0) && (bool)) {
          m = null;
        }
        return;
        j = 0;
        break;
      }
    }
    
    final void a(at.u paramu, boolean paramBoolean)
    {
      at.b(paramu);
      w.a(a, null);
      if (paramBoolean)
      {
        if (n != null) {
          localObject = n;
        }
        if (l != null) {
          l.a(paramu);
        }
        if (F != null) {
          g.d(paramu);
        }
      }
      m = null;
      Object localObject = d();
      int j = f;
      ArrayList localArrayList = aa;
      if (a.get(j)).b > localArrayList.size())
      {
        paramu.q();
        localArrayList.add(paramu);
      }
    }
    
    public final void a(View paramView)
    {
      at.u localu = at.c(paramView);
      if (localu.n()) {
        removeDetachedView(paramView, false);
      }
      if (localu.e()) {
        localu.f();
      }
      for (;;)
      {
        a(localu);
        return;
        if (localu.g()) {
          localu.h();
        }
      }
    }
    
    public final View b(int paramInt)
    {
      return aMAX_VALUEa;
    }
    
    final void b()
    {
      if (m != null) {}
      for (int j = m.z;; j = 0)
      {
        f = (j + e);
        j = c.size() - 1;
        while ((j >= 0) && (c.size() > f))
        {
          c(j);
          j -= 1;
        }
      }
    }
    
    final void b(at.u paramu)
    {
      if (at.u.d(paramu)) {
        b.remove(paramu);
      }
      for (;;)
      {
        at.u.b(paramu);
        at.u.c(paramu);
        paramu.h();
        return;
        a.remove(paramu);
      }
    }
    
    final void b(View paramView)
    {
      paramView = at.c(paramView);
      at.u.b(paramView);
      at.u.c(paramView);
      paramView.h();
      a(paramView);
    }
    
    final void c()
    {
      int j = c.size() - 1;
      while (j >= 0)
      {
        c(j);
        j -= 1;
      }
      c.clear();
      if (at.p()) {
        E.a();
      }
    }
    
    final void c(int paramInt)
    {
      a((at.u)c.get(paramInt), true);
      c.remove(paramInt);
    }
    
    final void c(View paramView)
    {
      paramView = at.c(paramView);
      int j;
      if ((!paramView.a(12)) && (paramView.s()))
      {
        at localat = at.this;
        if ((B != null) && (!B.a(paramView, paramView.p()))) {
          break label92;
        }
        j = 1;
      }
      while (j != 0) {
        if ((paramView.j()) && (!paramView.m()) && (!l.e))
        {
          throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
          label92:
          j = 0;
        }
        else
        {
          paramView.a(this, false);
          a.add(paramView);
          return;
        }
      }
      if (b == null) {
        b = new ArrayList();
      }
      paramView.a(this, true);
      b.add(paramView);
    }
    
    final at.l d()
    {
      if (g == null) {
        g = new at.l();
      }
      return g;
    }
  }
  
  public static abstract interface n {}
  
  private final class o
    extends at.c
  {
    o() {}
    
    public final void a()
    {
      a(null);
      F.f = true;
      at localat = at.this;
      if (!w)
      {
        w = true;
        int j = f.b();
        int i = 0;
        while (i < j)
        {
          localObject = at.c(f.c(i));
          if ((localObject != null) && (!((at.u)localObject).b())) {
            ((at.u)localObject).b(512);
          }
          i += 1;
        }
        Object localObject = d;
        j = c.size();
        i = 0;
        while (i < j)
        {
          at.u localu = (at.u)c.get(i);
          if (localu != null) {
            localu.b(512);
          }
          i += 1;
        }
        localat.l();
      }
      if (!e.d()) {
        requestLayout();
      }
    }
  }
  
  public static final class p
    extends android.support.v4.h.a
  {
    public static final Parcelable.Creator<p> CREATOR = android.support.v4.f.b.a(new c() {});
    Parcelable a;
    
    p(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      if (paramClassLoader != null) {}
      for (;;)
      {
        a = paramParcel.readParcelable(paramClassLoader);
        return;
        paramClassLoader = at.g.class.getClassLoader();
      }
    }
    
    p(Parcelable paramParcelable)
    {
      super();
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeParcelable(a, 0);
    }
  }
  
  public static abstract class q
  {
    int a;
    boolean b;
    boolean c;
    View d;
    private at e;
    private at.g f;
    private final a g;
    
    protected final void a()
    {
      if (!c) {
        return;
      }
      e.F.a = -1;
      d = null;
      a = -1;
      b = false;
      c = false;
      at.g.a(f, this);
      f = null;
      e = null;
    }
    
    public static final class a
    {
      int a;
      private int b;
      private int c;
      private int d;
      private Interpolator e;
      private boolean f;
      private int g;
      
      final void a(at paramat)
      {
        int i;
        if (a >= 0)
        {
          i = a;
          a = -1;
          paramat.a(i);
          f = false;
          return;
        }
        if (f)
        {
          if ((e != null) && (d <= 0)) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
          }
          if (d <= 0) {
            throw new IllegalStateException("Scroll duration must be a positive number");
          }
          if (e == null) {
            if (d == Integer.MIN_VALUE)
            {
              paramat = C;
              i = b;
              int j = c;
              paramat.a(i, j, paramat.a(i, j));
            }
          }
          for (;;)
          {
            g += 1;
            if (g > 10) {
              Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            f = false;
            return;
            C.a(b, c, d);
            continue;
            C.a(b, c, d, e);
          }
        }
        g = 0;
      }
    }
  }
  
  public static final class r
  {
    int a = -1;
    int b = 0;
    int c = 0;
    int d = 1;
    int e = 0;
    boolean f = false;
    boolean g = false;
    boolean h = false;
    boolean i = false;
    boolean j = false;
    boolean k = false;
    int l;
    long m;
    int n;
    private SparseArray<Object> o;
    
    public final int a()
    {
      if (g) {
        return b - c;
      }
      return e;
    }
    
    final void a(int paramInt)
    {
      if ((d & paramInt) == 0) {
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(paramInt) + " but it is " + Integer.toBinaryString(d));
      }
    }
    
    public final String toString()
    {
      return "State{mTargetPosition=" + a + ", mData=" + o + ", mItemCount=" + e + ", mPreviousLayoutItemCount=" + b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + c + ", mStructureChanged=" + f + ", mInPreLayout=" + g + ", mRunSimpleAnimations=" + j + ", mRunPredictiveAnimations=" + k + '}';
    }
  }
  
  public static abstract class s
  {
    public abstract View a();
  }
  
  final class t
    implements Runnable
  {
    int a;
    int b;
    m c = m.a(getContext(), at.L);
    Interpolator d = at.L;
    private boolean f = false;
    private boolean g = false;
    
    public t() {}
    
    final int a(int paramInt1, int paramInt2)
    {
      int j = Math.abs(paramInt1);
      int k = Math.abs(paramInt2);
      int i;
      int m;
      if (j > k)
      {
        i = 1;
        m = (int)Math.sqrt(0.0D);
        paramInt2 = (int)Math.sqrt(paramInt1 * paramInt1 + paramInt2 * paramInt2);
        if (i == 0) {
          break label142;
        }
      }
      label142:
      for (paramInt1 = getWidth();; paramInt1 = getHeight())
      {
        int n = paramInt1 / 2;
        float f3 = Math.min(1.0F, paramInt2 * 1.0F / paramInt1);
        float f1 = n;
        float f2 = n;
        f3 = (float)Math.sin((float)((f3 - 0.5F) * 0.4712389167638204D));
        if (m <= 0) {
          break label153;
        }
        paramInt1 = Math.round(1000.0F * Math.abs((f3 * f2 + f1) / m)) * 4;
        return Math.min(paramInt1, 2000);
        i = 0;
        break;
      }
      label153:
      if (i != 0) {}
      for (paramInt2 = j;; paramInt2 = k)
      {
        paramInt1 = (int)((paramInt2 / paramInt1 + 1.0F) * 300.0F);
        break;
      }
    }
    
    final void a()
    {
      if (f)
      {
        g = true;
        return;
      }
      removeCallbacks(this);
      w.a(at.this, this);
    }
    
    public final void a(int paramInt1, int paramInt2, int paramInt3)
    {
      a(paramInt1, paramInt2, paramInt3, at.L);
    }
    
    public final void a(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
    {
      if (d != paramInterpolator)
      {
        d = paramInterpolator;
        c = m.a(getContext(), paramInterpolator);
      }
      setScrollState(2);
      b = 0;
      a = 0;
      c.a(0, 0, paramInt1, paramInt2, paramInt3);
      a();
    }
    
    public final void b()
    {
      removeCallbacks(this);
      c.a.abortAnimation();
    }
    
    public final void run()
    {
      if (at.this.m == null)
      {
        b();
        return;
      }
      g = false;
      f = true;
      at.this.b();
      m localm = c;
      at.q localq = mt;
      int i6;
      int i7;
      int i4;
      int i5;
      int i1;
      int i;
      int m;
      int i3;
      int j;
      int n;
      int k;
      if (a.computeScrollOffset())
      {
        i6 = a.getCurrX();
        i7 = a.getCurrY();
        i4 = i6 - a;
        i5 = i7 - b;
        i1 = 0;
        i = 0;
        i2 = 0;
        m = 0;
        a = i6;
        b = i7;
        i3 = 0;
        j = 0;
        n = 0;
        k = 0;
        if (l == null) {
          break label791;
        }
        c();
        h();
        e.a("RV Scroll");
        if (i4 != 0)
        {
          i = at.this.m.a(i4, d, F);
          j = i4 - i;
        }
        if (i5 != 0)
        {
          m = at.this.m.b(i5, d, F);
          k = i5 - m;
        }
        e.a();
        o();
        i();
        a(false);
        n = k;
        i2 = m;
        i3 = j;
        i1 = i;
        if (localq == null) {
          break label791;
        }
        n = k;
        i2 = m;
        i3 = j;
        i1 = i;
        if (b) {
          break label791;
        }
        n = k;
        i2 = m;
        i3 = j;
        i1 = i;
        if (!c) {
          break label791;
        }
        n = F.a();
        if (n != 0) {
          break label754;
        }
        localq.a();
        i1 = i;
        label347:
        if (!o.isEmpty()) {
          invalidate();
        }
        if (getOverScrollMode() != 2) {
          a(i4, i5);
        }
        if ((j != 0) || (k != 0))
        {
          n = (int)localm.a();
          if (j == i6) {
            break label932;
          }
          if (j >= 0) {
            break label804;
          }
          i = -n;
        }
      }
      label419:
      label436:
      label475:
      label495:
      label621:
      label648:
      label668:
      label754:
      label791:
      label804:
      label831:
      label855:
      label882:
      label887:
      label892:
      label932:
      for (int i2 = i;; i2 = 0)
      {
        if (k != i7) {
          if (k < 0) {
            i = -n;
          }
        }
        for (;;)
        {
          at localat;
          if (getOverScrollMode() != 2)
          {
            localat = at.this;
            if (i2 >= 0) {
              break label831;
            }
            localat.d();
            x.a(-i2);
            if (i >= 0) {
              break label855;
            }
            localat.f();
            y.a(-i);
            if ((i2 != 0) || (i != 0)) {
              w.c(localat);
            }
          }
          if (((i2 != 0) || (j == i6) || (a.getFinalX() == 0)) && ((i != 0) || (k == i7) || (a.getFinalY() == 0))) {
            a.abortAnimation();
          }
          if ((i1 != 0) || (m != 0)) {
            m();
          }
          if (!at.a(at.this)) {
            invalidate();
          }
          if ((i5 != 0) && (at.this.m.f()) && (m == i5))
          {
            i = 1;
            if ((i4 == 0) || (!at.this.m.e()) || (i1 != i4)) {
              break label882;
            }
            j = 1;
            if (((i4 != 0) || (i5 != 0)) && (j == 0) && (i == 0)) {
              break label887;
            }
            i = 1;
            if ((!a.isFinished()) && (i != 0)) {
              break label892;
            }
            setScrollState(0);
            if (at.p()) {
              E.a();
            }
          }
          for (;;)
          {
            if (localq != null)
            {
              if (b) {
                at.q.a(localq);
              }
              if (!g) {
                localq.a();
              }
            }
            f = false;
            if (!g) {
              break;
            }
            a();
            return;
            if (a >= n) {
              a = (n - 1);
            }
            at.q.a(localq);
            i1 = i;
            i3 = j;
            i2 = m;
            n = k;
            m = i2;
            j = i3;
            k = n;
            break label347;
            if (j > 0)
            {
              i = n;
              break label419;
            }
            i = 0;
            break label419;
            i = n;
            if (k > 0) {
              break label436;
            }
            i = 0;
            break label436;
            if (i2 <= 0) {
              break label475;
            }
            localat.e();
            z.a(i2);
            break label475;
            if (i <= 0) {
              break label495;
            }
            localat.g();
            A.a(i);
            break label495;
            i = 0;
            break label621;
            j = 0;
            break label648;
            i = 0;
            break label668;
            a();
            if (D != null) {
              D.a(at.this, i4, i5);
            }
          }
          i = 0;
        }
      }
    }
  }
  
  public static abstract class u
  {
    private static final List<Object> o = Collections.EMPTY_LIST;
    public final View a;
    WeakReference<at> b;
    int c = -1;
    int d = -1;
    long e = -1L;
    int f = -1;
    int g = -1;
    u h = null;
    u i = null;
    List<Object> j = null;
    List<Object> k = null;
    int l = -1;
    at m;
    private int n;
    private int p = 0;
    private at.m q = null;
    private boolean r = false;
    private int s = 0;
    
    public u(View paramView)
    {
      if (paramView == null) {
        throw new IllegalArgumentException("itemView may not be null");
      }
      a = paramView;
    }
    
    final void a()
    {
      d = -1;
      g = -1;
    }
    
    final void a(int paramInt1, int paramInt2)
    {
      n = (n & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
    }
    
    final void a(int paramInt, boolean paramBoolean)
    {
      if (d == -1) {
        d = c;
      }
      if (g == -1) {
        g = c;
      }
      if (paramBoolean) {
        g += paramInt;
      }
      c += paramInt;
      if (a.getLayoutParams() != null) {
        a.getLayoutParams()).e = true;
      }
    }
    
    final void a(at.m paramm, boolean paramBoolean)
    {
      q = paramm;
      r = paramBoolean;
    }
    
    final void a(Object paramObject)
    {
      if (paramObject == null) {
        b(1024);
      }
      while ((n & 0x400) != 0) {
        return;
      }
      if (j == null)
      {
        j = new ArrayList();
        k = Collections.unmodifiableList(j);
      }
      j.add(paramObject);
    }
    
    public final void a(boolean paramBoolean)
    {
      int i1;
      if (paramBoolean)
      {
        i1 = p - 1;
        p = i1;
        if (p >= 0) {
          break label61;
        }
        p = 0;
        Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
      }
      label61:
      do
      {
        return;
        i1 = p + 1;
        break;
        if ((!paramBoolean) && (p == 1))
        {
          n |= 0x10;
          return;
        }
      } while ((!paramBoolean) || (p != 0));
      n &= 0xFFFFFFEF;
    }
    
    final boolean a(int paramInt)
    {
      return (n & paramInt) != 0;
    }
    
    final void b(int paramInt)
    {
      n |= paramInt;
    }
    
    final boolean b()
    {
      return (n & 0x80) != 0;
    }
    
    public final int c()
    {
      if (g == -1) {
        return c;
      }
      return g;
    }
    
    public final int d()
    {
      if (m == null) {
        return -1;
      }
      return m.c(this);
    }
    
    final boolean e()
    {
      return q != null;
    }
    
    final void f()
    {
      q.b(this);
    }
    
    final boolean g()
    {
      return (n & 0x20) != 0;
    }
    
    final void h()
    {
      n &= 0xFFFFFFDF;
    }
    
    final void i()
    {
      n &= 0xFEFF;
    }
    
    final boolean j()
    {
      return (n & 0x4) != 0;
    }
    
    final boolean k()
    {
      return (n & 0x2) != 0;
    }
    
    final boolean l()
    {
      return (n & 0x1) != 0;
    }
    
    final boolean m()
    {
      return (n & 0x8) != 0;
    }
    
    final boolean n()
    {
      return (n & 0x100) != 0;
    }
    
    final void o()
    {
      if (j != null) {
        j.clear();
      }
      n &= 0xFBFF;
    }
    
    final List<Object> p()
    {
      if ((n & 0x400) == 0)
      {
        if ((j == null) || (j.size() == 0)) {
          return o;
        }
        return k;
      }
      return o;
    }
    
    final void q()
    {
      n = 0;
      c = -1;
      d = -1;
      e = -1L;
      g = -1;
      p = 0;
      h = null;
      i = null;
      o();
      s = 0;
      l = -1;
      at.b(this);
    }
    
    public final boolean r()
    {
      return ((n & 0x10) == 0) && (!w.b(a));
    }
    
    final boolean s()
    {
      return (n & 0x2) != 0;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder1 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + c + " id=" + e + ", oldPos=" + d + ", pLpos:" + g);
      String str;
      if (e())
      {
        StringBuilder localStringBuilder2 = localStringBuilder1.append(" scrap ");
        if (r)
        {
          str = "[changeScrap]";
          localStringBuilder2.append(str);
        }
      }
      else
      {
        if (j()) {
          localStringBuilder1.append(" invalid");
        }
        if (!l()) {
          localStringBuilder1.append(" unbound");
        }
        if (k()) {
          localStringBuilder1.append(" update");
        }
        if (m()) {
          localStringBuilder1.append(" removed");
        }
        if (b()) {
          localStringBuilder1.append(" ignored");
        }
        if (n()) {
          localStringBuilder1.append(" tmpDetached");
        }
        if (!r()) {
          localStringBuilder1.append(" not recyclable(" + p + ")");
        }
        if (((n & 0x200) == 0) && (!j())) {
          break label298;
        }
      }
      label298:
      for (int i1 = 1;; i1 = 0)
      {
        if (i1 != 0) {
          localStringBuilder1.append(" undefined adapter position");
        }
        if (a.getParent() == null) {
          localStringBuilder1.append(" no parent");
        }
        localStringBuilder1.append("}");
        return localStringBuilder1.toString();
        str = "[attachedScrap]";
        break;
      }
    }
  }
}


/* Location:              android/support/v7/widget/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */