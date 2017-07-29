package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.e.a.b;
import android.support.v4.h.e;
import android.support.v4.h.m.e;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

public final class a
  implements b
{
  private final int a;
  private final int b;
  private final int c;
  private final int d;
  private CharSequence e;
  private CharSequence f;
  private Intent g;
  private char h;
  private char i;
  private Drawable j;
  private int k = 0;
  private Context l;
  private MenuItem.OnMenuItemClickListener m;
  private int n = 16;
  
  public a(Context paramContext, CharSequence paramCharSequence)
  {
    l = paramContext;
    a = 16908332;
    b = 0;
    c = 0;
    d = 0;
    e = paramCharSequence;
  }
  
  public final b a(e parame)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public final b a(m.e parame)
  {
    return this;
  }
  
  public final e a()
  {
    return null;
  }
  
  public final boolean collapseActionView()
  {
    return false;
  }
  
  public final boolean expandActionView()
  {
    return false;
  }
  
  public final ActionProvider getActionProvider()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public final View getActionView()
  {
    return null;
  }
  
  public final char getAlphabeticShortcut()
  {
    return i;
  }
  
  public final int getGroupId()
  {
    return b;
  }
  
  public final Drawable getIcon()
  {
    return j;
  }
  
  public final Intent getIntent()
  {
    return g;
  }
  
  public final int getItemId()
  {
    return a;
  }
  
  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return null;
  }
  
  public final char getNumericShortcut()
  {
    return h;
  }
  
  public final int getOrder()
  {
    return d;
  }
  
  public final SubMenu getSubMenu()
  {
    return null;
  }
  
  public final CharSequence getTitle()
  {
    return e;
  }
  
  public final CharSequence getTitleCondensed()
  {
    CharSequence localCharSequence = f;
    if (localCharSequence != null) {}
    for (localCharSequence = f;; localCharSequence = e) {
      return localCharSequence;
    }
  }
  
  public final boolean hasSubMenu()
  {
    return false;
  }
  
  public final boolean isActionViewExpanded()
  {
    return false;
  }
  
  public final boolean isCheckable()
  {
    int i1 = n & 0x1;
    if (i1 != 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  public final boolean isChecked()
  {
    int i1 = n & 0x2;
    if (i1 != 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  public final boolean isEnabled()
  {
    int i1 = n & 0x10;
    if (i1 != 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  public final boolean isVisible()
  {
    int i1 = n & 0x8;
    if (i1 == 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    i = paramChar;
    return this;
  }
  
  public final MenuItem setCheckable(boolean paramBoolean)
  {
    int i1 = n;
    int i2 = i1 & 0xFFFFFFFE;
    if (paramBoolean) {}
    for (i1 = 1;; i1 = 0)
    {
      i1 |= i2;
      n = i1;
      return this;
    }
  }
  
  public final MenuItem setChecked(boolean paramBoolean)
  {
    int i1 = n;
    int i2 = i1 & 0xFFFFFFFD;
    if (paramBoolean) {}
    for (i1 = 2;; i1 = 0)
    {
      i1 |= i2;
      n = i1;
      return this;
    }
  }
  
  public final MenuItem setEnabled(boolean paramBoolean)
  {
    int i1 = n;
    int i2 = i1 & 0xFFFFFFEF;
    if (paramBoolean) {}
    for (i1 = 16;; i1 = 0)
    {
      i1 |= i2;
      n = i1;
      return this;
    }
  }
  
  public final MenuItem setIcon(int paramInt)
  {
    k = paramInt;
    Drawable localDrawable = android.support.v4.c.a.a(l, paramInt);
    j = localDrawable;
    return this;
  }
  
  public final MenuItem setIcon(Drawable paramDrawable)
  {
    j = paramDrawable;
    k = 0;
    return this;
  }
  
  public final MenuItem setIntent(Intent paramIntent)
  {
    g = paramIntent;
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar)
  {
    h = paramChar;
    return this;
  }
  
  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    m = paramOnMenuItemClickListener;
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    h = paramChar1;
    i = paramChar2;
    return this;
  }
  
  public final void setShowAsAction(int paramInt) {}
  
  public final MenuItem setTitle(int paramInt)
  {
    String str = l.getResources().getString(paramInt);
    e = str;
    return this;
  }
  
  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    e = paramCharSequence;
    return this;
  }
  
  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    f = paramCharSequence;
    return this;
  }
  
  public final MenuItem setVisible(boolean paramBoolean)
  {
    int i1 = n;
    int i2 = i1 & 0x8;
    if (paramBoolean) {}
    for (i1 = 0;; i1 = 8)
    {
      i1 |= i2;
      n = i1;
      return this;
    }
  }
}


/* Location:              android/support/v7/view/menu/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */