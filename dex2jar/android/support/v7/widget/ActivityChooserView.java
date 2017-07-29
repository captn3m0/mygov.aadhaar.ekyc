package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.h.w;
import android.support.v7.a.a.f;
import android.support.v7.a.a.g;
import android.support.v7.a.a.h;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.List;

public final class ActivityChooserView
  extends ViewGroup
{
  final a a;
  final FrameLayout b;
  final FrameLayout c;
  android.support.v4.h.e d;
  final DataSetObserver e;
  PopupWindow.OnDismissListener f;
  boolean g;
  int h;
  private final b i;
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
    if (a.a == null) {
      throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }
    getViewTreeObserver().addOnGlobalLayoutListener(m);
    boolean bool;
    int i1;
    label62:
    label93:
    an localan;
    if (c.getVisibility() == 0)
    {
      bool = true;
      int i2 = a.a.a();
      if (!bool) {
        break label196;
      }
      i1 = 1;
      if ((paramInt == Integer.MAX_VALUE) || (i2 <= i1 + paramInt)) {
        break label201;
      }
      a.a(true);
      a.a(paramInt - 1);
      localan = getListPopupWindow();
      if (!q.isShowing())
      {
        if ((!g) && (bool)) {
          break label220;
        }
        a.a(true, bool);
      }
    }
    for (;;)
    {
      localan.b(Math.min(a.a(), l));
      localan.d();
      if (d != null) {
        d.a(true);
      }
      e.setContentDescription(getContext().getString(a.h.abc_activitychooserview_choose_application));
      return;
      bool = false;
      break;
      label196:
      i1 = 0;
      break label62;
      label201:
      a.a(false);
      a.a(paramInt);
      break label93;
      label220:
      a.a(false, false);
    }
  }
  
  public final boolean a()
  {
    if (getListPopupWindowq.isShowing())
    {
      getListPopupWindow().e();
      ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
      if (localViewTreeObserver.isAlive()) {
        localViewTreeObserver.removeGlobalOnLayoutListener(m);
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
    if (n == null)
    {
      n = new an(getContext());
      n.a(a);
      n.k = this;
      n.b();
      n.l = i;
      n.a(i);
    }
    return n;
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    e locale = a.a;
    if (locale != null) {
      locale.registerObserver(e);
    }
    o = true;
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject = a.a;
    if (localObject != null) {
      ((e)localObject).unregisterObserver(e);
    }
    localObject = getViewTreeObserver();
    if (((ViewTreeObserver)localObject).isAlive()) {
      ((ViewTreeObserver)localObject).removeGlobalOnLayoutListener(m);
    }
    if (b()) {
      a();
    }
    o = false;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    j.layout(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
    if (!b()) {
      a();
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    am localam = j;
    int i1 = paramInt2;
    if (c.getVisibility() != 0) {
      i1 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt2), 1073741824);
    }
    measureChild(localam, paramInt1, i1);
    setMeasuredDimension(localam.getMeasuredWidth(), localam.getMeasuredHeight());
  }
  
  public final void setActivityChooserModel(e parame)
  {
    a locala = a;
    e locale = c.a.a;
    if ((locale != null) && (c.isShown())) {
      locale.unregisterObserver(c.e);
    }
    a = parame;
    if ((parame != null) && (c.isShown())) {
      parame.registerObserver(c.e);
    }
    locala.notifyDataSetChanged();
    if (getListPopupWindowq.isShowing())
    {
      a();
      if ((!getListPopupWindowq.isShowing()) && (o)) {}
    }
    else
    {
      return;
    }
    g = false;
    a(h);
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
  
  public static class InnerLayout
    extends am
  {
    private static final int[] a = { 16842964 };
    
    public InnerLayout(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = bf.a(paramContext, paramAttributeSet, a);
      setBackgroundDrawable(paramContext.a(0));
      a.recycle();
    }
  }
  
  private final class a
    extends BaseAdapter
  {
    e a;
    boolean b;
    private int d;
    private boolean e;
    private boolean f;
    
    public final int a()
    {
      int i = 0;
      int k = d;
      d = Integer.MAX_VALUE;
      int m = View.MeasureSpec.makeMeasureSpec(0, 0);
      int n = View.MeasureSpec.makeMeasureSpec(0, 0);
      int i1 = getCount();
      View localView = null;
      int j = 0;
      while (i < i1)
      {
        localView = getView(i, localView, null);
        localView.measure(m, n);
        j = Math.max(j, localView.getMeasuredWidth());
        i += 1;
      }
      d = k;
      return j;
    }
    
    public final void a(int paramInt)
    {
      if (d != paramInt)
      {
        d = paramInt;
        notifyDataSetChanged();
      }
    }
    
    public final void a(boolean paramBoolean)
    {
      if (f != paramBoolean)
      {
        f = paramBoolean;
        notifyDataSetChanged();
      }
    }
    
    public final void a(boolean paramBoolean1, boolean paramBoolean2)
    {
      if ((b != paramBoolean1) || (e != paramBoolean2))
      {
        b = paramBoolean1;
        e = paramBoolean2;
        notifyDataSetChanged();
      }
    }
    
    public final int getCount()
    {
      int j = a.a();
      int i = j;
      if (!b)
      {
        i = j;
        if (a.b() != null) {
          i = j - 1;
        }
      }
      j = Math.min(i, d);
      i = j;
      if (f) {
        i = j + 1;
      }
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      switch (getItemViewType(paramInt))
      {
      default: 
        throw new IllegalArgumentException();
      case 1: 
        return null;
      }
      int i = paramInt;
      if (!b)
      {
        i = paramInt;
        if (a.b() != null) {
          i = paramInt + 1;
        }
      }
      return a.a(i);
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final int getItemViewType(int paramInt)
    {
      if ((f) && (paramInt == getCount() - 1)) {
        return 1;
      }
      return 0;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      View localView;
      switch (getItemViewType(paramInt))
      {
      default: 
        throw new IllegalArgumentException();
      case 1: 
        if (paramView != null)
        {
          localView = paramView;
          if (paramView.getId() == 1) {}
        }
        else
        {
          localView = LayoutInflater.from(c.getContext()).inflate(a.g.abc_activity_chooser_view_list_item, paramViewGroup, false);
          localView.setId(1);
          ((TextView)localView.findViewById(a.f.title)).setText(c.getContext().getString(a.h.abc_activity_chooser_view_see_all));
        }
        return localView;
      }
      if (paramView != null)
      {
        localView = paramView;
        if (paramView.getId() == a.f.list_item) {}
      }
      else
      {
        localView = LayoutInflater.from(c.getContext()).inflate(a.g.abc_activity_chooser_view_list_item, paramViewGroup, false);
      }
      paramView = c.getContext().getPackageManager();
      paramViewGroup = (ImageView)localView.findViewById(a.f.icon);
      ResolveInfo localResolveInfo = (ResolveInfo)getItem(paramInt);
      paramViewGroup.setImageDrawable(localResolveInfo.loadIcon(paramView));
      ((TextView)localView.findViewById(a.f.title)).setText(localResolveInfo.loadLabel(paramView));
      if ((b) && (paramInt == 0) && (e))
      {
        w.b(localView, true);
        return localView;
      }
      w.b(localView, false);
      return localView;
    }
    
    public final int getViewTypeCount()
    {
      return 3;
    }
  }
  
  private final class b
    implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
  {
    public final void onClick(View paramView)
    {
      if (paramView == a.c)
      {
        a.a();
        paramView = a.a.a.b();
        int i = a.a.a.a(paramView);
        paramView = a.a.a.b(i);
        if (paramView != null)
        {
          paramView.addFlags(524288);
          a.getContext().startActivity(paramView);
        }
        return;
      }
      if (paramView == a.b)
      {
        a.g = false;
        a.a(a.h);
        return;
      }
      throw new IllegalArgumentException();
    }
    
    public final void onDismiss()
    {
      if (a.f != null) {
        a.f.onDismiss();
      }
      if (a.d != null) {
        a.d.a(false);
      }
    }
    
    public final void onItemClick(AdapterView<?> arg1, View paramView, int paramInt, long paramLong)
    {
      switch (((ActivityChooserView.a)???.getAdapter()).getItemViewType(paramInt))
      {
      default: 
        throw new IllegalArgumentException();
      case 1: 
        a.a(Integer.MAX_VALUE);
      }
      do
      {
        return;
        a.a();
        if (!a.g) {
          break;
        }
      } while (paramInt <= 0);
      paramView = a.a.a;
      for (;;)
      {
        synchronized (b)
        {
          paramView.c();
          e.a locala1 = (e.a)c.get(paramInt);
          e.a locala2 = (e.a)c.get(0);
          if (locala2 != null)
          {
            f = b - b + 5.0F;
            paramView.a(new e.c(new ComponentName(a.activityInfo.packageName, a.activityInfo.name), System.currentTimeMillis(), f));
            return;
          }
        }
        float f = 1.0F;
      }
      if (a.a.b) {}
      for (;;)
      {
        ??? = a.a.a.b(paramInt);
        if (??? == null) {
          break;
        }
        ???.addFlags(524288);
        a.getContext().startActivity(???);
        return;
        paramInt += 1;
      }
    }
    
    public final boolean onLongClick(View paramView)
    {
      if (paramView == a.c)
      {
        if (a.a.getCount() > 0)
        {
          a.g = true;
          a.a(a.h);
        }
        return true;
      }
      throw new IllegalArgumentException();
    }
  }
}


/* Location:              android/support/v7/widget/ActivityChooserView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */