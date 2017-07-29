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
  implements Iterable
{
  private static final ar.b c;
  public final ArrayList a;
  public final Context b;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 11;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/b/ar$d;
      ((ar.d)localObject).<init>();
    }
    for (c = (ar.b)localObject;; c = (ar.b)localObject)
    {
      return;
      localObject = new android/support/v4/b/ar$c;
      ((ar.c)localObject).<init>();
    }
  }
  
  private ar(Context paramContext)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    a = localArrayList;
    b = paramContext;
  }
  
  public static ar a(Context paramContext)
  {
    ar localar = new android/support/v4/b/ar;
    localar.<init>(paramContext);
    return localar;
  }
  
  public final ar a(ComponentName paramComponentName)
  {
    Object localObject1 = a;
    int i = ((ArrayList)localObject1).size();
    try
    {
      localObject1 = b;
      Object localObject2;
      for (localObject1 = x.a((Context)localObject1, paramComponentName); localObject1 != null; localObject1 = x.a((Context)localObject2, (ComponentName)localObject1))
      {
        localObject2 = a;
        ((ArrayList)localObject2).add(i, localObject1);
        localObject2 = b;
        localObject1 = ((Intent)localObject1).getComponent();
      }
      IllegalArgumentException localIllegalArgumentException;
      return this;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>(localNameNotFoundException);
      throw localIllegalArgumentException;
    }
  }
  
  public final Iterator iterator()
  {
    return a.iterator();
  }
}


/* Location:              android/support/v4/b/ar.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */