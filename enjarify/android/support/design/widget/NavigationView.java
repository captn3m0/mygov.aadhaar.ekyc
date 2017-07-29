package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.a.g;
import android.support.design.a.h;
import android.support.design.a.i;
import android.support.design.internal.NavigationMenuView;
import android.support.design.internal.c;
import android.support.design.internal.c.b;
import android.support.design.internal.f;
import android.support.v4.h.al;
import android.support.v4.h.w;
import android.support.v7.a.a.a;
import android.support.v7.view.g;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.o;
import android.support.v7.widget.at.a;
import android.support.v7.widget.bf;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class NavigationView
  extends f
{
  private static final int[] d;
  private static final int[] e;
  NavigationView.a c;
  private final android.support.design.internal.b f;
  private final c g;
  private int h;
  private MenuInflater i;
  
  static
  {
    int j = 1;
    int[] arrayOfInt = new int[j];
    arrayOfInt[0] = 16842912;
    d = arrayOfInt;
    arrayOfInt = new int[j];
    arrayOfInt[0] = -16842910;
    e = arrayOfInt;
  }
  
  public NavigationView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NavigationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NavigationView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = new android/support/design/internal/c;
    ((c)localObject1).<init>();
    g = ((c)localObject1);
    p.a(paramContext);
    localObject1 = new android/support/design/internal/b;
    ((android.support.design.internal.b)localObject1).<init>(paramContext);
    f = ((android.support.design.internal.b)localObject1);
    localObject1 = a.i.NavigationView;
    int k = a.h.Widget_Design_NavigationView;
    bf localbf = bf.a(paramContext, paramAttributeSet, (int[])localObject1, paramInt, k);
    int n = a.i.NavigationView_android_background;
    localObject1 = localbf.a(n);
    w.a(this, (Drawable)localObject1);
    n = a.i.NavigationView_elevation;
    boolean bool2 = localbf.e(n);
    float f1;
    if (bool2)
    {
      i1 = a.i.NavigationView_elevation;
      i1 = localbf.e(i1, 0);
      f1 = i1;
      w.d(this, f1);
    }
    int i1 = a.i.NavigationView_android_fitsSystemWindows;
    boolean bool3 = localbf.a(i1, false);
    w.a(this, bool3);
    int i2 = a.i.NavigationView_android_maxWidth;
    i2 = localbf.e(i2, 0);
    h = i2;
    i2 = a.i.NavigationView_itemIconTint;
    boolean bool4 = localbf.e(i2);
    int i3;
    int m;
    boolean bool7;
    if (bool4)
    {
      i3 = a.i.NavigationView_itemIconTint;
      localObject1 = localbf.d(i3);
      k = a.i.NavigationView_itemTextAppearance;
      boolean bool1 = localbf.e(k);
      if (!bool1) {
        break label826;
      }
      m = a.i.NavigationView_itemTextAppearance;
      m = localbf.g(m, 0);
      bool7 = j;
    }
    for (;;)
    {
      int i7 = 0;
      Object localObject2 = null;
      int i8 = a.i.NavigationView_itemTextColor;
      boolean bool8 = localbf.e(i8);
      if (bool8)
      {
        i7 = a.i.NavigationView_itemTextColor;
        localObject2 = localbf.d(i7);
      }
      if ((!bool7) && (localObject2 == null))
      {
        i7 = 16842806;
        localObject2 = a(i7);
      }
      int i9 = a.i.NavigationView_itemBackground;
      Drawable localDrawable = localbf.a(i9);
      Object localObject3 = f;
      Object localObject4 = new android/support/design/widget/NavigationView$1;
      ((NavigationView.1)localObject4).<init>(this);
      ((android.support.design.internal.b)localObject3).a((h.a)localObject4);
      g.d = j;
      localObject3 = g;
      localObject4 = f;
      ((c)localObject3).a(paramContext, (h)localObject4);
      localObject3 = g;
      ((c)localObject3).a((ColorStateList)localObject1);
      if (bool7)
      {
        localObject1 = g;
        ((c)localObject1).a(m);
      }
      g.b((ColorStateList)localObject2);
      g.a(localDrawable);
      localObject1 = f;
      Object localObject5 = g;
      ((android.support.design.internal.b)localObject1).a((o)localObject5);
      localObject5 = g;
      localObject1 = a;
      if (localObject1 == null)
      {
        localObject1 = f;
        i6 = a.g.design_navigation_menu;
        localObject1 = (NavigationMenuView)((LayoutInflater)localObject1).inflate(i6, this, false);
        a = ((NavigationMenuView)localObject1);
        localObject1 = e;
        if (localObject1 == null)
        {
          localObject1 = new android/support/design/internal/c$b;
          ((c.b)localObject1).<init>((c)localObject5);
          e = ((c.b)localObject1);
        }
        localObject1 = f;
        i6 = a.g.design_navigation_item_header;
        localObject2 = a;
        localObject1 = (LinearLayout)((LayoutInflater)localObject1).inflate(i6, (ViewGroup)localObject2, false);
        b = ((LinearLayout)localObject1);
        localObject1 = a;
        localObject6 = e;
        ((NavigationMenuView)localObject1).setAdapter((at.a)localObject6);
      }
      localObject1 = (View)a;
      addView((View)localObject1);
      i3 = a.i.NavigationView_menu;
      boolean bool5 = localbf.e(i3);
      if (bool5)
      {
        i4 = a.i.NavigationView_menu;
        i4 = localbf.g(i4, 0);
        g.b(j);
        localObject5 = getMenuInflater();
        localObject6 = f;
        ((MenuInflater)localObject5).inflate(i4, (Menu)localObject6);
        g.b(false);
        localObject1 = g;
        ((c)localObject1).a(false);
      }
      int i4 = a.i.NavigationView_headerLayout;
      boolean bool6 = localbf.e(i4);
      if (bool6)
      {
        i5 = a.i.NavigationView_headerLayout;
        i5 = localbf.g(i5, 0);
        localObject5 = g;
        localObject6 = f;
        LinearLayout localLinearLayout = b;
        localObject1 = ((LayoutInflater)localObject6).inflate(i5, localLinearLayout, false);
        localObject6 = b;
        ((LinearLayout)localObject6).addView((View)localObject1);
        localObject1 = a;
        localObject5 = a;
        m = ((NavigationMenuView)localObject5).getPaddingBottom();
        ((NavigationMenuView)localObject1).setPadding(0, 0, 0, m);
      }
      a.recycle();
      return;
      int i5 = 16842808;
      f1 = 2.3693715E-38F;
      localObject1 = a(i5);
      break;
      label826:
      m = 0;
      localObject5 = null;
      int i6 = 0;
      Object localObject6 = null;
    }
  }
  
  private ColorStateList a(int paramInt)
  {
    ColorStateList localColorStateList = null;
    int j = 3;
    int k = 2;
    boolean bool1 = true;
    TypedValue localTypedValue = new android/util/TypedValue;
    localTypedValue.<init>();
    Object localObject = getContext().getTheme();
    boolean bool2 = ((Resources.Theme)localObject).resolveAttribute(paramInt, localTypedValue, bool1);
    if (!bool2) {}
    for (;;)
    {
      return localColorStateList;
      localObject = getContext();
      int n = resourceId;
      localObject = android.support.v7.b.a.b.a((Context)localObject, n);
      Resources.Theme localTheme = getContext().getTheme();
      int i2 = a.a.colorPrimary;
      boolean bool3 = localTheme.resolveAttribute(i2, localTypedValue, bool1);
      if (bool3)
      {
        int i3 = data;
        int i1 = ((ColorStateList)localObject).getDefaultColor();
        localColorStateList = new android/content/res/ColorStateList;
        int[][] arrayOfInt = new int[j][];
        int[] arrayOfInt1 = e;
        arrayOfInt[0] = arrayOfInt1;
        arrayOfInt1 = d;
        arrayOfInt[bool1] = arrayOfInt1;
        arrayOfInt1 = EMPTY_STATE_SET;
        arrayOfInt[k] = arrayOfInt1;
        arrayOfInt1 = new int[j];
        int[] arrayOfInt2 = e;
        int m = ((ColorStateList)localObject).getColorForState(arrayOfInt2, i1);
        arrayOfInt1[0] = m;
        arrayOfInt1[bool1] = i3;
        arrayOfInt1[k] = i1;
        localColorStateList.<init>(arrayOfInt, arrayOfInt1);
      }
    }
  }
  
  private MenuInflater getMenuInflater()
  {
    Object localObject = i;
    if (localObject == null)
    {
      localObject = new android/support/v7/view/g;
      Context localContext = getContext();
      ((g)localObject).<init>(localContext);
      i = ((MenuInflater)localObject);
    }
    return i;
  }
  
  protected final void a(al paramal)
  {
    c localc = g;
    int j = paramal.b();
    int k = l;
    if (k != j)
    {
      l = j;
      Object localObject = b;
      j = ((LinearLayout)localObject).getChildCount();
      if (j == 0)
      {
        localObject = a;
        k = l;
        NavigationMenuView localNavigationMenuView = a;
        int m = localNavigationMenuView.getPaddingBottom();
        ((NavigationMenuView)localObject).setPadding(0, k, 0, m);
      }
    }
    w.b(b, paramal);
  }
  
  public int getHeaderCount()
  {
    return g.b.getChildCount();
  }
  
  public Drawable getItemBackground()
  {
    return g.k;
  }
  
  public ColorStateList getItemIconTintList()
  {
    return g.j;
  }
  
  public ColorStateList getItemTextColor()
  {
    return g.i;
  }
  
  public Menu getMenu()
  {
    return f;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int j = 1073741824;
    int k = View.MeasureSpec.getMode(paramInt1);
    switch (k)
    {
    }
    for (;;)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
      k = View.MeasureSpec.getSize(paramInt1);
      int m = h;
      k = Math.min(k, m);
      paramInt1 = View.MeasureSpec.makeMeasureSpec(k, j);
      continue;
      k = h;
      paramInt1 = View.MeasureSpec.makeMeasureSpec(k, j);
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof NavigationView.b;
    if (!bool) {
      super.onRestoreInstanceState(paramParcelable);
    }
    android.support.design.internal.b localb;
    Object localObject2;
    SparseArray localSparseArray;
    do
    {
      do
      {
        return;
        paramParcelable = (NavigationView.b)paramParcelable;
        localObject1 = e;
        super.onRestoreInstanceState((Parcelable)localObject1);
        localb = f;
        localObject1 = a;
        localObject2 = "android:menu:presenters";
        localSparseArray = ((Bundle)localObject1).getSparseParcelableArray((String)localObject2);
      } while (localSparseArray == null);
      localObject1 = j;
      bool = ((CopyOnWriteArrayList)localObject1).isEmpty();
    } while (bool);
    Object localObject1 = j;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject1).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (WeakReference)localIterator.next();
      localObject2 = (o)((WeakReference)localObject1).get();
      if (localObject2 == null)
      {
        localObject2 = j;
        ((CopyOnWriteArrayList)localObject2).remove(localObject1);
      }
      else
      {
        int j = ((o)localObject2).b();
        if (j > 0)
        {
          localObject1 = (Parcelable)localSparseArray.get(j);
          if (localObject1 != null) {
            ((o)localObject2).a((Parcelable)localObject1);
          }
        }
      }
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    Object localObject = super.onSaveInstanceState();
    NavigationView.b localb = new android/support/design/widget/NavigationView$b;
    localb.<init>((Parcelable)localObject);
    localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    a = ((Bundle)localObject);
    localObject = f;
    Bundle localBundle = a;
    ((h)localObject).a(localBundle);
    return localb;
  }
  
  public void setCheckedItem(int paramInt)
  {
    Object localObject1 = f.findItem(paramInt);
    if (localObject1 != null)
    {
      Object localObject2 = g;
      localObject1 = (j)localObject1;
      localObject2 = e;
      ((c.b)localObject2).a((j)localObject1);
    }
  }
  
  public void setItemBackground(Drawable paramDrawable)
  {
    g.a(paramDrawable);
  }
  
  public void setItemBackgroundResource(int paramInt)
  {
    Drawable localDrawable = android.support.v4.c.a.a(getContext(), paramInt);
    setItemBackground(localDrawable);
  }
  
  public void setItemIconTintList(ColorStateList paramColorStateList)
  {
    g.a(paramColorStateList);
  }
  
  public void setItemTextAppearance(int paramInt)
  {
    g.a(paramInt);
  }
  
  public void setItemTextColor(ColorStateList paramColorStateList)
  {
    g.b(paramColorStateList);
  }
  
  public void setNavigationItemSelectedListener(NavigationView.a parama)
  {
    c = parama;
  }
}


/* Location:              android/support/design/widget/NavigationView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */