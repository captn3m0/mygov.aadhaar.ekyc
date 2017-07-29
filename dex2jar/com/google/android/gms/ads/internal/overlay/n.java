package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.text.TextUtils;
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
import com.google.android.gms.b.qi;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.vc;
import com.google.android.gms.common.util.c;
import java.util.HashMap;

@qi
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
    f = new FrameLayout(paramContext);
    addView(f, new FrameLayout.LayoutParams(-1, -1));
    com.google.android.gms.common.internal.l.a(paramvc.h());
    b = hb.a(paramContext, paramvc, paramBoolean, paramkm);
    if (b != null)
    {
      f.addView(b, new FrameLayout.LayoutParams(-1, -1, 17));
      paramvc = ke.A;
      if (((Boolean)w.q().a(paramvc)).booleanValue()) {
        j();
      }
    }
    o = new ImageView(paramContext);
    paramContext = ke.E;
    h = ((Long)w.q().a(paramContext)).longValue();
    paramContext = ke.C;
    l = ((Boolean)w.q().a(paramContext)).booleanValue();
    if (g != null)
    {
      paramvc = g;
      if (!l) {
        break label254;
      }
    }
    label254:
    for (paramContext = "1";; paramContext = "0")
    {
      paramvc.a("spinner_used", paramContext);
      a = new b(this);
      if (b != null) {
        b.a(this);
      }
      if (b == null) {
        a("AdVideoUnderlay Error", "Allocating player failed.");
      }
      return;
    }
  }
  
  public static void a(vc paramvc)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", "no_video_view");
    paramvc.a("onVideoEvent", localHashMap);
  }
  
  private boolean l()
  {
    return o.getParent() != null;
  }
  
  public final void a()
  {
    b localb = a;
    a = false;
    localb.a();
    tt.a.post(new Runnable()
    {
      public final void run()
      {
        n.a(n.this, "surfaceCreated", new String[0]);
      }
    });
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if (l)
    {
      jz localjz = ke.D;
      paramInt1 = Math.max(paramInt1 / ((Integer)w.q().a(localjz)).intValue(), 1);
      localjz = ke.D;
      paramInt2 = Math.max(paramInt2 / ((Integer)w.q().a(localjz)).intValue(), 1);
      if ((n == null) || (n.getWidth() != paramInt1) || (n.getHeight() != paramInt2))
      {
        n = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
        p = false;
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt3 == 0) || (paramInt4 == 0)) {
      return;
    }
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(paramInt3, paramInt4);
    localLayoutParams.setMargins(paramInt1, paramInt2, 0, 0);
    f.setLayoutParams(localLayoutParams);
    requestLayout();
  }
  
  public final void a(String paramString1, String paramString2)
  {
    a("error", new String[] { "what", paramString1, "extra", paramString2 });
  }
  
  final void a(String paramString, String... paramVarArgs)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event", paramString);
    int i2 = paramVarArgs.length;
    int i1 = 0;
    paramString = null;
    if (i1 < i2)
    {
      String str = paramVarArgs[i1];
      if (paramString == null) {}
      for (paramString = str;; paramString = null)
      {
        i1 += 1;
        break;
        localHashMap.put(paramString, str);
      }
    }
    e.a("onVideoEvent", localHashMap);
  }
  
  public final void b()
  {
    if (b == null) {}
    while (m != 0L) {
      return;
    }
    a("canplaythrough", new String[] { "duration", String.valueOf(b.getDuration() / 1000.0F), "videoWidth", String.valueOf(b.getVideoWidth()), "videoHeight", String.valueOf(b.getVideoHeight()) });
  }
  
  public final void c()
  {
    if ((e.f() != null) && (!j)) {
      if ((e.f().getWindow().getAttributes().flags & 0x80) == 0) {
        break label87;
      }
    }
    label87:
    for (boolean bool = true;; bool = false)
    {
      k = bool;
      if (!k)
      {
        e.f().getWindow().addFlags(128);
        j = true;
      }
      i = true;
      return;
    }
  }
  
  public final void d()
  {
    a("pause", new String[0]);
    k();
    i = false;
  }
  
  public final void e()
  {
    a("ended", new String[0]);
    k();
  }
  
  public final void f()
  {
    if ((p) && (n != null) && (!l()))
    {
      o.setImageBitmap(n);
      o.invalidate();
      f.addView(o, new FrameLayout.LayoutParams(-1, -1));
      f.bringChildToFront(o);
    }
    a.a = true;
    m = c;
    tt.a.post(new Runnable()
    {
      public final void run()
      {
        n.a(n.this, "surfaceDestroyed", new String[0]);
      }
    });
  }
  
  public final void g()
  {
    if ((i) && (l())) {
      f.removeView(o);
    }
    if (n != null)
    {
      long l1 = w.k().b();
      if (b.getBitmap(n) != null) {
        p = true;
      }
      l1 = w.k().b() - l1;
      if (tp.a()) {
        tp.a(46 + "Spinner frame grab took " + l1 + "ms");
      }
      if (l1 > h)
      {
        tp.e("Spinner frame grab crossed jank threshold! Suspending spinner.");
        l = false;
        n = null;
        if (g != null) {
          g.a("spinner_jank", Long.toString(l1));
        }
      }
    }
  }
  
  public final void h()
  {
    if (b == null) {
      return;
    }
    if (!TextUtils.isEmpty(d))
    {
      b.setVideoPath(d);
      return;
    }
    a("no_src", new String[0]);
  }
  
  public final void i()
  {
    if (b == null) {
      return;
    }
    b.e();
  }
  
  @TargetApi(14)
  public final void j()
  {
    if (b == null) {
      return;
    }
    TextView localTextView = new TextView(b.getContext());
    String str = String.valueOf(b.b());
    if (str.length() != 0) {}
    for (str = "AdMob - ".concat(str);; str = new String("AdMob - "))
    {
      localTextView.setText(str);
      localTextView.setTextColor(-65536);
      localTextView.setBackgroundColor(65280);
      f.addView(localTextView, new FrameLayout.LayoutParams(-2, -2, 17));
      f.bringChildToFront(localTextView);
      return;
    }
  }
  
  public final void k()
  {
    if (e.f() == null) {}
    while ((!j) || (k)) {
      return;
    }
    e.f().getWindow().clearFlags(128);
    j = false;
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */