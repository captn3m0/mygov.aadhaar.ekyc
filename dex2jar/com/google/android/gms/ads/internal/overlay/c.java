package com.google.android.gms.ads.internal.overlay;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.google.android.gms.b.qi;

@qi
@TargetApi(14)
public final class c
  implements AudioManager.OnAudioFocusChangeListener
{
  boolean a;
  boolean b;
  boolean c;
  float d = 1.0F;
  private final AudioManager e;
  private final a f;
  
  public c(Context paramContext, a parama)
  {
    e = ((AudioManager)paramContext.getSystemService("audio"));
    f = parama;
  }
  
  final void a()
  {
    boolean bool2 = true;
    boolean bool1 = true;
    int i;
    if ((b) && (!c) && (d > 0.0F))
    {
      i = 1;
      if ((i == 0) || (a)) {
        break label96;
      }
      if ((e != null) && (!a)) {
        break label69;
      }
      f.a();
    }
    label69:
    label96:
    while ((i != 0) || (!a))
    {
      return;
      i = 0;
      break;
      if (e.requestAudioFocus(this, 3, 2) == 1) {}
      for (;;)
      {
        a = bool1;
        break;
        bool1 = false;
      }
    }
    if ((e == null) || (!a))
    {
      f.a();
      return;
    }
    if (e.abandonAudioFocus(this) == 0) {}
    for (bool1 = bool2;; bool1 = false)
    {
      a = bool1;
      break;
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
  
  static abstract interface a
  {
    public abstract void a();
  }
}


/* Location:              com/google/android/gms/ads/internal/overlay/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */