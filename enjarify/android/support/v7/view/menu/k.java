package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.e.a.b;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

public class k
  extends c
  implements MenuItem
{
  public Method e;
  
  k(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }
  
  k.a a(ActionProvider paramActionProvider)
  {
    k.a locala = new android/support/v7/view/menu/k$a;
    Context localContext = a;
    locala.<init>(this, localContext, paramActionProvider);
    return locala;
  }
  
  public boolean collapseActionView()
  {
    return ((b)d).collapseActionView();
  }
  
  public boolean expandActionView()
  {
    return ((b)d).expandActionView();
  }
  
  public ActionProvider getActionProvider()
  {
    Object localObject = ((b)d).a();
    boolean bool = localObject instanceof k.a;
    if (bool) {}
    for (localObject = c;; localObject = null) {
      return (ActionProvider)localObject;
    }
  }
  
  public View getActionView()
  {
    View localView = ((b)d).getActionView();
    boolean bool = localView instanceof k.b;
    if (bool) {
      localView = (View)a;
    }
    return localView;
  }
  
  public char getAlphabeticShortcut()
  {
    return ((b)d).getAlphabeticShortcut();
  }
  
  public int getGroupId()
  {
    return ((b)d).getGroupId();
  }
  
  public Drawable getIcon()
  {
    return ((b)d).getIcon();
  }
  
  public Intent getIntent()
  {
    return ((b)d).getIntent();
  }
  
  public int getItemId()
  {
    return ((b)d).getItemId();
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return ((b)d).getMenuInfo();
  }
  
  public char getNumericShortcut()
  {
    return ((b)d).getNumericShortcut();
  }
  
  public int getOrder()
  {
    return ((b)d).getOrder();
  }
  
  public SubMenu getSubMenu()
  {
    SubMenu localSubMenu = ((b)d).getSubMenu();
    return a(localSubMenu);
  }
  
  public CharSequence getTitle()
  {
    return ((b)d).getTitle();
  }
  
  public CharSequence getTitleCondensed()
  {
    return ((b)d).getTitleCondensed();
  }
  
  public boolean hasSubMenu()
  {
    return ((b)d).hasSubMenu();
  }
  
  public boolean isActionViewExpanded()
  {
    return ((b)d).isActionViewExpanded();
  }
  
  public boolean isCheckable()
  {
    return ((b)d).isCheckable();
  }
  
  public boolean isChecked()
  {
    return ((b)d).isChecked();
  }
  
  public boolean isEnabled()
  {
    return ((b)d).isEnabled();
  }
  
  public boolean isVisible()
  {
    return ((b)d).isVisible();
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    b localb = (b)d;
    if (paramActionProvider != null) {}
    for (k.a locala = a(paramActionProvider);; locala = null)
    {
      localb.a(locala);
      return this;
    }
  }
  
  public MenuItem setActionView(int paramInt)
  {
    ((b)d).setActionView(paramInt);
    b localb = (b)d;
    View localView = localb.getActionView();
    boolean bool = localView instanceof CollapsibleActionView;
    if (bool)
    {
      localb = (b)d;
      k.b localb1 = new android/support/v7/view/menu/k$b;
      localb1.<init>((View)localView);
      localb.setActionView(localb1);
    }
    return this;
  }
  
  public MenuItem setActionView(View paramView)
  {
    boolean bool = paramView instanceof CollapsibleActionView;
    if (bool)
    {
      k.b localb = new android/support/v7/view/menu/k$b;
      localb.<init>((View)paramView);
      paramView = localb;
    }
    ((b)d).setActionView(paramView);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    ((b)d).setAlphabeticShortcut(paramChar);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean)
  {
    ((b)d).setCheckable(paramBoolean);
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean)
  {
    ((b)d).setChecked(paramBoolean);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean)
  {
    ((b)d).setEnabled(paramBoolean);
    return this;
  }
  
  public MenuItem setIcon(int paramInt)
  {
    ((b)d).setIcon(paramInt);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable)
  {
    ((b)d).setIcon(paramDrawable);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent)
  {
    ((b)d).setIntent(paramIntent);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar)
  {
    ((b)d).setNumericShortcut(paramChar);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    b localb = (b)d;
    k.c localc;
    if (paramOnActionExpandListener != null)
    {
      localc = new android/support/v7/view/menu/k$c;
      localc.<init>(this, paramOnActionExpandListener);
    }
    for (;;)
    {
      localb.a(localc);
      return this;
      localc = null;
    }
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    b localb = (b)d;
    k.d locald;
    if (paramOnMenuItemClickListener != null)
    {
      locald = new android/support/v7/view/menu/k$d;
      locald.<init>(this, paramOnMenuItemClickListener);
    }
    for (;;)
    {
      localb.setOnMenuItemClickListener(locald);
      return this;
      locald = null;
    }
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    ((b)d).setShortcut(paramChar1, paramChar2);
    return this;
  }
  
  public void setShowAsAction(int paramInt)
  {
    ((b)d).setShowAsAction(paramInt);
  }
  
  public MenuItem setShowAsActionFlags(int paramInt)
  {
    ((b)d).setShowAsActionFlags(paramInt);
    return this;
  }
  
  public MenuItem setTitle(int paramInt)
  {
    ((b)d).setTitle(paramInt);
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    ((b)d).setTitle(paramCharSequence);
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    ((b)d).setTitleCondensed(paramCharSequence);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean)
  {
    return ((b)d).setVisible(paramBoolean);
  }
}


/* Location:              android/support/v7/view/menu/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */