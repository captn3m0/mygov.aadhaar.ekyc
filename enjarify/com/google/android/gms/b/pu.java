package com.google.android.gms.b;

import android.content.Context;

public class pu
  extends pr
  implements vd.a
{
  pu(Context paramContext, tg.a parama, vc paramvc, pt.a parama1)
  {
    super(paramContext, parama, paramvc, parama1);
  }
  
  protected final void a()
  {
    Object localObject = e;
    int i = e;
    int j = -2;
    if (i != j) {}
    for (;;)
    {
      return;
      c.l().c = this;
      d();
      tp.b("Loading HTML in WebView.");
      localObject = c;
      String str1 = e.b;
      String str2 = e.c;
      String str3 = "text/html";
      String str4 = "UTF-8";
      ((vc)localObject).loadDataWithBaseURL(str1, str2, str3, str4, null);
    }
  }
  
  protected void d() {}
}


/* Location:              com/google/android/gms/b/pu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */