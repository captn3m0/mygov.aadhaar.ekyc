package com.google.android.gms.b;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@qi
public final class vi
  extends jf.a
{
  final Object a = new Object();
  int b;
  boolean c;
  float d;
  float e;
  private final vc f;
  private final float g;
  private jg h;
  private boolean i;
  private boolean j = true;
  
  public vi(vc paramvc, float paramFloat)
  {
    f = paramvc;
    g = paramFloat;
  }
  
  private void a(String paramString, final Map<String, String> paramMap)
  {
    if (paramMap == null) {}
    for (paramMap = new HashMap();; paramMap = new HashMap(paramMap))
    {
      paramMap.put("action", paramString);
      w.e();
      tt.a(new Runnable()
      {
        public final void run()
        {
          vi.a(vi.this).a("pubVideoCmd", paramMap);
        }
      });
      return;
    }
  }
  
  public final void a()
  {
    a("play", null);
  }
  
  public final void a(jg paramjg)
  {
    synchronized (a)
    {
      h = paramjg;
      return;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (String str = "mute";; str = "unmute")
    {
      a(str, null);
      return;
    }
  }
  
  public final void b()
  {
    a("pause", null);
  }
  
  public final void b(boolean paramBoolean)
  {
    for (;;)
    {
      synchronized (a)
      {
        j = paramBoolean;
        if (paramBoolean)
        {
          ??? = "1";
          a("initialState", Collections.singletonMap("muteStart", ???));
          return;
        }
      }
      ??? = "0";
    }
  }
  
  public final boolean c()
  {
    synchronized (a)
    {
      boolean bool = c;
      return bool;
    }
  }
  
  public final int d()
  {
    synchronized (a)
    {
      int k = b;
      return k;
    }
  }
  
  public final float e()
  {
    return g;
  }
  
  public final float f()
  {
    synchronized (a)
    {
      float f1 = d;
      return f1;
    }
  }
  
  public final float g()
  {
    synchronized (a)
    {
      float f1 = e;
      return f1;
    }
  }
}


/* Location:              com/google/android/gms/b/vi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */