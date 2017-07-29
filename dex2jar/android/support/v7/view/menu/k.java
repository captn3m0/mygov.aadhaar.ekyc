package android.support.v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.e.a.b;
import android.support.v4.h.e;
import android.support.v4.h.m.e;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

@TargetApi(14)
public class k
  extends c<b>
  implements MenuItem
{
  public Method e;
  
  k(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }
  
  a a(ActionProvider paramActionProvider)
  {
    return new a(a, paramActionProvider);
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
    e locale = ((b)d).a();
    if ((locale instanceof a)) {
      return c;
    }
    return null;
  }
  
  public View getActionView()
  {
    View localView2 = ((b)d).getActionView();
    View localView1 = localView2;
    if ((localView2 instanceof b)) {
      localView1 = (View)a;
    }
    return localView1;
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
    return a(((b)d).getSubMenu());
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
    for (paramActionProvider = a(paramActionProvider);; paramActionProvider = null)
    {
      localb.a(paramActionProvider);
      return this;
    }
  }
  
  public MenuItem setActionView(int paramInt)
  {
    ((b)d).setActionView(paramInt);
    View localView = ((b)d).getActionView();
    if ((localView instanceof CollapsibleActionView)) {
      ((b)d).setActionView(new b(localView));
    }
    return this;
  }
  
  public MenuItem setActionView(View paramView)
  {
    Object localObject = paramView;
    if ((paramView instanceof CollapsibleActionView)) {
      localObject = new b(paramView);
    }
    ((b)d).setActionView((View)localObject);
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
    if (paramOnActionExpandListener != null) {}
    for (paramOnActionExpandListener = new c(paramOnActionExpandListener);; paramOnActionExpandListener = null)
    {
      localb.a(paramOnActionExpandListener);
      return this;
    }
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    b localb = (b)d;
    if (paramOnMenuItemClickListener != null) {}
    for (paramOnMenuItemClickListener = new d(paramOnMenuItemClickListener);; paramOnMenuItemClickListener = null)
    {
      localb.setOnMenuItemClickListener(paramOnMenuItemClickListener);
      return this;
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
  
  class a
    extends e
  {
    final ActionProvider c;
    
    public a(Context paramContext, ActionProvider paramActionProvider)
    {
      super();
      c = paramActionProvider;
    }
    
    public final View a()
    {
      return c.onCreateActionView();
    }
    
    public final void a(SubMenu paramSubMenu)
    {
      c.onPrepareSubMenu(a(paramSubMenu));
    }
    
    public final boolean d()
    {
      return c.onPerformDefaultAction();
    }
    
    public final boolean e()
    {
      return c.hasSubMenu();
    }
  }
  
  static final class b
    extends FrameLayout
    implements android.support.v7.view.c
  {
    final CollapsibleActionView a;
    
    b(View paramView)
    {
      super();
      a = ((CollapsibleActionView)paramView);
      addView(paramView);
    }
    
    public final void a()
    {
      a.onActionViewExpanded();
    }
    
    public final void b()
    {
      a.onActionViewCollapsed();
    }
  }
  
  private final class c
    extends d<MenuItem.OnActionExpandListener>
    implements m.e
  {
    c(MenuItem.OnActionExpandListener paramOnActionExpandListener)
    {
      super();
    }
    
    public final boolean a(MenuItem paramMenuItem)
    {
      return ((MenuItem.OnActionExpandListener)d).onMenuItemActionExpand(a(paramMenuItem));
    }
    
    public final boolean b(MenuItem paramMenuItem)
    {
      return ((MenuItem.OnActionExpandListener)d).onMenuItemActionCollapse(a(paramMenuItem));
    }
  }
  
  private final class d
    extends d<MenuItem.OnMenuItemClickListener>
    implements MenuItem.OnMenuItemClickListener
  {
    d(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
    {
      super();
    }
    
    public final boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      return ((MenuItem.OnMenuItemClickListener)d).onMenuItemClick(a(paramMenuItem));
    }
  }
}


/* Location:              android/support/v7/view/menu/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */