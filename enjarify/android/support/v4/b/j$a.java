package android.support.v4.b;

import android.content.Intent;
import android.support.v4.g.c;
import android.support.v4.g.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.io.PrintWriter;

final class j$a
  extends m
{
  public j$a(j paramj)
  {
    super(paramj);
  }
  
  public final View a(int paramInt)
  {
    return a.findViewById(paramInt);
  }
  
  public final void a(i parami, Intent paramIntent, int paramInt)
  {
    int i = -1;
    int k = (char)-2;
    j localj = a;
    int m = 1;
    b = m;
    if (paramInt == i) {
      m = -1;
    }
    for (;;)
    {
      try
      {
        a.a(localj, paramIntent, m);
        return;
      }
      finally
      {
        Object localObject1;
        b = false;
      }
      j.a(paramInt);
      localObject1 = l;
      m = ((l)localObject1).b();
      if (m >= k)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject3 = "Too many pending Fragment activity results.";
        ((IllegalStateException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
      for (;;)
      {
        l locall = l;
        k = k;
        boolean bool = a;
        if (bool) {
          locall.a();
        }
        localObject4 = b;
        m = c;
        m = c.a((int[])localObject4, m, k);
        if (m < 0) {
          break;
        }
        m = k + 1;
        k = (char)-2;
        m %= k;
        k = m;
      }
      m = k;
      Object localObject3 = l;
      Object localObject4 = o;
      ((l)localObject3).a(m, localObject4);
      k = k + 1;
      int j = (char)-2;
      k %= j;
      k = k;
      m = m + 1 << 16;
      k = (char)-1 & paramInt;
      m += k;
      a.a(localj, paramIntent, m);
      b = false;
    }
  }
  
  public final void a(String paramString, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    a.dump(paramString, null, paramPrintWriter, paramArrayOfString);
  }
  
  public final boolean a()
  {
    Object localObject = a.getWindow();
    boolean bool;
    if (localObject != null)
    {
      localObject = ((Window)localObject).peekDecorView();
      if (localObject != null) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public final boolean b()
  {
    j localj = a;
    boolean bool = localj.isFinishing();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localj = null;
    }
  }
  
  public final LayoutInflater c()
  {
    LayoutInflater localLayoutInflater = a.getLayoutInflater();
    j localj = a;
    return localLayoutInflater.cloneInContext(localj);
  }
  
  public final void d()
  {
    a.b();
  }
  
  public final boolean e()
  {
    Window localWindow = a.getWindow();
    boolean bool;
    if (localWindow != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localWindow = null;
    }
  }
  
  public final int f()
  {
    Object localObject = a.getWindow();
    int i;
    if (localObject == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      localObject = ((Window)localObject).getAttributes();
      i = windowAnimations;
    }
  }
}


/* Location:              android/support/v4/b/j$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */