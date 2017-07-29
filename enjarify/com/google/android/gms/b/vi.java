package com.google.android.gms.b;

import com.google.android.gms.ads.internal.w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class vi
  extends jf.a
{
  final Object a;
  int b;
  boolean c;
  float d;
  float e;
  private final vc f;
  private final float g;
  private jg h;
  private boolean i;
  private boolean j;
  
  public vi(vc paramvc, float paramFloat)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    j = true;
    f = paramvc;
    g = paramFloat;
  }
  
  private void a(String paramString, Map paramMap)
  {
    HashMap localHashMap;
    if (paramMap == null)
    {
      localHashMap = new java/util/HashMap;
      localHashMap.<init>();
    }
    for (;;)
    {
      localHashMap.put("action", paramString);
      w.e();
      vi.1 local1 = new com/google/android/gms/b/vi$1;
      local1.<init>(this, localHashMap);
      tt.a(local1);
      return;
      localHashMap = new java/util/HashMap;
      localHashMap.<init>(paramMap);
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
        ??? = "initialState";
        String str1 = "muteStart";
        if (paramBoolean)
        {
          Object localObject2 = "1";
          localObject2 = Collections.singletonMap(str1, localObject2);
          a((String)???, (Map)localObject2);
          return;
        }
      }
      String str2 = "0";
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
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */