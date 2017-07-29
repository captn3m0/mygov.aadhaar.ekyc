package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.h.n;
import android.support.v4.h.v;
import android.support.v4.h.w;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

public final class p
{
  private static final Interpolator v = new Interpolator()
  {
    public final float getInterpolation(float paramAnonymousFloat)
    {
      paramAnonymousFloat -= 1.0F;
      return paramAnonymousFloat * (paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat) + 1.0F;
    }
  };
  int a;
  public int b;
  float[] c;
  float[] d;
  float[] e;
  float[] f;
  float g;
  int h;
  int i;
  View j;
  private int k = -1;
  private int[] l;
  private int[] m;
  private int[] n;
  private int o;
  private VelocityTracker p;
  private float q;
  private m r;
  private final a s;
  private boolean t;
  private final ViewGroup u;
  private final Runnable w = new Runnable()
  {
    public final void run()
    {
      b(0);
    }
  };
  
  private p(Context paramContext, ViewGroup paramViewGroup, a parama)
  {
    if (paramViewGroup == null) {
      throw new IllegalArgumentException("Parent view may not be null");
    }
    if (parama == null) {
      throw new IllegalArgumentException("Callback may not be null");
    }
    u = paramViewGroup;
    s = parama;
    paramViewGroup = ViewConfiguration.get(paramContext);
    h = ((int)(getResourcesgetDisplayMetricsdensity * 20.0F + 0.5F));
    b = paramViewGroup.getScaledTouchSlop();
    q = paramViewGroup.getScaledMaximumFlingVelocity();
    g = paramViewGroup.getScaledMinimumFlingVelocity();
    r = m.a(paramContext, v);
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = Math.abs(paramFloat1);
    if (f1 < paramFloat2) {
      paramFloat2 = 0.0F;
    }
    do
    {
      return paramFloat2;
      if (f1 <= paramFloat3) {
        break;
      }
      paramFloat2 = paramFloat3;
    } while (paramFloat1 > 0.0F);
    return -paramFloat3;
    return paramFloat1;
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 == 0) {
      return 0;
    }
    int i1 = u.getWidth();
    int i2 = i1 / 2;
    float f3 = Math.min(1.0F, Math.abs(paramInt1) / i1);
    float f1 = i2;
    float f2 = i2;
    f3 = (float)Math.sin((float)((f3 - 0.5F) * 0.4712389167638204D));
    paramInt2 = Math.abs(paramInt2);
    if (paramInt2 > 0) {}
    for (paramInt1 = Math.round(Math.abs((f3 * f2 + f1) / paramInt2) * 1000.0F) * 4;; paramInt1 = (int)((Math.abs(paramInt1) / paramInt3 + 1.0F) * 256.0F)) {
      return Math.min(paramInt1, 600);
    }
  }
  
  public static p a(ViewGroup paramViewGroup, float paramFloat, a parama)
  {
    paramViewGroup = a(paramViewGroup, parama);
    b = ((int)(b * (1.0F / paramFloat)));
    return paramViewGroup;
  }
  
  public static p a(ViewGroup paramViewGroup, a parama)
  {
    return new p(paramViewGroup.getContext(), paramViewGroup, parama);
  }
  
  private void a(float paramFloat1, float paramFloat2)
  {
    t = true;
    s.a(j, paramFloat1, paramFloat2);
    t = false;
    if (a == 1) {
      b(0);
    }
  }
  
  private void a(float paramFloat1, float paramFloat2, int paramInt)
  {
    int i2 = 0;
    if ((c == null) || (c.length <= paramInt))
    {
      localObject = new float[paramInt + 1];
      float[] arrayOfFloat1 = new float[paramInt + 1];
      float[] arrayOfFloat2 = new float[paramInt + 1];
      float[] arrayOfFloat3 = new float[paramInt + 1];
      int[] arrayOfInt1 = new int[paramInt + 1];
      int[] arrayOfInt2 = new int[paramInt + 1];
      int[] arrayOfInt3 = new int[paramInt + 1];
      if (c != null)
      {
        System.arraycopy(c, 0, localObject, 0, c.length);
        System.arraycopy(d, 0, arrayOfFloat1, 0, d.length);
        System.arraycopy(e, 0, arrayOfFloat2, 0, e.length);
        System.arraycopy(f, 0, arrayOfFloat3, 0, f.length);
        System.arraycopy(l, 0, arrayOfInt1, 0, l.length);
        System.arraycopy(m, 0, arrayOfInt2, 0, m.length);
        System.arraycopy(n, 0, arrayOfInt3, 0, n.length);
      }
      c = ((float[])localObject);
      d = arrayOfFloat1;
      e = arrayOfFloat2;
      f = arrayOfFloat3;
      l = arrayOfInt1;
      m = arrayOfInt2;
      n = arrayOfInt3;
    }
    Object localObject = c;
    e[paramInt] = paramFloat1;
    localObject[paramInt] = paramFloat1;
    localObject = d;
    f[paramInt] = paramFloat2;
    localObject[paramInt] = paramFloat2;
    localObject = l;
    int i4 = (int)paramFloat1;
    int i3 = (int)paramFloat2;
    if (i4 < u.getLeft() + h) {
      i2 = 1;
    }
    int i1 = i2;
    if (i3 < u.getTop() + h) {
      i1 = i2 | 0x4;
    }
    i2 = i1;
    if (i4 > u.getRight() - h) {
      i2 = i1 | 0x2;
    }
    i1 = i2;
    if (i3 > u.getBottom() - h) {
      i1 = i2 | 0x8;
    }
    localObject[paramInt] = i1;
    o |= 1 << paramInt;
  }
  
  private boolean a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    paramFloat1 = Math.abs(paramFloat1);
    paramFloat2 = Math.abs(paramFloat2);
    if (((l[paramInt1] & paramInt2) != paramInt2) || ((i & paramInt2) == 0) || ((n[paramInt1] & paramInt2) == paramInt2) || ((m[paramInt1] & paramInt2) == paramInt2) || ((paramFloat1 <= b) && (paramFloat2 <= b))) {}
    while (((m[paramInt1] & paramInt2) != 0) || (paramFloat1 <= b)) {
      return false;
    }
    return true;
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = j.getLeft();
    int i2 = j.getTop();
    paramInt1 -= i1;
    paramInt2 -= i2;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      r.a.abortAnimation();
      b(0);
      return false;
    }
    View localView = j;
    paramInt3 = b(paramInt3, (int)g, (int)q);
    paramInt4 = b(paramInt4, (int)g, (int)q);
    int i3 = Math.abs(paramInt1);
    int i4 = Math.abs(paramInt2);
    int i5 = Math.abs(paramInt3);
    int i6 = Math.abs(paramInt4);
    int i7 = i5 + i6;
    int i8 = i3 + i4;
    float f1;
    if (paramInt3 != 0)
    {
      f1 = i5 / i7;
      if (paramInt4 == 0) {
        break label240;
      }
    }
    label240:
    for (float f2 = i6 / i7;; f2 = i4 / i8)
    {
      paramInt3 = a(paramInt1, paramInt3, s.a(localView));
      paramInt4 = a(paramInt2, paramInt4, s.a());
      float f3 = paramInt3;
      paramInt3 = (int)(f2 * paramInt4 + f1 * f3);
      r.a(i1, i2, paramInt1, paramInt2, paramInt3);
      b(2);
      return true;
      f1 = i3 / i8;
      break;
    }
  }
  
  private boolean a(View paramView, float paramFloat1, float paramFloat2)
  {
    if (paramView == null) {}
    label20:
    int i2;
    label72:
    label78:
    do
    {
      do
      {
        return false;
        int i1;
        if (s.a(paramView) > 0)
        {
          i1 = 1;
          if (s.a() <= 0) {
            break label72;
          }
        }
        for (i2 = 1;; i2 = 0)
        {
          if ((i1 == 0) || (i2 == 0)) {
            break label78;
          }
          if (paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2 <= b * b) {
            break;
          }
          return true;
          i1 = 0;
          break label20;
        }
        if (i1 == 0) {
          break;
        }
      } while (Math.abs(paramFloat1) <= b);
      return true;
    } while ((i2 == 0) || (Math.abs(paramFloat2) <= b));
    return true;
  }
  
  private static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = Math.abs(paramInt1);
    if (i1 < paramInt2) {
      paramInt2 = 0;
    }
    do
    {
      return paramInt2;
      if (i1 <= paramInt3) {
        break;
      }
      paramInt2 = paramInt3;
    } while (paramInt1 > 0);
    return -paramInt3;
    return paramInt1;
  }
  
  private void b(float paramFloat1, float paramFloat2, int paramInt)
  {
    int i2 = 1;
    if (a(paramFloat1, paramFloat2, paramInt, 1)) {}
    for (;;)
    {
      int i1 = i2;
      if (a(paramFloat2, paramFloat1, paramInt, 4)) {
        i1 = i2 | 0x4;
      }
      i2 = i1;
      if (a(paramFloat1, paramFloat2, paramInt, 2)) {
        i2 = i1 | 0x2;
      }
      i1 = i2;
      if (a(paramFloat2, paramFloat1, paramInt, 8)) {
        i1 = i2 | 0x8;
      }
      if (i1 != 0)
      {
        int[] arrayOfInt = m;
        arrayOfInt[paramInt] |= i1;
        s.a(i1, paramInt);
      }
      return;
      i2 = 0;
    }
  }
  
  private boolean b(View paramView, int paramInt)
  {
    if ((paramView == j) && (k == paramInt)) {
      return true;
    }
    if ((paramView != null) && (s.a(paramView, paramInt)))
    {
      k = paramInt;
      a(paramView, paramInt);
      return true;
    }
    return false;
  }
  
  private void c()
  {
    p.computeCurrentVelocity(1000, q);
    a(a(v.a(p, k), g, q), a(v.b(p, k), g, q));
  }
  
  private void c(int paramInt)
  {
    if ((c == null) || (!a(paramInt))) {
      return;
    }
    c[paramInt] = 0.0F;
    d[paramInt] = 0.0F;
    e[paramInt] = 0.0F;
    f[paramInt] = 0.0F;
    l[paramInt] = 0;
    m[paramInt] = 0;
    n[paramInt] = 0;
    o &= (1 << paramInt ^ 0xFFFFFFFF);
  }
  
  private void c(MotionEvent paramMotionEvent)
  {
    int i2 = paramMotionEvent.getPointerCount();
    int i1 = 0;
    while (i1 < i2)
    {
      int i3 = paramMotionEvent.getPointerId(i1);
      if (d(i3))
      {
        float f1 = paramMotionEvent.getX(i1);
        float f2 = paramMotionEvent.getY(i1);
        e[i3] = f1;
        f[i3] = f2;
      }
      i1 += 1;
    }
  }
  
  private boolean d(int paramInt)
  {
    if (!a(paramInt))
    {
      Log.e("ViewDragHelper", "Ignoring pointerId=" + paramInt + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
      return false;
    }
    return true;
  }
  
  public final void a()
  {
    k = -1;
    if (c != null)
    {
      Arrays.fill(c, 0.0F);
      Arrays.fill(d, 0.0F);
      Arrays.fill(e, 0.0F);
      Arrays.fill(f, 0.0F);
      Arrays.fill(l, 0);
      Arrays.fill(m, 0);
      Arrays.fill(n, 0);
      o = 0;
    }
    if (p != null)
    {
      p.recycle();
      p = null;
    }
  }
  
  public final void a(View paramView, int paramInt)
  {
    if (paramView.getParent() != u) {
      throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + u + ")");
    }
    j = paramView;
    k = paramInt;
    s.e(paramView, paramInt);
    b(1);
  }
  
  public final boolean a(int paramInt)
  {
    return (o & 1 << paramInt) != 0;
  }
  
  public final boolean a(int paramInt1, int paramInt2)
  {
    if (!t) {
      throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }
    return a(paramInt1, paramInt2, (int)v.a(p, k), (int)v.b(p, k));
  }
  
  public final boolean a(MotionEvent paramMotionEvent)
  {
    int i2 = n.a(paramMotionEvent);
    int i1 = n.b(paramMotionEvent);
    if (i2 == 0) {
      a();
    }
    if (p == null) {
      p = VelocityTracker.obtain();
    }
    p.addMovement(paramMotionEvent);
    switch (i2)
    {
    }
    while (a == 1)
    {
      return true;
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      i1 = paramMotionEvent.getPointerId(0);
      a(f1, f2, i1);
      paramMotionEvent = b((int)f1, (int)f2);
      if ((paramMotionEvent == j) && (a == 2)) {
        b(paramMotionEvent, i1);
      }
      if ((l[i1] & i) != 0)
      {
        s.d();
        continue;
        i2 = paramMotionEvent.getPointerId(i1);
        f1 = paramMotionEvent.getX(i1);
        f2 = paramMotionEvent.getY(i1);
        a(f1, f2, i2);
        if (a == 0)
        {
          if ((l[i2] & i) != 0) {
            s.d();
          }
        }
        else if (a == 2)
        {
          paramMotionEvent = b((int)f1, (int)f2);
          if (paramMotionEvent == j)
          {
            b(paramMotionEvent, i2);
            continue;
            if ((c != null) && (d != null))
            {
              int i3 = paramMotionEvent.getPointerCount();
              i1 = 0;
              if (i1 < i3)
              {
                int i4 = paramMotionEvent.getPointerId(i1);
                float f3;
                float f4;
                View localView;
                if (d(i4))
                {
                  f1 = paramMotionEvent.getX(i1);
                  f2 = paramMotionEvent.getY(i1);
                  f3 = f1 - c[i4];
                  f4 = f2 - d[i4];
                  localView = b((int)f1, (int)f2);
                  if ((localView == null) || (!a(localView, f3, f4))) {
                    break label551;
                  }
                }
                label551:
                for (i2 = 1;; i2 = 0)
                {
                  if (i2 != 0)
                  {
                    int i5 = localView.getLeft();
                    int i6 = (int)f3;
                    i6 = s.d(localView, i6 + i5);
                    int i7 = localView.getTop();
                    int i8 = (int)f4;
                    i8 = s.c(localView, i8 + i7);
                    int i9 = s.a(localView);
                    int i10 = s.a();
                    if (((i9 == 0) || ((i9 > 0) && (i6 == i5))) && ((i10 == 0) || ((i10 > 0) && (i8 == i7)))) {
                      break label557;
                    }
                  }
                  b(f3, f4, i4);
                  if ((a == 1) || ((i2 != 0) && (b(localView, i4)))) {
                    break label557;
                  }
                  i1 += 1;
                  break;
                }
              }
              label557:
              c(paramMotionEvent);
              continue;
              c(paramMotionEvent.getPointerId(i1));
              continue;
              a();
            }
          }
        }
      }
    }
    return false;
  }
  
  public final boolean a(View paramView, int paramInt1, int paramInt2)
  {
    j = paramView;
    k = -1;
    boolean bool = a(paramInt1, paramInt2, 0, 0);
    if ((!bool) && (a == 0) && (j != null)) {
      j = null;
    }
    return bool;
  }
  
  public final View b(int paramInt1, int paramInt2)
  {
    int i1 = u.getChildCount() - 1;
    while (i1 >= 0)
    {
      View localView = u.getChildAt(i1);
      if ((paramInt1 >= localView.getLeft()) && (paramInt1 < localView.getRight()) && (paramInt2 >= localView.getTop()) && (paramInt2 < localView.getBottom())) {
        return localView;
      }
      i1 -= 1;
    }
    return null;
  }
  
  final void b(int paramInt)
  {
    u.removeCallbacks(w);
    if (a != paramInt)
    {
      a = paramInt;
      s.a(paramInt);
      if (a == 0) {
        j = null;
      }
    }
  }
  
  public final void b(MotionEvent paramMotionEvent)
  {
    int i3 = 0;
    int i1 = 0;
    int i2 = 0;
    int i5 = n.a(paramMotionEvent);
    int i4 = n.b(paramMotionEvent);
    if (i5 == 0) {
      a();
    }
    if (p == null) {
      p = VelocityTracker.obtain();
    }
    p.addMovement(paramMotionEvent);
    float f1;
    float f2;
    switch (i5)
    {
    case 4: 
    default: 
    case 0: 
    case 5: 
    case 2: 
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              f1 = paramMotionEvent.getX();
              f2 = paramMotionEvent.getY();
              i1 = paramMotionEvent.getPointerId(0);
              paramMotionEvent = b((int)f1, (int)f2);
              a(f1, f2, i1);
              b(paramMotionEvent, i1);
            } while ((l[i1] & i) == 0);
            s.d();
            return;
            i3 = paramMotionEvent.getPointerId(i4);
            f1 = paramMotionEvent.getX(i4);
            f2 = paramMotionEvent.getY(i4);
            a(f1, f2, i3);
            if (a != 0) {
              break;
            }
            b(b((int)f1, (int)f2), i3);
          } while ((l[i3] & i) == 0);
          s.d();
          return;
          i4 = (int)f1;
          i5 = (int)f2;
          paramMotionEvent = j;
          i1 = i2;
          if (paramMotionEvent != null)
          {
            i1 = i2;
            if (i4 >= paramMotionEvent.getLeft())
            {
              i1 = i2;
              if (i4 < paramMotionEvent.getRight())
              {
                i1 = i2;
                if (i5 >= paramMotionEvent.getTop())
                {
                  i1 = i2;
                  if (i5 < paramMotionEvent.getBottom()) {
                    i1 = 1;
                  }
                }
              }
            }
          }
        } while (i1 == 0);
        b(j, i3);
        return;
        if (a != 1) {
          break;
        }
      } while (!d(k));
      i1 = paramMotionEvent.findPointerIndex(k);
      f1 = paramMotionEvent.getX(i1);
      f2 = paramMotionEvent.getY(i1);
      i3 = (int)(f1 - e[k]);
      i4 = (int)(f2 - f[k]);
      i2 = j.getLeft() + i3;
      int i6 = j.getTop();
      int i7 = j.getLeft();
      i5 = j.getTop();
      i1 = i2;
      if (i3 != 0)
      {
        i1 = s.d(j, i2);
        w.f(j, i1 - i7);
      }
      if (i4 != 0)
      {
        i2 = s.c(j, i6 + i4);
        w.e(j, i2 - i5);
      }
      if ((i3 != 0) || (i4 != 0)) {
        s.b(j, i1);
      }
      c(paramMotionEvent);
      return;
      i2 = paramMotionEvent.getPointerCount();
      i1 = i3;
      while (i1 < i2)
      {
        i3 = paramMotionEvent.getPointerId(i1);
        if (d(i3))
        {
          f1 = paramMotionEvent.getX(i1);
          f2 = paramMotionEvent.getY(i1);
          float f3 = f1 - c[i3];
          float f4 = f2 - d[i3];
          b(f3, f4, i3);
          if (a == 1) {
            break;
          }
          View localView = b((int)f1, (int)f2);
          if ((a(localView, f3, f4)) && (b(localView, i3))) {
            break;
          }
        }
        i1 += 1;
      }
      c(paramMotionEvent);
      return;
    case 6: 
      i2 = paramMotionEvent.getPointerId(i4);
      if ((a == 1) && (i2 == k))
      {
        i3 = paramMotionEvent.getPointerCount();
        if (i1 >= i3) {
          break label842;
        }
        i4 = paramMotionEvent.getPointerId(i1);
        if (i4 == k) {
          break label797;
        }
        f1 = paramMotionEvent.getX(i1);
        f2 = paramMotionEvent.getY(i1);
        if ((b((int)f1, (int)f2) != j) || (!b(j, i4))) {
          break label797;
        }
      }
      break;
    }
    label797:
    label842:
    for (i1 = k;; i1 = -1)
    {
      if (i1 == -1) {
        c();
      }
      c(i2);
      return;
      i1 += 1;
      break;
      if (a == 1) {
        c();
      }
      a();
      return;
      if (a == 1) {
        a(0.0F, 0.0F);
      }
      a();
      return;
    }
  }
  
  public final boolean b()
  {
    boolean bool2 = false;
    if (a == 2)
    {
      boolean bool3 = r.a.computeScrollOffset();
      int i1 = r.a.getCurrX();
      int i2 = r.a.getCurrY();
      int i3 = i1 - j.getLeft();
      int i4 = i2 - j.getTop();
      if (i3 != 0) {
        w.f(j, i3);
      }
      if (i4 != 0) {
        w.e(j, i4);
      }
      if ((i3 != 0) || (i4 != 0)) {
        s.b(j, i1);
      }
      bool1 = bool3;
      if (bool3)
      {
        bool1 = bool3;
        if (i1 == r.a.getFinalX())
        {
          bool1 = bool3;
          if (i2 == r.a.getFinalY())
          {
            r.a.abortAnimation();
            bool1 = false;
          }
        }
      }
      if (!bool1) {
        u.post(w);
      }
    }
    boolean bool1 = bool2;
    if (a == 2) {
      bool1 = true;
    }
    return bool1;
  }
  
  public static abstract class a
  {
    public int a()
    {
      return 0;
    }
    
    public int a(View paramView)
    {
      return 0;
    }
    
    public void a(int paramInt) {}
    
    public void a(int paramInt1, int paramInt2) {}
    
    public void a(View paramView, float paramFloat1, float paramFloat2) {}
    
    public abstract boolean a(View paramView, int paramInt);
    
    public void b(View paramView, int paramInt) {}
    
    public int c(View paramView, int paramInt)
    {
      return 0;
    }
    
    public int d(View paramView, int paramInt)
    {
      return 0;
    }
    
    public void d() {}
    
    public void e(View paramView, int paramInt) {}
  }
}


/* Location:              android/support/v4/widget/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */