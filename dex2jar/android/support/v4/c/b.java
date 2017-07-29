package android.support.v4.c;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;

public final class b
{
  private static final a a = new b();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 15)
    {
      a = new d();
      return;
    }
    if (i >= 11)
    {
      a = new c();
      return;
    }
  }
  
  public static Intent a(ComponentName paramComponentName)
  {
    return a.a(paramComponentName);
  }
  
  static abstract interface a
  {
    public abstract Intent a(ComponentName paramComponentName);
  }
  
  static class b
    implements b.a
  {
    public Intent a(ComponentName paramComponentName)
    {
      Intent localIntent = new Intent("android.intent.action.MAIN");
      localIntent.setComponent(paramComponentName);
      localIntent.addCategory("android.intent.category.LAUNCHER");
      return localIntent;
    }
  }
  
  static class c
    extends b.b
  {
    public final Intent a(ComponentName paramComponentName)
    {
      return Intent.makeMainActivity(paramComponentName);
    }
  }
  
  static final class d
    extends b.c
  {}
}


/* Location:              android/support/v4/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */