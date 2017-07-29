package com.google.android.gms.b;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class dv
  extends cx
{
  private static final String l = dv.class.getSimpleName();
  
  private dv(Context paramContext, String paramString, boolean paramBoolean)
  {
    super(paramContext, paramString, paramBoolean);
  }
  
  public static dv a(String paramString, Context paramContext, boolean paramBoolean)
  {
    a(paramContext, paramBoolean);
    dv localdv = new com/google/android/gms/b/dv;
    localdv.<init>(paramContext, paramString, paramBoolean);
    return localdv;
  }
  
  protected final List b(eu parameu, bf.a parama, bd.a parama1)
  {
    Object localObject = c;
    if (localObject != null)
    {
      boolean bool = p;
      if (bool) {
        break label34;
      }
    }
    label34:
    ArrayList localArrayList;
    for (localObject = super.b(parameu, parama, parama1);; localObject = localArrayList)
    {
      return (List)localObject;
      int i = parameu.j();
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localObject = super.b(parameu, parama, parama1);
      localArrayList.addAll((Collection)localObject);
      localObject = new com/google/android/gms/b/fg;
      String str1 = "/kx5MRqcn95qiPsrER7Pf1KGd7PBYuhpMEcvRTG/50mqLTSF+WRdejBEGdAcneo9";
      String str2 = "IV2mOci6PItyVa4+aS/m3tdGY5jvNepAthMITbGHa+4=";
      ((fg)localObject).<init>(parameu, str1, str2, parama, i);
      localArrayList.add(localObject);
    }
  }
}


/* Location:              com/google/android/gms/b/dv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */