package android.support.v7.widget;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.support.v4.h.w;
import android.support.v7.a.a.f;
import android.support.v7.a.a.g;
import android.support.v7.a.a.h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

final class ActivityChooserView$a
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
    int j = d;
    d = (-1 >>> 1);
    int k = View.MeasureSpec.makeMeasureSpec(0, 0);
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    int n = getCount();
    View localView = null;
    int i1 = 0;
    while (i < n)
    {
      localView = getView(i, localView, null);
      localView.measure(k, m);
      int i2 = localView.getMeasuredWidth();
      i1 = Math.max(i1, i2);
      i += 1;
    }
    d = j;
    return i1;
  }
  
  public final void a(int paramInt)
  {
    int i = d;
    if (i != paramInt)
    {
      d = paramInt;
      notifyDataSetChanged();
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    boolean bool = f;
    if (bool != paramBoolean)
    {
      f = paramBoolean;
      notifyDataSetChanged();
    }
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = b;
    if (bool == paramBoolean1)
    {
      bool = e;
      if (bool == paramBoolean2) {}
    }
    else
    {
      b = paramBoolean1;
      e = paramBoolean2;
      notifyDataSetChanged();
    }
  }
  
  public final int getCount()
  {
    e locale = a;
    int i = locale.a();
    boolean bool1 = b;
    if (!bool1)
    {
      ResolveInfo localResolveInfo = a.b();
      if (localResolveInfo != null) {
        i += -1;
      }
    }
    int j = d;
    i = Math.min(i, j);
    boolean bool2 = f;
    if (bool2) {
      i += 1;
    }
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    int i = getItemViewType(paramInt);
    switch (i)
    {
    default: 
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>();
      throw ((Throwable)localObject);
    case 1: 
      i = 0;
    }
    for (Object localObject = null;; localObject = a.a(paramInt))
    {
      return localObject;
      boolean bool = b;
      if (!bool)
      {
        localObject = a.b();
        if (localObject != null) {
          paramInt += 1;
        }
      }
    }
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final int getItemViewType(int paramInt)
  {
    boolean bool = f;
    if (bool)
    {
      i = getCount() + -1;
      if (paramInt != i) {}
    }
    for (int i = 1;; i = 0) {
      return i;
    }
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = 1;
    int j = getItemViewType(paramInt);
    Object localObject1;
    int m;
    int k;
    Object localObject2;
    switch (j)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>();
      throw ((Throwable)localObject1);
    case 1: 
      if (paramView != null)
      {
        j = paramView.getId();
        if (j == i) {
          break;
        }
      }
      else
      {
        localObject1 = LayoutInflater.from(c.getContext());
        m = a.g.abc_activity_chooser_view_list_item;
        paramView = ((LayoutInflater)localObject1).inflate(m, paramViewGroup, false);
        paramView.setId(i);
        k = a.f.title;
        localObject1 = (TextView)paramView.findViewById(k);
        localObject2 = c.getContext();
        int n = a.h.abc_activity_chooser_view_see_all;
        localObject2 = ((Context)localObject2).getString(n);
        ((TextView)localObject1).setText((CharSequence)localObject2);
      }
      break;
    }
    for (;;)
    {
      return paramView;
      if (paramView != null)
      {
        k = paramView.getId();
        m = a.f.list_item;
        if (k == m) {}
      }
      else
      {
        localObject1 = LayoutInflater.from(c.getContext());
        m = a.g.abc_activity_chooser_view_list_item;
        paramView = ((LayoutInflater)localObject1).inflate(m, paramViewGroup, false);
      }
      PackageManager localPackageManager = c.getContext().getPackageManager();
      k = a.f.icon;
      localObject1 = (ImageView)paramView.findViewById(k);
      localObject2 = (ResolveInfo)getItem(paramInt);
      Drawable localDrawable = ((ResolveInfo)localObject2).loadIcon(localPackageManager);
      ((ImageView)localObject1).setImageDrawable(localDrawable);
      k = a.f.title;
      localObject1 = (TextView)paramView.findViewById(k);
      localObject2 = ((ResolveInfo)localObject2).loadLabel(localPackageManager);
      ((TextView)localObject1).setText((CharSequence)localObject2);
      boolean bool = b;
      if ((bool) && (paramInt == 0))
      {
        bool = e;
        if (bool)
        {
          w.b(paramView, i);
          continue;
        }
      }
      w.b(paramView, false);
    }
  }
  
  public final int getViewTypeCount()
  {
    return 3;
  }
}


/* Location:              android/support/v7/widget/ActivityChooserView$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */