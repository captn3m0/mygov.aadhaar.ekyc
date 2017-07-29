package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class bc
  extends ContextWrapper
{
  private static final Object a;
  private static ArrayList b;
  private final Resources c;
  private final Resources.Theme d;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
  }
  
  private bc(Context paramContext)
  {
    super(paramContext);
    boolean bool = bh.a();
    Object localObject1;
    Object localObject2;
    if (bool)
    {
      localObject1 = new android/support/v7/widget/bh;
      localObject2 = paramContext.getResources();
      ((bh)localObject1).<init>(this, (Resources)localObject2);
      c = ((Resources)localObject1);
      localObject1 = c.newTheme();
      d = ((Resources.Theme)localObject1);
      localObject1 = d;
      localObject2 = paramContext.getTheme();
      ((Resources.Theme)localObject1).setTo((Resources.Theme)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = new android/support/v7/widget/be;
      localObject2 = paramContext.getResources();
      ((be)localObject1).<init>(this, (Resources)localObject2);
      c = ((Resources)localObject1);
      bool = false;
      localObject1 = null;
      d = null;
    }
  }
  
  public static Context a(Context paramContext)
  {
    int i = 0;
    Object localObject1 = null;
    boolean bool = paramContext instanceof bc;
    Object localObject3;
    if (!bool)
    {
      localObject3 = paramContext.getResources();
      bool = localObject3 instanceof be;
      if (!bool)
      {
        localObject3 = paramContext.getResources();
        bool = localObject3 instanceof bh;
        if (!bool) {
          break label123;
        }
      }
    }
    for (;;)
    {
      if (i != 0) {}
      synchronized (a)
      {
        localObject1 = b;
        if (localObject1 == null)
        {
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          b = (ArrayList)localObject1;
        }
        Object localObject5;
        label123:
        do
        {
          localObject1 = new android/support/v7/widget/bc;
          ((bc)localObject1).<init>((Context)paramContext);
          localObject3 = b;
          localObject5 = new java/lang/ref/WeakReference;
          ((WeakReference)localObject5).<init>(localObject1);
          ((ArrayList)localObject3).add(localObject5);
          paramContext = (Context)localObject1;
          return (Context)paramContext;
          int j = Build.VERSION.SDK_INT;
          int m = 21;
          if (j >= m)
          {
            k = bh.a();
            if (k == 0) {
              break;
            }
          }
          i = 1;
          break;
          localObject1 = b;
          i = ((ArrayList)localObject1).size() + -1;
          for (k = i; k >= 0; k = i)
          {
            localObject1 = b;
            localObject1 = ((ArrayList)localObject1).get(k);
            localObject1 = (WeakReference)localObject1;
            if (localObject1 != null)
            {
              localObject1 = ((WeakReference)localObject1).get();
              if (localObject1 != null) {}
            }
            else
            {
              localObject1 = b;
              ((ArrayList)localObject1).remove(k);
            }
            i = k + -1;
          }
          localObject1 = b;
          i = ((ArrayList)localObject1).size() + -1;
          k = i;
        } while (k < 0);
        localObject1 = b;
        localObject1 = ((ArrayList)localObject1).get(k);
        localObject1 = (WeakReference)localObject1;
        if (localObject1 != null) {
          localObject1 = ((WeakReference)localObject1).get();
        }
        for (localObject1 = (bc)localObject1;; localObject1 = null)
        {
          if (localObject1 == null) {
            break label291;
          }
          localObject5 = ((bc)localObject1).getBaseContext();
          if (localObject5 != paramContext) {
            break label291;
          }
          paramContext = (Context)localObject1;
          break;
          i = 0;
        }
        label291:
        i = k + -1;
        int k = i;
      }
    }
  }
  
  public final AssetManager getAssets()
  {
    return c.getAssets();
  }
  
  public final Resources getResources()
  {
    return c;
  }
  
  public final Resources.Theme getTheme()
  {
    Resources.Theme localTheme = d;
    if (localTheme == null) {}
    for (localTheme = super.getTheme();; localTheme = d) {
      return localTheme;
    }
  }
  
  public final void setTheme(int paramInt)
  {
    Resources.Theme localTheme = d;
    if (localTheme == null) {
      super.setTheme(paramInt);
    }
    for (;;)
    {
      return;
      localTheme = d;
      boolean bool = true;
      localTheme.applyStyle(paramInt, bool);
    }
  }
}


/* Location:              android/support/v7/widget/bc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */