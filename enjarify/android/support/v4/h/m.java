package android.support.v4.h;

import android.os.Build.VERSION;
import android.support.v4.e.a.b;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public final class m
{
  static final m.d a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 14;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/h/m$c;
      ((m.c)localObject).<init>();
      a = (m.d)localObject;
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 11;
      if (i >= j)
      {
        localObject = new android/support/v4/h/m$b;
        ((m.b)localObject).<init>();
        a = (m.d)localObject;
      }
      else
      {
        localObject = new android/support/v4/h/m$a;
        ((m.a)localObject).<init>();
        a = (m.d)localObject;
      }
    }
  }
  
  public static MenuItem a(MenuItem paramMenuItem, e parame)
  {
    boolean bool = paramMenuItem instanceof b;
    if (bool) {
      paramMenuItem = ((b)paramMenuItem).a(parame);
    }
    for (;;)
    {
      return paramMenuItem;
      String str1 = "MenuItemCompat";
      String str2 = "setActionProvider: item does not implement SupportMenuItem; ignoring";
      Log.w(str1, str2);
    }
  }
  
  public static MenuItem a(MenuItem paramMenuItem, View paramView)
  {
    boolean bool = paramMenuItem instanceof b;
    if (bool) {
      paramMenuItem = (b)paramMenuItem;
    }
    for (MenuItem localMenuItem = paramMenuItem.setActionView(paramView);; localMenuItem = a.a(paramMenuItem, paramView)) {
      return localMenuItem;
    }
  }
  
  public static View a(MenuItem paramMenuItem)
  {
    boolean bool = paramMenuItem instanceof b;
    if (bool) {
      paramMenuItem = (b)paramMenuItem;
    }
    for (View localView = paramMenuItem.getActionView();; localView = a.a(paramMenuItem)) {
      return localView;
    }
  }
  
  public static void a(MenuItem paramMenuItem, int paramInt)
  {
    boolean bool = paramMenuItem instanceof b;
    if (bool)
    {
      paramMenuItem = (b)paramMenuItem;
      paramMenuItem.setShowAsAction(paramInt);
    }
    for (;;)
    {
      return;
      m.d locald = a;
      locald.a(paramMenuItem, paramInt);
    }
  }
  
  public static MenuItem b(MenuItem paramMenuItem, int paramInt)
  {
    boolean bool = paramMenuItem instanceof b;
    if (bool) {
      paramMenuItem = (b)paramMenuItem;
    }
    for (MenuItem localMenuItem = paramMenuItem.setActionView(paramInt);; localMenuItem = a.b(paramMenuItem, paramInt)) {
      return localMenuItem;
    }
  }
  
  public static boolean b(MenuItem paramMenuItem)
  {
    boolean bool = paramMenuItem instanceof b;
    if (bool) {
      paramMenuItem = (b)paramMenuItem;
    }
    m.d locald;
    for (bool = paramMenuItem.expandActionView();; bool = locald.b(paramMenuItem))
    {
      return bool;
      locald = a;
    }
  }
  
  public static boolean c(MenuItem paramMenuItem)
  {
    boolean bool = paramMenuItem instanceof b;
    if (bool) {
      paramMenuItem = (b)paramMenuItem;
    }
    m.d locald;
    for (bool = paramMenuItem.isActionViewExpanded();; bool = locald.c(paramMenuItem))
    {
      return bool;
      locald = a;
    }
  }
}


/* Location:              android/support/v4/h/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */