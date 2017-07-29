package com.google.android.gms.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import com.google.android.gms.common.internal.c;
import java.util.List;
import java.util.concurrent.Callable;

@qi
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
    (((Boolean)uh.a(new Callable() {})).booleanValue()) && (bc.a(a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0);
  }
  
  public final boolean a(Intent paramIntent)
  {
    boolean bool = false;
    c.a(paramIntent, "Intent can not be null");
    if (!a.getPackageManager().queryIntentActivities(paramIntent, 0).isEmpty()) {
      bool = true;
    }
    return bool;
  }
  
  @TargetApi(14)
  public final boolean b()
  {
    Intent localIntent = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
    int i = Build.VERSION.SDK_INT;
    return a(localIntent);
  }
}


/* Location:              com/google/android/gms/b/jv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */