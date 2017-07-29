package android.support.v7.app;

import android.annotation.TargetApi;
import android.app.UiModeManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Window;
import android.view.Window.Callback;

@TargetApi(23)
class l
  extends k
{
  private final UiModeManager y;
  
  l(Context paramContext, Window paramWindow, f paramf)
  {
    super(paramContext, paramWindow, paramf);
    y = ((UiModeManager)paramContext.getSystemService("uimode"));
  }
  
  Window.Callback a(Window.Callback paramCallback)
  {
    return new a(paramCallback);
  }
  
  final int f(int paramInt)
  {
    if ((paramInt == 0) && (y.getNightMode() == 0)) {
      return -1;
    }
    return super.f(paramInt);
  }
  
  class a
    extends k.a
  {
    a(Window.Callback paramCallback)
    {
      super(paramCallback);
    }
    
    public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
    {
      return null;
    }
    
    public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt)
    {
      if (p) {}
      switch (paramInt)
      {
      default: 
        return super.onWindowStartingActionMode(paramCallback, paramInt);
      }
      return a(paramCallback);
    }
  }
}


/* Location:              android/support/v7/app/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */