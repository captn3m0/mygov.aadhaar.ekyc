package com.google.android.gms.b;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class vv$a
{
  public long a;
  public String b;
  public String c;
  public long d;
  public long e;
  public long f;
  public long g;
  public Map h;
  
  private vv$a() {}
  
  public vv$a(String paramString, dz.a parama)
  {
    b = paramString;
    long l = a.length;
    a = l;
    Object localObject = b;
    c = ((String)localObject);
    l = c;
    d = l;
    l = d;
    e = l;
    l = e;
    f = l;
    l = f;
    g = l;
    localObject = g;
    h = ((Map)localObject);
  }
  
  public static a a(InputStream paramInputStream)
  {
    Object localObject1 = new com/google/android/gms/b/vv$a;
    ((a)localObject1).<init>();
    int i = vv.a(paramInputStream);
    int j = 538247942;
    if (i != j)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    Object localObject2 = vv.c(paramInputStream);
    b = ((String)localObject2);
    localObject2 = vv.c(paramInputStream);
    c = ((String)localObject2);
    localObject2 = c;
    String str = "";
    boolean bool = ((String)localObject2).equals(str);
    if (bool)
    {
      bool = false;
      localObject2 = null;
      c = null;
    }
    long l = vv.b(paramInputStream);
    d = l;
    l = vv.b(paramInputStream);
    e = l;
    l = vv.b(paramInputStream);
    f = l;
    l = vv.b(paramInputStream);
    g = l;
    localObject2 = vv.d(paramInputStream);
    h = ((Map)localObject2);
    return (a)localObject1;
  }
  
  public final boolean a(OutputStream paramOutputStream)
  {
    boolean bool1 = true;
    int i = 538247942;
    boolean bool2;
    String str;
    try
    {
      vv.a(paramOutputStream, i);
      Object localObject1 = b;
      vv.a(paramOutputStream, (String)localObject1);
      localObject1 = c;
      if (localObject1 == null)
      {
        localObject1 = "";
        vv.a(paramOutputStream, (String)localObject1);
        long l = d;
        vv.a(paramOutputStream, l);
        l = e;
        vv.a(paramOutputStream, l);
        l = f;
        vv.a(paramOutputStream, l);
        l = g;
        vv.a(paramOutputStream, l);
        localObject1 = h;
        if (localObject1 == null) {
          break label258;
        }
        int j = ((Map)localObject1).size();
        vv.a(paramOutputStream, j);
        localObject1 = ((Map)localObject1).entrySet();
        Iterator localIterator = ((Set)localObject1).iterator();
        Object localObject2;
        for (;;)
        {
          bool2 = localIterator.hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = localIterator.next();
          localObject1 = (Map.Entry)localObject1;
          localObject2 = ((Map.Entry)localObject1).getKey();
          localObject2 = (String)localObject2;
          vv.a(paramOutputStream, (String)localObject2);
          localObject1 = ((Map.Entry)localObject1).getValue();
          localObject1 = (String)localObject1;
          vv.a(paramOutputStream, (String)localObject1);
        }
        Object[] arrayOfObject;
        return bool2;
      }
    }
    catch (IOException localIOException)
    {
      localObject2 = "%s";
      arrayOfObject = new Object[bool1];
      str = localIOException.toString();
      arrayOfObject[0] = str;
      vs.b((String)localObject2, arrayOfObject);
      bool2 = false;
      str = null;
    }
    for (;;)
    {
      str = c;
      break;
      label258:
      bool2 = false;
      str = null;
      vv.a(paramOutputStream, 0);
      paramOutputStream.flush();
      bool2 = bool1;
    }
  }
}


/* Location:              com/google/android/gms/b/vv$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */