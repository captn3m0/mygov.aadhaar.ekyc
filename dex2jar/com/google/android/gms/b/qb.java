package com.google.android.gms.b;

import android.content.Context;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.s;
import com.google.android.gms.ads.internal.w;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

@qi
public final class qb
{
  final Context a;
  final dw b;
  final tg.a c;
  final km d;
  final s e;
  ViewTreeObserver.OnGlobalLayoutListener f;
  ViewTreeObserver.OnScrollChangedListener g;
  private final Object h = new Object();
  private ue i;
  private int j = -1;
  private int k = -1;
  
  public qb(Context paramContext, dw paramdw, tg.a parama, km paramkm, s params)
  {
    a = paramContext;
    b = paramdw;
    c = parama;
    d = paramkm;
    e = params;
    i = new ue(200L);
  }
}


/* Location:              com/google/android/gms/b/qb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */