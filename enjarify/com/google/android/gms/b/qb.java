package com.google.android.gms.b;

import android.content.Context;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.s;

public final class qb
{
  final Context a;
  final dw b;
  final tg.a c;
  final km d;
  final s e;
  ViewTreeObserver.OnGlobalLayoutListener f;
  ViewTreeObserver.OnScrollChangedListener g;
  private final Object h;
  private ue i;
  private int j;
  private int k;
  
  public qb(Context paramContext, dw paramdw, tg.a parama, km paramkm, s params)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    h = localObject;
    j = m;
    k = m;
    a = paramContext;
    b = paramdw;
    c = parama;
    d = paramkm;
    e = params;
    localObject = new com/google/android/gms/b/ue;
    ((ue)localObject).<init>(200L);
    i = ((ue)localObject);
  }
}


/* Location:              com/google/android/gms/b/qb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */