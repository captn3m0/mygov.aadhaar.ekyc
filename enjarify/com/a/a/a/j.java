package com.a.a.a;

import com.a.a.i;
import com.a.a.l;
import com.a.a.n;
import com.a.a.n.a;
import com.a.a.n.b;
import com.a.a.t;
import java.io.UnsupportedEncodingException;

public abstract class j
  extends l
{
  private static final String l;
  private final n.b m;
  private final String n;
  
  static
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = "utf-8";
    l = String.format("application/json; charset=%s", arrayOfObject);
  }
  
  public j(String paramString1, String paramString2, n.b paramb, n.a parama)
  {
    super(paramString1, parama);
    m = paramb;
    n = paramString2;
  }
  
  protected abstract n a(i parami);
  
  protected final void a(Object paramObject)
  {
    m.a(paramObject);
  }
  
  public final String b()
  {
    return l;
  }
  
  public final byte[] c()
  {
    return e();
  }
  
  public final String d()
  {
    return l;
  }
  
  public final byte[] e()
  {
    for (byte[] arrayOfByte = null;; arrayOfByte = str1.getBytes((String)localObject))
    {
      try
      {
        str1 = n;
        if (str1 != null) {
          break label13;
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        for (;;)
        {
          String str1;
          label13:
          String str2 = "Unsupported Encoding while trying to get the bytes of %s using %s";
          int i = 2;
          Object localObject = new Object[i];
          String str3 = n;
          localObject[0] = str3;
          int j = 1;
          str3 = "utf-8";
          localObject[j] = str3;
          t.d(str2, (Object[])localObject);
        }
      }
      return arrayOfByte;
      str1 = n;
      localObject = "utf-8";
    }
  }
}


/* Location:              com/a/a/a/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */