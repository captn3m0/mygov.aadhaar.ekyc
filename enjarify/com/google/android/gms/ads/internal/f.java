package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.b.qr;
import com.google.android.gms.b.qt;
import com.google.android.gms.b.tg.a;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import java.util.Iterator;
import java.util.List;

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
    qt localqt = new com/google/android/gms/b/qt;
    localqt.<init>((byte)0);
    c = localqt;
  }
  
  public f(Context paramContext, tg.a parama)
  {
    b = paramContext;
    qt localqt;
    if (parama != null)
    {
      localqt = b.G;
      if (localqt != null) {
        localqt = b.G;
      }
    }
    for (c = localqt;; c = localqt)
    {
      return;
      localqt = new com/google/android/gms/b/qt;
      localqt.<init>();
    }
  }
  
  public final void a(String paramString)
  {
    if (paramString != null) {}
    for (;;)
    {
      tp.d("Action was blocked because no touch was detected.");
      Object localObject = c;
      boolean bool1 = a;
      if (!bool1) {
        break;
      }
      localObject = c.b;
      if (localObject == null) {
        break;
      }
      localObject = c.b;
      Iterator localIterator = ((List)localObject).iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject = (String)localIterator.next();
        boolean bool2 = TextUtils.isEmpty((CharSequence)localObject);
        if (!bool2)
        {
          String str = Uri.encode(paramString);
          localObject = ((String)localObject).replace("{NAVIGATION_URL}", str);
          w.e();
          Context localContext = b;
          str = "";
          tt.b(localContext, str, (String)localObject);
        }
      }
      paramString = "";
    }
  }
  
  public final boolean a()
  {
    qt localqt = c;
    boolean bool = a;
    if (bool)
    {
      bool = a;
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localqt = null;
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */