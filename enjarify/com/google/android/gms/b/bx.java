package com.google.android.gms.b;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.c.a.a;
import java.util.ArrayList;
import java.util.List;

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
    bx localbx = new com/google/android/gms/b/bx;
    localbx.<init>(paramContext);
    return localbx;
  }
  
  protected final bf.a a(Context paramContext, View paramView)
  {
    return null;
  }
  
  protected final void a(eu parameu, bf.a parama, bd.a parama1)
  {
    boolean bool1 = parameu.c();
    Object localObject;
    if (bool1)
    {
      localObject = l;
      if (localObject != null)
      {
        localObject = l.a;
        boolean bool2 = TextUtils.isEmpty((CharSequence)localObject);
        if (!bool2)
        {
          localObject = ew.a((String)localObject);
          aa = ((String)localObject);
          localObject = Integer.valueOf(5);
          ab = ((Integer)localObject);
          bool1 = l.b;
          localObject = Boolean.valueOf(bool1);
          ac = ((Boolean)localObject);
        }
        bool1 = false;
        localObject = null;
        l = null;
      }
    }
    for (;;)
    {
      return;
      localObject = b(parameu, parama, parama1);
      a((List)localObject);
    }
  }
  
  protected final List b(eu parameu, bf.a parama, bd.a parama1)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = c;
    if (localObject == null) {}
    for (localObject = localArrayList;; localObject = localArrayList)
    {
      return (List)localObject;
      int i = parameu.j();
      localObject = new com/google/android/gms/b/fg;
      String str1 = "/kx5MRqcn95qiPsrER7Pf1KGd7PBYuhpMEcvRTG/50mqLTSF+WRdejBEGdAcneo9";
      String str2 = "IV2mOci6PItyVa4+aS/m3tdGY5jvNepAthMITbGHa+4=";
      ((fg)localObject).<init>(parameu, str1, str2, parama, i);
      localArrayList.add(localObject);
    }
  }
}


/* Location:              com/google/android/gms/b/bx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */