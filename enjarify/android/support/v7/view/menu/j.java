package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.h.e;
import android.support.v4.h.m.e;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.util.ArrayList;

public final class j
  implements android.support.v4.e.a.b
{
  static String f;
  static String g;
  static String h;
  static String i;
  final int a;
  h b;
  int c = 0;
  public e d;
  ContextMenu.ContextMenuInfo e;
  private final int j;
  private final int k;
  private final int l;
  private CharSequence m;
  private CharSequence n;
  private Intent o;
  private char p;
  private char q;
  private Drawable r;
  private int s = 0;
  private u t;
  private Runnable u;
  private MenuItem.OnMenuItemClickListener v;
  private int w = 16;
  private View x;
  private m.e y;
  private boolean z = false;
  
  j(h paramh, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    b = paramh;
    j = paramInt2;
    k = paramInt1;
    l = paramInt3;
    a = paramInt4;
    m = paramCharSequence;
    c = paramInt5;
  }
  
  private android.support.v4.e.a.b a(View paramView)
  {
    x = paramView;
    int i1 = 0;
    d = null;
    if (paramView != null)
    {
      i1 = paramView.getId();
      int i2 = -1;
      if (i1 == i2)
      {
        i1 = j;
        if (i1 > 0)
        {
          i1 = j;
          paramView.setId(i1);
        }
      }
    }
    b.g();
    return this;
  }
  
  private void e(boolean paramBoolean)
  {
    int i1 = w;
    int i2 = w;
    int i3 = i2 & 0xFFFFFFFD;
    if (paramBoolean) {
      i2 = 2;
    }
    for (;;)
    {
      i2 |= i3;
      w = i2;
      i2 = w;
      if (i1 != i2)
      {
        localh = b;
        localh.a(false);
      }
      return;
      i2 = 0;
      h localh = null;
    }
  }
  
  public final android.support.v4.e.a.b a(e parame)
  {
    boolean bool = false;
    j.1 local1 = null;
    Object localObject = d;
    if (localObject != null)
    {
      localObject = d;
      b = null;
      a = null;
    }
    x = null;
    d = parame;
    localObject = b;
    bool = true;
    ((h)localObject).a(bool);
    localObject = d;
    if (localObject != null)
    {
      localObject = d;
      local1 = new android/support/v7/view/menu/j$1;
      local1.<init>(this);
      ((e)localObject).a(local1);
    }
    return this;
  }
  
  public final android.support.v4.e.a.b a(m.e parame)
  {
    y = parame;
    return this;
  }
  
  public final e a()
  {
    return d;
  }
  
  final CharSequence a(p.a parama)
  {
    if (parama != null)
    {
      boolean bool = parama.a();
      if (!bool) {}
    }
    for (CharSequence localCharSequence = getTitleCondensed();; localCharSequence = getTitle()) {
      return localCharSequence;
    }
  }
  
  public final void a(u paramu)
  {
    t = paramu;
    CharSequence localCharSequence = getTitle();
    paramu.setHeaderTitle(localCharSequence);
  }
  
  public final void a(boolean paramBoolean)
  {
    int i1 = w;
    int i2 = i1 & 0xFFFFFFFB;
    if (paramBoolean) {}
    for (i1 = 4;; i1 = 0)
    {
      i1 |= i2;
      w = i1;
      return;
    }
  }
  
  public final boolean b()
  {
    boolean bool1 = true;
    Object localObject1 = v;
    boolean bool2;
    if (localObject1 != null)
    {
      localObject1 = v;
      bool2 = ((MenuItem.OnMenuItemClickListener)localObject1).onMenuItemClick(this);
      if (!bool2) {}
    }
    for (;;)
    {
      return bool1;
      localObject1 = b;
      Object localObject2 = b.k();
      bool2 = ((h)localObject1).a((h)localObject2, this);
      if (!bool2)
      {
        localObject1 = u;
        if (localObject1 != null)
        {
          localObject1 = u;
          ((Runnable)localObject1).run();
        }
        else
        {
          localObject1 = o;
          if (localObject1 != null)
          {
            try
            {
              localObject1 = b;
              localObject1 = a;
              localObject2 = o;
              ((Context)localObject1).startActivity((Intent)localObject2);
            }
            catch (ActivityNotFoundException localActivityNotFoundException)
            {
              localObject2 = "MenuItemImpl";
              String str = "Can't find activity to handle intent; ignoring";
              Log.e((String)localObject2, str, localActivityNotFoundException);
            }
          }
          else
          {
            e locale = d;
            if (locale != null)
            {
              locale = d;
              bool2 = locale.d();
              if (bool2) {}
            }
            else
            {
              bool1 = false;
            }
          }
        }
      }
    }
  }
  
  final boolean b(boolean paramBoolean)
  {
    boolean bool = false;
    int i1 = w;
    int i2 = w;
    int i3 = i2 & 0xFFFFFFF7;
    if (paramBoolean) {}
    for (i2 = 0;; i2 = 8)
    {
      i2 |= i3;
      w = i2;
      i2 = w;
      if (i1 != i2) {
        bool = true;
      }
      return bool;
    }
  }
  
  final char c()
  {
    h localh = b;
    boolean bool = localh.b();
    if (bool) {}
    for (char c1 = q;; c1 = p) {
      return c1;
    }
  }
  
  public final void c(boolean paramBoolean)
  {
    int i1;
    if (paramBoolean) {
      i1 = w | 0x20;
    }
    for (w = i1;; w = i1)
    {
      return;
      i1 = w & 0xFFFFFFDF;
    }
  }
  
  public final boolean collapseActionView()
  {
    boolean bool1 = false;
    h localh = null;
    int i1 = c & 0x8;
    if (i1 == 0) {}
    for (;;)
    {
      return bool1;
      Object localObject = x;
      if (localObject == null)
      {
        bool1 = true;
      }
      else
      {
        localObject = y;
        if (localObject != null)
        {
          localObject = y;
          boolean bool2 = ((m.e)localObject).b(this);
          if (!bool2) {}
        }
        else
        {
          localh = b;
          bool1 = localh.b(this);
        }
      }
    }
  }
  
  public final void d(boolean paramBoolean)
  {
    z = paramBoolean;
    b.a(false);
  }
  
  final boolean d()
  {
    h localh = b;
    boolean bool = localh.c();
    int i1;
    if (bool)
    {
      i1 = c();
      if (i1 != 0) {
        i1 = 1;
      }
    }
    for (;;)
    {
      return i1;
      int i2 = 0;
      localh = null;
    }
  }
  
  public final boolean e()
  {
    int i1 = w & 0x4;
    if (i1 != 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  public final boolean expandActionView()
  {
    boolean bool1 = false;
    h localh = null;
    boolean bool2 = i();
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      m.e locale = y;
      if (locale != null)
      {
        locale = y;
        bool2 = locale.a(this);
        if (!bool2) {}
      }
      else
      {
        localh = b;
        bool1 = localh.a(this);
      }
    }
  }
  
  public final boolean f()
  {
    int i1 = w & 0x20;
    int i3 = 32;
    if (i1 == i3) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  public final boolean g()
  {
    int i1 = 1;
    int i2 = c & 0x1;
    if (i2 == i1) {}
    for (;;)
    {
      return i1;
      i1 = 0;
    }
  }
  
  public final ActionProvider getActionProvider()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("This is not supported, use MenuItemCompat.getActionProvider()");
    throw localUnsupportedOperationException;
  }
  
  public final View getActionView()
  {
    Object localObject = x;
    if (localObject != null) {
      localObject = x;
    }
    for (;;)
    {
      return (View)localObject;
      localObject = d;
      if (localObject != null)
      {
        localObject = d.a(this);
        x = ((View)localObject);
        localObject = x;
      }
      else
      {
        localObject = null;
      }
    }
  }
  
  public final char getAlphabeticShortcut()
  {
    return q;
  }
  
  public final int getGroupId()
  {
    return k;
  }
  
  public final Drawable getIcon()
  {
    Object localObject = r;
    if (localObject != null) {
      localObject = r;
    }
    for (;;)
    {
      return (Drawable)localObject;
      int i1 = s;
      if (i1 != 0)
      {
        localObject = b.a;
        int i2 = s;
        localObject = android.support.v7.b.a.b.b((Context)localObject, i2);
        i2 = 0;
        s = 0;
        r = ((Drawable)localObject);
      }
      else
      {
        i1 = 0;
        localObject = null;
      }
    }
  }
  
  public final Intent getIntent()
  {
    return o;
  }
  
  public final int getItemId()
  {
    return j;
  }
  
  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return e;
  }
  
  public final char getNumericShortcut()
  {
    return p;
  }
  
  public final int getOrder()
  {
    return l;
  }
  
  public final SubMenu getSubMenu()
  {
    return t;
  }
  
  public final CharSequence getTitle()
  {
    return m;
  }
  
  public final CharSequence getTitleCondensed()
  {
    Object localObject = n;
    if (localObject != null) {}
    for (localObject = n;; localObject = m)
    {
      int i1 = Build.VERSION.SDK_INT;
      int i2 = 18;
      if ((i1 < i2) && (localObject != null))
      {
        boolean bool = localObject instanceof String;
        if (!bool) {
          localObject = ((CharSequence)localObject).toString();
        }
      }
      return (CharSequence)localObject;
    }
  }
  
  public final boolean h()
  {
    int i1 = c & 0x2;
    int i3 = 2;
    if (i1 == i3) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  public final boolean hasSubMenu()
  {
    u localu = t;
    boolean bool;
    if (localu != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localu = null;
    }
  }
  
  public final boolean i()
  {
    boolean bool = false;
    int i1 = c & 0x8;
    if (i1 != 0)
    {
      Object localObject = x;
      if (localObject == null)
      {
        localObject = d;
        if (localObject != null)
        {
          localObject = d.a(this);
          x = ((View)localObject);
        }
      }
      localObject = x;
      if (localObject != null) {
        bool = true;
      }
    }
    return bool;
  }
  
  public final boolean isActionViewExpanded()
  {
    return z;
  }
  
  public final boolean isCheckable()
  {
    int i1 = 1;
    int i2 = w & 0x1;
    if (i2 == i1) {}
    for (;;)
    {
      return i1;
      i1 = 0;
    }
  }
  
  public final boolean isChecked()
  {
    int i1 = w & 0x2;
    int i3 = 2;
    if (i1 == i3) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  public final boolean isEnabled()
  {
    int i1 = w & 0x10;
    if (i1 != 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  public final boolean isVisible()
  {
    boolean bool1 = true;
    e locale = d;
    if (locale != null)
    {
      locale = d;
      boolean bool2 = locale.b();
      if (bool2)
      {
        int i1 = w & 0x8;
        if (i1 == 0)
        {
          locale = d;
          boolean bool3 = locale.c();
          if (!bool3) {}
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      continue;
      int i2 = w & 0x8;
      if (i2 != 0) {
        bool1 = false;
      }
    }
  }
  
  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("This is not supported, use MenuItemCompat.setActionProvider()");
    throw localUnsupportedOperationException;
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    char c1 = q;
    if (c1 == paramChar) {}
    for (;;)
    {
      return this;
      c1 = Character.toLowerCase(paramChar);
      q = c1;
      h localh = b;
      localh.a(false);
    }
  }
  
  public final MenuItem setCheckable(boolean paramBoolean)
  {
    int i1 = w;
    int i2 = w;
    int i3 = i2 & 0xFFFFFFFE;
    if (paramBoolean) {
      i2 = 1;
    }
    for (;;)
    {
      i2 |= i3;
      w = i2;
      i2 = w;
      if (i1 != i2)
      {
        localh = b;
        localh.a(false);
      }
      return this;
      i2 = 0;
      h localh = null;
    }
  }
  
  public final MenuItem setChecked(boolean paramBoolean)
  {
    int i1 = w & 0x4;
    if (i1 != 0)
    {
      h localh = b;
      int i2 = getGroupId();
      Object localObject = c;
      int i3 = ((ArrayList)localObject).size();
      localh.d();
      int i4 = 0;
      if (i4 < i3)
      {
        localObject = (j)c.get(i4);
        int i5 = ((j)localObject).getGroupId();
        if (i5 == i2)
        {
          bool = ((j)localObject).e();
          if (bool)
          {
            bool = ((j)localObject).isCheckable();
            if (bool) {
              if (localObject != this) {
                break label130;
              }
            }
          }
        }
        label130:
        for (boolean bool = true;; bool = false)
        {
          ((j)localObject).e(bool);
          i1 = i4 + 1;
          i4 = i1;
          break;
        }
      }
      localh.e();
    }
    for (;;)
    {
      return this;
      e(paramBoolean);
    }
  }
  
  public final MenuItem setEnabled(boolean paramBoolean)
  {
    int i1;
    if (paramBoolean) {
      i1 = w | 0x10;
    }
    for (w = i1;; w = i1)
    {
      b.a(false);
      return this;
      i1 = w & 0xFFFFFFEF;
    }
  }
  
  public final MenuItem setIcon(int paramInt)
  {
    r = null;
    s = paramInt;
    b.a(false);
    return this;
  }
  
  public final MenuItem setIcon(Drawable paramDrawable)
  {
    s = 0;
    r = paramDrawable;
    b.a(false);
    return this;
  }
  
  public final MenuItem setIntent(Intent paramIntent)
  {
    o = paramIntent;
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar)
  {
    char c1 = p;
    if (c1 == paramChar) {}
    for (;;)
    {
      return this;
      p = paramChar;
      h localh = b;
      localh.a(false);
    }
  }
  
  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    throw localUnsupportedOperationException;
  }
  
  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    v = paramOnMenuItemClickListener;
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    p = paramChar1;
    char c1 = Character.toLowerCase(paramChar2);
    q = c1;
    b.a(false);
    return this;
  }
  
  public final void setShowAsAction(int paramInt)
  {
    int i1 = paramInt & 0x3;
    switch (i1)
    {
    default: 
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
      throw localIllegalArgumentException;
    }
    c = paramInt;
    b.g();
  }
  
  public final MenuItem setTitle(int paramInt)
  {
    String str = b.a.getString(paramInt);
    return setTitle(str);
  }
  
  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    m = paramCharSequence;
    b.a(false);
    u localu = t;
    if (localu != null)
    {
      localu = t;
      localu.setHeaderTitle(paramCharSequence);
    }
    return this;
  }
  
  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    n = paramCharSequence;
    b.a(false);
    return this;
  }
  
  public final MenuItem setVisible(boolean paramBoolean)
  {
    boolean bool = b(paramBoolean);
    if (bool)
    {
      h localh = b;
      localh.f();
    }
    return this;
  }
  
  public final String toString()
  {
    Object localObject = m;
    if (localObject != null) {}
    for (localObject = m.toString();; localObject = null) {
      return (String)localObject;
    }
  }
}


/* Location:              android/support/v7/view/menu/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */