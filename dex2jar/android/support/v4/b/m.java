package android.support.v4.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

public abstract class m<E>
  extends k
{
  final Activity b;
  final Context c;
  final Handler d;
  final int e;
  final o f = new o();
  android.support.v4.g.k<String, v> g;
  boolean h;
  w i;
  boolean j;
  boolean k;
  
  private m(Activity paramActivity, Context paramContext, Handler paramHandler)
  {
    b = paramActivity;
    c = paramContext;
    d = paramHandler;
    e = 0;
  }
  
  m(j paramj)
  {
    this(paramj, paramj, c);
  }
  
  final w a(String paramString, boolean paramBoolean)
  {
    if (g == null) {
      g = new android.support.v4.g.k();
    }
    paramString = (w)g.get(paramString);
    if ((paramBoolean) && (paramString != null) && (!e)) {
      paramString.b();
    }
    return paramString;
  }
  
  public View a(int paramInt)
  {
    return null;
  }
  
  public void a(i parami, Intent paramIntent, int paramInt)
  {
    if (paramInt != -1) {
      throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }
    c.startActivity(paramIntent);
  }
  
  final void a(String paramString)
  {
    if (g != null)
    {
      w localw = (w)g.get(paramString);
      if ((localw != null) && (!f))
      {
        localw.g();
        g.remove(paramString);
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
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */