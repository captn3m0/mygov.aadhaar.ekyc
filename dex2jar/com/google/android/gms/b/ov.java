package com.google.android.gms.b;

import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.w;
import java.util.Map;

@qi
public final class ov
  extends oy
{
  final Map<String, String> a;
  final Context b;
  
  public ov(vc paramvc, Map<String, String> paramMap)
  {
    super(paramvc, "storePicture");
    a = paramMap;
    b = paramvc.f();
  }
}


/* Location:              com/google/android/gms/b/ov.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */