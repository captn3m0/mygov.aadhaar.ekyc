package com.google.android.gms.b;

import org.json.JSONObject;

public final class gy
  implements ha
{
  final gw a;
  private final nk b;
  private final md c;
  private final md d;
  private final md e;
  
  public gy(gw paramgw, nk paramnk)
  {
    Object localObject = new com/google/android/gms/b/gy$1;
    ((gy.1)localObject).<init>(this);
    c = ((md)localObject);
    localObject = new com/google/android/gms/b/gy$2;
    ((gy.2)localObject).<init>(this);
    d = ((md)localObject);
    localObject = new com/google/android/gms/b/gy$3;
    ((gy.3)localObject).<init>(this);
    e = ((md)localObject);
    a = paramgw;
    b = paramnk;
    localObject = b;
    md localmd = c;
    ((nk)localObject).a("/updateActiveView", localmd);
    localmd = d;
    ((nk)localObject).a("/untrackActiveViewUnit", localmd);
    localmd = e;
    ((nk)localObject).a("/visibilityChanged", localmd);
    String str = "Custom JS tracking ad unit: ";
    localObject = String.valueOf(a.g().c);
    int i = ((String)localObject).length();
    if (i != 0) {
      localObject = str.concat((String)localObject);
    }
    for (;;)
    {
      tp.b((String)localObject);
      return;
      localObject = new java/lang/String;
      ((String)localObject).<init>(str);
    }
  }
  
  public final void a(JSONObject paramJSONObject, boolean paramBoolean)
  {
    Object localObject;
    if (!paramBoolean)
    {
      localObject = b;
      String str = "AFMA_updateActiveView";
      ((nk)localObject).a(str, paramJSONObject);
    }
    for (;;)
    {
      return;
      localObject = a;
      ((gw)localObject).c(this);
    }
  }
  
  public final boolean a()
  {
    return true;
  }
  
  public final void b()
  {
    nk localnk = b;
    md localmd = e;
    localnk.b("/visibilityChanged", localmd);
    localmd = d;
    localnk.b("/untrackActiveViewUnit", localmd);
    localmd = c;
    localnk.b("/updateActiveView", localmd);
  }
}


/* Location:              com/google/android/gms/b/gy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */