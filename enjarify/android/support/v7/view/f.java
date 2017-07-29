package android.support.v7.view;

import android.content.Context;
import android.support.v4.e.a.a;
import android.support.v7.view.menu.q;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

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
    Context localContext = a;
    a locala = (a)b.b();
    return q.a(localContext, locala);
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
}


/* Location:              android/support/v7/view/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */