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
  private static final Interpolator v;
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
  private int k;
  private int[] l;
  private int[] m;
  private int[] n;
  private int o;
  private VelocityTracker p;
  private float q;
  private m r;
  private final p.a s;
  private boolean t;
  private final ViewGroup u;
  private final Runnable w;
  
  static
  {
    p.1 local1 = new android/support/v4/widget/p$1;
    local1.<init>();
    v = local1;
  }
  
  private p(Context paramContext, ViewGroup paramViewGroup, p.a parama)
  {
    int i1 = -1;
    float f1 = 0.0F / 0.0F;
    k = i1;
    Object localObject = new android/support/v4/widget/p$2;
    ((p.2)localObject).<init>(this);
    w = ((Runnable)localObject);
    if (paramViewGroup == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Parent view may not be null");
      throw ((Throwable)localObject);
    }
    if (parama == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Callback may not be null");
      throw ((Throwable)localObject);
    }
    u = paramViewGroup;
    s = parama;
    localObject = ViewConfiguration.get(paramContext);
    int i2 = (int)(getResourcesgetDisplayMetricsdensity * 20.0F + 0.5F);
    h = i2;
    i2 = ((ViewConfiguration)localObject).getScaledTouchSlop();
    b = i2;
    float f2 = ((ViewConfiguration)localObject).getScaledMaximumFlingVelocity();
    q = f2;
    f1 = ((ViewConfiguration)localObject).getScaledMinimumFlingVelocity();
    g = f1;
    localObject = v;
    localObject = m.a(paramContext, (Interpolator)localObject);
    r = ((m)localObject);
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool1 = false;
    float f1 = Math.abs(paramFloat1);
    boolean bool2 = f1 < paramFloat2;
    if (bool2) {
      paramFloat3 = 0.0F;
    }
    for (;;)
    {
      return paramFloat3;
      boolean bool3 = f1 < paramFloat3;
      if (bool3)
      {
        bool1 = paramFloat1 < 0.0F;
        if (!bool1) {
          paramFloat3 = -paramFloat3;
        }
      }
      else
      {
        paramFloat3 = paramFloat1;
      }
    }
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    float f1 = 1.0F;
    if (paramInt1 == 0)
    {
      i1 = 0;
      f2 = 0.0F;
      localViewGroup = null;
      return i1;
    }
    ViewGroup localViewGroup = u;
    int i1 = localViewGroup.getWidth();
    int i2 = i1 / 2;
    int i3 = Math.abs(paramInt1);
    float f3 = i3;
    float f2 = i1;
    f2 = f3 / f2;
    f2 = Math.min(f1, f2);
    f3 = i2;
    float f4 = i2;
    float f5 = 0.5F;
    double d1 = f2 - f5;
    double d2 = 0.4712389167638204D;
    d1 = Math.sin((float)(d1 * d2));
    f2 = (float)d1 * f4 + f3;
    i2 = Math.abs(paramInt2);
    if (i2 > 0)
    {
      i3 = 1148846080;
      f3 = 1000.0F;
      f4 = i2;
      f2 = Math.abs(f2 / f4) * f3;
    }
    for (i1 = Math.round(f2) * 4;; i1 = (int)f2)
    {
      i2 = 600;
      f4 = 8.41E-43F;
      i1 = Math.min(i1, i2);
      break;
      f2 = Math.abs(paramInt1);
      f4 = paramInt3;
      f2 = f2 / f4 + f1;
      i2 = 1132462080;
      f4 = 256.0F;
      f2 *= f4;
    }
  }
  
  public static p a(ViewGroup paramViewGroup, float paramFloat, p.a parama)
  {
    p localp = a(paramViewGroup, parama);
    float f1 = b;
    float f2 = 1.0F / paramFloat;
    int i1 = (int)(f1 * f2);
    b = i1;
    return localp;
  }
  
  public static p a(ViewGroup paramViewGroup, p.a parama)
  {
    p localp = new android/support/v4/widget/p;
    Context localContext = paramViewGroup.getContext();
    localp.<init>(localContext, paramViewGroup, parama);
    return localp;
  }
  
  private void a(float paramFloat1, float paramFloat2)
  {
    int i1 = 1;
    t = i1;
    p.a locala = s;
    View localView = j;
    locala.a(localView, paramFloat1, paramFloat2);
    t = false;
    int i2 = a;
    if (i2 == i1) {
      b(0);
    }
  }
  
  private void a(float paramFloat1, float paramFloat2, int paramInt)
  {
    int i1 = 1;
    int i2 = 0;
    Object localObject1 = c;
    int i3;
    if (localObject1 != null)
    {
      localObject1 = c;
      i3 = localObject1.length;
      if (i3 > paramInt) {}
    }
    else
    {
      i3 = paramInt + 1;
      localObject1 = new float[i3];
      i4 = paramInt + 1;
      localObject2 = new float[i4];
      i5 = paramInt + 1;
      float[] arrayOfFloat = new float[i5];
      i6 = paramInt + 1;
      localObject3 = new float[i6];
      i7 = paramInt + 1;
      int[] arrayOfInt1 = new int[i7];
      int i8 = paramInt + 1;
      int[] arrayOfInt2 = new int[i8];
      int i9 = paramInt + 1;
      int[] arrayOfInt3 = new int[i9];
      Object localObject4 = c;
      if (localObject4 != null)
      {
        localObject4 = c;
        int i10 = c.length;
        System.arraycopy(localObject4, 0, localObject1, 0, i10);
        localObject4 = d;
        i10 = d.length;
        System.arraycopy(localObject4, 0, localObject2, 0, i10);
        localObject4 = e;
        i10 = e.length;
        System.arraycopy(localObject4, 0, arrayOfFloat, 0, i10);
        localObject4 = f;
        i10 = f.length;
        System.arraycopy(localObject4, 0, localObject3, 0, i10);
        localObject4 = l;
        i10 = l.length;
        System.arraycopy(localObject4, 0, arrayOfInt1, 0, i10);
        localObject4 = m;
        i10 = m.length;
        System.arraycopy(localObject4, 0, arrayOfInt2, 0, i10);
        localObject4 = n;
        int[] arrayOfInt4 = n;
        i10 = arrayOfInt4.length;
        System.arraycopy(localObject4, 0, arrayOfInt3, 0, i10);
      }
      c = ((float[])localObject1);
      d = ((float[])localObject2);
      e = arrayOfFloat;
      f = ((float[])localObject3);
      l = arrayOfInt1;
      m = arrayOfInt2;
      n = arrayOfInt3;
    }
    localObject1 = c;
    e[paramInt] = paramFloat1;
    localObject1[paramInt] = paramFloat1;
    localObject1 = d;
    Object localObject2 = f;
    localObject2[paramInt] = paramFloat2;
    localObject1[paramInt] = paramFloat2;
    localObject1 = l;
    int i4 = (int)paramFloat1;
    int i5 = (int)paramFloat2;
    Object localObject3 = u;
    int i6 = ((ViewGroup)localObject3).getLeft();
    int i7 = h;
    i6 += i7;
    if (i4 < i6) {
      i2 = i1;
    }
    localObject3 = u;
    i6 = ((ViewGroup)localObject3).getTop();
    i7 = h;
    i6 += i7;
    if (i5 < i6) {
      i2 |= 0x4;
    }
    localObject3 = u;
    i6 = ((ViewGroup)localObject3).getRight();
    i7 = h;
    i6 -= i7;
    if (i4 > i6) {
      i2 |= 0x2;
    }
    localObject2 = u;
    i4 = ((ViewGroup)localObject2).getBottom();
    i6 = h;
    i4 -= i6;
    if (i5 > i4) {
      i2 |= 0x8;
    }
    localObject1[paramInt] = i2;
    i2 = o;
    i1 <<= paramInt;
    i2 |= i1;
    o = i2;
  }
  
  private boolean a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    float f1 = Math.abs(paramFloat1);
    float f2 = Math.abs(paramFloat2);
    int[] arrayOfInt1 = l;
    int i1 = arrayOfInt1[paramInt1] & paramInt2;
    if (i1 == paramInt2)
    {
      i1 = i & paramInt2;
      if (i1 != 0)
      {
        arrayOfInt1 = n;
        i1 = arrayOfInt1[paramInt1] & paramInt2;
        if (i1 != paramInt2)
        {
          arrayOfInt1 = m;
          i1 = arrayOfInt1[paramInt1] & paramInt2;
          if (i1 != paramInt2)
          {
            float f3 = b;
            boolean bool2 = f1 < f3;
            if (bool2) {
              break label140;
            }
            int i2 = b;
            f3 = i2;
            boolean bool3 = f2 < f3;
            if (bool3) {
              break label140;
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool1;
      label140:
      int[] arrayOfInt2 = m;
      int i3 = arrayOfInt2[paramInt1] & paramInt2;
      if (i3 == 0)
      {
        i3 = b;
        f2 = i3;
        boolean bool4 = f1 < f2;
        if (bool4) {
          bool1 = true;
        }
      }
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = j.getLeft();
    Object localObject = j;
    int i2 = ((View)localObject).getTop();
    int i3 = paramInt1 - i1;
    int i4 = paramInt2 - i2;
    if ((i3 == 0) && (i4 == 0))
    {
      r.a.abortAnimation();
      b(0);
      boolean bool = false;
      f1 = 0.0F;
      localObject = null;
      return bool;
    }
    View localView = j;
    int i5 = (int)g;
    int i6 = (int)q;
    int i7 = b(paramInt3, i5, i6);
    float f1 = g;
    i5 = (int)f1;
    float f2 = q;
    i6 = (int)f2;
    int i8 = b(paramInt4, i5, i6);
    i5 = Math.abs(i3);
    int i9 = Math.abs(i4);
    i6 = Math.abs(i7);
    int i10 = Math.abs(i8);
    int i11 = i6 + i10;
    int i12 = i5 + i9;
    label202:
    float f3;
    if (i7 != 0)
    {
      f1 = i6;
      f2 = i11;
      f1 /= f2;
      f2 = f1;
      if (i8 == 0) {
        break label364;
      }
      f1 = i10;
      f3 = i11;
    }
    for (f1 /= f3;; f1 /= f3)
    {
      p.a locala1 = s;
      int i13 = locala1.a(localView);
      i13 = a(i3, i7, i13);
      p.a locala2 = s;
      i7 = locala2.a();
      i7 = a(i4, i8, i7);
      float f4 = i13;
      f2 *= f4;
      f4 = i7;
      i6 = (int)(f1 * f4 + f2);
      localObject = r;
      ((m)localObject).a(i1, i2, i3, i4, i6);
      b(2);
      i5 = 1;
      f1 = Float.MIN_VALUE;
      break;
      f1 = i5;
      f2 = i12;
      f1 /= f2;
      f2 = f1;
      break label202;
      label364:
      f1 = i9;
      f3 = i12;
    }
  }
  
  private boolean a(View paramView, float paramFloat1, float paramFloat2)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = false;
    if (paramView == null) {}
    for (;;)
    {
      return bool1;
      p.a locala1 = s;
      int i2 = locala1.a(paramView);
      float f2;
      label44:
      p.a locala2;
      int i3;
      if (i2 > 0)
      {
        i2 = i1;
        f2 = f1;
        locala2 = s;
        i3 = locala2.a();
        if (i3 <= 0) {
          break label152;
        }
        i3 = i1;
      }
      boolean bool2;
      for (float f3 = f1;; f3 = 0.0F)
      {
        if ((i2 == 0) || (i3 == 0)) {
          break label164;
        }
        f2 = paramFloat1 * paramFloat1;
        f3 = paramFloat2 * paramFloat2;
        f2 += f3;
        i3 = b;
        int i4 = b;
        i3 *= i4;
        f3 = i3;
        bool2 = f2 < f3;
        if (!bool2) {
          break;
        }
        bool1 = i1;
        break;
        bool2 = false;
        locala1 = null;
        f2 = 0.0F;
        break label44;
        label152:
        i3 = 0;
        locala2 = null;
      }
      label164:
      if (bool2)
      {
        f2 = Math.abs(paramFloat1);
        i3 = b;
        f3 = i3;
        bool2 = f2 < f3;
        if (bool2) {
          bool1 = i1;
        }
      }
      else if (i3 != 0)
      {
        f2 = Math.abs(paramFloat2);
        i3 = b;
        f3 = i3;
        bool2 = f2 < f3;
        if (bool2) {
          bool1 = i1;
        }
      }
    }
  }
  
  private static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = Math.abs(paramInt1);
    if (i1 < paramInt2) {
      paramInt3 = 0;
    }
    for (;;)
    {
      return paramInt3;
      if (i1 > paramInt3)
      {
        if (paramInt1 <= 0) {
          paramInt3 = -paramInt3;
        }
      }
      else {
        paramInt3 = paramInt1;
      }
    }
  }
  
  private void b(float paramFloat1, float paramFloat2, int paramInt)
  {
    int i1 = 1;
    boolean bool1 = false;
    Object localObject = null;
    boolean bool2 = a(paramFloat1, paramFloat2, paramInt, i1);
    if (bool2) {}
    for (;;)
    {
      bool1 = a(paramFloat2, paramFloat1, paramInt, 4);
      if (bool1) {
        i1 |= 0x4;
      }
      bool1 = a(paramFloat1, paramFloat2, paramInt, 2);
      if (bool1) {
        i1 |= 0x2;
      }
      bool1 = a(paramFloat2, paramFloat1, paramInt, 8);
      if (bool1) {
        i1 |= 0x8;
      }
      if (i1 != 0)
      {
        localObject = m;
        int i2 = localObject[paramInt] | i1;
        localObject[paramInt] = i2;
        localObject = s;
        ((p.a)localObject).a(i1, paramInt);
      }
      return;
      i1 = 0;
    }
  }
  
  private boolean b(View paramView, int paramInt)
  {
    boolean bool1 = true;
    Object localObject = j;
    if (paramView == localObject)
    {
      int i1 = k;
      if (i1 != paramInt) {}
    }
    for (;;)
    {
      return bool1;
      if (paramView != null)
      {
        localObject = s;
        boolean bool2 = ((p.a)localObject).a(paramView, paramInt);
        if (bool2)
        {
          k = paramInt;
          a(paramView, paramInt);
          continue;
        }
      }
      bool1 = false;
    }
  }
  
  private void c()
  {
    VelocityTracker localVelocityTracker1 = p;
    float f1 = q;
    localVelocityTracker1.computeCurrentVelocity(1000, f1);
    localVelocityTracker1 = p;
    int i1 = k;
    float f2 = v.a(localVelocityTracker1, i1);
    float f3 = g;
    f1 = q;
    f2 = a(f2, f3, f1);
    VelocityTracker localVelocityTracker2 = p;
    int i2 = k;
    f3 = v.b(localVelocityTracker2, i2);
    f1 = g;
    float f4 = q;
    f3 = a(f3, f1, f4);
    a(f2, f3);
  }
  
  private void c(int paramInt)
  {
    int i1 = 0;
    Object localObject = c;
    if (localObject != null)
    {
      boolean bool = a(paramInt);
      if (bool) {
        break label24;
      }
    }
    for (;;)
    {
      return;
      label24:
      c[paramInt] = 0.0F;
      d[paramInt] = 0.0F;
      e[paramInt] = 0.0F;
      f[paramInt] = 0.0F;
      l[paramInt] = 0;
      m[paramInt] = 0;
      localObject = n;
      localObject[paramInt] = 0;
      int i2 = o;
      i1 = 1 << paramInt ^ 0xFFFFFFFF;
      i2 &= i1;
      o = i2;
    }
  }
  
  private void c(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getPointerCount();
    int i2 = 0;
    while (i2 < i1)
    {
      int i3 = paramMotionEvent.getPointerId(i2);
      boolean bool = d(i3);
      if (bool)
      {
        float f1 = paramMotionEvent.getX(i2);
        float f2 = paramMotionEvent.getY(i2);
        float[] arrayOfFloat1 = e;
        arrayOfFloat1[i3] = f1;
        float[] arrayOfFloat2 = f;
        arrayOfFloat2[i3] = f2;
      }
      i2 += 1;
    }
  }
  
  private boolean d(int paramInt)
  {
    boolean bool = a(paramInt);
    if (!bool)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("Ignoring pointerId=");
      localObject = ((StringBuilder)localObject).append(paramInt);
      String str = " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.";
      localObject = str;
      Log.e("ViewDragHelper", (String)localObject);
    }
    for (bool = false;; bool = true) {
      return bool;
    }
  }
  
  public final void a()
  {
    int i1 = -1;
    k = i1;
    Object localObject = c;
    if (localObject != null)
    {
      Arrays.fill(c, 0.0F);
      Arrays.fill(d, 0.0F);
      Arrays.fill(e, 0.0F);
      Arrays.fill(f, 0.0F);
      Arrays.fill(l, 0);
      Arrays.fill(m, 0);
      localObject = n;
      Arrays.fill((int[])localObject, 0);
      o = 0;
    }
    localObject = p;
    if (localObject != null)
    {
      p.recycle();
      i1 = 0;
      localObject = null;
      p = null;
    }
  }
  
  public final void a(View paramView, int paramInt)
  {
    Object localObject1 = paramView.getParent();
    Object localObject2 = u;
    if (localObject1 != localObject2)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
      ViewGroup localViewGroup = u;
      localObject2 = localViewGroup + ")";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    j = paramView;
    k = paramInt;
    s.e(paramView, paramInt);
    b(1);
  }
  
  public final boolean a(int paramInt)
  {
    int i1 = 1;
    int i2 = o;
    int i3 = i1 << paramInt;
    i2 &= i3;
    if (i2 != 0) {}
    for (;;)
    {
      return i1;
      i1 = 0;
    }
  }
  
  public final boolean a(int paramInt1, int paramInt2)
  {
    boolean bool = t;
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
      throw ((Throwable)localObject);
    }
    Object localObject = p;
    int i2 = k;
    int i1 = (int)v.a((VelocityTracker)localObject, i2);
    VelocityTracker localVelocityTracker = p;
    int i3 = k;
    i2 = (int)v.b(localVelocityTracker, i3);
    return a(paramInt1, paramInt2, i1, i2);
  }
  
  public final boolean a(MotionEvent paramMotionEvent)
  {
    int i1 = n.a(paramMotionEvent);
    int i5 = n.b(paramMotionEvent);
    if (i1 == 0) {
      a();
    }
    Object localObject1 = p;
    if (localObject1 == null)
    {
      localObject1 = VelocityTracker.obtain();
      p = ((VelocityTracker)localObject1);
    }
    localObject1 = p;
    ((VelocityTracker)localObject1).addMovement(paramMotionEvent);
    float f1;
    float f2;
    switch (i1)
    {
    case 4: 
    default: 
      i1 = a;
      i5 = 1;
      f1 = Float.MIN_VALUE;
      if (i1 == i5)
      {
        i1 = 1;
        f2 = Float.MIN_VALUE;
      }
      break;
    }
    for (;;)
    {
      return i1;
      f2 = paramMotionEvent.getX();
      f1 = paramMotionEvent.getY();
      float f3 = 0.0F;
      localObject1 = null;
      int i7 = paramMotionEvent.getPointerId(0);
      a(f2, f1, i7);
      int i2 = (int)f2;
      int i6 = (int)f1;
      Object localObject2 = b(i2, i6);
      Object localObject3 = j;
      if (localObject2 == localObject3)
      {
        i6 = a;
        i8 = 2;
        if (i6 == i8) {
          b((View)localObject2, i7);
        }
      }
      localObject2 = l;
      i2 = localObject2[i7];
      i6 = i;
      i2 &= i6;
      if (i2 == 0) {
        break;
      }
      localObject2 = s;
      ((p.a)localObject2).d();
      break;
      i2 = paramMotionEvent.getPointerId(i6);
      f3 = paramMotionEvent.getX(i6);
      f1 = paramMotionEvent.getY(i6);
      a(f3, f1, i2);
      int i8 = a;
      if (i8 == 0)
      {
        localObject3 = l;
        i2 = localObject3[i2];
        i6 = i;
        i2 &= i6;
        if (i2 == 0) {
          break;
        }
        localObject2 = s;
        ((p.a)localObject2).d();
        break;
      }
      i8 = a;
      int i9 = 2;
      float f4 = 2.8E-45F;
      if (i8 != i9) {
        break;
      }
      i7 = (int)f3;
      i6 = (int)f1;
      localObject3 = b(i7, i6);
      localObject1 = j;
      if (localObject3 != localObject1) {
        break;
      }
      b((View)localObject3, i2);
      break;
      localObject2 = c;
      if (localObject2 == null) {
        break;
      }
      localObject2 = d;
      if (localObject2 == null) {
        break;
      }
      i7 = paramMotionEvent.getPointerCount();
      i2 = 0;
      f2 = 0.0F;
      localObject2 = null;
      i6 = 0;
      localObject3 = null;
      f1 = 0.0F;
      if (i6 < i7)
      {
        i8 = paramMotionEvent.getPointerId(i6);
        boolean bool1 = d(i8);
        float f5;
        float f6;
        View localView;
        boolean bool2;
        if (bool1)
        {
          f2 = paramMotionEvent.getX(i6);
          f4 = paramMotionEvent.getY(i6);
          float[] arrayOfFloat1 = c;
          f5 = arrayOfFloat1[i8];
          f5 = f2 - f5;
          float[] arrayOfFloat2 = d;
          f6 = arrayOfFloat2[i8];
          f6 = f4 - f6;
          int i3 = (int)f2;
          i9 = (int)f4;
          localView = b(i3, i9);
          if (localView == null) {
            break label734;
          }
          bool2 = a(localView, f5, f6);
          if (!bool2) {
            break label734;
          }
          bool2 = true;
          f2 = Float.MIN_VALUE;
        }
        for (;;)
        {
          if (bool2)
          {
            int i10 = localView.getLeft();
            int i11 = (int)f5 + i10;
            p.a locala1 = s;
            i11 = locala1.d(localView, i11);
            int i12 = localView.getTop();
            int i13 = (int)f6 + i12;
            i13 = s.c(localView, i13);
            p.a locala2 = s;
            int i14 = locala2.a(localView);
            p.a locala3 = s;
            int i15 = locala3.a();
            if (((i14 == 0) || ((i14 > 0) && (i11 == i10))) && ((i15 == 0) || ((i15 > 0) && (i13 == i12)))) {
              break label745;
            }
          }
          b(f5, f6, i8);
          int i16 = a;
          int i17 = 1;
          f6 = Float.MIN_VALUE;
          if (i16 == i17) {
            break label745;
          }
          if (bool2)
          {
            bool2 = b(localView, i8);
            if (bool2) {
              break label745;
            }
          }
          i4 = i6 + 1;
          i6 = i4;
          break;
          label734:
          i4 = 0;
          f2 = 0.0F;
          localObject2 = null;
        }
      }
      label745:
      c(paramMotionEvent);
      break;
      int i4 = paramMotionEvent.getPointerId(i6);
      c(i4);
      break;
      a();
      break;
      i4 = 0;
      f2 = 0.0F;
      localObject2 = null;
    }
  }
  
  public final boolean a(View paramView, int paramInt1, int paramInt2)
  {
    int i1 = 0;
    View localView = null;
    j = paramView;
    k = -1;
    boolean bool = a(paramInt1, paramInt2, 0, 0);
    if (!bool)
    {
      i1 = a;
      if (i1 == 0)
      {
        localView = j;
        if (localView != null)
        {
          i1 = 0;
          localView = null;
          j = null;
        }
      }
    }
    return bool;
  }
  
  public final View b(int paramInt1, int paramInt2)
  {
    Object localObject = u;
    int i1 = ((ViewGroup)localObject).getChildCount() + -1;
    int i2 = i1;
    if (i2 >= 0)
    {
      localObject = u.getChildAt(i2);
      int i3 = ((View)localObject).getLeft();
      if (paramInt1 >= i3)
      {
        i3 = ((View)localObject).getRight();
        if (paramInt1 < i3)
        {
          i3 = ((View)localObject).getTop();
          if (paramInt2 >= i3)
          {
            i3 = ((View)localObject).getBottom();
            if (paramInt2 >= i3) {}
          }
        }
      }
    }
    for (;;)
    {
      return (View)localObject;
      i1 = i2 + -1;
      i2 = i1;
      break;
      i1 = 0;
      localObject = null;
    }
  }
  
  final void b(int paramInt)
  {
    Object localObject = u;
    Runnable localRunnable = w;
    ((ViewGroup)localObject).removeCallbacks(localRunnable);
    int i1 = a;
    if (i1 != paramInt)
    {
      a = paramInt;
      localObject = s;
      ((p.a)localObject).a(paramInt);
      i1 = a;
      if (i1 == 0)
      {
        i1 = 0;
        localObject = null;
        j = null;
      }
    }
  }
  
  public final void b(MotionEvent paramMotionEvent)
  {
    int i1 = -1;
    float f1 = 0.0F / 0.0F;
    int i2 = 0;
    float f2 = 0.0F;
    Object localObject1 = null;
    int i3 = 0;
    float f3 = 0.0F;
    Object localObject2 = null;
    int i5 = 1;
    float f4 = Float.MIN_VALUE;
    int i6 = n.a(paramMotionEvent);
    int i8 = n.b(paramMotionEvent);
    if (i6 == 0) {
      a();
    }
    Object localObject3 = p;
    if (localObject3 == null)
    {
      localObject3 = VelocityTracker.obtain();
      p = ((VelocityTracker)localObject3);
    }
    localObject3 = p;
    ((VelocityTracker)localObject3).addMovement(paramMotionEvent);
    int i4;
    float f7;
    int i9;
    int i7;
    switch (i6)
    {
    case 4: 
    default: 
    case 0: 
    case 5: 
    case 2: 
      for (;;)
      {
        return;
        f1 = paramMotionEvent.getX();
        f4 = paramMotionEvent.getY();
        i3 = paramMotionEvent.getPointerId(0);
        i6 = (int)f1;
        i8 = (int)f4;
        View localView = b(i6, i8);
        a(f1, f4, i3);
        b(localView, i3);
        Object localObject4 = l;
        i3 = localObject4[i3];
        i1 = i;
        i3 &= i1;
        if (i3 != 0)
        {
          localObject2 = s;
          ((p.a)localObject2).d();
          continue;
          i1 = paramMotionEvent.getPointerId(i8);
          float f5 = paramMotionEvent.getX(i8);
          float f6 = paramMotionEvent.getY(i8);
          a(f5, f6, i1);
          int i10 = a;
          if (i10 == 0)
          {
            i3 = (int)f5;
            i5 = (int)f6;
            localObject2 = b(i3, i5);
            b((View)localObject2, i1);
            localObject2 = l;
            i3 = localObject2[i1];
            i1 = i;
            i3 &= i1;
            if (i3 != 0)
            {
              localObject2 = s;
              ((p.a)localObject2).d();
            }
          }
          else
          {
            i6 = (int)f5;
            i8 = (int)f6;
            localObject3 = j;
            if (localObject3 != null)
            {
              i2 = ((View)localObject3).getLeft();
              if (i6 >= i2)
              {
                i2 = ((View)localObject3).getRight();
                if (i6 < i2)
                {
                  i6 = ((View)localObject3).getTop();
                  if (i8 >= i6)
                  {
                    i6 = ((View)localObject3).getBottom();
                    if (i8 < i6)
                    {
                      i3 = i5;
                      f3 = f4;
                    }
                  }
                }
              }
            }
            if (i3 != 0)
            {
              localObject2 = j;
              b((View)localObject2, i1);
              continue;
              i1 = a;
              Object localObject6;
              Object localObject7;
              if (i1 == i5)
              {
                i3 = k;
                boolean bool1 = d(i3);
                if (bool1)
                {
                  i4 = k;
                  i4 = paramMotionEvent.findPointerIndex(i4);
                  f1 = paramMotionEvent.getX(i4);
                  f3 = paramMotionEvent.getY(i4);
                  Object localObject5 = e;
                  i6 = k;
                  f4 = localObject5[i6];
                  f1 -= f4;
                  i1 = (int)f1;
                  localObject5 = f;
                  i6 = k;
                  f4 = localObject5[i6];
                  f3 -= f4;
                  i5 = (int)f3;
                  localObject2 = j;
                  i4 = ((View)localObject2).getLeft() + i1;
                  localView = j;
                  i6 = localView.getTop() + i5;
                  localObject6 = j;
                  i8 = ((View)localObject6).getLeft();
                  localObject3 = j;
                  i10 = ((View)localObject3).getTop();
                  if (i1 != 0)
                  {
                    localObject1 = s;
                    localObject7 = j;
                    i4 = ((p.a)localObject1).d((View)localObject7, i4);
                    localObject1 = j;
                    i8 = i4 - i8;
                    w.f((View)localObject1, i8);
                  }
                  if (i5 != 0)
                  {
                    localObject6 = s;
                    localObject1 = j;
                    i6 = ((p.a)localObject6).c((View)localObject1, i6);
                    localObject6 = j;
                    i6 -= i10;
                    w.e((View)localObject6, i6);
                  }
                  if ((i1 != 0) || (i5 != 0))
                  {
                    localObject4 = s;
                    localObject5 = j;
                    ((p.a)localObject4).b((View)localObject5, i4);
                  }
                  c(paramMotionEvent);
                }
              }
              else
              {
                i1 = paramMotionEvent.getPointerCount();
                while (i4 < i1)
                {
                  i6 = paramMotionEvent.getPointerId(i4);
                  boolean bool3 = d(i6);
                  if (bool3)
                  {
                    f6 = paramMotionEvent.getX(i4);
                    f7 = paramMotionEvent.getY(i4);
                    localObject1 = c;
                    f2 = localObject1[i6];
                    f2 = f6 - f2;
                    localObject7 = d;
                    float f8 = localObject7[i6];
                    f8 = f7 - f8;
                    b(f2, f8, i6);
                    int i12 = a;
                    if (i12 == i5) {
                      break;
                    }
                    i9 = (int)f6;
                    i10 = (int)f7;
                    localObject6 = b(i9, i10);
                    boolean bool5 = a((View)localObject6, f2, f8);
                    if (bool5)
                    {
                      boolean bool2 = b((View)localObject6, i6);
                      if (bool2) {
                        break;
                      }
                    }
                  }
                  i4 += 1;
                }
                c(paramMotionEvent);
              }
            }
          }
        }
      }
    case 6: 
      i7 = paramMotionEvent.getPointerId(i9);
      i9 = a;
      if (i9 == i5)
      {
        i5 = k;
        if (i7 == i5)
        {
          i5 = paramMotionEvent.getPointerCount();
          label978:
          if (i4 >= i5) {
            break label1160;
          }
          i9 = paramMotionEvent.getPointerId(i4);
          int i11 = k;
          if (i9 == i11) {
            break label1101;
          }
          f7 = paramMotionEvent.getX(i4);
          f2 = paramMotionEvent.getY(i4);
          i11 = (int)f7;
          i2 = (int)f2;
          localObject3 = b(i11, i2);
          localObject1 = j;
          if (localObject3 != localObject1) {
            break label1101;
          }
          localObject3 = j;
          boolean bool4 = b((View)localObject3, i9);
          if (!bool4) {
            break label1101;
          }
          i4 = k;
        }
      }
      break;
    }
    for (;;)
    {
      if (i4 == i1) {
        c();
      }
      c(i7);
      break;
      label1101:
      i4 += 1;
      break label978;
      i4 = a;
      if (i4 == i5) {
        c();
      }
      a();
      break;
      i4 = a;
      if (i4 == i5) {
        a(0.0F, 0.0F);
      }
      a();
      break;
      label1160:
      i4 = i1;
      f3 = f1;
    }
  }
  
  public final boolean b()
  {
    int i1 = 2;
    boolean bool1 = false;
    int i2 = a;
    if (i2 == i1)
    {
      Object localObject1 = r.a;
      boolean bool2 = ((OverScroller)localObject1).computeScrollOffset();
      Object localObject2 = r.a;
      int i4 = ((OverScroller)localObject2).getCurrX();
      OverScroller localOverScroller = r.a;
      int i5 = localOverScroller.getCurrY();
      Object localObject3 = j;
      int i6 = ((View)localObject3).getLeft();
      i6 = i4 - i6;
      View localView1 = j;
      int i7 = localView1.getTop();
      i7 = i5 - i7;
      View localView2;
      if (i6 != 0)
      {
        localView2 = j;
        w.f(localView2, i6);
      }
      if (i7 != 0)
      {
        localView2 = j;
        w.e(localView2, i7);
      }
      if ((i6 != 0) || (i7 != 0))
      {
        localObject3 = s;
        localView1 = j;
        ((p.a)localObject3).b(localView1, i4);
      }
      if (bool2)
      {
        localObject3 = r.a;
        i6 = ((OverScroller)localObject3).getFinalX();
        if (i4 == i6)
        {
          localObject2 = r.a;
          i4 = ((OverScroller)localObject2).getFinalY();
          if (i5 == i4)
          {
            r.a.abortAnimation();
            bool2 = false;
            localObject1 = null;
          }
        }
      }
      if (!bool2)
      {
        localObject1 = u;
        localObject2 = w;
        ((ViewGroup)localObject1).post((Runnable)localObject2);
      }
    }
    int i3 = a;
    if (i3 == i1) {
      bool1 = true;
    }
    return bool1;
  }
}


/* Location:              android/support/v4/widget/p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */