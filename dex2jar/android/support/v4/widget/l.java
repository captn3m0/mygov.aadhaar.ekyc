package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class l
  extends d
{
  private int j;
  private int k;
  private LayoutInflater l;
  
  @Deprecated
  public l(Context paramContext, int paramInt)
  {
    super(paramContext);
    k = paramInt;
    j = paramInt;
    l = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }
  
  public View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return l.inflate(j, paramViewGroup, false);
  }
  
  public final View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return l.inflate(k, paramViewGroup, false);
  }
}


/* Location:              android/support/v4/widget/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */