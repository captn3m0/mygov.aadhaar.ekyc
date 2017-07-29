package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.ads.internal.w;

public final class nj
{
  final Object a;
  final Context b;
  final String c;
  final un d;
  ty e;
  nj.d f;
  int g;
  private ty h;
  
  public nj(Context paramContext, un paramun, String paramString)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    g = 1;
    c = paramString;
    localObject = paramContext.getApplicationContext();
    b = ((Context)localObject);
    d = paramun;
    localObject = new com/google/android/gms/b/nj$b;
    ((nj.b)localObject).<init>();
    e = ((ty)localObject);
    localObject = new com/google/android/gms/b/nj$b;
    ((nj.b)localObject).<init>();
    h = ((ty)localObject);
  }
  
  public nj(Context paramContext, un paramun, String paramString, ty paramty1, ty paramty2)
  {
    this(paramContext, paramun, paramString);
    e = paramty1;
    h = paramty2;
  }
  
  protected final nj.d a(dw paramdw)
  {
    nj.d locald = new com/google/android/gms/b/nj$d;
    Object localObject = h;
    locald.<init>((ty)localObject);
    w.e();
    localObject = new com/google/android/gms/b/nj$1;
    ((nj.1)localObject).<init>(this, paramdw, locald);
    tt.a((Runnable)localObject);
    localObject = new com/google/android/gms/b/nj$2;
    ((nj.2)localObject).<init>(this, locald);
    nj.3 local3 = new com/google/android/gms/b/nj$3;
    local3.<init>(this, locald);
    locald.a((uv.c)localObject, local3);
    return locald;
  }
  
  public final nj.c b(dw paramdw)
  {
    int i = 2;
    for (;;)
    {
      synchronized (a)
      {
        Object localObject2 = f;
        if (localObject2 != null)
        {
          localObject2 = f;
          j = ((nj.d)localObject2).b();
          k = -1;
          if (j != k) {}
        }
        else
        {
          j = 2;
          g = j;
          localObject2 = a(paramdw);
          f = ((nj.d)localObject2);
          localObject2 = f;
          localObject2 = ((nj.d)localObject2).h_();
          return (nj.c)localObject2;
        }
        j = g;
        if (j == 0)
        {
          localObject2 = f;
          localObject2 = ((nj.d)localObject2).h_();
        }
      }
      int j = g;
      int k = 1;
      Object localObject4;
      if (j == k)
      {
        j = 2;
        g = j;
        a(paramdw);
        localObject4 = f;
        localObject4 = ((nj.d)localObject4).h_();
      }
      else
      {
        j = g;
        if (j == i)
        {
          localObject4 = f;
          localObject4 = ((nj.d)localObject4).h_();
        }
        else
        {
          localObject4 = f;
          localObject4 = ((nj.d)localObject4).h_();
        }
      }
    }
  }
}


/* Location:              com/google/android/gms/b/nj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */