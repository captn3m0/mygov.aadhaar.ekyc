package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.v7.a.a.a;
import android.support.v7.a.a.g;
import android.support.v7.a.a.i;
import android.support.v7.view.i;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.o;
import android.support.v7.view.menu.o.a;
import android.support.v7.widget.ae;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;
import android.widget.ListAdapter;

final class q$d
  extends i
{
  public q$d(q paramq, Window.Callback paramCallback)
  {
    super(paramCallback);
  }
  
  public final View onCreatePanelView(int paramInt)
  {
    boolean bool1 = true;
    Object localObject1;
    switch (paramInt)
    {
    default: 
      localObject1 = super.onCreatePanelView(paramInt);
    }
    for (;;)
    {
      return (View)localObject1;
      localObject1 = a.a;
      Object localObject2 = ((ae)localObject1).r();
      boolean bool2 = onPreparePanel(paramInt, null, (Menu)localObject2);
      if (!bool2) {
        break;
      }
      bool2 = onMenuOpened(paramInt, (Menu)localObject2);
      if (!bool2) {
        break;
      }
      q localq = a;
      localObject1 = d;
      Object localObject3;
      Object localObject4;
      Resources.Theme localTheme1;
      Resources.Theme localTheme2;
      int j;
      int k;
      if (localObject1 == null)
      {
        bool2 = localObject2 instanceof h;
        if (bool2)
        {
          localObject1 = localObject2;
          localObject1 = (h)localObject2;
          localObject3 = a.b();
          localObject4 = new android/util/TypedValue;
          ((TypedValue)localObject4).<init>();
          localTheme1 = ((Context)localObject3).getResources().newTheme();
          localTheme2 = ((Context)localObject3).getTheme();
          localTheme1.setTo(localTheme2);
          j = a.a.actionBarPopupTheme;
          localTheme1.resolveAttribute(j, (TypedValue)localObject4, bool1);
          j = resourceId;
          if (j != 0)
          {
            j = resourceId;
            localTheme1.applyStyle(j, bool1);
          }
          j = a.a.panelMenuListTheme;
          localTheme1.resolveAttribute(j, (TypedValue)localObject4, bool1);
          j = resourceId;
          if (j == 0) {
            break label359;
          }
          k = resourceId;
          localTheme1.applyStyle(k, bool1);
        }
      }
      for (;;)
      {
        localObject4 = new android/view/ContextThemeWrapper;
        j = 0;
        localTheme2 = null;
        ((ContextThemeWrapper)localObject4).<init>((Context)localObject3, 0);
        ((Context)localObject4).getTheme().setTo(localTheme1);
        localObject3 = new android/support/v7/view/menu/f;
        int m = a.g.abc_list_menu_item_layout;
        ((f)localObject3).<init>((Context)localObject4, m);
        d = ((f)localObject3);
        localObject3 = d;
        localObject4 = new android/support/v7/app/q$c;
        ((q.c)localObject4).<init>(localq);
        h = ((o.a)localObject4);
        localObject3 = d;
        ((h)localObject1).a((o)localObject3);
        if (localObject2 != null)
        {
          localObject1 = d;
          if (localObject1 != null) {
            break label375;
          }
        }
        bool2 = false;
        localObject1 = null;
        break;
        label359:
        k = a.i.Theme_AppCompat_CompactMenu;
        localTheme1.applyStyle(k, bool1);
      }
      label375:
      localObject1 = d.d();
      int i = ((ListAdapter)localObject1).getCount();
      if (i > 0)
      {
        localObject1 = d;
        localObject2 = a.a();
        localObject1 = (View)((f)localObject1).a((ViewGroup)localObject2);
      }
      else
      {
        i = 0;
        localObject1 = null;
      }
    }
  }
  
  public final boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    boolean bool1 = super.onPreparePanel(paramInt, paramView, paramMenu);
    if (bool1)
    {
      q localq = a;
      boolean bool2 = b;
      if (!bool2)
      {
        a.a.m();
        localq = a;
        boolean bool3 = true;
        b = bool3;
      }
    }
    return bool1;
  }
}


/* Location:              android/support/v7/app/q$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */