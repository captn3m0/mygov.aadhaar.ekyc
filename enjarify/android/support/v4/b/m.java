package android.support.v4.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

public abstract class m
  extends k
{
  final Activity b;
  final Context c;
  final Handler d;
  final int e;
  final o f;
  android.support.v4.g.k g;
  boolean h;
  w i;
  boolean j;
  boolean k;
  
  private m(Activity paramActivity, Context paramContext, Handler paramHandler)
  {
    o localo = new android/support/v4/b/o;
    localo.<init>();
    f = localo;
    b = paramActivity;
    c = paramContext;
    d = paramHandler;
    e = 0;
  }
  
  m(j paramj)
  {
    this(paramj, paramj, localHandler);
  }
  
  final w a(String paramString, boolean paramBoolean)
  {
    Object localObject = g;
    if (localObject == null)
    {
      localObject = new android/support/v4/g/k;
      ((android.support.v4.g.k)localObject).<init>();
      g = ((android.support.v4.g.k)localObject);
    }
    localObject = (w)g.get(paramString);
    if ((paramBoolean) && (localObject != null))
    {
      boolean bool = e;
      if (!bool) {
        ((w)localObject).b();
      }
    }
    return (w)localObject;
  }
  
  public View a(int paramInt)
  {
    return null;
  }
  
  public void a(i parami, Intent paramIntent, int paramInt)
  {
    int m = -1;
    if (paramInt != m)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Starting activity with a requestCode requires a FragmentActivity host");
      throw localIllegalStateException;
    }
    c.startActivity(paramIntent);
  }
  
  final void a(String paramString)
  {
    Object localObject = g;
    if (localObject != null)
    {
      localObject = (w)g.get(paramString);
      if (localObject != null)
      {
        boolean bool = f;
        if (!bool)
        {
          ((w)localObject).g();
          localObject = g;
          ((android.support.v4.g.k)localObject).remove(paramString);
        }
      }
    }
  }
  
  public void a(String paramString, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  public boolean a()
  {
    return true;
  }
  
  public boolean b()
  {
    return true;
  }
  
  public LayoutInflater c()
  {
    return (LayoutInflater)c.getSystemService("layout_inflater");
  }
  
  public void d() {}
  
  public boolean e()
  {
    return true;
  }
  
  public int f()
  {
    return e;
  }
}


/* Location:              android/support/v4/b/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */