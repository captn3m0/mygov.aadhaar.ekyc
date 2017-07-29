package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.a.a.j;
import android.util.AttributeSet;
import android.widget.ListView;

public class AlertController$RecycleListView
  extends ListView
{
  final int a;
  final int b;
  
  public AlertController$RecycleListView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AlertController$RecycleListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = a.j.RecycleListView;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int j = a.j.RecycleListView_paddingBottomNoButtons;
    j = ((TypedArray)localObject).getDimensionPixelOffset(j, i);
    b = j;
    j = a.j.RecycleListView_paddingTopNoTitle;
    int k = ((TypedArray)localObject).getDimensionPixelOffset(j, i);
    a = k;
  }
}


/* Location:              android/support/v7/app/AlertController$RecycleListView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */