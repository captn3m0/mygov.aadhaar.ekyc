package com.google.android.gms.b;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.c.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class bx
  extends cx
{
  private static final String t = bx.class.getSimpleName();
  a.a l;
  
  private bx(Context paramContext)
  {
    super(paramContext, "");
  }
  
  public static String a(String paramString1, String paramString2)
  {
    return bj.a(paramString1, paramString2);
  }
  
  public static bx b(Context paramContext)
  {
    a(paramContext, true);
    return new bx(paramContext);
  }
  
  protected final bf.a a(Context paramContext, View paramView)
  {
    return null;
  }
  
  protected final void a(eu parameu, bf.a parama, bd.a parama1)
  {
    if (parameu.c())
    {
      if (l != null)
      {
        parameu = l.a;
        if (!TextUtils.isEmpty(parameu))
        {
          aa = ew.a(parameu);
          ab = Integer.valueOf(5);
          ac = Boolean.valueOf(l.b);
        }
        l = null;
      }
      return;
    }
    a(b(parameu, parama, parama1));
  }
  
  protected final List<Callable<Void>> b(eu parameu, bf.a parama, bd.a parama1)
  {
    parama1 = new ArrayList();
    if (c == null) {
      return parama1;
    }
    parama1.add(new fg(parameu, "/kx5MRqcn95qiPsrER7Pf1KGd7PBYuhpMEcvRTG/50mqLTSF+WRdejBEGdAcneo9", "IV2mOci6PItyVa4+aS/m3tdGY5jvNepAthMITbGHa+4=", parama, parameu.j()));
    return parama1;
  }
}


/* Location:              com/google/android/gms/b/bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */