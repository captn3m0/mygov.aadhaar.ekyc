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
  
  public l(Context paramContext, int paramInt)
  {
    super(paramContext);
    k = paramInt;
    j = paramInt;
    LayoutInflater localLayoutInflater = (LayoutInflater)paramContext.getSystemService("layout_inflater");
    l = localLayoutInflater;
  }
  
  public View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = l;
    int i = j;
    return localLayoutInflater.inflate(i, paramViewGroup, false);
  }
  
  public final View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = l;
    int i = k;
    return localLayoutInflater.inflate(i, paramViewGroup, false);
  }
}


/* Location:              android/support/v4/widget/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */