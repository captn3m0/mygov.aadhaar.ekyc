package com.google.android.gms.b;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.c.a.a;

public final class gp
  extends gr.a
{
  private final dv a;
  private final dw b;
  private final bx c;
  private boolean d = false;
  
  public gp(String paramString, Context paramContext)
  {
    Object localObject = dv.a(paramString, paramContext, false);
    a = ((dv)localObject);
    localObject = new com/google/android/gms/b/dw;
    dv localdv = a;
    ((dw)localObject).<init>(localdv);
    b = ((dw)localObject);
    localObject = bx.b(paramContext);
    c = ((bx)localObject);
  }
  
  private a a(a parama1, a parama2, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        localObject1 = b.a(parama1);
        localObject1 = (Uri)localObject1;
        localObject2 = b.a(parama2);
        localObject2 = (Context)localObject2;
        if (!paramBoolean) {
          continue;
        }
        localObject3 = b;
        localObject3 = ((dw)localObject3).a((Uri)localObject1, (Context)localObject2, null, false, null);
        localObject3 = b.a(localObject3);
      }
      catch (dx localdx)
      {
        Object localObject1;
        Object localObject2;
        Object localObject3;
        Object localObject4 = null;
        continue;
      }
      return (a)localObject3;
      localObject3 = b;
      localObject3 = ((dw)localObject3).a((Uri)localObject1, (Context)localObject2, null);
    }
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
    Context localContext = (Context)b.a(parama);
    return a.a(localContext, paramString, null);
  }
  
  public final String a(a parama, byte[] paramArrayOfByte)
  {
    Object localObject = (Context)b.a(parama);
    String str = a.a((Context)localObject, paramArrayOfByte);
    bx localbx = c;
    if (localbx != null)
    {
      boolean bool = d;
      if (bool)
      {
        localbx = c;
        localObject = localbx.a((Context)localObject, paramArrayOfByte);
        localObject = bx.a(str, (String)localObject);
        str = null;
        d = false;
      }
    }
    for (;;)
    {
      return (String)localObject;
      localObject = str;
    }
  }
  
  public final void a(String paramString)
  {
    dw localdw = b;
    String[] arrayOfString = paramString.split(",");
    c = arrayOfString;
  }
  
  public final void a(String paramString1, String paramString2)
  {
    dw localdw = b;
    a = paramString1;
    b = paramString2;
  }
  
  public final boolean a(a parama)
  {
    Uri localUri = (Uri)b.a(parama);
    return b.a(localUri);
  }
  
  public final boolean a(String paramString, boolean paramBoolean)
  {
    boolean bool = true;
    Object localObject = c;
    if (localObject == null) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      localObject = new com/google/android/gms/ads/c/a$a;
      ((a.a)localObject).<init>(paramString, paramBoolean);
      bx localbx = c;
      l = ((a.a)localObject);
      d = bool;
    }
  }
  
  public final a b(a parama1, a parama2)
  {
    return a(parama1, parama2, false);
  }
  
  public final boolean b(a parama)
  {
    Uri localUri = (Uri)b.a(parama);
    return b.b(localUri);
  }
  
  public final String c(a parama)
  {
    return a(parama, null);
  }
  
  public final void d(a parama)
  {
    MotionEvent localMotionEvent = (MotionEvent)b.a(parama);
    b.a(localMotionEvent);
  }
}


/* Location:              com/google/android/gms/b/gp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */