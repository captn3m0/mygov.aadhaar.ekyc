package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.a;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window.Callback;

final class bg$1
  implements View.OnClickListener
{
  final a a;
  
  bg$1(bg parambg)
  {
    a locala = new android/support/v7/view/menu/a;
    Context localContext = b.a.getContext();
    CharSequence localCharSequence = b.b;
    locala.<init>(localContext, localCharSequence);
    a = locala;
  }
  
  public final void onClick(View paramView)
  {
    Object localObject = b.c;
    if (localObject != null)
    {
      localObject = b;
      boolean bool = d;
      if (bool)
      {
        localObject = b.c;
        a locala = a;
        ((Window.Callback)localObject).onMenuItemSelected(0, locala);
      }
    }
  }
}


/* Location:              android/support/v7/widget/bg$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */