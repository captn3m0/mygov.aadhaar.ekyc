package android.support.v4.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class ar
  implements Iterable<Intent>
{
  private static final b c = new c();
  public final ArrayList<Intent> a = new ArrayList();
  public final Context b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      c = new d();
      return;
    }
  }
  
  private ar(Context paramContext)
  {
    b = paramContext;
  }
  
  public static ar a(Context paramContext)
  {
    return new ar(paramContext);
  }
  
  public final ar a(ComponentName paramComponentName)
  {
    int i = a.size();
    try
    {
      for (paramComponentName = x.a(b, paramComponentName); paramComponentName != null; paramComponentName = x.a(b, paramComponentName.getComponent())) {
        a.add(i, paramComponentName);
      }
      return this;
    }
    catch (PackageManager.NameNotFoundException paramComponentName)
    {
      Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
      throw new IllegalArgumentException(paramComponentName);
    }
  }
  
  @Deprecated
  public final Iterator<Intent> iterator()
  {
    return a.iterator();
  }
  
  public static abstract interface a
  {
    public abstract Intent a();
  }
  
  static abstract interface b {}
  
  static final class c
    implements ar.b
  {}
  
  static final class d
    implements ar.b
  {}
}


/* Location:              android/support/v4/b/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */