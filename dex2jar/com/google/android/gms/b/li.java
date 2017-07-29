package com.google.android.gms.b;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.b.b.a;

@qi
public final class li
  extends b.a
{
  private final lh a;
  private final Drawable b;
  private final Uri c;
  private final double d;
  
  public li(lh paramlh)
  {
    a = paramlh;
    try
    {
      paramlh = a.a();
      if (paramlh == null) {
        break label83;
      }
      paramlh = (Drawable)b.a(paramlh);
    }
    catch (RemoteException paramlh)
    {
      try
      {
        paramlh = a.b();
        c = paramlh;
        double d1 = 1.0D;
        try
        {
          double d2 = a.c();
          d1 = d2;
        }
        catch (RemoteException paramlh)
        {
          for (;;)
          {
            ul.b("Failed to get scale.", paramlh);
          }
        }
        d = d1;
        return;
        paramlh = paramlh;
        ul.b("Failed to get drawable.", paramlh);
        paramlh = null;
      }
      catch (RemoteException paramlh)
      {
        for (;;)
        {
          ul.b("Failed to get uri.", paramlh);
          paramlh = (lh)localObject;
        }
      }
    }
    b = paramlh;
  }
  
  public final Drawable a()
  {
    return b;
  }
  
  public final Uri b()
  {
    return c;
  }
  
  public final double c()
  {
    return d;
  }
}


/* Location:              com/google/android/gms/b/li.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */