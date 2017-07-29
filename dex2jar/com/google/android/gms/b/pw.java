package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

@qi
@TargetApi(19)
public final class pw
  extends pu
{
  private Object h = new Object();
  private PopupWindow i;
  private boolean j = false;
  
  pw(Context paramContext, tg.a parama, vc paramvc, pt.a parama1)
  {
    super(paramContext, parama, paramvc, parama1);
  }
  
  private void e()
  {
    synchronized (h)
    {
      j = true;
      if (((b instanceof Activity)) && (((Activity)b).isDestroyed())) {
        i = null;
      }
      if (i != null)
      {
        if (i.isShowing()) {
          i.dismiss();
        }
        i = null;
      }
      return;
    }
  }
  
  protected final void a(int paramInt)
  {
    e();
    super.a(paramInt);
  }
  
  public final void b()
  {
    e();
    super.b();
  }
  
  protected final void d()
  {
    if ((b instanceof Activity)) {}
    Object localObject2;
    for (Window localWindow = ((Activity)b).getWindow();; localObject2 = null)
    {
      if ((localWindow == null) || (localWindow.getDecorView() == null)) {}
      while (((Activity)b).isDestroyed()) {
        return;
      }
      FrameLayout localFrameLayout = new FrameLayout(b);
      localFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      localFrameLayout.addView(c.b(), -1, -1);
      synchronized (h)
      {
        if (j) {
          return;
        }
      }
      i = new PopupWindow(localFrameLayout, 1, 1, false);
      i.setOutsideTouchable(true);
      i.setClippingEnabled(false);
      tp.b("Displaying the 1x1 popup off the screen.");
      try
      {
        i.showAtLocation(((Window)localObject1).getDecorView(), 0, -1, -1);
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          i = null;
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/pw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */