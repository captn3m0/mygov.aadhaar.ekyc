package com.google.android.gms.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.c;
import java.util.List;
import java.util.concurrent.Callable;

public final class jv
{
  private final Context a;
  
  public jv(Context paramContext)
  {
    c.a(paramContext, "Context can not be null");
    a = paramContext;
  }
  
  public final boolean a()
  {
    Object localObject = new com/google/android/gms/b/jv$1;
    ((jv.1)localObject).<init>();
    localObject = (Boolean)uh.a((Callable)localObject);
    boolean bool = ((Boolean)localObject).booleanValue();
    int i;
    if (bool)
    {
      localObject = bc.a(a);
      String str = "android.permission.WRITE_EXTERNAL_STORAGE";
      i = ((bb)localObject).a(str);
      if (i == 0) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localObject = null;
    }
  }
  
  public final boolean a(Intent paramIntent)
  {
    boolean bool1 = false;
    c.a(paramIntent, "Intent can not be null");
    List localList = a.getPackageManager().queryIntentActivities(paramIntent, 0);
    boolean bool2 = localList.isEmpty();
    if (!bool2) {
      bool1 = true;
    }
    return bool1;
  }
  
  public final boolean b()
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.intent.action.INSERT");
    String str = "vnd.android.cursor.dir/event";
    localIntent = localIntent.setType(str);
    boolean bool = a(localIntent);
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localIntent = null;
    }
  }
}


/* Location:              com/google/android/gms/b/jv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */