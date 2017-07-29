package com.google.android.gms.b;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.c.a.a;

@qi
public final class gp
  extends gr.a
{
  private final dv a;
  private final dw b;
  private final bx c;
  private boolean d = false;
  
  public gp(String paramString, Context paramContext)
  {
    a = dv.a(paramString, paramContext, false);
    b = new dw(a);
    c = bx.b(paramContext);
  }
  
  private a a(a parama1, a parama2, boolean paramBoolean)
  {
    try
    {
      parama1 = (Uri)b.a(parama1);
      parama2 = (Context)b.a(parama2);
      if (paramBoolean) {}
      for (parama1 = b.a(parama1, parama2, null, false, null);; parama1 = b.a(parama1, parama2, null)) {
        return b.a(parama1);
      }
      return null;
    }
    catch (dx parama1) {}
  }
  
  public final a a(a parama1, a parama2)
  {
    return a(parama1, parama2, true);
  }
  
  public final String a()
  {
    return "ms";
  }
  
  public final String a(a parama, String paramString)
  {
    parama = (Context)b.a(parama);
    return a.a(parama, paramString, null);
  }
  
  public final String a(a parama, byte[] paramArrayOfByte)
  {
    parama = (Context)b.a(parama);
    String str = a.a(parama, paramArrayOfByte);
    if ((c != null) && (d))
    {
      parama = bx.a(str, c.a(parama, paramArrayOfByte));
      d = false;
      return parama;
    }
    return str;
  }
  
  public final void a(String paramString)
  {
    b.c = paramString.split(",");
  }
  
  public final void a(String paramString1, String paramString2)
  {
    dw localdw = b;
    a = paramString1;
    b = paramString2;
  }
  
  public final boolean a(a parama)
  {
    parama = (Uri)b.a(parama);
    return b.a(parama);
  }
  
  public final boolean a(String paramString, boolean paramBoolean)
  {
    if (c == null) {
      return false;
    }
    paramString = new a.a(paramString, paramBoolean);
    c.l = paramString;
    d = true;
    return true;
  }
  
  public final a b(a parama1, a parama2)
  {
    return a(parama1, parama2, false);
  }
  
  public final boolean b(a parama)
  {
    parama = (Uri)b.a(parama);
    return b.b(parama);
  }
  
  public final String c(a parama)
  {
    return a(parama, null);
  }
  
  public final void d(a parama)
  {
    parama = (MotionEvent)b.a(parama);
    b.a(parama);
  }
}


/* Location:              com/google/android/gms/b/gp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */