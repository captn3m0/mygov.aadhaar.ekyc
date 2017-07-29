package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.km;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.vc;
import com.google.android.gms.common.util.c;
import java.util.HashMap;

public final class n
  extends FrameLayout
  implements k
{
  public final b a;
  public l b;
  long c;
  public String d;
  private final vc e;
  private final FrameLayout f;
  private final km g;
  private final long h;
  private boolean i;
  private boolean j;
  private boolean k;
  private boolean l;
  private long m;
  private Bitmap n;
  private ImageView o;
  private boolean p;
  
  public n(Context paramContext, vc paramvc, boolean paramBoolean, km paramkm)
  {
    super(paramContext);
    e = paramvc;
    g = paramkm;
    Object localObject1 = new android/widget/FrameLayout;
    ((FrameLayout)localObject1).<init>(paramContext);
    f = ((FrameLayout)localObject1);
    localObject1 = f;
    Object localObject2 = new android/widget/FrameLayout$LayoutParams;
    ((FrameLayout.LayoutParams)localObject2).<init>(i1, i1);
    addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
    com.google.android.gms.common.internal.l.a(paramvc.h());
    localObject1 = hb.a(paramContext, paramvc, paramBoolean, paramkm);
    b = ((l)localObject1);
    localObject1 = b;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject1 = f;
      localObject2 = b;
      localObject3 = new android/widget/FrameLayout$LayoutParams;
      int i2 = 17;
      ((FrameLayout.LayoutParams)localObject3).<init>(i1, i1, i2);
      ((FrameLayout)localObject1).addView((View)localObject2, (ViewGroup.LayoutParams)localObject3);
      localObject1 = ke.A;
      localObject2 = w.q();
      localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
      bool = ((Boolean)localObject1).booleanValue();
      if (bool) {
        j();
      }
    }
    localObject1 = new android/widget/ImageView;
    ((ImageView)localObject1).<init>(paramContext);
    o = ((ImageView)localObject1);
    localObject1 = ke.E;
    long l1 = ((Long)w.q().a((jz)localObject1)).longValue();
    h = l1;
    localObject1 = ke.C;
    localObject2 = w.q();
    boolean bool = ((Boolean)((kd)localObject2).a((jz)localObject1)).booleanValue();
    l = bool;
    localObject1 = g;
    if (localObject1 != null)
    {
      localObject2 = g;
      localObject3 = "spinner_used";
      bool = l;
      if (!bool) {
        break label376;
      }
    }
    label376:
    for (localObject1 = "1";; localObject1 = "0")
    {
      ((km)localObject2).a((String)localObject3, (String)localObject1);
      localObject1 = new com/google/android/gms/ads/internal/overlay/b;
      ((b)localObject1).<init>(this);
      a = ((b)localObject1);
      localObject1 = b;
      if (localObject1 != null)
      {
        localObject1 = b;
        ((l)localObject1).a(this);
      }
      localObject1 = b;
      if (localObject1 == null)
      {
        localObject1 = "AdVideoUnderlay Error";
        localObject2 = "Allocating player failed.";
        a((String)localObject1, (String)localObject2);
      }
      return;
    }
  }
  
  public static void a(vc paramvc)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    localHashMap.put("event", "no_video_view");
    paramvc.a("onVideoEvent", localHashMap);
  }
  
  private boolean l()
  {
    ViewParent localViewParent = o.getParent();
    boolean bool;
    if (localViewParent != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localViewParent = null;
    }
  }
  
  public final void a()
  {
    Object localObject = a;
    a = false;
    ((b)localObject).a();
    localObject = tt.a;
    n.1 local1 = new com/google/android/gms/ads/internal/overlay/n$1;
    local1.<init>(this);
    ((Handler)localObject).post(local1);
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    int i1 = 1;
    boolean bool = l;
    if (bool)
    {
      Object localObject1 = ke.D;
      kd localkd = w.q();
      int i2 = ((Integer)localkd.a((jz)localObject1)).intValue();
      int i3 = Math.max(paramInt1 / i2, i1);
      localObject1 = ke.D;
      localObject1 = (Integer)w.q().a((jz)localObject1);
      i2 = ((Integer)localObject1).intValue();
      i2 = Math.max(paramInt2 / i2, i1);
      Object localObject2 = n;
      if (localObject2 != null)
      {
        localObject2 = n;
        int i4 = ((Bitmap)localObject2).getWidth();
        if (i4 == i3)
        {
          localObject2 = n;
          i4 = ((Bitmap)localObject2).getHeight();
          if (i4 == i2) {
            return;
          }
        }
      }
      localObject2 = Bitmap.Config.ARGB_8888;
      localObject1 = Bitmap.createBitmap(i3, i2, (Bitmap.Config)localObject2);
      n = ((Bitmap)localObject1);
      i2 = 0;
      localObject1 = null;
      p = false;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    FrameLayout localFrameLayout = null;
    if ((paramInt3 == 0) || (paramInt4 == 0)) {}
    for (;;)
    {
      return;
      FrameLayout.LayoutParams localLayoutParams = new android/widget/FrameLayout$LayoutParams;
      localLayoutParams.<init>(paramInt3, paramInt4);
      localLayoutParams.setMargins(paramInt1, paramInt2, 0, 0);
      localFrameLayout = f;
      localFrameLayout.setLayoutParams(localLayoutParams);
      requestLayout();
    }
  }
  
  public final void a(String paramString1, String paramString2)
  {
    String[] arrayOfString = new String[4];
    arrayOfString[0] = "what";
    arrayOfString[1] = paramString1;
    arrayOfString[2] = "extra";
    arrayOfString[3] = paramString2;
    a("error", arrayOfString);
  }
  
  final void a(String paramString, String... paramVarArgs)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    localHashMap.put("event", paramString);
    int i1 = paramVarArgs.length;
    String str1 = null;
    int i2 = 0;
    String str2 = null;
    if (i2 < i1)
    {
      str1 = paramVarArgs[i2];
      if (str2 == null) {}
      for (;;)
      {
        i2 += 1;
        str2 = str1;
        break;
        localHashMap.put(str2, str1);
        str1 = null;
      }
    }
    e.a("onVideoEvent", localHashMap);
  }
  
  public final void b()
  {
    Object localObject = b;
    if (localObject == null) {}
    for (;;)
    {
      return;
      long l1 = m;
      long l2 = 0L;
      boolean bool = l1 < l2;
      if (!bool)
      {
        float f1 = b.getDuration();
        float f2 = 1000.0F;
        f1 /= f2;
        int i2 = b.getVideoWidth();
        l locall = b;
        int i3 = locall.getVideoHeight();
        String str1 = "canplaythrough";
        int i4 = 6;
        String[] arrayOfString = new String[i4];
        String str2 = "duration";
        arrayOfString[0] = str2;
        int i5 = 1;
        localObject = String.valueOf(f1);
        arrayOfString[i5] = localObject;
        String str3 = "videoWidth";
        arrayOfString[2] = str3;
        String str4 = String.valueOf(i2);
        arrayOfString[3] = str4;
        arrayOfString[4] = "videoHeight";
        int i1 = 5;
        f1 = 7.0E-45F;
        str4 = String.valueOf(i3);
        arrayOfString[i1] = str4;
        a(str1, arrayOfString);
      }
    }
  }
  
  public final void c()
  {
    int i1 = 1;
    Object localObject = e.f();
    int i2;
    if (localObject != null)
    {
      boolean bool1 = j;
      if (!bool1)
      {
        localObject = e.f().getWindow().getAttributes();
        i2 = flags & 0x80;
        if (i2 == 0) {
          break label105;
        }
        i2 = i1;
      }
    }
    for (;;)
    {
      k = i2;
      boolean bool2 = k;
      if (!bool2)
      {
        localObject = e.f().getWindow();
        int i3 = 128;
        ((Window)localObject).addFlags(i3);
        j = i1;
      }
      i = i1;
      return;
      label105:
      bool2 = false;
      localObject = null;
    }
  }
  
  public final void d()
  {
    String[] arrayOfString = new String[0];
    a("pause", arrayOfString);
    k();
    i = false;
  }
  
  public final void e()
  {
    String[] arrayOfString = new String[0];
    a("ended", arrayOfString);
    k();
  }
  
  public final void f()
  {
    int i1 = -1;
    boolean bool = p;
    if (bool)
    {
      localObject1 = n;
      if (localObject1 != null)
      {
        bool = l();
        if (!bool)
        {
          localObject1 = o;
          localObject2 = n;
          ((ImageView)localObject1).setImageBitmap((Bitmap)localObject2);
          o.invalidate();
          localObject1 = f;
          localObject2 = o;
          FrameLayout.LayoutParams localLayoutParams = new android/widget/FrameLayout$LayoutParams;
          localLayoutParams.<init>(i1, i1);
          ((FrameLayout)localObject1).addView((View)localObject2, localLayoutParams);
          localObject1 = f;
          localObject2 = o;
          ((FrameLayout)localObject1).bringChildToFront((View)localObject2);
        }
      }
    }
    a.a = true;
    long l1 = c;
    m = l1;
    Object localObject1 = tt.a;
    Object localObject2 = new com/google/android/gms/ads/internal/overlay/n$2;
    ((n.2)localObject2).<init>(this);
    ((Handler)localObject1).post((Runnable)localObject2);
  }
  
  public final void g()
  {
    boolean bool1 = i;
    if (bool1)
    {
      bool1 = l();
      if (bool1)
      {
        localObject1 = f;
        ImageView localImageView = o;
        ((FrameLayout)localObject1).removeView(localImageView);
      }
    }
    Object localObject1 = n;
    if (localObject1 != null)
    {
      localObject1 = w.k();
      long l1 = ((c)localObject1).b();
      Object localObject2 = b;
      Object localObject3 = n;
      localObject2 = ((l)localObject2).getBitmap((Bitmap)localObject3);
      if (localObject2 != null)
      {
        bool2 = true;
        p = bool2;
      }
      localObject2 = w.k();
      long l2 = ((c)localObject2).b();
      l1 = l2 - l1;
      boolean bool2 = tp.a();
      if (bool2)
      {
        int i1 = 46;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>(i1);
        localObject2 = ((StringBuilder)localObject3).append("Spinner frame grab took ").append(l1);
        localObject3 = "ms";
        localObject2 = (String)localObject3;
        tp.a((String)localObject2);
      }
      l2 = h;
      boolean bool3 = l1 < l2;
      if (bool3)
      {
        tp.e("Spinner frame grab crossed jank threshold! Suspending spinner.");
        l = false;
        bool3 = false;
        n = null;
        localObject2 = g;
        if (localObject2 != null)
        {
          localObject2 = g;
          localObject3 = "spinner_jank";
          localObject1 = Long.toString(l1);
          ((km)localObject2).a((String)localObject3, (String)localObject1);
        }
      }
    }
  }
  
  public final void h()
  {
    Object localObject1 = b;
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      localObject1 = d;
      boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
      Object localObject2;
      if (!bool)
      {
        localObject1 = b;
        localObject2 = d;
        ((l)localObject1).setVideoPath((String)localObject2);
      }
      else
      {
        localObject1 = "no_src";
        localObject2 = new String[0];
        a((String)localObject1, (String[])localObject2);
      }
    }
  }
  
  public final void i()
  {
    l locall = b;
    if (locall == null) {}
    for (;;)
    {
      return;
      locall = b;
      locall.e();
    }
  }
  
  public final void j()
  {
    int i1 = -2;
    Object localObject1 = b;
    if (localObject1 == null) {
      return;
    }
    localObject1 = b.getContext();
    TextView localTextView = new android/widget/TextView;
    localTextView.<init>((Context)localObject1);
    Object localObject2 = "AdMob - ";
    localObject1 = String.valueOf(b.b());
    int i2 = ((String)localObject1).length();
    if (i2 != 0) {
      localObject1 = ((String)localObject2).concat((String)localObject1);
    }
    for (;;)
    {
      localTextView.setText((CharSequence)localObject1);
      localTextView.setTextColor(-65536);
      int i3 = 65280;
      localTextView.setBackgroundColor(i3);
      localObject1 = f;
      localObject2 = new android/widget/FrameLayout$LayoutParams;
      i2 = 17;
      ((FrameLayout.LayoutParams)localObject2).<init>(i1, i1, i2);
      ((FrameLayout)localObject1).addView(localTextView, (ViewGroup.LayoutParams)localObject2);
      localObject1 = f;
      ((FrameLayout)localObject1).bringChildToFront(localTextView);
      break;
      localObject1 = new java/lang/String;
      ((String)localObject1).<init>((String)localObject2);
    }
  }
  
  public final void k()
  {
    Object localObject = e.f();
    if (localObject == null) {}
    for (;;)
    {
      return;
      boolean bool = j;
      if (bool)
      {
        bool = k;
        if (!bool)
        {
          localObject = e.f().getWindow();
          int i1 = 128;
          ((Window)localObject).clearFlags(i1);
          bool = false;
          localObject = null;
          j = false;
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */