package mygov.aadhaar.ekyc.c;

import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.a.b.c;
import org.a.d.e;

public final class a
  implements e
{
  private static final Charset a = Charset.forName("UTF-8");
  private final AssetManager b;
  private final String c;
  
  public a(Resources paramResources, String paramString)
  {
    b = paramResources.getAssets();
    c = paramString;
  }
  
  private String a(String paramString)
  {
    StringBuilder localStringBuilder;
    for (;;)
    {
      try
      {
        char[] arrayOfChar = new char['Ѐ'];
        localStringBuilder = new StringBuilder();
        AssetManager localAssetManager = b;
        if (c == null)
        {
          paramString = new InputStreamReader(localAssetManager.open(paramString), a);
          int i = paramString.read(arrayOfChar);
          if (i <= 0) {
            break;
          }
          localStringBuilder.append(arrayOfChar, 0, i);
          continue;
        }
        paramString = c + File.separator + paramString;
      }
      catch (IOException paramString)
      {
        throw new c("Couldn't read Keyczar 'meta' file from assets/", paramString);
      }
    }
    paramString = localStringBuilder.toString();
    return paramString;
  }
  
  public final String a()
  {
    return a("meta");
  }
  
  public final String a(int paramInt)
  {
    return a(String.valueOf(paramInt));
  }
}


/* Location:              mygov/aadhaar/ekyc/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */