package com.a.a.a;

import android.os.Handler;
import android.os.Looper;
import com.a.a.m;
import java.util.HashMap;

public final class h
{
  private final m a;
  private int b = 100;
  private final h.a c;
  private final HashMap d;
  private final HashMap e;
  private final Handler f;
  
  public h(m paramm, h.a parama)
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    d = ((HashMap)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    e = ((HashMap)localObject);
    localObject = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    ((Handler)localObject).<init>(localLooper);
    f = ((Handler)localObject);
    a = paramm;
    c = parama;
  }
}


/* Location:              com/a/a/a/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */