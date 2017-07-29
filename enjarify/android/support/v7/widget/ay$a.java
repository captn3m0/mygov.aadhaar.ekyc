package android.support.v7.widget;

import android.content.Context;
import android.support.v7.app.a.b;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;

final class ay$a
  extends BaseAdapter
{
  ay$a(ay paramay) {}
  
  public final int getCount()
  {
    return a.b.getChildCount();
  }
  
  public final Object getItem(int paramInt)
  {
    return a.b.getChildAt(paramInt)).a;
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject1;
    Object localObject2;
    if (paramView == null)
    {
      localObject1 = a;
      localObject2 = (a.b)getItem(paramInt);
      paramView = new android/support/v7/widget/ay$b;
      Context localContext = ((ay)localObject1).getContext();
      paramView.<init>((ay)localObject1, localContext, (a.b)localObject2);
      paramView.setBackgroundDrawable(null);
      localObject2 = new android/widget/AbsListView$LayoutParams;
      int i = -1;
      int j = e;
      ((AbsListView.LayoutParams)localObject2).<init>(i, j);
      paramView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
    }
    for (;;)
    {
      return paramView;
      localObject2 = paramView;
      localObject2 = (ay.b)paramView;
      localObject1 = (a.b)getItem(paramInt);
      a = ((a.b)localObject1);
      ((ay.b)localObject2).a();
    }
  }
}


/* Location:              android/support/v7/widget/ay$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */