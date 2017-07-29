package android.support.v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.view.Window;
import android.view.Window.Callback;

class l
  extends k
{
  private final UiModeManager y;
  
  l(Context paramContext, Window paramWindow, f paramf)
  {
    super(paramContext, paramWindow, paramf);
    UiModeManager localUiModeManager = (UiModeManager)paramContext.getSystemService("uimode");
    y = localUiModeManager;
  }
  
  Window.Callback a(Window.Callback paramCallback)
  {
    l.a locala = new android/support/v7/app/l$a;
    locala.<init>(this, paramCallback);
    return locala;
  }
  
  final int f(int paramInt)
  {
    if (paramInt == 0)
    {
      UiModeManager localUiModeManager = y;
      i = localUiModeManager.getNightMode();
      if (i != 0) {}
    }
    for (int i = -1;; i = super.f(paramInt)) {
      return i;
    }
  }
}


/* Location:              android/support/v7/app/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */