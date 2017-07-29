package com.google.android.gms.b;

import android.content.Context;

@qi
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
    if (e.e != -2) {
      return;
    }
    c.l().c = this;
    d();
    tp.b("Loading HTML in WebView.");
    c.loadDataWithBaseURL(e.b, e.c, "text/html", "UTF-8", null);
  }
  
  protected void d() {}
}


/* Location:              com/google/android/gms/b/pu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */