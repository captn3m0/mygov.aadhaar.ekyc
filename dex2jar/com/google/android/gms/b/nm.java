package com.google.android.gms.b;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

@qi
public final class nm
  implements nl
{
  private final nk a;
  private final HashSet<AbstractMap.SimpleEntry<String, md>> b;
  
  public nm(nk paramnk)
  {
    a = paramnk;
    b = new HashSet();
  }
  
  public final void a()
  {
    Iterator localIterator = b.iterator();
    if (localIterator.hasNext())
    {
      AbstractMap.SimpleEntry localSimpleEntry = (AbstractMap.SimpleEntry)localIterator.next();
      String str = String.valueOf(((md)localSimpleEntry.getValue()).toString());
      if (str.length() != 0) {}
      for (str = "Unregistering eventhandler: ".concat(str);; str = new String("Unregistering eventhandler: "))
      {
        tp.a(str);
        a.b((String)localSimpleEntry.getKey(), (md)localSimpleEntry.getValue());
        break;
      }
    }
    b.clear();
  }
  
  public final void a(String paramString, md parammd)
  {
    a.a(paramString, parammd);
    b.add(new AbstractMap.SimpleEntry(paramString, parammd));
  }
  
  public final void a(String paramString1, String paramString2)
  {
    a.a(paramString1, paramString2);
  }
  
  public final void a(String paramString, JSONObject paramJSONObject)
  {
    a.a(paramString, paramJSONObject);
  }
  
  public final void b(String paramString, md parammd)
  {
    a.b(paramString, parammd);
    b.remove(new AbstractMap.SimpleEntry(paramString, parammd));
  }
  
  public final void b(String paramString, JSONObject paramJSONObject)
  {
    a.b(paramString, paramJSONObject);
  }
}


/* Location:              com/google/android/gms/b/nm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */