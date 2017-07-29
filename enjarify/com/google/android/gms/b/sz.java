package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.w;

public final class sz
  implements hb.b
{
  boolean a;
  private final Context b;
  private final String c;
  private final Object d;
  
  public sz(Context paramContext, String paramString)
  {
    b = paramContext;
    c = paramString;
    a = false;
    Object localObject = new java/lang/Object;
    localObject.<init>();
    d = localObject;
  }
  
  public final void a(hb.a parama)
  {
    boolean bool = m;
    a(bool);
  }
  
  public final void a(boolean paramBoolean)
  {
    ta localta1 = w.D();
    boolean bool1 = localta1.a();
    if (!bool1) {}
    for (;;)
    {
      return;
      synchronized (d)
      {
        bool1 = a;
        if (bool1 != paramBoolean) {
          break;
        }
      }
    }
    a = paramBoolean;
    bool1 = a;
    ta localta2;
    Context localContext;
    String str1;
    boolean bool2;
    String str2;
    if (bool1)
    {
      localta2 = w.D();
      localContext = b;
      str1 = c;
      bool2 = localta2.a();
      if (bool2)
      {
        str2 = "beginAdUnitExposure";
        localta2.a(localContext, str1, str2);
      }
    }
    for (;;)
    {
      break;
      localta2 = w.D();
      localContext = b;
      str1 = c;
      bool2 = localta2.a();
      if (bool2)
      {
        str2 = "endAdUnitExposure";
        localta2.a(localContext, str1, str2);
      }
    }
  }
}


/* Location:              com/google/android/gms/b/sz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */