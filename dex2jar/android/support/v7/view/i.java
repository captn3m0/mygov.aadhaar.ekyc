package android.support.v7.view;

import android.annotation.TargetApi;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class i
  implements Window.Callback
{
  final Window.Callback e;
  
  public i(Window.Callback paramCallback)
  {
    if (paramCallback == null) {
      throw new IllegalArgumentException("Window callback may not be null");
    }
    e = paramCallback;
  }
  
  @TargetApi(12)
  public boolean dispatchGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    return e.dispatchGenericMotionEvent(paramMotionEvent);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return e.dispatchKeyEvent(paramKeyEvent);
  }
  
  @TargetApi(11)
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    return e.dispatchKeyShortcutEvent(paramKeyEvent);
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return e.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return e.dispatchTouchEvent(paramMotionEvent);
  }
  
  public boolean dispatchTrackballEvent(MotionEvent paramMotionEvent)
  {
    return e.dispatchTrackballEvent(paramMotionEvent);
  }
  
  @TargetApi(11)
  public void onActionModeFinished(ActionMode paramActionMode)
  {
    e.onActionModeFinished(paramActionMode);
  }
  
  @TargetApi(11)
  public void onActionModeStarted(ActionMode paramActionMode)
  {
    e.onActionModeStarted(paramActionMode);
  }
  
  public void onAttachedToWindow()
  {
    e.onAttachedToWindow();
  }
  
  public void onContentChanged()
  {
    e.onContentChanged();
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    return e.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public View onCreatePanelView(int paramInt)
  {
    return e.onCreatePanelView(paramInt);
  }
  
  public void onDetachedFromWindow()
  {
    e.onDetachedFromWindow();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    return e.onMenuItemSelected(paramInt, paramMenuItem);
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return e.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    e.onPanelClosed(paramInt, paramMenu);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    return e.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  @TargetApi(24)
  public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> paramList, Menu paramMenu, int paramInt)
  {
    e.onProvideKeyboardShortcuts(paramList, paramMenu, paramInt);
  }
  
  public boolean onSearchRequested()
  {
    return e.onSearchRequested();
  }
  
  @TargetApi(23)
  public boolean onSearchRequested(SearchEvent paramSearchEvent)
  {
    return e.onSearchRequested(paramSearchEvent);
  }
  
  public void onWindowAttributesChanged(WindowManager.LayoutParams paramLayoutParams)
  {
    e.onWindowAttributesChanged(paramLayoutParams);
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    e.onWindowFocusChanged(paramBoolean);
  }
  
  @TargetApi(11)
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    return e.onWindowStartingActionMode(paramCallback);
  }
  
  @TargetApi(23)
  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt)
  {
    return e.onWindowStartingActionMode(paramCallback, paramInt);
  }
}


/* Location:              android/support/v7/view/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */