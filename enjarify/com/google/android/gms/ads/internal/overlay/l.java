package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.TextureView;

public abstract class l
  extends TextureView
  implements c.a
{
  protected final y a;
  protected final c b;
  
  public l(Context paramContext)
  {
    super(paramContext);
    Object localObject = new com/google/android/gms/ads/internal/overlay/y;
    ((y)localObject).<init>();
    a = ((y)localObject);
    localObject = new com/google/android/gms/ads/internal/overlay/c;
    ((c)localObject).<init>(paramContext, this);
    b = ((c)localObject);
  }
  
  public abstract void a();
  
  public final void a(float paramFloat)
  {
    c localc = b;
    d = paramFloat;
    localc.a();
    a();
  }
  
  public abstract void a(float paramFloat1, float paramFloat2);
  
  public abstract void a(int paramInt);
  
  public abstract void a(k paramk);
  
  public abstract String b();
  
  public abstract void c();
  
  public abstract void d();
  
  public abstract void e();
  
  public final void f()
  {
    b.a(true);
    a();
  }
  
  public final void g()
  {
    b.a(false);
    a();
  }
  
  public abstract int getCurrentPosition();
  
  public abstract int getDuration();
  
  public abstract int getVideoHeight();
  
  public abstract int getVideoWidth();
  
  public abstract void setVideoPath(String paramString);
}


/* Location:              com/google/android/gms/ads/internal/overlay/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */