package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.widget.j;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;

public class an
  implements android.support.v7.view.menu.s
{
  private static Method a;
  private static Method b;
  private static Method c;
  private DataSetObserver A;
  private Drawable B;
  private AdapterView.OnItemSelectedListener C;
  private final an.d D;
  private final an.c E;
  private final an.a F;
  private Runnable G;
  private final Rect H;
  private Context d;
  public ah e;
  int f;
  public int g;
  public int h;
  int i;
  int j;
  public View k;
  public AdapterView.OnItemClickListener l;
  final an.e m;
  final Handler n;
  public Rect o;
  public boolean p;
  public PopupWindow q;
  private ListAdapter r;
  private int s;
  private int t;
  private int u;
  private boolean v;
  private boolean w;
  private boolean x;
  private boolean y;
  private View z;
  
  static
  {
    localObject = PopupWindow.class;
    str4 = "setClipToScreenEnabled";
    i1 = 1;
    try
    {
      arrayOfClass = new Class[i1];
      i2 = 0;
      localClass = Boolean.TYPE;
      arrayOfClass[0] = localClass;
      localObject = ((Class)localObject).getDeclaredMethod(str4, arrayOfClass);
      a = (Method)localObject;
    }
    catch (NoSuchMethodException localNoSuchMethodException1)
    {
      for (;;)
      {
        try
        {
          Class[] arrayOfClass = new Class[i1];
          int i2 = 0;
          Class localClass = Rect.class;
          arrayOfClass[0] = localClass;
          localObject = ((Class)localObject).getDeclaredMethod(str4, arrayOfClass);
          c = (Method)localObject;
          return;
        }
        catch (NoSuchMethodException localNoSuchMethodException3)
        {
          String str3 = "ListPopupWindow";
          str4 = "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.";
          Log.i(str3, str4);
          continue;
        }
        localNoSuchMethodException1 = localNoSuchMethodException1;
        str1 = "ListPopupWindow";
        str4 = "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.";
        Log.i(str1, str4);
      }
    }
    localObject = PopupWindow.class;
    str4 = "getMaxAvailableHeight";
    i1 = 3;
    try
    {
      arrayOfClass = new Class[i1];
      i2 = 0;
      localClass = View.class;
      arrayOfClass[0] = localClass;
      i2 = 1;
      localClass = Integer.TYPE;
      arrayOfClass[i2] = localClass;
      i2 = 2;
      localClass = Boolean.TYPE;
      arrayOfClass[i2] = localClass;
      localObject = ((Class)localObject).getDeclaredMethod(str4, arrayOfClass);
      b = (Method)localObject;
    }
    catch (NoSuchMethodException localNoSuchMethodException2)
    {
      for (;;)
      {
        String str1;
        String str2 = "ListPopupWindow";
        str4 = "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.";
        Log.i(str2, str4);
      }
    }
    localObject = PopupWindow.class;
    str4 = "setEpicenterBounds";
    i1 = 1;
  }
  
  public an(Context paramContext)
  {
    this(paramContext, null, i1);
  }
  
  public an(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public an(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    s = i1;
    f = i1;
    u = 1002;
    w = i2;
    h = 0;
    x = false;
    y = false;
    i1 = -1 >>> 1;
    i = i1;
    j = 0;
    Object localObject = new android/support/v7/widget/an$e;
    ((an.e)localObject).<init>(this);
    m = ((an.e)localObject);
    localObject = new android/support/v7/widget/an$d;
    ((an.d)localObject).<init>(this);
    D = ((an.d)localObject);
    localObject = new android/support/v7/widget/an$c;
    ((an.c)localObject).<init>(this);
    E = ((an.c)localObject);
    localObject = new android/support/v7/widget/an$a;
    ((an.a)localObject).<init>(this);
    F = ((an.a)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    H = ((Rect)localObject);
    d = paramContext;
    localObject = new android/os/Handler;
    Looper localLooper = paramContext.getMainLooper();
    ((Handler)localObject).<init>(localLooper);
    n = ((Handler)localObject);
    localObject = a.j.ListPopupWindow;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject, paramInt1, paramInt2);
    int i3 = a.j.ListPopupWindow_android_dropDownHorizontalOffset;
    i3 = ((TypedArray)localObject).getDimensionPixelOffset(i3, 0);
    g = i3;
    i3 = a.j.ListPopupWindow_android_dropDownVerticalOffset;
    i3 = ((TypedArray)localObject).getDimensionPixelOffset(i3, 0);
    t = i3;
    i3 = t;
    if (i3 != 0) {
      v = i2;
    }
    ((TypedArray)localObject).recycle();
    i1 = Build.VERSION.SDK_INT;
    i3 = 11;
    if (i1 >= i3)
    {
      localObject = new android/support/v7/widget/s;
      ((s)localObject).<init>(paramContext, paramAttributeSet, paramInt1, paramInt2);
    }
    for (q = ((PopupWindow)localObject);; q = ((PopupWindow)localObject))
    {
      q.setInputMethodMode(i2);
      return;
      localObject = new android/support/v7/widget/s;
      ((s)localObject).<init>(paramContext, paramAttributeSet, paramInt1);
    }
  }
  
  private int a(View paramView, int paramInt, boolean paramBoolean)
  {
    Object localObject1 = b;
    if (localObject1 != null) {}
    for (;;)
    {
      try
      {
        localObject1 = b;
        localObject3 = q;
        int i1 = 3;
        Object[] arrayOfObject = new Object[i1];
        int i2 = 0;
        arrayOfObject[0] = paramView;
        i2 = 1;
        Object localObject4 = Integer.valueOf(paramInt);
        arrayOfObject[i2] = localObject4;
        i2 = 2;
        localObject4 = Boolean.valueOf(paramBoolean);
        arrayOfObject[i2] = localObject4;
        localObject1 = ((Method)localObject1).invoke(localObject3, arrayOfObject);
        localObject1 = (Integer)localObject1;
        i3 = ((Integer)localObject1).intValue();
        return i3;
      }
      catch (Exception localException)
      {
        localObject2 = "ListPopupWindow";
        Object localObject3 = "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.";
        Log.i((String)localObject2, (String)localObject3);
      }
      Object localObject2 = q;
      int i3 = ((PopupWindow)localObject2).getMaxAvailableHeight(paramView, paramInt);
    }
  }
  
  ah a(Context paramContext, boolean paramBoolean)
  {
    ah localah = new android/support/v7/widget/ah;
    localah.<init>(paramContext, paramBoolean);
    return localah;
  }
  
  public final void a(int paramInt)
  {
    t = paramInt;
    v = true;
  }
  
  public final void a(Drawable paramDrawable)
  {
    q.setBackgroundDrawable(paramDrawable);
  }
  
  public void a(ListAdapter paramListAdapter)
  {
    Object localObject1 = A;
    if (localObject1 == null)
    {
      localObject1 = new android/support/v7/widget/an$b;
      ((an.b)localObject1).<init>(this);
      A = ((DataSetObserver)localObject1);
    }
    for (;;)
    {
      r = paramListAdapter;
      localObject1 = r;
      if (localObject1 != null)
      {
        localObject1 = A;
        paramListAdapter.registerDataSetObserver((DataSetObserver)localObject1);
      }
      localObject1 = e;
      Object localObject2;
      if (localObject1 != null)
      {
        localObject1 = e;
        localObject2 = r;
        ((ah)localObject1).setAdapter((ListAdapter)localObject2);
      }
      return;
      localObject1 = r;
      if (localObject1 != null)
      {
        localObject1 = r;
        localObject2 = A;
        ((ListAdapter)localObject1).unregisterDataSetObserver((DataSetObserver)localObject2);
      }
    }
  }
  
  public final void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    q.setOnDismissListener(paramOnDismissListener);
  }
  
  public final void b()
  {
    boolean bool = true;
    p = bool;
    q.setFocusable(bool);
  }
  
  public final void b(int paramInt)
  {
    Object localObject = q.getBackground();
    int i1;
    if (localObject != null)
    {
      Rect localRect = H;
      ((Drawable)localObject).getPadding(localRect);
      localObject = H;
      i1 = left;
      localRect = H;
      int i2 = right;
      i1 = i1 + i2 + paramInt;
    }
    for (f = i1;; f = paramInt) {
      return;
    }
  }
  
  public final int c()
  {
    int i1 = v;
    if (i1 == 0) {}
    int i2;
    for (i1 = 0;; i2 = t) {
      return i1;
    }
  }
  
  public void d()
  {
    int i1 = -1 << -1;
    int i5 = -2;
    int i6 = 1;
    int i7 = 0;
    Object localObject1 = null;
    int i8 = -1;
    float f1 = 0.0F / 0.0F;
    Object localObject2 = e;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    int i11;
    Object localObject7;
    label375:
    int i9;
    int i12;
    label395:
    int i13;
    if (localObject2 == null)
    {
      localObject4 = d;
      localObject2 = new android/support/v7/widget/an$1;
      ((an.1)localObject2).<init>(this);
      G = ((Runnable)localObject2);
      boolean bool5 = p;
      if (!bool5)
      {
        bool5 = i6;
        localObject2 = a((Context)localObject4, bool5);
        e = ((ah)localObject2);
        localObject2 = B;
        if (localObject2 != null)
        {
          localObject2 = e;
          localObject5 = B;
          ((ah)localObject2).setSelector((Drawable)localObject5);
        }
        localObject2 = e;
        localObject5 = r;
        ((ah)localObject2).setAdapter((ListAdapter)localObject5);
        localObject2 = e;
        localObject5 = l;
        ((ah)localObject2).setOnItemClickListener((AdapterView.OnItemClickListener)localObject5);
        e.setFocusable(i6);
        e.setFocusableInTouchMode(i6);
        localObject2 = e;
        localObject5 = new android/support/v7/widget/an$2;
        ((an.2)localObject5).<init>(this);
        ((ah)localObject2).setOnItemSelectedListener((AdapterView.OnItemSelectedListener)localObject5);
        localObject2 = e;
        localObject5 = E;
        ((ah)localObject2).setOnScrollListener((AbsListView.OnScrollListener)localObject5);
        localObject2 = C;
        if (localObject2 != null)
        {
          localObject2 = e;
          localObject5 = C;
          ((ah)localObject2).setOnItemSelectedListener((AdapterView.OnItemSelectedListener)localObject5);
        }
        localObject2 = e;
        localObject6 = z;
        if (localObject6 == null) {
          break label1893;
        }
        localObject5 = new android/widget/LinearLayout;
        ((LinearLayout)localObject5).<init>((Context)localObject4);
        ((LinearLayout)localObject5).setOrientation(i6);
        localObject4 = new android/widget/LinearLayout$LayoutParams;
        float f2 = 1.0F;
        ((LinearLayout.LayoutParams)localObject4).<init>(i8, 0, f2);
        i11 = j;
        switch (i11)
        {
        default: 
          localObject2 = "ListPopupWindow";
          localObject4 = new java/lang/StringBuilder;
          localObject7 = "Invalid hint position ";
          ((StringBuilder)localObject4).<init>((String)localObject7);
          i11 = j;
          localObject4 = i11;
          Log.e((String)localObject2, (String)localObject4);
          i9 = f;
          if (i9 >= 0)
          {
            i12 = f;
            i9 = i1;
            i9 = View.MeasureSpec.makeMeasureSpec(i12, i9);
            ((View)localObject6).measure(i9, 0);
            localObject2 = (LinearLayout.LayoutParams)((View)localObject6).getLayoutParams();
            i12 = ((View)localObject6).getMeasuredHeight();
            i13 = topMargin;
            i12 += i13;
            i9 = bottomMargin + i12;
            localObject4 = localObject5;
          }
          break;
        }
      }
    }
    for (;;)
    {
      localObject5 = q;
      ((PopupWindow)localObject5).setContentView((View)localObject4);
      for (;;)
      {
        label470:
        localObject4 = q.getBackground();
        label562:
        label588:
        int i14;
        int i18;
        Object localObject8;
        if (localObject4 != null)
        {
          localObject5 = H;
          ((Drawable)localObject4).getPadding((Rect)localObject5);
          localObject4 = H;
          i12 = top;
          localObject5 = H;
          int i15 = bottom;
          i12 += i15;
          boolean bool8 = v;
          if (!bool8)
          {
            localObject5 = H;
            i16 = -top;
            t = i16;
          }
          localObject5 = q;
          int i16 = ((PopupWindow)localObject5).getInputMethodMode();
          i13 = 2;
          if (i16 != i13) {
            break label999;
          }
          i16 = i6;
          localObject6 = k;
          i11 = t;
          int i17 = a((View)localObject6, i11, i16);
          boolean bool7 = x;
          if (!bool7)
          {
            i14 = s;
            if (i14 != i8) {
              break label1008;
            }
          }
          i9 = i17 + i12;
          i18 = j();
          localObject8 = q;
          i12 = u;
          j.a((PopupWindow)localObject8, i12);
          localObject8 = q;
          boolean bool1 = ((PopupWindow)localObject8).isShowing();
          if (!bool1) {
            break label1422;
          }
          int i2 = f;
          if (i2 != i8) {
            break label1279;
          }
          i12 = i8;
          label699:
          i2 = s;
          if (i2 != i8) {
            break label1391;
          }
          if (i18 == 0) {
            break label1318;
          }
          i2 = i9;
          label718:
          if (i18 == 0) {
            break label1333;
          }
          localObject5 = q;
          i9 = f;
          if (i9 != i8) {
            break label1324;
          }
          i9 = i8;
          label746:
          ((PopupWindow)localObject5).setWidth(i9);
          localObject2 = q;
          ((PopupWindow)localObject2).setHeight(0);
          i18 = i2;
        }
        for (;;)
        {
          label768:
          localObject2 = q;
          boolean bool2 = y;
          if (!bool2)
          {
            bool2 = x;
            if (bool2) {}
          }
          Object localObject9;
          label999:
          label1008:
          label1279:
          label1318:
          label1324:
          label1333:
          label1391:
          boolean bool4;
          for (;;)
          {
            ((PopupWindow)localObject2).setOutsideTouchable(i6);
            localObject2 = q;
            localObject9 = k;
            i7 = g;
            i3 = t;
            if (i12 < 0) {
              i12 = i8;
            }
            if (i18 < 0) {
              i18 = i8;
            }
            ((PopupWindow)localObject2).update((View)localObject9, i7, i3, i12, i18);
            return;
            i9 = 0;
            localObject2 = null;
            break;
            ((LinearLayout)localObject5).addView((View)localObject2, (ViewGroup.LayoutParams)localObject4);
            ((LinearLayout)localObject5).addView((View)localObject6);
            break label375;
            ((LinearLayout)localObject5).addView((View)localObject6);
            ((LinearLayout)localObject5).addView((View)localObject2, (ViewGroup.LayoutParams)localObject4);
            break label375;
            i9 = 0;
            localObject2 = null;
            i12 = 0;
            localObject4 = null;
            break label395;
            localObject2 = q;
            ((PopupWindow)localObject2).getContentView();
            localObject4 = z;
            if (localObject4 == null) {
              break label1884;
            }
            localObject2 = (LinearLayout.LayoutParams)((View)localObject4).getLayoutParams();
            i12 = ((View)localObject4).getMeasuredHeight();
            int i19 = topMargin;
            i12 += i19;
            i9 = bottomMargin + i12;
            break label470;
            H.setEmpty();
            i12 = 0;
            localObject4 = null;
            break label562;
            i19 = 0;
            localObject5 = null;
            break label588;
            i14 = f;
            switch (i14)
            {
            default: 
              i3 = f;
              i14 = 1073741824;
              i3 = View.MeasureSpec.makeMeasureSpec(i3, i14);
            }
            for (;;)
            {
              localObject6 = e;
              i19 -= i9;
              i3 = ((ah)localObject6).a(i3, i19);
              if (i3 > 0)
              {
                localObject5 = e;
                i19 = ((ah)localObject5).getPaddingTop();
                localObject6 = e;
                i14 = ((ah)localObject6).getPaddingBottom();
                i19 += i14;
                i12 += i20;
                i9 += i12;
              }
              i9 += i3;
              break;
              localObject6 = d.getResources().getDisplayMetrics();
              i14 = widthPixels;
              localObject7 = H;
              i11 = left;
              Rect localRect = H;
              int i21 = right;
              i11 += i21;
              i14 -= i11;
              i3 = View.MeasureSpec.makeMeasureSpec(i14, i3);
              continue;
              localObject8 = d.getResources().getDisplayMetrics();
              i3 = widthPixels;
              localObject6 = H;
              i14 = left;
              localObject7 = H;
              i11 = right;
              i14 += i11;
              i3 -= i14;
              i14 = 1073741824;
              i3 = View.MeasureSpec.makeMeasureSpec(i3, i14);
            }
            i3 = f;
            if (i3 == i5)
            {
              localObject8 = k;
              i3 = ((View)localObject8).getWidth();
              i12 = i3;
              break label699;
            }
            i3 = f;
            i12 = i3;
            break label699;
            i3 = i8;
            break label718;
            i9 = 0;
            localObject2 = null;
            break label746;
            localObject5 = q;
            i9 = f;
            if (i9 == i8) {
              i9 = i8;
            }
            for (;;)
            {
              ((PopupWindow)localObject5).setWidth(i9);
              localObject2 = q;
              ((PopupWindow)localObject2).setHeight(i8);
              i20 = i3;
              break;
              i9 = 0;
              localObject2 = null;
            }
            i3 = s;
            if (i3 == i5) {
              break label1877;
            }
            i9 = s;
            i20 = i9;
            break label768;
            bool4 = false;
            localObject9 = null;
          }
          label1422:
          int i3 = f;
          if (i3 == i8)
          {
            i3 = i8;
            label1436:
            i12 = s;
            if (i12 != i8) {
              break label1802;
            }
            i9 = i8;
          }
          for (;;)
          {
            localObject4 = q;
            ((PopupWindow)localObject4).setWidth(i3);
            localObject8 = q;
            ((PopupWindow)localObject8).setHeight(i9);
            localObject2 = a;
            if (localObject2 != null) {}
            try
            {
              localObject2 = a;
              localObject8 = q;
              i12 = 1;
              localObject4 = new Object[i12];
              i20 = 0;
              localObject5 = null;
              i14 = 1;
              localObject6 = Boolean.valueOf(i14);
              localObject4[0] = localObject6;
              ((Method)localObject2).invoke(localObject8, (Object[])localObject4);
            }
            catch (Exception localException1)
            {
              for (;;)
              {
                boolean bool3;
                str = "ListPopupWindow";
                localObject8 = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.";
                Log.i(str, (String)localObject8);
                continue;
                bool4 = false;
                localObject9 = null;
              }
            }
            localObject2 = q;
            bool3 = y;
            if (bool3) {
              break label1845;
            }
            bool3 = x;
            if (bool3) {
              break label1845;
            }
            ((PopupWindow)localObject2).setOutsideTouchable(bool4);
            localObject2 = q;
            localObject9 = D;
            ((PopupWindow)localObject2).setTouchInterceptor((View.OnTouchListener)localObject9);
            localObject2 = c;
            if (localObject2 != null) {}
            try
            {
              localObject2 = c;
              localObject9 = q;
              i7 = 1;
              localObject1 = new Object[i7];
              bool3 = false;
              localObject8 = null;
              localObject4 = o;
              localObject1[0] = localObject4;
              ((Method)localObject2).invoke(localObject9, (Object[])localObject1);
            }
            catch (Exception localException2)
            {
              for (;;)
              {
                int i4;
                boolean bool6;
                String str;
                localObject9 = "ListPopupWindow";
                localObject1 = "Could not invoke setEpicenterBounds on PopupWindow";
                Log.e((String)localObject9, (String)localObject1, localException2);
              }
            }
            localObject2 = q;
            localObject9 = k;
            i7 = g;
            i4 = t;
            i12 = h;
            j.a((PopupWindow)localObject2, (View)localObject9, i7, i4, i12);
            localObject2 = e;
            ((ah)localObject2).setSelection(i8);
            bool6 = p;
            if (bool6)
            {
              localObject2 = e;
              bool6 = ((ah)localObject2).isInTouchMode();
              if (!bool6) {}
            }
            else
            {
              i();
            }
            bool6 = p;
            if (bool6) {
              break;
            }
            localObject2 = n;
            localObject9 = F;
            ((Handler)localObject2).post((Runnable)localObject9);
            break;
            i4 = f;
            if (i4 == i5)
            {
              localObject8 = k;
              i4 = ((View)localObject8).getWidth();
              break label1436;
            }
            i4 = f;
            break label1436;
            label1802:
            i12 = s;
            if (i12 != i5) {
              i10 = s;
            }
          }
          label1845:
          label1877:
          int i20 = i10;
        }
        label1884:
        i10 = 0;
        localObject3 = null;
      }
      label1893:
      localObject4 = localObject3;
      int i10 = 0;
      Object localObject3 = null;
    }
  }
  
  public final void e()
  {
    q.dismiss();
    Object localObject1 = z;
    if (localObject1 != null)
    {
      localObject1 = z.getParent();
      boolean bool = localObject1 instanceof ViewGroup;
      if (bool)
      {
        localObject1 = (ViewGroup)localObject1;
        localObject2 = z;
        ((ViewGroup)localObject1).removeView((View)localObject2);
      }
    }
    q.setContentView(null);
    e = null;
    localObject1 = n;
    Object localObject2 = m;
    ((Handler)localObject1).removeCallbacks((Runnable)localObject2);
  }
  
  public final boolean f()
  {
    return q.isShowing();
  }
  
  public final ListView g()
  {
    return e;
  }
  
  public final void h()
  {
    q.setInputMethodMode(2);
  }
  
  public final void i()
  {
    ah localah = e;
    if (localah != null)
    {
      boolean bool = true;
      localah.setListSelectionHidden(bool);
      localah.requestLayout();
    }
  }
  
  public final boolean j()
  {
    PopupWindow localPopupWindow = q;
    int i1 = localPopupWindow.getInputMethodMode();
    int i3 = 2;
    if (i1 == i3) {
      i1 = 1;
    }
    for (;;)
    {
      return i1;
      int i2 = 0;
      localPopupWindow = null;
    }
  }
}


/* Location:              android/support/v7/widget/an.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */