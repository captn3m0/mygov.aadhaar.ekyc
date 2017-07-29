package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.bf;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;

public final class ExpandedMenuView
  extends ListView
  implements h.b, p, AdapterView.OnItemClickListener
{
  private static final int[] a;
  private h b;
  private int c;
  
  static
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 16842964;
    arrayOfInt[1] = 16843049;
    a = arrayOfInt;
  }
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842868);
  }
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
    Object localObject = a;
    localObject = bf.a(paramContext, paramAttributeSet, (int[])localObject, paramInt, 0);
    boolean bool = ((bf)localObject).e(0);
    Drawable localDrawable;
    if (bool)
    {
      localDrawable = ((bf)localObject).a(0);
      setBackgroundDrawable(localDrawable);
    }
    bool = ((bf)localObject).e(i);
    if (bool)
    {
      localDrawable = ((bf)localObject).a(i);
      setDivider(localDrawable);
    }
    a.recycle();
  }
  
  public final void a(h paramh)
  {
    b = paramh;
  }
  
  public final boolean a(j paramj)
  {
    return b.a(paramj, null, 0);
  }
  
  public final int getWindowAnimations()
  {
    return c;
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    j localj = (j)getAdapter().getItem(paramInt);
    a(localj);
  }
}


/* Location:              android/support/v7/view/menu/ExpandedMenuView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */