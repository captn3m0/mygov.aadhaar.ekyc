package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.a.b;

public final class i
{
  private final Resources a;
  private final String b;
  
  public i(Context paramContext)
  {
    c.a(paramContext);
    Object localObject = paramContext.getResources();
    a = ((Resources)localObject);
    localObject = a;
    int i = a.b.common_google_play_services_unknown_issue;
    localObject = ((Resources)localObject).getResourcePackageName(i);
    b = ((String)localObject);
  }
  
  public final String a(String paramString)
  {
    Object localObject1 = a;
    Object localObject2 = "string";
    String str = b;
    int i = ((Resources)localObject1).getIdentifier(paramString, (String)localObject2, str);
    if (i == 0) {
      i = 0;
    }
    for (localObject1 = null;; localObject1 = ((Resources)localObject2).getString(i))
    {
      return (String)localObject1;
      localObject2 = a;
    }
  }
}


/* Location:              com/google/android/gms/common/internal/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */