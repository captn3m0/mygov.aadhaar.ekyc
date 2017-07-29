package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class u
  extends h
  implements SubMenu
{
  public h m;
  private j n;
  
  public u(Context paramContext, h paramh, j paramj)
  {
    super(paramContext);
    m = paramh;
    n = paramj;
  }
  
  public final String a()
  {
    Object localObject = n;
    int i;
    if (localObject != null)
    {
      localObject = n;
      i = ((j)localObject).getItemId();
      if (i != 0) {
        break label36;
      }
      i = 0;
    }
    label36:
    StringBuilder localStringBuilder;
    for (localObject = null;; localObject = i)
    {
      return (String)localObject;
      i = 0;
      localObject = null;
      break;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = super.a();
      localStringBuilder = localStringBuilder.append(str);
      str = ":";
      localStringBuilder = localStringBuilder.append(str);
    }
  }
  
  public final void a(h.a parama)
  {
    m.a(parama);
  }
  
  final boolean a(h paramh, MenuItem paramMenuItem)
  {
    boolean bool = super.a(paramh, paramMenuItem);
    h localh;
    if (!bool)
    {
      localh = m;
      bool = localh.a(paramh, paramMenuItem);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localh = null;
    }
  }
  
  public final boolean a(j paramj)
  {
    return m.a(paramj);
  }
  
  public final boolean b()
  {
    return m.b();
  }
  
  public final boolean b(j paramj)
  {
    return m.b(paramj);
  }
  
  public final boolean c()
  {
    return m.c();
  }
  
  public MenuItem getItem()
  {
    return n;
  }
  
  public final h k()
  {
    return m.k();
  }
  
  public SubMenu setHeaderIcon(int paramInt)
  {
    super.a(0, null, paramInt, null, null);
    return (SubMenu)this;
  }
  
  public SubMenu setHeaderIcon(Drawable paramDrawable)
  {
    super.a(0, null, 0, paramDrawable, null);
    return (SubMenu)this;
  }
  
  public SubMenu setHeaderTitle(int paramInt)
  {
    super.a(paramInt, null, 0, null, null);
    return (SubMenu)this;
  }
  
  public SubMenu setHeaderTitle(CharSequence paramCharSequence)
  {
    super.a(0, paramCharSequence, 0, null, null);
    return (SubMenu)this;
  }
  
  public SubMenu setHeaderView(View paramView)
  {
    super.a(0, null, 0, null, paramView);
    return (SubMenu)this;
  }
  
  public SubMenu setIcon(int paramInt)
  {
    n.setIcon(paramInt);
    return this;
  }
  
  public SubMenu setIcon(Drawable paramDrawable)
  {
    n.setIcon(paramDrawable);
    return this;
  }
  
  public void setQwertyMode(boolean paramBoolean)
  {
    m.setQwertyMode(paramBoolean);
  }
}


/* Location:              android/support/v7/view/menu/u.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */