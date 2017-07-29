package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.w;
import java.util.List;

public final class hh
{
  public final Object a;
  public hh.a b;
  public boolean c;
  
  public hh()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    b = null;
    c = false;
  }
  
  public final Activity a()
  {
    synchronized (a)
    {
      Object localObject2 = b;
      if (localObject2 != null)
      {
        localObject2 = b;
        localObject2 = a;
        return (Activity)localObject2;
      }
      localObject2 = null;
    }
  }
  
  public final void a(hh.b paramb)
  {
    synchronized (a)
    {
      int i = Build.VERSION.SDK_INT;
      Object localObject2 = ke.aJ;
      kd localkd = w.q();
      localObject2 = localkd.a((jz)localObject2);
      localObject2 = (Boolean)localObject2;
      boolean bool = ((Boolean)localObject2).booleanValue();
      if (!bool) {
        return;
      }
      localObject2 = b;
      if (localObject2 == null)
      {
        localObject2 = new com/google/android/gms/b/hh$a;
        ((hh.a)localObject2).<init>();
        b = ((hh.a)localObject2);
      }
      localObject2 = b;
      localObject2 = c;
      ((List)localObject2).add(paramb);
    }
  }
  
  public final Context b()
  {
    synchronized (a)
    {
      Object localObject2 = b;
      if (localObject2 != null)
      {
        localObject2 = b;
        localObject2 = b;
        return (Context)localObject2;
      }
      localObject2 = null;
    }
  }
}


/* Location:              com/google/android/gms/b/hh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */