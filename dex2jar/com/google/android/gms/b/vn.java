package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.w;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@qi
@TargetApi(11)
public class vn
  extends vd
{
  public vn(vc paramvc, boolean paramBoolean)
  {
    super(paramvc, paramBoolean);
  }
  
  protected final WebResourceResponse a(WebView arg1, String paramString)
  {
    if (!(??? instanceof vc))
    {
      tp.e("Tried to intercept request from a WebView that wasn't an AdWebView.");
      return null;
    }
    Object localObject = (vc)???;
    if (!"mraid.js".equalsIgnoreCase(new File(paramString).getName())) {
      return super.shouldInterceptRequest(???, paramString);
    }
    if (((vc)localObject).l() != null) {
      paramString = ((vc)localObject).l();
    }
    synchronized (b)
    {
      f = false;
      g = true;
      w.e();
      tt.a(new vd.2(paramString));
      if (kd)
      {
        ??? = ke.S;
        ??? = (String)w.q().a(???);
      }
    }
    try
    {
      for (;;)
      {
        paramString = ((vc)localObject).getContext();
        localObject = oa;
        HashMap localHashMap = new HashMap();
        localHashMap.put("User-Agent", w.e().a(paramString, (String)localObject));
        localHashMap.put("Cache-Control", "max-stale=3600");
        new ua(paramString);
        ??? = (String)ua.a(???, localHashMap).get(60L, TimeUnit.SECONDS);
        if (??? != null) {
          break;
        }
        return null;
        paramString = finally;
        throw paramString;
        if (((vc)localObject).p())
        {
          ??? = ke.R;
          ??? = (String)w.q().a(???);
        }
        else
        {
          ??? = ke.Q;
          ??? = (String)w.q().a(???);
        }
      }
      ??? = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(???.getBytes("UTF-8")));
      return (WebResourceResponse)???;
    }
    catch (InterruptedException ???)
    {
      ??? = String.valueOf(???.getMessage());
      if (???.length() != 0) {}
      for (??? = "Could not fetch MRAID JS. ".concat(???);; ??? = new String("Could not fetch MRAID JS. "))
      {
        tp.e(???);
        return null;
      }
    }
    catch (ExecutionException ???)
    {
      for (;;) {}
    }
    catch (IOException ???)
    {
      for (;;) {}
    }
    catch (TimeoutException ???)
    {
      for (;;) {}
    }
  }
}


/* Location:              com/google/android/gms/b/vn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */