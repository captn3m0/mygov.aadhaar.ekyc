package com.google.android.gms.b;

import org.json.JSONObject;

public final class gz
  implements ha
{
  final gw a;
  boolean b;
  final md c;
  final md d;
  final md e;
  final md f;
  private nj.c g;
  
  public gz(gw paramgw, nj paramnj)
  {
    Object localObject1 = new com/google/android/gms/b/gz$5;
    ((gz.5)localObject1).<init>(this);
    c = ((md)localObject1);
    localObject1 = new com/google/android/gms/b/gz$6;
    ((gz.6)localObject1).<init>(this);
    d = ((md)localObject1);
    localObject1 = new com/google/android/gms/b/gz$7;
    ((gz.7)localObject1).<init>(this);
    e = ((md)localObject1);
    localObject1 = new com/google/android/gms/b/gz$8;
    ((gz.8)localObject1).<init>(this);
    f = ((md)localObject1);
    a = paramgw;
    localObject1 = paramnj.b(null);
    g = ((nj.c)localObject1);
    localObject1 = g;
    Object localObject2 = new com/google/android/gms/b/gz$1;
    ((gz.1)localObject2).<init>(this);
    gz.2 local2 = new com/google/android/gms/b/gz$2;
    local2.<init>(this);
    ((nj.c)localObject1).a((uv.c)localObject2, local2);
    localObject2 = "Core JS tracking ad unit: ";
    localObject1 = String.valueOf(a.g().c);
    int i = ((String)localObject1).length();
    if (i != 0) {
      localObject1 = ((String)localObject2).concat((String)localObject1);
    }
    for (;;)
    {
      tp.b((String)localObject1);
      return;
      localObject1 = new java/lang/String;
      ((String)localObject1).<init>((String)localObject2);
    }
  }
  
  public final void a(JSONObject paramJSONObject, boolean paramBoolean)
  {
    nj.c localc = g;
    gz.3 local3 = new com/google/android/gms/b/gz$3;
    local3.<init>(paramJSONObject);
    uv.b localb = new com/google/android/gms/b/uv$b;
    localb.<init>();
    localc.a(local3, localb);
  }
  
  public final boolean a()
  {
    return b;
  }
  
  public final void b()
  {
    nj.c localc = g;
    gz.4 local4 = new com/google/android/gms/b/gz$4;
    local4.<init>(this);
    uv.b localb = new com/google/android/gms/b/uv$b;
    localb.<init>();
    localc.a(local4, localb);
    g.g_();
  }
}


/* Location:              com/google/android/gms/b/gz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */