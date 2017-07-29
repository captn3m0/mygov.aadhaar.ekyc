package android.support.v7.app;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

final class AlertController$a$2
  extends CursorAdapter
{
  private final int d;
  private final int e;
  
  AlertController$a$2(AlertController.a parama, Context paramContext, Cursor paramCursor, AlertController.RecycleListView paramRecycleListView, AlertController paramAlertController)
  {
    super(paramContext, paramCursor, false);
    Cursor localCursor = getCursor();
    String str = c.I;
    int i = localCursor.getColumnIndexOrThrow(str);
    d = i;
    str = c.J;
    int j = localCursor.getColumnIndexOrThrow(str);
    e = j;
  }
  
  public final void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    int i = 1;
    CheckedTextView localCheckedTextView = (CheckedTextView)paramView.findViewById(16908308);
    int j = d;
    Object localObject = paramCursor.getString(j);
    localCheckedTextView.setText((CharSequence)localObject);
    localObject = a;
    int k = paramCursor.getPosition();
    int m = e;
    m = paramCursor.getInt(m);
    if (m == i) {
      m = i;
    }
    for (;;)
    {
      ((AlertController.RecycleListView)localObject).setItemChecked(k, m);
      return;
      int n = 0;
      localCheckedTextView = null;
    }
  }
  
  public final View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = c.b;
    int i = b.I;
    return localLayoutInflater.inflate(i, paramViewGroup, false);
  }
}


/* Location:              android/support/v7/app/AlertController$a$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */