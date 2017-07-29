package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.view.SubMenu;

public final class b
  extends h
{
  public b(Context paramContext)
  {
    super(paramContext);
  }
  
  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    j localj = (j)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    d locald = new android/support/design/internal/d;
    Context localContext = a;
    locald.<init>(localContext, this, localj);
    localj.a(locald);
    return locald;
  }
}


/* Location:              android/support/design/internal/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */