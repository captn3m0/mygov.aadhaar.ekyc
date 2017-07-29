package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.c.a.a;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Method;

public class SearchView$SearchAutoComplete
  extends g
{
  private int a;
  private SearchView b;
  
  public SearchView$SearchAutoComplete(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SearchView$SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public SearchView$SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    int i = getThreshold();
    a = i;
  }
  
  private int getSearchViewTextMinWidthDp()
  {
    Configuration localConfiguration = getResources().getConfiguration();
    Resources localResources1 = getResources();
    int i = a.b(localResources1);
    Resources localResources2 = getResources();
    int j = a.a(localResources2);
    int k = 960;
    int m;
    if (i >= k)
    {
      k = 720;
      if (j >= k)
      {
        m = orientation;
        k = 2;
        if (m == k) {
          m = 256;
        }
      }
    }
    for (;;)
    {
      return m;
      m = 600;
      if (i < m)
      {
        m = 640;
        if (i >= m)
        {
          m = 480;
          if (j < m) {}
        }
      }
      else
      {
        m = 192;
        continue;
      }
      m = 160;
    }
  }
  
  public boolean enoughToFilter()
  {
    int i = a;
    if (i > 0)
    {
      bool = super.enoughToFilter();
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    float f = getSearchViewTextMinWidthDp();
    int i = (int)TypedValue.applyDimension(1, f, localDisplayMetrics);
    setMinWidth(i);
  }
  
  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    b.d();
  }
  
  public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 1;
    int j = 4;
    Object localObject;
    if (paramInt == j)
    {
      j = paramKeyEvent.getAction();
      if (j == 0)
      {
        j = paramKeyEvent.getRepeatCount();
        if (j == 0)
        {
          localObject = getKeyDispatcherState();
          if (localObject != null) {
            ((KeyEvent.DispatcherState)localObject).startTracking(paramKeyEvent, this);
          }
        }
      }
    }
    for (;;)
    {
      return i;
      j = paramKeyEvent.getAction();
      if (j == i)
      {
        localObject = getKeyDispatcherState();
        if (localObject != null) {
          ((KeyEvent.DispatcherState)localObject).handleUpEvent(paramKeyEvent);
        }
        boolean bool = paramKeyEvent.isTracking();
        if (bool)
        {
          bool = paramKeyEvent.isCanceled();
          if (!bool)
          {
            b.clearFocus();
            localObject = b;
            ((SearchView)localObject).setImeVisibility(false);
            continue;
          }
        }
      }
      i = super.onKeyPreIme(paramInt, paramKeyEvent);
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    Object localObject1;
    Object localObject2;
    if (paramBoolean)
    {
      localObject1 = b;
      boolean bool1 = ((SearchView)localObject1).hasFocus();
      if (bool1)
      {
        int i = getVisibility();
        if (i == 0)
        {
          localObject1 = getContext();
          localObject2 = "input_method";
          ((InputMethodManager)((Context)localObject1).getSystemService((String)localObject2)).showSoftInput(this, 0);
          localObject1 = getContext();
          boolean bool2 = SearchView.a((Context)localObject1);
          if (bool2)
          {
            localObject1 = SearchView.i;
            localObject2 = c;
            if (localObject2 == null) {}
          }
        }
      }
    }
    try
    {
      localObject1 = c;
      int j = 1;
      localObject2 = new Object[j];
      boolean bool3 = true;
      Boolean localBoolean = Boolean.valueOf(bool3);
      localObject2[0] = localBoolean;
      ((Method)localObject1).invoke(this, (Object[])localObject2);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public void performCompletion() {}
  
  protected void replaceText(CharSequence paramCharSequence) {}
  
  void setSearchView(SearchView paramSearchView)
  {
    b = paramSearchView;
  }
  
  public void setThreshold(int paramInt)
  {
    super.setThreshold(paramInt);
    a = paramInt;
  }
}


/* Location:              android/support/v7/widget/SearchView$SearchAutoComplete.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */