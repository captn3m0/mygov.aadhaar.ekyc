package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v7.view.menu.ListMenuItemView;
import android.support.v7.view.menu.g;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HeaderViewListAdapter;

public final class aq$a
  extends ah
{
  final int h;
  final int i;
  private ap j;
  private MenuItem k;
  
  public aq$a(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, paramBoolean);
    Configuration localConfiguration = paramContext.getResources().getConfiguration();
    int i1 = Build.VERSION.SDK_INT;
    int i2 = 17;
    if (i1 >= i2)
    {
      i1 = 1;
      int i3 = localConfiguration.getLayoutDirection();
      if (i1 == i3) {
        h = n;
      }
    }
    for (i = m;; i = n)
    {
      return;
      h = m;
    }
  }
  
  public final boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    Object localObject1 = j;
    int m;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = getAdapter();
      boolean bool = localObject1 instanceof HeaderViewListAdapter;
      if (!bool) {
        break label199;
      }
      localObject1 = (HeaderViewListAdapter)localObject1;
      m = ((HeaderViewListAdapter)localObject1).getHeadersCount();
      localObject1 = (g)((HeaderViewListAdapter)localObject1).getWrappedAdapter();
      localObject2 = null;
      int n = paramMotionEvent.getAction();
      int i1 = 10;
      if (n == i1) {
        break label212;
      }
      float f = paramMotionEvent.getX();
      n = (int)f;
      i1 = (int)paramMotionEvent.getY();
      n = pointToPosition(n, i1);
      i1 = -1;
      if (n == i1) {
        break label212;
      }
      m = n - m;
      if (m < 0) {
        break label212;
      }
      n = ((g)localObject1).getCount();
      if (m >= n) {
        break label212;
      }
    }
    for (j localj = ((g)localObject1).a(m);; localj = null)
    {
      localObject2 = k;
      if (localObject2 != localj)
      {
        localObject1 = b;
        if (localObject2 != null)
        {
          ap localap = j;
          localap.a((h)localObject1, (MenuItem)localObject2);
        }
        k = localj;
        if (localj != null)
        {
          localObject2 = j;
          ((ap)localObject2).b((h)localObject1, localj);
        }
      }
      return super.onHoverEvent(paramMotionEvent);
      label199:
      m = 0;
      localj = null;
      localObject1 = (g)localObject1;
      break;
      label212:
      m = 0;
    }
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    int m = 1;
    Object localObject = (ListMenuItemView)getSelectedView();
    j localj;
    int i1;
    boolean bool2;
    if (localObject != null)
    {
      int n = h;
      if (paramInt == n)
      {
        boolean bool1 = ((ListMenuItemView)localObject).isEnabled();
        if (bool1)
        {
          localj = ((ListMenuItemView)localObject).getItemData();
          bool1 = localj.hasSubMenu();
          if (bool1)
          {
            i1 = getSelectedItemPosition();
            long l = getSelectedItemId();
            performItemClick((View)localObject, i1, l);
          }
        }
        bool2 = m;
      }
    }
    for (;;)
    {
      return bool2;
      if (localObject != null)
      {
        int i2 = i;
        if (paramInt == i2)
        {
          setSelection(-1);
          localObject = getAdapterb;
          i1 = 0;
          localj = null;
          ((h)localObject).b(false);
          i2 = m;
          continue;
        }
      }
      boolean bool3 = super.onKeyDown(paramInt, paramKeyEvent);
    }
  }
  
  public final void setHoverListener(ap paramap)
  {
    j = paramap;
  }
}


/* Location:              android/support/v7/widget/aq$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */