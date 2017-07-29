package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
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
  protected d.a f;
  protected DataSetObserver g;
  protected e h;
  protected FilterQueryProvider i;
  
  public d(Context paramContext)
  {
    d = paramContext;
    e = -1;
    Object localObject = new android/support/v4/widget/d$a;
    ((d.a)localObject).<init>(this);
    f = ((d.a)localObject);
    localObject = new android/support/v4/widget/d$b;
    ((d.b)localObject).<init>(this);
    g = ((DataSetObserver)localObject);
  }
  
  public final Cursor a()
  {
    return c;
  }
  
  public Cursor a(CharSequence paramCharSequence)
  {
    Object localObject = i;
    if (localObject != null) {}
    for (localObject = i.runQuery(paramCharSequence);; localObject = c) {
      return (Cursor)localObject;
    }
  }
  
  public abstract View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);
  
  public void a(Cursor paramCursor)
  {
    Cursor localCursor = c;
    if (paramCursor == localCursor) {
      localCursor = null;
    }
    for (;;)
    {
      if (localCursor != null) {
        localCursor.close();
      }
      return;
      localCursor = c;
      Object localObject;
      if (localCursor != null)
      {
        localObject = f;
        if (localObject != null)
        {
          localObject = f;
          localCursor.unregisterContentObserver((ContentObserver)localObject);
        }
        localObject = g;
        if (localObject != null)
        {
          localObject = g;
          localCursor.unregisterDataSetObserver((DataSetObserver)localObject);
        }
      }
      c = paramCursor;
      int j;
      if (paramCursor != null)
      {
        localObject = f;
        if (localObject != null)
        {
          localObject = f;
          paramCursor.registerContentObserver((ContentObserver)localObject);
        }
        localObject = g;
        if (localObject != null)
        {
          localObject = g;
          paramCursor.registerDataSetObserver((DataSetObserver)localObject);
        }
        localObject = "_id";
        j = paramCursor.getColumnIndexOrThrow((String)localObject);
        e = j;
        j = 1;
        a = j;
        notifyDataSetChanged();
      }
      else
      {
        e = -1;
        j = 0;
        localObject = null;
        a = false;
        notifyDataSetInvalidated();
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
    if (paramCursor == null) {}
    for (String str = "";; str = paramCursor.toString()) {
      return str;
    }
  }
  
  protected final void b()
  {
    boolean bool = b;
    if (bool)
    {
      Cursor localCursor = c;
      if (localCursor != null)
      {
        localCursor = c;
        bool = localCursor.isClosed();
        if (!bool)
        {
          localCursor = c;
          bool = localCursor.requery();
          a = bool;
        }
      }
    }
  }
  
  public int getCount()
  {
    boolean bool = a;
    Cursor localCursor;
    int j;
    if (bool)
    {
      localCursor = c;
      if (localCursor != null)
      {
        localCursor = c;
        j = localCursor.getCount();
      }
    }
    for (;;)
    {
      return j;
      j = 0;
      localCursor = null;
    }
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = a;
    if (bool)
    {
      Object localObject = c;
      ((Cursor)localObject).moveToPosition(paramInt);
      if (paramView == null)
      {
        localObject = d;
        Cursor localCursor = c;
        paramView = b((Context)localObject, localCursor, paramViewGroup);
      }
      localObject = c;
      a(paramView, (Cursor)localObject);
    }
    for (;;)
    {
      return paramView;
      paramView = null;
    }
  }
  
  public Filter getFilter()
  {
    e locale = h;
    if (locale == null)
    {
      locale = new android/support/v4/widget/e;
      locale.<init>(this);
      h = locale;
    }
    return h;
  }
  
  public Object getItem(int paramInt)
  {
    boolean bool = a;
    if (bool)
    {
      localCursor = c;
      if (localCursor != null) {
        c.moveToPosition(paramInt);
      }
    }
    for (Cursor localCursor = c;; localCursor = null)
    {
      return localCursor;
      bool = false;
    }
  }
  
  public long getItemId(int paramInt)
  {
    long l = 0L;
    boolean bool = a;
    if (bool)
    {
      Cursor localCursor1 = c;
      if (localCursor1 != null)
      {
        localCursor1 = c;
        bool = localCursor1.moveToPosition(paramInt);
        if (bool)
        {
          Cursor localCursor2 = c;
          int j = e;
          l = localCursor2.getLong(j);
        }
      }
    }
    return l;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = a;
    if (!bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("this should only be called when the cursor is valid");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = c;
    bool = ((Cursor)localObject1).moveToPosition(paramInt);
    Object localObject2;
    if (!bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("couldn't move cursor to position ");
      localObject2 = paramInt;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    if (paramView == null)
    {
      localObject1 = d;
      localObject2 = c;
      paramView = a((Context)localObject1, (Cursor)localObject2, paramViewGroup);
    }
    localObject1 = c;
    a(paramView, (Cursor)localObject1);
    return paramView;
  }
  
  public boolean hasStableIds()
  {
    return true;
  }
}


/* Location:              android/support/v4/widget/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */