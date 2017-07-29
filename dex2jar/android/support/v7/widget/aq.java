package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v7.view.menu.ListMenuItemView;
import android.support.v7.view.menu.g;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public final class aq
  extends an
  implements ap
{
  public static Method a;
  public ap b;
  
  static
  {
    try
    {
      a = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[] { Boolean.TYPE });
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
    }
  }
  
  public aq(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext, null, paramInt1, paramInt2);
  }
  
  final ah a(Context paramContext, boolean paramBoolean)
  {
    paramContext = new a(paramContext, paramBoolean);
    paramContext.setHoverListener(this);
    return paramContext;
  }
  
  public final void a(h paramh, MenuItem paramMenuItem)
  {
    if (b != null) {
      b.a(paramh, paramMenuItem);
    }
  }
  
  public final void b(h paramh, MenuItem paramMenuItem)
  {
    if (b != null) {
      b.b(paramh, paramMenuItem);
    }
  }
  
  public static final class a
    extends ah
  {
    final int h;
    final int i;
    private ap j;
    private MenuItem k;
    
    public a(Context paramContext, boolean paramBoolean)
    {
      super(paramBoolean);
      paramContext = paramContext.getResources().getConfiguration();
      if ((Build.VERSION.SDK_INT >= 17) && (1 == paramContext.getLayoutDirection()))
      {
        h = 21;
        i = 22;
        return;
      }
      h = 22;
      i = 21;
    }
    
    public final boolean onHoverEvent(MotionEvent paramMotionEvent)
    {
      Object localObject;
      int m;
      if (j != null)
      {
        localObject = getAdapter();
        if (!(localObject instanceof HeaderViewListAdapter)) {
          break label166;
        }
        localObject = (HeaderViewListAdapter)localObject;
        m = ((HeaderViewListAdapter)localObject).getHeadersCount();
        localObject = (g)((HeaderViewListAdapter)localObject).getWrappedAdapter();
        if (paramMotionEvent.getAction() == 10) {
          break label178;
        }
        int n = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
        if (n == -1) {
          break label178;
        }
        m = n - m;
        if ((m < 0) || (m >= ((g)localObject).getCount())) {
          break label178;
        }
      }
      label166:
      label178:
      for (j localj = ((g)localObject).a(m);; localj = null)
      {
        MenuItem localMenuItem = k;
        if (localMenuItem != localj)
        {
          localObject = b;
          if (localMenuItem != null) {
            j.a((h)localObject, localMenuItem);
          }
          k = localj;
          if (localj != null) {
            j.b((h)localObject, localj);
          }
        }
        return super.onHoverEvent(paramMotionEvent);
        m = 0;
        localObject = (g)localObject;
        break;
      }
    }
    
    public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
    {
      ListMenuItemView localListMenuItemView = (ListMenuItemView)getSelectedView();
      if ((localListMenuItemView != null) && (paramInt == h))
      {
        if ((localListMenuItemView.isEnabled()) && (localListMenuItemView.getItemData().hasSubMenu())) {
          performItemClick(localListMenuItemView, getSelectedItemPosition(), getSelectedItemId());
        }
        return true;
      }
      if ((localListMenuItemView != null) && (paramInt == i))
      {
        setSelection(-1);
        getAdapterb.b(false);
        return true;
      }
      return super.onKeyDown(paramInt, paramKeyEvent);
    }
    
    public final void setHoverListener(ap paramap)
    {
      j = paramap;
    }
  }
}


/* Location:              android/support/v7/widget/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */