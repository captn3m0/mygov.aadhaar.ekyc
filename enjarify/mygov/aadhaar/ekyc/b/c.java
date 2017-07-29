package mygov.aadhaar.ekyc.b;

import android.content.Context;
import com.a.a.a.h;
import com.a.a.a.l;
import com.a.a.m;

public final class c
{
  private static c a;
  private static Context b;
  private m c;
  private h d;
  
  private c(Context paramContext)
  {
    b = paramContext;
    Object localObject = a();
    c = ((m)localObject);
    localObject = new com/a/a/a/h;
    m localm = c;
    c.1 local1 = new mygov/aadhaar/ekyc/b/c$1;
    local1.<init>(this);
    ((h)localObject).<init>(localm, local1);
    d = ((h)localObject);
  }
  
  public static c a(Context paramContext)
  {
    synchronized (c.class)
    {
      c localc = a;
      if (localc == null)
      {
        localc = new mygov/aadhaar/ekyc/b/c;
        localc.<init>(paramContext);
        a = localc;
      }
      localc = a;
      return localc;
    }
  }
  
  public final m a()
  {
    m localm = c;
    if (localm == null)
    {
      localm = l.a(b.getApplicationContext());
      c = localm;
    }
    return c;
  }
}


/* Location:              mygov/aadhaar/ekyc/b/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */