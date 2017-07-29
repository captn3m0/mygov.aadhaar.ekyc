package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

final class e
  extends Filter
{
  a a;
  
  e(a parama)
  {
    a = parama;
  }
  
  public final CharSequence convertResultToString(Object paramObject)
  {
    return a.b((Cursor)paramObject);
  }
  
  protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    paramCharSequence = a.a(paramCharSequence);
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if (paramCharSequence != null)
    {
      count = paramCharSequence.getCount();
      values = paramCharSequence;
      return localFilterResults;
    }
    count = 0;
    values = null;
    return localFilterResults;
  }
  
  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    paramCharSequence = a.a();
    if ((values != null) && (values != paramCharSequence)) {
      a.a((Cursor)values);
    }
  }
  
  static abstract interface a
  {
    public abstract Cursor a();
    
    public abstract Cursor a(CharSequence paramCharSequence);
    
    public abstract void a(Cursor paramCursor);
    
    public abstract CharSequence b(Cursor paramCursor);
  }
}


/* Location:              android/support/v4/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */