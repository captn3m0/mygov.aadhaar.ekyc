package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.h.aa;
import android.support.v4.h.e;
import android.support.v4.h.e.a;
import android.support.v7.a.a.a;
import android.support.v7.a.a.g;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.ActionMenuItemView.b;
import android.support.v7.view.menu.b;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.n;
import android.support.v7.view.menu.o.a;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.p.a;
import android.support.v7.view.menu.s;
import android.support.v7.view.menu.u;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;

final class d
  extends b
  implements e.a
{
  private final SparseBooleanArray A = new SparseBooleanArray();
  private View B;
  private b C;
  d i;
  Drawable j;
  boolean k;
  boolean l;
  e m;
  a n;
  c o;
  final f p = new f();
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
    super(paramContext, a.g.abc_action_menu_layout, a.g.abc_action_menu_item_layout);
  }
  
  public final p a(ViewGroup paramViewGroup)
  {
    p localp = g;
    paramViewGroup = super.a(paramViewGroup);
    if (localp != paramViewGroup) {
      ((ActionMenuView)paramViewGroup).setPresenter(this);
    }
    return paramViewGroup;
  }
  
  public final View a(j paramj, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramj.getActionView();
    if ((localView == null) || (paramj.i())) {
      localView = super.a(paramj, paramView, paramViewGroup);
    }
    if (paramj.isActionViewExpanded()) {}
    for (int i1 = 8;; i1 = 0)
    {
      localView.setVisibility(i1);
      paramj = (ActionMenuView)paramViewGroup;
      paramView = localView.getLayoutParams();
      if (!paramj.checkLayoutParams(paramView)) {
        localView.setLayoutParams(ActionMenuView.a(paramView));
      }
      return localView;
    }
  }
  
  public final void a(Context paramContext, h paramh)
  {
    boolean bool = true;
    super.a(paramContext, paramh);
    paramh = paramContext.getResources();
    paramContext = android.support.v7.view.a.a(paramContext);
    int i1;
    if (!s)
    {
      if (Build.VERSION.SDK_INT >= 19) {
        r = bool;
      }
    }
    else
    {
      if (!y) {
        t = (a.getResources().getDisplayMetrics().widthPixels / 2);
      }
      if (!w) {
        v = paramContext.a();
      }
      i1 = t;
      if (!r) {
        break label217;
      }
      if (i == null)
      {
        i = new d(a);
        if (k)
        {
          i.setImageDrawable(j);
          j = null;
          k = false;
        }
        int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        i.measure(i2, i2);
      }
      i1 -= i.getMeasuredWidth();
    }
    for (;;)
    {
      u = i1;
      z = ((int)(56.0F * getDisplayMetricsdensity));
      B = null;
      return;
      if (!aa.a(ViewConfiguration.get(a))) {
        break;
      }
      bool = false;
      break;
      label217:
      i = null;
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof g)) {}
    do
    {
      do
      {
        return;
        paramParcelable = (g)paramParcelable;
      } while (a <= 0);
      paramParcelable = c.findItem(a);
    } while (paramParcelable == null);
    a((u)paramParcelable.getSubMenu());
  }
  
  public final void a(h paramh, boolean paramBoolean)
  {
    h();
    super.a(paramh, paramBoolean);
  }
  
  public final void a(j paramj, p.a parama)
  {
    parama.a(paramj);
    paramj = (ActionMenuView)g;
    parama = (ActionMenuItemView)parama;
    parama.setItemInvoker(paramj);
    if (C == null) {
      C = new b();
    }
    parama.setPopupCallback(C);
  }
  
  public final void a(ActionMenuView paramActionMenuView)
  {
    g = paramActionMenuView;
    a = c;
  }
  
  public final void a(boolean paramBoolean)
  {
    int i2 = 1;
    int i3 = 0;
    ((View)g).getParent();
    super.a(paramBoolean);
    ((View)g).requestLayout();
    Object localObject;
    int i1;
    if (c != null)
    {
      localObject = c;
      ((h)localObject).i();
      localObject = d;
      int i4 = ((ArrayList)localObject).size();
      i1 = 0;
      while (i1 < i4)
      {
        e locale = getd;
        if (locale != null) {
          a = this;
        }
        i1 += 1;
      }
    }
    if (c != null)
    {
      localObject = c.j();
      i1 = i3;
      if (r)
      {
        i1 = i3;
        if (localObject != null)
        {
          i1 = ((ArrayList)localObject).size();
          if (i1 != 1) {
            break label270;
          }
          if (((j)((ArrayList)localObject).get(0)).isActionViewExpanded()) {
            break label265;
          }
          i1 = 1;
        }
      }
      label165:
      if (i1 == 0) {
        break label284;
      }
      if (i == null) {
        i = new d(a);
      }
      localObject = (ViewGroup)i.getParent();
      if (localObject != g)
      {
        if (localObject != null) {
          ((ViewGroup)localObject).removeView(i);
        }
        ((ActionMenuView)g).addView(i, ActionMenuView.a());
      }
    }
    for (;;)
    {
      ((ActionMenuView)g).setOverflowReserved(r);
      return;
      localObject = null;
      break;
      label265:
      i1 = 0;
      break label165;
      label270:
      if (i1 > 0) {}
      for (i1 = i2;; i1 = 0) {
        break;
      }
      label284:
      if ((i != null) && (i.getParent() == g)) {
        ((ViewGroup)g).removeView(i);
      }
    }
  }
  
  public final boolean a()
  {
    ArrayList localArrayList;
    int i6;
    int i1;
    int i9;
    int i10;
    ViewGroup localViewGroup;
    int i3;
    int i4;
    int i5;
    int i2;
    label60:
    Object localObject1;
    if (c != null)
    {
      localArrayList = c.h();
      i6 = localArrayList.size();
      i1 = v;
      i9 = u;
      i10 = View.MeasureSpec.makeMeasureSpec(0, 0);
      localViewGroup = (ViewGroup)g;
      i3 = 0;
      i4 = 0;
      i5 = 0;
      i2 = 0;
      if (i2 >= i6) {
        break label145;
      }
      localObject1 = (j)localArrayList.get(i2);
      if (!((j)localObject1).h()) {
        break label122;
      }
      i3 += 1;
      label89:
      if ((!l) || (!((j)localObject1).isActionViewExpanded())) {
        break label826;
      }
      i1 = 0;
    }
    label122:
    label145:
    label318:
    label463:
    label535:
    label574:
    label647:
    label659:
    label664:
    label804:
    label815:
    label826:
    for (;;)
    {
      i2 += 1;
      break label60;
      i6 = 0;
      localArrayList = null;
      break;
      if (((j)localObject1).g())
      {
        i4 += 1;
        break label89;
      }
      i5 = 1;
      break label89;
      i2 = i1;
      if (r) {
        if (i5 == 0)
        {
          i2 = i1;
          if (i3 + i4 <= i1) {}
        }
        else
        {
          i2 = i1 - 1;
        }
      }
      i2 -= i3;
      localObject1 = A;
      ((SparseBooleanArray)localObject1).clear();
      int i7;
      if (x)
      {
        i1 = i9 / z;
        i3 = z;
        i4 = z;
        i7 = i9 % i3 / i1 + i4;
      }
      for (;;)
      {
        i5 = 0;
        int i8 = 0;
        i3 = i1;
        i1 = i2;
        i4 = i9;
        i2 = i5;
        j localj;
        Object localObject2;
        if (i8 < i6)
        {
          localj = (j)localArrayList.get(i8);
          if (localj.h())
          {
            localObject2 = a(localj, B, localViewGroup);
            if (B == null) {
              B = ((View)localObject2);
            }
            if (x)
            {
              i5 = i3 - ActionMenuView.a((View)localObject2, i7, i3, i10, 0);
              i3 = ((View)localObject2).getMeasuredWidth();
              if (i2 != 0) {
                break label815;
              }
              i2 = i3;
            }
          }
        }
        for (;;)
        {
          i9 = localj.getGroupId();
          if (i9 != 0) {
            ((SparseBooleanArray)localObject1).put(i9, true);
          }
          localj.c(true);
          i3 = i4 - i3;
          i4 = i1;
          i1 = i5;
          i9 = i8 + 1;
          i5 = i3;
          i8 = i4;
          i3 = i1;
          i4 = i5;
          i1 = i8;
          i8 = i9;
          break;
          ((View)localObject2).measure(i10, i10);
          i5 = i3;
          break label318;
          int i11;
          boolean bool;
          int i12;
          if (localj.g())
          {
            i11 = localj.getGroupId();
            bool = ((SparseBooleanArray)localObject1).get(i11);
            if (((i1 > 0) || (bool)) && (i4 > 0) && ((!x) || (i3 > 0)))
            {
              i12 = 1;
              if (i12 == 0) {
                break label804;
              }
              localObject2 = a(localj, B, localViewGroup);
              if (B == null) {
                B = ((View)localObject2);
              }
              if (!x) {
                break label647;
              }
              i9 = ActionMenuView.a((View)localObject2, i7, i3, i10, 0);
              i5 = i3 - i9;
              i3 = i5;
              if (i9 == 0)
              {
                i12 = 0;
                i3 = i5;
              }
              i9 = ((View)localObject2).getMeasuredWidth();
              i4 -= i9;
              i5 = i2;
              if (i2 == 0) {
                i5 = i9;
              }
              if (!x) {
                break label664;
              }
              if (i4 < 0) {
                break label659;
              }
              i2 = 1;
              i12 &= i2;
              i2 = i3;
              i3 = i5;
            }
          }
          for (;;)
          {
            if ((i12 != 0) && (i11 != 0)) {
              ((SparseBooleanArray)localObject1).put(i11, true);
            }
            for (;;)
            {
              i5 = i1;
              if (i12 != 0) {
                i5 = i1 - 1;
              }
              localj.c(i12);
              i9 = i3;
              i3 = i4;
              i4 = i5;
              i1 = i2;
              i2 = i9;
              break;
              int i13 = 0;
              break label463;
              ((View)localObject2).measure(i10, i10);
              break label535;
              i2 = 0;
              break label574;
              if (i4 + i5 > 0) {}
              for (i2 = 1;; i2 = 0)
              {
                i13 &= i2;
                i2 = i3;
                i3 = i5;
                break;
              }
              if (bool)
              {
                ((SparseBooleanArray)localObject1).put(i11, false);
                i9 = 0;
                for (;;)
                {
                  if (i9 < i8)
                  {
                    localObject2 = (j)localArrayList.get(i9);
                    i5 = i1;
                    if (((j)localObject2).getGroupId() == i11)
                    {
                      i5 = i1;
                      if (((j)localObject2).f()) {
                        i5 = i1 + 1;
                      }
                      ((j)localObject2).c(false);
                    }
                    i9 += 1;
                    i1 = i5;
                    continue;
                    localj.c(false);
                    i5 = i1;
                    i1 = i3;
                    i3 = i4;
                    i4 = i5;
                    break;
                    return true;
                  }
                }
              }
            }
            i5 = i3;
            i3 = i2;
            i2 = i5;
          }
        }
        i7 = 0;
        i1 = 0;
      }
    }
  }
  
  public final boolean a(u paramu)
  {
    if (!paramu.hasVisibleItems()) {
      return false;
    }
    for (Object localObject = paramu; m != c; localObject = (u)m) {}
    MenuItem localMenuItem = ((u)localObject).getItem();
    ViewGroup localViewGroup = (ViewGroup)g;
    int i1;
    if (localViewGroup != null)
    {
      int i2 = localViewGroup.getChildCount();
      i1 = 0;
      label66:
      if (i1 < i2)
      {
        localObject = localViewGroup.getChildAt(i1);
        if (((localObject instanceof p.a)) && (((p.a)localObject).getItemData() == localMenuItem))
        {
          label102:
          if (localObject == null) {
            break label222;
          }
          q = paramu.getItem().getItemId();
          i2 = paramu.size();
          i1 = 0;
          label127:
          if (i1 >= i2) {
            break label239;
          }
          localMenuItem = paramu.getItem(i1);
          if ((!localMenuItem.isVisible()) || (localMenuItem.getIcon() == null)) {
            break label224;
          }
        }
      }
    }
    label222:
    label224:
    label239:
    for (boolean bool = true;; bool = false)
    {
      n = new a(b, paramu, (View)localObject);
      n.a(bool);
      if (!n.b())
      {
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        i1 += 1;
        break label66;
        localObject = null;
        break label102;
        break;
        i1 += 1;
        break label127;
      }
      super.a(paramu);
      return true;
    }
  }
  
  public final boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramViewGroup.getChildAt(paramInt) == i) {
      return false;
    }
    return super.a(paramViewGroup, paramInt);
  }
  
  public final void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      super.a(null);
    }
    while (c == null) {
      return;
    }
    c.b(false);
  }
  
  public final Parcelable c()
  {
    g localg = new g();
    a = q;
    return localg;
  }
  
  public final boolean c(j paramj)
  {
    return paramj.f();
  }
  
  public final void d()
  {
    if (!w) {
      v = android.support.v7.view.a.a(b).a();
    }
    if (c != null) {
      c.a(true);
    }
  }
  
  public final void e()
  {
    r = true;
    s = true;
  }
  
  public final boolean f()
  {
    if ((r) && (!j()) && (c != null) && (g != null) && (o == null) && (!c.j().isEmpty()))
    {
      o = new c(new e(b, c, i));
      ((View)g).post(o);
      super.a(null);
      return true;
    }
    return false;
  }
  
  public final boolean g()
  {
    if ((o != null) && (g != null))
    {
      ((View)g).removeCallbacks(o);
      o = null;
      return true;
    }
    e locale = m;
    if (locale != null)
    {
      locale.c();
      return true;
    }
    return false;
  }
  
  public final boolean h()
  {
    return g() | i();
  }
  
  public final boolean i()
  {
    if (n != null)
    {
      n.c();
      return true;
    }
    return false;
  }
  
  public final boolean j()
  {
    return (m != null) && (m.e());
  }
  
  private final class a
    extends n
  {
    public a(Context paramContext, u paramu, View paramView)
    {
      super(paramu, paramView, false, a.a.actionOverflowMenuStyle);
      if (!((j)paramu.getItem()).f()) {
        if (i != null) {
          break label59;
        }
      }
      label59:
      for (paramContext = (View)d.c(d.this);; paramContext = i)
      {
        a = paramContext;
        a(p);
        return;
      }
    }
    
    protected final void d()
    {
      n = null;
      q = 0;
      super.d();
    }
  }
  
  private final class b
    extends ActionMenuItemView.b
  {
    b() {}
    
    public final s a()
    {
      if (n != null) {
        return n.a();
      }
      return null;
    }
  }
  
  private final class c
    implements Runnable
  {
    private d.e b;
    
    public c(d.e parame)
    {
      b = parame;
    }
    
    public final void run()
    {
      if (d.d(d.this) != null)
      {
        localObject = d.e(d.this);
        if (b != null) {
          b.a((h)localObject);
        }
      }
      Object localObject = (View)d.f(d.this);
      if ((localObject != null) && (((View)localObject).getWindowToken() != null) && (b.b())) {
        m = b;
      }
      o = null;
    }
  }
  
  private final class d
    extends q
    implements ActionMenuView.a
  {
    private final float[] b = new float[2];
    
    public d(Context paramContext)
    {
      super(null, a.a.actionOverflowButtonStyle);
      setClickable(true);
      setFocusable(true);
      setVisibility(0);
      setEnabled(true);
      setOnTouchListener(new aj(this)
      {
        public final s a()
        {
          if (m == null) {
            return null;
          }
          return m.a();
        }
        
        public final boolean b()
        {
          f();
          return true;
        }
        
        public final boolean c()
        {
          if (o != null) {
            return false;
          }
          g();
          return true;
        }
      });
    }
    
    public final boolean c()
    {
      return false;
    }
    
    public final boolean d()
    {
      return false;
    }
    
    public final boolean performClick()
    {
      if (super.performClick()) {
        return true;
      }
      playSoundEffect(0);
      f();
      return true;
    }
    
    protected final boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
      Drawable localDrawable1 = getDrawable();
      Drawable localDrawable2 = getBackground();
      if ((localDrawable1 != null) && (localDrawable2 != null))
      {
        int i = getWidth();
        paramInt2 = getHeight();
        paramInt1 = Math.max(i, paramInt2) / 2;
        int j = getPaddingLeft();
        int k = getPaddingRight();
        paramInt3 = getPaddingTop();
        paramInt4 = getPaddingBottom();
        i = (i + (j - k)) / 2;
        paramInt2 = (paramInt2 + (paramInt3 - paramInt4)) / 2;
        android.support.v4.d.a.a.a(localDrawable2, i - paramInt1, paramInt2 - paramInt1, i + paramInt1, paramInt2 + paramInt1);
      }
      return bool;
    }
  }
  
  private final class e
    extends n
  {
    public e(Context paramContext, h paramh, View paramView)
    {
      super(paramh, paramView, true, a.a.actionOverflowMenuStyle);
      b = 8388613;
      a(p);
    }
    
    protected final void d()
    {
      if (d.a(d.this) != null) {
        d.b(d.this).close();
      }
      m = null;
      super.d();
    }
  }
  
  private final class f
    implements o.a
  {
    f() {}
    
    public final void a(h paramh, boolean paramBoolean)
    {
      if ((paramh instanceof u)) {
        paramh.k().b(false);
      }
      o.a locala = f;
      if (locala != null) {
        locala.a(paramh, paramBoolean);
      }
    }
    
    public final boolean a(h paramh)
    {
      if (paramh == null) {
        return false;
      }
      q = ((u)paramh).getItem().getItemId();
      o.a locala = f;
      if (locala != null) {
        return locala.a(paramh);
      }
      return false;
    }
  }
  
  private static final class g
    implements Parcelable
  {
    public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator() {};
    public int a;
    
    g() {}
    
    g(Parcel paramParcel)
    {
      a = paramParcel.readInt();
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(a);
    }
  }
}


/* Location:              android/support/v7/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */