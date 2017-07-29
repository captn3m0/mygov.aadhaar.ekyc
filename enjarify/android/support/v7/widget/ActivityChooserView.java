package android.support.v7.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a.h;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;

public final class ActivityChooserView
  extends ViewGroup
{
  final ActivityChooserView.a a;
  final FrameLayout b;
  final FrameLayout c;
  android.support.v4.h.e d;
  final DataSetObserver e;
  PopupWindow.OnDismissListener f;
  boolean g;
  int h;
  private final ActivityChooserView.b i;
  private final am j;
  private final ImageView k;
  private final int l;
  private final ViewTreeObserver.OnGlobalLayoutListener m;
  private an n;
  private boolean o;
  private int p;
  
  private boolean b()
  {
    return getListPopupWindowq.isShowing();
  }
  
  final void a(int paramInt)
  {
    int i1 = 1;
    int i2 = 0;
    ActivityChooserView.a locala = null;
    Object localObject1 = a.a;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("No data model. Did you call #setDataModel?");
      throw ((Throwable)localObject1);
    }
    localObject1 = getViewTreeObserver();
    Object localObject2 = m;
    ((ViewTreeObserver)localObject1).addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject2);
    localObject1 = c;
    int i3 = ((FrameLayout)localObject1).getVisibility();
    int i6;
    if (i3 == 0)
    {
      i3 = i1;
      localObject2 = a.a;
      int i5 = ((e)localObject2).a();
      if (i3 == 0) {
        break label304;
      }
      i6 = i1;
      label100:
      int i7 = -1 >>> 1;
      if (paramInt == i7) {
        break label313;
      }
      i6 += paramInt;
      if (i5 <= i6) {
        break label313;
      }
      a.a(i1);
      localObject2 = a;
      i5 = paramInt + -1;
      ((ActivityChooserView.a)localObject2).a(i5);
      label150:
      localObject2 = getListPopupWindow();
      PopupWindow localPopupWindow = q;
      boolean bool = localPopupWindow.isShowing();
      if (!bool)
      {
        bool = g;
        if ((!bool) && (i3 != 0)) {
          break label336;
        }
        locala = a;
        locala.a(i1, i3);
      }
    }
    for (;;)
    {
      int i4 = a.a();
      i2 = l;
      i4 = Math.min(i4, i2);
      ((an)localObject2).b(i4);
      ((an)localObject2).d();
      localObject1 = d;
      if (localObject1 != null)
      {
        localObject1 = d;
        ((android.support.v4.h.e)localObject1).a(i1);
      }
      localObject1 = e;
      Object localObject3 = getContext();
      i2 = a.h.abc_activitychooserview_choose_application;
      localObject3 = ((Context)localObject3).getString(i2);
      ((ListView)localObject1).setContentDescription((CharSequence)localObject3);
      return;
      i4 = 0;
      localObject1 = null;
      break;
      label304:
      i6 = 0;
      localObject2 = null;
      break label100;
      label313:
      a.a(false);
      localObject2 = a;
      ((ActivityChooserView.a)localObject2).a(paramInt);
      break label150;
      label336:
      localObject1 = a;
      ((ActivityChooserView.a)localObject1).a(false, false);
    }
  }
  
  public final boolean a()
  {
    Object localObject = getListPopupWindowq;
    boolean bool1 = ((PopupWindow)localObject).isShowing();
    if (bool1)
    {
      getListPopupWindow().e();
      localObject = getViewTreeObserver();
      boolean bool2 = ((ViewTreeObserver)localObject).isAlive();
      if (bool2)
      {
        ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = m;
        ((ViewTreeObserver)localObject).removeGlobalOnLayoutListener(localOnGlobalLayoutListener);
      }
    }
    return true;
  }
  
  public final e getDataModel()
  {
    return a.a;
  }
  
  final an getListPopupWindow()
  {
    an localan = n;
    if (localan == null)
    {
      localan = new android/support/v7/widget/an;
      Object localObject = getContext();
      localan.<init>((Context)localObject);
      n = localan;
      localan = n;
      localObject = a;
      localan.a((ListAdapter)localObject);
      n.k = this;
      n.b();
      localan = n;
      localObject = i;
      l = ((AdapterView.OnItemClickListener)localObject);
      localan = n;
      localObject = i;
      localan.a((PopupWindow.OnDismissListener)localObject);
    }
    return n;
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    e locale = a.a;
    if (locale != null)
    {
      DataSetObserver localDataSetObserver = e;
      locale.registerObserver(localDataSetObserver);
    }
    o = true;
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject1 = a.a;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = e;
      ((e)localObject1).unregisterObserver(localObject2);
    }
    localObject1 = getViewTreeObserver();
    boolean bool1 = ((ViewTreeObserver)localObject1).isAlive();
    if (bool1)
    {
      localObject2 = m;
      ((ViewTreeObserver)localObject1).removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject2);
    }
    boolean bool2 = b();
    if (bool2) {
      a();
    }
    o = false;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    am localam = j;
    int i1 = paramInt3 - paramInt1;
    int i2 = paramInt4 - paramInt2;
    localam.layout(0, 0, i1, i2);
    boolean bool = b();
    if (!bool) {
      a();
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    am localam = j;
    FrameLayout localFrameLayout = c;
    int i1 = localFrameLayout.getVisibility();
    if (i1 != 0)
    {
      i1 = View.MeasureSpec.getSize(paramInt2);
      int i2 = 1073741824;
      paramInt2 = View.MeasureSpec.makeMeasureSpec(i1, i2);
    }
    measureChild(localam, paramInt1, paramInt2);
    i1 = localam.getMeasuredWidth();
    int i3 = localam.getMeasuredHeight();
    setMeasuredDimension(i1, i3);
  }
  
  public final void setActivityChooserModel(e parame)
  {
    Object localObject1 = a;
    Object localObject2 = c.a.a;
    if (localObject2 != null)
    {
      Object localObject3 = c;
      boolean bool1 = ((ActivityChooserView)localObject3).isShown();
      if (bool1)
      {
        localObject3 = c.e;
        ((e)localObject2).unregisterObserver(localObject3);
      }
    }
    a = parame;
    if (parame != null)
    {
      localObject2 = c;
      boolean bool2 = ((ActivityChooserView)localObject2).isShown();
      if (bool2)
      {
        localObject2 = c.e;
        parame.registerObserver(localObject2);
      }
    }
    ((ActivityChooserView.a)localObject1).notifyDataSetChanged();
    localObject1 = getListPopupWindowq;
    boolean bool3 = ((PopupWindow)localObject1).isShowing();
    if (bool3)
    {
      a();
      localObject1 = getListPopupWindowq;
      bool3 = ((PopupWindow)localObject1).isShowing();
      if (!bool3)
      {
        bool3 = o;
        if (bool3) {
          break label150;
        }
      }
    }
    for (;;)
    {
      return;
      label150:
      localObject1 = null;
      g = false;
      int i1 = h;
      a(i1);
    }
  }
  
  public final void setDefaultActionButtonContentDescription(int paramInt)
  {
    p = paramInt;
  }
  
  public final void setExpandActivityOverflowButtonContentDescription(int paramInt)
  {
    String str = getContext().getString(paramInt);
    k.setContentDescription(str);
  }
  
  public final void setExpandActivityOverflowButtonDrawable(Drawable paramDrawable)
  {
    k.setImageDrawable(paramDrawable);
  }
  
  public final void setInitialActivityCount(int paramInt)
  {
    h = paramInt;
  }
  
  public final void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    f = paramOnDismissListener;
  }
  
  public final void setProvider(android.support.v4.h.e parame)
  {
    d = parame;
  }
}


/* Location:              android/support/v7/widget/ActivityChooserView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */