package com.google.android.gms.b;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.common.api.f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

@qi
public abstract class ms
  implements f
{
  protected Context a;
  protected String b;
  protected WeakReference<vc> c;
  
  public ms(vc paramvc)
  {
    a = paramvc.getContext();
    b = w.e().a(a, oa);
    c = new WeakReference(paramvc);
  }
  
  public abstract void a();
  
  protected final void a(final String paramString1, final String paramString2, final int paramInt)
  {
    uk.a.post(new Runnable()
    {
      public final void run()
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("event", "precacheComplete");
        localHashMap.put("src", paramString1);
        localHashMap.put("cachedSrc", paramString2);
        localHashMap.put("totalBytes", Integer.toString(paramInt));
        ms.a(ms.this, "onPrecacheEvent", localHashMap);
      }
    });
  }
  
  public final void a(final String paramString1, final String paramString2, final String paramString3, final String paramString4)
  {
    uk.a.post(new Runnable()
    {
      public final void run()
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("event", "precacheCanceled");
        localHashMap.put("src", paramString1);
        if (!TextUtils.isEmpty(paramString2)) {
          localHashMap.put("cachedSrc", paramString2);
        }
        String str2 = paramString3;
        String str1 = "internal";
        int i = -1;
        switch (str2.hashCode())
        {
        default: 
          switch (i)
          {
          }
          break;
        }
        for (;;)
        {
          localHashMap.put("type", str1);
          localHashMap.put("reason", paramString3);
          if (!TextUtils.isEmpty(paramString4)) {
            localHashMap.put("message", paramString4);
          }
          ms.a(ms.this, "onPrecacheEvent", localHashMap);
          return;
          if (!str2.equals("error")) {
            break;
          }
          i = 0;
          break;
          if (!str2.equals("playerFailed")) {
            break;
          }
          i = 1;
          break;
          if (!str2.equals("inProgress")) {
            break;
          }
          i = 2;
          break;
          if (!str2.equals("contentLengthMissing")) {
            break;
          }
          i = 3;
          break;
          if (!str2.equals("noCacheDir")) {
            break;
          }
          i = 4;
          break;
          if (!str2.equals("expireFailed")) {
            break;
          }
          i = 5;
          break;
          if (!str2.equals("badUrl")) {
            break;
          }
          i = 6;
          break;
          if (!str2.equals("downloadTimeout")) {
            break;
          }
          i = 7;
          break;
          if (!str2.equals("sizeExceeded")) {
            break;
          }
          i = 8;
          break;
          if (!str2.equals("externalAbort")) {
            break;
          }
          i = 9;
          break;
          str1 = "internal";
          continue;
          str1 = "io";
          continue;
          str1 = "network";
          continue;
          str1 = "policy";
        }
      }
    });
  }
  
  public abstract boolean a(String paramString);
}


/* Location:              com/google/android/gms/b/ms.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */