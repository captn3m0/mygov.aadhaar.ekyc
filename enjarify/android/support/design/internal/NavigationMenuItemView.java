package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.support.design.a.c;
import android.support.design.a.d;
import android.support.design.a.e;
import android.support.design.a.g;
import android.support.v4.c.a.c;
import android.support.v4.h.b;
import android.support.v4.h.w;
import android.support.v4.widget.n;
import android.support.v7.a.a.a;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.p.a;
import android.support.v7.widget.am.a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

public class NavigationMenuItemView
  extends a
  implements p.a
{
  private static final int[] f;
  boolean c;
  final CheckedTextView d;
  FrameLayout e;
  private final int g;
  private boolean h;
  private j i;
  private ColorStateList j;
  private boolean k;
  private Drawable l;
  private final b m;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16842912;
    f = arrayOfInt;
  }
  
  public NavigationMenuItemView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NavigationMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NavigationMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = new android/support/design/internal/NavigationMenuItemView$1;
    ((NavigationMenuItemView.1)localObject).<init>(this);
    m = ((b)localObject);
    setOrientation(0);
    localObject = LayoutInflater.from(paramContext);
    int n = a.g.design_navigation_menu_item;
    ((LayoutInflater)localObject).inflate(n, this, bool);
    localObject = paramContext.getResources();
    n = a.c.design_navigation_icon_size;
    int i1 = ((Resources)localObject).getDimensionPixelSize(n);
    g = i1;
    i1 = a.e.design_menu_item_text;
    localObject = (CheckedTextView)findViewById(i1);
    d = ((CheckedTextView)localObject);
    d.setDuplicateParentStateEnabled(bool);
    localObject = d;
    b localb = m;
    w.a((View)localObject, localb);
  }
  
  private void setActionView(View paramView)
  {
    if (paramView != null)
    {
      FrameLayout localFrameLayout = e;
      if (localFrameLayout == null)
      {
        int n = a.e.design_menu_item_action_area_stub;
        localFrameLayout = (FrameLayout)((ViewStub)findViewById(n)).inflate();
        e = localFrameLayout;
      }
      e.removeAllViews();
      localFrameLayout = e;
      localFrameLayout.addView(paramView);
    }
  }
  
  public final void a(j paramj)
  {
    int n = 8;
    boolean bool1 = true;
    int i1 = 0;
    FrameLayout localFrameLayout = null;
    i = paramj;
    int i2 = paramj.isVisible();
    Object localObject1;
    boolean bool2;
    if (i2 != 0)
    {
      i2 = 0;
      localObject1 = null;
      setVisibility(i2);
      localObject1 = getBackground();
      if (localObject1 == null)
      {
        Object localObject2 = new android/util/TypedValue;
        ((TypedValue)localObject2).<init>();
        localObject1 = getContext().getTheme();
        int i3 = a.a.colorControlHighlight;
        bool2 = ((Resources.Theme)localObject1).resolveAttribute(i3, (TypedValue)localObject2, bool1);
        if (!bool2) {
          break label348;
        }
        localObject1 = new android/graphics/drawable/StateListDrawable;
        ((StateListDrawable)localObject1).<init>();
        Object localObject3 = f;
        ColorDrawable localColorDrawable = new android/graphics/drawable/ColorDrawable;
        int i4 = data;
        localColorDrawable.<init>(i4);
        ((StateListDrawable)localObject1).addState((int[])localObject3, localColorDrawable);
        localObject2 = EMPTY_STATE_SET;
        localObject3 = new android/graphics/drawable/ColorDrawable;
        ((ColorDrawable)localObject3).<init>(0);
        ((StateListDrawable)localObject1).addState((int[])localObject2, (Drawable)localObject3);
        label159:
        w.a(this, (Drawable)localObject1);
      }
      bool2 = paramj.isCheckable();
      setCheckable(bool2);
      bool2 = paramj.isChecked();
      setChecked(bool2);
      bool2 = paramj.isEnabled();
      setEnabled(bool2);
      localObject1 = paramj.getTitle();
      setTitle((CharSequence)localObject1);
      localObject1 = paramj.getIcon();
      setIcon((Drawable)localObject1);
      localObject1 = paramj.getActionView();
      setActionView((View)localObject1);
      localObject1 = i.getTitle();
      if (localObject1 != null) {
        break label357;
      }
      localObject1 = i.getIcon();
      if (localObject1 != null) {
        break label357;
      }
      localObject1 = i.getActionView();
      if (localObject1 == null) {
        break label357;
      }
      bool2 = bool1;
      label282:
      if (!bool2) {
        break label366;
      }
      d.setVisibility(n);
      localObject1 = e;
      if (localObject1 != null)
      {
        localObject1 = (am.a)e.getLayoutParams();
        i1 = -1;
        width = i1;
        localFrameLayout = e;
        localFrameLayout.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      }
    }
    for (;;)
    {
      return;
      bool2 = n;
      break;
      label348:
      bool2 = false;
      localObject1 = null;
      break label159;
      label357:
      bool2 = false;
      localObject1 = null;
      break label282;
      label366:
      d.setVisibility(0);
      localObject1 = e;
      if (localObject1 != null)
      {
        localObject1 = (am.a)e.getLayoutParams();
        i1 = -2;
        width = i1;
        localFrameLayout = e;
        localFrameLayout.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      }
    }
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public j getItemData()
  {
    return i;
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    int n = paramInt + 1;
    int[] arrayOfInt = super.onCreateDrawableState(n);
    Object localObject = i;
    if (localObject != null)
    {
      localObject = i;
      boolean bool = ((j)localObject).isCheckable();
      if (bool)
      {
        localObject = i;
        bool = ((j)localObject).isChecked();
        if (bool)
        {
          localObject = f;
          mergeDrawableStates(arrayOfInt, (int[])localObject);
        }
      }
    }
    return arrayOfInt;
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    refreshDrawableState();
    boolean bool = c;
    if (bool != paramBoolean)
    {
      c = paramBoolean;
      CheckedTextView localCheckedTextView = d;
      int n = 2048;
      b.a(localCheckedTextView, n);
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    refreshDrawableState();
    d.setChecked(paramBoolean);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    Object localObject;
    int i1;
    if (paramDrawable != null)
    {
      boolean bool1 = k;
      if (bool1)
      {
        localObject = paramDrawable.getConstantState();
        if (localObject == null)
        {
          paramDrawable = android.support.v4.d.a.a.f(paramDrawable).mutate();
          localObject = j;
          android.support.v4.d.a.a.a(paramDrawable, (ColorStateList)localObject);
        }
      }
      else
      {
        int n = g;
        i1 = g;
        paramDrawable.setBounds(0, 0, n, i1);
      }
    }
    for (;;)
    {
      n.a(d, paramDrawable);
      return;
      paramDrawable = ((Drawable.ConstantState)localObject).newDrawable();
      break;
      boolean bool2 = h;
      if (bool2)
      {
        localObject = l;
        if (localObject == null)
        {
          localObject = getResources();
          i1 = a.d.navigation_empty_icon;
          Resources.Theme localTheme = getContext().getTheme();
          localObject = c.a((Resources)localObject, i1, localTheme);
          l = ((Drawable)localObject);
          localObject = l;
          if (localObject != null)
          {
            localObject = l;
            i1 = g;
            int i2 = g;
            ((Drawable)localObject).setBounds(0, 0, i1, i2);
          }
        }
        paramDrawable = l;
      }
    }
  }
  
  void setIconTintList(ColorStateList paramColorStateList)
  {
    j = paramColorStateList;
    Object localObject = j;
    boolean bool;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      k = bool;
      localObject = i;
      if (localObject != null)
      {
        localObject = i.getIcon();
        setIcon((Drawable)localObject);
      }
      return;
      bool = false;
      localObject = null;
    }
  }
  
  public void setNeedsEmptyIcon(boolean paramBoolean)
  {
    h = paramBoolean;
  }
  
  public void setTextAppearance(int paramInt)
  {
    n.a(d, paramInt);
  }
  
  public void setTextColor(ColorStateList paramColorStateList)
  {
    d.setTextColor(paramColorStateList);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    d.setText(paramCharSequence);
  }
}


/* Location:              android/support/design/internal/NavigationMenuItemView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */