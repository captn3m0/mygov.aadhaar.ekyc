package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.qr;
import com.google.android.gms.b.qt;
import com.google.android.gms.b.tg.a;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import java.util.Iterator;
import java.util.List;

@qi
public final class f
{
  boolean a;
  private final Context b;
  private final qt c;
  
  public f(Context paramContext)
  {
    this(paramContext, (byte)0);
  }
  
  public f(Context paramContext, byte paramByte)
  {
    b = paramContext;
    c = new qt((byte)0);
  }
  
  public f(Context paramContext, tg.a parama)
  {
    b = paramContext;
    if ((parama != null) && (b.G != null))
    {
      c = b.G;
      return;
    }
    c = new qt();
  }
  
  public final void a(String paramString)
  {
    if (paramString != null) {}
    for (;;)
    {
      tp.d("Action was blocked because no touch was detected.");
      if ((!c.a) || (c.b == null)) {
        break;
      }
      Iterator localIterator = c.b.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (!TextUtils.isEmpty(str))
        {
          str = str.replace("{NAVIGATION_URL}", Uri.encode(paramString));
          w.e();
          tt.b(b, "", str);
        }
      }
      paramString = "";
    }
  }
  
  public final boolean a()
  {
    return (!c.a) || (a);
  }
}


/* Location:              com/google/android/gms/ads/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */