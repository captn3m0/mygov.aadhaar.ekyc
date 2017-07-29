package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

public final class pw
  extends pu
{
  private Object h;
  private PopupWindow i;
  private boolean j;
  
  pw(Context paramContext, tg.a parama, vc paramvc, pt.a parama1)
  {
    super(paramContext, parama, paramvc, parama1);
    Object localObject = new java/lang/Object;
    localObject.<init>();
    h = localObject;
    j = false;
  }
  
  private void e()
  {
    Object localObject1 = h;
    boolean bool = true;
    try
    {
      j = bool;
      Object localObject2 = b;
      bool = localObject2 instanceof Activity;
      if (bool)
      {
        localObject2 = b;
        localObject2 = (Activity)localObject2;
        bool = ((Activity)localObject2).isDestroyed();
        if (bool)
        {
          bool = false;
          localObject2 = null;
          i = null;
        }
      }
      localObject2 = i;
      if (localObject2 != null)
      {
        localObject2 = i;
        bool = ((PopupWindow)localObject2).isShowing();
        if (bool)
        {
          localObject2 = i;
          ((PopupWindow)localObject2).dismiss();
        }
        bool = false;
        localObject2 = null;
        i = null;
      }
      return;
    }
    finally {}
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
    boolean bool1 = false;
    Object localObject1 = null;
    int k = -1;
    Object localObject4 = b;
    boolean bool3 = localObject4 instanceof Activity;
    if (bool3) {
      localObject1 = ((Activity)b).getWindow();
    }
    for (localObject4 = localObject1;; localObject4 = null)
    {
      if (localObject4 != null)
      {
        localObject1 = ((Window)localObject4).getDecorView();
        if (localObject1 != null) {
          break label54;
        }
      }
      for (;;)
      {
        return;
        label54:
        localObject1 = (Activity)b;
        bool1 = ((Activity)localObject1).isDestroyed();
        boolean bool2;
        PopupWindow localPopupWindow;
        int m;
        int n;
        Object localObject2;
        if (!bool1)
        {
          localObject1 = new android/widget/FrameLayout;
          ??? = b;
          ((FrameLayout)localObject1).<init>((Context)???);
          ??? = new android/view/ViewGroup$LayoutParams;
          ((ViewGroup.LayoutParams)???).<init>(k, k);
          ((FrameLayout)localObject1).setLayoutParams((ViewGroup.LayoutParams)???);
          ??? = c.b();
          ((FrameLayout)localObject1).addView((View)???, k, k);
          synchronized (h)
          {
            bool2 = j;
            if (!bool2) {}
          }
          localPopupWindow = new android/widget/PopupWindow;
          m = 1;
          n = 1;
          localPopupWindow.<init>(localView, m, n, false);
          i = localPopupWindow;
          localObject2 = i;
          bool2 = true;
          ((PopupWindow)localObject2).setOutsideTouchable(bool2);
          localObject2 = i;
          bool2 = false;
          localPopupWindow = null;
          ((PopupWindow)localObject2).setClippingEnabled(false);
          localObject2 = "Displaying the 1x1 popup off the screen.";
          tp.b((String)localObject2);
        }
        try
        {
          localObject2 = i;
          localObject4 = ((Window)localObject4).getDecorView();
          bool2 = false;
          localPopupWindow = null;
          m = -1;
          n = -1;
          ((PopupWindow)localObject2).showAtLocation((View)localObject4, 0, m, n);
        }
        catch (Exception localException)
        {
          for (;;)
          {
            bool1 = false;
            Object localObject3 = null;
            i = null;
          }
        }
      }
      bool3 = false;
    }
  }
}


/* Location:              com/google/android/gms/b/pw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */