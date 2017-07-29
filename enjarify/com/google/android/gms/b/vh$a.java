package com.google.android.gms.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

public final class vh$a
  extends MutableContextWrapper
{
  Activity a;
  Context b;
  private Context c;
  
  public vh$a(Context paramContext)
  {
    super(paramContext);
    setBaseContext(paramContext);
  }
  
  public final Object getSystemService(String paramString)
  {
    return b.getSystemService(paramString);
  }
  
  public final void setBaseContext(Context paramContext)
  {
    Object localObject = paramContext.getApplicationContext();
    c = ((Context)localObject);
    boolean bool = paramContext instanceof Activity;
    if (bool) {
      localObject = paramContext;
    }
    for (localObject = (Activity)paramContext;; localObject = null)
    {
      a = ((Activity)localObject);
      b = ((Context)paramContext);
      localObject = c;
      super.setBaseContext((Context)localObject);
      return;
      bool = false;
    }
  }
  
  public final void startActivity(Intent paramIntent)
  {
    Object localObject = a;
    if (localObject != null)
    {
      localObject = a;
      ((Activity)localObject).startActivity(paramIntent);
    }
    for (;;)
    {
      return;
      int i = 268435456;
      paramIntent.setFlags(i);
      localObject = c;
      ((Context)localObject).startActivity(paramIntent);
    }
  }
}


/* Location:              com/google/android/gms/b/vh$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */