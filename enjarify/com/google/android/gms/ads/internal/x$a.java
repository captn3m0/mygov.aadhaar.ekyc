package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.b.tw;
import com.google.android.gms.b.uj;
import com.google.android.gms.b.vc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class x$a
  extends ViewSwitcher
{
  final tw a;
  final uj b;
  boolean c;
  
  public x$a(Context paramContext, String paramString1, String paramString2, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    super(paramContext);
    Object localObject = new com/google/android/gms/b/tw;
    ((tw)localObject).<init>(paramContext);
    a = ((tw)localObject);
    a.c = paramString1;
    localObject = a;
    d = paramString2;
    c = true;
    boolean bool = paramContext instanceof Activity;
    if (bool)
    {
      localObject = new com/google/android/gms/b/uj;
      paramContext = (Activity)paramContext;
      ((uj)localObject).<init>(paramContext, this, paramOnGlobalLayoutListener, paramOnScrollChangedListener);
    }
    for (b = ((uj)localObject);; b = ((uj)localObject))
    {
      b.a();
      return;
      localObject = new com/google/android/gms/b/uj;
      ((uj)localObject).<init>(null, this, paramOnGlobalLayoutListener, paramOnScrollChangedListener);
    }
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    uj localuj = b;
    if (localuj != null)
    {
      localuj = b;
      localuj.c();
    }
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    uj localuj = b;
    if (localuj != null)
    {
      localuj = b;
      localuj.d();
    }
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = c;
    if (bool)
    {
      tw localtw = a;
      localtw.a(paramMotionEvent);
    }
    return false;
  }
  
  public final void removeAllViews()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = 0;
    Object localObject = null;
    int j = 0;
    Iterator localIterator = null;
    for (;;)
    {
      i = getChildCount();
      if (j >= i) {
        break;
      }
      localObject = getChildAt(j);
      if (localObject != null)
      {
        boolean bool2 = localObject instanceof vc;
        if (bool2)
        {
          localObject = (vc)localObject;
          localArrayList.add(localObject);
        }
      }
      i = j + 1;
      j = i;
    }
    super.removeAllViews();
    localIterator = localArrayList.iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (vc)localIterator.next();
      ((vc)localObject).destroy();
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/x$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */