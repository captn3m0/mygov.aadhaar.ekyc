package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.h.aa;
import android.support.v4.h.e;
import android.support.v4.h.e.a;
import android.support.v7.view.a;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.ActionMenuItemView.b;
import android.support.v7.view.menu.b;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.b;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.n;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.p.a;
import android.support.v7.view.menu.u;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

final class d
  extends b
  implements e.a
{
  private final SparseBooleanArray A;
  private View B;
  private d.b C;
  d.d i;
  Drawable j;
  boolean k;
  boolean l;
  d.e m;
  d.a n;
  d.c o;
  final d.f p;
  int q;
  private boolean r;
  private boolean s;
  private int t;
  private int u;
  private int v;
  private boolean w;
  private boolean x;
  private boolean y;
  private int z;
  
  public d(Context paramContext)
  {
    super(paramContext, i1, i2);
    Object localObject = new android/util/SparseBooleanArray;
    ((SparseBooleanArray)localObject).<init>();
    A = ((SparseBooleanArray)localObject);
    localObject = new android/support/v7/widget/d$f;
    ((d.f)localObject).<init>(this);
    p = ((d.f)localObject);
  }
  
  public final p a(ViewGroup paramViewGroup)
  {
    Object localObject = g;
    p localp = super.a(paramViewGroup);
    if (localObject != localp)
    {
      localObject = localp;
      localObject = (ActionMenuView)localp;
      ((ActionMenuView)localObject).setPresenter(this);
    }
    return localp;
  }
  
  public final View a(j paramj, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramj.getActionView();
    if (localView != null)
    {
      bool1 = paramj.i();
      if (!bool1) {}
    }
    else
    {
      localView = super.a(paramj, paramView, paramViewGroup);
    }
    boolean bool1 = paramj.isActionViewExpanded();
    int i1;
    if (bool1) {
      i1 = 8;
    }
    for (;;)
    {
      localView.setVisibility(i1);
      paramViewGroup = (ActionMenuView)paramViewGroup;
      Object localObject = localView.getLayoutParams();
      boolean bool2 = paramViewGroup.checkLayoutParams((ViewGroup.LayoutParams)localObject);
      if (!bool2)
      {
        localObject = ActionMenuView.a((ViewGroup.LayoutParams)localObject);
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      return localView;
      i1 = 0;
      localObject = null;
    }
  }
  
  public final void a(Context paramContext, h paramh)
  {
    boolean bool1 = true;
    int i3 = 0;
    float f = 0.0F;
    d.d locald = null;
    super.a(paramContext, paramh);
    Resources localResources = paramContext.getResources();
    Object localObject1 = a.a(paramContext);
    boolean bool3 = s;
    DisplayMetrics localDisplayMetrics;
    int i2;
    Object localObject2;
    if (!bool3)
    {
      int i4 = Build.VERSION.SDK_INT;
      int i5 = 19;
      if (i4 >= i5) {
        r = bool1;
      }
    }
    else
    {
      bool1 = y;
      if (!bool1)
      {
        localDisplayMetrics = a.getResources().getDisplayMetrics();
        int i1 = widthPixels / 2;
        t = i1;
      }
      boolean bool2 = w;
      if (!bool2)
      {
        i2 = ((a)localObject1).a();
        v = i2;
      }
      i2 = t;
      boolean bool5 = r;
      if (!bool5) {
        break label311;
      }
      localObject1 = i;
      if (localObject1 == null)
      {
        localObject1 = new android/support/v7/widget/d$d;
        localObject2 = a;
        ((d.d)localObject1).<init>(this, (Context)localObject2);
        i = ((d.d)localObject1);
        bool5 = k;
        if (bool5)
        {
          localObject1 = i;
          localObject2 = j;
          ((d.d)localObject1).setImageDrawable((Drawable)localObject2);
          j = null;
          k = false;
        }
        i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
        localObject1 = i;
        ((d.d)localObject1).measure(i3, i3);
      }
      locald = i;
      i3 = locald.getMeasuredWidth();
      i2 -= i3;
    }
    for (;;)
    {
      u = i2;
      f = getDisplayMetricsdensity;
      i2 = (int)(56.0F * f);
      z = i2;
      B = null;
      return;
      localObject2 = ViewConfiguration.get(a);
      boolean bool4 = aa.a((ViewConfiguration)localObject2);
      if (!bool4) {
        break;
      }
      i2 = 0;
      localDisplayMetrics = null;
      break;
      label311:
      i = null;
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof d.g;
    if (!bool) {}
    for (;;)
    {
      return;
      paramParcelable = (d.g)paramParcelable;
      int i1 = a;
      if (i1 > 0)
      {
        Object localObject = c;
        int i2 = a;
        localObject = ((h)localObject).findItem(i2);
        if (localObject != null)
        {
          localObject = (u)((MenuItem)localObject).getSubMenu();
          a((u)localObject);
        }
      }
    }
  }
  
  public final void a(h paramh, boolean paramBoolean)
  {
    h();
    super.a(paramh, paramBoolean);
  }
  
  public final void a(j paramj, p.a parama)
  {
    parama.a(paramj);
    Object localObject = (ActionMenuView)g;
    parama = (ActionMenuItemView)parama;
    parama.setItemInvoker((h.b)localObject);
    localObject = C;
    if (localObject == null)
    {
      localObject = new android/support/v7/widget/d$b;
      ((d.b)localObject).<init>(this);
      C = ((d.b)localObject);
    }
    localObject = C;
    parama.setPopupCallback((ActionMenuItemView.b)localObject);
  }
  
  public final void a(ActionMenuView paramActionMenuView)
  {
    g = paramActionMenuView;
    h localh = c;
    a = localh;
  }
  
  public final void a(boolean paramBoolean)
  {
    int i1 = 1;
    float f = Float.MIN_VALUE;
    int i2 = 0;
    ActionMenuView.c localc = null;
    ((View)g).getParent();
    super.a(paramBoolean);
    ((View)g).requestLayout();
    Object localObject1 = c;
    if (localObject1 != null)
    {
      localObject1 = c;
      ((h)localObject1).i();
      ArrayList localArrayList = d;
      int i3 = localArrayList.size();
      int i6;
      for (int i4 = 0; i4 < i3; i4 = i6)
      {
        localObject1 = getd;
        if (localObject1 != null) {
          a = this;
        }
        i6 = i4 + 1;
      }
    }
    localObject1 = c;
    int i5;
    boolean bool2;
    label197:
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = c.j();
      boolean bool1 = r;
      if ((bool1) && (localObject1 != null))
      {
        i5 = ((ArrayList)localObject1).size();
        if (i5 != i1) {
          break label353;
        }
        localObject1 = (j)((ArrayList)localObject1).get(0);
        bool2 = ((j)localObject1).isActionViewExpanded();
        if (bool2) {
          break label344;
        }
        bool2 = i1;
        i2 = bool2;
      }
      if (i2 == 0) {
        break label374;
      }
      localObject1 = i;
      if (localObject1 == null)
      {
        localObject1 = new android/support/v7/widget/d$d;
        localObject2 = a;
        ((d.d)localObject1).<init>(this, (Context)localObject2);
        i = ((d.d)localObject1);
      }
      localObject1 = (ViewGroup)i.getParent();
      localObject2 = g;
      if (localObject1 != localObject2)
      {
        if (localObject1 != null)
        {
          localObject2 = i;
          ((ViewGroup)localObject1).removeView((View)localObject2);
        }
        localObject1 = (ActionMenuView)g;
        localObject2 = i;
        localc = ActionMenuView.a();
        ((ActionMenuView)localObject1).addView((View)localObject2, localc);
      }
    }
    for (;;)
    {
      localObject1 = (ActionMenuView)g;
      i1 = r;
      ((ActionMenuView)localObject1).setOverflowReserved(i1);
      return;
      bool2 = false;
      localObject1 = null;
      break;
      label344:
      bool2 = false;
      localObject1 = null;
      break label197;
      label353:
      if (i5 > 0) {}
      for (;;)
      {
        i2 = i1;
        break;
        i1 = 0;
        localObject2 = null;
        f = 0.0F;
      }
      label374:
      localObject1 = i;
      if (localObject1 != null)
      {
        localObject1 = i.getParent();
        localObject2 = g;
        if (localObject1 == localObject2)
        {
          localObject1 = (ViewGroup)g;
          localObject2 = i;
          ((ViewGroup)localObject1).removeView((View)localObject2);
        }
      }
    }
  }
  
  public final boolean a()
  {
    Object localObject1 = this;
    Object localObject2 = c;
    Object localObject3;
    int i1;
    int i2;
    Object localObject4;
    int i3;
    int i4;
    int i6;
    int i7;
    int i9;
    int i11;
    View localView1;
    int i14;
    Object localObject5;
    int i15;
    int i23;
    label92:
    int i24;
    if (localObject2 != null)
    {
      localObject2 = c;
      localObject3 = ((h)localObject2).h();
      i1 = ((ArrayList)localObject3).size();
      i2 = i1;
      localObject4 = localObject3;
      localObject1 = this;
      i3 = v;
      i4 = u;
      i1 = 0;
      i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
      localObject2 = (ViewGroup)g;
      i7 = 0;
      i9 = 0;
      i11 = 0;
      localView1 = null;
      i14 = 0;
      localObject5 = null;
      i15 = 0;
      localObject3 = null;
      i23 = 0;
      if (i23 >= i2) {
        break label214;
      }
      localObject3 = (j)((ArrayList)localObject4).get(i23);
      i24 = ((j)localObject3).h();
      if (i24 == 0) {
        break label188;
      }
      i7 += 1;
      label127:
      localObject1 = this;
      i24 = l;
      if (i24 == 0) {
        break label1083;
      }
      i15 = ((j)localObject3).isActionViewExpanded();
      if (i15 == 0) {
        break label1083;
      }
      i15 = 0;
      localObject3 = null;
    }
    for (;;)
    {
      i23 += 1;
      i3 = i15;
      break label92;
      i15 = 0;
      localObject3 = null;
      i1 = 0;
      localObject2 = null;
      i2 = 0;
      localObject4 = null;
      break;
      label188:
      i24 = ((j)localObject3).g();
      if (i24 != 0)
      {
        i9 += 1;
        break label127;
      }
      i14 = 1;
      break label127;
      label214:
      localObject1 = this;
      i15 = r;
      if (i15 != 0) {
        if (i14 == 0)
        {
          i16 = i7 + i9;
          if (i16 <= i3) {}
        }
        else
        {
          i3 += -1;
        }
      }
      i23 = i3 - i7;
      localObject1 = this;
      localObject1 = A;
      Object localObject6 = localObject1;
      ((SparseBooleanArray)localObject1).clear();
      int i16 = 0;
      localObject3 = null;
      i14 = 0;
      localObject5 = null;
      localObject1 = this;
      boolean bool1 = x;
      int i18;
      int i10;
      if (bool1)
      {
        i16 = z;
        i14 = i4 / i16;
        int i17 = z;
        i18 = i4 % i17;
        i10 = z;
        i10 = i18 / i14 + i10;
        i18 = i14;
      }
      for (;;)
      {
        i14 = 0;
        localObject5 = null;
        i3 = 0;
        i24 = 0;
        i7 = i18;
        int i20;
        if (i24 < i2)
        {
          localObject3 = ((ArrayList)localObject4).get(i24);
          localObject5 = localObject3;
          localObject5 = (j)localObject3;
          boolean bool2 = ((j)localObject5).h();
          if (bool2)
          {
            localObject1 = this;
            localObject3 = B;
            localView1 = a((j)localObject5, (View)localObject3, (ViewGroup)localObject2);
            localObject3 = B;
            if (localObject3 == null) {
              B = localView1;
            }
            localObject1 = this;
            bool2 = x;
            if (bool2)
            {
              localObject3 = null;
              int i19 = ActionMenuView.a(localView1, i10, i7, i6, 0);
              i20 = i7 - i19;
              label463:
              i7 = localView1.getMeasuredWidth();
              i11 = i4 - i7;
              if (i3 != 0) {
                break label1065;
              }
            }
          }
        }
        for (;;)
        {
          i3 = ((j)localObject5).getGroupId();
          if (i3 != 0)
          {
            i4 = 1;
            localObject1 = localObject6;
            ((SparseBooleanArray)localObject6).put(i3, i4);
          }
          ((j)localObject5).c(true);
          i14 = i11;
          i3 = i23;
          i11 = i24 + 1;
          i24 = i11;
          i4 = i14;
          i23 = i3;
          i3 = i7;
          i7 = i20;
          break;
          localView1.measure(i6, i6);
          i20 = i7;
          break label463;
          int i21 = ((j)localObject5).g();
          int i25;
          boolean bool3;
          label632:
          int i27;
          label720:
          int i5;
          int i12;
          if (i21 != 0)
          {
            i25 = ((j)localObject5).getGroupId();
            bool3 = ((SparseBooleanArray)localObject6).get(i25);
            if (((i23 > 0) || (bool3)) && (i4 > 0))
            {
              localObject1 = this;
              i21 = x;
              if ((i21 == 0) || (i7 > 0))
              {
                i21 = 1;
                if (i21 == 0) {
                  break label1054;
                }
                localObject1 = this;
                localView1 = B;
                localView1 = a((j)localObject5, localView1, (ViewGroup)localObject2);
                View localView2 = B;
                if (localView2 == null) {
                  B = localView1;
                }
                localObject1 = this;
                boolean bool5 = x;
                if (!bool5) {
                  break label849;
                }
                localView2 = null;
                i27 = ActionMenuView.a(localView1, i10, i7, i6, 0);
                i7 -= i27;
                if (i27 == 0)
                {
                  i21 = 0;
                  localObject3 = null;
                }
                i11 = localView1.getMeasuredWidth();
                i4 -= i11;
                if (i3 == 0) {
                  i3 = i11;
                }
                localObject1 = this;
                i12 = x;
                if (i12 == 0) {
                  break label870;
                }
                if (i5 < 0) {
                  break label861;
                }
                i12 = 1;
                label764:
                i21 &= i12;
                i27 = i21;
                i12 = i8;
              }
            }
          }
          for (;;)
          {
            if ((i27 != 0) && (i25 != 0))
            {
              localObject1 = localObject6;
              ((SparseBooleanArray)localObject6).put(i25, true);
              i21 = i23;
            }
            for (;;)
            {
              if (i27 != 0) {
                i21 += -1;
              }
              ((j)localObject5).c(i27);
              i8 = i3;
              i14 = i5;
              i3 = i22;
              i22 = i12;
              break;
              i22 = 0;
              localObject3 = null;
              break label632;
              label849:
              localView1.measure(i6, i6);
              break label720;
              label861:
              i12 = 0;
              localView1 = null;
              break label764;
              label870:
              i13 = i5 + i3;
              if (i13 > 0) {
                i13 = 1;
              }
              for (;;)
              {
                i22 &= i13;
                i27 = i22;
                i13 = i8;
                break;
                i13 = 0;
                localView1 = null;
              }
              if (bool3)
              {
                localObject1 = localObject6;
                ((SparseBooleanArray)localObject6).put(i25, false);
                i22 = 0;
                localObject3 = null;
                i8 = i23;
                i23 = 0;
                for (;;)
                {
                  if (i23 < i24)
                  {
                    localObject3 = (j)((ArrayList)localObject4).get(i23);
                    int i26 = ((j)localObject3).getGroupId();
                    if (i26 == i25)
                    {
                      boolean bool4 = ((j)localObject3).f();
                      if (bool4) {
                        i8 += 1;
                      }
                      bool4 = false;
                      localObject1 = null;
                      ((j)localObject3).c(false);
                    }
                    i22 = i23 + 1;
                    i23 = i22;
                    continue;
                    localObject3 = null;
                    ((j)localObject5).c(false);
                    i22 = i8;
                    i14 = i5;
                    i8 = i3;
                    i3 = i23;
                    break;
                    return true;
                  }
                }
                i22 = i8;
              }
              else
              {
                i22 = i23;
              }
            }
            label1054:
            i27 = i22;
            int i13 = i8;
          }
          label1065:
          int i8 = i3;
        }
        i10 = 0;
        i22 = 0;
        localObject3 = null;
      }
      label1083:
      int i22 = i3;
    }
  }
  
  public final boolean a(u paramu)
  {
    int i1 = 1;
    boolean bool1 = false;
    Context localContext = null;
    boolean bool2 = paramu.hasVisibleItems();
    if (!bool2) {
      return bool1;
    }
    Object localObject2;
    Object localObject3;
    for (Object localObject1 = paramu;; localObject1 = (u)m)
    {
      localObject2 = m;
      localObject3 = c;
      if (localObject2 == localObject3) {
        break;
      }
    }
    MenuItem localMenuItem = ((u)localObject1).getItem();
    localObject1 = (ViewGroup)g;
    int i5;
    label90:
    label141:
    int i2;
    if (localObject1 != null)
    {
      int i4 = ((ViewGroup)localObject1).getChildCount();
      i5 = 0;
      Object localObject4 = null;
      if (i5 < i4)
      {
        localObject3 = ((ViewGroup)localObject1).getChildAt(i5);
        boolean bool4 = localObject3 instanceof p.a;
        if (bool4)
        {
          localObject2 = localObject3;
          localObject2 = ((p.a)localObject3).getItemData();
          if (localObject2 == localMenuItem)
          {
            if (localObject3 == null) {
              break label316;
            }
            i2 = paramu.getItem().getItemId();
            q = i2;
            int i6 = paramu.size();
            i2 = 0;
            localObject1 = null;
            label175:
            if (i2 >= i6) {
              break label338;
            }
            localObject4 = paramu.getItem(i2);
            boolean bool5 = ((MenuItem)localObject4).isVisible();
            if (!bool5) {
              break label318;
            }
            localObject4 = ((MenuItem)localObject4).getIcon();
            if (localObject4 == null) {
              break label318;
            }
            i2 = i1;
          }
        }
      }
    }
    for (;;)
    {
      localObject2 = new android/support/v7/widget/d$a;
      localContext = b;
      ((d.a)localObject2).<init>(this, localContext, paramu, (View)localObject3);
      n = ((d.a)localObject2);
      localObject2 = n;
      ((d.a)localObject2).a(i2);
      localObject1 = n;
      boolean bool3 = ((n)localObject1).b();
      if (!bool3)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>("MenuPopupHelper cannot be used without an anchor");
        throw ((Throwable)localObject1);
        int i7 = i5 + 1;
        i5 = i7;
        break label90;
        localObject3 = null;
        break label141;
        label316:
        break;
        label318:
        bool3 += true;
        break label175;
      }
      super.a(paramu);
      bool1 = i1;
      break;
      label338:
      int i3 = 0;
      localObject1 = null;
    }
  }
  
  public final boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    View localView = paramViewGroup.getChildAt(paramInt);
    d.d locald = i;
    boolean bool;
    if (localView == locald)
    {
      bool = false;
      localView = null;
    }
    for (;;)
    {
      return bool;
      bool = super.a(paramViewGroup, paramInt);
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    h localh;
    if (paramBoolean)
    {
      localh = null;
      super.a(null);
    }
    for (;;)
    {
      return;
      localh = c;
      if (localh != null)
      {
        localh = c;
        localh.b(false);
      }
    }
  }
  
  public final Parcelable c()
  {
    d.g localg = new android/support/v7/widget/d$g;
    localg.<init>();
    int i1 = q;
    a = i1;
    return localg;
  }
  
  public final boolean c(j paramj)
  {
    return paramj.f();
  }
  
  public final void d()
  {
    boolean bool1 = w;
    if (!bool1)
    {
      localObject = a.a(b);
      int i1 = ((a)localObject).a();
      v = i1;
    }
    Object localObject = c;
    if (localObject != null)
    {
      localObject = c;
      boolean bool2 = true;
      ((h)localObject).a(bool2);
    }
  }
  
  public final void e()
  {
    boolean bool = true;
    r = bool;
    s = bool;
  }
  
  public final boolean f()
  {
    boolean bool = r;
    Object localObject1;
    if (bool)
    {
      bool = j();
      if (!bool)
      {
        localObject1 = c;
        if (localObject1 != null)
        {
          localObject1 = g;
          if (localObject1 != null)
          {
            localObject1 = o;
            if (localObject1 == null)
            {
              localObject1 = c.j();
              bool = ((ArrayList)localObject1).isEmpty();
              if (!bool)
              {
                localObject1 = new android/support/v7/widget/d$e;
                Object localObject2 = b;
                h localh = c;
                d.d locald = i;
                ((d.e)localObject1).<init>(this, (Context)localObject2, localh, locald);
                localObject2 = new android/support/v7/widget/d$c;
                ((d.c)localObject2).<init>(this, (d.e)localObject1);
                o = ((d.c)localObject2);
                localObject1 = (View)g;
                localObject2 = o;
                ((View)localObject1).post((Runnable)localObject2);
                localObject1 = null;
                super.a(null);
                bool = true;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
    }
  }
  
  public final boolean g()
  {
    boolean bool1 = true;
    Object localObject = o;
    boolean bool2;
    if (localObject != null)
    {
      localObject = g;
      if (localObject != null)
      {
        localObject = (View)g;
        d.c localc = o;
        ((View)localObject).removeCallbacks(localc);
        localObject = null;
        o = null;
        bool2 = bool1;
      }
    }
    for (;;)
    {
      return bool2;
      localObject = m;
      if (localObject != null)
      {
        ((n)localObject).c();
        bool2 = bool1;
      }
      else
      {
        bool2 = false;
        localObject = null;
      }
    }
  }
  
  public final boolean h()
  {
    boolean bool1 = g();
    boolean bool2 = i();
    return bool1 | bool2;
  }
  
  public final boolean i()
  {
    d.a locala = n;
    boolean bool;
    if (locala != null)
    {
      locala = n;
      locala.c();
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      locala = null;
    }
  }
  
  public final boolean j()
  {
    d.e locale = m;
    boolean bool;
    if (locale != null)
    {
      locale = m;
      bool = locale.e();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      locale = null;
    }
  }
}


/* Location:              android/support/v7/widget/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */