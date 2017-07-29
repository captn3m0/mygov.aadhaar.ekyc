package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.a.c;
import android.support.design.a.i;
import android.support.v4.f.b;
import android.support.v4.f.c;
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

public class BottomSheetBehavior<V extends View>
  extends CoordinatorLayout.a<V>
{
  int a;
  int b;
  boolean c;
  int d = 4;
  p e;
  int f;
  WeakReference<V> g;
  WeakReference<View> h;
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
  private final p.a u = new p.a()
  {
    public final int a()
    {
      if (c) {
        return f - a;
      }
      return b - a;
    }
    
    public final void a(int paramAnonymousInt)
    {
      if (paramAnonymousInt == 1) {
        BottomSheetBehavior.this.a(1);
      }
    }
    
    public final void a(View paramAnonymousView, float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      int j = 3;
      int i;
      if (paramAnonymousFloat2 < 0.0F) {
        i = a;
      }
      while (e.a(paramAnonymousView.getLeft(), i))
      {
        BottomSheetBehavior.this.a(2);
        w.a(paramAnonymousView, new BottomSheetBehavior.b(BottomSheetBehavior.this, paramAnonymousView, j));
        return;
        if ((c) && (a(paramAnonymousView, paramAnonymousFloat2)))
        {
          i = f;
          j = 5;
        }
        else if (paramAnonymousFloat2 == 0.0F)
        {
          i = paramAnonymousView.getTop();
          if (Math.abs(i - a) < Math.abs(i - b))
          {
            i = a;
          }
          else
          {
            i = b;
            j = 4;
          }
        }
        else
        {
          i = b;
          j = 4;
        }
      }
      BottomSheetBehavior.this.a(j);
    }
    
    public final boolean a(View paramAnonymousView, int paramAnonymousInt)
    {
      if (d == 1) {
        return false;
      }
      if (j) {
        return false;
      }
      if ((d == 3) && (i == paramAnonymousInt))
      {
        View localView = (View)h.get();
        if ((localView != null) && (w.b(localView, -1))) {
          return false;
        }
      }
      return (g != null) && (g.get() == paramAnonymousView);
    }
    
    public final void b(View paramAnonymousView, int paramAnonymousInt)
    {
      a();
    }
    
    public final int c(View paramAnonymousView, int paramAnonymousInt)
    {
      int j = a;
      if (c) {}
      for (int i = f;; i = b) {
        return k.a(paramAnonymousInt, j, i);
      }
    }
    
    public final int d(View paramAnonymousView, int paramAnonymousInt)
    {
      return paramAnonymousView.getLeft();
    }
  };
  
  public BottomSheetBehavior() {}
  
  public BottomSheetBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.BottomSheetBehavior_Layout);
    TypedValue localTypedValue = paramAttributeSet.peekValue(a.i.BottomSheetBehavior_Layout_behavior_peekHeight);
    if ((localTypedValue != null) && (data == -1)) {
      b(data);
    }
    for (;;)
    {
      c = paramAttributeSet.getBoolean(a.i.BottomSheetBehavior_Layout_behavior_hideable, false);
      o = paramAttributeSet.getBoolean(a.i.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
      paramAttributeSet.recycle();
      k = ViewConfiguration.get(paramContext).getScaledMaximumFlingVelocity();
      return;
      b(paramAttributeSet.getDimensionPixelSize(a.i.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
    }
  }
  
  private View b(View paramView)
  {
    if ((paramView instanceof o)) {
      return paramView;
    }
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      int i2 = paramView.getChildCount();
      int i1 = 0;
      while (i1 < i2)
      {
        View localView = b(paramView.getChildAt(i1));
        if (localView != null) {
          return localView;
        }
        i1 += 1;
      }
    }
    return null;
  }
  
  private void b()
  {
    i = -1;
    if (s != null)
    {
      s.recycle();
      s = null;
    }
  }
  
  private void b(int paramInt)
  {
    int i1 = 1;
    if (paramInt == -1)
    {
      if (m) {
        break label104;
      }
      m = true;
      paramInt = i1;
    }
    for (;;)
    {
      if ((paramInt != 0) && (d == 4) && (g != null))
      {
        View localView = (View)g.get();
        if (localView != null) {
          localView.requestLayout();
        }
      }
      return;
      if ((m) || (l != paramInt))
      {
        m = false;
        l = Math.max(0, paramInt);
        b = (f - paramInt);
        paramInt = i1;
      }
      else
      {
        label104:
        paramInt = 0;
      }
    }
  }
  
  final void a()
  {
    g.get();
  }
  
  final void a(int paramInt)
  {
    if (d == paramInt) {
      return;
    }
    d = paramInt;
    g.get();
  }
  
  public final void a(CoordinatorLayout paramCoordinatorLayout, V paramV, Parcelable paramParcelable)
  {
    paramParcelable = (a)paramParcelable;
    super.a(paramCoordinatorLayout, paramV, e);
    if ((a == 1) || (a == 2))
    {
      d = 4;
      return;
    }
    d = a;
  }
  
  public final void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView)
  {
    int i2 = 3;
    if (paramV.getTop() == a) {
      a(3);
    }
    while ((paramView != h.get()) || (!r)) {
      return;
    }
    int i1;
    if (q > 0)
    {
      i1 = a;
      if (!e.a(paramV, paramV.getLeft(), i1)) {
        break label215;
      }
      a(2);
      w.a(paramV, new b(paramV, i2));
    }
    for (;;)
    {
      r = false;
      return;
      if (c)
      {
        s.computeCurrentVelocity(1000, k);
        if (a(paramV, v.b(s, i)))
        {
          i1 = f;
          i2 = 5;
          break;
        }
      }
      if (q == 0)
      {
        i1 = paramV.getTop();
        if (Math.abs(i1 - a) < Math.abs(i1 - b))
        {
          i1 = a;
          break;
        }
        i1 = b;
        i2 = 4;
        break;
      }
      i1 = b;
      i2 = 4;
      break;
      label215:
      a(i2);
    }
  }
  
  public final void a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt, int[] paramArrayOfInt)
  {
    if (paramView != (View)h.get()) {
      return;
    }
    int i1 = paramV.getTop();
    int i2 = i1 - paramInt;
    if (paramInt > 0) {
      if (i2 < a)
      {
        paramArrayOfInt[1] = (i1 - a);
        w.e(paramV, -paramArrayOfInt[1]);
        a(3);
      }
    }
    for (;;)
    {
      paramV.getTop();
      a();
      q = paramInt;
      r = true;
      return;
      paramArrayOfInt[1] = paramInt;
      w.e(paramV, -paramInt);
      a(1);
      continue;
      if ((paramInt < 0) && (!w.b(paramView, -1))) {
        if ((i2 <= b) || (c))
        {
          paramArrayOfInt[1] = paramInt;
          w.e(paramV, -paramInt);
          a(1);
        }
        else
        {
          paramArrayOfInt[1] = (i1 - b);
          w.e(paramV, -paramArrayOfInt[1]);
          a(4);
        }
      }
    }
  }
  
  public final boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    if ((w.x(paramCoordinatorLayout)) && (!w.x(paramV))) {
      w.a(paramV, true);
    }
    int i1 = paramV.getTop();
    paramCoordinatorLayout.a(paramV, paramInt);
    f = paramCoordinatorLayout.getHeight();
    if (m)
    {
      if (n == 0) {
        n = paramCoordinatorLayout.getResources().getDimensionPixelSize(a.c.design_bottom_sheet_peek_height_min);
      }
      paramInt = Math.max(n, f - paramCoordinatorLayout.getWidth() * 9 / 16);
      a = Math.max(0, f - paramV.getHeight());
      b = Math.max(f - paramInt, a);
      if (d != 3) {
        break label197;
      }
      w.e(paramV, a);
    }
    for (;;)
    {
      if (e == null) {
        e = p.a(paramCoordinatorLayout, u);
      }
      g = new WeakReference(paramV);
      h = new WeakReference(b(paramV));
      return true;
      paramInt = l;
      break;
      label197:
      if ((c) && (d == 5)) {
        w.e(paramV, f);
      } else if (d == 4) {
        w.e(paramV, b);
      } else if ((d == 1) || (d == 2)) {
        w.e(paramV, i1 - paramV.getTop());
      }
    }
  }
  
  public final boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    if (!paramV.isShown()) {
      p = true;
    }
    int i1;
    do
    {
      return false;
      i1 = n.a(paramMotionEvent);
      if (i1 == 0) {
        b();
      }
      if (s == null) {
        s = VelocityTracker.obtain();
      }
      s.addMovement(paramMotionEvent);
      switch (i1)
      {
      }
      while ((!p) && (e.a(paramMotionEvent)))
      {
        return true;
        j = false;
        i = -1;
        if (p)
        {
          p = false;
          return false;
          int i2 = (int)paramMotionEvent.getX();
          t = ((int)paramMotionEvent.getY());
          View localView = (View)h.get();
          if ((localView != null) && (paramCoordinatorLayout.a(localView, i2, t)))
          {
            i = paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex());
            j = true;
          }
          if ((i == -1) && (!paramCoordinatorLayout.a(paramV, i2, t))) {}
          for (boolean bool = true;; bool = false)
          {
            p = bool;
            break;
          }
        }
      }
      paramV = (View)h.get();
    } while ((i1 != 2) || (paramV == null) || (p) || (d == 1) || (paramCoordinatorLayout.a(paramV, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) || (Math.abs(t - paramMotionEvent.getY()) <= e.b));
    return true;
  }
  
  public final boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, float paramFloat1, float paramFloat2)
  {
    return (paramView == h.get()) && ((d != 3) || (super.a(paramCoordinatorLayout, paramV, paramView, paramFloat1, paramFloat2)));
  }
  
  public final boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, View paramView, int paramInt)
  {
    boolean bool = false;
    q = 0;
    r = false;
    if ((paramInt & 0x2) != 0) {
      bool = true;
    }
    return bool;
  }
  
  final boolean a(View paramView, float paramFloat)
  {
    if (o) {}
    do
    {
      return true;
      if (paramView.getTop() < b) {
        return false;
      }
    } while (Math.abs(paramView.getTop() + 0.1F * paramFloat - b) / l > 0.5F);
    return false;
  }
  
  public final Parcelable b(CoordinatorLayout paramCoordinatorLayout, V paramV)
  {
    return new a(super.b(paramCoordinatorLayout, paramV), d);
  }
  
  public final boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    if (!paramV.isShown()) {}
    do
    {
      return false;
      int i1 = n.a(paramMotionEvent);
      if ((d == 1) && (i1 == 0)) {
        return true;
      }
      e.b(paramMotionEvent);
      if (i1 == 0) {
        b();
      }
      if (s == null) {
        s = VelocityTracker.obtain();
      }
      s.addMovement(paramMotionEvent);
      if ((i1 == 2) && (!p) && (Math.abs(t - paramMotionEvent.getY()) > e.b)) {
        e.a(paramV, paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex()));
      }
    } while (p);
    return true;
  }
  
  protected static final class a
    extends a
  {
    public static final Parcelable.Creator<a> CREATOR = b.a(new c() {});
    final int a;
    
    public a(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      a = paramParcel.readInt();
    }
    
    public a(Parcelable paramParcelable, int paramInt)
    {
      super();
      a = paramInt;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(a);
    }
  }
  
  private final class b
    implements Runnable
  {
    private final View b;
    private final int c;
    
    b(View paramView, int paramInt)
    {
      b = paramView;
      c = paramInt;
    }
    
    public final void run()
    {
      if ((e != null) && (e.b()))
      {
        w.a(b, this);
        return;
      }
      a(c);
    }
  }
}


/* Location:              android/support/design/widget/BottomSheetBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */