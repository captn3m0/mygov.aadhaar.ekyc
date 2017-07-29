package com.google.android.gms.b;

import android.app.DownloadManager.Request;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.util.Set;

public class tu$b
  extends tu.a
{
  public vd a(vc paramvc, boolean paramBoolean)
  {
    vl localvl = new com/google/android/gms/b/vl;
    localvl.<init>(paramvc, paramBoolean);
    return localvl;
  }
  
  public final Set a(Uri paramUri)
  {
    return paramUri.getQueryParameterNames();
  }
  
  public final boolean a(DownloadManager.Request paramRequest)
  {
    int i = 1;
    paramRequest.allowScanningByMediaScanner();
    paramRequest.setNotificationVisibility(i);
    return i;
  }
  
  public boolean a(Context paramContext, WebSettings paramWebSettings)
  {
    super.a(paramContext, paramWebSettings);
    tu.b.1 local1 = new com/google/android/gms/b/tu$b$1;
    local1.<init>(paramContext, paramWebSettings);
    return ((Boolean)uh.a(local1)).booleanValue();
  }
  
  public final boolean a(Window paramWindow)
  {
    int i = 16777216;
    paramWindow.setFlags(i, i);
    return true;
  }
  
  public final boolean b(View paramView)
  {
    paramView.setLayerType(0, null);
    return true;
  }
  
  public WebChromeClient c(vc paramvc)
  {
    vk localvk = new com/google/android/gms/b/vk;
    localvk.<init>(paramvc);
    return localvk;
  }
  
  public final boolean c(View paramView)
  {
    int i = 1;
    paramView.setLayerType(i, null);
    return i;
  }
}


/* Location:              com/google/android/gms/b/tu$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */