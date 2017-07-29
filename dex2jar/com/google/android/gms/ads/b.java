package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.b.e.a;
import com.google.android.gms.ads.b.f.a;
import com.google.android.gms.b.id;
import com.google.android.gms.b.ik;
import com.google.android.gms.b.io;
import com.google.android.gms.b.io.4;
import com.google.android.gms.b.ip;
import com.google.android.gms.b.iu;
import com.google.android.gms.b.iv;
import com.google.android.gms.b.le;
import com.google.android.gms.b.lv;
import com.google.android.gms.b.lw;
import com.google.android.gms.b.oa;
import com.google.android.gms.b.ul;

public class b
{
  public final Context a;
  public final iu b;
  private final ik c;
  
  b(Context paramContext, iu paramiu)
  {
    this(paramContext, paramiu, ik.a());
  }
  
  private b(Context paramContext, iu paramiu, ik paramik)
  {
    a = paramContext;
    b = paramiu;
    c = paramik;
  }
  
  public static final class a
  {
    private final Context a;
    private final iv b;
    
    private a(Context paramContext, iv paramiv)
    {
      a = paramContext;
      b = paramiv;
    }
    
    public a(Context paramContext, String paramString)
    {
      this((Context)com.google.android.gms.common.internal.c.a(paramContext, "context cannot be null"), (iv)io.a(paramContext, false, new io.4(ip.b(), paramContext, paramString, new oa())));
    }
    
    public final a a(a parama)
    {
      try
      {
        b.a(new id(parama));
        return this;
      }
      catch (RemoteException parama)
      {
        ul.c("Failed to set AdListener.", parama);
      }
      return this;
    }
    
    public final a a(com.google.android.gms.ads.b.c paramc)
    {
      try
      {
        b.a(new le(paramc));
        return this;
      }
      catch (RemoteException paramc)
      {
        ul.c("Failed to specify native ad options", paramc);
      }
      return this;
    }
    
    public final a a(e.a parama)
    {
      try
      {
        b.a(new lv(parama));
        return this;
      }
      catch (RemoteException parama)
      {
        ul.c("Failed to add app install ad listener", parama);
      }
      return this;
    }
    
    public final a a(f.a parama)
    {
      try
      {
        b.a(new lw(parama));
        return this;
      }
      catch (RemoteException parama)
      {
        ul.c("Failed to add content ad listener", parama);
      }
      return this;
    }
    
    public final b a()
    {
      try
      {
        b localb = new b(a, b.a());
        return localb;
      }
      catch (RemoteException localRemoteException)
      {
        ul.b("Failed to build AdLoader.", localRemoteException);
      }
      return null;
    }
  }
}


/* Location:              com/google/android/gms/ads/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */