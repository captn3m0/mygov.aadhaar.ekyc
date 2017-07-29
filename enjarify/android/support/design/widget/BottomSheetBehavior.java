package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.support.design.a.c;
import android.support.design.a.i;
import android.support.v4.h.a;
import android.support.v4.h.n;
import android.support.v4.h.o;
import android.support.v4.h.v;
import android.support.v4.h.w;
import android.support.v4.widget.p;
import android.support.v4.widget.p.a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior
  extends CoordinatorLayout.a
{
  int a;
  int b;
  boolean c;
  int d;
  p e;
  int f;
  WeakReference g;
  WeakReference h;
  int i;
  boolean j;
  private float k;
  private int l;
  private boolean m;
  private int n;
  private boolean o;
  private boolean p;
  private int q;
  private boolean r;
  private VelocityTracker s;
  private int t;
  private final p.a u;
  
  public BottomSheetBehavior()
  {
    d = 4;
    BottomSheetBehavior.1 local1 = new android/support/design/widget/BottomSheetBehavior$1;
    local1.<init>(this);
    u = local1;
  }
  
  public BottomSheetBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int i2 = 4;
    float f1 = 5.6E-45F;
    d = i2;
    Object localObject = new android/support/design/widget/BottomSheetBehavior$1;
    ((BottomSheetBehavior.1)localObject).<init>(this);
    u = ((p.a)localObject);
    localObject = a.i.BottomSheetBehavior_Layout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int i3 = a.i.BottomSheetBehavior_Layout_behavior_peekHeight;
    TypedValue localTypedValue = ((TypedArray)localObject).peekValue(i3);
    if (localTypedValue != null)
    {
      int i6 = data;
      if (i6 == i1)
      {
        i3 = data;
        b(i3);
      }
    }
    for (;;)
    {
      i3 = a.i.BottomSheetBehavior_Layout_behavior_hideable;
      boolean bool1 = ((TypedArray)localObject).getBoolean(i3, false);
      c = bool1;
      int i4 = a.i.BottomSheetBehavior_Layout_behavior_skipCollapsed;
      boolean bool2 = ((TypedArray)localObject).getBoolean(i4, false);
      o = bool2;
      ((TypedArray)localObject).recycle();
      f1 = ViewConfiguration.get(paramContext).getScaledMaximumFlingVelocity();
      k = f1;
      return;
      int i5 = a.i.BottomSheetBehavior_Layout_behavior_peekHeight;
      i5 = ((TypedArray)localObject).getDimensionPixelSize(i5, i1);
      b(i5);
    }
  }
  
  private View b(View paramView)
  {
    boolean bool = paramView instanceof o;
    if (bool) {}
    for (;;)
    {
      return (View)paramView;
      bool = paramView instanceof ViewGroup;
      if (bool)
      {
        paramView = (ViewGroup)paramView;
        bool = false;
        View localView = null;
        int i2 = paramView.getChildCount();
        int i1;
        for (int i3 = 0;; i3 = i1)
        {
          if (i3 >= i2) {
            break label81;
          }
          localView = paramView.getChildAt(i3);
          localView = b(localView);
          if (localView != null)
          {
            paramView = localView;
            break;
          }
          i1 = i3 + 1;
        }
      }
      label81:
      paramView = null;
    }
  }
  
  private void b()
  {
    int i1 = -1;
    i = i1;
    VelocityTracker localVelocityTracker = s;
    if (localVelocityTracker != null)
    {
      s.recycle();
      i1 = 0;
      localVelocityTracker = null;
      s = null;
    }
  }
  
  private void b(int paramInt)
  {
    int i1 = 1;
    int i2 = 0;
    int i3 = -1;
    boolean bool;
    if (paramInt == i3)
    {
      bool = m;
      if (bool) {
        break label133;
      }
      m = i1;
    }
    for (;;)
    {
      if (i1 != 0)
      {
        i1 = d;
        i2 = 4;
        if (i1 == i2)
        {
          localObject = g;
          if (localObject != null)
          {
            localObject = (View)g.get();
            if (localObject != null) {
              ((View)localObject).requestLayout();
            }
          }
        }
      }
      return;
      bool = m;
      if (!bool)
      {
        int i4 = l;
        if (i4 == paramInt) {}
      }
      else
      {
        m = false;
        i2 = Math.max(0, paramInt);
        l = i2;
        i2 = f - paramInt;
        b = i2;
        continue;
      }
      label133:
      i1 = 0;
      Object localObject = null;
    }
  }
  
  final void a()
  {
    g.get();
  }
  
  final void a(int paramInt)
  {
    int i1 = d;
    if (i1 == paramInt) {}
    for (;;)
    {
      return;
      d = paramInt;
      WeakReference localWeakReference = g;
      localWeakReference.get();
    }
  }
  
  public final void a(CoordinatorLayout paramCoordinatorLayout, View paramView, Parcelable paramParcelable)
  {
    paramParcelable = (BottomSheetBehavior.a)paramParcelable;
    Parcelable localParcelable = e;
    super.a(paramCoordinatorLayout, paramView, localParcelable);
    int i1 = a;
    int i2 = 1;
    if (i1 != i2)
    {
      i1 = a;
      i2 = 2;
      if (i1 != i2) {}
    }
    else
    {
      i1 = 4;
    }
    for (d = i1;; d = i1)
    {
      return;
      i1 = a;
    }
  }
  
  public final void a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    int i1 = 4;
    int i3 = 3;
    int i4 = paramView1.getTop();
    int i7 = a;
    if (i4 == i7) {
      a(i3);
    }
    Object localObject;
    boolean bool2;
    do
    {
      do
      {
        return;
        localObject = h.get();
      } while (paramView2 != localObject);
      bool2 = r;
    } while (!bool2);
    int i5 = q;
    label75:
    int i2;
    if (i5 > 0)
    {
      i1 = a;
      localObject = e;
      i7 = paramView1.getLeft();
      boolean bool1 = ((p)localObject).a(paramView1, i7, i1);
      if (!bool1) {
        break label331;
      }
      i2 = 2;
      a(i2);
      BottomSheetBehavior.b localb = new android/support/design/widget/BottomSheetBehavior$b;
      localb.<init>(this, paramView1, i3);
      w.a(paramView1, localb);
    }
    for (;;)
    {
      i3 = 0;
      r = false;
      break;
      boolean bool3 = c;
      if (bool3)
      {
        localObject = s;
        float f1 = k;
        ((VelocityTracker)localObject).computeCurrentVelocity(1000, f1);
        localObject = s;
        i7 = i;
        float f2 = v.b((VelocityTracker)localObject, i7);
        bool3 = a(paramView1, f2);
        if (bool3)
        {
          i2 = f;
          i3 = 5;
          break label75;
        }
      }
      int i6 = q;
      if (i6 == 0)
      {
        i6 = paramView1.getTop();
        i7 = a;
        i7 = Math.abs(i6 - i7);
        int i8 = b;
        i6 = Math.abs(i6 - i8);
        if (i7 < i6)
        {
          i2 = a;
          break label75;
        }
        i3 = b;
        i9 = i2;
        i2 = i3;
        i3 = i9;
        break label75;
      }
      i3 = b;
      int i9 = i2;
      i2 = i3;
      i3 = i9;
      break label75;
      label331:
      a(i3);
    }
  }
  
  public final void a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt, int[] paramArrayOfInt)
  {
    int i1 = 1;
    View localView = (View)h.get();
    if (paramView2 != localView) {
      return;
    }
    int i2 = paramView1.getTop();
    int i3 = i2 - paramInt;
    if (paramInt > 0)
    {
      int i5 = a;
      if (i3 < i5)
      {
        i3 = a;
        i2 -= i3;
        paramArrayOfInt[i1] = i2;
        i2 = -paramArrayOfInt[i1];
        w.e(paramView1, i2);
        i2 = 3;
        a(i2);
      }
    }
    for (;;)
    {
      paramView1.getTop();
      a();
      q = paramInt;
      r = i1;
      break;
      paramArrayOfInt[i1] = paramInt;
      i2 = -paramInt;
      w.e(paramView1, i2);
      a(i1);
      continue;
      if (paramInt < 0)
      {
        boolean bool2 = w.b(paramView2, -1);
        if (!bool2)
        {
          int i6 = b;
          if (i3 > i6)
          {
            boolean bool1 = c;
            if (!bool1) {}
          }
          else
          {
            paramArrayOfInt[i1] = paramInt;
            i2 = -paramInt;
            w.e(paramView1, i2);
            a(i1);
            continue;
          }
          int i4 = b;
          i2 -= i4;
          paramArrayOfInt[i1] = i2;
          i2 = -paramArrayOfInt[i1];
          w.e(paramView1, i2);
          i2 = 4;
          a(i2);
        }
      }
    }
  }
  
  public final boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    int i1 = 1;
    boolean bool1 = w.x(paramCoordinatorLayout);
    if (bool1)
    {
      bool1 = w.x(paramView);
      if (!bool1) {
        w.a(paramView, i1);
      }
    }
    int i6 = paramView.getTop();
    paramCoordinatorLayout.a(paramView, paramInt);
    int i2 = paramCoordinatorLayout.getHeight();
    f = i2;
    boolean bool2 = m;
    int i3;
    Object localObject;
    int i7;
    if (bool2)
    {
      i3 = n;
      if (i3 == 0)
      {
        localObject = paramCoordinatorLayout.getResources();
        i7 = a.c.design_bottom_sheet_peek_height_min;
        i3 = ((Resources)localObject).getDimensionPixelSize(i7);
        n = i3;
      }
      i3 = n;
      i7 = f;
      int i10 = paramCoordinatorLayout.getWidth() * 9 / 16;
      i7 -= i10;
      i3 = Math.max(i3, i7);
      int i11 = f;
      int i12 = paramView.getHeight();
      i11 -= i12;
      i7 = Math.max(0, i11);
      a = i7;
      i3 = f - i3;
      i7 = a;
      i3 = Math.max(i3, i7);
      b = i3;
      i3 = d;
      i7 = 3;
      if (i3 != i7) {
        break label319;
      }
      i3 = a;
      w.e(paramView, i3);
    }
    for (;;)
    {
      localObject = e;
      if (localObject == null)
      {
        localObject = u;
        localObject = p.a(paramCoordinatorLayout, (p.a)localObject);
        e = ((p)localObject);
      }
      localObject = new java/lang/ref/WeakReference;
      ((WeakReference)localObject).<init>(paramView);
      g = ((WeakReference)localObject);
      localObject = new java/lang/ref/WeakReference;
      View localView = b(paramView);
      ((WeakReference)localObject).<init>(localView);
      h = ((WeakReference)localObject);
      return i1;
      i3 = l;
      break;
      label319:
      boolean bool3 = c;
      if (bool3)
      {
        i4 = d;
        i7 = 5;
        if (i4 == i7)
        {
          i4 = f;
          w.e(paramView, i4);
          continue;
        }
      }
      int i4 = d;
      int i8 = 4;
      if (i4 == i8)
      {
        i4 = b;
        w.e(paramView, i4);
      }
      else
      {
        i4 = d;
        int i5;
        if (i4 != i1)
        {
          i5 = d;
          int i9 = 2;
          if (i5 != i9) {}
        }
        else
        {
          i5 = paramView.getTop();
          i5 = i6 - i5;
          w.e(paramView, i5);
        }
      }
    }
  }
  
  public final boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    int i1 = -1;
    int i2 = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = false;
    boolean bool2 = paramView.isShown();
    if (!bool2) {
      p = i2;
    }
    for (;;)
    {
      return bool1;
      int i5 = n.a(paramMotionEvent);
      if (i5 == 0) {
        b();
      }
      Object localObject = s;
      if (localObject == null)
      {
        localObject = VelocityTracker.obtain();
        s = ((VelocityTracker)localObject);
      }
      localObject = s;
      ((VelocityTracker)localObject).addMovement(paramMotionEvent);
      switch (i5)
      {
      case 2: 
      default: 
      case 1: 
      case 3: 
        do
        {
          bool2 = p;
          if (bool2) {
            break label337;
          }
          localObject = e;
          bool2 = ((p)localObject).a(paramMotionEvent);
          if (!bool2) {
            break label337;
          }
          bool1 = i2;
          break;
          j = false;
          i = i1;
          bool2 = p;
        } while (!bool2);
        p = false;
        break;
      case 0: 
        int i7 = (int)paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        int i3 = (int)f2;
        t = i3;
        localObject = (View)h.get();
        if (localObject != null)
        {
          int i8 = t;
          boolean bool3 = paramCoordinatorLayout.a((View)localObject, i7, i8);
          if (bool3)
          {
            i4 = paramMotionEvent.getActionIndex();
            i4 = paramMotionEvent.getPointerId(i4);
            i = i4;
            j = i2;
          }
        }
        int i4 = i;
        boolean bool4;
        if (i4 == i1)
        {
          i4 = t;
          bool4 = paramCoordinatorLayout.a(paramView, i7, i4);
          if (!bool4) {
            bool4 = i2;
          }
        }
        for (f2 = f1;; f2 = 0.0F)
        {
          p = bool4;
          break;
          bool4 = false;
          localObject = null;
        }
        label337:
        localObject = (View)h.get();
        i7 = 2;
        float f3 = 2.8E-45F;
        if ((i5 == i7) && (localObject != null))
        {
          boolean bool5 = p;
          if (!bool5)
          {
            int i6 = d;
            if (i6 != i2)
            {
              float f4 = paramMotionEvent.getX();
              i6 = (int)f4;
              f3 = paramMotionEvent.getY();
              i7 = (int)f3;
              bool4 = paramCoordinatorLayout.a((View)localObject, i6, i7);
              if (!bool4)
              {
                f2 = t;
                f4 = paramMotionEvent.getY();
                f2 = Math.abs(f2 - f4);
                p localp = e;
                i6 = b;
                f4 = i6;
                bool4 = f2 < f4;
                if (bool4) {
                  bool1 = i2;
                }
              }
            }
          }
        }
        break;
      }
    }
  }
  
  public final boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, float paramFloat1, float paramFloat2)
  {
    Object localObject = h.get();
    boolean bool;
    if (paramView2 == localObject)
    {
      int i1 = d;
      int i2 = 3;
      if (i1 == i2)
      {
        bool = super.a(paramCoordinatorLayout, paramView1, paramView2, paramFloat1, paramFloat2);
        if (!bool) {}
      }
      else
      {
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
  
  public final boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt)
  {
    boolean bool = false;
    q = 0;
    r = false;
    int i1 = paramInt & 0x2;
    if (i1 != 0) {
      bool = true;
    }
    return bool;
  }
  
  final boolean a(View paramView, float paramFloat)
  {
    boolean bool1 = true;
    boolean bool2 = o;
    if (bool2) {}
    for (;;)
    {
      return bool1;
      int i1 = paramView.getTop();
      int i2 = b;
      if (i1 < i2)
      {
        bool1 = false;
      }
      else
      {
        float f1 = paramView.getTop();
        float f2 = 0.1F * paramFloat;
        f1 += f2;
        f2 = b;
        f1 = Math.abs(f1 - f2);
        f2 = l;
        f1 /= f2;
        i2 = 1056964608;
        f2 = 0.5F;
        boolean bool3 = f1 < f2;
        if (!bool3) {
          bool1 = false;
        }
      }
    }
  }
  
  public final Parcelable b(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    BottomSheetBehavior.a locala = new android/support/design/widget/BottomSheetBehavior$a;
    Parcelable localParcelable = super.b(paramCoordinatorLayout, paramView);
    int i1 = d;
    locala.<init>(localParcelable, i1);
    return locala;
  }
  
  public final boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    int i1 = 1;
    boolean bool2 = paramView.isShown();
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      int i2 = n.a(paramMotionEvent);
      int i3 = d;
      if ((i3 == i1) && (i2 == 0))
      {
        bool1 = i1;
      }
      else
      {
        Object localObject = e;
        ((p)localObject).b(paramMotionEvent);
        if (i2 == 0) {
          b();
        }
        localObject = s;
        if (localObject == null)
        {
          localObject = VelocityTracker.obtain();
          s = ((VelocityTracker)localObject);
        }
        localObject = s;
        ((VelocityTracker)localObject).addMovement(paramMotionEvent);
        i3 = 2;
        float f1 = 2.8E-45F;
        if (i2 == i3)
        {
          bool3 = p;
          if (!bool3)
          {
            float f2 = t;
            f1 = paramMotionEvent.getY();
            f2 = Math.abs(f2 - f1);
            localObject = e;
            i3 = b;
            f1 = i3;
            bool3 = f2 < f1;
            if (bool3)
            {
              p localp = e;
              i3 = paramMotionEvent.getActionIndex();
              i3 = paramMotionEvent.getPointerId(i3);
              localp.a(paramView, i3);
            }
          }
        }
        boolean bool3 = p;
        if (!bool3) {
          bool1 = i1;
        }
      }
    }
  }
}


/* Location:              android/support/design/widget/BottomSheetBehavior.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */