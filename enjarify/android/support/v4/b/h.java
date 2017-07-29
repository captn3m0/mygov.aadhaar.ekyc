package android.support.v4.b;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

public class h
  extends i
  implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener
{
  int a = 0;
  int b = 0;
  boolean c;
  protected boolean d;
  int e;
  Dialog f;
  boolean g;
  boolean h;
  boolean i;
  
  public h()
  {
    c = bool;
    d = bool;
    e = -1;
  }
  
  public final void a()
  {
    super.a();
    boolean bool = i;
    if (!bool)
    {
      bool = h;
      if (!bool)
      {
        bool = true;
        h = bool;
      }
    }
  }
  
  public final void a(Context paramContext)
  {
    super.a(paramContext);
    boolean bool = i;
    if (!bool)
    {
      bool = false;
      h = false;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    int j = 1;
    super.a(paramBundle);
    int m = F;
    if (m == 0) {
      m = j;
    }
    for (;;)
    {
      d = m;
      if (paramBundle != null)
      {
        m = paramBundle.getInt("android:style", 0);
        a = m;
        m = paramBundle.getInt("android:theme", 0);
        b = m;
        boolean bool = paramBundle.getBoolean("android:cancelable", j);
        c = bool;
        j = d;
        bool = paramBundle.getBoolean("android:showsDialog", j);
        d = bool;
        str = "android:backStackId";
        int k = -1;
        n = paramBundle.getInt(str, k);
        e = n;
      }
      return;
      int n = 0;
      String str = null;
    }
  }
  
  public void a(n paramn, String paramString)
  {
    h = false;
    i = true;
    s locals = paramn.a();
    locals.a(this, paramString);
    locals.a();
  }
  
  public Dialog b()
  {
    Dialog localDialog = new android/app/Dialog;
    j localj = g();
    int j = b;
    localDialog.<init>(localj, j);
    return localDialog;
  }
  
  public final LayoutInflater b(Bundle paramBundle)
  {
    boolean bool = d;
    Object localObject1;
    if (!bool) {
      localObject1 = super.b(paramBundle);
    }
    for (;;)
    {
      return (LayoutInflater)localObject1;
      localObject1 = b();
      f = ((Dialog)localObject1);
      localObject1 = f;
      if (localObject1 != null)
      {
        localObject1 = f;
        int j = a;
        switch (j)
        {
        }
        for (;;)
        {
          localObject1 = f.getContext();
          localObject2 = "layout_inflater";
          localObject1 = (LayoutInflater)((Context)localObject1).getSystemService((String)localObject2);
          break;
          localObject2 = ((Dialog)localObject1).getWindow();
          int k = 24;
          ((Window)localObject2).addFlags(k);
          j = 1;
          ((Dialog)localObject1).requestWindowFeature(j);
        }
      }
      localObject1 = A.c;
      Object localObject2 = "layout_inflater";
      localObject1 = (LayoutInflater)((Context)localObject1).getSystemService((String)localObject2);
    }
  }
  
  public final void c()
  {
    super.c();
    Dialog localDialog = f;
    if (localDialog != null)
    {
      g = false;
      localDialog = f;
      localDialog.show();
    }
  }
  
  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    boolean bool1 = d;
    if (!bool1) {}
    for (;;)
    {
      return;
      Object localObject1 = P;
      Object localObject2;
      if (localObject1 != null)
      {
        localObject2 = ((View)localObject1).getParent();
        if (localObject2 != null)
        {
          localObject1 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject1).<init>("DialogFragment can not be attached to a container view");
          throw ((Throwable)localObject1);
        }
        localObject2 = f;
        ((Dialog)localObject2).setContentView((View)localObject1);
      }
      localObject1 = g();
      if (localObject1 != null)
      {
        localObject2 = f;
        ((Dialog)localObject2).setOwnerActivity((Activity)localObject1);
      }
      localObject1 = f;
      boolean bool2 = c;
      ((Dialog)localObject1).setCancelable(bool2);
      f.setOnCancelListener(this);
      localObject1 = f;
      ((Dialog)localObject1).setOnDismissListener(this);
      if (paramBundle != null)
      {
        localObject1 = paramBundle.getBundle("android:savedDialogState");
        if (localObject1 != null)
        {
          localObject2 = f;
          ((Dialog)localObject2).onRestoreInstanceState((Bundle)localObject1);
        }
      }
    }
  }
  
  public final void d()
  {
    super.d();
    Dialog localDialog = f;
    if (localDialog != null)
    {
      localDialog = f;
      localDialog.hide();
    }
  }
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    Object localObject = f;
    if (localObject != null)
    {
      localObject = f.onSaveInstanceState();
      if (localObject != null)
      {
        String str = "android:savedDialogState";
        paramBundle.putBundle(str, (Bundle)localObject);
      }
    }
    int j = a;
    int m;
    if (j != 0)
    {
      localObject = "android:style";
      m = a;
      paramBundle.putInt((String)localObject, m);
    }
    j = b;
    if (j != 0)
    {
      localObject = "android:theme";
      m = b;
      paramBundle.putInt((String)localObject, m);
    }
    boolean bool1 = c;
    boolean bool2;
    if (!bool1)
    {
      localObject = "android:cancelable";
      bool2 = c;
      paramBundle.putBoolean((String)localObject, bool2);
    }
    bool1 = d;
    if (!bool1)
    {
      localObject = "android:showsDialog";
      bool2 = d;
      paramBundle.putBoolean((String)localObject, bool2);
    }
    int k = e;
    int n = -1;
    if (k != n)
    {
      localObject = "android:backStackId";
      n = e;
      paramBundle.putInt((String)localObject, n);
    }
  }
  
  public final void e()
  {
    super.e();
    Dialog localDialog = f;
    if (localDialog != null)
    {
      g = true;
      f.dismiss();
      localDialog = null;
      f = null;
    }
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    int j = 1;
    boolean bool = g;
    Object localObject;
    if (!bool)
    {
      bool = h;
      if (!bool)
      {
        h = j;
        bool = false;
        i = false;
        localObject = f;
        if (localObject != null)
        {
          f.dismiss();
          bool = false;
          localObject = null;
          f = null;
        }
        g = j;
        int k = e;
        if (k < 0) {
          break label99;
        }
        localObject = z;
        j = e;
        ((n)localObject).a(j);
        k = -1;
        e = k;
      }
    }
    for (;;)
    {
      return;
      label99:
      localObject = z.a();
      ((s)localObject).a(this);
      ((s)localObject).b();
    }
  }
}


/* Location:              android/support/v4/b/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */