package com.a.a.a;

import com.a.a.i;
import com.a.a.l;
import com.a.a.n;
import com.a.a.n.a;
import com.a.a.n.b;
import com.a.a.t;
import java.io.UnsupportedEncodingException;

public abstract class j<T>
  extends l<T>
{
  private static final String l = String.format("application/json; charset=%s", new Object[] { "utf-8" });
  private final n.b<T> m;
  private final String n;
  
  public j(String paramString1, String paramString2, n.b<T> paramb, n.a parama)
  {
    super(paramString1, parama);
    m = paramb;
    n = paramString2;
  }
  
  protected abstract n<T> a(i parami);
  
  protected final void a(T paramT)
  {
    m.a(paramT);
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
    try
    {
      if (n == null) {
        return null;
      }
      byte[] arrayOfByte = n.getBytes("utf-8");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      t.d("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[] { n, "utf-8" });
    }
    return null;
  }
}


/* Location:              com/a/a/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */