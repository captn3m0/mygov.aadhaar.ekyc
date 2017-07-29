package com.google.android.gms.b;

import android.view.View;
import java.lang.reflect.Method;

public final class fs
  extends gm
{
  private final View i;
  
  public fs(eu parameu, String paramString1, String paramString2, bf.a parama, int paramInt, View paramView)
  {
    super(parameu, paramString1, paramString2, parama, paramInt, 57);
    i = paramView;
  }
  
  protected final void a()
  {
    if (i != null)
    {
      ex localex = new ex((String)f.invoke(null, new Object[] { i }));
      synchronized (e)
      {
        e.Y = new bf.a.b();
        e.Y.c = a;
        return;
      }
    }
  }
}


/* Location:              com/google/android/gms/b/fs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */