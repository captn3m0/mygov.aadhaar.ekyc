package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.h.ab;
import android.support.v4.h.b;
import android.support.v4.h.f;
import android.support.v4.h.n;
import android.support.v4.h.w;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout
  extends ViewGroup
  implements g
{
  static final int[] a;
  static final boolean b;
  static final DrawerLayout.c j;
  private static final boolean k;
  private DrawerLayout.f A;
  private float B;
  private float C;
  private Drawable D;
  private Drawable E;
  private Drawable F;
  private Object G;
  private boolean H;
  private Drawable I;
  private Drawable J;
  private Drawable K;
  private Drawable L;
  private final ArrayList M;
  final p c;
  final p d;
  int e;
  boolean f;
  List g;
  CharSequence h;
  CharSequence i;
  private final DrawerLayout.b l;
  private float m;
  private int n;
  private int o;
  private float p;
  private Paint q;
  private final DrawerLayout.i r;
  private final DrawerLayout.i s;
  private boolean t;
  private boolean u;
  private int v;
  private int w;
  private int x;
  private int y;
  private boolean z;
  
  static
  {
    int i1 = 21;
    int i2 = 1;
    Object localObject = new int[i2];
    localObject[0] = 16842931;
    a = (int[])localObject;
    int i3 = Build.VERSION.SDK_INT;
    int i4 = 19;
    if (i3 >= i4)
    {
      i3 = i2;
      b = i3;
      i3 = Build.VERSION.SDK_INT;
      if (i3 < i1) {
        break label80;
      }
      label47:
      k = i2;
      i3 = Build.VERSION.SDK_INT;
      if (i3 < i1) {
        break label85;
      }
      localObject = new android/support/v4/widget/DrawerLayout$d;
      ((DrawerLayout.d)localObject).<init>();
    }
    for (j = (DrawerLayout.c)localObject;; j = (DrawerLayout.c)localObject)
    {
      return;
      i3 = 0;
      localObject = null;
      break;
      label80:
      i2 = 0;
      break label47;
      label85:
      localObject = new android/support/v4/widget/DrawerLayout$e;
      ((DrawerLayout.e)localObject).<init>();
    }
  }
  
  public DrawerLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = new android/support/v4/widget/DrawerLayout$b;
    ((DrawerLayout.b)localObject1).<init>(this);
    l = ((DrawerLayout.b)localObject1);
    o = -1728053248;
    localObject1 = new android/graphics/Paint;
    ((Paint)localObject1).<init>();
    q = ((Paint)localObject1);
    u = i1;
    v = i2;
    w = i2;
    x = i2;
    y = i2;
    I = null;
    J = null;
    K = null;
    L = null;
    int i3 = 262144;
    setDescendantFocusability(i3);
    localObject1 = getResources().getDisplayMetrics();
    float f2 = density;
    float f3 = 64.0F * f2;
    float f4 = 0.5F;
    int i4 = (int)(f3 + f4);
    n = i4;
    f3 = 400.0F * f2;
    Object localObject2 = new android/support/v4/widget/DrawerLayout$i;
    ((DrawerLayout.i)localObject2).<init>(this, i2);
    r = ((DrawerLayout.i)localObject2);
    localObject2 = new android/support/v4/widget/DrawerLayout$i;
    ((DrawerLayout.i)localObject2).<init>(this, 5);
    s = ((DrawerLayout.i)localObject2);
    localObject2 = r;
    localObject2 = p.a(this, f1, (p.a)localObject2);
    c = ((p)localObject2);
    c.i = i1;
    c.g = f3;
    localObject2 = r;
    p localp = c;
    b = localp;
    localObject2 = s;
    localObject2 = p.a(this, f1, (p.a)localObject2);
    d = ((p)localObject2);
    localObject2 = d;
    i2 = 2;
    i = i2;
    d.g = f3;
    Object localObject3 = s;
    localObject2 = d;
    b = ((p)localObject2);
    setFocusableInTouchMode(i1);
    w.c(this, i1);
    localObject3 = new android/support/v4/widget/DrawerLayout$a;
    ((DrawerLayout.a)localObject3).<init>(this);
    w.a(this, (b)localObject3);
    ab.a(this);
    boolean bool = w.x(this);
    if (bool)
    {
      j.a(this);
      localObject3 = j.a(paramContext);
      D = ((Drawable)localObject3);
    }
    f2 *= 10.0F;
    m = f2;
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    M = ((ArrayList)localObject1);
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int i1 = w.g(this);
    int i2 = f.a(paramInt2, i1);
    Object localObject;
    switch (paramInt2)
    {
    default: 
      if (paramInt1 != 0)
      {
        i1 = 3;
        if (i2 == i1)
        {
          localObject = c;
          label74:
          ((p)localObject).a();
        }
      }
      else
      {
        switch (paramInt1)
        {
        }
      }
      break;
    }
    for (;;)
    {
      return;
      v = paramInt1;
      break;
      w = paramInt1;
      break;
      x = paramInt1;
      break;
      y = paramInt1;
      break;
      localObject = d;
      break label74;
      localObject = b(i2);
      if (localObject != null)
      {
        e((View)localObject);
        continue;
        localObject = b(i2);
        if (localObject != null) {
          f((View)localObject);
        }
      }
    }
  }
  
  private void a(boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    boolean bool1 = false;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      localObject = (DrawerLayout.g)localView.getLayoutParams();
      boolean bool2 = d(localView);
      int i5;
      boolean bool4;
      if (bool2) {
        if (paramBoolean)
        {
          bool2 = c;
          if (!bool2) {}
        }
        else
        {
          int i3 = localView.getWidth();
          boolean bool3 = a(localView, 3);
          if (!bool3) {
            break label136;
          }
          p localp1 = c;
          i3 = -i3;
          i5 = localView.getTop();
          bool4 = localp1.a(localView, i3, i5);
          bool1 |= bool4;
        }
      }
      for (;;)
      {
        c = false;
        int i6 = i2 + 1;
        i2 = i6;
        break;
        label136:
        p localp2 = d;
        int i4 = getWidth();
        i5 = localView.getTop();
        bool4 = localp2.a(localView, i4, i5);
        bool1 |= bool4;
      }
    }
    r.b();
    Object localObject = s;
    ((DrawerLayout.i)localObject).b();
    if (bool1) {
      invalidate();
    }
  }
  
  private static boolean a(Drawable paramDrawable, int paramInt)
  {
    if (paramDrawable != null)
    {
      bool = android.support.v4.d.a.a.b(paramDrawable);
      if (bool) {
        break label17;
      }
    }
    for (boolean bool = false;; bool = true)
    {
      return bool;
      label17:
      android.support.v4.d.a.a.b(paramDrawable, paramInt);
    }
  }
  
  static float b(View paramView)
  {
    return getLayoutParamsb;
  }
  
  public static String c(int paramInt)
  {
    int i1 = paramInt & 0x3;
    int i2 = 3;
    String str;
    if (i1 == i2) {
      str = "LEFT";
    }
    for (;;)
    {
      return str;
      i1 = paramInt & 0x5;
      i2 = 5;
      if (i1 == i2) {
        str = "RIGHT";
      } else {
        str = Integer.toHexString(paramInt);
      }
    }
  }
  
  private View d()
  {
    int i1 = getChildCount();
    int i2 = 0;
    Object localObject = null;
    int i3 = 0;
    View localView;
    if (i3 < i1)
    {
      localView = getChildAt(i3);
      localObject = (DrawerLayout.g)localView.getLayoutParams();
      i2 = d & 0x1;
      int i4 = 1;
      if (i2 != i4) {}
    }
    for (localObject = localView;; localObject = null)
    {
      return (View)localObject;
      i2 = i3 + 1;
      i3 = i2;
      break;
      i2 = 0;
    }
  }
  
  static boolean d(View paramView)
  {
    int i1 = 1;
    DrawerLayout.g localg = (DrawerLayout.g)paramView.getLayoutParams();
    int i2 = a;
    int i4 = w.g(paramView);
    i2 = f.a(i2, i4);
    i4 = i2 & 0x3;
    if (i4 != 0) {
      i2 = i1;
    }
    for (;;)
    {
      return i2;
      int i3;
      i2 &= 0x5;
      if (i3 != 0)
      {
        i3 = i1;
      }
      else
      {
        i3 = 0;
        localg = null;
      }
    }
  }
  
  public static boolean g(View paramView)
  {
    boolean bool = d(paramView);
    if (!bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("View ");
      localObject2 = paramView + " is not a drawer";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = (DrawerLayout.g)paramView.getLayoutParams();
    float f1 = b;
    Object localObject2 = null;
    bool = f1 < 0.0F;
    if (bool)
    {
      bool = true;
      f1 = Float.MIN_VALUE;
    }
    for (;;)
    {
      return bool;
      bool = false;
      f1 = 0.0F;
      localObject1 = null;
    }
  }
  
  static boolean h(View paramView)
  {
    int i1 = w.d(paramView);
    int i3 = 4;
    if (i1 != i3)
    {
      i1 = w.d(paramView);
      int i4 = 2;
      if (i1 == i4) {}
    }
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  private static boolean i(View paramView)
  {
    DrawerLayout.g localg = (DrawerLayout.g)paramView.getLayoutParams();
    int i1 = a;
    if (i1 == 0) {
      i1 = 1;
    }
    for (;;)
    {
      return i1;
      int i2 = 0;
      localg = null;
    }
  }
  
  private static boolean j(View paramView)
  {
    int i1 = 1;
    boolean bool = d(paramView);
    if (!bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("View ");
      localObject2 = paramView + " is not a drawer";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = (DrawerLayout.g)paramView.getLayoutParams();
    int i2 = d & 0x1;
    if (i2 == i1) {
      i2 = i1;
    }
    for (;;)
    {
      return i2;
      int i3 = 0;
      localObject1 = null;
    }
  }
  
  public final int a(int paramInt)
  {
    int i1 = 3;
    int i2 = w.g(this);
    switch (paramInt)
    {
    }
    label54:
    label211:
    label234:
    for (;;)
    {
      i2 = 0;
      for (;;)
      {
        return i2;
        int i3 = v;
        if (i3 != i1)
        {
          i2 = v;
        }
        else
        {
          if (i2 == 0) {}
          for (i2 = x; i2 != i1; i2 = y) {
            break label54;
          }
          i3 = w;
          if (i3 != i1)
          {
            i2 = w;
          }
          else
          {
            if (i2 == 0) {}
            for (i2 = y; i2 != i1; i2 = x) {
              break label54;
            }
            i3 = x;
            if (i3 != i1)
            {
              i2 = x;
            }
            else
            {
              if (i2 == 0) {}
              for (i2 = v; i2 != i1; i2 = w) {
                break label54;
              }
              i3 = y;
              if (i3 == i1) {
                break label211;
              }
              i2 = y;
            }
          }
        }
      }
      if (i2 == 0) {}
      for (i2 = w;; i2 = v)
      {
        if (i2 == i1) {
          break label234;
        }
        break;
      }
    }
  }
  
  public final int a(View paramView)
  {
    boolean bool = d(paramView);
    if (!bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("View ");
      localObject = paramView + " is not a drawer";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    int i1 = getLayoutParamsa;
    return a(i1);
  }
  
  public final void a()
  {
    int i1 = 8388611;
    Object localObject1 = b(i1);
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("No drawer view found with gravity ");
      String str = c(i1);
      localObject2 = str;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    f((View)localObject1);
  }
  
  final void a(View paramView, float paramFloat)
  {
    Object localObject = (DrawerLayout.g)paramView.getLayoutParams();
    float f1 = b;
    int i1 = paramFloat < f1;
    if (i1 == 0) {}
    for (;;)
    {
      return;
      b = paramFloat;
      localObject = g;
      if (localObject != null)
      {
        localObject = g;
        int i2 = ((List)localObject).size() + -1;
        for (i1 = i2; i1 >= 0; i1 = i2)
        {
          localObject = (DrawerLayout.f)g.get(i1);
          ((DrawerLayout.f)localObject).a(paramFloat);
          i2 = i1 + -1;
        }
      }
    }
  }
  
  final void a(View paramView, boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      if (!paramBoolean)
      {
        i3 = d(localView);
        if (i3 == 0) {}
      }
      else
      {
        if ((!paramBoolean) || (localView != paramView)) {
          break label67;
        }
      }
      int i3 = 1;
      w.c(localView, i3);
      for (;;)
      {
        i2 += 1;
        break;
        label67:
        int i4 = 4;
        w.c(localView, i4);
      }
    }
  }
  
  public final void a(Object paramObject, boolean paramBoolean)
  {
    G = paramObject;
    H = paramBoolean;
    Drawable localDrawable;
    boolean bool;
    if (!paramBoolean)
    {
      localDrawable = getBackground();
      if (localDrawable == null) {
        bool = true;
      }
    }
    for (;;)
    {
      setWillNotDraw(bool);
      requestLayout();
      return;
      bool = false;
      localDrawable = null;
    }
  }
  
  final boolean a(View paramView, int paramInt)
  {
    int i1 = c(paramView) & paramInt;
    if (i1 == paramInt) {}
    for (i1 = 1;; i1 = 0) {
      return i1;
    }
  }
  
  public void addFocusables(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    int i1 = 0;
    int i2 = getDescendantFocusability();
    int i3 = 393216;
    if (i2 == i3) {}
    for (;;)
    {
      return;
      int i4 = getChildCount();
      i3 = 0;
      i2 = 0;
      Object localObject = null;
      if (i3 < i4)
      {
        View localView = getChildAt(i3);
        boolean bool = d(localView);
        if (bool)
        {
          bool = j(localView);
          if (bool)
          {
            i2 = 1;
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
          }
        }
        for (;;)
        {
          i3 += 1;
          break;
          ArrayList localArrayList = M;
          localArrayList.add(localView);
        }
      }
      if (i2 == 0)
      {
        localObject = M;
        i3 = ((ArrayList)localObject).size();
        while (i1 < i3)
        {
          localObject = (View)M.get(i1);
          i4 = ((View)localObject).getVisibility();
          if (i4 == 0) {
            ((View)localObject).addFocusables(paramArrayList, paramInt1, paramInt2);
          }
          i2 = i1 + 1;
          i1 = i2;
        }
      }
      localObject = M;
      ((ArrayList)localObject).clear();
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    Object localObject = d();
    if (localObject == null)
    {
      boolean bool = d(paramView);
      if (!bool) {}
    }
    else
    {
      int i1 = 4;
      w.c(paramView, i1);
    }
    for (;;)
    {
      int i2 = b;
      if (i2 == 0)
      {
        localObject = l;
        w.a(paramView, (b)localObject);
      }
      return;
      i2 = 1;
      w.c(paramView, i2);
    }
  }
  
  public final View b(int paramInt)
  {
    int i1 = w.g(this);
    int i2 = f.a(paramInt, i1) & 0x7;
    int i3 = getChildCount();
    i1 = 0;
    View localView = null;
    int i4 = 0;
    if (i4 < i3)
    {
      localView = getChildAt(i4);
      int i5 = c(localView) & 0x7;
      if (i5 != i2) {}
    }
    for (;;)
    {
      return localView;
      i1 = i4 + 1;
      i4 = i1;
      break;
      i1 = 0;
      localView = null;
    }
  }
  
  public final boolean b()
  {
    int i1 = 8388611;
    View localView = b(i1);
    boolean bool;
    if (localView != null) {
      bool = j(localView);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localView = null;
    }
  }
  
  final int c(View paramView)
  {
    int i1 = getLayoutParamsa;
    int i2 = w.g(this);
    return f.a(i1, i2);
  }
  
  final View c()
  {
    int i1 = getChildCount();
    int i2 = 0;
    View localView = null;
    int i3 = 0;
    if (i3 < i1)
    {
      localView = getChildAt(i3);
      boolean bool = d(localView);
      if (bool)
      {
        bool = g(localView);
        if (!bool) {}
      }
    }
    for (;;)
    {
      return localView;
      i2 = i3 + 1;
      i3 = i2;
      break;
      i2 = 0;
      localView = null;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof DrawerLayout.g;
    if (bool)
    {
      bool = super.checkLayoutParams((ViewGroup.LayoutParams)paramLayoutParams);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void computeScroll()
  {
    int i1 = getChildCount();
    int i2 = 0;
    float f1 = 0.0F;
    Object localObject = null;
    float f2 = 0.0F;
    int i3 = 0;
    p localp = null;
    while (i3 < i1)
    {
      localObject = (DrawerLayout.g)getChildAt(i3).getLayoutParams();
      f1 = b;
      f2 = Math.max(f2, f1);
      i2 = i3 + 1;
      i3 = i2;
    }
    p = f2;
    localObject = c;
    boolean bool1 = ((p)localObject).b();
    localp = d;
    boolean bool2 = localp.b();
    bool1 |= bool2;
    if (bool1) {
      w.c(this);
    }
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    int i1 = getHeight();
    boolean bool1 = i(paramView);
    int i3 = 0;
    float f1 = 0.0F;
    int i4 = getWidth();
    int i6 = paramCanvas.save();
    Object localObject1;
    int i13;
    Object localObject2;
    float f2;
    View localView;
    label121:
    int i10;
    if (bool1)
    {
      int i7 = getChildCount();
      int i8 = 0;
      localObject1 = null;
      i13 = 0;
      localObject2 = null;
      f2 = 0.0F;
      if (i13 < i7)
      {
        localView = getChildAt(i13);
        if (localView != paramView)
        {
          i8 = localView.getVisibility();
          if (i8 == 0)
          {
            localObject1 = localView.getBackground();
            if (localObject1 != null)
            {
              i8 = ((Drawable)localObject1).getOpacity();
              int i14 = -1;
              if (i8 == i14)
              {
                i8 = 1;
                if (i8 == 0) {
                  break label233;
                }
                boolean bool4 = d(localView);
                if (!bool4) {
                  break label233;
                }
                int i9 = localView.getHeight();
                if (i9 < i1) {
                  break label233;
                }
                boolean bool5 = a(localView, 3);
                if (!bool5) {
                  break label219;
                }
                i10 = localView.getRight();
                if (i10 <= i3) {
                  break label794;
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      i3 = i10;
      i10 = i4;
      for (;;)
      {
        i13 += 1;
        i4 = i10;
        break;
        i10 = 0;
        localObject1 = null;
        break label121;
        i10 = 0;
        localObject1 = null;
        break label121;
        label219:
        i10 = localView.getLeft();
        if (i10 >= i4) {
          label233:
          i10 = i4;
        }
      }
      i10 = 0;
      localObject1 = null;
      i13 = getHeight();
      paramCanvas.clipRect(i3, 0, i4, i13);
      i10 = i4;
      boolean bool3 = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restoreToCount(i6);
      float f3 = p;
      i13 = 0;
      f2 = 0.0F;
      localObject2 = null;
      boolean bool2 = f3 < 0.0F;
      int i5;
      p localp;
      float f4;
      if ((bool2) && (bool1))
      {
        f3 = (o & 0xFF000000) >>> 24;
        f2 = p;
        i5 = (int)(f3 * f2) << 24;
        i13 = o;
        i1 = 16777215;
        i13 &= i1;
        i5 |= i13;
        localObject2 = q;
        ((Paint)localObject2).setColor(i5);
        f1 = i3;
        i5 = 0;
        f3 = 0.0F;
        localp = null;
        f2 = i10;
        i10 = getHeight();
        f4 = i10;
        Paint localPaint = q;
        localObject1 = paramCanvas;
        paramCanvas.drawRect(f1, 0.0F, f2, f4, localPaint);
      }
      for (;;)
      {
        return bool3;
        localObject1 = E;
        int i2;
        if (localObject1 != null)
        {
          boolean bool6 = a(paramView, 3);
          if (bool6)
          {
            int i11 = E.getIntrinsicWidth();
            i3 = paramView.getRight();
            localp = c;
            i5 = h;
            i13 = 0;
            f2 = 0.0F;
            f4 = i3;
            f3 = i5;
            f3 = f4 / f3;
            f4 = 1.0F;
            f3 = Math.min(f3, f4);
            f3 = Math.max(0.0F, f3);
            localObject2 = E;
            i1 = paramView.getTop();
            i11 += i3;
            i2 = paramView.getBottom();
            ((Drawable)localObject2).setBounds(i3, i1, i11, i2);
            localObject1 = E;
            f1 = 255.0F * f3;
            i3 = (int)f1;
            ((Drawable)localObject1).setAlpha(i3);
            localObject1 = E;
            ((Drawable)localObject1).draw(paramCanvas);
            continue;
          }
        }
        localObject1 = F;
        if (localObject1 != null)
        {
          boolean bool7 = a(paramView, 5);
          if (bool7)
          {
            i12 = F.getIntrinsicWidth();
            i3 = paramView.getLeft();
            i5 = getWidth() - i3;
            i13 = d.h;
            f4 = 0.0F;
            f3 = i5;
            f2 = i13;
            f3 /= f2;
            i13 = 1065353216;
            f2 = 1.0F;
            f3 = Math.min(f3, f2);
            f3 = Math.max(0.0F, f3);
            localObject2 = F;
            i12 = i3 - i12;
            i1 = paramView.getTop();
            i2 = paramView.getBottom();
            ((Drawable)localObject2).setBounds(i12, i1, i3, i2);
            localObject1 = F;
            f1 = 255.0F * f3;
            i3 = (int)f1;
            ((Drawable)localObject1).setAlpha(i3);
            localObject1 = F;
            ((Drawable)localObject1).draw(paramCanvas);
          }
        }
      }
      label794:
      int i12 = i3;
    }
  }
  
  public final void e(View paramView)
  {
    int i1 = 1;
    boolean bool1 = d(paramView);
    Object localObject2;
    if (!bool1)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("View ");
      localObject2 = paramView + " is not a sliding drawer";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = (DrawerLayout.g)paramView.getLayoutParams();
    boolean bool2 = u;
    int i3;
    float f1;
    if (bool2)
    {
      i3 = 1065353216;
      f1 = 1.0F;
      b = f1;
      d = i1;
      a(paramView, i1);
    }
    for (;;)
    {
      invalidate();
      return;
      i3 = d | 0x2;
      d = i3;
      bool1 = a(paramView, 3);
      int i2;
      if (bool1)
      {
        localObject1 = c;
        i3 = 0;
        f1 = 0.0F;
        localObject2 = null;
        i2 = paramView.getTop();
        ((p)localObject1).a(paramView, 0, i2);
      }
      else
      {
        localObject1 = d;
        i3 = getWidth();
        i2 = paramView.getWidth();
        i3 -= i2;
        i2 = paramView.getTop();
        ((p)localObject1).a(paramView, i3, i2);
      }
    }
  }
  
  public final void f(View paramView)
  {
    boolean bool1 = d(paramView);
    Object localObject2;
    if (!bool1)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("View ");
      localObject2 = paramView + " is not a sliding drawer";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = (DrawerLayout.g)paramView.getLayoutParams();
    boolean bool2 = u;
    if (bool2)
    {
      b = 0.0F;
      bool2 = false;
      localObject2 = null;
      d = 0;
    }
    for (;;)
    {
      invalidate();
      return;
      int i1 = d | 0x4;
      d = i1;
      bool1 = a(paramView, 3);
      int i2;
      if (bool1)
      {
        localObject1 = c;
        i1 = -paramView.getWidth();
        i2 = paramView.getTop();
        ((p)localObject1).a(paramView, i1, i2);
      }
      else
      {
        localObject1 = d;
        i1 = getWidth();
        i2 = paramView.getTop();
        ((p)localObject1).a(paramView, i1, i2);
      }
    }
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    DrawerLayout.g localg = new android/support/v4/widget/DrawerLayout$g;
    localg.<init>();
    return localg;
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    DrawerLayout.g localg = new android/support/v4/widget/DrawerLayout$g;
    Context localContext = getContext();
    localg.<init>(localContext, paramAttributeSet);
    return localg;
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof DrawerLayout.g;
    DrawerLayout.g localg;
    if (bool)
    {
      localg = new android/support/v4/widget/DrawerLayout$g;
      paramLayoutParams = (DrawerLayout.g)paramLayoutParams;
      localg.<init>(paramLayoutParams);
    }
    for (;;)
    {
      return localg;
      bool = paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
      if (bool)
      {
        localg = new android/support/v4/widget/DrawerLayout$g;
        paramLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
        localg.<init>(paramLayoutParams);
      }
      else
      {
        localg = new android/support/v4/widget/DrawerLayout$g;
        localg.<init>(paramLayoutParams);
      }
    }
  }
  
  public float getDrawerElevation()
  {
    boolean bool = k;
    if (bool) {}
    for (float f1 = m;; f1 = 0.0F)
    {
      return f1;
      bool = false;
    }
  }
  
  public Drawable getStatusBarBackgroundDrawable()
  {
    return D;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    u = true;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    u = true;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    boolean bool = H;
    if (bool)
    {
      Object localObject1 = D;
      if (localObject1 != null)
      {
        localObject1 = j;
        Object localObject2 = G;
        int i1 = ((DrawerLayout.c)localObject1).a(localObject2);
        if (i1 > 0)
        {
          localObject2 = D;
          int i2 = getWidth();
          ((Drawable)localObject2).setBounds(0, 0, i2, i1);
          localObject1 = D;
          ((Drawable)localObject1).draw(paramCanvas);
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = false;
    int i2 = n.a(paramMotionEvent);
    Object localObject1 = c;
    int i6 = ((p)localObject1).a(paramMotionEvent);
    p localp1 = d;
    boolean bool4 = localp1.a(paramMotionEvent) | i6;
    Object localObject2;
    label85:
    float f3;
    label110:
    label149:
    label168:
    int i9;
    p localp2;
    int i4;
    switch (i2)
    {
    default: 
      i2 = 0;
      localObject2 = null;
      f2 = 0.0F;
      if ((!bool4) && (i2 == 0))
      {
        int i8 = getChildCount();
        i6 = 0;
        localObject1 = null;
        f3 = 0.0F;
        if (i6 >= i8) {
          break label571;
        }
        localObject2 = (DrawerLayout.g)getChildAt(i6).getLayoutParams();
        boolean bool2 = c;
        if (!bool2) {
          break;
        }
        bool2 = i1;
        f2 = f1;
        if (!bool2)
        {
          bool2 = f;
          if (!bool2) {
            break label168;
          }
        }
      }
      bool1 = i1;
      return bool1;
    case 0: 
      f2 = paramMotionEvent.getX();
      f3 = paramMotionEvent.getY();
      B = f2;
      C = f3;
      float f4 = p;
      i9 = 0;
      boolean bool5 = f4 < 0.0F;
      if (bool5)
      {
        localp2 = c;
        int i3 = (int)f2;
        int i7 = (int)f3;
        localObject2 = localp2.b(i3, i7);
        if (localObject2 != null)
        {
          i4 = i((View)localObject2);
          if (i4 != 0) {
            i4 = i1;
          }
        }
      }
      break;
    }
    for (float f2 = f1;; f2 = 0.0F)
    {
      z = false;
      f = false;
      break label85;
      localp2 = c;
      i9 = c.length;
      i4 = 0;
      localObject2 = null;
      f2 = 0.0F;
      label301:
      if (i4 < i9)
      {
        bool3 = localp2.a(i4);
        if (bool3)
        {
          localObject1 = e;
          f3 = localObject1[i4];
          float f5 = c[i4];
          f3 -= f5;
          float[] arrayOfFloat1 = f;
          f5 = arrayOfFloat1[i4];
          float[] arrayOfFloat2 = d;
          float f6 = arrayOfFloat2[i4];
          f5 -= f6;
          f3 *= f3;
          f5 *= f5;
          f3 += f5;
          int i10 = b;
          int i11 = b;
          i10 *= i11;
          f5 = i10;
          bool3 = f3 < f5;
          if (bool3)
          {
            bool3 = i1;
            f3 = f1;
            label453:
            if (!bool3) {
              break label519;
            }
            i4 = i1;
          }
        }
      }
      for (f2 = f1; i4 != 0; f2 = 0.0F)
      {
        r.b();
        s.b();
        i5 = 0;
        localObject2 = null;
        f2 = 0.0F;
        break label85;
        bool3 = false;
        localObject1 = null;
        f3 = 0.0F;
        break label453;
        bool3 = false;
        localObject1 = null;
        f3 = 0.0F;
        break label453;
        label519:
        i5 += 1;
        break label301;
        i5 = 0;
        localObject2 = null;
      }
      a(i1);
      z = false;
      f = false;
      break;
      int i5 = bool3 + true;
      boolean bool3 = i5;
      break label110;
      label571:
      i5 = 0;
      localObject2 = null;
      f2 = 0.0F;
      break label149;
      i5 = 0;
      localObject2 = null;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    int i1 = 1;
    int i2 = 4;
    View localView;
    if (paramInt == i2)
    {
      localView = c();
      if (localView != null)
      {
        i2 = i1;
        if (i2 == 0) {
          break label45;
        }
        paramKeyEvent.startTracking();
      }
    }
    for (;;)
    {
      return i1;
      i2 = 0;
      localView = null;
      break;
      label45:
      i1 = super.onKeyDown(paramInt, paramKeyEvent);
    }
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    int i1 = 4;
    if (paramInt == i1)
    {
      View localView = c();
      if (localView != null)
      {
        int i2 = a(localView);
        if (i2 == 0) {
          a(false);
        }
      }
      if (localView == null) {}
    }
    for (bool = true;; bool = super.onKeyUp(paramInt, paramKeyEvent)) {
      return bool;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    t = true;
    int i1 = paramInt3 - paramInt1;
    int i2 = getChildCount();
    int i3 = 0;
    float f1 = 0.0F;
    DrawerLayout.g localg = null;
    int i6 = 0;
    while (i6 < i2)
    {
      View localView = getChildAt(i6);
      i3 = localView.getVisibility();
      int i7 = 8;
      float f2 = 1.1E-44F;
      int i11;
      int i13;
      if (i3 != i7)
      {
        localg = (DrawerLayout.g)localView.getLayoutParams();
        boolean bool1 = i(localView);
        if (bool1)
        {
          int i8 = leftMargin;
          i11 = topMargin;
          int i12 = leftMargin;
          i13 = localView.getMeasuredWidth();
          i12 += i13;
          i3 = topMargin;
          i13 = localView.getMeasuredHeight();
          i3 += i13;
          localView.layout(i8, i11, i12, i3);
        }
      }
      else
      {
        i3 = i6 + 1;
        i6 = i3;
        continue;
      }
      int i14 = localView.getMeasuredWidth();
      int i15 = localView.getMeasuredHeight();
      f2 = 4.2E-45F;
      boolean bool2 = a(localView, 3);
      int i9;
      float f3;
      float f4;
      label259:
      boolean bool3;
      label285:
      int i16;
      label365:
      int i4;
      if (bool2)
      {
        i9 = -i14;
        f3 = i14;
        f4 = b;
        f3 *= f4;
        i11 = (int)f3 + i9;
        i9 = i14 + i11;
        f2 = i9;
        f4 = i14;
        f2 /= f4;
        f4 = b;
        bool3 = f2 < f4;
        if (!bool3) {
          break label489;
        }
        bool3 = true;
        f4 = Float.MIN_VALUE;
        i13 = a & 0x70;
        switch (i13)
        {
        default: 
          i13 = topMargin;
          i14 += i11;
          i16 = topMargin;
          i15 += i16;
          localView.layout(i11, i13, i14, i15);
          if (bool3) {
            a(localView, f2);
          }
          f1 = b;
          i9 = 0;
          f2 = 0.0F;
          i4 = f1 < 0.0F;
          if (i4 > 0)
          {
            i4 = 0;
            f1 = 0.0F;
            localg = null;
          }
          break;
        }
      }
      for (;;)
      {
        i9 = localView.getVisibility();
        if (i9 == i4) {
          break;
        }
        localView.setVisibility(i4);
        break;
        f2 = i14;
        f3 = b;
        int i10 = (int)(f2 * f3);
        i11 = i1 - i10;
        i10 = i1 - i11;
        f2 = i10;
        f4 = i14;
        f2 /= f4;
        break label259;
        label489:
        bool3 = false;
        f4 = 0.0F;
        break label285;
        i13 = paramInt4 - paramInt2;
        i15 = bottomMargin;
        i15 = i13 - i15;
        i16 = localView.getMeasuredHeight();
        i15 -= i16;
        i14 += i11;
        i16 = bottomMargin;
        i13 -= i16;
        localView.layout(i11, i15, i14, i13);
        break label365;
        i16 = paramInt4 - paramInt2;
        i13 = (i16 - i15) / 2;
        int i17 = topMargin;
        if (i13 < i17) {
          i13 = topMargin;
        }
        for (;;)
        {
          i14 += i11;
          i15 += i13;
          localView.layout(i11, i13, i14, i15);
          break;
          i17 = i13 + i15;
          int i18 = bottomMargin;
          i18 = i16 - i18;
          if (i17 > i18)
          {
            i13 = bottomMargin;
            i13 = i16 - i13 - i15;
          }
        }
        int i5 = 4;
        f1 = 5.6E-45F;
      }
    }
    t = false;
    u = false;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    int i7 = 1073741824;
    int i8;
    if (i1 == i7)
    {
      i7 = 1073741824;
      if (i2 == i7) {}
    }
    else
    {
      boolean bool1 = isInEditMode();
      if (bool1)
      {
        i8 = -1 << -1;
        if ((i1 != i8) && (i1 == 0)) {
          i3 = 300;
        }
        i1 = -1 << -1;
        if ((i2 == i1) || (i2 != 0)) {
          break label784;
        }
        i4 = 300;
        i1 = i3;
      }
    }
    label167:
    int i6;
    for (i3 = i4;; i3 = i6)
    {
      setMeasuredDimension(i1, i3);
      Object localObject1 = G;
      int i10;
      int i12;
      View localView;
      float f1;
      DrawerLayout.c localc;
      Object localObject2;
      if (localObject1 != null)
      {
        int i5 = w.x(this);
        if (i5 != 0)
        {
          i5 = 1;
          i2 = i5;
          int i9 = w.g(this);
          i10 = 0;
          i8 = 0;
          int i11 = getChildCount();
          i5 = 0;
          localObject1 = null;
          i12 = 0;
          if (i12 >= i11) {
            break label783;
          }
          localView = getChildAt(i12);
          i6 = localView.getVisibility();
          int i13 = 8;
          f1 = 1.1E-44F;
          if (i6 != i13)
          {
            localObject1 = (DrawerLayout.g)localView.getLayoutParams();
            if (i2 != 0)
            {
              i13 = f.a(a, i9);
              boolean bool4 = w.x(localView);
              if (!bool4) {
                break label410;
              }
              localc = j;
              localObject2 = G;
              localc.a(localView, localObject2, i13);
            }
          }
        }
      }
      int i16;
      float f2;
      for (;;)
      {
        boolean bool2 = i(localView);
        if (!bool2) {
          break label437;
        }
        int i14 = leftMargin;
        i14 = i1 - i14;
        i16 = rightMargin;
        i14 = View.MeasureSpec.makeMeasureSpec(i14 - i16, 1073741824);
        i16 = topMargin;
        i16 = i3 - i16;
        i6 = bottomMargin;
        i6 = i16 - i6;
        i16 = 1073741824;
        f2 = 2.0F;
        i6 = View.MeasureSpec.makeMeasureSpec(i6, i16);
        localView.measure(i14, i6);
        i6 = i12 + 1;
        i12 = i6;
        break label167;
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        throw ((Throwable)localObject1);
        i6 = 0;
        localObject1 = null;
        i2 = 0;
        break;
        label410:
        localc = j;
        localObject2 = G;
        localc.a((ViewGroup.MarginLayoutParams)localObject1, localObject2, i14);
      }
      label437:
      boolean bool3 = d(localView);
      if (bool3)
      {
        bool3 = k;
        if (bool3)
        {
          f1 = w.t(localView);
          f2 = m;
          bool3 = f1 < f2;
          if (bool3)
          {
            f1 = m;
            w.d(localView, f1);
          }
        }
        i16 = c(localView) & 0x7;
        int i15 = 3;
        f1 = 4.2E-45F;
        if (i16 == i15) {
          i15 = 1;
        }
        for (f1 = Float.MIN_VALUE; ((i15 != 0) && (i10 != 0)) || ((i15 == 0) && (i8 != 0)); f1 = 0.0F)
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("Child drawer has absolute gravity ");
          String str = c(i16);
          localObject3 = str + " but this DrawerLayout already has a drawer view along that edge";
          ((IllegalStateException)localObject1).<init>((String)localObject3);
          throw ((Throwable)localObject1);
          i15 = 0;
        }
        if (i15 != 0) {
          i10 = 1;
        }
        for (;;)
        {
          i15 = n;
          i16 = leftMargin;
          i15 += i16;
          i16 = rightMargin;
          i15 += i16;
          i16 = width;
          i15 = getChildMeasureSpec(paramInt1, i15, i16);
          i16 = topMargin;
          int i17 = bottomMargin;
          i16 += i17;
          i6 = height;
          i6 = getChildMeasureSpec(paramInt2, i16, i6);
          localView.measure(i15, i6);
          break;
          i8 = 1;
        }
      }
      localObject1 = new java/lang/IllegalStateException;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("Child ");
      localObject3 = localView + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY";
      ((IllegalStateException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
      label783:
      return;
      label784:
      i1 = i3;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    int i1 = 3;
    boolean bool = paramParcelable instanceof DrawerLayout.h;
    if (!bool) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      paramParcelable = (DrawerLayout.h)paramParcelable;
      Object localObject = e;
      super.onRestoreInstanceState((Parcelable)localObject);
      int i2 = a;
      if (i2 != 0)
      {
        i2 = a;
        localObject = b(i2);
        if (localObject != null) {
          e((View)localObject);
        }
      }
      i2 = b;
      if (i2 != i1)
      {
        i2 = b;
        a(i2, i1);
      }
      i2 = c;
      int i3;
      if (i2 != i1)
      {
        i2 = c;
        i3 = 5;
        a(i2, i3);
      }
      i2 = f;
      if (i2 != i1)
      {
        i2 = f;
        i3 = 8388611;
        a(i2, i3);
      }
      i2 = g;
      if (i2 != i1)
      {
        i2 = g;
        i3 = 8388613;
        a(i2, i3);
      }
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    boolean bool = k;
    int i1;
    Drawable localDrawable1;
    Drawable localDrawable2;
    if (!bool)
    {
      i1 = w.g(this);
      if (i1 != 0) {
        break label91;
      }
      localDrawable1 = I;
      if (localDrawable1 == null) {
        break label120;
      }
      localDrawable1 = I;
      a(localDrawable1, i1);
      localDrawable2 = I;
      E = localDrawable2;
      i1 = w.g(this);
      if (i1 != 0) {
        break label129;
      }
      localDrawable1 = J;
      if (localDrawable1 == null) {
        break label158;
      }
      localDrawable1 = J;
      a(localDrawable1, i1);
      localDrawable2 = J;
    }
    for (;;)
    {
      F = localDrawable2;
      return;
      label91:
      localDrawable1 = J;
      if (localDrawable1 != null)
      {
        localDrawable1 = J;
        a(localDrawable1, i1);
        localDrawable2 = J;
        break;
      }
      label120:
      localDrawable2 = K;
      break;
      label129:
      localDrawable1 = I;
      if (localDrawable1 != null)
      {
        localDrawable1 = I;
        a(localDrawable1, i1);
        localDrawable2 = I;
      }
      else
      {
        label158:
        localDrawable2 = L;
      }
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    int i1 = 1;
    Object localObject = super.onSaveInstanceState();
    DrawerLayout.h localh = new android/support/v4/widget/DrawerLayout$h;
    localh.<init>((Parcelable)localObject);
    int i2 = getChildCount();
    int i7;
    for (int i3 = 0;; i3 = i7)
    {
      int i4;
      if (i3 < i2)
      {
        localObject = (DrawerLayout.g)getChildAt(i3).getLayoutParams();
        i4 = d;
        if (i4 != i1) {
          break label151;
        }
        i4 = i1;
        i5 = d;
        int i6 = 2;
        if (i5 != i6) {
          break label157;
        }
      }
      label151:
      label157:
      for (int i5 = i1;; i5 = 0)
      {
        if ((i4 == 0) && (i5 == 0)) {
          break label163;
        }
        i7 = a;
        a = i7;
        i7 = v;
        b = i7;
        i7 = w;
        c = i7;
        i7 = x;
        f = i7;
        i7 = y;
        g = i7;
        return localh;
        i4 = 0;
        break;
      }
      label163:
      i7 = i3 + 1;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    c.b(paramMotionEvent);
    Object localObject1 = d;
    ((p)localObject1).b(paramMotionEvent);
    int i2 = paramMotionEvent.getAction() & 0xFF;
    float f2;
    float f3;
    int i3;
    switch (i2)
    {
    case 2: 
    default: 
    case 0: 
      for (;;)
      {
        return i1;
        f2 = paramMotionEvent.getX();
        f3 = paramMotionEvent.getY();
        B = f2;
        C = f3;
        z = false;
        f = false;
      }
    case 1: 
      f2 = paramMotionEvent.getX();
      f3 = paramMotionEvent.getY();
      Object localObject2 = c;
      int i5 = (int)f2;
      int i6 = (int)f3;
      localObject2 = ((p)localObject2).b(i5, i6);
      if (localObject2 != null)
      {
        boolean bool2 = i((View)localObject2);
        if (bool2)
        {
          float f4 = B;
          f2 -= f4;
          f4 = C;
          f3 -= f4;
          localObject2 = c;
          int i7 = b;
          f2 *= f2;
          f3 *= f3;
          f2 += f3;
          int i8 = i7 * i7;
          f3 = i8;
          boolean bool1 = f2 < f3;
          if (bool1)
          {
            localObject1 = d();
            if (localObject1 != null)
            {
              i3 = a((View)localObject1);
              i8 = 2;
              f3 = 2.8E-45F;
              if (i3 == i8)
              {
                i3 = i1;
                f2 = f1;
              }
            }
          }
        }
      }
      break;
    }
    for (;;)
    {
      a(i3);
      z = false;
      break;
      int i4 = 0;
      localObject1 = null;
      f2 = 0.0F;
      continue;
      a(i1);
      z = false;
      f = false;
      break;
      i4 = i1;
      f2 = f1;
    }
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    z = paramBoolean;
    if (paramBoolean)
    {
      boolean bool = true;
      a(bool);
    }
  }
  
  public void requestLayout()
  {
    boolean bool = t;
    if (!bool) {
      super.requestLayout();
    }
  }
  
  public void setDrawerElevation(float paramFloat)
  {
    m = paramFloat;
    int i1 = 0;
    for (;;)
    {
      int i2 = getChildCount();
      if (i1 >= i2) {
        break;
      }
      View localView = getChildAt(i1);
      boolean bool = d(localView);
      if (bool)
      {
        float f1 = m;
        w.d(localView, f1);
      }
      i1 += 1;
    }
  }
  
  public void setDrawerListener(DrawerLayout.f paramf)
  {
    Object localObject = A;
    if (localObject != null)
    {
      localObject = A;
      if (localObject != null)
      {
        List localList = g;
        if (localList != null)
        {
          localList = g;
          localList.remove(localObject);
        }
      }
    }
    if ((paramf != null) && (paramf != null))
    {
      localObject = g;
      if (localObject == null)
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        g = ((List)localObject);
      }
      localObject = g;
      ((List)localObject).add(paramf);
    }
    A = paramf;
  }
  
  public void setDrawerLockMode(int paramInt)
  {
    a(paramInt, 3);
    a(paramInt, 5);
  }
  
  public void setScrimColor(int paramInt)
  {
    o = paramInt;
    invalidate();
  }
  
  public void setStatusBarBackground(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = android.support.v4.c.a.a(getContext(), paramInt);; localDrawable = null)
    {
      D = localDrawable;
      invalidate();
      return;
    }
  }
  
  public void setStatusBarBackground(Drawable paramDrawable)
  {
    D = paramDrawable;
    invalidate();
  }
  
  public void setStatusBarBackgroundColor(int paramInt)
  {
    ColorDrawable localColorDrawable = new android/graphics/drawable/ColorDrawable;
    localColorDrawable.<init>(paramInt);
    D = localColorDrawable;
    invalidate();
  }
}


/* Location:              android/support/v4/widget/DrawerLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */