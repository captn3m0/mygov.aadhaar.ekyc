package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;

public final class c
  implements AudioManager.OnAudioFocusChangeListener
{
  boolean a;
  boolean b;
  boolean c;
  float d = 1.0F;
  private final AudioManager e;
  private final c.a f;
  
  public c(Context paramContext, c.a parama)
  {
    AudioManager localAudioManager = (AudioManager)paramContext.getSystemService("audio");
    e = localAudioManager;
    f = parama;
  }
  
  final void a()
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = b;
    float f2;
    c.a locala;
    if (bool1)
    {
      bool1 = c;
      if (!bool1)
      {
        f2 = d;
        boolean bool3 = false;
        bool1 = f2 < 0.0F;
        if (bool1)
        {
          bool1 = i;
          f2 = f1;
          if (!bool1) {
            break label152;
          }
          bool3 = a;
          if (bool3) {
            break label152;
          }
          localAudioManager = e;
          if (localAudioManager != null)
          {
            bool1 = a;
            if (!bool1) {
              break label106;
            }
          }
          locala = f;
          locala.a();
        }
      }
    }
    for (;;)
    {
      return;
      bool1 = false;
      localAudioManager = null;
      f2 = 0.0F;
      break;
      label106:
      localAudioManager = e;
      int m = 3;
      int n = 2;
      int j = localAudioManager.requestAudioFocus(this, m, n);
      if (j == i) {}
      for (;;)
      {
        a = i;
        break;
        i = 0;
        locala = null;
        f1 = 0.0F;
      }
      label152:
      if (j == 0)
      {
        boolean bool2 = a;
        if (bool2)
        {
          localAudioManager = e;
          if (localAudioManager != null)
          {
            bool2 = a;
            if (bool2) {
              break label201;
            }
          }
          locala = f;
          locala.a();
        }
      }
    }
    label201:
    AudioManager localAudioManager = e;
    int k = localAudioManager.abandonAudioFocus(this);
    if (k == 0) {}
    for (;;)
    {
      a = i;
      break;
      i = 0;
      locala = null;
      f1 = 0.0F;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    c = paramBoolean;
    a();
  }
  
  public final void onAudioFocusChange(int paramInt)
  {
    if (paramInt > 0) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      f.a();
      return;
    }
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */