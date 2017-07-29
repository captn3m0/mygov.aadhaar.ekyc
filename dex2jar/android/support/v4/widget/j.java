package android.support.v4.widget;

import android.os.Build.VERSION;
import android.support.v4.h.f;
import android.support.v4.h.w;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public final class j
{
  static final e a = new c();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      a = new b();
      return;
    }
    if (i >= 21)
    {
      a = new a();
      return;
    }
    if (i >= 19)
    {
      a = new d();
      return;
    }
  }
  
  public static void a(PopupWindow paramPopupWindow, int paramInt)
  {
    a.a(paramPopupWindow, paramInt);
  }
  
  public static void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    a.a(paramPopupWindow, paramView, paramInt1, paramInt2, paramInt3);
  }
  
  public static void a(PopupWindow paramPopupWindow, boolean paramBoolean)
  {
    a.a(paramPopupWindow, paramBoolean);
  }
  
  static class a
    extends j.d
  {
    public void a(PopupWindow paramPopupWindow, boolean paramBoolean)
    {
      k.a(paramPopupWindow, paramBoolean);
    }
  }
  
  static final class b
    extends j.a
  {
    public final void a(PopupWindow paramPopupWindow, int paramInt)
    {
      paramPopupWindow.setWindowLayoutType(paramInt);
    }
    
    public final void a(PopupWindow paramPopupWindow, boolean paramBoolean)
    {
      paramPopupWindow.setOverlapAnchor(paramBoolean);
    }
  }
  
  static class c
    implements j.e
  {
    private static Method a;
    private static boolean b;
    
    public void a(PopupWindow paramPopupWindow, int paramInt)
    {
      if (!b) {}
      try
      {
        Method localMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[] { Integer.TYPE });
        a = localMethod;
        localMethod.setAccessible(true);
        b = true;
        if (a != null) {}
        try
        {
          a.invoke(paramPopupWindow, new Object[] { Integer.valueOf(paramInt) });
          return;
        }
        catch (Exception paramPopupWindow) {}
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
    
    public void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
    {
      int i = paramInt1;
      if ((f.a(paramInt3, w.g(paramView)) & 0x7) == 5) {
        i = paramInt1 - (paramPopupWindow.getWidth() - paramView.getWidth());
      }
      paramPopupWindow.showAsDropDown(paramView, i, paramInt2);
    }
    
    public void a(PopupWindow paramPopupWindow, boolean paramBoolean) {}
  }
  
  static class d
    extends j.c
  {
    public final void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
    {
      paramPopupWindow.showAsDropDown(paramView, paramInt1, paramInt2, paramInt3);
    }
  }
  
  static abstract interface e
  {
    public abstract void a(PopupWindow paramPopupWindow, int paramInt);
    
    public abstract void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3);
    
    public abstract void a(PopupWindow paramPopupWindow, boolean paramBoolean);
  }
}


/* Location:              android/support/v4/widget/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */