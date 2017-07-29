package com.google.android.gms.ads.internal.overlay;

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
import com.google.android.gms.b.kk;
import com.google.android.gms.b.km;
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

public final class f
  extends l
  implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener
{
  private static final Map c;
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
    int i1 = 1;
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    c = (Map)localObject;
    int i2 = Build.VERSION.SDK_INT;
    int i3 = 17;
    if (i2 >= i3)
    {
      localObject = c;
      localInteger = Integer.valueOf(64532);
      ((Map)localObject).put(localInteger, "MEDIA_ERROR_IO");
      localObject = c;
      localInteger = Integer.valueOf(64529);
      ((Map)localObject).put(localInteger, "MEDIA_ERROR_MALFORMED");
      localObject = c;
      localInteger = Integer.valueOf(64526);
      ((Map)localObject).put(localInteger, "MEDIA_ERROR_UNSUPPORTED");
      localObject = c;
      localInteger = Integer.valueOf(-110);
      ((Map)localObject).put(localInteger, "MEDIA_ERROR_TIMED_OUT");
      localObject = c;
      i3 = 3;
      localInteger = Integer.valueOf(i3);
      str = "MEDIA_INFO_VIDEO_RENDERING_START";
      ((Map)localObject).put(localInteger, str);
    }
    localObject = c;
    Integer localInteger = Integer.valueOf(100);
    ((Map)localObject).put(localInteger, "MEDIA_ERROR_SERVER_DIED");
    localObject = c;
    localInteger = Integer.valueOf(i1);
    ((Map)localObject).put(localInteger, "MEDIA_ERROR_UNKNOWN");
    localObject = c;
    localInteger = Integer.valueOf(i1);
    ((Map)localObject).put(localInteger, "MEDIA_INFO_UNKNOWN");
    localObject = c;
    localInteger = Integer.valueOf(700);
    ((Map)localObject).put(localInteger, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
    localObject = c;
    localInteger = Integer.valueOf(701);
    ((Map)localObject).put(localInteger, "MEDIA_INFO_BUFFERING_START");
    localObject = c;
    localInteger = Integer.valueOf(702);
    ((Map)localObject).put(localInteger, "MEDIA_INFO_BUFFERING_END");
    localObject = c;
    localInteger = Integer.valueOf(800);
    ((Map)localObject).put(localInteger, "MEDIA_INFO_BAD_INTERLEAVING");
    localObject = c;
    localInteger = Integer.valueOf(801);
    ((Map)localObject).put(localInteger, "MEDIA_INFO_NOT_SEEKABLE");
    localObject = c;
    localInteger = Integer.valueOf(802);
    String str = "MEDIA_INFO_METADATA_UPDATE";
    ((Map)localObject).put(localInteger, str);
    i2 = Build.VERSION.SDK_INT;
    i3 = 19;
    if (i2 >= i3)
    {
      localObject = c;
      localInteger = Integer.valueOf(901);
      ((Map)localObject).put(localInteger, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
      localObject = c;
      i3 = 902;
      localInteger = Integer.valueOf(i3);
      str = "MEDIA_INFO_SUBTITLE_TIMED_OUT";
      ((Map)localObject).put(localInteger, str);
    }
  }
  
  public f(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, ab paramab)
  {
    super(paramContext);
    setSurfaceTextureListener(this);
    d = paramab;
    p = paramBoolean1;
    e = paramBoolean2;
    ab localab = d;
    km localkm = e;
    Object localObject1 = d;
    Object localObject2 = new String[bool];
    String str = "vpc2";
    localObject2[0] = str;
    ki.a(localkm, (kk)localObject1, (String[])localObject2);
    i = bool;
    localkm = e;
    if (localkm != null)
    {
      localkm = e;
      localObject1 = "vpn";
      localObject2 = b();
      localkm.a((String)localObject1, (String)localObject2);
    }
    n = this;
  }
  
  private void a(boolean paramBoolean)
  {
    tp.a("AdMediaPlayerView release");
    Object localObject = o;
    if (localObject != null)
    {
      localObject = o;
      ((aa)localObject).b();
      o = null;
    }
    localObject = h;
    if (localObject != null)
    {
      h.reset();
      localObject = h;
      ((MediaPlayer)localObject).release();
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
    Object localObject = h;
    if (localObject != null) {}
    for (;;)
    {
      try
      {
        localObject = h;
        ((MediaPlayer)localObject).setVolume(paramFloat, paramFloat);
        return;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        continue;
      }
      localObject = "AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().";
      tp.e((String)localObject);
    }
  }
  
  private void b(int paramInt)
  {
    int i1 = 3;
    boolean bool = true;
    Object localObject;
    int i2;
    if (paramInt == i1)
    {
      localObject = d;
      m = bool;
      i2 = j;
      if (i2 != 0)
      {
        i2 = k;
        if (i2 == 0)
        {
          km localkm = e;
          kk localkk = d;
          String[] arrayOfString = new String[bool];
          String str = "vfp2";
          arrayOfString[0] = str;
          ki.a(localkm, localkk, arrayOfString);
          k = bool;
        }
      }
      localObject = b;
      b = bool;
      ((c)localObject).a();
    }
    for (;;)
    {
      f = paramInt;
      return;
      int i3 = f;
      if (i3 == i2)
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
    int i1 = 1;
    tp.a("AdMediaPlayerView init MediaPlayer");
    Object localObject1 = getSurfaceTexture();
    Object localObject2 = i;
    if ((localObject2 == null) || (localObject1 == null)) {}
    for (;;)
    {
      return;
      a(false);
      try
      {
        w.v();
        localObject2 = new android/media/MediaPlayer;
        ((MediaPlayer)localObject2).<init>();
        h = ((MediaPlayer)localObject2);
        localObject2 = h;
        ((MediaPlayer)localObject2).setOnBufferingUpdateListener(this);
        localObject2 = h;
        ((MediaPlayer)localObject2).setOnCompletionListener(this);
        localObject2 = h;
        ((MediaPlayer)localObject2).setOnErrorListener(this);
        localObject2 = h;
        ((MediaPlayer)localObject2).setOnInfoListener(this);
        localObject2 = h;
        ((MediaPlayer)localObject2).setOnPreparedListener(this);
        localObject2 = h;
        ((MediaPlayer)localObject2).setOnVideoSizeChangedListener(this);
        int i2 = 0;
        localObject2 = null;
        l = 0;
        i2 = p;
        if (i2 != 0)
        {
          localObject2 = new com/google/android/gms/ads/internal/overlay/aa;
          localObject4 = getContext();
          ((aa)localObject2).<init>((Context)localObject4);
          o = ((aa)localObject2);
          localObject2 = o;
          i4 = getWidth();
          int i5 = getHeight();
          d = i4;
          c = i5;
          e = ((SurfaceTexture)localObject1);
          localObject2 = o;
          ((aa)localObject2).start();
          localObject2 = o;
          localObject2 = ((aa)localObject2).c();
          if (localObject2 != null)
          {
            localObject1 = h;
            localObject4 = getContext();
            localObject5 = i;
            ((MediaPlayer)localObject1).setDataSource((Context)localObject4, (Uri)localObject5);
            w.w();
            localObject1 = new android/view/Surface;
            ((Surface)localObject1).<init>((SurfaceTexture)localObject2);
            localObject2 = h;
            ((MediaPlayer)localObject2).setSurface((Surface)localObject1);
            localObject2 = h;
            int i6 = 3;
            ((MediaPlayer)localObject2).setAudioStreamType(i6);
            localObject2 = h;
            i6 = 1;
            ((MediaPlayer)localObject2).setScreenOnWhilePlaying(i6);
            localObject2 = h;
            ((MediaPlayer)localObject2).prepareAsync();
            i2 = 1;
            b(i2);
          }
        }
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          localObject1 = String.valueOf(i);
          int i4 = String.valueOf(localObject1).length() + 36;
          Object localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>(i4);
          Object localObject4 = ((StringBuilder)localObject5).append("Failed to initialize MediaPlayer at ");
          localObject1 = (String)localObject1;
          tp.c((String)localObject1, localIOException);
          Object localObject3 = h;
          onError((MediaPlayer)localObject3, i1, 0);
          break;
          localObject3 = o;
          ((aa)localObject3).b();
          int i3 = 0;
          localObject3 = null;
          o = null;
          localObject3 = localObject1;
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
    }
  }
  
  private void i()
  {
    boolean bool1 = e;
    if (!bool1) {}
    for (;;)
    {
      return;
      bool1 = j();
      if (bool1)
      {
        MediaPlayer localMediaPlayer = h;
        int i1 = localMediaPlayer.getCurrentPosition();
        if (i1 > 0)
        {
          i1 = g;
          int i2 = 3;
          if (i1 != i2)
          {
            tp.a("AdMediaPlayerView nudging MediaPlayer");
            b(0.0F);
            h.start();
            localMediaPlayer = h;
            i1 = localMediaPlayer.getCurrentPosition();
            Object localObject = w.k();
            long l1 = ((com.google.android.gms.common.util.c)localObject).a();
            boolean bool3;
            do
            {
              boolean bool2 = j();
              if (!bool2) {
                break;
              }
              localObject = h;
              int i3 = ((MediaPlayer)localObject).getCurrentPosition();
              if (i3 != i1) {
                break;
              }
              localObject = w.k();
              long l2 = ((com.google.android.gms.common.util.c)localObject).a() - l1;
              long l3 = 250L;
              bool3 = l2 < l3;
            } while (!bool3);
            localMediaPlayer = h;
            localMediaPlayer.pause();
            a();
          }
        }
      }
    }
  }
  
  private boolean j()
  {
    int i1 = 1;
    MediaPlayer localMediaPlayer = h;
    if (localMediaPlayer != null)
    {
      int i2 = f;
      int i3 = -1;
      if (i2 != i3)
      {
        i2 = f;
        if (i2 != 0)
        {
          i2 = f;
          if (i2 == i1) {}
        }
      }
    }
    for (;;)
    {
      return i1;
      i1 = 0;
    }
  }
  
  public final void a()
  {
    c localc = b;
    boolean bool1 = c;
    float f1;
    if (bool1)
    {
      bool1 = false;
      f1 = 0.0F;
      boolean bool2 = a;
      if (!bool2) {
        break label43;
      }
    }
    for (;;)
    {
      b(f1);
      return;
      f1 = d;
      break;
      label43:
      bool1 = false;
      f1 = 0.0F;
    }
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    float f1 = 1.5707964F;
    float f2 = -1.5707964F;
    int i1 = 1071605491;
    float f3 = 1.7453293F;
    aa localaa1 = o;
    aa localaa2;
    int i3;
    float f4;
    float f5;
    if (localaa1 != null)
    {
      localaa2 = o;
      int i2 = d;
      i3 = c;
      if (i2 <= i3) {
        break label200;
      }
      f4 = f3 * paramFloat1;
      i3 = d;
      f5 = i3;
      f5 = f4 / f5;
      f4 = f3 * paramFloat2;
      i1 = d;
      f3 = i1;
    }
    for (f4 /= f3;; f4 /= f3)
    {
      f3 = a;
      f5 = f3 - f5;
      a = f5;
      f5 = b;
      f4 = f5 - f4;
      b = f4;
      f4 = b;
      boolean bool = f4 < f2;
      if (bool) {
        b = f2;
      }
      f4 = b;
      bool = f4 < f1;
      if (bool) {
        b = f1;
      }
      return;
      label200:
      f4 = f3 * paramFloat1;
      i3 = c;
      f5 = i3;
      f5 = f4 / f5;
      f4 = f3 * paramFloat2;
      i1 = c;
      f3 = i1;
    }
  }
  
  public final void a(int paramInt)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(34);
    String str = "AdMediaPlayerView seek " + paramInt;
    tp.a(str);
    boolean bool = j();
    if (bool)
    {
      h.seekTo(paramInt);
      bool = false;
      str = null;
    }
    for (q = 0;; q = paramInt) {
      return;
    }
  }
  
  public final void a(k paramk)
  {
    r = paramk;
  }
  
  public final String b()
  {
    String str1 = "MediaPlayer";
    boolean bool = p;
    String str2;
    if (bool)
    {
      str2 = " spherical";
      str2 = String.valueOf(str2);
      int i1 = str2.length();
      if (i1 == 0) {
        break label48;
      }
      str2 = str1.concat(str2);
    }
    for (;;)
    {
      return str2;
      str2 = "";
      break;
      label48:
      str2 = new java/lang/String;
      str2.<init>(str1);
    }
  }
  
  public final void c()
  {
    boolean bool = true;
    String str1 = null;
    tp.a("AdMediaPlayerView stop");
    Object localObject1 = h;
    if (localObject1 != null)
    {
      h.stop();
      h.release();
      i1 = 0;
      localObject1 = null;
      h = null;
      b(0);
      g = 0;
    }
    ab localab = d;
    localObject1 = ke.x;
    Object localObject2 = w.q();
    localObject1 = (Boolean)((kd)localObject2).a((jz)localObject1);
    int i1 = ((Boolean)localObject1).booleanValue();
    if (i1 != 0)
    {
      i1 = o;
      if (i1 == 0)
      {
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        localBundle.putString("type", "native-player-metrics");
        localObject2 = b;
        localBundle.putString("request", (String)localObject2);
        localObject2 = n.b();
        localBundle.putString("player", (String)localObject2);
        localObject1 = f.a();
        Object localObject3 = ((List)localObject1).iterator();
        i1 = ((Iterator)localObject3).hasNext();
        String str2;
        int i3;
        label239:
        int i4;
        if (i1 != 0)
        {
          localObject1 = (tz.a)((Iterator)localObject3).next();
          str2 = String.valueOf("fps_c_");
          localObject2 = String.valueOf(a);
          i3 = ((String)localObject2).length();
          if (i3 != 0)
          {
            localObject2 = str2.concat((String)localObject2);
            i4 = e;
            str2 = Integer.toString(i4);
            localBundle.putString((String)localObject2, str2);
            str2 = String.valueOf("fps_p_");
            localObject2 = String.valueOf(a);
            i3 = ((String)localObject2).length();
            if (i3 == 0) {
              break label337;
            }
            localObject2 = str2.concat((String)localObject2);
          }
          for (;;)
          {
            double d1 = d;
            localObject1 = Double.toString(d1);
            localBundle.putString((String)localObject2, (String)localObject1);
            break;
            localObject2 = new java/lang/String;
            ((String)localObject2).<init>(str2);
            break label239;
            label337:
            localObject2 = new java/lang/String;
            ((String)localObject2).<init>(str2);
          }
        }
        i1 = 0;
        localObject1 = null;
        for (;;)
        {
          localObject2 = g;
          int i5 = localObject2.length;
          if (i1 >= i5) {
            break;
          }
          localObject2 = h[i1];
          if (localObject2 != null)
          {
            str1 = String.valueOf("fh_");
            long l1 = g[i1];
            localObject3 = String.valueOf(Long.valueOf(l1));
            str2 = String.valueOf(str1);
            i4 = str2.length();
            i3 = String.valueOf(localObject3).length();
            i4 += i3;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>(i4);
            str1 = str1 + (String)localObject3;
            localBundle.putString(str1, (String)localObject2);
          }
          int i2;
          i1 += 1;
        }
        w.e();
        localObject1 = a;
        localObject2 = c.a;
        str1 = "gmob-apps";
        tt.a((Context)localObject1, (String)localObject2, str1, localBundle, bool);
        o = bool;
      }
    }
  }
  
  public final void d()
  {
    int i1 = 3;
    Object localObject = "AdMediaPlayerView play";
    tp.a((String)localObject);
    boolean bool1 = j();
    if (bool1)
    {
      h.start();
      b(i1);
      localObject = a;
      boolean bool2 = true;
      c = bool2;
      localObject = tt.a;
      f.7 local7 = new com/google/android/gms/ads/internal/overlay/f$7;
      local7.<init>(this);
      ((Handler)localObject).post(local7);
    }
    g = i1;
  }
  
  public final void e()
  {
    int i1 = 4;
    Object localObject = "AdMediaPlayerView pause";
    tp.a((String)localObject);
    boolean bool = j();
    if (bool)
    {
      localObject = h;
      bool = ((MediaPlayer)localObject).isPlaying();
      if (bool)
      {
        h.pause();
        b(i1);
        localObject = tt.a;
        f.8 local8 = new com/google/android/gms/ads/internal/overlay/f$8;
        local8.<init>(this);
        ((Handler)localObject).post(local8);
      }
    }
    g = i1;
  }
  
  public final int getCurrentPosition()
  {
    boolean bool = j();
    MediaPlayer localMediaPlayer;
    int i1;
    if (bool)
    {
      localMediaPlayer = h;
      i1 = localMediaPlayer.getCurrentPosition();
    }
    for (;;)
    {
      return i1;
      i1 = 0;
      localMediaPlayer = null;
    }
  }
  
  public final int getDuration()
  {
    boolean bool = j();
    MediaPlayer localMediaPlayer;
    if (bool) {
      localMediaPlayer = h;
    }
    for (int i1 = localMediaPlayer.getDuration();; i1 = -1) {
      return i1;
    }
  }
  
  public final int getVideoHeight()
  {
    MediaPlayer localMediaPlayer = h;
    int i1;
    if (localMediaPlayer != null)
    {
      localMediaPlayer = h;
      i1 = localMediaPlayer.getVideoHeight();
    }
    for (;;)
    {
      return i1;
      i1 = 0;
      localMediaPlayer = null;
    }
  }
  
  public final int getVideoWidth()
  {
    MediaPlayer localMediaPlayer = h;
    int i1;
    if (localMediaPlayer != null)
    {
      localMediaPlayer = h;
      i1 = localMediaPlayer.getVideoWidth();
    }
    for (;;)
    {
      return i1;
      i1 = 0;
      localMediaPlayer = null;
    }
  }
  
  public final void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    l = paramInt;
  }
  
  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    int i1 = 5;
    tp.a("AdMediaPlayerView completion");
    b(i1);
    g = i1;
    Handler localHandler = tt.a;
    f.2 local2 = new com/google/android/gms/ads/internal/overlay/f$2;
    local2.<init>(this);
    localHandler.post(local2);
  }
  
  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    int i1 = -1;
    Object localObject1 = c;
    Object localObject2 = Integer.valueOf(paramInt1);
    localObject1 = (String)((Map)localObject1).get(localObject2);
    localObject2 = c;
    Object localObject3 = Integer.valueOf(paramInt2);
    localObject2 = (String)((Map)localObject2).get(localObject3);
    int i2 = String.valueOf(localObject1).length() + 38;
    int i3 = String.valueOf(localObject2).length();
    i2 += i3;
    Object localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>(i2);
    tp.e("AdMediaPlayerView MediaPlayer error: " + (String)localObject1 + ":" + (String)localObject2);
    b(i1);
    g = i1;
    localObject3 = tt.a;
    localObject4 = new com/google/android/gms/ads/internal/overlay/f$3;
    ((f.3)localObject4).<init>(this, (String)localObject1, (String)localObject2);
    ((Handler)localObject3).post((Runnable)localObject4);
    return true;
  }
  
  public final boolean onInfo(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    Object localObject1 = c;
    Object localObject2 = Integer.valueOf(paramInt1);
    localObject1 = (String)((Map)localObject1).get(localObject2);
    localObject2 = c;
    Integer localInteger = Integer.valueOf(paramInt2);
    localObject2 = (String)((Map)localObject2).get(localInteger);
    int i1 = String.valueOf(localObject1).length() + 37;
    int i2 = String.valueOf(localObject2).length();
    i1 += i2;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i1);
    tp.a("AdMediaPlayerView MediaPlayer info: " + (String)localObject1 + ":" + (String)localObject2);
    return true;
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 1073741824;
    int i2 = -1 << -1;
    int i3 = getDefaultSize(j, paramInt1);
    int i4 = getDefaultSize(k, paramInt2);
    int i5 = j;
    aa localaa;
    int i6;
    int i7;
    if (i5 > 0)
    {
      i5 = k;
      if (i5 > 0)
      {
        localaa = o;
        if (localaa == null)
        {
          i6 = View.MeasureSpec.getMode(paramInt1);
          i5 = View.MeasureSpec.getSize(paramInt1);
          i7 = View.MeasureSpec.getMode(paramInt2);
          i4 = View.MeasureSpec.getSize(paramInt2);
          if ((i6 != i1) || (i7 != i1)) {
            break label308;
          }
          i3 = j * i4;
          i1 = k * i5;
          if (i3 >= i1) {
            break label256;
          }
          i3 = j * i4;
          i5 = k;
          i3 /= i5;
        }
      }
    }
    for (;;)
    {
      setMeasuredDimension(i3, i4);
      localaa = o;
      if (localaa != null)
      {
        localaa = o;
        localaa.a(i3, i4);
      }
      i5 = Build.VERSION.SDK_INT;
      i1 = 16;
      if (i5 == i1)
      {
        i5 = m;
        if (i5 > 0)
        {
          i5 = m;
          if (i5 != i3) {}
        }
        else
        {
          i5 = n;
          if (i5 <= 0) {
            break label243;
          }
          i5 = n;
          if (i5 == i4) {
            break label243;
          }
        }
        i();
        label243:
        m = i3;
        n = i4;
      }
      return;
      label256:
      i3 = j * i4;
      i1 = k * i5;
      if (i3 > i1)
      {
        i4 = k * i5;
        i3 = j;
        i4 /= i3;
        i3 = i5;
        continue;
        label308:
        if (i6 == i1)
        {
          i3 = k * i5;
          i1 = j;
          i3 /= i1;
          if ((i7 == i2) && (i3 > i4)) {
            i3 = i5;
          }
        }
        else
        {
          if (i7 == i1)
          {
            i3 = j * i4;
            i1 = k;
            i3 /= i1;
            if ((i6 != i2) || (i3 <= i5)) {
              continue;
            }
            i3 = i5;
            continue;
          }
          i1 = j;
          i3 = k;
          if ((i7 == i2) && (i3 > i4))
          {
            i3 = j * i4;
            i1 = k;
            i3 /= i1;
          }
          for (;;)
          {
            if ((i6 != i2) || (i3 <= i5)) {
              break label498;
            }
            i4 = k * i5;
            i3 = j;
            i4 /= i3;
            i3 = i5;
            break;
            i4 = i3;
            i3 = i1;
          }
          label498:
          continue;
        }
        i4 = i3;
        i3 = i5;
      }
      else
      {
        i3 = i5;
      }
    }
  }
  
  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    boolean bool1 = true;
    tp.a("AdMediaPlayerView prepared");
    int i1 = 2;
    b(i1);
    Object localObject1 = d;
    boolean bool2 = i;
    if (bool2)
    {
      bool2 = j;
      if (!bool2) {
        break label203;
      }
    }
    for (;;)
    {
      localObject1 = tt.a;
      Object localObject2 = new com/google/android/gms/ads/internal/overlay/f$1;
      ((f.1)localObject2).<init>(this);
      ((Handler)localObject1).post((Runnable)localObject2);
      i1 = paramMediaPlayer.getVideoWidth();
      j = i1;
      i1 = paramMediaPlayer.getVideoHeight();
      k = i1;
      i1 = q;
      if (i1 != 0)
      {
        i1 = q;
        a(i1);
      }
      i();
      i1 = j;
      int i2 = k;
      int i3 = 62;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>(i3);
      localObject1 = ((StringBuilder)localObject3).append("AdMediaPlayerView stream dimensions: ").append(i1);
      Object localObject4 = " x ";
      localObject1 = (String)localObject4 + i2;
      tp.d((String)localObject1);
      i1 = g;
      i2 = 3;
      if (i1 == i2) {
        d();
      }
      a();
      return;
      label203:
      localObject2 = e;
      localObject4 = d;
      localObject3 = new String[bool1];
      String str = "vfr2";
      localObject3[0] = str;
      ki.a((km)localObject2, (kk)localObject4, (String[])localObject3);
      j = bool1;
    }
  }
  
  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    tp.a("AdMediaPlayerView surface created");
    h();
    Handler localHandler = tt.a;
    f.4 local4 = new com/google/android/gms/ads/internal/overlay/f$4;
    local4.<init>(this);
    localHandler.post(local4);
  }
  
  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    boolean bool = true;
    tp.a("AdMediaPlayerView surface destroyed");
    Object localObject = h;
    if (localObject != null)
    {
      int i1 = q;
      if (i1 == 0)
      {
        localObject = h;
        i1 = ((MediaPlayer)localObject).getCurrentPosition();
        q = i1;
      }
    }
    localObject = o;
    if (localObject != null)
    {
      localObject = o;
      ((aa)localObject).b();
    }
    localObject = tt.a;
    f.6 local6 = new com/google/android/gms/ads/internal/overlay/f$6;
    local6.<init>(this);
    ((Handler)localObject).post(local6);
    a(bool);
    return bool;
  }
  
  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    int i1 = 1;
    MediaPlayer localMediaPlayer = null;
    Object localObject = "AdMediaPlayerView surface changed";
    tp.a((String)localObject);
    int i2 = g;
    int i3 = 3;
    if (i2 == i3)
    {
      i2 = i1;
      i3 = j;
      if (i3 != paramInt1) {
        break label168;
      }
      i3 = k;
      if (i3 != paramInt2) {
        break label168;
      }
    }
    for (;;)
    {
      localMediaPlayer = h;
      if ((localMediaPlayer != null) && (i2 != 0) && (i1 != 0))
      {
        i2 = q;
        if (i2 != 0)
        {
          i2 = q;
          a(i2);
        }
        d();
      }
      localObject = o;
      if (localObject != null)
      {
        localObject = o;
        ((aa)localObject).a(paramInt1, paramInt2);
      }
      localObject = tt.a;
      f.5 local5 = new com/google/android/gms/ads/internal/overlay/f$5;
      local5.<init>(this, paramInt1, paramInt2);
      ((Handler)localObject).post(local5);
      return;
      i2 = 0;
      localObject = null;
      break;
      label168:
      i1 = 0;
      local5 = null;
    }
  }
  
  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    Object localObject1 = d;
    boolean bool1 = k;
    int i4;
    String[] arrayOfString1;
    boolean bool2;
    Long localLong;
    if (bool1)
    {
      bool1 = l;
      if (!bool1)
      {
        localObject2 = e;
        localObject3 = d;
        i4 = 1;
        arrayOfString1 = new String[i4];
        bool2 = false;
        localLong = null;
        String str = "vff2";
        arrayOfString1[0] = str;
        ki.a((km)localObject2, (kk)localObject3, arrayOfString1);
        bool1 = true;
        l = bool1;
      }
    }
    Object localObject2 = w.k();
    long l1 = ((com.google.android.gms.common.util.c)localObject2).c();
    bool1 = m;
    long l3;
    double d2;
    Object localObject4;
    int i6;
    if (bool1)
    {
      bool1 = p;
      if (bool1)
      {
        l2 = q;
        l3 = -1;
        double d1 = 0.0D / 0.0D;
        bool1 = l2 < l3;
        if (bool1)
        {
          l2 = TimeUnit.SECONDS.toNanos(1L);
          d2 = l2;
          l3 = q;
          l3 = l1 - l3;
          d1 = l3;
          d2 /= d1;
          localObject4 = f;
          int i1 = d + 1;
          d = i1;
          i1 = 0;
          localObject2 = null;
          for (;;)
          {
            Object localObject5 = b;
            int i5 = localObject5.length;
            if (i1 >= i5) {
              break;
            }
            localObject5 = b;
            double d3 = localObject5[i1];
            boolean bool3 = d3 < d2;
            if (!bool3)
            {
              localObject5 = a;
              d3 = localObject5[i1];
              bool3 = d2 < d3;
              if (bool3)
              {
                localObject5 = c;
                i6 = localObject5[i1] + 1;
                localObject5[i1] = i6;
              }
            }
            localObject5 = b;
            d3 = localObject5[i1];
            bool3 = d2 < d3;
            if (bool3) {
              break;
            }
            i1 += 1;
          }
        }
      }
    }
    int i2 = m;
    p = i2;
    q = l1;
    localObject2 = ke.z;
    Object localObject3 = w.q();
    l1 = ((Long)((kd)localObject3).a((jz)localObject2)).longValue();
    long l2 = getCurrentPosition();
    i2 = 0;
    localObject2 = null;
    for (;;)
    {
      localObject4 = h;
      int i7 = localObject4.length;
      if (i2 < i7)
      {
        localObject4 = h[i2];
        if (localObject4 == null)
        {
          localObject4 = g;
          l3 = localObject4[i2];
          l3 = Math.abs(l2 - l3);
          boolean bool4 = l1 < l3;
          if (bool4)
          {
            String[] arrayOfString2 = h;
            int i9 = 8;
            Bitmap localBitmap = getBitmap(8, i9);
            l2 = 0L;
            d2 = 0.0D;
            l1 = 63;
            int i10 = 0;
            localObject1 = null;
            for (;;)
            {
              int i8 = 8;
              if (i10 >= i8) {
                break;
              }
              i8 = 0;
              localObject4 = null;
              i6 = 0;
              l3 = l2;
              l2 = l1;
              i9 = 8;
              if (i6 < i9)
              {
                i9 = localBitmap.getPixel(i6, i10);
                i4 = Color.blue(i9);
                int i11 = Color.red(i9);
                i4 += i11;
                i9 = Color.green(i9) + i4;
                i4 = 128;
                if (i9 > i4) {}
                for (l1 = 1L;; l1 = 0L)
                {
                  i11 = (int)l2;
                  l1 <<= i11;
                  l3 |= l1;
                  i9 = i6 + 1;
                  long l4 = 1L;
                  l2 -= l4;
                  i6 = i9;
                  break;
                }
              }
              i10 += 1;
              l1 = l2;
              l2 = l3;
            }
            i9 = 1;
            localObject3 = new Object[i9];
            i4 = 0;
            arrayOfString1 = null;
            localLong = Long.valueOf(l2);
            localObject3[0] = localLong;
            localObject1 = String.format("%016X", (Object[])localObject3);
            arrayOfString2[i2] = localObject1;
          }
        }
      }
      else
      {
        localObject2 = a;
        localObject1 = r;
        if (localObject1 != null)
        {
          l1 = paramSurfaceTexture.getTimestamp();
          bool2 = c;
          if (!bool2)
          {
            l2 = b;
            l2 = Math.abs(l1 - l2);
            l3 = a;
            bool2 = l2 < l3;
            if (bool2) {}
          }
          else
          {
            bool2 = false;
            localLong = null;
            c = false;
            b = l1;
            localObject2 = tt.a;
            localObject3 = new com/google/android/gms/ads/internal/overlay/y$1;
            ((y.1)localObject3).<init>((k)localObject1);
            ((Handler)localObject2).post((Runnable)localObject3);
          }
        }
        return;
      }
      int i3;
      i2 += 1;
    }
  }
  
  public final void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>(57);
    Object localObject2 = ((StringBuilder)localObject1).append("AdMediaPlayerView size changed: ").append(paramInt1);
    localObject1 = " x ";
    localObject2 = (String)localObject1 + paramInt2;
    tp.a((String)localObject2);
    int i1 = paramMediaPlayer.getVideoWidth();
    j = i1;
    i1 = paramMediaPlayer.getVideoHeight();
    k = i1;
    i1 = j;
    if (i1 != 0)
    {
      i1 = k;
      if (i1 != 0) {
        requestLayout();
      }
    }
  }
  
  public final void setVideoPath(String paramString)
  {
    Uri localUri = Uri.parse(paramString);
    setVideoURI(localUri);
  }
  
  public final void setVideoURI(Uri paramUri)
  {
    Object localObject = hw.a(paramUri);
    if (localObject == null) {}
    for (;;)
    {
      i = paramUri;
      q = 0;
      h();
      requestLayout();
      invalidate();
      return;
      localObject = a;
      paramUri = Uri.parse((String)localObject);
    }
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(getClass().getName());
    String str2 = String.valueOf(Integer.toHexString(hashCode()));
    int i1 = String.valueOf(str1).length() + 1;
    int i2 = String.valueOf(str2).length();
    i1 += i2;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i1);
    return str1 + "@" + str2;
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */