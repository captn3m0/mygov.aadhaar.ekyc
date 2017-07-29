package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

public abstract class d
  extends BaseAdapter
  implements e.a, Filterable
{
  protected boolean a = false;
  protected boolean b = true;
  protected Cursor c = null;
  protected Context d;
  protected int e;
  protected a f;
  protected DataSetObserver g;
  protected e h;
  protected FilterQueryProvider i;
  
  public d(Context paramContext)
  {
    d = paramContext;
    e = -1;
    f = new a();
    g = new b();
  }
  
  public final Cursor a()
  {
    return c;
  }
  
  public Cursor a(CharSequence paramCharSequence)
  {
    if (i != null) {
      return i.runQuery(paramCharSequence);
    }
    return c;
  }
  
  public abstract View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);
  
  public void a(Cursor paramCursor)
  {
    if (paramCursor == c) {
      paramCursor = null;
    }
    for (;;)
    {
      if (paramCursor != null) {
        paramCursor.close();
      }
      return;
      Cursor localCursor = c;
      if (localCursor != null)
      {
        if (f != null) {
          localCursor.unregisterContentObserver(f);
        }
        if (g != null) {
          localCursor.unregisterDataSetObserver(g);
        }
      }
      c = paramCursor;
      if (paramCursor != null)
      {
        if (f != null) {
          paramCursor.registerContentObserver(f);
        }
        if (g != null) {
          paramCursor.registerDataSetObserver(g);
        }
        e = paramCursor.getColumnIndexOrThrow("_id");
        a = true;
        notifyDataSetChanged();
        paramCursor = localCursor;
      }
      else
      {
        e = -1;
        a = false;
        notifyDataSetInvalidated();
        paramCursor = localCursor;
      }
    }
  }
  
  public abstract void a(View paramView, Cursor paramCursor);
  
  public View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return a(paramContext, paramCursor, paramViewGroup);
  }
  
  public CharSequence b(Cursor paramCursor)
  {
    if (paramCursor == null) {
      return "";
    }
    return paramCursor.toString();
  }
  
  protected final void b()
  {
    if ((b) && (c != null) && (!c.isClosed())) {
      a = c.requery();
    }
  }
  
  public int getCount()
  {
    if ((a) && (c != null)) {
      return c.getCount();
    }
    return 0;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (a)
    {
      c.moveToPosition(paramInt);
      View localView = paramView;
      if (paramView == null) {
        localView = b(d, c, paramViewGroup);
      }
      a(localView, c);
      return localView;
    }
    return null;
  }
  
  public Filter getFilter()
  {
    if (h == null) {
      h = new e(this);
    }
    return h;
  }
  
  public Object getItem(int paramInt)
  {
    if ((a) && (c != null))
    {
      c.moveToPosition(paramInt);
      return c;
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    long l2 = 0L;
    long l1 = l2;
    if (a)
    {
      l1 = l2;
      if (c != null)
      {
        l1 = l2;
        if (c.moveToPosition(paramInt)) {
          l1 = c.getLong(e);
        }
      }
    }
    return l1;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (!a) {
      throw new IllegalStateException("this should only be called when the cursor is valid");
    }
    if (!c.moveToPosition(paramInt)) {
      throw new IllegalStateException("couldn't move cursor to position " + paramInt);
    }
    View localView = paramView;
    if (paramView == null) {
      localView = a(d, c, paramViewGroup);
    }
    a(localView, c);
    return localView;
  }
  
  public boolean hasStableIds()
  {
    return true;
  }
  
  private final class a
    extends ContentObserver
  {
    a()
    {
      super();
    }
    
    public final boolean deliverSelfNotifications()
    {
      return true;
    }
    
    public final void onChange(boolean paramBoolean)
    {
      b();
    }
  }
  
  private final class b
    extends DataSetObserver
  {
    b() {}
    
    public final void onChanged()
    {
      a = true;
      notifyDataSetChanged();
    }
    
    public final void onInvalidated()
    {
      a = false;
      notifyDataSetInvalidated();
    }
  }
}


/* Location:              android/support/v4/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */