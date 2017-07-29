package com.a.a.a;

import com.a.a.b.a;
import com.a.a.t;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class c$a
{
  public long a;
  public String b;
  public String c;
  public long d;
  public long e;
  public long f;
  public long g;
  public Map h;
  
  private c$a() {}
  
  public c$a(String paramString, b.a parama)
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
    Object localObject1 = new com/a/a/a/c$a;
    ((a)localObject1).<init>();
    int i = c.a(paramInputStream);
    int j = 538247942;
    if (i != j)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    Object localObject2 = c.c(paramInputStream);
    b = ((String)localObject2);
    localObject2 = c.c(paramInputStream);
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
    long l = c.b(paramInputStream);
    d = l;
    l = c.b(paramInputStream);
    e = l;
    l = c.b(paramInputStream);
    f = l;
    l = c.b(paramInputStream);
    g = l;
    localObject2 = c.d(paramInputStream);
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
      c.a(paramOutputStream, i);
      Object localObject1 = b;
      c.a(paramOutputStream, (String)localObject1);
      localObject1 = c;
      if (localObject1 == null)
      {
        localObject1 = "";
        c.a(paramOutputStream, (String)localObject1);
        long l = d;
        c.a(paramOutputStream, l);
        l = e;
        c.a(paramOutputStream, l);
        l = f;
        c.a(paramOutputStream, l);
        l = g;
        c.a(paramOutputStream, l);
        localObject1 = h;
        if (localObject1 == null) {
          break label258;
        }
        int j = ((Map)localObject1).size();
        c.a(paramOutputStream, j);
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
          c.a(paramOutputStream, (String)localObject2);
          localObject1 = ((Map.Entry)localObject1).getValue();
          localObject1 = (String)localObject1;
          c.a(paramOutputStream, (String)localObject1);
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
      t.b((String)localObject2, arrayOfObject);
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
      c.a(paramOutputStream, 0);
      paramOutputStream.flush();
      bool2 = bool1;
    }
  }
}


/* Location:              com/a/a/a/c$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */