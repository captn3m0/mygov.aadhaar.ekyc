package android.support.v7.app;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Window.Callback;

class l$a
  extends k.a
{
  l$a(l paraml, Window.Callback paramCallback)
  {
    super(paraml, paramCallback);
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt)
  {
    Object localObject = d;
    boolean bool = p;
    if (bool) {
      switch (paramInt)
      {
      }
    }
    for (localObject = super.onWindowStartingActionMode(paramCallback, paramInt);; localObject = a(paramCallback)) {
      return (ActionMode)localObject;
    }
  }
}


/* Location:              android/support/v7/app/l$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */