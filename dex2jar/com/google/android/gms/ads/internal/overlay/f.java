package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.MeasureSpec;
import com.google.android.gms.ads.internal.w;
import com.google.android.gms.b.hw;
import com.google.android.gms.b.jz;
import com.google.android.gms.b.kd;
import com.google.android.gms.b.ke;
import com.google.android.gms.b.ki;
import com.google.android.gms.b.km;
import com.google.android.gms.b.qi;
import com.google.android.gms.b.tp;
import com.google.android.gms.b.tt;
import com.google.android.gms.b.tz;
import com.google.android.gms.b.tz.a;
import com.google.android.gms.b.un;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@qi
@TargetApi(14)
public final class f
  extends l
  implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener
{
  private static final Map<Integer, String> c = new HashMap();
  private final ab d;
  private final boolean e;
  private int f = 0;
  private int g = 0;
  private MediaPlayer h;
  private Uri i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private aa o;
  private boolean p;
  private int q;
  private k r;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      c.put(Integer.valueOf(64532), "MEDIA_ERROR_IO");
      c.put(Integer.valueOf(64529), "MEDIA_ERROR_MALFORMED");
      c.put(Integer.valueOf(64526), "MEDIA_ERROR_UNSUPPORTED");
      c.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
      c.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
    }
    c.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
    c.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
    c.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
    c.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
    c.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
    c.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
    c.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
    c.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
    c.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
    if (Build.VERSION.SDK_INT >= 19)
    {
      c.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
      c.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }
  }
  
  public f(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, ab paramab)
  {
    super(paramContext);
    setSurfaceTextureListener(this);
    d = paramab;
    p = paramBoolean1;
    e = paramBoolean2;
    paramContext = d;
    ki.a(e, d, new String[] { "vpc2" });
    i = true;
    if (e != null) {
      e.a("vpn", b());
    }
    n = this;
  }
  
  private void a(boolean paramBoolean)
  {
    tp.a("AdMediaPlayerView release");
    if (o != null)
    {
      o.b();
      o = null;
    }
    if (h != null)
    {
      h.reset();
      h.release();
      h = null;
      b(0);
      if (paramBoolean)
      {
        g = 0;
        g = 0;
      }
    }
  }
  
  private void b(float paramFloat)
  {
    if (h != null) {}
    try
    {
      h.setVolume(paramFloat, paramFloat);
      return;
    }
    catch (IllegalStateException localIllegalStateException) {}
    tp.e("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
    return;
  }
  
  private void b(int paramInt)
  {
    Object localObject;
    if (paramInt == 3)
    {
      localObject = d;
      m = true;
      if ((j) && (!k))
      {
        ki.a(e, d, new String[] { "vfp2" });
        k = true;
      }
      localObject = b;
      b = true;
      ((c)localObject).a();
    }
    for (;;)
    {
      f = paramInt;
      return;
      if (f == 3)
      {
        d.m = false;
        localObject = b;
        b = false;
        ((c)localObject).a();
      }
    }
  }
  
  private void h()
  {
    tp.a("AdMediaPlayerView init MediaPlayer");
    Object localObject1 = getSurfaceTexture();
    if ((i == null) || (localObject1 == null)) {
      return;
    }
    a(false);
    try
    {
      w.v();
      h = new MediaPlayer();
      h.setOnBufferingUpdateListener(this);
      h.setOnCompletionListener(this);
      h.setOnErrorListener(this);
      h.setOnInfoListener(this);
      h.setOnPreparedListener(this);
      h.setOnVideoSizeChangedListener(this);
      l = 0;
      if (!p) {
        break label310;
      }
      o = new aa(getContext());
      localObject2 = o;
      int i1 = getWidth();
      int i2 = getHeight();
      d = i1;
      c = i2;
      e = ((SurfaceTexture)localObject1);
      o.start();
      localObject2 = o.c();
      if (localObject2 == null) {
        break label298;
      }
      localObject1 = localObject2;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject2 = String.valueOf(i);
        tp.c(String.valueOf(localObject2).length() + 36 + "Failed to initialize MediaPlayer at " + (String)localObject2, localIOException);
        onError(h, 1, 0);
        return;
        o.b();
        o = null;
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;) {}
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
    h.setDataSource(getContext(), i);
    w.w();
    localObject1 = new Surface((SurfaceTexture)localObject1);
    h.setSurface((Surface)localObject1);
    h.setAudioStreamType(3);
    h.setScreenOnWhilePlaying(true);
    h.prepareAsync();
    b(1);
  }
  
  private void i()
  {
    if (!e) {}
    while ((!j()) || (h.getCurrentPosition() <= 0) || (g == 3)) {
      return;
    }
    tp.a("AdMediaPlayerView nudging MediaPlayer");
    b(0.0F);
    h.start();
    int i1 = h.getCurrentPosition();
    long l1 = w.k().a();
    while ((j()) && (h.getCurrentPosition() == i1) && (w.k().a() - l1 <= 250L)) {}
    h.pause();
    a();
  }
  
  private boolean j()
  {
    return (h != null) && (f != -1) && (f != 0) && (f != 1);
  }
  
  public final void a()
  {
    c localc = b;
    float f1;
    if (c)
    {
      f1 = 0.0F;
      if (!a) {
        break label35;
      }
    }
    for (;;)
    {
      b(f1);
      return;
      f1 = d;
      break;
      label35:
      f1 = 0.0F;
    }
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    aa localaa;
    float f1;
    if (o != null)
    {
      localaa = o;
      if (d <= c) {
        break label121;
      }
      paramFloat1 = 1.7453293F * paramFloat1 / d;
      f1 = 1.7453293F * paramFloat2 / d;
      paramFloat2 = paramFloat1;
      paramFloat1 = f1;
    }
    for (;;)
    {
      a -= paramFloat2;
      b -= paramFloat1;
      if (b < -1.5707964F) {
        b = -1.5707964F;
      }
      if (b > 1.5707964F) {
        b = 1.5707964F;
      }
      return;
      label121:
      f1 = 1.7453293F * paramFloat1 / c;
      paramFloat1 = 1.7453293F * paramFloat2 / c;
      paramFloat2 = f1;
    }
  }
  
  public final void a(int paramInt)
  {
    tp.a(34 + "AdMediaPlayerView seek " + paramInt);
    if (j())
    {
      h.seekTo(paramInt);
      q = 0;
      return;
    }
    q = paramInt;
  }
  
  public final void a(k paramk)
  {
    r = paramk;
  }
  
  public final String b()
  {
    if (p) {}
    for (String str = " spherical";; str = "")
    {
      str = String.valueOf(str);
      if (str.length() == 0) {
        break;
      }
      return "MediaPlayer".concat(str);
    }
    return new String("MediaPlayer");
  }
  
  public final void c()
  {
    tp.a("AdMediaPlayerView stop");
    if (h != null)
    {
      h.stop();
      h.release();
      h = null;
      b(0);
      g = 0;
    }
    ab localab = d;
    Object localObject1 = ke.x;
    if ((((Boolean)w.q().a((jz)localObject1)).booleanValue()) && (!o))
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("type", "native-player-metrics");
      localBundle.putString("request", b);
      localBundle.putString("player", n.b());
      Object localObject2 = f.a().iterator();
      Object localObject3;
      if (((Iterator)localObject2).hasNext())
      {
        localObject3 = (tz.a)((Iterator)localObject2).next();
        localObject1 = String.valueOf("fps_c_");
        String str = String.valueOf(a);
        if (str.length() != 0)
        {
          localObject1 = ((String)localObject1).concat(str);
          label189:
          localBundle.putString((String)localObject1, Integer.toString(e));
          localObject1 = String.valueOf("fps_p_");
          str = String.valueOf(a);
          if (str.length() == 0) {
            break label264;
          }
        }
        label264:
        for (localObject1 = ((String)localObject1).concat(str);; localObject1 = new String((String)localObject1))
        {
          localBundle.putString((String)localObject1, Double.toString(d));
          break;
          localObject1 = new String((String)localObject1);
          break label189;
        }
      }
      int i1 = 0;
      while (i1 < g.length)
      {
        localObject1 = h[i1];
        if (localObject1 != null)
        {
          localObject2 = String.valueOf("fh_");
          localObject3 = String.valueOf(Long.valueOf(g[i1]));
          localBundle.putString(String.valueOf(localObject2).length() + String.valueOf(localObject3).length() + (String)localObject2 + (String)localObject3, (String)localObject1);
        }
        i1 += 1;
      }
      w.e();
      tt.a(a, c.a, "gmob-apps", localBundle, true);
      o = true;
    }
  }
  
  public final void d()
  {
    tp.a("AdMediaPlayerView play");
    if (j())
    {
      h.start();
      b(3);
      a.c = true;
      tt.a.post(new Runnable()
      {
        public final void run()
        {
          if (f.a(f.this) != null) {
            f.a(f.this).c();
          }
        }
      });
    }
    g = 3;
  }
  
  public final void e()
  {
    tp.a("AdMediaPlayerView pause");
    if ((j()) && (h.isPlaying()))
    {
      h.pause();
      b(4);
      tt.a.post(new Runnable()
      {
        public final void run()
        {
          if (f.a(f.this) != null) {
            f.a(f.this).d();
          }
        }
      });
    }
    g = 4;
  }
  
  public final int getCurrentPosition()
  {
    if (j()) {
      return h.getCurrentPosition();
    }
    return 0;
  }
  
  public final int getDuration()
  {
    if (j()) {
      return h.getDuration();
    }
    return -1;
  }
  
  public final int getVideoHeight()
  {
    if (h != null) {
      return h.getVideoHeight();
    }
    return 0;
  }
  
  public final int getVideoWidth()
  {
    if (h != null) {
      return h.getVideoWidth();
    }
    return 0;
  }
  
  public final void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    l = paramInt;
  }
  
  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    tp.a("AdMediaPlayerView completion");
    b(5);
    g = 5;
    tt.a.post(new Runnable()
    {
      public final void run()
      {
        if (f.a(f.this) != null) {
          f.a(f.this).e();
        }
      }
    });
  }
  
  public final boolean onError(final MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    paramMediaPlayer = (String)c.get(Integer.valueOf(paramInt1));
    final String str = (String)c.get(Integer.valueOf(paramInt2));
    tp.e(String.valueOf(paramMediaPlayer).length() + 38 + String.valueOf(str).length() + "AdMediaPlayerView MediaPlayer error: " + paramMediaPlayer + ":" + str);
    b(-1);
    g = -1;
    tt.a.post(new Runnable()
    {
      public final void run()
      {
        if (f.a(f.this) != null) {
          f.a(f.this).a(paramMediaPlayer, str);
        }
      }
    });
    return true;
  }
  
  public final boolean onInfo(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    paramMediaPlayer = (String)c.get(Integer.valueOf(paramInt1));
    String str = (String)c.get(Integer.valueOf(paramInt2));
    tp.a(String.valueOf(paramMediaPlayer).length() + 37 + String.valueOf(str).length() + "AdMediaPlayerView MediaPlayer info: " + paramMediaPlayer + ":" + str);
    return true;
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i3 = getDefaultSize(j, paramInt1);
    int i4 = getDefaultSize(k, paramInt2);
    int i2 = i4;
    int i1 = i3;
    int i5;
    if (j > 0)
    {
      i2 = i4;
      i1 = i3;
      if (k > 0)
      {
        i2 = i4;
        i1 = i3;
        if (o == null)
        {
          i4 = View.MeasureSpec.getMode(paramInt1);
          paramInt1 = View.MeasureSpec.getSize(paramInt1);
          i5 = View.MeasureSpec.getMode(paramInt2);
          paramInt2 = View.MeasureSpec.getSize(paramInt2);
          if ((i4 != 1073741824) || (i5 != 1073741824)) {
            break label242;
          }
          if (j * paramInt2 >= k * paramInt1) {
            break label209;
          }
          i1 = j * paramInt2 / k;
          i2 = paramInt2;
        }
      }
    }
    for (;;)
    {
      setMeasuredDimension(i1, i2);
      if (o != null) {
        o.a(i1, i2);
      }
      if (Build.VERSION.SDK_INT == 16)
      {
        if (((m > 0) && (m != i1)) || ((n > 0) && (n != i2))) {
          i();
        }
        m = i1;
        n = i2;
      }
      return;
      label209:
      if (j * paramInt2 > k * paramInt1)
      {
        i2 = k * paramInt1 / j;
        i1 = paramInt1;
        continue;
        label242:
        if (i4 == 1073741824)
        {
          i2 = k * paramInt1 / j;
          if ((i5 == Integer.MIN_VALUE) && (i2 > paramInt2))
          {
            i2 = paramInt2;
            i1 = paramInt1;
          }
        }
        else
        {
          if (i5 == 1073741824)
          {
            i3 = j * paramInt2 / k;
            i2 = paramInt2;
            i1 = i3;
            if (i4 != Integer.MIN_VALUE) {
              continue;
            }
            i2 = paramInt2;
            i1 = i3;
            if (i3 <= paramInt1) {
              continue;
            }
            i2 = paramInt2;
            i1 = paramInt1;
            continue;
          }
          i3 = j;
          i1 = k;
          if ((i5 == Integer.MIN_VALUE) && (i1 > paramInt2)) {
            i3 = j * paramInt2 / k;
          }
          for (;;)
          {
            i2 = paramInt2;
            i1 = i3;
            if (i4 != Integer.MIN_VALUE) {
              break;
            }
            i2 = paramInt2;
            i1 = i3;
            if (i3 <= paramInt1) {
              break;
            }
            i2 = k * paramInt1 / j;
            i1 = paramInt1;
            break;
            paramInt2 = i1;
          }
        }
        i1 = paramInt1;
      }
      else
      {
        i2 = paramInt2;
        i1 = paramInt1;
      }
    }
  }
  
  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    tp.a("AdMediaPlayerView prepared");
    b(2);
    ab localab = d;
    if ((!i) || (j)) {}
    for (;;)
    {
      tt.a.post(new Runnable()
      {
        public final void run()
        {
          if (f.a(f.this) != null) {
            f.a(f.this).b();
          }
        }
      });
      j = paramMediaPlayer.getVideoWidth();
      k = paramMediaPlayer.getVideoHeight();
      if (q != 0) {
        a(q);
      }
      i();
      int i1 = j;
      int i2 = k;
      tp.d(62 + "AdMediaPlayerView stream dimensions: " + i1 + " x " + i2);
      if (g == 3) {
        d();
      }
      a();
      return;
      ki.a(e, d, new String[] { "vfr2" });
      j = true;
    }
  }
  
  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    tp.a("AdMediaPlayerView surface created");
    h();
    tt.a.post(new Runnable()
    {
      public final void run()
      {
        if (f.a(f.this) != null) {
          f.a(f.this).a();
        }
      }
    });
  }
  
  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    tp.a("AdMediaPlayerView surface destroyed");
    if ((h != null) && (q == 0)) {
      q = h.getCurrentPosition();
    }
    if (o != null) {
      o.b();
    }
    tt.a.post(new Runnable()
    {
      public final void run()
      {
        if (f.a(f.this) != null)
        {
          f.a(f.this).d();
          f.a(f.this).f();
        }
      }
    });
    a(true);
    return true;
  }
  
  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, final int paramInt1, final int paramInt2)
  {
    int i2 = 1;
    tp.a("AdMediaPlayerView surface changed");
    int i1;
    if (g == 3)
    {
      i1 = 1;
      if ((j != paramInt1) || (k != paramInt2)) {
        break label112;
      }
    }
    for (;;)
    {
      if ((h != null) && (i1 != 0) && (i2 != 0))
      {
        if (q != 0) {
          a(q);
        }
        d();
      }
      if (o != null) {
        o.a(paramInt1, paramInt2);
      }
      tt.a.post(new Runnable()
      {
        public final void run()
        {
          if (f.a(f.this) != null) {
            f.a(f.this).a(paramInt1, paramInt2);
          }
        }
      });
      return;
      i1 = 0;
      break;
      label112:
      i2 = 0;
    }
  }
  
  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    Object localObject1 = d;
    if ((k) && (!l))
    {
      ki.a(e, d, new String[] { "vff2" });
      l = true;
    }
    long l1 = w.k().c();
    if ((m) && (p) && (q != -1L))
    {
      double d1 = TimeUnit.SECONDS.toNanos(1L) / (l1 - q);
      localObject2 = f;
      d += 1;
      i1 = 0;
      while (i1 < b.length)
      {
        if ((b[i1] <= d1) && (d1 < a[i1]))
        {
          int[] arrayOfInt = c;
          arrayOfInt[i1] += 1;
        }
        if (d1 < b[i1]) {
          break;
        }
        i1 += 1;
      }
    }
    p = m;
    q = l1;
    Object localObject2 = ke.z;
    l1 = ((Long)w.q().a((jz)localObject2)).longValue();
    long l2 = getCurrentPosition();
    int i1 = 0;
    for (;;)
    {
      if (i1 < h.length)
      {
        if ((h[i1] == null) && (l1 > Math.abs(l2 - g[i1])))
        {
          localObject1 = h;
          localObject2 = getBitmap(8, 8);
          l2 = 0L;
          l1 = 63L;
          int i2 = 0;
          while (i2 < 8)
          {
            int i3 = 0;
            long l3 = l1;
            l1 = l2;
            l2 = l3;
            if (i3 < 8)
            {
              int i4 = ((Bitmap)localObject2).getPixel(i3, i2);
              int i5 = Color.blue(i4);
              int i6 = Color.red(i4);
              if (Color.green(i4) + (i5 + i6) > 128) {}
              for (l3 = 1L;; l3 = 0L)
              {
                l1 |= l3 << (int)l2;
                l2 -= 1L;
                i3 += 1;
                break;
              }
            }
            i2 += 1;
            l3 = l1;
            l1 = l2;
            l2 = l3;
          }
          localObject1[i1] = String.format("%016X", new Object[] { Long.valueOf(l2) });
        }
      }
      else
      {
        localObject1 = a;
        localObject2 = r;
        if (localObject2 != null)
        {
          l1 = paramSurfaceTexture.getTimestamp();
          if ((c) || (Math.abs(l1 - b) >= a))
          {
            c = false;
            b = l1;
            tt.a.post(new y.1((k)localObject2));
          }
        }
        return;
      }
      i1 += 1;
    }
  }
  
  public final void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    tp.a(57 + "AdMediaPlayerView size changed: " + paramInt1 + " x " + paramInt2);
    j = paramMediaPlayer.getVideoWidth();
    k = paramMediaPlayer.getVideoHeight();
    if ((j != 0) && (k != 0)) {
      requestLayout();
    }
  }
  
  public final void setVideoPath(String paramString)
  {
    setVideoURI(Uri.parse(paramString));
  }
  
  public final void setVideoURI(Uri paramUri)
  {
    hw localhw = hw.a(paramUri);
    if (localhw == null) {}
    for (;;)
    {
      i = paramUri;
      q = 0;
      h();
      requestLayout();
      invalidate();
      return;
      paramUri = Uri.parse(a);
    }
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(getClass().getName());
    String str2 = String.valueOf(Integer.toHexString(hashCode()));
    return String.valueOf(str1).length() + 1 + String.valueOf(str2).length() + str1 + "@" + str2;
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */