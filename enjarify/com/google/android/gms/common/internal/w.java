package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;

public abstract class w
{
  private static final Object a;
  private static w b;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  public static w a(Context paramContext)
  {
    synchronized (a)
    {
      Object localObject2 = b;
      if (localObject2 == null)
      {
        localObject2 = new com/google/android/gms/common/internal/x;
        Context localContext = paramContext.getApplicationContext();
        ((x)localObject2).<init>(localContext);
        b = (w)localObject2;
      }
      return b;
    }
  }
  
  protected abstract boolean a(w.a parama, ServiceConnection paramServiceConnection);
  
  public final boolean a(String paramString1, String paramString2, ServiceConnection paramServiceConnection)
  {
    w.a locala = new com/google/android/gms/common/internal/w$a;
    locala.<init>(paramString1, paramString2);
    return a(locala, paramServiceConnection);
  }
  
  protected abstract void b(w.a parama, ServiceConnection paramServiceConnection);
  
  public final void b(String paramString1, String paramString2, ServiceConnection paramServiceConnection)
  {
    w.a locala = new com/google/android/gms/common/internal/w$a;
    locala.<init>(paramString1, paramString2);
    b(locala, paramServiceConnection);
  }
}


/* Location:              com/google/android/gms/common/internal/w.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */