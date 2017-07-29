package mygov.aadhaar.ekyc.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import com.a.a.a.h;
import com.a.a.a.h.a;
import com.a.a.a.l;
import com.a.a.m;

public final class c
{
  private static c a;
  private static Context b;
  private m c;
  private h d;
  
  private c(Context paramContext)
  {
    b = paramContext;
    c = a();
    d = new h(c, new h.a()
    {
      private final LruCache<String, Bitmap> b = new LruCache(20);
    });
  }
  
  public static c a(Context paramContext)
  {
    try
    {
      if (a == null) {
        a = new c(paramContext);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  public final m a()
  {
    if (c == null) {
      c = l.a(b.getApplicationContext());
    }
    return c;
  }
}


/* Location:              mygov/aadhaar/ekyc/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */