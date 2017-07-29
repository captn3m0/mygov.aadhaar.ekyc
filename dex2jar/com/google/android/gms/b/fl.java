package com.google.android.gms.b;

import java.lang.reflect.Method;
import java.util.List;

public final class fl
  extends gm
{
  private List<Long> i = null;
  
  public fl(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 31);
  }
  
  protected final void a()
  {
    e.y = Long.valueOf(-1L);
    e.z = Long.valueOf(-1L);
    if (i == null) {
      i = ((List)f.invoke(null, new Object[] { b.a() }));
    }
    if ((i != null) && (i.size() == 2)) {
      synchronized (e)
      {
        e.y = Long.valueOf(((Long)i.get(0)).longValue());
        e.z = Long.valueOf(((Long)i.get(1)).longValue());
        return;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/fl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */