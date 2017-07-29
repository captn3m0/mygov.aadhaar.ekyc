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
    Object localObject1 = b;
    boolean bool = ((eu)localObject1).c();
    if (bool)
    {
      localObject1 = b.g();
      if (localObject1 == null) {}
    }
    for (;;)
    {
      bf.a locala2;
      try
      {
        localObject1 = ((a)localObject1).a();
        ??? = a;
        ??? = ew.a((String)???);
        if (??? == null) {}
      }
      catch (IOException localIOException)
      {
        int i;
        continue;
      }
      synchronized (e)
      {
        locala2 = e;
        aa = ((String)???);
        ??? = e;
        bool = b;
        localObject1 = Boolean.valueOf(bool);
        ac = ((Boolean)localObject1);
        localObject1 = e;
        i = 5;
        ??? = Integer.valueOf(i);
        ab = ((Integer)???);
        return;
      }
      synchronized (e)
      {
        ??? = e;
        Object localObject3 = f;
        locala2 = null;
        int j = 1;
        Object[] arrayOfObject = new Object[j];
        Object localObject6 = b;
        localObject6 = ((eu)localObject6).b();
        arrayOfObject[0] = localObject6;
        localObject3 = ((Method)localObject3).invoke(null, arrayOfObject);
        localObject3 = (String)localObject3;
        aa = ((String)localObject3);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/fg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */