package mygov.aadhaar.ekyc.c;

import android.content.res.Resources;
import android.support.v7.app.e;
import mygov.aadhaar.ekyc.MainActivity;
import org.a.b.c;

public final class b
{
  public static String a(String paramString)
  {
    try
    {
      localObject1 = new org/a/b;
      a locala = new mygov/aadhaar/ekyc/c/a;
      Object localObject2 = MainActivity.e();
      localObject2 = ((e)localObject2).getResources();
      String str = "ekyc";
      locala.<init>((Resources)localObject2, str);
      ((org.a.b)localObject1).<init>(locala);
      localObject1 = ((org.a.b)localObject1).a(paramString);
    }
    catch (c localc)
    {
      for (;;)
      {
        localc.printStackTrace();
        Object localObject1 = "";
      }
    }
    return (String)localObject1;
  }
}


/* Location:              mygov/aadhaar/ekyc/c/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */