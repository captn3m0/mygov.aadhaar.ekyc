package com.google.android.gms.b;

import com.google.android.gms.ads.c.a;
import com.google.android.gms.ads.c.a.a;
import java.io.IOException;
import java.lang.reflect.Method;

public final class fg
  extends gm
{
  public fg(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 24);
  }
  
  protected final void a()
  {
    if (b.c())
    {
      ??? = b.g();
      if (??? == null) {
        return;
      }
      try
      {
        a.a locala1 = ((a)???).a();
        String str = ew.a(a);
        if (str != null)
        {
          synchronized (e)
          {
            e.aa = str;
            e.ac = Boolean.valueOf(b);
            e.ab = Integer.valueOf(5);
            return;
          }
          synchronized (e)
          {
            e.aa = ((String)f.invoke(null, new Object[] { b.b() }));
            return;
          }
        }
      }
      catch (IOException localIOException) {}
    }
  }
}


/* Location:              com/google/android/gms/b/fg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */