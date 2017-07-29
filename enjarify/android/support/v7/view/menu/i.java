package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.support.v7.app.d;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;

final class i
  implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, o.a
{
  h a;
  d b;
  f c;
  private o.a d;
  
  public i(h paramh)
  {
    a = paramh;
  }
  
  public final void a(h paramh, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      localObject = a;
      if (paramh != localObject) {}
    }
    else
    {
      localObject = b;
      if (localObject != null)
      {
        localObject = b;
        ((d)localObject).dismiss();
      }
    }
    Object localObject = d;
    if (localObject != null)
    {
      localObject = d;
      ((o.a)localObject).a(paramh, paramBoolean);
    }
  }
  
  public final boolean a(h paramh)
  {
    o.a locala = d;
    boolean bool;
    if (locala != null)
    {
      locala = d;
      bool = locala.a(paramh);
    }
    for (;;)
    {
      return bool;
      bool = false;
      locala = null;
    }
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    h localh = a;
    j localj = (j)c.d().getItem(paramInt);
    localh.a(localj, null, 0);
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    f localf = c;
    h localh = a;
    localf.a(localh, true);
  }
  
  public final boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 1;
    int j = 82;
    Object localObject;
    if (paramInt != j)
    {
      j = 4;
      if (paramInt != j) {}
    }
    else
    {
      j = paramKeyEvent.getAction();
      if (j == 0)
      {
        j = paramKeyEvent.getRepeatCount();
        if (j == 0)
        {
          localObject = b.getWindow();
          if (localObject == null) {
            break label189;
          }
          localObject = ((Window)localObject).getDecorView();
          if (localObject == null) {
            break label189;
          }
          localObject = ((View)localObject).getKeyDispatcherState();
          if (localObject == null) {
            break label189;
          }
          ((KeyEvent.DispatcherState)localObject).startTracking(paramKeyEvent, this);
        }
      }
    }
    for (;;)
    {
      return i;
      j = paramKeyEvent.getAction();
      if (j == i)
      {
        bool = paramKeyEvent.isCanceled();
        if (!bool)
        {
          localObject = b.getWindow();
          if (localObject != null)
          {
            localObject = ((Window)localObject).getDecorView();
            if (localObject != null)
            {
              localObject = ((View)localObject).getKeyDispatcherState();
              if (localObject != null)
              {
                bool = ((KeyEvent.DispatcherState)localObject).isTracking(paramKeyEvent);
                if (bool)
                {
                  localObject = a;
                  ((h)localObject).b(i);
                  paramDialogInterface.dismiss();
                  continue;
                }
              }
            }
          }
        }
      }
      label189:
      h localh = a;
      boolean bool = false;
      localObject = null;
      i = localh.performShortcut(paramInt, paramKeyEvent, 0);
    }
  }
}


/* Location:              android/support/v7/view/menu/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */