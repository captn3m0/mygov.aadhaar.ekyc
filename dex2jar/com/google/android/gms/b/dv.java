package com.google.android.gms.b;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

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
    return new dv(paramContext, paramString, paramBoolean);
  }
  
  protected final List<Callable<Void>> b(eu parameu, bf.a parama, bd.a parama1)
  {
    if ((c == null) || (!p)) {
      return super.b(parameu, parama, parama1);
    }
    int i = parameu.j();
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(super.b(parameu, parama, parama1));
    localArrayList.add(new fg(parameu, "/kx5MRqcn95qiPsrER7Pf1KGd7PBYuhpMEcvRTG/50mqLTSF+WRdejBEGdAcneo9", "IV2mOci6PItyVa4+aS/m3tdGY5jvNepAthMITbGHa+4=", parama, i));
    return localArrayList;
  }
}


/* Location:              com/google/android/gms/b/dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */