package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.Arrays;

public abstract class w
{
  private static final Object a = new Object();
  private static w b;
  
  public static w a(Context paramContext)
  {
    synchronized (a)
    {
      if (b == null) {
        b = new x(paramContext.getApplicationContext());
      }
      return b;
    }
  }
  
  protected abstract boolean a(a parama, ServiceConnection paramServiceConnection);
  
  public final boolean a(String paramString1, String paramString2, ServiceConnection paramServiceConnection)
  {
    return a(new a(paramString1, paramString2), paramServiceConnection);
  }
  
  protected abstract void b(a parama, ServiceConnection paramServiceConnection);
  
  public final void b(String paramString1, String paramString2, ServiceConnection paramServiceConnection)
  {
    b(new a(paramString1, paramString2), paramServiceConnection);
  }
  
  protected static final class a
  {
    final String a;
    final ComponentName b;
    private final String c;
    
    public a(String paramString1, String paramString2)
    {
      c = c.a(paramString1);
      a = c.a(paramString2);
      b = null;
    }
    
    public final Intent a()
    {
      if (c != null) {
        return new Intent(c).setPackage(a);
      }
      return new Intent().setComponent(b);
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {}
      do
      {
        return true;
        if (!(paramObject instanceof a)) {
          return false;
        }
        paramObject = (a)paramObject;
      } while ((b.a(c, c)) && (b.a(b, b)));
      return false;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { c, b });
    }
    
    public final String toString()
    {
      if (c == null) {
        return b.flattenToString();
      }
      return c;
    }
  }
}


/* Location:              com/google/android/gms/common/internal/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */