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
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

public class NavigationMenuItemView
  extends a
  implements p.a
{
  private static final int[] f = { 16842912 };
  boolean c;
  final CheckedTextView d;
  FrameLayout e;
  private final int g;
  private boolean h;
  private j i;
  private ColorStateList j;
  private boolean k;
  private Drawable l;
  private final android.support.v4.h.b m = new android.support.v4.h.b()
  {
    public final void a(View paramAnonymousView, android.support.v4.h.a.b paramAnonymousb)
    {
      super.a(paramAnonymousView, paramAnonymousb);
      paramAnonymousb.a(c);
    }
  };
  
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
    setOrientation(0);
    LayoutInflater.from(paramContext).inflate(a.g.design_navigation_menu_item, this, true);
    g = paramContext.getResources().getDimensionPixelSize(a.c.design_navigation_icon_size);
    d = ((CheckedTextView)findViewById(a.e.design_menu_item_text));
    d.setDuplicateParentStateEnabled(true);
    w.a(d, m);
  }
  
  private void setActionView(View paramView)
  {
    if (paramView != null)
    {
      if (e == null) {
        e = ((FrameLayout)((ViewStub)findViewById(a.e.design_menu_item_action_area_stub)).inflate());
      }
      e.removeAllViews();
      e.addView(paramView);
    }
  }
  
  public final void a(j paramj)
  {
    i = paramj;
    int n;
    StateListDrawable localStateListDrawable;
    if (paramj.isVisible())
    {
      n = 0;
      setVisibility(n);
      if (getBackground() == null)
      {
        TypedValue localTypedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(a.a.colorControlHighlight, localTypedValue, true)) {
          break label232;
        }
        localStateListDrawable = new StateListDrawable();
        localStateListDrawable.addState(f, new ColorDrawable(data));
        localStateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
        label96:
        w.a(this, localStateListDrawable);
      }
      setCheckable(paramj.isCheckable());
      setChecked(paramj.isChecked());
      setEnabled(paramj.isEnabled());
      setTitle(paramj.getTitle());
      setIcon(paramj.getIcon());
      setActionView(paramj.getActionView());
      if ((i.getTitle() != null) || (i.getIcon() != null) || (i.getActionView() == null)) {
        break label237;
      }
      n = 1;
      label181:
      if (n == 0) {
        break label242;
      }
      d.setVisibility(8);
      if (e != null)
      {
        paramj = (am.a)e.getLayoutParams();
        width = -1;
        e.setLayoutParams(paramj);
      }
    }
    label232:
    label237:
    label242:
    do
    {
      return;
      n = 8;
      break;
      localStateListDrawable = null;
      break label96;
      n = 0;
      break label181;
      d.setVisibility(0);
    } while (e == null);
    paramj = (am.a)e.getLayoutParams();
    width = -2;
    e.setLayoutParams(paramj);
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
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if ((i != null) && (i.isCheckable()) && (i.isChecked())) {
      mergeDrawableStates(arrayOfInt, f);
    }
    return arrayOfInt;
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    refreshDrawableState();
    if (c != paramBoolean)
    {
      c = paramBoolean;
      android.support.v4.h.b.a(d, 2048);
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
    if (paramDrawable != null)
    {
      localObject = paramDrawable;
      if (k)
      {
        localObject = paramDrawable.getConstantState();
        if (localObject == null)
        {
          localObject = android.support.v4.d.a.a.f(paramDrawable).mutate();
          android.support.v4.d.a.a.a((Drawable)localObject, j);
        }
      }
      else
      {
        ((Drawable)localObject).setBounds(0, 0, g, g);
        paramDrawable = (Drawable)localObject;
      }
    }
    for (;;)
    {
      n.a(d, paramDrawable);
      return;
      paramDrawable = ((Drawable.ConstantState)localObject).newDrawable();
      break;
      if (h)
      {
        if (l == null)
        {
          l = c.a(getResources(), a.d.navigation_empty_icon, getContext().getTheme());
          if (l != null) {
            l.setBounds(0, 0, g, g);
          }
        }
        paramDrawable = l;
      }
    }
  }
  
  void setIconTintList(ColorStateList paramColorStateList)
  {
    j = paramColorStateList;
    if (j != null) {}
    for (boolean bool = true;; bool = false)
    {
      k = bool;
      if (i != null) {
        setIcon(i.getIcon());
      }
      return;
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */