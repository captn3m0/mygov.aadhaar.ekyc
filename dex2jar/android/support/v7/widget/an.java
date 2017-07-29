package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v4.h.w;
import android.support.v4.widget.j;
import android.support.v7.a.a.a;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
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
  private final d D = new d();
  private final c E = new c();
  private final a F = new a();
  private Runnable G;
  private final Rect H = new Rect();
  private Context d;
  public ah e;
  int f = -2;
  public int g;
  public int h = 0;
  int i = Integer.MAX_VALUE;
  int j = 0;
  public View k;
  public AdapterView.OnItemClickListener l;
  final e m = new e();
  final Handler n;
  public Rect o;
  public boolean p;
  public PopupWindow q;
  private ListAdapter r;
  private int s = -2;
  private int t;
  private int u = 1002;
  private boolean v;
  private boolean w = true;
  private boolean x = false;
  private boolean y = false;
  private View z;
  
  static
  {
    try
    {
      a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[] { Boolean.TYPE });
    }
    catch (NoSuchMethodException localNoSuchMethodException1)
    {
      try
      {
        for (;;)
        {
          b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[] { View.class, Integer.TYPE, Boolean.TYPE });
          try
          {
            c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[] { Rect.class });
            return;
          }
          catch (NoSuchMethodException localNoSuchMethodException3)
          {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
          }
          localNoSuchMethodException1 = localNoSuchMethodException1;
          Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        for (;;)
        {
          Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
      }
    }
  }
  
  public an(Context paramContext)
  {
    this(paramContext, null, a.a.listPopupWindowStyle);
  }
  
  public an(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public an(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    d = paramContext;
    n = new Handler(paramContext.getMainLooper());
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.ListPopupWindow, paramInt1, paramInt2);
    g = localTypedArray.getDimensionPixelOffset(a.j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
    t = localTypedArray.getDimensionPixelOffset(a.j.ListPopupWindow_android_dropDownVerticalOffset, 0);
    if (t != 0) {
      v = true;
    }
    localTypedArray.recycle();
    if (Build.VERSION.SDK_INT >= 11) {}
    for (q = new s(paramContext, paramAttributeSet, paramInt1, paramInt2);; q = new s(paramContext, paramAttributeSet, paramInt1))
    {
      q.setInputMethodMode(1);
      return;
    }
  }
  
  private int a(View paramView, int paramInt, boolean paramBoolean)
  {
    if (b != null) {
      try
      {
        int i1 = ((Integer)b.invoke(q, new Object[] { paramView, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) })).intValue();
        return i1;
      }
      catch (Exception localException)
      {
        Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
      }
    }
    return q.getMaxAvailableHeight(paramView, paramInt);
  }
  
  ah a(Context paramContext, boolean paramBoolean)
  {
    return new ah(paramContext, paramBoolean);
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
    if (A == null) {
      A = new b();
    }
    for (;;)
    {
      r = paramListAdapter;
      if (r != null) {
        paramListAdapter.registerDataSetObserver(A);
      }
      if (e != null) {
        e.setAdapter(r);
      }
      return;
      if (r != null) {
        r.unregisterDataSetObserver(A);
      }
    }
  }
  
  public final void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    q.setOnDismissListener(paramOnDismissListener);
  }
  
  public final void b()
  {
    p = true;
    q.setFocusable(true);
  }
  
  public final void b(int paramInt)
  {
    Drawable localDrawable = q.getBackground();
    if (localDrawable != null)
    {
      localDrawable.getPadding(H);
      f = (H.left + H.right + paramInt);
      return;
    }
    f = paramInt;
  }
  
  public final int c()
  {
    if (!v) {
      return 0;
    }
    return t;
  }
  
  public void d()
  {
    boolean bool3 = true;
    boolean bool2 = true;
    Object localObject2;
    boolean bool1;
    Object localObject1;
    View localView;
    LinearLayout.LayoutParams localLayoutParams;
    label250:
    int i2;
    int i1;
    if (e == null)
    {
      localObject2 = d;
      G = new Runnable()
      {
        public final void run()
        {
          View localView = k;
          if ((localView != null) && (localView.getWindowToken() != null)) {
            d();
          }
        }
      };
      if (!p)
      {
        bool1 = true;
        e = a((Context)localObject2, bool1);
        if (B != null) {
          e.setSelector(B);
        }
        e.setAdapter(r);
        e.setOnItemClickListener(l);
        e.setFocusable(true);
        e.setFocusableInTouchMode(true);
        e.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
          public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            if (paramAnonymousInt != -1)
            {
              paramAnonymousAdapterView = e;
              if (paramAnonymousAdapterView != null) {
                paramAnonymousAdapterView.setListSelectionHidden(false);
              }
            }
          }
          
          public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView) {}
        });
        e.setOnScrollListener(E);
        if (C != null) {
          e.setOnItemSelectedListener(C);
        }
        localObject1 = e;
        localView = z;
        if (localView == null) {
          break label1288;
        }
        localObject2 = new LinearLayout((Context)localObject2);
        ((LinearLayout)localObject2).setOrientation(1);
        localLayoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0F);
        switch (j)
        {
        default: 
          Log.e("ListPopupWindow", "Invalid hint position " + j);
          if (f >= 0)
          {
            i2 = f;
            i1 = Integer.MIN_VALUE;
            label266:
            localView.measure(View.MeasureSpec.makeMeasureSpec(i2, i1), 0);
            localObject1 = (LinearLayout.LayoutParams)localView.getLayoutParams();
            i1 = localView.getMeasuredHeight();
            i2 = topMargin;
            i1 = bottomMargin + (i1 + i2);
            localObject1 = localObject2;
          }
          break;
        }
      }
    }
    for (;;)
    {
      q.setContentView((View)localObject1);
      for (;;)
      {
        label322:
        localObject1 = q.getBackground();
        int i3;
        label385:
        label399:
        int i4;
        if (localObject1 != null)
        {
          ((Drawable)localObject1).getPadding(H);
          i2 = H.top + H.bottom;
          i3 = i2;
          if (!v)
          {
            t = (-H.top);
            i3 = i2;
          }
          if (q.getInputMethodMode() != 2) {
            break label722;
          }
          bool1 = true;
          i4 = a(k, t, bool1);
          if ((!x) && (s != -1)) {
            break label728;
          }
          i1 = i4 + i3;
          bool1 = j();
          j.a(q, u);
          if (!q.isShowing()) {
            break label993;
          }
          if (f != -1) {
            break label894;
          }
          i2 = -1;
          label472:
          if (s != -1) {
            break label970;
          }
          if (!bool1) {
            break label922;
          }
          label485:
          if (!bool1) {
            break label932;
          }
          localObject1 = q;
          if (f != -1) {
            break label927;
          }
          i3 = -1;
          label506:
          ((PopupWindow)localObject1).setWidth(i3);
          q.setHeight(0);
        }
        for (;;)
        {
          label520:
          localObject1 = q;
          if ((!y) && (!x))
          {
            bool1 = bool2;
            label544:
            ((PopupWindow)localObject1).setOutsideTouchable(bool1);
            localObject1 = q;
            localObject2 = k;
            i4 = g;
            int i5 = t;
            i3 = i2;
            if (i2 < 0) {
              i3 = -1;
            }
            i2 = i1;
            if (i1 < 0) {
              i2 = -1;
            }
            ((PopupWindow)localObject1).update((View)localObject2, i4, i5, i3, i2);
          }
          for (;;)
          {
            return;
            bool1 = false;
            break;
            ((LinearLayout)localObject2).addView((View)localObject1, localLayoutParams);
            ((LinearLayout)localObject2).addView(localView);
            break label250;
            ((LinearLayout)localObject2).addView(localView);
            ((LinearLayout)localObject2).addView((View)localObject1, localLayoutParams);
            break label250;
            i1 = 0;
            i2 = 0;
            break label266;
            q.getContentView();
            localObject1 = z;
            if (localObject1 == null) {
              break label1283;
            }
            localObject2 = (LinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
            i1 = ((View)localObject1).getMeasuredHeight();
            i2 = topMargin;
            i1 = bottomMargin + (i1 + i2);
            break label322;
            H.setEmpty();
            i3 = 0;
            break label385;
            label722:
            bool1 = false;
            break label399;
            label728:
            switch (f)
            {
            default: 
              i2 = View.MeasureSpec.makeMeasureSpec(f, 1073741824);
            }
            for (;;)
            {
              i4 = e.a(i2, i4 - i1);
              i2 = i1;
              if (i4 > 0) {
                i2 = i1 + (i3 + (e.getPaddingTop() + e.getPaddingBottom()));
              }
              i1 = i2 + i4;
              break;
              i2 = View.MeasureSpec.makeMeasureSpec(d.getResources().getDisplayMetrics().widthPixels - (H.left + H.right), Integer.MIN_VALUE);
              continue;
              i2 = View.MeasureSpec.makeMeasureSpec(d.getResources().getDisplayMetrics().widthPixels - (H.left + H.right), 1073741824);
            }
            label894:
            if (f == -2)
            {
              i2 = k.getWidth();
              break label472;
            }
            i2 = f;
            break label472;
            label922:
            i1 = -1;
            break label485;
            label927:
            i3 = 0;
            break label506;
            label932:
            localObject1 = q;
            if (f == -1) {}
            for (i3 = -1;; i3 = 0)
            {
              ((PopupWindow)localObject1).setWidth(i3);
              q.setHeight(-1);
              break;
            }
            label970:
            if (s != -2)
            {
              i1 = s;
              break label520;
              bool1 = false;
              break label544;
              label993:
              if (f == -1)
              {
                i2 = -1;
                label1003:
                if (s != -1) {
                  break label1227;
                }
                i1 = -1;
                label1013:
                q.setWidth(i2);
                q.setHeight(i1);
                if (a == null) {}
              }
              try
              {
                a.invoke(q, new Object[] { Boolean.valueOf(true) });
                localObject1 = q;
                if ((!y) && (!x))
                {
                  bool1 = bool3;
                  ((PopupWindow)localObject1).setOutsideTouchable(bool1);
                  q.setTouchInterceptor(D);
                  if (c == null) {}
                }
              }
              catch (Exception localException1)
              {
                try
                {
                  for (;;)
                  {
                    c.invoke(q, new Object[] { o });
                    j.a(q, k, g, t, h);
                    e.setSelection(-1);
                    if ((!p) || (e.isInTouchMode())) {
                      i();
                    }
                    if (p) {
                      break;
                    }
                    n.post(F);
                    return;
                    if (f == -2)
                    {
                      i2 = k.getWidth();
                      break label1003;
                    }
                    i2 = f;
                    break label1003;
                    label1227:
                    if (s == -2) {
                      break label1013;
                    }
                    i1 = s;
                    break label1013;
                    localException1 = localException1;
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                  }
                  bool1 = false;
                }
                catch (Exception localException2)
                {
                  for (;;)
                  {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", localException2);
                  }
                }
              }
            }
          }
        }
        label1283:
        i1 = 0;
      }
      label1288:
      i1 = 0;
    }
  }
  
  public final void e()
  {
    q.dismiss();
    if (z != null)
    {
      ViewParent localViewParent = z.getParent();
      if ((localViewParent instanceof ViewGroup)) {
        ((ViewGroup)localViewParent).removeView(z);
      }
    }
    q.setContentView(null);
    e = null;
    n.removeCallbacks(m);
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
      localah.setListSelectionHidden(true);
      localah.requestLayout();
    }
  }
  
  public final boolean j()
  {
    return q.getInputMethodMode() == 2;
  }
  
  private final class a
    implements Runnable
  {
    a() {}
    
    public final void run()
    {
      i();
    }
  }
  
  private final class b
    extends DataSetObserver
  {
    b() {}
    
    public final void onChanged()
    {
      if (q.isShowing()) {
        d();
      }
    }
    
    public final void onInvalidated()
    {
      e();
    }
  }
  
  private final class c
    implements AbsListView.OnScrollListener
  {
    c() {}
    
    public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
    
    public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
    {
      if ((paramInt == 1) && (!j()) && (q.getContentView() != null))
      {
        n.removeCallbacks(m);
        m.run();
      }
    }
  }
  
  private final class d
    implements View.OnTouchListener
  {
    d() {}
    
    public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      int i = paramMotionEvent.getAction();
      int j = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      if ((i == 0) && (q != null) && (q.isShowing()) && (j >= 0) && (j < q.getWidth()) && (k >= 0) && (k < q.getHeight())) {
        n.postDelayed(m, 250L);
      }
      for (;;)
      {
        return false;
        if (i == 1) {
          n.removeCallbacks(m);
        }
      }
    }
  }
  
  private final class e
    implements Runnable
  {
    e() {}
    
    public final void run()
    {
      if ((e != null) && (w.H(e)) && (e.getCount() > e.getChildCount()) && (e.getChildCount() <= i))
      {
        q.setInputMethodMode(2);
        d();
      }
    }
  }
}


/* Location:              android/support/v7/widget/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */