package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

final class e
  extends Filter
{
  e.a a;
  
  e(e.a parama)
  {
    a = parama;
  }
  
  public final CharSequence convertResultToString(Object paramObject)
  {
    e.a locala = a;
    paramObject = (Cursor)paramObject;
    return locala.b((Cursor)paramObject);
  }
  
  protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    Cursor localCursor = a.a(paramCharSequence);
    Filter.FilterResults localFilterResults = new android/widget/Filter$FilterResults;
    localFilterResults.<init>();
    if (localCursor != null)
    {
      int i = localCursor.getCount();
      count = i;
    }
    for (values = localCursor;; values = null)
    {
      return localFilterResults;
      count = 0;
      localCursor = null;
    }
  }
  
  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    Cursor localCursor = a.a();
    Object localObject = values;
    if (localObject != null)
    {
      localObject = values;
      if (localObject != localCursor)
      {
        localObject = a;
        localCursor = (Cursor)values;
        ((e.a)localObject).a(localCursor);
      }
    }
  }
}


/* Location:              android/support/v4/widget/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */