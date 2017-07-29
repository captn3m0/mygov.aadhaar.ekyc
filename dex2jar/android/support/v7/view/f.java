package android.support.v7.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.e.a.a;
import android.support.v4.g.k;
import android.support.v7.view.menu.q;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

@TargetApi(11)
public final class f
  extends ActionMode
{
  final Context a;
  final b b;
  
  public f(Context paramContext, b paramb)
  {
    a = paramContext;
    b = paramb;
  }
  
  public final void finish()
  {
    b.c();
  }
  
  public final View getCustomView()
  {
    return b.i();
  }
  
  public final Menu getMenu()
  {
    return q.a(a, (a)b.b());
  }
  
  public final MenuInflater getMenuInflater()
  {
    return b.a();
  }
  
  public final CharSequence getSubtitle()
  {
    return b.g();
  }
  
  public final Object getTag()
  {
    return b.b;
  }
  
  public final CharSequence getTitle()
  {
    return b.f();
  }
  
  public final boolean getTitleOptionalHint()
  {
    return b.c;
  }
  
  public final void invalidate()
  {
    b.d();
  }
  
  public final boolean isTitleOptional()
  {
    return b.h();
  }
  
  public final void setCustomView(View paramView)
  {
    b.a(paramView);
  }
  
  public final void setSubtitle(int paramInt)
  {
    b.b(paramInt);
  }
  
  public final void setSubtitle(CharSequence paramCharSequence)
  {
    b.a(paramCharSequence);
  }
  
  public final void setTag(Object paramObject)
  {
    b.b = paramObject;
  }
  
  public final void setTitle(int paramInt)
  {
    b.a(paramInt);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    b.b(paramCharSequence);
  }
  
  public final void setTitleOptionalHint(boolean paramBoolean)
  {
    b.a(paramBoolean);
  }
  
  public static final class a
    implements b.a
  {
    final ActionMode.Callback a;
    final Context b;
    final ArrayList<f> c;
    final k<Menu, Menu> d;
    
    public a(Context paramContext, ActionMode.Callback paramCallback)
    {
      b = paramContext;
      a = paramCallback;
      c = new ArrayList();
      d = new k();
    }
    
    private Menu a(Menu paramMenu)
    {
      Menu localMenu2 = (Menu)d.get(paramMenu);
      Menu localMenu1 = localMenu2;
      if (localMenu2 == null)
      {
        localMenu1 = q.a(b, (a)paramMenu);
        d.put(paramMenu, localMenu1);
      }
      return localMenu1;
    }
    
    public final void a(b paramb)
    {
      a.onDestroyActionMode(b(paramb));
    }
    
    public final boolean a(b paramb, Menu paramMenu)
    {
      return a.onCreateActionMode(b(paramb), a(paramMenu));
    }
    
    public final boolean a(b paramb, MenuItem paramMenuItem)
    {
      return a.onActionItemClicked(b(paramb), q.a(b, (android.support.v4.e.a.b)paramMenuItem));
    }
    
    public final ActionMode b(b paramb)
    {
      int j = c.size();
      int i = 0;
      while (i < j)
      {
        f localf = (f)c.get(i);
        if ((localf != null) && (b == paramb)) {
          return localf;
        }
        i += 1;
      }
      paramb = new f(b, paramb);
      c.add(paramb);
      return paramb;
    }
    
    public final boolean b(b paramb, Menu paramMenu)
    {
      return a.onPrepareActionMode(b(paramb), a(paramMenu));
    }
  }
}


/* Location:              android/support/v7/view/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */