package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Base64;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.b.kw;
import com.google.android.gms.b.kx;
import com.google.android.gms.b.lh;
import com.google.android.gms.b.md;
import com.google.android.gms.b.nr;
import com.google.android.gms.b.nw;
import com.google.android.gms.b.od;
import com.google.android.gms.b.og;
import com.google.android.gms.b.oh;
import com.google.android.gms.b.tg;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.vc;
import com.google.android.gms.b.vd;
import com.google.android.gms.b.vd.a;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class p
{
  public static View a(tg paramtg)
  {
    boolean bool;
    Object localObject1;
    if (paramtg == null)
    {
      tp.c("AdState is null");
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return (View)localObject1;
      bool = b(paramtg);
      if (bool)
      {
        localObject1 = b;
        if (localObject1 != null)
        {
          localObject1 = b.b();
          continue;
        }
      }
      try
      {
        localObject1 = p;
        if (localObject1 != null) {
          localObject1 = p;
        }
        for (localObject1 = ((od)localObject1).a();; localObject1 = null)
        {
          if (localObject1 != null) {
            break label92;
          }
          localObject1 = "View in mediation adapter is null.";
          tp.e((String)localObject1);
          bool = false;
          localObject1 = null;
          break;
          bool = false;
        }
        label92:
        localObject1 = b.a((a)localObject1);
        localObject1 = (View)localObject1;
      }
      catch (RemoteException localRemoteException)
      {
        String str = "Could not get View from mediation adapter.";
        tp.c(str, localRemoteException);
        bool = false;
        Object localObject2 = null;
      }
    }
  }
  
  static md a(og paramog, oh paramoh, g.a parama)
  {
    p.5 local5 = new com/google/android/gms/ads/internal/p$5;
    local5.<init>(paramog, parama, paramoh);
    return local5;
  }
  
  private static String a(Bitmap paramBitmap)
  {
    Object localObject1 = new java/io/ByteArrayOutputStream;
    ((ByteArrayOutputStream)localObject1).<init>();
    if (paramBitmap == null)
    {
      tp.e("Bitmap is null. Returning empty string");
      localObject1 = "";
    }
    for (;;)
    {
      return (String)localObject1;
      Object localObject2 = Bitmap.CompressFormat.PNG;
      paramBitmap.compress((Bitmap.CompressFormat)localObject2, 100, (OutputStream)localObject1);
      localObject1 = Base64.encodeToString(((ByteArrayOutputStream)localObject1).toByteArray(), 0);
      localObject2 = String.valueOf("data:image/png;base64,");
      localObject1 = String.valueOf(localObject1);
      int i = ((String)localObject1).length();
      if (i != 0)
      {
        localObject1 = ((String)localObject2).concat((String)localObject1);
      }
      else
      {
        localObject1 = new java/lang/String;
        ((String)localObject1).<init>((String)localObject2);
      }
    }
  }
  
  static String a(lh paramlh)
  {
    Object localObject;
    if (paramlh == null)
    {
      tp.e("Image is null. Returning empty string");
      localObject = "";
    }
    for (;;)
    {
      return (String)localObject;
      try
      {
        localObject = paramlh.b();
        if (localObject != null) {
          localObject = ((Uri)localObject).toString();
        }
      }
      catch (RemoteException localRemoteException)
      {
        String str = "Unable to get image uri. Trying data uri next";
        tp.e(str);
        str = b(paramlh);
      }
    }
  }
  
  public static boolean a(vc paramvc, nw paramnw, CountDownLatch paramCountDownLatch)
  {
    for (;;)
    {
      try
      {
        localObject1 = paramvc.b();
        if (localObject1 != null) {
          continue;
        }
        localObject1 = "AdWebView is null";
        tp.e((String)localObject1);
        bool1 = false;
        localObject1 = null;
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        int i;
        boolean bool2;
        Object localObject3;
        Object localObject4;
        Object localObject5;
        Object localObject6;
        Object localObject7;
        String str2;
        double d;
        String str3;
        Object localObject2 = "Unable to invoke load assets";
        tp.c((String)localObject2, localRemoteException);
        boolean bool1 = false;
        String str1 = null;
        continue;
        str1 = "No matching template id and mapper";
        tp.e(str1);
        bool1 = false;
        str1 = null;
        continue;
        str1 = "text/html";
        localObject2 = "UTF-8";
        paramvc.loadData((String)localObject3, str1, (String)localObject2);
        continue;
      }
      catch (RuntimeException localRuntimeException)
      {
        paramCountDownLatch.countDown();
        throw localRuntimeException;
      }
      if (!bool1) {
        paramCountDownLatch.countDown();
      }
      return bool1;
      i = 4;
      ((View)localObject1).setVisibility(i);
      localObject1 = b;
      localObject1 = o;
      if (localObject1 != null)
      {
        bool2 = ((List)localObject1).isEmpty();
        if (!bool2) {
          continue;
        }
      }
      localObject1 = "No template ids present in mediation response";
      tp.e((String)localObject1);
      bool1 = false;
      localObject1 = null;
    }
    localObject2 = paramvc.l();
    localObject3 = "/nativeExpressAssetsLoaded";
    localObject4 = new com/google/android/gms/ads/internal/p$3;
    ((p.3)localObject4).<init>(paramCountDownLatch);
    ((vd)localObject2).a((String)localObject3, (md)localObject4);
    localObject2 = paramvc.l();
    localObject3 = "/nativeExpressAssetsLoadingFailed";
    localObject4 = new com/google/android/gms/ads/internal/p$4;
    ((p.4)localObject4).<init>(paramCountDownLatch);
    ((vd)localObject2).a((String)localObject3, (md)localObject4);
    localObject2 = c;
    localObject5 = ((od)localObject2).h();
    localObject2 = c;
    localObject6 = ((od)localObject2).i();
    localObject2 = "2";
    bool2 = ((List)localObject1).contains(localObject2);
    if ((bool2) && (localObject5 != null))
    {
      localObject1 = new com/google/android/gms/b/kw;
      localObject2 = ((og)localObject5).a();
      localObject3 = ((og)localObject5).b();
      localObject4 = ((og)localObject5).c();
      localObject7 = ((og)localObject5).d();
      str2 = ((og)localObject5).e();
      d = ((og)localObject5).f();
      localObject6 = ((og)localObject5).g();
      str3 = ((og)localObject5).h();
      localObject5 = ((og)localObject5).l();
      ((kw)localObject1).<init>((String)localObject2, (List)localObject3, (String)localObject4, (lh)localObject7, str2, d, (String)localObject6, str3, null, (Bundle)localObject5, null, null);
      localObject2 = b;
      localObject2 = n;
      localObject3 = paramvc.l();
      localObject4 = new com/google/android/gms/ads/internal/p$1;
      ((p.1)localObject4).<init>((kw)localObject1, (String)localObject2, paramvc);
    }
    for (c = ((vd.a)localObject4);; c = ((vd.a)localObject4))
    {
      localObject1 = b;
      localObject3 = l;
      localObject1 = b;
      localObject2 = m;
      if (localObject2 == null) {
        break label617;
      }
      localObject4 = "text/html";
      localObject7 = "UTF-8";
      str2 = null;
      localObject1 = paramvc;
      paramvc.loadDataWithBaseURL((String)localObject2, (String)localObject3, (String)localObject4, (String)localObject7, null);
      bool1 = true;
      break;
      localObject2 = "1";
      bool1 = ((List)localObject1).contains(localObject2);
      if ((!bool1) || (localObject6 == null)) {
        break label601;
      }
      localObject1 = new com/google/android/gms/b/kx;
      localObject2 = ((oh)localObject6).a();
      localObject3 = ((oh)localObject6).b();
      localObject4 = ((oh)localObject6).c();
      localObject7 = ((oh)localObject6).d();
      str2 = ((oh)localObject6).e();
      String str4 = ((oh)localObject6).f();
      localObject6 = ((oh)localObject6).j();
      str3 = null;
      ((kx)localObject1).<init>((String)localObject2, (List)localObject3, (String)localObject4, (lh)localObject7, str2, str4, null, (Bundle)localObject6, null, null);
      localObject2 = b;
      localObject2 = n;
      localObject3 = paramvc.l();
      localObject4 = new com/google/android/gms/ads/internal/p$2;
      ((p.2)localObject4).<init>((kx)localObject1, (String)localObject2, paramvc);
    }
  }
  
  private static String b(lh paramlh)
  {
    for (;;)
    {
      try
      {
        localObject = paramlh.a();
        if (localObject != null) {
          continue;
        }
        localObject = "Drawable is null. Returning empty string";
        tp.e((String)localObject);
        localObject = "";
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject;
        boolean bool;
        tp.e("Unable to get drawable. Returning empty string");
        String str = "";
        continue;
        str = a(((BitmapDrawable)str).getBitmap());
        continue;
      }
      return (String)localObject;
      localObject = b.a((a)localObject);
      localObject = (Drawable)localObject;
      bool = localObject instanceof BitmapDrawable;
      if (bool) {
        continue;
      }
      tp.e("Drawable is not an instance of BitmapDrawable. Returning empty string");
      localObject = "";
    }
  }
  
  public static boolean b(tg paramtg)
  {
    boolean bool;
    Object localObject;
    if (paramtg != null)
    {
      bool = n;
      if (bool)
      {
        localObject = o;
        if (localObject != null)
        {
          localObject = o.l;
          if (localObject != null) {
            bool = true;
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */