package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.a.g;
import android.support.design.a.h;
import android.support.design.a.i;
import android.support.design.internal.NavigationMenuView;
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
import android.support.v7.widget.bf;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class NavigationView
  extends f
{
  private static final int[] d = { 16842912 };
  private static final int[] e = { -16842910 };
  a c;
  private final android.support.design.internal.b f;
  private final android.support.design.internal.c g = new android.support.design.internal.c();
  private int h;
  private MenuInflater i;
  
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
    p.a(paramContext);
    f = new android.support.design.internal.b(paramContext);
    bf localbf = bf.a(paramContext, paramAttributeSet, a.i.NavigationView, paramInt, a.h.Widget_Design_NavigationView);
    w.a(this, localbf.a(a.i.NavigationView_android_background));
    if (localbf.e(a.i.NavigationView_elevation)) {
      w.d(this, localbf.e(a.i.NavigationView_elevation, 0));
    }
    w.a(this, localbf.a(a.i.NavigationView_android_fitsSystemWindows, false));
    h = localbf.e(a.i.NavigationView_android_maxWidth, 0);
    ColorStateList localColorStateList;
    if (localbf.e(a.i.NavigationView_itemIconTint))
    {
      localColorStateList = localbf.d(a.i.NavigationView_itemIconTint);
      if (!localbf.e(a.i.NavigationView_itemTextAppearance)) {
        break label531;
      }
      paramInt = localbf.g(a.i.NavigationView_itemTextAppearance, 0);
    }
    for (int j = 1;; j = 0)
    {
      paramAttributeSet = null;
      if (localbf.e(a.i.NavigationView_itemTextColor)) {
        paramAttributeSet = localbf.d(a.i.NavigationView_itemTextColor);
      }
      Object localObject = paramAttributeSet;
      if (j == 0)
      {
        localObject = paramAttributeSet;
        if (paramAttributeSet == null) {
          localObject = a(16842806);
        }
      }
      paramAttributeSet = localbf.a(a.i.NavigationView_itemBackground);
      f.a(new h.a()
      {
        public final void a(h paramAnonymoush) {}
        
        public final boolean a(h paramAnonymoush, MenuItem paramAnonymousMenuItem)
        {
          if (c != null)
          {
            c.a(paramAnonymousMenuItem);
            return true;
          }
          return false;
        }
      });
      g.d = 1;
      g.a(paramContext, f);
      g.a(localColorStateList);
      if (j != 0) {
        g.a(paramInt);
      }
      g.b((ColorStateList)localObject);
      g.a(paramAttributeSet);
      f.a(g);
      paramContext = g;
      if (a == null)
      {
        a = ((NavigationMenuView)f.inflate(a.g.design_navigation_menu, this, false));
        if (e == null) {
          e = new c.b(paramContext);
        }
        b = ((LinearLayout)f.inflate(a.g.design_navigation_item_header, a, false));
        a.setAdapter(e);
      }
      addView((View)a);
      if (localbf.e(a.i.NavigationView_menu))
      {
        paramInt = localbf.g(a.i.NavigationView_menu, 0);
        g.b(true);
        getMenuInflater().inflate(paramInt, f);
        g.b(false);
        g.a(false);
      }
      if (localbf.e(a.i.NavigationView_headerLayout))
      {
        paramInt = localbf.g(a.i.NavigationView_headerLayout, 0);
        paramContext = g;
        paramAttributeSet = f.inflate(paramInt, b, false);
        b.addView(paramAttributeSet);
        a.setPadding(0, 0, 0, a.getPaddingBottom());
      }
      a.recycle();
      return;
      localColorStateList = a(16842808);
      break;
      label531:
      paramInt = 0;
    }
  }
  
  private ColorStateList a(int paramInt)
  {
    Object localObject = new TypedValue();
    if (!getContext().getTheme().resolveAttribute(paramInt, (TypedValue)localObject, true)) {}
    ColorStateList localColorStateList;
    do
    {
      return null;
      localColorStateList = android.support.v7.b.a.b.a(getContext(), resourceId);
    } while (!getContext().getTheme().resolveAttribute(a.a.colorPrimary, (TypedValue)localObject, true));
    paramInt = data;
    int j = localColorStateList.getDefaultColor();
    localObject = e;
    int[] arrayOfInt1 = d;
    int[] arrayOfInt2 = EMPTY_STATE_SET;
    int k = localColorStateList.getColorForState(e, j);
    return new ColorStateList(new int[][] { localObject, arrayOfInt1, arrayOfInt2 }, new int[] { k, paramInt, j });
  }
  
  private MenuInflater getMenuInflater()
  {
    if (i == null) {
      i = new g(getContext());
    }
    return i;
  }
  
  protected final void a(al paramal)
  {
    android.support.design.internal.c localc = g;
    int j = paramal.b();
    if (l != j)
    {
      l = j;
      if (b.getChildCount() == 0) {
        a.setPadding(0, l, 0, a.getPaddingBottom());
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
    int j = paramInt1;
    switch (View.MeasureSpec.getMode(paramInt1))
    {
    default: 
      j = paramInt1;
    }
    for (;;)
    {
      super.onMeasure(j, paramInt2);
      return;
      j = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(paramInt1), h), 1073741824);
      continue;
      j = View.MeasureSpec.makeMeasureSpec(h, 1073741824);
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof b)) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      Object localObject1 = (b)paramParcelable;
      super.onRestoreInstanceState(e);
      paramParcelable = f;
      localObject1 = a.getSparseParcelableArray("android:menu:presenters");
      if ((localObject1 != null) && (!j.isEmpty()))
      {
        Iterator localIterator = j.iterator();
        while (localIterator.hasNext())
        {
          Object localObject2 = (WeakReference)localIterator.next();
          o localo = (o)((WeakReference)localObject2).get();
          if (localo == null)
          {
            j.remove(localObject2);
          }
          else
          {
            int j = localo.b();
            if (j > 0)
            {
              localObject2 = (Parcelable)((SparseArray)localObject1).get(j);
              if (localObject2 != null) {
                localo.a((Parcelable)localObject2);
              }
            }
          }
        }
      }
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    b localb = new b(super.onSaveInstanceState());
    a = new Bundle();
    f.a(a);
    return localb;
  }
  
  public void setCheckedItem(int paramInt)
  {
    Object localObject = f.findItem(paramInt);
    if (localObject != null)
    {
      android.support.design.internal.c localc = g;
      localObject = (j)localObject;
      e.a((j)localObject);
    }
  }
  
  public void setItemBackground(Drawable paramDrawable)
  {
    g.a(paramDrawable);
  }
  
  public void setItemBackgroundResource(int paramInt)
  {
    setItemBackground(android.support.v4.c.a.a(getContext(), paramInt));
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
  
  public void setNavigationItemSelectedListener(a parama)
  {
    c = parama;
  }
  
  public static abstract interface a
  {
    public abstract boolean a(MenuItem paramMenuItem);
  }
  
  public static final class b
    extends android.support.v4.h.a
  {
    public static final Parcelable.Creator<b> CREATOR = android.support.v4.f.b.a(new android.support.v4.f.c() {});
    public Bundle a;
    
    public b(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      a = paramParcel.readBundle(paramClassLoader);
    }
    
    public b(Parcelable paramParcelable)
    {
      super();
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeBundle(a);
    }
  }
}


/* Location:              android/support/design/widget/NavigationView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */