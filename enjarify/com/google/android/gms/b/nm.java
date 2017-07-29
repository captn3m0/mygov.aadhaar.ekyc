package com.google.android.gms.b;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public final class nm
  implements nl
{
  private final nk a;
  private final HashSet b;
  
  public nm(nk paramnk)
  {
    a = paramnk;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    b = localHashSet;
  }
  
  public final void a()
  {
    Object localObject1 = b;
    Iterator localIterator = ((HashSet)localObject1).iterator();
    boolean bool = localIterator.hasNext();
    if (bool)
    {
      localObject1 = (AbstractMap.SimpleEntry)localIterator.next();
      Object localObject2 = "Unregistering eventhandler: ";
      String str = String.valueOf(((md)((AbstractMap.SimpleEntry)localObject1).getValue()).toString());
      int i = str.length();
      if (i != 0) {
        str = ((String)localObject2).concat(str);
      }
      for (;;)
      {
        tp.a(str);
        localObject2 = a;
        str = (String)((AbstractMap.SimpleEntry)localObject1).getKey();
        localObject1 = (md)((AbstractMap.SimpleEntry)localObject1).getValue();
        ((nk)localObject2).b(str, (md)localObject1);
        break;
        str = new java/lang/String;
        str.<init>((String)localObject2);
      }
    }
    b.clear();
  }
  
  public final void a(String paramString, md parammd)
  {
    a.a(paramString, parammd);
    HashSet localHashSet = b;
    AbstractMap.SimpleEntry localSimpleEntry = new java/util/AbstractMap$SimpleEntry;
    localSimpleEntry.<init>(paramString, parammd);
    localHashSet.add(localSimpleEntry);
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
    HashSet localHashSet = b;
    AbstractMap.SimpleEntry localSimpleEntry = new java/util/AbstractMap$SimpleEntry;
    localSimpleEntry.<init>(paramString, parammd);
    localHashSet.remove(localSimpleEntry);
  }
  
  public final void b(String paramString, JSONObject paramJSONObject)
  {
    a.b(paramString, paramJSONObject);
  }
}


/* Location:              com/google/android/gms/b/nm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */